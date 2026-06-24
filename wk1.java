import in.krosbits.musicolet.MediaBrowserServiceImpl;
import java.io.Serializable;
import java.util.Stack;

public final class wk1 implements Serializable {
  public Stack b;
  
  public int c;
  
  public boolean e = false;
  
  public boolean f = false;
  
  public wk1(Stack paramStack, int paramInt) {
    this.b = paramStack;
    this.c = paramInt;
  }
  
  public final void a() {
    this.e = true;
    try {
      MediaBrowserServiceImpl mediaBrowserServiceImpl = MediaBrowserServiceImpl.b;
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void b() {
    this.f = true;
    try {
      MediaBrowserServiceImpl mediaBrowserServiceImpl = MediaBrowserServiceImpl.b;
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */