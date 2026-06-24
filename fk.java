import java.util.ArrayList;

public abstract class fk implements kd0 {
  public final os b;
  
  public final int c;
  
  public final hh e;
  
  public fk(os paramos, int paramInt, hh paramhh) {
    this.b = paramos;
    this.c = paramInt;
    this.e = paramhh;
  }
  
  public Object a(x80 paramx80, cs paramcs) {
    Object object = wf2.n(new ek(paramx80, this, null, 0), paramcs);
    return (object == ys.b) ? object : l02.a;
  }
  
  public final w80 b(os paramos, int paramInt, hh paramhh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Los;
    //   4: astore #5
    //   6: aload_1
    //   7: aload #5
    //   9: invokeinterface k : (Los;)Los;
    //   14: astore #6
    //   16: getstatic hh.b : Lhh;
    //   19: astore #7
    //   21: aload_0
    //   22: getfield e : Lhh;
    //   25: astore_1
    //   26: aload_0
    //   27: getfield c : I
    //   30: istore #4
    //   32: aload_3
    //   33: aload #7
    //   35: if_acmpeq -> 41
    //   38: goto -> 99
    //   41: iload #4
    //   43: bipush #-3
    //   45: if_icmpne -> 51
    //   48: goto -> 97
    //   51: iload_2
    //   52: bipush #-3
    //   54: if_icmpne -> 63
    //   57: iload #4
    //   59: istore_2
    //   60: goto -> 97
    //   63: iload #4
    //   65: bipush #-2
    //   67: if_icmpne -> 73
    //   70: goto -> 97
    //   73: iload_2
    //   74: bipush #-2
    //   76: if_icmpne -> 82
    //   79: goto -> 57
    //   82: iload_2
    //   83: iload #4
    //   85: iadd
    //   86: istore_2
    //   87: iload_2
    //   88: iflt -> 94
    //   91: goto -> 97
    //   94: ldc 2147483647
    //   96: istore_2
    //   97: aload_1
    //   98: astore_3
    //   99: aload #6
    //   101: aload #5
    //   103: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   106: ifeq -> 122
    //   109: iload_2
    //   110: iload #4
    //   112: if_icmpne -> 122
    //   115: aload_3
    //   116: aload_1
    //   117: if_acmpne -> 122
    //   120: aload_0
    //   121: areturn
    //   122: aload_0
    //   123: aload #6
    //   125: iload_2
    //   126: aload_3
    //   127: invokevirtual d : (Los;ILhh;)Lfk;
    //   130: areturn
  }
  
  public abstract Object c(pa1 parampa1, cs paramcs);
  
  public abstract fk d(os paramos, int paramInt, hh paramhh);
  
  public String toString() {
    ArrayList<String> arrayList = new ArrayList(4);
    b40 b40 = b40.b;
    os os1 = this.b;
    if (os1 != b40) {
      StringBuilder stringBuilder1 = new StringBuilder("context=");
      stringBuilder1.append(os1);
      arrayList.add(stringBuilder1.toString());
    } 
    int i = this.c;
    if (i != -3) {
      StringBuilder stringBuilder1 = new StringBuilder("capacity=");
      stringBuilder1.append(i);
      arrayList.add(stringBuilder1.toString());
    } 
    hh hh2 = hh.b;
    hh hh1 = this.e;
    if (hh1 != hh2) {
      StringBuilder stringBuilder1 = new StringBuilder("onBufferOverflow=");
      stringBuilder1.append(hh1);
      arrayList.add(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append('[');
    stringBuilder.append(nm.p0(arrayList, ", ", null, null, null, 62));
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */