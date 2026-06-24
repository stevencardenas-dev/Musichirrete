import android.os.Bundle;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.util.ArrayList;

public final class bv0 {
  public ArrayList a = new ArrayList();
  
  public bv0(int paramInt) {}
  
  public bv0(cn paramcn) {}
  
  public cv0 a() {
    if (this.a == null)
      return cv0.c; 
    Bundle bundle = new Bundle();
    bundle.putStringArrayList(IGBYXeDFmKYajx.cyHqG, this.a);
    return new cv0(bundle, this.a);
  }
  
  public w80 b(y72 paramy72) {
    paramy72.getClass();
    ArrayList<Object> arrayList1 = this.a;
    ArrayList<dq> arrayList = new ArrayList();
    int k = arrayList1.size();
    int i = 0;
    while (i < k) {
      dq dq = (dq)arrayList1.get(i);
      int m = i + 1;
      i = m;
      if (((dq)dq).b(paramy72)) {
        arrayList.add(dq);
        i = m;
      } 
    } 
    ArrayList<ai> arrayList2 = new ArrayList(pm.k0(arrayList));
    int j = arrayList.size();
    i = 0;
    while (i < j) {
      arrayList1 = (ArrayList<Object>)arrayList.get(i);
      i++;
      arrayList2.add(((dq)arrayList1).a(paramy72.j));
    } 
    return ui0.q(new ar(2, nm.v0(arrayList2).toArray((Object[])new w80[0])));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */