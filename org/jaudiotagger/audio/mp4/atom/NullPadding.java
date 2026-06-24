package org.jaudiotagger.audio.mp4.atom;

public class NullPadding extends Mp4BoxHeader {
  public NullPadding(long paramLong1, long paramLong2) {
    setFilePos(paramLong1);
    this.length = (int)(paramLong2 - paramLong1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\NullPadding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */