package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.tag.datatype.Pair;
import org.jaudiotagger.tag.datatype.PairedTextEncodedStringNullTerminated;
import org.jaudiotagger.tag.id3.valuepair.StandardIPLSKey;

public class FrameBodyTIPL extends AbstractFrameBodyPairs implements ID3v24FrameBody {
  public static final String ARRANGER;
  
  public static final String DJMIXER;
  
  public static final String ENGINEER = StandardIPLSKey.ENGINEER.getKey();
  
  public static final String MIXER = StandardIPLSKey.MIXER.getKey();
  
  public static final String PRODUCER;
  
  static {
    DJMIXER = StandardIPLSKey.DJMIXER.getKey();
    PRODUCER = StandardIPLSKey.PRODUCER.getKey();
    ARRANGER = StandardIPLSKey.ARRANGER.getKey();
  }
  
  public FrameBodyTIPL() {}
  
  public FrameBodyTIPL(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTIPL(byte paramByte, List<Pair> paramList) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
    Iterator<Pair> iterator = paramList.iterator();
    while (iterator.hasNext())
      valuePairs.add(iterator.next()); 
    setObjectValue("Text", valuePairs);
  }
  
  public FrameBodyTIPL(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTIPL(FrameBodyIPLS paramFrameBodyIPLS) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyIPLS.getTextEncoding()));
    setObjectValue("Text", paramFrameBodyIPLS.getPairing());
  }
  
  public String getIdentifier() {
    return "TIPL";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTIPL.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */