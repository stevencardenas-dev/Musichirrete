import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class uf implements Runnable {
  public static final Object u = new Object();
  
  public static final rf v = new rf(0);
  
  public static final AtomicInteger w = new AtomicInteger();
  
  public static final sf x = new sf(0);
  
  public final v61 b;
  
  public final c00 c;
  
  public final bh0 e;
  
  public final rp1 f;
  
  public final String g;
  
  public final zf1 h;
  
  public final int i;
  
  public int j;
  
  public final dg1 k;
  
  public kh0 l;
  
  public ArrayList m;
  
  public Bitmap n;
  
  public Future o;
  
  public int p;
  
  public Exception q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public uf(v61 paramv61, c00 paramc00, bh0 parambh0, rp1 paramrp1, kh0 paramkh0, dg1 paramdg1) {
    w.incrementAndGet();
    this.b = paramv61;
    this.c = paramc00;
    this.e = parambh0;
    this.f = paramrp1;
    this.l = paramkh0;
    this.g = paramkh0.f;
    zf1 zf11 = paramkh0.b;
    this.h = zf11;
    this.t = zf11.j;
    this.i = paramkh0.e;
    this.j = 0;
    this.k = paramdg1;
    this.s = paramdg1.d();
  }
  
  public static Bitmap a(List<cw1> paramList, Bitmap paramBitmap) {
    Bitmap bitmap;
    int i = paramList.size();
    byte b = 0;
    while (b < i) {
      cw1 cw1 = paramList.get(b);
      try {
        StringBuilder stringBuilder;
        Bitmap bitmap1 = cw1.a(paramBitmap);
        if (bitmap1 == null) {
          stringBuilder = x41.p("Transformation ");
          stringBuilder.append(cw1.b());
          stringBuilder.append(" returned null after ");
          stringBuilder.append(b);
          stringBuilder.append(" previous transformation(s).\n\nTransformation list:\n");
          Iterator<cw1> iterator = paramList.iterator();
          while (iterator.hasNext()) {
            stringBuilder.append(((cw1)iterator.next()).b());
            stringBuilder.append('\n');
          } 
          v61.i.post(new e3(4, stringBuilder));
          return null;
        } 
        if (bitmap1 == stringBuilder && stringBuilder.isRecycled()) {
          v61.i.post(new tf(cw1, 0));
          return null;
        } 
        if (bitmap1 != stringBuilder && !stringBuilder.isRecycled()) {
          v61.i.post(new tf(cw1, 1));
          return null;
        } 
        b++;
        bitmap = bitmap1;
      } catch (RuntimeException runtimeException) {
        v61.i.post(new vi2(5, cw1, runtimeException));
        return null;
      } 
    } 
    return bitmap;
  }
  
  public static Bitmap c(InputStream paramInputStream, zf1 paramzf1) {
    boolean bool;
    byte[] arrayOfByte1;
    pr0 pr0 = new pr0(paramInputStream);
    long l = pr0.c(65536);
    BitmapFactory.Options options = dg1.c(paramzf1);
    int k = paramzf1.f;
    int j = paramzf1.e;
    int i = 1;
    if (options != null && options.inJustDecodeBounds) {
      bool = true;
    } else {
      bool = false;
    } 
    byte[] arrayOfByte2 = new byte[12];
    if (pr0.read(arrayOfByte2, 0, 12) != 12 || !"RIFF".equals(new String(arrayOfByte2, 0, 4, "US-ASCII")) || !"WEBP".equals(new String(arrayOfByte2, 8, 4, "US-ASCII")))
      i = 0; 
    pr0.a(l);
    if (i) {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[4096];
      while (true) {
        i = pr0.read(arrayOfByte);
        if (-1 != i) {
          byteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        arrayOfByte1 = byteArrayOutputStream.toByteArray();
        if (bool) {
          BitmapFactory.decodeByteArray(arrayOfByte1, 0, arrayOfByte1.length, options);
          dg1.a(j, k, options.outWidth, options.outHeight, options, paramzf1);
        } 
        return BitmapFactory.decodeByteArray(arrayOfByte1, 0, arrayOfByte1.length, options);
      } 
    } 
    if (bool) {
      BitmapFactory.decodeStream((InputStream)arrayOfByte1, null, options);
      dg1.a(j, k, options.outWidth, options.outHeight, options, paramzf1);
      arrayOfByte1.a(l);
    } 
    Bitmap bitmap = BitmapFactory.decodeStream((InputStream)arrayOfByte1, null, options);
    if (bitmap != null)
      return bitmap; 
    m60.i(ybWnIKHovcRr.FwQZzrQwlLgP);
    return null;
  }
  
  public static Bitmap f(zf1 paramzf1, Bitmap paramBitmap, int paramInt) {
    int n = paramBitmap.getWidth();
    int m = paramBitmap.getHeight();
    boolean bool2 = paramzf1.i;
    Matrix matrix = new Matrix();
    boolean bool1 = paramzf1.b();
    int i = 0;
    byte b = 0;
    if (bool1) {
      int i1;
      int i2;
      boolean bool3;
      int i3 = paramzf1.e;
      int i4 = paramzf1.f;
      if (paramzf1.g) {
        float f5 = i3;
        float f6 = n;
        float f1 = f5 / f6;
        float f3 = i4;
        float f4 = m;
        float f2 = f3 / f4;
        if (f1 > f2) {
          i1 = (int)Math.ceil((f2 / f1 * f4));
          bool3 = (m - i1) / 2;
          f2 = f3 / i1;
          i2 = n;
          i = b;
        } else {
          i2 = (int)Math.ceil((f1 / f2 * f6));
          i = (n - i2) / 2;
          f1 = f5 / i2;
          bool3 = false;
          i1 = m;
        } 
        if (!bool2 || n > i3 || m > i4)
          matrix.preScale(f1, f2); 
      } else {
        if (paramzf1.h) {
          float f1 = i3 / n;
          float f2 = i4 / m;
          if (f1 >= f2)
            f1 = f2; 
          if (!bool2 || n > i3 || m > i4)
            matrix.preScale(f1, f1); 
        } else if ((i3 != 0 || i4 != 0) && (i3 != n || i4 != m)) {
          float f2;
          if (i3 != 0) {
            f2 = i3;
            f1 = n;
          } else {
            f2 = i4;
            f1 = m;
          } 
          float f3 = f2 / f1;
          if (i4 != 0) {
            f2 = i4;
            f1 = m;
          } else {
            f2 = i3;
            f1 = n;
          } 
          float f1 = f2 / f1;
          if (!bool2 || n > i3 || m > i4)
            matrix.preScale(f3, f1); 
        } 
        i2 = n;
        i1 = m;
        bool3 = false;
      } 
      if (paramInt != 0)
        matrix.preRotate(paramInt); 
      Bitmap bitmap = Bitmap.createBitmap(paramBitmap, i, bool3, i2, i1, matrix, true);
      if (bitmap != paramBitmap) {
        paramBitmap.recycle();
        return bitmap;
      } 
      return paramBitmap;
    } 
    int k = n;
    int j = m;
    boolean bool = false;
  }
  
  public static void g(zf1 paramzf1) {
    String str;
    Uri uri = paramzf1.b;
    if (uri != null) {
      str = String.valueOf(uri.getPath());
    } else {
      str = Integer.toHexString(((zf1)str).c);
    } 
    StringBuilder stringBuilder = v.get();
    stringBuilder.ensureCapacity(str.length() + 8);
    stringBuilder.replace(8, stringBuilder.length(), str);
    Thread.currentThread().setName(stringBuilder.toString());
  }
  
  public final boolean b() {
    if (this.l == null) {
      ArrayList arrayList = this.m;
      if (arrayList == null || arrayList.isEmpty()) {
        Future future = this.o;
        if (future != null && future.cancel(false))
          return true; 
      } 
    } 
    return false;
  }
  
  public final void d(kh0 paramkh0) {
    boolean bool;
    kh0 kh01 = this.l;
    int j = 1;
    int i = 1;
    int k = 0;
    if (kh01 == paramkh0) {
      this.l = null;
      bool = true;
    } else {
      ArrayList arrayList = this.m;
      if (arrayList != null) {
        bool = arrayList.remove(paramkh0);
      } else {
        bool = false;
      } 
    } 
    if (bool && paramkh0.b.j == this.t) {
      int m;
      ArrayList arrayList = this.m;
      if (arrayList != null && !arrayList.isEmpty()) {
        m = 1;
      } else {
        m = 0;
      } 
      kh0 kh02 = this.l;
      if (kh02 != null || m) {
        if (kh02 != null)
          i = kh02.b.j; 
        j = i;
        if (m) {
          int n = this.m.size();
          m = k;
          while (true) {
            j = i;
            if (m < n) {
              k = ((kh0)this.m.get(m)).b.j;
              j = i;
              if (x41.y(k) > x41.y(i))
                j = k; 
              m++;
              i = j;
              continue;
            } 
            break;
          } 
        } 
      } 
      this.t = j;
    } 
    this.b.getClass();
  }
  
  public final Bitmap e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : I
    //   4: istore_1
    //   5: iconst_1
    //   6: istore_2
    //   7: iload_1
    //   8: iconst_1
    //   9: iand
    //   10: ifne -> 92
    //   13: aload_0
    //   14: getfield e : Lbh0;
    //   17: astore_3
    //   18: aload_0
    //   19: getfield g : Ljava/lang/String;
    //   22: astore #4
    //   24: aload_3
    //   25: getfield c : Ljava/lang/Object;
    //   28: checkcast tp0
    //   31: aload #4
    //   33: invokevirtual f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast up0
    //   39: astore_3
    //   40: aload_3
    //   41: ifnull -> 53
    //   44: aload_3
    //   45: getfield a : Landroid/graphics/Bitmap;
    //   48: astore #4
    //   50: goto -> 56
    //   53: aconst_null
    //   54: astore #4
    //   56: aload #4
    //   58: astore_3
    //   59: aload #4
    //   61: ifnull -> 94
    //   64: aload_0
    //   65: getfield f : Lrp1;
    //   68: getfield b : Lcj;
    //   71: iconst_0
    //   72: invokevirtual sendEmptyMessage : (I)Z
    //   75: pop
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield p : I
    //   81: aload_0
    //   82: getfield b : Lv61;
    //   85: invokevirtual getClass : ()Ljava/lang/Class;
    //   88: pop
    //   89: aload #4
    //   91: areturn
    //   92: aconst_null
    //   93: astore_3
    //   94: aload_0
    //   95: getfield h : Lzf1;
    //   98: astore #4
    //   100: aload_0
    //   101: getfield s : I
    //   104: ifne -> 112
    //   107: iconst_4
    //   108: istore_1
    //   109: goto -> 117
    //   112: aload_0
    //   113: getfield j : I
    //   116: istore_1
    //   117: aload #4
    //   119: iload_1
    //   120: putfield a : I
    //   123: aload_0
    //   124: getfield k : Ldg1;
    //   127: aload #4
    //   129: invokevirtual e : (Lzf1;)Lm40;
    //   132: astore #5
    //   134: aload #5
    //   136: ifnull -> 227
    //   139: aload_0
    //   140: aload #5
    //   142: getfield a : I
    //   145: putfield p : I
    //   148: aload_0
    //   149: aload #5
    //   151: getfield b : I
    //   154: putfield r : I
    //   157: aload #5
    //   159: getfield c : Ljava/lang/Object;
    //   162: checkcast android/graphics/Bitmap
    //   165: astore #4
    //   167: aload #4
    //   169: astore_3
    //   170: aload #4
    //   172: ifnonnull -> 227
    //   175: aload #5
    //   177: getfield d : Ljava/lang/Object;
    //   180: checkcast java/io/InputStream
    //   183: astore #4
    //   185: aload #4
    //   187: aload_0
    //   188: getfield h : Lzf1;
    //   191: invokestatic c : (Ljava/io/InputStream;Lzf1;)Landroid/graphics/Bitmap;
    //   194: astore_3
    //   195: aload #4
    //   197: ifnonnull -> 203
    //   200: goto -> 208
    //   203: aload #4
    //   205: invokevirtual close : ()V
    //   208: goto -> 227
    //   211: astore_3
    //   212: aload #4
    //   214: ifnonnull -> 220
    //   217: goto -> 225
    //   220: aload #4
    //   222: invokevirtual close : ()V
    //   225: aload_3
    //   226: athrow
    //   227: aload_3
    //   228: ifnull -> 490
    //   231: aload_0
    //   232: getfield b : Lv61;
    //   235: invokevirtual getClass : ()Ljava/lang/Class;
    //   238: pop
    //   239: aload_0
    //   240: getfield f : Lrp1;
    //   243: astore #4
    //   245: aload #4
    //   247: invokevirtual getClass : ()Ljava/lang/Class;
    //   250: pop
    //   251: aload_3
    //   252: invokevirtual getByteCount : ()I
    //   255: istore_1
    //   256: iload_1
    //   257: iflt -> 481
    //   260: aload #4
    //   262: getfield b : Lcj;
    //   265: astore #4
    //   267: aload #4
    //   269: aload #4
    //   271: iconst_2
    //   272: iload_1
    //   273: iconst_0
    //   274: invokevirtual obtainMessage : (III)Landroid/os/Message;
    //   277: invokevirtual sendMessage : (Landroid/os/Message;)Z
    //   280: pop
    //   281: aload_0
    //   282: getfield h : Lzf1;
    //   285: astore #4
    //   287: aload #4
    //   289: invokevirtual b : ()Z
    //   292: ifne -> 313
    //   295: aload #4
    //   297: getfield d : Ljava/util/List;
    //   300: ifnull -> 306
    //   303: goto -> 313
    //   306: aload_0
    //   307: getfield r : I
    //   310: ifeq -> 490
    //   313: getstatic uf.u : Ljava/lang/Object;
    //   316: astore #5
    //   318: aload #5
    //   320: monitorenter
    //   321: aload_0
    //   322: getfield h : Lzf1;
    //   325: invokevirtual b : ()Z
    //   328: ifne -> 348
    //   331: aload_3
    //   332: astore #4
    //   334: aload_0
    //   335: getfield r : I
    //   338: ifeq -> 370
    //   341: goto -> 348
    //   344: astore_3
    //   345: goto -> 476
    //   348: aload_0
    //   349: getfield h : Lzf1;
    //   352: aload_3
    //   353: aload_0
    //   354: getfield r : I
    //   357: invokestatic f : (Lzf1;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   360: astore #4
    //   362: aload_0
    //   363: getfield b : Lv61;
    //   366: invokevirtual getClass : ()Ljava/lang/Class;
    //   369: pop
    //   370: aload_0
    //   371: getfield h : Lzf1;
    //   374: getfield d : Ljava/util/List;
    //   377: astore #6
    //   379: aload #6
    //   381: ifnull -> 389
    //   384: iload_2
    //   385: istore_1
    //   386: goto -> 391
    //   389: iconst_0
    //   390: istore_1
    //   391: aload #4
    //   393: astore_3
    //   394: iload_1
    //   395: ifeq -> 414
    //   398: aload #6
    //   400: aload #4
    //   402: invokestatic a : (Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   405: astore_3
    //   406: aload_0
    //   407: getfield b : Lv61;
    //   410: invokevirtual getClass : ()Ljava/lang/Class;
    //   413: pop
    //   414: aload #5
    //   416: monitorexit
    //   417: aload_3
    //   418: ifnull -> 474
    //   421: aload_0
    //   422: getfield f : Lrp1;
    //   425: astore #4
    //   427: aload #4
    //   429: invokevirtual getClass : ()Ljava/lang/Class;
    //   432: pop
    //   433: aload_3
    //   434: invokevirtual getByteCount : ()I
    //   437: istore_1
    //   438: iload_1
    //   439: iflt -> 465
    //   442: aload #4
    //   444: getfield b : Lcj;
    //   447: astore #4
    //   449: aload #4
    //   451: aload #4
    //   453: iconst_3
    //   454: iload_1
    //   455: iconst_0
    //   456: invokevirtual obtainMessage : (III)Landroid/os/Message;
    //   459: invokevirtual sendMessage : (Landroid/os/Message;)Z
    //   462: pop
    //   463: aload_3
    //   464: areturn
    //   465: ldc_w 'Negative size: '
    //   468: aload_3
    //   469: invokestatic o : (Ljava/lang/String;Ljava/lang/Object;)V
    //   472: aconst_null
    //   473: areturn
    //   474: aload_3
    //   475: areturn
    //   476: aload #5
    //   478: monitorexit
    //   479: aload_3
    //   480: athrow
    //   481: ldc_w 'Negative size: '
    //   484: aload_3
    //   485: invokestatic o : (Ljava/lang/String;Ljava/lang/Object;)V
    //   488: aconst_null
    //   489: areturn
    //   490: aload_3
    //   491: areturn
    //   492: astore #4
    //   494: goto -> 208
    //   497: astore #4
    //   499: goto -> 225
    // Exception table:
    //   from	to	target	type
    //   185	195	211	finally
    //   203	208	492	java/io/IOException
    //   220	225	497	java/io/IOException
    //   321	331	344	finally
    //   334	341	344	finally
    //   348	370	344	finally
    //   370	379	344	finally
    //   398	414	344	finally
    //   414	417	344	finally
    //   476	479	344	finally
  }
  
  public final void run() {
    c00 c001 = this.c;
    try {
      g(this.h);
      this.b.getClass();
      Bitmap bitmap = e();
      this.n = bitmap;
      if (bitmap == null) {
        cj cj = c001.h;
        cj.sendMessage(cj.obtainMessage(6, this));
      } else {
        c001.b(this);
      } 
      Thread.currentThread().setName("Picasso-Idle");
      return;
    } catch (c10 c10) {
    
    } catch (x11 x11) {
    
    } catch (IOException iOException) {
    
    } catch (OutOfMemoryError outOfMemoryError) {
    
    } catch (Exception exception) {
    
    } finally {}
    Thread.currentThread().setName("Picasso-Idle");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */