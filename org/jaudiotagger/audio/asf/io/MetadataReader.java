package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.ContainerType;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.data.MetadataContainer;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
import org.jaudiotagger.audio.asf.util.Utils;

public class MetadataReader implements ChunkReader {
  static final boolean $assertionsDisabled = false;
  
  private static final GUID[] APPLYING = new GUID[] { ContainerType.EXTENDED_CONTENT.getContainerGUID(), ContainerType.METADATA_OBJECT.getContainerGUID(), ContainerType.METADATA_LIBRARY_OBJECT.getContainerGUID() };
  
  private boolean readBoolean(InputStream paramInputStream, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    paramInputStream.read(arrayOfByte);
    return (arrayOfByte[paramInt - 1] == 1);
  }
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    boolean bool;
    MetadataContainer metadataContainer = new MetadataContainer(paramGUID, paramLong, Utils.readBig64(paramInputStream));
    if (metadataContainer.getContainerType() == ContainerType.EXTENDED_CONTENT) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = Utils.readUINT16(paramInputStream);
    for (byte b = 0; b < i; b++) {
      String str;
      boolean bool1;
      boolean bool2;
      if (!bool) {
        bool1 = Utils.readUINT16(paramInputStream);
        bool2 = Utils.readUINT16(paramInputStream);
      } else {
        bool2 = false;
        bool1 = false;
      } 
      int k = Utils.readUINT16(paramInputStream);
      if (bool) {
        str = Utils.readFixedSizeUTF16Str(paramInputStream, k);
      } else {
        paramGUID = null;
      } 
      int j = Utils.readUINT16(paramInputStream);
      if (bool) {
        paramLong = Utils.readUINT16(paramInputStream);
      } else {
        paramLong = Utils.readUINT32(paramInputStream);
      } 
      if (!bool)
        str = Utils.readFixedSizeUTF16Str(paramInputStream, k); 
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(metadataContainer.getContainerType(), str, j, bool2, bool1);
      switch (j) {
        default:
          metadataDescriptor.setStringValue("Invalid datatype: ".concat(new String(Utils.readBinary(paramInputStream, paramLong))));
          break;
        case 6:
          metadataDescriptor.setGUIDValue(Utils.readGUID(paramInputStream));
          break;
        case 5:
          metadataDescriptor.setWordValue(Utils.readUINT16(paramInputStream));
          break;
        case 4:
          metadataDescriptor.setQWordValue(Utils.readUINT64(paramInputStream));
          break;
        case 3:
          metadataDescriptor.setDWordValue(Utils.readUINT32(paramInputStream));
          break;
        case 2:
          metadataDescriptor.setBooleanValue(readBoolean(paramInputStream, (int)paramLong));
          break;
        case 1:
          metadataDescriptor.setBinaryValue(Utils.readBinary(paramInputStream, paramLong));
          break;
        case 0:
          metadataDescriptor.setStringValue(Utils.readFixedSizeUTF16Str(paramInputStream, (int)paramLong));
          break;
      } 
      metadataContainer.addDescriptor(metadataDescriptor);
    } 
    return (Chunk)metadataContainer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\MetadataReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */