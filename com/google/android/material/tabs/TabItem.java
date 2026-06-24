package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TabItem extends View {
  public final CharSequence b;
  
  public final Drawable c;
  
  public final int e;
  
  public TabItem(Context paramContext) {
    this(paramContext, null);
  }
  
  public TabItem(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_1
    //   7: aload_2
    //   8: getstatic zb1.G : [I
    //   11: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   14: astore_2
    //   15: aload_0
    //   16: aload_2
    //   17: iconst_2
    //   18: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   21: putfield b : Ljava/lang/CharSequence;
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual hasValue : (I)Z
    //   29: ifeq -> 52
    //   32: aload_2
    //   33: iconst_0
    //   34: iconst_0
    //   35: invokevirtual getResourceId : (II)I
    //   38: istore_3
    //   39: iload_3
    //   40: ifeq -> 52
    //   43: aload_1
    //   44: iload_3
    //   45: invokestatic I : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   48: astore_1
    //   49: goto -> 58
    //   52: aload_2
    //   53: iconst_0
    //   54: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   57: astore_1
    //   58: aload_0
    //   59: aload_1
    //   60: putfield c : Landroid/graphics/drawable/Drawable;
    //   63: aload_0
    //   64: aload_2
    //   65: iconst_1
    //   66: iconst_0
    //   67: invokevirtual getResourceId : (II)I
    //   70: putfield e : I
    //   73: aload_2
    //   74: invokevirtual recycle : ()V
    //   77: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\tabs\TabItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */