import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class j8 {
  public static final RectF l = new RectF();
  
  public static final ConcurrentHashMap m = new ConcurrentHashMap<Object, Object>();
  
  public int a = 0;
  
  public boolean b = false;
  
  public float c = -1.0F;
  
  public float d = -1.0F;
  
  public float e = -1.0F;
  
  public int[] f = new int[0];
  
  public boolean g = false;
  
  public TextPaint h;
  
  public final TextView i;
  
  public final Context j;
  
  public final g8 k;
  
  public j8(TextView paramTextView) {
    this.i = paramTextView;
    this.j = paramTextView.getContext();
    if (Build.VERSION.SDK_INT >= 29) {
      this.k = new h8();
      return;
    } 
    this.k = new g8();
  }
  
  public static int[] b(int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    if (i != 0) {
      Arrays.sort(paramArrayOfint);
      ArrayList<? extends Comparable<? super Integer>> arrayList = new ArrayList();
      boolean bool = false;
      byte b;
      for (b = 0; b < i; b++) {
        int j = paramArrayOfint[b];
        if (j > 0 && Collections.binarySearch(arrayList, Integer.valueOf(j)) < 0)
          arrayList.add(Integer.valueOf(j)); 
      } 
      if (i != arrayList.size()) {
        i = arrayList.size();
        paramArrayOfint = new int[i];
        for (b = bool; b < i; b++)
          paramArrayOfint[b] = ((Integer)arrayList.get(b)).intValue(); 
        return paramArrayOfint;
      } 
    } 
    return paramArrayOfint;
  }
  
  public static Method d(String paramString) {
    try {
      ConcurrentHashMap<String, Method> concurrentHashMap = m;
      Method method2 = (Method)concurrentHashMap.get(paramString);
      Method method1 = method2;
      if (method2 == null) {
        method2 = TextView.class.getDeclaredMethod(paramString, null);
        method1 = method2;
        if (method2 != null) {
          method2.setAccessible(true);
          concurrentHashMap.put(paramString, method2);
          return method2;
        } 
      } 
    } catch (Exception exception) {}
    return (Method)exception;
  }
  
  public static Object e(Object paramObject1, Object paramObject2, String paramString) {
    try {
      return d(paramString).invoke(paramObject1, null);
    } catch (Exception exception) {
    
    } finally {}
    StringBuilder stringBuilder = new StringBuilder("Failed to invoke TextView#");
    stringBuilder.append(paramString);
    stringBuilder.append("() method");
    Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), (Throwable)paramObject1);
    return paramObject2;
  }
  
  public final void a() {
    if (!f())
      return; 
    if (this.b) {
      int i;
      if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0)
        return; 
      if (this.k.b(this.i)) {
        i = 1048576;
      } else {
        i = this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
      } 
      int j = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
      if (i <= 0 || j <= 0)
        return; 
      RectF rectF = l;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{android/graphics/RectF}, name=null} */
      try {
        rectF.setEmpty();
        rectF.right = i;
        rectF.bottom = j;
        float f = c(rectF);
        if (f != this.i.getTextSize())
          g(0, f); 
      } finally {
        Exception exception;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{android/graphics/RectF}, name=null} */
    } 
    this.b = true;
  }
  
  public final int c(RectF paramRectF) {
    int i = this.f.length;
    if (i != 0) {
      int k = i - 1;
      int j = 0;
      i = 1;
      while (true) {
        CharSequence charSequence;
        int[] arrayOfInt = this.f;
        if (i <= k) {
          int m = (i + k) / 2;
          int n = arrayOfInt[m];
          TextView textView = this.i;
          charSequence = textView.getText();
          TransformationMethod transformationMethod = textView.getTransformationMethod();
          if (transformationMethod != null) {
            CharSequence charSequence1 = transformationMethod.getTransformation(charSequence, (View)textView);
            if (charSequence1 != null)
              charSequence = charSequence1; 
          } 
          j = textView.getMaxLines();
          TextPaint textPaint1 = this.h;
          if (textPaint1 == null) {
            this.h = new TextPaint();
          } else {
            textPaint1.reset();
          } 
          this.h.set(textView.getPaint());
          this.h.setTextSize(n);
          Layout.Alignment alignment = (Layout.Alignment)e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
          n = Math.round(paramRectF.right);
          TextPaint textPaint2 = this.h;
          g8 g81 = this.k;
          StaticLayout staticLayout = f8.a(charSequence, alignment, n, j, this.i, textPaint2, g81);
          if ((j != -1 && (staticLayout.getLineCount() > j || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != charSequence.length())) || staticLayout.getHeight() > paramRectF.bottom) {
            j = m - 1;
            k = j;
            continue;
          } 
          j = i;
          i = m + 1;
          continue;
        } 
        return charSequence[j];
      } 
    } 
    tp.f("No available text sizes to choose from.");
    return 0;
  }
  
  public final boolean f() {
    return (j() && this.a != 0);
  }
  
  public final void g(int paramInt, float paramFloat) {
    Resources resources;
    Context context = this.j;
    if (context == null) {
      resources = Resources.getSystem();
    } else {
      resources = resources.getResources();
    } 
    paramFloat = TypedValue.applyDimension(paramInt, paramFloat, resources.getDisplayMetrics());
    TextView textView = this.i;
    if (paramFloat != textView.getPaint().getTextSize()) {
      textView.getPaint().setTextSize(paramFloat);
      boolean bool = textView.isInLayout();
      if (textView.getLayout() != null) {
        this.b = false;
        try {
          Method method = d("nullLayouts");
          if (method != null)
            method.invoke(textView, null); 
        } catch (Exception exception) {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", exception);
        } 
        if (!bool) {
          textView.requestLayout();
        } else {
          textView.forceLayout();
        } 
        textView.invalidate();
      } 
    } 
  }
  
  public final boolean h() {
    boolean bool = j();
    byte b = 0;
    if (bool && this.a == 1) {
      if (!this.g || this.f.length == 0) {
        int i = (int)Math.floor(((this.e - this.d) / this.c)) + 1;
        int[] arrayOfInt = new int[i];
        while (b < i) {
          float f = this.d;
          arrayOfInt[b] = Math.round(b * this.c + f);
          b++;
        } 
        this.f = b(arrayOfInt);
      } 
      this.b = true;
    } else {
      this.b = false;
    } 
    return this.b;
  }
  
  public final boolean i() {
    boolean bool;
    int[] arrayOfInt = this.f;
    int i = arrayOfInt.length;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = bool;
    if (bool) {
      this.a = 1;
      this.d = arrayOfInt[0];
      this.e = arrayOfInt[i - 1];
      this.c = -1.0F;
    } 
    return bool;
  }
  
  public final boolean j() {
    return this.i instanceof a7 ^ true;
  }
  
  public final void k(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 > 0.0F) {
      if (paramFloat2 > paramFloat1) {
        if (paramFloat3 > 0.0F) {
          this.a = 1;
          this.d = paramFloat1;
          this.e = paramFloat2;
          this.c = paramFloat3;
          this.g = false;
          return;
        } 
        k91.i("The auto-size step granularity (", paramFloat3, "px) is less or equal to (0px)");
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder("Maximum auto-size text size (");
      stringBuilder.append(paramFloat2);
      stringBuilder.append("px) is less or equal to minimum auto-size text size (");
      stringBuilder.append(paramFloat1);
      stringBuilder.append("px)");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    k91.i("Minimum auto-size text size (", paramFloat1, "px) is less or equal to (0px)");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */