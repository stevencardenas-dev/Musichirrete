package org.jaudiotagger.tag.lyrics3;

import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractID3v2Frame;
import org.jaudiotagger.tag.id3.AbstractTagFrame;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyTextInfo;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodySYLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUSLT;
import uc1;

public class Lyrics3v2Field extends AbstractTagFrame {
  protected static Set<String> LYRICS_FRAME_IDS;
  
  static {
    HashSet<String> hashSet = new HashSet();
    hashSet.add("USLT");
    hashSet.add("SYLT");
    hashSet.add("COMM");
    hashSet.add("TCOM");
    hashSet.add("TALB");
    hashSet.add("TPE1");
    hashSet.add("TIT2");
    LYRICS_FRAME_IDS = Collections.unmodifiableSet(hashSet);
  }
  
  public Lyrics3v2Field() {}
  
  public Lyrics3v2Field(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public Lyrics3v2Field(AbstractID3v2Frame paramAbstractID3v2Frame) {
    AbstractFrameBodyTextInfo abstractFrameBodyTextInfo;
    FieldFrameBodyLYR fieldFrameBodyLYR;
    String str = paramAbstractID3v2Frame.getIdentifier();
    if (str.startsWith("USLT")) {
      fieldFrameBodyLYR = new FieldFrameBodyLYR("");
      this.frameBody = fieldFrameBodyLYR;
      fieldFrameBodyLYR.addLyric((FrameBodyUSLT)paramAbstractID3v2Frame.getBody());
      return;
    } 
    if (fieldFrameBodyLYR.startsWith("SYLT")) {
      fieldFrameBodyLYR = new FieldFrameBodyLYR("");
      this.frameBody = fieldFrameBodyLYR;
      fieldFrameBodyLYR.addLyric((FrameBodySYLT)paramAbstractID3v2Frame.getBody());
      return;
    } 
    if (fieldFrameBodyLYR.startsWith("COMM")) {
      this.frameBody = new FieldFrameBodyINF(((FrameBodyCOMM)paramAbstractID3v2Frame.getBody()).getText());
      return;
    } 
    if (fieldFrameBodyLYR.equals("TCOM")) {
      abstractFrameBodyTextInfo = (AbstractFrameBodyTextInfo)paramAbstractID3v2Frame.getBody();
      this.frameBody = new FieldFrameBodyAUT("");
      if (abstractFrameBodyTextInfo != null && abstractFrameBodyTextInfo.getText().length() > 0) {
        this.frameBody = new FieldFrameBodyAUT(abstractFrameBodyTextInfo.getText());
        return;
      } 
    } else if (fieldFrameBodyLYR.equals("TALB")) {
      abstractFrameBodyTextInfo = (AbstractFrameBodyTextInfo)abstractFrameBodyTextInfo.getBody();
      if (abstractFrameBodyTextInfo != null && abstractFrameBodyTextInfo.getText().length() > 0) {
        this.frameBody = new FieldFrameBodyEAL(abstractFrameBodyTextInfo.getText());
        return;
      } 
    } else if (fieldFrameBodyLYR.equals("TPE1")) {
      abstractFrameBodyTextInfo = (AbstractFrameBodyTextInfo)abstractFrameBodyTextInfo.getBody();
      if (abstractFrameBodyTextInfo != null && abstractFrameBodyTextInfo.getText().length() > 0) {
        this.frameBody = new FieldFrameBodyEAR(abstractFrameBodyTextInfo.getText());
        return;
      } 
    } else {
      if (fieldFrameBodyLYR.equals("TIT2")) {
        abstractFrameBodyTextInfo = (AbstractFrameBodyTextInfo)abstractFrameBodyTextInfo.getBody();
        if (abstractFrameBodyTextInfo != null && abstractFrameBodyTextInfo.getText().length() > 0)
          this.frameBody = new FieldFrameBodyETT(abstractFrameBodyTextInfo.getText()); 
        return;
      } 
      throw new TagException("Cannot createField Lyrics3v2 field from given ID3v2 frame");
    } 
  }
  
  public Lyrics3v2Field(AbstractLyrics3v2FieldFrameBody paramAbstractLyrics3v2FieldFrameBody) {
    this.frameBody = paramAbstractLyrics3v2FieldFrameBody;
  }
  
  public Lyrics3v2Field(Lyrics3v2Field paramLyrics3v2Field) {
    super(paramLyrics3v2Field);
  }
  
  public static boolean isLyrics3v2Field(AbstractID3v2Frame paramAbstractID3v2Frame) {
    String str = paramAbstractID3v2Frame.getIdentifier();
    return LYRICS_FRAME_IDS.contains(str);
  }
  
  private AbstractLyrics3v2FieldFrameBody readBody(String paramString, ByteBuffer paramByteBuffer) {
    return (AbstractLyrics3v2FieldFrameBody)(paramString.equals("AUT") ? new FieldFrameBodyAUT(paramByteBuffer) : (paramString.equals("EAL") ? new FieldFrameBodyEAL(paramByteBuffer) : (paramString.equals("EAR") ? new FieldFrameBodyEAR(paramByteBuffer) : (paramString.equals("ETT") ? new FieldFrameBodyETT(paramByteBuffer) : (paramString.equals("IMG") ? new FieldFrameBodyIMG(paramByteBuffer) : (paramString.equals(xveccWbRzqx.VIgNdTkWlBbfY) ? new FieldFrameBodyIND(paramByteBuffer) : (paramString.equals("INF") ? new FieldFrameBodyINF(paramByteBuffer) : (paramString.equals("LYR") ? new FieldFrameBodyLYR(paramByteBuffer) : new FieldFrameBodyUnsupported(paramByteBuffer)))))))));
  }
  
  public String getIdentifier() {
    AbstractTagFrameBody abstractTagFrameBody = this.frameBody;
    return (abstractTagFrameBody == null) ? "" : abstractTagFrameBody.getIdentifier();
  }
  
  public int getSize() {
    int i = this.frameBody.getSize();
    return getIdentifier().length() + i + 5;
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[6];
    do {
    
    } while (paramByteBuffer.get() == 0);
    paramByteBuffer.position(paramByteBuffer.position() - 1);
    paramByteBuffer.get(arrayOfByte, 0, 3);
    String str = new String(arrayOfByte, 0, 3);
    if (Lyrics3v2Fields.isLyrics3v2FieldIdentifier(str)) {
      this.frameBody = readBody(str, paramByteBuffer);
      return;
    } 
    throw new InvalidTagException(str.concat(" is not a valid ID3v2.4 frame"));
  }
  
  public String toString() {
    AbstractTagFrameBody abstractTagFrameBody = this.frameBody;
    return (abstractTagFrameBody == null) ? "" : abstractTagFrameBody.toString();
  }
  
  public void write(uc1 paramuc1) {
    if (this.frameBody.getSize() > 0 || TagOptionSingleton.getInstance().isLyrics3SaveEmptyField()) {
      byte[] arrayOfByte = new byte[3];
      String str = getIdentifier();
      for (byte b = 0; b < str.length(); b++)
        arrayOfByte[b] = (byte)str.charAt(b); 
      paramuc1.write(arrayOfByte, 0, str.length());
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\Lyrics3v2Field.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */