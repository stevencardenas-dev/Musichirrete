package org.jaudiotagger.tag.datatype;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class TextEncodedStringSizeTerminated extends AbstractString {
  public TextEncodedStringSizeTerminated(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public TextEncodedStringSizeTerminated(TextEncodedStringSizeTerminated paramTextEncodedStringSizeTerminated) {
    super(paramTextEncodedStringSizeTerminated);
  }
  
  public static List<String> splitByNullSeperator(String paramString) {
    List<String> list2 = Arrays.asList(paramString.split("\\u0000"));
    List<String> list1 = list2;
    if (list2.size() == 0) {
      list1 = new ArrayList<String>(1);
      list1.add("");
    } 
    return list1;
  }
  
  public void addValue(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.value);
    stringBuilder.append("\000");
    stringBuilder.append(paramString);
    setValue(stringBuilder.toString());
  }
  
  public void checkTrailingNull(List<String> paramList, String paramString) {
    if (!TagOptionSingleton.getInstance().isRemoveTrailingTerminatorOnWrite() && paramString.length() > 0 && paramString.charAt(paramString.length() - 1) == '\000') {
      paramString = paramList.get(paramList.size() - 1);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(false);
      paramString = stringBuilder.toString();
      paramList.set(paramList.size() - 1, paramString);
    } 
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof TextEncodedStringSizeTerminated && super.equals(paramObject)));
  }
  
  public int getNumberOfValues() {
    return splitByNullSeperator((String)this.value).size();
  }
  
  public String getValueAtIndex(int paramInt) {
    return splitByNullSeperator((String)this.value).get(paramInt);
  }
  
  public String getValueWithoutTrailingNull() {
    List<String> list = splitByNullSeperator((String)this.value);
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < list.size(); b++) {
      if (b != 0)
        stringBuffer.append("\000"); 
      stringBuffer.append(list.get(b));
    } 
    return stringBuffer.toString();
  }
  
  public List<String> getValues() {
    return splitByNullSeperator((String)this.value);
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    ByteBuffer byteBuffer;
    if (TagOptionSingleton.getInstance().isAndroid()) {
      int i = paramArrayOfbyte.length - paramInt;
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(paramArrayOfbyte, paramInt, arrayOfByte, 0, i);
      byteBuffer = ByteBuffer.wrap(arrayOfByte);
    } else {
      byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt).slice();
    } 
    CharBuffer charBuffer = CharBuffer.allocate(paramArrayOfbyte.length - paramInt);
    CharsetDecoder charsetDecoder = getCorrectDecoder(byteBuffer);
    CoderResult coderResult = charsetDecoder.decode(byteBuffer, charBuffer, true);
    if (coderResult.isError()) {
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder = new StringBuilder("Decoding error:");
      stringBuilder.append(coderResult.toString());
      logger.warning(stringBuilder.toString());
    } 
    charsetDecoder.flush(charBuffer);
    charBuffer.flip();
    if (mk.f.equals(getTextEncodingCharSet())) {
      String str = charBuffer.toString().replace("﻿", "").replace("￾", "");
      this.value = str;
      this.value = str.replace("﷿", "").replace("�", "");
    } else {
      this.value = charBuffer.toString();
    } 
    setSize(paramArrayOfbyte.length - paramInt);
    if (AbstractDataType.logger.isLoggable(Level.FINEST)) {
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder = new StringBuilder("Read SizeTerminatedString:");
      stringBuilder.append(this.value);
      stringBuilder.append(" size:");
      stringBuilder.append(this.size);
      logger.finest(stringBuilder.toString());
    } 
  }
  
  public void stripTrailingNull() {
    if (TagOptionSingleton.getInstance().isRemoveTrailingTerminatorOnWrite()) {
      String str = (String)this.value;
      if (str.length() > 0 && str.charAt(str.length() - 1) == '\000')
        this.value = str.substring(0, str.length() - 1); 
    } 
  }
  
  public byte[] writeByteArray() {
    String str;
    Charset charset = getTextEncodingCharSet();
    try {
      stripTrailingNull();
      str = (String)this.value;
      if (mk.f.equals(charset)) {
        if (TagOptionSingleton.getInstance().isEncodeUTF16BomAsLittleEndian()) {
          arrayOfByte = (byte[])mk.e;
        } else {
          arrayOfByte = (byte[])mk.d;
        } 
      } else {
        arrayOfByte = null;
      } 
    } catch (CharacterCodingException characterCodingException) {}
    ByteBuffer byteBuffer = ByteBuffer.allocate((str.length() + 3) * 3);
    List<String> list = splitByNullSeperator(str);
    checkTrailingNull(list, str);
    int i;
    for (i = 0; i < list.size(); i++) {
      String str1 = list.get(i);
      if (mk.e.equals(arrayOfByte)) {
        byteBuffer.put(writeStringUTF16LEBOM(str1, i, list.size()));
      } else if (mk.d.equals(arrayOfByte)) {
        byteBuffer.put(writeStringUTF16BEBOM(str1, i, list.size()));
      } else {
        CharsetEncoder charsetEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.put(writeString(charsetEncoder, str1, i, list.size()));
      } 
    } 
    byteBuffer.flip();
    i = byteBuffer.limit();
    byte[] arrayOfByte = new byte[i];
    byteBuffer.rewind();
    byteBuffer.get(arrayOfByte, 0, byteBuffer.limit());
    setSize(i);
    return arrayOfByte;
  }
  
  public ByteBuffer writeString(CharsetEncoder paramCharsetEncoder, String paramString, int paramInt1, int paramInt2) {
    ByteBuffer byteBuffer;
    if (paramInt1 + 1 == paramInt2) {
      byteBuffer = paramCharsetEncoder.encode(CharBuffer.wrap(paramString));
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(false);
      byteBuffer = byteBuffer.encode(CharBuffer.wrap(stringBuilder.toString()));
    } 
    byteBuffer.rewind();
    return byteBuffer;
  }
  
  public ByteBuffer writeStringUTF16BEBOM(String paramString, int paramInt1, int paramInt2) {
    ByteBuffer byteBuffer;
    CharsetEncoder charsetEncoder = mk.d.newEncoder();
    CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
    charsetEncoder.onMalformedInput(codingErrorAction);
    charsetEncoder.onUnmappableCharacter(codingErrorAction);
    if (paramInt1 + 1 == paramInt2) {
      StringBuilder stringBuilder = new StringBuilder("﻿");
      stringBuilder.append(paramString);
      byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder.toString()));
    } else {
      StringBuilder stringBuilder = new StringBuilder("﻿");
      stringBuilder.append((String)byteBuffer);
      stringBuilder.append(false);
      byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder.toString()));
    } 
    byteBuffer.rewind();
    return byteBuffer;
  }
  
  public ByteBuffer writeStringUTF16LEBOM(String paramString, int paramInt1, int paramInt2) {
    ByteBuffer byteBuffer;
    CharsetEncoder charsetEncoder = mk.e.newEncoder();
    CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
    charsetEncoder.onMalformedInput(codingErrorAction);
    charsetEncoder.onUnmappableCharacter(codingErrorAction);
    if (paramInt1 + 1 == paramInt2) {
      StringBuilder stringBuilder = new StringBuilder("﻿");
      stringBuilder.append(paramString);
      byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder.toString()));
    } else {
      StringBuilder stringBuilder = new StringBuilder("﻿");
      stringBuilder.append((String)byteBuffer);
      stringBuilder.append(false);
      byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder.toString()));
    } 
    byteBuffer.rewind();
    return byteBuffer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\TextEncodedStringSizeTerminated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */