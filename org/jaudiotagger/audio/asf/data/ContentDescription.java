package org.jaudiotagger.audio.asf.data;

import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.jaudiotagger.audio.asf.util.Utils;

public final class ContentDescription extends MetadataContainer {
  public static final Set<String> ALLOWED = new HashSet<String>(Arrays.asList(new String[] { "AUTHOR", "COPYRIGHT", "DESCRIPTION", "RATING", "TITLE" }));
  
  public static final String KEY_AUTHOR = "AUTHOR";
  
  public static final String KEY_COPYRIGHT = "COPYRIGHT";
  
  public static final String KEY_DESCRIPTION = "DESCRIPTION";
  
  public static final String KEY_RATING = "RATING";
  
  public static final String KEY_TITLE = "TITLE";
  
  public ContentDescription() {
    this(0L, BigInteger.ZERO);
  }
  
  public ContentDescription(long paramLong, BigInteger paramBigInteger) {
    super(ContainerType.CONTENT_DESCRIPTION, paramLong, paramBigInteger);
  }
  
  public String getAuthor() {
    return getValueFor("AUTHOR");
  }
  
  public String getComment() {
    return getValueFor("DESCRIPTION");
  }
  
  public String getCopyRight() {
    return getValueFor("COPYRIGHT");
  }
  
  public long getCurrentAsfChunkSize() {
    return (getAuthor().length() * 2) + 44L + (getComment().length() * 2) + (getRating().length() * 2) + (getTitle().length() * 2) + (getCopyRight().length() * 2);
  }
  
  public String getRating() {
    return getValueFor("RATING");
  }
  
  public String getTitle() {
    return getValueFor("TITLE");
  }
  
  public boolean isAddSupported(MetadataDescriptor paramMetadataDescriptor) {
    return (ALLOWED.contains(paramMetadataDescriptor.getName()) && super.isAddSupported(paramMetadataDescriptor));
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    stringBuilder.append(paramString);
    stringBuilder.append("  |->Title      : ");
    stringBuilder.append(getTitle());
    String str = Utils.LINE_SEPARATOR;
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |->Author     : ");
    stringBuilder.append(getAuthor());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |->Copyright  : ");
    stringBuilder.append(getCopyRight());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |->Description: ");
    stringBuilder.append(getComment());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |->Rating     :");
    stringBuilder.append(getRating());
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void setAuthor(String paramString) {
    setStringValue("AUTHOR", paramString);
  }
  
  public void setComment(String paramString) {
    setStringValue("DESCRIPTION", paramString);
  }
  
  public void setCopyright(String paramString) {
    setStringValue("COPYRIGHT", paramString);
  }
  
  public void setRating(String paramString) {
    setStringValue("RATING", paramString);
  }
  
  public void setTitle(String paramString) {
    setStringValue("TITLE", paramString);
  }
  
  public long writeInto(OutputStream paramOutputStream) {
    long l = getCurrentAsfChunkSize();
    paramOutputStream.write(getGuid().getBytes());
    Utils.writeUINT64(getCurrentAsfChunkSize(), paramOutputStream);
    Utils.writeUINT16(getTitle().length() * 2 + 2, paramOutputStream);
    Utils.writeUINT16(getAuthor().length() * 2 + 2, paramOutputStream);
    Utils.writeUINT16(getCopyRight().length() * 2 + 2, paramOutputStream);
    Utils.writeUINT16(getComment().length() * 2 + 2, paramOutputStream);
    Utils.writeUINT16(getRating().length() * 2 + 2, paramOutputStream);
    String str = getTitle();
    Charset charset = AsfHeader.ASF_CHARSET;
    paramOutputStream.write(Utils.getBytes(str, charset));
    byte[] arrayOfByte = AsfHeader.ZERO_TERM;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(Utils.getBytes(getAuthor(), charset));
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(Utils.getBytes(getCopyRight(), charset));
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(Utils.getBytes(getComment(), charset));
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(Utils.getBytes(getRating(), charset));
    paramOutputStream.write(arrayOfByte);
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\ContentDescription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */