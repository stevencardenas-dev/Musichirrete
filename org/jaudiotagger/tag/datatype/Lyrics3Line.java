package org.jaudiotagger.tag.datatype;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import ga1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k91;
import m60;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import x41;

public class Lyrics3Line extends AbstractDataType {
  private String lyric = "";
  
  private List<Lyrics3TimeStamp> timeStamp = new LinkedList<Lyrics3TimeStamp>();
  
  public Lyrics3Line(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public Lyrics3Line(Lyrics3Line paramLyrics3Line) {
    super(paramLyrics3Line);
    this.lyric = paramLyrics3Line.lyric;
    for (byte b = 0; b < paramLyrics3Line.timeStamp.size(); b++) {
      Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp(paramLyrics3Line.timeStamp.get(b));
      this.timeStamp.add(lyrics3TimeStamp);
    } 
  }
  
  public void addLyric(String paramString) {
    this.lyric = x41.n(new StringBuilder(), this.lyric, paramString);
  }
  
  public void addLyric(ID3v2LyricLine paramID3v2LyricLine) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.lyric);
    stringBuilder.append(paramID3v2LyricLine.getText());
    this.lyric = stringBuilder.toString();
  }
  
  public void addTimeStamp(Lyrics3TimeStamp paramLyrics3TimeStamp) {
    this.timeStamp.add(paramLyrics3TimeStamp);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Lyrics3Line))
      return false; 
    Lyrics3Line lyrics3Line = (Lyrics3Line)paramObject;
    return !this.lyric.equals(lyrics3Line.lyric) ? false : ((this.timeStamp.equals(lyrics3Line.timeStamp) && super.equals(paramObject)));
  }
  
  public String getLyric() {
    return this.lyric;
  }
  
  public int getSize() {
    Iterator<Lyrics3TimeStamp> iterator = this.timeStamp.iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += ((Lyrics3TimeStamp)iterator.next()).getSize());
    return this.lyric.length() + i;
  }
  
  public Iterator<Lyrics3TimeStamp> getTimeStamp() {
    return this.timeStamp.iterator();
  }
  
  public boolean hasTimeStamp() {
    return this.timeStamp.isEmpty() ^ true;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    readString(paramArrayOfbyte.toString(), paramInt);
  }
  
  public void readString(String paramString, int paramInt) {
    if (paramString != null) {
      if (paramInt >= 0 && paramInt < paramString.length()) {
        this.timeStamp = new LinkedList<Lyrics3TimeStamp>();
        for (int i = paramString.indexOf("[", paramInt); i >= 0; i = paramString.indexOf("[", paramInt)) {
          paramInt = paramString.indexOf("]", i) + 1;
          Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp");
          lyrics3TimeStamp.readString(paramString.substring(i, paramInt));
          this.timeStamp.add(lyrics3TimeStamp);
        } 
        this.lyric = paramString.substring(paramInt);
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to line is out of bounds: offset = ", ", line.length()");
      m60.g(paramString.length(), stringBuilder);
      return;
    } 
    k91.h("Image is null");
  }
  
  public void setLyric(String paramString) {
    this.lyric = paramString;
  }
  
  public void setLyric(ID3v2LyricLine paramID3v2LyricLine) {
    this.lyric = paramID3v2LyricLine.getText();
  }
  
  public void setTimeStamp(Lyrics3TimeStamp paramLyrics3TimeStamp) {
    this.timeStamp.clear();
    this.timeStamp.add(paramLyrics3TimeStamp);
  }
  
  public String toString() {
    Iterator<Lyrics3TimeStamp> iterator = this.timeStamp.iterator();
    String str = "";
    while (iterator.hasNext()) {
      Object object = iterator.next();
      StringBuilder stringBuilder = x41.p(str);
      stringBuilder.append(object.toString());
      str = stringBuilder.toString();
    } 
    return x41.n(x41.q("timeStamp = ", str, oXrNDUqUkE.QVrhqIeNSfWccBm), this.lyric, "\n");
  }
  
  public byte[] writeByteArray() {
    return writeString().getBytes(mk.b);
  }
  
  public String writeString() {
    Iterator<Lyrics3TimeStamp> iterator = this.timeStamp.iterator();
    String str = "";
    while (iterator.hasNext()) {
      Lyrics3TimeStamp lyrics3TimeStamp = iterator.next();
      StringBuilder stringBuilder1 = x41.p(str);
      stringBuilder1.append(lyrics3TimeStamp.writeString());
      str = stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = x41.p(str);
    stringBuilder.append(this.lyric);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\Lyrics3Line.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */