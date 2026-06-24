import android.content.Context;
import android.os.Handler;
import java.util.Set;

public final class cb2 extends y92 implements ne0, me0 {
  public static final la2 m = eb2.a;
  
  public final Context f;
  
  public final Handler g;
  
  public final la2 h;
  
  public final Set i;
  
  public final m2 j;
  
  public vm1 k;
  
  public sa2 l;
  
  public cb2(Context paramContext, cl paramcl, m2 paramm2) {
    super(1);
    attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    this.f = paramContext;
    this.g = paramcl;
    this.j = paramm2;
    this.i = (Set)paramm2.a;
    this.h = m;
  }
  
  public final void m(int paramInt) {
    sa2 sa21 = this.l;
    qa2 qa2 = (qa2)((oe0)sa21.h).l.get(sa21.e);
    if (qa2 != null) {
      if (qa2.m) {
        qa2.k(new sp(17, null, null));
        return;
      } 
      qa2.m(paramInt);
    } 
  }
  
  public final void o(sp paramsp) {
    this.l.a(paramsp);
  }
  
  public final void u() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Lvm1;
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual getClass : ()Ljava/lang/Class;
    //   11: pop
    //   12: aload #4
    //   14: getfield B : Lm2;
    //   17: invokevirtual getClass : ()Ljava/lang/Class;
    //   20: pop
    //   21: new android/accounts/Account
    //   24: astore_3
    //   25: aload_3
    //   26: ldc '<<default account>>'
    //   28: ldc 'com.google'
    //   30: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   33: ldc '<<default account>>'
    //   35: aload_3
    //   36: getfield name : Ljava/lang/String;
    //   39: invokevirtual equals : (Ljava/lang/Object;)Z
    //   42: ifeq -> 199
    //   45: aload #4
    //   47: getfield c : Landroid/content/Context;
    //   50: astore #5
    //   52: getstatic up1.c : Ljava/util/concurrent/locks/ReentrantLock;
    //   55: astore_2
    //   56: aload #5
    //   58: invokestatic m : (Ljava/lang/Object;)V
    //   61: getstatic up1.c : Ljava/util/concurrent/locks/ReentrantLock;
    //   64: astore_2
    //   65: aload_2
    //   66: invokevirtual lock : ()V
    //   69: getstatic up1.d : Lup1;
    //   72: ifnonnull -> 102
    //   75: new up1
    //   78: astore #6
    //   80: aload #6
    //   82: aload #5
    //   84: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   87: invokespecial <init> : (Landroid/content/Context;)V
    //   90: aload #6
    //   92: putstatic up1.d : Lup1;
    //   95: goto -> 102
    //   98: astore_3
    //   99: goto -> 189
    //   102: getstatic up1.d : Lup1;
    //   105: astore #5
    //   107: aload_2
    //   108: invokevirtual unlock : ()V
    //   111: aload #5
    //   113: ldc 'defaultGoogleSignInAccount'
    //   115: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   118: astore_2
    //   119: aload_2
    //   120: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   123: ifeq -> 129
    //   126: goto -> 199
    //   129: aload_2
    //   130: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   133: invokevirtual length : ()I
    //   136: istore_1
    //   137: new java/lang/StringBuilder
    //   140: astore #6
    //   142: aload #6
    //   144: bipush #20
    //   146: iload_1
    //   147: iadd
    //   148: invokespecial <init> : (I)V
    //   151: aload #6
    //   153: ldc 'googleSignInAccount:'
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload #6
    //   161: aload_2
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload #5
    //   168: aload #6
    //   170: invokevirtual toString : ()Ljava/lang/String;
    //   173: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   176: astore_2
    //   177: aload_2
    //   178: ifnull -> 199
    //   181: aload_2
    //   182: invokestatic e : (Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   185: astore_2
    //   186: goto -> 201
    //   189: aload_2
    //   190: invokevirtual unlock : ()V
    //   193: aload_3
    //   194: athrow
    //   195: astore_2
    //   196: goto -> 348
    //   199: aconst_null
    //   200: astore_2
    //   201: new rb2
    //   204: astore #5
    //   206: aload #4
    //   208: getfield D : Ljava/lang/Integer;
    //   211: astore #6
    //   213: aload #6
    //   215: invokestatic m : (Ljava/lang/Object;)V
    //   218: aload #5
    //   220: iconst_2
    //   221: aload_3
    //   222: aload #6
    //   224: invokevirtual intValue : ()I
    //   227: aload_2
    //   228: invokespecial <init> : (ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    //   231: aload #4
    //   233: invokevirtual i : ()Landroid/os/IInterface;
    //   236: checkcast hb2
    //   239: astore_3
    //   240: invokestatic obtain : ()Landroid/os/Parcel;
    //   243: astore_2
    //   244: aload_2
    //   245: aload_3
    //   246: getfield g : Ljava/lang/String;
    //   249: invokevirtual writeInterfaceToken : (Ljava/lang/String;)V
    //   252: getstatic ya2.a : I
    //   255: istore_1
    //   256: aload_2
    //   257: iconst_1
    //   258: invokevirtual writeInt : (I)V
    //   261: aload_2
    //   262: sipush #20293
    //   265: invokestatic D0 : (Landroid/os/Parcel;I)I
    //   268: istore_1
    //   269: aload_2
    //   270: iconst_1
    //   271: iconst_4
    //   272: invokestatic C0 : (Landroid/os/Parcel;II)V
    //   275: aload_2
    //   276: iconst_1
    //   277: invokevirtual writeInt : (I)V
    //   280: aload_2
    //   281: iconst_2
    //   282: aload #5
    //   284: iconst_0
    //   285: invokestatic u0 : (Landroid/os/Parcel;ILandroid/os/Parcelable;I)V
    //   288: aload_2
    //   289: iload_1
    //   290: invokestatic G0 : (Landroid/os/Parcel;I)V
    //   293: aload_2
    //   294: aload_0
    //   295: invokevirtual writeStrongBinder : (Landroid/os/IBinder;)V
    //   298: invokestatic obtain : ()Landroid/os/Parcel;
    //   301: astore #4
    //   303: aload_3
    //   304: getfield f : Landroid/os/IBinder;
    //   307: bipush #12
    //   309: aload_2
    //   310: aload #4
    //   312: iconst_0
    //   313: invokeinterface transact : (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //   318: pop
    //   319: aload #4
    //   321: invokevirtual readException : ()V
    //   324: aload_2
    //   325: invokevirtual recycle : ()V
    //   328: aload #4
    //   330: invokevirtual recycle : ()V
    //   333: goto -> 424
    //   336: astore_3
    //   337: aload_2
    //   338: invokevirtual recycle : ()V
    //   341: aload #4
    //   343: invokevirtual recycle : ()V
    //   346: aload_3
    //   347: athrow
    //   348: ldc_w 'SignInClientImpl'
    //   351: ldc_w 'Remote service probably died when signIn is called'
    //   354: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   357: pop
    //   358: new nb2
    //   361: astore_3
    //   362: new sp
    //   365: astore #4
    //   367: aload #4
    //   369: bipush #8
    //   371: aconst_null
    //   372: aconst_null
    //   373: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   376: aload_3
    //   377: iconst_1
    //   378: aload #4
    //   380: aconst_null
    //   381: invokespecial <init> : (ILsp;Lsb2;)V
    //   384: new vi2
    //   387: astore #4
    //   389: aload #4
    //   391: aload_0
    //   392: aload_3
    //   393: bipush #19
    //   395: iconst_0
    //   396: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;IZ)V
    //   399: aload_0
    //   400: getfield g : Landroid/os/Handler;
    //   403: aload #4
    //   405: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   408: pop
    //   409: goto -> 424
    //   412: astore_3
    //   413: ldc_w 'SignInClientImpl'
    //   416: ldc_w 'ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.'
    //   419: aload_2
    //   420: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   423: pop
    //   424: return
    //   425: astore_2
    //   426: goto -> 199
    // Exception table:
    //   from	to	target	type
    //   12	69	195	android/os/RemoteException
    //   69	95	98	finally
    //   102	107	98	finally
    //   107	126	195	android/os/RemoteException
    //   129	177	195	android/os/RemoteException
    //   181	186	425	org/json/JSONException
    //   181	186	195	android/os/RemoteException
    //   189	195	195	android/os/RemoteException
    //   201	303	195	android/os/RemoteException
    //   303	324	336	finally
    //   324	333	195	android/os/RemoteException
    //   337	348	195	android/os/RemoteException
    //   358	409	412	android/os/RemoteException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */