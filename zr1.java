import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.musicolet.LyricsEditActivity;
import java.util.ArrayList;

public final class zr1 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final int A;
  
  public final MaterialButton w;
  
  public final TextView x;
  
  public final SmartImageView y;
  
  public final m41 z;
  
  public zr1(View paramView, int paramInt, LyricsEditActivity paramLyricsEditActivity) {
    super(paramView);
    MaterialButton materialButton = (MaterialButton)paramView.findViewById(2131296416);
    this.w = materialButton;
    TextView textView = (TextView)paramView.findViewById(2131297782);
    this.x = textView;
    LinearLayout linearLayout = (LinearLayout)paramView.findViewById(2131296973);
    SmartImageView smartImageView = (SmartImageView)paramView.findViewById(2131296879);
    this.y = smartImageView;
    this.z = (m41)paramLyricsEditActivity;
    this.A = paramInt;
    materialButton.setOnClickListener(this);
    materialButton.setOnLongClickListener(this);
    textView.setOnLongClickListener(this);
    textView.setOnClickListener(this);
    smartImageView.setOnClickListener(this);
    if (paramInt == 0) {
      MaterialCardView materialCardView = (MaterialCardView)paramView;
      paramInt = arrayOfInt[8];
      materialCardView.setStrokeColor(jn.i(paramInt, (int)(Color.alpha(paramInt) * 0.7D)));
      linearLayout.setVisibility(8);
      paramView.setOnClickListener(this);
      paramView.setOnLongClickListener(this);
      return;
    } 
    if (paramInt == 3) {
      MaterialCardView materialCardView = (MaterialCardView)paramView;
      paramInt = arrayOfInt[7];
      materialCardView.setStrokeColor(jn.i(paramInt, (int)(Color.alpha(paramInt) * 0.7D)));
      materialButton.setTextColor(arrayOfInt[5]);
      materialButton.setIconTint(ColorStateList.valueOf(arrayOfInt[5]));
      textView.setTextColor(arrayOfInt[5]);
      smartImageView.setVisibility(0);
      paramInt = (int)(paramView.getContext().getResources().getDimension(2131165390) * 8.0F);
      textView.setPadding(paramInt, paramInt, 0, paramInt);
      return;
    } 
    if (paramInt == 1) {
      MaterialCardView materialCardView = (MaterialCardView)paramView;
      paramInt = arrayOfInt[8];
      materialCardView.setStrokeColor(jn.i(paramInt, (int)(Color.alpha(paramInt) * 0.7D)));
      materialButton.setText(null);
      materialButton.setIconPadding(0);
      materialButton.setTextColor(arrayOfInt[6]);
      materialButton.setIconTint(ColorStateList.valueOf(arrayOfInt[6]));
      textView.setTextColor(arrayOfInt[6]);
    } 
  }
  
  public final void onClick(View paramView) {
    ArrayList<xr1> arrayList;
    String str;
    View view = this.b;
    m41 m411 = this.z;
    if (paramView == view) {
      int i = c();
      ((LyricsEditActivity)m411).o0(i);
      return;
    } 
    if (paramView == this.w) {
      int i = c();
      LyricsEditActivity lyricsEditActivity = (LyricsEditActivity)m411;
      arrayList = lyricsEditActivity.k0;
      xr1 xr1 = arrayList.get(i);
      hc hc = lyricsEditActivity.m0;
      if (hc != null && lyricsEditActivity.n0) {
        int k = hc.A();
        int j = k;
        if (!lyricsEditActivity.o0) {
          k -= 250;
          j = k;
          if (k < 0)
            j = 0; 
        } 
        xr1.a = j;
        lyricsEditActivity.l0.h(i);
        label39: while (true) {
          k = i + 1;
          try {
            str = ((xr1)arrayList.get(k)).b;
            int m = str.length();
            j = 0;
            while (true) {
              i = k;
              if (j < m) {
                i = str.codePointAt(j);
                if (!Character.isWhitespace(i)) {
                  lyricsEditActivity.d0.k0(k);
                  return;
                } 
                i = Character.charCount(i);
                j += i;
                continue;
              } 
              continue label39;
            } 
          } finally {
            arrayList = null;
            arrayList.printStackTrace();
          } 
        } 
        return;
      } 
    } else {
      if (arrayList == this.x) {
        int i = c();
        ((LyricsEditActivity)str).o0(i);
        return;
      } 
      if (arrayList == this.y) {
        int i = c();
        LyricsEditActivity lyricsEditActivity = (LyricsEditActivity)str;
        xr1 xr1 = lyricsEditActivity.k0.get(i);
        if (lyricsEditActivity.m0 != null && lyricsEditActivity.n0)
          lyricsEditActivity.t0((int)xr1.a); 
      } 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    ((LyricsEditActivity)this.z).o0(i);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */