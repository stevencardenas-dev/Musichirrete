import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class do1 extends SpannableStringBuilder {
  public final Class b;
  
  public final ArrayList c = new ArrayList();
  
  public do1(Class paramClass, do1 paramdo1, int paramInt1, int paramInt2) {
    super((CharSequence)paramdo1, paramInt1, paramInt2);
    z51.c("watcherClass cannot be null", paramClass);
    this.b = paramClass;
  }
  
  public do1(Class paramClass, CharSequence paramCharSequence) {
    super(paramCharSequence);
    z51.c("watcherClass cannot be null", paramClass);
    this.b = paramClass;
  }
  
  public final co1 a(Object paramObject) {
    byte b = 0;
    while (true) {
      ArrayList<co1> arrayList = this.c;
      if (b < arrayList.size()) {
        co1 co1 = arrayList.get(b);
        if (co1.b == paramObject)
          return co1; 
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public final Editable append(char paramChar) {
    super.append(paramChar);
    return (Editable)this;
  }
  
  public final Editable append(CharSequence paramCharSequence) {
    super.append(paramCharSequence);
    return (Editable)this;
  }
  
  public final Editable append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return (Editable)this;
  }
  
  public final SpannableStringBuilder append(char paramChar) {
    super.append(paramChar);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence) {
    super.append(paramCharSequence);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence, Object paramObject, int paramInt) {
    super.append(paramCharSequence, paramObject, paramInt);
    return this;
  }
  
  public final Appendable append(char paramChar) {
    super.append(paramChar);
    return (Appendable)this;
  }
  
  public final Appendable append(CharSequence paramCharSequence) {
    super.append(paramCharSequence);
    return (Appendable)this;
  }
  
  public final Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return (Appendable)this;
  }
  
  public final boolean b(Object<?> paramObject) {
    if (paramObject != null) {
      paramObject = (Object<?>)paramObject.getClass();
      if (this.b == paramObject)
        return true; 
    } 
    return false;
  }
  
  public final Editable delete(int paramInt1, int paramInt2) {
    super.delete(paramInt1, paramInt2);
    return (Editable)this;
  }
  
  public final SpannableStringBuilder delete(int paramInt1, int paramInt2) {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  public final int getSpanEnd(Object paramObject) {
    Object object = paramObject;
    if (b(paramObject)) {
      co1 co1 = a(paramObject);
      object = paramObject;
      if (co1 != null)
        object = co1; 
    } 
    return super.getSpanEnd(object);
  }
  
  public final int getSpanFlags(Object paramObject) {
    Object object = paramObject;
    if (b(paramObject)) {
      co1 co1 = a(paramObject);
      object = paramObject;
      if (co1 != null)
        object = co1; 
    } 
    return super.getSpanFlags(object);
  }
  
  public final int getSpanStart(Object paramObject) {
    Object object = paramObject;
    if (b(paramObject)) {
      co1 co1 = a(paramObject);
      object = paramObject;
      if (co1 != null)
        object = co1; 
    } 
    return super.getSpanStart(object);
  }
  
  public final Object[] getSpans(int paramInt1, int paramInt2, Class<?> paramClass) {
    Object[] arrayOfObject;
    if (this.b == paramClass) {
      co1[] arrayOfCo1 = (co1[])super.getSpans(paramInt1, paramInt2, co1.class);
      arrayOfObject = (Object[])Array.newInstance(paramClass, arrayOfCo1.length);
      for (paramInt1 = 0; paramInt1 < arrayOfCo1.length; paramInt1++)
        arrayOfObject[paramInt1] = (arrayOfCo1[paramInt1]).b; 
      return arrayOfObject;
    } 
    return super.getSpans(paramInt1, paramInt2, (Class)arrayOfObject);
  }
  
  public final Editable insert(int paramInt, CharSequence paramCharSequence) {
    super.insert(paramInt, paramCharSequence);
    return (Editable)this;
  }
  
  public final Editable insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3) {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return (Editable)this;
  }
  
  public final SpannableStringBuilder insert(int paramInt, CharSequence paramCharSequence) {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  public final SpannableStringBuilder insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3) {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class<co1> paramClass) {
    if (paramClass != null) {
      Class<co1> clazz1 = paramClass;
      if (this.b == paramClass) {
        clazz1 = co1.class;
        return super.nextSpanTransition(paramInt1, paramInt2, clazz1);
      } 
      return super.nextSpanTransition(paramInt1, paramInt2, clazz1);
    } 
    Class<co1> clazz = co1.class;
    return super.nextSpanTransition(paramInt1, paramInt2, clazz);
  }
  
  public final void removeSpan(Object paramObject) {
    Object object;
    if (b(paramObject)) {
      co1 co1 = a(paramObject);
      object = co1;
      if (co1 != null) {
        paramObject = co1;
        object = co1;
      } 
    } else {
      object = null;
    } 
    super.removeSpan(paramObject);
    if (object != null)
      this.c.remove(object); 
  }
  
  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence) {
    boolean bool = false;
    byte b = 0;
    while (true) {
      ArrayList arrayList = this.c;
      if (b < arrayList.size()) {
        ((co1)arrayList.get(b)).c.incrementAndGet();
        b++;
        continue;
      } 
      super.replace(paramInt1, paramInt2, paramCharSequence);
      for (paramInt1 = bool; paramInt1 < arrayList.size(); paramInt1++)
        ((co1)arrayList.get(paramInt1)).c.decrementAndGet(); 
      return this;
    } 
  }
  
  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4) {
    boolean bool = false;
    byte b = 0;
    while (true) {
      ArrayList arrayList = this.c;
      if (b < arrayList.size()) {
        ((co1)arrayList.get(b)).c.incrementAndGet();
        b++;
        continue;
      } 
      super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
      for (paramInt1 = bool; paramInt1 < arrayList.size(); paramInt1++)
        ((co1)arrayList.get(paramInt1)).c.decrementAndGet(); 
      return this;
    } 
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3) {
    Object object = paramObject;
    if (b(paramObject)) {
      object = new co1(paramObject);
      this.c.add(object);
    } 
    super.setSpan(object, paramInt1, paramInt2, paramInt3);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2) {
    return (CharSequence)new do1(this.b, this, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\do1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */