import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class on0 extends AbstractSet {
  public final int b;
  
  public final Map c;
  
  public void clear() {
    int i = this.b;
    Map map = this.c;
    switch (i) {
      default:
        super.clear();
        return;
      case 1:
        ((qn0)map).clear();
        return;
      case 0:
        break;
    } 
    ((qn0)map).clear();
  }
  
  public boolean contains(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield c : Ljava/util/Map;
    //   9: astore #6
    //   11: iload_2
    //   12: tableswitch default -> 36, 0 -> 52, 1 -> 42
    //   36: aload_0
    //   37: aload_1
    //   38: invokespecial contains : (Ljava/lang/Object;)Z
    //   41: ireturn
    //   42: aload #6
    //   44: checkcast qn0
    //   47: aload_1
    //   48: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   51: ireturn
    //   52: aload_1
    //   53: instanceof java/util/Map$Entry
    //   56: istore #5
    //   58: iconst_0
    //   59: istore #4
    //   61: iload #4
    //   63: istore_3
    //   64: iload #5
    //   66: ifeq -> 152
    //   69: aload #6
    //   71: checkcast qn0
    //   74: astore #6
    //   76: aload_1
    //   77: checkcast java/util/Map$Entry
    //   80: astore #8
    //   82: aload #8
    //   84: invokeinterface getKey : ()Ljava/lang/Object;
    //   89: astore_1
    //   90: aconst_null
    //   91: astore #7
    //   93: aload_1
    //   94: ifnull -> 108
    //   97: aload #6
    //   99: aload_1
    //   100: iconst_0
    //   101: invokevirtual a : (Ljava/lang/Object;Z)Lpn0;
    //   104: astore_1
    //   105: goto -> 110
    //   108: aconst_null
    //   109: astore_1
    //   110: aload #7
    //   112: astore #6
    //   114: aload_1
    //   115: ifnull -> 142
    //   118: aload #7
    //   120: astore #6
    //   122: aload_1
    //   123: getfield j : Ljava/lang/Object;
    //   126: aload #8
    //   128: invokeinterface getValue : ()Ljava/lang/Object;
    //   133: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   136: ifeq -> 142
    //   139: aload_1
    //   140: astore #6
    //   142: iload #4
    //   144: istore_3
    //   145: aload #6
    //   147: ifnull -> 152
    //   150: iconst_1
    //   151: istore_3
    //   152: iload_3
    //   153: ireturn
    //   154: astore_1
    //   155: goto -> 108
    // Exception table:
    //   from	to	target	type
    //   97	105	154	java/lang/ClassCastException
  }
  
  public final Iterator iterator() {
    int i = this.b;
    Map map = this.c;
    switch (i) {
      default:
        return new z8((b9)map);
      case 1:
        return new nn0((qn0)map, 1);
      case 0:
        break;
    } 
    return new nn0((qn0)map, 0);
  }
  
  public boolean remove(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_2
    //   5: aconst_null
    //   6: astore #6
    //   8: aconst_null
    //   9: astore #7
    //   11: aload_0
    //   12: getfield c : Ljava/util/Map;
    //   15: astore #5
    //   17: iconst_0
    //   18: istore_3
    //   19: iconst_0
    //   20: istore #4
    //   22: iload_2
    //   23: tableswitch default -> 44, 0 -> 99, 1 -> 50
    //   44: aload_0
    //   45: aload_1
    //   46: invokespecial remove : (Ljava/lang/Object;)Z
    //   49: ireturn
    //   50: aload #5
    //   52: checkcast qn0
    //   55: astore #6
    //   57: aload #7
    //   59: astore #5
    //   61: aload_1
    //   62: ifnull -> 74
    //   65: aload #6
    //   67: aload_1
    //   68: iconst_0
    //   69: invokevirtual a : (Ljava/lang/Object;Z)Lpn0;
    //   72: astore #5
    //   74: aload #5
    //   76: ifnull -> 87
    //   79: aload #6
    //   81: aload #5
    //   83: iconst_1
    //   84: invokevirtual c : (Lpn0;Z)V
    //   87: iload #4
    //   89: istore_3
    //   90: aload #5
    //   92: ifnull -> 97
    //   95: iconst_1
    //   96: istore_3
    //   97: iload_3
    //   98: ireturn
    //   99: aload #5
    //   101: checkcast qn0
    //   104: astore #7
    //   106: aload_1
    //   107: instanceof java/util/Map$Entry
    //   110: ifne -> 116
    //   113: goto -> 197
    //   116: aload_1
    //   117: checkcast java/util/Map$Entry
    //   120: astore #8
    //   122: aload #8
    //   124: invokeinterface getKey : ()Ljava/lang/Object;
    //   129: astore_1
    //   130: aload_1
    //   131: ifnull -> 145
    //   134: aload #7
    //   136: aload_1
    //   137: iconst_0
    //   138: invokevirtual a : (Ljava/lang/Object;Z)Lpn0;
    //   141: astore_1
    //   142: goto -> 147
    //   145: aconst_null
    //   146: astore_1
    //   147: aload #6
    //   149: astore #5
    //   151: aload_1
    //   152: ifnull -> 179
    //   155: aload #6
    //   157: astore #5
    //   159: aload_1
    //   160: getfield j : Ljava/lang/Object;
    //   163: aload #8
    //   165: invokeinterface getValue : ()Ljava/lang/Object;
    //   170: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   173: ifeq -> 179
    //   176: aload_1
    //   177: astore #5
    //   179: aload #5
    //   181: ifnonnull -> 187
    //   184: goto -> 197
    //   187: aload #7
    //   189: aload #5
    //   191: iconst_1
    //   192: invokevirtual c : (Lpn0;Z)V
    //   195: iconst_1
    //   196: istore_3
    //   197: iload_3
    //   198: ireturn
    //   199: astore_1
    //   200: aload #7
    //   202: astore #5
    //   204: goto -> 74
    //   207: astore_1
    //   208: goto -> 145
    // Exception table:
    //   from	to	target	type
    //   65	74	199	java/lang/ClassCastException
    //   134	142	207	java/lang/ClassCastException
  }
  
  public final int size() {
    int i = this.b;
    Map map = this.c;
    switch (i) {
      default:
        return ((b9)map).e;
      case 1:
        return ((qn0)map).f;
      case 0:
        break;
    } 
    return ((qn0)map).f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\on0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */