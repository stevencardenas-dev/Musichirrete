import android.text.Editable;

public final class r30 extends Editable.Factory {
  public static final Object a = new Object();
  
  public static volatile r30 b;
  
  public static Class c;
  
  public final Editable newEditable(CharSequence paramCharSequence) {
    Class clazz = c;
    return (Editable)((clazz != null) ? new do1(clazz, paramCharSequence) : super.newEditable(paramCharSequence));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */