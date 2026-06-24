import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class sr2 {
  public static final f1 c = new f1("SplitInstallInfoProvider");
  
  public final Context a;
  
  public final String b;
  
  public sr2(Context paramContext) {
    this.a = paramContext;
    this.b = paramContext.getPackageName();
  }
  
  public static boolean d(String paramString) {
    return (paramString.startsWith("config.") || paramString.contains(IGBYXeDFmKYajx.kGfGiXVmNzpbA));
  }
  
  public static final HashSet e(PackageInfo paramPackageInfo) {
    HashSet<String> hashSet = new HashSet();
    for (String str : f(paramPackageInfo)) {
      if (!d(str))
        hashSet.add(str); 
    } 
    return hashSet;
  }
  
  public static final HashSet f(PackageInfo paramPackageInfo) {
    f1 f11 = c;
    Bundle bundle = paramPackageInfo.applicationInfo.metaData;
    HashSet<? super String> hashSet = new HashSet();
    if (bundle != null) {
      String str = bundle.getString("com.android.dynamic.apk.fused.modules");
      if (str == null || str.isEmpty()) {
        f11.a("App has no fused modules.", new Object[0]);
      } else {
        Collections.addAll(hashSet, str.split(",", -1));
        hashSet.remove("");
        hashSet.remove("base");
      } 
    } 
    String[] arrayOfString = paramPackageInfo.splitNames;
    if (arrayOfString != null) {
      f11.a("Adding splits from package manager: %s", new Object[] { Arrays.toString((Object[])arrayOfString) });
      Collections.addAll(hashSet, arrayOfString);
    } else {
      f11.a("No splits are found or app cannot be found in package manager.", new Object[0]);
    } 
    up2 up2 = ar2.a.get();
    if (up2 != null) {
      io1 io1 = up2.a;
      synchronized (io1.c) {
        HashSet<? extends String> hashSet1 = new HashSet();
        this(io1.c);
        hashSet.addAll(hashSet1);
        return hashSet;
      } 
    } 
    return hashSet;
  }
  
  public final a42 a(Bundle paramBundle) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic sr2.c : Lf1;
    //   5: astore #4
    //   7: aload_1
    //   8: ifnonnull -> 24
    //   11: aload #4
    //   13: ldc 'No metadata found in Context.'
    //   15: iconst_0
    //   16: anewarray java/lang/Object
    //   19: invokevirtual f : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aconst_null
    //   23: areturn
    //   24: aload_1
    //   25: ldc 'com.android.vending.splits'
    //   27: invokevirtual getInt : (Ljava/lang/String;)I
    //   30: istore_2
    //   31: iload_2
    //   32: ifne -> 49
    //   35: aload #4
    //   37: getstatic com/google/android/gms/cast/framework/internal/featurehighlight/aS/xveccWbRzqx.iFXMzQuWt : Ljava/lang/String;
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual f : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aconst_null
    //   48: areturn
    //   49: aload_0
    //   50: getfield a : Landroid/content/Context;
    //   53: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   56: iload_2
    //   57: invokevirtual getXml : (I)Landroid/content/res/XmlResourceParser;
    //   60: astore #7
    //   62: new q01
    //   65: dup
    //   66: iconst_1
    //   67: invokespecial <init> : (I)V
    //   70: astore #8
    //   72: aload #7
    //   74: invokeinterface next : ()I
    //   79: iconst_1
    //   80: if_icmpeq -> 330
    //   83: aload #7
    //   85: invokeinterface getEventType : ()I
    //   90: iconst_2
    //   91: if_icmpne -> 72
    //   94: aload #7
    //   96: invokeinterface getName : ()Ljava/lang/String;
    //   101: ldc 'splits'
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: ifne -> 129
    //   109: aload #7
    //   111: invokestatic F0 : (Landroid/content/res/XmlResourceParser;)V
    //   114: goto -> 72
    //   117: astore_1
    //   118: goto -> 339
    //   121: astore_1
    //   122: goto -> 339
    //   125: astore_1
    //   126: goto -> 339
    //   129: aload #7
    //   131: invokeinterface next : ()I
    //   136: iconst_3
    //   137: if_icmpeq -> 72
    //   140: aload #7
    //   142: invokeinterface getEventType : ()I
    //   147: iconst_2
    //   148: if_icmpne -> 129
    //   151: aload #7
    //   153: invokeinterface getName : ()Ljava/lang/String;
    //   158: ldc 'module'
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 322
    //   166: ldc 'name'
    //   168: aload #7
    //   170: invokestatic E0 : (Ljava/lang/String;Landroid/content/res/XmlResourceParser;)Ljava/lang/String;
    //   173: astore_1
    //   174: aload_1
    //   175: ifnull -> 314
    //   178: aload #7
    //   180: invokeinterface next : ()I
    //   185: iconst_3
    //   186: if_icmpeq -> 129
    //   189: aload #7
    //   191: invokeinterface getEventType : ()I
    //   196: iconst_2
    //   197: if_icmpne -> 178
    //   200: aload #7
    //   202: invokeinterface getName : ()Ljava/lang/String;
    //   207: ldc 'language'
    //   209: invokevirtual equals : (Ljava/lang/Object;)Z
    //   212: ifne -> 223
    //   215: aload #7
    //   217: invokestatic F0 : (Landroid/content/res/XmlResourceParser;)V
    //   220: goto -> 178
    //   223: aload #7
    //   225: invokeinterface next : ()I
    //   230: iconst_3
    //   231: if_icmpeq -> 178
    //   234: aload #7
    //   236: invokeinterface getEventType : ()I
    //   241: iconst_2
    //   242: if_icmpne -> 223
    //   245: aload #7
    //   247: invokeinterface getName : ()Ljava/lang/String;
    //   252: ldc 'entry'
    //   254: invokevirtual equals : (Ljava/lang/Object;)Z
    //   257: ifeq -> 306
    //   260: ldc 'key'
    //   262: aload #7
    //   264: invokestatic E0 : (Ljava/lang/String;Landroid/content/res/XmlResourceParser;)Ljava/lang/String;
    //   267: astore #6
    //   269: ldc 'split'
    //   271: aload #7
    //   273: invokestatic E0 : (Ljava/lang/String;Landroid/content/res/XmlResourceParser;)Ljava/lang/String;
    //   276: astore #5
    //   278: aload #7
    //   280: invokestatic F0 : (Landroid/content/res/XmlResourceParser;)V
    //   283: aload #6
    //   285: ifnull -> 223
    //   288: aload #5
    //   290: ifnull -> 223
    //   293: aload #8
    //   295: aload_1
    //   296: aload #6
    //   298: aload #5
    //   300: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   303: goto -> 223
    //   306: aload #7
    //   308: invokestatic F0 : (Landroid/content/res/XmlResourceParser;)V
    //   311: goto -> 223
    //   314: aload #7
    //   316: invokestatic F0 : (Landroid/content/res/XmlResourceParser;)V
    //   319: goto -> 129
    //   322: aload #7
    //   324: invokestatic F0 : (Landroid/content/res/XmlResourceParser;)V
    //   327: goto -> 129
    //   330: aload #8
    //   332: invokevirtual c : ()La42;
    //   335: astore_1
    //   336: goto -> 351
    //   339: ldc 'SplitInstall'
    //   341: ldc_w 'Error while parsing splits.xml'
    //   344: aload_1
    //   345: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   348: pop
    //   349: aload_3
    //   350: astore_1
    //   351: aload_1
    //   352: ifnonnull -> 367
    //   355: aload #4
    //   357: ldc_w 'Can't parse languages metadata.'
    //   360: iconst_0
    //   361: anewarray java/lang/Object
    //   364: invokevirtual f : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   367: aload_1
    //   368: areturn
    //   369: astore_1
    //   370: aload #4
    //   372: getstatic com/google/android/gms/common/api/Gldr/hbrAVtEa.HJSHfwgdDZNvRu : Ljava/lang/String;
    //   375: iconst_0
    //   376: anewarray java/lang/Object
    //   379: invokevirtual f : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   382: aconst_null
    //   383: areturn
    // Exception table:
    //   from	to	target	type
    //   49	62	369	android/content/res/Resources$NotFoundException
    //   72	114	125	org/xmlpull/v1/XmlPullParserException
    //   72	114	121	java/io/IOException
    //   72	114	117	java/lang/IllegalStateException
    //   129	174	125	org/xmlpull/v1/XmlPullParserException
    //   129	174	121	java/io/IOException
    //   129	174	117	java/lang/IllegalStateException
    //   178	220	125	org/xmlpull/v1/XmlPullParserException
    //   178	220	121	java/io/IOException
    //   178	220	117	java/lang/IllegalStateException
    //   223	283	125	org/xmlpull/v1/XmlPullParserException
    //   223	283	121	java/io/IOException
    //   223	283	117	java/lang/IllegalStateException
    //   293	303	125	org/xmlpull/v1/XmlPullParserException
    //   293	303	121	java/io/IOException
    //   293	303	117	java/lang/IllegalStateException
    //   306	311	125	org/xmlpull/v1/XmlPullParserException
    //   306	311	121	java/io/IOException
    //   306	311	117	java/lang/IllegalStateException
    //   314	319	125	org/xmlpull/v1/XmlPullParserException
    //   314	319	121	java/io/IOException
    //   314	319	117	java/lang/IllegalStateException
    //   322	327	125	org/xmlpull/v1/XmlPullParserException
    //   322	327	121	java/io/IOException
    //   322	327	117	java/lang/IllegalStateException
    //   330	336	125	org/xmlpull/v1/XmlPullParserException
    //   330	336	121	java/io/IOException
    //   330	336	117	java/lang/IllegalStateException
  }
  
  public final HashSet b() {
    try {
      PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.b, 128);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      c.b("App is not found in PackageManager", new Object[0]);
      nameNotFoundException = null;
    } 
    return (nameNotFoundException == null || ((PackageInfo)nameNotFoundException).applicationInfo == null) ? new HashSet() : e((PackageInfo)nameNotFoundException);
  }
  
  public final HashSet c() {
    Map.Entry entry;
    ApplicationInfo applicationInfo2 = null;
    try {
      PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.b, 128);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      c.b("App is not found in PackageManager", new Object[0]);
      nameNotFoundException = null;
    } 
    ApplicationInfo applicationInfo1 = applicationInfo2;
    if (nameNotFoundException != null) {
      applicationInfo1 = ((PackageInfo)nameNotFoundException).applicationInfo;
      if (applicationInfo1 == null) {
        applicationInfo1 = applicationInfo2;
      } else {
        ApplicationInfo applicationInfo;
        a42 a42 = a(applicationInfo1.metaData);
        if (a42 == null) {
          applicationInfo = applicationInfo2;
        } else {
          HashSet<String> hashSet2 = new HashSet();
          HashSet<String> hashSet3 = f((PackageInfo)nameNotFoundException);
          hashSet3.add("");
          HashSet<String> hashSet1 = e((PackageInfo)nameNotFoundException);
          hashSet1.add("");
          Iterator<Map.Entry> iterator = applicationInfo.s(hashSet1).entrySet().iterator();
          while (true) {
            HashSet<String> hashSet = hashSet2;
            if (iterator.hasNext()) {
              entry = iterator.next();
              if (hashSet3.containsAll((Collection)entry.getValue()))
                hashSet2.add((String)entry.getKey()); 
              continue;
            } 
            break;
          } 
        } 
      } 
    } 
    return (HashSet)entry;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */