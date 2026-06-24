package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.EncryptionChunk;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

class EncryptionChunkReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_CONTENT_ENCRYPTION };
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    EncryptionChunk encryptionChunk = new EncryptionChunk(Utils.readBig64(paramInputStream));
    int i = (int)Utils.readUINT32(paramInputStream);
    byte[] arrayOfByte4 = new byte[i + 1];
    paramInputStream.read(arrayOfByte4, 0, i);
    arrayOfByte4[i] = 0;
    i = (int)Utils.readUINT32(paramInputStream);
    byte[] arrayOfByte3 = new byte[i + 1];
    paramInputStream.read(arrayOfByte3, 0, i);
    arrayOfByte3[i] = 0;
    i = (int)Utils.readUINT32(paramInputStream);
    byte[] arrayOfByte1 = new byte[i + 1];
    paramInputStream.read(arrayOfByte1, 0, i);
    arrayOfByte1[i] = 0;
    i = (int)Utils.readUINT32(paramInputStream);
    byte[] arrayOfByte2 = new byte[i + 1];
    paramInputStream.read(arrayOfByte2, 0, i);
    arrayOfByte2[i] = 0;
    encryptionChunk.setSecretData(new String(arrayOfByte4));
    encryptionChunk.setProtectionType(new String(arrayOfByte3));
    encryptionChunk.setKeyID(new String(arrayOfByte1));
    encryptionChunk.setLicenseURL(new String(arrayOfByte2));
    encryptionChunk.setPosition(paramLong);
    return (Chunk)encryptionChunk;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\EncryptionChunkReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */