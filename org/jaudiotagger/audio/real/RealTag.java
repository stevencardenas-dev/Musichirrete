package org.jaudiotagger.audio.real;

import org.jaudiotagger.audio.generic.GenericTag;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagField;

public class RealTag extends GenericTag {
  public TagField createCompilationField(boolean paramBoolean) {
    return createField(FieldKey.IS_COMPILATION, new String[] { String.valueOf(paramBoolean) });
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("REAL ");
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\real\RealTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */