package org.jaudiotagger.audio.asf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.ChunkContainer;
import org.jaudiotagger.audio.asf.data.MetadataContainer;
import org.jaudiotagger.audio.asf.io.AsfExtHeaderModifier;
import org.jaudiotagger.audio.asf.io.AsfHeaderReader;
import org.jaudiotagger.audio.asf.io.AsfStreamer;
import org.jaudiotagger.audio.asf.io.RandomAccessFileInputstream;
import org.jaudiotagger.audio.asf.io.RandomAccessFileOutputStream;
import org.jaudiotagger.audio.asf.io.WriteableChunk;
import org.jaudiotagger.audio.asf.io.WriteableChunkModifer;
import org.jaudiotagger.audio.asf.util.TagConverter;
import org.jaudiotagger.audio.generic.AudioFileWriter;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.asf.AsfTag;
import uc1;

public class AsfFileWriter extends AudioFileWriter {
  static final boolean $assertionsDisabled = false;
  
  private boolean[] searchExistence(ChunkContainer paramChunkContainer, MetadataContainer[] paramArrayOfMetadataContainer) {
    int i = paramArrayOfMetadataContainer.length;
    boolean[] arrayOfBoolean = new boolean[i];
    for (byte b = 0; b < i; b++)
      arrayOfBoolean[b] = paramChunkContainer.hasChunkByGUID(paramArrayOfMetadataContainer[b].getContainerType().getContainerGUID()); 
    return arrayOfBoolean;
  }
  
  public void deleteTag(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    writeTag(null, (Tag)new AsfTag(true), paramuc11, paramuc12);
  }
  
  public void writeTag(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    AsfHeader asfHeader = AsfHeaderReader.readTagHeader(paramuc11);
    paramuc11.h(0L);
    MetadataContainer[] arrayOfMetadataContainer = TagConverter.distributeMetadata(new AsfTag(paramTag, true));
    boolean[] arrayOfBoolean1 = searchExistence((ChunkContainer)asfHeader, arrayOfMetadataContainer);
    boolean[] arrayOfBoolean2 = searchExistence((ChunkContainer)asfHeader.getExtendedHeader(), arrayOfMetadataContainer);
    ArrayList<WriteableChunkModifer> arrayList1 = new ArrayList();
    ArrayList<WriteableChunkModifer> arrayList2 = new ArrayList();
    for (byte b = 0; b < arrayOfMetadataContainer.length; b++) {
      WriteableChunkModifer writeableChunkModifer = new WriteableChunkModifer((WriteableChunk)arrayOfMetadataContainer[b]);
      if (arrayOfBoolean1[b]) {
        arrayList1.add(writeableChunkModifer);
      } else if (arrayOfBoolean2[b]) {
        arrayList2.add(writeableChunkModifer);
      } else if (b == 0 || b == 2 || b == 1) {
        arrayList1.add(writeableChunkModifer);
      } else {
        arrayList2.add(writeableChunkModifer);
      } 
    } 
    if (!arrayList2.isEmpty())
      arrayList1.add(new AsfExtHeaderModifier(arrayList2)); 
    (new AsfStreamer()).createModifiedCopy((InputStream)new RandomAccessFileInputstream(paramuc11), (OutputStream)new RandomAccessFileOutputStream(paramuc12), arrayList1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\AsfFileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */