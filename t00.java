import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class t00 extends eh implements DialogInterface.OnShowListener, View.OnClickListener {
  public TextView A0;
  
  public a52 B0;
  
  public ss0 C0;
  
  public final r00 D0 = new r00(this, 0);
  
  public final r00 E0 = new r00(this, 1);
  
  public ArrayList q0;
  
  public FlexboxLayout r0;
  
  public FlexboxLayout s0;
  
  public FlexboxLayout t0;
  
  public boolean u0;
  
  public final int v0;
  
  public final String w0;
  
  public final ArrayList x0;
  
  public Group y0;
  
  public TextView z0;
  
  public t00(int paramInt, String paramString, ArrayList paramArrayList) {
    this.v0 = paramInt;
    this.w0 = paramString;
    this.x0 = paramArrayList;
  }
  
  public static void I0(MaterialButton paramMaterialButton, boolean paramBoolean) {
    int[] arrayOfInt = m92.h;
    if (paramBoolean) {
      paramMaterialButton.setTextColor(arrayOfInt[6]);
      paramMaterialButton.setIconTint(ColorStateList.valueOf(arrayOfInt[7]));
    } else {
      paramMaterialButton.setTextColor(arrayOfInt[5]);
      paramMaterialButton.setIconTint(ColorStateList.valueOf(arrayOfInt[6]));
    } 
    paramMaterialButton.setGravity(16);
    paramMaterialButton.setIconSize((int)(MyApplication.p * 16.0F));
    paramMaterialButton.setMinimumWidth(0);
    paramMaterialButton.setIconPadding((int)(MyApplication.p * 12.0F));
    paramMaterialButton.setSupportAllCaps(false);
  }
  
  public final void D0() {
    try {
      this.u0 = true;
      super.D0();
    } finally {
      Exception exception;
    } 
  }
  
  public final Dialog F0(Bundle paramBundle) {
    Dialog dialog = super.F0(paramBundle);
    dialog.setOnShowListener(this);
    return dialog;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    s00 s00;
    Context context = paramLayoutInflater.getContext();
    if (context != null)
      m92.s(context.getTheme()); 
    View view = paramLayoutInflater.inflate(2131492986, paramViewGroup, false);
    this.y0 = (Group)view.findViewById(2131296776);
    this.r0 = (FlexboxLayout)view.findViewById(2131296747);
    this.s0 = (FlexboxLayout)view.findViewById(2131296745);
    this.t0 = (FlexboxLayout)view.findViewById(2131296746);
    this.z0 = (TextView)view.findViewById(2131297881);
    this.A0 = (TextView)view.findViewById(2131297859);
    TextView textView2 = this.z0;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(T(2131886580));
    stringBuilder1.append(":");
    textView2.setText(stringBuilder1.toString());
    TextView textView1 = this.A0;
    StringBuilder stringBuilder2 = new StringBuilder("⚠️ ");
    stringBuilder2.append(T(2131886581));
    stringBuilder2.append(":");
    textView1.setText(stringBuilder2.toString());
    textView1 = (TextView)view.findViewById(2131297867);
    String str = this.w0;
    if (str != null)
      textView1.setText(str); 
    this.A0.setOnClickListener(this);
    ArrayList<s00> arrayList2 = new ArrayList();
    ArrayList<s00> arrayList1 = new ArrayList();
    ArrayList<Object> arrayList = this.x0;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      s00 s001 = (s00)arrayList.get(b);
      b++;
      s001 = s001;
      if (s001.d == 1) {
        arrayList2.add(s001);
        continue;
      } 
      arrayList1.add(s001);
    } 
    boolean bool = arrayList2.isEmpty();
    r00 r001 = this.D0;
    if (!bool) {
      this.s0.removeAllViews();
      i = arrayList2.size();
      b = 0;
      while (b < i) {
        s00 s001 = (s00)arrayList2.get(b);
        b++;
        s001 = s001;
        MaterialButton materialButton = new MaterialButton(P(), null, 2130969549);
        materialButton.setText(s001.a());
        materialButton.setIconResource(s001.c);
        I0(materialButton, false);
        materialButton.setOnClickListener(r001);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intent.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)s001.b);
        intent.addFlags(3);
        intent.addFlags(64);
        materialButton.setTag(intent);
        this.s0.addView((View)materialButton);
      } 
      this.y0.setVisibility(0);
      this.z0.setVisibility(0);
    } else {
      this.y0.setVisibility(8);
      this.z0.setVisibility(8);
    } 
    this.q0 = MyApplication.F.m(false);
    this.r0.removeAllViews();
    arrayList2 = this.q0;
    i = arrayList2.size();
    b = 0;
    while (b < i) {
      xp1 xp1 = (xp1)arrayList2.get(b);
      b++;
      xp1 = xp1;
      MaterialButton materialButton = new MaterialButton(P(), null, 2130969549);
      materialButton.setText(xp1.c());
      materialButton.setIconResource(xp1.e());
      I0(materialButton, false);
      materialButton.setOnClickListener(r001);
      materialButton.setTag(xp1.a(false).addFlags(67));
      this.r0.addView((View)materialButton);
    } 
    bool = arrayList1.isEmpty();
    FlexboxLayout flexboxLayout = this.t0;
    if (!bool) {
      flexboxLayout.removeAllViews();
      i = arrayList1.size();
      b = 0;
      while (b < i) {
        flexboxLayout = (FlexboxLayout)arrayList1.get(b);
        b++;
        s00 = (s00)flexboxLayout;
        MaterialButton materialButton = new MaterialButton(P(), null, 2130969549);
        materialButton.setText(s00.a());
        int j = s00.c;
        if (j != -1)
          materialButton.setIconResource(j); 
        I0(materialButton, true);
        materialButton.setOnClickListener(this.E0);
        materialButton.setTag(s00);
        this.t0.addView((View)materialButton);
      } 
      this.t0.setVisibility(0);
      this.A0.setVisibility(0);
      return view;
    } 
    s00.setVisibility(8);
    this.A0.setVisibility(8);
    return view;
  }
  
  public final void o0() {
    super.o0();
    if (this.u0)
      try {
        lb0 lb0 = R();
        lb lb = new lb();
        this(lb0);
        lb.j(this);
        return;
      } finally {
        Exception exception = null;
      }  
  }
  
  public final void onClick(View paramView) {
    if (paramView == this.A0)
      this.C0 = n0.y(P(), new un(1, this), null); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    super.onDismiss(paramDialogInterface);
    a52 a521 = this.B0;
    if (a521 != null)
      try {
        a521.d0 = null;
      } finally {} 
    ss0 ss01 = this.C0;
    if (ss01 != null)
      ss01.dismiss(); 
    this.B0 = null;
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    try {
      return;
    } finally {
      paramDialogInterface = null;
      paramDialogInterface.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */