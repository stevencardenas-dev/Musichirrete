import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;

public final class kp1 {
  public int a;
  
  public ls b;
  
  public int[][] c = new int[10][];
  
  public ls[] d = new ls[10];
  
  public static kp1 b(ls paramls) {
    kp1 kp11 = new kp1();
    kp11.a(StateSet.WILD_CARD, paramls);
    return kp11;
  }
  
  public final void a(int[] paramArrayOfint, ls paramls) {
    int i = this.a;
    if (i == 0 || paramArrayOfint.length == 0)
      this.b = paramls; 
    int[][] arrayOfInt = this.c;
    if (i >= arrayOfInt.length) {
      int j = i + 10;
      int[][] arrayOfInt1 = new int[j][];
      System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, i);
      this.c = arrayOfInt1;
      ls[] arrayOfLs = new ls[j];
      System.arraycopy(this.d, 0, arrayOfLs, 0, i);
      this.d = arrayOfLs;
    } 
    arrayOfInt = this.c;
    i = this.a;
    arrayOfInt[i] = paramArrayOfint;
    this.d[i] = paramls;
    this.a = i + 1;
  }
  
  public final ls c(int[] paramArrayOfint) {
    byte b3;
    int[][] arrayOfInt = this.c;
    boolean bool = false;
    byte b1 = 0;
    while (true) {
      int i = this.a;
      b3 = -1;
      if (b1 < i) {
        if (StateSet.stateSetMatches(arrayOfInt[b1], paramArrayOfint))
          break; 
        b1++;
        continue;
      } 
      b1 = -1;
      break;
    } 
    byte b2 = b1;
    if (b1 < 0) {
      int[] arrayOfInt2 = StateSet.WILD_CARD;
      int[][] arrayOfInt1 = this.c;
      b2 = bool;
      while (true) {
        b1 = b3;
        if (b2 < this.a) {
          if (StateSet.stateSetMatches(arrayOfInt1[b2], arrayOfInt2)) {
            b1 = b2;
            break;
          } 
          b2++;
          continue;
        } 
        break;
      } 
      b2 = b1;
    } 
    return (b2 < 0) ? this.b : this.d[b2];
  }
  
  public final void d(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    int i = paramXmlResourceParser.getDepth() + 1;
    while (true) {
      int j = paramXmlResourceParser.next();
      if (j != 1) {
        int k = paramXmlResourceParser.getDepth();
        if (k >= i || j != 3) {
          TypedArray typedArray;
          if (j != 2 || k > i || !paramXmlResourceParser.getName().equals("item"))
            continue; 
          Resources resources = paramContext.getResources();
          int[] arrayOfInt2 = zb1.A;
          if (paramTheme == null) {
            typedArray = resources.obtainAttributes(paramAttributeSet, arrayOfInt2);
          } else {
            typedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, arrayOfInt2, 0, 0);
          } 
          ls ls1 = vl1.c(typedArray, 5, new k(0.0F));
          typedArray.recycle();
          int m = paramAttributeSet.getAttributeCount();
          int[] arrayOfInt1 = new int[m];
          j = 0;
          for (k = 0; j < m; k = n) {
            int i1 = paramAttributeSet.getAttributeNameResource(j);
            int n = k;
            if (i1 != 2130969017) {
              if (paramAttributeSet.getAttributeBooleanValue(j, false)) {
                n = i1;
              } else {
                n = -i1;
              } 
              arrayOfInt1[k] = n;
              n = k + 1;
            } 
            j++;
          } 
          a(StateSet.trimStateSet(arrayOfInt1, k), ls1);
          continue;
        } 
      } 
      break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */