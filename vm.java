import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;

public final class vm implements TextWatcher {
  public final int b;
  
  public Object c;
  
  private final void a(Editable paramEditable) {}
  
  private final void b(Editable paramEditable) {}
  
  private final void c(Editable paramEditable) {}
  
  private final void d(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void e(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void f(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void g(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void h(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void j(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void k(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void l(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  public final void afterTextChanged(Editable paramEditable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 40, 0 -> 219, 1 -> 192, 2 -> 178, 3 -> 41, 4 -> 40
    //   40: return
    //   41: aload_1
    //   42: invokevirtual toString : ()Ljava/lang/String;
    //   45: invokevirtual trim : ()Ljava/lang/String;
    //   48: astore_1
    //   49: getstatic ag0.z : Ljava/util/regex/Pattern;
    //   52: aload_1
    //   53: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   56: invokevirtual find : ()Z
    //   59: ifeq -> 177
    //   62: aload_1
    //   63: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   66: astore_1
    //   67: aload_0
    //   68: getfield c : Ljava/lang/Object;
    //   71: checkcast android/widget/EditText
    //   74: astore #4
    //   76: aload #4
    //   78: ifnull -> 177
    //   81: aload #4
    //   83: invokevirtual getSelectionStart : ()I
    //   86: pop
    //   87: aload_0
    //   88: getfield c : Ljava/lang/Object;
    //   91: checkcast android/widget/EditText
    //   94: invokevirtual getSelectionEnd : ()I
    //   97: istore_3
    //   98: iconst_1
    //   99: aload_0
    //   100: getfield c : Ljava/lang/Object;
    //   103: checkcast android/widget/EditText
    //   106: invokevirtual getContext : ()Landroid/content/Context;
    //   109: ldc 2131886570
    //   111: invokevirtual getString : (I)Ljava/lang/String;
    //   114: iconst_1
    //   115: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   118: aload_0
    //   119: getfield c : Ljava/lang/Object;
    //   122: checkcast android/widget/EditText
    //   125: aload_0
    //   126: invokevirtual removeTextChangedListener : (Landroid/text/TextWatcher;)V
    //   129: aload_0
    //   130: getfield c : Ljava/lang/Object;
    //   133: checkcast android/widget/EditText
    //   136: aload_1
    //   137: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   140: aload_0
    //   141: getfield c : Ljava/lang/Object;
    //   144: checkcast android/widget/EditText
    //   147: aload_0
    //   148: invokevirtual addTextChangedListener : (Landroid/text/TextWatcher;)V
    //   151: iload_3
    //   152: istore_2
    //   153: iload_3
    //   154: aload_1
    //   155: invokevirtual length : ()I
    //   158: if_icmple -> 166
    //   161: aload_1
    //   162: invokevirtual length : ()I
    //   165: istore_2
    //   166: aload_0
    //   167: getfield c : Ljava/lang/Object;
    //   170: checkcast android/widget/EditText
    //   173: iload_2
    //   174: invokevirtual setSelection : (I)V
    //   177: return
    //   178: aload_0
    //   179: getfield c : Ljava/lang/Object;
    //   182: checkcast n40
    //   185: invokevirtual a : ()Lo40;
    //   188: invokevirtual a : ()V
    //   191: return
    //   192: aload_1
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokestatic parseInt : (Ljava/lang/String;)I
    //   199: bipush #59
    //   201: if_icmple -> 219
    //   204: aload_0
    //   205: getfield c : Ljava/lang/Object;
    //   208: checkcast jz
    //   211: getfield q : Landroid/widget/EditText;
    //   214: ldc '59'
    //   216: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   219: return
    //   220: astore_1
    //   221: goto -> 219
    // Exception table:
    //   from	to	target	type
    //   192	219	220	java/lang/NumberFormatException
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    switch (this.b) {
      default:
        return;
      case 2:
        ((n40)this.c).a().b();
        break;
      case 0:
      case 1:
        break;
    } 
  }
  
  public void i() {
    EditText editText = (EditText)this.c;
    if (editText != null) {
      editText.removeTextChangedListener(this);
      this.c = null;
    } 
  }
  
  public void m(EditText paramEditText) {
    this.c = paramEditText;
    paramEditText.addTextChangedListener(this);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    ms0 ms0;
    ss0 ss0;
    paramInt1 = this.b;
    boolean bool1 = false;
    boolean bool2 = false;
    switch (paramInt1) {
      default:
        ((SearchView)this.c).onTextChanged(paramCharSequence);
        return;
      case 4:
        paramInt1 = paramCharSequence.toString().length();
        ss0 = (ss0)this.c;
        ms0 = ss0.e;
        if (!ms0.k0) {
          bool1 = bool2;
          if (paramInt1 == 0)
            bool1 = true; 
          ss0.a(qy.b).setEnabled(bool1 ^ true);
        } 
        ss0.c(paramInt1, bool1);
        ms0.getClass();
      case 1:
      case 2:
      case 3:
        return;
      case 0:
        break;
    } 
    an an = (an)this.c;
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this("#");
      stringBuilder.append(ms0.toString());
      an.I0 = Color.parseColor(stringBuilder.toString());
    } catch (IllegalArgumentException illegalArgumentException) {
      an.I0 = -16777216;
    } 
    an.x0.setBackgroundColor(an.I0);
    if (an.z0.getVisibility() == 0) {
      paramInt1 = Color.alpha(an.I0);
      an.z0.setProgress(paramInt1);
      an.A0.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt1) }));
    } 
    if (an.z0.getVisibility() == 0) {
      paramInt1 = Color.alpha(an.I0);
      an.z0.setProgress(paramInt1);
    } 
    paramInt1 = Color.red(an.I0);
    an.B0.setProgress(paramInt1);
    paramInt1 = Color.green(an.I0);
    an.D0.setProgress(paramInt1);
    paramInt1 = Color.blue(an.I0);
    an.F0.setProgress(paramInt1);
    an.i.putBoolean("in_sub", false);
    an.S0(-1);
    an.P0(-1);
    an.M0();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */