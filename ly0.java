import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.material.checkbox.MaterialCheckBox;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RGReadCalcActivity;
import in.krosbits.musicolet.ReplayGainReadCalcService;
import in.krosbits.musicolet.Tag2Activity;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Stack;

public final class ly0 implements View.OnClickListener, b91 {
  public pc b;
  
  public qy0 c;
  
  public View e;
  
  public SmartTextView f;
  
  public View g;
  
  public RecyclerView h;
  
  public m90 i;
  
  public int j;
  
  public ss0 k;
  
  public bx0 l;
  
  public tj m;
  
  public ly0(pc parampc) {
    this.b = parampc;
    this.c = (qy0)parampc;
  }
  
  public final void a() {
    ss0 ss01 = this.k;
    if (ss01 != null) {
      ss01.dismiss();
      this.k = null;
    } 
    if (my0.f)
      my0.a(); 
  }
  
  public final void b() {
    View view = this.e;
    if (view != null) {
      view.findViewById(2131296959).setOnClickListener(null);
      this.e.findViewById(2131296969).setOnClickListener(null);
      this.e.findViewById(2131296995).setOnClickListener(null);
      this.f.setOnClickListener(null);
      this.e.setOnClickListener(null);
    } 
    ss0 ss01 = this.k;
    if (ss01 != null && ss01.isShowing())
      this.k.dismiss(); 
    this.k = null;
    this.i = null;
    this.g = null;
    this.b = null;
    this.c = null;
    this.f = null;
    this.h = null;
    this.e = null;
    this.m = null;
  }
  
  public final void c() {
    if (this.e != null && e()) {
      Animation animation = AnimationUtils.loadAnimation((Context)this.b.getApplication(), 2130772020);
      this.e.startAnimation(animation);
      if (this.h.getVisibility() == 0)
        h(); 
      this.e.setVisibility(8);
    } 
  }
  
  public final boolean d() {
    return (my0.d() && this.e != null && e() && this.h.getVisibility() == 0);
  }
  
  public final boolean e() {
    View view = this.e;
    return (view != null && view.getVisibility() == 0);
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == this || (paramObject instanceof ly0 && ((ly0)paramObject).b == this.b));
  }
  
  public final void f(boolean paramBoolean) {
    if (e()) {
      View view = this.g;
      if (paramBoolean) {
        view.setVisibility(0);
        return;
      } 
      view.setVisibility(8);
    } 
  }
  
  public final void g() {
    if (this.e == null) {
      Exception exception;
      ConstraintLayout constraintLayout;
      pq pq;
      try {
        View view1 = this.b.getWindow().getDecorView();
        constraintLayout = (ConstraintLayout)view1.findViewById(2131297382);
        View view2 = LayoutInflater.from((Context)this.b).inflate(2131493203, (ViewGroup)constraintLayout, false);
        this.e = view2;
        i = 8;
        view2.setVisibility(8);
        pq = new pq();
        this();
        constraintLayout.addView(this.e);
        pq.c(constraintLayout);
        pq.d(this.e.getId(), 4, 0, 4);
        if (this.b instanceof MusicActivity) {
          if (MyApplication.o().getString("k_i_tbabt", "1").equals("1"))
            i = 56; 
        } else {
          i = 0;
        } 
      } finally {}
      float f = this.b.getResources().getDimension(2131165390);
      int j = (int)(f * i);
      int i = j;
      try {
      
      } finally {
        Exception exception1 = null;
      } 
      pq.l(this.e.getId(), 4, i);
      pq.a(constraintLayout);
      View view = this.e.findViewById(2131296959);
      this.g = view;
      view.setOnClickListener(this);
      this.e.findViewById(2131296969).setOnClickListener(this);
      SmartTextView smartTextView = (SmartTextView)this.e.findViewById(2131297800);
      this.f = smartTextView;
      smartTextView.setOnClickListener(this);
      this.e.findViewById(2131296995).setOnClickListener(this);
      this.h = (RecyclerView)this.e.findViewById(2131297424);
      exception.getHeight();
      (this.h.getLayoutParams()).height = (int)(this.b.getResources().getDimension(2131165390) * 200.0F);
      this.h.invalidate();
      m90 m901 = new m90();
      this(this, this.b);
      this.i = m901;
      this.h.setAdapter(m901);
      RecyclerView recyclerView = this.h;
      LinearLayoutManager2 linearLayoutManager2 = new LinearLayoutManager2();
      super(1);
      recyclerView.setLayoutManager((a)linearLayoutManager2);
      n2 n2 = new n2();
      pc pc1 = this.b;
      this((Context)pc1, this.g);
      rw0 rw0 = (rw0)n2.c;
      cr1 cr1 = new cr1();
      this((Context)pc1);
      cr1.inflate(2131623939, rw0);
      n2.f = this;
      ag0.A0(rw0, null);
      bx0 bx01 = new bx0();
      this((Context)this.b, rw0, this.g);
      this.l = bx01;
      bx01.d(true);
      Drawable drawable = ag0.C0(m92.h[5], MyApplication.i.getApplicationContext().getResources().getDrawable(2131231413).mutate());
      i = (int)(MyApplication.i.getApplicationContext().getResources().getDimension(2131166369) * 14.0F);
      drawable.setBounds(0, 0, i, i);
      tj tj1 = new tj();
      this(drawable);
      this.m = tj1;
    } 
    if (!e()) {
      Animation animation = AnimationUtils.loadAnimation((Context)this.b.getApplication(), 2130772025);
      this.e.startAnimation(animation);
      this.e.setVisibility(0);
    } 
    f(false);
    i();
  }
  
  public final void h() {
    RecyclerView recyclerView = this.h;
    if (recyclerView == null)
      return; 
    int i = recyclerView.getVisibility();
    recyclerView = this.h;
    if (i == 0) {
      recyclerView.setVisibility(8);
    } else {
      recyclerView.setVisibility(0);
    } 
    i();
  }
  
  public final void i() {
    if (e()) {
      Drawable drawable;
      int i = my0.c.size();
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
      spannableStringBuilder.append(this.b.getResources().getQuantityString(2131755069, i, new Object[] { Integer.valueOf(i) })).append(" ").append(" ", this.m, 0).append(" ").append(ag0.B(my0.e, false, 0));
      this.f.setText((CharSequence)spannableStringBuilder);
      i = this.h.getVisibility();
      pc pc1 = this.b;
      if (i == 0) {
        drawable = pc1.getResources().getDrawable(2131231191);
      } else {
        drawable = drawable.getResources().getDrawable(2131231194);
      } 
      this.f.setCompoundDrawables(null, null, drawable, null);
      m90 m901 = this.i;
      if (m901 != null)
        m901.g(); 
    } 
  }
  
  public final void j() {
    try {
      pc pc1 = this.b;
      xt0 xt0 = new xt0();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297800) {
      h();
      return;
    } 
    if (i == 2131296969) {
      my0.a();
      return;
    } 
    if (i == 2131296959) {
      this.l.e();
      return;
    } 
    if (i == 2131296995) {
      if (my0.d()) {
        i = my0.c.size();
        ms0 ms0 = new ms0((Context)this.b);
        ms0.f = this.b.getResources().getQuantityString(2131755027, i, new Object[] { Integer.valueOf(i) });
        ms0.e(2131493019, false);
        ss0 ss01 = new ss0(ms0);
        this.k = ss01;
        View view = ss01.e.u;
        int j = this.j;
        if (j == 2) {
          view.findViewById(2131297011).setVisibility(0);
        } else if (j == 1) {
          view.findViewById(2131297012).setVisibility(0);
        } 
        if (!ws2.U())
          view.findViewById(2131297008).setVisibility(8); 
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox)view.findViewById(2131296529);
        appCompatCheckBox.setChecked(my0.f);
        appCompatCheckBox.setOnCheckedChangeListener(new fz(2, this));
        MaterialCheckBox materialCheckBox = (MaterialCheckBox)view.findViewById(2131296558);
        if (i > 1) {
          if (MusicService.C0) {
            my0.a = true;
            materialCheckBox.setEnabled(false);
          } 
          materialCheckBox.setVisibility(0);
        } else {
          my0.a = false;
          materialCheckBox.setVisibility(8);
        } 
        materialCheckBox.setChecked(my0.a);
        materialCheckBox.setOnCheckedChangeListener(new xd0(1));
        ag0.x0((ViewGroup)view.findViewById(2131296973), this, a51.n);
        this.k.show();
        return;
      } 
    } else if (i == 2131296998) {
      try {
        ArrayList arrayList = my0.c(false);
        MusicService.P0.k(arrayList, 0, null, true);
        a();
        pc pc1 = this.b;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131297027) {
      try {
        ArrayList arrayList = my0.c(true);
        MusicService.P0.k(arrayList, 0, null, true);
        a();
        pc pc1 = this.b;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296958) {
      try {
        ArrayList arrayList = my0.c(false);
        ag0.F0((Context)this.b, arrayList, null, true, null, false, null);
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131297000) {
      try {
        MusicService.P0.g(my0.c(my0.a));
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296956) {
      try {
        MusicService musicService = MusicService.P0;
        ArrayList arrayList = my0.c(my0.a);
        musicService.j((MyApplication.h()).c, arrayList);
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296954) {
      try {
        ArrayList arrayList = my0.c(my0.a);
        tk tk = new tk();
        pc pc1 = this.b;
        boolean bool = MusicService.C0;
        Stack stack = (MyApplication.h()).b;
        i = (MyApplication.h()).c;
        jy0 jy0 = new jy0();
        this(0, arrayList);
        this((Context)pc1, stack, i, jy0);
        ((ss0)tk.f).show();
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296952) {
      try {
        GhostSearchActivity.f0 = my0.c(my0.a);
        pc pc1 = this.b;
        Intent intent = new Intent();
        this((Context)this.b, GhostSearchActivity.class);
        pc1.startActivity(intent.setAction(hbrAVtEa.veOkT));
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296950) {
      try {
        ArrayList<Object> arrayList = my0.c(false);
        int j = arrayList.size();
        i = 0;
        while (i < j) {
          km0 km0 = (km0)arrayList.get(i);
          i++;
          km0 = km0;
          c81.c(MyApplication.i.getApplicationContext()).a(km0);
        } 
        c81.j();
        MusicService.M0();
        i = arrayList.size();
        ag0.P0(0, this.b.getResources().getQuantityString(2131755063, i, new Object[] { Integer.valueOf(i) }), true);
        a();
        MusicActivity musicActivity = MusicActivity.R0;
        if (musicActivity != null) {
          z71 z71 = musicActivity.d0;
          if (z71 != null && z71.Y())
            musicActivity.d0.X0(); 
          l81 l81 = musicActivity.e0;
          if (l81 != null && l81.Y())
            musicActivity.e0.N0(); 
        } 
        MusicService.P0.b0(true);
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131297010) {
      try {
        ArrayList<Object> arrayList = my0.c(false);
        int j = arrayList.size();
        i = 0;
        while (i < j) {
          km0 km0 = (km0)arrayList.get(i);
          i++;
          km0 = km0;
          c81.c(MyApplication.i.getApplicationContext()).f(km0);
        } 
        c81.j();
        MusicService.M0();
        i = arrayList.size();
        ag0.P0(0, this.b.getResources().getQuantityString(2131755060, i, new Object[] { Integer.valueOf(i) }), true);
        a();
        MusicActivity musicActivity = MusicActivity.R0;
        if (musicActivity != null) {
          z71 z71 = musicActivity.d0;
          if (z71 != null && z71.Y())
            musicActivity.d0.X0(); 
          l81 l81 = musicActivity.e0;
          if (l81 != null && l81.Y())
            musicActivity.e0.N0(); 
        } 
        MusicService.P0.b0(false);
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131297026) {
      try {
        MusicActivity.D0(my0.c(false));
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296979) {
      try {
        pc pc1 = this.b;
        ArrayList arrayList = my0.c(false);
        Calendar calendar = lm0.M;
        ag0.j((Context)pc1, (km0[])arrayList.toArray((Object[])new km0[0]), true);
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296991) {
      try {
        pc pc1 = this.b;
        ArrayList arrayList = my0.c(false);
        Calendar calendar = lm0.M;
        ag0.h0((Context)pc1, (km0[])arrayList.toArray((Object[])new km0[0]), true);
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131296975) {
      try {
        pc pc1 = this.b;
        ArrayList arrayList = my0.c(false);
        Calendar calendar = lm0.M;
        ag0.h((Context)pc1, (km0[])arrayList.toArray((Object[])new km0[0]));
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131297012) {
      try {
        ArrayList arrayList = my0.c(false);
        MusicService.P0.f0(MusicActivity.R0.f0.c0, arrayList);
        ag0.O0(2131886467, 0);
        a();
        return;
      } finally {
        paramView = null;
      } 
    } else if (i == 2131297011) {
      try {
        ArrayList<Object> arrayList = my0.c(false);
        b81 b81 = c81.f(MyApplication.i.getApplicationContext(), MusicActivity.R0.e0.H0);
        int j = arrayList.size();
        i = 0;
        while (i < j) {
          km0 km0 = (km0)arrayList.get(i);
          i++;
          b81.f(km0);
        } 
        if (b81.d()) {
          c81.h(MyApplication.i.getApplicationContext(), b81);
        } else {
          c81.k((Context)MusicActivity.R0, b81);
        } 
        ag0.O0(2131886467, 0);
        a();
        return;
      } finally {
        paramView = null;
      } 
    } else {
      if (i == 2131296983) {
        Tag2Activity.L1 = my0.c(false);
        this.b.startActivity(new Intent((Context)this.b, Tag2Activity.class));
        a();
        return;
      } 
      if (i == 2131297823) {
        (new p71((Context)this.b, my0.c(false))).p();
        a();
        return;
      } 
      if (i == 2131296970) {
        qv.l((Context)this.b, my0.c(false));
        a();
        return;
      } 
      if (i == 2131297008) {
        if (ReplayGainReadCalcService.t) {
          ag0.O0(2131887105, 0);
          return;
        } 
        RGReadCalcActivity.n0(this.b, new HashSet(my0.c(false)));
        a();
      } 
    } 
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    if (i == 2131297137) {
      this.c.p();
    } else if (i == 2131297120) {
      this.c.w();
    } else if (i == 2131297138) {
      this.c.A();
    } else if (i == 2131297126) {
      this.c.x();
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ly0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */