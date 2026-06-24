import java.util.Arrays;

public abstract class zd {
  public final uv1 a;
  
  public final int b;
  
  public final int[] c;
  
  public final la0[] d;
  
  public int e;
  
  public zd(uv1 paramuv1, int... paramVarArgs) {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.r(bool);
    paramuv1.getClass();
    la0[] arrayOfLa0 = paramuv1.c;
    this.a = paramuv1;
    int i = paramVarArgs.length;
    this.b = i;
    this.d = new la0[i];
    i = 0;
    while (true) {
      int j = paramVarArgs.length;
      la0[] arrayOfLa01 = this.d;
      if (i < j) {
        arrayOfLa01[i] = arrayOfLa0[paramVarArgs[i]];
        i++;
        continue;
      } 
      Arrays.sort(arrayOfLa01, new ij(2));
      this.c = new int[this.b];
      j = 0;
      while (true) {
        i = this.b;
        if (j < i) {
          int[] arrayOfInt = this.c;
          la0 la01 = this.d[j];
          i = 0;
          while (true) {
            if (i < arrayOfLa0.length) {
              if (la01 == arrayOfLa0[i])
                break; 
              i++;
              continue;
            } 
            i = -1;
            break;
          } 
          arrayOfInt[j] = i;
          j++;
          continue;
        } 
        long[] arrayOfLong = new long[i];
        return;
      } 
      break;
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((zd)paramObject).a && Arrays.equals(this.c, ((zd)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.e == 0) {
      int i = System.identityHashCode(this.a);
      this.e = Arrays.hashCode(this.c) + i * 31;
    } 
    return this.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */