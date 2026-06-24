package org.jaudiotagger.tag.vorbiscomment;

import java.nio.charset.Charset;
import mk;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import tp;

public class VorbisCommentTagField implements TagTextField {
  private static final String ERRONEOUS_ID = "ERRONEOUS";
  
  private boolean common;
  
  private String content;
  
  private String id;
  
  public VorbisCommentTagField(String paramString1, String paramString2) {
    this.id = paramString1.toUpperCase();
    this.content = paramString2;
    checkCommon();
  }
  
  public VorbisCommentTagField(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, "UTF-8");
    int i = str.indexOf("=");
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
    if (this.id.equals(VorbisCommentFieldKey.TITLE.getFieldName()) || this.id.equals(VorbisCommentFieldKey.ALBUM.getFieldName()) || this.id.equals(VorbisCommentFieldKey.ARTIST.getFieldName()) || this.id.equals(VorbisCommentFieldKey.GENRE.getFieldName()) || this.id.equals(VorbisCommentFieldKey.TRACKNUMBER.getFieldName()) || this.id.equals(VorbisCommentFieldKey.DATE.getFieldName()) || this.id.equals(VorbisCommentFieldKey.DESCRIPTION.getFieldName()) || this.id.equals(VorbisCommentFieldKey.COMMENT.getFieldName())) {
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
    return mk.c;
  }
  
  public String getId() {
    return this.id;
  }
  
  public byte[] getRawContent() {
    byte[] arrayOfByte2 = this.id.getBytes(mk.b);
    byte[] arrayOfByte3 = this.content.getBytes(mk.c);
    byte[] arrayOfByte1 = new byte[arrayOfByte2.length + 5 + arrayOfByte3.length];
    int i = arrayOfByte2.length + 1 + arrayOfByte3.length;
    byte b3 = (byte)((0xFF000000 & i) >> 24);
    byte b2 = (byte)((0xFF0000 & i) >> 16);
    byte b1 = (byte)((0xFF00 & i) >> 8);
    copy(new byte[] { (byte)(i & 0xFF), b1, b2, b3 }, arrayOfByte1, 0);
    copy(arrayOfByte2, arrayOfByte1, 4);
    i = arrayOfByte2.length;
    arrayOfByte1[4 + i] = 61;
    copy(arrayOfByte3, arrayOfByte1, i + 5);
    return arrayOfByte1;
  }
  
  public void isBinary(boolean paramBoolean) {
    if (!paramBoolean)
      return; 
    tp.j("OggTagFields cannot be changed to binary.\nbinary data should be stored elsewhere according to Vorbis_I_spec.");
  }
  
  public boolean isBinary() {
    return false;
  }
  
  public boolean isCommon() {
    return this.common;
  }
  
  public boolean isEmpty() {
    return this.content.equals("");
  }
  
  public void setContent(String paramString) {
    this.content = paramString;
  }
  
  public void setEncoding(Charset paramCharset) {
    if (mk.c.equals(paramCharset))
      return; 
    tp.j("The encoding of OggTagFields cannot be changed.(specified to be UTF-8)");
  }
  
  public String toString() {
    return getContent();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisCommentTagField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */