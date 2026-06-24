import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class eq extends View {
  public int[] b = new int[32];
  
  public int c;
  
  public final Context e;
  
  public yb f;
  
  public String g;
  
  public String h;
  
  public final HashMap i = new HashMap<Object, Object>();
  
  public eq(Context paramContext) {
    super(paramContext);
    this.e = paramContext;
    g(null);
  }
  
  public eq(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.e = paramContext;
    g(paramAttributeSet);
  }
  
  public eq(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = paramContext;
    g(paramAttributeSet);
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual length : ()I
    //   4: ifne -> 10
    //   7: goto -> 251
    //   10: aload_0
    //   11: getfield e : Landroid/content/Context;
    //   14: astore #6
    //   16: aload #6
    //   18: ifnonnull -> 24
    //   21: goto -> 251
    //   24: aload_1
    //   25: invokevirtual trim : ()Ljava/lang/String;
    //   28: astore #5
    //   30: aload_0
    //   31: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   34: instanceof androidx/constraintlayout/widget/ConstraintLayout
    //   37: ifeq -> 51
    //   40: aload_0
    //   41: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   44: checkcast androidx/constraintlayout/widget/ConstraintLayout
    //   47: astore_1
    //   48: goto -> 53
    //   51: aconst_null
    //   52: astore_1
    //   53: aload_0
    //   54: invokevirtual isInEditMode : ()Z
    //   57: ifeq -> 127
    //   60: aload_1
    //   61: ifnull -> 127
    //   64: aload #5
    //   66: ifnull -> 104
    //   69: aload_1
    //   70: getfield o : Ljava/util/HashMap;
    //   73: astore #4
    //   75: aload #4
    //   77: ifnull -> 104
    //   80: aload #4
    //   82: aload #5
    //   84: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   87: ifeq -> 104
    //   90: aload_1
    //   91: getfield o : Ljava/util/HashMap;
    //   94: aload #5
    //   96: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   99: astore #4
    //   101: goto -> 107
    //   104: aconst_null
    //   105: astore #4
    //   107: aload #4
    //   109: instanceof java/lang/Integer
    //   112: ifeq -> 127
    //   115: aload #4
    //   117: checkcast java/lang/Integer
    //   120: invokevirtual intValue : ()I
    //   123: istore_3
    //   124: goto -> 129
    //   127: iconst_0
    //   128: istore_3
    //   129: iload_3
    //   130: istore_2
    //   131: iload_3
    //   132: ifne -> 149
    //   135: iload_3
    //   136: istore_2
    //   137: aload_1
    //   138: ifnull -> 149
    //   141: aload_0
    //   142: aload_1
    //   143: aload #5
    //   145: invokevirtual f : (Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I
    //   148: istore_2
    //   149: iload_2
    //   150: istore_3
    //   151: iload_2
    //   152: ifne -> 167
    //   155: ldc vb1
    //   157: aload #5
    //   159: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   162: aconst_null
    //   163: invokevirtual getInt : (Ljava/lang/Object;)I
    //   166: istore_3
    //   167: iload_3
    //   168: istore_2
    //   169: iload_3
    //   170: ifne -> 191
    //   173: aload #6
    //   175: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   178: aload #5
    //   180: ldc 'id'
    //   182: aload #6
    //   184: invokevirtual getPackageName : ()Ljava/lang/String;
    //   187: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   190: istore_2
    //   191: iload_2
    //   192: ifeq -> 217
    //   195: aload_0
    //   196: getfield i : Ljava/util/HashMap;
    //   199: iload_2
    //   200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   203: aload #5
    //   205: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   208: pop
    //   209: aload_0
    //   210: iload_2
    //   211: invokevirtual b : (I)V
    //   214: goto -> 251
    //   217: new java/lang/StringBuilder
    //   220: dup
    //   221: ldc 'Could not find id of "'
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: astore_1
    //   227: aload_1
    //   228: aload #5
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload_1
    //   235: ldc '"'
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: ldc 'ConstraintHelper'
    //   243: aload_1
    //   244: invokevirtual toString : ()Ljava/lang/String;
    //   247: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   250: pop
    //   251: return
    //   252: astore_1
    //   253: iload_2
    //   254: istore_3
    //   255: goto -> 167
    // Exception table:
    //   from	to	target	type
    //   155	167	252	java/lang/Exception
  }
  
  public final void b(int paramInt) {
    if (paramInt == getId())
      return; 
    int i = this.c;
    int[] arrayOfInt = this.b;
    if (i + 1 > arrayOfInt.length)
      this.b = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2); 
    arrayOfInt = this.b;
    i = this.c;
    arrayOfInt[i] = paramInt;
    this.c = i + 1;
  }
  
  public final void c(String paramString) {
    if (paramString.length() != 0 && this.e != null) {
      String str = paramString.trim();
      if (getParent() instanceof ConstraintLayout) {
        ConstraintLayout constraintLayout = (ConstraintLayout)getParent();
      } else {
        paramString = null;
      } 
      if (paramString == null) {
        Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
        return;
      } 
      int i = paramString.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = paramString.getChildAt(b);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof gq && str.equals(((gq)layoutParams).Y))
          if (view.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder("to use ConstraintTag view ");
            stringBuilder.append(view.getClass().getSimpleName());
            stringBuilder.append(" must have an ID");
            Log.w("ConstraintHelper", stringBuilder.toString());
          } else {
            b(view.getId());
          }  
      } 
    } 
  }
  
  public final void d(ConstraintLayout paramConstraintLayout) {
    int i = getVisibility();
    float f = getElevation();
    for (byte b = 0; b < this.c; b++) {
      int j = this.b[b];
      View view = (View)paramConstraintLayout.b.get(j);
      if (view != null) {
        view.setVisibility(i);
        if (f > 0.0F)
          view.setTranslationZ(view.getTranslationZ() + f); 
      } 
    } 
  }
  
  public void e(ConstraintLayout paramConstraintLayout) {}
  
  public final int f(ConstraintLayout paramConstraintLayout, String paramString) {
    if (paramString != null) {
      Resources resources = this.e.getResources();
      if (resources != null) {
        int i = paramConstraintLayout.getChildCount();
        for (byte b = 0; b < i; b++) {
          View view = paramConstraintLayout.getChildAt(b);
          if (view.getId() != -1) {
            try {
              String str = resources.getResourceEntryName(view.getId());
            } catch (android.content.res.Resources.NotFoundException notFoundException) {
              notFoundException = null;
            } 
            if (paramString.equals(notFoundException))
              return view.getId(); 
          } 
        } 
      } 
    } 
    return 0;
  }
  
  public void g(AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, fc1.b);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == 35) {
          String str = typedArray.getString(j);
          this.g = str;
          setIds(str);
        } else if (j == 36) {
          String str = typedArray.getString(j);
          this.h = str;
          setReferenceTags(str);
        } 
      } 
      typedArray.recycle();
    } 
  }
  
  public int[] getReferencedIds() {
    return Arrays.copyOf(this.b, this.c);
  }
  
  public void h(er paramer, boolean paramBoolean) {}
  
  public void i() {}
  
  public final void j() {
    if (this.f != null) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      if (layoutParams instanceof gq)
        ((gq)layoutParams).q0 = this.f; 
    } 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    String str = this.g;
    if (str != null)
      setIds(str); 
    str = this.h;
    if (str != null)
      setReferenceTags(str); 
  }
  
  public final void onDraw(Canvas paramCanvas) {}
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(0, 0);
  }
  
  public void setIds(String paramString) {
    this.g = paramString;
    if (paramString == null)
      return; 
    int i = 0;
    this.c = 0;
    while (true) {
      int j = paramString.indexOf(',', i);
      if (j == -1) {
        a(paramString.substring(i));
        return;
      } 
      a(paramString.substring(i, j));
      i = j + 1;
    } 
  }
  
  public void setReferenceTags(String paramString) {
    this.h = paramString;
    if (paramString == null)
      return; 
    int i = 0;
    this.c = 0;
    while (true) {
      int j = paramString.indexOf(',', i);
      if (j == -1) {
        c(paramString.substring(i));
        return;
      } 
      c(paramString.substring(i, j));
      i = j + 1;
    } 
  }
  
  public void setReferencedIds(int[] paramArrayOfint) {
    this.g = null;
    byte b = 0;
    this.c = 0;
    while (b < paramArrayOfint.length) {
      b(paramArrayOfint[b]);
      b++;
    } 
  }
  
  public final void setTag(int paramInt, Object paramObject) {
    super.setTag(paramInt, paramObject);
    if (paramObject == null && this.g == null)
      b(paramInt); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */