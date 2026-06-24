package org.jaudiotagger.tag.reference;

import ga1;

public class PerformerHelper {
  public static String formatForId3(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString2.toLowerCase());
    stringBuilder.append(false);
    stringBuilder.append(paramString1);
    return stringBuilder.toString();
  }
  
  public static String formatForNonId3(String paramString1, String paramString2) {
    StringBuilder stringBuilder = ga1.l(paramString1, " (");
    stringBuilder.append(paramString2.toLowerCase());
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\PerformerHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */