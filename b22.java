import android.os.Parcel;
import android.util.SparseIntArray;

public final class b22 extends a22 {
  public final SparseIntArray d = new SparseIntArray();
  
  public final Parcel e;
  
  public final int f;
  
  public final int g;
  
  public final String h;
  
  public int i = -1;
  
  public int j;
  
  public int k = -1;
  
  public b22(Parcel paramParcel) {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "", (b9)new zm1(0), (b9)new zm1(0), (b9)new zm1(0));
  }
  
  public b22(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, b9 paramb91, b9 paramb92, b9 paramb93) {
    super(paramb91, paramb92, paramb93);
    this.e = paramParcel;
    this.f = paramInt1;
    this.g = paramInt2;
    this.j = paramInt1;
    this.h = paramString;
  }
  
  public final b22 a() {
    Parcel parcel = this.e;
    int k = parcel.dataPosition();
    int j = this.j;
    int i = j;
    if (j == this.f)
      i = this.g; 
    String str = x41.n(new StringBuilder(), this.h, "  ");
    b9 b91 = this.b;
    b9 b92 = this.c;
    return new b22(parcel, k, i, str, this.a, b91, b92);
  }
  
  public final boolean e(int paramInt) {
    while (true) {
      int i = this.j;
      int j = this.k;
      if (i < this.g) {
        if (j != paramInt) {
          if (String.valueOf(j).compareTo(String.valueOf(paramInt)) > 0)
            break; 
          i = this.j;
          Parcel parcel = this.e;
          parcel.setDataPosition(i);
          i = parcel.readInt();
          this.k = parcel.readInt();
          this.j += i;
          continue;
        } 
      } else {
        if (j == paramInt)
          return true; 
        break;
      } 
      return true;
    } 
    return false;
  }
  
  public final void i(int paramInt) {
    int i = this.i;
    SparseIntArray sparseIntArray = this.d;
    Parcel parcel = this.e;
    if (i >= 0) {
      int j = sparseIntArray.get(i);
      i = parcel.dataPosition();
      parcel.setDataPosition(j);
      parcel.writeInt(i - j);
      parcel.setDataPosition(i);
    } 
    this.i = paramInt;
    sparseIntArray.put(paramInt, parcel.dataPosition());
    parcel.writeInt(0);
    parcel.writeInt(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */