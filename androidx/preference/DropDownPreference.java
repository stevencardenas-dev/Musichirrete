package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import da1;
import z10;

public class DropDownPreference extends ListPreference {
  public final ArrayAdapter Z;
  
  public Spinner a0;
  
  public final z10 b0 = new z10(0, this);
  
  public DropDownPreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 2130969109, 0);
    ArrayAdapter arrayAdapter = new ArrayAdapter(paramContext, 17367049);
    this.Z = arrayAdapter;
    arrayAdapter.clear();
    CharSequence[] arrayOfCharSequence = this.U;
    if (arrayOfCharSequence != null) {
      int i = arrayOfCharSequence.length;
      while (b < i) {
        arrayAdapter.add(arrayOfCharSequence[b].toString());
        b++;
      } 
    } 
  }
  
  public final void j() {
    super.j();
    ArrayAdapter arrayAdapter = this.Z;
    if (arrayAdapter != null)
      arrayAdapter.notifyDataSetChanged(); 
  }
  
  public final void n(da1 paramda1) {
    // Byte code:
    //   0: aload_1
    //   1: getfield b : Landroid/view/View;
    //   4: ldc 2131297521
    //   6: invokevirtual findViewById : (I)Landroid/view/View;
    //   9: checkcast android/widget/Spinner
    //   12: astore_3
    //   13: aload_0
    //   14: aload_3
    //   15: putfield a0 : Landroid/widget/Spinner;
    //   18: aload_3
    //   19: aload_0
    //   20: getfield Z : Landroid/widget/ArrayAdapter;
    //   23: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   26: aload_0
    //   27: getfield a0 : Landroid/widget/Spinner;
    //   30: aload_0
    //   31: getfield b0 : Lz10;
    //   34: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   37: aload_0
    //   38: getfield a0 : Landroid/widget/Spinner;
    //   41: astore_3
    //   42: aload_0
    //   43: getfield W : Ljava/lang/String;
    //   46: astore #5
    //   48: aload #5
    //   50: ifnull -> 100
    //   53: aload_0
    //   54: getfield V : [Ljava/lang/CharSequence;
    //   57: astore #4
    //   59: aload #4
    //   61: ifnull -> 100
    //   64: aload #4
    //   66: arraylength
    //   67: iconst_1
    //   68: isub
    //   69: istore_2
    //   70: iload_2
    //   71: iflt -> 100
    //   74: aload #4
    //   76: iload_2
    //   77: aaload
    //   78: invokeinterface toString : ()Ljava/lang/String;
    //   83: aload #5
    //   85: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   88: ifeq -> 94
    //   91: goto -> 102
    //   94: iinc #2, -1
    //   97: goto -> 70
    //   100: iconst_m1
    //   101: istore_2
    //   102: aload_3
    //   103: iload_2
    //   104: invokevirtual setSelection : (I)V
    //   107: aload_0
    //   108: aload_1
    //   109: invokespecial n : (Lda1;)V
    //   112: return
  }
  
  public final void o() {
    this.a0.performClick();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\DropDownPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */