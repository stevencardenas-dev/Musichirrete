import android.view.View;
import android.widget.AdapterView;

public final class p7 implements AdapterView.OnItemClickListener {
  public final int b;
  
  public final Object c;
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore #6
    //   6: aload_0
    //   7: getfield c : Ljava/lang/Object;
    //   10: astore_1
    //   11: iload #6
    //   13: tableswitch default -> 36, 0 -> 262, 1 -> 48
    //   36: aload_1
    //   37: checkcast androidx/appcompat/widget/SearchView
    //   40: iload_3
    //   41: iconst_0
    //   42: aconst_null
    //   43: invokevirtual onItemClicked : (IILjava/lang/String;)Z
    //   46: pop
    //   47: return
    //   48: aload_1
    //   49: checkcast com/google/android/material/textfield/MaterialAutoCompleteTextView
    //   52: astore #8
    //   54: aload #8
    //   56: getfield g : Lco0;
    //   59: astore #7
    //   61: iload_3
    //   62: ifge -> 93
    //   65: aload #7
    //   67: getfield B : Lf7;
    //   70: invokevirtual isShowing : ()Z
    //   73: ifne -> 81
    //   76: aconst_null
    //   77: astore_1
    //   78: goto -> 105
    //   81: aload #7
    //   83: getfield e : Ly10;
    //   86: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   89: astore_1
    //   90: goto -> 105
    //   93: aload #8
    //   95: invokevirtual getAdapter : ()Landroid/widget/ListAdapter;
    //   98: iload_3
    //   99: invokeinterface getItem : (I)Ljava/lang/Object;
    //   104: astore_1
    //   105: aload #8
    //   107: aload #8
    //   109: aload_1
    //   110: invokestatic a : (Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Ljava/lang/Object;)Ljava/lang/CharSequence;
    //   113: iconst_0
    //   114: invokevirtual setText : (Ljava/lang/CharSequence;Z)V
    //   117: aload #8
    //   119: invokevirtual getOnItemClickListener : ()Landroid/widget/AdapterView$OnItemClickListener;
    //   122: astore #8
    //   124: aload #8
    //   126: ifnull -> 256
    //   129: aload_2
    //   130: ifnull -> 148
    //   133: aload_2
    //   134: astore_1
    //   135: iload_3
    //   136: istore #6
    //   138: iload_3
    //   139: ifge -> 145
    //   142: goto -> 148
    //   145: goto -> 239
    //   148: aload #7
    //   150: getfield B : Lf7;
    //   153: invokevirtual isShowing : ()Z
    //   156: ifne -> 164
    //   159: aconst_null
    //   160: astore_1
    //   161: goto -> 173
    //   164: aload #7
    //   166: getfield e : Ly10;
    //   169: invokevirtual getSelectedView : ()Landroid/view/View;
    //   172: astore_1
    //   173: aload #7
    //   175: getfield B : Lf7;
    //   178: invokevirtual isShowing : ()Z
    //   181: ifne -> 189
    //   184: iconst_m1
    //   185: istore_3
    //   186: goto -> 201
    //   189: aload #7
    //   191: getfield e : Ly10;
    //   194: invokevirtual getSelectedItemPosition : ()I
    //   197: istore_3
    //   198: goto -> 186
    //   201: aload #7
    //   203: getfield B : Lf7;
    //   206: invokevirtual isShowing : ()Z
    //   209: ifne -> 223
    //   212: ldc2_w -9223372036854775808
    //   215: lstore #4
    //   217: iload_3
    //   218: istore #6
    //   220: goto -> 145
    //   223: aload #7
    //   225: getfield e : Ly10;
    //   228: invokevirtual getSelectedItemId : ()J
    //   231: lstore #4
    //   233: iload_3
    //   234: istore #6
    //   236: goto -> 145
    //   239: aload #8
    //   241: aload #7
    //   243: getfield e : Ly10;
    //   246: aload_1
    //   247: iload #6
    //   249: lload #4
    //   251: invokeinterface onItemClick : (Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    //   256: aload #7
    //   258: invokevirtual dismiss : ()V
    //   261: return
    //   262: aload_1
    //   263: checkcast r7
    //   266: astore_1
    //   267: aload_1
    //   268: getfield I : Lu7;
    //   271: astore #7
    //   273: aload #7
    //   275: iload_3
    //   276: invokevirtual setSelection : (I)V
    //   279: aload #7
    //   281: invokevirtual getOnItemClickListener : ()Landroid/widget/AdapterView$OnItemClickListener;
    //   284: ifnull -> 303
    //   287: aload #7
    //   289: aload_2
    //   290: iload_3
    //   291: aload_1
    //   292: getfield F : Lo7;
    //   295: iload_3
    //   296: invokevirtual getItemId : (I)J
    //   299: invokevirtual performItemClick : (Landroid/view/View;IJ)Z
    //   302: pop
    //   303: aload_1
    //   304: invokevirtual dismiss : ()V
    //   307: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */