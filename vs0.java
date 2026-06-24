import com.google.android.material.button.MaterialButton;

public final class vs0 extends qv {
  public final int i;
  
  public vs0(int paramInt) {
    this.i = paramInt;
  }
  
  public final float A(Object paramObject) {
    paramObject = ((ws0)paramObject).E;
    return (paramObject != null) ? paramObject[this.i] : 0.0F;
  }
  
  public final void Z(Object paramObject, float paramFloat) {
    paramObject = paramObject;
    float[] arrayOfFloat = ((ws0)paramObject).E;
    if (arrayOfFloat != null) {
      int i = this.i;
      if (arrayOfFloat[i] != paramFloat) {
        arrayOfFloat[i] = paramFloat;
        f f = ((ws0)paramObject).G;
        if (f != null) {
          paramFloat = paramObject.g();
          MaterialButton materialButton = (MaterialButton)f.c;
          i = (int)(paramFloat * 0.11F);
          if (materialButton.z != i) {
            materialButton.z = i;
            materialButton.j();
            materialButton.invalidate();
          } 
        } 
        paramObject.invalidateSelf();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */