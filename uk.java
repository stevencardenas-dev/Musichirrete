import android.util.Property;
import android.view.ViewGroup;

public final class uk extends Property {
  public static final uk a = (uk)new Property(Float.class, "childrenAlpha");
  
  public final Object get(Object paramObject) {
    paramObject = ((ViewGroup)paramObject).getTag(2131297228);
    return (paramObject != null) ? paramObject : Float.valueOf(1.0F);
  }
  
  public final void set(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    float f = paramObject2.floatValue();
    paramObject1.setTag(2131297228, paramObject2);
    int i = paramObject1.getChildCount();
    for (byte b = 0; b < i; b++)
      paramObject1.getChildAt(b).setAlpha(f); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */