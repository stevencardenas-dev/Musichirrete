public class vy1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported")));
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    Class clazz = (Class)paramObject;
    paramObject = new StringBuilder("Attempted to serialize java.lang.Class: ");
    paramObject.append(clazz.getName());
    paramObject.append(". Forgot to register a type adapter?\nSee ");
    paramObject.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
    throw new UnsupportedOperationException(paramObject.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */