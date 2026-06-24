package org.jaudiotagger.tag.mp4;

import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.tag.reference.Tagger;

public enum Mp4NonStandardFieldKey {
  AAPR, ADCP, ALFN, AMIM, APTY;
  
  private static final Mp4NonStandardFieldKey[] $VALUES;
  
  private String description;
  
  private String fieldName;
  
  private Tagger tagger;
  
  static {
    Tagger tagger = Tagger.MEDIA_MONKEY;
    AAPR = new Mp4NonStandardFieldKey("AAPR", 0, "AApr", "MM3 Album Art Attributes", tagger);
    ALFN = new Mp4NonStandardFieldKey("ALFN", 1, "Alfn", CKYHNesT.hGseeY, tagger);
    AMIM = new Mp4NonStandardFieldKey("AMIM", 2, "AMIM", "MM3 Album Art MimeType", tagger);
    ADCP = new Mp4NonStandardFieldKey("ADCP", 3, "Adcp", "MM3 Album Art Description", tagger);
    APTY = new Mp4NonStandardFieldKey("APTY", 4, "Apty", "MM3 Album Art ID3 Picture Type", tagger);
    $VALUES = $values();
  }
  
  Mp4NonStandardFieldKey(String paramString1, String paramString2, Tagger paramTagger) {
    this.fieldName = paramString1;
    this.description = paramString2;
    this.tagger = paramTagger;
  }
  
  public Tagger geTagger() {
    return this.tagger;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public String getFieldName() {
    return this.fieldName;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\Mp4NonStandardFieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */