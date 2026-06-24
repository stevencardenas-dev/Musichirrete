package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.TCONString;
import org.jaudiotagger.tag.id3.valuepair.ID3V2ExtendedGenreTypes;
import org.jaudiotagger.tag.reference.GenreTypes;

public class FrameBodyTCON extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTCON() {}
  
  public FrameBodyTCON(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTCON(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTCON(FrameBodyTCON paramFrameBodyTCON) {
    super(paramFrameBodyTCON);
  }
  
  private static String bracketWrap(Object paramObject) {
    StringBuilder stringBuilder = new StringBuilder("(");
    stringBuilder.append(paramObject);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  private static String checkBracketed(String paramString) {
    String str = paramString.replace(jHxlGgUTadw.CIb, "").replace(")", "");
    try {
      int i = Integer.parseInt(str);
      paramString = str;
      if (i <= GenreTypes.getMaxGenreId())
        paramString = GenreTypes.getInstanceOf().getValueForId(i); 
      return paramString;
    } catch (NumberFormatException numberFormatException) {
      String str1;
      ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes = ID3V2ExtendedGenreTypes.RX;
      if (str.equalsIgnoreCase(iD3V2ExtendedGenreTypes.name())) {
        str1 = iD3V2ExtendedGenreTypes.getDescription();
      } else {
        ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes1 = ID3V2ExtendedGenreTypes.CR;
        str1 = str;
        if (str.equalsIgnoreCase(iD3V2ExtendedGenreTypes1.name()))
          str1 = iD3V2ExtendedGenreTypes1.getDescription(); 
      } 
      return str1;
    } 
  }
  
  public static String convertGenericToID3v22Genre(String paramString) {
    return convertGenericToID3v23Genre(paramString);
  }
  
  public static String convertGenericToID3v23Genre(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      String str = paramString;
      if (i <= GenreTypes.getMaxGenreId())
        str = bracketWrap(String.valueOf(i)); 
      return str;
    } catch (NumberFormatException numberFormatException) {
      String str;
      Integer integer = GenreTypes.getInstanceOf().getIdForName(paramString);
      if (integer != null && integer.intValue() <= GenreTypes.getMaxStandardGenreId())
        return bracketWrap(String.valueOf(integer)); 
      ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes = ID3V2ExtendedGenreTypes.RX;
      if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes.getDescription())) {
        str = bracketWrap(iD3V2ExtendedGenreTypes.name());
      } else {
        ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes1 = ID3V2ExtendedGenreTypes.CR;
        if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes1.getDescription())) {
          str = bracketWrap(iD3V2ExtendedGenreTypes1.name());
        } else if (paramString.equalsIgnoreCase(str.name())) {
          str = bracketWrap(str.name());
        } else {
          str = paramString;
          if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes1.name()))
            str = bracketWrap(iD3V2ExtendedGenreTypes1.name()); 
        } 
      } 
      return str;
    } 
  }
  
  public static String convertGenericToID3v24Genre(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      String str = paramString;
      if (i <= GenreTypes.getMaxGenreId())
        str = String.valueOf(i); 
      return str;
    } catch (NumberFormatException numberFormatException) {
      String str;
      Integer integer = GenreTypes.getInstanceOf().getIdForName(paramString);
      if (integer != null && integer.intValue() <= GenreTypes.getMaxStandardGenreId())
        return String.valueOf(integer); 
      ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes = ID3V2ExtendedGenreTypes.RX;
      if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes.getDescription())) {
        str = iD3V2ExtendedGenreTypes.name();
      } else {
        ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes1 = ID3V2ExtendedGenreTypes.CR;
        if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes1.getDescription())) {
          str = iD3V2ExtendedGenreTypes1.name();
        } else if (paramString.equalsIgnoreCase(str.name())) {
          str = str.name();
        } else {
          str = paramString;
          if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes1.name()))
            str = iD3V2ExtendedGenreTypes1.name(); 
        } 
      } 
      return str;
    } 
  }
  
  public static String convertID3v22GenreToGeneric(String paramString) {
    return convertID3v23GenreToGeneric(paramString);
  }
  
  public static String convertID3v23GenreToGeneric(String paramString) {
    if (paramString.contains(")") && paramString.lastIndexOf(')') < paramString.length() - 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(checkBracketed(paramString.substring(0, paramString.lastIndexOf(')'))));
      stringBuilder.append(' ');
      stringBuilder.append(paramString.substring(paramString.lastIndexOf(')') + 1));
      return stringBuilder.toString();
    } 
    return checkBracketed(paramString);
  }
  
  public static String convertID3v24GenreToGeneric(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      String str = paramString;
      if (i <= GenreTypes.getMaxGenreId())
        str = GenreTypes.getInstanceOf().getValueForId(i); 
      return str;
    } catch (NumberFormatException numberFormatException) {
      String str;
      ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes = ID3V2ExtendedGenreTypes.RX;
      if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes.name())) {
        str = iD3V2ExtendedGenreTypes.getDescription();
      } else {
        ID3V2ExtendedGenreTypes iD3V2ExtendedGenreTypes1 = ID3V2ExtendedGenreTypes.CR;
        str = paramString;
        if (paramString.equalsIgnoreCase(iD3V2ExtendedGenreTypes1.name()))
          str = iD3V2ExtendedGenreTypes1.getDescription(); 
      } 
      return str;
    } 
  }
  
  public String getIdentifier() {
    return "TCON";
  }
  
  public void setV23Format() {
    ((TCONString)getObject("Text")).setNullSeperateMultipleValues(false);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new TCONString("Text", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTCON.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */