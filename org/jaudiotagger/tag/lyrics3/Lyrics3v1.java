package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import java.util.Iterator;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.id3.AbstractTag;
import org.jaudiotagger.tag.id3.ID3Tags;
import tp;
import uc1;
import x41;

public class Lyrics3v1 extends AbstractLyrics3 {
  private String lyric = "";
  
  public Lyrics3v1() {}
  
  public Lyrics3v1(ByteBuffer paramByteBuffer) {
    try {
      read(paramByteBuffer);
      return;
    } catch (TagException tagException) {
      tagException.printStackTrace();
      return;
    } 
  }
  
  public Lyrics3v1(AbstractTag paramAbstractTag) {
    if (paramAbstractTag != null) {
      if (!(paramAbstractTag instanceof Lyrics3v1)) {
        if (paramAbstractTag instanceof Lyrics3v2) {
          paramAbstractTag = paramAbstractTag;
        } else {
          paramAbstractTag = new Lyrics3v2(paramAbstractTag);
        } 
        this.lyric = ((FieldFrameBodyLYR)paramAbstractTag.getField("LYR").getBody()).getLyric();
        return;
      } 
      tp.j("Copy Constructor not called. Please type cast the argument");
      throw null;
    } 
  }
  
  public Lyrics3v1(Lyrics3v1 paramLyrics3v1) {
    super(paramLyrics3v1);
    this.lyric = paramLyrics3v1.lyric;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Lyrics3v1))
      return false; 
    Lyrics3v1 lyrics3v1 = (Lyrics3v1)paramObject;
    return (this.lyric.equals(lyrics3v1.lyric) && super.equals(paramObject));
  }
  
  public String getIdentifier() {
    return "Lyrics3v1.00";
  }
  
  public String getLyric() {
    return this.lyric;
  }
  
  public int getSize() {
    return this.lyric.length() + 20;
  }
  
  public boolean isSubsetOf(Object paramObject) {
    return (paramObject instanceof Lyrics3v1 && ((Lyrics3v1)paramObject).lyric.contains(this.lyric));
  }
  
  public Iterator<Object> iterator() {
    throw new UnsupportedOperationException("Method iterator() not yet implemented.");
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[5120];
    if (seek(paramByteBuffer)) {
      paramByteBuffer.get(arrayOfByte);
      String str = new String(arrayOfByte);
      this.lyric = str.substring(0, str.indexOf("LYRICSEND"));
      return;
    } 
    throw new TagNotFoundException("ID3v1 tag not found");
  }
  
  public boolean seek(ByteBuffer paramByteBuffer) {
    return false;
  }
  
  public boolean seek(uc1 paramuc1) {
    long l;
    byte[] arrayOfByte = new byte[5120];
    paramuc1.h(paramuc1.d() - 137L);
    paramuc1.read(arrayOfByte, 0, 9);
    if ((new String(arrayOfByte, 0, 9)).equals("LYRICSEND")) {
      l = paramuc1.c();
    } else {
      paramuc1.h(paramuc1.d() - 9L);
      paramuc1.read(arrayOfByte, 0, 9);
      if ((new String(arrayOfByte, 0, 9)).equals("LYRICSEND")) {
        l = paramuc1.c();
      } else {
        return false;
      } 
    } 
    l -= 5120L;
    paramuc1.h(l);
    paramuc1.g(arrayOfByte);
    int i = (new String(arrayOfByte)).indexOf("LYRICSBEGIN");
    if (i != -1) {
      paramuc1.h(l + i + 11L);
      return true;
    } 
    return false;
  }
  
  public void setLyric(String paramString) {
    this.lyric = ID3Tags.truncate(paramString, 5100);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getIdentifier());
    stringBuilder.append(" ");
    stringBuilder.append(getSize());
    stringBuilder.append("\n");
    stringBuilder = x41.p(stringBuilder.toString());
    stringBuilder.append(this.lyric);
    return stringBuilder.toString();
  }
  
  public void write(uc1 paramuc1) {
    delete(paramuc1);
    paramuc1.h(paramuc1.d());
    byte[] arrayOfByte = new byte[this.lyric.length() + 20];
    byte b;
    for (b = 0; b < 11; b++)
      arrayOfByte[b] = (byte)"LYRICSBEGIN".charAt(b); 
    String str = ID3Tags.truncate(this.lyric, 5100);
    for (b = 0; b < str.length(); b++)
      arrayOfByte[b + 11] = (byte)str.charAt(b); 
    int i = str.length();
    for (b = 0; b < 9; b++)
      arrayOfByte[b + 11 + i] = (byte)"LYRICSEND".charAt(b); 
    paramuc1.write(arrayOfByte, 0, i + 20);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\Lyrics3v1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */