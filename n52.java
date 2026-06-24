import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.WidgetService;
import java.util.ArrayList;

public final class n52 implements RemoteViewsService.RemoteViewsFactory {
  public ArrayList a;
  
  public int b;
  
  public j52 c;
  
  public n52() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void a() {
    if (!MyApplication.k()) {
      n21.F("WSUN");
      return;
    } 
    n21.F("WSUR");
    this.a = null;
    this.b = 0;
    if (MusicService.P0 != null) {
      xn1 xn1 = MusicService.z();
      if (xn1 != null) {
        this.a = xn1.g(MusicService.C0);
        this.b = xn1.e(MusicService.C0);
      } 
    } 
    if (this.a == null)
      try {
        wk1 wk1 = MyApplication.h();
        xn1 xn1 = wk1.b.get(wk1.c);
        this.a = xn1.g(MusicService.C0);
        this.b = xn1.e(MusicService.C0);
      } finally {
        Exception exception = null;
      }  
    ArrayList arrayList = this.a;
    if (arrayList != null) {
      int i = this.b;
      if (i >= 0 && i < arrayList.size()) {
        this.c = dd1.F(MyApplication.i.getApplicationContext(), this.a.get(this.b));
        return;
      } 
    } 
    this.c = null;
  }
  
  public final int getCount() {
    ArrayList arrayList = this.a;
    return (arrayList != null) ? arrayList.size() : 0;
  }
  
  public final long getItemId(int paramInt) {
    return paramInt;
  }
  
  public final RemoteViews getLoadingView() {
    return null;
  }
  
  public final RemoteViews getViewAt(int paramInt) {
    RemoteViews remoteViews;
    if (paramInt == this.b) {
      RemoteViews remoteViews1 = new RemoteViews("in.krosbits.musicolet", 2131493202);
      j52 j521 = this.c;
      remoteViews = remoteViews1;
      if (j521 != null) {
        remoteViews = remoteViews1;
        if (j521.b) {
          remoteViews1.setInt(2131296879, jLnXOLx.VcYTKzKgstkLKYo, j521.e);
          remoteViews1.setInt(2131296879, "setImageAlpha", this.c.f);
          remoteViews1.setTextColor(2131297890, this.c.c);
          remoteViews1.setTextColor(2131297692, this.c.c);
          remoteViews1.setTextColor(2131297740, this.c.c);
          remoteViews = remoteViews1;
        } 
      } 
    } else {
      RemoteViews remoteViews1 = new RemoteViews("in.krosbits.musicolet", 2131493201);
      StringBuilder stringBuilder = new StringBuilder("");
      stringBuilder.append(paramInt + 1);
      remoteViews1.setTextViewText(2131297872, stringBuilder.toString());
      j52 j521 = this.c;
      remoteViews = remoteViews1;
      if (j521 != null) {
        remoteViews = remoteViews1;
        if (j521.b) {
          remoteViews1.setTextColor(2131297872, j521.d);
          remoteViews1.setTextColor(2131297890, this.c.d);
          remoteViews1.setTextColor(2131297692, this.c.d);
          remoteViews1.setTextColor(2131297740, this.c.d);
          remoteViews = remoteViews1;
        } 
      } 
    } 
    try {
      km0 km0 = this.a.get(paramInt);
      String str = ag0.W(km0);
      qn1 qn1 = km0.c;
      remoteViews.setTextViewText(2131297890, str);
      remoteViews.setTextViewText(2131297692, qn1.e);
      remoteViews.setTextViewText(2131297740, ag0.B(qn1.g, false, 0));
      Intent intent = new Intent();
      this();
      remoteViews.setOnClickFillInIntent(2131296973, intent.putExtra("E_WQSI", paramInt));
    } finally {
      Exception exception;
    } 
    return remoteViews;
  }
  
  public final int getViewTypeCount() {
    return 2;
  }
  
  public final boolean hasStableIds() {
    return true;
  }
  
  public final void onCreate() {}
  
  public final void onDataSetChanged() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void onDestroy() {
    this.a = null;
    this.b = 0;
    WidgetService.b = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */