package org.jaudiotagger.tag.id3;

import android.window.ldG.XUaAMlaMSa;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ID3v1Iterator implements Iterator<Object> {
  private static final int ALBUM = 3;
  
  private static final int ARTIST = 2;
  
  private static final int COMMENT = 4;
  
  private static final int GENRE = 6;
  
  private static final int TITLE = 1;
  
  private static final int TRACK = 7;
  
  private static final int YEAR = 5;
  
  private ID3v1Tag id3v1tag;
  
  private int lastIndex = 0;
  
  public ID3v1Iterator(ID3v1Tag paramID3v1Tag) {
    this.id3v1tag = paramID3v1Tag;
  }
  
  private boolean hasNext(int paramInt) {
    ID3v1Tag iD3v1Tag;
    switch (paramInt) {
      default:
        return false;
      case 7:
        iD3v1Tag = this.id3v1tag;
        if (iD3v1Tag instanceof ID3v11Tag)
          return (((ID3v11Tag)iD3v1Tag).track >= 0 || hasNext(paramInt + 1)); 
      case 6:
        return (this.id3v1tag.genre >= 0 || hasNext(paramInt + 1));
      case 5:
        return (this.id3v1tag.year.length() > 0 || hasNext(paramInt + 1));
      case 4:
        return (this.id3v1tag.comment.length() > 0 || hasNext(paramInt + 1));
      case 3:
        return (this.id3v1tag.album.length() > 0 || hasNext(paramInt + 1));
      case 2:
        return (this.id3v1tag.artist.length() > 0 || hasNext(paramInt + 1));
      case 1:
        break;
    } 
    return (this.id3v1tag.title.length() > 0 || hasNext(paramInt + 1));
  }
  
  private Object next(int paramInt) {
    byte b;
    ID3v1Tag iD3v1Tag;
    switch (this.lastIndex) {
      default:
        throw new NoSuchElementException("Iteration has no more elements.");
      case 6:
        iD3v1Tag = this.id3v1tag;
        return (iD3v1Tag instanceof ID3v11Tag && ((ID3v11Tag)iD3v1Tag).track >= 0) ? Byte.valueOf(((ID3v11Tag)iD3v1Tag).track) : null;
      case 5:
        b = this.id3v1tag.genre;
        return (b >= 0) ? Byte.valueOf(b) : next(paramInt + 1);
      case 4:
        return (this.id3v1tag.year.length() > 0) ? this.id3v1tag.year : next(paramInt + 1);
      case 3:
        return (this.id3v1tag.comment.length() > 0) ? this.id3v1tag.comment : next(paramInt + 1);
      case 2:
        return (this.id3v1tag.album.length() > 0) ? this.id3v1tag.album : next(paramInt + 1);
      case 1:
        return (this.id3v1tag.artist.length() > 0) ? this.id3v1tag.artist : next(paramInt + 1);
      case 0:
        break;
    } 
    return (this.id3v1tag.title.length() > 0) ? this.id3v1tag.title : next(paramInt + 1);
  }
  
  public boolean hasNext() {
    return hasNext(this.lastIndex);
  }
  
  public Object next() {
    return next(this.lastIndex);
  }
  
  public void remove() {
    int i = this.lastIndex;
    String str = XUaAMlaMSa.jsXKbY;
    switch (i) {
      default:
        return;
      case 1:
        this.id3v1tag.title = str;
      case 2:
        this.id3v1tag.artist = str;
      case 3:
        this.id3v1tag.album = str;
      case 4:
        this.id3v1tag.comment = str;
      case 5:
        this.id3v1tag.year = str;
      case 6:
        this.id3v1tag.genre = -1;
        break;
      case 7:
        break;
    } 
    ID3v1Tag iD3v1Tag = this.id3v1tag;
    if (iD3v1Tag instanceof ID3v11Tag)
      ((ID3v11Tag)iD3v1Tag).track = -1; 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v1Iterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */