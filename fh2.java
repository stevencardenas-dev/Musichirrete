import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public final class fh2 {
  public final Object a;
  
  public final Object b;
  
  public final Object c;
  
  public fh2(Object paramObject1, Object paramObject2, Object paramObject3) {
    this.a = paramObject1;
    this.b = paramObject2;
    this.c = paramObject3;
  }
  
  public final IllegalArgumentException a() {
    Object object = this.a;
    String str2 = String.valueOf(object);
    String str1 = String.valueOf(this.b);
    String str3 = String.valueOf(object);
    object = String.valueOf(this.c);
    StringBuilder stringBuilder = new StringBuilder("Multiple entries with same key: ");
    stringBuilder.append(str2);
    stringBuilder.append("=");
    stringBuilder.append(str1);
    stringBuilder.append(kOkiWEITVb.JMqGtgsjfnitZ);
    return new IllegalArgumentException(x41.o(stringBuilder, str3, "=", (String)object));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */