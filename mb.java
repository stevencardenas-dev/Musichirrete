import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public final class mb implements Parcelable {
  public static final Parcelable.Creator<mb> CREATOR = new zb2(3);
  
  public final int[] b;
  
  public final ArrayList c;
  
  public final int[] e;
  
  public final int[] f;
  
  public final int g;
  
  public final String h;
  
  public final int i;
  
  public final int j;
  
  public final CharSequence k;
  
  public final int l;
  
  public final CharSequence m;
  
  public final ArrayList n;
  
  public final ArrayList o;
  
  public final boolean p;
  
  public mb(Parcel paramParcel) {
    boolean bool;
    this.b = paramParcel.createIntArray();
    this.c = paramParcel.createStringArrayList();
    this.e = paramParcel.createIntArray();
    this.f = paramParcel.createIntArray();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readString();
    this.i = paramParcel.readInt();
    this.j = paramParcel.readInt();
    Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
    this.k = (CharSequence)creator.createFromParcel(paramParcel);
    this.l = paramParcel.readInt();
    this.m = (CharSequence)creator.createFromParcel(paramParcel);
    this.n = paramParcel.createStringArrayList();
    this.o = paramParcel.createStringArrayList();
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool;
  }
  
  public mb(lb paramlb) {
    int i = paramlb.a.size();
    this.b = new int[i * 6];
    if (paramlb.g) {
      this.c = new ArrayList(i);
      this.e = new int[i];
      this.f = new int[i];
      byte b = 0;
      int j = 0;
      while (true) {
        int k = j;
        if (b < i) {
          vb0 vb0 = paramlb.a.get(b);
          this.b[k] = vb0.a;
          ArrayList<ua0> arrayList = this.c;
          ua0 ua0 = vb0.b;
          if (ua0 != null) {
            String str = ua0.h;
          } else {
            ua0 = null;
          } 
          arrayList.add(ua0);
          int[] arrayOfInt = this.b;
          arrayOfInt[k + 1] = vb0.c;
          arrayOfInt[k + 2] = vb0.d;
          arrayOfInt[k + 3] = vb0.e;
          arrayOfInt[k + 4] = vb0.f;
          j = k + 6;
          arrayOfInt[k + 5] = vb0.g;
          this.e[b] = vb0.h.ordinal();
          this.f[b] = vb0.i.ordinal();
          b++;
          continue;
        } 
        this.g = paramlb.f;
        this.h = paramlb.i;
        this.i = paramlb.t;
        this.j = paramlb.j;
        this.k = paramlb.k;
        this.l = paramlb.l;
        this.m = paramlb.m;
        this.n = paramlb.n;
        this.o = paramlb.o;
        this.p = paramlb.p;
        return;
      } 
    } 
    tp.f(CKYHNesT.dFUwvBJXnniLC);
    throw null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeIntArray(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeIntArray(this.e);
    paramParcel.writeIntArray(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    TextUtils.writeToParcel(this.k, paramParcel, 0);
    paramParcel.writeInt(this.l);
    TextUtils.writeToParcel(this.m, paramParcel, 0);
    paramParcel.writeStringList(this.n);
    paramParcel.writeStringList(this.o);
    paramParcel.writeInt(this.p);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */