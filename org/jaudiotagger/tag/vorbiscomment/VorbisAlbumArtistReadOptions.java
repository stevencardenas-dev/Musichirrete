package org.jaudiotagger.tag.vorbiscomment;

public enum VorbisAlbumArtistReadOptions {
  READ_ALBUMARTIST, READ_ALBUMARTIST_THEN_JRIVER, READ_JRIVER_ALBUMARTIST, READ_JRIVER_THEN_ALBUMARTIST;
  
  private static final VorbisAlbumArtistReadOptions[] $VALUES;
  
  static {
    READ_ALBUMARTIST_THEN_JRIVER = new VorbisAlbumArtistReadOptions("READ_ALBUMARTIST_THEN_JRIVER", 2);
    READ_JRIVER_THEN_ALBUMARTIST = new VorbisAlbumArtistReadOptions("READ_JRIVER_THEN_ALBUMARTIST", 3);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisAlbumArtistReadOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */