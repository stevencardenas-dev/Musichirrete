import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.Locale;

public final class jz implements View.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
  public static jz H;
  
  public final CheckBox A;
  
  public final SharedPreferences B;
  
  public long C;
  
  public final e3 D = new e3(7, this);
  
  public int E = 0;
  
  public final MusicActivity F;
  
  public boolean G = false;
  
  public int b;
  
  public final ss0 c;
  
  public final Handler e = new Handler();
  
  public final TextView f;
  
  public final TextView g;
  
  public final TextView h;
  
  public final TextView i;
  
  public final TextView j;
  
  public final TextView k;
  
  public final TextView l;
  
  public final View m;
  
  public final ViewGroup n;
  
  public final ViewGroup o;
  
  public final TextView p;
  
  public final EditText q;
  
  public final EditText r;
  
  public final EditText s;
  
  public final TextInputLayout t;
  
  public final TextInputLayout u;
  
  public final Button v;
  
  public final Button w;
  
  public final bh0 x;
  
  public final CheckBox y;
  
  public final CheckBox z;
  
  public jz(MusicActivity paramMusicActivity, long paramLong, int paramInt, bh0 parambh0) {
    this.F = paramMusicActivity;
    jz jz1 = H;
    if (jz1 != null)
      try {
        jz1.c.dismiss();
      } finally {} 
    H = this;
    this.B = MyApplication.o();
    ms0 ms0 = new ms0((Context)paramMusicActivity);
    this.x = parambh0;
    ms0.e(2131493020, false);
    View view = ms0.u;
    TextView textView1 = (TextView)view.findViewById(2131297889);
    this.f = textView1;
    this.g = (TextView)view.findViewById(2131297787);
    this.i = (TextView)view.findViewById(2131297095);
    this.h = (TextView)view.findViewById(2131297788);
    this.r = (EditText)view.findViewById(2131296710);
    EditText editText = (EditText)view.findViewById(2131296711);
    this.q = editText;
    this.t = (TextInputLayout)view.findViewById(2131297645);
    this.u = (TextInputLayout)view.findViewById(2131297646);
    CheckBox checkBox = (CheckBox)view.findViewById(2131296564);
    this.y = checkBox;
    this.A = (CheckBox)view.findViewById(2131296535);
    this.z = (CheckBox)view.findViewById(2131296534);
    this.j = (TextView)view.findViewById(2131297907);
    this.s = (EditText)view.findViewById(2131296715);
    this.l = (TextView)view.findViewById(2131297710);
    this.k = (TextView)view.findViewById(2131297709);
    this.m = view.findViewById(2131297922);
    this.n = (ViewGroup)view.findViewById(2131297031);
    this.o = (ViewGroup)view.findViewById(2131297032);
    TextView textView2 = (TextView)view.findViewById(2131297684);
    this.p = textView2;
    editText.addTextChangedListener(new vm(1, this));
    Button button = (Button)view.findViewById(2131296384);
    this.w = button;
    this.v = (Button)view.findViewById(2131296445);
    button.setOnClickListener(new ez(this, 1));
    textView2.setOnClickListener(new ql(1, paramMusicActivity));
    this.C = paramLong;
    this.b = paramInt;
    ms0.f(view, false);
    if (paramLong > 0L) {
      paramInt = (int)(paramLong - System.currentTimeMillis());
      if (paramInt >= 0)
        textView1.setText(ag0.B(paramInt, false, 0)); 
    } 
    checkBox.setOnCheckedChangeListener(new fz(0, this));
    ms0.X = this;
    ms0.W = this;
    ss0 ss01 = new ss0(ms0);
    this.c = ss01;
    ss01.getWindow().setSoftInputMode(16);
    c(0, 0, 0);
  }
  
  public static boolean f() {
    jz jz1 = H;
    if (jz1 != null) {
      ss0 ss01 = jz1.c;
      if (ss01 != null && ss01.isShowing()) {
        jz jz2 = H;
        MusicService musicService = MusicService.P0;
        jz2.b = musicService.h;
        jz2 = H;
        jz2.C = musicService.b;
        jz2.c(0, 0, 0);
        return true;
      } 
    } 
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    SharedPreferences sharedPreferences = this.B;
    ss0 ss01 = this.c;
    if (Build.VERSION.SDK_INT < 31 || MyApplication.c().canScheduleExactAlarms() || this.G)
      try {
        boolean bool2 = sharedPreferences.getBoolean("k_i_slptrh_gfls", false);
        boolean bool1 = sharedPreferences.getBoolean("k_i_slptrh_l", false);
        bh0 bh01 = this.x;
        long l2 = paramInt2;
        long l1 = paramInt1;
        MusicService musicService = ((MusicActivity)bh01.c).j0;
        if (musicService != null) {
          l1 = musicService.z0(l1 * 3600000L + l2 * 60000L + 1000L, bool1, bool2);
        } else {
          l1 = -1L;
        } 
        this.C = l1;
        ag0.a0(ss01.getContext(), ss01.getWindow());
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131887409));
        stringBuilder.append(" <b>");
        String str2 = "";
        if (paramInt1 > 0) {
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append(MyApplication.i.getApplicationContext().getResources().getQuantityString(2131755050, paramInt1, new Object[] { Integer.valueOf(paramInt1) }));
          if (paramInt2 > 0) {
            str1 = ", ";
          } else {
            str1 = "";
          } 
          stringBuilder1.append(str1);
          str1 = stringBuilder1.toString();
        } else {
          str1 = "";
        } 
        stringBuilder.append(str1);
        String str1 = str2;
        if (paramInt2 > 0)
          str1 = MyApplication.i.getApplicationContext().getResources().getQuantityString(2131755052, paramInt2, new Object[] { Integer.valueOf(paramInt2) }); 
        stringBuilder.append(str1);
        stringBuilder.append("</b>");
        return;
      } finally {
        sharedPreferences = null;
        sharedPreferences.printStackTrace();
      }  
    e();
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 31 && !MyApplication.c().canScheduleExactAlarms() && !this.G) {
      e();
      return;
    } 
    this.E = 1;
    c(paramInt1, paramInt2, 0);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3) {
    Resources resources;
    int[] arrayOfInt1;
    TextView textView1;
    StringBuilder stringBuilder;
    int[] arrayOfInt2;
    EditText editText1;
    TextView textView9 = this.k;
    textView9.setVisibility(8);
    View view = this.m;
    view.setVisibility(8);
    ViewGroup viewGroup2 = this.n;
    viewGroup2.setVisibility(8);
    ViewGroup viewGroup1 = this.o;
    viewGroup1.setVisibility(8);
    TextView textView7 = this.p;
    textView7.setVisibility(8);
    TextView textView8 = this.l;
    textView8.setVisibility(8);
    TextView textView2 = this.i;
    textView2.setVisibility(8);
    TextView textView4 = this.g;
    textView4.setVisibility(8);
    TextView textView3 = this.h;
    textView3.setVisibility(8);
    TextInputLayout textInputLayout1 = this.t;
    textInputLayout1.setVisibility(8);
    TextInputLayout textInputLayout2 = this.u;
    textInputLayout2.setVisibility(8);
    TextView textView6 = this.f;
    textView6.setVisibility(8);
    Button button2 = this.w;
    button2.setVisibility(8);
    Button button1 = this.v;
    button1.setVisibility(8);
    CheckBox checkBox2 = this.y;
    checkBox2.setVisibility(8);
    CheckBox checkBox1 = this.z;
    checkBox1.setVisibility(8);
    CheckBox checkBox3 = this.A;
    checkBox3.setVisibility(8);
    TextView textView5 = this.j;
    textView5.setVisibility(8);
    EditText editText2 = this.s;
    editText2.setVisibility(8);
    int i = this.C cmp 0L;
    if (i < 0 && this.b <= 0 && this.E == 0 && MusicService.P0.i == null) {
      textView9.setVisibility(0);
      view.setVisibility(0);
      viewGroup2.setVisibility(0);
      viewGroup1.setVisibility(0);
      textView7.setVisibility(0);
      textView8.setVisibility(0);
      textView9.setOnClickListener(this);
      textView8.setOnClickListener(this);
      paramInt2 = viewGroup2.getChildCount() - 1;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        View view1 = viewGroup2.getChildAt(paramInt1);
        if (view1 instanceof TextView) {
          textView1 = (TextView)view1;
          arrayOfInt2 = dn1.a(paramInt1);
          stringBuilder = new StringBuilder();
          stringBuilder.append(arrayOfInt2[0]);
          stringBuilder.append(":");
          stringBuilder.append(String.format(Locale.ENGLISH, "%02d", new Object[] { Integer.valueOf(arrayOfInt2[1]) }));
          stringBuilder.append(":00");
          textView1.setText(stringBuilder.toString());
          textView1.setOnClickListener(new ag(2, this, arrayOfInt2));
          textView1.setOnLongClickListener(new gz(this, arrayOfInt2));
        } 
      } 
      viewGroup2.getChildAt(paramInt2).setOnClickListener(new ez(this, 3));
      paramInt2 = viewGroup1.getChildCount() - 1;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        View view1 = viewGroup1.getChildAt(paramInt1);
        if (view1 instanceof TextView) {
          textView1 = (TextView)view1;
          paramInt3 = dn1.b(paramInt1);
          stringBuilder = new StringBuilder("N = ");
          stringBuilder.append(paramInt3);
          textView1.setText(stringBuilder.toString());
          textView1.setOnClickListener(new hz(this, paramInt3));
          textView1.setOnLongClickListener(new iz(this, paramInt3));
        } 
      } 
      viewGroup1.getChildAt(paramInt2).setOnClickListener(new ez(this, 4));
      return;
    } 
    e3 e31 = this.D;
    Handler handler = this.e;
    if (i >= 0) {
      this.E = 0;
      textView2.setVisibility(0);
      textView2.setText(2131887409);
      textView6.setVisibility(0);
      handler.postDelayed(e31, 1000L);
      stringBuilder.setVisibility(0);
      stringBuilder.setText(2131887030);
      textView1.setVisibility(0);
      textView1.setText(2131887194);
      textView1.setOnClickListener(new ez(this, 5));
      return;
    } 
    i = this.b;
    ss0 ss01 = this.c;
    if (i > 0) {
      this.E = 0;
      textView2.setVisibility(0);
      if (this.b == 1) {
        textView2.setText(2131887592);
      } else {
        resources = ss01.getContext().getResources();
        paramInt1 = this.b;
        textView2.setText(resources.getQuantityString(2131755037, paramInt1, new Object[] { Integer.valueOf(paramInt1) }));
      } 
      stringBuilder.setVisibility(0);
      stringBuilder.setText(2131887030);
      textView1.setVisibility(0);
      textView1.setText(2131887194);
      textView1.setOnClickListener(new ez(this, 6));
      return;
    } 
    i = this.E;
    SharedPreferences sharedPreferences = this.B;
    if (i == 1) {
      this.E = 0;
      textView2.setVisibility(0);
      textView2.setText(2131887451);
      handler.removeCallbacks(e31);
      editText2 = this.r;
      editText2.setText("");
      editText1 = this.q;
      editText1.setText("");
      textInputLayout1.setVisibility(0);
      textInputLayout2.setVisibility(0);
      textView4.setVisibility(0);
      textView3.setVisibility(0);
      editText2.requestFocus();
      checkBox2.setVisibility(0);
      arrayOfInt2.setVisibility(0);
      ag0.I0(resources.getContext(), resources.getWindow());
      boolean bool = sharedPreferences.getBoolean("k_i_slptrh_l", false);
      if (paramInt1 > 0 || paramInt2 > 0) {
        arrayOfInt1 = new int[2];
        arrayOfInt1[0] = Math.max(0, paramInt1);
        arrayOfInt1[1] = Math.max(0, paramInt2);
      } else {
        arrayOfInt1 = dn1.a(0);
      } 
      if (arrayOfInt1[1] > 59)
        arrayOfInt1[1] = 59; 
      paramInt1 = arrayOfInt1[0];
      if (paramInt1 > 0)
        editText2.setText(String.valueOf(paramInt1)); 
      paramInt1 = arrayOfInt1[1];
      if (paramInt1 > 0)
        editText1.setText(String.valueOf(paramInt1)); 
      checkBox2.setChecked(bool);
      arrayOfInt2.setChecked(sharedPreferences.getBoolean("k_i_slptrh_gfls", false));
      if (editText2.getText().length() > 0) {
        editText2.requestFocus();
        editText2.selectAll();
      } else if (editText1.getText().length() > 0) {
        editText1.requestFocus();
        editText1.selectAll();
      } 
      stringBuilder.setVisibility(0);
      stringBuilder.setText(2131886231);
      textView1.setVisibility(0);
      textView1.setText(2131887353);
      textView1.setOnClickListener(new ez(this, 7));
      return;
    } 
    if (i == 2) {
      this.E = 0;
      editText1.setVisibility(0);
      textView5.setVisibility(0);
      editText2.setVisibility(0);
      checkBox3.setVisibility(0);
      stringBuilder.setVisibility(0);
      stringBuilder.setText(2131886231);
      textView1.setVisibility(0);
      editText1.setText(2131887452);
      if (paramInt3 > 0) {
        paramInt1 = paramInt3;
      } else {
        paramInt1 = dn1.b(0);
      } 
      paramInt2 = paramInt1;
      if (paramInt1 > 99)
        paramInt2 = 99; 
      if (paramInt2 > 0)
        editText2.setText(String.valueOf(paramInt2)); 
      checkBox3.setChecked(sharedPreferences.getBoolean("k_i_slptrh_gfls", false));
      editText2.requestFocus();
      ag0.I0(arrayOfInt1.getContext(), arrayOfInt1.getWindow());
      if (editText2.getText().length() > 0)
        editText2.selectAll(); 
      textView1.setText(2131887353);
      textView1.setOnClickListener(new ez(this, 0));
      return;
    } 
    if (MusicService.P0.i != null) {
      this.E = 0;
      editText1.setVisibility(0);
      StringBuilder stringBuilder1 = new StringBuilder("<b>");
      stringBuilder1.append(MyApplication.y(2131887593));
      stringBuilder1.append("</b><br/>");
      stringBuilder1.append(ag0.W(MusicService.P0.i));
      editText1.setText((CharSequence)Html.fromHtml(stringBuilder1.toString()));
      stringBuilder.setVisibility(0);
      stringBuilder.setText(2131887030);
      textView1.setVisibility(0);
      textView1.setText(2131887194);
      textView1.setOnClickListener(new ez(this, 2));
    } 
  }
  
  public final void d(int paramInt) {
    ss0 ss01 = this.c;
    try {
      SharedPreferences sharedPreferences = this.B;
      int i = 0;
      boolean bool = sharedPreferences.getBoolean("k_i_slptrh_gfls", false);
      MusicService musicService = ((MusicActivity)this.x.c).j0;
      if (musicService != null)
        i = musicService.A0(paramInt, bool); 
      this.b = i;
      ag0.a0(ss01.getContext(), ss01.getWindow());
      return;
    } finally {
      ss01 = null;
      ss01.printStackTrace();
    } 
  }
  
  public final void e() {
    try {
      MusicActivity musicActivity = this.F;
      Intent intent = new Intent();
      StringBuilder stringBuilder = new StringBuilder();
      this("package:");
      return;
    } finally {
      Exception exception = null;
      this.G = true;
      exception.printStackTrace();
    } 
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    H = null;
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297709) {
      b(0, 0);
      return;
    } 
    if (i == 2131297710) {
      this.E = 2;
      c(0, 0, 0);
    } 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    H = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */