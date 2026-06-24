import android.app.Notification;

public final class ja0 {
  public final int a;
  
  public final int b;
  
  public final Notification c;
  
  public ja0(int paramInt1, Notification paramNotification, int paramInt2) {
    this.a = paramInt1;
    this.c = paramNotification;
    this.b = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && ja0.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((ja0)paramObject).a && this.b == ((ja0)paramObject).b)
        return this.c.equals(((ja0)paramObject).c); 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a;
    int j = this.b;
    return this.c.hashCode() + (i * 31 + j) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ForegroundInfo{mNotificationId=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mForegroundServiceType=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mNotification=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ja0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */