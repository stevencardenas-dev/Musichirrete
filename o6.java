import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class o6 implements Window.Callback {
  public final Window.Callback b;
  
  public jv1 c;
  
  public boolean e;
  
  public boolean f;
  
  public boolean g;
  
  public final u6 h;
  
  public o6(u6 paramu6, Window.Callback paramCallback) {
    this.h = paramu6;
    if (paramCallback != null) {
      this.b = paramCallback;
      return;
    } 
    l0.l("Window callback may not be null");
    throw null;
  }
  
  public final void a(Window.Callback paramCallback) {
    try {
      this.e = true;
      paramCallback.onContentChanged();
      return;
    } finally {
      this.e = false;
    } 
  }
  
  public final boolean b(int paramInt, Menu paramMenu) {
    return this.b.onMenuOpened(paramInt, paramMenu);
  }
  
  public final void c(int paramInt, Menu paramMenu) {
    this.b.onPanelClosed(paramInt, paramMenu);
  }
  
  public final void d(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt) {
    p52.a(this.b, paramList, paramMenu, paramInt);
  }
  
  public final boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent) {
    return this.b.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    boolean bool = this.f;
    Window.Callback callback = this.b;
    return bool ? callback.dispatchKeyEvent(paramKeyEvent) : ((this.h.u(paramKeyEvent) || callback.dispatchKeyEvent(paramKeyEvent)));
  }
  
  public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent) {
    if (!this.b.dispatchKeyShortcutEvent(paramKeyEvent)) {
      int i = paramKeyEvent.getKeyCode();
      u6 u61 = this.h;
      u61.A();
      ui0 ui0 = u61.p;
      if (ui0 == null || !ui0.R(i, paramKeyEvent)) {
        t6 t61;
        t6 t62 = u61.O;
        if (t62 != null && u61.F(t62, paramKeyEvent.getKeyCode(), paramKeyEvent)) {
          t61 = u61.O;
          if (t61 != null) {
            t61.l = true;
            return true;
          } 
        } else {
          if (u61.O == null) {
            t62 = u61.z(0);
            u61.G(t62, (KeyEvent)t61);
            boolean bool = u61.F(t62, t61.getKeyCode(), (KeyEvent)t61);
            t62.k = false;
            if (bool)
              return true; 
          } 
          return false;
        } 
      } 
    } 
    return true;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return this.b.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    return this.b.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent) {
    return this.b.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public final void onActionModeFinished(ActionMode paramActionMode) {
    this.b.onActionModeFinished(paramActionMode);
  }
  
  public final void onActionModeStarted(ActionMode paramActionMode) {
    this.b.onActionModeStarted(paramActionMode);
  }
  
  public final void onAttachedToWindow() {
    this.b.onAttachedToWindow();
  }
  
  public final void onContentChanged() {
    if (this.e)
      this.b.onContentChanged(); 
  }
  
  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    return (paramInt == 0 && !(paramMenu instanceof rw0)) ? false : this.b.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public final View onCreatePanelView(int paramInt) {
    jv1 jv11 = this.c;
    if (jv11 != null) {
      if (paramInt == 0) {
        View view = new View(jv11.b.o.a.getContext());
      } else {
        jv11 = null;
      } 
      if (jv11 != null)
        return (View)jv11; 
    } 
    return this.b.onCreatePanelView(paramInt);
  }
  
  public final void onDetachedFromWindow() {
    this.b.onDetachedFromWindow();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    return this.b.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public final boolean onMenuOpened(int paramInt, Menu paramMenu) {
    b(paramInt, paramMenu);
    if (paramInt == 108) {
      u6 u61 = this.h;
      u61.A();
      ui0 ui0 = u61.p;
      if (ui0 != null)
        ui0.p(true); 
    } 
    return true;
  }
  
  public final void onPanelClosed(int paramInt, Menu paramMenu) {
    ui0 ui0;
    if (this.g) {
      this.b.onPanelClosed(paramInt, paramMenu);
      return;
    } 
    c(paramInt, paramMenu);
    u6 u61 = this.h;
    if (paramInt == 108) {
      u61.A();
      ui0 = u61.p;
      if (ui0 != null) {
        ui0.p(false);
        return;
      } 
    } else if (paramInt == 0) {
      t6 t6 = ui0.z(paramInt);
      if (t6.m)
        ui0.s(t6, false); 
    } 
  }
  
  public final void onPointerCaptureChanged(boolean paramBoolean) {
    q52.a(this.b, paramBoolean);
  }
  
  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    Object object;
    if (paramMenu instanceof rw0) {
      object = paramMenu;
    } else {
      object = null;
    } 
    if (paramInt == 0 && object == null)
      return false; 
    if (object != null)
      ((rw0)object).x = true; 
    jv1 jv11 = this.c;
    if (jv11 != null && paramInt == 0) {
      kv1 kv1 = jv11.b;
      if (!kv1.r) {
        kv1.o.l = true;
        kv1.r = true;
      } 
    } 
    boolean bool = this.b.onPreparePanel(paramInt, paramView, paramMenu);
    if (object != null)
      ((rw0)object).x = false; 
    return bool;
  }
  
  public final void onProvideKeyboardShortcuts(List paramList, Menu paramMenu, int paramInt) {
    rw0 rw0 = (this.h.z(0)).h;
    if (rw0 != null) {
      d(paramList, rw0, paramInt);
      return;
    } 
    d(paramList, paramMenu, paramInt);
  }
  
  public final boolean onSearchRequested() {
    return this.b.onSearchRequested();
  }
  
  public final boolean onSearchRequested(SearchEvent paramSearchEvent) {
    return o52.a(this.b, paramSearchEvent);
  }
  
  public final void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams) {
    this.b.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean) {
    this.b.onWindowFocusChanged(paramBoolean);
  }
  
  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback) {
    return null;
  }
  
  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Lu6;
    //   4: astore #6
    //   6: aload #6
    //   8: getfield m : Landroid/content/Context;
    //   11: astore_3
    //   12: aload #6
    //   14: getfield A : Z
    //   17: ifeq -> 778
    //   20: iload_2
    //   21: ifeq -> 27
    //   24: goto -> 778
    //   27: new n2
    //   30: dup
    //   31: aload_3
    //   32: aload_1
    //   33: invokespecial <init> : (Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    //   36: astore #5
    //   38: aload #6
    //   40: getfield v : Ly1;
    //   43: astore_1
    //   44: aload_1
    //   45: ifnull -> 52
    //   48: aload_1
    //   49: invokevirtual a : ()V
    //   52: new g7
    //   55: dup
    //   56: aload #6
    //   58: aload #5
    //   60: iconst_5
    //   61: iconst_0
    //   62: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;IZ)V
    //   65: astore #7
    //   67: aload #6
    //   69: invokevirtual A : ()V
    //   72: aload #6
    //   74: getfield p : Lui0;
    //   77: astore_1
    //   78: aload_1
    //   79: ifnull -> 93
    //   82: aload #6
    //   84: aload_1
    //   85: aload #7
    //   87: invokevirtual k0 : (Lg7;)Ly1;
    //   90: putfield v : Ly1;
    //   93: aload #6
    //   95: getfield v : Ly1;
    //   98: astore_1
    //   99: aconst_null
    //   100: astore #4
    //   102: aload_1
    //   103: ifnonnull -> 751
    //   106: aload #6
    //   108: getfield z : Lu32;
    //   111: astore_1
    //   112: aload_1
    //   113: ifnull -> 120
    //   116: aload_1
    //   117: invokevirtual b : ()V
    //   120: aload #6
    //   122: getfield v : Ly1;
    //   125: astore_1
    //   126: aload_1
    //   127: ifnull -> 134
    //   130: aload_1
    //   131: invokevirtual a : ()V
    //   134: aload #6
    //   136: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   139: ifnonnull -> 436
    //   142: aload #6
    //   144: getfield K : Z
    //   147: ifeq -> 359
    //   150: new android/util/TypedValue
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #8
    //   159: aload_3
    //   160: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   163: astore #9
    //   165: aload #9
    //   167: ldc_w 2130968587
    //   170: aload #8
    //   172: iconst_1
    //   173: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   176: pop
    //   177: aload_3
    //   178: astore_1
    //   179: aload #8
    //   181: getfield resourceId : I
    //   184: ifeq -> 233
    //   187: aload_3
    //   188: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   191: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   194: astore #10
    //   196: aload #10
    //   198: aload #9
    //   200: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   203: aload #10
    //   205: aload #8
    //   207: getfield resourceId : I
    //   210: iconst_1
    //   211: invokevirtual applyStyle : (IZ)V
    //   214: new bs
    //   217: dup
    //   218: aload_3
    //   219: iconst_0
    //   220: invokespecial <init> : (Landroid/content/Context;I)V
    //   223: astore_1
    //   224: aload_1
    //   225: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   228: aload #10
    //   230: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   233: aload #6
    //   235: new androidx/appcompat/widget/ActionBarContextView
    //   238: dup
    //   239: aload_1
    //   240: invokespecial <init> : (Landroid/content/Context;)V
    //   243: putfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   246: new android/widget/PopupWindow
    //   249: dup
    //   250: aload_1
    //   251: aconst_null
    //   252: ldc_w 2130968602
    //   255: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   258: astore_3
    //   259: aload #6
    //   261: aload_3
    //   262: putfield x : Landroid/widget/PopupWindow;
    //   265: aload_3
    //   266: iconst_2
    //   267: invokevirtual setWindowLayoutType : (I)V
    //   270: aload #6
    //   272: getfield x : Landroid/widget/PopupWindow;
    //   275: aload #6
    //   277: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   280: invokevirtual setContentView : (Landroid/view/View;)V
    //   283: aload #6
    //   285: getfield x : Landroid/widget/PopupWindow;
    //   288: iconst_m1
    //   289: invokevirtual setWidth : (I)V
    //   292: aload_1
    //   293: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   296: ldc_w 2130968581
    //   299: aload #8
    //   301: iconst_1
    //   302: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   305: pop
    //   306: aload #8
    //   308: getfield data : I
    //   311: aload_1
    //   312: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   315: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   318: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
    //   321: istore_2
    //   322: aload #6
    //   324: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   327: iload_2
    //   328: invokevirtual setContentHeight : (I)V
    //   331: aload #6
    //   333: getfield x : Landroid/widget/PopupWindow;
    //   336: bipush #-2
    //   338: invokevirtual setHeight : (I)V
    //   341: aload #6
    //   343: new h6
    //   346: dup
    //   347: aload #6
    //   349: iconst_1
    //   350: invokespecial <init> : (Lu6;I)V
    //   353: putfield y : Lh6;
    //   356: goto -> 436
    //   359: aload #6
    //   361: getfield C : Landroid/view/ViewGroup;
    //   364: ldc_w 2131296325
    //   367: invokevirtual findViewById : (I)Landroid/view/View;
    //   370: checkcast androidx/appcompat/widget/ViewStubCompat
    //   373: astore #8
    //   375: aload #8
    //   377: ifnull -> 436
    //   380: aload #6
    //   382: invokevirtual A : ()V
    //   385: aload #6
    //   387: getfield p : Lui0;
    //   390: astore_1
    //   391: aload_1
    //   392: ifnull -> 403
    //   395: aload_1
    //   396: invokevirtual E : ()Landroid/content/Context;
    //   399: astore_1
    //   400: goto -> 405
    //   403: aconst_null
    //   404: astore_1
    //   405: aload_1
    //   406: ifnonnull -> 414
    //   409: aload_3
    //   410: astore_1
    //   411: goto -> 414
    //   414: aload #8
    //   416: aload_1
    //   417: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   420: invokevirtual setLayoutInflater : (Landroid/view/LayoutInflater;)V
    //   423: aload #6
    //   425: aload #8
    //   427: invokevirtual a : ()Landroid/view/View;
    //   430: checkcast androidx/appcompat/widget/ActionBarContextView
    //   433: putfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   436: aload #6
    //   438: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   441: ifnull -> 736
    //   444: aload #6
    //   446: getfield z : Lu32;
    //   449: astore_1
    //   450: aload_1
    //   451: ifnull -> 458
    //   454: aload_1
    //   455: invokevirtual b : ()V
    //   458: aload #6
    //   460: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   463: invokevirtual e : ()V
    //   466: aload #6
    //   468: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   471: invokevirtual getContext : ()Landroid/content/Context;
    //   474: astore_3
    //   475: aload #6
    //   477: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   480: astore #8
    //   482: new java/lang/Object
    //   485: dup
    //   486: invokespecial <init> : ()V
    //   489: astore_1
    //   490: aload_1
    //   491: aload_3
    //   492: putfield e : Landroid/content/Context;
    //   495: aload_1
    //   496: aload #8
    //   498: putfield f : Landroidx/appcompat/widget/ActionBarContextView;
    //   501: aload_1
    //   502: aload #7
    //   504: putfield g : Lg7;
    //   507: new rw0
    //   510: dup
    //   511: aload #8
    //   513: invokevirtual getContext : ()Landroid/content/Context;
    //   516: invokespecial <init> : (Landroid/content/Context;)V
    //   519: astore_3
    //   520: aload_3
    //   521: iconst_1
    //   522: putfield l : I
    //   525: aload_1
    //   526: aload_3
    //   527: putfield j : Lrw0;
    //   530: aload_3
    //   531: aload_1
    //   532: putfield e : Lpw0;
    //   535: aload #7
    //   537: getfield c : Ljava/lang/Object;
    //   540: checkcast n2
    //   543: aload_1
    //   544: aload_3
    //   545: invokevirtual E : (Ly1;Landroid/view/Menu;)Z
    //   548: ifeq -> 730
    //   551: aload_1
    //   552: invokevirtual i : ()V
    //   555: aload #6
    //   557: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   560: aload_1
    //   561: invokevirtual c : (Ly1;)V
    //   564: aload #6
    //   566: aload_1
    //   567: putfield v : Ly1;
    //   570: aload #6
    //   572: getfield B : Z
    //   575: ifeq -> 600
    //   578: aload #6
    //   580: getfield C : Landroid/view/ViewGroup;
    //   583: astore_1
    //   584: aload_1
    //   585: ifnull -> 600
    //   588: aload_1
    //   589: invokevirtual isLaidOut : ()Z
    //   592: ifeq -> 600
    //   595: iconst_1
    //   596: istore_2
    //   597: goto -> 602
    //   600: iconst_0
    //   601: istore_2
    //   602: aload #6
    //   604: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   607: astore_1
    //   608: iload_2
    //   609: ifeq -> 654
    //   612: aload_1
    //   613: fconst_0
    //   614: invokevirtual setAlpha : (F)V
    //   617: aload #6
    //   619: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   622: invokestatic a : (Landroid/view/View;)Lu32;
    //   625: astore_1
    //   626: aload_1
    //   627: fconst_1
    //   628: invokevirtual a : (F)V
    //   631: aload #6
    //   633: aload_1
    //   634: putfield z : Lu32;
    //   637: aload_1
    //   638: new j6
    //   641: dup
    //   642: iconst_1
    //   643: aload #6
    //   645: invokespecial <init> : (ILjava/lang/Object;)V
    //   648: invokevirtual d : (Lw32;)V
    //   651: goto -> 702
    //   654: aload_1
    //   655: fconst_1
    //   656: invokevirtual setAlpha : (F)V
    //   659: aload #6
    //   661: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   664: iconst_0
    //   665: invokevirtual setVisibility : (I)V
    //   668: aload #6
    //   670: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   673: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   676: instanceof android/view/View
    //   679: ifeq -> 702
    //   682: aload #6
    //   684: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   687: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   690: checkcast android/view/View
    //   693: astore_3
    //   694: getstatic v22.a : Ljava/util/WeakHashMap;
    //   697: astore_1
    //   698: aload_3
    //   699: invokevirtual requestApplyInsets : ()V
    //   702: aload #6
    //   704: getfield x : Landroid/widget/PopupWindow;
    //   707: ifnull -> 736
    //   710: aload #6
    //   712: getfield n : Landroid/view/Window;
    //   715: invokevirtual getDecorView : ()Landroid/view/View;
    //   718: aload #6
    //   720: getfield y : Lh6;
    //   723: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   726: pop
    //   727: goto -> 736
    //   730: aload #6
    //   732: aconst_null
    //   733: putfield v : Ly1;
    //   736: aload #6
    //   738: invokevirtual I : ()V
    //   741: aload #6
    //   743: aload #6
    //   745: getfield v : Ly1;
    //   748: putfield v : Ly1;
    //   751: aload #6
    //   753: invokevirtual I : ()V
    //   756: aload #6
    //   758: getfield v : Ly1;
    //   761: astore_3
    //   762: aload #4
    //   764: astore_1
    //   765: aload_3
    //   766: ifnull -> 776
    //   769: aload #5
    //   771: aload_3
    //   772: invokevirtual s : (Ly1;)Lyq1;
    //   775: astore_1
    //   776: aload_1
    //   777: areturn
    //   778: aload_0
    //   779: getfield b : Landroid/view/Window$Callback;
    //   782: aload_1
    //   783: iload_2
    //   784: invokestatic b : (Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    //   787: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */