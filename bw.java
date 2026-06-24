import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public final class bw extends jy1 {
  public static final yv c = new yv();
  
  public final aw a;
  
  public final ArrayList b;
  
  public bw(aw paramaw, int paramInt1, int paramInt2) {
    ArrayList<DateFormat> arrayList = new ArrayList();
    this.b = arrayList;
    Objects.requireNonNull(paramaw);
    this.a = paramaw;
    Locale locale = Locale.US;
    arrayList.add(DateFormat.getDateTimeInstance(paramInt1, paramInt2, locale));
    if (!Locale.getDefault().equals(locale))
      arrayList.add(DateFormat.getDateTimeInstance(paramInt1, paramInt2)); 
    if (uj0.a >= 9) {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      if (paramInt1 != 0) {
        if (paramInt1 != 1) {
          if (paramInt1 != 2) {
            if (paramInt1 == 3) {
              str = "M/d/yy";
            } else {
              l0.l(ga1.i("Unknown DateFormat style: ", paramInt1));
              throw null;
            } 
          } else {
            str = "MMM d, yyyy";
          } 
        } else {
          str = "MMMM d, yyyy";
        } 
      } else {
        str = "EEEE, MMMM d, yyyy";
      } 
      stringBuilder.append(str);
      stringBuilder.append(" ");
      if (paramInt2 != 0 && paramInt2 != 1) {
        if (paramInt2 != 2) {
          if (paramInt2 == 3) {
            str = "h:mm a";
          } else {
            l0.l(ga1.i("Unknown DateFormat style: ", paramInt2));
            throw null;
          } 
        } else {
          str = "h:mm:ss a";
        } 
      } else {
        str = "h:mm:ss a z";
      } 
      stringBuilder.append(str);
      arrayList.add(new SimpleDateFormat(stringBuilder.toString(), locale));
    } 
  }
  
  public final Object b(tk0 paramtk0) {
    Date date;
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    String str = paramtk0.A();
    ArrayList arrayList = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      ArrayList<Object> arrayList1 = this.b;
      int i = arrayList1.size();
      byte b = 0;
      while (b < i) {
        DateFormat dateFormat1 = (DateFormat)arrayList1.get(b);
        b++;
        DateFormat dateFormat2 = dateFormat1;
        TimeZone timeZone = dateFormat2.getTimeZone();
        try {
          Date date1 = dateFormat2.parse(str);
          dateFormat2.setTimeZone(timeZone);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
          date = date1;
        } catch (ParseException parseException) {
        
        } finally {
          dateFormat2.setTimeZone(timeZone);
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      ParsePosition parsePosition = new ParsePosition();
      this(0);
      Date date1 = wg0.b(str, parsePosition);
      date = date1;
      return this.a.a(date);
    } catch (ParseException parseException) {
      StringBuilder stringBuilder = x41.q("Failed parsing '", str, "' as Date; at path ");
      stringBuilder.append(date.m(true));
      throw new RuntimeException(stringBuilder.toString(), parseException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    Date date = (Date)paramObject;
    if (date == null) {
      paramcl0.o();
      return;
    } 
    DateFormat dateFormat = this.b.get(0);
    synchronized (this.b) {
      String str = dateFormat.format(date);
      paramcl0.w(str);
      return;
    } 
  }
  
  public final String toString() {
    DateFormat dateFormat = this.b.get(0);
    if (dateFormat instanceof SimpleDateFormat) {
      StringBuilder stringBuilder1 = new StringBuilder("DefaultDateTypeAdapter(");
      stringBuilder1.append(((SimpleDateFormat)dateFormat).toPattern());
      stringBuilder1.append(')');
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder("DefaultDateTypeAdapter(");
    stringBuilder.append(dateFormat.getClass().getSimpleName());
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */