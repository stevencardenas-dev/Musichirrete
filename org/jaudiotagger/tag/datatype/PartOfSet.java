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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k91;
import mk;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;
import org.jaudiotagger.tag.options.PadNumberOption;
import r3.IKWi.AyxAR;
import z51;

public class PartOfSet extends AbstractString {
  public PartOfSet(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public PartOfSet(PartOfSet paramPartOfSet) {
    super(paramPartOfSet);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof PartOfSet))
      return false; 
    paramObject = paramObject;
    return z51.a(this.value, ((AbstractDataType)paramObject).value);
  }
  
  public Charset getTextEncodingCharSet() {
    byte b = getBody().getTextEncoding();
    Charset charset = TextEncoding.getInstanceOf().getCharsetForId(b);
    Logger logger = AbstractDataType.logger;
    StringBuilder stringBuilder = ga1.k(b, "text encoding:", " charset:");
    stringBuilder.append(charset.name());
    logger.finest(stringBuilder.toString());
    return charset;
  }
  
  public PartOfSetValue getValue() {
    return (PartOfSetValue)this.value;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    CharsetDecoder charsetDecoder = getTextEncodingCharSet().newDecoder();
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt).slice();
    CharBuffer charBuffer = CharBuffer.allocate(paramArrayOfbyte.length - paramInt);
    charsetDecoder.reset();
    CoderResult coderResult = charsetDecoder.decode(byteBuffer, charBuffer, true);
    if (coderResult.isError()) {
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder = new StringBuilder("Decoding error:");
      stringBuilder.append(coderResult.toString());
      logger.warning(stringBuilder.toString());
    } 
    charsetDecoder.flush(charBuffer);
    charBuffer.flip();
    this.value = new PartOfSetValue(charBuffer.toString());
    setSize(paramArrayOfbyte.length - paramInt);
    if (AbstractDataType.logger.isLoggable(Level.CONFIG)) {
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder = new StringBuilder(AyxAR.bHiqvWFLMSiTX);
      stringBuilder.append(this.value);
      stringBuilder.append(" size:");
      stringBuilder.append(this.size);
      logger.config(stringBuilder.toString());
    } 
  }
  
  public String toString() {
    return this.value.toString();
  }
  
  public byte[] writeByteArray() {
    String str2 = getValue().toString();
    String str1 = str2;
    try {
      CharsetEncoder charsetEncoder;
      if (TagOptionSingleton.getInstance().isRemoveTrailingTerminatorOnWrite()) {
        str1 = str2;
        if (str2.length() > 0) {
          str1 = str2;
          if (str2.charAt(str2.length() - 1) == '\000')
            str1 = str2.substring(0, str2.length() - 1); 
        } 
      } 
      Charset charset = getTextEncodingCharSet();
      if (mk.f.equals(charset)) {
        charsetEncoder = mk.e.newEncoder();
        StringBuilder stringBuilder = new StringBuilder();
        this("﻿");
        stringBuilder.append(str1);
        str1 = stringBuilder.toString();
      } else {
        charsetEncoder = charsetEncoder.newEncoder();
      } 
      CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
      charsetEncoder.onMalformedInput(codingErrorAction);
      charsetEncoder.onUnmappableCharacter(codingErrorAction);
      ByteBuffer byteBuffer = charsetEncoder.encode(CharBuffer.wrap(str1));
      int i = byteBuffer.limit();
      byte[] arrayOfByte = new byte[i];
      byteBuffer.get(arrayOfByte, 0, byteBuffer.limit());
      setSize(i);
      return arrayOfByte;
    } catch (CharacterCodingException characterCodingException) {
      AbstractDataType.logger.severe(characterCodingException.getMessage());
      k91.n(characterCodingException);
      return null;
    } 
  }
  
  public static class PartOfSetValue {
    private static final String SEPARATOR = "/";
    
    private static final Pattern trackNoPattern = Pattern.compile("([0-9]+)(.*)", 2);
    
    private static final Pattern trackNoPatternWithTotalCount = Pattern.compile("([0-9]+)/([0-9]+)(.*)", 2);
    
    private Integer count;
    
    private String extra;
    
    private String rawCount;
    
    private String rawText;
    
    private String rawTotal;
    
    private Integer total;
    
    static {
    
    }
    
    public PartOfSetValue() {
      this.rawText = "";
    }
    
    public PartOfSetValue(Integer param1Integer1, Integer param1Integer2) {
      this.count = param1Integer1;
      this.rawCount = param1Integer1.toString();
      this.total = param1Integer2;
      this.rawTotal = param1Integer2.toString();
      resetValueFromCounts();
    }
    
    public PartOfSetValue(String param1String) {
      this.rawText = param1String;
      initFromValue(param1String);
    }
    
    private void initFromValue(String param1String) {
      try {
        Matcher matcher2 = trackNoPatternWithTotalCount.matcher(param1String);
        if (matcher2.matches()) {
          this.extra = matcher2.group(3);
          this.count = Integer.valueOf(Integer.parseInt(matcher2.group(1)));
          this.rawCount = matcher2.group(1);
          this.total = Integer.valueOf(Integer.parseInt(matcher2.group(2)));
          this.rawTotal = matcher2.group(2);
          return;
        } 
        Matcher matcher1 = trackNoPattern.matcher(param1String);
        if (matcher1.matches()) {
          this.extra = matcher1.group(2);
          this.count = Integer.valueOf(Integer.parseInt(matcher1.group(1)));
          this.rawCount = matcher1.group(1);
        } 
        return;
      } catch (NumberFormatException numberFormatException) {
        this.count = Integer.valueOf(0);
        return;
      } 
    }
    
    private void padNumber(StringBuffer param1StringBuffer, Integer param1Integer, PadNumberOption param1PadNumberOption) {
      if (param1Integer != null) {
        if (param1PadNumberOption == PadNumberOption.PAD_ONE_ZERO) {
          if (param1Integer.intValue() > 0 && param1Integer.intValue() < 10) {
            param1StringBuffer.append("0");
            param1StringBuffer.append(param1Integer);
            return;
          } 
          param1StringBuffer.append(param1Integer.intValue());
          return;
        } 
        if (param1PadNumberOption == PadNumberOption.PAD_TWO_ZERO) {
          if (param1Integer.intValue() > 0 && param1Integer.intValue() < 10) {
            param1StringBuffer.append("00");
            param1StringBuffer.append(param1Integer);
            return;
          } 
          if (param1Integer.intValue() > 9 && param1Integer.intValue() < 100) {
            param1StringBuffer.append("0");
            param1StringBuffer.append(param1Integer);
            return;
          } 
          param1StringBuffer.append(param1Integer.intValue());
          return;
        } 
        if (param1PadNumberOption == PadNumberOption.PAD_THREE_ZERO) {
          if (param1Integer.intValue() > 0 && param1Integer.intValue() < 10) {
            param1StringBuffer.append("000");
            param1StringBuffer.append(param1Integer);
            return;
          } 
          if (param1Integer.intValue() > 9 && param1Integer.intValue() < 100) {
            param1StringBuffer.append("00");
            param1StringBuffer.append(param1Integer);
            return;
          } 
          if (param1Integer.intValue() > 99 && param1Integer.intValue() < 1000) {
            param1StringBuffer.append("0");
            param1StringBuffer.append(param1Integer);
            return;
          } 
          param1StringBuffer.append(param1Integer.intValue());
        } 
      } 
    }
    
    private void resetValueFromCounts() {
      StringBuffer stringBuffer = new StringBuffer();
      String str = this.rawCount;
      if (str != null) {
        stringBuffer.append(str);
      } else {
        stringBuffer.append("0");
      } 
      if (this.rawTotal != null) {
        StringBuilder stringBuilder = new StringBuilder("/");
        stringBuilder.append(this.rawTotal);
        stringBuffer.append(stringBuilder.toString());
      } 
      str = this.extra;
      if (str != null)
        stringBuffer.append(str); 
      this.rawText = stringBuffer.toString();
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof PartOfSetValue))
        return false; 
      param1Object = param1Object;
      return (z51.a(getCount(), param1Object.getCount()) && z51.a(getTotal(), param1Object.getTotal()));
    }
    
    public Integer getCount() {
      return this.count;
    }
    
    public String getCountAsText() {
      StringBuffer stringBuffer = new StringBuffer();
      if (!TagOptionSingleton.getInstance().isPadNumbers())
        return this.rawCount; 
      padNumber(stringBuffer, this.count, TagOptionSingleton.getInstance().getPadNumberTotalLength());
      return stringBuffer.toString();
    }
    
    public String getRawValue() {
      return this.rawText;
    }
    
    public Integer getTotal() {
      return this.total;
    }
    
    public String getTotalAsText() {
      StringBuffer stringBuffer = new StringBuffer();
      if (!TagOptionSingleton.getInstance().isPadNumbers())
        return this.rawTotal; 
      padNumber(stringBuffer, this.total, TagOptionSingleton.getInstance().getPadNumberTotalLength());
      return stringBuffer.toString();
    }
    
    public void setCount(Integer param1Integer) {
      this.count = param1Integer;
      this.rawCount = param1Integer.toString();
      resetValueFromCounts();
    }
    
    public void setCount(String param1String) {
      try {
        this.count = Integer.valueOf(Integer.parseInt(param1String));
        this.rawCount = param1String;
        resetValueFromCounts();
      } catch (NumberFormatException numberFormatException) {}
    }
    
    public void setRawValue(String param1String) {
      this.rawText = param1String;
      initFromValue(param1String);
    }
    
    public void setTotal(Integer param1Integer) {
      this.total = param1Integer;
      this.rawTotal = param1Integer.toString();
      resetValueFromCounts();
    }
    
    public void setTotal(String param1String) {
      try {
        this.total = Integer.valueOf(Integer.parseInt(param1String));
        this.rawTotal = param1String;
        resetValueFromCounts();
      } catch (NumberFormatException numberFormatException) {}
    }
    
    public String toString() {
      StringBuffer stringBuffer = new StringBuffer();
      if (!TagOptionSingleton.getInstance().isPadNumbers())
        return this.rawText; 
      Integer integer = this.count;
      if (integer != null) {
        padNumber(stringBuffer, integer, TagOptionSingleton.getInstance().getPadNumberTotalLength());
      } else if (this.total != null) {
        padNumber(stringBuffer, Integer.valueOf(0), TagOptionSingleton.getInstance().getPadNumberTotalLength());
      } 
      if (this.total != null) {
        stringBuffer.append("/");
        padNumber(stringBuffer, this.total, TagOptionSingleton.getInstance().getPadNumberTotalLength());
      } 
      String str = this.extra;
      if (str != null)
        stringBuffer.append(str); 
      return stringBuffer.toString();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\PartOfSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */