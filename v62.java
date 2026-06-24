import android.view.WindowInsets;

public abstract class v62 {
  public static int a(int paramInt) {
    int j = 0;
    int i = 1;
    while (i <= 512) {
      int k = j;
      if ((paramInt & i) != 0)
        if (i != 1) {
          if (i != 2) {
            if (i != 4) {
              if (i != 8) {
                if (i != 16) {
                  if (i != 32) {
                    if (i != 64) {
                      if (i != 128) {
                        k = j;
                      } else {
                        k = WindowInsets.Type.displayCutout();
                        k = j | k;
                      } 
                    } else {
                      k = WindowInsets.Type.tappableElement();
                      k = j | k;
                    } 
                  } else {
                    k = WindowInsets.Type.mandatorySystemGestures();
                    k = j | k;
                  } 
                } else {
                  k = WindowInsets.Type.systemGestures();
                  k = j | k;
                } 
              } else {
                k = WindowInsets.Type.ime();
                k = j | k;
              } 
            } else {
              k = WindowInsets.Type.captionBar();
              k = j | k;
            } 
          } else {
            k = WindowInsets.Type.navigationBars();
            k = j | k;
          } 
        } else {
          k = WindowInsets.Type.statusBars();
          k = j | k;
        }  
      i <<= 1;
      j = k;
    } 
    return j;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */