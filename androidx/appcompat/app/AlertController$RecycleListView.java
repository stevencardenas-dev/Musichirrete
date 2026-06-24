package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import nc1;

public class AlertController$RecycleListView extends ListView {
  public final int b;
  
  public final int c;
  
  public AlertController$RecycleListView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, nc1.t);
    this.c = typedArray.getDimensionPixelOffset(0, -1);
    this.b = typedArray.getDimensionPixelOffset(1, -1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\app\AlertController$RecycleListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */