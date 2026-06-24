package org.jaudiotagger.tag.mp4.field;

import com.google.android.material.tabs.xm.VDgS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.logging.Logger;
import k91;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.Mp4TagField;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;
import org.jaudiotagger.tag.mp4.atom.Mp4MeanBox;
import org.jaudiotagger.tag.mp4.atom.Mp4NameBox;

public class Mp4TagReverseDnsField extends Mp4TagField implements TagTextField {
  public static final String IDENTIFIER = "----";
  
  protected String content;
  
  protected int dataSize;
  
  private String descriptor;
  
  private String issuer;
  
  public Mp4TagReverseDnsField(String paramString1, String paramString2, String paramString3, String paramString4) {
    super(paramString1);
    this.issuer = paramString2;
    this.descriptor = paramString3;
    this.content = paramString4;
  }
  
  public Mp4TagReverseDnsField(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    super(paramMp4BoxHeader, paramByteBuffer);
  }
  
  public Mp4TagReverseDnsField(Mp4FieldKey paramMp4FieldKey, String paramString) {
    super(paramMp4FieldKey.getFieldName());
    this.issuer = paramMp4FieldKey.getIssuer();
    this.descriptor = paramMp4FieldKey.getIdentifier();
    this.content = paramString;
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader2 = new Mp4BoxHeader(paramByteBuffer);
    setIssuer((new Mp4MeanBox(mp4BoxHeader2, paramByteBuffer)).getIssuer());
    int i = paramByteBuffer.position();
    paramByteBuffer.position(mp4BoxHeader2.getDataLength() + i);
    Mp4BoxHeader mp4BoxHeader1 = new Mp4BoxHeader(paramByteBuffer);
    setDescriptor((new Mp4NameBox(mp4BoxHeader1, paramByteBuffer)).getName());
    i = paramByteBuffer.position();
    paramByteBuffer.position(mp4BoxHeader1.getDataLength() + i);
    i = this.parentHeader.getDataLength();
    int j = mp4BoxHeader2.getLength();
    if (i == mp4BoxHeader1.getLength() + j) {
      stringBuilder = new StringBuilder("----:");
      stringBuilder.append(this.issuer);
      stringBuilder.append(":");
      stringBuilder.append(this.descriptor);
      this.id = stringBuilder.toString();
      setContent("");
      Mp4TagField.logger.warning(MessageFormat.format("Reverse dns field:{0} has no data", new Object[] { this.id }));
      return;
    } 
    mp4BoxHeader1 = new Mp4BoxHeader((ByteBuffer)stringBuilder);
    setContent((new Mp4DataBox(mp4BoxHeader1, (ByteBuffer)stringBuilder)).getContent());
    i = stringBuilder.position();
    stringBuilder.position(mp4BoxHeader1.getDataLength() + i);
    StringBuilder stringBuilder = new StringBuilder("----:");
    stringBuilder.append(this.issuer);
    stringBuilder.append(":");
    stringBuilder.append(this.descriptor);
    this.id = stringBuilder.toString();
  }
  
  public void copyContent(TagField paramTagField) {
    if (paramTagField instanceof Mp4TagReverseDnsField) {
      Mp4TagReverseDnsField mp4TagReverseDnsField = (Mp4TagReverseDnsField)paramTagField;
      this.issuer = mp4TagReverseDnsField.getIssuer();
      this.descriptor = mp4TagReverseDnsField.getDescriptor();
      this.content = mp4TagReverseDnsField.getContent();
    } 
  }
  
  public String getContent() {
    return this.content;
  }
  
  public byte[] getDataBytes() {
    return this.content.getBytes(getEncoding());
  }
  
  public String getDescriptor() {
    return this.descriptor;
  }
  
  public Charset getEncoding() {
    return mk.c;
  }
  
  public Mp4FieldType getFieldType() {
    return Mp4FieldType.TEXT;
  }
  
  public String getIssuer() {
    return this.issuer;
  }
  
  public byte[] getRawContent() {
    try {
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      this();
      byte[] arrayOfByte = this.issuer.getBytes(getEncoding());
      byteArrayOutputStream1.write(Utils.getSizeBEInt32(arrayOfByte.length + 12));
      String str = VDgS.toZUaNKvo;
      Charset charset = mk.b;
      byteArrayOutputStream1.write(str.getBytes(charset));
      byteArrayOutputStream1.write(new byte[] { 0, 0, 0, 0 });
      byteArrayOutputStream1.write(arrayOfByte);
      arrayOfByte = this.descriptor.getBytes(getEncoding());
      byteArrayOutputStream1.write(Utils.getSizeBEInt32(arrayOfByte.length + 12));
      byteArrayOutputStream1.write("name".getBytes(charset));
      byteArrayOutputStream1.write(new byte[] { 0, 0, 0, 0 });
      byteArrayOutputStream1.write(arrayOfByte);
      if (this.content.length() > 0)
        byteArrayOutputStream1.write(getRawContentDataOnly()); 
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      this();
      byteArrayOutputStream2.write(Utils.getSizeBEInt32(byteArrayOutputStream1.size() + 8));
      byteArrayOutputStream2.write("----".getBytes(charset));
      byteArrayOutputStream2.write(byteArrayOutputStream1.toByteArray());
      return byteArrayOutputStream2.toByteArray();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public byte[] getRawContentDataOnly() {
    Logger logger = Mp4TagField.logger;
    StringBuilder stringBuilder = new StringBuilder("Getting Raw data for:");
    stringBuilder.append(getId());
    logger.fine(stringBuilder.toString());
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      byte[] arrayOfByte = this.content.getBytes(getEncoding());
      byteArrayOutputStream.write(Utils.getSizeBEInt32(arrayOfByte.length + 16));
      byteArrayOutputStream.write("data".getBytes(mk.b));
      byteArrayOutputStream.write(new byte[] { 0 });
      byteArrayOutputStream.write(new byte[] { 0, 0, (byte)getFieldType().getFileClassId() });
      byteArrayOutputStream.write(new byte[] { 0, 0, 0, 0 });
      byteArrayOutputStream.write(arrayOfByte);
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public boolean isBinary() {
    return false;
  }
  
  public boolean isEmpty() {
    return "".equals(this.content.trim());
  }
  
  public void setContent(String paramString) {
    this.content = paramString;
  }
  
  public void setDescriptor(String paramString) {
    this.descriptor = paramString;
  }
  
  public void setEncoding(Charset paramCharset) {}
  
  public void setIssuer(String paramString) {
    this.issuer = paramString;
  }
  
  public String toString() {
    return this.content;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagReverseDnsField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */