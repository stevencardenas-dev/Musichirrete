import android.content.Context;

public final class eg1 extends qx0 {
  public final int c;
  
  public final Context d;
  
  public eg1(Context paramContext) {
    super(9, 10);
    this.d = paramContext;
  }
  
  public eg1(Context paramContext, int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2);
    this.d = paramContext;
  }
  
  public final void a(ac0 paramac0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield d : Landroid/content/Context;
    //   9: astore #9
    //   11: aload_1
    //   12: invokevirtual getClass : ()Ljava/lang/Class;
    //   15: pop
    //   16: iload_2
    //   17: tableswitch default -> 36, 0 -> 322
    //   36: aload_1
    //   37: ldc 'CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))'
    //   39: invokevirtual h : (Ljava/lang/String;)V
    //   42: aload #9
    //   44: ldc 'androidx.work.util.preferences'
    //   46: iconst_0
    //   47: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   50: astore #8
    //   52: aload #8
    //   54: ldc 'reschedule_needed'
    //   56: invokeinterface contains : (Ljava/lang/String;)Z
    //   61: ifne -> 76
    //   64: aload #8
    //   66: ldc 'last_cancel_all_time_ms'
    //   68: invokeinterface contains : (Ljava/lang/String;)Z
    //   73: ifeq -> 178
    //   76: lconst_0
    //   77: lstore #4
    //   79: aload #8
    //   81: ldc 'last_cancel_all_time_ms'
    //   83: lconst_0
    //   84: invokeinterface getLong : (Ljava/lang/String;J)J
    //   89: lstore #6
    //   91: aload #8
    //   93: ldc 'reschedule_needed'
    //   95: iconst_0
    //   96: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   101: ifeq -> 107
    //   104: lconst_1
    //   105: lstore #4
    //   107: aload_1
    //   108: invokevirtual a : ()V
    //   111: aload_1
    //   112: iconst_2
    //   113: anewarray java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: ldc 'last_cancel_all_time_ms'
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: lload #6
    //   125: invokestatic valueOf : (J)Ljava/lang/Long;
    //   128: aastore
    //   129: invokevirtual k : ([Ljava/lang/Object;)V
    //   132: aload_1
    //   133: iconst_2
    //   134: anewarray java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: ldc 'reschedule_needed'
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: lload #4
    //   146: invokestatic valueOf : (J)Ljava/lang/Long;
    //   149: aastore
    //   150: invokevirtual k : ([Ljava/lang/Object;)V
    //   153: aload #8
    //   155: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   160: invokeinterface clear : ()Landroid/content/SharedPreferences$Editor;
    //   165: invokeinterface apply : ()V
    //   170: aload_1
    //   171: invokevirtual m : ()V
    //   174: aload_1
    //   175: invokevirtual g : ()V
    //   178: aload #9
    //   180: ldc 'androidx.work.util.id'
    //   182: iconst_0
    //   183: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   186: astore #8
    //   188: aload #8
    //   190: ldc 'next_job_scheduler_id'
    //   192: invokeinterface contains : (Ljava/lang/String;)Z
    //   197: ifne -> 212
    //   200: aload #8
    //   202: ldc 'next_job_scheduler_id'
    //   204: invokeinterface contains : (Ljava/lang/String;)Z
    //   209: ifeq -> 303
    //   212: aload #8
    //   214: ldc 'next_job_scheduler_id'
    //   216: iconst_0
    //   217: invokeinterface getInt : (Ljava/lang/String;I)I
    //   222: istore_3
    //   223: aload #8
    //   225: ldc 'next_alarm_manager_id'
    //   227: iconst_0
    //   228: invokeinterface getInt : (Ljava/lang/String;I)I
    //   233: istore_2
    //   234: aload_1
    //   235: invokevirtual a : ()V
    //   238: aload_1
    //   239: iconst_2
    //   240: anewarray java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: ldc 'next_job_scheduler_id'
    //   247: aastore
    //   248: dup
    //   249: iconst_1
    //   250: iload_3
    //   251: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   254: aastore
    //   255: invokevirtual k : ([Ljava/lang/Object;)V
    //   258: aload_1
    //   259: iconst_2
    //   260: anewarray java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: ldc 'next_alarm_manager_id'
    //   267: aastore
    //   268: dup
    //   269: iconst_1
    //   270: iload_2
    //   271: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   274: aastore
    //   275: invokevirtual k : ([Ljava/lang/Object;)V
    //   278: aload #8
    //   280: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   285: invokeinterface clear : ()Landroid/content/SharedPreferences$Editor;
    //   290: invokeinterface apply : ()V
    //   295: aload_1
    //   296: invokevirtual m : ()V
    //   299: aload_1
    //   300: invokevirtual g : ()V
    //   303: return
    //   304: astore #8
    //   306: aload_1
    //   307: invokevirtual g : ()V
    //   310: aload #8
    //   312: athrow
    //   313: astore #8
    //   315: aload_1
    //   316: invokevirtual g : ()V
    //   319: aload #8
    //   321: athrow
    //   322: aload_0
    //   323: getfield b : I
    //   326: bipush #10
    //   328: if_icmplt -> 354
    //   331: aload_1
    //   332: iconst_2
    //   333: anewarray java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: ldc 'reschedule_needed'
    //   340: aastore
    //   341: dup
    //   342: iconst_1
    //   343: iconst_1
    //   344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   347: aastore
    //   348: invokevirtual k : ([Ljava/lang/Object;)V
    //   351: goto -> 380
    //   354: aload #9
    //   356: ldc 'androidx.work.util.preferences'
    //   358: iconst_0
    //   359: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   362: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   367: ldc 'reschedule_needed'
    //   369: iconst_1
    //   370: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   375: invokeinterface apply : ()V
    //   380: return
    // Exception table:
    //   from	to	target	type
    //   111	174	313	finally
    //   238	299	304	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */