package org.jaudiotagger.audio.asf.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import m60;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.ChunkContainer;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;
import u00;
import uc1;
import ws2;

public class AsfHeaderReader extends ChunkContainerReader<AsfHeader> {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_HEADER };
  
  private static final AsfHeaderReader FULL_READER;
  
  private static final AsfHeaderReader INFO_READER;
  
  private static final AsfHeaderReader TAG_READER;
  
  static {
    ArrayList<Class<FileHeaderReader>> arrayList = new ArrayList();
    arrayList.add(FileHeaderReader.class);
    arrayList.add(StreamChunkReader.class);
    INFO_READER = new AsfHeaderReader((List)arrayList, true);
    arrayList.clear();
    arrayList.add(ContentDescriptionReader.class);
    arrayList.add(ContentBrandingReader.class);
    arrayList.add(LanguageListReader.class);
    arrayList.add(MetadataReader.class);
    AsfExtHeaderReader asfExtHeaderReader2 = new AsfExtHeaderReader((List)arrayList, true);
    AsfExtHeaderReader asfExtHeaderReader1 = new AsfExtHeaderReader((List)arrayList, true);
    AsfHeaderReader asfHeaderReader2 = new AsfHeaderReader((List)arrayList, true);
    TAG_READER = asfHeaderReader2;
    asfHeaderReader2.setExtendedHeaderReader(asfExtHeaderReader2);
    arrayList.add(FileHeaderReader.class);
    arrayList.add(StreamChunkReader.class);
    arrayList.add(EncodingChunkReader.class);
    arrayList.add(EncryptionChunkReader.class);
    arrayList.add(StreamBitratePropertiesReader.class);
    AsfHeaderReader asfHeaderReader1 = new AsfHeaderReader((List)arrayList, false);
    FULL_READER = asfHeaderReader1;
    asfHeaderReader1.setExtendedHeaderReader(asfExtHeaderReader1);
  }
  
  public AsfHeaderReader(List<Class<? extends ChunkReader>> paramList, boolean paramBoolean) {
    super(paramList, paramBoolean);
  }
  
  private static InputStream createStream(uc1 paramuc1) {
    return new FullRequestInputStream(new BufferedInputStream(new RandomAccessFileInputstream(paramuc1)));
  }
  
  public static AsfHeader readHeader(u00 paramu00) {
    FileInputStream fileInputStream = ws2.n(paramu00);
    AsfHeader asfHeader = (AsfHeader)FULL_READER.read(Utils.readGUID(fileInputStream), fileInputStream, 0L);
    fileInputStream.close();
    return asfHeader;
  }
  
  public static AsfHeader readHeader(uc1 paramuc1) {
    InputStream inputStream = createStream(paramuc1);
    return (AsfHeader)FULL_READER.read(Utils.readGUID(inputStream), inputStream, 0L);
  }
  
  public static AsfHeader readInfoHeader(uc1 paramuc1) {
    InputStream inputStream = createStream(paramuc1);
    return (AsfHeader)INFO_READER.read(Utils.readGUID(inputStream), inputStream, 0L);
  }
  
  public static AsfHeader readTagHeader(uc1 paramuc1) {
    InputStream inputStream = createStream(paramuc1);
    return (AsfHeader)TAG_READER.read(Utils.readGUID(inputStream), inputStream, 0L);
  }
  
  public boolean canFail() {
    return false;
  }
  
  public AsfHeader createContainer(long paramLong, BigInteger paramBigInteger, InputStream paramInputStream) {
    long l = Utils.readUINT32(paramInputStream);
    if (paramInputStream.read() == 1) {
      if (paramInputStream.read() == 2)
        return new AsfHeader(paramLong, paramBigInteger, l); 
      m60.i("No ASF");
      return null;
    } 
    m60.i("No ASF");
    return null;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public void setExtendedHeaderReader(AsfExtHeaderReader paramAsfExtHeaderReader) {
    for (GUID gUID : paramAsfExtHeaderReader.getApplyingIds())
      this.readerMap.put(gUID, paramAsfExtHeaderReader); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\AsfHeaderReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */