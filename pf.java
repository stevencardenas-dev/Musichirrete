import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class pf {
  public int a;
  
  public int b = -1;
  
  public Serializable c = new ArrayList();
  
  public pf(Context paramContext, XmlResourceParser paramXmlResourceParser) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), fc1.i);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      int j = typedArray.getIndex(b);
      if (j == 0) {
        this.a = typedArray.getResourceId(j, this.a);
      } else if (j == 1) {
        j = typedArray.getResourceId(j, this.b);
        this.b = j;
        String str = paramContext.getResources().getResourceTypeName(j);
        paramContext.getResources().getResourceName(j);
        if ("layout".equals(str))
          (new pq()).c((ConstraintLayout)LayoutInflater.from(paramContext).inflate(j, null)); 
      } 
    } 
    typedArray.recycle();
  }
  
  public qf a() {
    Object object = new Object();
    ((qf)object).a = this.a;
    ((qf)object).b = this.b;
    ((qf)object).c = (String)this.c;
    return (qf)object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */