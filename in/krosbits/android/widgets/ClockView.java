package in.krosbits.android.widgets;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.TextView;
import bm;
import e;
import java.text.DateFormat;
import java.util.Calendar;

public class ClockView extends TextView {
  public static final int i = 0;
  
  public final Calendar b;
  
  public bm c;
  
  public e e;
  
  public Handler f;
  
  public boolean g = false;
  
  public DateFormat h;
  
  public ClockView(Context paramContext) {
    super(paramContext);
    if (this.b == null)
      this.b = Calendar.getInstance(); 
  }
  
  public ClockView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    if (this.b == null)
      this.b = Calendar.getInstance(); 
  }
  
  public CharSequence getAccessibilityClassName() {
    return ClockView.class.getName();
  }
  
  public final void onAttachedToWindow() {
    this.g = false;
    super.onAttachedToWindow();
    this.c = new bm(this);
    getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, (ContentObserver)this.c);
    this.h = DateFormat.getTimeFormat(getContext());
    this.f = new Handler();
    e e1 = new e(9, this);
    this.e = e1;
    e1.run();
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.g = true;
    getContext().getContentResolver().unregisterContentObserver((ContentObserver)this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\ClockView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */