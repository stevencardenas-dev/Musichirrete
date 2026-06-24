import java.io.Serializable;
import java.util.Vector;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;

public final class rw implements Cloneable, Serializable {
  public rw b = null;
  
  public Vector c;
  
  public final transient Object e;
  
  public final boolean f = true;
  
  public rw(Mp4BoxHeader paramMp4BoxHeader) {
    this.e = paramMp4BoxHeader;
  }
  
  public final void a(rw paramrw) {
    rw rw1 = paramrw.b;
    Vector vector = this.c;
    int i = 0;
    byte b = 0;
    if (rw1 == this) {
      if (vector == null) {
        i = b;
      } else {
        i = vector.size();
      } 
      b(paramrw, i - 1);
      return;
    } 
    if (vector != null)
      i = vector.size(); 
    b(paramrw, i);
  }
  
  public final void b(rw paramrw, int paramInt) {
    if (this.f) {
      rw rw1 = this;
      while (rw1 != paramrw) {
        rw rw2 = rw1.b;
        rw1 = rw2;
        if (rw2 == null) {
          rw1 = paramrw.b;
          if (rw1 != null)
            if (rw1.c(paramrw)) {
              int i;
              if (!rw1.c(paramrw)) {
                i = -1;
              } else {
                i = rw1.c.indexOf(paramrw);
              } 
              Vector<rw> vector = rw1.c;
              if (vector != null) {
                rw rw3 = vector.elementAt(i);
                rw1.c.removeElementAt(i);
                rw3.b = null;
              } else {
                throw new ArrayIndexOutOfBoundsException("node has no children");
              } 
            } else {
              l0.l("argument is not a child");
              return;
            }  
          paramrw.b = this;
          if (this.c == null)
            this.c = new Vector(); 
          this.c.insertElementAt(paramrw, paramInt);
          return;
        } 
      } 
      l0.l("new child is an ancestor");
      return;
    } 
    tp.f("node does not allow children");
  }
  
  public final boolean c(rw paramrw) {
    int i;
    Vector vector = this.c;
    if (vector == null) {
      i = 0;
    } else {
      i = vector.size();
    } 
    return (i != 0 && paramrw.b == this);
  }
  
  public final Object clone() {
    try {
      rw rw1 = (rw)super.clone();
      rw1.c = null;
      rw1.b = null;
      return rw1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new Error(cloneNotSupportedException.toString());
    } 
  }
  
  public final String toString() {
    Object object = this.e;
    return (object == null) ? null : object.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */