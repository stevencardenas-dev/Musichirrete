import java.util.Iterator;
import java.util.NoSuchElementException;

public final class mn0 implements Iterator, fl0 {
  public final String b;
  
  public int c;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public mn0(String paramString) {
    this.b = paramString;
  }
  
  public final boolean hasNext() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_1
    //   5: iload_1
    //   6: ifeq -> 18
    //   9: iload_1
    //   10: iconst_1
    //   11: if_icmpne -> 16
    //   14: iconst_1
    //   15: ireturn
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_0
    //   19: getfield g : I
    //   22: istore_1
    //   23: iconst_2
    //   24: istore_2
    //   25: iload_1
    //   26: ifge -> 36
    //   29: aload_0
    //   30: iconst_2
    //   31: putfield c : I
    //   34: iconst_0
    //   35: ireturn
    //   36: aload_0
    //   37: getfield b : Ljava/lang/String;
    //   40: astore #6
    //   42: aload #6
    //   44: invokevirtual length : ()I
    //   47: istore_3
    //   48: aload_0
    //   49: getfield e : I
    //   52: istore_1
    //   53: aload #6
    //   55: invokevirtual length : ()I
    //   58: istore #4
    //   60: iload_1
    //   61: iload #4
    //   63: if_icmpge -> 133
    //   66: aload #6
    //   68: iload_1
    //   69: invokevirtual charAt : (I)C
    //   72: istore #5
    //   74: iload #5
    //   76: bipush #10
    //   78: if_icmpeq -> 94
    //   81: iload #5
    //   83: bipush #13
    //   85: if_icmpeq -> 94
    //   88: iinc #1, 1
    //   91: goto -> 60
    //   94: iload #5
    //   96: bipush #13
    //   98: if_icmpne -> 128
    //   101: iload_1
    //   102: iconst_1
    //   103: iadd
    //   104: istore_3
    //   105: iload_3
    //   106: aload #6
    //   108: invokevirtual length : ()I
    //   111: if_icmpge -> 128
    //   114: aload #6
    //   116: iload_3
    //   117: invokevirtual charAt : (I)C
    //   120: bipush #10
    //   122: if_icmpne -> 128
    //   125: goto -> 130
    //   128: iconst_1
    //   129: istore_2
    //   130: goto -> 137
    //   133: iconst_m1
    //   134: istore_2
    //   135: iload_3
    //   136: istore_1
    //   137: aload_0
    //   138: iconst_1
    //   139: putfield c : I
    //   142: aload_0
    //   143: iload_2
    //   144: putfield g : I
    //   147: aload_0
    //   148: iload_1
    //   149: putfield f : I
    //   152: iconst_1
    //   153: ireturn
  }
  
  public final Object next() {
    if (hasNext()) {
      this.c = 0;
      int j = this.f;
      int i = this.e;
      this.e = this.g + j;
      return this.b.subSequence(i, j).toString();
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */