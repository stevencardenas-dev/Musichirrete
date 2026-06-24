package org.jaudiotagger.audio.asf.data;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.util.Utils;
import x41;

public class VideoStreamChunk extends StreamChunk {
  private byte[] codecId = new byte[0];
  
  private long pictureHeight;
  
  private long pictureWidth;
  
  public VideoStreamChunk(BigInteger paramBigInteger) {
    super(GUID.GUID_VIDEOSTREAM, paramBigInteger);
  }
  
  public byte[] getCodecId() {
    return (byte[])this.codecId.clone();
  }
  
  public String getCodecIdAsString() {
    return (this.codecId == null) ? "Unknown" : new String(getCodecId());
  }
  
  public long getPictureHeight() {
    return this.pictureHeight;
  }
  
  public long getPictureWidth() {
    return this.pictureWidth;
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder1 = new StringBuilder(super.prettyPrint(paramString));
    StringBuilder stringBuilder2 = new StringBuilder();
    String str = Utils.LINE_SEPARATOR;
    stringBuilder1.insert(0, x41.o(stringBuilder2, str, paramString, "|->VideoStream"));
    stringBuilder1.append(paramString);
    stringBuilder1.append(oXrNDUqUkE.IMjIyNdCotRqZS);
    stringBuilder1.append(str);
    stringBuilder1.append(paramString);
    stringBuilder1.append("      |->Width  : ");
    stringBuilder1.append(getPictureWidth());
    stringBuilder1.append(str);
    stringBuilder1.append(paramString);
    stringBuilder1.append("      |->Heigth : ");
    stringBuilder1.append(getPictureHeight());
    stringBuilder1.append(str);
    stringBuilder1.append(paramString);
    stringBuilder1.append("      |->Codec  : ");
    stringBuilder1.append(getCodecIdAsString());
    stringBuilder1.append(str);
    return stringBuilder1.toString();
  }
  
  public void setCodecId(byte[] paramArrayOfbyte) {
    this.codecId = (byte[])paramArrayOfbyte.clone();
  }
  
  public void setPictureHeight(long paramLong) {
    this.pictureHeight = paramLong;
  }
  
  public void setPictureWidth(long paramLong) {
    this.pictureWidth = paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\VideoStreamChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */