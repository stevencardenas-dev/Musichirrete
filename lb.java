import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import in.krosbits.utils.SgV.YbNJ;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class lb implements ib0 {
  public final ArrayList a = new ArrayList();
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public boolean g;
  
  public boolean h = true;
  
  public String i;
  
  public int j;
  
  public CharSequence k;
  
  public int l;
  
  public CharSequence m;
  
  public ArrayList n;
  
  public ArrayList o;
  
  public boolean p = false;
  
  public ArrayList q;
  
  public final lb0 r;
  
  public boolean s;
  
  public int t = -1;
  
  public lb(lb0 paramlb0) {
    this.r = paramlb0;
  }
  
  public final boolean a(ArrayList<lb> paramArrayList1, ArrayList<Boolean> paramArrayList2) {
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Run: ");
      stringBuilder.append(this);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    paramArrayList1.add(this);
    paramArrayList2.add(Boolean.FALSE);
    if (this.g)
      this.r.d.add(this); 
    return true;
  }
  
  public final void b(vb0 paramvb0) {
    this.a.add(paramvb0);
    paramvb0.d = this.b;
    paramvb0.e = this.c;
    paramvb0.f = this.d;
    paramvb0.g = this.e;
  }
  
  public final void c(String paramString) {
    if (this.h) {
      this.g = true;
      this.i = paramString;
      return;
    } 
    tp.f("This FragmentTransaction is not allowed to be added to the back stack.");
  }
  
  public final void d(int paramInt) {
    if (this.g) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("Bump nesting in ");
        stringBuilder.append(this);
        stringBuilder.append(" by ");
        stringBuilder.append(paramInt);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      ArrayList<vb0> arrayList = this.a;
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        vb0 vb0 = arrayList.get(b);
        ua0 ua0 = vb0.b;
        if (ua0 != null) {
          ua0.v += paramInt;
          if (lb0.M(2)) {
            StringBuilder stringBuilder = new StringBuilder("Bump nesting of ");
            stringBuilder.append(vb0.b);
            stringBuilder.append(" to ");
            stringBuilder.append(vb0.b.v);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
        } 
      } 
    } 
  }
  
  public final void e() {
    ArrayList<vb0> arrayList = this.a;
    for (int i = arrayList.size() - 1; i >= 0; i = j - 1) {
      int j;
      vb0 vb0 = arrayList.get(i);
      if (!vb0.c) {
        j = i;
      } else if (vb0.a == 8) {
        vb0.c = false;
        arrayList.remove(i - 1);
        j = i - 1;
      } else {
        int m = vb0.b.B;
        vb0.a = 2;
        vb0.c = false;
        int k = i - 1;
        while (true) {
          j = i;
          if (k >= 0) {
            vb0 = arrayList.get(k);
            j = i;
            if (vb0.c) {
              j = i;
              if (vb0.b.B == m) {
                arrayList.remove(k);
                j = i - 1;
              } 
            } 
            k--;
            i = j;
            continue;
          } 
          break;
        } 
      } 
    } 
  }
  
  public final void f() {
    g(false, true);
  }
  
  public final int g(boolean paramBoolean1, boolean paramBoolean2) {
    if (!this.s) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("Commit: ");
        stringBuilder.append(this);
        Log.v("FragmentManager", stringBuilder.toString());
        PrintWriter printWriter = new PrintWriter(new pp0());
        i("  ", printWriter, true);
        printWriter.close();
      } 
      this.s = true;
      boolean bool = this.g;
      lb0 lb01 = this.r;
      if (bool) {
        this.t = lb01.k.getAndIncrement();
      } else {
        this.t = -1;
      } 
      if (paramBoolean2)
        lb01.x(this, paramBoolean1); 
      return this.t;
    } 
    tp.f("commit already called");
    return 0;
  }
  
  public final void h(int paramInt1, ua0 paramua0, String paramString, int paramInt2) {
    StringBuilder stringBuilder2;
    String str = paramua0.R;
    if (str != null)
      ub0.c(paramua0, str); 
    Class<?> clazz = paramua0.getClass();
    int i = clazz.getModifiers();
    if (!clazz.isAnonymousClass() && Modifier.isPublic(i) && (!clazz.isMemberClass() || Modifier.isStatic(i))) {
      String str1 = tlzLOCPTHRhep.pmlxWCMSN;
      if (paramString != null) {
        String str2 = paramua0.C;
        if (str2 == null || paramString.equals(str2)) {
          paramua0.C = paramString;
        } else {
          StringBuilder stringBuilder = new StringBuilder("Can't change tag of fragment ");
          stringBuilder.append(paramua0);
          stringBuilder.append(str1);
          tp.f(x41.o(stringBuilder, paramua0.C, " now ", paramString));
          return;
        } 
      } 
      if (paramInt1 != 0) {
        StringBuilder stringBuilder;
        if (paramInt1 != -1) {
          i = paramua0.A;
          if (i == 0 || i == paramInt1) {
            paramua0.A = paramInt1;
            paramua0.B = paramInt1;
          } else {
            stringBuilder = new StringBuilder("Can't change container ID of fragment ");
            stringBuilder.append(paramua0);
            paramInt2 = paramua0.A;
            stringBuilder.append(str1);
            stringBuilder.append(paramInt2);
            stringBuilder.append(" now ");
            stringBuilder.append(paramInt1);
            throw new IllegalStateException(stringBuilder.toString());
          } 
        } else {
          stringBuilder2 = new StringBuilder("Can't add fragment ");
          stringBuilder2.append(paramua0);
          stringBuilder2.append(" with tag ");
          stringBuilder2.append((String)stringBuilder);
          stringBuilder2.append(" to container view with no id");
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
      } 
      b(new vb0(paramInt2, paramua0));
      paramua0.w = this.r;
      return;
    } 
    paramString = stringBuilder2.getCanonicalName();
    StringBuilder stringBuilder1 = new StringBuilder("Fragment ");
    stringBuilder1.append(paramString);
    stringBuilder1.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(stringBuilder1.toString());
  }
  
  public final void i(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean) {
    if (paramBoolean) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.t);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.s);
      if (this.f != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
      } 
      if (this.b != 0 || this.c != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.b));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.c));
      } 
      if (this.d != 0 || this.e != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.d));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.e));
      } 
      if (this.j != 0 || this.k != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.k);
      } 
      if (this.l != 0 || this.m != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.l));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.m);
      } 
    } 
    ArrayList<vb0> arrayList = this.a;
    if (!arrayList.isEmpty()) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        StringBuilder stringBuilder;
        String str;
        vb0 vb0 = arrayList.get(b);
        switch (vb0.a) {
          default:
            stringBuilder = new StringBuilder("cmd=");
            stringBuilder.append(vb0.a);
            str = stringBuilder.toString();
            break;
          case 10:
            str = "OP_SET_MAX_LIFECYCLE";
            break;
          case 9:
            str = "UNSET_PRIMARY_NAV";
            break;
          case 8:
            str = "SET_PRIMARY_NAV";
            break;
          case 7:
            str = "ATTACH";
            break;
          case 6:
            str = "DETACH";
            break;
          case 5:
            str = "SHOW";
            break;
          case 4:
            str = "HIDE";
            break;
          case 3:
            str = "REMOVE";
            break;
          case 2:
            str = "REPLACE";
            break;
          case 1:
            str = "ADD";
            break;
          case 0:
            str = "NULL";
            break;
        } 
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(b);
        paramPrintWriter.print(": ");
        paramPrintWriter.print(str);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(vb0.b);
        if (paramBoolean) {
          if (vb0.d != 0 || vb0.e != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(vb0.d));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(vb0.e));
          } 
          if (vb0.f != 0 || vb0.g != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(vb0.f));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(vb0.g));
          } 
        } 
      } 
    } 
  }
  
  public final void j(ua0 paramua0) {
    lb0 lb01 = paramua0.w;
    if (lb01 == null || lb01 == this.r) {
      b(new vb0(3, paramua0));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
    stringBuilder.append(paramua0.toString());
    stringBuilder.append(" is already attached to a FragmentManager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final void k(int paramInt, ua0 paramua0, String paramString) {
    if (paramInt != 0) {
      h(paramInt, paramua0, paramString, 2);
      return;
    } 
    l0.l("Must use non-zero containerViewId");
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("BackStackEntry{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.t >= 0) {
      stringBuilder.append(YbNJ.AVyMgeoPmCM);
      stringBuilder.append(this.t);
    } 
    if (this.i != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.i);
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */