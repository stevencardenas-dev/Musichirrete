import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import in.krosbits.android.widgets.MSTextView;

public final class nm1 {
  public MSTextView a;
  
  public TextPaint b;
  
  public float c;
  
  public LinearGradient d;
  
  public Matrix e;
  
  public int f;
  
  public int g;
  
  public boolean h;
  
  public boolean i;
  
  public mm1 j;
  
  public final void a() {
    float f = -this.a.getWidth();
    int i = this.f;
    int k = i | 0xFF000000;
    int j = 0xFF000000 | this.g;
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    LinearGradient linearGradient = new LinearGradient(f, 0.0F, 0.0F, 0.0F, new int[] { i, k, j, j, j, j, j, k, i }, null, tileMode);
    this.d = linearGradient;
    this.b.setShader((Shader)linearGradient);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */