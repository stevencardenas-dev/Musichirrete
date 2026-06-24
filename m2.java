import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class m2 {
  public Object a;
  
  public Object b;
  
  public Object c;
  
  public Object d;
  
  public Object e;
  
  public Object f;
  
  public m2(Set<?> paramSet, String paramString1, String paramString2) {
    if (paramSet == null) {
      paramSet = Collections.EMPTY_SET;
    } else {
      paramSet = Collections.unmodifiableSet(paramSet);
    } 
    this.a = paramSet;
    Map map = Collections.EMPTY_MAP;
    this.c = paramString1;
    this.d = paramString2;
    this.e = wm1.b;
    paramSet = new HashSet(paramSet);
    Iterator iterator = map.values().iterator();
    if (!iterator.hasNext()) {
      this.b = Collections.unmodifiableSet(paramSet);
      return;
    } 
    throw x41.g(iterator);
  }
  
  public static boolean b(int[] paramArrayOfint, int paramInt) {
    int i = paramArrayOfint.length;
    for (byte b = 0; b < i; b++) {
      if (paramArrayOfint[b] == paramInt)
        return true; 
    } 
    return false;
  }
  
  public static ColorStateList d(Context paramContext, int paramInt) {
    int k = ku1.c(paramContext, 2130968900);
    int j = ku1.b(paramContext, 2130968895);
    int[] arrayOfInt2 = ku1.b;
    int[] arrayOfInt3 = ku1.d;
    int i = jn.g(k, paramInt);
    int[] arrayOfInt1 = ku1.c;
    k = jn.g(k, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt2, arrayOfInt3, arrayOfInt1, ku1.f }, new int[] { j, i, k, paramInt });
  }
  
  public static LayerDrawable e(ig1 paramig1, Context paramContext, int paramInt) {
    BitmapDrawable bitmapDrawable1;
    BitmapDrawable bitmapDrawable2;
    BitmapDrawable bitmapDrawable3;
    paramInt = paramContext.getResources().getDimensionPixelSize(paramInt);
    Drawable drawable2 = paramig1.d(paramContext, 2131230823);
    Drawable drawable1 = paramig1.d(paramContext, 2131230824);
    if (drawable2 instanceof BitmapDrawable && drawable2.getIntrinsicWidth() == paramInt && drawable2.getIntrinsicHeight() == paramInt) {
      bitmapDrawable1 = (BitmapDrawable)drawable2;
      bitmapDrawable2 = new BitmapDrawable(bitmapDrawable1.getBitmap());
    } else {
      Bitmap bitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
      Canvas canvas = new Canvas(bitmap);
      drawable2.setBounds(0, 0, paramInt, paramInt);
      drawable2.draw(canvas);
      bitmapDrawable1 = new BitmapDrawable(bitmap);
      bitmapDrawable2 = new BitmapDrawable(bitmap);
    } 
    bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
    if (drawable1 instanceof BitmapDrawable && drawable1.getIntrinsicWidth() == paramInt && drawable1.getIntrinsicHeight() == paramInt) {
      bitmapDrawable3 = (BitmapDrawable)drawable1;
    } else {
      Bitmap bitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
      Canvas canvas = new Canvas(bitmap);
      bitmapDrawable3.setBounds(0, 0, paramInt, paramInt);
      bitmapDrawable3.draw(canvas);
      bitmapDrawable3 = new BitmapDrawable(bitmap);
    } 
    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)bitmapDrawable1, (Drawable)bitmapDrawable3, (Drawable)bitmapDrawable2 });
    layerDrawable.setId(0, 16908288);
    layerDrawable.setId(1, 16908303);
    layerDrawable.setId(2, 16908301);
    return layerDrawable;
  }
  
  public static void g(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode) {
    Drawable drawable = paramDrawable.mutate();
    PorterDuff.Mode mode = paramMode;
    if (paramMode == null)
      mode = y6.b; 
    drawable.setColorFilter((ColorFilter)y6.c(paramInt, mode));
  }
  
  public void a(String paramString1, String paramString2) {
    HashMap<String, String> hashMap = (HashMap)this.f;
    if (hashMap != null) {
      hashMap.put(paramString1, paramString2);
      return;
    } 
    tp.f("Property \"autoMetadata\" has not been set");
  }
  
  public za c() {
    if ((String)this.a == null) {
      str1 = " transportName";
    } else {
      str1 = "";
    } 
    String str2 = str1;
    if ((g40)this.c == null)
      str2 = str1.concat(" encodedPayload"); 
    String str1 = str2;
    if ((Long)this.d == null)
      str1 = str2.concat(" eventMillis"); 
    str2 = str1;
    if ((Long)this.e == null)
      str2 = str1.concat(" uptimeMillis"); 
    str1 = str2;
    if ((HashMap)this.f == null)
      str1 = str2.concat(" autoMetadata"); 
    if (str1.isEmpty())
      return new za((String)this.a, (Integer)this.b, (g40)this.c, ((Long)this.d).longValue(), ((Long)this.e).longValue(), (HashMap)this.f); 
    tp.f("Missing required properties:".concat(str1));
    return null;
  }
  
  public ColorStateList f(Context paramContext, int paramInt) {
    if (paramInt == 2131230780)
      return n21.y(paramContext, 2131099669); 
    if (paramInt == 2131230826)
      return n21.y(paramContext, 2131099672); 
    if (paramInt == 2131230825) {
      int[][] arrayOfInt1 = new int[3][];
      int[] arrayOfInt = new int[3];
      ColorStateList colorStateList = ku1.d(paramContext, 2130968955);
      if (colorStateList != null && colorStateList.isStateful()) {
        int[] arrayOfInt2 = ku1.b;
        arrayOfInt1[0] = arrayOfInt2;
        arrayOfInt[0] = colorStateList.getColorForState(arrayOfInt2, 0);
        arrayOfInt1[1] = ku1.e;
        arrayOfInt[1] = ku1.c(paramContext, 2130968899);
        arrayOfInt1[2] = ku1.f;
        arrayOfInt[2] = colorStateList.getDefaultColor();
      } else {
        arrayOfInt1[0] = ku1.b;
        arrayOfInt[0] = ku1.b(paramContext, 2130968955);
        arrayOfInt1[1] = ku1.e;
        arrayOfInt[1] = ku1.c(paramContext, 2130968899);
        arrayOfInt1[2] = ku1.f;
        arrayOfInt[2] = ku1.c(paramContext, 2130968955);
      } 
      return new ColorStateList(arrayOfInt1, arrayOfInt);
    } 
    return (paramInt == 2131230768) ? d(paramContext, ku1.c(paramContext, 2130968895)) : ((paramInt == 2131230762) ? d(paramContext, 0) : ((paramInt == 2131230767) ? d(paramContext, ku1.c(paramContext, 2130968892)) : ((paramInt == 2131230821 || paramInt == 2131230822) ? n21.y(paramContext, 2131099671) : (b((int[])this.b, paramInt) ? ku1.d(paramContext, 2130968901) : (b((int[])this.e, paramInt) ? n21.y(paramContext, 2131099668) : (b((int[])this.f, paramInt) ? n21.y(paramContext, 2131099667) : ((paramInt == 2131230818) ? n21.y(paramContext, 2131099670) : null)))))));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */