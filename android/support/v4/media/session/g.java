package android.support.v4.media.session;

import android.os.Bundle;
import java.util.ArrayList;

public final class g {
  public final ArrayList a = new ArrayList();
  
  public int b;
  
  public long c;
  
  public float d;
  
  public long e;
  
  public long f;
  
  public long g = -1L;
  
  public Bundle h;
  
  public final void a(int paramInt, String paramString1, String paramString2) {
    PlaybackStateCompat.CustomAction customAction = new PlaybackStateCompat.CustomAction(paramString1, paramString2, paramInt, null);
    this.a.add(customAction);
  }
  
  public final PlaybackStateCompat b() {
    int i = this.b;
    long l1 = this.c;
    float f = this.d;
    long l3 = this.e;
    long l2 = this.f;
    long l4 = this.g;
    Bundle bundle = this.h;
    return new PlaybackStateCompat(i, l1, 0L, f, l3, 0, null, l2, this.a, l4, bundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */