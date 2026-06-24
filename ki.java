public class ki extends Thread {
  public boolean b = false;
  
  public final void a(boolean paramBoolean) {
    if (!this.b) {
      this.b = true;
      if (paramBoolean)
        try {
          return;
        } finally {
          Exception exception = null;
        }  
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */