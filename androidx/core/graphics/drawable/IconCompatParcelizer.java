package androidx.core.graphics.drawable;

import a22;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import b22;
import java.nio.charset.Charset;
import l0;

public class IconCompatParcelizer {
  public static IconCompat read(a22 parama22) {
    String str1;
    Parcelable parcelable2;
    byte[] arrayOfByte1;
    Object object = new Object();
    ((IconCompat)object).a = -1;
    ((IconCompat)object).c = null;
    ((IconCompat)object).d = null;
    ((IconCompat)object).e = 0;
    ((IconCompat)object).f = 0;
    ((IconCompat)object).g = null;
    ((IconCompat)object).h = IconCompat.k;
    ((IconCompat)object).i = null;
    ((IconCompat)object).a = parama22.f(-1, 1);
    byte[] arrayOfByte2 = ((IconCompat)object).c;
    if (parama22.e(2)) {
      Parcel parcel = ((b22)parama22).e;
      int i = parcel.readInt();
      if (i < 0) {
        arrayOfByte2 = null;
      } else {
        arrayOfByte2 = new byte[i];
        parcel.readByteArray(arrayOfByte2);
      } 
    } 
    ((IconCompat)object).c = arrayOfByte2;
    ((IconCompat)object).d = parama22.g(((IconCompat)object).d, 3);
    ((IconCompat)object).e = parama22.f(((IconCompat)object).e, 4);
    ((IconCompat)object).f = parama22.f(((IconCompat)object).f, 5);
    ((IconCompat)object).g = (ColorStateList)parama22.g((Parcelable)((IconCompat)object).g, 6);
    String str2 = ((IconCompat)object).i;
    if (parama22.e(7))
      str2 = ((b22)parama22).e.readString(); 
    ((IconCompat)object).i = str2;
    str2 = ((IconCompat)object).j;
    if (!parama22.e(8)) {
      str1 = str2;
    } else {
      str1 = ((b22)str1).e.readString();
    } 
    ((IconCompat)object).j = str1;
    ((IconCompat)object).h = PorterDuff.Mode.valueOf(((IconCompat)object).i);
    switch (((IconCompat)object).a) {
      default:
        return (IconCompat)object;
      case 3:
        ((IconCompat)object).b = ((IconCompat)object).c;
        return (IconCompat)object;
      case 2:
      case 4:
      case 6:
        str1 = new String(((IconCompat)object).c, Charset.forName("UTF-16"));
        ((IconCompat)object).b = str1;
        if (((IconCompat)object).a == 2 && ((IconCompat)object).j == null)
          ((IconCompat)object).j = str1.split(":", -1)[0]; 
      case 1:
      case 5:
        parcelable2 = ((IconCompat)object).d;
        if (parcelable2 != null) {
          ((IconCompat)object).b = parcelable2;
          return (IconCompat)object;
        } 
        arrayOfByte1 = ((IconCompat)object).c;
        ((IconCompat)object).b = arrayOfByte1;
        ((IconCompat)object).a = 3;
        ((IconCompat)object).e = 0;
        ((IconCompat)object).f = arrayOfByte1.length;
        return (IconCompat)object;
      case -1:
        break;
    } 
    Parcelable parcelable1 = ((IconCompat)object).d;
    if (parcelable1 != null) {
      ((IconCompat)object).b = parcelable1;
      return (IconCompat)object;
    } 
    l0.l("Invalid icon");
    return null;
  }
  
  public static void write(IconCompat paramIconCompat, a22 parama22) {
    parama22.getClass();
    paramIconCompat.i = paramIconCompat.h.name();
    switch (paramIconCompat.a) {
      case 4:
      case 6:
        paramIconCompat.c = paramIconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
        break;
      case 3:
        paramIconCompat.c = (byte[])paramIconCompat.b;
        break;
      case 2:
        paramIconCompat.c = ((String)paramIconCompat.b).getBytes(Charset.forName("UTF-16"));
        break;
      case 1:
      case 5:
        paramIconCompat.d = (Parcelable)paramIconCompat.b;
        break;
      case -1:
        paramIconCompat.d = (Parcelable)paramIconCompat.b;
        break;
    } 
    int i = paramIconCompat.a;
    if (-1 != i)
      parama22.j(i, 1); 
    byte[] arrayOfByte = paramIconCompat.c;
    if (arrayOfByte != null) {
      parama22.i(2);
      Parcel parcel = ((b22)parama22).e;
      parcel.writeInt(arrayOfByte.length);
      parcel.writeByteArray(arrayOfByte);
    } 
    Parcelable parcelable = paramIconCompat.d;
    if (parcelable != null)
      parama22.k(parcelable, 3); 
    i = paramIconCompat.e;
    if (i != 0)
      parama22.j(i, 4); 
    i = paramIconCompat.f;
    if (i != 0)
      parama22.j(i, 5); 
    ColorStateList colorStateList = paramIconCompat.g;
    if (colorStateList != null)
      parama22.k((Parcelable)colorStateList, 6); 
    String str2 = paramIconCompat.i;
    if (str2 != null) {
      parama22.i(7);
      ((b22)parama22).e.writeString(str2);
    } 
    String str1 = paramIconCompat.j;
    if (str1 != null) {
      parama22.i(8);
      ((b22)parama22).e.writeString(str1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\core\graphics\drawable\IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */