import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SearchActivity;
import java.util.ArrayList;

public final class pj1 extends i61 {
  public final SearchActivity c;
  
  public pj1(SearchActivity paramSearchActivity) {}
  
  public final void run() {
    String[] arrayOfString;
    SearchActivity searchActivity = SearchActivity.Q0;
    lm0 lm0 = MyApplication.j.c;
    searchActivity = this.c;
    ArrayList arrayList = lm0.k(searchActivity.Z);
    ArrayList<fq1> arrayList1 = searchActivity.G0;
    ArrayList<k90> arrayList2 = searchActivity.F0;
    ArrayList<q3> arrayList3 = searchActivity.E0;
    ArrayList<q3> arrayList4 = searchActivity.D0;
    ArrayList<q3> arrayList5 = searchActivity.C0;
    ArrayList<q3> arrayList6 = searchActivity.B0;
    ArrayList<q3> arrayList8 = searchActivity.A0;
    try {
      arrayOfString = ag0.N(searchActivity.Z);
      arrayList8.clear();
      arrayList6.clear();
      arrayList5.clear();
      arrayList4.clear();
      arrayList3.clear();
      arrayList2.clear();
      arrayList1.clear();
      if (searchActivity.t0 == null)
        searchActivity.t0 = MyApplication.j.c.e(); 
    } finally {}
    if (searchActivity.u0 == null)
      searchActivity.u0 = MyApplication.j.c.f(); 
    if (searchActivity.v0 == null)
      searchActivity.v0 = MyApplication.j.c.d(); 
    if (searchActivity.w0 == null)
      searchActivity.w0 = MyApplication.j.c.g(); 
    if (searchActivity.x0 == null)
      searchActivity.x0 = MyApplication.j.c.h(); 
    if (searchActivity.y0 == null)
      searchActivity.y0 = (ArrayList)MyApplication.j.c.q.clone(); 
    if (searchActivity.z0 == null)
      searchActivity.z0 = ag0.S(c81.g(MyApplication.i.getApplicationContext())); 
    ArrayList<Object> arrayList7 = searchActivity.t0;
    int m = arrayList7.size();
    int j = 0;
    int i = 0;
    while (i < m) {
      q3 q3 = (q3)arrayList7.get(i);
      int n = i + 1;
      q3 = q3;
      i = n;
      if (q3.a(arrayOfString)) {
        arrayList8.add(q3);
        i = n;
      } 
    } 
    arrayList7 = searchActivity.u0;
    m = arrayList7.size();
    i = 0;
    while (i < m) {
      arrayList8 = (ArrayList<q3>)arrayList7.get(i);
      int n = i + 1;
      q3 q3 = (q3)arrayList8;
      i = n;
      if (q3.a(arrayOfString)) {
        arrayList6.add(q3);
        i = n;
      } 
    } 
    arrayList6 = searchActivity.v0;
    m = arrayList6.size();
    i = 0;
    while (i < m) {
      arrayList7 = (ArrayList<Object>)arrayList6.get(i);
      int n = i + 1;
      q3 q3 = (q3)arrayList7;
      i = n;
      if (q3.a(arrayOfString)) {
        arrayList5.add(q3);
        i = n;
      } 
    } 
    arrayList5 = searchActivity.w0;
    m = arrayList5.size();
    i = 0;
    while (i < m) {
      arrayList6 = (ArrayList<q3>)arrayList5.get(i);
      int n = i + 1;
      q3 q3 = (q3)arrayList6;
      i = n;
      if (q3.a(arrayOfString)) {
        arrayList4.add(q3);
        i = n;
      } 
    } 
    arrayList4 = searchActivity.x0;
    m = arrayList4.size();
    i = 0;
    while (i < m) {
      arrayList5 = (ArrayList<q3>)arrayList4.get(i);
      int n = i + 1;
      q3 q3 = (q3)arrayList5;
      i = n;
      if (q3.a(arrayOfString)) {
        arrayList3.add(q3);
        i = n;
      } 
    } 
    arrayList3 = searchActivity.y0;
    m = arrayList3.size();
    i = 0;
    while (i < m) {
      arrayList4 = (ArrayList<q3>)arrayList3.get(i);
      int n = i + 1;
      k90 k90 = (k90)arrayList4;
      i = n;
      if (k90.a(arrayOfString)) {
        arrayList2.add(k90);
        i = n;
      } 
    } 
    arrayList2 = searchActivity.z0;
    int k = arrayList2.size();
    i = j;
    while (i < k) {
      arrayList3 = (ArrayList<q3>)arrayList2.get(i);
      j = i + 1;
      fq1 fq1 = (fq1)arrayList3;
      i = j;
      if (fq1.a(arrayOfString)) {
        arrayList1.add(fq1);
        i = j;
      } 
    } 
    if (this.b)
      return; 
    searchActivity.runOnUiThread(new e6(19, this, arrayList));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */