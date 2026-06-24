package org.jaudiotagger.tag.images;

import java.io.File;
import java.io.RandomAccessFile;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;
import org.jaudiotagger.tag.id3.valuepair.ImageFormats;
import org.jaudiotagger.tag.reference.PictureTypes;

public class AndroidArtwork implements Artwork {
  private byte[] binaryData;
  
  private String description = "";
  
  private int height;
  
  private String imageUrl = "";
  
  private boolean isLinked = false;
  
  private String mimeType = "";
  
  private int pictureType = -1;
  
  private int width;
  
  public static AndroidArtwork createArtworkFromFile(File paramFile) {
    AndroidArtwork androidArtwork = new AndroidArtwork();
    androidArtwork.setFromFile(paramFile);
    return androidArtwork;
  }
  
  public static AndroidArtwork createArtworkFromMetadataBlockDataPicture(MetadataBlockDataPicture paramMetadataBlockDataPicture) {
    AndroidArtwork androidArtwork = new AndroidArtwork();
    androidArtwork.setFromMetadataBlockDataPicture(paramMetadataBlockDataPicture);
    return androidArtwork;
  }
  
  public static AndroidArtwork createLinkedArtworkFromURL(String paramString) {
    AndroidArtwork androidArtwork = new AndroidArtwork();
    androidArtwork.setLinkedFromURL(paramString);
    return androidArtwork;
  }
  
  public byte[] getBinaryData() {
    return this.binaryData;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public Object getImage() {
    throw new UnsupportedOperationException();
  }
  
  public String getImageUrl() {
    return this.imageUrl;
  }
  
  public String getMimeType() {
    return this.mimeType;
  }
  
  public int getPictureType() {
    return this.pictureType;
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public boolean isLinked() {
    return this.isLinked;
  }
  
  public void setBinaryData(byte[] paramArrayOfbyte) {
    this.binaryData = paramArrayOfbyte;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public void setFromFile(File paramFile) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "r");
    byte[] arrayOfByte = new byte[(int)randomAccessFile.length()];
    randomAccessFile.read(arrayOfByte);
    randomAccessFile.close();
    setBinaryData(arrayOfByte);
    setMimeType(ImageFormats.getMimeTypeForBinarySignature(arrayOfByte));
    setDescription("");
    setPictureType(PictureTypes.DEFAULT_ID.intValue());
  }
  
  public void setFromMetadataBlockDataPicture(MetadataBlockDataPicture paramMetadataBlockDataPicture) {
    setMimeType(paramMetadataBlockDataPicture.getMimeType());
    setDescription(paramMetadataBlockDataPicture.getDescription());
    setPictureType(paramMetadataBlockDataPicture.getPictureType());
    if (paramMetadataBlockDataPicture.isImageUrl()) {
      setLinked(paramMetadataBlockDataPicture.isImageUrl());
      setImageUrl(paramMetadataBlockDataPicture.getImageUrl());
    } else {
      setBinaryData(paramMetadataBlockDataPicture.getImageData());
    } 
    setWidth(paramMetadataBlockDataPicture.getWidth());
    setHeight(paramMetadataBlockDataPicture.getHeight());
  }
  
  public void setHeight(int paramInt) {
    this.height = paramInt;
  }
  
  public boolean setImageFromData() {
    return true;
  }
  
  public void setImageUrl(String paramString) {
    this.imageUrl = paramString;
  }
  
  public void setLinked(boolean paramBoolean) {
    this.isLinked = paramBoolean;
  }
  
  public void setLinkedFromURL(String paramString) {
    setLinked(true);
    setImageUrl(paramString);
  }
  
  public void setMimeType(String paramString) {
    this.mimeType = paramString;
  }
  
  public void setPictureType(int paramInt) {
    this.pictureType = paramInt;
  }
  
  public void setWidth(int paramInt) {
    this.width = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\images\AndroidArtwork.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */