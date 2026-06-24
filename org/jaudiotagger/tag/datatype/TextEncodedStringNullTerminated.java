package org.jaudiotagger.tag.datatype;

import ga1;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;

public class TextEncodedStringNullTerminated extends AbstractString {
  public TextEncodedStringNullTerminated(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public TextEncodedStringNullTerminated(String paramString1, AbstractTagFrameBody paramAbstractTagFrameBody, String paramString2) {
    super(paramString1, paramAbstractTagFrameBody, paramString2);
  }
  
  public TextEncodedStringNullTerminated(TextEncodedStringNullTerminated paramTextEncodedStringNullTerminated) {
    super(paramTextEncodedStringNullTerminated);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof TextEncodedStringNullTerminated && super.equals(paramObject));
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
    if (paramInt < paramArrayOfbyte.length) {
      int i;
      boolean bool;
      Charset charset2 = getTextEncodingCharSet();
      ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt);
      Charset charset1 = mk.b;
      int j = 0;
      if (charset1 == charset2 || mk.c == charset2) {
        bool = true;
      } else {
        bool = false;
      } 
      while (true) {
        if (byteBuffer.hasRemaining()) {
          if (byteBuffer.get() == 0) {
            if (bool) {
              byteBuffer.mark();
              byteBuffer.reset();
              i = byteBuffer.position();
            } else {
              if (byteBuffer.hasRemaining()) {
                if (byteBuffer.get() == 0) {
                  byteBuffer.mark();
                  byteBuffer.reset();
                  i = byteBuffer.position() - 2;
                } else {
                  continue;
                } 
              } else {
                byteBuffer.mark();
                byteBuffer.reset();
                i = byteBuffer.position();
                i--;
              } 
              j = 1;
              break;
            } 
          } else {
            if (!bool && byteBuffer.hasRemaining())
              byteBuffer.get(); 
            continue;
          } 
        } else {
          i = 0;
          break;
        } 
        i--;
      } 
      if (j) {
        j = i - paramInt;
        i = j + 1;
        if (!bool)
          i = j + 2; 
        setSize(i);
        if (AbstractDataType.logger.isLoggable(Level.FINEST)) {
          Logger logger = AbstractDataType.logger;
          StringBuilder stringBuilder = new StringBuilder("Text size is:");
          stringBuilder.append(j);
          logger.finest(stringBuilder.toString());
        } 
        if (j == 0) {
          this.value = "";
        } else {
          byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt, j).slice();
          CharBuffer charBuffer = CharBuffer.allocate(j);
          CharsetDecoder charsetDecoder = getCorrectDecoder(byteBuffer);
          CoderResult coderResult = charsetDecoder.decode(byteBuffer, charBuffer, true);
          if (coderResult.isError()) {
            Logger logger = AbstractDataType.logger;
            StringBuilder stringBuilder = new StringBuilder("Problem decoding text encoded null terminated string:");
            stringBuilder.append(coderResult.toString());
            logger.warning(stringBuilder.toString());
          } 
          charsetDecoder.flush(charBuffer);
          charBuffer.flip();
          this.value = charBuffer.toString();
        } 
        if (AbstractDataType.logger.isLoggable(Level.CONFIG)) {
          Logger logger = AbstractDataType.logger;
          StringBuilder stringBuilder = new StringBuilder("Read NullTerminatedString:");
          stringBuilder.append(this.value);
          stringBuilder.append(" size inc terminator:");
          stringBuilder.append(i);
          logger.config(stringBuilder.toString());
        } 
        return;
      } 
      throw new InvalidDataTypeException("Unable to find null terminated string");
    } 
    throw new InvalidDataTypeException("Unable to find null terminated string");
  }
  
  public byte[] writeByteArray() {
    Logger logger = AbstractDataType.logger;
    StringBuilder stringBuilder = new StringBuilder("Writing NullTerminatedString.");
    stringBuilder.append(this.value);
    logger.config(stringBuilder.toString());
    Charset charset = getTextEncodingCharSet();
    try {
      if (mk.f.equals(charset)) {
        boolean bool = TagOptionSingleton.getInstance().isEncodeUTF16BomAsLittleEndian();
        if (bool) {
          CharsetEncoder charsetEncoder = mk.e.newEncoder();
          CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
          charsetEncoder.onMalformedInput(codingErrorAction);
          charsetEncoder.onUnmappableCharacter(codingErrorAction);
          StringBuilder stringBuilder1 = new StringBuilder();
          this("﻿");
          stringBuilder1.append((String)this.value);
          stringBuilder1.append(false);
          ByteBuffer byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder1.toString()));
          byte[] arrayOfByte = new byte[byteBuffer.limit()];
          byteBuffer.get(arrayOfByte, 0, byteBuffer.limit());
        } else {
          CharsetEncoder charsetEncoder = mk.d.newEncoder();
          CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
          charsetEncoder.onMalformedInput(codingErrorAction);
          charsetEncoder.onUnmappableCharacter(codingErrorAction);
          StringBuilder stringBuilder1 = new StringBuilder();
          this("﻿");
          stringBuilder1.append((String)this.value);
          stringBuilder1.append(false);
          ByteBuffer byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder1.toString()));
          byte[] arrayOfByte = new byte[byteBuffer.limit()];
          byteBuffer.get(arrayOfByte, 0, byteBuffer.limit());
        } 
      } else {
        CharsetEncoder charsetEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append((String)this.value);
        stringBuilder1.append(false);
        ByteBuffer byteBuffer = charsetEncoder.encode(CharBuffer.wrap(stringBuilder1.toString()));
        byte[] arrayOfByte = new byte[byteBuffer.limit()];
        byteBuffer.get(arrayOfByte, 0, byteBuffer.limit());
      } 
    } catch (CharacterCodingException characterCodingException) {}
    setSize(characterCodingException.length);
    return (byte[])characterCodingException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\TextEncodedStringNullTerminated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */