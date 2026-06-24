import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParser;

public final class iq {
  public final float a = Float.NaN;
  
  public final float b = Float.NaN;
  
  public final float c = Float.NaN;
  
  public final float d = Float.NaN;
  
  public final int e = -1;
  
  public iq(Context paramContext, XmlResourceParser paramXmlResourceParser) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), fc1.k);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      int j = typedArray.getIndex(b);
      if (j == 0) {
        j = typedArray.getResourceId(j, this.e);
        this.e = j;
        String str = paramContext.getResources().getResourceTypeName(j);
        paramContext.getResources().getResourceName(j);
        if ("layout".equals(str))
          (new pq()).c((ConstraintLayout)LayoutInflater.from(paramContext).inflate(j, null)); 
      } else if (j == 1) {
        this.d = typedArray.getDimension(j, this.d);
      } else if (j == 2) {
        this.b = typedArray.getDimension(j, this.b);
      } else if (j == 3) {
        this.c = typedArray.getDimension(j, this.c);
      } else if (j == 4) {
        this.a = typedArray.getDimension(j, this.a);
      } else {
        Log.v("ConstraintLayoutStates", "Unknown tag");
      } 
    } 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */