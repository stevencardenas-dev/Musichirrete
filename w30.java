import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class w30 extends ws2 {
  public final TextView s;
  
  public final t30 t;
  
  public boolean u;
  
  public w30(TextView paramTextView) {
    super(11);
    this.s = paramTextView;
    this.u = true;
    this.t = new t30(paramTextView);
  }
  
  public final InputFilter[] L(InputFilter[] paramArrayOfInputFilter) {
    boolean bool = this.u;
    int i = 0;
    if (!bool) {
      SparseArray sparseArray = new SparseArray(1);
      int j;
      for (j = 0; j < paramArrayOfInputFilter.length; j++) {
        InputFilter inputFilter = paramArrayOfInputFilter[j];
        if (inputFilter instanceof t30)
          sparseArray.put(j, inputFilter); 
      } 
      if (sparseArray.size() == 0)
        return paramArrayOfInputFilter; 
      int m = paramArrayOfInputFilter.length;
      InputFilter[] arrayOfInputFilter = new InputFilter[paramArrayOfInputFilter.length - sparseArray.size()];
      int k = 0;
      j = i;
      while (j < m) {
        i = k;
        if (sparseArray.indexOfKey(j) < 0) {
          arrayOfInputFilter[k] = paramArrayOfInputFilter[j];
          i = k + 1;
        } 
        j++;
        k = i;
      } 
      return arrayOfInputFilter;
    } 
    i = paramArrayOfInputFilter.length;
    byte b = 0;
    while (true) {
      t30 t301 = this.t;
      if (b < i) {
        if (paramArrayOfInputFilter[b] == t301)
          return paramArrayOfInputFilter; 
        b++;
        continue;
      } 
      InputFilter[] arrayOfInputFilter = new InputFilter[paramArrayOfInputFilter.length + 1];
      System.arraycopy(paramArrayOfInputFilter, 0, arrayOfInputFilter, 0, i);
      arrayOfInputFilter[i] = t301;
      return arrayOfInputFilter;
    } 
  }
  
  public final boolean T() {
    return this.u;
  }
  
  public final void k0(boolean paramBoolean) {
    if (paramBoolean) {
      TextView textView = this.s;
      textView.setTransformationMethod(t0(textView.getTransformationMethod()));
    } 
  }
  
  public final void l0(boolean paramBoolean) {
    this.u = paramBoolean;
    TextView textView = this.s;
    textView.setTransformationMethod(t0(textView.getTransformationMethod()));
    textView.setFilters(L(textView.getFilters()));
  }
  
  public final TransformationMethod t0(TransformationMethod paramTransformationMethod) {
    return this.u ? ((paramTransformationMethod instanceof z30) ? paramTransformationMethod : ((paramTransformationMethod instanceof android.text.method.PasswordTransformationMethod) ? paramTransformationMethod : new z30(paramTransformationMethod))) : ((paramTransformationMethod instanceof z30) ? ((z30)paramTransformationMethod).b : paramTransformationMethod);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */