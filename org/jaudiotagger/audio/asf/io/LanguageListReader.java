package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.data.LanguageList;
import org.jaudiotagger.audio.asf.util.Utils;

public class LanguageListReader implements ChunkReader {
  static final boolean $assertionsDisabled = false;
  
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_LANGUAGE_LIST };
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    int i = Utils.readUINT16(paramInputStream);
    LanguageList languageList = new LanguageList(paramLong, bigInteger);
    for (byte b = 0; b < i; b++)
      languageList.addLanguage(Utils.readFixedSizeUTF16Str(paramInputStream, paramInputStream.read() & 0xFF)); 
    return (Chunk)languageList;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\LanguageListReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */