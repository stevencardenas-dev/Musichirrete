package org.jaudiotagger.tag.mp4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.mp4.field.Mp4FieldType;

public abstract class Mp4TagField implements TagField {
  public static Logger logger;
  
  protected String id;
  
  protected Mp4BoxHeader parentHeader;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.tag.mp4");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public Mp4TagField(String paramString) {
    this.id = paramString;
  }
  
  public Mp4TagField(String paramString, ByteBuffer paramByteBuffer) {
    this(paramString);
    build(paramByteBuffer);
  }
  
  public Mp4TagField(ByteBuffer paramByteBuffer) {
    build(paramByteBuffer);
  }
  
  public Mp4TagField(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.parentHeader = paramMp4BoxHeader;
    build(paramByteBuffer);
  }
  
  public abstract void build(ByteBuffer paramByteBuffer);
  
  public abstract byte[] getDataBytes();
  
  public abstract Mp4FieldType getFieldType();
  
  public String getId() {
    return this.id;
  }
  
  public byte[] getIdBytes() {
    return getId().getBytes(mk.b);
  }
  
  public byte[] getRawContent() {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Getting Raw data for:");
    stringBuilder.append(getId());
    logger.fine(stringBuilder.toString());
    try {
      null = getRawContentDataOnly();
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      byteArrayOutputStream.write(Utils.getSizeBEInt32(null.length + 8));
      byteArrayOutputStream.write(getId().getBytes(mk.b));
      byteArrayOutputStream.write(null);
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public byte[] getRawContentDataOnly() {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Getting Raw data for:");
    stringBuilder.append(getId());
    logger.fine(stringBuilder.toString());
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      null = getDataBytes();
      byteArrayOutputStream.write(Utils.getSizeBEInt32(null.length + 16));
      byteArrayOutputStream.write("data".getBytes(mk.b));
      byteArrayOutputStream.write(new byte[] { 0 });
      byteArrayOutputStream.write(new byte[] { 0, 0, (byte)getFieldType().getFileClassId() });
      byteArrayOutputStream.write(new byte[] { 0, 0, 0, 0 });
      byteArrayOutputStream.write(null);
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public void isBinary(boolean paramBoolean) {}
  
  public boolean isCommon() {
    return (this.id.equals(Mp4FieldKey.ARTIST.getFieldName()) || this.id.equals(Mp4FieldKey.ALBUM.getFieldName()) || this.id.equals(Mp4FieldKey.TITLE.getFieldName()) || this.id.equals(Mp4FieldKey.TRACK.getFieldName()) || this.id.equals(Mp4FieldKey.DAY.getFieldName()) || this.id.equals(Mp4FieldKey.COMMENT.getFieldName()) || this.id.equals(Mp4FieldKey.GENRE.getFieldName()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\Mp4TagField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */