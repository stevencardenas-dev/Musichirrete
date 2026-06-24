import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.d;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g7 implements uh1, j41, j70 {
  public static final int[] f = new int[] { 16843067, 16843068 };
  
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public g7(int paramInt) {
    this.c = new Rect();
    this.e = new Rect();
  }
  
  public g7(int paramInt1, int paramInt2) {
    this.c = new int[] { paramInt1, paramInt2 };
    this.e = new float[] { 0.0F, 1.0F };
  }
  
  public g7(int paramInt1, int paramInt2, int paramInt3) {
    this.c = new int[] { paramInt1, paramInt2, paramInt3 };
    this.e = new float[] { 0.0F, 0.5F, 1.0F };
  }
  
  public g7(ah1 paramah1, uh1 paramuh1) {
    paramuh1.getClass();
    this.e = paramah1;
    this.c = paramuh1;
  }
  
  public g7(Animator paramAnimator) {
    this.c = null;
    AnimatorSet animatorSet = new AnimatorSet();
    this.e = animatorSet;
    animatorSet.play(paramAnimator);
  }
  
  public g7(Context paramContext, MediaSessionCompat.Token paramToken) {
    if (paramToken != null) {
      this.e = Collections.synchronizedSet(new HashSet());
      if (Build.VERSION.SDK_INT >= 29) {
        this.c = new b(paramContext, paramToken);
      } else {
        this.c = new b(paramContext, paramToken);
      } 
      return;
    } 
    l0.l("sessionToken must not be null");
    throw null;
  }
  
  public g7(AbsSeekBar paramAbsSeekBar) {
    this.c = paramAbsSeekBar;
  }
  
  public g7(EditText paramEditText, int paramInt) {
    this.c = paramEditText;
    y30 y30 = new y30(paramEditText);
    this.e = y30;
    paramEditText.addTextChangedListener(y30);
    if (r30.b == null) {
      Object object = r30.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (r30.b == null) {
          r30 r30 = new r30();
          super();
          try {
            r30.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, r30.class.getClassLoader());
          } finally {
            Exception exception;
          } 
          r30.b = r30;
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    } 
    paramEditText.setEditableFactory(r30.b);
  }
  
  public g7(dh1 paramdh1) {
    this.c = new AtomicInteger(0);
    this.e = new AtomicBoolean(false);
  }
  
  public g7(String paramString) {
    this.c = paramString.concat(".lck");
  }
  
  public g7(String paramString, m92 paramm92, hp2 paramhp2) {
    this.e = paramString;
    this.c = paramm92;
  }
  
  public g7(ArrayList paramArrayList1, ArrayList paramArrayList2) {
    int i = paramArrayList1.size();
    this.c = new int[i];
    this.e = new float[i];
    for (byte b = 0; b < i; b++) {
      ((int[])this.c)[b] = ((Integer)paramArrayList1.get(b)).intValue();
      ((float[])this.e)[b] = ((Float)paramArrayList2.get(b)).floatValue();
    } 
  }
  
  public g7(lb0 paramlb0) {
    this.c = paramlb0;
    this.e = new CopyOnWriteArrayList();
  }
  
  public g7(qi paramqi) {
    this.e = paramqi;
  }
  
  public g7(String[] paramArrayOfString) {
    if (paramArrayOfString != null) {
      for (byte b = 0; b < paramArrayOfString.length; b++) {
        StringBuilder stringBuilder = new StringBuilder("(\\A)(");
        stringBuilder.append(Pattern.quote(paramArrayOfString[b]));
        stringBuilder.append(")((\\s)+)");
        paramArrayOfString[b] = stringBuilder.toString();
      } 
      this.c = Pattern.compile(TextUtils.join("|", (Object[])paramArrayOfString), 2);
    } else {
      this.c = null;
    } 
  }
  
  public static String d(Class paramClass) {
    int i = paramClass.getModifiers();
    if (Modifier.isInterface(i))
      return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(paramClass.getName()); 
    if (Modifier.isAbstract(i)) {
      StringBuilder stringBuilder = new StringBuilder("Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ");
      stringBuilder.append(paramClass.getName());
      stringBuilder.append("\nSee ");
      stringBuilder.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class"));
      return stringBuilder.toString();
    } 
    return null;
  }
  
  public static int x(int paramInt1, int paramInt2) {
    byte b = 0;
    int i = 0;
    int j;
    for (j = i; b < paramInt1; j = k) {
      int k;
      int m = i + 1;
      if (m == paramInt2) {
        k = j + 1;
        i = 0;
      } else {
        i = m;
        k = j;
        if (m > paramInt2) {
          k = j + 1;
          i = 1;
        } 
      } 
      b++;
    } 
    paramInt1 = j;
    if (i + 1 > paramInt2)
      paramInt1 = j + 1; 
    return paramInt1;
  }
  
  public void A(AttributeSet paramAttributeSet, int paramInt) {
    TypedArray typedArray;
    int i = this.b;
    boolean bool = true;
    switch (i) {
      default:
        typedArray = ((EditText)this.c).getContext().obtainStyledAttributes(paramAttributeSet, nc1.i, paramInt, 0);
        try {
          if (typedArray.hasValue(14))
            bool = typedArray.getBoolean(14, true); 
        } finally {}
        typedArray.recycle();
        H(bool);
        return;
      case 0:
        break;
    } 
    AbsSeekBar absSeekBar = (AbsSeekBar)this.c;
    zv0 zv0 = zv0.y(paramInt, 0, absSeekBar.getContext(), paramAttributeSet, f);
    Drawable drawable2 = zv0.p(0);
    if (drawable2 != null) {
      AnimationDrawable animationDrawable;
      Drawable drawable = drawable2;
      if (drawable2 instanceof AnimationDrawable) {
        AnimationDrawable animationDrawable1 = (AnimationDrawable)drawable2;
        i = animationDrawable1.getNumberOfFrames();
        animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(animationDrawable1.isOneShot());
        for (paramInt = 0; paramInt < i; paramInt++) {
          Drawable drawable3 = J(animationDrawable1.getFrame(paramInt), true);
          drawable3.setLevel(10000);
          animationDrawable.addFrame(drawable3, animationDrawable1.getDuration(paramInt));
        } 
        animationDrawable.setLevel(10000);
      } 
      absSeekBar.setIndeterminateDrawable((Drawable)animationDrawable);
    } 
    Drawable drawable1 = zv0.p(1);
    if (drawable1 != null)
      absSeekBar.setProgressDrawable(J(drawable1, false)); 
    zv0.z();
  }
  
  public void B() {
    String str = (String)this.c;
    if ((FileChannel)this.e == null) {
      Exception exception;
      try {
        File file1 = new File();
        this(str);
        File file2 = file1.getParentFile();
        if (file2 != null)
          file2.mkdirs(); 
      } finally {}
      FileOutputStream fileOutputStream = new FileOutputStream();
      this((File)exception);
      FileChannel fileChannel = fileOutputStream.getChannel();
      this.e = fileChannel;
      if (fileChannel != null)
        fileChannel.lock(); 
    } 
  }
  
  public s30 C(InputConnection paramInputConnection) {
    s30 s30;
    gh1 gh1 = (gh1)this.e;
    if (paramInputConnection == null) {
      gh1.getClass();
      paramInputConnection = null;
    } else {
      g7 g71 = (g7)gh1.c;
      g71.getClass();
      if (!(paramInputConnection instanceof s30))
        s30 = new s30((TextView)g71.c, paramInputConnection); 
    } 
    return s30;
  }
  
  public void D(y1 paramy1) {
    n2 n2 = (n2)this.c;
    ((ActionMode.Callback)n2.c).onDestroyActionMode(n2.s(paramy1));
    u6 u6 = (u6)this.e;
    if (u6.x != null)
      u6.n.getDecorView().removeCallbacks(u6.y); 
    if (u6.w != null) {
      u32 u32 = u6.z;
      if (u32 != null)
        u32.b(); 
      u32 = v22.a((View)u6.w);
      u32.a(0.0F);
      u6.z = u32;
      u32.d(new j6(2, this));
    } 
    u6.v = null;
    ViewGroup viewGroup = u6.C;
    WeakHashMap weakHashMap = v22.a;
    viewGroup.requestApplyInsets();
    u6.I();
  }
  
  public boolean E(y1 paramy1, Menu paramMenu) {
    ViewGroup viewGroup = ((u6)this.e).C;
    WeakHashMap weakHashMap = v22.a;
    viewGroup.requestApplyInsets();
    n2 n2 = (n2)this.c;
    ActionMode.Callback callback = (ActionMode.Callback)n2.c;
    yq1 yq1 = n2.s(paramy1);
    zm1 zm1 = (zm1)n2.g;
    Menu menu2 = (Menu)zm1.get(paramMenu);
    Menu menu1 = menu2;
    if (menu2 == null) {
      menu1 = new kx0((Context)n2.e, (rw0)paramMenu);
      zm1.put(paramMenu, menu1);
    } 
    return callback.onPrepareActionMode(yq1, menu1);
  }
  
  public void F(ba0 paramba0) {
    a60 a60 = (a60)this.e;
    bh0 bh0 = (bh0)this.c;
    int i = paramba0.b;
    if (i == 0) {
      a60.execute(new vi2(6, bh0, paramba0.a));
      return;
    } 
    a60.execute(new sd(i, 2, bh0));
  }
  
  public void G(Context paramContext, XmlResourceParser paramXmlResourceParser) {
    pq pq = new pq();
    int j = paramXmlResourceParser.getAttributeCount();
    for (int i = 0;; i++) {
      if (i < j) {
        String str3 = paramXmlResourceParser.getAttributeName(i);
        String str2 = paramXmlResourceParser.getAttributeValue(i);
        if (str3 == null || str2 == null)
          continue; 
        String str1 = tlzLOCPTHRhep.CMwYfq;
        if (str1.equals(str3)) {
          if (str2.contains("/")) {
            str3 = str2.substring(str2.indexOf('/') + 1);
            i = paramContext.getResources().getIdentifier(str3, str1, paramContext.getPackageName());
          } else {
            i = -1;
          } 
          j = i;
          if (i == -1)
            if (str2.length() > 1) {
              j = Integer.parseInt(str2.substring(1));
            } else {
              Log.e("ConstraintLayoutStates", "error in parsing id");
              j = i;
            }  
          try {
            i = paramXmlResourceParser.getEventType();
            for (str2 = null; i != 1; str2 = str1) {
              if (i != 0) {
                RuntimeException runtimeException;
                if (i != 2) {
                  if (i != 3) {
                    str1 = str2;
                    continue;
                  } 
                  str3 = paramXmlResourceParser.getName().toLowerCase(Locale.ROOT);
                  switch (str3.hashCode()) {
                    default:
                      str1 = str2;
                      break;
                    case 2146106725:
                      str1 = str2;
                      if (str3.equals("constraintset"))
                        break; 
                      break;
                    case 426575017:
                      str1 = str2;
                    case -190376483:
                      str1 = str2;
                    case -2075718416:
                      str1 = str2;
                  } 
                  continue;
                } 
                str3 = paramXmlResourceParser.getName();
                i = str3.hashCode();
                switch (i) {
                  default:
                    str1 = str2;
                    break;
                  case 1803088381:
                    str1 = str2;
                    if (str3.equals("Constraint"))
                      kq kq = pq.f(paramContext, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), false); 
                    break;
                  case 1791837707:
                    str1 = str2;
                    if (str3.equals("CustomAttribute")) {
                      if (str2 != null) {
                        cq.a(paramContext, paramXmlResourceParser, ((kq)str2).f);
                        str1 = str2;
                        break;
                      } 
                      runtimeException = new RuntimeException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("XML parser error must be within a Constraint ");
                      stringBuilder.append(paramXmlResourceParser.getLineNumber());
                      this(stringBuilder.toString());
                      throw runtimeException;
                    } 
                    break;
                  case 1331510167:
                    str1 = str2;
                    if (str3.equals("Barrier")) {
                      kq kq = pq.f((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), false);
                      kq.d.h0 = 1;
                    } 
                    break;
                  case 366511058:
                    str1 = str2;
                    if (str3.equals("CustomMethod")) {
                      if (str2 != null) {
                        cq.a((Context)runtimeException, paramXmlResourceParser, ((kq)str2).f);
                        str1 = str2;
                        break;
                      } 
                      runtimeException = new RuntimeException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("XML parser error must be within a Constraint ");
                      stringBuilder.append(paramXmlResourceParser.getLineNumber());
                      this(stringBuilder.toString());
                      throw runtimeException;
                    } 
                    break;
                  case -71750448:
                    str1 = str2;
                    if (str3.equals("Guideline")) {
                      kq kq = pq.f((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), false);
                      kq.d.a = true;
                    } 
                    break;
                  case -1238332596:
                    str1 = str2;
                    if (str3.equals("Transform")) {
                      if (str2 != null) {
                        ((kq)str2).e.a((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser));
                        str1 = str2;
                        break;
                      } 
                      runtimeException = new RuntimeException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("XML parser error must be within a Constraint ");
                      stringBuilder.append(paramXmlResourceParser.getLineNumber());
                      this(stringBuilder.toString());
                      throw runtimeException;
                    } 
                    break;
                  case -1269513683:
                    str1 = str2;
                    if (str3.equals("PropertySet")) {
                      if (str2 != null) {
                        ((kq)str2).b.a((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser));
                        str1 = str2;
                        break;
                      } 
                      runtimeException = new RuntimeException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("XML parser error must be within a Constraint ");
                      stringBuilder.append(paramXmlResourceParser.getLineNumber());
                      this(stringBuilder.toString());
                      throw runtimeException;
                    } 
                    break;
                  case -1962203927:
                    str1 = str2;
                    if (str3.equals("ConstraintOverride"))
                      kq kq = pq.f((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), true); 
                    break;
                  case -1984451626:
                    str1 = str2;
                    if (str3.equals("Motion")) {
                      if (str2 != null) {
                        ((kq)str2).c.a((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser));
                        str1 = str2;
                        break;
                      } 
                      runtimeException = new RuntimeException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("XML parser error must be within a Constraint ");
                      stringBuilder.append(paramXmlResourceParser.getLineNumber());
                      this(stringBuilder.toString());
                      throw runtimeException;
                    } 
                    break;
                  case -2025855158:
                    str1 = str2;
                    if (str3.equals("Layout")) {
                      if (str2 != null) {
                        ((kq)str2).d.a((Context)runtimeException, Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser));
                        str1 = str2;
                        break;
                      } 
                      RuntimeException runtimeException1 = new RuntimeException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("XML parser error must be within a Constraint ");
                      stringBuilder.append(paramXmlResourceParser.getLineNumber());
                      this(stringBuilder.toString());
                      throw runtimeException1;
                    } 
                    break;
                } 
                continue;
              } 
              paramXmlResourceParser.getName();
              str1 = str2;
              continue;
              i = paramXmlResourceParser.next();
            } 
          } catch (XmlPullParserException xmlPullParserException) {
            Log.e("ConstraintSet", "Error parsing XML resource", (Throwable)xmlPullParserException);
          } catch (IOException iOException) {}
        } else {
          continue;
        } 
      } else {
        break;
      } 
      ((SparseArray)this.e).put(j, pq);
      return;
    } 
  }
  
  public void H(boolean paramBoolean) {
    y30 y30 = (y30)((g7)((gh1)this.e).c).e;
    if (y30.c != paramBoolean) {
      y30.c = paramBoolean;
      if (paramBoolean) {
        z51.j();
        throw null;
      } 
    } 
  }
  
  public void I(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    qi qi = (qi)this.e;
    qi.f.set(paramInt1, paramInt2, paramInt3, paramInt4);
    Rect rect = qi.e;
    qi.a(qi, paramInt1 + rect.left, paramInt2 + rect.top, paramInt3 + rect.right, paramInt4 + rect.bottom);
  }
  
  public Drawable J(Drawable paramDrawable, boolean paramBoolean) {
    LayerDrawable layerDrawable;
    ShapeDrawable shapeDrawable;
    if (paramDrawable instanceof LayerDrawable) {
      layerDrawable = (LayerDrawable)paramDrawable;
      int i = layerDrawable.getNumberOfLayers();
      Drawable[] arrayOfDrawable = new Drawable[i];
      boolean bool = false;
      byte b;
      for (b = 0; b < i; b++) {
        int j = layerDrawable.getId(b);
        Drawable drawable = layerDrawable.getDrawable(b);
        if (j == 16908301 || j == 16908303) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        } 
        arrayOfDrawable[b] = J(drawable, paramBoolean);
      } 
      LayerDrawable layerDrawable1 = new LayerDrawable(arrayOfDrawable);
      for (b = bool; b < i; b++) {
        layerDrawable1.setId(b, layerDrawable.getId(b));
        layerDrawable1.setLayerGravity(b, layerDrawable.getLayerGravity(b));
        layerDrawable1.setLayerWidth(b, layerDrawable.getLayerWidth(b));
        layerDrawable1.setLayerHeight(b, layerDrawable.getLayerHeight(b));
        layerDrawable1.setLayerInsetLeft(b, layerDrawable.getLayerInsetLeft(b));
        layerDrawable1.setLayerInsetRight(b, layerDrawable.getLayerInsetRight(b));
        layerDrawable1.setLayerInsetTop(b, layerDrawable.getLayerInsetTop(b));
        layerDrawable1.setLayerInsetBottom(b, layerDrawable.getLayerInsetBottom(b));
        layerDrawable1.setLayerInsetStart(b, layerDrawable.getLayerInsetStart(b));
        layerDrawable1.setLayerInsetEnd(b, layerDrawable.getLayerInsetEnd(b));
      } 
      return (Drawable)layerDrawable1;
    } 
    if (layerDrawable instanceof BitmapDrawable) {
      BitmapDrawable bitmapDrawable = (BitmapDrawable)layerDrawable;
      Bitmap bitmap = bitmapDrawable.getBitmap();
      if ((Bitmap)this.e == null)
        this.e = bitmap; 
      shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
      BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      shapeDrawable.getPaint().setShader((Shader)bitmapShader);
      shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
      return (Drawable)(paramBoolean ? new ClipDrawable((Drawable)shapeDrawable, 3, 1) : shapeDrawable);
    } 
    return (Drawable)shapeDrawable;
  }
  
  public void K() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/lang/Object;
    //   6: checkcast java/util/concurrent/atomic/AtomicInteger
    //   9: invokevirtual decrementAndGet : ()I
    //   12: pop
    //   13: aload_0
    //   14: getfield c : Ljava/lang/Object;
    //   17: checkcast java/util/concurrent/atomic/AtomicInteger
    //   20: invokevirtual get : ()I
    //   23: istore_1
    //   24: iload_1
    //   25: iflt -> 31
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: new java/lang/IllegalStateException
    //   34: astore_2
    //   35: aload_2
    //   36: ldc_w 'Unbalanced call to unblock() detected.'
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: aload_2
    //   43: athrow
    //   44: astore_2
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_2
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	44	finally
    //   31	44	44	finally
  }
  
  public void L(nu0 paramnu0) {
    if (paramnu0 != null) {
      if (!((Set)this.e).remove(paramnu0)) {
        Log.w("MediaControllerCompat", "the callback has never been registered");
        return;
      } 
      try {
        ((b)this.c).b(paramnu0);
        return;
      } finally {
        paramnu0.e(null);
      } 
    } 
    l0.l("callback must not be null");
  }
  
  public th1 a(String paramString) {
    paramString.getClass();
    null = (ah1)this.e;
    String str = paramString;
    if (!paramString.equals(":memory:")) {
      str = null.c.a.getDatabasePath(paramString).getAbsolutePath();
      str.getClass();
    } 
    boolean bool1 = null.a;
    boolean bool = true;
    if (!bool1 && !null.b && !str.equals(":memory:")) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    y50 y50 = new y50(str, bool1);
    ReentrantLock reentrantLock = y50.a;
    reentrantLock.lock();
    g7 g71 = y50.b;
    if (g71 != null)
      try {
        g71.B();
      } finally {
        g71 = null;
      }  
    try {
    
    } finally {
      if (g71 != null) {
        FileChannel fileChannel = (FileChannel)g71.e;
        if (fileChannel != null)
          try {
            fileChannel.close();
          } finally {
            g71.e = null;
          }  
      } 
    } 
    if (bool)
      try {
        throw g71;
      } finally {
        reentrantLock.unlock();
      }  
    IllegalStateException illegalStateException = new IllegalStateException();
    StringBuilder stringBuilder = new StringBuilder();
    this("Unable to open database '");
    stringBuilder.append(str);
    stringBuilder.append("'. Was a proper path / name used in Room's database builder?");
    this(stringBuilder.toString(), (Throwable)g71);
    throw illegalStateException;
  }
  
  public boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Ljava/lang/Object;
    //   6: checkcast java/util/concurrent/atomic/AtomicBoolean
    //   9: invokevirtual get : ()Z
    //   12: istore_1
    //   13: iload_1
    //   14: ifeq -> 21
    //   17: aload_0
    //   18: monitorexit
    //   19: iconst_0
    //   20: ireturn
    //   21: aload_0
    //   22: getfield c : Ljava/lang/Object;
    //   25: checkcast java/util/concurrent/atomic/AtomicInteger
    //   28: invokevirtual incrementAndGet : ()I
    //   31: pop
    //   32: aload_0
    //   33: monitorexit
    //   34: iconst_1
    //   35: ireturn
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	36	finally
    //   21	32	36	finally
  }
  
  public of c() {
    boolean bool1;
    ArrayList arrayList = (ArrayList)this.c;
    boolean bool2 = true;
    if (arrayList != null && !arrayList.isEmpty()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      ArrayList<ArrayList> arrayList1 = (ArrayList)this.c;
      if (arrayList1 != null) {
        int i = arrayList1.size();
        byte b = 0;
        while (b < i) {
          arrayList = arrayList1.get(b);
          b++;
          if ((mf)arrayList != null)
            continue; 
          l0.l("ProductDetailsParams cannot be null.");
          return null;
        } 
      } 
      Object object = new Object();
      if (bool1 && !((mf)((ArrayList)this.c).get(0)).a.b.optString(LHyji.GjTRC).isEmpty()) {
        bool = true;
      } else {
        bool = false;
      } 
      ((of)object).a = bool;
      nf nf = (nf)this.e;
      nf.getClass();
      bool1 = bool2;
      if (TextUtils.isEmpty(null))
        if (!TextUtils.isEmpty(null)) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }  
      boolean bool = TextUtils.isEmpty(null);
      if (!bool1 || bool) {
        if (nf.a || bool1 || !bool) {
          ch2 ch2;
          ((of)object).b = new Object();
          ((of)object).d = new ArrayList();
          ArrayList arrayList2 = (ArrayList)this.c;
          if (arrayList2 != null) {
            ch2 = ch2.k(arrayList2);
          } else {
            yg2 yg2 = ch2.c;
            ch2 = th2.g;
          } 
          ((of)object).c = ch2;
          return (of)object;
        } 
        l0.l("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        return null;
      } 
      l0.l("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
      return null;
    } 
    l0.l("Details of the products must be provided.");
    return null;
  }
  
  public void e(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.e(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void f(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    lb0 lb0 = (lb0)this.c;
    x5 x5 = lb0.w.l;
    ua0 ua01 = lb0.y;
    if (ua01 != null)
      (ua01.R()).o.f(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void g(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.g(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public Object get() {
    return new ox0((Context)((s0)this.c).b, (zv0)((gh1)this.e).get());
  }
  
  public void h(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.h(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void i(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.i(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void j(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.j(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void k(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    lb0 lb0 = (lb0)this.c;
    x5 x5 = lb0.w.l;
    ua0 ua01 = lb0.y;
    if (ua01 != null)
      (ua01.R()).o.k(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void l(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.l(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void m(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.m(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void n(ua0 paramua0, Bundle paramBundle, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.n(paramua0, paramBundle, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void o(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.o(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void p(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.p(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void q(ua0 paramua0, View paramView, boolean paramBoolean) {
    paramua0.getClass();
    paramView.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.q(paramua0, paramView, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public void r(ua0 paramua0, boolean paramBoolean) {
    paramua0.getClass();
    ua0 ua01 = ((lb0)this.c).y;
    if (ua01 != null)
      (ua01.R()).o.r(paramua0, true); 
    Iterator iterator = ((CopyOnWriteArrayList)this.e).iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (paramBoolean)
          throw null; 
        throw null;
      } 
      tp.b();
    } 
  }
  
  public boolean s(int paramInt) {
    return false;
  }
  
  public e31 t(rz1 paramrz1, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: getfield b : Ljava/lang/reflect/Type;
    //   4: astore #5
    //   6: aload_1
    //   7: getfield a : Ljava/lang/Class;
    //   10: astore #4
    //   12: aload_0
    //   13: getfield c : Ljava/lang/Object;
    //   16: checkcast java/util/Map
    //   19: astore #6
    //   21: aload #6
    //   23: aload #5
    //   25: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: astore_1
    //   31: aconst_null
    //   32: astore_3
    //   33: aload_1
    //   34: ifnonnull -> 608
    //   37: aload #6
    //   39: aload #4
    //   41: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: ifnonnull -> 603
    //   49: ldc_w java/util/EnumSet
    //   52: aload #4
    //   54: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   57: ifeq -> 74
    //   60: new mr
    //   63: dup
    //   64: aload #5
    //   66: iconst_0
    //   67: invokespecial <init> : (Ljava/lang/reflect/Type;I)V
    //   70: astore_1
    //   71: goto -> 98
    //   74: aload #4
    //   76: ldc_w java/util/EnumMap
    //   79: if_acmpne -> 96
    //   82: new mr
    //   85: dup
    //   86: aload #5
    //   88: iconst_1
    //   89: invokespecial <init> : (Ljava/lang/reflect/Type;I)V
    //   92: astore_1
    //   93: goto -> 98
    //   96: aconst_null
    //   97: astore_1
    //   98: aload_1
    //   99: ifnull -> 104
    //   102: aload_1
    //   103: areturn
    //   104: aload_0
    //   105: getfield e : Ljava/lang/Object;
    //   108: checkcast java/util/List
    //   111: invokestatic t : (Ljava/util/List;)V
    //   114: aload #4
    //   116: invokevirtual getModifiers : ()I
    //   119: invokestatic isAbstract : (I)Z
    //   122: ifeq -> 130
    //   125: aconst_null
    //   126: astore_1
    //   127: goto -> 240
    //   130: aload #4
    //   132: aconst_null
    //   133: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   136: astore #6
    //   138: getstatic re1.a : Lws2;
    //   141: astore_1
    //   142: aload #6
    //   144: iconst_1
    //   145: invokevirtual setAccessible : (Z)V
    //   148: aconst_null
    //   149: astore_1
    //   150: goto -> 212
    //   153: astore_1
    //   154: new java/lang/StringBuilder
    //   157: dup
    //   158: ldc_w 'Failed making constructor ''
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: astore #7
    //   166: aload #7
    //   168: aload #6
    //   170: invokestatic b : (Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload #7
    //   179: ldc_w '' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: '
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: aload #7
    //   188: aload_1
    //   189: invokevirtual getMessage : ()Ljava/lang/String;
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload #7
    //   198: aload_1
    //   199: invokestatic e : (Ljava/lang/Exception;)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload #7
    //   208: invokevirtual toString : ()Ljava/lang/String;
    //   211: astore_1
    //   212: aload_1
    //   213: ifnull -> 229
    //   216: new f1
    //   219: dup
    //   220: aload_1
    //   221: iconst_1
    //   222: invokespecial <init> : (Ljava/lang/String;I)V
    //   225: astore_1
    //   226: goto -> 240
    //   229: new f
    //   232: dup
    //   233: iconst_5
    //   234: aload #6
    //   236: invokespecial <init> : (ILjava/lang/Object;)V
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull -> 246
    //   244: aload_1
    //   245: areturn
    //   246: ldc_w java/util/Collection
    //   249: aload #4
    //   251: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   254: ifeq -> 351
    //   257: aload #4
    //   259: ldc java/util/ArrayList
    //   261: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   264: ifeq -> 279
    //   267: new tp
    //   270: dup
    //   271: iconst_1
    //   272: invokespecial <init> : (I)V
    //   275: astore_1
    //   276: goto -> 522
    //   279: aload #4
    //   281: ldc_w java/util/LinkedHashSet
    //   284: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   287: ifeq -> 302
    //   290: new tp
    //   293: dup
    //   294: iconst_4
    //   295: invokespecial <init> : (I)V
    //   298: astore_1
    //   299: goto -> 522
    //   302: aload #4
    //   304: ldc_w java/util/TreeSet
    //   307: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   310: ifeq -> 325
    //   313: new tp
    //   316: dup
    //   317: iconst_5
    //   318: invokespecial <init> : (I)V
    //   321: astore_1
    //   322: goto -> 522
    //   325: aload_3
    //   326: astore_1
    //   327: aload #4
    //   329: ldc_w java/util/ArrayDeque
    //   332: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   335: ifeq -> 522
    //   338: new tp
    //   341: dup
    //   342: bipush #6
    //   344: invokespecial <init> : (I)V
    //   347: astore_1
    //   348: goto -> 522
    //   351: aload_3
    //   352: astore_1
    //   353: ldc_w java/util/Map
    //   356: aload #4
    //   358: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   361: ifeq -> 522
    //   364: aload #4
    //   366: ldc_w qn0
    //   369: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   372: ifeq -> 429
    //   375: aload #5
    //   377: instanceof java/lang/reflect/ParameterizedType
    //   380: ifne -> 386
    //   383: goto -> 416
    //   386: aload #5
    //   388: checkcast java/lang/reflect/ParameterizedType
    //   391: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
    //   396: astore_1
    //   397: aload_1
    //   398: arraylength
    //   399: ifne -> 405
    //   402: goto -> 429
    //   405: aload_1
    //   406: iconst_0
    //   407: aaload
    //   408: invokestatic G : (Ljava/lang/reflect/Type;)Ljava/lang/Class;
    //   411: ldc java/lang/String
    //   413: if_acmpne -> 429
    //   416: new tp
    //   419: dup
    //   420: bipush #7
    //   422: invokespecial <init> : (I)V
    //   425: astore_1
    //   426: goto -> 522
    //   429: aload #4
    //   431: ldc_w java/util/LinkedHashMap
    //   434: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   437: ifeq -> 453
    //   440: new tp
    //   443: dup
    //   444: bipush #8
    //   446: invokespecial <init> : (I)V
    //   449: astore_1
    //   450: goto -> 522
    //   453: aload #4
    //   455: ldc_w java/util/TreeMap
    //   458: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   461: ifeq -> 477
    //   464: new tp
    //   467: dup
    //   468: bipush #9
    //   470: invokespecial <init> : (I)V
    //   473: astore_1
    //   474: goto -> 522
    //   477: aload #4
    //   479: ldc_w java/util/concurrent/ConcurrentHashMap
    //   482: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   485: ifeq -> 500
    //   488: new tp
    //   491: dup
    //   492: iconst_2
    //   493: invokespecial <init> : (I)V
    //   496: astore_1
    //   497: goto -> 522
    //   500: aload_3
    //   501: astore_1
    //   502: aload #4
    //   504: ldc_w java/util/concurrent/ConcurrentSkipListMap
    //   507: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   510: ifeq -> 522
    //   513: new tp
    //   516: dup
    //   517: iconst_3
    //   518: invokespecial <init> : (I)V
    //   521: astore_1
    //   522: aload_1
    //   523: ifnull -> 528
    //   526: aload_1
    //   527: areturn
    //   528: aload #4
    //   530: invokestatic d : (Ljava/lang/Class;)Ljava/lang/String;
    //   533: astore_1
    //   534: aload_1
    //   535: ifnull -> 548
    //   538: new f1
    //   541: dup
    //   542: aload_1
    //   543: iconst_1
    //   544: invokespecial <init> : (Ljava/lang/String;I)V
    //   547: areturn
    //   548: iload_2
    //   549: ifne -> 591
    //   552: new java/lang/StringBuilder
    //   555: dup
    //   556: ldc_w 'Unable to create instance of '
    //   559: invokespecial <init> : (Ljava/lang/String;)V
    //   562: astore_1
    //   563: aload_1
    //   564: aload #4
    //   566: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   569: pop
    //   570: aload_1
    //   571: ldc_w '; Register an InstanceCreator or a TypeAdapter for this type.'
    //   574: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: pop
    //   578: new f1
    //   581: dup
    //   582: aload_1
    //   583: invokevirtual toString : ()Ljava/lang/String;
    //   586: iconst_1
    //   587: invokespecial <init> : (Ljava/lang/String;I)V
    //   590: areturn
    //   591: new f
    //   594: dup
    //   595: bipush #6
    //   597: aload #4
    //   599: invokespecial <init> : (ILjava/lang/Object;)V
    //   602: areturn
    //   603: invokestatic b : ()V
    //   606: aconst_null
    //   607: areturn
    //   608: invokestatic b : ()V
    //   611: aconst_null
    //   612: areturn
    //   613: astore_1
    //   614: goto -> 125
    // Exception table:
    //   from	to	target	type
    //   130	138	613	java/lang/NoSuchMethodException
    //   142	148	153	java/lang/Exception
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 16:
        break;
    } 
    return ((Map)this.c).toString();
  }
  
  public CctBackendFactory u(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljava/lang/Object;
    //   4: checkcast java/util/Map
    //   7: ifnonnull -> 287
    //   10: aload_0
    //   11: getfield c : Ljava/lang/Object;
    //   14: checkcast android/content/Context
    //   17: astore #5
    //   19: aload #5
    //   21: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   24: astore #4
    //   26: aload #4
    //   28: ifnonnull -> 47
    //   31: ldc_w 'BackendRegistry'
    //   34: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.hfr : Ljava/lang/String;
    //   37: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   40: pop
    //   41: aconst_null
    //   42: astore #4
    //   44: goto -> 117
    //   47: new android/content/ComponentName
    //   50: astore #6
    //   52: aload #6
    //   54: aload #5
    //   56: ldc_w com/google/android/datatransport/runtime/backends/TransportBackendDiscovery
    //   59: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   62: aload #4
    //   64: aload #6
    //   66: sipush #128
    //   69: invokevirtual getServiceInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
    //   72: astore #4
    //   74: aload #4
    //   76: ifnonnull -> 92
    //   79: ldc_w 'BackendRegistry'
    //   82: ldc_w 'TransportBackendDiscovery has no service info.'
    //   85: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   88: pop
    //   89: goto -> 41
    //   92: aload #4
    //   94: getfield metaData : Landroid/os/Bundle;
    //   97: astore #4
    //   99: goto -> 117
    //   102: astore #4
    //   104: ldc_w 'BackendRegistry'
    //   107: ldc_w 'Application info not found.'
    //   110: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   113: pop
    //   114: goto -> 41
    //   117: aload #4
    //   119: ifnonnull -> 140
    //   122: ldc_w 'BackendRegistry'
    //   125: ldc_w 'Could not retrieve metadata, returning empty list of transport backends.'
    //   128: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   131: pop
    //   132: getstatic java/util/Collections.EMPTY_MAP : Ljava/util/Map;
    //   135: astore #4
    //   137: goto -> 281
    //   140: new java/util/HashMap
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: astore #5
    //   149: aload #4
    //   151: invokevirtual keySet : ()Ljava/util/Set;
    //   154: invokeinterface iterator : ()Ljava/util/Iterator;
    //   159: astore #7
    //   161: aload #7
    //   163: invokeinterface hasNext : ()Z
    //   168: ifeq -> 277
    //   171: aload #7
    //   173: invokeinterface next : ()Ljava/lang/Object;
    //   178: checkcast java/lang/String
    //   181: astore #6
    //   183: aload #4
    //   185: aload #6
    //   187: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   190: astore #8
    //   192: aload #8
    //   194: instanceof java/lang/String
    //   197: ifeq -> 161
    //   200: aload #6
    //   202: ldc_w 'backend:'
    //   205: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   208: ifeq -> 161
    //   211: aload #8
    //   213: checkcast java/lang/String
    //   216: ldc_w ','
    //   219: iconst_m1
    //   220: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   223: astore #8
    //   225: aload #8
    //   227: arraylength
    //   228: istore_3
    //   229: iconst_0
    //   230: istore_2
    //   231: iload_2
    //   232: iload_3
    //   233: if_icmpge -> 161
    //   236: aload #8
    //   238: iload_2
    //   239: aaload
    //   240: invokevirtual trim : ()Ljava/lang/String;
    //   243: astore #9
    //   245: aload #9
    //   247: invokevirtual isEmpty : ()Z
    //   250: ifeq -> 256
    //   253: goto -> 271
    //   256: aload #5
    //   258: aload #9
    //   260: aload #6
    //   262: bipush #8
    //   264: invokevirtual substring : (I)Ljava/lang/String;
    //   267: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   270: pop
    //   271: iinc #2, 1
    //   274: goto -> 231
    //   277: aload #5
    //   279: astore #4
    //   281: aload_0
    //   282: aload #4
    //   284: putfield e : Ljava/lang/Object;
    //   287: aload_0
    //   288: getfield e : Ljava/lang/Object;
    //   291: checkcast java/util/Map
    //   294: aload_1
    //   295: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   300: checkcast java/lang/String
    //   303: astore_1
    //   304: aload_1
    //   305: ifnonnull -> 310
    //   308: aconst_null
    //   309: areturn
    //   310: aload_1
    //   311: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   314: ldc_w com/google/android/datatransport/cct/CctBackendFactory
    //   317: invokevirtual asSubclass : (Ljava/lang/Class;)Ljava/lang/Class;
    //   320: aconst_null
    //   321: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   324: aconst_null
    //   325: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   328: checkcast com/google/android/datatransport/cct/CctBackendFactory
    //   331: astore #4
    //   333: aload #4
    //   335: areturn
    //   336: astore #4
    //   338: goto -> 361
    //   341: astore #4
    //   343: goto -> 380
    //   346: astore #4
    //   348: goto -> 399
    //   351: astore #4
    //   353: goto -> 444
    //   356: astore #4
    //   358: goto -> 489
    //   361: ldc_w 'BackendRegistry'
    //   364: ldc_w 'Could not instantiate '
    //   367: aload_1
    //   368: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   371: aload #4
    //   373: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   376: pop
    //   377: goto -> 531
    //   380: ldc_w 'BackendRegistry'
    //   383: ldc_w 'Could not instantiate '
    //   386: aload_1
    //   387: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   390: aload #4
    //   392: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   395: pop
    //   396: goto -> 531
    //   399: new java/lang/StringBuilder
    //   402: dup
    //   403: ldc_w 'Could not instantiate '
    //   406: invokespecial <init> : (Ljava/lang/String;)V
    //   409: astore #5
    //   411: aload #5
    //   413: aload_1
    //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: pop
    //   418: aload #5
    //   420: ldc_w '.'
    //   423: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: pop
    //   427: ldc_w 'BackendRegistry'
    //   430: aload #5
    //   432: invokevirtual toString : ()Ljava/lang/String;
    //   435: aload #4
    //   437: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   440: pop
    //   441: goto -> 531
    //   444: new java/lang/StringBuilder
    //   447: dup
    //   448: ldc_w 'Could not instantiate '
    //   451: invokespecial <init> : (Ljava/lang/String;)V
    //   454: astore #5
    //   456: aload #5
    //   458: aload_1
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: aload #5
    //   465: ldc_w '.'
    //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: ldc_w 'BackendRegistry'
    //   475: aload #5
    //   477: invokevirtual toString : ()Ljava/lang/String;
    //   480: aload #4
    //   482: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   485: pop
    //   486: goto -> 531
    //   489: new java/lang/StringBuilder
    //   492: dup
    //   493: ldc_w 'Class '
    //   496: invokespecial <init> : (Ljava/lang/String;)V
    //   499: astore #5
    //   501: aload #5
    //   503: aload_1
    //   504: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: pop
    //   508: aload #5
    //   510: ldc_w ' is not found.'
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: ldc_w 'BackendRegistry'
    //   520: aload #5
    //   522: invokevirtual toString : ()Ljava/lang/String;
    //   525: aload #4
    //   527: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   530: pop
    //   531: aconst_null
    //   532: areturn
    // Exception table:
    //   from	to	target	type
    //   19	26	102	android/content/pm/PackageManager$NameNotFoundException
    //   31	41	102	android/content/pm/PackageManager$NameNotFoundException
    //   47	74	102	android/content/pm/PackageManager$NameNotFoundException
    //   79	89	102	android/content/pm/PackageManager$NameNotFoundException
    //   92	99	102	android/content/pm/PackageManager$NameNotFoundException
    //   310	333	356	java/lang/ClassNotFoundException
    //   310	333	351	java/lang/IllegalAccessException
    //   310	333	346	java/lang/InstantiationException
    //   310	333	341	java/lang/NoSuchMethodException
    //   310	333	336	java/lang/reflect/InvocationTargetException
  }
  
  public void v(int paramInt) {
    try {
      String str = (String)((u51)((ArrayList)this.c).get(paramInt)).a;
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public KeyListener w(KeyListener paramKeyListener) {
    if (!(paramKeyListener instanceof android.text.method.NumberKeyListener)) {
      ((g7)((gh1)this.e).c).getClass();
      return (paramKeyListener instanceof u30) ? paramKeyListener : ((paramKeyListener == null) ? null : ((paramKeyListener instanceof android.text.method.NumberKeyListener) ? paramKeyListener : new u30(paramKeyListener)));
    } 
    return paramKeyListener;
  }
  
  public et0 y() {
    MediaController.TransportControls transportControls = ((b)this.c).a.getTransportControls();
    return (et0)((Build.VERSION.SDK_INT >= 29) ? new d(transportControls) : new d(transportControls));
  }
  
  public void z() {
    ((SparseIntArray)this.c).clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */