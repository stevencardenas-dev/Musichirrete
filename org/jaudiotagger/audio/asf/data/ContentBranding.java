package org.jaudiotagger.audio.asf.data;

import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import mk;
import org.jaudiotagger.audio.asf.util.Utils;

public final class ContentBranding extends MetadataContainer {
  static final boolean $assertionsDisabled = false;
  
  public static final Set<String> ALLOWED;
  
  public static final String KEY_BANNER_IMAGE = "BANNER_IMAGE";
  
  public static final String KEY_BANNER_TYPE = "BANNER_IMAGE_TYPE";
  
  public static final String KEY_BANNER_URL = "BANNER_IMAGE_URL";
  
  public static final String KEY_COPYRIGHT_URL = "COPYRIGHT_URL";
  
  static {
    HashSet<String> hashSet = new HashSet();
    ALLOWED = hashSet;
    hashSet.add("BANNER_IMAGE");
    hashSet.add("BANNER_IMAGE_TYPE");
    hashSet.add("BANNER_IMAGE_URL");
    hashSet.add("COPYRIGHT_URL");
  }
  
  public ContentBranding() {
    this(0L, BigInteger.ZERO);
  }
  
  public ContentBranding(long paramLong, BigInteger paramBigInteger) {
    super(ContainerType.CONTENT_BRANDING, paramLong, paramBigInteger);
  }
  
  public String getBannerImageURL() {
    return getValueFor("BANNER_IMAGE_URL");
  }
  
  public String getCopyRightURL() {
    return getValueFor("COPYRIGHT_URL");
  }
  
  public long getCurrentAsfChunkSize() {
    return assertDescriptor("BANNER_IMAGE", 1).getRawDataSize() + 40L + getBannerImageURL().length() + getCopyRightURL().length();
  }
  
  public byte[] getImageData() {
    return assertDescriptor("BANNER_IMAGE", 1).getRawData();
  }
  
  public long getImageType() {
    if (!hasDescriptor("BANNER_IMAGE_TYPE")) {
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(ContainerType.CONTENT_BRANDING, "BANNER_IMAGE_TYPE", 3);
      metadataDescriptor.setDWordValue(0L);
      addDescriptor(metadataDescriptor);
    } 
    return assertDescriptor("BANNER_IMAGE_TYPE").getNumber();
  }
  
  public boolean isAddSupported(MetadataDescriptor paramMetadataDescriptor) {
    return (ALLOWED.contains(paramMetadataDescriptor.getName()) && super.isAddSupported(paramMetadataDescriptor));
  }
  
  public void setBannerImageURL(String paramString) {
    if (Utils.isBlank(paramString)) {
      removeDescriptorsByName("BANNER_IMAGE_URL");
      return;
    } 
    assertDescriptor("BANNER_IMAGE_URL").setStringValue(paramString);
  }
  
  public void setCopyRightURL(String paramString) {
    if (Utils.isBlank(paramString)) {
      removeDescriptorsByName("COPYRIGHT_URL");
      return;
    } 
    assertDescriptor("COPYRIGHT_URL").setStringValue(paramString);
  }
  
  public void setImage(long paramLong, byte[] paramArrayOfbyte) {
    assertDescriptor("BANNER_IMAGE_TYPE", 3).setDWordValue(paramLong);
    assertDescriptor("BANNER_IMAGE", 1).setBinaryValue(paramArrayOfbyte);
  }
  
  public long writeInto(OutputStream paramOutputStream) {
    long l = getCurrentAsfChunkSize();
    paramOutputStream.write(getGuid().getBytes());
    Utils.writeUINT64(l, paramOutputStream);
    Utils.writeUINT32(getImageType(), paramOutputStream);
    byte[] arrayOfByte = getImageData();
    Utils.writeUINT32(arrayOfByte.length, paramOutputStream);
    paramOutputStream.write(arrayOfByte);
    Utils.writeUINT32(getBannerImageURL().length(), paramOutputStream);
    String str = getBannerImageURL();
    Charset charset = mk.a;
    paramOutputStream.write(str.getBytes(charset));
    Utils.writeUINT32(getCopyRightURL().length(), paramOutputStream);
    paramOutputStream.write(getCopyRightURL().getBytes(charset));
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\ContentBranding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */