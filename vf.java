import android.graphics.Bitmap;

public final class vf extends in1 {
  public final int b;
  
  public final Object c;
  
  public vf(int paramInt, Object paramObject) {
    this.a = false;
    this.c = paramObject;
  }
  
  public final int a() {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        return ((int[])object).length;
      case 0:
        break;
    } 
    return ((Bitmap[])object).length;
  }
  
  public final void b(int paramInt, jh0 paramjh0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield c : Ljava/lang/Object;
    //   9: astore #4
    //   11: iload_3
    //   12: tableswitch default -> 32, 0 -> 104
    //   32: aload #4
    //   34: checkcast [I
    //   37: iload_1
    //   38: iaload
    //   39: istore_1
    //   40: invokestatic getImageLoadingService : ()Lhh0;
    //   43: astore #4
    //   45: aload_2
    //   46: getfield w : Landroid/widget/ImageView;
    //   49: astore_2
    //   50: aload #4
    //   52: checkcast fb0
    //   55: invokevirtual getClass : ()Ljava/lang/Class;
    //   58: pop
    //   59: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   62: iload_1
    //   63: invokevirtual e : (I)Lag1;
    //   66: astore #4
    //   68: aload #4
    //   70: iconst_1
    //   71: newarray int
    //   73: dup
    //   74: iconst_0
    //   75: iconst_2
    //   76: iastore
    //   77: invokevirtual g : ([I)V
    //   80: aload #4
    //   82: iconst_1
    //   83: putfield c : Z
    //   86: aload #4
    //   88: iconst_1
    //   89: putfield d : Z
    //   92: aload #4
    //   94: invokevirtual b : ()V
    //   97: aload #4
    //   99: aload_2
    //   100: invokevirtual f : (Landroid/widget/ImageView;)V
    //   103: return
    //   104: aload_2
    //   105: getfield w : Landroid/widget/ImageView;
    //   108: aload #4
    //   110: checkcast [Landroid/graphics/Bitmap;
    //   113: iload_1
    //   114: aaload
    //   115: invokevirtual setImageBitmap : (Landroid/graphics/Bitmap;)V
    //   118: return
    //   119: astore_2
    //   120: goto -> 103
    // Exception table:
    //   from	to	target	type
    //   59	103	119	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */