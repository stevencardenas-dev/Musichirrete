import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

public class a7 extends EditText implements n41 {
  public final v2 b;
  
  public final b8 c;
  
  public final g7 e;
  
  public final hu1 f;
  
  public final g7 g;
  
  public z6 h;
  
  public a7(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, paramInt);
    b8 b81 = new b8((TextView)this);
    this.c = b81;
    b81.f(paramAttributeSet, paramInt);
    b81.b();
    g7 g71 = new g7(7, false);
    g71.c = this;
    this.e = g71;
    this.f = (hu1)new Object();
    g71 = new g7(this, 6);
    this.g = g71;
    g71.A(paramAttributeSet, paramInt);
    KeyListener keyListener = getKeyListener();
    if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
      boolean bool2 = isFocusable();
      boolean bool1 = isClickable();
      boolean bool3 = isLongClickable();
      paramInt = getInputType();
      KeyListener keyListener1 = g71.w(keyListener);
      if (keyListener1 != keyListener) {
        super.setKeyListener(keyListener1);
        setRawInputType(paramInt);
        setFocusable(bool2);
        setClickable(bool1);
        setLongClickable(bool3);
      } 
    } 
  }
  
  private z6 getSuperCaller() {
    if (this.h == null)
      this.h = new z6(this); 
    return this.h;
  }
  
  public final xr a(xr paramxr) {
    this.f.getClass();
    return hu1.a((View)this, paramxr);
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    v2 v21 = this.b;
    if (v21 != null)
      v21.a(); 
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback() {
    return wf2.l0(super.getCustomSelectionActionModeCallback());
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.h() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.i() : null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    return this.c.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    return this.c.e();
  }
  
  public Editable getText() {
    return (Build.VERSION.SDK_INT >= 28) ? super.getText() : getEditableText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      g7 g71 = this.e;
      if (g71 != null) {
        TextClassifier textClassifier2 = (TextClassifier)g71.e;
        TextClassifier textClassifier1 = textClassifier2;
        if (textClassifier2 == null)
          textClassifier1 = v7.a((TextView)g71.c); 
        return textClassifier1;
      } 
    } 
    return (getSuperCaller()).a.getTextClassifier();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    bi0 bi01;
    InputConnection inputConnection2 = super.onCreateInputConnection(paramEditorInfo);
    this.c.getClass();
    b8.h(paramEditorInfo, inputConnection2, (TextView)this);
    zo2.H(paramEditorInfo, inputConnection2, (TextView)this);
    InputConnection inputConnection1 = inputConnection2;
    if (inputConnection2 != null) {
      int i = Build.VERSION.SDK_INT;
      inputConnection1 = inputConnection2;
      if (i <= 30) {
        String[] arrayOfString = v22.g(this);
        inputConnection1 = inputConnection2;
        if (arrayOfString != null) {
          ai0 ai0;
          m30.b(paramEditorInfo, arrayOfString);
          f f = new f(16, this);
          if (i >= 25) {
            ai0 = new ai0(inputConnection2, f);
          } else {
            InputConnection inputConnection;
            if ((m30.a((EditorInfo)ai0)).length == 0) {
              inputConnection = inputConnection2;
            } else {
              bi01 = new bi0(inputConnection2, (f)inputConnection);
              bi02 = bi01;
            } 
            return (InputConnection)this.g.C((InputConnection)bi02);
          } 
        } else {
          return (InputConnection)this.g.C((InputConnection)bi02);
        } 
      } else {
        return (InputConnection)this.g.C((InputConnection)bi02);
      } 
    } else {
      return (InputConnection)this.g.C((InputConnection)bi02);
    } 
    bi0 bi02 = bi01;
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    int i = Build.VERSION.SDK_INT;
    if (i >= 30 && i < 33)
      ((InputMethodManager)getContext().getSystemService("input_method")).isActive((View)this); 
  }
  
  public final boolean onDragEvent(DragEvent paramDragEvent) {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i < 31) {
      bool1 = bool2;
      if (paramDragEvent.getLocalState() == null)
        if (v22.g(this) == null) {
          bool1 = bool2;
        } else {
          StringBuilder stringBuilder;
          Context context = getContext();
          while (true) {
            if (context instanceof ContextWrapper) {
              Activity activity;
              if (context instanceof Activity) {
                activity = (Activity)context;
                break;
              } 
              Context context1 = ((ContextWrapper)activity).getBaseContext();
              continue;
            } 
            context = null;
            break;
          } 
          if (context == null) {
            stringBuilder = new StringBuilder("Can't handle drop: no activity: view=");
            stringBuilder.append(this);
            Log.i("ReceiveContent", stringBuilder.toString());
            bool1 = bool2;
          } else if (paramDragEvent.getAction() == 1) {
            bool1 = bool2;
          } else {
            bool1 = bool2;
            if (paramDragEvent.getAction() == 3)
              bool1 = i7.a(paramDragEvent, (TextView)this, (Activity)stringBuilder); 
          } 
        }  
    } 
    return bool1 ? true : super.onDragEvent(paramDragEvent);
  }
  
  public final boolean onTextContextMenuItem(int paramInt) {
    ClipData clipData;
    int i = Build.VERSION.SDK_INT;
    if (i >= 31 || v22.g(this) == null || (paramInt != 16908322 && paramInt != 16908337))
      return super.onTextContextMenuItem(paramInt); 
    ClipboardManager clipboardManager = (ClipboardManager)getContext().getSystemService("clipboard");
    if (clipboardManager == null) {
      clipboardManager = null;
    } else {
      clipData = clipboardManager.getPrimaryClip();
    } 
    if (clipData != null && clipData.getItemCount() > 0) {
      tr tr;
      vr vr;
      if (i >= 31) {
        tr = new tr(clipData, 1);
      } else {
        vr vr1 = new vr();
        vr1.b = (ClipData)tr;
        vr1.c = 1;
        vr = vr1;
      } 
      if (paramInt == 16908322) {
        paramInt = 0;
      } else {
        paramInt = 1;
      } 
      vr.f(paramInt);
      v22.j((View)this, vr.build());
    } 
    return true;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    v2 v21 = this.b;
    if (v21 != null)
      v21.m(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    v2 v21 = this.b;
    if (v21 != null)
      v21.n(paramInt); 
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(wf2.p0(paramCallback, (TextView)this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    this.g.H(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener) {
    super.setKeyListener(this.g.w(paramKeyListener));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.s(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.t(paramMode); 
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    b8 b81 = this.c;
    b81.l(paramColorStateList);
    b81.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    b8 b81 = this.c;
    b81.m(paramMode);
    b81.b();
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    b8 b81 = this.c;
    if (b81 != null)
      b81.g(paramContext, paramInt); 
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier) {
    if (Build.VERSION.SDK_INT < 28) {
      g7 g71 = this.e;
      if (g71 != null) {
        g71.e = paramTextClassifier;
        return;
      } 
    } 
    (getSuperCaller()).a.setTextClassifier(paramTextClassifier);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */