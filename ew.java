public final class ew {
  static {
    try {
      if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
        Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").<d70>asSubclass(d70.class).getConstructor(null);
        return;
      } 
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (Exception exception) {
      k91.m("Error instantiating FLAC extension", exception);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */