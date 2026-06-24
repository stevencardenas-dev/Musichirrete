import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c3 implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, rs0, hs0, View.OnClickListener {
  public static final ExecutorService v = Executors.newSingleThreadExecutor();
  
  public GhostSearchActivity b;
  
  public int c;
  
  public ss0 e;
  
  public TextView f;
  
  public TextView g;
  
  public MaterialButtonToggleGroup h;
  
  public ArrayList i;
  
  public HashSet j;
  
  public ArrayList k;
  
  public RecyclerView l;
  
  public a3 m;
  
  public int n;
  
  public String o;
  
  public boolean p;
  
  public z2 q;
  
  public int r;
  
  public HashSet s;
  
  public boolean t;
  
  public boolean u;
  
  public final void Q(ss0 paramss0, qy paramqy) {
    ArrayList<HashSet> arrayList = this.k;
    HashSet hashSet = this.j;
    if (hashSet.size() != 0) {
      if (this.c == 1) {
        HashSet<wo> hashSet1 = new HashSet(arrayList.size());
        int i = arrayList.size();
        byte b = 0;
        while (true) {
          HashSet<wo> hashSet2 = hashSet1;
          if (b < i) {
            hashSet2 = arrayList.get(b);
            b++;
            hashSet1.add(((km0)hashSet2).c.f);
            continue;
          } 
          break;
        } 
      } else {
        paramss0 = null;
      } 
      for (String str : hashSet) {
        boolean bool;
        b81 b81 = c81.f(MyApplication.i.getApplicationContext(), str);
        if (this.c == 0) {
          bool = b81.b(arrayList);
        } else {
          bool = b81.g((HashSet)paramss0);
        } 
        if (bool)
          c81.k(MyApplication.i.getApplicationContext(), b81); 
      } 
      ag0.O0(2131886467, 0);
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null) {
        l81 l81 = musicActivity.e0;
        if (l81 != null && l81.Y())
          MusicActivity.R0.e0.N0(); 
      } 
    } 
  }
  
  public final void a(MaterialButtonToggleGroup paramMaterialButtonToggleGroup, int paramInt, boolean paramBoolean) {
    if (paramBoolean && paramInt == 2131297589 && this.c != 0) {
      this.c = 0;
      c();
      return;
    } 
    if (paramBoolean && paramInt == 2131297595 && this.c != 1) {
      this.c = 1;
      c();
    } 
  }
  
  public final void b() {
    vm vm = new vm();
    ms0 ms0 = new ms0(this.h.getContext());
    ms0.q(2131887255);
    ms0.g(MyApplication.i.getApplicationContext().getString(2131887100), this.o, false, new f(1, this));
    ms0.W = new x2(vm, 0);
    ms0.n(2131887030);
    ms0.k(2131886278);
    ms0.t = true;
    vm.m((ms0.p()).n);
  }
  
  public final void c() {
    ss0 ss01 = this.e;
    int i = this.c;
    TextView textView = this.g;
    if (i == 0) {
      textView.setVisibility(0);
      ss01.q.setText(2131886117);
    } else {
      textView.setVisibility(8);
      ss01.q.setText(2131887160);
    } 
    ss01.q.setEnabled(this.j.isEmpty() ^ true);
    this.m.g();
  }
  
  public final void onClick(View paramView) {
    MaterialButtonToggleGroup materialButtonToggleGroup = this.h;
    int i = paramView.getId();
    if (i == 2131296414)
      try {
        return;
      } finally {
        paramView = null;
        paramView.printStackTrace();
      }  
    if (i == 2131297796) {
      ms0 ms0 = new ms0(materialButtonToggleGroup.getContext());
      ms0.f = this.f.getText().toString();
      a3 a31 = new a3(this.k.toArray((Object[])new km0[0]));
      materialButtonToggleGroup.getContext();
      ms0.a(a31, (LinearLayoutManager2)new LinearLayoutManager(1));
      ms0.n(2131887030);
      ms0.p();
    } 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.t = true;
    GhostSearchActivity ghostSearchActivity = this.b;
    if (ghostSearchActivity != null)
      ghostSearchActivity.onDismiss(paramDialogInterface); 
    z2 z21 = this.q;
    if (z21 != null)
      try {
        z21.cancel(true);
        this.q = null;
      } finally {} 
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    z2 z21 = this.q;
    if (z21 != null) {
      String str = ag0.a;
      z21.executeOnExecutor(v, new Object[0]);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */