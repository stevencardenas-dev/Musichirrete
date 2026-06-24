import android.graphics.Paint;

public final class p12 extends s12 {
  public d7 d;
  
  public float e;
  
  public d7 f;
  
  public float g;
  
  public float h;
  
  public float i;
  
  public float j;
  
  public float k;
  
  public Paint.Cap l;
  
  public Paint.Join m;
  
  public float n;
  
  public final boolean a() {
    return (this.f.d() || this.d.d());
  }
  
  public final boolean b(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ld7;
    //   4: astore #7
    //   6: aload #7
    //   8: invokevirtual d : ()Z
    //   11: istore #5
    //   13: iconst_1
    //   14: istore_3
    //   15: iload #5
    //   17: ifeq -> 62
    //   20: aload #7
    //   22: getfield e : Ljava/lang/Object;
    //   25: checkcast android/content/res/ColorStateList
    //   28: astore #6
    //   30: aload #6
    //   32: aload_1
    //   33: aload #6
    //   35: invokevirtual getDefaultColor : ()I
    //   38: invokevirtual getColorForState : ([II)I
    //   41: istore_2
    //   42: iload_2
    //   43: aload #7
    //   45: getfield b : I
    //   48: if_icmpeq -> 62
    //   51: aload #7
    //   53: iload_2
    //   54: putfield b : I
    //   57: iconst_1
    //   58: istore_2
    //   59: goto -> 64
    //   62: iconst_0
    //   63: istore_2
    //   64: aload_0
    //   65: getfield d : Ld7;
    //   68: astore #7
    //   70: aload #7
    //   72: invokevirtual d : ()Z
    //   75: ifeq -> 121
    //   78: aload #7
    //   80: getfield e : Ljava/lang/Object;
    //   83: checkcast android/content/res/ColorStateList
    //   86: astore #6
    //   88: aload #6
    //   90: aload_1
    //   91: aload #6
    //   93: invokevirtual getDefaultColor : ()I
    //   96: invokevirtual getColorForState : ([II)I
    //   99: istore #4
    //   101: iload #4
    //   103: aload #7
    //   105: getfield b : I
    //   108: if_icmpeq -> 121
    //   111: aload #7
    //   113: iload #4
    //   115: putfield b : I
    //   118: goto -> 123
    //   121: iconst_0
    //   122: istore_3
    //   123: iload_2
    //   124: iload_3
    //   125: ior
    //   126: ireturn
  }
  
  public float getFillAlpha() {
    return this.h;
  }
  
  public int getFillColor() {
    return this.f.b;
  }
  
  public float getStrokeAlpha() {
    return this.g;
  }
  
  public int getStrokeColor() {
    return this.d.b;
  }
  
  public float getStrokeWidth() {
    return this.e;
  }
  
  public float getTrimPathEnd() {
    return this.j;
  }
  
  public float getTrimPathOffset() {
    return this.k;
  }
  
  public float getTrimPathStart() {
    return this.i;
  }
  
  public void setFillAlpha(float paramFloat) {
    this.h = paramFloat;
  }
  
  public void setFillColor(int paramInt) {
    this.f.b = paramInt;
  }
  
  public void setStrokeAlpha(float paramFloat) {
    this.g = paramFloat;
  }
  
  public void setStrokeColor(int paramInt) {
    this.d.b = paramInt;
  }
  
  public void setStrokeWidth(float paramFloat) {
    this.e = paramFloat;
  }
  
  public void setTrimPathEnd(float paramFloat) {
    this.j = paramFloat;
  }
  
  public void setTrimPathOffset(float paramFloat) {
    this.k = paramFloat;
  }
  
  public void setTrimPathStart(float paramFloat) {
    this.i = paramFloat;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */