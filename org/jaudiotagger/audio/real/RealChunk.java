package org.jaudiotagger.audio.real;

import ga1;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import uc1;

public class RealChunk {
  protected static final String CONT = "CONT";
  
  protected static final String DATA = "DATA";
  
  protected static final String INDX = "INDX";
  
  protected static final String MDPR = "MDPR";
  
  protected static final String PROP = "PROP";
  
  protected static final String RMF = ".RMF";
  
  private final byte[] bytes;
  
  private final String id;
  
  private final int size;
  
  public RealChunk(String paramString, int paramInt, byte[] paramArrayOfbyte) {
    this.id = paramString;
    this.size = paramInt;
    this.bytes = paramArrayOfbyte;
  }
  
  public static RealChunk readChunk(uc1 paramuc1) {
    String str = Utils.readString((DataInput)paramuc1, 4);
    int i = (int)Utils.readUint32((DataInput)paramuc1);
    if (i >= 8) {
      if (i <= paramuc1.d() - paramuc1.c() + 8L) {
        byte[] arrayOfByte = new byte[i - 8];
        paramuc1.readFully(arrayOfByte);
        return new RealChunk(str, i, arrayOfByte);
      } 
      StringBuilder stringBuilder1 = ga1.k(i, "Corrupt file: RealAudio chunk length of ", " at position ");
      stringBuilder1.append(paramuc1.c() - 4L);
      stringBuilder1.append(" extends beyond the end of the file");
      throw new CannotReadException(stringBuilder1.toString());
    } 
    long l = paramuc1.c();
    StringBuilder stringBuilder = new StringBuilder("Corrupt file: RealAudio chunk length at position ");
    stringBuilder.append(l - 4L);
    stringBuilder.append(" cannot be less than 8");
    throw new CannotReadException(stringBuilder.toString());
  }
  
  public byte[] getBytes() {
    return this.bytes;
  }
  
  public DataInputStream getDataInputStream() {
    return new DataInputStream(new ByteArrayInputStream(getBytes()));
  }
  
  public String getId() {
    return this.id;
  }
  
  public int getSize() {
    return this.size;
  }
  
  public boolean isCONT() {
    return "CONT".equals(this.id);
  }
  
  public boolean isPROP() {
    return "PROP".equals(this.id);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.id);
    stringBuilder.append("\t");
    stringBuilder.append(this.size);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\real\RealChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */