import android.content.Context;
import android.graphics.Typeface;

public abstract class zz1 {
  public static final zm1 a = new zm1(0);
  
  public static Typeface a(Context paramContext, String paramString) {
    zm1 zm11 = a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
    try {
      boolean bool = zm11.containsKey(paramString);
      if (!bool)
        try {
          Typeface typeface1 = Typeface.createFromAsset(paramContext.getAssets(), "fonts/".concat(paramString));
          zm11.put(paramString, typeface1);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
          return typeface1;
        } catch (RuntimeException runtimeException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
          return null;
        }  
    } finally {}
    Typeface typeface = (Typeface)zm11.get(paramString);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
    return typeface;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */