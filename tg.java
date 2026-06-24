import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupMenu;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;

public final class tg implements DialogInterface.OnDismissListener, View.OnClickListener, sb1, DialogInterface.OnShowListener {
  public final GhostSearchActivity b;
  
  public final ArrayList c;
  
  public final ss0 e;
  
  public final km0 f;
  
  public final a3 g;
  
  public final ry h;
  
  public final pg i;
  
  public boolean j;
  
  public yf k;
  
  public v00 l;
  
  public boolean m;
  
  public dy1 n;
  
  public boolean o;
  
  public boolean p;
  
  public boolean q;
  
  public v00 r;
  
  public boolean s;
  
  public tg(GhostSearchActivity paramGhostSearchActivity, km0 paramkm0) {
    ArrayList arrayList = new ArrayList();
    this.c = arrayList;
    this.j = false;
    this.m = false;
    this.n = null;
    this.o = false;
    this.p = false;
    this.q = false;
    this.r = null;
    this.s = false;
    this.b = paramGhostSearchActivity;
    this.f = paramkm0;
    if (!arrayList.isEmpty())
      arrayList.clear(); 
    pg pg1 = new pg(this, 0);
    this.i = pg1;
    pg1.start();
    ms0 ms0 = new ms0((Context)paramGhostSearchActivity);
    View view = LayoutInflater.from((Context)paramGhostSearchActivity).inflate(2131492952, null, false);
    int i = 2131296375;
    MaterialButton materialButton = (MaterialButton)ws2.C(view, 2131296375);
    if (materialButton != null) {
      i = 2131296376;
      MaterialButton materialButton1 = (MaterialButton)ws2.C(view, 2131296376);
      if (materialButton1 != null) {
        i = 2131296383;
        MaterialButton materialButton2 = (MaterialButton)ws2.C(view, 2131296383);
        if (materialButton2 != null) {
          i = 2131296410;
          MaterialButton materialButton3 = (MaterialButton)ws2.C(view, 2131296410);
          if (materialButton3 != null) {
            i = 2131296418;
            MaterialButton materialButton4 = (MaterialButton)ws2.C(view, 2131296418);
            if (materialButton4 != null) {
              i = 2131296367;
              MaterialButton materialButton5 = (MaterialButton)ws2.C(view, 2131296367);
              if (materialButton5 != null) {
                i = 2131296733;
                FlexboxLayout flexboxLayout = (FlexboxLayout)ws2.C(view, 2131296733);
                if (flexboxLayout != null) {
                  ConstraintLayout constraintLayout = (ConstraintLayout)view;
                  i = 2131297299;
                  LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator)ws2.C(view, 2131297299);
                  if (linearProgressIndicator != null) {
                    i = 2131297408;
                    RecyclerView recyclerView = (RecyclerView)ws2.C(view, 2131297408);
                    if (recyclerView != null) {
                      i = 2131297514;
                      Space space = (Space)ws2.C(view, 2131297514);
                      if (space != null) {
                        i = 2131297864;
                        MaterialButton materialButton6 = (MaterialButton)ws2.C(view, 2131297864);
                        if (materialButton6 != null) {
                          i = 2131297878;
                          TextView textView = (TextView)ws2.C(view, 2131297878);
                          if (textView != null) {
                            i = 2131297890;
                            TextView textView1 = (TextView)ws2.C(view, 2131297890);
                            if (textView1 != null) {
                              this.h = new ry(constraintLayout, materialButton, materialButton1, materialButton2, materialButton3, materialButton4, materialButton5, flexboxLayout, linearProgressIndicator, recyclerView, space, materialButton6, textView, textView1);
                              ms0.f((View)constraintLayout, false);
                              ms0.W = this;
                              ms0.Y = this;
                              a3 a31 = new a3(2, this);
                              this.g = a31;
                              recyclerView.setAdapter(a31);
                              recyclerView.setLayoutManager((a)new LinearLayoutManager(1));
                              s();
                              materialButton.setOnClickListener(this);
                              materialButton1.setOnClickListener(this);
                              materialButton5.setOnClickListener(this);
                              materialButton2.setOnClickListener(this);
                              materialButton4.setOnClickListener(this);
                              materialButton6.setOnClickListener(this);
                              materialButton3.setOnClickListener(this);
                              textView.setOnClickListener(this);
                              textView1.setOnClickListener(this);
                              this.e = new ss0(ms0);
                              return;
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    throw null;
  }
  
  public static void d(v00 paramv00) {
    try {
      return;
    } finally {
      paramv00 = null;
      paramv00.printStackTrace();
    } 
  }
  
  public static String n(long paramLong) {
    int i = (int)(paramLong % 60L);
    try {
      paramLong /= 60L;
      return (paramLong > 0L) ? String.format(Locale.ENGLISH, "%d:%02d:%02d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(j), Integer.valueOf(i) }) : String.format(Locale.ENGLISH, "%d:%02d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void p(String paramString) {
    try {
      Context context = MyApplication.i.getApplicationContext();
      Intent intent = new Intent();
      return;
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public static long q(String paramString) {
    if (paramString.isEmpty())
      return 0L; 
    try {
      AssertionError assertionError;
      String[] arrayOfString = paramString.split(":");
      if (arrayOfString.length == 2) {
        int i = Integer.parseInt(arrayOfString[0]);
        int j = Integer.parseInt(arrayOfString[1]);
        if (i >= 0 && j >= 0) {
          if (i <= 59 && j <= 59)
            return i * 60L + j; 
          AssertionError assertionError1 = new AssertionError();
          this();
          throw assertionError1;
        } 
        assertionError = new AssertionError();
        this();
        throw assertionError;
      } 
    } finally {
      paramString = null;
    } 
    return -1L;
  }
  
  public final void a(String paramString, Intent paramIntent) {
    paramIntent.setType("text/plain").addCategory("android.intent.category.OPENABLE").addFlags(67).putExtra("android.content.extra.SHOW_ADVANCED", true).putExtra("android.intent.extra.TITLE", paramString).putExtra("android.provider.extra.INITIAL_URI", (Parcelable)n0.j(this.f.d().i()));
  }
  
  public final void b(yf paramyf, boolean paramBoolean) {
    int i;
    long l1;
    String str;
    if (this.j) {
      j();
      return;
    } 
    if (paramyf != null) {
      l1 = paramyf.b;
    } else if (f()) {
      l1 = MusicService.E0.A() / 1000L;
    } else {
      l1 = 0L;
    } 
    long l2 = this.f.c.g;
    ms0 ms0 = new ms0((Context)this.b);
    ms0.K = false;
    ms0.e(2131492951, true);
    ms0.k(2131886278);
    if (paramyf == null) {
      i = 2131886117;
    } else {
      i = 2131887265;
    } 
    ms0.n(i);
    if (paramyf != null)
      ms0.l(2131887160); 
    View view = ms0.u;
    MaterialButton materialButton1 = (MaterialButton)view.findViewById(2131296407);
    MaterialButton materialButton2 = (MaterialButton)view.findViewById(2131296421);
    TextInputEditText textInputEditText2 = (TextInputEditText)view.findViewById(2131296709);
    TextInputEditText textInputEditText1 = (TextInputEditText)view.findViewById(2131296708);
    MaterialButton materialButton3 = (MaterialButton)view.findViewById(2131296431);
    MaterialButton materialButton4 = (MaterialButton)view.findViewById(2131296420);
    MaterialButton materialButton5 = (MaterialButton)view.findViewById(2131296396);
    Group group = (Group)view.findViewById(2131296770);
    TextView textView = (TextView)view.findViewById(2131297802);
    Timer timer = new Timer(":bn_ae_ut");
    timer.schedule(new qg(0, textView), 0L, 1000L);
    try {
      r(((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).k(), materialButton4, group);
      rg rg = new rg();
    } finally {
      group = null;
      view = null;
    } 
    textInputEditText2.setText(n(l1));
    if (paramyf != null) {
      str = paramyf.c;
    } else {
      str = "";
    } 
    textInputEditText1.setText(str);
    ng ng = new ng(this, textInputEditText2, materialButton1, materialButton2, l2, l1);
    materialButton1.setOnClickListener(ng);
    materialButton2.setOnClickListener(ng);
    materialButton3.setOnClickListener(new og(this, 0));
    materialButton4.setOnClickListener(new og(this, 1));
    materialButton5.setOnClickListener(new og(this, 2));
    textView.setOnClickListener(new ag(this, textInputEditText2, textView));
    ms0.A = new bg(this, textInputEditText2, textInputEditText1, paramyf, paramBoolean);
    ms0.C = new cg(this, paramyf, 0);
    ms0.W = new dg((rg)view, timer);
    ms0.X = new eg((rg)view, timer);
    ms0.Y = new fg(textInputEditText1, 0);
    ms0.p().getWindow().setSoftInputMode(16);
  }
  
  public final void c(int paramInt, Uri paramUri, v00 paramv00) {
    try {
      MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission(paramUri, 3);
    } finally {
      paramUri = null;
    } 
    if (paramInt == 10502 || paramInt == 10501) {
      if (paramInt == 10502)
        this.c.clear(); 
      this.s = true;
      this.m = false;
      s();
      l(true);
      return;
    } 
    if (paramInt == 10503) {
      this.m = false;
      s();
      (new pg(this, 1)).start();
    } 
  }
  
  public final void e() {
    yf yf1 = this.k;
    ry ry1 = this.h;
    if (yf1 != null) {
      int i = this.c.indexOf(yf1);
      ry1.i.k0(i);
      if (i >= 0)
        ry1.i.postDelayed(new hg(this, i, 0), 300L); 
      this.k = null;
    } 
    if (this.s) {
      Animation animation = AnimationUtils.loadAnimation(MyApplication.i.getApplicationContext(), 2130772019);
      ry1.l.startAnimation(animation);
      this.s = false;
    } 
  }
  
  public final boolean f() {
    return (this.f.equals(MusicService.y()) && MusicService.P0 != null && MusicService.F0);
  }
  
  public final void g(yf paramyf) {
    try {
      ms0 ms0 = new ms0();
      this((Context)this.b);
      ms0.d(paramyf.c);
      ms0.n(2131886483);
      ms0.k(2131886278);
      cg cg = new cg();
      this(this, paramyf, 1);
      ms0.A = cg;
      l0 l0 = new l0();
      this(23);
      ms0.B = l0;
      if (f()) {
        ms0.r = n(paramyf.b);
        cg cg1 = new cg();
        this(this, paramyf, 2);
        ms0.C = cg1;
      } 
      return;
    } finally {
      paramyf = null;
      paramyf.printStackTrace();
    } 
  }
  
  public final void h() {
    GhostSearchActivity ghostSearchActivity = this.b;
    try {
      return;
    } finally {
      ghostSearchActivity = null;
      ghostSearchActivity.printStackTrace();
    } 
  }
  
  public final void i() {
    String str = t();
    Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
    a(str, intent);
    this.b.startActivityForResult(intent, 10501);
  }
  
  public final void j() {
    String str = t();
    GhostSearchActivity ghostSearchActivity = this.b;
    Spanned spanned = Html.fromHtml(ghostSearchActivity.getString(2131886267, new Object[] { str }));
    ms0 ms0 = new ms0((Context)ghostSearchActivity);
    ms0.d((CharSequence)spanned);
    ms0.k(2131886278);
    ms0.n(2131887265);
    ms0.A = new lg(this, 1);
    ms0.p();
  }
  
  public final void k(int paramInt1, int paramInt2, Intent paramIntent) {
    ms0 ms0;
    GhostSearchActivity ghostSearchActivity = this.b;
    Resources resources = ghostSearchActivity.getResources();
    if (this.m) {
      if ((paramInt1 == 10502 || paramInt1 == 10501 || paramInt1 == 10503) && paramInt2 == -1 && paramIntent != null) {
        Uri uri = paramIntent.getData();
        if (uri != null) {
          String str = uri.toString();
          v00 v001 = v00.q(n21.f, str);
          if (v001 != null && v001.b()) {
            ArrayList<String> arrayList = new ArrayList(2);
            if (paramInt1 == 10502 || (this.j && paramInt1 == 10501)) {
              km0 km01 = this.f;
              km01.d();
              String str2 = km01.h;
              if (!str2.equalsIgnoreCase(ml0.c(v001.b.toString()))) {
                StringBuilder stringBuilder1 = new StringBuilder("🔸 ");
                stringBuilder1.append(resources.getString(2131886268, new Object[] { ml0.a((MyApplication.F.c(str2)).b) }));
                arrayList.add(stringBuilder1.toString());
              } 
              String str3 = t();
              String str1 = v001.h();
              if (!str3.equals(str1)) {
                StringBuilder stringBuilder1 = new StringBuilder("🔸 ");
                stringBuilder1.append(resources.getString(2131886565, new Object[] { str3 }));
                if (ag0.J(str1).startsWith(ag0.J(str3))) {
                  StringBuilder stringBuilder2 = new StringBuilder("<br/><small>");
                  stringBuilder2.append(resources.getString(2131886811));
                  stringBuilder2.append("</small>");
                  String str4 = stringBuilder2.toString();
                } else {
                  str1 = "";
                } 
                stringBuilder1.append(str1);
                arrayList.add(stringBuilder1.toString());
              } 
            } 
            if (arrayList.isEmpty()) {
              c(paramInt1, uri, v001);
              return;
            } 
            ms0 = new ms0((Context)ghostSearchActivity);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ghostSearchActivity.getString(2131887148));
            stringBuilder.append(":<br/><br/>");
            stringBuilder.append(TextUtils.join("<br/><br/>", arrayList));
            ms0.d((CharSequence)Html.fromHtml(stringBuilder.toString()));
            ms0.n(2131887524);
            ms0.l(2131886278);
            ms0.k(2131886404);
            int[] arrayOfInt = m92.h;
            paramInt2 = arrayOfInt[5];
            Context context = ms0.b;
            ms0.y = dd1.w(context, paramInt2);
            ms0.w0 = true;
            ms0.x = dd1.w(context, arrayOfInt[7]);
            ms0.x0 = true;
            ms0.X = new ig(this, v001);
            ms0.Z = vo1.b;
            ms0.P = false;
            ms0.D = new mg(this, v001, paramInt1, uri);
            ms0.p();
          } 
        } 
      } 
      return;
    } 
    this.n = new dy1(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), (Intent)ms0);
  }
  
  public final void l(boolean paramBoolean) {
    (new Thread(new jg(this, paramBoolean, 0))).start();
  }
  
  public final void m() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void o(yf paramyf) {
    if (f())
      try {
        MusicService.P0.t0((int)(paramyf.b * 1000L));
        return;
      } finally {
        paramyf = null;
      }  
  }
  
  public final void onClick(View paramView) {
    String str2;
    Menu menu;
    String str1;
    Intent intent;
    PopupMenu popupMenu;
    ry ry1 = this.h;
    MaterialButton materialButton1 = ry1.a;
    MaterialButton materialButton2 = ry1.d;
    if (paramView == materialButton1) {
      b(null, false);
      return;
    } 
    if (paramView == ry1.k) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131887296));
      stringBuilder.append(" | ");
      stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131886253));
      str2 = stringBuilder.toString();
      (new ub1((Context)this.b, str2, this.c, 0, this, null)).p();
      return;
    } 
    if (ry1.b == str2) {
      this.e.dismiss();
      return;
    } 
    if (ry1.f == str2) {
      j();
      return;
    } 
    GhostSearchActivity ghostSearchActivity = this.b;
    if (materialButton2 == str2) {
      popupMenu = new PopupMenu((Context)ghostSearchActivity, (View)materialButton2);
      if (Build.VERSION.SDK_INT >= 28)
        popupMenu.getMenu().setGroupDividerEnabled(true); 
      popupMenu.getMenu().add(1, 1, 1, ghostSearchActivity.getString(2131886692));
      popupMenu.getMenu().add(1, 2, 2, ghostSearchActivity.getString(2131887363));
      popupMenu.getMenu().add(1, 3, 3, ghostSearchActivity.getString(2131887266));
      popupMenu.getMenu().add(1, 4, 4, ghostSearchActivity.getString(2131886446));
      menu = popupMenu.getMenu();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(ghostSearchActivity.getString(2131887046));
      stringBuilder.append("/");
      stringBuilder.append(ghostSearchActivity.getString(2131886412));
      menu.add(2, 5, 5, stringBuilder.toString());
      popupMenu.setOnMenuItemClickListener(new zf(this));
      popupMenu.show();
      return;
    } 
    if (((ry)popupMenu).c == menu) {
      str1 = t();
      Intent intent1 = new Intent("android.intent.action.CREATE_DOCUMENT");
      a(str1, intent1);
      ghostSearchActivity.startActivityForResult(intent1, 10502);
      return;
    } 
    if (((ry)popupMenu).e == str1) {
      String str = t();
      intent = new Intent("android.intent.action.OPEN_DOCUMENT");
      a(str, intent);
      ghostSearchActivity.startActivityForResult(intent, 10503);
      return;
    } 
    if (((ry)popupMenu).m == intent) {
      h();
      return;
    } 
    if (((ry)popupMenu).l == intent)
      h(); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    GhostSearchActivity ghostSearchActivity = this.b;
    if (ghostSearchActivity != null && !this.o) {
      this.o = true;
      this.i.a(true);
    } 
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    this.q = true;
    m();
  }
  
  public final void r(PlaybackStateCompat paramPlaybackStateCompat, MaterialButton paramMaterialButton, Group paramGroup) {
    try {
      if (paramPlaybackStateCompat.b == 3) {
        paramMaterialButton.setIconResource(2131231062);
      } else {
        paramMaterialButton.setIconResource(2131231064);
      } 
      Bundle bundle = paramPlaybackStateCompat.m;
      return;
    } finally {
      paramPlaybackStateCompat = null;
      paramPlaybackStateCompat.printStackTrace();
    } 
  }
  
  public final void s() {
    Exception exception;
    v00 v001;
    MaterialButton materialButton1;
    FlexboxLayout flexboxLayout;
    TextView textView;
    MaterialButton materialButton2;
    RecyclerView recyclerView;
    Space space;
    LinearProgressIndicator linearProgressIndicator;
    ry ry1 = this.h;
    try {
      if (this.o)
        return; 
      MaterialButton materialButton5 = ry1.b;
      linearProgressIndicator = ry1.h;
      space = ry1.j;
      recyclerView = ry1.i;
      MaterialButton materialButton3 = ry1.k;
      MaterialButton materialButton4 = ry1.a;
      flexboxLayout = ry1.g;
      materialButton2 = ry1.f;
      materialButton1 = ry1.d;
      textView = ry1.l;
      materialButton5.setVisibility(0);
      if (this.m) {
        linearProgressIndicator.setVisibility(8);
        textView.setVisibility(0);
        boolean bool = this.j;
        km0 km01 = this.f;
        if (!bool && this.l == null) {
          materialButton1.setVisibility(8);
          materialButton2.setVisibility(8);
          materialButton4.setVisibility(8);
          flexboxLayout.setVisibility(0);
          materialButton3.setVisibility(8);
          recyclerView.setVisibility(8);
          space.setVisibility(8);
          textView.setText(MyApplication.i.getApplicationContext().getString(2131886617, new Object[] { km01.g }));
          return;
        } 
        flexboxLayout.setVisibility(8);
        recyclerView.setVisibility(0);
        space.setVisibility(0);
        if (this.j) {
          materialButton4.setVisibility(8);
          materialButton1.setVisibility(8);
          materialButton2.setVisibility(0);
        } else {
          materialButton4.setVisibility(0);
          materialButton1.setVisibility(0);
          materialButton2.setVisibility(8);
        } 
        v001 = this.l;
        if (v001 != null) {
          textView.setText(v001.h());
        } else {
          textView.setText(MyApplication.i.getApplicationContext().getString(2131886617, new Object[] { km01.g }));
        } 
        this.g.g();
        if (this.c.size() >= 10) {
          materialButton3.setVisibility(0);
        } else {
          materialButton3.setVisibility(8);
        } 
        e();
        return;
      } 
    } finally {}
    materialButton1.setVisibility(8);
    materialButton2.setVisibility(8);
    textView.setVisibility(8);
    v001.setVisibility(8);
    flexboxLayout.setVisibility(8);
    linearProgressIndicator.setVisibility(0);
    exception.setVisibility(8);
    recyclerView.setVisibility(8);
    space.setVisibility(8);
  }
  
  public final String t() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(ag0.J(this.f.g));
    stringBuilder.append(".txt");
    return stringBuilder.toString();
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    paramInt = 0;
    while (true) {
      ArrayList<xj1> arrayList = this.c;
      if (paramInt < arrayList.size()) {
        if (arrayList.get(paramInt) == paramxj1) {
          this.h.i.k0(paramInt);
          (new Handler()).postDelayed(new hg(this, paramInt, 1), 300L);
          return;
        } 
        paramInt++;
        continue;
      } 
      break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */