import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

public final class bq2 {
  public static final Object g = new Object();
  
  public static bq2 h;
  
  public static HandlerThread i;
  
  public final HashMap a = new HashMap<Object, Object>();
  
  public final Context b;
  
  public volatile cl c;
  
  public final xp d;
  
  public final long e;
  
  public final long f;
  
  public bq2(Context paramContext, Looper paramLooper) {
    mn1 mn1 = new mn1(1, this);
    this.b = paramContext.getApplicationContext();
    cl cl1 = new cl(paramLooper, mn1, 7);
    Looper.getMainLooper();
    this.c = cl1;
    if (xp.b == null) {
      Object object = xp.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (xp.b == null) {
          xp xp2 = new xp();
          super();
          xp.b = xp2;
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    } 
    xp xp1 = xp.b;
    n21.m(xp1);
    this.d = xp1;
    this.e = 5000L;
    this.f = 300000L;
  }
  
  public final sp a(dp2 paramdp2, uj2 paramuj2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/util/HashMap;
    //   4: astore #6
    //   6: aload #6
    //   8: monitorenter
    //   9: aload #6
    //   11: aload_1
    //   12: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast np2
    //   18: astore #5
    //   20: aload #5
    //   22: ifnonnull -> 77
    //   25: new np2
    //   28: astore #5
    //   30: aload #5
    //   32: aload_0
    //   33: aload_1
    //   34: invokespecial <init> : (Lbq2;Ldp2;)V
    //   37: aload #5
    //   39: getfield b : Ljava/util/HashMap;
    //   42: aload_2
    //   43: aload_2
    //   44: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: pop
    //   48: aload #5
    //   50: aload_3
    //   51: aconst_null
    //   52: invokevirtual a : (Ljava/lang/String;Ljava/util/concurrent/Executor;)Lsp;
    //   55: astore_3
    //   56: aload #6
    //   58: aload_1
    //   59: aload #5
    //   61: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   64: pop
    //   65: aload #5
    //   67: astore_2
    //   68: aload_3
    //   69: astore_1
    //   70: goto -> 167
    //   73: astore_1
    //   74: goto -> 256
    //   77: aload_0
    //   78: getfield c : Lcl;
    //   81: iconst_0
    //   82: aload_1
    //   83: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   86: aload #5
    //   88: getfield b : Ljava/util/HashMap;
    //   91: aload_2
    //   92: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   95: ifne -> 205
    //   98: aload #5
    //   100: getfield b : Ljava/util/HashMap;
    //   103: aload_2
    //   104: aload_2
    //   105: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: aload #5
    //   111: getfield c : I
    //   114: istore #4
    //   116: iload #4
    //   118: iconst_1
    //   119: if_icmpeq -> 150
    //   122: iload #4
    //   124: iconst_2
    //   125: if_icmpeq -> 136
    //   128: aconst_null
    //   129: astore_1
    //   130: aload #5
    //   132: astore_2
    //   133: goto -> 167
    //   136: aload #5
    //   138: aload_3
    //   139: aconst_null
    //   140: invokevirtual a : (Ljava/lang/String;Ljava/util/concurrent/Executor;)Lsp;
    //   143: astore_1
    //   144: aload #5
    //   146: astore_2
    //   147: goto -> 167
    //   150: aload_2
    //   151: aload #5
    //   153: getfield h : Landroid/content/ComponentName;
    //   156: aload #5
    //   158: getfield f : Landroid/os/IBinder;
    //   161: invokevirtual onServiceConnected : (Landroid/content/ComponentName;Landroid/os/IBinder;)V
    //   164: goto -> 128
    //   167: aload_2
    //   168: getfield e : Z
    //   171: ifeq -> 183
    //   174: getstatic sp.h : Lsp;
    //   177: astore_1
    //   178: aload #6
    //   180: monitorexit
    //   181: aload_1
    //   182: areturn
    //   183: aload_1
    //   184: astore_2
    //   185: aload_1
    //   186: ifnonnull -> 200
    //   189: new sp
    //   192: astore_2
    //   193: aload_2
    //   194: iconst_m1
    //   195: aconst_null
    //   196: aconst_null
    //   197: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   200: aload #6
    //   202: monitorexit
    //   203: aload_2
    //   204: areturn
    //   205: new java/lang/IllegalStateException
    //   208: astore_2
    //   209: aload_1
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: astore_1
    //   214: aload_1
    //   215: invokevirtual length : ()I
    //   218: istore #4
    //   220: new java/lang/StringBuilder
    //   223: astore_3
    //   224: aload_3
    //   225: iload #4
    //   227: bipush #81
    //   229: iadd
    //   230: invokespecial <init> : (I)V
    //   233: aload_3
    //   234: ldc 'Trying to bind a GmsServiceConnection that was already connected before.  config='
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_3
    //   241: aload_1
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload_2
    //   247: aload_3
    //   248: invokevirtual toString : ()Ljava/lang/String;
    //   251: invokespecial <init> : (Ljava/lang/String;)V
    //   254: aload_2
    //   255: athrow
    //   256: aload #6
    //   258: monitorexit
    //   259: aload_1
    //   260: athrow
    // Exception table:
    //   from	to	target	type
    //   9	20	73	finally
    //   25	65	73	finally
    //   77	116	73	finally
    //   136	144	73	finally
    //   150	164	73	finally
    //   167	181	73	finally
    //   189	200	73	finally
    //   200	203	73	finally
    //   205	256	73	finally
    //   256	259	73	finally
  }
  
  public final void b(String paramString, ServiceConnection paramServiceConnection, boolean paramBoolean) {
    dp2 dp2 = new dp2(paramString, paramBoolean);
    n21.n("ServiceConnection must not be null", paramServiceConnection);
    HashMap hashMap = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      np2 np2 = (np2)hashMap.get(dp2);
      if (np2 != null) {
        if (np2.b.containsKey(paramServiceConnection)) {
          np2.b.remove(paramServiceConnection);
          if (np2.b.isEmpty()) {
            Message message = this.c.obtainMessage(0, dp2);
            this.c.sendMessageDelayed(message, this.e);
          } 
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
          return;
        } 
        IllegalStateException illegalStateException1 = new IllegalStateException();
        String str1 = dp2.toString();
        int j = str1.length();
        stringBuilder = new StringBuilder();
        this(j + 76);
        stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
        stringBuilder.append(str1);
        this(stringBuilder.toString());
        throw illegalStateException1;
      } 
    } finally {}
    IllegalStateException illegalStateException = new IllegalStateException();
    String str = stringBuilder.toString();
    int i = str.length();
    StringBuilder stringBuilder = new StringBuilder();
    this(i + 50);
    stringBuilder.append("Nonexistent connection status for service config: ");
    stringBuilder.append(str);
    this(stringBuilder.toString());
    throw illegalStateException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */