package org.jaudiotagger.tag.images;

import java.io.File;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;

public interface Artwork {
  byte[] getBinaryData();
  
  String getDescription();
  
  int getHeight();
  
  Object getImage();
  
  String getImageUrl();
  
  String getMimeType();
  
  int getPictureType();
  
  int getWidth();
  
  boolean isLinked();
  
  void setBinaryData(byte[] paramArrayOfbyte);
  
  void setDescription(String paramString);
  
  void setFromFile(File paramFile);
  
  void setFromMetadataBlockDataPicture(MetadataBlockDataPicture paramMetadataBlockDataPicture);
  
  void setHeight(int paramInt);
  
  boolean setImageFromData();
  
  void setImageUrl(String paramString);
  
  void setLinked(boolean paramBoolean);
  
  void setMimeType(String paramString);
  
  void setPictureType(int paramInt);
  
  void setWidth(int paramInt);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\images\Artwork.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */