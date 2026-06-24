package in.krosbits.musicolet;

import a51;
import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.insets.ProtectionLayout;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import b81;
import c81;
import cd1;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import f;
import fb0;
import g92;
import hn;
import ik0;
import in.krosbits.android.widgets.SmartTextView;
import j50;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.crypto.CipherInputStream;
import jm1;
import jn;
import km0;
import lm0;
import m92;
import ml0;
import ms0;
import n0;
import ng1;
import nk0;
import nn0;
import og1;
import on0;
import p3;
import pc;
import ps0;
import q01;
import qn0;
import qn1;
import qo;
import qv;
import rk0;
import rs0;
import sn1;
import tb;
import tp;
import u00;
import v00;
import wf2;
import wk1;
import wn1;
import wo;
import ws2;
import xk1;
import xn1;
import yk1;
import yp1;
import z51;

public class RestoreActivity extends pc implements CompoundButton.OnCheckedChangeListener, ps0, View.OnClickListener {
  public static boolean A0;
  
  public static final Object B0 = new Object();
  
  public cd1 R;
  
  public v00 S;
  
  public TextView T;
  
  public TextView U;
  
  public TextView V;
  
  public TextView W;
  
  public LinearLayout X;
  
  public LinearLayout Y;
  
  public CheckBox Z;
  
  public CheckBox a0;
  
  public CheckBox b0;
  
  public CheckBox c0;
  
  public CheckBox d0;
  
  public CheckBox e0;
  
  public RadioGroup f0;
  
  public SmartTextView g0;
  
  public HashSet h0;
  
  public ArrayList i0;
  
  public boolean j0;
  
  public int k0;
  
  public long l0;
  
  public cd1 m0;
  
  public cd1 n0;
  
  public cd1 o0;
  
  public rk0 p0;
  
  public ik0 q0;
  
  public boolean r0;
  
  public final String[] s0;
  
  public CheckBox[] t0;
  
  public final q01 u0;
  
  public og1 v0;
  
  public boolean w0;
  
  public boolean x0;
  
  public String y0;
  
  public String z0;
  
  public RestoreActivity() {
    String str = oXrNDUqUkE.QrLQezYzDoZlFJC;
    this.s0 = new String[] { "PP", hbrAVtEa.rlLnQNfUUXTOBqb, "SSP", str, "OMV" };
    this.u0 = new q01(0);
    this.w0 = false;
    this.x0 = false;
  }
  
  public static void l0(RestoreActivity paramRestoreActivity) {
    String[] arrayOfString = new String[1];
    rk0 rk01 = t0((cd1)paramRestoreActivity.R.A("0.musicolet.backup"), arrayOfString).g();
    qn0 qn0 = rk01.b;
    Scanner scanner = new Scanner(ws2.n((u00)paramRestoreActivity.R.A("hash")));
    String str = scanner.next();
    scanner.close();
    if (str.equals(arrayOfString[0])) {
      ArrayList arrayList1;
      ArrayList arrayList2;
      paramRestoreActivity.k0 = rk01.m("v").e();
      paramRestoreActivity.l0 = rk01.m("time").h();
      paramRestoreActivity.p0 = rk01.m("equalizer").g();
      paramRestoreActivity.m0 = (cd1)paramRestoreActivity.R.A(rk01.m("db_file").i());
      nk0 nk02 = rk01.m("DB_BDN");
      if (nk02 != null)
        paramRestoreActivity.n0 = (cd1)paramRestoreActivity.R.A(nk02.i()); 
      if (qn0.containsKey("pcs"))
        paramRestoreActivity.q0 = rk01.m("pcs").f(); 
      if (qn0.containsKey("info"))
        rk01.m("info").f(); 
      rk0 rk02 = rk01.m("md5").g();
      Iterator iterator = ((on0)rk02.b.keySet()).iterator();
      while (true) {
        boolean bool = ((nn0)iterator).hasNext();
        arrayOfString = null;
        scanner = null;
        nk02 = null;
        if (bool) {
          String str1 = (String)(((nn0)iterator).b()).h;
          v00 v002 = paramRestoreActivity.R.A(str1);
          ExecutorService executorService = tb.a;
          try {
            CipherInputStream cipherInputStream = new CipherInputStream();
            this(ws2.n((u00)v002), tb.e());
            DigestInputStream digestInputStream = new DigestInputStream();
            this(cipherInputStream, tb.g());
            byte[] arrayOfByte = new byte[1024];
            while (digestInputStream.read(arrayOfByte, 0, 1024) != -1);
          } finally {
            executorService = null;
            executorService.printStackTrace();
          } 
          if (!rk02.m(str1).i().equals(executorService) && !str1.endsWith(".mpl")) {
            ag0.O0(2131886511, 1);
            break;
          } 
          continue;
        } 
        break;
      } 
      paramRestoreActivity.o0 = (cd1)paramRestoreActivity.R.A("0.favs");
      v00 v001 = paramRestoreActivity.R.A("0.names");
      nk0 nk01 = nk02;
      Scanner scanner1 = scanner;
      try {
        if (v001.f()) {
          nk01 = nk02;
          ObjectInputStream objectInputStream = new ObjectInputStream();
          nk01 = nk02;
          CipherInputStream cipherInputStream = new CipherInputStream();
          nk01 = nk02;
          this(ws2.n((u00)v001), tb.e());
          nk01 = nk02;
          this(cipherInputStream);
          nk01 = nk02;
          Object object = objectInputStream.readObject();
          String[] arrayOfString1 = arrayOfString;
          if (object != null) {
            nk01 = nk02;
            arrayList1 = (ArrayList)object;
          } 
          arrayList2 = arrayList1;
          objectInputStream.close();
        } 
      } finally {
        scanner1 = null;
        scanner1.printStackTrace();
      } 
      paramRestoreActivity.i0 = arrayList2;
      paramRestoreActivity.h0 = new HashSet(arrayList2.size());
      return;
    } 
    tp.f("hash0 error");
  }
  
  public static HashMap m0(RestoreActivity paramRestoreActivity) {
    // Byte code:
    //   0: aload_0
    //   1: getfield u0 : Lq01;
    //   4: astore #36
    //   6: ldc2_w 1000
    //   9: invokestatic sleep : (J)V
    //   12: new java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokevirtual getCacheDir : ()Ljava/io/File;
    //   20: ldc_w 'tdbs'
    //   23: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   26: astore #34
    //   28: aload #34
    //   30: invokevirtual mkdirs : ()Z
    //   33: pop
    //   34: new java/io/File
    //   37: dup
    //   38: aload #34
    //   40: aload_0
    //   41: getfield m0 : Lcd1;
    //   44: invokevirtual h : ()Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   50: astore #44
    //   52: aload #44
    //   54: invokevirtual deleteOnExit : ()V
    //   57: aload_0
    //   58: getfield m0 : Lcd1;
    //   61: aload #44
    //   63: invokestatic r0 : (Lcd1;Ljava/io/File;)V
    //   66: aload #44
    //   68: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   71: aconst_null
    //   72: iconst_1
    //   73: invokestatic openDatabase : (Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   76: astore #28
    //   78: aload #34
    //   80: astore #27
    //   82: iconst_0
    //   83: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   86: astore #45
    //   88: new java/util/HashMap
    //   91: dup
    //   92: iconst_0
    //   93: invokespecial <init> : (I)V
    //   96: astore #31
    //   98: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   101: astore #29
    //   103: aload_0
    //   104: getfield k0 : I
    //   107: istore_2
    //   108: aload #29
    //   110: invokevirtual getClass : ()Ljava/lang/Class;
    //   113: pop
    //   114: aload #28
    //   116: iload_2
    //   117: invokestatic g : (Landroid/database/sqlite/SQLiteDatabase;I)Landroid/database/Cursor;
    //   120: astore #46
    //   122: aload #46
    //   124: ldc_w 'COL_PATH'
    //   127: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   132: istore #16
    //   134: aload #46
    //   136: ldc_w 'rowid'
    //   139: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   144: istore #17
    //   146: ldc_w 'COL_PATH'
    //   149: astore #40
    //   151: aload #46
    //   153: ldc_w 'COL_TITLE'
    //   156: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   161: istore #7
    //   163: aload #46
    //   165: ldc_w 'COL_ARTIST'
    //   168: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   173: istore #9
    //   175: aload #46
    //   177: ldc_w 'COL_DURATION'
    //   180: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   185: istore #15
    //   187: ldc_w 'COL_DURATION'
    //   190: astore #41
    //   192: aload #46
    //   194: ldc_w 'COL_LASTPOS'
    //   197: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   202: istore #6
    //   204: ldc_w 'COL_LASTPOS'
    //   207: astore #42
    //   209: aload #46
    //   211: ldc_w 'COL_LAST_PLAYED'
    //   214: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   219: istore_3
    //   220: aload #46
    //   222: ldc_w 'COL_NUM_PLAYED'
    //   225: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   230: istore #14
    //   232: aload #46
    //   234: ldc_w 'COL_NUM_PLAYED_W'
    //   237: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   242: istore #13
    //   244: aload #46
    //   246: ldc_w 'COL_NUM_PLAYED_M'
    //   249: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   254: istore #4
    //   256: aload #46
    //   258: ldc_w 'COL_NUM_PLAYED_Y'
    //   261: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   266: istore #5
    //   268: aload #46
    //   270: ldc_w 'COL_LOGPATH'
    //   273: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   278: istore_2
    //   279: ldc_w 'COL_LOGPATH'
    //   282: astore #43
    //   284: aload #46
    //   286: invokeinterface getCount : ()I
    //   291: istore #10
    //   293: new java/util/ArrayList
    //   296: astore #29
    //   298: aload #29
    //   300: iload #10
    //   302: invokespecial <init> : (I)V
    //   305: new java/util/ArrayList
    //   308: astore #35
    //   310: aload #35
    //   312: iload #10
    //   314: invokespecial <init> : (I)V
    //   317: iconst_m1
    //   318: istore #11
    //   320: iconst_0
    //   321: istore #8
    //   323: aload #46
    //   325: invokeinterface moveToNext : ()Z
    //   330: istore #24
    //   332: iload #24
    //   334: ifeq -> 1007
    //   337: iload #8
    //   339: i2f
    //   340: ldc_w 50.0
    //   343: fmul
    //   344: iload #10
    //   346: i2f
    //   347: fdiv
    //   348: f2i
    //   349: istore #12
    //   351: iload #11
    //   353: iload #12
    //   355: if_icmpeq -> 435
    //   358: new java/lang/StringBuilder
    //   361: astore #30
    //   363: aload #30
    //   365: invokespecial <init> : ()V
    //   368: aload #30
    //   370: iload #12
    //   372: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload #30
    //   378: ldc_w '%'
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload_0
    //   386: aload #30
    //   388: invokevirtual toString : ()Ljava/lang/String;
    //   391: putfield z0 : Ljava/lang/String;
    //   394: aload_0
    //   395: getfield v0 : Log1;
    //   398: invokevirtual a : ()V
    //   401: goto -> 435
    //   404: astore #30
    //   406: aload #27
    //   408: astore #32
    //   410: aload #28
    //   412: astore #29
    //   414: aload #31
    //   416: astore_0
    //   417: aconst_null
    //   418: astore #28
    //   420: aload #30
    //   422: astore #27
    //   424: aload #28
    //   426: astore #30
    //   428: aload #32
    //   430: astore #28
    //   432: goto -> 2624
    //   435: aload #46
    //   437: iload #16
    //   439: invokeinterface getString : (I)Ljava/lang/String;
    //   444: astore #37
    //   446: aload #46
    //   448: iload #7
    //   450: invokeinterface getString : (I)Ljava/lang/String;
    //   455: astore #48
    //   457: aload #46
    //   459: iload #9
    //   461: invokeinterface getString : (I)Ljava/lang/String;
    //   466: astore #49
    //   468: aload #46
    //   470: iload #17
    //   472: invokeinterface getInt : (I)I
    //   477: istore #11
    //   479: aload #37
    //   481: ldc_w '/'
    //   484: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   487: ifeq -> 522
    //   490: new java/io/File
    //   493: astore #33
    //   495: aload #33
    //   497: aload #37
    //   499: invokespecial <init> : (Ljava/lang/String;)V
    //   502: aload #33
    //   504: invokestatic fromFile : (Ljava/io/File;)Landroid/net/Uri;
    //   507: invokevirtual toString : ()Ljava/lang/String;
    //   510: astore #37
    //   512: aload #33
    //   514: invokevirtual getParentFile : ()Ljava/io/File;
    //   517: astore #32
    //   519: goto -> 531
    //   522: aconst_null
    //   523: astore #32
    //   525: aconst_null
    //   526: astore #33
    //   528: goto -> 519
    //   531: aload #46
    //   533: iload #15
    //   535: invokeinterface getInt : (I)I
    //   540: istore #21
    //   542: aload #46
    //   544: iload #6
    //   546: invokeinterface getInt : (I)I
    //   551: istore #22
    //   553: aload #46
    //   555: iload_3
    //   556: invokeinterface getLong : (I)J
    //   561: lstore #25
    //   563: aload #46
    //   565: iload #14
    //   567: invokeinterface getInt : (I)I
    //   572: istore #20
    //   574: aload #46
    //   576: iload #13
    //   578: invokeinterface getInt : (I)I
    //   583: istore #19
    //   585: aload #46
    //   587: iload #4
    //   589: invokeinterface getInt : (I)I
    //   594: istore #23
    //   596: aload #46
    //   598: iload #5
    //   600: invokeinterface getInt : (I)I
    //   605: istore #18
    //   607: iload_2
    //   608: iconst_m1
    //   609: if_icmpeq -> 625
    //   612: aload #46
    //   614: iload_2
    //   615: invokeinterface getString : (I)Ljava/lang/String;
    //   620: astore #30
    //   622: goto -> 628
    //   625: aconst_null
    //   626: astore #30
    //   628: aload #30
    //   630: ifnonnull -> 656
    //   633: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   636: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   639: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   642: aload #37
    //   644: invokestatic q : (Landroid/content/Context;Ljava/lang/String;)Lv00;
    //   647: iconst_0
    //   648: invokevirtual e : (Lu00;Z)Ljava/lang/String;
    //   651: astore #30
    //   653: goto -> 659
    //   656: goto -> 653
    //   659: aload #30
    //   661: ifnull -> 679
    //   664: new ml0
    //   667: astore #38
    //   669: aload #38
    //   671: aload #30
    //   673: invokespecial <init> : (Ljava/lang/String;)V
    //   676: goto -> 682
    //   679: aconst_null
    //   680: astore #38
    //   682: aload #38
    //   684: ifnull -> 697
    //   687: aload #38
    //   689: invokevirtual d : ()Lml0;
    //   692: astore #39
    //   694: goto -> 700
    //   697: aconst_null
    //   698: astore #39
    //   700: new sn1
    //   703: astore #47
    //   705: aload #30
    //   707: ifnull -> 713
    //   710: goto -> 721
    //   713: ldc_w '~'
    //   716: astore #30
    //   718: goto -> 710
    //   721: aload #47
    //   723: aload #30
    //   725: iload #21
    //   727: i2l
    //   728: aload #48
    //   730: aload #36
    //   732: aload #49
    //   734: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   737: invokespecial <init> : (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    //   740: new wo
    //   743: astore #48
    //   745: aload #48
    //   747: aload #37
    //   749: aload #36
    //   751: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   754: aload #39
    //   756: ifnull -> 769
    //   759: aload #39
    //   761: getfield b : Ljava/lang/String;
    //   764: astore #30
    //   766: goto -> 787
    //   769: aload #32
    //   771: ifnull -> 784
    //   774: aload #32
    //   776: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   779: astore #30
    //   781: goto -> 787
    //   784: aconst_null
    //   785: astore #30
    //   787: aload #39
    //   789: ifnull -> 805
    //   792: aload #39
    //   794: getfield b : Ljava/lang/String;
    //   797: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   800: astore #32
    //   802: goto -> 823
    //   805: aload #32
    //   807: ifnull -> 820
    //   810: aload #32
    //   812: invokevirtual getName : ()Ljava/lang/String;
    //   815: astore #32
    //   817: goto -> 823
    //   820: aconst_null
    //   821: astore #32
    //   823: aload #38
    //   825: ifnull -> 841
    //   828: aload #38
    //   830: getfield b : Ljava/lang/String;
    //   833: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   836: astore #33
    //   838: goto -> 859
    //   841: aload #33
    //   843: ifnull -> 856
    //   846: aload #33
    //   848: invokevirtual getName : ()Ljava/lang/String;
    //   851: astore #33
    //   853: goto -> 859
    //   856: aconst_null
    //   857: astore #33
    //   859: new km0
    //   862: astore #37
    //   864: new qn1
    //   867: astore #38
    //   869: aload #38
    //   871: aload #48
    //   873: ldc_w '<unknown>'
    //   876: ldc_w '<unknown>'
    //   879: ldc_w '<unknown>'
    //   882: iload #21
    //   884: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   887: aload #37
    //   889: iload #11
    //   891: aload #38
    //   893: aconst_null
    //   894: aconst_null
    //   895: aconst_null
    //   896: lconst_0
    //   897: lconst_0
    //   898: lload #25
    //   900: iload #22
    //   902: i2l
    //   903: iload #20
    //   905: iload #19
    //   907: iload #23
    //   909: iload #18
    //   911: iconst_0
    //   912: iconst_0
    //   913: aload #36
    //   915: aload #30
    //   917: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   920: aload #36
    //   922: aload #32
    //   924: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   927: aload #36
    //   929: aload #33
    //   931: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   934: bipush #64
    //   936: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   939: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   942: getfield c : Llm0;
    //   945: aload #48
    //   947: invokevirtual b : (Lwo;)Lkm0;
    //   950: astore #30
    //   952: aload #30
    //   954: ifnull -> 967
    //   957: aload #47
    //   959: aload #30
    //   961: putfield e : Lkm0;
    //   964: goto -> 975
    //   967: aload #35
    //   969: aload #47
    //   971: invokevirtual add : (Ljava/lang/Object;)Z
    //   974: pop
    //   975: new android/util/Pair
    //   978: astore #30
    //   980: aload #30
    //   982: aload #37
    //   984: aload #47
    //   986: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   989: aload #29
    //   991: aload #30
    //   993: invokevirtual add : (Ljava/lang/Object;)Z
    //   996: pop
    //   997: iload #12
    //   999: istore #11
    //   1001: iinc #8, 1
    //   1004: goto -> 323
    //   1007: aload #29
    //   1009: astore #33
    //   1011: aload #46
    //   1013: invokeinterface close : ()V
    //   1018: aload #28
    //   1020: invokevirtual close : ()V
    //   1023: aload_0
    //   1024: aload_0
    //   1025: ldc_w 2131887105
    //   1028: invokevirtual getString : (I)Ljava/lang/String;
    //   1031: putfield z0 : Ljava/lang/String;
    //   1034: aload_0
    //   1035: getfield v0 : Log1;
    //   1038: invokevirtual a : ()V
    //   1041: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1044: getfield c : Llm0;
    //   1047: astore #28
    //   1049: iconst_0
    //   1050: istore #4
    //   1052: aload #35
    //   1054: aload #28
    //   1056: iconst_0
    //   1057: newarray int
    //   1059: invokevirtual i : ([I)Ljava/util/ArrayList;
    //   1062: invokestatic o : (Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   1065: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1068: invokevirtual getWritableDatabase : ()Landroid/database/sqlite/SQLiteDatabase;
    //   1071: astore #32
    //   1073: aload #32
    //   1075: invokevirtual beginTransactionNonExclusive : ()V
    //   1078: new android/content/ContentValues
    //   1081: astore #28
    //   1083: aload #28
    //   1085: iconst_5
    //   1086: invokespecial <init> : (I)V
    //   1089: aload #28
    //   1091: ldc_w 'COL_LAST_PLAYED'
    //   1094: aload #45
    //   1096: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1099: aload #28
    //   1101: ldc_w 'COL_NUM_PLAYED'
    //   1104: aload #45
    //   1106: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1109: aload #28
    //   1111: ldc_w 'COL_NUM_PLAYED_W'
    //   1114: aload #45
    //   1116: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1119: aload #28
    //   1121: ldc_w 'COL_NUM_PLAYED_M'
    //   1124: aload #45
    //   1126: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1129: aload #28
    //   1131: ldc_w 'COL_NUM_PLAYED_Y'
    //   1134: aload #45
    //   1136: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1139: aload #32
    //   1141: ldc_w 'TABLE_SONGS'
    //   1144: aload #28
    //   1146: ldc_w 'COL_LAST_PLAYED>0'
    //   1149: aconst_null
    //   1150: invokevirtual update : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   1153: istore_2
    //   1154: iload_2
    //   1155: ifle -> 1235
    //   1158: new java/lang/StringBuilder
    //   1161: astore #28
    //   1163: aload #28
    //   1165: invokespecial <init> : ()V
    //   1168: aload #28
    //   1170: ldc_w 'rdbdp_'
    //   1173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1176: pop
    //   1177: aload #28
    //   1179: iload_2
    //   1180: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1183: pop
    //   1184: aload #28
    //   1186: invokevirtual toString : ()Ljava/lang/String;
    //   1189: invokestatic F : (Ljava/lang/String;)V
    //   1192: goto -> 1235
    //   1195: astore #28
    //   1197: goto -> 1230
    //   1200: astore #28
    //   1202: goto -> 1230
    //   1205: astore #28
    //   1207: goto -> 1230
    //   1210: astore #28
    //   1212: goto -> 1207
    //   1215: astore #28
    //   1217: goto -> 1212
    //   1220: astore #28
    //   1222: goto -> 1217
    //   1225: astore #28
    //   1227: goto -> 1222
    //   1230: aload #28
    //   1232: invokevirtual printStackTrace : ()V
    //   1235: ldc_w 'COL_NUM_PLAYED_W'
    //   1238: astore #37
    //   1240: ldc_w 'COL_NUM_PLAYED_M'
    //   1243: astore #36
    //   1245: new java/util/HashMap
    //   1248: astore #29
    //   1250: aload #29
    //   1252: aload #33
    //   1254: invokevirtual size : ()I
    //   1257: invokespecial <init> : (I)V
    //   1260: new android/content/ContentValues
    //   1263: astore #45
    //   1265: aload #45
    //   1267: bipush #12
    //   1269: invokespecial <init> : (I)V
    //   1272: aload #33
    //   1274: invokevirtual size : ()I
    //   1277: istore_2
    //   1278: iconst_0
    //   1279: istore_3
    //   1280: ldc_w '/'
    //   1283: astore #28
    //   1285: iconst_m1
    //   1286: istore #5
    //   1288: aload #43
    //   1290: astore #35
    //   1292: aload #42
    //   1294: astore #34
    //   1296: aload #41
    //   1298: astore #30
    //   1300: aload #40
    //   1302: astore #31
    //   1304: iload #4
    //   1306: iload_2
    //   1307: if_icmpge -> 2105
    //   1310: aload #33
    //   1312: iload #4
    //   1314: invokevirtual get : (I)Ljava/lang/Object;
    //   1317: checkcast android/util/Pair
    //   1320: astore #38
    //   1322: iload_3
    //   1323: i2f
    //   1324: fstore_1
    //   1325: aload #33
    //   1327: invokevirtual size : ()I
    //   1330: istore #6
    //   1332: fload_1
    //   1333: ldc_w 40.0
    //   1336: fmul
    //   1337: iload #6
    //   1339: i2f
    //   1340: fdiv
    //   1341: f2i
    //   1342: bipush #50
    //   1344: iadd
    //   1345: istore #6
    //   1347: iload #5
    //   1349: iload #6
    //   1351: if_icmpeq -> 1423
    //   1354: new java/lang/StringBuilder
    //   1357: astore #39
    //   1359: aload #39
    //   1361: invokespecial <init> : ()V
    //   1364: aload #39
    //   1366: iload #6
    //   1368: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1371: pop
    //   1372: aload #39
    //   1374: ldc_w '%'
    //   1377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1380: pop
    //   1381: aload_0
    //   1382: aload #39
    //   1384: invokevirtual toString : ()Ljava/lang/String;
    //   1387: putfield z0 : Ljava/lang/String;
    //   1390: aload_0
    //   1391: getfield v0 : Log1;
    //   1394: invokevirtual a : ()V
    //   1397: goto -> 1423
    //   1400: astore #30
    //   1402: aload #29
    //   1404: astore_0
    //   1405: aload #27
    //   1407: astore #28
    //   1409: aconst_null
    //   1410: astore #29
    //   1412: aload #30
    //   1414: astore #27
    //   1416: aload #32
    //   1418: astore #30
    //   1420: goto -> 2624
    //   1423: aload #38
    //   1425: getfield first : Ljava/lang/Object;
    //   1428: checkcast km0
    //   1431: astore #41
    //   1433: aload #38
    //   1435: getfield second : Ljava/lang/Object;
    //   1438: checkcast sn1
    //   1441: getfield e : Lkm0;
    //   1444: astore #38
    //   1446: aload #41
    //   1448: getfield c : Lqn1;
    //   1451: getfield f : Lwo;
    //   1454: astore #39
    //   1456: aload #38
    //   1458: ifnull -> 1677
    //   1461: aload #45
    //   1463: invokevirtual clear : ()V
    //   1466: aload_0
    //   1467: getfield a0 : Landroid/widget/CheckBox;
    //   1470: invokevirtual isChecked : ()Z
    //   1473: ifeq -> 1557
    //   1476: aload #45
    //   1478: ldc_w 'COL_LAST_PLAYED'
    //   1481: aload #41
    //   1483: getfield m : J
    //   1486: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1489: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   1492: aload #45
    //   1494: ldc_w 'COL_NUM_PLAYED'
    //   1497: aload #41
    //   1499: getfield o : I
    //   1502: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1505: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1508: aload #45
    //   1510: aload #37
    //   1512: aload #41
    //   1514: getfield r : I
    //   1517: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1520: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1523: aload #45
    //   1525: aload #36
    //   1527: aload #41
    //   1529: getfield s : I
    //   1532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1535: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1538: aload #45
    //   1540: ldc_w 'COL_NUM_PLAYED_Y'
    //   1543: aload #41
    //   1545: getfield t : I
    //   1548: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1551: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1554: goto -> 1557
    //   1557: aload_0
    //   1558: getfield b0 : Landroid/widget/CheckBox;
    //   1561: invokevirtual isChecked : ()Z
    //   1564: ifeq -> 1585
    //   1567: aload #45
    //   1569: aload #34
    //   1571: aload #41
    //   1573: getfield n : J
    //   1576: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1579: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   1582: goto -> 1585
    //   1585: aload_0
    //   1586: aload #41
    //   1588: getfield b : I
    //   1591: aload #38
    //   1593: getfield b : I
    //   1596: invokevirtual u0 : (II)V
    //   1599: aload #38
    //   1601: getfield c : Lqn1;
    //   1604: getfield f : Lwo;
    //   1607: astore #40
    //   1609: aload #45
    //   1611: invokevirtual size : ()I
    //   1614: ifle -> 1643
    //   1617: aload #32
    //   1619: ldc_w 'TABLE_SONGS'
    //   1622: aload #45
    //   1624: ldc_w 'COL_PATH=?'
    //   1627: iconst_1
    //   1628: anewarray java/lang/String
    //   1631: dup
    //   1632: iconst_0
    //   1633: aload #40
    //   1635: invokevirtual toString : ()Ljava/lang/String;
    //   1638: aastore
    //   1639: invokevirtual update : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   1642: pop
    //   1643: aload #39
    //   1645: astore #38
    //   1647: aload #39
    //   1649: aload #40
    //   1651: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1654: ifeq -> 1661
    //   1657: aload #40
    //   1659: astore #38
    //   1661: aload #29
    //   1663: aload #38
    //   1665: aload #40
    //   1667: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1670: pop
    //   1671: iload_2
    //   1672: istore #5
    //   1674: goto -> 1754
    //   1677: new java/lang/StringBuilder
    //   1680: astore #38
    //   1682: aload #38
    //   1684: invokespecial <init> : ()V
    //   1687: iload_2
    //   1688: istore #5
    //   1690: aload #38
    //   1692: aload #41
    //   1694: getfield h : Ljava/lang/String;
    //   1697: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1700: pop
    //   1701: aload #38
    //   1703: aload #28
    //   1705: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1708: pop
    //   1709: aload #38
    //   1711: aload #41
    //   1713: getfield g : Ljava/lang/String;
    //   1716: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1719: pop
    //   1720: aload #38
    //   1722: invokevirtual toString : ()Ljava/lang/String;
    //   1725: astore #38
    //   1727: aload #38
    //   1729: ldc_w 'Storage'
    //   1732: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1735: istore #24
    //   1737: iload #24
    //   1739: ifeq -> 1760
    //   1742: aload #38
    //   1744: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   1747: astore #40
    //   1749: aload #40
    //   1751: ifnonnull -> 1800
    //   1754: iload_2
    //   1755: istore #5
    //   1757: goto -> 2092
    //   1760: aload #38
    //   1762: aload #28
    //   1764: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1767: ifeq -> 1754
    //   1770: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1773: aload #38
    //   1775: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   1778: astore #40
    //   1780: aload #40
    //   1782: ifnull -> 1754
    //   1785: aload #40
    //   1787: astore #38
    //   1789: aload #40
    //   1791: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   1794: ifnonnull -> 1800
    //   1797: goto -> 1754
    //   1800: aload #45
    //   1802: invokevirtual clear : ()V
    //   1805: aload #39
    //   1807: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   1810: astore #40
    //   1812: aload #28
    //   1814: astore #39
    //   1816: aload #45
    //   1818: aload #31
    //   1820: aload #40
    //   1822: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1825: aload #41
    //   1827: getfield c : Lqn1;
    //   1830: getfield g : I
    //   1833: istore #5
    //   1835: aload #31
    //   1837: astore #40
    //   1839: aload #45
    //   1841: aload #30
    //   1843: iload #5
    //   1845: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1848: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1851: aload #45
    //   1853: aload #35
    //   1855: aload #38
    //   1857: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1860: aload #30
    //   1862: astore #38
    //   1864: aload #45
    //   1866: ldc_w 'COL_VIS_FLAGS'
    //   1869: aload #41
    //   1871: getfield u : I
    //   1874: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1877: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1880: aload_0
    //   1881: getfield b0 : Landroid/widget/CheckBox;
    //   1884: invokevirtual isChecked : ()Z
    //   1887: istore #24
    //   1889: iload #24
    //   1891: ifeq -> 1909
    //   1894: aload #45
    //   1896: aload #34
    //   1898: aload #41
    //   1900: getfield n : J
    //   1903: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1906: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   1909: aload_0
    //   1910: getfield a0 : Landroid/widget/CheckBox;
    //   1913: invokevirtual isChecked : ()Z
    //   1916: istore #24
    //   1918: iload #24
    //   1920: ifeq -> 2001
    //   1923: aload #45
    //   1925: ldc_w 'COL_LAST_PLAYED'
    //   1928: aload #41
    //   1930: getfield m : J
    //   1933: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1936: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   1939: aload #45
    //   1941: ldc_w 'COL_NUM_PLAYED'
    //   1944: aload #41
    //   1946: getfield o : I
    //   1949: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1952: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1955: aload #45
    //   1957: aload #37
    //   1959: aload #41
    //   1961: getfield r : I
    //   1964: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1967: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1970: aload #45
    //   1972: aload #36
    //   1974: aload #41
    //   1976: getfield s : I
    //   1979: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1982: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1985: aload #45
    //   1987: ldc_w 'COL_NUM_PLAYED_Y'
    //   1990: aload #41
    //   1992: getfield t : I
    //   1995: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1998: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2001: aload #32
    //   2003: ldc_w 'TABLE_SONGS'
    //   2006: aconst_null
    //   2007: aload #45
    //   2009: iconst_4
    //   2010: invokevirtual insertWithOnConflict : (Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   2013: lstore #25
    //   2015: aload #40
    //   2017: astore #31
    //   2019: aload #39
    //   2021: astore #28
    //   2023: aload #38
    //   2025: astore #30
    //   2027: lload #25
    //   2029: ldc2_w -1
    //   2032: lcmp
    //   2033: ifeq -> 2092
    //   2036: aload_0
    //   2037: aload #41
    //   2039: getfield b : I
    //   2042: lload #25
    //   2044: l2i
    //   2045: invokevirtual u0 : (II)V
    //   2048: aload #40
    //   2050: astore #31
    //   2052: aload #39
    //   2054: astore #28
    //   2056: aload #38
    //   2058: astore #30
    //   2060: goto -> 2092
    //   2063: astore_0
    //   2064: aload #29
    //   2066: astore #31
    //   2068: aconst_null
    //   2069: astore #29
    //   2071: aload #27
    //   2073: astore #28
    //   2075: aload_0
    //   2076: astore #27
    //   2078: aload #32
    //   2080: astore #30
    //   2082: aload #31
    //   2084: astore_0
    //   2085: goto -> 2624
    //   2088: astore_0
    //   2089: goto -> 2064
    //   2092: iinc #4, 1
    //   2095: iload #6
    //   2097: istore #5
    //   2099: iinc #3, 1
    //   2102: goto -> 1304
    //   2105: aload #32
    //   2107: invokevirtual setTransactionSuccessful : ()V
    //   2110: aload_0
    //   2111: getfield a0 : Landroid/widget/CheckBox;
    //   2114: invokevirtual isChecked : ()Z
    //   2117: ifeq -> 2488
    //   2120: aload_0
    //   2121: getfield q0 : Lik0;
    //   2124: astore #28
    //   2126: aload #28
    //   2128: ifnull -> 2488
    //   2131: invokestatic e : ()Ljava/io/File;
    //   2134: invokevirtual listFiles : ()[Ljava/io/File;
    //   2137: astore #28
    //   2139: aload #28
    //   2141: ifnull -> 2197
    //   2144: aload #28
    //   2146: arraylength
    //   2147: istore_3
    //   2148: iconst_0
    //   2149: istore_2
    //   2150: iload_2
    //   2151: iload_3
    //   2152: if_icmpge -> 2197
    //   2155: aload #28
    //   2157: iload_2
    //   2158: aaload
    //   2159: astore #30
    //   2161: aload #30
    //   2163: invokevirtual delete : ()Z
    //   2166: pop
    //   2167: goto -> 2182
    //   2170: astore #30
    //   2172: goto -> 2188
    //   2175: astore #30
    //   2177: aload #30
    //   2179: invokevirtual printStackTrace : ()V
    //   2182: iinc #2, 1
    //   2185: goto -> 2150
    //   2188: aload #27
    //   2190: astore #28
    //   2192: aload #30
    //   2194: invokevirtual printStackTrace : ()V
    //   2197: iconst_m1
    //   2198: istore_2
    //   2199: iconst_0
    //   2200: istore_3
    //   2201: aload #27
    //   2203: astore #28
    //   2205: iload_3
    //   2206: aload_0
    //   2207: getfield q0 : Lik0;
    //   2210: getfield b : Ljava/util/ArrayList;
    //   2213: invokevirtual size : ()I
    //   2216: if_icmpge -> 2445
    //   2219: aload #27
    //   2221: astore #28
    //   2223: iload_3
    //   2224: i2f
    //   2225: ldc_w 10.0
    //   2228: fmul
    //   2229: aload_0
    //   2230: getfield q0 : Lik0;
    //   2233: getfield b : Ljava/util/ArrayList;
    //   2236: invokevirtual size : ()I
    //   2239: i2f
    //   2240: fdiv
    //   2241: f2i
    //   2242: bipush #90
    //   2244: iadd
    //   2245: istore #4
    //   2247: iload_2
    //   2248: iload #4
    //   2250: if_icmpeq -> 2327
    //   2253: aload #27
    //   2255: astore #28
    //   2257: new java/lang/StringBuilder
    //   2260: astore #30
    //   2262: aload #27
    //   2264: astore #28
    //   2266: aload #30
    //   2268: invokespecial <init> : ()V
    //   2271: aload #27
    //   2273: astore #28
    //   2275: aload #30
    //   2277: iload #4
    //   2279: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2282: pop
    //   2283: aload #27
    //   2285: astore #28
    //   2287: aload #30
    //   2289: ldc_w '%'
    //   2292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2295: pop
    //   2296: aload #27
    //   2298: astore #28
    //   2300: aload_0
    //   2301: aload #30
    //   2303: invokevirtual toString : ()Ljava/lang/String;
    //   2306: putfield z0 : Ljava/lang/String;
    //   2309: aload #27
    //   2311: astore #28
    //   2313: aload_0
    //   2314: getfield v0 : Log1;
    //   2317: invokevirtual a : ()V
    //   2320: goto -> 2327
    //   2323: astore_0
    //   2324: goto -> 2466
    //   2327: aload #27
    //   2329: astore #28
    //   2331: aload_0
    //   2332: getfield q0 : Lik0;
    //   2335: iload_3
    //   2336: invokevirtual m : (I)Lnk0;
    //   2339: invokevirtual i : ()Ljava/lang/String;
    //   2342: astore #33
    //   2344: aload #27
    //   2346: astore #28
    //   2348: aload_0
    //   2349: getfield R : Lcd1;
    //   2352: aload #33
    //   2354: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   2357: astore #31
    //   2359: aload #27
    //   2361: astore #28
    //   2363: new java/io/File
    //   2366: astore #30
    //   2368: aload #30
    //   2370: aload #27
    //   2372: aload #33
    //   2374: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   2377: aload #30
    //   2379: invokevirtual deleteOnExit : ()V
    //   2382: aload #31
    //   2384: checkcast cd1
    //   2387: aload #30
    //   2389: invokestatic r0 : (Lcd1;Ljava/io/File;)V
    //   2392: aload #30
    //   2394: aload #29
    //   2396: invokestatic h : (Ljava/io/File;Ljava/util/HashMap;)V
    //   2399: goto -> 2430
    //   2402: astore #28
    //   2404: aload #28
    //   2406: invokevirtual printStackTrace : ()V
    //   2409: goto -> 2430
    //   2412: astore_0
    //   2413: aload #27
    //   2415: astore #28
    //   2417: goto -> 2466
    //   2420: astore #28
    //   2422: aload #28
    //   2424: invokevirtual getMessage : ()Ljava/lang/String;
    //   2427: invokestatic v : (Ljava/lang/String;)V
    //   2430: aload #30
    //   2432: invokevirtual delete : ()Z
    //   2435: pop
    //   2436: iinc #3, 1
    //   2439: iload #4
    //   2441: istore_2
    //   2442: goto -> 2201
    //   2445: aload #27
    //   2447: astore #28
    //   2449: aload_0
    //   2450: ldc_w '100%'
    //   2453: putfield z0 : Ljava/lang/String;
    //   2456: aload_0
    //   2457: getfield v0 : Log1;
    //   2460: invokevirtual a : ()V
    //   2463: goto -> 2506
    //   2466: aload_0
    //   2467: invokevirtual printStackTrace : ()V
    //   2470: goto -> 2506
    //   2473: astore #27
    //   2475: aload #29
    //   2477: astore_0
    //   2478: aconst_null
    //   2479: astore #29
    //   2481: aload #32
    //   2483: astore #30
    //   2485: goto -> 2624
    //   2488: aload #27
    //   2490: astore #28
    //   2492: goto -> 2506
    //   2495: astore_0
    //   2496: aload #27
    //   2498: astore #28
    //   2500: aload_0
    //   2501: astore #27
    //   2503: goto -> 2475
    //   2506: aload #32
    //   2508: invokevirtual endTransaction : ()V
    //   2511: goto -> 2519
    //   2514: astore_0
    //   2515: aload_0
    //   2516: invokevirtual printStackTrace : ()V
    //   2519: aload #44
    //   2521: invokevirtual delete : ()Z
    //   2524: pop
    //   2525: aload #28
    //   2527: invokestatic s : (Ljava/io/File;)Lcd1;
    //   2530: invokevirtual e : ()Z
    //   2533: pop
    //   2534: goto -> 2677
    //   2537: astore_0
    //   2538: aload #27
    //   2540: astore #28
    //   2542: aload_0
    //   2543: astore #27
    //   2545: goto -> 2475
    //   2548: astore #27
    //   2550: aconst_null
    //   2551: astore #29
    //   2553: aload #32
    //   2555: astore #30
    //   2557: aload #34
    //   2559: astore #28
    //   2561: aload #31
    //   2563: astore_0
    //   2564: goto -> 2624
    //   2567: astore #27
    //   2569: aconst_null
    //   2570: astore #30
    //   2572: aconst_null
    //   2573: astore #29
    //   2575: goto -> 2557
    //   2578: astore #27
    //   2580: aconst_null
    //   2581: astore #30
    //   2583: aload #28
    //   2585: astore #29
    //   2587: goto -> 2557
    //   2590: astore_0
    //   2591: aload #27
    //   2593: astore #32
    //   2595: aconst_null
    //   2596: astore #30
    //   2598: aload #28
    //   2600: astore #29
    //   2602: aload_0
    //   2603: astore #27
    //   2605: aload #32
    //   2607: astore #28
    //   2609: aload #31
    //   2611: astore_0
    //   2612: goto -> 2624
    //   2615: astore #27
    //   2617: goto -> 2580
    //   2620: astore_0
    //   2621: goto -> 2591
    //   2624: aload #27
    //   2626: invokevirtual printStackTrace : ()V
    //   2629: aload #29
    //   2631: ifnull -> 2639
    //   2634: aload #29
    //   2636: invokevirtual close : ()V
    //   2639: aload #30
    //   2641: ifnull -> 2659
    //   2644: aload #30
    //   2646: invokevirtual endTransaction : ()V
    //   2649: goto -> 2659
    //   2652: astore #27
    //   2654: aload #27
    //   2656: invokevirtual printStackTrace : ()V
    //   2659: aload #44
    //   2661: invokevirtual delete : ()Z
    //   2664: pop
    //   2665: aload #28
    //   2667: invokestatic s : (Ljava/io/File;)Lcd1;
    //   2670: invokevirtual e : ()Z
    //   2673: pop
    //   2674: aload_0
    //   2675: astore #29
    //   2677: aload #29
    //   2679: areturn
    //   2680: astore_0
    //   2681: aload #29
    //   2683: ifnull -> 2691
    //   2686: aload #29
    //   2688: invokevirtual close : ()V
    //   2691: aload #30
    //   2693: ifnull -> 2711
    //   2696: aload #30
    //   2698: invokevirtual endTransaction : ()V
    //   2701: goto -> 2711
    //   2704: astore #27
    //   2706: aload #27
    //   2708: invokevirtual printStackTrace : ()V
    //   2711: aload #44
    //   2713: invokevirtual delete : ()Z
    //   2716: pop
    //   2717: aload #28
    //   2719: invokestatic s : (Ljava/io/File;)Lcd1;
    //   2722: invokevirtual e : ()Z
    //   2725: pop
    //   2726: aload_0
    //   2727: athrow
    // Exception table:
    //   from	to	target	type
    //   98	108	2620	finally
    //   108	122	2615	finally
    //   122	134	2590	finally
    //   134	146	2578	finally
    //   151	187	2578	finally
    //   192	204	2578	finally
    //   209	279	2578	finally
    //   284	293	2578	finally
    //   293	305	2578	finally
    //   305	317	2578	finally
    //   323	332	2578	finally
    //   358	401	404	finally
    //   435	519	404	finally
    //   531	607	404	finally
    //   612	622	404	finally
    //   633	653	404	finally
    //   664	676	404	finally
    //   687	694	404	finally
    //   700	705	404	finally
    //   721	754	404	finally
    //   759	766	404	finally
    //   774	781	404	finally
    //   792	802	404	finally
    //   810	817	404	finally
    //   828	838	404	finally
    //   846	853	404	finally
    //   859	952	404	finally
    //   957	964	404	finally
    //   967	975	404	finally
    //   975	997	404	finally
    //   1011	1023	2578	finally
    //   1023	1049	2567	finally
    //   1052	1073	2567	finally
    //   1073	1078	2548	finally
    //   1078	1089	1225	finally
    //   1089	1099	1220	finally
    //   1099	1109	1215	finally
    //   1109	1119	1210	finally
    //   1119	1129	1205	finally
    //   1129	1139	1200	finally
    //   1139	1154	1195	finally
    //   1158	1192	1195	finally
    //   1230	1235	2548	finally
    //   1245	1260	2548	finally
    //   1260	1278	2537	finally
    //   1310	1322	2088	finally
    //   1325	1332	2088	finally
    //   1354	1397	1400	finally
    //   1423	1456	2088	finally
    //   1461	1554	1400	finally
    //   1557	1582	1400	finally
    //   1585	1643	1400	finally
    //   1647	1657	1400	finally
    //   1661	1671	1400	finally
    //   1677	1687	2088	finally
    //   1690	1737	2088	finally
    //   1742	1749	1400	finally
    //   1760	1780	2088	finally
    //   1789	1797	2088	finally
    //   1800	1812	2088	finally
    //   1816	1835	2088	finally
    //   1839	1860	2088	finally
    //   1864	1889	2088	finally
    //   1894	1909	1400	finally
    //   1909	1918	2088	finally
    //   1923	2001	1400	finally
    //   2001	2015	2063	finally
    //   2036	2048	2063	finally
    //   2105	2126	2495	finally
    //   2131	2139	2170	finally
    //   2144	2148	2170	finally
    //   2161	2167	2175	java/lang/Exception
    //   2161	2167	2170	finally
    //   2177	2182	2170	finally
    //   2192	2197	2323	finally
    //   2205	2219	2323	finally
    //   2223	2247	2323	finally
    //   2257	2262	2323	finally
    //   2266	2271	2323	finally
    //   2275	2283	2323	finally
    //   2287	2296	2323	finally
    //   2300	2309	2323	finally
    //   2313	2320	2323	finally
    //   2331	2344	2323	finally
    //   2348	2359	2323	finally
    //   2363	2368	2323	finally
    //   2368	2392	2412	finally
    //   2392	2399	2420	android/database/SQLException
    //   2392	2399	2402	finally
    //   2404	2409	2412	finally
    //   2422	2430	2412	finally
    //   2430	2436	2412	finally
    //   2449	2463	2412	finally
    //   2466	2470	2473	finally
    //   2506	2511	2514	java/lang/Exception
    //   2624	2629	2680	finally
    //   2644	2649	2652	java/lang/Exception
    //   2696	2701	2704	java/lang/Exception
  }
  
  public static void n0(RestoreActivity paramRestoreActivity, HashMap paramHashMap) {
    ArrayList<Object> arrayList = s0(xk1.b(t0(paramRestoreActivity.o0, new String[1]).g(), paramRestoreActivity.u0), paramHashMap);
    b81 b81 = c81.c(MyApplication.i.getApplicationContext());
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      km0 km0 = (km0)arrayList.get(b);
      b++;
      b81.a(km0);
    } 
    c81.j();
  }
  
  public static void o0(RestoreActivity paramRestoreActivity, HashMap paramHashMap) {
    Iterator<String> iterator = paramRestoreActivity.h0.iterator();
    for (int i = -1; iterator.hasNext(); i = k) {
      String str1;
      String str2 = iterator.next();
      int k = i + 1;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str2);
      stringBuilder1.append(" (");
      stringBuilder1.append(k);
      stringBuilder1.append("/");
      stringBuilder1.append(paramRestoreActivity.h0.size());
      stringBuilder1.append(")");
      paramRestoreActivity.z0 = stringBuilder1.toString();
      paramRestoreActivity.v0.a();
      try {
        c81.g(MyApplication.i.getApplicationContext());
        str1 = c81.b(str2);
        if (str1 != null) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0 && paramRestoreActivity.f0.getCheckedRadioButtonId() == 2131297353) {
          i = k;
          continue;
        } 
      } finally {}
      cd1 cd11 = paramRestoreActivity.R;
      StringBuilder stringBuilder2 = new StringBuilder();
      this();
      stringBuilder2.append(str2);
      stringBuilder2.append(".mpl");
      v00 v001 = cd11.A(stringBuilder2.toString());
      String[] arrayOfString = new String[1];
      ArrayList arrayList = s0(xk1.b(t0((cd1)v001, arrayOfString).g(), paramRestoreActivity.u0), paramHashMap);
      Context context = MyApplication.i.getApplicationContext();
      if (stringBuilder1 == null)
        str1 = str2; 
      b81 b81 = c81.f(context, str1);
      int j = i;
      if (i != 0) {
        j = i;
        if (paramRestoreActivity.f0.getCheckedRadioButtonId() == 2131297332) {
          byte b = 2;
          while (true) {
            j = i;
            if (i != 0) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str2);
              stringBuilder.append(" (");
              stringBuilder.append(b);
              stringBuilder.append(")");
              String str = stringBuilder.toString();
              b81.b = str;
              if (c81.b(str) != null) {
                i = 1;
              } else {
                i = 0;
              } 
              b++;
              continue;
            } 
            break;
          } 
        } 
      } 
      if (j == 0) {
        b81.b(arrayList);
        c81.a(MyApplication.i.getApplicationContext(), b81.b);
      } else {
        if (paramRestoreActivity.f0.getCheckedRadioButtonId() == 2131297344) {
          ArrayList arrayList1 = b81.c;
          if (arrayList1 != null)
            arrayList1.clear(); 
          HashSet hashSet = b81.e;
          if (hashSet != null)
            hashSet.clear(); 
        } 
        b81.b(arrayList);
      } 
      c81.m(MyApplication.i.getApplicationContext(), b81);
    } 
  }
  
  public static void p0(RestoreActivity paramRestoreActivity, HashMap paramHashMap) {
    v00 v001 = paramRestoreActivity.R.A("0.qstk");
    String[] arrayOfString = new String[1];
    rk0 rk01 = t0((cd1)v001, arrayOfString).g();
    lm0 lm0 = MyApplication.j.c;
    HashMap hashMap = lm0.w;
    if (hashMap != null) {
      hashMap.putAll(paramHashMap);
    } else {
      lm0.w = paramHashMap;
    } 
    wk1 wk12 = yk1.d(MyApplication.j.c, rk01);
    int j = wk12.c;
    Stack<xn1> stack = wk12.b;
    if (stack.size() == 0) {
      ArrayList arrayList = new ArrayList(0);
      stack.add(new xn1(0, ag0.O(MyApplication.i.getApplicationContext(), stack), arrayList, null));
    } 
    int i = j;
    if (j < 0)
      i = 0; 
    wk1 wk11 = new wk1(stack, i);
    yk1.f(wk11, new File(paramRestoreActivity.getFilesDir(), "0.qstk"));
    MyApplication.q = wk11;
  }
  
  public static void q0(RestoreActivity paramRestoreActivity) {
    String[] arrayOfString = paramRestoreActivity.s0;
    SettingsActivity settingsActivity = SettingsActivity.m0;
    if (settingsActivity != null)
      settingsActivity.finish(); 
    Thread.sleep(1000L);
    List<String> list2 = Arrays.asList(new String[] { "LV", "LSDK", "B_GEN_SPT", "FID", "EQSPJA", "swcscshn", "sexdsc10" });
    List<String> list1 = Arrays.asList(new String[] { 
          "CEQPR_0", "CEQPR_1", "CEQPR_2", "CEQPR_3", "CEQPR_4", "CEQPR_5", "CEQPR_0_0", "CEQPR_1_0", "CEQPR_2_0", "CEQPR_3_0", 
          "CEQPR_4_0", "CEQPR_5_0", "EQUPJA", "EQUPJA_0", "EQSELP_0", "EQSELP_1", "EQSELP_2", "EQSELP_3", "EQSELP_4", "EQSELP_5", 
          "EQSELP_0_0", "EQSELP_1_0", "EQSELP_2_0", "EQSELP_3_0", "EQSELP_4_0", "EQSELP_5_0", "IEQON_0", "IEQON_1", "IEQON_2", "IEQON_3", 
          "IEQON_4", "IEQON_5", "EQLDENHS_0", "EQLDENHS_1", "EQLDENHS_2", "EQLDENHS_3", "EQLDENHS_4", "EQLDENHS_5" });
    HashSet<String> hashSet = new HashSet(list2.size());
    hashSet.addAll(list2);
    if (!tb.f().equals(paramRestoreActivity.p0))
      hashSet.addAll(list1); 
    if (Build.VERSION.SDK_INT < 28)
      hashSet.add("k_b_mn_alex"); 
    hashSet.add("s_disl2");
    hashSet.add("s_pmth2");
    hashSet.add("k_i_cmrdtfil");
    hashSet.add("k_i_lsfccz");
    boolean bool = MyApplication.o().getBoolean("k_b_hwsie", false);
    String str = MyApplication.o().getString("k_s_lng", null);
    for (byte b = 0; b < arrayOfString.length; b++) {
      v00 v001 = paramRestoreActivity.R.A(arrayOfString[b]);
      if (v001.f()) {
        String[] arrayOfString1 = new String[1];
        nk0 nk0 = t0((cd1)v001, arrayOfString1);
        if (nk0 != null) {
          ik0 ik01 = nk0.f();
          SharedPreferences sharedPreferences = MyApplication.i.getApplicationContext().getSharedPreferences(arrayOfString[b], 0);
          Set set = sharedPreferences.getAll().keySet();
          SharedPreferences.Editor editor = sharedPreferences.edit();
          for (String str1 : set) {
            if (!hashSet.contains(str1))
              editor.remove(str1); 
          } 
          for (byte b1 = 0; b1 < ik01.b.size(); b1++) {
            rk0 rk01 = ik01.m(b1).g();
            String str1 = rk01.m("key").i();
            if (!hashSet.contains(str1)) {
              String str2 = rk01.m("type").i();
              if ("Integer".equals(str2)) {
                editor.putInt(str1, rk01.m("value").e());
              } else if ("Boolean".equals(str2)) {
                editor.putBoolean(str1, rk01.m("value").c());
              } else if ("String".equals(str2)) {
                editor.putString(str1, rk01.m("value").i());
              } else if ("Long".equals(str2)) {
                editor.putLong(str1, rk01.m("value").h());
              } else if (IGBYXeDFmKYajx.EmQjputA.equals(str2)) {
                editor.putFloat(str1, rk01.m("value").d());
              } else if ("Set".equals(str2)) {
                ik0 ik02 = rk01.m("value").f();
                ArrayList arrayList = ik02.b;
                HashSet<String> hashSet1 = new HashSet(arrayList.size());
                for (byte b2 = 0; b2 < arrayList.size(); b2++)
                  hashSet1.add(ik02.m(b2).i()); 
                editor.putStringSet(str1, hashSet1);
              } 
            } 
          } 
          editor.commit();
        } 
      } 
    } 
    if (paramRestoreActivity.k0 <= 157)
      b.b(); 
    if (paramRestoreActivity.k0 >= 340)
      try {
        paramRestoreActivity.v0();
      } finally {
        hashSet = null;
      }  
    if (ag0.c0() && MyApplication.o().getInt("k_i_nstl", jm1.d) == 1)
      MyApplication.o().edit().remove("k_i_nstl").apply(); 
    m92.I(MyApplication.i.getApplicationContext());
    if (TextUtils.equals(MyApplication.o().getString("k_s_lng", null), str))
      paramRestoreActivity.x0 = true; 
    if (MyApplication.o().getBoolean("k_b_hwsie", false) != bool) {
      paramRestoreActivity.w0 = true;
      wn1.f = MyApplication.o().getBoolean("k_b_hwsie", false);
    } 
    p3.b = MyApplication.o().getBoolean("k_b_dsblaald", true);
    z51.t = MyApplication.o().getString("igthar_wl", "A An The");
    z51.r = MyApplication.o().getInt("igthar_t", 0);
    z51.s = MyApplication.o().getInt("alpnmsr_t", 0);
    z51.q = null;
    ag0.h = MyApplication.o().getBoolean("B_PF_FILNMIOTTL", false);
    p3.c = MyApplication.o().getInt("k_i_fldjpg", jm1.e);
    ag0.i = MyApplication.o().getBoolean("k_b_hwsic", false);
    a51.b();
    j50.g = null;
    j50.e = null;
    j50.f = null;
    if (Build.VERSION.SDK_INT >= 33) {
      wf2.S();
      wf2.U();
      wf2.T();
      wf2.V();
    } 
  }
  
  public static void r0(cd1 paramcd1, File paramFile) {
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    CipherInputStream cipherInputStream = new CipherInputStream(ws2.n((u00)paramcd1), tb.e());
    byte[] arrayOfByte = new byte[1024];
    while (true) {
      int i = cipherInputStream.read(arrayOfByte);
      if (i != -1) {
        fileOutputStream.write(arrayOfByte, 0, i);
        continue;
      } 
      fileOutputStream.flush();
      fileOutputStream.close();
      cipherInputStream.close();
      return;
    } 
  }
  
  public static ArrayList s0(ArrayList<Object> paramArrayList, HashMap<wo, wo> paramHashMap) {
    ArrayList<km0> arrayList1 = new ArrayList(paramArrayList.size());
    ArrayList<Pair> arrayList = new ArrayList(paramArrayList.size());
    ArrayList<sn1> arrayList2 = new ArrayList(paramArrayList.size());
    int k = paramArrayList.size();
    int j = 0;
    int i = 0;
    while (i < k) {
      sn1 sn1;
      km0 km02 = (km0)paramArrayList.get(i);
      i++;
      km0 km04 = km02;
      lm0 lm0 = MyApplication.j.c;
      qn1 qn1 = km04.c;
      km0 km03 = lm0.b(qn1.f);
      km0 km01 = km03;
      if (km03 == null) {
        wo wo = (wo)paramHashMap.get(qn1.f);
        km01 = km03;
        if (wo != null)
          km01 = MyApplication.j.c.b(wo); 
      } 
      if (km01 != null) {
        sn1 sn11 = new sn1("~", qn1.g, null, null);
        sn11.e = km01;
        sn1 = sn11;
      } else {
        yp1 yp1 = MyApplication.F;
        Context context = MyApplication.i.getApplicationContext();
        wo wo = qn1.f;
        String str1 = qn1.e;
        String str2 = yp1.e((u00)v00.q(context, ag0.Q0(wo)), false);
        int m = qn1.g;
        if (str2 != null) {
          sn1 = new sn1(str2, m, qn1.b, str1);
          arrayList2.add(sn1);
        } else {
          sn1 = new sn1("~", m, qn1.b, (String)sn1);
        } 
      } 
      arrayList.add(new Pair(sn1, km04));
    } 
    if (!arrayList2.isEmpty())
      qv.o(arrayList2, MyApplication.j.c.i(new int[0])); 
    k = arrayList.size();
    i = j;
    while (i < k) {
      paramArrayList = (ArrayList<Object>)arrayList.get(i);
      j = i + 1;
      Pair pair = (Pair)paramArrayList;
      km0 km02 = (km0)pair.second;
      sn1 sn1 = (sn1)pair.first;
      km0 km03 = sn1.e;
      km0 km01 = km03;
      if (km03 == null)
        km01 = km02; 
      i = j;
      if (km01 != null) {
        qn1 qn1 = km01.c;
        if (!Objects.equals(km02.c.f, qn1.f) && !"~".equals(sn1.a))
          paramHashMap.put(km02.c.f, qn1.f); 
        arrayList1.add(km01);
        i = j;
      } 
    } 
    return arrayList1;
  }
  
  public static nk0 t0(cd1 paramcd1, String[] paramArrayOfString) {
    try {
      FileInputStream fileInputStream = ws2.n((u00)paramcd1);
      CipherInputStream cipherInputStream = new CipherInputStream();
      this(fileInputStream, tb.e());
      DigestInputStream digestInputStream = new DigestInputStream();
      this(cipherInputStream, tb.g());
      InputStreamReader inputStreamReader = new InputStreamReader();
      this(digestInputStream);
      nk0 nk0 = fb0.n(inputStreamReader);
      inputStreamReader.close();
      paramArrayOfString[0] = tb.c(digestInputStream.getMessageDigest().digest());
      return nk0;
    } finally {
      paramcd1 = null;
      paramcd1.printStackTrace();
    } 
  }
  
  public final boolean F(Integer[] paramArrayOfInteger) {
    this.h0.clear();
    for (byte b = 0; b < paramArrayOfInteger.length; b++)
      this.h0.add(this.i0.get(paramArrayOfInteger[b].intValue())); 
    x0();
    return true;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    LinearLayout linearLayout;
    if (paramCompoundButton == this.e0) {
      linearLayout = this.X;
      if (paramBoolean) {
        linearLayout.setVisibility(0);
        paramBoolean = c81.g(MyApplication.i.getApplicationContext()).isEmpty();
        linearLayout = this.Y;
        if (!paramBoolean) {
          linearLayout.setVisibility(0);
        } else {
          linearLayout.setVisibility(8);
        } 
      } else {
        linearLayout.setVisibility(8);
        this.Y.setVisibility(8);
      } 
    } else {
      CheckBox checkBox = this.a0;
      if (linearLayout == checkBox)
        if (this.r0 && checkBox.isChecked()) {
          this.g0.setVisibility(0);
        } else {
          this.g0.setVisibility(8);
        }  
    } 
    w0();
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    byte b = 0;
    if (i == 2131297020) {
      Integer[] arrayOfInteger = new Integer[this.h0.size()];
      for (i = 0; b < this.i0.size(); i = j) {
        int j = i;
        if (this.h0.contains(this.i0.get(b))) {
          arrayOfInteger[i] = Integer.valueOf(b);
          j = i + 1;
        } 
        b++;
      } 
      ms0 ms0 = new ms0((Context)this);
      ms0.q(2131886355);
      ms0.h(this.i0);
      ms0.n(2131887324);
      ms0.k(2131887336);
      ms0.l(2131886467);
      ms0.N = arrayOfInteger;
      ms0.E = null;
      ms0.F = null;
      ms0.G = this;
      ms0.H = true;
      ms0.D = (rs0)new f(27, this);
      ms0.p();
      return;
    } 
    if (i == 2131296429) {
      b.b = false;
      this.W.setEnabled(false);
      og1 og11 = new og1(this, 1);
      this.v0 = og11;
      ExecutorService executorService = tb.a;
      String str = ag0.a;
      og11.executeOnExecutor(executorService, new Object[0]);
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    if (!MyApplication.k()) {
      finish();
      return;
    } 
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(null);
    setContentView(2131492909);
    Toolbar toolbar = (Toolbar)findViewById(2131297607);
    g0(toolbar);
    Y().f0(2131887198);
    Y().Z(true);
    g92.e((View)toolbar, false);
    g92.d(findViewById(2131297555), true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)findViewById(2131296941);
    hn hn = new hn(8, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    String str2 = getIntent().getStringExtra("path");
    String str4 = getIntent().getStringExtra(eRUgfgGAccgka.DzuFWv);
    this.j0 = getIntent().getBooleanExtra("fresh", false);
    if (str2 == null) {
      finish();
      return;
    } 
    v00 v001 = v00.r(MyApplication.i.getApplicationContext(), str2, null, null, -1L);
    this.S = v001;
    if (v001 == null || !v001.l()) {
      finish();
      return;
    } 
    String str1 = str4;
    if (str4 == null)
      str1 = this.S.h(); 
    cd1 cd11 = (cd1)v00.s(getCacheDir()).A("_trstr");
    this.R = cd11;
    cd11.E();
    this.T = (TextView)findViewById(2131297820);
    this.U = (TextView)findViewById(2131297723);
    this.V = (TextView)findViewById(2131297825);
    this.X = (LinearLayout)findViewById(2131297020);
    this.Y = (LinearLayout)findViewById(2131296997);
    this.Z = (CheckBox)findViewById(2131296556);
    this.a0 = (CheckBox)findViewById(2131296543);
    this.g0 = (SmartTextView)findViewById(2131297678);
    this.b0 = (CheckBox)findViewById(2131296539);
    this.c0 = (CheckBox)findViewById(2131296536);
    this.d0 = (CheckBox)findViewById(2131296549);
    this.e0 = (CheckBox)findViewById(2131296544);
    this.f0 = (RadioGroup)findViewById(2131297371);
    RadioButton radioButton = (RadioButton)findViewById(2131297353);
    radioButton = (RadioButton)findViewById(2131297344);
    radioButton = (RadioButton)findViewById(2131297336);
    this.W = (TextView)findViewById(2131296429);
    (new Thread((Runnable)new ng1(this, 0))).start();
    this.t0 = new CheckBox[] { this.Z, this.a0, this.b0, this.c0, this.d0, this.e0 };
    this.T.setText(ml0.a((MyApplication.F.c(str1)).b));
    og1 og11 = new og1(this, 0);
    this.v0 = og11;
    object = tb.a;
    String str3 = ag0.a;
    og11.executeOnExecutor((Executor)object, new Object[0]);
    getWindow().addFlags(128);
  }
  
  public final void onDestroy() {
    try {
      og1 og11 = this.v0;
    } finally {
      Exception exception = null;
    } 
    synchronized (B0) {
      null.notifyAll();
      this.v0 = null;
      null = this.R;
      if (null != null)
        null.e(); 
      super.onDestroy();
      return;
    } 
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    if (paramMenuItem.getItemId() == 16908332)
      finish(); 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle) {}
  
  public final void onRestoreInstanceState(Bundle paramBundle, PersistableBundle paramPersistableBundle) {}
  
  public final void recreate() {}
  
  public final void u0(int paramInt1, int paramInt2) {
    try {
      cd1 cd11 = this.R;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(paramInt1);
      stringBuilder.append(".info");
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void v0() {
    // Byte code:
    //   0: new java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual getCacheDir : ()Ljava/io/File;
    //   8: ldc_w 'tbddbs'
    //   11: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   14: astore_3
    //   15: aload_3
    //   16: invokevirtual mkdirs : ()Z
    //   19: pop
    //   20: new java/io/File
    //   23: dup
    //   24: aload_3
    //   25: aload_0
    //   26: getfield n0 : Lcd1;
    //   29: invokevirtual h : ()Ljava/lang/String;
    //   32: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   35: astore #4
    //   37: aload #4
    //   39: invokevirtual deleteOnExit : ()V
    //   42: aload_0
    //   43: getfield n0 : Lcd1;
    //   46: aload #4
    //   48: invokestatic r0 : (Lcd1;Ljava/io/File;)V
    //   51: aconst_null
    //   52: astore_1
    //   53: aload #4
    //   55: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   58: aconst_null
    //   59: iconst_1
    //   60: invokestatic openDatabase : (Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   63: astore_2
    //   64: aload_2
    //   65: astore_1
    //   66: getstatic in/krosbits/musicolet/MyApplication.k : Lc;
    //   69: aload_2
    //   70: invokevirtual c : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   73: aload_2
    //   74: ifnull -> 83
    //   77: aload_2
    //   78: astore_1
    //   79: aload_1
    //   80: invokevirtual close : ()V
    //   83: aload #4
    //   85: invokevirtual delete : ()Z
    //   88: pop
    //   89: aload_3
    //   90: invokestatic s : (Ljava/io/File;)Lcd1;
    //   93: invokevirtual e : ()Z
    //   96: pop
    //   97: return
    //   98: astore_2
    //   99: aload_2
    //   100: invokevirtual printStackTrace : ()V
    //   103: aload_1
    //   104: ifnull -> 83
    //   107: goto -> 79
    //   110: astore_2
    //   111: aload_1
    //   112: ifnull -> 119
    //   115: aload_1
    //   116: invokevirtual close : ()V
    //   119: aload #4
    //   121: invokevirtual delete : ()Z
    //   124: pop
    //   125: aload_3
    //   126: invokestatic s : (Ljava/io/File;)Lcd1;
    //   129: invokevirtual e : ()Z
    //   132: pop
    //   133: aload_2
    //   134: athrow
    // Exception table:
    //   from	to	target	type
    //   53	64	98	finally
    //   66	73	98	finally
    //   99	103	110	finally
  }
  
  public final void w0() {
    boolean bool1;
    boolean bool2 = false;
    byte b = 0;
    while (true) {
      CheckBox[] arrayOfCheckBox = this.t0;
      bool1 = bool2;
      if (b < arrayOfCheckBox.length) {
        if (arrayOfCheckBox[b].isChecked()) {
          bool1 = true;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    this.W.setEnabled(bool1);
  }
  
  public final void x0() {
    this.V.setText(getResources().getQuantityString(2131755057, this.h0.size(), new Object[] { Integer.valueOf(this.h0.size()) }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\RestoreActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */