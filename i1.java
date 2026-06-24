import android.view.View;

public final class i1 implements View.OnClickListener {
  public final int b;
  
  public final Object c;
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_2
    //   5: aconst_null
    //   6: astore #5
    //   8: aconst_null
    //   9: astore #4
    //   11: aload_0
    //   12: getfield c : Ljava/lang/Object;
    //   15: astore #6
    //   17: iload_2
    //   18: tableswitch default -> 60, 0 -> 518, 1 -> 388, 2 -> 305, 3 -> 280, 4 -> 173, 5 -> 104, 6 -> 94
    //   60: aload #6
    //   62: checkcast androidx/appcompat/widget/Toolbar
    //   65: getfield O : Lfv1;
    //   68: astore_1
    //   69: aload_1
    //   70: ifnonnull -> 79
    //   73: aload #4
    //   75: astore_1
    //   76: goto -> 84
    //   79: aload_1
    //   80: getfield c : Luw0;
    //   83: astore_1
    //   84: aload_1
    //   85: ifnull -> 93
    //   88: aload_1
    //   89: invokevirtual collapseActionView : ()Z
    //   92: pop
    //   93: return
    //   94: aload #6
    //   96: checkcast androidx/preference/Preference
    //   99: aload_1
    //   100: invokevirtual w : (Landroid/view/View;)V
    //   103: return
    //   104: aload_1
    //   105: checkcast w01
    //   108: invokevirtual getItemData : ()Luw0;
    //   111: astore_1
    //   112: aload #6
    //   114: checkcast com/google/android/material/bottomnavigation/BottomNavigationMenuView
    //   117: astore #5
    //   119: aload #5
    //   121: invokestatic access$100 : (Lz01;)Lx01;
    //   124: astore #4
    //   126: aload #5
    //   128: invokestatic access$000 : (Lz01;)La11;
    //   131: pop
    //   132: aload #4
    //   134: getfield a : Lrw0;
    //   137: aload_1
    //   138: aconst_null
    //   139: iconst_0
    //   140: invokevirtual q : (Landroid/view/MenuItem;Lhx0;I)Z
    //   143: istore_3
    //   144: aload_1
    //   145: ifnull -> 172
    //   148: aload_1
    //   149: invokevirtual isCheckable : ()Z
    //   152: ifeq -> 172
    //   155: iload_3
    //   156: ifeq -> 166
    //   159: aload_1
    //   160: invokevirtual isChecked : ()Z
    //   163: ifeq -> 172
    //   166: aload #5
    //   168: aload_1
    //   169: invokevirtual setCheckedItem : (Landroid/view/MenuItem;)V
    //   172: return
    //   173: aload #6
    //   175: checkcast androidx/mediarouter/app/MediaRouteExpandCollapseButton
    //   178: astore #4
    //   180: aload #4
    //   182: getfield g : Landroid/graphics/drawable/AnimationDrawable;
    //   185: astore #6
    //   187: aload #4
    //   189: getfield f : Landroid/graphics/drawable/AnimationDrawable;
    //   192: astore #5
    //   194: aload #4
    //   196: getfield j : Z
    //   199: istore_3
    //   200: aload #4
    //   202: iload_3
    //   203: iconst_1
    //   204: ixor
    //   205: putfield j : Z
    //   208: iload_3
    //   209: ifne -> 237
    //   212: aload #4
    //   214: aload #5
    //   216: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   219: aload #5
    //   221: invokevirtual start : ()V
    //   224: aload #4
    //   226: aload #4
    //   228: getfield i : Ljava/lang/String;
    //   231: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   234: goto -> 259
    //   237: aload #4
    //   239: aload #6
    //   241: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   244: aload #6
    //   246: invokevirtual start : ()V
    //   249: aload #4
    //   251: aload #4
    //   253: getfield h : Ljava/lang/String;
    //   256: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   259: aload #4
    //   261: getfield k : Landroid/view/View$OnClickListener;
    //   264: astore #4
    //   266: aload #4
    //   268: ifnull -> 279
    //   271: aload #4
    //   273: aload_1
    //   274: invokeinterface onClick : (Landroid/view/View;)V
    //   279: return
    //   280: aload #6
    //   282: checkcast in/krosbits/musicolet/EqualizerActivity2
    //   285: astore #4
    //   287: aload #4
    //   289: getfield V : Lin/krosbits/android/widgets/ViewPager2;
    //   292: aload #4
    //   294: getfield U : Landroid/widget/LinearLayout;
    //   297: aload_1
    //   298: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   301: invokevirtual setCurrentItem : (I)V
    //   304: return
    //   305: aload #6
    //   307: checkcast dh
    //   310: astore #4
    //   312: aload #4
    //   314: getfield m : Z
    //   317: ifeq -> 387
    //   320: aload #4
    //   322: invokevirtual isShowing : ()Z
    //   325: ifeq -> 387
    //   328: aload #4
    //   330: getfield o : Z
    //   333: ifne -> 374
    //   336: aload #4
    //   338: invokevirtual getContext : ()Landroid/content/Context;
    //   341: iconst_1
    //   342: newarray int
    //   344: dup
    //   345: iconst_0
    //   346: ldc 16843611
    //   348: iastore
    //   349: invokevirtual obtainStyledAttributes : ([I)Landroid/content/res/TypedArray;
    //   352: astore_1
    //   353: aload #4
    //   355: aload_1
    //   356: iconst_0
    //   357: iconst_1
    //   358: invokevirtual getBoolean : (IZ)Z
    //   361: putfield n : Z
    //   364: aload_1
    //   365: invokevirtual recycle : ()V
    //   368: aload #4
    //   370: iconst_1
    //   371: putfield o : Z
    //   374: aload #4
    //   376: getfield n : Z
    //   379: ifeq -> 387
    //   382: aload #4
    //   384: invokevirtual cancel : ()V
    //   387: return
    //   388: aload #6
    //   390: checkcast y3
    //   393: astore #6
    //   395: aload_1
    //   396: aload #6
    //   398: getfield i : Landroid/widget/Button;
    //   401: if_acmpne -> 426
    //   404: aload #6
    //   406: getfield k : Landroid/os/Message;
    //   409: astore #4
    //   411: aload #4
    //   413: ifnull -> 426
    //   416: aload #4
    //   418: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
    //   421: astore #4
    //   423: goto -> 490
    //   426: aload_1
    //   427: aload #6
    //   429: getfield l : Landroid/widget/Button;
    //   432: if_acmpne -> 457
    //   435: aload #6
    //   437: getfield n : Landroid/os/Message;
    //   440: astore #4
    //   442: aload #4
    //   444: ifnull -> 457
    //   447: aload #4
    //   449: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
    //   452: astore #4
    //   454: goto -> 490
    //   457: aload #5
    //   459: astore #4
    //   461: aload_1
    //   462: aload #6
    //   464: getfield o : Landroid/widget/Button;
    //   467: if_acmpne -> 490
    //   470: aload #6
    //   472: getfield q : Landroid/os/Message;
    //   475: astore_1
    //   476: aload #5
    //   478: astore #4
    //   480: aload_1
    //   481: ifnull -> 490
    //   484: aload_1
    //   485: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
    //   488: astore #4
    //   490: aload #4
    //   492: ifnull -> 500
    //   495: aload #4
    //   497: invokevirtual sendToTarget : ()V
    //   500: aload #6
    //   502: getfield F : Lw3;
    //   505: iconst_1
    //   506: aload #6
    //   508: getfield b : Lz3;
    //   511: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   514: invokevirtual sendToTarget : ()V
    //   517: return
    //   518: aload #6
    //   520: checkcast y1
    //   523: invokevirtual a : ()V
    //   526: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */