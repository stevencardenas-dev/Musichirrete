import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import r3.IKWi.AyxAR;

public final class af0 implements WildcardType {
  public final Type b;
  
  public final Type c;
  
  public af0(Type[] paramArrayOfType1, Type[] paramArrayOfType2) {
    if (paramArrayOfType2.length <= 1) {
      if (paramArrayOfType1.length == 1) {
        if (paramArrayOfType2.length == 1) {
          Objects.requireNonNull(paramArrayOfType2[0]);
          g92.n(paramArrayOfType2[0]);
          if (paramArrayOfType1[0] == Object.class) {
            this.c = g92.l(paramArrayOfType2[0]);
            this.b = Object.class;
            return;
          } 
          l0.l("When lower bound is specified, upper bound must be Object");
          throw null;
        } 
        Objects.requireNonNull(paramArrayOfType1[0]);
        g92.n(paramArrayOfType1[0]);
        this.c = null;
        this.b = g92.l(paramArrayOfType1[0]);
        return;
      } 
      l0.l("Exactly one upper bound must be specified");
      throw null;
    } 
    l0.l("At most one lower bound is supported");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof WildcardType && g92.A(this, (WildcardType)paramObject));
  }
  
  public final Type[] getLowerBounds() {
    Type type = this.c;
    return (type != null) ? new Type[] { type } : g92.e;
  }
  
  public final Type[] getUpperBounds() {
    return new Type[] { this.b };
  }
  
  public final int hashCode() {
    boolean bool;
    Type type = this.c;
    if (type != null) {
      bool = type.hashCode() + 31;
    } else {
      bool = true;
    } 
    return this.b.hashCode() + 31 ^ bool;
  }
  
  public final String toString() {
    Type type2 = this.c;
    if (type2 != null) {
      StringBuilder stringBuilder1 = new StringBuilder("? super ");
      stringBuilder1.append(g92.e0(type2));
      return stringBuilder1.toString();
    } 
    Type type1 = this.b;
    if (type1 == Object.class)
      return AyxAR.NwsjZHIKovX; 
    StringBuilder stringBuilder = new StringBuilder("? extends ");
    stringBuilder.append(g92.e0(type1));
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\af0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */