import android.content.SharedPreferences;

public final class oz0 implements r41 {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public final Object f;
  
  public oz0(int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3) {
    this.b = paramInt;
    this.c = paramArrayOfString1;
    this.e = paramArrayOfString2;
    this.f = paramArrayOfString3;
  }
  
  public oz0(wi2 paramwi2, int paramInt, nr paramnr, Runnable paramRunnable) {
    this.b = paramInt;
    this.c = paramnr;
    this.e = paramRunnable;
    this.f = paramwi2;
  }
  
  public oz0(pf1[] paramArrayOfpf1, zd[] paramArrayOfzd, nr0 paramnr0) {
    this.c = paramArrayOfpf1;
    this.e = new xv1(paramArrayOfzd);
    this.f = paramnr0;
    this.b = paramArrayOfpf1.length;
  }
  
  public boolean a(oz0 paramoz0, int paramInt) {
    return (paramoz0 != null && d12.a(((pf1[])this.c)[paramInt], ((pf1[])paramoz0.c)[paramInt]) && d12.a(((xv1)this.e).b[paramInt], ((xv1)paramoz0.e).b[paramInt]));
  }
  
  public boolean b(int paramInt) {
    return (((pf1[])this.c)[paramInt] != null);
  }
  
  public void c(Throwable paramThrowable) {
    boolean bool = paramThrowable instanceof java.util.concurrent.TimeoutException;
    wi2 wi2 = (wi2)this.f;
    if (bool) {
      wi2.I(102, 28, ij2.r);
      ph2.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", paramThrowable);
    } else {
      wi2.I(95, 28, ij2.r);
      ph2.i("BillingClientTesting", "An error occurred while retrieving billing override.", paramThrowable);
    } 
    ((Runnable)this.e).run();
  }
  
  public void i(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: checkcast hn2
    //   7: astore #8
    //   9: aload_0
    //   10: getfield e : Ljava/lang/Object;
    //   13: checkcast java/lang/String
    //   16: astore #7
    //   18: aload_0
    //   19: getfield f : Ljava/lang/Object;
    //   22: checkcast android/content/SharedPreferences
    //   25: astore #5
    //   27: aload_1
    //   28: checkcast android/os/Bundle
    //   31: astore #9
    //   33: aload #8
    //   35: getfield a : Lbl1;
    //   38: astore #6
    //   40: aload #6
    //   42: invokestatic m : (Ljava/lang/Object;)V
    //   45: aload #8
    //   47: getfield b : Lvh2;
    //   50: astore_1
    //   51: aload_0
    //   52: getfield b : I
    //   55: istore_3
    //   56: iload_3
    //   57: istore_2
    //   58: iload_3
    //   59: iconst_3
    //   60: if_icmpeq -> 73
    //   63: iload_3
    //   64: istore #4
    //   66: iload_3
    //   67: iconst_2
    //   68: if_icmpne -> 161
    //   71: iconst_2
    //   72: istore_2
    //   73: new cn
    //   76: dup
    //   77: aload #8
    //   79: aload #8
    //   81: getfield c : Lhf2;
    //   84: aload #7
    //   86: invokespecial <init> : (Lhn2;Lhf2;Ljava/lang/String;)V
    //   89: astore #10
    //   91: aload #6
    //   93: new mt2
    //   96: dup
    //   97: aload #10
    //   99: invokespecial <init> : (Lcn;)V
    //   102: ldc oj
    //   104: invokevirtual a : (Lcl1;Ljava/lang/Class;)V
    //   107: iload_2
    //   108: istore #4
    //   110: aload_1
    //   111: ifnull -> 161
    //   114: new vo2
    //   117: dup
    //   118: iconst_1
    //   119: aload #10
    //   121: invokespecial <init> : (ILjava/lang/Object;)V
    //   124: astore #10
    //   126: getstatic vh2.g : Lrp0;
    //   129: ldc 'register callback = %s'
    //   131: iconst_1
    //   132: anewarray java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: aload #10
    //   139: aastore
    //   140: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: invokestatic j : ()V
    //   146: aload_1
    //   147: getfield b : Ljava/util/Set;
    //   150: aload #10
    //   152: invokeinterface add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: iload_2
    //   159: istore #4
    //   161: iload #4
    //   163: iconst_1
    //   164: if_icmpeq -> 173
    //   167: iload #4
    //   169: iconst_2
    //   170: if_icmpne -> 261
    //   173: new fp2
    //   176: dup
    //   177: aload #5
    //   179: aload #8
    //   181: aload #8
    //   183: getfield c : Lhf2;
    //   186: aload #9
    //   188: aload #7
    //   190: invokespecial <init> : (Landroid/content/SharedPreferences;Lhn2;Lhf2;Landroid/os/Bundle;Ljava/lang/String;)V
    //   193: astore #5
    //   195: aload #6
    //   197: new a42
    //   200: dup
    //   201: bipush #22
    //   203: aload #5
    //   205: invokespecial <init> : (ILjava/lang/Object;)V
    //   208: ldc oj
    //   210: invokevirtual a : (Lcl1;Ljava/lang/Class;)V
    //   213: aload_1
    //   214: ifnull -> 261
    //   217: new vo2
    //   220: dup
    //   221: iconst_0
    //   222: aload #5
    //   224: invokespecial <init> : (ILjava/lang/Object;)V
    //   227: astore #5
    //   229: getstatic vh2.g : Lrp0;
    //   232: ldc 'register callback = %s'
    //   234: iconst_1
    //   235: anewarray java/lang/Object
    //   238: dup
    //   239: iconst_0
    //   240: aload #5
    //   242: aastore
    //   243: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   246: invokestatic j : ()V
    //   249: aload_1
    //   250: getfield b : Ljava/util/Set;
    //   253: aload #5
    //   255: invokeinterface add : (Ljava/lang/Object;)Z
    //   260: pop
    //   261: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */