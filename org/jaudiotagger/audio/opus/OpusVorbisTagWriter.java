package org.jaudiotagger.audio.opus;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.ogg.OggVorbisCommentTagCreator;
import org.jaudiotagger.audio.ogg.util.OggPage;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import uc1;

public class OpusVorbisTagWriter {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.opus");
  
  private OpusVorbisTagReader reader;
  
  private OggVorbisCommentTagCreator tc;
  
  public OpusVorbisTagWriter() {
    byte[] arrayOfByte = OpusHeader.TAGS_CAPTURE_PATTERN_AS_BYTES;
    this.tc = new OggVorbisCommentTagCreator(new byte[0], arrayOfByte, false);
    this.reader = new OpusVorbisTagReader();
  }
  
  private List<OggPage> readPages(FileChannel paramFileChannel) {
    ArrayList<OggPage> arrayList = new ArrayList();
    ByteBuffer byteBuffer = Utils.fetchFromChannel(paramFileChannel, (int)paramFileChannel.size());
    while (true) {
      if (byteBuffer.remaining() > 0)
        try {
          arrayList.add(OggPage.parse(byteBuffer));
          continue;
        } catch (CannotReadException|java.nio.BufferUnderflowException cannotReadException) {} 
      return arrayList;
    } 
  }
  
  private void writePage(FileChannel paramFileChannel, OggPage paramOggPage) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramOggPage.size());
    paramOggPage.write(byteBuffer);
    byteBuffer.rewind();
    paramFileChannel.write(byteBuffer);
  }
  
  public void delete(uc1 paramuc11, uc1 paramuc12) {
    try {
      this.reader.read(paramuc11);
      VorbisCommentTag vorbisCommentTag = VorbisCommentTag.createNewTag();
      paramuc11.h(0L);
      write((Tag)vorbisCommentTag, paramuc11, paramuc12);
      return;
    } catch (CannotReadException cannotReadException) {
      write((Tag)VorbisCommentTag.createNewTag(), paramuc11, paramuc12);
      return;
    } 
  }
  
  public void write(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Starting to write file: ");
    stringBuilder.append(paramuc11);
    logger.config(stringBuilder.toString());
    FileChannel fileChannel2 = paramuc11.a();
    FileChannel fileChannel1 = paramuc12.a();
    logger.fine("Read 1st Page: identificationHeader");
    List<OggPage> list = readPages(fileChannel2);
    ByteBuffer byteBuffer = this.tc.convert(paramTag);
    boolean bool = false;
    OggPage oggPage = list.remove(0);
    writePage(fileChannel1, oggPage);
    list.remove(0);
    while (((OggPage)list.get(0)).getHeader().isContinuedPage())
      list.remove(0); 
    int m = byteBuffer.capacity() / 65025;
    int k = byteBuffer.capacity() % 65025;
    int j = oggPage.getHeader().getSerialNumber();
    int i = 0;
    byte b;
    for (b = 1; i < m; b++) {
      boolean bool1;
      if (i != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      OggPageHeader oggPageHeader = OggPageHeader.createCommentHeader(65025, bool1, j, b);
      ByteBuffer byteBuffer1 = byteBuffer.slice();
      byteBuffer1.limit(65025);
      writePage(fileChannel1, new OggPage(oggPageHeader, byteBuffer1));
      Utils.skip(byteBuffer, 65025);
      i++;
    } 
    i = b;
    if (k > 0) {
      boolean bool1 = bool;
      if (m > 0)
        bool1 = true; 
      writePage(fileChannel1, new OggPage(OggPageHeader.createCommentHeader(k, bool1, j, b), byteBuffer.slice()));
      i = b + 1;
    } 
    for (OggPage oggPage1 : list) {
      oggPage1.setSequenceNo(i);
      writePage(fileChannel1, oggPage1);
      i++;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\opus\OpusVorbisTagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */