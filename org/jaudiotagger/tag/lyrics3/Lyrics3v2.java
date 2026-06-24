package org.jaudiotagger.tag.lyrics3;

import android.window.ldG.XUaAMlaMSa;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractID3v2Frame;
import org.jaudiotagger.tag.id3.AbstractTag;
import org.jaudiotagger.tag.id3.ID3v1Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;
import tp;
import uc1;
import x41;

public class Lyrics3v2 extends AbstractLyrics3 {
  private HashMap<String, Lyrics3v2Field> fieldMap = new HashMap<String, Lyrics3v2Field>();
  
  public Lyrics3v2() {}
  
  public Lyrics3v2(ByteBuffer paramByteBuffer) {
    try {
      read(paramByteBuffer);
      return;
    } catch (TagException tagException) {
      tagException.printStackTrace();
      return;
    } 
  }
  
  public Lyrics3v2(AbstractTag paramAbstractTag) {
    if (paramAbstractTag != null) {
      if (!(paramAbstractTag instanceof Lyrics3v2)) {
        Lyrics3v2Field lyrics3v2Field;
        if (paramAbstractTag instanceof Lyrics3v1) {
          lyrics3v2Field = new Lyrics3v2Field(new FieldFrameBodyLYR(((Lyrics3v1)paramAbstractTag).getLyric()));
          this.fieldMap.put(lyrics3v2Field.getIdentifier(), lyrics3v2Field);
          return;
        } 
        Iterator<List> iterator = (new ID3v24Tag((AbstractTag)lyrics3v2Field)).iterator();
        while (true) {
          if (iterator.hasNext()) {
            try {
              for (TagField tagField : iterator.next()) {
                if (tagField instanceof AbstractID3v2Frame) {
                  AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame)tagField;
                  if (Lyrics3v2Field.isLyrics3v2Field(abstractID3v2Frame)) {
                    Lyrics3v2Field lyrics3v2Field1 = new Lyrics3v2Field();
                    this(abstractID3v2Frame);
                    this.fieldMap.put(lyrics3v2Field1.getIdentifier(), lyrics3v2Field1);
                  } 
                } 
              } 
            } catch (TagException tagException) {}
            continue;
          } 
          return;
        } 
      } 
      tp.j("Copy Constructor not called. Please type cast the argument");
      throw null;
    } 
  }
  
  public Lyrics3v2(Lyrics3v2 paramLyrics3v2) {
    super(paramLyrics3v2);
    for (String str : paramLyrics3v2.fieldMap.keySet()) {
      Lyrics3v2Field lyrics3v2Field = new Lyrics3v2Field(paramLyrics3v2.fieldMap.get(str));
      this.fieldMap.put(str, lyrics3v2Field);
    } 
  }
  
  private int seekSize(ByteBuffer paramByteBuffer) {
    return -1;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Lyrics3v2))
      return false; 
    Lyrics3v2 lyrics3v2 = (Lyrics3v2)paramObject;
    return (this.fieldMap.equals(lyrics3v2.fieldMap) && super.equals(paramObject));
  }
  
  public Lyrics3v2Field getField(String paramString) {
    return this.fieldMap.get(paramString);
  }
  
  public int getFieldCount() {
    return this.fieldMap.size();
  }
  
  public String getIdentifier() {
    return eRUgfgGAccgka.XDGY;
  }
  
  public int getSize() {
    Iterator<Lyrics3v2Field> iterator = this.fieldMap.values().iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += ((Lyrics3v2Field)iterator.next()).getSize());
    return i + 11;
  }
  
  public boolean hasField(String paramString) {
    return this.fieldMap.containsKey(paramString);
  }
  
  public Iterator<Lyrics3v2Field> iterator() {
    return this.fieldMap.values().iterator();
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    if (seek(paramByteBuffer)) {
      int i = seekSize(paramByteBuffer);
      seek(paramByteBuffer);
      paramByteBuffer.position();
      this.fieldMap = new HashMap<String, Lyrics3v2Field>();
      while (true) {
        if (paramByteBuffer.position() < i - 11) {
          try {
            Lyrics3v2Field lyrics3v2Field = new Lyrics3v2Field();
            this(paramByteBuffer);
            setField(lyrics3v2Field);
          } catch (InvalidTagException invalidTagException) {}
          continue;
        } 
        return;
      } 
    } 
    throw new TagNotFoundException("Lyrics3v2.00 Tag Not Found");
  }
  
  public void removeField(String paramString) {
    this.fieldMap.remove(paramString);
  }
  
  public boolean seek(ByteBuffer paramByteBuffer) {
    return false;
  }
  
  public boolean seek(uc1 paramuc1) {
    long l;
    byte[] arrayOfByte = new byte[11];
    paramuc1.h(paramuc1.d() - 137L);
    paramuc1.read(arrayOfByte, 0, 9);
    String str1 = new String(arrayOfByte, 0, 9);
    String str2 = XUaAMlaMSa.QPTNollCT;
    if (str1.equals(str2)) {
      l = paramuc1.c();
    } else {
      paramuc1.h(paramuc1.d() - 9L);
      paramuc1.read(arrayOfByte, 0, 9);
      if ((new String(arrayOfByte, 0, 9)).equals(str2)) {
        l = paramuc1.c();
        l -= 15L;
        paramuc1.h(l);
        paramuc1.read(arrayOfByte, 0, 6);
        paramuc1.h(l - Integer.parseInt(new String(arrayOfByte, 0, 6)));
        paramuc1.read(arrayOfByte, 0, 11);
        return (new String(arrayOfByte, 0, 11)).equals("LYRICSBEGIN");
      } 
      return false;
    } 
    l -= 15L;
    paramuc1.h(l);
    paramuc1.read(arrayOfByte, 0, 6);
    paramuc1.h(l - Integer.parseInt(new String(arrayOfByte, 0, 6)));
    paramuc1.read(arrayOfByte, 0, 11);
    return (new String(arrayOfByte, 0, 11)).equals("LYRICSBEGIN");
  }
  
  public void setField(Lyrics3v2Field paramLyrics3v2Field) {
    this.fieldMap.put(paramLyrics3v2Field.getIdentifier(), paramLyrics3v2Field);
  }
  
  public String toString() {
    Iterator<Lyrics3v2Field> iterator = this.fieldMap.values().iterator();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getIdentifier());
    stringBuilder.append(" ");
    stringBuilder.append(getSize());
    stringBuilder.append("\n");
    String str = stringBuilder.toString();
    while (iterator.hasNext()) {
      Lyrics3v2Field lyrics3v2Field = iterator.next();
      StringBuilder stringBuilder1 = x41.p(str);
      stringBuilder1.append(lyrics3v2Field.toString());
      stringBuilder1.append("\n");
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  public void updateField(String paramString) {
    if (paramString.equals("IND")) {
      boolean bool;
      boolean bool1 = this.fieldMap.containsKey("LYR");
      if (bool1) {
        bool = ((FieldFrameBodyLYR)((Lyrics3v2Field)this.fieldMap.get("LYR")).getBody()).hasTimeStamp();
      } else {
        bool = false;
      } 
      setField(new Lyrics3v2Field(new FieldFrameBodyIND(bool1, bool)));
    } 
  }
  
  public void write(uc1 paramuc1) {
    byte[] arrayOfByte = new byte[15];
    new ID3v1Tag();
    delete(paramuc1);
    paramuc1.h(paramuc1.d());
    long l2 = paramuc1.c();
    byte b;
    for (b = 0; b < 11; b++)
      arrayOfByte[b] = (byte)"LYRICSBEGIN".charAt(b); 
    paramuc1.write(arrayOfByte, 0, 11);
    updateField("IND");
    ((Lyrics3v2Field)this.fieldMap.get("IND")).write(paramuc1);
    for (Lyrics3v2Field lyrics3v2Field : this.fieldMap.values()) {
      String str1 = lyrics3v2Field.getIdentifier();
      boolean bool = TagOptionSingleton.getInstance().getLyrics3SaveField(str1);
      if (!str1.equals("IND") && bool)
        lyrics3v2Field.write(paramuc1); 
    } 
    long l1 = paramuc1.c();
    getSize();
    String str = Long.toString(l1 - l2);
    for (b = 0; b < 6 - str.length(); b++)
      arrayOfByte[b] = 48; 
    int i = 6 - str.length();
    for (b = 0; b < str.length(); b++)
      arrayOfByte[b + i] = (byte)str.charAt(b); 
    i = str.length() + i;
    for (b = 0; b < 9; b++)
      arrayOfByte[b + i] = (byte)"LYRICS200".charAt(b); 
    paramuc1.write(arrayOfByte, 0, i + 9);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\Lyrics3v2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */