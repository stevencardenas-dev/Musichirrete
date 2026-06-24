import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.insets.ProtectionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import in.krosbits.musicolet.FolderExcluderActivity;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.WelcomeActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public class a52 extends ua0 implements DialogInterface.OnDismissListener, View.OnClickListener {
  public static ArrayList n0;
  
  public static final ExecutorService o0 = Executors.newSingleThreadExecutor();
  
  public static ArrayList p0 = new ArrayList();
  
  public WelcomeActivity a0;
  
  public Button b0;
  
  public MaterialButton c0;
  
  public t00 d0;
  
  public MaterialCardView e0;
  
  public RecyclerView f0;
  
  public a3 g0;
  
  public TextView h0;
  
  public ScrollView i0;
  
  public Group j0;
  
  public ArrayList k0;
  
  public ArrayList l0 = new ArrayList();
  
  public ss0 m0;
  
  public static ArrayList D0(a52 parama52) {
    String str = "android:query-arg-match-pending";
    ArrayList<s00> arrayList = new ArrayList();
    try {
      Set set = MediaStore.getExternalVolumeNames(MyApplication.i.getApplicationContext());
      String str2 = Environment.DIRECTORY_MUSIC;
      String str1 = Environment.DIRECTORY_AUDIOBOOKS;
      String str4 = Environment.DIRECTORY_PODCASTS;
      String str3 = Environment.DIRECTORY_DCIM;
      String str5 = Environment.DIRECTORY_PICTURES;
      String str6 = Environment.DIRECTORY_MOVIES;
    } finally {
      str = null;
    } 
    try {
      y42 y42 = new y42();
      super();
      arrayList.sort(Comparator.comparing(y42));
    } finally {}
    return arrayList;
  }
  
  public static void E0(a52 parama52, int paramInt) {
    v00 v00 = parama52.k0.get(paramInt);
    if (v00 instanceof ww1) {
      MyApplication.G.e(((ww1)v00).J());
    } else if (v00 instanceof lw0) {
      MyApplication.G.f(((lw0)v00).j());
    } else {
      return;
    } 
    boolean bool2 = parama52.k0.isEmpty();
    v00 = parama52.k0.remove(paramInt);
    boolean bool1 = parama52.l0.contains(v00);
    ArrayList<v00> arrayList = parama52.l0;
    if (!bool1) {
      arrayList.add(v00);
    } else {
      arrayList.remove(v00);
    } 
    if (bool2 != parama52.k0.isEmpty()) {
      parama52.H0();
      parama52.a0.n0(false);
    } else {
      parama52.g0.a.f(paramInt, 1);
    } 
    z2 z2 = new z2(3, parama52);
    String str = ag0.a;
    z2.executeOnExecutor(o0, new Object[0]);
  }
  
  public final void F0(int paramInt1, int paramInt2, Intent paramIntent) {
    if (1001 == paramInt1 || 1002 == paramInt1) {
      boolean bool = false;
      if (paramInt2 == -1 && paramIntent != null) {
        Uri uri = paramIntent.getData();
        if (uri != null) {
          String str;
          ms0 ms0;
          boolean bool1 = lw0.N(uri);
          StringBuilder stringBuilder1 = new StringBuilder("wcf2s:oar2> ");
          stringBuilder1.append(uri);
          n21.F(stringBuilder1.toString());
          v00 v001 = v00.t(MyApplication.i.getApplicationContext(), uri);
          StringBuilder stringBuilder2 = new StringBuilder("wcf2s:oar2>d:");
          stringBuilder2.append(v001);
          n21.F(stringBuilder2.toString());
          v00 v002 = n0.q(v001, this.k0);
          if (v002 != null) {
            if (v001.b.toString().equals(v002.b.toString())) {
              str = U(2131886578, new Object[] { ml0.a((MyApplication.F.c(v001.b.toString())).b) });
            } else {
              str = U(2131886579, new Object[] { v001.v(), ml0.a((MyApplication.F.c(v002.b.toString())).b) });
            } 
            ms0 = new ms0(P());
            ms0.d(str);
            ms0.n(2131887030);
            ms0.p();
          } else {
            ArrayList<v00> arrayList = new ArrayList();
            ArrayList<Object> arrayList1 = this.k0;
            int i = arrayList1.size();
            paramInt1 = 0;
            while (paramInt1 < i) {
              v00 v00 = (v00)arrayList1.get(paramInt1);
              paramInt2 = paramInt1 + 1;
              v00 = v00;
              paramInt1 = paramInt2;
              if (v00.C((v00)ms0)) {
                arrayList.add(v00);
                paramInt1 = paramInt2;
              } 
            } 
            if (!arrayList.isEmpty()) {
              paramInt2 = arrayList.size();
              paramInt1 = bool;
              while (paramInt1 < paramInt2) {
                arrayList1 = (ArrayList<Object>)arrayList.get(paramInt1);
                paramInt1++;
                v00 v00 = (v00)arrayList1;
                this.l0.remove(v00);
                if (bool1) {
                  MyApplication.G.f(v00.j());
                  continue;
                } 
                MyApplication.G.e(((ww1)v00).J());
              } 
              this.k0 = null;
              H0();
            } 
            this.f0.postDelayed(new a80(this, bool1, (Uri)str, (v00)ms0), 300L);
          } 
        } 
        t00 t001 = this.d0;
        if (t001 != null) {
          t001.D0();
          this.d0 = null;
        } 
        return;
      } 
      this.c0.postDelayed(new v42(this, 0), 300L);
      return;
    } 
    if (paramInt1 == 1) {
      G0(true);
      if (MyApplication.k() && GhostSearchActivity.g0 != null) {
        B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_BGU"));
        return;
      } 
    } 
  }
  
  public final void G0(boolean paramBoolean) {
    int i = ag0.z().size();
    if (i > 0) {
      TextView textView = this.h0;
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(T(2131886523));
      stringBuilder.append(": ");
      stringBuilder.append(i);
      stringBuilder.append("</u>");
      textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.j0.setVisibility(0);
      if (paramBoolean) {
        Animation animation = AnimationUtils.loadAnimation(P(), 2130772019);
        this.h0.startAnimation(animation);
      } 
      return;
    } 
    this.j0.setVisibility(8);
  }
  
  public final void H0() {
    if (this.k0 == null) {
      ArrayList arrayList = MyApplication.G.b();
      this.k0 = arrayList;
      arrayList.addAll(0, MyApplication.G.d());
    } 
    this.g0.g();
    boolean bool = this.k0.isEmpty();
    MaterialCardView materialCardView = this.e0;
    if (bool) {
      materialCardView.setVisibility(8);
    } else {
      materialCardView.setVisibility(0);
    } 
    G0(false);
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.a0 = (WelcomeActivity)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492999, paramViewGroup, false);
    this.b0 = (Button)view.findViewById(2131296368);
    this.f0 = (RecyclerView)view.findViewById(2131297415);
    this.e0 = (MaterialCardView)view.findViewById(2131296632);
    this.j0 = (Group)view.findViewById(2131296768);
    this.h0 = (TextView)view.findViewById(2131297749);
    ScrollView scrollView = (ScrollView)view.findViewById(2131297449);
    this.i0 = scrollView;
    g92.c((View)scrollView, true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)view.findViewById(2131296941);
    hn hn = new hn(2, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    MaterialButton materialButton = (MaterialButton)view.findViewById(2131296400);
    this.c0 = materialButton;
    materialButton.setOnClickListener(this);
    this.b0.setOnClickListener(this);
    this.h0.setOnClickListener(this);
    this.f0.setLayoutManager((a)new LinearLayoutManager(1));
    a3 a31 = new a3(14, this);
    this.g0 = a31;
    this.f0.setAdapter(a31);
    H0();
    z2 z2 = new z2(3, this);
    String str = ag0.a;
    z2.executeOnExecutor(o0, new Object[0]);
    return view;
  }
  
  public final void j0() {
    WelcomeActivity welcomeActivity = this.a0;
    if (welcomeActivity != null && !welcomeActivity.h0()) {
      ArrayList arrayList = this.l0;
      if (arrayList != null && !arrayList.isEmpty() && MyApplication.k()) {
        im0 im0 = new im0(false, false, false);
        im0.K = true;
        GhostSearchActivity.g0 = im0;
        B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_BGU"));
      } 
    } 
    this.a0 = null;
    this.I = true;
  }
  
  public final void n0(Bundle paramBundle) {
    if (this.d0 != null)
      paramBundle.putBoolean("ws", true); 
    n0 = this.l0;
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296368) {
      t00 t001 = this.d0;
      if (t001 != null) {
        t001.D0();
        this.d0 = null;
      } 
      t001 = new t00(1001, null, p0);
      this.d0 = t001;
      t001.B0 = this;
      t001.H0(O(), null);
      return;
    } 
    if (i == 2131297749) {
      Intent intent = new Intent(P(), FolderExcluderActivity.class);
      M().startActivityForResult(intent, 1);
      return;
    } 
    if (i == 2131296400)
      B0(new Intent("android.intent.action.VIEW", wf2.B(CKYHNesT.oGOtYZbMEDPbU, new String[0]))); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    if (paramDialogInterface == this.m0)
      this.m0 = null; 
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null) {
      ArrayList arrayList = n0;
      if (arrayList != null) {
        this.l0 = arrayList;
        n0 = null;
      } 
      if (paramBundle.getBoolean("ws", false)) {
        t00 t001 = this.d0;
        if (t001 != null) {
          t001.D0();
          this.d0 = null;
        } 
        t001 = new t00(1001, null, p0);
        this.d0 = t001;
        t001.B0 = this;
        t001.H0(O(), null);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */