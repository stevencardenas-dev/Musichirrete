import android.content.Context;
import android.view.View;
import java.lang.reflect.Method;

public final class l8 implements View.OnClickListener {
  public final View b;
  
  public final String c;
  
  public Method e;
  
  public Context f;
  
  public l8(View paramView, String paramString) {
    this.b = paramView;
    this.c = paramString;
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljava/lang/reflect/Method;
    //   4: ifnonnull -> 192
    //   7: aload_0
    //   8: getfield b : Landroid/view/View;
    //   11: astore #4
    //   13: aload #4
    //   15: invokevirtual getContext : ()Landroid/content/Context;
    //   18: astore_3
    //   19: aload_0
    //   20: getfield c : Ljava/lang/String;
    //   23: astore #5
    //   25: aload_3
    //   26: ifnull -> 98
    //   29: aload_3
    //   30: invokevirtual isRestricted : ()Z
    //   33: ifne -> 75
    //   36: aload_3
    //   37: invokevirtual getClass : ()Ljava/lang/Class;
    //   40: aload #5
    //   42: iconst_1
    //   43: anewarray java/lang/Class
    //   46: dup
    //   47: iconst_0
    //   48: ldc android/view/View
    //   50: aastore
    //   51: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   54: astore #5
    //   56: aload #5
    //   58: ifnull -> 75
    //   61: aload_0
    //   62: aload #5
    //   64: putfield e : Ljava/lang/reflect/Method;
    //   67: aload_0
    //   68: aload_3
    //   69: putfield f : Landroid/content/Context;
    //   72: goto -> 192
    //   75: aload_3
    //   76: instanceof android/content/ContextWrapper
    //   79: ifeq -> 93
    //   82: aload_3
    //   83: checkcast android/content/ContextWrapper
    //   86: invokevirtual getBaseContext : ()Landroid/content/Context;
    //   89: astore_3
    //   90: goto -> 19
    //   93: aconst_null
    //   94: astore_3
    //   95: goto -> 19
    //   98: aload #4
    //   100: invokevirtual getId : ()I
    //   103: istore_2
    //   104: iload_2
    //   105: iconst_m1
    //   106: if_icmpne -> 115
    //   109: ldc ''
    //   111: astore_1
    //   112: goto -> 154
    //   115: new java/lang/StringBuilder
    //   118: dup
    //   119: ldc ' with id ''
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: astore_1
    //   125: aload_1
    //   126: aload #4
    //   128: invokevirtual getContext : ()Landroid/content/Context;
    //   131: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   134: iload_2
    //   135: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload_1
    //   143: ldc '''
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_1
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: astore_1
    //   154: ldc 'Could not find method '
    //   156: aload #5
    //   158: ldc '(View) in a parent or ancestor Context for android:onClick attribute defined on view '
    //   160: invokestatic q : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: astore_3
    //   164: aload_3
    //   165: aload #4
    //   167: invokevirtual getClass : ()Ljava/lang/Class;
    //   170: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_3
    //   175: aload_1
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: new java/lang/IllegalStateException
    //   183: dup
    //   184: aload_3
    //   185: invokevirtual toString : ()Ljava/lang/String;
    //   188: invokespecial <init> : (Ljava/lang/String;)V
    //   191: athrow
    //   192: aload_0
    //   193: getfield e : Ljava/lang/reflect/Method;
    //   196: aload_0
    //   197: getfield f : Landroid/content/Context;
    //   200: iconst_1
    //   201: anewarray java/lang/Object
    //   204: dup
    //   205: iconst_0
    //   206: aload_1
    //   207: aastore
    //   208: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: return
    //   213: astore_1
    //   214: new java/lang/IllegalStateException
    //   217: dup
    //   218: ldc 'Could not execute method for android:onClick'
    //   220: aload_1
    //   221: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   224: athrow
    //   225: astore_1
    //   226: new java/lang/IllegalStateException
    //   229: dup
    //   230: ldc 'Could not execute non-public method for android:onClick'
    //   232: aload_1
    //   233: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   236: athrow
    //   237: astore #5
    //   239: goto -> 75
    // Exception table:
    //   from	to	target	type
    //   29	56	237	java/lang/NoSuchMethodException
    //   61	72	237	java/lang/NoSuchMethodException
    //   192	212	225	java/lang/IllegalAccessException
    //   192	212	213	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */