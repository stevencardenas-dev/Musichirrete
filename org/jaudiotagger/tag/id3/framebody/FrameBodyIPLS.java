package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.tag.datatype.Pair;
import org.jaudiotagger.tag.datatype.PairedTextEncodedStringNullTerminated;

public class FrameBodyIPLS extends AbstractFrameBodyPairs implements ID3v23FrameBody {
  public FrameBodyIPLS() {}
  
  public FrameBodyIPLS(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyIPLS(byte paramByte, List<Pair> paramList) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
    Iterator<Pair> iterator = paramList.iterator();
    while (iterator.hasNext())
      valuePairs.add(iterator.next()); 
    setObjectValue("Text", valuePairs);
  }
  
  public FrameBodyIPLS(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyIPLS(FrameBodyIPLS paramFrameBodyIPLS) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyIPLS.getTextEncoding()));
    setObjectValue("Text", paramFrameBodyIPLS.getPairing());
  }
  
  public FrameBodyIPLS(FrameBodyTIPL paramFrameBodyTIPL) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyTIPL.getTextEncoding()));
    setObjectValue("Text", paramFrameBodyTIPL.getPairing());
  }
  
  public String getIdentifier() {
    return "IPLS";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyIPLS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */