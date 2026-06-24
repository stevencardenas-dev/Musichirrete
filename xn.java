import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class xn extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public TextView w;
  
  public TextView x;
  
  public rn y;
  
  public ImageView z;
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      wn wn = this.y.g;
      if (wn != null)
        wn.d(i); 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_3
    //   8: iflt -> 591
    //   11: aload_0
    //   12: getfield y : Lrn;
    //   15: getfield g : Lwn;
    //   18: astore #6
    //   20: aload #6
    //   22: ifnull -> 589
    //   25: aload #6
    //   27: getfield I0 : Z
    //   30: ifne -> 589
    //   33: aload #6
    //   35: getfield f0 : Ljava/util/ArrayList;
    //   38: iload_3
    //   39: invokevirtual get : (I)Ljava/lang/Object;
    //   42: checkcast q3
    //   45: astore #5
    //   47: aload #5
    //   49: getfield c : Ljava/lang/String;
    //   52: astore #7
    //   54: aload #6
    //   56: getfield J0 : I
    //   59: istore_3
    //   60: iload_3
    //   61: iconst_1
    //   62: if_icmpne -> 85
    //   65: aload #6
    //   67: ldc 2131887330
    //   69: invokevirtual T : (I)Ljava/lang/String;
    //   72: astore_1
    //   73: aload #6
    //   75: ldc 2131886452
    //   77: invokevirtual T : (I)Ljava/lang/String;
    //   80: astore #4
    //   82: goto -> 200
    //   85: iload_3
    //   86: iconst_2
    //   87: if_icmpne -> 170
    //   90: aload #6
    //   92: getfield a0 : I
    //   95: istore_3
    //   96: iload_3
    //   97: ifne -> 120
    //   100: aload #6
    //   102: ldc 2131887326
    //   104: invokevirtual T : (I)Ljava/lang/String;
    //   107: astore_1
    //   108: aload #6
    //   110: ldc 2131886455
    //   112: invokevirtual T : (I)Ljava/lang/String;
    //   115: astore #4
    //   117: goto -> 200
    //   120: iload_3
    //   121: iconst_1
    //   122: if_icmpne -> 145
    //   125: aload #6
    //   127: ldc 2131887326
    //   129: invokevirtual T : (I)Ljava/lang/String;
    //   132: astore_1
    //   133: aload #6
    //   135: ldc 2131886455
    //   137: invokevirtual T : (I)Ljava/lang/String;
    //   140: astore #4
    //   142: goto -> 200
    //   145: iload_3
    //   146: iconst_2
    //   147: if_icmpne -> 195
    //   150: aload #6
    //   152: ldc 2131887327
    //   154: invokevirtual T : (I)Ljava/lang/String;
    //   157: astore_1
    //   158: aload #6
    //   160: ldc 2131886456
    //   162: invokevirtual T : (I)Ljava/lang/String;
    //   165: astore #4
    //   167: goto -> 200
    //   170: iload_3
    //   171: iconst_3
    //   172: if_icmpne -> 195
    //   175: aload #6
    //   177: ldc 2131887329
    //   179: invokevirtual T : (I)Ljava/lang/String;
    //   182: astore_1
    //   183: aload #6
    //   185: ldc 2131886453
    //   187: invokevirtual T : (I)Ljava/lang/String;
    //   190: astore #4
    //   192: goto -> 200
    //   195: aconst_null
    //   196: astore_1
    //   197: aconst_null
    //   198: astore #4
    //   200: new ms0
    //   203: dup
    //   204: aload #6
    //   206: invokevirtual P : ()Landroid/content/Context;
    //   209: invokespecial <init> : (Landroid/content/Context;)V
    //   212: astore #8
    //   214: aload #8
    //   216: aload #7
    //   218: putfield f : Ljava/lang/CharSequence;
    //   221: aload #8
    //   223: ldc 2131492930
    //   225: iconst_0
    //   226: invokevirtual e : (IZ)V
    //   229: aload #8
    //   231: getfield u : Landroid/view/View;
    //   234: ldc 2131296973
    //   236: invokevirtual findViewById : (I)Landroid/view/View;
    //   239: checkcast android/widget/LinearLayout
    //   242: astore #7
    //   244: aload #7
    //   246: ldc 2131296949
    //   248: invokevirtual findViewById : (I)Landroid/view/View;
    //   251: iconst_0
    //   252: invokevirtual setVisibility : (I)V
    //   255: aload #7
    //   257: ldc 2131297027
    //   259: invokevirtual findViewById : (I)Landroid/view/View;
    //   262: iconst_0
    //   263: invokevirtual setVisibility : (I)V
    //   266: aload #7
    //   268: ldc 2131296979
    //   270: invokevirtual findViewById : (I)Landroid/view/View;
    //   273: iconst_0
    //   274: invokevirtual setVisibility : (I)V
    //   277: aload #7
    //   279: ldc 2131296991
    //   281: invokevirtual findViewById : (I)Landroid/view/View;
    //   284: iconst_0
    //   285: invokevirtual setVisibility : (I)V
    //   288: aload #7
    //   290: ldc 2131296975
    //   292: invokevirtual findViewById : (I)Landroid/view/View;
    //   295: iconst_0
    //   296: invokevirtual setVisibility : (I)V
    //   299: aload #7
    //   301: ldc 2131297021
    //   303: invokevirtual findViewById : (I)Landroid/view/View;
    //   306: checkcast android/widget/TextView
    //   309: astore #9
    //   311: aload #9
    //   313: aload_1
    //   314: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   317: aload #9
    //   319: iconst_0
    //   320: invokevirtual setVisibility : (I)V
    //   323: invokestatic d : ()Z
    //   326: ifeq -> 351
    //   329: aload #7
    //   331: ldc 2131296980
    //   333: invokevirtual findViewById : (I)Landroid/view/View;
    //   336: checkcast android/widget/TextView
    //   339: astore_1
    //   340: aload_1
    //   341: aload #4
    //   343: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   346: aload_1
    //   347: iconst_0
    //   348: invokevirtual setVisibility : (I)V
    //   351: invokestatic U : ()Z
    //   354: ifne -> 369
    //   357: aload #7
    //   359: ldc 2131297008
    //   361: invokevirtual findViewById : (I)Landroid/view/View;
    //   364: bipush #8
    //   366: invokevirtual setVisibility : (I)V
    //   369: aload #7
    //   371: aload #6
    //   373: aload #6
    //   375: getfield n1 : Ljava/util/HashMap;
    //   378: invokestatic x0 : (Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;Ljava/util/HashMap;)V
    //   381: aload #6
    //   383: aload #5
    //   385: putfield c1 : Lq3;
    //   388: aload #6
    //   390: getfield J0 : I
    //   393: istore_3
    //   394: iload_3
    //   395: iconst_1
    //   396: if_icmpne -> 438
    //   399: aload #6
    //   401: aload #6
    //   403: getfield R0 : Landroid/content/SharedPreferences;
    //   406: ldc 'k_i_alsubcmt'
    //   408: iconst_0
    //   409: invokeinterface getInt : (Ljava/lang/String;I)I
    //   414: putfield a1 : I
    //   417: aload #6
    //   419: aload #6
    //   421: getfield R0 : Landroid/content/SharedPreferences;
    //   424: ldc 'k_b_alsubcme'
    //   426: iconst_1
    //   427: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   432: putfield j1 : Z
    //   435: goto -> 511
    //   438: iload_3
    //   439: iconst_2
    //   440: if_icmpne -> 470
    //   443: aload #6
    //   445: iconst_2
    //   446: putfield a1 : I
    //   449: aload #6
    //   451: aload #6
    //   453: getfield R0 : Landroid/content/SharedPreferences;
    //   456: ldc 'k_b_arsubcme'
    //   458: iconst_1
    //   459: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   464: putfield j1 : Z
    //   467: goto -> 511
    //   470: iload_3
    //   471: iconst_3
    //   472: if_icmpne -> 511
    //   475: aload #6
    //   477: aload #6
    //   479: getfield R0 : Landroid/content/SharedPreferences;
    //   482: ldc 'k_i_gnsubcmt'
    //   484: iconst_0
    //   485: invokeinterface getInt : (Ljava/lang/String;I)I
    //   490: putfield a1 : I
    //   493: aload #6
    //   495: aload #6
    //   497: getfield R0 : Landroid/content/SharedPreferences;
    //   500: ldc 'k_b_gnsubcme'
    //   502: iconst_1
    //   503: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   508: putfield j1 : Z
    //   511: invokestatic o : ()Landroid/content/SharedPreferences;
    //   514: astore_1
    //   515: aload #6
    //   517: invokevirtual H0 : ()Ljava/lang/String;
    //   520: astore #4
    //   522: aload #6
    //   524: getfield J0 : I
    //   527: istore_3
    //   528: iload_3
    //   529: iconst_1
    //   530: if_icmpne -> 539
    //   533: bipush #12
    //   535: istore_2
    //   536: goto -> 546
    //   539: iload_3
    //   540: iconst_2
    //   541: if_icmpne -> 546
    //   544: iconst_4
    //   545: istore_2
    //   546: aload_1
    //   547: aload #4
    //   549: iload_2
    //   550: invokeinterface getInt : (Ljava/lang/String;I)I
    //   555: istore_2
    //   556: aload #6
    //   558: aload #5
    //   560: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   563: getfield c : Llm0;
    //   566: iconst_1
    //   567: newarray int
    //   569: dup
    //   570: iconst_0
    //   571: iload_2
    //   572: iastore
    //   573: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   576: putfield O0 : Ljava/util/ArrayList;
    //   579: aload #6
    //   581: aload #8
    //   583: invokevirtual p : ()Lss0;
    //   586: putfield M0 : Lss0;
    //   589: iconst_1
    //   590: ireturn
    //   591: iconst_0
    //   592: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */