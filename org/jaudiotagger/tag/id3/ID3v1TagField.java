package org.jaudiotagger.tag.id3;

import java.nio.charset.Charset;
import mk;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;

public class ID3v1TagField implements TagTextField {
  private boolean common;
  
  private String content;
  
  private String id;
  
  public ID3v1TagField(String paramString1, String paramString2) {
    this.id = paramString1.toUpperCase();
    this.content = paramString2;
    checkCommon();
  }
  
  public ID3v1TagField(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, mk.b);
    int i = str.indexOf('=');
    if (i == -1) {
      this.id = "ERRONEOUS";
      this.content = str;
    } else {
      this.id = str.substring(0, i).toUpperCase();
      if (str.length() > i) {
        this.content = str.substring(i + 1);
      } else {
        this.content = "";
      } 
    } 
    checkCommon();
  }
  
  private void checkCommon() {
    boolean bool;
    if (this.id.equals(ID3v1FieldKey.TITLE.name()) || this.id.equals(ID3v1FieldKey.ALBUM.name()) || this.id.equals(ID3v1FieldKey.ARTIST.name()) || this.id.equals(ID3v1FieldKey.GENRE.name()) || this.id.equals(ID3v1FieldKey.YEAR.name()) || this.id.equals(ID3v1FieldKey.COMMENT.name()) || this.id.equals(ID3v1FieldKey.TRACK.name())) {
      bool = true;
    } else {
      bool = false;
    } 
    this.common = bool;
  }
  
  public void copy(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, paramInt, paramArrayOfbyte1.length);
  }
  
  public void copyContent(TagField paramTagField) {
    if (paramTagField instanceof TagTextField)
      this.content = ((TagTextField)paramTagField).getContent(); 
  }
  
  public String getContent() {
    return this.content;
  }
  
  public Charset getEncoding() {
    return mk.b;
  }
  
  public String getId() {
    return this.id;
  }
  
  public byte[] getRawContent() {
    String str = this.id;
    Charset charset = mk.b;
    byte[] arrayOfByte1 = str.getBytes(charset);
    byte[] arrayOfByte2 = this.content.getBytes(charset);
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length + 5 + arrayOfByte2.length];
    int i = arrayOfByte1.length + 1 + arrayOfByte2.length;
    byte b3 = (byte)((0xFF000000 & i) >> 24);
    byte b2 = (byte)((0xFF0000 & i) >> 16);
    byte b1 = (byte)((0xFF00 & i) >> 8);
    copy(new byte[] { (byte)(i & 0xFF), b1, b2, b3 }, arrayOfByte3, 0);
    copy(arrayOfByte1, arrayOfByte3, 4);
    i = arrayOfByte1.length;
    arrayOfByte3[4 + i] = 61;
    copy(arrayOfByte2, arrayOfByte3, i + 5);
    return arrayOfByte3;
  }
  
  public void isBinary(boolean paramBoolean) {}
  
  public boolean isBinary() {
    return false;
  }
  
  public boolean isCommon() {
    return this.common;
  }
  
  public boolean isEmpty() {
    return "".equals(this.content);
  }
  
  public void setContent(String paramString) {
    this.content = paramString;
  }
  
  public void setEncoding(Charset paramCharset) {}
  
  public String toString() {
    return getContent();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v1TagField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */