import android.view.View;
import android.view.ViewGroup;

public final class k21 extends he1 implements View.OnClickListener {
  public final View A;
  
  public final View B;
  
  public final View C;
  
  public final View D;
  
  public final View E;
  
  public final View F;
  
  public final l21 G;
  
  public final ViewGroup w;
  
  public final View x;
  
  public final View y;
  
  public final View z;
  
  public k21(l21 paraml21, View paramView, int paramInt) {
    super(paramView);
    paramView.setOnClickListener(this);
    this.w = (ViewGroup)paramView.findViewById(2131297384);
    this.x = paramView.findViewById(2131296799);
    this.y = paramView.findViewById(2131296807);
    this.z = paramView.findViewById(2131296804);
    this.A = paramView.findViewById(2131296808);
    this.B = paramView.findViewById(2131296803);
    this.C = paramView.findViewById(2131296800);
    this.D = paramView.findViewById(2131296802);
    this.E = paramView.findViewById(2131296810);
    this.F = paramView.findViewById(2131296796);
    View view = paramView.findViewById(2131296798);
    if (paraml21.h) {
      view.setVisibility(0);
    } else {
      view.setVisibility(8);
    } 
    if (paramInt == 1) {
      paramView.setBackground(m92.z(paramView.getContext(), 2130969903));
      return;
    } 
    if (paramInt == 2)
      paramView.setAlpha(0.35F); 
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()I
    //   4: istore_3
    //   5: iload_3
    //   6: iflt -> 421
    //   9: aload_0
    //   10: getfield G : Ll21;
    //   13: astore #9
    //   15: aload #9
    //   17: getfield b : I
    //   20: istore_2
    //   21: aload #9
    //   23: getfield c : I
    //   26: istore #5
    //   28: aload #9
    //   30: getfield l : [I
    //   33: iload_3
    //   34: iaload
    //   35: istore_3
    //   36: iload_3
    //   37: invokestatic a : (I)I
    //   40: istore #6
    //   42: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   45: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   48: ldc 2131887000
    //   50: invokevirtual getString : (I)Ljava/lang/String;
    //   53: astore_1
    //   54: aload #9
    //   56: getfield f : Z
    //   59: istore #7
    //   61: iload #7
    //   63: ifeq -> 72
    //   66: iload #6
    //   68: iload_2
    //   69: if_icmple -> 84
    //   72: iload #7
    //   74: ifne -> 120
    //   77: iload #6
    //   79: iload #5
    //   81: if_icmpgt -> 120
    //   84: invokestatic o : ()Landroid/content/SharedPreferences;
    //   87: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   92: aload #9
    //   94: getfield i : Ljava/lang/String;
    //   97: iload_3
    //   98: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   103: invokeinterface apply : ()V
    //   108: invokestatic O0 : ()V
    //   111: aload #9
    //   113: getfield j : Lss0;
    //   116: invokevirtual dismiss : ()V
    //   119: return
    //   120: aload #9
    //   122: getfield h : Z
    //   125: istore #8
    //   127: iconst_0
    //   128: istore #4
    //   130: iload #8
    //   132: ifeq -> 164
    //   135: iload #6
    //   137: iconst_1
    //   138: isub
    //   139: istore_3
    //   140: iload #7
    //   142: ifeq -> 153
    //   145: iload_3
    //   146: iload_2
    //   147: if_icmpgt -> 164
    //   150: goto -> 159
    //   153: iload_3
    //   154: iload #5
    //   156: if_icmpgt -> 164
    //   159: iconst_1
    //   160: istore_2
    //   161: goto -> 166
    //   164: iconst_0
    //   165: istore_2
    //   166: iload #4
    //   168: istore_3
    //   169: aload #9
    //   171: getfield g : Z
    //   174: ifeq -> 197
    //   177: iload #4
    //   179: istore_3
    //   180: iload #7
    //   182: ifeq -> 197
    //   185: iload #4
    //   187: istore_3
    //   188: iload #6
    //   190: iload #5
    //   192: if_icmpgt -> 197
    //   195: iconst_1
    //   196: istore_3
    //   197: iload_3
    //   198: ifeq -> 265
    //   201: iload_2
    //   202: ifeq -> 265
    //   205: new ms0
    //   208: dup
    //   209: aload #9
    //   211: getfield k : Lin/krosbits/musicolet/SettingsActivity;
    //   214: invokespecial <init> : (Landroid/content/Context;)V
    //   217: astore #9
    //   219: aload_1
    //   220: ldc ' '
    //   222: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: astore_1
    //   226: aload_1
    //   227: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   230: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   233: ldc 2131887361
    //   235: invokevirtual getString : (I)Ljava/lang/String;
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload #9
    //   244: aload_1
    //   245: invokevirtual toString : ()Ljava/lang/String;
    //   248: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   251: aload #9
    //   253: ldc 2131887030
    //   255: invokevirtual n : (I)V
    //   258: aload #9
    //   260: invokevirtual p : ()Lss0;
    //   263: pop
    //   264: return
    //   265: aload #9
    //   267: getfield k : Lin/krosbits/musicolet/SettingsActivity;
    //   270: astore #9
    //   272: iload_3
    //   273: ifeq -> 333
    //   276: new ms0
    //   279: dup
    //   280: aload #9
    //   282: invokespecial <init> : (Landroid/content/Context;)V
    //   285: astore #9
    //   287: aload_1
    //   288: ldc ' '
    //   290: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: astore_1
    //   294: aload_1
    //   295: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   298: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   301: ldc 2131887360
    //   303: invokevirtual getString : (I)Ljava/lang/String;
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload #9
    //   312: aload_1
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   319: aload #9
    //   321: ldc 2131887030
    //   323: invokevirtual n : (I)V
    //   326: aload #9
    //   328: invokevirtual p : ()Lss0;
    //   331: pop
    //   332: return
    //   333: iload_2
    //   334: ifeq -> 394
    //   337: new ms0
    //   340: dup
    //   341: aload #9
    //   343: invokespecial <init> : (Landroid/content/Context;)V
    //   346: astore #9
    //   348: aload_1
    //   349: ldc ' '
    //   351: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: astore_1
    //   355: aload_1
    //   356: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   359: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   362: ldc 2131887362
    //   364: invokevirtual getString : (I)Ljava/lang/String;
    //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: pop
    //   371: aload #9
    //   373: aload_1
    //   374: invokevirtual toString : ()Ljava/lang/String;
    //   377: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   380: aload #9
    //   382: ldc 2131887030
    //   384: invokevirtual n : (I)V
    //   387: aload #9
    //   389: invokevirtual p : ()Lss0;
    //   392: pop
    //   393: return
    //   394: new ms0
    //   397: dup
    //   398: aload #9
    //   400: invokespecial <init> : (Landroid/content/Context;)V
    //   403: astore_1
    //   404: aload_1
    //   405: ldc 2131887359
    //   407: invokevirtual c : (I)V
    //   410: aload_1
    //   411: ldc 2131887030
    //   413: invokevirtual n : (I)V
    //   416: aload_1
    //   417: invokevirtual p : ()Lss0;
    //   420: pop
    //   421: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */