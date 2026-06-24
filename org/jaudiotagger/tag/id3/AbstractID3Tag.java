package org.jaudiotagger.tag.id3;

import in.krosbits.utils.SgV.YbNJ;
import java.util.logging.Logger;

public abstract class AbstractID3Tag extends AbstractTag {
  protected static final String TAG_RELEASE = "ID3v";
  
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  private String loggingFilename = YbNJ.IfHzNWDAPCrTS;
  
  public AbstractID3Tag() {}
  
  public AbstractID3Tag(AbstractID3Tag paramAbstractID3Tag) {
    super(paramAbstractID3Tag);
  }
  
  public String getIdentifier() {
    StringBuilder stringBuilder = new StringBuilder("ID3v");
    stringBuilder.append(getRelease());
    stringBuilder.append(".");
    stringBuilder.append(getMajorVersion());
    stringBuilder.append(".");
    stringBuilder.append(getRevision());
    return stringBuilder.toString();
  }
  
  public String getLoggingFilename() {
    return this.loggingFilename;
  }
  
  public abstract byte getMajorVersion();
  
  public abstract byte getRelease();
  
  public abstract byte getRevision();
  
  public void setLoggingFilename(String paramString) {
    this.loggingFilename = paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractID3Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */