import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public abstract class i7 {
  public static boolean a(DragEvent paramDragEvent, TextView paramTextView, Activity paramActivity) {
    paramActivity.requestDragAndDropPermissions(paramDragEvent);
    int i = paramTextView.getOffsetForPosition(paramDragEvent.getX(), paramDragEvent.getY());
    paramTextView.beginBatchEdit();
    try {
      vr vr;
      Selection.setSelection((Spannable)paramTextView.getText(), i);
      ClipData clipData = paramDragEvent.getClipData();
      if (Build.VERSION.SDK_INT >= 31) {
        tr tr = new tr();
        this(clipData, 3);
      } else {
        vr = new vr();
        this();
        vr.b = clipData;
        vr.c = 3;
      } 
      v22.j((View)paramTextView, vr.build());
      return true;
    } finally {
      paramTextView.endBatchEdit();
    } 
  }
  
  public static boolean b(DragEvent paramDragEvent, View paramView, Activity paramActivity) {
    vr vr;
    paramActivity.requestDragAndDropPermissions(paramDragEvent);
    ClipData clipData = paramDragEvent.getClipData();
    if (Build.VERSION.SDK_INT >= 31) {
      tr tr = new tr(clipData, 3);
    } else {
      vr = new vr();
      vr.b = clipData;
      vr.c = 3;
    } 
    v22.j(paramView, vr.build());
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */