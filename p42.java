import android.widget.ImageButton;

public abstract class p42 extends ImageButton {
  public int b;
  
  public final void a(int paramInt, boolean paramBoolean) {
    super.setVisibility(paramInt);
    if (paramBoolean)
      this.b = paramInt; 
  }
  
  public final int getUserSetVisibility() {
    return this.b;
  }
  
  public void setVisibility(int paramInt) {
    a(paramInt, true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */