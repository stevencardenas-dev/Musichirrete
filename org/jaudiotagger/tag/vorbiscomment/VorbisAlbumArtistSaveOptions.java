package org.jaudiotagger.tag.vorbiscomment;

public enum VorbisAlbumArtistSaveOptions {
  WRITE_ALBUMARTIST, WRITE_ALBUMARTIST_AND_DELETE_JRIVER_ALBUMARTIST, WRITE_BOTH, WRITE_JRIVER_ALBUMARTIST, WRITE_JRIVER_ALBUMARTIST_AND_DELETE_ALBUMARTIST;
  
  private static final VorbisAlbumArtistSaveOptions[] $VALUES;
  
  static {
    WRITE_BOTH = new VorbisAlbumArtistSaveOptions("WRITE_BOTH", 2);
    WRITE_ALBUMARTIST_AND_DELETE_JRIVER_ALBUMARTIST = new VorbisAlbumArtistSaveOptions("WRITE_ALBUMARTIST_AND_DELETE_JRIVER_ALBUMARTIST", 3);
    WRITE_JRIVER_ALBUMARTIST_AND_DELETE_ALBUMARTIST = new VorbisAlbumArtistSaveOptions("WRITE_JRIVER_ALBUMARTIST_AND_DELETE_ALBUMARTIST", 4);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisAlbumArtistSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */