package org.jaudiotagger.audio.asf.data;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import l0;
import org.jaudiotagger.audio.asf.util.Utils;

public class LanguageList extends Chunk {
  private final List<String> languages = new ArrayList<String>();
  
  public LanguageList() {
    super(GUID.GUID_LANGUAGE_LIST, 0L, BigInteger.ZERO);
  }
  
  public LanguageList(long paramLong, BigInteger paramBigInteger) {
    super(GUID.GUID_LANGUAGE_LIST, paramLong, paramBigInteger);
  }
  
  public void addLanguage(String paramString) {
    if (paramString.length() < 127) {
      if (!this.languages.contains(paramString))
        this.languages.add(paramString); 
      return;
    } 
    int i = paramString.length();
    l0.l(MessageFormat.format(eRUgfgGAccgka.nVtmfgAKdSPUS, new Object[] { Integer.valueOf(i * 2 + 2) }));
  }
  
  public String getLanguage(int paramInt) {
    return this.languages.get(paramInt);
  }
  
  public int getLanguageCount() {
    return this.languages.size();
  }
  
  public List<String> getLanguages() {
    return new ArrayList<String>(this.languages);
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    for (byte b = 0; b < getLanguageCount(); b++) {
      stringBuilder.append(paramString);
      stringBuilder.append("  |-> ");
      stringBuilder.append(b);
      stringBuilder.append(" : ");
      stringBuilder.append(getLanguage(b));
      stringBuilder.append(Utils.LINE_SEPARATOR);
    } 
    return stringBuilder.toString();
  }
  
  public void removeLanguage(int paramInt) {
    this.languages.remove(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\LanguageList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */