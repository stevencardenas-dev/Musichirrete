import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class nm extends tm {
  public static final void n0(Iterable paramIterable, StringBuilder paramStringBuilder, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, CharSequence paramCharSequence4, wc0 paramwc0) {
    paramIterable.getClass();
    paramStringBuilder.append(paramCharSequence2);
    Iterator<CharSequence> iterator = paramIterable.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      paramCharSequence2 = iterator.next();
      if (++b > 1)
        paramStringBuilder.append(paramCharSequence1); 
      ws2.c(paramStringBuilder, paramCharSequence2, paramwc0);
    } 
    paramStringBuilder.append(paramCharSequence3);
  }
  
  public static String p0(Collection paramCollection, String paramString1, String paramString2, String paramString3, wc0 paramwc0, int paramInt) {
    if ((paramInt & 0x1) != 0)
      paramString1 = ", "; 
    if ((paramInt & 0x2) != 0)
      paramString2 = ""; 
    if ((paramInt & 0x4) != 0)
      paramString3 = ""; 
    if ((paramInt & 0x20) != 0)
      paramwc0 = null; 
    paramCollection.getClass();
    StringBuilder stringBuilder = new StringBuilder();
    n0(paramCollection, stringBuilder, paramString1, paramString2, paramString3, "...", paramwc0);
    return stringBuilder.toString();
  }
  
  public static Object q0(List paramList) {
    paramList.getClass();
    if (!paramList.isEmpty())
      return paramList.get(paramList.size() - 1); 
    throw new NoSuchElementException("List is empty.");
  }
  
  public static List r0(Iterable paramIterable) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_0
    //   6: instanceof java/util/Collection
    //   9: ifeq -> 80
    //   12: aload_0
    //   13: checkcast java/util/Collection
    //   16: astore_1
    //   17: aload_1
    //   18: invokeinterface size : ()I
    //   23: iconst_1
    //   24: if_icmpgt -> 32
    //   27: aload_0
    //   28: invokestatic v0 : (Ljava/lang/Iterable;)Ljava/util/List;
    //   31: areturn
    //   32: aload_1
    //   33: iconst_0
    //   34: anewarray java/lang/Comparable
    //   37: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   42: astore_1
    //   43: aload_1
    //   44: checkcast [Ljava/lang/Comparable;
    //   47: astore_0
    //   48: aload_0
    //   49: invokevirtual getClass : ()Ljava/lang/Class;
    //   52: pop
    //   53: aload_0
    //   54: arraylength
    //   55: iconst_1
    //   56: if_icmple -> 63
    //   59: aload_0
    //   60: invokestatic sort : ([Ljava/lang/Object;)V
    //   63: aload_1
    //   64: invokevirtual getClass : ()Ljava/lang/Class;
    //   67: pop
    //   68: aload_1
    //   69: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   72: astore_0
    //   73: aload_0
    //   74: invokevirtual getClass : ()Ljava/lang/Class;
    //   77: pop
    //   78: aload_0
    //   79: areturn
    //   80: aload_0
    //   81: invokestatic w0 : (Ljava/lang/Iterable;)Ljava/util/List;
    //   84: astore_0
    //   85: aload_0
    //   86: checkcast java/util/ArrayList
    //   89: invokevirtual size : ()I
    //   92: iconst_1
    //   93: if_icmple -> 100
    //   96: aload_0
    //   97: invokestatic sort : (Ljava/util/List;)V
    //   100: aload_0
    //   101: areturn
  }
  
  public static List s0(Iterable paramIterable, Comparator paramComparator) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_0
    //   6: instanceof java/util/Collection
    //   9: ifeq -> 71
    //   12: aload_0
    //   13: checkcast java/util/Collection
    //   16: astore_2
    //   17: aload_2
    //   18: invokeinterface size : ()I
    //   23: iconst_1
    //   24: if_icmpgt -> 32
    //   27: aload_0
    //   28: invokestatic v0 : (Ljava/lang/Iterable;)Ljava/util/List;
    //   31: areturn
    //   32: aload_2
    //   33: iconst_0
    //   34: anewarray java/lang/Object
    //   37: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   42: astore_0
    //   43: aload_0
    //   44: invokevirtual getClass : ()Ljava/lang/Class;
    //   47: pop
    //   48: aload_0
    //   49: arraylength
    //   50: iconst_1
    //   51: if_icmple -> 59
    //   54: aload_0
    //   55: aload_1
    //   56: invokestatic sort : ([Ljava/lang/Object;Ljava/util/Comparator;)V
    //   59: aload_0
    //   60: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   63: astore_0
    //   64: aload_0
    //   65: invokevirtual getClass : ()Ljava/lang/Class;
    //   68: pop
    //   69: aload_0
    //   70: areturn
    //   71: aload_0
    //   72: invokestatic w0 : (Ljava/lang/Iterable;)Ljava/util/List;
    //   75: astore_0
    //   76: aload_0
    //   77: checkcast java/util/ArrayList
    //   80: invokevirtual size : ()I
    //   83: iconst_1
    //   84: if_icmple -> 92
    //   87: aload_0
    //   88: aload_1
    //   89: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   92: aload_0
    //   93: areturn
  }
  
  public static final void t0(Iterable paramIterable, AbstractCollection paramAbstractCollection) {
    paramIterable.getClass();
    Iterator iterator = paramIterable.iterator();
    while (iterator.hasNext())
      paramAbstractCollection.add(iterator.next()); 
  }
  
  public static int[] u0(ArrayList<Object> paramArrayList) {
    int[] arrayOfInt = new int[paramArrayList.size()];
    int i = paramArrayList.size();
    byte b1 = 0;
    byte b2 = 0;
    while (b2 < i) {
      Object object = paramArrayList.get(b2);
      b2++;
      arrayOfInt[b1] = ((Number)object).intValue();
      b1++;
    } 
    return arrayOfInt;
  }
  
  public static List v0(Iterable paramIterable) {
    paramIterable.getClass();
    boolean bool = paramIterable instanceof Collection;
    d40 d40 = d40.b;
    if (bool) {
      Collection<?> collection = (Collection)paramIterable;
      int j = collection.size();
      if (j != 0) {
        if (j != 1)
          return new ArrayList(collection); 
        if (paramIterable instanceof List) {
          paramIterable = ((List<Iterable>)paramIterable).get(0);
        } else {
          paramIterable = collection.iterator().next();
        } 
        return zo2.E(paramIterable);
      } 
      return d40;
    } 
    List list = w0(paramIterable);
    paramIterable = list;
    int i = paramIterable.size();
    return (i != 0) ? ((i != 1) ? list : zo2.E(paramIterable.get(0))) : d40;
  }
  
  public static final List w0(Iterable paramIterable) {
    paramIterable.getClass();
    if (paramIterable instanceof Collection)
      return new ArrayList((Collection)paramIterable); 
    ArrayList arrayList = new ArrayList();
    t0(paramIterable, arrayList);
    return arrayList;
  }
  
  public static Set x0(ArrayList paramArrayList) {
    int i = paramArrayList.size();
    if (i != 0) {
      if (i != 1) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(or0.a0(paramArrayList.size()));
        t0(paramArrayList, linkedHashSet);
        return linkedHashSet;
      } 
      Set<?> set = Collections.singleton(paramArrayList.get(0));
      set.getClass();
      return set;
    } 
    return f40.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */