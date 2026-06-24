package org.jaudiotagger.tag.id3.valuepair;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import mk;
import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class TextEncoding extends AbstractIntStringValuePair {
  public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";
  
  public static final String CHARSET_US_ASCII = "US-ASCII";
  
  public static final String CHARSET_UTF_16 = "UTF-16";
  
  public static final String CHARSET_UTF_16BE = "UTF-16BE";
  
  public static final String CHARSET_UTF_8 = "UTF-8";
  
  public static final byte ISO_8859_1 = 0;
  
  public static final int TEXT_ENCODING_FIELD_SIZE = 1;
  
  public static final byte UTF_16 = 1;
  
  public static final byte UTF_16BE = 2;
  
  public static final byte UTF_8 = 3;
  
  private static TextEncoding textEncodings;
  
  private final Map<Integer, Charset> idToCharset;
  
  private TextEncoding() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    this.idToCharset = (Map)hashMap;
    hashMap.put(Integer.valueOf(0), mk.b);
    hashMap.put(Integer.valueOf(1), mk.f);
    hashMap.put(Integer.valueOf(2), mk.d);
    hashMap.put(Integer.valueOf(3), mk.c);
    for (Map.Entry<Object, Object> entry : hashMap.entrySet())
      ((AbstractValuePair)this).idToValue.put((Integer)entry.getKey(), ((Charset)entry.getValue()).name()); 
    createMaps();
  }
  
  public static TextEncoding getInstanceOf() {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/tag/id3/valuepair/TextEncoding}} */
    try {
      if (textEncodings == null) {
        TextEncoding textEncoding1 = new TextEncoding();
        this();
        textEncodings = textEncoding1;
      } 
    } finally {
      Exception exception;
    } 
    TextEncoding textEncoding = textEncodings;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/tag/id3/valuepair/TextEncoding}} */
    return textEncoding;
  }
  
  public Charset getCharsetForId(int paramInt) {
    return this.idToCharset.get(Integer.valueOf(paramInt));
  }
  
  public Integer getIdForCharset(Charset paramCharset) {
    return (Integer)((AbstractValuePair)this).valueToId.get(paramCharset.name());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\TextEncoding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */