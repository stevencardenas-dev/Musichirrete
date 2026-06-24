package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.ContentBranding;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class ContentBrandingReader implements ChunkReader {
  static final boolean $assertionsDisabled = false;
  
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_CONTENT_BRANDING };
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    long l = Utils.readUINT32(paramInputStream);
    byte[] arrayOfByte = Utils.readBinary(paramInputStream, Utils.readUINT32(paramInputStream));
    String str2 = new String(Utils.readBinary(paramInputStream, Utils.readUINT32(paramInputStream)));
    String str1 = new String(Utils.readBinary(paramInputStream, Utils.readUINT32(paramInputStream)));
    ContentBranding contentBranding = new ContentBranding(paramLong, bigInteger);
    contentBranding.setImage(l, arrayOfByte);
    contentBranding.setCopyRightURL(str2);
    contentBranding.setBannerImageURL(str1);
    return (Chunk)contentBranding;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ContentBrandingReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */