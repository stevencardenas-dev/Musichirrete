import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class co1 implements TextWatcher, SpanWatcher {
  public final Object b;
  
  public final AtomicInteger c = new AtomicInteger(0);
  
  public co1(Object paramObject) {
    this.b = paramObject;
  }
  
  public final void afterTextChanged(Editable paramEditable) {
    ((TextWatcher)this.b).afterTextChanged(paramEditable);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    ((TextWatcher)this.b).beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
  
  public final void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2) {
    this.c.get();
    ((SpanWatcher)this.b).onSpanAdded(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public final void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/concurrent/atomic/AtomicInteger;
    //   4: invokevirtual get : ()I
    //   7: pop
    //   8: iload_3
    //   9: istore #8
    //   11: getstatic android/os/Build$VERSION.SDK_INT : I
    //   14: bipush #28
    //   16: if_icmpge -> 51
    //   19: iload_3
    //   20: istore #7
    //   22: iload_3
    //   23: iload #4
    //   25: if_icmple -> 31
    //   28: iconst_0
    //   29: istore #7
    //   31: iload #7
    //   33: istore #8
    //   35: iload #5
    //   37: iload #6
    //   39: if_icmple -> 51
    //   42: iconst_0
    //   43: istore_3
    //   44: iload #7
    //   46: istore #8
    //   48: goto -> 54
    //   51: iload #5
    //   53: istore_3
    //   54: aload_0
    //   55: getfield b : Ljava/lang/Object;
    //   58: checkcast android/text/SpanWatcher
    //   61: aload_1
    //   62: aload_2
    //   63: iload #8
    //   65: iload #4
    //   67: iload_3
    //   68: iload #6
    //   70: invokeinterface onSpanChanged : (Landroid/text/Spannable;Ljava/lang/Object;IIII)V
    //   75: return
  }
  
  public final void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2) {
    this.c.get();
    ((SpanWatcher)this.b).onSpanRemoved(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    ((TextWatcher)this.b).onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\co1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */