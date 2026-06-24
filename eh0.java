public final class eh0 extends IllegalArgumentException {
  public String b = super.getMessage();
  
  public eh0(iu paramiu, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3) {
    super(a(paramiu.b, paramInteger1, paramInteger2, paramInteger3, null));
  }
  
  public eh0(iu paramiu, Integer paramInteger, String paramString) {
    super(a(paramiu.b, paramInteger, null, null, paramString));
  }
  
  public eh0(iu paramiu, String paramString) {
    super(stringBuffer.toString());
  }
  
  public static String a(String paramString1, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder("Value ");
    stringBuilder.append(paramInteger1);
    stringBuilder.append(" for ");
    stringBuilder.append(paramString1);
    stringBuilder.append(' ');
    if (paramInteger2 == null) {
      if (paramInteger3 == null) {
        stringBuilder.append("is not supported");
      } else {
        stringBuilder.append("must not be larger than ");
        stringBuilder.append(paramInteger3);
      } 
    } else if (paramInteger3 == null) {
      stringBuilder.append("must not be smaller than ");
      stringBuilder.append(paramInteger2);
    } else {
      stringBuilder.append("must be in the range [");
      stringBuilder.append(paramInteger2);
      stringBuilder.append(',');
      stringBuilder.append(paramInteger3);
      stringBuilder.append(']');
    } 
    if (paramString2 != null) {
      stringBuilder.append(": ");
      stringBuilder.append(paramString2);
    } 
    return stringBuilder.toString();
  }
  
  public final String getMessage() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */