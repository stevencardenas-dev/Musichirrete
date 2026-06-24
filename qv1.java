import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;

public final class qv1 extends ws0 implements yt1 {
  public CharSequence J;
  
  public final Context K;
  
  public final Paint.FontMetrics L = new Paint.FontMetrics();
  
  public final zt1 M;
  
  public final vg N;
  
  public final Rect O;
  
  public int P;
  
  public int Q;
  
  public int R;
  
  public int S;
  
  public boolean T;
  
  public int U;
  
  public int V;
  
  public float W;
  
  public float X;
  
  public float Y;
  
  public float Z;
  
  public float a0;
  
  public qv1(Context paramContext, int paramInt) {
    super(paramContext, null, 0, paramInt);
    zt1 zt11 = new zt1(this);
    this.M = zt11;
    this.N = new vg(2, this);
    this.O = new Rect();
    this.W = 1.0F;
    this.X = 1.0F;
    this.Y = 0.5F;
    this.Z = 0.5F;
    this.a0 = 1.0F;
    this.K = paramContext;
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    TextPaint textPaint = zt11.a;
    textPaint.density = f;
    textPaint.setTextAlign(Paint.Align.CENTER);
  }
  
  public static qv1 A(Context paramContext, int paramInt) {
    // Byte code:
    //   0: new qv1
    //   3: dup
    //   4: aload_0
    //   5: iload_1
    //   6: invokespecial <init> : (Landroid/content/Context;I)V
    //   9: astore #5
    //   11: aload #5
    //   13: getfield K : Landroid/content/Context;
    //   16: aconst_null
    //   17: getstatic zb1.L : [I
    //   20: iconst_0
    //   21: iload_1
    //   22: iconst_0
    //   23: newarray int
    //   25: invokestatic S : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   28: astore #6
    //   30: aload #5
    //   32: getfield K : Landroid/content/Context;
    //   35: astore #4
    //   37: aload #5
    //   39: aload #4
    //   41: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   44: ldc 2131166312
    //   46: invokevirtual getDimensionPixelSize : (I)I
    //   49: putfield U : I
    //   52: aload #6
    //   54: bipush #8
    //   56: iconst_1
    //   57: invokevirtual getBoolean : (IZ)Z
    //   60: istore_3
    //   61: aload #5
    //   63: iload_3
    //   64: putfield T : Z
    //   67: iload_3
    //   68: ifeq -> 104
    //   71: aload #5
    //   73: getfield c : Lus0;
    //   76: getfield a : Lvl1;
    //   79: invokevirtual f : ()Lul1;
    //   82: astore_0
    //   83: aload_0
    //   84: aload #5
    //   86: invokevirtual B : ()Lp31;
    //   89: putfield k : Lj30;
    //   92: aload #5
    //   94: aload_0
    //   95: invokevirtual a : ()Lvl1;
    //   98: invokevirtual setShapeAppearanceModel : (Lvl1;)V
    //   101: goto -> 110
    //   104: aload #5
    //   106: iconst_0
    //   107: putfield U : I
    //   110: aload #5
    //   112: aload #6
    //   114: bipush #6
    //   116: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   119: invokevirtual C : (Ljava/lang/CharSequence;)V
    //   122: aload #6
    //   124: iconst_0
    //   125: invokevirtual hasValue : (I)Z
    //   128: ifeq -> 157
    //   131: aload #6
    //   133: iconst_0
    //   134: iconst_0
    //   135: invokevirtual getResourceId : (II)I
    //   138: istore_1
    //   139: iload_1
    //   140: ifeq -> 157
    //   143: new vt1
    //   146: dup
    //   147: aload #4
    //   149: iload_1
    //   150: invokespecial <init> : (Landroid/content/Context;I)V
    //   153: astore_0
    //   154: goto -> 159
    //   157: aconst_null
    //   158: astore_0
    //   159: aload_0
    //   160: ifnull -> 184
    //   163: aload #6
    //   165: iconst_1
    //   166: invokevirtual hasValue : (I)Z
    //   169: ifeq -> 184
    //   172: aload_0
    //   173: aload #4
    //   175: aload #6
    //   177: iconst_1
    //   178: invokestatic u : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   181: putfield k : Landroid/content/res/ColorStateList;
    //   184: aload #5
    //   186: getfield M : Lzt1;
    //   189: aload_0
    //   190: aload #4
    //   192: invokevirtual b : (Lvt1;Landroid/content/Context;)V
    //   195: ldc qv1
    //   197: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   200: astore #7
    //   202: aload #4
    //   204: ldc 2130968905
    //   206: invokestatic Y : (Landroid/content/Context;I)Landroid/util/TypedValue;
    //   209: astore_0
    //   210: aload_0
    //   211: ifnull -> 497
    //   214: aload_0
    //   215: getfield resourceId : I
    //   218: istore_1
    //   219: iload_1
    //   220: ifeq -> 233
    //   223: aload #4
    //   225: iload_1
    //   226: invokevirtual getColor : (I)I
    //   229: istore_1
    //   230: goto -> 238
    //   233: aload_0
    //   234: getfield data : I
    //   237: istore_1
    //   238: ldc qv1
    //   240: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   243: astore #7
    //   245: aload #4
    //   247: ldc 16842801
    //   249: invokestatic Y : (Landroid/content/Context;I)Landroid/util/TypedValue;
    //   252: astore_0
    //   253: aload_0
    //   254: ifnull -> 461
    //   257: aload_0
    //   258: getfield resourceId : I
    //   261: istore_2
    //   262: iload_2
    //   263: ifeq -> 276
    //   266: aload #4
    //   268: iload_2
    //   269: invokevirtual getColor : (I)I
    //   272: istore_2
    //   273: goto -> 281
    //   276: aload_0
    //   277: getfield data : I
    //   280: istore_2
    //   281: iload_2
    //   282: sipush #229
    //   285: invokestatic i : (II)I
    //   288: istore_2
    //   289: aload #5
    //   291: aload #6
    //   293: bipush #7
    //   295: iload_1
    //   296: sipush #153
    //   299: invokestatic i : (II)I
    //   302: iload_2
    //   303: invokestatic g : (II)I
    //   306: invokevirtual getColor : (II)I
    //   309: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   312: invokevirtual o : (Landroid/content/res/ColorStateList;)V
    //   315: ldc qv1
    //   317: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   320: astore_0
    //   321: aload #4
    //   323: ldc 2130968945
    //   325: invokestatic Y : (Landroid/content/Context;I)Landroid/util/TypedValue;
    //   328: astore #7
    //   330: aload #7
    //   332: ifnull -> 426
    //   335: aload #7
    //   337: getfield resourceId : I
    //   340: istore_1
    //   341: iload_1
    //   342: ifeq -> 355
    //   345: aload #4
    //   347: iload_1
    //   348: invokevirtual getColor : (I)I
    //   351: istore_1
    //   352: goto -> 361
    //   355: aload #7
    //   357: getfield data : I
    //   360: istore_1
    //   361: aload #5
    //   363: iload_1
    //   364: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   367: invokevirtual t : (Landroid/content/res/ColorStateList;)V
    //   370: aload #5
    //   372: aload #6
    //   374: iconst_2
    //   375: iconst_0
    //   376: invokevirtual getDimensionPixelSize : (II)I
    //   379: putfield P : I
    //   382: aload #5
    //   384: aload #6
    //   386: iconst_4
    //   387: iconst_0
    //   388: invokevirtual getDimensionPixelSize : (II)I
    //   391: putfield Q : I
    //   394: aload #5
    //   396: aload #6
    //   398: iconst_5
    //   399: iconst_0
    //   400: invokevirtual getDimensionPixelSize : (II)I
    //   403: putfield R : I
    //   406: aload #5
    //   408: aload #6
    //   410: iconst_3
    //   411: iconst_0
    //   412: invokevirtual getDimensionPixelSize : (II)I
    //   415: putfield S : I
    //   418: aload #6
    //   420: invokevirtual recycle : ()V
    //   423: aload #5
    //   425: areturn
    //   426: new java/lang/IllegalArgumentException
    //   429: dup
    //   430: ldc_w '%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).'
    //   433: iconst_2
    //   434: anewarray java/lang/Object
    //   437: dup
    //   438: iconst_0
    //   439: aload_0
    //   440: aastore
    //   441: dup
    //   442: iconst_1
    //   443: aload #4
    //   445: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   448: ldc 2130968945
    //   450: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   453: aastore
    //   454: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   457: invokespecial <init> : (Ljava/lang/String;)V
    //   460: athrow
    //   461: new java/lang/IllegalArgumentException
    //   464: dup
    //   465: ldc_w '%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).'
    //   468: iconst_2
    //   469: anewarray java/lang/Object
    //   472: dup
    //   473: iconst_0
    //   474: aload #7
    //   476: aastore
    //   477: dup
    //   478: iconst_1
    //   479: aload #4
    //   481: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   484: ldc 16842801
    //   486: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   489: aastore
    //   490: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   493: invokespecial <init> : (Ljava/lang/String;)V
    //   496: athrow
    //   497: new java/lang/IllegalArgumentException
    //   500: dup
    //   501: ldc_w '%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).'
    //   504: iconst_2
    //   505: anewarray java/lang/Object
    //   508: dup
    //   509: iconst_0
    //   510: aload #7
    //   512: aastore
    //   513: dup
    //   514: iconst_1
    //   515: aload #4
    //   517: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   520: ldc 2130968905
    //   522: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   525: aastore
    //   526: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   529: invokespecial <init> : (Ljava/lang/String;)V
    //   532: athrow
  }
  
  public final p31 B() {
    float f1 = -z();
    double d1 = getBounds().width();
    double d2 = this.U;
    float f2 = (float)((d1 - Math.sqrt(2.0D) * d2) / 2.0D);
    f1 = Math.min(Math.max(f1, -f2), f2);
    return new p31(new qr0(this.U), f1);
  }
  
  public final void C(CharSequence paramCharSequence) {
    if (!TextUtils.equals(this.J, paramCharSequence)) {
      this.J = paramCharSequence;
      this.M.e = true;
      invalidateSelf();
    } 
  }
  
  public final void draw(Canvas paramCanvas) {
    paramCanvas.save();
    float f6 = z();
    double d = this.U;
    float f7 = (float)-(Math.sqrt(2.0D) * d - this.U);
    float f1 = this.W;
    float f8 = this.X;
    float f4 = (getBounds()).left;
    float f5 = getBounds().width();
    float f2 = this.Y;
    float f3 = (getBounds()).top;
    paramCanvas.scale(f1, f8, f5 * f2 + f4, getBounds().height() * this.Z + f3);
    paramCanvas.translate(f6, f7);
    super.draw(paramCanvas);
    if (this.J != null) {
      Rect rect = getBounds();
      f1 = rect.centerY();
      zt1 zt11 = this.M;
      TextPaint textPaint = zt11.a;
      Paint.FontMetrics fontMetrics = this.L;
      textPaint.getFontMetrics(fontMetrics);
      int i = (int)(f1 - (fontMetrics.descent + fontMetrics.ascent) / 2.0F);
      if (zt11.g != null) {
        textPaint.drawableState = getState();
        vt1 vt1 = zt11.g;
        xt1 xt1 = zt11.b;
        vt1.d(this.K, textPaint, xt1);
        textPaint.setAlpha((int)(this.a0 * 255.0F));
      } 
      CharSequence charSequence = this.J;
      paramCanvas.drawText(charSequence, 0, charSequence.length(), rect.centerX(), i, (Paint)textPaint);
    } 
    paramCanvas.restore();
  }
  
  public final int getIntrinsicHeight() {
    return (int)Math.max(this.M.a.getTextSize(), this.R);
  }
  
  public final int getIntrinsicWidth() {
    float f1;
    float f2 = (this.P * 2);
    CharSequence charSequence = this.J;
    if (charSequence == null) {
      f1 = 0.0F;
    } else {
      charSequence = charSequence.toString();
      zt1 zt11 = this.M;
      if (zt11.e)
        zt11.a((String)charSequence); 
      f1 = zt11.c;
    } 
    return (int)Math.max(f2 + f1, this.Q);
  }
  
  public final void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    if (this.T) {
      ul1 ul1 = this.c.a.f();
      ul1.k = B();
      setShapeAppearanceModel(ul1.a());
    } 
  }
  
  public final float z() {
    Rect rect = this.O;
    if (rect.right - (getBounds()).right - this.V - this.S < 0) {
      int i = rect.right - (getBounds()).right - this.V - this.S;
      return i;
    } 
    if (rect.left - (getBounds()).left - this.V + this.S > 0) {
      int i = rect.left - (getBounds()).left - this.V + this.S;
      return i;
    } 
    return 0.0F;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */