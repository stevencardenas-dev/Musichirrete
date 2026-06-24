package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.tag.datatype.StringFixedLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;

public class FrameBodyLINK extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyLINK() {}
  
  public FrameBodyLINK(String paramString1, String paramString2, String paramString3) {
    setObjectValue(kOkiWEITVb.Hmm, paramString1);
    setObjectValue("URL", paramString2);
    setObjectValue("ID", paramString3);
  }
  
  public FrameBodyLINK(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyLINK(FrameBodyLINK paramFrameBodyLINK) {
    super(paramFrameBodyLINK);
  }
  
  public String getAdditionalData() {
    return (String)getObjectValue("ID");
  }
  
  public void getAdditionalData(String paramString) {
    setObjectValue("ID", paramString);
  }
  
  public String getFrameIdentifier() {
    return (String)getObjectValue("Description");
  }
  
  public void getFrameIdentifier(String paramString) {
    setObjectValue("Description", paramString);
  }
  
  public String getIdentifier() {
    return "LINK";
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringFixedLength("Description", this, 4));
    this.objectList.add(new StringNullTerminated("URL", this));
    this.objectList.add(new StringSizeTerminated("ID", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyLINK.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */