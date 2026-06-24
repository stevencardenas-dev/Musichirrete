import java.util.Enumeration;
import java.util.Stack;

public final class qw implements Enumeration {
  public Stack a;
  
  public final boolean hasMoreElements() {
    Stack<Enumeration> stack = this.a;
    return (!stack.empty() && ((Enumeration)stack.peek()).hasMoreElements());
  }
  
  public final Object nextElement() {
    Stack<Enumeration> stack = this.a;
    Enumeration<rw> enumeration = stack.peek();
    rw rw = enumeration.nextElement();
    Object object = rw.c;
    if (object == null) {
      object = new Object();
    } else {
      object = object.elements();
    } 
    if (!enumeration.hasMoreElements())
      stack.pop(); 
    if (object.hasMoreElements())
      stack.push(object); 
    return rw;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */