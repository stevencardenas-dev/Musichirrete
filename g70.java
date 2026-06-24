import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import in.krosbits.musicolet.FAQActivity;
import in.krosbits.musicolet.MyApplication;

public final class g70 extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final FAQActivity x;
  
  public g70(FAQActivity paramFAQActivity, View paramView, int paramInt) {
    super(paramView);
    TextView textView = (TextView)paramView;
    this.w = textView;
    if (paramInt == 0) {
      textView.setOnClickListener(this);
      paramInt = paramFAQActivity.T;
      textView.setPadding(paramInt, paramInt, paramInt, paramInt);
      textView.setBackgroundDrawable(m92.z((Context)paramFAQActivity, 2130969899));
    } 
  }
  
  public final void onClick(View paramView) {
    Intent intent;
    FAQActivity fAQActivity = this.x;
    f70 f70 = fAQActivity.R.get(c());
    Runnable runnable = f70.g;
    Uri uri = f70.f;
    if (runnable != null) {
      runnable.run();
      return;
    } 
    if (uri != null) {
      try {
        if (!qi0.b.e(paramView, uri.toString())) {
          Context context = MyApplication.i.getApplicationContext();
          intent = new Intent();
          return;
        } 
      } finally {
        paramView = null;
        paramView.printStackTrace();
      } 
    } else {
      try {
        String str1 = ((f70)intent).d;
        String str2 = str1;
        if (str1 == null)
          try {
            str2 = fAQActivity.getString(((f70)intent).c);
          } finally {} 
        str1 = str2;
      } finally {
        uri = null;
        paramView = null;
      } 
      if (paramView != null) {
        ms0 ms0 = new ms0((Context)fAQActivity);
        ms0.d((CharSequence)Html.fromHtml((String)paramView));
        ms0.n(2131887030);
        ms0.r = ((f70)intent).e;
        ms0.c = (MovementMethod)new qi0();
        ms0.C = ((f70)intent).h;
        ms0.p();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */