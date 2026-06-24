package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jaudiotagger.audio.asf.util.Utils;

public class EncodingChunk extends Chunk {
  private final List<String> strings = new ArrayList<String>();
  
  public EncodingChunk(BigInteger paramBigInteger) {
    super(GUID.GUID_ENCODING, paramBigInteger);
  }
  
  public void addString(String paramString) {
    this.strings.add(paramString);
  }
  
  public Collection<String> getStrings() {
    return new ArrayList<String>(this.strings);
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    this.strings.iterator();
    for (String str : this.strings) {
      stringBuilder.append(paramString);
      stringBuilder.append("  | : ");
      stringBuilder.append(str);
      stringBuilder.append(Utils.LINE_SEPARATOR);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\EncodingChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */