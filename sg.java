import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public final class sg extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final TextView x;
  
  public final ImageView y;
  
  public final tg z;
  
  public sg(tg paramtg, View paramView) {
    super(paramView);
    TextView textView2 = (TextView)paramView.findViewById(2131297888);
    this.w = textView2;
    TextView textView1 = (TextView)paramView.findViewById(2131297886);
    this.x = textView1;
    ImageView imageView = (ImageView)paramView.findViewById(2131296853);
    this.y = imageView;
    textView2.setOnClickListener(this);
    textView1.setOnClickListener(this);
    imageView.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    tg tg1 = this.z;
    ArrayList<yf> arrayList = tg1.c;
    if (paramView == this.w) {
      int i = c();
      try {
      
      } finally {
        paramView = null;
      } 
    } else {
      if (paramView == this.x) {
        int i = c();
        try {
          return;
        } finally {
          paramView = null;
          paramView.printStackTrace();
        } 
      } 
      if (paramView == this.y)
        int i = c(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */