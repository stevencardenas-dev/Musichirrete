package org.jaudiotagger.tag.datatype;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;

public abstract class AbstractString extends AbstractDataType {
  public AbstractString(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public AbstractString(String paramString1, AbstractTagFrameBody paramAbstractTagFrameBody, String paramString2) {
    super(paramString1, paramAbstractTagFrameBody, paramString2);
  }
  
  public AbstractString(AbstractString paramAbstractString) {
    super(paramAbstractString);
  }
  
  public boolean canBeEncoded() {
    byte b = getBody().getTextEncoding();
    CharsetEncoder charsetEncoder = TextEncoding.getInstanceOf().getCharsetForId(b).newEncoder();
    Object object = this.value;
    if (object instanceof String && charsetEncoder.canEncode((String)object))
      return true; 
    Logger logger = AbstractDataType.logger;
    object = new StringBuilder("Failed Trying to decode");
    object.append(this.value);
    object.append("with");
    object.append(charsetEncoder.toString());
    logger.finest(object.toString());
    return false;
  }
  
  public CharsetDecoder getCorrectDecoder(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() <= 2) {
      charsetDecoder = getTextEncodingCharSet().newDecoder();
      charsetDecoder.reset();
      return charsetDecoder;
    } 
    if (getTextEncodingCharSet() == mk.f) {
      if (charsetDecoder.getChar(0) == '￾' || charsetDecoder.getChar(0) == '﻿') {
        charsetDecoder = getTextEncodingCharSet().newDecoder();
        charsetDecoder.reset();
        return charsetDecoder;
      } 
      if (charsetDecoder.get(0) == 0) {
        charsetDecoder = mk.d.newDecoder();
        charsetDecoder.reset();
        return charsetDecoder;
      } 
      charsetDecoder = mk.e.newDecoder();
      charsetDecoder.reset();
      return charsetDecoder;
    } 
    CharsetDecoder charsetDecoder = getTextEncodingCharSet().newDecoder();
    charsetDecoder.reset();
    return charsetDecoder;
  }
  
  public int getSize() {
    return this.size;
  }
  
  public Charset getTextEncodingCharSet() {
    byte b = getBody().getTextEncoding();
    Charset charset2 = TextEncoding.getInstanceOf().getCharsetForId(b);
    Charset charset1 = charset2;
    if (charset2 == null)
      charset1 = mk.c; 
    return charset1;
  }
  
  public void setSize(int paramInt) {
    this.size = paramInt;
  }
  
  public String toString() {
    return (String)this.value;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\AbstractString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */