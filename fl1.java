import in.krosbits.musicolet.SetLcWallActivity;

public final class fl1 extends pr1 implements ad0 {
  public final int g;
  
  public final SetLcWallActivity h;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((fl1)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        return ((fl1)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    ((fl1)l((cs)paramObject2, paramObject1)).n(l02);
    return l02;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.h;
    switch (i) {
      default:
        return new fl1((SetLcWallActivity)paramObject, paramcs, 2);
      case 1:
        return new fl1((SetLcWallActivity)paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new fl1((SetLcWallActivity)paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic l02.a : Ll02;
    //   8: astore_3
    //   9: aload_0
    //   10: getfield h : Lin/krosbits/musicolet/SetLcWallActivity;
    //   13: astore #4
    //   15: iload_2
    //   16: tableswitch default -> 40, 0 -> 97, 1 -> 69
    //   40: aload_1
    //   41: invokestatic r0 : (Ljava/lang/Object;)V
    //   44: new java/io/File
    //   47: astore_1
    //   48: aload_1
    //   49: aload #4
    //   51: invokevirtual getFilesDir : ()Ljava/io/File;
    //   54: ldc 'lc_wall.jpg'
    //   56: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   59: aload_1
    //   60: invokevirtual delete : ()Z
    //   63: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   66: astore_1
    //   67: aload_1
    //   68: areturn
    //   69: aload_1
    //   70: invokestatic r0 : (Ljava/lang/Object;)V
    //   73: new java/io/File
    //   76: dup
    //   77: aload #4
    //   79: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   82: invokevirtual getFilesDir : ()Ljava/io/File;
    //   85: ldc 'lc_wall.jpg'
    //   87: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   90: invokevirtual isFile : ()Z
    //   93: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   96: areturn
    //   97: aload_1
    //   98: invokestatic r0 : (Ljava/lang/Object;)V
    //   101: aload #4
    //   103: invokevirtual recreate : ()V
    //   106: aload_3
    //   107: areturn
    //   108: astore_1
    //   109: aload_3
    //   110: astore_1
    //   111: goto -> 67
    // Exception table:
    //   from	to	target	type
    //   44	67	108	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */