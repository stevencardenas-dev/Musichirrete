import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class pt {
  public final String a = pt.class.getSimpleName();
  
  public final z3 b;
  
  public final EditText c;
  
  public final int d;
  
  public final int e;
  
  public bh0 f;
  
  public pt(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d = paramInt2;
    this.e = paramInt3;
    mi2 mi2 = new mi2(paramContext, paramInt1);
    v3 v3 = (v3)mi2.e;
    View view = LayoutInflater.from((Context)v3.a).inflate(2131493214, null);
    v3.q = view;
    this.b = mi2.c();
    TextView textView1 = (TextView)view.findViewById(2131297145);
    TextView textView2 = (TextView)view.findViewById(2131297077);
    this.c = (EditText)view.findViewById(2131296623);
    textView1.setText(String.valueOf(paramInt2));
    textView2.setText(String.valueOf(paramInt3));
    this.c.setHint(String.valueOf(paramInt4));
    LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296654);
    TypedArray typedArray = v3.a.obtainStyledAttributes((new TypedValue()).data, new int[] { 2130968892 });
    paramInt1 = typedArray.getColor(0, 0);
    typedArray.recycle();
    linearLayout.setBackgroundColor(paramInt1);
    Button button2 = (Button)view.findViewById(2131296480);
    Button button1 = (Button)view.findViewById(2131296481);
    button2.setOnClickListener(new ot(this, 0));
    button1.setOnClickListener(new ot(this, 1));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */