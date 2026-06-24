package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import jc1;

public class PreferenceImageView extends ImageView {
  public int b = Integer.MAX_VALUE;
  
  public int c = Integer.MAX_VALUE;
  
  public PreferenceImageView(Context paramContext) {
    this(paramContext, null);
  }
  
  public PreferenceImageView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PreferenceImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.j, paramInt, 0);
    setMaxWidth(typedArray.getDimensionPixelSize(3, 2147483647));
    setMaxHeight(typedArray.getDimensionPixelSize(2, 2147483647));
    typedArray.recycle();
  }
  
  public int getMaxHeight() {
    return this.c;
  }
  
  public int getMaxWidth() {
    return this.b;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic getMode : (I)I
    //   4: istore #5
    //   6: iload #5
    //   8: ldc -2147483648
    //   10: if_icmpeq -> 20
    //   13: iload_1
    //   14: istore_3
    //   15: iload #5
    //   17: ifne -> 63
    //   20: iload_1
    //   21: invokestatic getSize : (I)I
    //   24: istore #6
    //   26: aload_0
    //   27: invokevirtual getMaxWidth : ()I
    //   30: istore #4
    //   32: iload_1
    //   33: istore_3
    //   34: iload #4
    //   36: ldc 2147483647
    //   38: if_icmpeq -> 63
    //   41: iload #4
    //   43: iload #6
    //   45: if_icmplt -> 55
    //   48: iload_1
    //   49: istore_3
    //   50: iload #5
    //   52: ifne -> 63
    //   55: iload #4
    //   57: ldc -2147483648
    //   59: invokestatic makeMeasureSpec : (II)I
    //   62: istore_3
    //   63: iload_2
    //   64: invokestatic getMode : (I)I
    //   67: istore #5
    //   69: iload #5
    //   71: ldc -2147483648
    //   73: if_icmpeq -> 83
    //   76: iload_2
    //   77: istore_1
    //   78: iload #5
    //   80: ifne -> 126
    //   83: iload_2
    //   84: invokestatic getSize : (I)I
    //   87: istore #4
    //   89: aload_0
    //   90: invokevirtual getMaxHeight : ()I
    //   93: istore #6
    //   95: iload_2
    //   96: istore_1
    //   97: iload #6
    //   99: ldc 2147483647
    //   101: if_icmpeq -> 126
    //   104: iload #6
    //   106: iload #4
    //   108: if_icmplt -> 118
    //   111: iload_2
    //   112: istore_1
    //   113: iload #5
    //   115: ifne -> 126
    //   118: iload #6
    //   120: ldc -2147483648
    //   122: invokestatic makeMeasureSpec : (II)I
    //   125: istore_1
    //   126: aload_0
    //   127: iload_3
    //   128: iload_1
    //   129: invokespecial onMeasure : (II)V
    //   132: return
  }
  
  public void setMaxHeight(int paramInt) {
    this.c = paramInt;
    super.setMaxHeight(paramInt);
  }
  
  public void setMaxWidth(int paramInt) {
    this.b = paramInt;
    super.setMaxWidth(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\internal\PreferenceImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */