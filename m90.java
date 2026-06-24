import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.FolderExcluderActivity;
import in.krosbits.musicolet.IncludedFoldersActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;

public final class m90 extends id1 {
  public final int d;
  
  public final Object e;
  
  public final Object f;
  
  public m90(bt1 parambt1) {
    this.e = LayoutInflater.from(parambt1.b);
  }
  
  public m90(FolderExcluderActivity paramFolderExcluderActivity1, FolderExcluderActivity paramFolderExcluderActivity2) {
    this.e = LayoutInflater.from((Context)paramFolderExcluderActivity2);
  }
  
  public m90(IncludedFoldersActivity paramIncludedFoldersActivity1, IncludedFoldersActivity paramIncludedFoldersActivity2) {
    this.e = LayoutInflater.from((Context)paramIncludedFoldersActivity2);
  }
  
  public m90(l81 paraml81) {
    this.e = LayoutInflater.from(paraml81.P());
  }
  
  public m90(ly0 paramly0, pc parampc) {
    this.e = LayoutInflater.from((Context)parampc);
  }
  
  public m90(rq1 paramrq1, j41 paramj41) {
    this.e = paramrq1;
    this.f = paramj41;
  }
  
  public final int c() {
    int i = this.d;
    Object object = this.f;
    switch (i) {
      default:
        return ((bt1)object).B0.size() + 1;
      case 4:
        return ((rq1)this.e).j();
      case 3:
        return c81.g(((l81)object).P()).size() + l81.i1 + 2;
      case 2:
        return my0.c.size();
      case 1:
        return ((IncludedFoldersActivity)object).R.size();
      case 0:
        break;
    } 
    return ((FolderExcluderActivity)object).S.size();
  }
  
  public int f(int paramInt) {
    bt1 bt1;
    int i = this.d;
    byte b = 3;
    switch (i) {
      default:
        return super.f(paramInt);
      case 5:
        bt1 = (bt1)this.f;
        i = bt1.C0;
        if (paramInt < i) {
          paramInt = ((Integer)bt1.B0.get(paramInt)).intValue();
          if (paramInt == 0 || paramInt == 1)
            return 0; 
          b = 1;
        } else if (paramInt == i) {
          b = 2;
        } 
        return b;
      case 4:
        return ((rq1)this.e).n(paramInt);
      case 3:
        break;
    } 
    i = l81.i1;
    if (paramInt < i) {
      paramInt = 1;
    } else if (paramInt == i) {
      paramInt = b;
    } else if (paramInt == c() - 1) {
      paramInt = 4;
    } else {
      paramInt = 2;
    } 
    return paramInt;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    SmartImageView smartImageView;
    sq1 sq1;
    k81 k81;
    TextView textView;
    ph0 ph0;
    int j;
    bt1 bt1;
    rq1 rq1;
    int i = this.d;
    Object object = this.f;
    switch (i) {
      default:
        bt1 = (bt1)object;
        object = bt1.B0;
        j = f(paramInt);
        if (j != 2) {
          i = paramInt;
          if (paramInt > bt1.C0)
            i = paramInt - 1; 
          at1 at1 = (at1)paramhe1;
          smartImageView = at1.x;
          ImageView imageView = at1.y;
          SmartTextView smartTextView = at1.w;
          paramInt = ((Integer)object.get(i)).intValue();
          MusicActivity musicActivity = MusicActivity.R0;
          switch (paramInt) {
            default:
              paramInt = 0;
              break;
            case 6:
              paramInt = 2131231412;
              break;
            case 5:
              paramInt = 2131231370;
              break;
            case 4:
              paramInt = 2131231081;
              break;
            case 3:
              paramInt = 2131231076;
              break;
            case 2:
              paramInt = 2131231144;
              break;
            case 1:
              paramInt = 2131231189;
              break;
            case 0:
              paramInt = 2131231375;
              break;
          } 
          smartImageView.setImageResource(paramInt);
          String str = MusicActivity.o0(((Integer)object.get(i)).intValue());
          smartTextView.setText(str);
          smartImageView.setContentDescription(str);
          at1.b.setContentDescription(str);
          if (j != 0) {
            if (j != 1) {
              if (j == 3) {
                smartTextView.setTextTintIndex(6);
                smartTextView.setPaintFlags(smartTextView.getPaintFlags() | 0x10);
                imageView.setVisibility(0);
              } 
            } else {
              smartTextView.setTextTintIndex(5);
              smartTextView.setPaintFlags(smartTextView.getPaintFlags() & 0xFFFFFFEF);
              if (((Integer)object.get(i)).intValue() == 5) {
                imageView.setVisibility(4);
              } else {
                imageView.setVisibility(0);
              } 
            } 
          } else {
            smartTextView.setTextTintIndex(5);
            smartTextView.setPaintFlags(smartTextView.getPaintFlags() & 0xFFFFFFEF);
            imageView.setVisibility(4);
          } 
        } 
        return;
      case 4:
        sq1 = (sq1)smartImageView;
        object = sq1.x;
        rq1 = (rq1)this.e;
        object.setText(rq1.z(paramInt));
        object = rq1.G(paramInt);
        if (object != null) {
          object = MyApplication.v.f((Uri)object);
          ((ag1)object).d = true;
          object.a();
          ((ag1)object).c = true;
          object.k();
          object.f(sq1.w);
        } 
        return;
      case 3:
        i = f(paramInt);
        if (i == 3) {
          k81 = (k81)sq1;
        } else if (i != 4) {
          j81 j81 = (j81)k81;
          textView = j81.x;
          if (i == 1) {
            textView.setText(l81.f1[paramInt]);
            j81.w.setImageResource(l81.g1[paramInt]);
          } else {
            i = l81.i1;
            textView.setText(c81.g(((l81)object).P()).get(paramInt - 1 - i));
          } 
        } 
        return;
      case 2:
        ((ky0)textView).w.setText(ag0.W(my0.c.get(paramInt)));
        return;
      case 1:
        ph0 = (ph0)textView;
        object = ((IncludedFoldersActivity)object).R.get(paramInt);
        object = MyApplication.F.c((String)object);
        ph0.w.setText(ml0.a(((ml0)object).b));
        return;
      case 0:
        break;
    } 
    n90 n90 = (n90)ph0;
    object = ((FolderExcluderActivity)object).S.get(paramInt);
    object = MyApplication.F.c((String)object);
    n90.w.setText(ml0.a(((ml0)object).b));
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    he1 he12;
    View view1;
    he1 he11;
    j41 j41;
    View view2;
    TextView textView;
    int j = this.d;
    int i = 1;
    Object object2 = this.e;
    Object object1 = this.f;
    switch (j) {
      default:
        object1 = object1;
        if (paramInt == 2) {
          object2 = new TextView(((ms0)object1).b);
          he12 = new he1((View)object2);
          object1 = new StringBuilder("<u>");
          object1.append(object2.getContext().getString(2131887487));
          object1.append("</u> 👇");
          object2.setText((CharSequence)Html.fromHtml(object1.toString()));
          paramInt = (int)(object2.getContext().getResources().getDimension(2131165390) * 4.0F);
          i = paramInt * 4;
          object2.setPadding(i, paramInt, paramInt, i);
          object2.setLayoutParams((ViewGroup.LayoutParams)new sd1(-1, -2));
        } else {
          he12 = new at1((bt1)object1, ((LayoutInflater)object2).inflate(2131493066, (ViewGroup)he12, false));
        } 
        return he12;
      case 4:
        view1 = LayoutInflater.from(he12.getContext()).inflate(2131493010, (ViewGroup)he12, false);
        j41 = (j41)object1;
        object1 = m92.h;
        object2 = new he1(view1);
        ((sq1)object2).y = j41;
        ((sq1)object2).w = (ImageView)view1.findViewById(2131296913);
        textView = (TextView)view1.findViewById(2131297890);
        ((sq1)object2).x = textView;
        view2 = view1.findViewById(2131297929);
        j = paramInt % 2;
        if (j != 0)
          i = 0; 
        paramInt -= j;
        if (paramInt == 0) {
          FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)textView.getLayoutParams();
          layoutParams.gravity = 17;
          textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
          textView.setBackgroundColor(0);
        } else if (paramInt == 2) {
          FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)textView.getLayoutParams();
          layoutParams.gravity = 17;
          textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
          textView.setBackgroundColor(0);
        } 
        if (i != 0) {
          view2.setBackgroundColor(object1[3]);
          textView.setTextColor(object1[5]);
          textView.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
          view2.setBackgroundColor(object1[8]);
          textView.setTextColor(object1[6]);
          textView.setTypeface(Typeface.DEFAULT);
        } 
        view1.setOnClickListener((View.OnClickListener)object2);
        view1.setOnLongClickListener((View.OnLongClickListener)object2);
        return (he1)object2;
      case 3:
        object2 = object2;
        object1 = object1;
        if (paramInt == 1) {
          view1 = object2.inflate(2131493031, (ViewGroup)view1, false);
        } else {
          if (paramInt == 3) {
            object1 = new TextView(object1.P());
            he11 = new he1((View)object1);
            i = (int)(MyApplication.p * 8.0F);
            paramInt = i * 2;
            object1.setPadding(paramInt, paramInt, i, 0);
            object1.setTextColor(m92.h[4]);
            object1.setTextSize(2, 14.0F);
            object1.setTypeface(Typeface.DEFAULT_BOLD);
            object1.setText(2131887605);
          } else {
            View view;
            if (paramInt == 2) {
              view = object2.inflate(2131493031, (ViewGroup)he11, false);
            } else {
              return new i81((l81)object1, object2.inflate(2131493055, (ViewGroup)view, false));
            } 
            he11 = new j81((l81)object1, view);
          } 
          return he11;
        } 
        he11 = new j81((l81)object1, (View)he11);
      case 2:
        return new ky0((ly0)object1, ((LayoutInflater)object2).inflate(2131493062, (ViewGroup)he11, false));
      case 1:
        return new ph0((IncludedFoldersActivity)object1, ((LayoutInflater)object2).inflate(2131493062, (ViewGroup)he11, false));
      case 0:
        break;
    } 
    return new n90((FolderExcluderActivity)object1, ((LayoutInflater)object2).inflate(2131493062, (ViewGroup)he11, false));
  }
  
  public void k(he1 paramhe1) {
    switch (this.d) {
      default:
        return;
      case 4:
        break;
    } 
    ImageView imageView = ((sq1)paramhe1).w;
    if (imageView != null)
      MyApplication.v.a(imageView); 
  }
  
  public void l() {
    int i = c81.g(MyApplication.i.getApplicationContext()).size();
    TextView textView = ((l81)this.f).f0;
    if (i > 3) {
      textView.setVisibility(0);
      return;
    } 
    textView.setVisibility(8);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */