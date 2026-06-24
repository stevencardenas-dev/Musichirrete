import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import uk.co.senab.photoview.PhotoView;

public final class u61 implements tg0, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
  public static final boolean B = Log.isLoggable("PhotoViewAttacher", 3);
  
  public ImageView.ScaleType A = ImageView.ScaleType.FIT_CENTER;
  
  public final AccelerateDecelerateInterpolator b = new AccelerateDecelerateInterpolator();
  
  public int c = 200;
  
  public float e = 1.0F;
  
  public float f = 1.75F;
  
  public float g = 3.0F;
  
  public boolean h = true;
  
  public boolean i = false;
  
  public WeakReference j;
  
  public final GestureDetector k;
  
  public final jc0 l;
  
  public final Matrix m = new Matrix();
  
  public final Matrix n = new Matrix();
  
  public final Matrix o = new Matrix();
  
  public final RectF p = new RectF();
  
  public final float[] q = new float[9];
  
  public q61 r;
  
  public View.OnLongClickListener s;
  
  public int t;
  
  public int u;
  
  public int v;
  
  public int w;
  
  public o61 x;
  
  public int y = 2;
  
  public boolean z;
  
  public u61(PhotoView paramPhotoView) {
    this.j = new WeakReference<PhotoView>(paramPhotoView);
    paramPhotoView.setDrawingCacheEnabled(true);
    paramPhotoView.setOnTouchListener(this);
    ViewTreeObserver viewTreeObserver = paramPhotoView.getViewTreeObserver();
    if (viewTreeObserver != null)
      viewTreeObserver.addOnGlobalLayoutListener(this); 
    if (paramPhotoView.isInEditMode())
      return; 
    jc0 jc01 = new jc0(paramPhotoView.getContext());
    jc01.a = this;
    this.l = jc01;
    GestureDetector gestureDetector = new GestureDetector(paramPhotoView.getContext(), (GestureDetector.OnGestureListener)new l61(0, this));
    this.k = gestureDetector;
    gestureDetector.setOnDoubleTapListener(new tw(this));
    this.z = true;
    o();
  }
  
  public static void d(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 < paramFloat2) {
      if (paramFloat2 < paramFloat3)
        return; 
      l0.l("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
      return;
    } 
    l0.l("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
  }
  
  public static int i(ImageView paramImageView) {
    return (paramImageView == null) ? 0 : (paramImageView.getHeight() - paramImageView.getPaddingTop() - paramImageView.getPaddingBottom());
  }
  
  public static int j(ImageView paramImageView) {
    return (paramImageView == null) ? 0 : (paramImageView.getWidth() - paramImageView.getPaddingLeft() - paramImageView.getPaddingRight());
  }
  
  public final void a() {
    o61 o611 = this.x;
    if (o611 != null) {
      if (B)
        Log.d("PhotoViewAttacher", "Cancel Fling"); 
      ((OverScroller)((bh0)o611.f).c).forceFinished(true);
      this.x = null;
    } 
  }
  
  public final void b() {
    if (c())
      m(g()); 
  }
  
  public final boolean c() {
    ImageView imageView = h();
    if (imageView != null) {
      RectF rectF = f(g());
      if (rectF != null) {
        float f5 = rectF.height();
        float f3 = rectF.width();
        float f1 = i(imageView);
        float f2 = 0.0F;
        if (f5 <= f1) {
          int i = m61.a[this.A.ordinal()];
          float f = rectF.top;
          if (i != 2) {
            if (i != 3) {
              f1 = (f1 - f5) / 2.0F;
            } else {
              f1 -= f5;
            } 
            f1 -= f;
          } else {
            f1 = -f;
          } 
        } else {
          float f = rectF.top;
          if (f > 0.0F) {
            f1 = -f;
          } else {
            f = rectF.bottom;
            if (f < f1) {
              f1 -= f;
            } else {
              f1 = 0.0F;
            } 
          } 
        } 
        float f4 = j(imageView);
        if (f3 <= f4) {
          int i = m61.a[this.A.ordinal()];
          f5 = rectF.left;
          if (i != 2) {
            if (i != 3) {
              f2 = (f4 - f3) / 2.0F;
            } else {
              f2 = f4 - f3;
            } 
            f2 -= f5;
          } else {
            f2 = -f5;
          } 
          this.y = 2;
        } else {
          f3 = rectF.left;
          if (f3 > 0.0F) {
            this.y = 0;
            f2 = -f3;
          } else {
            f3 = rectF.right;
            if (f3 < f4) {
              f2 = f4 - f3;
              this.y = 1;
            } else {
              this.y = -1;
            } 
          } 
        } 
        this.o.postTranslate(f2, f1);
        return true;
      } 
    } 
    return false;
  }
  
  public final void e() {
    WeakReference<ImageView> weakReference = this.j;
    if (weakReference == null)
      return; 
    ImageView imageView = weakReference.get();
    if (imageView != null) {
      ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
      if (viewTreeObserver != null && viewTreeObserver.isAlive())
        viewTreeObserver.removeGlobalOnLayoutListener(this); 
      imageView.setOnTouchListener(null);
      a();
    } 
    GestureDetector gestureDetector = this.k;
    if (gestureDetector != null)
      gestureDetector.setOnDoubleTapListener(null); 
    this.r = null;
    this.j = null;
  }
  
  public final RectF f(Matrix paramMatrix) {
    ImageView imageView = h();
    if (imageView != null) {
      Drawable drawable = imageView.getDrawable();
      if (drawable != null) {
        float f1 = drawable.getIntrinsicWidth();
        float f2 = drawable.getIntrinsicHeight();
        RectF rectF = this.p;
        rectF.set(0.0F, 0.0F, f1, f2);
        paramMatrix.mapRect(rectF);
        return rectF;
      } 
    } 
    return null;
  }
  
  public final Matrix g() {
    Matrix matrix1 = this.m;
    Matrix matrix2 = this.n;
    matrix2.set(matrix1);
    matrix2.postConcat(this.o);
    return matrix2;
  }
  
  public final ImageView h() {
    WeakReference<ImageView> weakReference = this.j;
    if (weakReference != null) {
      ImageView imageView = weakReference.get();
    } else {
      weakReference = null;
    } 
    if (weakReference == null) {
      e();
      Log.i("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
    } 
    return (ImageView)weakReference;
  }
  
  public final float k() {
    Matrix matrix = this.o;
    float[] arrayOfFloat = this.q;
    matrix.getValues(arrayOfFloat);
    float f = (float)Math.pow(arrayOfFloat[0], 2.0D);
    matrix.getValues(arrayOfFloat);
    return (float)Math.sqrt((f + (float)Math.pow(arrayOfFloat[3], 2.0D)));
  }
  
  public final void l(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (B)
      Log.d("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Float.valueOf(paramFloat3) })); 
    if ((k() < this.g || paramFloat1 < 1.0F) && (k() > this.e || paramFloat1 > 1.0F)) {
      this.o.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      b();
      return;
    } 
  }
  
  public final void m(Matrix paramMatrix) {
    ImageView imageView = h();
    if (imageView != null) {
      ImageView imageView1 = h();
      if (imageView1 == null || imageView1 instanceof tg0 || ImageView.ScaleType.MATRIX.equals(imageView1.getScaleType())) {
        imageView.setImageMatrix(paramMatrix);
        return;
      } 
      tp.f("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
      return;
    } 
  }
  
  public final void n(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean) {
    ImageView imageView = h();
    if (imageView != null) {
      if (paramFloat1 < this.e || paramFloat1 > this.g) {
        Log.i("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
        return;
      } 
      if (paramBoolean) {
        imageView.post(new n61(this, k(), paramFloat1, paramFloat2, paramFloat3));
        return;
      } 
      this.o.setScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      b();
      return;
    } 
  }
  
  public final void o() {
    ImageView imageView = h();
    if (imageView != null) {
      if (this.z) {
        if (!(imageView instanceof tg0)) {
          ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
          if (!scaleType.equals(imageView.getScaleType()))
            imageView.setScaleType(scaleType); 
        } 
        p(imageView.getDrawable());
        return;
      } 
      Matrix matrix = this.o;
      matrix.reset();
      matrix.postRotate(0.0F);
      b();
      m(g());
      c();
    } 
  }
  
  public final void onGlobalLayout() {
    ImageView imageView = h();
    if (imageView != null)
      if (this.z) {
        int m = imageView.getTop();
        int i = imageView.getRight();
        int k = imageView.getBottom();
        int j = imageView.getLeft();
        if (m != this.t || k != this.v || j != this.w || i != this.u) {
          p(imageView.getDrawable());
          this.t = m;
          this.u = i;
          this.v = k;
          this.w = j;
          return;
        } 
      } else {
        p(imageView.getDrawable());
      }  
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield z : Z
    //   4: istore #5
    //   6: iconst_0
    //   7: istore #7
    //   9: iload #5
    //   11: ifeq -> 302
    //   14: aload_1
    //   15: checkcast android/widget/ImageView
    //   18: astore #9
    //   20: aload #9
    //   22: ifnull -> 302
    //   25: aload #9
    //   27: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   30: ifnull -> 302
    //   33: aload_1
    //   34: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   37: astore #9
    //   39: aload_2
    //   40: invokevirtual getAction : ()I
    //   43: istore_3
    //   44: iconst_1
    //   45: istore #6
    //   47: iload_3
    //   48: ifeq -> 133
    //   51: iload_3
    //   52: iconst_1
    //   53: if_icmpeq -> 64
    //   56: iload_3
    //   57: iconst_3
    //   58: if_icmpeq -> 64
    //   61: goto -> 162
    //   64: aload_0
    //   65: invokevirtual k : ()F
    //   68: aload_0
    //   69: getfield e : F
    //   72: fcmpg
    //   73: ifge -> 61
    //   76: aload_0
    //   77: invokevirtual c : ()Z
    //   80: pop
    //   81: aload_0
    //   82: aload_0
    //   83: invokevirtual g : ()Landroid/graphics/Matrix;
    //   86: invokevirtual f : (Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    //   89: astore #9
    //   91: aload #9
    //   93: ifnull -> 61
    //   96: aload_1
    //   97: new n61
    //   100: dup
    //   101: aload_0
    //   102: aload_0
    //   103: invokevirtual k : ()F
    //   106: aload_0
    //   107: getfield e : F
    //   110: aload #9
    //   112: invokevirtual centerX : ()F
    //   115: aload #9
    //   117: invokevirtual centerY : ()F
    //   120: invokespecial <init> : (Lu61;FFFF)V
    //   123: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   126: pop
    //   127: iconst_1
    //   128: istore #5
    //   130: goto -> 165
    //   133: aload #9
    //   135: ifnull -> 149
    //   138: aload #9
    //   140: iconst_1
    //   141: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   146: goto -> 158
    //   149: ldc 'PhotoViewAttacher'
    //   151: ldc_w 'onTouch getParent() returned null'
    //   154: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   157: pop
    //   158: aload_0
    //   159: invokevirtual a : ()V
    //   162: iconst_0
    //   163: istore #5
    //   165: aload_0
    //   166: getfield l : Ljc0;
    //   169: astore_1
    //   170: aload_1
    //   171: ifnull -> 275
    //   174: aload_1
    //   175: getfield j : Landroid/view/ScaleGestureDetector;
    //   178: astore #9
    //   180: aload #9
    //   182: invokevirtual isInProgress : ()Z
    //   185: istore #8
    //   187: aload_1
    //   188: getfield g : Z
    //   191: istore #5
    //   193: aload #9
    //   195: aload_2
    //   196: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   199: pop
    //   200: aload_1
    //   201: aload_2
    //   202: invokevirtual c : (Landroid/view/MotionEvent;)V
    //   205: iload #8
    //   207: ifne -> 223
    //   210: aload #9
    //   212: invokevirtual isInProgress : ()Z
    //   215: ifne -> 223
    //   218: iconst_1
    //   219: istore_3
    //   220: goto -> 225
    //   223: iconst_0
    //   224: istore_3
    //   225: iload #5
    //   227: ifne -> 243
    //   230: aload_1
    //   231: getfield g : Z
    //   234: ifne -> 243
    //   237: iconst_1
    //   238: istore #4
    //   240: goto -> 246
    //   243: iconst_0
    //   244: istore #4
    //   246: iload #7
    //   248: istore #5
    //   250: iload_3
    //   251: ifeq -> 266
    //   254: iload #7
    //   256: istore #5
    //   258: iload #4
    //   260: ifeq -> 266
    //   263: iconst_1
    //   264: istore #5
    //   266: aload_0
    //   267: iload #5
    //   269: putfield i : Z
    //   272: iconst_1
    //   273: istore #5
    //   275: aload_0
    //   276: getfield k : Landroid/view/GestureDetector;
    //   279: astore_1
    //   280: aload_1
    //   281: ifnull -> 299
    //   284: aload_1
    //   285: aload_2
    //   286: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   289: ifeq -> 299
    //   292: iload #6
    //   294: istore #5
    //   296: goto -> 299
    //   299: iload #5
    //   301: ireturn
    //   302: iconst_0
    //   303: ireturn
    //   304: astore #10
    //   306: goto -> 205
    // Exception table:
    //   from	to	target	type
    //   193	205	304	java/lang/IllegalArgumentException
  }
  
  public final void p(Drawable paramDrawable) {
    ImageView imageView = h();
    if (imageView != null && paramDrawable != null) {
      float f2 = j(imageView);
      float f4 = i(imageView);
      int i = paramDrawable.getIntrinsicWidth();
      int j = paramDrawable.getIntrinsicHeight();
      Matrix matrix = this.m;
      matrix.reset();
      float f1 = i;
      float f5 = f2 / f1;
      float f3 = j;
      float f6 = f4 / f3;
      ImageView.ScaleType scaleType = this.A;
      if (scaleType == ImageView.ScaleType.CENTER) {
        matrix.postTranslate((f2 - f1) / 2.0F, (f4 - f3) / 2.0F);
      } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
        f5 = Math.max(f5, f6);
        matrix.postScale(f5, f5);
        matrix.postTranslate((f2 - f1 * f5) / 2.0F, (f4 - f3 * f5) / 2.0F);
      } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
        f5 = Math.min(1.0F, Math.min(f5, f6));
        matrix.postScale(f5, f5);
        matrix.postTranslate((f2 - f1 * f5) / 2.0F, (f4 - f3 * f5) / 2.0F);
      } else {
        RectF rectF1 = new RectF(0.0F, 0.0F, f1, f3);
        RectF rectF2 = new RectF(0.0F, 0.0F, f2, f4);
        i = m61.a[this.A.ordinal()];
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                matrix.setRectToRect(rectF1, rectF2, Matrix.ScaleToFit.FILL); 
            } else {
              matrix.setRectToRect(rectF1, rectF2, Matrix.ScaleToFit.CENTER);
            } 
          } else {
            matrix.setRectToRect(rectF1, rectF2, Matrix.ScaleToFit.END);
          } 
        } else {
          matrix.setRectToRect(rectF1, rectF2, Matrix.ScaleToFit.START);
        } 
      } 
      matrix = this.o;
      matrix.reset();
      matrix.postRotate(0.0F);
      b();
      m(g());
      c();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */