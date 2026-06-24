import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class tu implements ri0, ti0 {
  public static final ConcurrentHashMap e = new ConcurrentHashMap<Object, Object>();
  
  public final iu b;
  
  public final boolean c;
  
  public tu(iu paramiu, boolean paramBoolean) {
    this.b = paramiu;
    this.c = paramBoolean;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    ConcurrentHashMap<Object, Object> concurrentHashMap;
    Locale locale = paramcv.b;
    ConcurrentHashMap<Locale, Map<Object, Object>> concurrentHashMap1 = e;
    Map<Object, Object> map2 = (Map)concurrentHashMap1.get(locale);
    Map<Object, Object> map1 = map2;
    if (map2 == null) {
      map1 = new ConcurrentHashMap<Object, Object>();
      concurrentHashMap1.put(locale, map1);
    } 
    iu iu1 = this.b;
    Object[] arrayOfObject = (Object[])map1.get(iu1);
    if (arrayOfObject == null) {
      concurrentHashMap = new ConcurrentHashMap<Object, Object>(32);
      xg0 xg0 = xg0.U0(hv.c);
      AtomicReference atomicReference = ev.a;
      hu hu = iu1.a(xg0);
      if (hu.t()) {
        i = hu.o();
        int k = hu.l();
        if (k - i > 32)
          return paramInt ^ 0xFFFFFFFF; 
        int j = hu.k(locale);
        long l = 0L;
        while (i <= k) {
          l = hu.w(i, l);
          String str = hu.d(l, locale);
          Boolean bool = Boolean.TRUE;
          concurrentHashMap.put(str, bool);
          concurrentHashMap.put(hu.d(l, locale).toLowerCase(locale), bool);
          concurrentHashMap.put(hu.d(l, locale).toUpperCase(locale), bool);
          concurrentHashMap.put(hu.g(l, locale), bool);
          concurrentHashMap.put(hu.g(l, locale).toLowerCase(locale), bool);
          concurrentHashMap.put(hu.g(l, locale).toUpperCase(locale), bool);
          i++;
        } 
        i = j;
        if (xveccWbRzqx.UFVXEoegMavEjD.equals(locale.getLanguage())) {
          i = j;
          if (iu1 == iu.f) {
            Boolean bool = Boolean.TRUE;
            concurrentHashMap.put("BCE", bool);
            concurrentHashMap.put("bce", bool);
            concurrentHashMap.put("CE", bool);
            concurrentHashMap.put("ce", bool);
            i = 3;
          } 
        } 
        map1.put(iu1, new Object[] { concurrentHashMap, Integer.valueOf(i) });
        map1 = concurrentHashMap;
      } else {
        k91.o(iu1, "' is not supported", "Field '");
        return 0;
      } 
    } else {
      map1 = concurrentHashMap[0];
      i = ((Integer)concurrentHashMap[1]).intValue();
    } 
    for (int i = Math.min(paramCharSequence.length(), i + paramInt); i > paramInt; i--) {
      String str = paramCharSequence.subSequence(paramInt, i).toString();
      if (map1.containsKey(str)) {
        av av = paramcv.c();
        av.b = iu1.a(paramcv.a);
        av.c = 0;
        av.e = str;
        av.f = locale;
        return i;
      } 
    } 
    return paramInt ^ 0xFFFFFFFF;
  }
  
  public final int b() {
    return this.c ? 6 : 20;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    dd1 dd1 = paramuo0.c;
    try {
      String str;
      iu iu1 = this.b;
      if (iu1.a(dd1).t()) {
        hu hu = iu1.a(dd1);
        if (this.c) {
          str = hu.e(paramuo0, paramLocale);
        } else {
          str = hu.h((uo0)str, paramLocale);
        } 
      } else {
        str = "�";
      } 
      paramStringBuilder.append(str);
      return;
    } catch (RuntimeException runtimeException) {
      paramStringBuilder.append('�');
      return;
    } 
  }
  
  public final int d() {
    return b();
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    try {
      String str;
      hu hu = this.b.a(paramdd1);
      if (this.c) {
        str = hu.d(paramLong, paramLocale);
      } else {
        str = str.g(paramLong, paramLocale);
      } 
      paramStringBuilder.append(str);
      return;
    } catch (RuntimeException runtimeException) {
      paramStringBuilder.append('�');
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */