import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

public final class xa1 {
  public final ArrayList a = new ArrayList();
  
  public final gs1 b;
  
  public fi0 c;
  
  public fi0 d;
  
  public int e;
  
  public boolean f;
  
  public xa1(gs1 paramgs1, ArrayList<xa1> paramArrayList) {
    fi0 fi01 = fi0.e;
    this.c = fi01;
    this.d = fi01;
    a(paramArrayList, false);
    a(paramArrayList, true);
    paramArrayList = paramgs1.b;
    if (!paramArrayList.contains(this)) {
      paramArrayList.add(this);
      fi0 fi02 = paramgs1.c;
      fi01 = paramgs1.d;
      this.c = fi02;
      this.d = fi01;
      c();
      b(paramgs1.e);
    } 
    this.b = paramgs1;
  }
  
  public final void a(List<hn> paramList, boolean paramBoolean) {
    int i = paramList.size();
    for (byte b = 0; b < i; b++) {
      hn hn = paramList.get(b);
      hn.getClass();
      if (true == paramBoolean) {
        xa1 xa11 = hn.e;
        if (xa11 == null) {
          hn.e = this;
          this.a.add(hn);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(hn);
          stringBuilder.append(" (");
          stringBuilder.append(b + 1);
          stringBuilder.append("/");
          stringBuilder.append(i);
          stringBuilder.append(") is already controlled by ");
          stringBuilder.append(xa11);
          stringBuilder.append(" but is still added to ");
          stringBuilder.append(this);
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
    } 
  }
  
  public final void b(int paramInt) {
    ArrayList<hn> arrayList = this.a;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      hn hn = arrayList.get(i);
      if (!hn.g) {
        ColorDrawable colorDrawable = hn.f;
        if (hn.h != paramInt) {
          hn.h = paramInt;
          colorDrawable.setColor(paramInt);
          wa1 wa1 = hn.b;
          wa1.e = colorDrawable;
          j01 j01 = wa1.i;
          if (j01 != null)
            ((View)j01.e).setBackground((Drawable)colorDrawable); 
        } 
      } 
    } 
  }
  
  public final void c() {
    ArrayList<hn> arrayList = this.a;
    int i = arrayList.size() - 1;
    fi0 fi01 = fi0.e;
    fi0 fi02 = fi01;
    while (i >= 0) {
      boolean bool;
      hn hn = arrayList.get(i);
      fi0 fi04 = this.c;
      fi0 fi03 = this.d;
      hn.c = fi04;
      wa1 wa1 = hn.b;
      hn.d = fi03;
      if (!wa1.c.equals(fi02)) {
        wa1.c = fi02;
        j01 j01 = wa1.i;
        if (j01 != null) {
          FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)j01.c;
          layoutParams.leftMargin = fi02.a;
          layoutParams.topMargin = fi02.b;
          layoutParams.rightMargin = fi02.c;
          layoutParams.bottomMargin = fi02.d;
          ((View)j01.e).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        } 
      } 
      int j = hn.a;
      byte b = 8;
      if (j != 1) {
        if (j != 2) {
          if (j != 4) {
            if (j != 8) {
              fi03 = fi01;
              j = 0;
            } else {
              j = hn.c.d;
              int k = hn.d.d;
              if (wa1.b != k) {
                wa1.b = k;
                j01 j01 = wa1.i;
                if (j01 != null) {
                  FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)j01.c;
                  layoutParams.height = k;
                  ((View)j01.e).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                } 
              } 
              fi03 = fi0.c(0, 0, 0, j);
            } 
          } else {
            j = hn.c.c;
            int k = hn.d.c;
            if (wa1.a != k) {
              wa1.a = k;
              j01 j01 = wa1.i;
              if (j01 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)j01.c;
                layoutParams.width = k;
                ((View)j01.e).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
              } 
            } 
            fi03 = fi0.c(0, 0, j, 0);
          } 
        } else {
          j = hn.c.b;
          int k = hn.d.b;
          if (wa1.b != k) {
            wa1.b = k;
            j01 j01 = wa1.i;
            if (j01 != null) {
              FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)j01.c;
              layoutParams.height = k;
              ((View)j01.e).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            } 
          } 
          fi03 = fi0.c(0, j, 0, 0);
        } 
      } else {
        j = hn.c.a;
        int k = hn.d.a;
        if (wa1.a != k) {
          wa1.a = k;
          j01 j01 = wa1.i;
          if (j01 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)j01.c;
            layoutParams.width = k;
            ((View)j01.e).setLayoutParams((ViewGroup.LayoutParams)layoutParams);
          } 
        } 
        fi03 = fi0.c(j, 0, 0, 0);
      } 
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (wa1.d != bool) {
        wa1.d = bool;
        j01 j01 = wa1.i;
        if (j01 != null) {
          View view = (View)j01.e;
          if (bool)
            b = 0; 
          view.setVisibility(b);
        } 
      } 
      float f2 = 0.0F;
      if (j > 0) {
        f1 = 1.0F;
      } else {
        f1 = 0.0F;
      } 
      hn.a(f1);
      float f1 = f2;
      if (j > 0)
        f1 = 1.0F; 
      hn.b(f1);
      fi02 = fi0.a(fi02, fi03);
      i--;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xa1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */