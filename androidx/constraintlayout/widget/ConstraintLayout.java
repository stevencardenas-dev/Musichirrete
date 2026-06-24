package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import bf0;
import eq;
import er;
import fc1;
import fq;
import fr;
import g7;
import gq;
import hq;
import iq;
import ir;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import km1;
import ln0;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.xmlpull.v1.XmlPullParserException;
import pf;
import pq;

public class ConstraintLayout extends ViewGroup {
  public static km1 r;
  
  public final SparseArray b = new SparseArray();
  
  public final ArrayList c = new ArrayList(4);
  
  public final fr e = new fr();
  
  public int f = 0;
  
  public int g = 0;
  
  public int h = Integer.MAX_VALUE;
  
  public int i = Integer.MAX_VALUE;
  
  public boolean j = true;
  
  public int k = 257;
  
  public pq l = null;
  
  public g7 m = null;
  
  public int n = -1;
  
  public HashMap o = new HashMap<Object, Object>();
  
  public final SparseArray p = new SparseArray();
  
  public final hq q = new hq(this, this);
  
  public ConstraintLayout(Context paramContext) {
    super(paramContext);
    h(null, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    h(paramAttributeSet, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    h(paramAttributeSet, paramInt, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    h(paramAttributeSet, paramInt1, paramInt2);
  }
  
  private int getPaddingWidth() {
    int j = Math.max(0, getPaddingLeft());
    int i = Math.max(0, getPaddingRight());
    int k = Math.max(0, getPaddingStart());
    k = Math.max(0, getPaddingEnd()) + k;
    return (k > 0) ? k : (i + j);
  }
  
  public static km1 getSharedValues() {
    if (r == null) {
      Object object = new Object();
      new SparseIntArray();
      new HashMap<Object, Object>();
      r = (km1)object;
    } 
    return r;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof gq;
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {
    ArrayList<eq> arrayList = this.c;
    if (arrayList != null) {
      int i = arrayList.size();
      if (i > 0)
        for (byte b = 0; b < i; b++)
          ((eq)arrayList.get(b)).getClass();  
    } 
    super.dispatchDraw(paramCanvas);
    if (isInEditMode()) {
      float f1 = getWidth();
      float f2 = getHeight();
      int i = getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = getChildAt(b);
        if (view.getVisibility() != 8) {
          Object object = view.getTag();
          if (object != null && object instanceof String) {
            object = ((String)object).split(",");
            if (object.length == 4) {
              int j = Integer.parseInt((String)object[0]);
              int n = Integer.parseInt((String)object[1]);
              int m = Integer.parseInt((String)object[2]);
              int k = Integer.parseInt((String)object[3]);
              j = (int)(j / 1080.0F * f1);
              n = (int)(n / 1920.0F * f2);
              m = (int)(m / 1080.0F * f1);
              k = (int)(k / 1920.0F * f2);
              object = new Paint();
              object.setColor(-65536);
              float f4 = j;
              float f3 = n;
              float f6 = (j + m);
              paramCanvas.drawLine(f4, f3, f6, f3, (Paint)object);
              float f5 = (n + k);
              paramCanvas.drawLine(f6, f3, f6, f5, (Paint)object);
              paramCanvas.drawLine(f6, f5, f4, f5, (Paint)object);
              paramCanvas.drawLine(f4, f5, f4, f3, (Paint)object);
              object.setColor(-16711936);
              paramCanvas.drawLine(f4, f3, f6, f5, (Paint)object);
              paramCanvas.drawLine(f4, f5, f6, f3, (Paint)object);
            } 
          } 
        } 
      } 
    } 
  }
  
  public final void forceLayout() {
    this.j = true;
    super.forceLayout();
  }
  
  public final er g(View paramView) {
    if (paramView == this)
      return (er)this.e; 
    if (paramView != null) {
      if (paramView.getLayoutParams() instanceof gq)
        return ((gq)paramView.getLayoutParams()).q0; 
      paramView.setLayoutParams(generateLayoutParams(paramView.getLayoutParams()));
      if (paramView.getLayoutParams() instanceof gq)
        return ((gq)paramView.getLayoutParams()).q0; 
    } 
    return null;
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new gq(-2);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    Context context = getContext();
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, paramAttributeSet);
    ((gq)marginLayoutParams).a = -1;
    ((gq)marginLayoutParams).b = -1;
    ((gq)marginLayoutParams).c = -1.0F;
    ((gq)marginLayoutParams).d = true;
    ((gq)marginLayoutParams).e = -1;
    ((gq)marginLayoutParams).f = -1;
    ((gq)marginLayoutParams).g = -1;
    ((gq)marginLayoutParams).h = -1;
    ((gq)marginLayoutParams).i = -1;
    ((gq)marginLayoutParams).j = -1;
    ((gq)marginLayoutParams).k = -1;
    ((gq)marginLayoutParams).l = -1;
    ((gq)marginLayoutParams).m = -1;
    ((gq)marginLayoutParams).n = -1;
    ((gq)marginLayoutParams).o = -1;
    ((gq)marginLayoutParams).p = -1;
    ((gq)marginLayoutParams).q = 0;
    ((gq)marginLayoutParams).r = 0.0F;
    ((gq)marginLayoutParams).s = -1;
    ((gq)marginLayoutParams).t = -1;
    ((gq)marginLayoutParams).u = -1;
    ((gq)marginLayoutParams).v = -1;
    ((gq)marginLayoutParams).w = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).x = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).y = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).z = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).A = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).B = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).C = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).D = 0;
    ((gq)marginLayoutParams).E = 0.5F;
    ((gq)marginLayoutParams).F = 0.5F;
    ((gq)marginLayoutParams).G = null;
    ((gq)marginLayoutParams).H = -1.0F;
    ((gq)marginLayoutParams).I = -1.0F;
    ((gq)marginLayoutParams).J = 0;
    ((gq)marginLayoutParams).K = 0;
    ((gq)marginLayoutParams).L = 0;
    ((gq)marginLayoutParams).M = 0;
    ((gq)marginLayoutParams).N = 0;
    ((gq)marginLayoutParams).O = 0;
    ((gq)marginLayoutParams).P = 0;
    ((gq)marginLayoutParams).Q = 0;
    ((gq)marginLayoutParams).R = 1.0F;
    ((gq)marginLayoutParams).S = 1.0F;
    ((gq)marginLayoutParams).T = -1;
    ((gq)marginLayoutParams).U = -1;
    ((gq)marginLayoutParams).V = -1;
    ((gq)marginLayoutParams).W = false;
    ((gq)marginLayoutParams).X = false;
    ((gq)marginLayoutParams).Y = null;
    ((gq)marginLayoutParams).Z = 0;
    ((gq)marginLayoutParams).a0 = true;
    ((gq)marginLayoutParams).b0 = true;
    ((gq)marginLayoutParams).c0 = false;
    ((gq)marginLayoutParams).d0 = false;
    ((gq)marginLayoutParams).e0 = false;
    ((gq)marginLayoutParams).f0 = false;
    ((gq)marginLayoutParams).g0 = -1;
    ((gq)marginLayoutParams).h0 = -1;
    ((gq)marginLayoutParams).i0 = -1;
    ((gq)marginLayoutParams).j0 = -1;
    ((gq)marginLayoutParams).k0 = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).l0 = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).m0 = 0.5F;
    ((gq)marginLayoutParams).q0 = new er();
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, fc1.b);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      float f;
      int j = typedArray.getIndex(b);
      int k = fq.a.get(j);
      switch (k) {
        default:
          switch (k) {
            default:
              switch (k) {
                default:
                  break;
                case 67:
                  ((gq)marginLayoutParams).d = typedArray.getBoolean(j, ((gq)marginLayoutParams).d);
                  break;
                case 66:
                  ((gq)marginLayoutParams).Z = typedArray.getInt(j, ((gq)marginLayoutParams).Z);
                  break;
                case 65:
                  pq.j(marginLayoutParams, typedArray, j, 1);
                  break;
                case 64:
                  break;
              } 
              pq.j(marginLayoutParams, typedArray, j, 0);
              break;
            case 55:
              ((gq)marginLayoutParams).C = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).C);
              break;
            case 54:
              ((gq)marginLayoutParams).D = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).D);
              break;
            case 53:
              k = typedArray.getResourceId(j, ((gq)marginLayoutParams).o);
              ((gq)marginLayoutParams).o = k;
              if (k == -1)
                ((gq)marginLayoutParams).o = typedArray.getInt(j, -1); 
              break;
            case 52:
              k = typedArray.getResourceId(j, ((gq)marginLayoutParams).n);
              ((gq)marginLayoutParams).n = k;
              if (k == -1)
                ((gq)marginLayoutParams).n = typedArray.getInt(j, -1); 
              break;
            case 51:
              ((gq)marginLayoutParams).Y = typedArray.getString(j);
              break;
            case 50:
              ((gq)marginLayoutParams).U = typedArray.getDimensionPixelOffset(j, ((gq)marginLayoutParams).U);
              break;
            case 49:
              ((gq)marginLayoutParams).T = typedArray.getDimensionPixelOffset(j, ((gq)marginLayoutParams).T);
              break;
            case 48:
              ((gq)marginLayoutParams).K = typedArray.getInt(j, 0);
              break;
            case 47:
              ((gq)marginLayoutParams).J = typedArray.getInt(j, 0);
              break;
            case 46:
              ((gq)marginLayoutParams).I = typedArray.getFloat(j, ((gq)marginLayoutParams).I);
              break;
            case 45:
              ((gq)marginLayoutParams).H = typedArray.getFloat(j, ((gq)marginLayoutParams).H);
              break;
            case 44:
              break;
          } 
          pq.k((gq)marginLayoutParams, typedArray.getString(j));
          break;
        case 38:
          ((gq)marginLayoutParams).S = Math.max(0.0F, typedArray.getFloat(j, ((gq)marginLayoutParams).S));
          ((gq)marginLayoutParams).M = 2;
          break;
        case 37:
          try {
            ((gq)marginLayoutParams).Q = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).Q);
          } catch (Exception exception) {
            if (typedArray.getInt(j, ((gq)marginLayoutParams).Q) == -2)
              ((gq)marginLayoutParams).Q = -2; 
          } 
          break;
        case 36:
          try {
            ((gq)marginLayoutParams).O = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).O);
          } catch (Exception exception) {
            if (typedArray.getInt(j, ((gq)marginLayoutParams).O) == -2)
              ((gq)marginLayoutParams).O = -2; 
          } 
          break;
        case 35:
          ((gq)marginLayoutParams).R = Math.max(0.0F, typedArray.getFloat(j, ((gq)marginLayoutParams).R));
          ((gq)marginLayoutParams).L = 2;
          break;
        case 34:
          try {
            ((gq)marginLayoutParams).P = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).P);
          } catch (Exception exception) {
            if (typedArray.getInt(j, ((gq)marginLayoutParams).P) == -2)
              ((gq)marginLayoutParams).P = -2; 
          } 
          break;
        case 33:
          try {
            ((gq)marginLayoutParams).N = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).N);
          } catch (Exception exception) {
            if (typedArray.getInt(j, ((gq)marginLayoutParams).N) == -2)
              ((gq)marginLayoutParams).N = -2; 
          } 
          break;
        case 32:
          j = typedArray.getInt(j, 0);
          ((gq)marginLayoutParams).M = j;
          if (j == 1)
            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."); 
          break;
        case 31:
          j = typedArray.getInt(j, 0);
          ((gq)marginLayoutParams).L = j;
          if (j == 1)
            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."); 
          break;
        case 30:
          ((gq)marginLayoutParams).F = typedArray.getFloat(j, ((gq)marginLayoutParams).F);
          break;
        case 29:
          ((gq)marginLayoutParams).E = typedArray.getFloat(j, ((gq)marginLayoutParams).E);
          break;
        case 28:
          ((gq)marginLayoutParams).X = typedArray.getBoolean(j, ((gq)marginLayoutParams).X);
          break;
        case 27:
          ((gq)marginLayoutParams).W = typedArray.getBoolean(j, ((gq)marginLayoutParams).W);
          break;
        case 26:
          ((gq)marginLayoutParams).B = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).B);
          break;
        case 25:
          ((gq)marginLayoutParams).A = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).A);
          break;
        case 24:
          ((gq)marginLayoutParams).z = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).z);
          break;
        case 23:
          ((gq)marginLayoutParams).y = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).y);
          break;
        case 22:
          ((gq)marginLayoutParams).x = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).x);
          break;
        case 21:
          ((gq)marginLayoutParams).w = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).w);
          break;
        case 20:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).v);
          ((gq)marginLayoutParams).v = k;
          if (k == -1)
            ((gq)marginLayoutParams).v = typedArray.getInt(j, -1); 
          break;
        case 19:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).u);
          ((gq)marginLayoutParams).u = k;
          if (k == -1)
            ((gq)marginLayoutParams).u = typedArray.getInt(j, -1); 
          break;
        case 18:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).t);
          ((gq)marginLayoutParams).t = k;
          if (k == -1)
            ((gq)marginLayoutParams).t = typedArray.getInt(j, -1); 
          break;
        case 17:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).s);
          ((gq)marginLayoutParams).s = k;
          if (k == -1)
            ((gq)marginLayoutParams).s = typedArray.getInt(j, -1); 
          break;
        case 16:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).m);
          ((gq)marginLayoutParams).m = k;
          if (k == -1)
            ((gq)marginLayoutParams).m = typedArray.getInt(j, -1); 
          break;
        case 15:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).l);
          ((gq)marginLayoutParams).l = k;
          if (k == -1)
            ((gq)marginLayoutParams).l = typedArray.getInt(j, -1); 
          break;
        case 14:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).k);
          ((gq)marginLayoutParams).k = k;
          if (k == -1)
            ((gq)marginLayoutParams).k = typedArray.getInt(j, -1); 
          break;
        case 13:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).j);
          ((gq)marginLayoutParams).j = k;
          if (k == -1)
            ((gq)marginLayoutParams).j = typedArray.getInt(j, -1); 
          break;
        case 12:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).i);
          ((gq)marginLayoutParams).i = k;
          if (k == -1)
            ((gq)marginLayoutParams).i = typedArray.getInt(j, -1); 
          break;
        case 11:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).h);
          ((gq)marginLayoutParams).h = k;
          if (k == -1)
            ((gq)marginLayoutParams).h = typedArray.getInt(j, -1); 
          break;
        case 10:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).g);
          ((gq)marginLayoutParams).g = k;
          if (k == -1)
            ((gq)marginLayoutParams).g = typedArray.getInt(j, -1); 
          break;
        case 9:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).f);
          ((gq)marginLayoutParams).f = k;
          if (k == -1)
            ((gq)marginLayoutParams).f = typedArray.getInt(j, -1); 
          break;
        case 8:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).e);
          ((gq)marginLayoutParams).e = k;
          if (k == -1)
            ((gq)marginLayoutParams).e = typedArray.getInt(j, -1); 
          break;
        case 7:
          ((gq)marginLayoutParams).c = typedArray.getFloat(j, ((gq)marginLayoutParams).c);
          break;
        case 6:
          ((gq)marginLayoutParams).b = typedArray.getDimensionPixelOffset(j, ((gq)marginLayoutParams).b);
          break;
        case 5:
          ((gq)marginLayoutParams).a = typedArray.getDimensionPixelOffset(j, ((gq)marginLayoutParams).a);
          break;
        case 4:
          f = typedArray.getFloat(j, ((gq)marginLayoutParams).r) % 360.0F;
          ((gq)marginLayoutParams).r = f;
          if (f < 0.0F)
            ((gq)marginLayoutParams).r = (360.0F - f) % 360.0F; 
          break;
        case 3:
          ((gq)marginLayoutParams).q = typedArray.getDimensionPixelSize(j, ((gq)marginLayoutParams).q);
          break;
        case 2:
          k = typedArray.getResourceId(j, ((gq)marginLayoutParams).p);
          ((gq)marginLayoutParams).p = k;
          if (k == -1)
            ((gq)marginLayoutParams).p = typedArray.getInt(j, -1); 
          break;
        case 1:
          ((gq)marginLayoutParams).V = typedArray.getInt(j, ((gq)marginLayoutParams).V);
          break;
      } 
    } 
    typedArray.recycle();
    marginLayoutParams.a();
    return (ViewGroup.LayoutParams)marginLayoutParams;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(paramLayoutParams);
    ((gq)marginLayoutParams).a = -1;
    ((gq)marginLayoutParams).b = -1;
    ((gq)marginLayoutParams).c = -1.0F;
    ((gq)marginLayoutParams).d = true;
    ((gq)marginLayoutParams).e = -1;
    ((gq)marginLayoutParams).f = -1;
    ((gq)marginLayoutParams).g = -1;
    ((gq)marginLayoutParams).h = -1;
    ((gq)marginLayoutParams).i = -1;
    ((gq)marginLayoutParams).j = -1;
    ((gq)marginLayoutParams).k = -1;
    ((gq)marginLayoutParams).l = -1;
    ((gq)marginLayoutParams).m = -1;
    ((gq)marginLayoutParams).n = -1;
    ((gq)marginLayoutParams).o = -1;
    ((gq)marginLayoutParams).p = -1;
    ((gq)marginLayoutParams).q = 0;
    ((gq)marginLayoutParams).r = 0.0F;
    ((gq)marginLayoutParams).s = -1;
    ((gq)marginLayoutParams).t = -1;
    ((gq)marginLayoutParams).u = -1;
    ((gq)marginLayoutParams).v = -1;
    ((gq)marginLayoutParams).w = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).x = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).y = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).z = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).A = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).B = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).C = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).D = 0;
    ((gq)marginLayoutParams).E = 0.5F;
    ((gq)marginLayoutParams).F = 0.5F;
    ((gq)marginLayoutParams).G = null;
    ((gq)marginLayoutParams).H = -1.0F;
    ((gq)marginLayoutParams).I = -1.0F;
    ((gq)marginLayoutParams).J = 0;
    ((gq)marginLayoutParams).K = 0;
    ((gq)marginLayoutParams).L = 0;
    ((gq)marginLayoutParams).M = 0;
    ((gq)marginLayoutParams).N = 0;
    ((gq)marginLayoutParams).O = 0;
    ((gq)marginLayoutParams).P = 0;
    ((gq)marginLayoutParams).Q = 0;
    ((gq)marginLayoutParams).R = 1.0F;
    ((gq)marginLayoutParams).S = 1.0F;
    ((gq)marginLayoutParams).T = -1;
    ((gq)marginLayoutParams).U = -1;
    ((gq)marginLayoutParams).V = -1;
    ((gq)marginLayoutParams).W = false;
    ((gq)marginLayoutParams).X = false;
    ((gq)marginLayoutParams).Y = null;
    ((gq)marginLayoutParams).Z = 0;
    ((gq)marginLayoutParams).a0 = true;
    ((gq)marginLayoutParams).b0 = true;
    ((gq)marginLayoutParams).c0 = false;
    ((gq)marginLayoutParams).d0 = false;
    ((gq)marginLayoutParams).e0 = false;
    ((gq)marginLayoutParams).f0 = false;
    ((gq)marginLayoutParams).g0 = -1;
    ((gq)marginLayoutParams).h0 = -1;
    ((gq)marginLayoutParams).i0 = -1;
    ((gq)marginLayoutParams).j0 = -1;
    ((gq)marginLayoutParams).k0 = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).l0 = Integer.MIN_VALUE;
    ((gq)marginLayoutParams).m0 = 0.5F;
    ((gq)marginLayoutParams).q0 = new er();
    if (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) {
      ViewGroup.MarginLayoutParams marginLayoutParams1 = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      marginLayoutParams.leftMargin = marginLayoutParams1.leftMargin;
      marginLayoutParams.rightMargin = marginLayoutParams1.rightMargin;
      marginLayoutParams.topMargin = marginLayoutParams1.topMargin;
      marginLayoutParams.bottomMargin = marginLayoutParams1.bottomMargin;
      marginLayoutParams.setMarginStart(marginLayoutParams1.getMarginStart());
      marginLayoutParams.setMarginEnd(marginLayoutParams1.getMarginEnd());
    } 
    if (!(paramLayoutParams instanceof gq))
      return (ViewGroup.LayoutParams)marginLayoutParams; 
    gq gq = (gq)paramLayoutParams;
    ((gq)marginLayoutParams).a = gq.a;
    ((gq)marginLayoutParams).b = gq.b;
    ((gq)marginLayoutParams).c = gq.c;
    ((gq)marginLayoutParams).d = gq.d;
    ((gq)marginLayoutParams).e = gq.e;
    ((gq)marginLayoutParams).f = gq.f;
    ((gq)marginLayoutParams).g = gq.g;
    ((gq)marginLayoutParams).h = gq.h;
    ((gq)marginLayoutParams).i = gq.i;
    ((gq)marginLayoutParams).j = gq.j;
    ((gq)marginLayoutParams).k = gq.k;
    ((gq)marginLayoutParams).l = gq.l;
    ((gq)marginLayoutParams).m = gq.m;
    ((gq)marginLayoutParams).n = gq.n;
    ((gq)marginLayoutParams).o = gq.o;
    ((gq)marginLayoutParams).p = gq.p;
    ((gq)marginLayoutParams).q = gq.q;
    ((gq)marginLayoutParams).r = gq.r;
    ((gq)marginLayoutParams).s = gq.s;
    ((gq)marginLayoutParams).t = gq.t;
    ((gq)marginLayoutParams).u = gq.u;
    ((gq)marginLayoutParams).v = gq.v;
    ((gq)marginLayoutParams).w = gq.w;
    ((gq)marginLayoutParams).x = gq.x;
    ((gq)marginLayoutParams).y = gq.y;
    ((gq)marginLayoutParams).z = gq.z;
    ((gq)marginLayoutParams).A = gq.A;
    ((gq)marginLayoutParams).B = gq.B;
    ((gq)marginLayoutParams).C = gq.C;
    ((gq)marginLayoutParams).D = gq.D;
    ((gq)marginLayoutParams).E = gq.E;
    ((gq)marginLayoutParams).F = gq.F;
    ((gq)marginLayoutParams).G = gq.G;
    ((gq)marginLayoutParams).H = gq.H;
    ((gq)marginLayoutParams).I = gq.I;
    ((gq)marginLayoutParams).J = gq.J;
    ((gq)marginLayoutParams).K = gq.K;
    ((gq)marginLayoutParams).W = gq.W;
    ((gq)marginLayoutParams).X = gq.X;
    ((gq)marginLayoutParams).L = gq.L;
    ((gq)marginLayoutParams).M = gq.M;
    ((gq)marginLayoutParams).N = gq.N;
    ((gq)marginLayoutParams).P = gq.P;
    ((gq)marginLayoutParams).O = gq.O;
    ((gq)marginLayoutParams).Q = gq.Q;
    ((gq)marginLayoutParams).R = gq.R;
    ((gq)marginLayoutParams).S = gq.S;
    ((gq)marginLayoutParams).T = gq.T;
    ((gq)marginLayoutParams).U = gq.U;
    ((gq)marginLayoutParams).V = gq.V;
    ((gq)marginLayoutParams).a0 = gq.a0;
    ((gq)marginLayoutParams).b0 = gq.b0;
    ((gq)marginLayoutParams).c0 = gq.c0;
    ((gq)marginLayoutParams).d0 = gq.d0;
    ((gq)marginLayoutParams).g0 = gq.g0;
    ((gq)marginLayoutParams).h0 = gq.h0;
    ((gq)marginLayoutParams).i0 = gq.i0;
    ((gq)marginLayoutParams).j0 = gq.j0;
    ((gq)marginLayoutParams).k0 = gq.k0;
    ((gq)marginLayoutParams).l0 = gq.l0;
    ((gq)marginLayoutParams).m0 = gq.m0;
    ((gq)marginLayoutParams).Y = gq.Y;
    ((gq)marginLayoutParams).Z = gq.Z;
    ((gq)marginLayoutParams).q0 = gq.q0;
    return (ViewGroup.LayoutParams)marginLayoutParams;
  }
  
  public int getMaxHeight() {
    return this.i;
  }
  
  public int getMaxWidth() {
    return this.h;
  }
  
  public int getMinHeight() {
    return this.g;
  }
  
  public int getMinWidth() {
    return this.f;
  }
  
  public int getOptimizationLevel() {
    return this.e.D0;
  }
  
  public String getSceneString() {
    StringBuilder stringBuilder = new StringBuilder();
    fr fr1 = this.e;
    if (((er)fr1).j == null) {
      int k = getId();
      if (k != -1) {
        ((er)fr1).j = getContext().getResources().getResourceEntryName(k);
      } else {
        ((er)fr1).j = "parent";
      } 
    } 
    if (((er)fr1).h0 == null) {
      ((er)fr1).h0 = ((er)fr1).j;
      StringBuilder stringBuilder1 = new StringBuilder(" setDebugName ");
      stringBuilder1.append(((er)fr1).h0);
      Log.v("ConstraintLayout", stringBuilder1.toString());
    } 
    ArrayList<Object> arrayList = fr1.q0;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      er er = (er)arrayList.get(i);
      int k = i + 1;
      er = er;
      View view = er.f0;
      i = k;
      if (view != null) {
        if (er.j == null) {
          i = view.getId();
          if (i != -1)
            er.j = getContext().getResources().getResourceEntryName(i); 
        } 
        i = k;
        if (er.h0 == null) {
          er.h0 = er.j;
          StringBuilder stringBuilder1 = new StringBuilder(" setDebugName ");
          stringBuilder1.append(er.h0);
          Log.v("ConstraintLayout", stringBuilder1.toString());
          i = k;
        } 
      } 
    } 
    fr1.l(stringBuilder);
    return stringBuilder.toString();
  }
  
  public final void h(AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    fr fr1 = this.e;
    ((er)fr1).f0 = (View)this;
    hq hq1 = this.q;
    fr1.u0 = hq1;
    fr1.s0.f = hq1;
    this.b.put(getId(), this);
    this.l = null;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, fc1.b, paramInt1, paramInt2);
      paramInt2 = typedArray.getIndexCount();
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        int i = typedArray.getIndex(paramInt1);
        if (i == 16) {
          this.f = typedArray.getDimensionPixelOffset(i, this.f);
        } else if (i == 17) {
          this.g = typedArray.getDimensionPixelOffset(i, this.g);
        } else if (i == 14) {
          this.h = typedArray.getDimensionPixelOffset(i, this.h);
        } else if (i == 15) {
          this.i = typedArray.getDimensionPixelOffset(i, this.i);
        } else if (i == 113) {
          this.k = typedArray.getInt(i, this.k);
        } else if (i == 56) {
          i = typedArray.getResourceId(i, 0);
          if (i != 0)
            try {
              i(i);
            } catch (android.content.res.Resources.NotFoundException notFoundException) {
              this.m = null;
            }  
        } else if (i == 34) {
          i = typedArray.getResourceId(i, 0);
          try {
            pq pq1 = new pq();
            this();
            this.l = pq1;
            pq1.h(getContext(), i);
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            this.l = null;
          } 
          this.n = i;
        } 
      } 
      typedArray.recycle();
    } 
    fr1.D0 = this.k;
    ln0.q = fr1.S(512);
  }
  
  public final void i(int paramInt) {
    Context context = getContext();
    g7 g71 = new g7(15, false);
    g71.c = new SparseArray();
    g71.e = new SparseArray();
    String str = hrSTyFuSIm.CrHFcLhvK;
    XmlResourceParser xmlResourceParser = context.getResources().getXml(paramInt);
    try {
      int i = xmlResourceParser.getEventType();
      for (String str1 = null; i != 1; str1 = str2) {
        String str2;
        if (i != 2) {
          str2 = str1;
        } else {
          iq iq;
          String str3 = xmlResourceParser.getName();
          switch (str3.hashCode()) {
            default:
              str2 = str1;
              break;
            case 1901439077:
              str2 = str1;
              if (str3.equals("Variant")) {
                iq = new iq();
                this(context, xmlResourceParser);
                str2 = str1;
                if (str1 != null) {
                  ((ArrayList<iq>)((pf)str1).c).add(iq);
                  str2 = str1;
                } 
              } 
              break;
            case 1657696882:
              str2 = "layoutDescription";
              iq.equals(str2);
              str2 = str1;
              break;
            case 1382829617:
              str2 = "StateSet";
              iq.equals(str2);
              str2 = str1;
              break;
            case 80204913:
              str2 = str1;
              if (iq.equals("State")) {
                pf pf = new pf();
                this(context, xmlResourceParser);
                ((SparseArray)g71.c).put(pf.a, pf);
              } 
              break;
            case -1349929691:
              str2 = str1;
              if (iq.equals("ConstraintSet")) {
                g71.G(context, xmlResourceParser);
                str2 = str1;
              } 
              break;
          } 
        } 
        i = xmlResourceParser.next();
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      StringBuilder stringBuilder = new StringBuilder("Error parsing resource: ");
      stringBuilder.append(paramInt);
      Log.e(str, stringBuilder.toString(), (Throwable)xmlPullParserException);
    } catch (IOException iOException) {}
    this.m = g71;
  }
  
  public final void j(fr paramfr, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: invokestatic getMode : (I)I
    //   4: istore #14
    //   6: iload_3
    //   7: invokestatic getSize : (I)I
    //   10: istore #12
    //   12: iload #4
    //   14: invokestatic getMode : (I)I
    //   17: istore #10
    //   19: iload #4
    //   21: invokestatic getSize : (I)I
    //   24: istore #7
    //   26: iconst_0
    //   27: aload_0
    //   28: invokevirtual getPaddingTop : ()I
    //   31: invokestatic max : (II)I
    //   34: istore #11
    //   36: iconst_0
    //   37: aload_0
    //   38: invokevirtual getPaddingBottom : ()I
    //   41: invokestatic max : (II)I
    //   44: istore #5
    //   46: iload #11
    //   48: iload #5
    //   50: iadd
    //   51: istore #9
    //   53: aload_0
    //   54: invokespecial getPaddingWidth : ()I
    //   57: istore #8
    //   59: aload_0
    //   60: getfield q : Lhq;
    //   63: astore #22
    //   65: aload #22
    //   67: iload #11
    //   69: putfield b : I
    //   72: aload #22
    //   74: iload #5
    //   76: putfield c : I
    //   79: aload #22
    //   81: iload #8
    //   83: putfield d : I
    //   86: aload #22
    //   88: iload #9
    //   90: putfield e : I
    //   93: aload #22
    //   95: iload_3
    //   96: putfield f : I
    //   99: aload #22
    //   101: iload #4
    //   103: putfield g : I
    //   106: iconst_0
    //   107: aload_0
    //   108: invokevirtual getPaddingStart : ()I
    //   111: invokestatic max : (II)I
    //   114: istore #6
    //   116: iconst_0
    //   117: aload_0
    //   118: invokevirtual getPaddingEnd : ()I
    //   121: invokestatic max : (II)I
    //   124: istore_3
    //   125: iconst_1
    //   126: istore #5
    //   128: iload #6
    //   130: ifgt -> 153
    //   133: iload_3
    //   134: ifle -> 140
    //   137: goto -> 153
    //   140: iconst_0
    //   141: aload_0
    //   142: invokevirtual getPaddingLeft : ()I
    //   145: invokestatic max : (II)I
    //   148: istore #4
    //   150: goto -> 189
    //   153: iload #6
    //   155: istore #4
    //   157: aload_0
    //   158: invokevirtual getContext : ()Landroid/content/Context;
    //   161: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   164: getfield flags : I
    //   167: ldc_w 4194304
    //   170: iand
    //   171: ifeq -> 189
    //   174: iload #6
    //   176: istore #4
    //   178: iconst_1
    //   179: aload_0
    //   180: invokevirtual getLayoutDirection : ()I
    //   183: if_icmpne -> 189
    //   186: iload_3
    //   187: istore #4
    //   189: iload #12
    //   191: iload #8
    //   193: isub
    //   194: istore #8
    //   196: iload #7
    //   198: iload #9
    //   200: isub
    //   201: istore #9
    //   203: aload #22
    //   205: getfield e : I
    //   208: istore #12
    //   210: aload #22
    //   212: getfield d : I
    //   215: istore #13
    //   217: aload_0
    //   218: invokevirtual getChildCount : ()I
    //   221: istore #7
    //   223: iload #14
    //   225: ldc_w -2147483648
    //   228: if_icmpeq -> 298
    //   231: iload #14
    //   233: ifeq -> 270
    //   236: iload #14
    //   238: ldc_w 1073741824
    //   241: if_icmpeq -> 250
    //   244: iconst_0
    //   245: istore #6
    //   247: goto -> 321
    //   250: aload_0
    //   251: getfield h : I
    //   254: iload #13
    //   256: isub
    //   257: iload #8
    //   259: invokestatic min : (II)I
    //   262: istore #6
    //   264: iconst_1
    //   265: istore #5
    //   267: goto -> 321
    //   270: iload #7
    //   272: ifne -> 293
    //   275: iconst_0
    //   276: aload_0
    //   277: getfield f : I
    //   280: invokestatic max : (II)I
    //   283: istore_3
    //   284: iconst_2
    //   285: istore #5
    //   287: iload_3
    //   288: istore #6
    //   290: goto -> 321
    //   293: iconst_0
    //   294: istore_3
    //   295: goto -> 284
    //   298: iload #7
    //   300: ifne -> 315
    //   303: iconst_0
    //   304: aload_0
    //   305: getfield f : I
    //   308: invokestatic max : (II)I
    //   311: istore_3
    //   312: goto -> 284
    //   315: iload #8
    //   317: istore_3
    //   318: goto -> 284
    //   321: iload #10
    //   323: ldc_w -2147483648
    //   326: if_icmpeq -> 391
    //   329: iload #10
    //   331: ifeq -> 366
    //   334: iload #10
    //   336: ldc_w 1073741824
    //   339: if_icmpeq -> 350
    //   342: iconst_0
    //   343: istore_3
    //   344: iconst_1
    //   345: istore #7
    //   347: goto -> 414
    //   350: aload_0
    //   351: getfield i : I
    //   354: iload #12
    //   356: isub
    //   357: iload #9
    //   359: invokestatic min : (II)I
    //   362: istore_3
    //   363: goto -> 344
    //   366: iload #7
    //   368: ifne -> 386
    //   371: iconst_0
    //   372: aload_0
    //   373: getfield g : I
    //   376: invokestatic max : (II)I
    //   379: istore_3
    //   380: iconst_2
    //   381: istore #7
    //   383: goto -> 414
    //   386: iconst_0
    //   387: istore_3
    //   388: goto -> 380
    //   391: iload #7
    //   393: ifne -> 408
    //   396: iconst_0
    //   397: aload_0
    //   398: getfield g : I
    //   401: invokestatic max : (II)I
    //   404: istore_3
    //   405: goto -> 380
    //   408: iload #9
    //   410: istore_3
    //   411: goto -> 380
    //   414: aload_1
    //   415: invokevirtual o : ()I
    //   418: istore #15
    //   420: aload_1
    //   421: getfield s0 : Lhy;
    //   424: astore #27
    //   426: aload_1
    //   427: getfield C : [I
    //   430: astore #29
    //   432: iload #6
    //   434: iload #15
    //   436: if_icmpne -> 447
    //   439: iload_3
    //   440: aload_1
    //   441: invokevirtual i : ()I
    //   444: if_icmpeq -> 450
    //   447: goto -> 453
    //   450: goto -> 462
    //   453: aload #27
    //   455: iconst_1
    //   456: putfield c : Z
    //   459: goto -> 450
    //   462: aload_1
    //   463: iconst_0
    //   464: putfield Y : I
    //   467: aload_1
    //   468: iconst_0
    //   469: putfield Z : I
    //   472: aload #29
    //   474: iconst_0
    //   475: aload_0
    //   476: getfield h : I
    //   479: iload #13
    //   481: isub
    //   482: iastore
    //   483: aload #29
    //   485: iconst_1
    //   486: aload_0
    //   487: getfield i : I
    //   490: iload #12
    //   492: isub
    //   493: iastore
    //   494: aload_1
    //   495: iconst_0
    //   496: putfield b0 : I
    //   499: aload_1
    //   500: iconst_0
    //   501: putfield c0 : I
    //   504: aload_1
    //   505: iload #5
    //   507: invokevirtual I : (I)V
    //   510: aload_1
    //   511: iload #6
    //   513: invokevirtual K : (I)V
    //   516: aload_1
    //   517: iload #7
    //   519: invokevirtual J : (I)V
    //   522: aload_1
    //   523: iload_3
    //   524: invokevirtual H : (I)V
    //   527: aload_0
    //   528: getfield f : I
    //   531: iload #13
    //   533: isub
    //   534: istore_3
    //   535: iload_3
    //   536: ifge -> 547
    //   539: aload_1
    //   540: iconst_0
    //   541: putfield b0 : I
    //   544: goto -> 552
    //   547: aload_1
    //   548: iload_3
    //   549: putfield b0 : I
    //   552: aload_0
    //   553: getfield g : I
    //   556: iload #12
    //   558: isub
    //   559: istore_3
    //   560: iload_3
    //   561: ifge -> 572
    //   564: aload_1
    //   565: iconst_0
    //   566: putfield c0 : I
    //   569: goto -> 577
    //   572: aload_1
    //   573: iload_3
    //   574: putfield c0 : I
    //   577: aload_1
    //   578: iload #4
    //   580: putfield x0 : I
    //   583: aload_1
    //   584: iload #11
    //   586: putfield y0 : I
    //   589: aload_1
    //   590: getfield r0 : Lp01;
    //   593: astore #24
    //   595: aload #24
    //   597: getfield e : Ljava/lang/Object;
    //   600: checkcast fr
    //   603: astore #26
    //   605: aload #24
    //   607: getfield f : Ljava/lang/Object;
    //   610: checkcast java/util/ArrayList
    //   613: astore #25
    //   615: aload_1
    //   616: getfield u0 : Lhq;
    //   619: astore #23
    //   621: aload_1
    //   622: getfield q0 : Ljava/util/ArrayList;
    //   625: invokevirtual size : ()I
    //   628: istore #7
    //   630: aload_1
    //   631: invokevirtual o : ()I
    //   634: istore #12
    //   636: aload_1
    //   637: invokevirtual i : ()I
    //   640: istore #11
    //   642: iload_2
    //   643: sipush #128
    //   646: invokestatic p : (II)Z
    //   649: istore #21
    //   651: iload #21
    //   653: ifne -> 673
    //   656: iload_2
    //   657: bipush #64
    //   659: invokestatic p : (II)Z
    //   662: ifeq -> 668
    //   665: goto -> 673
    //   668: iconst_0
    //   669: istore_3
    //   670: goto -> 675
    //   673: iconst_1
    //   674: istore_3
    //   675: iload_3
    //   676: istore #5
    //   678: iload #7
    //   680: istore #4
    //   682: iload_3
    //   683: ifeq -> 853
    //   686: iconst_0
    //   687: istore #6
    //   689: iload #7
    //   691: istore_2
    //   692: iload_3
    //   693: istore #5
    //   695: iload_2
    //   696: istore #4
    //   698: iload #6
    //   700: iload_2
    //   701: if_icmpge -> 853
    //   704: aload_1
    //   705: getfield q0 : Ljava/util/ArrayList;
    //   708: iload #6
    //   710: invokevirtual get : (I)Ljava/lang/Object;
    //   713: checkcast er
    //   716: astore #22
    //   718: aload #22
    //   720: getfield p0 : [I
    //   723: astore #28
    //   725: aload #28
    //   727: iconst_0
    //   728: iaload
    //   729: iconst_3
    //   730: if_icmpne -> 739
    //   733: iconst_1
    //   734: istore #4
    //   736: goto -> 745
    //   739: iconst_0
    //   740: istore #4
    //   742: goto -> 736
    //   745: aload #28
    //   747: iconst_1
    //   748: iaload
    //   749: iconst_3
    //   750: if_icmpne -> 759
    //   753: iconst_1
    //   754: istore #5
    //   756: goto -> 762
    //   759: iconst_0
    //   760: istore #5
    //   762: iload #4
    //   764: ifeq -> 788
    //   767: iload #5
    //   769: ifeq -> 788
    //   772: aload #22
    //   774: getfield W : F
    //   777: fconst_0
    //   778: fcmpl
    //   779: ifle -> 788
    //   782: iconst_1
    //   783: istore #4
    //   785: goto -> 791
    //   788: iconst_0
    //   789: istore #4
    //   791: aload #22
    //   793: invokevirtual v : ()Z
    //   796: ifeq -> 812
    //   799: iload #4
    //   801: ifeq -> 812
    //   804: iconst_0
    //   805: istore_3
    //   806: iload_2
    //   807: istore #4
    //   809: goto -> 856
    //   812: aload #22
    //   814: invokevirtual w : ()Z
    //   817: ifeq -> 828
    //   820: iload #4
    //   822: ifeq -> 828
    //   825: goto -> 804
    //   828: aload #22
    //   830: invokevirtual v : ()Z
    //   833: ifne -> 804
    //   836: aload #22
    //   838: invokevirtual w : ()Z
    //   841: ifeq -> 847
    //   844: goto -> 804
    //   847: iinc #6, 1
    //   850: goto -> 692
    //   853: iload #5
    //   855: istore_3
    //   856: iload #14
    //   858: ldc_w 1073741824
    //   861: if_icmpne -> 872
    //   864: iload #10
    //   866: ldc_w 1073741824
    //   869: if_icmpeq -> 877
    //   872: iload #21
    //   874: ifeq -> 882
    //   877: iconst_1
    //   878: istore_2
    //   879: goto -> 884
    //   882: iconst_0
    //   883: istore_2
    //   884: iload_3
    //   885: iload_2
    //   886: iand
    //   887: istore #13
    //   889: iload #13
    //   891: ifeq -> 2083
    //   894: aload #29
    //   896: iconst_0
    //   897: iaload
    //   898: iload #8
    //   900: invokestatic min : (II)I
    //   903: istore_2
    //   904: aload #29
    //   906: iconst_1
    //   907: iaload
    //   908: iload #9
    //   910: invokestatic min : (II)I
    //   913: istore_3
    //   914: iload #14
    //   916: ldc_w 1073741824
    //   919: if_icmpne -> 941
    //   922: aload_1
    //   923: invokevirtual o : ()I
    //   926: iload_2
    //   927: if_icmpeq -> 941
    //   930: aload_1
    //   931: iload_2
    //   932: invokevirtual K : (I)V
    //   935: aload #27
    //   937: iconst_1
    //   938: putfield b : Z
    //   941: iload #10
    //   943: ldc_w 1073741824
    //   946: if_icmpne -> 968
    //   949: aload_1
    //   950: invokevirtual i : ()I
    //   953: iload_3
    //   954: if_icmpeq -> 968
    //   957: aload_1
    //   958: iload_3
    //   959: invokevirtual H : (I)V
    //   962: aload #27
    //   964: iconst_1
    //   965: putfield b : Z
    //   968: iload #14
    //   970: ldc_w 1073741824
    //   973: if_icmpne -> 1724
    //   976: iload #10
    //   978: ldc_w 1073741824
    //   981: if_icmpne -> 1724
    //   984: aload #27
    //   986: getfield e : Ljava/util/ArrayList;
    //   989: astore #29
    //   991: aload #27
    //   993: getfield a : Lfr;
    //   996: astore #28
    //   998: aload #27
    //   1000: getfield b : Z
    //   1003: ifne -> 1020
    //   1006: aload #27
    //   1008: getfield c : Z
    //   1011: ifeq -> 1017
    //   1014: goto -> 1020
    //   1017: goto -> 1117
    //   1020: aload #28
    //   1022: getfield q0 : Ljava/util/ArrayList;
    //   1025: astore #22
    //   1027: aload #22
    //   1029: invokevirtual size : ()I
    //   1032: istore_3
    //   1033: iconst_0
    //   1034: istore_2
    //   1035: iload_2
    //   1036: iload_3
    //   1037: if_icmpge -> 1084
    //   1040: aload #22
    //   1042: iload_2
    //   1043: invokevirtual get : (I)Ljava/lang/Object;
    //   1046: checkcast er
    //   1049: astore #30
    //   1051: aload #30
    //   1053: invokevirtual f : ()V
    //   1056: aload #30
    //   1058: iconst_0
    //   1059: putfield a : Z
    //   1062: aload #30
    //   1064: getfield d : Lfg0;
    //   1067: invokevirtual n : ()V
    //   1070: aload #30
    //   1072: getfield e : Ld22;
    //   1075: invokevirtual m : ()V
    //   1078: iinc #2, 1
    //   1081: goto -> 1035
    //   1084: aload #28
    //   1086: invokevirtual f : ()V
    //   1089: aload #28
    //   1091: iconst_0
    //   1092: putfield a : Z
    //   1095: aload #28
    //   1097: getfield d : Lfg0;
    //   1100: invokevirtual n : ()V
    //   1103: aload #28
    //   1105: getfield e : Ld22;
    //   1108: invokevirtual m : ()V
    //   1111: aload #27
    //   1113: iconst_0
    //   1114: putfield c : Z
    //   1117: aload #27
    //   1119: aload #27
    //   1121: getfield d : Lfr;
    //   1124: invokevirtual b : (Lfr;)V
    //   1127: aload #28
    //   1129: iconst_0
    //   1130: putfield Y : I
    //   1133: aload #28
    //   1135: getfield p0 : [I
    //   1138: astore #30
    //   1140: aload #28
    //   1142: iconst_0
    //   1143: putfield Z : I
    //   1146: aload #28
    //   1148: iconst_0
    //   1149: invokevirtual h : (I)I
    //   1152: istore #7
    //   1154: aload #28
    //   1156: iconst_1
    //   1157: invokevirtual h : (I)I
    //   1160: istore #6
    //   1162: aload #27
    //   1164: getfield b : Z
    //   1167: ifeq -> 1175
    //   1170: aload #27
    //   1172: invokevirtual c : ()V
    //   1175: aload #28
    //   1177: invokevirtual p : ()I
    //   1180: istore #5
    //   1182: aload #28
    //   1184: invokevirtual q : ()I
    //   1187: istore_3
    //   1188: aload #28
    //   1190: getfield d : Lfg0;
    //   1193: getfield h : Liy;
    //   1196: iload #5
    //   1198: invokevirtual d : (I)V
    //   1201: aload #28
    //   1203: getfield e : Ld22;
    //   1206: getfield h : Liy;
    //   1209: iload_3
    //   1210: invokevirtual d : (I)V
    //   1213: aload #27
    //   1215: invokevirtual g : ()V
    //   1218: iload #7
    //   1220: iconst_2
    //   1221: if_icmpeq -> 1236
    //   1224: iload #6
    //   1226: iconst_2
    //   1227: if_icmpne -> 1233
    //   1230: goto -> 1236
    //   1233: goto -> 1387
    //   1236: iload #21
    //   1238: ifeq -> 1288
    //   1241: aload #29
    //   1243: invokevirtual size : ()I
    //   1246: istore #8
    //   1248: iconst_0
    //   1249: istore_2
    //   1250: iload #21
    //   1252: istore #19
    //   1254: iload_2
    //   1255: iload #8
    //   1257: if_icmpge -> 1292
    //   1260: aload #29
    //   1262: iload_2
    //   1263: invokevirtual get : (I)Ljava/lang/Object;
    //   1266: astore #22
    //   1268: iinc #2, 1
    //   1271: aload #22
    //   1273: checkcast m52
    //   1276: invokevirtual k : ()Z
    //   1279: ifne -> 1250
    //   1282: iconst_0
    //   1283: istore #19
    //   1285: goto -> 1292
    //   1288: iload #21
    //   1290: istore #19
    //   1292: iload #19
    //   1294: ifeq -> 1338
    //   1297: iload #7
    //   1299: iconst_2
    //   1300: if_icmpne -> 1338
    //   1303: aload #28
    //   1305: iconst_1
    //   1306: invokevirtual I : (I)V
    //   1309: aload #28
    //   1311: aload #27
    //   1313: aload #28
    //   1315: iconst_0
    //   1316: invokevirtual d : (Lfr;I)I
    //   1319: invokevirtual K : (I)V
    //   1322: aload #28
    //   1324: getfield d : Lfg0;
    //   1327: getfield e : Lrz;
    //   1330: aload #28
    //   1332: invokevirtual o : ()I
    //   1335: invokevirtual d : (I)V
    //   1338: iload #19
    //   1340: ifeq -> 1233
    //   1343: iload #6
    //   1345: iconst_2
    //   1346: if_icmpne -> 1233
    //   1349: aload #28
    //   1351: iconst_1
    //   1352: invokevirtual J : (I)V
    //   1355: aload #28
    //   1357: aload #27
    //   1359: aload #28
    //   1361: iconst_1
    //   1362: invokevirtual d : (Lfr;I)I
    //   1365: invokevirtual H : (I)V
    //   1368: aload #28
    //   1370: getfield e : Ld22;
    //   1373: getfield e : Lrz;
    //   1376: aload #28
    //   1378: invokevirtual i : ()I
    //   1381: invokevirtual d : (I)V
    //   1384: goto -> 1233
    //   1387: aload #30
    //   1389: iconst_0
    //   1390: iaload
    //   1391: istore_2
    //   1392: iload_2
    //   1393: iconst_1
    //   1394: if_icmpeq -> 1410
    //   1397: iload_2
    //   1398: iconst_4
    //   1399: if_icmpne -> 1405
    //   1402: goto -> 1410
    //   1405: iconst_0
    //   1406: istore_2
    //   1407: goto -> 1507
    //   1410: aload #28
    //   1412: invokevirtual o : ()I
    //   1415: iload #5
    //   1417: iadd
    //   1418: istore_2
    //   1419: aload #28
    //   1421: getfield d : Lfg0;
    //   1424: getfield i : Liy;
    //   1427: iload_2
    //   1428: invokevirtual d : (I)V
    //   1431: aload #28
    //   1433: getfield d : Lfg0;
    //   1436: getfield e : Lrz;
    //   1439: iload_2
    //   1440: iload #5
    //   1442: isub
    //   1443: invokevirtual d : (I)V
    //   1446: aload #27
    //   1448: invokevirtual g : ()V
    //   1451: aload #30
    //   1453: iconst_1
    //   1454: iaload
    //   1455: istore_2
    //   1456: iload_2
    //   1457: iconst_1
    //   1458: if_icmpeq -> 1466
    //   1461: iload_2
    //   1462: iconst_4
    //   1463: if_icmpne -> 1500
    //   1466: aload #28
    //   1468: invokevirtual i : ()I
    //   1471: iload_3
    //   1472: iadd
    //   1473: istore_2
    //   1474: aload #28
    //   1476: getfield e : Ld22;
    //   1479: getfield i : Liy;
    //   1482: iload_2
    //   1483: invokevirtual d : (I)V
    //   1486: aload #28
    //   1488: getfield e : Ld22;
    //   1491: getfield e : Lrz;
    //   1494: iload_2
    //   1495: iload_3
    //   1496: isub
    //   1497: invokevirtual d : (I)V
    //   1500: aload #27
    //   1502: invokevirtual g : ()V
    //   1505: iconst_1
    //   1506: istore_2
    //   1507: aload #29
    //   1509: invokevirtual size : ()I
    //   1512: istore #5
    //   1514: iconst_0
    //   1515: istore_3
    //   1516: iload_3
    //   1517: iload #5
    //   1519: if_icmpge -> 1569
    //   1522: aload #29
    //   1524: iload_3
    //   1525: invokevirtual get : (I)Ljava/lang/Object;
    //   1528: astore #22
    //   1530: iinc #3, 1
    //   1533: aload #22
    //   1535: checkcast m52
    //   1538: astore #22
    //   1540: aload #22
    //   1542: getfield b : Ler;
    //   1545: aload #28
    //   1547: if_acmpne -> 1561
    //   1550: aload #22
    //   1552: getfield g : Z
    //   1555: ifne -> 1561
    //   1558: goto -> 1516
    //   1561: aload #22
    //   1563: invokevirtual e : ()V
    //   1566: goto -> 1516
    //   1569: aload #29
    //   1571: invokevirtual size : ()I
    //   1574: istore #8
    //   1576: iconst_0
    //   1577: istore_3
    //   1578: iload_3
    //   1579: iload #8
    //   1581: if_icmpge -> 1702
    //   1584: aload #29
    //   1586: iload_3
    //   1587: invokevirtual get : (I)Ljava/lang/Object;
    //   1590: astore #22
    //   1592: iload_3
    //   1593: iconst_1
    //   1594: iadd
    //   1595: istore #5
    //   1597: aload #22
    //   1599: checkcast m52
    //   1602: astore #22
    //   1604: iload_2
    //   1605: ifne -> 1624
    //   1608: aload #22
    //   1610: getfield b : Ler;
    //   1613: aload #28
    //   1615: if_acmpne -> 1624
    //   1618: iload #5
    //   1620: istore_3
    //   1621: goto -> 1578
    //   1624: aload #22
    //   1626: getfield h : Liy;
    //   1629: getfield j : Z
    //   1632: ifne -> 1641
    //   1635: iconst_0
    //   1636: istore #19
    //   1638: goto -> 1705
    //   1641: aload #22
    //   1643: getfield i : Liy;
    //   1646: getfield j : Z
    //   1649: ifne -> 1663
    //   1652: aload #22
    //   1654: instanceof cf0
    //   1657: ifne -> 1663
    //   1660: goto -> 1635
    //   1663: iload #5
    //   1665: istore_3
    //   1666: aload #22
    //   1668: getfield e : Lrz;
    //   1671: getfield j : Z
    //   1674: ifne -> 1578
    //   1677: iload #5
    //   1679: istore_3
    //   1680: aload #22
    //   1682: instanceof wj
    //   1685: ifne -> 1578
    //   1688: iload #5
    //   1690: istore_3
    //   1691: aload #22
    //   1693: instanceof cf0
    //   1696: ifne -> 1578
    //   1699: goto -> 1635
    //   1702: iconst_1
    //   1703: istore #19
    //   1705: aload #28
    //   1707: iload #7
    //   1709: invokevirtual I : (I)V
    //   1712: aload #28
    //   1714: iload #6
    //   1716: invokevirtual J : (I)V
    //   1719: iconst_2
    //   1720: istore_2
    //   1721: goto -> 2021
    //   1724: aload #27
    //   1726: getfield a : Lfr;
    //   1729: astore #28
    //   1731: aload #27
    //   1733: getfield b : Z
    //   1736: ifeq -> 1918
    //   1739: aload #28
    //   1741: getfield q0 : Ljava/util/ArrayList;
    //   1744: astore #22
    //   1746: aload #22
    //   1748: invokevirtual size : ()I
    //   1751: istore_3
    //   1752: iconst_0
    //   1753: istore_2
    //   1754: iload_2
    //   1755: iload_3
    //   1756: if_icmpge -> 1845
    //   1759: aload #22
    //   1761: iload_2
    //   1762: invokevirtual get : (I)Ljava/lang/Object;
    //   1765: astore #29
    //   1767: iinc #2, 1
    //   1770: aload #29
    //   1772: checkcast er
    //   1775: astore #30
    //   1777: aload #30
    //   1779: invokevirtual f : ()V
    //   1782: aload #30
    //   1784: iconst_0
    //   1785: putfield a : Z
    //   1788: aload #30
    //   1790: getfield d : Lfg0;
    //   1793: astore #29
    //   1795: aload #29
    //   1797: getfield e : Lrz;
    //   1800: iconst_0
    //   1801: putfield j : Z
    //   1804: aload #29
    //   1806: iconst_0
    //   1807: putfield g : Z
    //   1810: aload #29
    //   1812: invokevirtual n : ()V
    //   1815: aload #30
    //   1817: getfield e : Ld22;
    //   1820: astore #29
    //   1822: aload #29
    //   1824: getfield e : Lrz;
    //   1827: iconst_0
    //   1828: putfield j : Z
    //   1831: aload #29
    //   1833: iconst_0
    //   1834: putfield g : Z
    //   1837: aload #29
    //   1839: invokevirtual m : ()V
    //   1842: goto -> 1754
    //   1845: aload #28
    //   1847: invokevirtual f : ()V
    //   1850: aload #28
    //   1852: iconst_0
    //   1853: putfield a : Z
    //   1856: aload #28
    //   1858: getfield d : Lfg0;
    //   1861: astore #22
    //   1863: aload #22
    //   1865: getfield e : Lrz;
    //   1868: iconst_0
    //   1869: putfield j : Z
    //   1872: aload #22
    //   1874: iconst_0
    //   1875: putfield g : Z
    //   1878: aload #22
    //   1880: invokevirtual n : ()V
    //   1883: aload #28
    //   1885: getfield e : Ld22;
    //   1888: astore #22
    //   1890: aload #22
    //   1892: getfield e : Lrz;
    //   1895: iconst_0
    //   1896: putfield j : Z
    //   1899: aload #22
    //   1901: iconst_0
    //   1902: putfield g : Z
    //   1905: aload #22
    //   1907: invokevirtual m : ()V
    //   1910: aload #27
    //   1912: invokevirtual c : ()V
    //   1915: goto -> 1918
    //   1918: aload #27
    //   1920: aload #27
    //   1922: getfield d : Lfr;
    //   1925: invokevirtual b : (Lfr;)V
    //   1928: aload #28
    //   1930: iconst_0
    //   1931: putfield Y : I
    //   1934: aload #28
    //   1936: iconst_0
    //   1937: putfield Z : I
    //   1940: aload #28
    //   1942: getfield d : Lfg0;
    //   1945: getfield h : Liy;
    //   1948: iconst_0
    //   1949: invokevirtual d : (I)V
    //   1952: aload #28
    //   1954: getfield e : Ld22;
    //   1957: getfield h : Liy;
    //   1960: iconst_0
    //   1961: invokevirtual d : (I)V
    //   1964: iload #14
    //   1966: ldc_w 1073741824
    //   1969: if_icmpne -> 1986
    //   1972: aload_1
    //   1973: iconst_0
    //   1974: iload #21
    //   1976: invokevirtual P : (IZ)Z
    //   1979: istore #20
    //   1981: iconst_1
    //   1982: istore_3
    //   1983: goto -> 1991
    //   1986: iconst_0
    //   1987: istore_3
    //   1988: iconst_1
    //   1989: istore #20
    //   1991: iload_3
    //   1992: istore_2
    //   1993: iload #20
    //   1995: istore #19
    //   1997: iload #10
    //   1999: ldc_w 1073741824
    //   2002: if_icmpne -> 2021
    //   2005: iload #20
    //   2007: aload_1
    //   2008: iconst_1
    //   2009: iload #21
    //   2011: invokevirtual P : (IZ)Z
    //   2014: iand
    //   2015: istore #19
    //   2017: iload_3
    //   2018: iconst_1
    //   2019: iadd
    //   2020: istore_2
    //   2021: iload_2
    //   2022: istore_3
    //   2023: iload #19
    //   2025: istore #20
    //   2027: iload #19
    //   2029: ifeq -> 2088
    //   2032: iload #14
    //   2034: ldc_w 1073741824
    //   2037: if_icmpne -> 2046
    //   2040: iconst_1
    //   2041: istore #20
    //   2043: goto -> 2049
    //   2046: iconst_0
    //   2047: istore #20
    //   2049: iload #10
    //   2051: ldc_w 1073741824
    //   2054: if_icmpne -> 2063
    //   2057: iconst_1
    //   2058: istore #21
    //   2060: goto -> 2066
    //   2063: iconst_0
    //   2064: istore #21
    //   2066: aload_1
    //   2067: iload #20
    //   2069: iload #21
    //   2071: invokevirtual L : (ZZ)V
    //   2074: iload_2
    //   2075: istore_3
    //   2076: iload #19
    //   2078: istore #20
    //   2080: goto -> 2088
    //   2083: iconst_0
    //   2084: istore_3
    //   2085: iconst_0
    //   2086: istore #20
    //   2088: aload #23
    //   2090: astore #22
    //   2092: iload #20
    //   2094: ifeq -> 2106
    //   2097: iload_3
    //   2098: iconst_2
    //   2099: if_icmpeq -> 2105
    //   2102: goto -> 2106
    //   2105: return
    //   2106: aload_1
    //   2107: getfield D0 : I
    //   2110: istore #14
    //   2112: iload #4
    //   2114: ifle -> 2652
    //   2117: aload_1
    //   2118: getfield q0 : Ljava/util/ArrayList;
    //   2121: invokevirtual size : ()I
    //   2124: istore #6
    //   2126: aload_1
    //   2127: bipush #64
    //   2129: invokevirtual S : (I)Z
    //   2132: istore #19
    //   2134: aload_1
    //   2135: getfield u0 : Lhq;
    //   2138: astore #23
    //   2140: iconst_0
    //   2141: istore #5
    //   2143: iload #5
    //   2145: iload #6
    //   2147: if_icmpge -> 2444
    //   2150: aload_1
    //   2151: getfield q0 : Ljava/util/ArrayList;
    //   2154: iload #5
    //   2156: invokevirtual get : (I)Ljava/lang/Object;
    //   2159: checkcast er
    //   2162: astore #28
    //   2164: aload #28
    //   2166: instanceof bf0
    //   2169: ifeq -> 2175
    //   2172: goto -> 2438
    //   2175: aload #28
    //   2177: instanceof yb
    //   2180: ifeq -> 2186
    //   2183: goto -> 2172
    //   2186: aload #28
    //   2188: invokevirtual getClass : ()Ljava/lang/Class;
    //   2191: pop
    //   2192: iload #19
    //   2194: ifeq -> 2246
    //   2197: aload #28
    //   2199: getfield d : Lfg0;
    //   2202: astore #29
    //   2204: aload #29
    //   2206: ifnull -> 2246
    //   2209: aload #28
    //   2211: getfield e : Ld22;
    //   2214: astore #27
    //   2216: aload #27
    //   2218: ifnull -> 2246
    //   2221: aload #29
    //   2223: getfield e : Lrz;
    //   2226: getfield j : Z
    //   2229: ifeq -> 2246
    //   2232: aload #27
    //   2234: getfield e : Lrz;
    //   2237: getfield j : Z
    //   2240: ifeq -> 2246
    //   2243: goto -> 2172
    //   2246: aload #28
    //   2248: iconst_0
    //   2249: invokevirtual h : (I)I
    //   2252: istore #8
    //   2254: aload #28
    //   2256: iconst_1
    //   2257: invokevirtual h : (I)I
    //   2260: istore #7
    //   2262: iload #8
    //   2264: iconst_3
    //   2265: if_icmpne -> 2297
    //   2268: aload #28
    //   2270: getfield r : I
    //   2273: iconst_1
    //   2274: if_icmpeq -> 2297
    //   2277: iload #7
    //   2279: iconst_3
    //   2280: if_icmpne -> 2297
    //   2283: aload #28
    //   2285: getfield s : I
    //   2288: iconst_1
    //   2289: if_icmpeq -> 2297
    //   2292: iconst_1
    //   2293: istore_2
    //   2294: goto -> 2299
    //   2297: iconst_0
    //   2298: istore_2
    //   2299: iload_2
    //   2300: ifne -> 2418
    //   2303: aload_1
    //   2304: iconst_1
    //   2305: invokevirtual S : (I)Z
    //   2308: ifeq -> 2418
    //   2311: iload_2
    //   2312: istore_3
    //   2313: iload #8
    //   2315: iconst_3
    //   2316: if_icmpne -> 2349
    //   2319: iload_2
    //   2320: istore_3
    //   2321: aload #28
    //   2323: getfield r : I
    //   2326: ifne -> 2349
    //   2329: iload_2
    //   2330: istore_3
    //   2331: iload #7
    //   2333: iconst_3
    //   2334: if_icmpeq -> 2349
    //   2337: iload_2
    //   2338: istore_3
    //   2339: aload #28
    //   2341: invokevirtual v : ()Z
    //   2344: ifne -> 2349
    //   2347: iconst_1
    //   2348: istore_3
    //   2349: iload_3
    //   2350: istore_2
    //   2351: iload #7
    //   2353: iconst_3
    //   2354: if_icmpne -> 2387
    //   2357: iload_3
    //   2358: istore_2
    //   2359: aload #28
    //   2361: getfield s : I
    //   2364: ifne -> 2387
    //   2367: iload_3
    //   2368: istore_2
    //   2369: iload #8
    //   2371: iconst_3
    //   2372: if_icmpeq -> 2387
    //   2375: iload_3
    //   2376: istore_2
    //   2377: aload #28
    //   2379: invokevirtual v : ()Z
    //   2382: ifne -> 2387
    //   2385: iconst_1
    //   2386: istore_2
    //   2387: iload #8
    //   2389: iconst_3
    //   2390: if_icmpeq -> 2401
    //   2393: iload_2
    //   2394: istore_3
    //   2395: iload #7
    //   2397: iconst_3
    //   2398: if_icmpne -> 2420
    //   2401: iload_2
    //   2402: istore_3
    //   2403: aload #28
    //   2405: getfield W : F
    //   2408: fconst_0
    //   2409: fcmpl
    //   2410: ifle -> 2420
    //   2413: iconst_1
    //   2414: istore_3
    //   2415: goto -> 2420
    //   2418: iload_2
    //   2419: istore_3
    //   2420: iload_3
    //   2421: ifeq -> 2427
    //   2424: goto -> 2438
    //   2427: aload #24
    //   2429: iconst_0
    //   2430: aload #23
    //   2432: aload #28
    //   2434: invokevirtual j : (ILhq;Ler;)Z
    //   2437: pop
    //   2438: iinc #5, 1
    //   2441: goto -> 2143
    //   2444: aload #23
    //   2446: getfield a : Landroidx/constraintlayout/widget/ConstraintLayout;
    //   2449: astore #23
    //   2451: aload #23
    //   2453: invokevirtual getChildCount : ()I
    //   2456: istore_3
    //   2457: aload #23
    //   2459: getfield c : Ljava/util/ArrayList;
    //   2462: astore #27
    //   2464: iconst_0
    //   2465: istore_2
    //   2466: iload_2
    //   2467: iload_3
    //   2468: if_icmpge -> 2616
    //   2471: aload #23
    //   2473: iload_2
    //   2474: invokevirtual getChildAt : (I)Landroid/view/View;
    //   2477: astore #28
    //   2479: aload #28
    //   2481: instanceof androidx/constraintlayout/widget/Placeholder
    //   2484: ifeq -> 2610
    //   2487: aload #28
    //   2489: checkcast androidx/constraintlayout/widget/Placeholder
    //   2492: astore #28
    //   2494: aload #28
    //   2496: getfield c : Landroid/view/View;
    //   2499: ifnonnull -> 2505
    //   2502: goto -> 2610
    //   2505: aload #28
    //   2507: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   2510: checkcast gq
    //   2513: astore #29
    //   2515: aload #28
    //   2517: getfield c : Landroid/view/View;
    //   2520: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   2523: checkcast gq
    //   2526: astore #28
    //   2528: aload #28
    //   2530: getfield q0 : Ler;
    //   2533: astore #30
    //   2535: aload #30
    //   2537: iconst_0
    //   2538: putfield g0 : I
    //   2541: aload #29
    //   2543: getfield q0 : Ler;
    //   2546: astore #31
    //   2548: aload #31
    //   2550: getfield p0 : [I
    //   2553: iconst_0
    //   2554: iaload
    //   2555: iconst_1
    //   2556: if_icmpeq -> 2569
    //   2559: aload #31
    //   2561: aload #30
    //   2563: invokevirtual o : ()I
    //   2566: invokevirtual K : (I)V
    //   2569: aload #29
    //   2571: getfield q0 : Ler;
    //   2574: astore #29
    //   2576: aload #29
    //   2578: getfield p0 : [I
    //   2581: iconst_1
    //   2582: iaload
    //   2583: iconst_1
    //   2584: if_icmpeq -> 2600
    //   2587: aload #29
    //   2589: aload #28
    //   2591: getfield q0 : Ler;
    //   2594: invokevirtual i : ()I
    //   2597: invokevirtual H : (I)V
    //   2600: aload #28
    //   2602: getfield q0 : Ler;
    //   2605: bipush #8
    //   2607: putfield g0 : I
    //   2610: iinc #2, 1
    //   2613: goto -> 2466
    //   2616: aload #27
    //   2618: invokevirtual size : ()I
    //   2621: istore_3
    //   2622: iload_3
    //   2623: ifle -> 2652
    //   2626: iconst_0
    //   2627: istore_2
    //   2628: iload_2
    //   2629: iload_3
    //   2630: if_icmpge -> 2652
    //   2633: aload #27
    //   2635: iload_2
    //   2636: invokevirtual get : (I)Ljava/lang/Object;
    //   2639: checkcast eq
    //   2642: invokevirtual getClass : ()Ljava/lang/Class;
    //   2645: pop
    //   2646: iinc #2, 1
    //   2649: goto -> 2628
    //   2652: aload #24
    //   2654: aload_1
    //   2655: invokevirtual u : (Lfr;)V
    //   2658: aload #25
    //   2660: invokevirtual size : ()I
    //   2663: istore #8
    //   2665: iload #4
    //   2667: ifle -> 2681
    //   2670: aload #24
    //   2672: aload_1
    //   2673: iconst_0
    //   2674: iload #12
    //   2676: iload #11
    //   2678: invokevirtual t : (Lfr;III)V
    //   2681: iload #8
    //   2683: ifle -> 3187
    //   2686: aload_1
    //   2687: getfield p0 : [I
    //   2690: astore #23
    //   2692: aload #23
    //   2694: iconst_0
    //   2695: iaload
    //   2696: iconst_2
    //   2697: if_icmpne -> 2706
    //   2700: iconst_1
    //   2701: istore #5
    //   2703: goto -> 2712
    //   2706: iconst_0
    //   2707: istore #5
    //   2709: goto -> 2703
    //   2712: aload #23
    //   2714: iconst_1
    //   2715: iaload
    //   2716: iconst_2
    //   2717: if_icmpne -> 2726
    //   2720: iconst_1
    //   2721: istore #6
    //   2723: goto -> 2729
    //   2726: iconst_0
    //   2727: istore #6
    //   2729: aload_1
    //   2730: invokevirtual o : ()I
    //   2733: aload #26
    //   2735: getfield b0 : I
    //   2738: invokestatic max : (II)I
    //   2741: istore_3
    //   2742: aload_1
    //   2743: invokevirtual i : ()I
    //   2746: aload #26
    //   2748: getfield c0 : I
    //   2751: invokestatic max : (II)I
    //   2754: istore #7
    //   2756: iconst_0
    //   2757: istore_2
    //   2758: iload_2
    //   2759: iload #8
    //   2761: if_icmpge -> 2781
    //   2764: aload #25
    //   2766: iload_2
    //   2767: invokevirtual get : (I)Ljava/lang/Object;
    //   2770: checkcast er
    //   2773: astore #23
    //   2775: iinc #2, 1
    //   2778: goto -> 2758
    //   2781: iconst_0
    //   2782: istore_2
    //   2783: iload #8
    //   2785: istore #4
    //   2787: iload_2
    //   2788: iconst_2
    //   2789: if_icmpge -> 3187
    //   2792: iconst_0
    //   2793: istore #10
    //   2795: iconst_0
    //   2796: istore #8
    //   2798: iload_2
    //   2799: istore #9
    //   2801: iload #7
    //   2803: istore_2
    //   2804: iload #10
    //   2806: iload #4
    //   2808: if_icmpge -> 3155
    //   2811: aload #25
    //   2813: iload #10
    //   2815: invokevirtual get : (I)Ljava/lang/Object;
    //   2818: checkcast er
    //   2821: astore #23
    //   2823: aload #23
    //   2825: instanceof yb
    //   2828: ifeq -> 2834
    //   2831: goto -> 2891
    //   2834: aload #23
    //   2836: instanceof bf0
    //   2839: ifeq -> 2845
    //   2842: goto -> 2831
    //   2845: aload #23
    //   2847: getfield g0 : I
    //   2850: bipush #8
    //   2852: if_icmpne -> 2858
    //   2855: goto -> 2891
    //   2858: iload #13
    //   2860: ifeq -> 2894
    //   2863: aload #23
    //   2865: getfield d : Lfg0;
    //   2868: getfield e : Lrz;
    //   2871: getfield j : Z
    //   2874: ifeq -> 2894
    //   2877: aload #23
    //   2879: getfield e : Ld22;
    //   2882: getfield e : Lrz;
    //   2885: getfield j : Z
    //   2888: ifeq -> 2894
    //   2891: goto -> 3149
    //   2894: aload #23
    //   2896: invokevirtual o : ()I
    //   2899: istore #18
    //   2901: aload #23
    //   2903: invokevirtual i : ()I
    //   2906: istore #16
    //   2908: aload #23
    //   2910: getfield a0 : I
    //   2913: istore #15
    //   2915: iconst_1
    //   2916: istore #7
    //   2918: iload #9
    //   2920: iconst_1
    //   2921: if_icmpne -> 2927
    //   2924: iconst_2
    //   2925: istore #7
    //   2927: aload #24
    //   2929: iload #7
    //   2931: aload #22
    //   2933: aload #23
    //   2935: invokevirtual j : (ILhq;Ler;)Z
    //   2938: istore #19
    //   2940: aload #23
    //   2942: invokevirtual o : ()I
    //   2945: istore #7
    //   2947: iload #19
    //   2949: iload #8
    //   2951: ior
    //   2952: istore #8
    //   2954: aload #23
    //   2956: invokevirtual i : ()I
    //   2959: istore #17
    //   2961: iload #7
    //   2963: iload #18
    //   2965: if_icmpeq -> 3038
    //   2968: aload #23
    //   2970: iload #7
    //   2972: invokevirtual K : (I)V
    //   2975: iload #5
    //   2977: ifeq -> 3032
    //   2980: aload #23
    //   2982: invokevirtual p : ()I
    //   2985: aload #23
    //   2987: getfield U : I
    //   2990: iadd
    //   2991: iload_3
    //   2992: if_icmple -> 3032
    //   2995: aload #23
    //   2997: invokevirtual p : ()I
    //   3000: istore #8
    //   3002: aload #23
    //   3004: getfield U : I
    //   3007: istore #7
    //   3009: iload_3
    //   3010: aload #23
    //   3012: iconst_4
    //   3013: invokevirtual g : (I)Lbq;
    //   3016: invokevirtual d : ()I
    //   3019: iload #8
    //   3021: iload #7
    //   3023: iadd
    //   3024: iadd
    //   3025: invokestatic max : (II)I
    //   3028: istore_3
    //   3029: goto -> 3032
    //   3032: iconst_1
    //   3033: istore #8
    //   3035: goto -> 3038
    //   3038: iload_2
    //   3039: istore #7
    //   3041: iload #17
    //   3043: iload #16
    //   3045: if_icmpeq -> 3119
    //   3048: aload #23
    //   3050: iload #17
    //   3052: invokevirtual H : (I)V
    //   3055: iload_2
    //   3056: istore #7
    //   3058: iload #6
    //   3060: ifeq -> 3116
    //   3063: iload_2
    //   3064: istore #7
    //   3066: aload #23
    //   3068: invokevirtual q : ()I
    //   3071: aload #23
    //   3073: getfield V : I
    //   3076: iadd
    //   3077: iload_2
    //   3078: if_icmple -> 3116
    //   3081: aload #23
    //   3083: invokevirtual q : ()I
    //   3086: istore #7
    //   3088: aload #23
    //   3090: getfield V : I
    //   3093: istore #8
    //   3095: iload_2
    //   3096: aload #23
    //   3098: iconst_5
    //   3099: invokevirtual g : (I)Lbq;
    //   3102: invokevirtual d : ()I
    //   3105: iload #7
    //   3107: iload #8
    //   3109: iadd
    //   3110: iadd
    //   3111: invokestatic max : (II)I
    //   3114: istore #7
    //   3116: iconst_1
    //   3117: istore #8
    //   3119: aload #23
    //   3121: getfield E : Z
    //   3124: ifeq -> 3146
    //   3127: iload #15
    //   3129: aload #23
    //   3131: getfield a0 : I
    //   3134: if_icmpeq -> 3146
    //   3137: iconst_1
    //   3138: istore #8
    //   3140: iload #7
    //   3142: istore_2
    //   3143: goto -> 3149
    //   3146: iload #7
    //   3148: istore_2
    //   3149: iinc #10, 1
    //   3152: goto -> 2804
    //   3155: iload #8
    //   3157: ifeq -> 3187
    //   3160: iload #9
    //   3162: iconst_1
    //   3163: iadd
    //   3164: istore #8
    //   3166: aload #24
    //   3168: aload_1
    //   3169: iload #8
    //   3171: iload #12
    //   3173: iload #11
    //   3175: invokevirtual t : (Lfr;III)V
    //   3178: iload_2
    //   3179: istore #7
    //   3181: iload #8
    //   3183: istore_2
    //   3184: goto -> 2787
    //   3187: aload_1
    //   3188: iload #14
    //   3190: putfield D0 : I
    //   3193: aload_1
    //   3194: sipush #512
    //   3197: invokevirtual S : (I)Z
    //   3200: putstatic ln0.q : Z
    //   3203: return
  }
  
  public final void k(er paramer, gq paramgq, SparseArray paramSparseArray, int paramInt1, int paramInt2) {
    View view = (View)this.b.get(paramInt1);
    er er1 = (er)paramSparseArray.get(paramInt1);
    if (er1 != null && view != null && view.getLayoutParams() instanceof gq) {
      paramgq.c0 = true;
      if (paramInt2 == 6) {
        gq gq1 = (gq)view.getLayoutParams();
        gq1.c0 = true;
        gq1.q0.E = true;
      } 
      paramer.g(6).a(er1.g(paramInt2), paramgq.D, paramgq.C);
      paramer.E = true;
      paramer.g(3).g();
      paramer.g(5).g();
    } 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = getChildCount();
    paramBoolean = isInEditMode();
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      View view = getChildAt(paramInt1);
      gq gq = (gq)view.getLayoutParams();
      er er = gq.q0;
      if ((view.getVisibility() != 8 || gq.d0 || gq.e0 || paramBoolean) && !gq.f0) {
        paramInt4 = er.p();
        int j = er.q();
        int i = er.o() + paramInt4;
        int k = er.i() + j;
        view.layout(paramInt4, j, i, k);
        if (view instanceof Placeholder) {
          View view1 = ((Placeholder)view).getContent();
          if (view1 != null) {
            view1.setVisibility(0);
            view1.layout(paramInt4, j, i, k);
          } 
        } 
      } 
    } 
    ArrayList<eq> arrayList = this.c;
    paramInt3 = arrayList.size();
    if (paramInt3 > 0)
      for (paramInt1 = paramInt2; paramInt1 < paramInt3; paramInt1++)
        ((eq)arrayList.get(paramInt1)).i();  
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: astore #20
    //   3: aload #20
    //   5: getfield j : Z
    //   8: istore #16
    //   10: aload #20
    //   12: iload #16
    //   14: putfield j : Z
    //   17: iconst_1
    //   18: istore #18
    //   20: iconst_1
    //   21: istore #17
    //   23: iload #16
    //   25: ifne -> 73
    //   28: aload #20
    //   30: invokevirtual getChildCount : ()I
    //   33: istore #6
    //   35: iconst_0
    //   36: istore #5
    //   38: iload #5
    //   40: iload #6
    //   42: if_icmpge -> 73
    //   45: aload #20
    //   47: iload #5
    //   49: invokevirtual getChildAt : (I)Landroid/view/View;
    //   52: invokevirtual isLayoutRequested : ()Z
    //   55: ifeq -> 67
    //   58: aload #20
    //   60: iconst_1
    //   61: putfield j : Z
    //   64: goto -> 73
    //   67: iinc #5, 1
    //   70: goto -> 38
    //   73: aload #20
    //   75: invokevirtual getContext : ()Landroid/content/Context;
    //   78: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   81: getfield flags : I
    //   84: ldc_w 4194304
    //   87: iand
    //   88: ifeq -> 106
    //   91: iconst_1
    //   92: aload #20
    //   94: invokevirtual getLayoutDirection : ()I
    //   97: if_icmpne -> 106
    //   100: iconst_1
    //   101: istore #16
    //   103: goto -> 109
    //   106: iconst_0
    //   107: istore #16
    //   109: aload #20
    //   111: getfield e : Lfr;
    //   114: astore #24
    //   116: aload #24
    //   118: iload #16
    //   120: putfield v0 : Z
    //   123: aload #20
    //   125: astore #21
    //   127: aload #20
    //   129: getfield j : Z
    //   132: ifeq -> 3036
    //   135: aload #20
    //   137: iconst_0
    //   138: putfield j : Z
    //   141: aload #20
    //   143: invokevirtual getChildCount : ()I
    //   146: istore #6
    //   148: iconst_0
    //   149: istore #5
    //   151: iload #5
    //   153: iload #6
    //   155: if_icmpge -> 183
    //   158: aload #20
    //   160: iload #5
    //   162: invokevirtual getChildAt : (I)Landroid/view/View;
    //   165: invokevirtual isLayoutRequested : ()Z
    //   168: ifeq -> 177
    //   171: iconst_1
    //   172: istore #5
    //   174: goto -> 186
    //   177: iinc #5, 1
    //   180: goto -> 151
    //   183: iconst_0
    //   184: istore #5
    //   186: aload #20
    //   188: astore #22
    //   190: iload #5
    //   192: istore #9
    //   194: iload #5
    //   196: ifeq -> 3013
    //   199: aload #20
    //   201: invokevirtual isInEditMode : ()Z
    //   204: istore #19
    //   206: aload #20
    //   208: invokevirtual getChildCount : ()I
    //   211: istore #10
    //   213: iconst_0
    //   214: istore #6
    //   216: iload #6
    //   218: iload #10
    //   220: if_icmpge -> 256
    //   223: aload #20
    //   225: aload #20
    //   227: iload #6
    //   229: invokevirtual getChildAt : (I)Landroid/view/View;
    //   232: invokevirtual g : (Landroid/view/View;)Ler;
    //   235: astore #21
    //   237: aload #21
    //   239: ifnonnull -> 245
    //   242: goto -> 250
    //   245: aload #21
    //   247: invokevirtual A : ()V
    //   250: iinc #6, 1
    //   253: goto -> 216
    //   256: aload #20
    //   258: getfield b : Landroid/util/SparseArray;
    //   261: astore #23
    //   263: iload #18
    //   265: istore #16
    //   267: iload #19
    //   269: ifeq -> 576
    //   272: iconst_0
    //   273: istore #6
    //   275: iload #17
    //   277: istore #16
    //   279: iload #6
    //   281: iload #10
    //   283: if_icmpge -> 576
    //   286: aload #20
    //   288: iload #6
    //   290: invokevirtual getChildAt : (I)Landroid/view/View;
    //   293: astore #25
    //   295: aload #20
    //   297: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   300: aload #25
    //   302: invokevirtual getId : ()I
    //   305: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   308: astore #21
    //   310: aload #25
    //   312: invokevirtual getId : ()I
    //   315: istore #7
    //   317: aload #21
    //   319: ifnull -> 400
    //   322: aload #20
    //   324: getfield o : Ljava/util/HashMap;
    //   327: ifnonnull -> 347
    //   330: new java/util/HashMap
    //   333: astore #22
    //   335: aload #22
    //   337: invokespecial <init> : ()V
    //   340: aload #20
    //   342: aload #22
    //   344: putfield o : Ljava/util/HashMap;
    //   347: aload #21
    //   349: ldc_w '/'
    //   352: invokevirtual indexOf : (Ljava/lang/String;)I
    //   355: istore #8
    //   357: iload #8
    //   359: iconst_m1
    //   360: if_icmpeq -> 377
    //   363: aload #21
    //   365: iload #8
    //   367: iconst_1
    //   368: iadd
    //   369: invokevirtual substring : (I)Ljava/lang/String;
    //   372: astore #22
    //   374: goto -> 381
    //   377: aload #21
    //   379: astore #22
    //   381: aload #20
    //   383: getfield o : Ljava/util/HashMap;
    //   386: aload #22
    //   388: iload #7
    //   390: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   393: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   396: pop
    //   397: goto -> 400
    //   400: aload #21
    //   402: bipush #47
    //   404: invokevirtual indexOf : (I)I
    //   407: istore #7
    //   409: aload #21
    //   411: astore #22
    //   413: iload #7
    //   415: iconst_m1
    //   416: if_icmpeq -> 430
    //   419: aload #21
    //   421: iload #7
    //   423: iconst_1
    //   424: iadd
    //   425: invokevirtual substring : (I)Ljava/lang/String;
    //   428: astore #22
    //   430: aload #25
    //   432: invokevirtual getId : ()I
    //   435: istore #7
    //   437: iload #7
    //   439: ifne -> 449
    //   442: aload #24
    //   444: astore #21
    //   446: goto -> 558
    //   449: aload #23
    //   451: iload #7
    //   453: invokevirtual get : (I)Ljava/lang/Object;
    //   456: checkcast android/view/View
    //   459: astore #25
    //   461: aload #25
    //   463: astore #21
    //   465: aload #25
    //   467: ifnonnull -> 524
    //   470: aload #20
    //   472: iload #7
    //   474: invokevirtual findViewById : (I)Landroid/view/View;
    //   477: astore #25
    //   479: aload #25
    //   481: astore #21
    //   483: aload #25
    //   485: ifnull -> 524
    //   488: aload #25
    //   490: astore #21
    //   492: aload #25
    //   494: aload #20
    //   496: if_acmpeq -> 524
    //   499: aload #25
    //   501: astore #21
    //   503: aload #25
    //   505: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   508: aload #20
    //   510: if_acmpne -> 524
    //   513: aload #20
    //   515: aload #25
    //   517: invokevirtual onViewAdded : (Landroid/view/View;)V
    //   520: aload #25
    //   522: astore #21
    //   524: aload #21
    //   526: aload #20
    //   528: if_acmpne -> 534
    //   531: goto -> 442
    //   534: aload #21
    //   536: ifnonnull -> 545
    //   539: aconst_null
    //   540: astore #21
    //   542: goto -> 558
    //   545: aload #21
    //   547: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   550: checkcast gq
    //   553: getfield q0 : Ler;
    //   556: astore #21
    //   558: aload #21
    //   560: aload #22
    //   562: putfield h0 : Ljava/lang/String;
    //   565: goto -> 570
    //   568: astore #21
    //   570: iinc #6, 1
    //   573: goto -> 275
    //   576: aload #20
    //   578: getfield n : I
    //   581: iconst_m1
    //   582: if_icmpeq -> 612
    //   585: iconst_0
    //   586: istore #6
    //   588: iload #6
    //   590: iload #10
    //   592: if_icmpge -> 612
    //   595: aload #20
    //   597: iload #6
    //   599: invokevirtual getChildAt : (I)Landroid/view/View;
    //   602: invokevirtual getId : ()I
    //   605: pop
    //   606: iinc #6, 1
    //   609: goto -> 588
    //   612: aload #20
    //   614: getfield l : Lpq;
    //   617: astore #21
    //   619: aload #21
    //   621: ifnull -> 631
    //   624: aload #21
    //   626: aload #20
    //   628: invokevirtual b : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   631: aload #24
    //   633: getfield q0 : Ljava/util/ArrayList;
    //   636: invokevirtual clear : ()V
    //   639: aload #20
    //   641: getfield c : Ljava/util/ArrayList;
    //   644: astore #21
    //   646: aload #21
    //   648: invokevirtual size : ()I
    //   651: istore #8
    //   653: iload #8
    //   655: ifle -> 992
    //   658: iconst_0
    //   659: istore #6
    //   661: aload #23
    //   663: astore #22
    //   665: iload #6
    //   667: iload #8
    //   669: if_icmpge -> 992
    //   672: aload #21
    //   674: iload #6
    //   676: invokevirtual get : (I)Ljava/lang/Object;
    //   679: checkcast eq
    //   682: astore #25
    //   684: aload #25
    //   686: getfield i : Ljava/util/HashMap;
    //   689: astore #26
    //   691: aload #25
    //   693: invokevirtual isInEditMode : ()Z
    //   696: ifeq -> 712
    //   699: aload #25
    //   701: aload #25
    //   703: getfield g : Ljava/lang/String;
    //   706: invokevirtual setIds : (Ljava/lang/String;)V
    //   709: goto -> 712
    //   712: aload #25
    //   714: getfield f : Lyb;
    //   717: astore #23
    //   719: aload #23
    //   721: ifnonnull -> 727
    //   724: goto -> 986
    //   727: aload #23
    //   729: iconst_0
    //   730: putfield r0 : I
    //   733: aload #23
    //   735: getfield q0 : [Ler;
    //   738: aconst_null
    //   739: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
    //   742: iconst_0
    //   743: istore #7
    //   745: iload #7
    //   747: aload #25
    //   749: getfield c : I
    //   752: if_icmpge -> 977
    //   755: aload #25
    //   757: getfield b : [I
    //   760: iload #7
    //   762: iaload
    //   763: istore #9
    //   765: aload #22
    //   767: iload #9
    //   769: invokevirtual get : (I)Ljava/lang/Object;
    //   772: checkcast android/view/View
    //   775: astore #23
    //   777: aload #23
    //   779: ifnonnull -> 851
    //   782: aload #26
    //   784: iload #9
    //   786: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   789: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   792: checkcast java/lang/String
    //   795: astore #27
    //   797: aload #25
    //   799: aload #20
    //   801: aload #27
    //   803: invokevirtual f : (Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I
    //   806: istore #9
    //   808: iload #9
    //   810: ifeq -> 851
    //   813: aload #25
    //   815: getfield b : [I
    //   818: iload #7
    //   820: iload #9
    //   822: iastore
    //   823: aload #26
    //   825: iload #9
    //   827: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   830: aload #27
    //   832: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   835: pop
    //   836: aload #22
    //   838: iload #9
    //   840: invokevirtual get : (I)Ljava/lang/Object;
    //   843: checkcast android/view/View
    //   846: astore #23
    //   848: goto -> 854
    //   851: goto -> 848
    //   854: aload #23
    //   856: ifnull -> 971
    //   859: aload #25
    //   861: getfield f : Lyb;
    //   864: astore #27
    //   866: aload #20
    //   868: aload #23
    //   870: invokevirtual g : (Landroid/view/View;)Ler;
    //   873: astore #23
    //   875: aload #27
    //   877: invokevirtual getClass : ()Ljava/lang/Class;
    //   880: pop
    //   881: aload #23
    //   883: aload #27
    //   885: if_acmpeq -> 971
    //   888: aload #23
    //   890: ifnonnull -> 896
    //   893: goto -> 971
    //   896: aload #27
    //   898: getfield r0 : I
    //   901: istore #9
    //   903: aload #27
    //   905: getfield q0 : [Ler;
    //   908: astore #28
    //   910: iload #9
    //   912: iconst_1
    //   913: iadd
    //   914: aload #28
    //   916: arraylength
    //   917: if_icmple -> 938
    //   920: aload #27
    //   922: aload #28
    //   924: aload #28
    //   926: arraylength
    //   927: iconst_2
    //   928: imul
    //   929: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   932: checkcast [Ler;
    //   935: putfield q0 : [Ler;
    //   938: aload #27
    //   940: getfield q0 : [Ler;
    //   943: astore #28
    //   945: aload #27
    //   947: getfield r0 : I
    //   950: istore #9
    //   952: aload #28
    //   954: iload #9
    //   956: aload #23
    //   958: aastore
    //   959: aload #27
    //   961: iload #9
    //   963: iconst_1
    //   964: iadd
    //   965: putfield r0 : I
    //   968: goto -> 971
    //   971: iinc #7, 1
    //   974: goto -> 745
    //   977: aload #25
    //   979: getfield f : Lyb;
    //   982: invokevirtual getClass : ()Ljava/lang/Class;
    //   985: pop
    //   986: iinc #6, 1
    //   989: goto -> 665
    //   992: iconst_2
    //   993: istore #7
    //   995: iconst_0
    //   996: istore #6
    //   998: iload #6
    //   1000: iload #10
    //   1002: if_icmpge -> 1120
    //   1005: aload #20
    //   1007: iload #6
    //   1009: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1012: astore #21
    //   1014: aload #21
    //   1016: instanceof androidx/constraintlayout/widget/Placeholder
    //   1019: ifeq -> 1111
    //   1022: aload #21
    //   1024: checkcast androidx/constraintlayout/widget/Placeholder
    //   1027: astore #22
    //   1029: aload #22
    //   1031: getfield b : I
    //   1034: iconst_m1
    //   1035: if_icmpne -> 1056
    //   1038: aload #22
    //   1040: invokevirtual isInEditMode : ()Z
    //   1043: ifne -> 1056
    //   1046: aload #22
    //   1048: aload #22
    //   1050: getfield e : I
    //   1053: invokevirtual setVisibility : (I)V
    //   1056: aload #20
    //   1058: aload #22
    //   1060: getfield b : I
    //   1063: invokevirtual findViewById : (I)Landroid/view/View;
    //   1066: astore #21
    //   1068: aload #22
    //   1070: aload #21
    //   1072: putfield c : Landroid/view/View;
    //   1075: aload #21
    //   1077: ifnull -> 1111
    //   1080: aload #21
    //   1082: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1085: checkcast gq
    //   1088: iload #16
    //   1090: putfield f0 : Z
    //   1093: aload #22
    //   1095: getfield c : Landroid/view/View;
    //   1098: iconst_0
    //   1099: invokevirtual setVisibility : (I)V
    //   1102: aload #22
    //   1104: iconst_0
    //   1105: invokevirtual setVisibility : (I)V
    //   1108: goto -> 1111
    //   1111: iinc #6, 1
    //   1114: iconst_1
    //   1115: istore #16
    //   1117: goto -> 998
    //   1120: aload #20
    //   1122: getfield p : Landroid/util/SparseArray;
    //   1125: astore #23
    //   1127: aload #23
    //   1129: invokevirtual clear : ()V
    //   1132: aload #23
    //   1134: iconst_0
    //   1135: aload #24
    //   1137: invokevirtual put : (ILjava/lang/Object;)V
    //   1140: aload #23
    //   1142: aload #20
    //   1144: invokevirtual getId : ()I
    //   1147: aload #24
    //   1149: invokevirtual put : (ILjava/lang/Object;)V
    //   1152: iconst_0
    //   1153: istore #6
    //   1155: iload #6
    //   1157: iload #10
    //   1159: if_icmpge -> 1198
    //   1162: aload #20
    //   1164: iload #6
    //   1166: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1169: astore #21
    //   1171: aload #20
    //   1173: aload #21
    //   1175: invokevirtual g : (Landroid/view/View;)Ler;
    //   1178: astore #22
    //   1180: aload #23
    //   1182: aload #21
    //   1184: invokevirtual getId : ()I
    //   1187: aload #22
    //   1189: invokevirtual put : (ILjava/lang/Object;)V
    //   1192: iinc #6, 1
    //   1195: goto -> 1155
    //   1198: iconst_0
    //   1199: istore #8
    //   1201: iload #5
    //   1203: istore #6
    //   1205: aload #20
    //   1207: astore #21
    //   1209: aload #21
    //   1211: astore #22
    //   1213: iload #6
    //   1215: istore #9
    //   1217: iload #8
    //   1219: iload #10
    //   1221: if_icmpge -> 3013
    //   1224: aload #21
    //   1226: iload #8
    //   1228: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1231: astore #26
    //   1233: aload #21
    //   1235: aload #26
    //   1237: invokevirtual g : (Landroid/view/View;)Ler;
    //   1240: astore #20
    //   1242: aload #20
    //   1244: ifnonnull -> 1258
    //   1247: iload #7
    //   1249: istore #5
    //   1251: aload #21
    //   1253: astore #20
    //   1255: goto -> 2999
    //   1258: aload #26
    //   1260: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1263: checkcast gq
    //   1266: astore #22
    //   1268: aload #24
    //   1270: getfield q0 : Ljava/util/ArrayList;
    //   1273: aload #20
    //   1275: invokevirtual add : (Ljava/lang/Object;)Z
    //   1278: pop
    //   1279: aload #20
    //   1281: getfield T : Ler;
    //   1284: astore #25
    //   1286: aload #25
    //   1288: ifnull -> 1310
    //   1291: aload #25
    //   1293: checkcast fr
    //   1296: getfield q0 : Ljava/util/ArrayList;
    //   1299: aload #20
    //   1301: invokevirtual remove : (Ljava/lang/Object;)Z
    //   1304: pop
    //   1305: aload #20
    //   1307: invokevirtual A : ()V
    //   1310: aload #20
    //   1312: aload #24
    //   1314: putfield T : Ler;
    //   1317: aload #22
    //   1319: invokevirtual a : ()V
    //   1322: aload #20
    //   1324: aload #26
    //   1326: invokevirtual getVisibility : ()I
    //   1329: putfield g0 : I
    //   1332: aload #22
    //   1334: getfield f0 : Z
    //   1337: ifeq -> 1353
    //   1340: aload #20
    //   1342: iconst_1
    //   1343: putfield F : Z
    //   1346: aload #20
    //   1348: bipush #8
    //   1350: putfield g0 : I
    //   1353: aload #20
    //   1355: aload #26
    //   1357: putfield f0 : Landroid/view/View;
    //   1360: aload #26
    //   1362: instanceof eq
    //   1365: ifeq -> 1383
    //   1368: aload #26
    //   1370: checkcast eq
    //   1373: aload #20
    //   1375: aload #24
    //   1377: getfield v0 : Z
    //   1380: invokevirtual h : (Ler;Z)V
    //   1383: aload #22
    //   1385: getfield d0 : Z
    //   1388: ifeq -> 1525
    //   1391: aload #20
    //   1393: checkcast bf0
    //   1396: astore #20
    //   1398: aload #22
    //   1400: getfield n0 : I
    //   1403: istore #9
    //   1405: aload #22
    //   1407: getfield o0 : I
    //   1410: istore #11
    //   1412: aload #22
    //   1414: getfield p0 : F
    //   1417: fstore_3
    //   1418: fload_3
    //   1419: ldc -1.0
    //   1421: fcmpl
    //   1422: istore #5
    //   1424: iload #5
    //   1426: ifeq -> 1455
    //   1429: iload #5
    //   1431: ifle -> 1247
    //   1434: aload #20
    //   1436: fload_3
    //   1437: putfield q0 : F
    //   1440: aload #20
    //   1442: iconst_m1
    //   1443: putfield r0 : I
    //   1446: aload #20
    //   1448: iconst_m1
    //   1449: putfield s0 : I
    //   1452: goto -> 1487
    //   1455: iload #9
    //   1457: iconst_m1
    //   1458: if_icmpeq -> 1490
    //   1461: iload #9
    //   1463: iconst_m1
    //   1464: if_icmple -> 1487
    //   1467: aload #20
    //   1469: ldc -1.0
    //   1471: putfield q0 : F
    //   1474: aload #20
    //   1476: iload #9
    //   1478: putfield r0 : I
    //   1481: aload #20
    //   1483: iconst_m1
    //   1484: putfield s0 : I
    //   1487: goto -> 1247
    //   1490: iload #11
    //   1492: iconst_m1
    //   1493: if_icmpeq -> 1487
    //   1496: iload #11
    //   1498: iconst_m1
    //   1499: if_icmple -> 1487
    //   1502: aload #20
    //   1504: ldc -1.0
    //   1506: putfield q0 : F
    //   1509: aload #20
    //   1511: iconst_m1
    //   1512: putfield r0 : I
    //   1515: aload #20
    //   1517: iload #11
    //   1519: putfield s0 : I
    //   1522: goto -> 1247
    //   1525: aload #22
    //   1527: getfield g0 : I
    //   1530: istore #12
    //   1532: aload #22
    //   1534: getfield h0 : I
    //   1537: istore #14
    //   1539: aload #22
    //   1541: getfield i0 : I
    //   1544: istore #11
    //   1546: aload #22
    //   1548: getfield j0 : I
    //   1551: istore #5
    //   1553: aload #22
    //   1555: getfield k0 : I
    //   1558: istore #15
    //   1560: aload #22
    //   1562: getfield l0 : I
    //   1565: istore #9
    //   1567: aload #22
    //   1569: getfield m0 : F
    //   1572: fstore_3
    //   1573: aload #22
    //   1575: getfield p : I
    //   1578: istore #13
    //   1580: iload #13
    //   1582: iconst_m1
    //   1583: if_icmpeq -> 1642
    //   1586: aload #23
    //   1588: iload #13
    //   1590: invokevirtual get : (I)Ljava/lang/Object;
    //   1593: checkcast er
    //   1596: astore #21
    //   1598: aload #21
    //   1600: ifnull -> 1632
    //   1603: aload #22
    //   1605: getfield r : F
    //   1608: fstore_3
    //   1609: aload #20
    //   1611: bipush #7
    //   1613: bipush #7
    //   1615: aload #22
    //   1617: getfield q : I
    //   1620: iconst_0
    //   1621: aload #21
    //   1623: invokevirtual t : (IIIILer;)V
    //   1626: aload #20
    //   1628: fload_3
    //   1629: putfield D : F
    //   1632: aload #20
    //   1634: astore #21
    //   1636: iconst_2
    //   1637: istore #5
    //   1639: goto -> 2157
    //   1642: iload #12
    //   1644: iconst_m1
    //   1645: if_icmpeq -> 1687
    //   1648: aload #23
    //   1650: iload #12
    //   1652: invokevirtual get : (I)Ljava/lang/Object;
    //   1655: checkcast er
    //   1658: astore #21
    //   1660: aload #21
    //   1662: ifnull -> 1684
    //   1665: aload #20
    //   1667: iconst_2
    //   1668: iconst_2
    //   1669: aload #22
    //   1671: getfield leftMargin : I
    //   1674: iload #15
    //   1676: aload #21
    //   1678: invokevirtual t : (IIIILer;)V
    //   1681: goto -> 1684
    //   1684: goto -> 1729
    //   1687: iload #14
    //   1689: iconst_m1
    //   1690: if_icmpeq -> 1684
    //   1693: aload #23
    //   1695: iload #14
    //   1697: invokevirtual get : (I)Ljava/lang/Object;
    //   1700: checkcast er
    //   1703: astore #21
    //   1705: aload #21
    //   1707: ifnull -> 1684
    //   1710: aload #20
    //   1712: iconst_2
    //   1713: iconst_4
    //   1714: aload #22
    //   1716: getfield leftMargin : I
    //   1719: iload #15
    //   1721: aload #21
    //   1723: invokevirtual t : (IIIILer;)V
    //   1726: iconst_2
    //   1727: istore #12
    //   1729: iload #11
    //   1731: iconst_m1
    //   1732: if_icmpeq -> 1774
    //   1735: aload #23
    //   1737: iload #11
    //   1739: invokevirtual get : (I)Ljava/lang/Object;
    //   1742: checkcast er
    //   1745: astore #21
    //   1747: aload #21
    //   1749: ifnull -> 1768
    //   1752: aload #20
    //   1754: iconst_4
    //   1755: iconst_2
    //   1756: aload #22
    //   1758: getfield rightMargin : I
    //   1761: iload #9
    //   1763: aload #21
    //   1765: invokevirtual t : (IIIILer;)V
    //   1768: iconst_2
    //   1769: istore #9
    //   1771: goto -> 1816
    //   1774: iload #5
    //   1776: iconst_m1
    //   1777: if_icmpeq -> 1768
    //   1780: aload #23
    //   1782: iload #5
    //   1784: invokevirtual get : (I)Ljava/lang/Object;
    //   1787: checkcast er
    //   1790: astore #21
    //   1792: aload #21
    //   1794: ifnull -> 1768
    //   1797: aload #20
    //   1799: iconst_4
    //   1800: iconst_4
    //   1801: aload #22
    //   1803: getfield rightMargin : I
    //   1806: iload #9
    //   1808: aload #21
    //   1810: invokevirtual t : (IIIILer;)V
    //   1813: goto -> 1768
    //   1816: aload #22
    //   1818: getfield i : I
    //   1821: istore #5
    //   1823: iload #5
    //   1825: iconst_m1
    //   1826: if_icmpeq -> 1871
    //   1829: aload #23
    //   1831: iload #5
    //   1833: invokevirtual get : (I)Ljava/lang/Object;
    //   1836: checkcast er
    //   1839: astore #21
    //   1841: aload #21
    //   1843: ifnull -> 1868
    //   1846: aload #20
    //   1848: iconst_3
    //   1849: iconst_3
    //   1850: aload #22
    //   1852: getfield topMargin : I
    //   1855: aload #22
    //   1857: getfield x : I
    //   1860: aload #21
    //   1862: invokevirtual t : (IIIILer;)V
    //   1865: goto -> 1868
    //   1868: goto -> 1923
    //   1871: aload #22
    //   1873: getfield j : I
    //   1876: istore #5
    //   1878: iload #5
    //   1880: iconst_m1
    //   1881: if_icmpeq -> 1923
    //   1884: aload #23
    //   1886: iload #5
    //   1888: invokevirtual get : (I)Ljava/lang/Object;
    //   1891: checkcast er
    //   1894: astore #21
    //   1896: aload #21
    //   1898: ifnull -> 1923
    //   1901: aload #20
    //   1903: iconst_3
    //   1904: iconst_5
    //   1905: aload #22
    //   1907: getfield topMargin : I
    //   1910: aload #22
    //   1912: getfield x : I
    //   1915: aload #21
    //   1917: invokevirtual t : (IIIILer;)V
    //   1920: goto -> 1923
    //   1923: aload #22
    //   1925: getfield k : I
    //   1928: istore #5
    //   1930: iload #5
    //   1932: iconst_m1
    //   1933: if_icmpeq -> 1978
    //   1936: aload #23
    //   1938: iload #5
    //   1940: invokevirtual get : (I)Ljava/lang/Object;
    //   1943: checkcast er
    //   1946: astore #21
    //   1948: aload #21
    //   1950: ifnull -> 1975
    //   1953: aload #20
    //   1955: iconst_5
    //   1956: iconst_3
    //   1957: aload #22
    //   1959: getfield bottomMargin : I
    //   1962: aload #22
    //   1964: getfield z : I
    //   1967: aload #21
    //   1969: invokevirtual t : (IIIILer;)V
    //   1972: goto -> 1975
    //   1975: goto -> 2030
    //   1978: aload #22
    //   1980: getfield l : I
    //   1983: istore #5
    //   1985: iload #5
    //   1987: iconst_m1
    //   1988: if_icmpeq -> 1975
    //   1991: aload #23
    //   1993: iload #5
    //   1995: invokevirtual get : (I)Ljava/lang/Object;
    //   1998: checkcast er
    //   2001: astore #21
    //   2003: aload #21
    //   2005: ifnull -> 1975
    //   2008: aload #20
    //   2010: iconst_5
    //   2011: iconst_5
    //   2012: aload #22
    //   2014: getfield bottomMargin : I
    //   2017: aload #22
    //   2019: getfield z : I
    //   2022: aload #21
    //   2024: invokevirtual t : (IIIILer;)V
    //   2027: goto -> 1975
    //   2030: aload #22
    //   2032: getfield m : I
    //   2035: istore #5
    //   2037: iload #5
    //   2039: iconst_m1
    //   2040: if_icmpeq -> 2060
    //   2043: aload_0
    //   2044: aload #20
    //   2046: aload #22
    //   2048: aload #23
    //   2050: iload #5
    //   2052: bipush #6
    //   2054: invokevirtual k : (Ler;Lgq;Landroid/util/SparseArray;II)V
    //   2057: goto -> 2115
    //   2060: aload #22
    //   2062: getfield n : I
    //   2065: istore #5
    //   2067: iload #5
    //   2069: iconst_m1
    //   2070: if_icmpeq -> 2089
    //   2073: aload_0
    //   2074: aload #20
    //   2076: aload #22
    //   2078: aload #23
    //   2080: iload #5
    //   2082: iconst_3
    //   2083: invokevirtual k : (Ler;Lgq;Landroid/util/SparseArray;II)V
    //   2086: goto -> 2057
    //   2089: aload #22
    //   2091: getfield o : I
    //   2094: istore #5
    //   2096: iload #5
    //   2098: iconst_m1
    //   2099: if_icmpeq -> 2115
    //   2102: aload_0
    //   2103: aload #20
    //   2105: aload #22
    //   2107: aload #23
    //   2109: iload #5
    //   2111: iconst_5
    //   2112: invokevirtual k : (Ler;Lgq;Landroid/util/SparseArray;II)V
    //   2115: aload #20
    //   2117: astore #21
    //   2119: fload_3
    //   2120: fconst_0
    //   2121: fcmpl
    //   2122: iflt -> 2131
    //   2125: aload #21
    //   2127: fload_3
    //   2128: putfield d0 : F
    //   2131: aload #22
    //   2133: getfield F : F
    //   2136: fstore_3
    //   2137: iload #9
    //   2139: istore #5
    //   2141: fload_3
    //   2142: fconst_0
    //   2143: fcmpl
    //   2144: iflt -> 2157
    //   2147: aload #21
    //   2149: fload_3
    //   2150: putfield e0 : F
    //   2153: iload #9
    //   2155: istore #5
    //   2157: aload #20
    //   2159: astore #21
    //   2161: aload_0
    //   2162: astore #20
    //   2164: iload #19
    //   2166: ifeq -> 2212
    //   2169: aload #22
    //   2171: getfield T : I
    //   2174: istore #11
    //   2176: iload #11
    //   2178: iconst_m1
    //   2179: if_icmpne -> 2191
    //   2182: aload #22
    //   2184: getfield U : I
    //   2187: iconst_m1
    //   2188: if_icmpeq -> 2212
    //   2191: aload #22
    //   2193: getfield U : I
    //   2196: istore #9
    //   2198: aload #21
    //   2200: iload #11
    //   2202: putfield Y : I
    //   2205: aload #21
    //   2207: iload #9
    //   2209: putfield Z : I
    //   2212: aload #22
    //   2214: getfield a0 : Z
    //   2217: ifne -> 2299
    //   2220: aload #22
    //   2222: getfield width : I
    //   2225: iconst_m1
    //   2226: if_icmpne -> 2284
    //   2229: aload #22
    //   2231: getfield W : Z
    //   2234: ifeq -> 2246
    //   2237: aload #21
    //   2239: iconst_3
    //   2240: invokevirtual I : (I)V
    //   2243: goto -> 2252
    //   2246: aload #21
    //   2248: iconst_4
    //   2249: invokevirtual I : (I)V
    //   2252: aload #21
    //   2254: iload #5
    //   2256: invokevirtual g : (I)Lbq;
    //   2259: aload #22
    //   2261: getfield leftMargin : I
    //   2264: putfield g : I
    //   2267: aload #21
    //   2269: iconst_4
    //   2270: invokevirtual g : (I)Lbq;
    //   2273: aload #22
    //   2275: getfield rightMargin : I
    //   2278: putfield g : I
    //   2281: goto -> 2332
    //   2284: aload #21
    //   2286: iconst_3
    //   2287: invokevirtual I : (I)V
    //   2290: aload #21
    //   2292: iconst_0
    //   2293: invokevirtual K : (I)V
    //   2296: goto -> 2332
    //   2299: aload #21
    //   2301: iconst_1
    //   2302: invokevirtual I : (I)V
    //   2305: aload #21
    //   2307: aload #22
    //   2309: getfield width : I
    //   2312: invokevirtual K : (I)V
    //   2315: aload #22
    //   2317: getfield width : I
    //   2320: bipush #-2
    //   2322: if_icmpne -> 2332
    //   2325: aload #21
    //   2327: iload #7
    //   2329: invokevirtual I : (I)V
    //   2332: aload #22
    //   2334: getfield b0 : Z
    //   2337: ifne -> 2421
    //   2340: aload #22
    //   2342: getfield height : I
    //   2345: iconst_m1
    //   2346: if_icmpne -> 2406
    //   2349: aload #22
    //   2351: getfield X : Z
    //   2354: ifeq -> 2366
    //   2357: aload #21
    //   2359: iconst_3
    //   2360: invokevirtual J : (I)V
    //   2363: goto -> 2375
    //   2366: aload #21
    //   2368: iconst_4
    //   2369: invokevirtual J : (I)V
    //   2372: goto -> 2363
    //   2375: aload #21
    //   2377: iconst_3
    //   2378: invokevirtual g : (I)Lbq;
    //   2381: aload #22
    //   2383: getfield topMargin : I
    //   2386: putfield g : I
    //   2389: aload #21
    //   2391: iconst_5
    //   2392: invokevirtual g : (I)Lbq;
    //   2395: aload #22
    //   2397: getfield bottomMargin : I
    //   2400: putfield g : I
    //   2403: goto -> 2453
    //   2406: aload #21
    //   2408: iconst_3
    //   2409: invokevirtual J : (I)V
    //   2412: aload #21
    //   2414: iconst_0
    //   2415: invokevirtual H : (I)V
    //   2418: goto -> 2453
    //   2421: aload #21
    //   2423: iconst_1
    //   2424: invokevirtual J : (I)V
    //   2427: aload #21
    //   2429: aload #22
    //   2431: getfield height : I
    //   2434: invokevirtual H : (I)V
    //   2437: aload #22
    //   2439: getfield height : I
    //   2442: bipush #-2
    //   2444: if_icmpne -> 2453
    //   2447: aload #21
    //   2449: iconst_2
    //   2450: invokevirtual J : (I)V
    //   2453: aload #22
    //   2455: getfield G : Ljava/lang/String;
    //   2458: astore #26
    //   2460: aload #26
    //   2462: ifnull -> 2473
    //   2465: aload #26
    //   2467: invokevirtual length : ()I
    //   2470: ifne -> 2476
    //   2473: goto -> 2730
    //   2476: aload #26
    //   2478: invokevirtual length : ()I
    //   2481: istore #9
    //   2483: aload #26
    //   2485: bipush #44
    //   2487: invokevirtual indexOf : (I)I
    //   2490: istore #7
    //   2492: iload #7
    //   2494: ifle -> 2559
    //   2497: iload #7
    //   2499: iload #9
    //   2501: iconst_1
    //   2502: isub
    //   2503: if_icmpge -> 2559
    //   2506: aload #26
    //   2508: iconst_0
    //   2509: iload #7
    //   2511: invokevirtual substring : (II)Ljava/lang/String;
    //   2514: astore #25
    //   2516: aload #25
    //   2518: ldc_w 'W'
    //   2521: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   2524: ifeq -> 2533
    //   2527: iconst_0
    //   2528: istore #5
    //   2530: goto -> 2553
    //   2533: aload #25
    //   2535: ldc_w 'H'
    //   2538: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   2541: ifeq -> 2550
    //   2544: iconst_1
    //   2545: istore #5
    //   2547: goto -> 2553
    //   2550: iconst_m1
    //   2551: istore #5
    //   2553: iinc #7, 1
    //   2556: goto -> 2565
    //   2559: iconst_m1
    //   2560: istore #5
    //   2562: iconst_0
    //   2563: istore #7
    //   2565: aload #26
    //   2567: bipush #58
    //   2569: invokevirtual indexOf : (I)I
    //   2572: istore #11
    //   2574: iload #11
    //   2576: iflt -> 2680
    //   2579: iload #11
    //   2581: iload #9
    //   2583: iconst_1
    //   2584: isub
    //   2585: if_icmpge -> 2680
    //   2588: aload #26
    //   2590: iload #7
    //   2592: iload #11
    //   2594: invokevirtual substring : (II)Ljava/lang/String;
    //   2597: astore #25
    //   2599: aload #26
    //   2601: iload #11
    //   2603: iconst_1
    //   2604: iadd
    //   2605: invokevirtual substring : (I)Ljava/lang/String;
    //   2608: astore #26
    //   2610: aload #25
    //   2612: invokevirtual length : ()I
    //   2615: ifle -> 2706
    //   2618: aload #26
    //   2620: invokevirtual length : ()I
    //   2623: ifle -> 2706
    //   2626: aload #25
    //   2628: invokestatic parseFloat : (Ljava/lang/String;)F
    //   2631: fstore #4
    //   2633: aload #26
    //   2635: invokestatic parseFloat : (Ljava/lang/String;)F
    //   2638: fstore_3
    //   2639: fload #4
    //   2641: fconst_0
    //   2642: fcmpl
    //   2643: ifle -> 2706
    //   2646: fload_3
    //   2647: fconst_0
    //   2648: fcmpl
    //   2649: ifle -> 2706
    //   2652: iload #5
    //   2654: iconst_1
    //   2655: if_icmpne -> 2669
    //   2658: fload_3
    //   2659: fload #4
    //   2661: fdiv
    //   2662: invokestatic abs : (F)F
    //   2665: fstore_3
    //   2666: goto -> 2708
    //   2669: fload #4
    //   2671: fload_3
    //   2672: fdiv
    //   2673: invokestatic abs : (F)F
    //   2676: fstore_3
    //   2677: goto -> 2708
    //   2680: aload #26
    //   2682: iload #7
    //   2684: invokevirtual substring : (I)Ljava/lang/String;
    //   2687: astore #25
    //   2689: aload #25
    //   2691: invokevirtual length : ()I
    //   2694: ifle -> 2706
    //   2697: aload #25
    //   2699: invokestatic parseFloat : (Ljava/lang/String;)F
    //   2702: fstore_3
    //   2703: goto -> 2708
    //   2706: fconst_0
    //   2707: fstore_3
    //   2708: fload_3
    //   2709: fconst_0
    //   2710: fcmpl
    //   2711: ifle -> 2736
    //   2714: aload #21
    //   2716: fload_3
    //   2717: putfield W : F
    //   2720: aload #21
    //   2722: iload #5
    //   2724: putfield X : I
    //   2727: goto -> 2736
    //   2730: aload #21
    //   2732: fconst_0
    //   2733: putfield W : F
    //   2736: aload #22
    //   2738: getfield H : F
    //   2741: fstore_3
    //   2742: aload #21
    //   2744: getfield k0 : [F
    //   2747: astore #25
    //   2749: aload #25
    //   2751: iconst_0
    //   2752: fload_3
    //   2753: fastore
    //   2754: aload #25
    //   2756: iconst_1
    //   2757: aload #22
    //   2759: getfield I : F
    //   2762: fastore
    //   2763: aload #21
    //   2765: aload #22
    //   2767: getfield J : I
    //   2770: putfield i0 : I
    //   2773: aload #21
    //   2775: aload #22
    //   2777: getfield K : I
    //   2780: putfield j0 : I
    //   2783: aload #22
    //   2785: getfield Z : I
    //   2788: istore #5
    //   2790: iload #5
    //   2792: iflt -> 2808
    //   2795: iload #5
    //   2797: iconst_3
    //   2798: if_icmpgt -> 2808
    //   2801: aload #21
    //   2803: iload #5
    //   2805: putfield q : I
    //   2808: aload #22
    //   2810: getfield L : I
    //   2813: istore #9
    //   2815: aload #22
    //   2817: getfield N : I
    //   2820: istore #5
    //   2822: aload #22
    //   2824: getfield P : I
    //   2827: istore #7
    //   2829: aload #22
    //   2831: getfield R : F
    //   2834: fstore_3
    //   2835: aload #21
    //   2837: iload #9
    //   2839: putfield r : I
    //   2842: aload #21
    //   2844: iload #5
    //   2846: putfield u : I
    //   2849: iload #7
    //   2851: istore #5
    //   2853: iload #7
    //   2855: ldc 2147483647
    //   2857: if_icmpne -> 2863
    //   2860: iconst_0
    //   2861: istore #5
    //   2863: aload #21
    //   2865: iload #5
    //   2867: putfield v : I
    //   2870: aload #21
    //   2872: fload_3
    //   2873: putfield w : F
    //   2876: fload_3
    //   2877: fconst_0
    //   2878: fcmpl
    //   2879: ifle -> 2899
    //   2882: fload_3
    //   2883: fconst_1
    //   2884: fcmpg
    //   2885: ifge -> 2899
    //   2888: iload #9
    //   2890: ifne -> 2899
    //   2893: aload #21
    //   2895: iconst_2
    //   2896: putfield r : I
    //   2899: aload #22
    //   2901: getfield M : I
    //   2904: istore #9
    //   2906: aload #22
    //   2908: getfield O : I
    //   2911: istore #5
    //   2913: aload #22
    //   2915: getfield Q : I
    //   2918: istore #7
    //   2920: aload #22
    //   2922: getfield S : F
    //   2925: fstore_3
    //   2926: aload #21
    //   2928: iload #9
    //   2930: putfield s : I
    //   2933: aload #21
    //   2935: iload #5
    //   2937: putfield x : I
    //   2940: iload #7
    //   2942: istore #5
    //   2944: iload #7
    //   2946: ldc 2147483647
    //   2948: if_icmpne -> 2954
    //   2951: iconst_0
    //   2952: istore #5
    //   2954: aload #21
    //   2956: iload #5
    //   2958: putfield y : I
    //   2961: aload #21
    //   2963: fload_3
    //   2964: putfield z : F
    //   2967: fload_3
    //   2968: fconst_0
    //   2969: fcmpl
    //   2970: ifle -> 2996
    //   2973: fload_3
    //   2974: fconst_1
    //   2975: fcmpg
    //   2976: ifge -> 2996
    //   2979: iload #9
    //   2981: ifne -> 2996
    //   2984: iconst_2
    //   2985: istore #5
    //   2987: aload #21
    //   2989: iconst_2
    //   2990: putfield s : I
    //   2993: goto -> 2999
    //   2996: iconst_2
    //   2997: istore #5
    //   2999: iinc #8, 1
    //   3002: aload #20
    //   3004: astore #21
    //   3006: iload #5
    //   3008: istore #7
    //   3010: goto -> 1209
    //   3013: aload #22
    //   3015: astore #21
    //   3017: iload #9
    //   3019: ifeq -> 3036
    //   3022: aload #24
    //   3024: getfield r0 : Lp01;
    //   3027: aload #24
    //   3029: invokevirtual u : (Lfr;)V
    //   3032: aload #22
    //   3034: astore #21
    //   3036: aload #24
    //   3038: getfield w0 : Lln0;
    //   3041: invokevirtual getClass : ()Ljava/lang/Class;
    //   3044: pop
    //   3045: aload #21
    //   3047: aload #24
    //   3049: aload #21
    //   3051: getfield k : I
    //   3054: iload_1
    //   3055: iload_2
    //   3056: invokevirtual j : (Lfr;III)V
    //   3059: aload #24
    //   3061: invokevirtual o : ()I
    //   3064: istore #7
    //   3066: aload #24
    //   3068: invokevirtual i : ()I
    //   3071: istore #6
    //   3073: aload #24
    //   3075: getfield E0 : Z
    //   3078: istore #16
    //   3080: aload #24
    //   3082: getfield F0 : Z
    //   3085: istore #17
    //   3087: aload #21
    //   3089: getfield q : Lhq;
    //   3092: astore #20
    //   3094: aload #20
    //   3096: getfield e : I
    //   3099: istore #5
    //   3101: iload #7
    //   3103: aload #20
    //   3105: getfield d : I
    //   3108: iadd
    //   3109: iload_1
    //   3110: iconst_0
    //   3111: invokestatic resolveSizeAndState : (III)I
    //   3114: istore_1
    //   3115: iload #6
    //   3117: iload #5
    //   3119: iadd
    //   3120: iload_2
    //   3121: iconst_0
    //   3122: invokestatic resolveSizeAndState : (III)I
    //   3125: istore #5
    //   3127: aload #21
    //   3129: getfield h : I
    //   3132: iload_1
    //   3133: ldc_w 16777215
    //   3136: iand
    //   3137: invokestatic min : (II)I
    //   3140: istore_2
    //   3141: aload #21
    //   3143: getfield i : I
    //   3146: iload #5
    //   3148: ldc_w 16777215
    //   3151: iand
    //   3152: invokestatic min : (II)I
    //   3155: istore #5
    //   3157: iload_2
    //   3158: istore_1
    //   3159: iload #16
    //   3161: ifeq -> 3170
    //   3164: iload_2
    //   3165: ldc_w 16777216
    //   3168: ior
    //   3169: istore_1
    //   3170: iload #5
    //   3172: istore_2
    //   3173: iload #17
    //   3175: ifeq -> 3185
    //   3178: iload #5
    //   3180: ldc_w 16777216
    //   3183: ior
    //   3184: istore_2
    //   3185: aload #21
    //   3187: iload_1
    //   3188: iload_2
    //   3189: invokevirtual setMeasuredDimension : (II)V
    //   3192: return
    //   3193: astore #21
    //   3195: goto -> 570
    //   3198: astore #25
    //   3200: goto -> 2706
    // Exception table:
    //   from	to	target	type
    //   295	317	568	android/content/res/Resources$NotFoundException
    //   322	347	3193	android/content/res/Resources$NotFoundException
    //   347	357	3193	android/content/res/Resources$NotFoundException
    //   363	374	3193	android/content/res/Resources$NotFoundException
    //   381	397	3193	android/content/res/Resources$NotFoundException
    //   400	409	3193	android/content/res/Resources$NotFoundException
    //   419	430	3193	android/content/res/Resources$NotFoundException
    //   430	437	3193	android/content/res/Resources$NotFoundException
    //   449	461	3193	android/content/res/Resources$NotFoundException
    //   470	479	3193	android/content/res/Resources$NotFoundException
    //   503	520	3193	android/content/res/Resources$NotFoundException
    //   545	558	3193	android/content/res/Resources$NotFoundException
    //   558	565	3193	android/content/res/Resources$NotFoundException
    //   2626	2639	3198	java/lang/NumberFormatException
    //   2658	2666	3198	java/lang/NumberFormatException
    //   2669	2677	3198	java/lang/NumberFormatException
    //   2697	2703	3198	java/lang/NumberFormatException
  }
  
  public final void onViewAdded(View paramView) {
    super.onViewAdded(paramView);
    er er = g(paramView);
    if (paramView instanceof Guideline && !(er instanceof bf0)) {
      gq gq = (gq)paramView.getLayoutParams();
      bf0 bf0 = new bf0();
      gq.q0 = (er)bf0;
      gq.d0 = true;
      bf0.O(gq.V);
    } 
    if (paramView instanceof eq) {
      eq eq = (eq)paramView;
      eq.j();
      ((gq)paramView.getLayoutParams()).e0 = true;
      ArrayList<eq> arrayList = this.c;
      if (!arrayList.contains(eq))
        arrayList.add(eq); 
    } 
    this.b.put(paramView.getId(), paramView);
    this.j = true;
  }
  
  public final void onViewRemoved(View paramView) {
    super.onViewRemoved(paramView);
    this.b.remove(paramView.getId());
    er er = g(paramView);
    this.e.q0.remove(er);
    er.A();
    this.c.remove(paramView);
    this.j = true;
  }
  
  public final void requestLayout() {
    this.j = true;
    super.requestLayout();
  }
  
  public void setConstraintSet(pq parampq) {
    this.l = parampq;
  }
  
  public void setId(int paramInt) {
    int i = getId();
    SparseArray sparseArray = this.b;
    sparseArray.remove(i);
    super.setId(paramInt);
    sparseArray.put(getId(), this);
  }
  
  public void setMaxHeight(int paramInt) {
    if (paramInt == this.i)
      return; 
    this.i = paramInt;
    requestLayout();
  }
  
  public void setMaxWidth(int paramInt) {
    if (paramInt == this.h)
      return; 
    this.h = paramInt;
    requestLayout();
  }
  
  public void setMinHeight(int paramInt) {
    if (paramInt == this.g)
      return; 
    this.g = paramInt;
    requestLayout();
  }
  
  public void setMinWidth(int paramInt) {
    if (paramInt == this.f)
      return; 
    this.f = paramInt;
    requestLayout();
  }
  
  public void setOnConstraintsChanged(ir paramir) {
    g7 g71 = this.m;
    if (g71 != null)
      g71.getClass(); 
  }
  
  public void setOptimizationLevel(int paramInt) {
    this.k = paramInt;
    fr fr1 = this.e;
    fr1.D0 = paramInt;
    ln0.q = fr1.S(512);
  }
  
  public final boolean shouldDelayChildPressedState() {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\constraintlayout\widget\ConstraintLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */