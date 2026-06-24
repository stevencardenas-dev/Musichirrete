import dalvik.system.PathClassLoader;

public final class dj2 extends PathClassLoader {
  public final Class loadClass(String paramString, boolean paramBoolean) {
    if (!paramString.startsWith("java.") && !paramString.startsWith("android."))
      try {
        return findClass(paramString);
      } catch (ClassNotFoundException classNotFoundException) {} 
    return super.loadClass(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */