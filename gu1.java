import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class gu1 implements ActionMode.Callback {
  public final ActionMode.Callback a;
  
  public final TextView b;
  
  public Class c;
  
  public Method d;
  
  public boolean e;
  
  public boolean f;
  
  public gu1(ActionMode.Callback paramCallback, TextView paramTextView) {
    this.a = paramCallback;
    this.b = paramTextView;
    this.f = false;
  }
  
  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem) {
    return this.a.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu) {
    return this.a.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public final void onDestroyActionMode(ActionMode paramActionMode) {
    this.a.onDestroyActionMode(paramActionMode);
  }
  
  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu) {
    TextView textView = this.b;
    Context context = textView.getContext();
    PackageManager packageManager = context.getPackageManager();
    boolean bool = this.f;
    Class<int> clazz = int.class;
    if (!bool) {
      this.f = true;
      try {
        Class<?> clazz1 = Class.forName("com.android.internal.view.menu.MenuBuilder");
        this.c = clazz1;
        this.d = clazz1.getDeclaredMethod("removeItemAt", new Class[] { clazz });
        this.e = true;
      } catch (ClassNotFoundException|NoSuchMethodException classNotFoundException) {
        this.c = null;
        this.d = null;
        this.e = false;
      } 
    } 
    try {
      Method method;
      if (this.e && this.c.isInstance(paramMenu)) {
        method = this.d;
      } else {
        method = paramMenu.getClass().getDeclaredMethod("removeItemAt", new Class[] { (Class)method });
      } 
      int i = paramMenu.size();
      i--;
      while (true) {
        MenuItem menuItem;
        String str = JkpGFvCVQHzgc.ziOTva;
        if (i >= 0) {
          menuItem = paramMenu.getItem(i);
          if (menuItem.getIntent() != null && str.equals(menuItem.getIntent().getAction()))
            method.invoke(paramMenu, new Object[] { Integer.valueOf(i) }); 
          i--;
          continue;
        } 
        ArrayList<MenuItem> arrayList = new ArrayList();
        if (context instanceof android.app.Activity)
          for (ResolveInfo resolveInfo : packageManager.queryIntentActivities((new Intent()).setAction(str).setType("text/plain"), 0)) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName))
              continue; 
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported)
              continue; 
            String str1 = activityInfo.permission;
            if (str1 == null || context.checkSelfPermission(str1) == 0)
              continue; 
            continue;
            arrayList.add(menuItem);
          }  
        for (i = 0; i < arrayList.size(); i++) {
          boolean bool1;
          ResolveInfo resolveInfo = (ResolveInfo)arrayList.get(i);
          MenuItem menuItem1 = paramMenu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager));
          Intent intent = (new Intent()).setAction(str).setType("text/plain");
          if (textView instanceof android.text.Editable && textView.onCheckIsTextEditor() && textView.isEnabled()) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          intent = intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", bool1 ^ true);
          ActivityInfo activityInfo = resolveInfo.activityInfo;
          menuItem1.setIntent(intent.setClassName(activityInfo.packageName, activityInfo.name)).setShowAsAction(1);
        } 
        return this.a.onPrepareActionMode(paramActionMode, paramMenu);
      } 
    } catch (NoSuchMethodException|IllegalAccessException|java.lang.reflect.InvocationTargetException noSuchMethodException) {}
    return this.a.onPrepareActionMode(paramActionMode, paramMenu);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */