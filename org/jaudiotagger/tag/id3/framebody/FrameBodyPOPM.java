package org.jaudiotagger.tag.id3.framebody;

import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberFixedLength;
import org.jaudiotagger.tag.datatype.NumberVariableLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyPOPM extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  private static final int COUNTER_MINIMUM_FIELD_SIZE = 0;
  
  public static final String MEDIA_MONKEY_NO_EMAIL = "no@email";
  
  private static final int RATING_FIELD_SIZE = 1;
  
  public FrameBodyPOPM() {
    setObjectValue("Email", "");
    Long long_ = Long.valueOf(0L);
    setObjectValue("Rating", long_);
    setObjectValue(jLnXOLx.fHeVIw, long_);
  }
  
  public FrameBodyPOPM(String paramString, long paramLong1, long paramLong2) {
    setObjectValue("Email", paramString);
    setObjectValue("Rating", Long.valueOf(paramLong1));
    setObjectValue("Counter", Long.valueOf(paramLong2));
  }
  
  public FrameBodyPOPM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyPOPM(FrameBodyPOPM paramFrameBodyPOPM) {
    super(paramFrameBodyPOPM);
  }
  
  public long getCounter() {
    return ((Number)getObjectValue("Counter")).longValue();
  }
  
  public String getEmailToUser() {
    return (String)getObjectValue(KjdXPYm.SSjCHfcNWmXYtuU);
  }
  
  public String getIdentifier() {
    return "POPM";
  }
  
  public long getRating() {
    return ((Number)getObjectValue("Rating")).longValue();
  }
  
  public String getUserFriendlyValue() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getEmailToUser());
    stringBuilder.append(":");
    stringBuilder.append(getRating());
    stringBuilder.append(":");
    stringBuilder.append(getCounter());
    return stringBuilder.toString();
  }
  
  public void parseString(String paramString) {
    try {
      setRating(Integer.parseInt(paramString));
      setEmailToUser("no@email");
    } catch (NumberFormatException numberFormatException) {}
  }
  
  public void setCounter(long paramLong) {
    setObjectValue("Counter", Long.valueOf(paramLong));
  }
  
  public void setEmailToUser(String paramString) {
    setObjectValue("Email", paramString);
  }
  
  public void setRating(long paramLong) {
    setObjectValue("Rating", Long.valueOf(paramLong));
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("Email", this));
    this.objectList.add(new NumberFixedLength(DJqHMztxflt.Kouje, this, 1));
    this.objectList.add(new NumberVariableLength("Counter", this, 0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyPOPM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */