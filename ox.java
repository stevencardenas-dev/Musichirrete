import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

public final class ox extends yv1 {
  public static final Parcelable.Creator<ox> CREATOR = new zb2(9);
  
  public final int A;
  
  public final SparseArray B;
  
  public final SparseBooleanArray C;
  
  public final int h;
  
  public final int i;
  
  public final int j;
  
  public final int k;
  
  public final boolean l;
  
  public final boolean m;
  
  public final boolean n;
  
  public final int o;
  
  public final int p;
  
  public final boolean q;
  
  public final int r;
  
  public final int s;
  
  public final boolean t;
  
  public final boolean u;
  
  public final boolean v;
  
  public final boolean w;
  
  public final boolean x;
  
  public final boolean y;
  
  public final boolean z;
  
  public ox(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, int paramInt7, int paramInt8, boolean paramBoolean4, String paramString, int paramInt9, boolean paramBoolean5, SparseArray paramSparseArray, SparseBooleanArray paramSparseBooleanArray) {
    super(paramString, paramInt9);
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = paramInt4;
    this.l = paramBoolean1;
    this.m = false;
    this.n = paramBoolean2;
    this.o = paramInt5;
    this.p = paramInt6;
    this.q = paramBoolean3;
    this.r = paramInt7;
    this.s = paramInt8;
    this.t = paramBoolean4;
    this.u = false;
    this.v = false;
    this.w = false;
    this.x = false;
    this.y = false;
    this.z = paramBoolean5;
    this.A = 0;
    this.B = paramSparseArray;
    this.C = paramSparseBooleanArray;
  }
  
  public ox(Parcel paramParcel) {
    super(paramParcel);
    boolean bool1;
    this.h = paramParcel.readInt();
    this.i = paramParcel.readInt();
    this.j = paramParcel.readInt();
    this.k = paramParcel.readInt();
    int i = paramParcel.readInt();
    boolean bool2 = true;
    if (i != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.l = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.m = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.n = bool1;
    this.o = paramParcel.readInt();
    this.p = paramParcel.readInt();
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.q = bool1;
    this.r = paramParcel.readInt();
    this.s = paramParcel.readInt();
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.t = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.u = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.v = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.w = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.x = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.y = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    this.z = bool1;
    this.A = paramParcel.readInt();
    int j = paramParcel.readInt();
    SparseArray sparseArray = new SparseArray(j);
    for (i = 0; i < j; i++) {
      int m = paramParcel.readInt();
      int k = paramParcel.readInt();
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>(k);
      for (byte b = 0; b < k; b++) {
        vv1 vv1 = (vv1)paramParcel.readParcelable(vv1.class.getClassLoader());
        vv1.getClass();
        hashMap.put(vv1, paramParcel.readParcelable(qx.class.getClassLoader()));
      } 
      sparseArray.put(m, hashMap);
    } 
    this.B = sparseArray;
    this.C = paramParcel.readSparseBooleanArray();
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && ox.class == paramObject.getClass()) {
      ox ox1 = (ox)paramObject;
      if (super.equals(paramObject) && this.h == ox1.h && this.i == ox1.i && this.j == ox1.j && this.k == ox1.k && this.l == ox1.l && this.m == ox1.m && this.n == ox1.n && this.q == ox1.q && this.o == ox1.o && this.p == ox1.p && this.r == ox1.r && this.s == ox1.s && this.t == ox1.t && this.u == ox1.u && this.v == ox1.v && this.w == ox1.w && this.x == ox1.x && this.y == ox1.y && this.z == ox1.z && this.A == ox1.A) {
        SparseBooleanArray sparseBooleanArray = ox1.C;
        paramObject = this.C;
        int i = paramObject.size();
        if (sparseBooleanArray.size() == i) {
          byte b;
          for (b = 0; b < i; b++) {
            if (sparseBooleanArray.indexOfKey(paramObject.keyAt(b)) < 0)
              break label62; 
          } 
          paramObject = ox1.B;
          SparseArray sparseArray = this.B;
          i = sparseArray.size();
          if (paramObject.size() == i) {
            b = 0;
            label62: while (true) {
              if (b < i) {
                int j = paramObject.indexOfKey(sparseArray.keyAt(b));
                if (j >= 0) {
                  Map map2 = (Map)sparseArray.valueAt(b);
                  Map map1 = (Map)paramObject.valueAt(j);
                  j = map2.size();
                  if (map1.size() != j)
                    break; 
                  for (Map.Entry entry : map2.entrySet()) {
                    vv1 vv1 = (vv1)entry.getKey();
                    if (map1.containsKey(vv1)) {
                      if (!d12.a(entry.getValue(), map1.get(vv1)))
                        break label62; 
                      continue;
                    } 
                    break label62;
                  } 
                  b++;
                  continue;
                } 
                break;
              } 
              return true;
            } 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (((((((((((((((((((super.hashCode() * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k) * 31 + this.l) * 31 + this.m) * 31 + this.n) * 31 + this.q) * 31 + this.o) * 31 + this.p) * 31 + this.r) * 31 + this.s) * 31 + this.t) * 31 + this.u) * 31 + this.v) * 31 + this.w) * 31 + this.x) * 31 + this.y) * 31 + this.z) * 31 + this.A;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeInt(this.o);
    paramParcel.writeInt(this.p);
    paramParcel.writeInt(this.q);
    paramParcel.writeInt(this.r);
    paramParcel.writeInt(this.s);
    paramParcel.writeInt(this.t);
    paramParcel.writeInt(this.u);
    paramParcel.writeInt(this.v);
    paramParcel.writeInt(this.w);
    paramParcel.writeInt(this.x);
    paramParcel.writeInt(this.y);
    paramParcel.writeInt(this.z);
    paramParcel.writeInt(this.A);
    SparseArray sparseArray = this.B;
    int i = sparseArray.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      int j = sparseArray.keyAt(paramInt);
      Map map = (Map)sparseArray.valueAt(paramInt);
      int k = map.size();
      paramParcel.writeInt(j);
      paramParcel.writeInt(k);
      for (Map.Entry entry : map.entrySet()) {
        paramParcel.writeParcelable((Parcelable)entry.getKey(), 0);
        paramParcel.writeParcelable((Parcelable)entry.getValue(), 0);
      } 
    } 
    paramParcel.writeSparseBooleanArray(this.C);
  }
  
  static {
    (new px()).a();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */