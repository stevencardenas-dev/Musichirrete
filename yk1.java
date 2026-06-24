import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.musicolet.MusicService;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public abstract class yk1 {
  public static final km0 a = new km0(0, new qn1(new wo("delete", null), null, null, null, 0), null, null, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, null, null, null, 0);
  
  public static rk0 a(ArrayList paramArrayList) {
    ik0 ik0;
    rk0 rk0 = new rk0();
    try {
      ik0 = new ik0();
      this(paramArrayList.size());
      for (byte b = 0; b < paramArrayList.size(); b++)
        ik0.l(ag0.Q0(((km0)paramArrayList.get(b)).c.f)); 
    } finally {}
    rk0.b.put("S_P", ik0);
    return rk0;
  }
  
  public static rk0 b(xn1 paramxn1) {
    rk0 rk0 = new rk0();
    qn0 qn0 = rk0.b;
    try {
      String str = paramxn1.h;
      ArrayList arrayList1 = paramxn1.b;
      rk0.l("S0_PQ_T", str);
      rk0.k("S0_PQ_CPS", Integer.valueOf(paramxn1.e));
      rk0.k(ckOPp.mvzTTz, Integer.valueOf(paramxn1.g));
      qn0.put("S0_PQ_OQS", a(arrayList1));
      ArrayList<Number> arrayList = paramxn1.f();
      if (MusicService.C0 && arrayList != null && arrayList.size() == arrayList1.size()) {
        ik0 ik0 = new ik0();
        this(arrayList.size());
        for (byte b = 0; b < arrayList.size(); b++)
          ik0.k(arrayList.get(b)); 
        qn0.put("S0_PQ_SI", ik0);
      } 
    } finally {}
    return rk0;
  }
  
  public static ArrayList c(lm0 paramlm0, rk0 paramrk0, boolean paramBoolean, boolean[] paramArrayOfboolean) {
    q01 q01 = new q01(0);
    lm0 lm01 = null;
    try {
      ik02 = paramrk0.m("S_P").f();
      arrayList = ik02.b;
    } finally {
      paramrk0 = null;
    } 
    ArrayList<km0> arrayList3 = new ArrayList();
    this(arrayList.size());
    ArrayList<km0> arrayList2;
    ik0 ik01;
    rk0 rk01;
    rk0 rk02;
    rk0 rk03;
    ik0 ik02;
    ArrayList arrayList;
    byte b = 0;
    while (true)
      arrayList2 = arrayList3; 
    ArrayList<km0> arrayList1 = arrayList2;
    if (arrayList2 == null)
      arrayList1 = new ArrayList<km0>(); 
    return arrayList1;
  }
  
  public static wk1 d(lm0 paramlm0, rk0 paramrk0) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'S0_CPQ'
    //   3: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   6: invokevirtual e : ()I
    //   9: istore_2
    //   10: aload_1
    //   11: ldc 'S0_PQ'
    //   13: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   16: invokevirtual f : ()Lik0;
    //   19: astore #12
    //   21: new java/util/Stack
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #13
    //   30: iconst_0
    //   31: istore #5
    //   33: iconst_0
    //   34: istore_3
    //   35: aload #12
    //   37: getfield b : Ljava/util/ArrayList;
    //   40: invokevirtual size : ()I
    //   43: istore #4
    //   45: iconst_1
    //   46: istore #9
    //   48: iload_3
    //   49: iload #4
    //   51: if_icmpge -> 323
    //   54: aload #12
    //   56: iload_3
    //   57: invokevirtual m : (I)Lnk0;
    //   60: invokevirtual g : ()Lrk0;
    //   63: astore_1
    //   64: aconst_null
    //   65: astore #10
    //   67: aload_1
    //   68: ldc 'S0_PQ_T'
    //   70: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   73: invokevirtual i : ()Ljava/lang/String;
    //   76: astore #14
    //   78: aload_1
    //   79: ldc 'S0_PQ_CPS'
    //   81: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   84: invokevirtual e : ()I
    //   87: istore #6
    //   89: aload_1
    //   90: ldc 'S0_PQ_LKP'
    //   92: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   95: invokevirtual e : ()I
    //   98: istore #8
    //   100: aload_1
    //   101: ldc 'S0_PQ_OQS'
    //   103: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   106: invokevirtual g : ()Lrk0;
    //   109: astore #11
    //   111: aload_0
    //   112: aload #11
    //   114: iconst_1
    //   115: aconst_null
    //   116: invokestatic c : (Llm0;Lrk0;Z[Z)Ljava/util/ArrayList;
    //   119: astore #15
    //   121: aload_1
    //   122: ldc 'S0_PQ_SI'
    //   124: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   127: astore_1
    //   128: aload_1
    //   129: ifnull -> 209
    //   132: aload_1
    //   133: invokevirtual f : ()Lik0;
    //   136: astore #11
    //   138: aload #11
    //   140: getfield b : Ljava/util/ArrayList;
    //   143: invokevirtual size : ()I
    //   146: istore #7
    //   148: iload #7
    //   150: aload #15
    //   152: invokevirtual size : ()I
    //   155: if_icmpne -> 209
    //   158: new java/util/ArrayList
    //   161: astore_1
    //   162: aload_1
    //   163: iload #7
    //   165: invokespecial <init> : (I)V
    //   168: iconst_0
    //   169: istore #4
    //   171: iload #4
    //   173: iload #7
    //   175: if_icmpge -> 206
    //   178: aload_1
    //   179: aload #11
    //   181: iload #4
    //   183: invokevirtual m : (I)Lnk0;
    //   186: invokevirtual e : ()I
    //   189: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   192: invokevirtual add : (Ljava/lang/Object;)Z
    //   195: pop
    //   196: iinc #4, 1
    //   199: goto -> 171
    //   202: astore_1
    //   203: goto -> 270
    //   206: goto -> 214
    //   209: iconst_1
    //   210: istore #9
    //   212: aconst_null
    //   213: astore_1
    //   214: new xn1
    //   217: astore #11
    //   219: aload #11
    //   221: iload #6
    //   223: aload #14
    //   225: aload #15
    //   227: aload_1
    //   228: invokespecial <init> : (ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   231: getstatic yk1.a : Lkm0;
    //   234: astore #14
    //   236: aload_1
    //   237: ifnull -> 243
    //   240: goto -> 246
    //   243: iconst_0
    //   244: istore #9
    //   246: aload #11
    //   248: aload #14
    //   250: iload #9
    //   252: iconst_0
    //   253: invokevirtual k : (Lkm0;ZZ)V
    //   256: aload #11
    //   258: iload #8
    //   260: invokevirtual l : (I)V
    //   263: aload #11
    //   265: astore_1
    //   266: goto -> 277
    //   269: astore_1
    //   270: aload_1
    //   271: invokevirtual printStackTrace : ()V
    //   274: aload #10
    //   276: astore_1
    //   277: aload_1
    //   278: ifnull -> 301
    //   281: aload_1
    //   282: invokevirtual i : ()Z
    //   285: ifne -> 301
    //   288: aload #13
    //   290: aload_1
    //   291: invokevirtual add : (Ljava/lang/Object;)Z
    //   294: pop
    //   295: iload_2
    //   296: istore #4
    //   298: goto -> 314
    //   301: iload_2
    //   302: istore #4
    //   304: iload_3
    //   305: iload_2
    //   306: if_icmpgt -> 314
    //   309: iload_2
    //   310: iconst_1
    //   311: isub
    //   312: istore #4
    //   314: iinc #3, 1
    //   317: iload #4
    //   319: istore_2
    //   320: goto -> 35
    //   323: iload_2
    //   324: istore_3
    //   325: iload_2
    //   326: aload #13
    //   328: invokevirtual size : ()I
    //   331: if_icmplt -> 342
    //   334: aload #13
    //   336: invokevirtual size : ()I
    //   339: iconst_1
    //   340: isub
    //   341: istore_3
    //   342: iload_3
    //   343: ifge -> 352
    //   346: iload #5
    //   348: istore_2
    //   349: goto -> 354
    //   352: iload_3
    //   353: istore_2
    //   354: new wk1
    //   357: dup
    //   358: aload #13
    //   360: iload_2
    //   361: invokespecial <init> : (Ljava/util/Stack;I)V
    //   364: areturn
    // Exception table:
    //   from	to	target	type
    //   67	111	269	finally
    //   111	128	202	finally
    //   132	168	202	finally
    //   178	196	202	finally
    //   214	236	202	finally
    //   246	263	202	finally
  }
  
  public static void e(File paramFile, int[] paramArrayOfint) {
    n21.F("SU>SQQA");
    File file = paramFile.getParentFile();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramFile.getName());
    stringBuilder.append(".tmp");
    file = new File(file, stringBuilder.toString());
    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
    dataOutputStream.writeInt(paramArrayOfint.length);
    for (byte b = 0; b < paramArrayOfint.length; b++)
      dataOutputStream.writeInt(paramArrayOfint[b]); 
    dataOutputStream.close();
    paramFile.delete();
    file.renameTo(paramFile);
    n21.F("SU>SQQA>e");
  }
  
  public static void f(wk1 paramwk1, File paramFile) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{yk1}} */
    try {
      l = System.currentTimeMillis();
      rk0 = new rk0();
      this();
      rk0.k(hbrAVtEa.oIh, Integer.valueOf(paramwk1.c));
      ik0 = new ik0();
      this(paramwk1.b.size());
      for (byte b = 0; b < paramwk1.b.size(); b++)
        ik0.j(b(paramwk1.b.get(b))); 
    } finally {}
    rk0.b.put("S0_PQ", ik0);
    xk1.d(rk0, paramFile);
    StringBuilder stringBuilder = new StringBuilder();
    this();
    long l;
    ik0 ik0;
    rk0 rk0;
    stringBuilder.append("SRTD2:jn? ");
    stringBuilder.append(System.currentTimeMillis() - l);
    n21.F(stringBuilder.toString());
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{yk1}} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */