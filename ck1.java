import android.text.Editable;
import android.text.TextWatcher;

public final class ck1 implements TextWatcher {
  public final int b;
  
  public final dk1 c;
  
  private final void a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void b(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void c(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void d(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  public final void afterTextChanged(Editable paramEditable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield c : Ldk1;
    //   9: astore_3
    //   10: iload_2
    //   11: tableswitch default -> 28, 0 -> 57
    //   28: aload_3
    //   29: getfield D0 : Landroid/widget/EditText;
    //   32: astore_3
    //   33: aload_1
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: invokestatic parseInt : (Ljava/lang/String;)I
    //   40: bipush #59
    //   42: if_icmple -> 56
    //   45: aload_3
    //   46: ldc '59'
    //   48: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   51: aload_3
    //   52: iconst_2
    //   53: invokevirtual setSelection : (I)V
    //   56: return
    //   57: aload_3
    //   58: getfield C0 : Landroid/widget/EditText;
    //   61: astore_3
    //   62: aload_1
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokestatic parseInt : (Ljava/lang/String;)I
    //   69: bipush #59
    //   71: if_icmple -> 85
    //   74: aload_3
    //   75: ldc '59'
    //   77: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   80: aload_3
    //   81: iconst_2
    //   82: invokevirtual setSelection : (I)V
    //   85: return
    //   86: astore_1
    //   87: goto -> 56
    //   90: astore_1
    //   91: goto -> 85
    // Exception table:
    //   from	to	target	type
    //   33	56	86	java/lang/NumberFormatException
    //   62	85	90	java/lang/NumberFormatException
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.b;
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ck1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */