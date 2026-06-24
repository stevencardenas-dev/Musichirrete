package org.jaudiotagger.tag.lyrics3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lyrics3v1Iterator implements Iterator<String> {
  private int lastIndex = 0;
  
  private int removeIndex = 0;
  
  private Lyrics3v1 tag;
  
  public Lyrics3v1Iterator(Lyrics3v1 paramLyrics3v1) {
    this.tag = paramLyrics3v1;
  }
  
  public boolean hasNext() {
    return (this.tag.getLyric().indexOf('\n', this.lastIndex) >= 0 || this.lastIndex <= this.tag.getLyric().length());
  }
  
  public String next() {
    int j = this.tag.getLyric().indexOf('\n', this.lastIndex);
    int i = this.lastIndex;
    this.removeIndex = i;
    if (i >= 0) {
      String str;
      Lyrics3v1 lyrics3v1 = this.tag;
      if (j >= 0) {
        str = lyrics3v1.getLyric().substring(this.lastIndex, j);
      } else {
        str = str.getLyric().substring(this.lastIndex);
      } 
      this.lastIndex = j;
      return str;
    } 
    throw new NoSuchElementException("Iteration has no more elements.");
  }
  
  public void remove() {
    String str = this.tag.getLyric().substring(0, this.removeIndex).concat(this.tag.getLyric().substring(this.lastIndex));
    this.tag.setLyric(str);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\Lyrics3v1Iterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */