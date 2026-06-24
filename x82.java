import java.text.StringCharacterIterator;

public final class x82 extends h0 {
  public StringBuffer b;
  
  public static String g(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(paramString);
    for (char c = stringCharacterIterator.first(); c != Character.MAX_VALUE; c = stringCharacterIterator.next()) {
      if (c != '"') {
        if (c != '<') {
          if (c != '>') {
            if (c != '&') {
              if (c != '\'') {
                stringBuffer.append(c);
              } else {
                stringBuffer.append("&apos;");
              } 
            } else {
              stringBuffer.append("&amp;");
            } 
          } else {
            stringBuffer.append("&gt;");
          } 
        } else {
          stringBuffer.append("&lt;");
        } 
      } else {
        stringBuffer.append("&quot;");
      } 
    } 
    return stringBuffer.toString();
  }
  
  public static String h(String paramString) {
    return x41.w("<", paramString, ">");
  }
  
  public final void a(String paramString, int paramInt) {
    b(paramString, String.valueOf(paramInt));
  }
  
  public final void b(String paramString1, String paramString2) {
    StringBuffer stringBuffer1 = this.b;
    String str = g(paramString2);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(h(paramString1));
    StringBuffer stringBuffer2 = new StringBuffer();
    for (byte b = 0; b < str.length(); b++) {
      char c = str.charAt(b);
      if (Character.isLetterOrDigit(c) || Character.isSpaceChar(c)) {
        stringBuffer2.append(c);
      } else {
        stringBuffer2.append("&#x");
        stringBuffer2.append(Integer.toString(Character.codePointAt(str, b), 16));
      } 
    } 
    StringBuilder stringBuilder3 = new StringBuilder("<![CDATA[");
    stringBuilder3.append(stringBuffer2);
    stringBuilder3.append("]]>");
    stringBuilder1.append(stringBuilder3.toString());
    StringBuilder stringBuilder2 = new StringBuilder("</");
    stringBuilder2.append(paramString1);
    stringBuilder2.append(">");
    stringBuilder1.append(stringBuilder2.toString());
    stringBuffer1.append(stringBuilder1.toString());
  }
  
  public final void c(String paramString, boolean paramBoolean) {
    b(paramString, String.valueOf(paramBoolean));
  }
  
  public final void d(String paramString) {
    StringBuffer stringBuffer = this.b;
    StringBuilder stringBuilder = new StringBuilder("</");
    stringBuilder.append(paramString);
    stringBuilder.append(">");
    stringBuffer.append(stringBuilder.toString());
  }
  
  public final void f(String paramString1, String paramString2) {
    int i = paramString2.length();
    StringBuffer stringBuffer = this.b;
    if (i == 0) {
      stringBuffer.append(h(paramString1));
      return;
    } 
    paramString2 = g(paramString2);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(" id=\"");
    stringBuilder.append(paramString2);
    stringBuilder.append("\"");
    stringBuffer.append(h(stringBuilder.toString()));
  }
  
  public final String toString() {
    return this.b.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */