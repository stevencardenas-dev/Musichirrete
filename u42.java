import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.insets.ProtectionLayout;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;

public class u42 extends ua0 implements View.OnTouchListener, View.OnClickListener {
  public ScrollView a0;
  
  public ObjectAnimator b0;
  
  public final yi1 c0 = new yi1(11, this);
  
  public final void b0(Bundle paramBundle) {
    this.I = true;
    this.a0.post(this.c0);
    ObjectAnimator objectAnimator = ObjectAnimator.ofInt(this.a0, "scrollY", new int[] { 0 });
    this.b0 = objectAnimator;
    objectAnimator.setStartDelay(1000L);
    this.b0.setDuration(500L);
    this.a0.setOnTouchListener(this);
    this.b0.start();
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131493003, paramViewGroup, false);
    this.a0 = (ScrollView)view.findViewById(2131297555);
    ProtectionLayout protectionLayout = (ProtectionLayout)view.findViewById(2131296941);
    hn hn = new hn(2, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    g92.c((View)this.a0, true, false);
    TextView textView1 = (TextView)view.findViewById(2131297883);
    view.findViewById(2131297832).setOnClickListener(this);
    Locale locale = (S().getConfiguration()).locale;
    TextView textView2 = (TextView)view.findViewById(2131297774);
    object = new StringBuilder("Language: ");
    object.append(locale.getDisplayName(locale));
    textView2.setText(object.toString());
    textView2.setOnClickListener(this);
    textView1.setOnClickListener(this);
    return view;
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297774) {
      (new ql0(P())).p();
      return;
    } 
    if (i == 2131297883) {
      ag0.M0(P(), null);
      return;
    } 
    if (i == 2131297832)
      try {
        Context context = MyApplication.i.getApplicationContext();
        Intent intent = new Intent();
        this("android.intent.action.VIEW", Uri.parse("https://krosbits.in/musicolet/docs/privacy_policy/"));
        context.startActivity(intent.addFlags(268435456));
      } finally {} 
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    ObjectAnimator objectAnimator = this.b0;
    if (objectAnimator != null) {
      objectAnimator.cancel();
      this.b0 = null;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */