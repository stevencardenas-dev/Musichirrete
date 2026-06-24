import android.text.Editable;
import android.text.TextWatcher;

public final class o71 implements TextWatcher {
  public final int b;
  
  public final p71 c;
  
  private final void a(Editable paramEditable) {}
  
  private final void b(Editable paramEditable) {}
  
  private final void c(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void d(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  public final void afterTextChanged(Editable paramEditable) {
    int i = this.b;
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.b;
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_2
    //   5: fconst_1
    //   6: fstore #6
    //   8: aload_0
    //   9: getfield c : Lp71;
    //   12: astore #8
    //   14: ldc 0.5
    //   16: fstore #7
    //   18: iload_2
    //   19: tableswitch default -> 36, 0 -> 142
    //   36: aload #8
    //   38: getfield F0 : Z
    //   41: ifeq -> 47
    //   44: goto -> 141
    //   47: fload #6
    //   49: fstore #5
    //   51: aload_1
    //   52: invokeinterface length : ()I
    //   57: ifle -> 121
    //   60: aload_1
    //   61: invokeinterface toString : ()Ljava/lang/String;
    //   66: invokestatic parseFloat : (Ljava/lang/String;)F
    //   69: fstore #5
    //   71: goto -> 93
    //   74: astore #9
    //   76: invokestatic getInstance : ()Ljava/text/NumberFormat;
    //   79: aload_1
    //   80: invokeinterface toString : ()Ljava/lang/String;
    //   85: invokevirtual parse : (Ljava/lang/String;)Ljava/lang/Number;
    //   88: invokevirtual floatValue : ()F
    //   91: fstore #5
    //   93: fload #5
    //   95: ldc 0.5
    //   97: fcmpg
    //   98: ifge -> 108
    //   101: fload #7
    //   103: fstore #5
    //   105: goto -> 108
    //   108: fload #5
    //   110: fconst_2
    //   111: fcmpl
    //   112: ifle -> 121
    //   115: fconst_2
    //   116: fstore #5
    //   118: goto -> 121
    //   121: aload #8
    //   123: getfield C0 : Landroid/widget/SeekBar;
    //   126: fload #5
    //   128: f2d
    //   129: ldc2_w 0.5
    //   132: dsub
    //   133: ldc2_w 20.0
    //   136: dmul
    //   137: d2i
    //   138: invokevirtual setProgress : (I)V
    //   141: return
    //   142: aload #8
    //   144: getfield F0 : Z
    //   147: ifeq -> 153
    //   150: goto -> 251
    //   153: fload #6
    //   155: fstore #5
    //   157: aload_1
    //   158: invokeinterface length : ()I
    //   163: ifle -> 234
    //   166: aload_1
    //   167: invokeinterface toString : ()Ljava/lang/String;
    //   172: invokestatic parseFloat : (Ljava/lang/String;)F
    //   175: fstore #5
    //   177: goto -> 199
    //   180: astore #9
    //   182: invokestatic getInstance : ()Ljava/text/NumberFormat;
    //   185: aload_1
    //   186: invokeinterface toString : ()Ljava/lang/String;
    //   191: invokevirtual parse : (Ljava/lang/String;)Ljava/lang/Number;
    //   194: invokevirtual floatValue : ()F
    //   197: fstore #5
    //   199: fload #5
    //   201: fstore #6
    //   203: fload #5
    //   205: ldc 0.5
    //   207: fcmpg
    //   208: ifge -> 215
    //   211: ldc 0.5
    //   213: fstore #6
    //   215: fload #6
    //   217: ldc 3.0
    //   219: fcmpl
    //   220: ifle -> 230
    //   223: ldc 3.0
    //   225: fstore #5
    //   227: goto -> 234
    //   230: fload #6
    //   232: fstore #5
    //   234: aload #8
    //   236: getfield B0 : Landroid/widget/SeekBar;
    //   239: fload #5
    //   241: ldc 0.5
    //   243: fsub
    //   244: ldc 20.0
    //   246: fmul
    //   247: f2i
    //   248: invokevirtual setProgress : (I)V
    //   251: return
    //   252: astore_1
    //   253: fload #6
    //   255: fstore #5
    //   257: goto -> 121
    //   260: astore_1
    //   261: fload #6
    //   263: fstore #5
    //   265: goto -> 234
    // Exception table:
    //   from	to	target	type
    //   60	71	74	java/lang/NumberFormatException
    //   60	71	252	finally
    //   76	93	252	finally
    //   166	177	180	java/lang/NumberFormatException
    //   166	177	260	finally
    //   182	199	260	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */