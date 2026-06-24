import android.util.Log;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Objects;

public final class pp0 extends Writer {
  public final int b;
  
  public final Object c = "FragmentManager";
  
  public final CharSequence e = new StringBuilder(128);
  
  public pp0() {}
  
  public pp0(Appendable paramAppendable) {}
  
  public void a() {
    StringBuilder stringBuilder = (StringBuilder)this.e;
    if (stringBuilder.length() > 0) {
      Log.d((String)this.c, stringBuilder.toString());
      stringBuilder.delete(0, stringBuilder.length());
    } 
  }
  
  public Writer append(CharSequence paramCharSequence) {
    switch (this.b) {
      default:
        return super.append(paramCharSequence);
      case 1:
        break;
    } 
    ((Appendable)this.c).append(paramCharSequence);
    return this;
  }
  
  public Writer append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    switch (this.b) {
      default:
        return super.append(paramCharSequence, paramInt1, paramInt2);
      case 1:
        break;
    } 
    ((Appendable)this.c).append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public Appendable append(CharSequence paramCharSequence) {
    switch (this.b) {
      default:
        return super.append(paramCharSequence);
      case 1:
        break;
    } 
    ((Appendable)this.c).append(paramCharSequence);
    return this;
  }
  
  public Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    switch (this.b) {
      default:
        return super.append(paramCharSequence, paramInt1, paramInt2);
      case 1:
        break;
    } 
    ((Appendable)this.c).append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final void close() {
    Appendable appendable;
    switch (this.b) {
      default:
        appendable = (Appendable)this.c;
        if (appendable instanceof Closeable)
          ((Closeable)appendable).close(); 
        return;
      case 0:
        break;
    } 
    a();
  }
  
  public final void flush() {
    Appendable appendable;
    switch (this.b) {
      default:
        appendable = (Appendable)this.c;
        if (appendable instanceof Flushable)
          ((Flushable)appendable).flush(); 
        return;
      case 0:
        break;
    } 
    a();
  }
  
  public void write(int paramInt) {
    switch (this.b) {
      default:
        super.write(paramInt);
        return;
      case 1:
        break;
    } 
    ((Appendable)this.c).append((char)paramInt);
  }
  
  public void write(String paramString, int paramInt1, int paramInt2) {
    switch (this.b) {
      default:
        super.write(paramString, paramInt1, paramInt2);
        return;
      case 1:
        break;
    } 
    Objects.requireNonNull(paramString);
    ((Appendable)this.c).append(paramString, paramInt1, paramInt2 + paramInt1);
  }
  
  public final void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = this.b;
    CharSequence charSequence = this.e;
    switch (i) {
      default:
        charSequence = charSequence;
        ((eq1)charSequence).b = paramArrayOfchar;
        ((eq1)charSequence).c = null;
        ((Appendable)this.c).append(charSequence, paramInt1, paramInt2 + paramInt1);
        return;
      case 0:
        break;
    } 
    for (i = 0; i < paramInt2; i++) {
      char c = paramArrayOfchar[paramInt1 + i];
      if (c == '\n') {
        a();
      } else {
        ((StringBuilder)charSequence).append(c);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */