import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class hc2 implements ko1 {
  public final dg2 a;
  
  public final bv2 b;
  
  public final sr2 c;
  
  public final gg2 d;
  
  public final Handler e = new Handler(Looper.getMainLooper());
  
  public hc2(dg2 paramdg2, bv2 parambv2, sr2 paramsr2, gg2 paramgg2) {
    this.a = paramdg2;
    this.b = parambv2;
    this.c = paramsr2;
    this.d = paramgg2;
  }
  
  public static ArrayList k(List paramList) {
    ArrayList<String> arrayList = new ArrayList(paramList.size());
    Iterator<Locale> iterator = paramList.iterator();
    while (iterator.hasNext())
      arrayList.add(((Locale)iterator.next()).toLanguageTag()); 
    return arrayList;
  }
  
  public final void a(ol0 paramol0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lbv2;
    //   6: astore_2
    //   7: aload_2
    //   8: monitorenter
    //   9: aload_2
    //   10: getfield a : Lf1;
    //   13: ldc 'unregisterListener'
    //   15: iconst_0
    //   16: anewarray java/lang/Object
    //   19: invokevirtual e : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aload_1
    //   23: ifnull -> 48
    //   26: aload_2
    //   27: getfield d : Ljava/util/HashSet;
    //   30: aload_1
    //   31: invokevirtual remove : (Ljava/lang/Object;)Z
    //   34: pop
    //   35: aload_2
    //   36: invokevirtual a : ()V
    //   39: aload_2
    //   40: monitorexit
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: goto -> 60
    //   48: new java/lang/NullPointerException
    //   51: astore_1
    //   52: aload_1
    //   53: ldc 'Unregistered Play Core listener should not be null.'
    //   55: invokespecial <init> : (Ljava/lang/String;)V
    //   58: aload_1
    //   59: athrow
    //   60: aload_2
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	64	finally
    //   9	22	44	finally
    //   26	39	44	finally
    //   39	41	64	finally
    //   48	60	44	finally
    //   60	62	44	finally
    //   62	64	64	finally
    //   65	67	64	finally
  }
  
  public final du2 b(List paramList) {
    ArrayList arrayList = k(paramList);
    dg2 dg21 = this.a;
    md2 md2 = dg21.b;
    if (md2 == null)
      return dg2.e(); 
    dg2.c.e(ybWnIKHovcRr.lKXUNDWC, new Object[] { arrayList });
    nt1 nt1 = new nt1();
    md2.c(new ne2(dg21, nt1, arrayList, nt1, 1), nt1);
    return nt1.a;
  }
  
  public final du2 c(v90 paramv90) {
    // Byte code:
    //   0: new bv0
    //   3: dup
    //   4: iconst_5
    //   5: invokespecial <init> : (I)V
    //   8: astore #4
    //   10: aload #4
    //   12: getfield a : Ljava/util/ArrayList;
    //   15: new jp2
    //   18: dup
    //   19: iconst_1
    //   20: invokestatic currentTimeMillis : ()J
    //   23: invokespecial <init> : (IJ)V
    //   26: invokevirtual add : (Ljava/lang/Object;)Z
    //   29: pop
    //   30: aload_1
    //   31: getfield c : Ljava/util/ArrayList;
    //   34: invokevirtual isEmpty : ()Z
    //   37: pop
    //   38: aload_1
    //   39: getfield c : Ljava/util/ArrayList;
    //   42: astore #8
    //   44: aload #8
    //   46: invokevirtual isEmpty : ()Z
    //   49: ifeq -> 55
    //   52: goto -> 131
    //   55: aload_0
    //   56: getfield c : Lsr2;
    //   59: invokevirtual c : ()Ljava/util/HashSet;
    //   62: astore #5
    //   64: aload #5
    //   66: ifnull -> 131
    //   69: new java/util/HashSet
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore #7
    //   78: aload #8
    //   80: invokevirtual size : ()I
    //   83: istore_3
    //   84: iconst_0
    //   85: istore_2
    //   86: iload_2
    //   87: iload_3
    //   88: if_icmpge -> 119
    //   91: aload #8
    //   93: iload_2
    //   94: invokevirtual get : (I)Ljava/lang/Object;
    //   97: astore #6
    //   99: iinc #2, 1
    //   102: aload #7
    //   104: aload #6
    //   106: checkcast java/util/Locale
    //   109: invokevirtual getLanguage : ()Ljava/lang/String;
    //   112: invokevirtual add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: goto -> 86
    //   119: aload #5
    //   121: aload #7
    //   123: invokeinterface containsAll : (Ljava/util/Collection;)Z
    //   128: ifeq -> 210
    //   131: aload_1
    //   132: getfield b : Ljava/util/ArrayList;
    //   135: astore #5
    //   137: aload_0
    //   138: getfield c : Lsr2;
    //   141: invokevirtual b : ()Ljava/util/HashSet;
    //   144: aload #5
    //   146: invokeinterface containsAll : (Ljava/util/Collection;)Z
    //   151: ifeq -> 210
    //   154: aload_1
    //   155: getfield b : Ljava/util/ArrayList;
    //   158: aload_0
    //   159: getfield d : Lgg2;
    //   162: invokevirtual a : ()Ljava/util/Set;
    //   165: invokestatic disjoint : (Ljava/util/Collection;Ljava/util/Collection;)Z
    //   168: ifne -> 174
    //   171: goto -> 210
    //   174: aload_0
    //   175: getfield e : Landroid/os/Handler;
    //   178: new zn2
    //   181: dup
    //   182: iconst_5
    //   183: aload_0
    //   184: aload_1
    //   185: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   188: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   191: pop
    //   192: new du2
    //   195: dup
    //   196: invokespecial <init> : ()V
    //   199: astore_1
    //   200: aload_1
    //   201: iconst_0
    //   202: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   205: invokevirtual g : (Ljava/lang/Object;)V
    //   208: aload_1
    //   209: areturn
    //   210: aload_0
    //   211: getfield d : Lgg2;
    //   214: astore #6
    //   216: aload_1
    //   217: getfield b : Ljava/util/ArrayList;
    //   220: astore #5
    //   222: aload #6
    //   224: invokevirtual getClass : ()Ljava/lang/Class;
    //   227: pop
    //   228: ldc gg2
    //   230: monitorenter
    //   231: aload #6
    //   233: invokevirtual a : ()Ljava/util/Set;
    //   236: astore #8
    //   238: new java/util/HashSet
    //   241: astore #7
    //   243: aload #7
    //   245: invokespecial <init> : ()V
    //   248: aload #8
    //   250: invokeinterface iterator : ()Ljava/util/Iterator;
    //   255: astore #8
    //   257: iconst_0
    //   258: istore_2
    //   259: aload #8
    //   261: invokeinterface hasNext : ()Z
    //   266: ifeq -> 311
    //   269: aload #8
    //   271: invokeinterface next : ()Ljava/lang/Object;
    //   276: checkcast java/lang/String
    //   279: astore #9
    //   281: aload #5
    //   283: aload #9
    //   285: invokevirtual contains : (Ljava/lang/Object;)Z
    //   288: ifeq -> 296
    //   291: iconst_1
    //   292: istore_2
    //   293: goto -> 259
    //   296: aload #7
    //   298: aload #9
    //   300: invokevirtual add : (Ljava/lang/Object;)Z
    //   303: pop
    //   304: goto -> 259
    //   307: astore_1
    //   308: goto -> 452
    //   311: iload_2
    //   312: ifeq -> 346
    //   315: aload #6
    //   317: getfield a : Landroid/content/Context;
    //   320: ldc 'playcore_split_install_internal'
    //   322: iconst_0
    //   323: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   326: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   331: ldc_w 'modules_to_uninstall_if_emulated'
    //   334: aload #7
    //   336: invokeinterface putStringSet : (Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    //   341: invokeinterface apply : ()V
    //   346: ldc gg2
    //   348: monitorexit
    //   349: aload_0
    //   350: getfield a : Ldg2;
    //   353: astore #5
    //   355: aload_1
    //   356: getfield b : Ljava/util/ArrayList;
    //   359: astore #6
    //   361: aload_1
    //   362: getfield c : Ljava/util/ArrayList;
    //   365: invokestatic k : (Ljava/util/List;)Ljava/util/ArrayList;
    //   368: astore #8
    //   370: aload #5
    //   372: getfield b : Lmd2;
    //   375: astore_1
    //   376: aload_1
    //   377: ifnonnull -> 387
    //   380: invokestatic e : ()Ldu2;
    //   383: astore_1
    //   384: goto -> 450
    //   387: getstatic dg2.c : Lf1;
    //   390: ldc_w 'startInstall(%s,%s)'
    //   393: iconst_2
    //   394: anewarray java/lang/Object
    //   397: dup
    //   398: iconst_0
    //   399: aload #6
    //   401: aastore
    //   402: dup
    //   403: iconst_1
    //   404: aload #8
    //   406: aastore
    //   407: invokevirtual e : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: new nt1
    //   413: dup
    //   414: invokespecial <init> : ()V
    //   417: astore #7
    //   419: aload_1
    //   420: new ee2
    //   423: dup
    //   424: aload #5
    //   426: aload #7
    //   428: aload #6
    //   430: aload #8
    //   432: aload #4
    //   434: aload #7
    //   436: invokespecial <init> : (Ldg2;Lnt1;Ljava/util/ArrayList;Ljava/util/ArrayList;Lbv0;Lnt1;)V
    //   439: aload #7
    //   441: invokevirtual c : (Lot2;Lnt1;)V
    //   444: aload #7
    //   446: getfield a : Ldu2;
    //   449: astore_1
    //   450: aload_1
    //   451: areturn
    //   452: ldc gg2
    //   454: monitorexit
    //   455: aload_1
    //   456: athrow
    //   457: astore #5
    //   459: goto -> 346
    // Exception table:
    //   from	to	target	type
    //   231	257	307	finally
    //   259	291	307	finally
    //   296	304	307	finally
    //   315	346	457	java/lang/Exception
    //   315	346	307	finally
    //   346	349	307	finally
    //   452	455	307	finally
  }
  
  public final du2 d(List paramList) {
    ArrayList arrayList = k(paramList);
    dg2 dg21 = this.a;
    md2 md2 = dg21.b;
    if (md2 == null)
      return dg2.e(); 
    dg2.c.e("deferredLanguageInstall(%s)", new Object[] { arrayList });
    nt1 nt1 = new nt1();
    md2.c(new ne2(dg21, nt1, arrayList, nt1, 0), nt1);
    return nt1.a;
  }
  
  public final Set e() {
    return this.c.b();
  }
  
  public final du2 f(int paramInt) {
    dg2 dg21 = this.a;
    md2 md2 = dg21.b;
    if (md2 == null)
      return dg2.e(); 
    dg2.c.e("cancelInstall(%d)", new Object[] { Integer.valueOf(paramInt) });
    nt1 nt1 = new nt1();
    md2.c(new we2(dg21, nt1, paramInt, nt1), nt1);
    return nt1.a;
  }
  
  public final boolean g(tb2 paramtb2, Activity paramActivity) {
    if (paramtb2.b == 8) {
      PendingIntent pendingIntent = paramtb2.h;
      if (pendingIntent != null) {
        paramActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
        return true;
      } 
    } 
    return false;
  }
  
  public final void h(ol0 paramol0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lbv2;
    //   6: astore_2
    //   7: aload_2
    //   8: monitorenter
    //   9: aload_2
    //   10: getfield a : Lf1;
    //   13: ldc_w 'registerListener'
    //   16: iconst_0
    //   17: anewarray java/lang/Object
    //   20: invokevirtual e : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: aload_1
    //   24: ifnull -> 49
    //   27: aload_2
    //   28: getfield d : Ljava/util/HashSet;
    //   31: aload_1
    //   32: invokevirtual add : (Ljava/lang/Object;)Z
    //   35: pop
    //   36: aload_2
    //   37: invokevirtual a : ()V
    //   40: aload_2
    //   41: monitorexit
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_1
    //   46: goto -> 62
    //   49: new java/lang/NullPointerException
    //   52: astore_1
    //   53: aload_1
    //   54: ldc_w 'Registered Play Core listener should not be null.'
    //   57: invokespecial <init> : (Ljava/lang/String;)V
    //   60: aload_1
    //   61: athrow
    //   62: aload_2
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	66	finally
    //   9	23	45	finally
    //   27	40	45	finally
    //   40	42	66	finally
    //   49	62	45	finally
    //   62	64	45	finally
    //   64	66	66	finally
    //   67	69	66	finally
  }
  
  public final Set i() {
    HashSet hashSet = this.c.c();
    Set set = hashSet;
    if (hashSet == null)
      set = Collections.EMPTY_SET; 
    return set;
  }
  
  public final du2 j(List paramList) {
    dg2 dg21 = this.a;
    md2 md2 = dg21.b;
    if (md2 == null)
      return dg2.e(); 
    dg2.c.e("deferredInstall(%s)", new Object[] { paramList });
    nt1 nt1 = new nt1();
    md2.c(new je2(dg21, nt1, paramList, nt1), nt1);
    return nt1.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */