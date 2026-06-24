package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.Pair;
import org.jaudiotagger.tag.datatype.PairedTextEncodedStringNullTerminated;

public abstract class AbstractFrameBodyPairs extends AbstractID3v2FrameBody implements ID3v24FrameBody {
  public AbstractFrameBodyPairs() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
  }
  
  public AbstractFrameBodyPairs(byte paramByte, String paramString) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setText(paramString);
  }
  
  public AbstractFrameBodyPairs(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public void addPair(String paramString) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\000");
    if (stringTokenizer.countTokens() == 2) {
      addPair(stringTokenizer.nextToken(), stringTokenizer.nextToken());
      return;
    } 
    addPair("", paramString);
  }
  
  public void addPair(String paramString1, String paramString2) {
    ((PairedTextEncodedStringNullTerminated)getObject("Text")).getValue().add(paramString1, paramString2);
  }
  
  public abstract String getIdentifier();
  
  public String getKeyAtIndex(int paramInt) {
    return ((Pair)((PairedTextEncodedStringNullTerminated)getObject("Text")).getValue().getMapping().get(paramInt)).getKey();
  }
  
  public int getNumberOfPairs() {
    return ((PairedTextEncodedStringNullTerminated)getObject("Text")).getValue().getNumberOfPairs();
  }
  
  public PairedTextEncodedStringNullTerminated.ValuePairs getPairing() {
    return (PairedTextEncodedStringNullTerminated.ValuePairs)getObject("Text").getValue();
  }
  
  public String getText() {
    PairedTextEncodedStringNullTerminated pairedTextEncodedStringNullTerminated = (PairedTextEncodedStringNullTerminated)getObject("Text");
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Pair> iterator = pairedTextEncodedStringNullTerminated.getValue().getMapping().iterator();
    for (byte b = 1; iterator.hasNext(); b++) {
      Pair pair = iterator.next();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(pair.getKey());
      stringBuilder1.append(false);
      stringBuilder1.append(pair.getValue());
      stringBuilder.append(stringBuilder1.toString());
      if (b != getNumberOfPairs())
        stringBuilder.append(false); 
    } 
    return stringBuilder.toString();
  }
  
  public String getUserFriendlyValue() {
    return getText();
  }
  
  public String getValueAtIndex(int paramInt) {
    return ((Pair)((PairedTextEncodedStringNullTerminated)getObject("Text")).getValue().getMapping().get(paramInt)).getValue();
  }
  
  public void resetPairs() {
    ((PairedTextEncodedStringNullTerminated)getObject("Text")).getValue().getMapping().clear();
  }
  
  public void setText(String paramString) {
    PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\000");
    while (stringTokenizer.hasMoreTokens()) {
      String str = stringTokenizer.nextToken();
      if (stringTokenizer.hasMoreTokens())
        valuePairs.add(str, stringTokenizer.nextToken()); 
    } 
    setObjectValue("Text", valuePairs);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap(KjdXPYm.PuPwvQpBJCtjBj, this, 1));
    this.objectList.add(new PairedTextEncodedStringNullTerminated("Text", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (!((PairedTextEncodedStringNullTerminated)getObject("Text")).canBeEncoded())
      setTextEncoding((byte)1); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\AbstractFrameBodyPairs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */