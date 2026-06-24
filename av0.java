import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class av0 {
  public final int a;
  
  public List b;
  
  public boolean c;
  
  public av0(ArrayList<?> paramArrayList, boolean paramBoolean) {
    if (paramArrayList.isEmpty()) {
      this.b = Collections.EMPTY_LIST;
    } else {
      this.b = Collections.unmodifiableList(new ArrayList(paramArrayList));
    } 
    this.c = paramBoolean;
  }
  
  public static av0 a(Bundle paramBundle) {
    if (paramBundle == null)
      return null; 
    ArrayList<Bundle> arrayList2 = new ArrayList();
    ArrayList<Bundle> arrayList1 = paramBundle.getParcelableArrayList("routes");
    if (arrayList1 != null)
      for (byte b = 0; b < arrayList1.size(); b++) {
        Bundle bundle = arrayList1.get(b);
        if (bundle != null) {
          su0 su0 = new su0(bundle);
        } else {
          bundle = null;
        } 
        arrayList2.add(bundle);
      }  
    return new av0(arrayList2, paramBundle.getBoolean("supportsDynamicGroupRoute", false));
  }
  
  public String toString() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: tableswitch default -> 24, 0 -> 29
    //   24: aload_0
    //   25: invokespecial toString : ()Ljava/lang/String;
    //   28: areturn
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: ldc 'MediaRouteProviderDescriptor{ routes='
    //   35: invokespecial <init> : (Ljava/lang/String;)V
    //   38: astore #7
    //   40: aload_0
    //   41: getfield b : Ljava/util/List;
    //   44: astore #5
    //   46: aload #7
    //   48: aload #5
    //   50: invokeinterface toArray : ()[Ljava/lang/Object;
    //   55: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #7
    //   64: ldc ', isValid='
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload #5
    //   72: invokeinterface size : ()I
    //   77: istore_2
    //   78: iconst_0
    //   79: istore #4
    //   81: iconst_0
    //   82: istore_1
    //   83: iload_1
    //   84: iload_2
    //   85: if_icmpge -> 129
    //   88: aload #5
    //   90: iload_1
    //   91: invokeinterface get : (I)Ljava/lang/Object;
    //   96: checkcast su0
    //   99: astore #6
    //   101: iload #4
    //   103: istore_3
    //   104: aload #6
    //   106: ifnull -> 131
    //   109: aload #6
    //   111: invokevirtual e : ()Z
    //   114: ifne -> 123
    //   117: iload #4
    //   119: istore_3
    //   120: goto -> 131
    //   123: iinc #1, 1
    //   126: goto -> 83
    //   129: iconst_1
    //   130: istore_3
    //   131: aload #7
    //   133: iload_3
    //   134: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload #7
    //   140: ldc ' }'
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload #7
    //   148: invokevirtual toString : ()Ljava/lang/String;
    //   151: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\av0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */