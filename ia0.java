import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable;
import com.android.billingclient.api.wH.DJqHMztxflt;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class ia0 implements Runnable {
  public static final String g = qp0.j("ForceStopRunnable");
  
  public static final long h = 315360000000L;
  
  public final Context b;
  
  public final q72 c;
  
  public final dh0 e;
  
  public int f;
  
  public ia0(Context paramContext, q72 paramq72) {
    this.b = paramContext.getApplicationContext();
    this.c = paramq72;
    this.e = paramq72.g;
    this.f = 0;
  }
  
  public static void c(Context paramContext) {
    int i;
    AlarmManager alarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (Build.VERSION.SDK_INT >= 31) {
      i = 167772160;
    } else {
      i = 134217728;
    } 
    Intent intent = new Intent();
    intent.setComponent(new ComponentName(paramContext, ForceStopRunnable.BroadcastReceiver.class));
    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
    PendingIntent pendingIntent = PendingIntent.getBroadcast(paramContext, -1, intent, i);
    long l1 = System.currentTimeMillis();
    long l2 = h;
    if (alarmManager != null)
      alarmManager.setExact(0, l1 + l2, pendingIntent); 
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ldh0;
    //   4: astore #7
    //   6: aload_0
    //   7: getfield c : Lq72;
    //   10: astore #8
    //   12: aload #8
    //   14: getfield c : Landroidx/work/impl/WorkDatabase;
    //   17: astore #12
    //   19: aload #8
    //   21: getfield b : Lip;
    //   24: astore #9
    //   26: aload #8
    //   28: getfield g : Ldh0;
    //   31: astore #11
    //   33: aload #8
    //   35: getfield c : Landroidx/work/impl/WorkDatabase;
    //   38: astore #6
    //   40: getstatic ns1.h : Ljava/lang/String;
    //   43: astore #10
    //   45: aload_0
    //   46: getfield b : Landroid/content/Context;
    //   49: astore #10
    //   51: aload #10
    //   53: invokestatic a : (Landroid/content/Context;)Landroid/app/job/JobScheduler;
    //   56: astore #16
    //   58: aload #10
    //   60: aload #16
    //   62: invokestatic d : (Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    //   65: astore #15
    //   67: aload #12
    //   69: invokevirtual s : ()Lls1;
    //   72: getfield a : Leh1;
    //   75: iconst_1
    //   76: iconst_0
    //   77: new ps
    //   80: dup
    //   81: iconst_5
    //   82: invokespecial <init> : (I)V
    //   85: invokestatic N : (Leh1;ZZLwc0;)Ljava/lang/Object;
    //   88: checkcast java/util/List
    //   91: astore #13
    //   93: aload #15
    //   95: ifnull -> 107
    //   98: aload #15
    //   100: invokevirtual size : ()I
    //   103: istore_1
    //   104: goto -> 109
    //   107: iconst_0
    //   108: istore_1
    //   109: new java/util/HashSet
    //   112: dup
    //   113: iload_1
    //   114: invokespecial <init> : (I)V
    //   117: astore #14
    //   119: aload #15
    //   121: ifnull -> 202
    //   124: aload #15
    //   126: invokevirtual isEmpty : ()Z
    //   129: ifne -> 202
    //   132: aload #15
    //   134: invokevirtual size : ()I
    //   137: istore_2
    //   138: iconst_0
    //   139: istore_1
    //   140: iload_1
    //   141: iload_2
    //   142: if_icmpge -> 202
    //   145: aload #15
    //   147: iload_1
    //   148: invokevirtual get : (I)Ljava/lang/Object;
    //   151: astore #17
    //   153: iinc #1, 1
    //   156: aload #17
    //   158: checkcast android/app/job/JobInfo
    //   161: astore #18
    //   163: aload #18
    //   165: invokestatic f : (Landroid/app/job/JobInfo;)Ln72;
    //   168: astore #17
    //   170: aload #17
    //   172: ifnull -> 189
    //   175: aload #14
    //   177: aload #17
    //   179: getfield a : Ljava/lang/String;
    //   182: invokevirtual add : (Ljava/lang/Object;)Z
    //   185: pop
    //   186: goto -> 199
    //   189: aload #16
    //   191: aload #18
    //   193: invokevirtual getId : ()I
    //   196: invokestatic b : (Landroid/app/job/JobScheduler;I)V
    //   199: goto -> 140
    //   202: aload #13
    //   204: invokeinterface iterator : ()Ljava/util/Iterator;
    //   209: astore #15
    //   211: aload #15
    //   213: invokeinterface hasNext : ()Z
    //   218: ifeq -> 255
    //   221: aload #14
    //   223: aload #15
    //   225: invokeinterface next : ()Ljava/lang/Object;
    //   230: checkcast java/lang/String
    //   233: invokevirtual contains : (Ljava/lang/Object;)Z
    //   236: ifne -> 211
    //   239: invokestatic h : ()Lqp0;
    //   242: getstatic ns1.h : Ljava/lang/String;
    //   245: ldc 'Reconciling jobs'
    //   247: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   250: iconst_1
    //   251: istore_1
    //   252: goto -> 257
    //   255: iconst_0
    //   256: istore_1
    //   257: iload_1
    //   258: ifeq -> 339
    //   261: aload #12
    //   263: invokevirtual b : ()V
    //   266: aload #12
    //   268: invokevirtual v : ()Lc82;
    //   271: astore #14
    //   273: aload #13
    //   275: invokeinterface iterator : ()Ljava/util/Iterator;
    //   280: astore #13
    //   282: aload #13
    //   284: invokeinterface hasNext : ()Z
    //   289: ifeq -> 318
    //   292: aload #14
    //   294: ldc2_w -1
    //   297: aload #13
    //   299: invokeinterface next : ()Ljava/lang/Object;
    //   304: checkcast java/lang/String
    //   307: invokevirtual c : (JLjava/lang/String;)V
    //   310: goto -> 282
    //   313: astore #6
    //   315: goto -> 331
    //   318: aload #12
    //   320: invokevirtual o : ()V
    //   323: aload #12
    //   325: invokevirtual l : ()V
    //   328: goto -> 339
    //   331: aload #12
    //   333: invokevirtual l : ()V
    //   336: aload #6
    //   338: athrow
    //   339: aload #6
    //   341: invokevirtual v : ()Lc82;
    //   344: astore #13
    //   346: aload #6
    //   348: invokevirtual u : ()Lu72;
    //   351: astore #12
    //   353: aload #6
    //   355: invokevirtual b : ()V
    //   358: aload #13
    //   360: getfield a : Leh1;
    //   363: astore #15
    //   365: new ps
    //   368: astore #14
    //   370: aload #14
    //   372: bipush #11
    //   374: invokespecial <init> : (I)V
    //   377: aload #15
    //   379: iconst_1
    //   380: iconst_0
    //   381: aload #14
    //   383: invokestatic N : (Leh1;ZZLwc0;)Ljava/lang/Object;
    //   386: checkcast java/util/List
    //   389: astore #14
    //   391: aload #14
    //   393: ifnull -> 416
    //   396: aload #14
    //   398: invokeinterface isEmpty : ()Z
    //   403: ifne -> 416
    //   406: iconst_1
    //   407: istore_2
    //   408: goto -> 418
    //   411: astore #7
    //   413: goto -> 1033
    //   416: iconst_0
    //   417: istore_2
    //   418: iload_2
    //   419: ifeq -> 497
    //   422: aload #14
    //   424: invokeinterface iterator : ()Ljava/util/Iterator;
    //   429: astore #14
    //   431: aload #14
    //   433: invokeinterface hasNext : ()Z
    //   438: ifeq -> 497
    //   441: aload #14
    //   443: invokeinterface next : ()Ljava/lang/Object;
    //   448: checkcast y72
    //   451: astore #16
    //   453: getstatic o72.b : Lo72;
    //   456: astore #15
    //   458: aload #16
    //   460: getfield a : Ljava/lang/String;
    //   463: astore #16
    //   465: aload #13
    //   467: aload #15
    //   469: aload #16
    //   471: invokevirtual f : (Lo72;Ljava/lang/String;)V
    //   474: aload #13
    //   476: aload #16
    //   478: sipush #-512
    //   481: invokevirtual g : (Ljava/lang/String;I)V
    //   484: aload #13
    //   486: ldc2_w -1
    //   489: aload #16
    //   491: invokevirtual c : (JLjava/lang/String;)V
    //   494: goto -> 431
    //   497: aload #12
    //   499: getfield a : Leh1;
    //   502: astore #12
    //   504: new ps
    //   507: astore #13
    //   509: aload #13
    //   511: bipush #9
    //   513: invokespecial <init> : (I)V
    //   516: aload #12
    //   518: iconst_0
    //   519: iconst_1
    //   520: aload #13
    //   522: invokestatic N : (Leh1;ZZLwc0;)Ljava/lang/Object;
    //   525: pop
    //   526: aload #6
    //   528: invokevirtual o : ()V
    //   531: aload #6
    //   533: invokevirtual l : ()V
    //   536: iload_2
    //   537: ifne -> 552
    //   540: iload_1
    //   541: ifeq -> 547
    //   544: goto -> 552
    //   547: iconst_0
    //   548: istore_1
    //   549: goto -> 554
    //   552: iconst_1
    //   553: istore_1
    //   554: aload #11
    //   556: getfield a : Landroidx/work/impl/WorkDatabase;
    //   559: invokevirtual r : ()Lr91;
    //   562: ldc_w 'reschedule_needed'
    //   565: invokevirtual a : (Ljava/lang/String;)Ljava/lang/Long;
    //   568: astore #13
    //   570: lconst_0
    //   571: lstore #4
    //   573: getstatic ia0.g : Ljava/lang/String;
    //   576: astore #12
    //   578: aload #13
    //   580: ifnull -> 665
    //   583: aload #13
    //   585: invokevirtual longValue : ()J
    //   588: lconst_1
    //   589: lcmp
    //   590: ifne -> 665
    //   593: invokestatic h : ()Lqp0;
    //   596: aload #12
    //   598: ldc_w 'Rescheduling Workers.'
    //   601: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   604: aload #8
    //   606: invokevirtual d : ()V
    //   609: aload #11
    //   611: invokevirtual getClass : ()Ljava/lang/Class;
    //   614: pop
    //   615: new p91
    //   618: dup
    //   619: ldc_w 'reschedule_needed'
    //   622: lconst_0
    //   623: invokestatic valueOf : (J)Ljava/lang/Long;
    //   626: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Long;)V
    //   629: astore #6
    //   631: aload #11
    //   633: getfield a : Landroidx/work/impl/WorkDatabase;
    //   636: invokevirtual r : ()Lr91;
    //   639: astore #7
    //   641: aload #7
    //   643: getfield a : Leh1;
    //   646: iconst_0
    //   647: iconst_1
    //   648: new dy
    //   651: dup
    //   652: iconst_3
    //   653: aload #7
    //   655: aload #6
    //   657: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   660: invokestatic N : (Leh1;ZZLwc0;)Ljava/lang/Object;
    //   663: pop
    //   664: return
    //   665: getstatic android/os/Build$VERSION.SDK_INT : I
    //   668: istore_3
    //   669: iload_3
    //   670: bipush #31
    //   672: if_icmplt -> 682
    //   675: ldc_w 570425344
    //   678: istore_2
    //   679: goto -> 686
    //   682: ldc_w 536870912
    //   685: istore_2
    //   686: new android/content/Intent
    //   689: astore #13
    //   691: aload #13
    //   693: invokespecial <init> : ()V
    //   696: new android/content/ComponentName
    //   699: astore #11
    //   701: aload #11
    //   703: aload #10
    //   705: ldc androidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver
    //   707: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   710: aload #13
    //   712: aload #11
    //   714: invokevirtual setComponent : (Landroid/content/ComponentName;)Landroid/content/Intent;
    //   717: pop
    //   718: aload #13
    //   720: ldc 'ACTION_FORCE_STOP_RESCHEDULE'
    //   722: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   725: pop
    //   726: aload #10
    //   728: iconst_m1
    //   729: aload #13
    //   731: iload_2
    //   732: invokestatic getBroadcast : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   735: astore #11
    //   737: iload_3
    //   738: bipush #30
    //   740: if_icmplt -> 884
    //   743: aload #11
    //   745: ifnull -> 766
    //   748: aload #11
    //   750: invokevirtual cancel : ()V
    //   753: goto -> 766
    //   756: astore #6
    //   758: goto -> 925
    //   761: astore #6
    //   763: goto -> 925
    //   766: aload #10
    //   768: ldc_w 'activity'
    //   771: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   774: checkcast android/app/ActivityManager
    //   777: aconst_null
    //   778: iconst_0
    //   779: iconst_0
    //   780: invokevirtual getHistoricalProcessExitReasons : (Ljava/lang/String;II)Ljava/util/List;
    //   783: astore #10
    //   785: aload #10
    //   787: ifnull -> 897
    //   790: aload #10
    //   792: invokeinterface isEmpty : ()Z
    //   797: ifne -> 897
    //   800: aload #7
    //   802: getfield a : Landroidx/work/impl/WorkDatabase;
    //   805: invokevirtual r : ()Lr91;
    //   808: ldc_w 'last_force_stop_ms'
    //   811: invokevirtual a : (Ljava/lang/String;)Ljava/lang/Long;
    //   814: astore #11
    //   816: aload #11
    //   818: ifnull -> 828
    //   821: aload #11
    //   823: invokevirtual longValue : ()J
    //   826: lstore #4
    //   828: iconst_0
    //   829: istore_2
    //   830: iload_2
    //   831: aload #10
    //   833: invokeinterface size : ()I
    //   838: if_icmpge -> 897
    //   841: aload #10
    //   843: iload_2
    //   844: invokeinterface get : (I)Ljava/lang/Object;
    //   849: checkcast android/app/ApplicationExitInfo
    //   852: astore #11
    //   854: aload #11
    //   856: invokevirtual getReason : ()I
    //   859: bipush #10
    //   861: if_icmpne -> 878
    //   864: aload #11
    //   866: invokevirtual getTimestamp : ()J
    //   869: lload #4
    //   871: lcmp
    //   872: iflt -> 878
    //   875: goto -> 946
    //   878: iinc #2, 1
    //   881: goto -> 830
    //   884: aload #11
    //   886: ifnonnull -> 897
    //   889: aload #10
    //   891: invokestatic c : (Landroid/content/Context;)V
    //   894: goto -> 946
    //   897: iload_1
    //   898: ifeq -> 924
    //   901: invokestatic h : ()Lqp0;
    //   904: aload #12
    //   906: ldc_w 'Found unfinished work, scheduling it.'
    //   909: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   912: aload #9
    //   914: aload #6
    //   916: aload #8
    //   918: getfield e : Ljava/util/List;
    //   921: invokestatic b : (Lip;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    //   924: return
    //   925: invokestatic h : ()Lqp0;
    //   928: getfield b : I
    //   931: iconst_5
    //   932: if_icmpgt -> 946
    //   935: aload #12
    //   937: ldc_w 'Ignoring exception'
    //   940: aload #6
    //   942: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   945: pop
    //   946: invokestatic h : ()Lqp0;
    //   949: aload #12
    //   951: ldc_w 'Application was force-stopped, rescheduling.'
    //   954: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   957: aload #8
    //   959: invokevirtual d : ()V
    //   962: aload #9
    //   964: getfield d : Lfb0;
    //   967: invokevirtual getClass : ()Ljava/lang/Class;
    //   970: pop
    //   971: invokestatic currentTimeMillis : ()J
    //   974: lstore #4
    //   976: aload #7
    //   978: invokevirtual getClass : ()Ljava/lang/Class;
    //   981: pop
    //   982: new p91
    //   985: dup
    //   986: ldc_w 'last_force_stop_ms'
    //   989: lload #4
    //   991: invokestatic valueOf : (J)Ljava/lang/Long;
    //   994: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Long;)V
    //   997: astore #6
    //   999: aload #7
    //   1001: getfield a : Landroidx/work/impl/WorkDatabase;
    //   1004: invokevirtual r : ()Lr91;
    //   1007: astore #7
    //   1009: aload #7
    //   1011: getfield a : Leh1;
    //   1014: iconst_0
    //   1015: iconst_1
    //   1016: new dy
    //   1019: dup
    //   1020: iconst_3
    //   1021: aload #7
    //   1023: aload #6
    //   1025: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   1028: invokestatic N : (Leh1;ZZLwc0;)Ljava/lang/Object;
    //   1031: pop
    //   1032: return
    //   1033: aload #6
    //   1035: invokevirtual l : ()V
    //   1038: aload #7
    //   1040: athrow
    // Exception table:
    //   from	to	target	type
    //   266	282	313	finally
    //   282	310	313	finally
    //   318	323	313	finally
    //   358	391	411	finally
    //   396	406	411	finally
    //   422	431	411	finally
    //   431	494	411	finally
    //   497	531	411	finally
    //   665	669	761	java/lang/SecurityException
    //   665	669	756	java/lang/IllegalArgumentException
    //   686	737	761	java/lang/SecurityException
    //   686	737	756	java/lang/IllegalArgumentException
    //   748	753	761	java/lang/SecurityException
    //   748	753	756	java/lang/IllegalArgumentException
    //   766	785	761	java/lang/SecurityException
    //   766	785	756	java/lang/IllegalArgumentException
    //   790	816	761	java/lang/SecurityException
    //   790	816	756	java/lang/IllegalArgumentException
    //   821	828	761	java/lang/SecurityException
    //   821	828	756	java/lang/IllegalArgumentException
    //   830	875	761	java/lang/SecurityException
    //   830	875	756	java/lang/IllegalArgumentException
    //   889	894	761	java/lang/SecurityException
    //   889	894	756	java/lang/IllegalArgumentException
  }
  
  public final boolean b() {
    ip ip = this.c.b;
    ip.getClass();
    boolean bool = TextUtils.isEmpty(null);
    String str = g;
    if (bool) {
      qp0.h().b(str, JkpGFvCVQHzgc.vnREkaiXiAfBOl);
      return true;
    } 
    bool = ka1.a(this.b, ip);
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder("Is default app process = ");
    stringBuilder.append(bool);
    qp0.b(str, stringBuilder.toString());
    return bool;
  }
  
  public final void run() {
    Context context = this.b;
    String str = g;
    q72 q721 = this.c;
    try {
      boolean bool = b();
      if (!bool)
        return; 
      while (true) {
        IllegalStateException illegalStateException;
        try {
          zo2.F(context);
          qp0.h().b(str, "Performing cleanup operations.");
          try {
            a();
            return;
          } catch (SQLiteAccessPermException sQLiteAccessPermException) {
          
          } catch (SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
          
          } catch (SQLiteConstraintException sQLiteConstraintException) {
          
          } catch (SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException) {
          
          } catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
          
          } catch (SQLiteDiskIOException sQLiteDiskIOException) {
          
          } catch (SQLiteFullException sQLiteFullException) {
          
          } catch (SQLiteTableLockedException sQLiteTableLockedException) {}
          int i = this.f + 1;
          this.f = i;
          if (i >= 3) {
            String str1;
            if (((UserManager)context.getSystemService(UserManager.class)).isUserUnlocked()) {
              str1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
            } else {
              str1 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
            } 
            qp0.h().g(str, str1, (Throwable)sQLiteTableLockedException);
            illegalStateException = new IllegalStateException();
            this(str1, (Throwable)sQLiteTableLockedException);
            q721.b.getClass();
            throw illegalStateException;
          } 
          long l = i;
          qp0 qp0 = qp0.h();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(DJqHMztxflt.YwxOw);
          stringBuilder.append(l * 300L);
          qp0.d((String)illegalStateException, stringBuilder.toString(), (Throwable)sQLiteTableLockedException);
          i = this.f;
          l = i;
          try {
            Thread.sleep(l * 300L);
          } catch (InterruptedException interruptedException) {}
        } catch (SQLiteException sQLiteException) {
          qp0.h().f((String)illegalStateException, "Unexpected SQLite exception during migrations");
          IllegalStateException illegalStateException1 = new IllegalStateException();
          this("Unexpected SQLite exception during migrations", (Throwable)sQLiteException);
          q721.b.getClass();
          throw illegalStateException1;
        } 
      } 
    } finally {
      q721.c();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ia0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */