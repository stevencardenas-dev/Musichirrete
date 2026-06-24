import android.graphics.Bitmap;
import in.krosbits.utils.SgV.YbNJ;

public final class w61 implements cw1 {
  public final int a;
  
  public w61(int paramInt) {
    this.a = paramInt;
  }
  
  public final Bitmap a(Bitmap paramBitmap) {
    try {
      System.currentTimeMillis();
      int i = this.a;
      Bitmap bitmap = null;
      for (byte b = 0; b < 2; b++) {
        if (bitmap == null) {
          bitmap = wf2.g(paramBitmap, i);
        } else {
          bitmap = wf2.g(bitmap, i);
        } 
      } 
      System.currentTimeMillis();
      paramBitmap.recycle();
      return bitmap;
    } catch (Exception exception) {
      exception.printStackTrace();
      return paramBitmap;
    } 
  }
  
  public final String b() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(w61.class.getName());
    stringBuilder.append(YbNJ.TbHaAdJIIeisBlI);
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */