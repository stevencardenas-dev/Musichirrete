import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class zb0 implements y00, o91, nl0, jj1, ns, j32, am, w92, ue2, kf1, jf2, ke2 {
  public static volatile zb0 c;
  
  public static zb0 e;
  
  public static zb0 f;
  
  public static final zb0 g = new zb0(27);
  
  public final int b;
  
  public static RectF o(TabLayout paramTabLayout, View paramView) {
    if (paramView == null)
      return new RectF(); 
    if (!paramTabLayout.H && paramView instanceof zs1) {
      zs1 zs1 = (zs1)paramView;
      int k = zs1.getContentWidth();
      int m = zs1.getContentHeight();
      int j = (int)n21.u(zs1.getContext(), 24);
      int i = k;
      if (k < j)
        i = j; 
      j = zs1.getLeft();
      j = (zs1.getRight() + j) / 2;
      k = zs1.getTop();
      k = (zs1.getBottom() + k) / 2;
      i /= 2;
      m /= 2;
      int n = j / 2;
      return new RectF((j - i), (k - m), (i + j), (n + k));
    } 
    return new RectF(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  public g32 a(Class paramClass) {
    return zo2.h(paramClass);
  }
  
  public void accept(Object paramObject1, Object paramObject2) {
    paramObject2 = paramObject2;
    nv2 nv2 = (nv2)paramObject1;
    paramObject1 = pg2.G;
    paramObject1 = nv2.i();
    n5 n5 = g92.g0();
    Parcel parcel = paramObject1.o();
    mh2.b(parcel, n5);
    paramObject1.p0(parcel, 1);
    paramObject2.b(null);
  }
  
  public Object[] b(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2) {
    return (Object[])n21.c0(paramObject, "makePathElements", List.class, paramArrayList1, null, List.class, paramArrayList2);
  }
  
  public boolean d(Object<?> paramObject, File paramFile1, File paramFile2) {
    paramObject = (Object<?>)paramObject.getClass();
    Method method = n21.h0((Class)paramObject, "optimizedPathFor", new Class[] { File.class, File.class });
    try {
      paramFile1 = (File)String.class.cast(method.invoke(null, new Object[] { paramFile1, paramFile2 }));
      return (new File((String)paramFile1)).exists();
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder("Failed to invoke static method optimizedPathFor on type ");
      stringBuilder.append(paramObject);
      throw new RuntimeException(stringBuilder.toString(), exception);
    } 
  }
  
  public String e(float paramFloat) {
    return ag0.B((int)paramFloat, false, 0);
  }
  
  public void f(Context paramContext, v00 paramv00) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 24, 1 -> 161
    //   24: aload_2
    //   25: invokevirtual j : ()Landroid/net/Uri;
    //   28: invokevirtual toString : ()Ljava/lang/String;
    //   31: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   34: astore #5
    //   36: getstatic im0.n0 : Ljava/util/HashSet;
    //   39: astore_1
    //   40: aload_1
    //   41: aload #5
    //   43: invokevirtual contains : (Ljava/lang/Object;)Z
    //   46: ifeq -> 109
    //   49: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   52: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   55: astore_1
    //   56: new android/content/Intent
    //   59: astore #5
    //   61: aload #5
    //   63: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   66: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   69: ldc_w in/krosbits/musicolet/PlaylistActivity
    //   72: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   75: aload_1
    //   76: aload #5
    //   78: ldc_w 'imt'
    //   81: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   84: ldc_w 268435456
    //   87: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   90: ldc_w 'extpt'
    //   93: aload_2
    //   94: invokevirtual j : ()Landroid/net/Uri;
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   103: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   106: goto -> 160
    //   109: new java/lang/StringBuilder
    //   112: astore_2
    //   113: aload_2
    //   114: invokespecial <init> : ()V
    //   117: aload_2
    //   118: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   121: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   124: ldc_w 2131887476
    //   127: invokevirtual getString : (I)Ljava/lang/String;
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload_2
    //   135: ldc_w ' '
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload_2
    //   143: aload_1
    //   144: invokevirtual toString : ()Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: iconst_1
    //   152: aload_2
    //   153: invokevirtual toString : ()Ljava/lang/String;
    //   156: iconst_1
    //   157: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   160: return
    //   161: aload_2
    //   162: ifnull -> 264
    //   165: aload_1
    //   166: instanceof in/krosbits/musicolet/IncludedFoldersActivity
    //   169: ifeq -> 264
    //   172: aload_1
    //   173: checkcast in/krosbits/musicolet/IncludedFoldersActivity
    //   176: astore_1
    //   177: aload_1
    //   178: getfield D : Z
    //   181: ifeq -> 264
    //   184: aload_2
    //   185: getfield b : Ld61;
    //   188: invokevirtual toString : ()Ljava/lang/String;
    //   191: astore #5
    //   193: aload_1
    //   194: getfield R : Ljava/util/ArrayList;
    //   197: astore_2
    //   198: aload_2
    //   199: invokevirtual size : ()I
    //   202: istore #4
    //   204: iconst_0
    //   205: istore_3
    //   206: iload_3
    //   207: iload #4
    //   209: if_icmpge -> 245
    //   212: aload_2
    //   213: iload_3
    //   214: invokevirtual get : (I)Ljava/lang/Object;
    //   217: astore #6
    //   219: iinc #3, 1
    //   222: aload #5
    //   224: aload #6
    //   226: checkcast java/lang/String
    //   229: invokevirtual equals : (Ljava/lang/Object;)Z
    //   232: ifeq -> 206
    //   235: ldc_w 2131886585
    //   238: iconst_1
    //   239: invokestatic O0 : (II)V
    //   242: goto -> 264
    //   245: aload_1
    //   246: iconst_1
    //   247: putfield V : Z
    //   250: aload_1
    //   251: getfield R : Ljava/util/ArrayList;
    //   254: aload #5
    //   256: invokevirtual add : (Ljava/lang/Object;)Z
    //   259: pop
    //   260: aload_1
    //   261: invokevirtual n0 : ()V
    //   264: return
    //   265: astore_1
    //   266: goto -> 160
    // Exception table:
    //   from	to	target	type
    //   24	106	265	finally
    //   109	160	265	finally
  }
  
  public g32 g(Class paramClass, uz0 paramuz0) {
    return a(paramClass);
  }
  
  public void h(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
  
  public long i() {
    return System.currentTimeMillis();
  }
  
  public CharSequence j(Preference paramPreference) {
    ListPreference listPreference = (ListPreference)paramPreference;
    return TextUtils.isEmpty(listPreference.G()) ? ((Preference)listPreference).b.getString(2131887013) : listPreference.G();
  }
  
  public boolean k(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean) {
    return wf2.G0(paramClassLoader, paramFile1, paramFile2, paramBoolean, (fb0)new Object(), "zip", new zb0(26));
  }
  
  public g32 l(ll paramll, uz0 paramuz0) {
    Class clazz = paramll.a;
    clazz.getClass();
    return g(clazz, paramuz0);
  }
  
  public void m(ClassLoader paramClassLoader, HashSet paramHashSet) {
    zo2.a0(paramClassLoader, paramHashSet, new zb0(28));
  }
  
  public boolean n(v00 paramv00) {
    switch (this.b) {
      default:
        return true;
      case 1:
        break;
    } 
    return true;
  }
  
  public void onScrollProgress(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void p(TabLayout paramTabLayout, View paramView1, View paramView2, float paramFloat, Drawable paramDrawable) {
    RectF rectF2 = o(paramTabLayout, paramView1);
    RectF rectF1 = o(paramTabLayout, paramView2);
    paramDrawable.setBounds(g5.c(paramFloat, (int)rectF2.left, (int)rectF1.left), (paramDrawable.getBounds()).top, g5.c(paramFloat, (int)rectF2.right, (int)rectF1.right), (paramDrawable.getBounds()).bottom);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */