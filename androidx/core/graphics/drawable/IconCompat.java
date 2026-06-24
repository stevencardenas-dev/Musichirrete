package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import java.lang.reflect.InvocationTargetException;
import k5;
import l0;
import m60;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public class IconCompat extends CustomVersionedParcelable {
  public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  public int a;
  
  public Object b;
  
  public byte[] c = null;
  
  public Parcelable d = null;
  
  public int e = 0;
  
  public int f = 0;
  
  public ColorStateList g = null;
  
  public PorterDuff.Mode h = k;
  
  public String i = null;
  
  public String j;
  
  public IconCompat(int paramInt) {
    this.a = paramInt;
  }
  
  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean) {
    int i = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    Paint paint = new Paint(3);
    float f3 = i;
    float f1 = 0.5F * f3;
    float f2 = 0.9166667F * f1;
    if (paramBoolean) {
      float f = 0.010416667F * f3;
      paint.setColor(0);
      paint.setShadowLayer(f, 0.0F, f3 * 0.020833334F, 1023410176);
      canvas.drawCircle(f1, f1, f2, paint);
      paint.setShadowLayer(f, 0.0F, 0.0F, 503316480);
      canvas.drawCircle(f1, f1, f2, paint);
      paint.clearShadowLayer();
    } 
    paint.setColor(-16777216);
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    BitmapShader bitmapShader = new BitmapShader(paramBitmap, tileMode, tileMode);
    Matrix matrix = new Matrix();
    matrix.setTranslate(-(paramBitmap.getWidth() - i) / 2.0F, -(paramBitmap.getHeight() - i) / 2.0F);
    bitmapShader.setLocalMatrix(matrix);
    paint.setShader((Shader)bitmapShader);
    canvas.drawCircle(f1, f1, f2, paint);
    canvas.setBitmap(null);
    return bitmap;
  }
  
  public static IconCompat b(Resources paramResources, String paramString, int paramInt) {
    paramString.getClass();
    if (paramInt != 0) {
      IconCompat iconCompat = new IconCompat(2);
      iconCompat.e = paramInt;
      if (paramResources != null) {
        try {
          iconCompat.b = paramResources.getResourceName(paramInt);
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          l0.l("Icon resource cannot be found");
          return null;
        } 
      } else {
        iconCompat.b = paramString;
      } 
      iconCompat.j = paramString;
      return iconCompat;
    } 
    l0.l("Drawable resource ID must not be 0");
    return null;
  }
  
  public final int c() {
    int i = this.a;
    if (i == -1) {
      Object object = this.b;
      if (Build.VERSION.SDK_INT >= 28)
        return k5.h(object); 
      try {
        return ((Integer)object.getClass().getMethod("getResId", null).invoke(object, null)).intValue();
      } catch (IllegalAccessException illegalAccessException) {
        Log.e("IconCompat", "Unable to get icon resource", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
      
      } catch (NoSuchMethodException noSuchMethodException) {}
      return 0;
    } 
    if (i == 2)
      return this.e; 
    m60.o("called getResId() on ", this);
    return 0;
  }
  
  public final String d() {
    int i = this.a;
    if (i == -1) {
      Object object = this.b;
      if (Build.VERSION.SDK_INT >= 28)
        return k5.i(object); 
      try {
        return (String)object.getClass().getMethod("getResPackage", null).invoke(object, null);
      } catch (IllegalAccessException illegalAccessException) {
        Log.e("IconCompat", "Unable to get icon package", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
      
      } catch (NoSuchMethodException noSuchMethodException) {}
      return null;
    } 
    if (i == 2) {
      String str = this.j;
      return (str == null || TextUtils.isEmpty(str)) ? ((String)this.b).split(":", -1)[0] : this.j;
    } 
    m60.o(GMDx.sNUoJOXuEXGLfq, this);
    return null;
  }
  
  public final Uri e() {
    int i = this.a;
    if (i == -1) {
      Object object = this.b;
      if (Build.VERSION.SDK_INT >= 28)
        return k5.q(object); 
      try {
        return (Uri)object.getClass().getMethod("getUri", null).invoke(object, null);
      } catch (IllegalAccessException illegalAccessException) {
        Log.e("IconCompat", "Unable to get icon uri", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
      
      } catch (NoSuchMethodException noSuchMethodException) {}
      return null;
    } 
    if (i == 4 || i == 6)
      return Uri.parse((String)this.b); 
    m60.o("called getUri() on ", this);
    return null;
  }
  
  public final Icon f(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: tableswitch default -> 52, -1 -> 444, 0 -> 52, 1 -> 392, 2 -> 377, 3 -> 355, 4 -> 341, 5 -> 300, 6 -> 60
    //   52: ldc_w 'Unknown type'
    //   55: invokestatic l : (Ljava/lang/String;)V
    //   58: aconst_null
    //   59: areturn
    //   60: getstatic android/os/Build$VERSION.SDK_INT : I
    //   63: bipush #30
    //   65: if_icmplt -> 79
    //   68: aload_0
    //   69: invokevirtual e : ()Landroid/net/Uri;
    //   72: invokestatic d : (Landroid/net/Uri;)Landroid/graphics/drawable/Icon;
    //   75: astore_1
    //   76: goto -> 403
    //   79: aload_1
    //   80: ifnull -> 288
    //   83: aload_0
    //   84: invokevirtual e : ()Landroid/net/Uri;
    //   87: astore #5
    //   89: aload #5
    //   91: invokevirtual getScheme : ()Ljava/lang/String;
    //   94: astore #6
    //   96: ldc_w 'content'
    //   99: aload #6
    //   101: invokevirtual equals : (Ljava/lang/Object;)Z
    //   104: istore_3
    //   105: getstatic r3/IKWi/AyxAR.BvMJrRusn : Ljava/lang/String;
    //   108: astore #4
    //   110: iload_3
    //   111: ifne -> 190
    //   114: ldc_w 'file'
    //   117: aload #6
    //   119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   122: ifeq -> 128
    //   125: goto -> 190
    //   128: new java/io/File
    //   131: astore_1
    //   132: aload_1
    //   133: aload_0
    //   134: getfield b : Ljava/lang/Object;
    //   137: checkcast java/lang/String
    //   140: invokespecial <init> : (Ljava/lang/String;)V
    //   143: new java/io/FileInputStream
    //   146: dup
    //   147: aload_1
    //   148: invokespecial <init> : (Ljava/io/File;)V
    //   151: astore_1
    //   152: goto -> 238
    //   155: astore #6
    //   157: new java/lang/StringBuilder
    //   160: dup
    //   161: ldc_w 'Unable to load image from path: '
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: astore_1
    //   168: aload_1
    //   169: aload #5
    //   171: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #4
    //   177: aload_1
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: aload #6
    //   183: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   186: pop
    //   187: goto -> 236
    //   190: aload_1
    //   191: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   194: aload #5
    //   196: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   199: astore_1
    //   200: goto -> 238
    //   203: astore_1
    //   204: new java/lang/StringBuilder
    //   207: dup
    //   208: ldc_w 'Unable to load image from URI: '
    //   211: invokespecial <init> : (Ljava/lang/String;)V
    //   214: astore #6
    //   216: aload #6
    //   218: aload #5
    //   220: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload #4
    //   226: aload #6
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: aload_1
    //   232: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   235: pop
    //   236: aconst_null
    //   237: astore_1
    //   238: aload_1
    //   239: ifnull -> 276
    //   242: getstatic android/os/Build$VERSION.SDK_INT : I
    //   245: bipush #26
    //   247: if_icmplt -> 261
    //   250: aload_1
    //   251: invokestatic decodeStream : (Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   254: invokestatic e : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   257: astore_1
    //   258: goto -> 403
    //   261: aload_1
    //   262: invokestatic decodeStream : (Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   265: iconst_0
    //   266: invokestatic a : (Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   269: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   272: astore_1
    //   273: goto -> 403
    //   276: ldc_w 'Cannot load adaptive icon from uri: '
    //   279: aload_0
    //   280: invokevirtual e : ()Landroid/net/Uri;
    //   283: invokestatic p : (Ljava/lang/String;Ljava/lang/Object;)V
    //   286: aconst_null
    //   287: areturn
    //   288: ldc_w 'Context is required to resolve the file uri of the icon: '
    //   291: aload_0
    //   292: invokevirtual e : ()Landroid/net/Uri;
    //   295: invokestatic g : (Ljava/lang/String;Ljava/lang/Object;)V
    //   298: aconst_null
    //   299: areturn
    //   300: getstatic android/os/Build$VERSION.SDK_INT : I
    //   303: istore_2
    //   304: aload_0
    //   305: getfield b : Ljava/lang/Object;
    //   308: astore_1
    //   309: iload_2
    //   310: bipush #26
    //   312: if_icmplt -> 326
    //   315: aload_1
    //   316: checkcast android/graphics/Bitmap
    //   319: invokestatic e : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   322: astore_1
    //   323: goto -> 403
    //   326: aload_1
    //   327: checkcast android/graphics/Bitmap
    //   330: iconst_0
    //   331: invokestatic a : (Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   334: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   337: astore_1
    //   338: goto -> 403
    //   341: aload_0
    //   342: getfield b : Ljava/lang/Object;
    //   345: checkcast java/lang/String
    //   348: invokestatic createWithContentUri : (Ljava/lang/String;)Landroid/graphics/drawable/Icon;
    //   351: astore_1
    //   352: goto -> 403
    //   355: aload_0
    //   356: getfield b : Ljava/lang/Object;
    //   359: checkcast [B
    //   362: aload_0
    //   363: getfield e : I
    //   366: aload_0
    //   367: getfield f : I
    //   370: invokestatic createWithData : ([BII)Landroid/graphics/drawable/Icon;
    //   373: astore_1
    //   374: goto -> 403
    //   377: aload_0
    //   378: invokevirtual d : ()Ljava/lang/String;
    //   381: aload_0
    //   382: getfield e : I
    //   385: invokestatic createWithResource : (Ljava/lang/String;I)Landroid/graphics/drawable/Icon;
    //   388: astore_1
    //   389: goto -> 403
    //   392: aload_0
    //   393: getfield b : Ljava/lang/Object;
    //   396: checkcast android/graphics/Bitmap
    //   399: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   402: astore_1
    //   403: aload_0
    //   404: getfield g : Landroid/content/res/ColorStateList;
    //   407: astore #4
    //   409: aload #4
    //   411: ifnull -> 421
    //   414: aload_1
    //   415: aload #4
    //   417: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;
    //   420: pop
    //   421: aload_0
    //   422: getfield h : Landroid/graphics/PorterDuff$Mode;
    //   425: astore #4
    //   427: aload #4
    //   429: getstatic androidx/core/graphics/drawable/IconCompat.k : Landroid/graphics/PorterDuff$Mode;
    //   432: if_acmpeq -> 442
    //   435: aload_1
    //   436: aload #4
    //   438: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;
    //   441: pop
    //   442: aload_1
    //   443: areturn
    //   444: aload_0
    //   445: getfield b : Ljava/lang/Object;
    //   448: checkcast android/graphics/drawable/Icon
    //   451: areturn
    // Exception table:
    //   from	to	target	type
    //   128	152	155	java/io/FileNotFoundException
    //   190	200	203	java/lang/Exception
  }
  
  public final String toString() {
    String str;
    if (this.a == -1)
      return String.valueOf(this.b); 
    StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
    switch (this.a) {
      default:
        str = "UNKNOWN";
        break;
      case 6:
        str = "URI_MASKABLE";
        break;
      case 5:
        str = "BITMAP_MASKABLE";
        break;
      case 4:
        str = "URI";
        break;
      case 3:
        str = "DATA";
        break;
      case 2:
        str = "RESOURCE";
        break;
      case 1:
        str = "BITMAP";
        break;
    } 
    stringBuilder.append(str);
    switch (this.a) {
      case 4:
      case 6:
        stringBuilder.append(" uri=");
        stringBuilder.append(this.b);
        break;
      case 3:
        stringBuilder.append(" len=");
        stringBuilder.append(this.e);
        if (this.f != 0) {
          stringBuilder.append(" off=");
          stringBuilder.append(this.f);
        } 
        break;
      case 2:
        stringBuilder.append(" pkg=");
        stringBuilder.append(this.j);
        stringBuilder.append(RqlokDsQOju.GsYhcLGsnjJVanZ);
        stringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(c()) }));
        break;
      case 1:
      case 5:
        stringBuilder.append(" size=");
        stringBuilder.append(((Bitmap)this.b).getWidth());
        stringBuilder.append("x");
        stringBuilder.append(((Bitmap)this.b).getHeight());
        break;
    } 
    if (this.g != null) {
      stringBuilder.append(" tint=");
      stringBuilder.append(this.g);
    } 
    if (this.h != k) {
      stringBuilder.append(" mode=");
      stringBuilder.append(this.h);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\core\graphics\drawable\IconCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */