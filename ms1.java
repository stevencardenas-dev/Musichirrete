import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

public final class ms1 {
  public static final String d = qp0.j("SystemJobInfoConverter");
  
  public final ComponentName a;
  
  public final fb0 b;
  
  public final boolean c;
  
  public ms1(Context paramContext, fb0 paramfb0, boolean paramBoolean) {
    this.b = paramfb0;
    this.a = new ComponentName(paramContext.getApplicationContext(), SystemJobService.class);
    this.c = paramBoolean;
  }
  
  public final JobInfo a(y72 paramy72, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: getfield j : Lhr;
    //   4: astore #9
    //   6: new android/os/PersistableBundle
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #10
    //   15: aload #10
    //   17: ldc 'EXTRA_WORK_SPEC_ID'
    //   19: aload_1
    //   20: getfield a : Ljava/lang/String;
    //   23: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   26: aload #10
    //   28: ldc 'EXTRA_WORK_SPEC_GENERATION'
    //   30: aload_1
    //   31: getfield t : I
    //   34: invokevirtual putInt : (Ljava/lang/String;I)V
    //   37: aload #10
    //   39: ldc 'EXTRA_IS_PERIODIC'
    //   41: aload_1
    //   42: invokevirtual c : ()Z
    //   45: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   48: new android/app/job/JobInfo$Builder
    //   51: dup
    //   52: iload_2
    //   53: aload_0
    //   54: getfield a : Landroid/content/ComponentName;
    //   57: invokespecial <init> : (ILandroid/content/ComponentName;)V
    //   60: astore #12
    //   62: aload #9
    //   64: getfield c : Z
    //   67: istore #6
    //   69: aload #9
    //   71: getfield i : Ljava/util/Set;
    //   74: astore #11
    //   76: aload #12
    //   78: iload #6
    //   80: invokevirtual setRequiresCharging : (Z)Landroid/app/job/JobInfo$Builder;
    //   83: astore #12
    //   85: aload #9
    //   87: getfield d : Z
    //   90: istore #6
    //   92: aload #12
    //   94: iload #6
    //   96: invokevirtual setRequiresDeviceIdle : (Z)Landroid/app/job/JobInfo$Builder;
    //   99: aload #10
    //   101: invokevirtual setExtras : (Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;
    //   104: astore #10
    //   106: aload #9
    //   108: invokevirtual a : ()Landroid/net/NetworkRequest;
    //   111: astore #12
    //   113: getstatic android/os/Build$VERSION.SDK_INT : I
    //   116: istore #4
    //   118: iconst_0
    //   119: istore_3
    //   120: iload #4
    //   122: bipush #28
    //   124: if_icmplt -> 149
    //   127: aload #12
    //   129: ifnull -> 149
    //   132: aload #10
    //   134: invokevirtual getClass : ()Ljava/lang/Class;
    //   137: pop
    //   138: aload #10
    //   140: aload #12
    //   142: invokevirtual setRequiredNetwork : (Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;
    //   145: pop
    //   146: goto -> 305
    //   149: aload #9
    //   151: getfield a : Lc21;
    //   154: astore #14
    //   156: iload #4
    //   158: bipush #30
    //   160: if_icmplt -> 195
    //   163: aload #14
    //   165: getstatic c21.h : Lc21;
    //   168: if_acmpne -> 195
    //   171: aload #10
    //   173: new android/net/NetworkRequest$Builder
    //   176: dup
    //   177: invokespecial <init> : ()V
    //   180: bipush #25
    //   182: invokevirtual addCapability : (I)Landroid/net/NetworkRequest$Builder;
    //   185: invokevirtual build : ()Landroid/net/NetworkRequest;
    //   188: invokevirtual setRequiredNetwork : (Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;
    //   191: pop
    //   192: goto -> 305
    //   195: aload #14
    //   197: invokevirtual ordinal : ()I
    //   200: istore #5
    //   202: iload #5
    //   204: ifeq -> 296
    //   207: iload #5
    //   209: iconst_1
    //   210: if_icmpeq -> 291
    //   213: iconst_2
    //   214: istore_2
    //   215: iload #5
    //   217: iconst_2
    //   218: if_icmpeq -> 298
    //   221: iconst_3
    //   222: istore_2
    //   223: iload #5
    //   225: iconst_3
    //   226: if_icmpeq -> 298
    //   229: iconst_4
    //   230: istore_2
    //   231: iload #5
    //   233: iconst_4
    //   234: if_icmpeq -> 240
    //   237: goto -> 250
    //   240: iload #4
    //   242: bipush #26
    //   244: if_icmplt -> 250
    //   247: goto -> 298
    //   250: invokestatic h : ()Lqp0;
    //   253: astore #12
    //   255: new java/lang/StringBuilder
    //   258: dup
    //   259: ldc 'API version too low. Cannot convert network type value '
    //   261: invokespecial <init> : (Ljava/lang/String;)V
    //   264: astore #13
    //   266: aload #13
    //   268: aload #14
    //   270: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload #13
    //   276: invokevirtual toString : ()Ljava/lang/String;
    //   279: astore #13
    //   281: aload #12
    //   283: getstatic ms1.d : Ljava/lang/String;
    //   286: aload #13
    //   288: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   291: iconst_1
    //   292: istore_2
    //   293: goto -> 298
    //   296: iconst_0
    //   297: istore_2
    //   298: aload #10
    //   300: iload_2
    //   301: invokevirtual setRequiredNetworkType : (I)Landroid/app/job/JobInfo$Builder;
    //   304: pop
    //   305: iload #6
    //   307: ifne -> 338
    //   310: aload_1
    //   311: getfield l : Lqb;
    //   314: getstatic qb.c : Lqb;
    //   317: if_acmpne -> 325
    //   320: iconst_0
    //   321: istore_2
    //   322: goto -> 327
    //   325: iconst_1
    //   326: istore_2
    //   327: aload #10
    //   329: aload_1
    //   330: getfield m : J
    //   333: iload_2
    //   334: invokevirtual setBackoffCriteria : (JI)Landroid/app/job/JobInfo$Builder;
    //   337: pop
    //   338: aload_1
    //   339: invokevirtual a : ()J
    //   342: lstore #7
    //   344: aload_0
    //   345: getfield b : Lfb0;
    //   348: invokevirtual getClass : ()Ljava/lang/Class;
    //   351: pop
    //   352: lload #7
    //   354: invokestatic currentTimeMillis : ()J
    //   357: lsub
    //   358: lconst_0
    //   359: invokestatic max : (JJ)J
    //   362: lstore #7
    //   364: iload #4
    //   366: bipush #28
    //   368: if_icmpgt -> 382
    //   371: aload #10
    //   373: lload #7
    //   375: invokevirtual setMinimumLatency : (J)Landroid/app/job/JobInfo$Builder;
    //   378: pop
    //   379: goto -> 421
    //   382: lload #7
    //   384: lconst_0
    //   385: lcmp
    //   386: ifle -> 400
    //   389: aload #10
    //   391: lload #7
    //   393: invokevirtual setMinimumLatency : (J)Landroid/app/job/JobInfo$Builder;
    //   396: pop
    //   397: goto -> 421
    //   400: aload_1
    //   401: getfield q : Z
    //   404: ifne -> 421
    //   407: aload_0
    //   408: getfield c : Z
    //   411: ifeq -> 421
    //   414: aload #10
    //   416: iconst_1
    //   417: invokevirtual setImportantWhileForeground : (Z)Landroid/app/job/JobInfo$Builder;
    //   420: pop
    //   421: aload #11
    //   423: invokeinterface isEmpty : ()Z
    //   428: ifne -> 512
    //   431: aload #11
    //   433: invokeinterface iterator : ()Ljava/util/Iterator;
    //   438: astore #11
    //   440: aload #11
    //   442: invokeinterface hasNext : ()Z
    //   447: ifeq -> 490
    //   450: aload #11
    //   452: invokeinterface next : ()Ljava/lang/Object;
    //   457: checkcast gr
    //   460: astore #12
    //   462: aload #12
    //   464: getfield b : Z
    //   467: istore_2
    //   468: aload #10
    //   470: new android/app/job/JobInfo$TriggerContentUri
    //   473: dup
    //   474: aload #12
    //   476: getfield a : Landroid/net/Uri;
    //   479: iload_2
    //   480: invokespecial <init> : (Landroid/net/Uri;I)V
    //   483: invokevirtual addTriggerContentUri : (Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;
    //   486: pop
    //   487: goto -> 440
    //   490: aload #10
    //   492: aload #9
    //   494: getfield g : J
    //   497: invokevirtual setTriggerContentUpdateDelay : (J)Landroid/app/job/JobInfo$Builder;
    //   500: pop
    //   501: aload #10
    //   503: aload #9
    //   505: getfield h : J
    //   508: invokevirtual setTriggerContentMaxDelay : (J)Landroid/app/job/JobInfo$Builder;
    //   511: pop
    //   512: aload #10
    //   514: iconst_0
    //   515: invokevirtual setPersisted : (Z)Landroid/app/job/JobInfo$Builder;
    //   518: pop
    //   519: getstatic android/os/Build$VERSION.SDK_INT : I
    //   522: istore #4
    //   524: iload #4
    //   526: bipush #26
    //   528: if_icmplt -> 553
    //   531: aload #10
    //   533: aload #9
    //   535: getfield e : Z
    //   538: invokevirtual setRequiresBatteryNotLow : (Z)Landroid/app/job/JobInfo$Builder;
    //   541: pop
    //   542: aload #10
    //   544: aload #9
    //   546: getfield f : Z
    //   549: invokevirtual setRequiresStorageNotLow : (Z)Landroid/app/job/JobInfo$Builder;
    //   552: pop
    //   553: aload_1
    //   554: getfield k : I
    //   557: ifle -> 565
    //   560: iconst_1
    //   561: istore_2
    //   562: goto -> 567
    //   565: iconst_0
    //   566: istore_2
    //   567: lload #7
    //   569: lconst_0
    //   570: lcmp
    //   571: ifle -> 576
    //   574: iconst_1
    //   575: istore_3
    //   576: iload #4
    //   578: bipush #31
    //   580: if_icmplt -> 605
    //   583: aload_1
    //   584: getfield q : Z
    //   587: ifeq -> 605
    //   590: iload_2
    //   591: ifne -> 605
    //   594: iload_3
    //   595: ifne -> 605
    //   598: aload #10
    //   600: iconst_1
    //   601: invokevirtual setExpedited : (Z)Landroid/app/job/JobInfo$Builder;
    //   604: pop
    //   605: iload #4
    //   607: bipush #35
    //   609: if_icmplt -> 628
    //   612: aload_1
    //   613: getfield x : Ljava/lang/String;
    //   616: astore_1
    //   617: aload_1
    //   618: ifnull -> 628
    //   621: aload #10
    //   623: aload_1
    //   624: invokevirtual setTraceTag : (Ljava/lang/String;)Landroid/app/job/JobInfo$Builder;
    //   627: pop
    //   628: aload #10
    //   630: invokevirtual build : ()Landroid/app/job/JobInfo;
    //   633: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ms1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */