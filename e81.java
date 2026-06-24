import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.PlaylistEditActivity;
import java.util.ArrayList;
import java.util.HashSet;

public final class e81 extends he1 implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {
  public final SmartTextView A;
  
  public final SmartTextView B;
  
  public int C;
  
  public int D;
  
  public long E;
  
  public final xt0 F = new xt0(7, this);
  
  public final PlaylistEditActivity G;
  
  public final ImageView w;
  
  public final ImageView x;
  
  public final SmartTextView y;
  
  public final SmartTextView z;
  
  public e81(PlaylistEditActivity paramPlaylistEditActivity, View paramView, int paramInt) {
    super(paramView);
    if (paramInt == 10) {
      SmartTextView smartTextView5 = (SmartTextView)paramView.findViewById(2131297688);
      this.y = smartTextView5;
      SmartTextView smartTextView6 = (SmartTextView)paramView.findViewById(2131297750);
      this.B = smartTextView6;
      smartTextView6.setVisibility(0);
      smartTextView5.setTypeface(Typeface.DEFAULT_BOLD);
      paramView.setPadding((int)(MyApplication.p * 112.0F), paramView.getPaddingTop(), paramView.getPaddingRight(), paramView.getPaddingBottom());
      paramView.setBackground(m92.z(paramView.getContext(), 2130969903));
      return;
    } 
    SmartImageView smartImageView2 = (SmartImageView)paramView.findViewById(2131296852);
    ImageView imageView = (ImageView)paramView.findViewById(2131296913);
    this.w = imageView;
    this.x = (ImageView)paramView.findViewById(2131296842);
    SmartImageView smartImageView1 = (SmartImageView)paramView.findViewById(2131296876);
    SmartTextView smartTextView1 = (SmartTextView)paramView.findViewById(2131297890);
    this.y = smartTextView1;
    SmartTextView smartTextView3 = (SmartTextView)paramView.findViewById(2131297685);
    this.z = smartTextView3;
    SmartTextView smartTextView4 = (SmartTextView)paramView.findViewById(2131297692);
    this.B = smartTextView4;
    SmartTextView smartTextView2 = (SmartTextView)paramView.findViewById(2131297740);
    this.A = smartTextView2;
    paramView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
    smartImageView1.setOnClickListener(this);
    smartImageView2.setOnTouchListener(this);
    imageView.setOnTouchListener(this);
    int i = paramInt % 2;
    if (paramInt - i == 6) {
      smartImageView2.setColorTintIndex(7);
      smartImageView1.setColorTintIndex(7);
      smartTextView1.setTextTintIndex(7);
      smartTextView3.setTextTintIndex(7);
      smartTextView4.setTextTintIndex(7);
      smartTextView2.setTextTintIndex(7);
      imageView.setAlpha(Color.alpha(m92.h[7]));
    } 
    if (i == 1)
      paramView.setBackgroundDrawable(m92.z(paramView.getContext(), 2130969903)); 
  }
  
  public final void onClick(View paramView) {
    if (paramView.getId() == 2131296876) {
      int i = c();
      if (i >= 0) {
        PlaylistEditActivity playlistEditActivity = this.G;
        km0 km0 = playlistEditActivity.T.get(i);
        ArrayList<String> arrayList = new ArrayList(3);
        arrayList.add(playlistEditActivity.getString(2131887164));
        if (km0.u != 64)
          arrayList.add(playlistEditActivity.getString(2131887416)); 
        v00 v00 = v00.q(MyApplication.i.getApplicationContext(), ag0.Q0(km0.c.f));
        if (v00.l())
          arrayList.add(playlistEditActivity.getString(2131887123)); 
        ms0 ms0 = new ms0((Context)playlistEditActivity);
        StringBuilder stringBuilder = new StringBuilder("<small>");
        stringBuilder.append(v00.v());
        stringBuilder.append("</small>");
        ms0.f = (CharSequence)Html.fromHtml(stringBuilder.toString());
        ms0.h(arrayList);
        ms0.j(new vf0(i, playlistEditActivity, km0));
        ms0.p();
      } 
      return;
    } 
    s();
  }
  
  public final boolean onLongClick(View paramView) {
    s();
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    PlaylistEditActivity playlistEditActivity = this.G;
    ij0 ij0 = playlistEditActivity.j0;
    int k = paramMotionEvent.getActionMasked();
    int j = (int)paramMotionEvent.getX();
    int i = (int)paramMotionEvent.getY();
    ViewParent viewParent = paramView.getParent();
    xt0 xt01 = this.F;
    ImageView imageView = this.w;
    View view = this.b;
    if (k == 0) {
      this.D = j;
      this.C = i;
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(true); 
      if (paramView.getId() == 2131296913) {
        view.setPressed(true);
        this.E = System.currentTimeMillis();
        imageView.postDelayed(xt01, 500L);
        return true;
      } 
    } else {
      ArrayList<km0> arrayList;
      if (k == 2) {
        j = Math.abs(j - this.D);
        i = Math.abs(i - this.C);
        k = playlistEditActivity.c0;
        if (j > k || i > k) {
          if (viewParent != null)
            viewParent.requestDisallowInterceptTouchEvent(false); 
          if (j > i) {
            if (MyApplication.o().getBoolean("k_b_sraarm", true)) {
              ij0.r(this);
            } else {
              if (viewParent != null)
                viewParent.requestDisallowInterceptTouchEvent(false); 
              if (viewParent instanceof ViewGroup)
                ((ViewGroup)viewParent).onTouchEvent(paramMotionEvent); 
            } 
          } else {
            if (paramView.getId() == 2131296913) {
              if (viewParent != null)
                viewParent.requestDisallowInterceptTouchEvent(false); 
              if (viewParent instanceof ViewGroup) {
                ((ViewGroup)viewParent).onTouchEvent(paramMotionEvent);
                return false;
              } 
            } else {
              i = c();
              if (i >= 0) {
                if (playlistEditActivity.U.size() > 1 && playlistEditActivity.U.contains(Integer.valueOf(i))) {
                  playlistEditActivity.e0 = new ArrayList(playlistEditActivity.U.size());
                  playlistEditActivity.f0 = new ArrayList(playlistEditActivity.T.size() - playlistEditActivity.U.size());
                  playlistEditActivity.h0 = false;
                  j = -1;
                  for (i = 0; i < playlistEditActivity.T.size(); i++) {
                    boolean bool = playlistEditActivity.U.contains(Integer.valueOf(i));
                    arrayList = playlistEditActivity.e0;
                    if (bool) {
                      arrayList.add(playlistEditActivity.T.get(i));
                    } else {
                      if (arrayList.size() == 0)
                        j = i; 
                      playlistEditActivity.f0.add(playlistEditActivity.T.get(i));
                    } 
                  } 
                  playlistEditActivity.g0 = j + 1;
                  playlistEditActivity.i0 = new HashSet(playlistEditActivity.U);
                  playlistEditActivity.U.clear();
                  playlistEditActivity.d0.g();
                  playlistEditActivity.n0();
                  playlistEditActivity.Z.k0(playlistEditActivity.g0);
                  playlistEditActivity.Z.postDelayed(new e6(14, this, paramMotionEvent), 150L);
                  return false;
                } 
                ij0.q(this);
              } 
              if (viewParent != null)
                viewParent.requestDisallowInterceptTouchEvent(false); 
            } 
            return false;
          } 
        } else {
          return true;
        } 
      } else {
        if (k == 1 || k == 3) {
          if (arrayList.getId() == 2131296913) {
            view.setPressed(false);
            if (this.E > 0L && System.currentTimeMillis() - this.E < 500L && k == 1)
              view.performClick(); 
          } 
          imageView.removeCallbacks(xt01);
          this.E = 0L;
          if (viewParent != null)
            viewParent.requestDisallowInterceptTouchEvent(false); 
        } 
        return true;
      } 
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(false); 
    } 
    return true;
  }
  
  public final void s() {
    boolean bool1;
    PlaylistEditActivity playlistEditActivity = this.G;
    boolean bool = playlistEditActivity.m0;
    boolean bool2 = true;
    if (bool || playlistEditActivity.U.size() > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int i = c();
    if (i >= 0) {
      bool = playlistEditActivity.U.contains(Integer.valueOf(i));
      HashSet<Integer> hashSet = playlistEditActivity.U;
      if (!bool) {
        hashSet.add(Integer.valueOf(i));
      } else {
        hashSet.remove(Integer.valueOf(i));
      } 
      boolean bool3 = bool2;
      if (!playlistEditActivity.m0)
        if (playlistEditActivity.U.size() > 0) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }  
      a3 a3 = playlistEditActivity.d0;
      if (bool1 == bool3) {
        a3.h(i);
      } else {
        a3.g();
      } 
      playlistEditActivity.n0();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */