package org.jaudiotagger.tag.datatype;

import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import ga1;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.logging.Logger;
import l0;
import mk;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;

public class StringFixedLength extends AbstractString {
  public StringFixedLength(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt) {
    super(paramString, paramAbstractTagFrameBody);
    if (paramInt >= 0) {
      setSize(paramInt);
      return;
    } 
    l0.l(ga1.i("size is less than zero: ", paramInt));
    throw null;
  }
  
  public StringFixedLength(StringFixedLength paramStringFixedLength) {
    super(paramStringFixedLength);
    this.size = paramStringFixedLength.size;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof StringFixedLength))
      return false; 
    StringFixedLength stringFixedLength = (StringFixedLength)paramObject;
    return (this.size == stringFixedLength.size && super.equals(paramObject));
  }
  
  public Charset getTextEncodingCharSet() {
    byte b = getBody().getTextEncoding();
    Charset charset2 = TextEncoding.getInstanceOf().getCharsetForId(b);
    Charset charset1 = charset2;
    if (charset2 == null)
      charset1 = mk.c; 
    Logger logger = AbstractDataType.logger;
    StringBuilder stringBuilder = ga1.k(b, "text encoding:", " charset:");
    stringBuilder.append(charset1.name());
    logger.finest(stringBuilder.toString());
    return charset1;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    Logger logger2 = AbstractDataType.logger;
    StringBuilder stringBuilder = new StringBuilder("Reading from array from offset:");
    stringBuilder.append(paramInt);
    logger2.config(stringBuilder.toString());
    try {
      CharsetDecoder charsetDecoder = getTextEncodingCharSet().newDecoder();
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      this("Array length is:");
      stringBuilder1.append(paramArrayOfbyte.length);
      stringBuilder1.append("offset is:");
      stringBuilder1.append(paramInt);
      stringBuilder1.append("Size is:");
      stringBuilder1.append(this.size);
      logger.finest(stringBuilder1.toString());
      int j = paramArrayOfbyte.length;
      int i = this.size;
      if (j - paramInt >= i) {
        String str = charsetDecoder.decode(ByteBuffer.wrap(paramArrayOfbyte, paramInt, i)).toString();
        if (str != null) {
          this.value = str;
        } else {
          NullPointerException nullPointerException = new NullPointerException();
          this("String is null");
          throw nullPointerException;
        } 
      } else {
        InvalidDataTypeException invalidDataTypeException = new InvalidDataTypeException();
        StringBuilder stringBuilder2 = new StringBuilder();
        this("byte array is to small to retrieve string of declared length:");
        stringBuilder2.append(this.size);
        this(stringBuilder2.toString());
        throw invalidDataTypeException;
      } 
    } catch (CharacterCodingException characterCodingException) {
      AbstractDataType.logger.severe(characterCodingException.getMessage());
      this.value = "";
    } 
    Logger logger1 = AbstractDataType.logger;
    stringBuilder = new StringBuilder("Read StringFixedLength:");
    stringBuilder.append(this.value);
    logger1.config(stringBuilder.toString());
  }
  
  public byte[] writeByteArray() {
    String str = KjdXPYm.PbAHKx;
    Object object = this.value;
    int i = 0;
    int j = 0;
    byte b = 0;
    if (object == null) {
      AbstractDataType.logger.warning("Value of StringFixedlength Field is null using default value instead");
      object = new byte[this.size];
      for (i = b; i < this.size; i++)
        object[i] = 32; 
      return (byte[])object;
    } 
    try {
      object = getTextEncodingCharSet();
      if (mk.f.equals(object)) {
        CharsetEncoder charsetEncoder = mk.e.newEncoder();
        object = new StringBuilder();
        super("﻿");
        object.append((String)this.value);
        object = charsetEncoder.encode(CharBuffer.wrap(object.toString()));
      } else {
        object = object.newEncoder().encode(CharBuffer.wrap((String)this.value));
      } 
    } catch (CharacterCodingException characterCodingException) {}
    if (object != null) {
      byte[] arrayOfByte2;
      if (object.limit() == this.size) {
        arrayOfByte2 = new byte[object.limit()];
        object.get(arrayOfByte2, 0, object.limit());
        return arrayOfByte2;
      } 
      i = object.limit();
      j = this.size;
      Object object1 = this.value;
      if (i > j) {
        Logger logger1 = AbstractDataType.logger;
        StringBuilder stringBuilder2 = new StringBuilder((String)arrayOfByte2);
        stringBuilder2.append(object1);
        stringBuilder2.append(" when converted to bytes has length of:");
        stringBuilder2.append(object.limit());
        stringBuilder2.append(" but field was defined with length of:");
        stringBuilder2.append(this.size);
        stringBuilder2.append(" too long so stripping extra length");
        logger1.warning(stringBuilder2.toString());
        i = this.size;
        arrayOfByte2 = new byte[i];
        object.get(arrayOfByte2, 0, i);
        return arrayOfByte2;
      } 
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder1 = new StringBuilder((String)arrayOfByte2);
      stringBuilder1.append(object1);
      stringBuilder1.append(" when converted to bytes has length of:");
      stringBuilder1.append(object.limit());
      stringBuilder1.append(" but field was defined with length of:");
      stringBuilder1.append(this.size);
      stringBuilder1.append(" too short so padding with spaces to make up extra length");
      logger.warning(stringBuilder1.toString());
      byte[] arrayOfByte1 = new byte[this.size];
      object.get(arrayOfByte1, 0, object.limit());
      for (i = object.limit(); i < this.size; i++)
        arrayOfByte1[i] = 32; 
      return arrayOfByte1;
    } 
    object = AbstractDataType.logger;
    StringBuilder stringBuilder = new StringBuilder("There was a serious problem writing the following StringFixedlength Field:");
    stringBuilder.append(this.value);
    stringBuilder.append(":using default value instead");
    object.warning(stringBuilder.toString());
    object = new byte[this.size];
    while (i < this.size) {
      object[i] = 32;
      i++;
    } 
    return (byte[])object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\StringFixedLength.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */