package ss.com.bannerslider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import bo0;
import dc1;
import fb0;
import fn1;
import gn1;
import hh0;
import hp;
import id1;
import in1;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import jn1;
import m9;
import on1;
import p41;
import q41;
import qg;
import r51;
import td1;
import tp;
import vd1;

public class Slider extends LinearLayout {
  public static fb0 s;
  
  public p41 b;
  
  public RecyclerView c;
  
  public PercentLinearLayoutManager e;
  
  public r51 f;
  
  public jn1 g;
  
  public fn1 h;
  
  public in1 i;
  
  public hp j;
  
  public int k = 0;
  
  public Timer l;
  
  public m9 m;
  
  public View n;
  
  public int o = -1;
  
  public int p = -1;
  
  public vd1 q;
  
  public final gn1 r = new gn1(this, 0);
  
  public Slider(Context paramContext) {
    super(paramContext);
    setupViews(null);
  }
  
  public Slider(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setupViews(paramAttributeSet);
  }
  
  public Slider(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setupViews(paramAttributeSet);
  }
  
  public static hh0 getImageLoadingService() {
    fb0 fb01 = s;
    if (fb01 != null)
      return (hh0)fb01; 
    tp.f("ImageLoadingService is null, you should call init method first");
    return null;
  }
  
  private void setupViews(AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, dc1.b);
      try {
        Context context = getContext();
        hp hp1 = new hp();
        super();
        hp1.a = false;
        hp1.b = true;
        hp1.c = -1;
        hp1.f = true;
        hp1.g = 0;
        hp1.h = -1;
        context = context.getApplicationContext();
        hp1.f = typedArray.getBoolean(12, true);
        hp1.h = typedArray.getResourceId(14, -1);
        hp1.c = typedArray.getDimensionPixelSize(16, 0);
        hp1.b = typedArray.getBoolean(18, false);
        hp1.g = typedArray.getInteger(17, 0);
        hp1.d = typedArray.getDrawable(19);
        hp1.e = typedArray.getDrawable(20);
        hp1.a = typedArray.getBoolean(15, false);
        if (hp1.d == null)
          hp1.d = context.getDrawable(2131231435); 
        if (hp1.e == null)
          hp1.e = context.getDrawable(2131231436); 
        if (hp1.c == -1)
          hp1.c = context.getResources().getDimensionPixelSize(2131165334); 
      } catch (Exception exception) {
      
      } finally {
        typedArray.recycle();
      } 
      typedArray.recycle();
    } else {
      Context context = getContext();
      Object object = new Object();
      ((hp)object).a = false;
      ((hp)object).b = true;
      ((hp)object).c = -1;
      ((hp)object).f = true;
      ((hp)object).g = 0;
      ((hp)object).h = -1;
      context = context.getApplicationContext();
      if (((hp)object).d == null)
        ((hp)object).d = context.getDrawable(2131231435); 
      if (((hp)object).e == null)
        ((hp)object).e = context.getDrawable(2131231436); 
      if (((hp)object).c == -1)
        ((hp)object).c = context.getResources().getDimensionPixelSize(2131165334); 
      this.j = (hp)object;
    } 
    setOrientation(1);
    RecyclerView recyclerView1 = new RecyclerView(getContext());
    this.c = recyclerView1;
    recyclerView1.i((vd1)new gn1(this, 1));
    if (this.j.h != -1) {
      View view = LayoutInflater.from(getContext()).inflate(this.j.h, (ViewGroup)this, false);
      this.n = view;
      addView(view);
    } 
    this.f = new r51();
    ArrayList arrayList = this.c.l0;
    gn1 gn11 = this.r;
    if (arrayList != null)
      arrayList.remove(gn11); 
    this.c.i((vd1)gn11);
    this.c.setOnFlingListener(null);
    r51 r511 = this.f;
    RecyclerView recyclerView2 = this.c;
    on1 on1 = r511.b;
    RecyclerView recyclerView3 = r511.a;
    if (recyclerView3 != recyclerView2) {
      if (recyclerView3 != null) {
        ArrayList arrayList1 = recyclerView3.l0;
        if (arrayList1 != null)
          arrayList1.remove(on1); 
        r511.a.setOnFlingListener(null);
      } 
      r511.a = recyclerView2;
      if (recyclerView2 != null)
        if (recyclerView2.getOnFlingListener() == null) {
          r511.a.i((vd1)on1);
          r511.a.setOnFlingListener((td1)r511);
          new Scroller(r511.a.getContext(), (Interpolator)new DecelerateInterpolator());
          r511.f();
        } else {
          tp.f("An instance of OnFlingListener already set.");
          return;
        }  
    } 
    if (!this.j.a) {
      Context context = getContext();
      hp hp1 = this.j;
      this.h = new fn1(context, hp1.d, hp1.e, hp1.c, hp1.f);
    } 
  }
  
  public final void a(int paramInt) {
    this.k = paramInt;
    paramInt = this.m.a(paramInt);
    fn1 fn11 = this.h;
    if (fn11 != null)
      fn11.K(paramInt); 
    p41 p411 = this.b;
    if (p411 != null)
      p411.K(paramInt); 
  }
  
  public final void b() {
    if (!this.j.a && this.i != null) {
      fn1 fn12 = this.h;
      if (fn12 != null)
        removeView((View)fn12); 
      Context context = getContext();
      hp hp1 = this.j;
      fn1 fn11 = new fn1(context, hp1.d, hp1.e, hp1.c, hp1.f);
      this.h = fn11;
      addView((View)fn11);
      for (byte b = 0; b < this.i.a(); b++)
        this.h.a(); 
    } 
  }
  
  public final void c() {
    if (this.j.g > 0) {
      d();
      Timer timer = new Timer();
      this.l = timer;
      qg qg = new qg(1, this);
      long l = this.j.g;
      timer.schedule((TimerTask)qg, 1000L + l, l);
    } 
  }
  
  public final void d() {
    Timer timer = this.l;
    if (timer != null) {
      timer.cancel();
      this.l.purge();
    } 
  }
  
  public in1 getAdapter() {
    return this.i;
  }
  
  public hp getConfig() {
    return this.j;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    c();
    this.h.K(0);
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    d();
  }
  
  public void setAdapter(in1 paramin1) {
    if (paramin1 != null) {
      RecyclerView recyclerView = this.c;
      if (recyclerView != null) {
        this.i = paramin1;
        if (indexOfChild((View)recyclerView) == -1) {
          LinearLayout.LayoutParams layoutParams;
          if ((getLayoutParams()).height == -2) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
          } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0F;
          } 
          this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
          addView((View)this.c);
        } 
        recyclerView = this.c;
        int i = 0;
        recyclerView.setNestedScrollingEnabled(false);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.e = (PercentLinearLayoutManager)linearLayoutManager;
        this.c.setLayoutManager((a)linearLayoutManager);
        boolean bool = this.j.b;
        Object object = new Object();
        ((m9)object).c = paramin1;
        ((m9)object).a = bool;
        this.m = (m9)object;
        if (paramin1.a() > 1 && this.j.b) {
          bool = true;
        } else {
          bool = false;
        } 
        this.c.getLayoutParams();
        object = new bo0(1, this);
        m9 m91 = this.m;
        id1 id1 = new id1();
        ((jn1)id1).e = paramin1;
        ((jn1)id1).f = bool;
        ((jn1)id1).g = (bo0)object;
        ((jn1)id1).h = m91;
        this.g = (jn1)id1;
        this.c.setAdapter(id1);
        this.m.b = this.g;
        int j = this.o;
        if (j >= 0 && j < paramin1.a()) {
          i = this.o;
        } else if (this.j.b) {
          i = 1;
        } 
        this.k = i;
        this.c.k0(i);
        a(this.k);
        if (this.h != null && paramin1.a() > 1) {
          if (indexOfChild((View)this.h) == -1)
            addView((View)this.h); 
          this.h.setSlides(paramin1.a());
        } 
        View view = this.n;
        if (view != null)
          view.setVisibility(8); 
      } 
    } 
  }
  
  public void setAnimateIndicators(boolean paramBoolean) {
    this.j.f = paramBoolean;
    fn1 fn11 = this.h;
    if (fn11 != null)
      fn11.setMustAnimateIndicators(paramBoolean); 
  }
  
  public void setFadingEdgePx(int paramInt) {
    this.c.setHorizontalFadingEdgeEnabled(true);
    this.c.setFadingEdgeLength(paramInt);
  }
  
  public void setIndicatorSize(int paramInt) {
    this.j.c = paramInt;
    b();
  }
  
  public void setIndicatorStyle(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3) {
            this.j.d = getContext().getDrawable(2131231437);
            this.j.e = getContext().getDrawable(2131231438);
          } 
        } else {
          this.j.d = getContext().getDrawable(2131231439);
          this.j.e = getContext().getDrawable(2131231440);
        } 
      } else {
        this.j.d = getContext().getDrawable(2131231441);
        this.j.e = getContext().getDrawable(2131231442);
      } 
    } else {
      this.j.d = getContext().getDrawable(2131231435);
      this.j.e = getContext().getDrawable(2131231436);
    } 
    b();
  }
  
  public void setInterval(int paramInt) {
    this.j.g = paramInt;
    d();
    c();
  }
  
  public void setLoopSlides(boolean paramBoolean) {
    this.j.b = paramBoolean;
    jn1 jn11 = this.g;
    jn11.f = paramBoolean;
    this.m.a = paramBoolean;
    jn11.g();
    this.c.k0(paramBoolean);
    a(paramBoolean);
  }
  
  public void setOnSlideClickListener(q41 paramq41) {
    jn1 jn11 = this.g;
    if (jn11 != null)
      jn11.d = paramq41; 
  }
  
  public void setOnSlideScrollListener(vd1 paramvd1) {
    this.q = paramvd1;
  }
  
  public void setSelectedSlide(int paramInt) {
    m9 m91 = this.m;
    if (m91.a)
      if (paramInt >= 0 && paramInt < ((in1)m91.c).a()) {
        paramInt++;
      } else {
        Log.e("PositionController", "setSelectedSlide: Invalid Item Position");
        paramInt = 1;
      }  
    RecyclerView recyclerView = this.c;
    if (recyclerView != null && recyclerView.getAdapter() != null) {
      this.c.n0(paramInt);
      a(paramInt);
    } 
  }
  
  public void setSelectedSlideIndicator(Drawable paramDrawable) {
    this.j.d = paramDrawable;
    b();
  }
  
  public void setSlideChangeListener(p41 paramp41) {
    this.b = paramp41;
  }
  
  public void setUnSelectedSlideIndicator(Drawable paramDrawable) {
    this.j.e = paramDrawable;
    b();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ss\com\bannerslider\Slider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */