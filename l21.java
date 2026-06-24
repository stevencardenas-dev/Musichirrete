import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;

public final class l21 implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public final boolean f;
  
  public final boolean g;
  
  public final boolean h;
  
  public final String i;
  
  public ss0 j;
  
  public SettingsActivity k;
  
  public final int[] l;
  
  public RecyclerView m;
  
  public l21(SettingsActivity paramSettingsActivity, String paramString1, int[] paramArrayOfint, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, int paramInt3) {
    this.k = paramSettingsActivity;
    this.l = paramArrayOfint;
    this.b = paramInt1;
    this.c = paramInt2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.h = paramBoolean3;
    this.i = paramString2;
    this.e = MyApplication.o().getInt(paramString2, paramInt3);
    this.m = new RecyclerView((Context)paramSettingsActivity);
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
    this.m.setLayoutParams(layoutParams);
    this.m.setLayoutManager((a)new LinearLayoutManager(1));
    this.m.setAdapter(new a3(11, this));
    ms0 ms0 = new ms0((Context)paramSettingsActivity);
    ms0.f = paramString1;
    ms0.f((View)this.m, false);
    ms0.W = this;
    ms0.Y = this;
    this.j = new ss0(ms0);
  }
  
  public static int a(int paramInt) {
    int i;
    for (i = 0; paramInt != 0; i = j) {
      int j = i;
      if ((paramInt & 0x1) == 1)
        j = i + 1; 
      paramInt >>>= 1;
    } 
    return i;
  }
  
  public static boolean b(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) != 0);
  }
  
  public static void c(View paramView, int paramInt1, int paramInt2) {
    if (b(paramInt1, paramInt2)) {
      paramView.setVisibility(0);
      return;
    } 
    paramView.setVisibility(8);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.j = null;
    this.m = null;
    this.k = null;
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    byte b = 0;
    while (true) {
      int[] arrayOfInt = this.l;
      if (b < arrayOfInt.length) {
        if (arrayOfInt[b] == this.e) {
          this.m.k0(b);
          return;
        } 
        b++;
        continue;
      } 
      break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */