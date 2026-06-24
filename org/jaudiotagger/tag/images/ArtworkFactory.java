package org.jaudiotagger.tag.images;

import java.io.File;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;

public class ArtworkFactory {
  public static Artwork createArtworkFromFile(File paramFile) {
    return AndroidArtwork.createArtworkFromFile(paramFile);
  }
  
  public static Artwork createArtworkFromMetadataBlockDataPicture(MetadataBlockDataPicture paramMetadataBlockDataPicture) {
    return AndroidArtwork.createArtworkFromMetadataBlockDataPicture(paramMetadataBlockDataPicture);
  }
  
  public static Artwork createLinkedArtworkFromURL(String paramString) {
    return AndroidArtwork.createLinkedArtworkFromURL(paramString);
  }
  
  public static Artwork getNew() {
    return new AndroidArtwork();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\images\ArtworkFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */