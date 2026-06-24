import android.os.Parcel;

public final class jg2 extends y92 {
  public final cl1 f;
  
  public final Class g;
  
  public jg2(cl1 paramcl1, Class paramClass) {
    super("com.google.android.gms.cast.framework.ISessionManagerListener", 3);
    this.f = paramcl1;
    this.g = paramClass;
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    al1 al1;
    sg0 sg03;
    String str2;
    sg0 sg02;
    String str1;
    sg0 sg01;
    sg0 sg04;
    boolean bool = false;
    Class<al1> clazz = this.g;
    cl1 cl11 = this.f;
    switch (paramInt) {
      default:
        return false;
      case 11:
        paramParcel2.writeNoException();
        paramParcel2.writeInt(12451000);
        return true;
      case 10:
        sg03 = j31.p0(paramParcel1.readStrongBinder());
        paramInt = paramParcel1.readInt();
        mh2.d(paramParcel1);
        al1 = (al1)j31.q0(sg03);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.r(clazz.cast(al1), paramInt); 
        paramParcel2.writeNoException();
        return true;
      case 9:
        sg03 = j31.p0(al1.readStrongBinder());
        paramInt = al1.readInt();
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg03);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.j(clazz.cast(al1), paramInt); 
        paramParcel2.writeNoException();
        return true;
      case 8:
        sg03 = j31.p0(al1.readStrongBinder());
        paramInt = mh2.a;
        if (al1.readInt() != 0)
          bool = true; 
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg03);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.k(clazz.cast(al1), bool); 
        paramParcel2.writeNoException();
        return true;
      case 7:
        sg04 = j31.p0(al1.readStrongBinder());
        str2 = al1.readString();
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg04);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.p(clazz.cast(al1), str2); 
        paramParcel2.writeNoException();
        return true;
      case 6:
        sg02 = j31.p0(al1.readStrongBinder());
        paramInt = al1.readInt();
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg02);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.e(clazz.cast(al1), paramInt); 
        paramParcel2.writeNoException();
        return true;
      case 5:
        sg02 = j31.p0(al1.readStrongBinder());
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg02);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.h(clazz.cast(al1)); 
        paramParcel2.writeNoException();
        return true;
      case 4:
        sg02 = j31.p0(al1.readStrongBinder());
        paramInt = al1.readInt();
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg02);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.d(clazz.cast(al1), paramInt); 
        paramParcel2.writeNoException();
        return true;
      case 3:
        sg04 = j31.p0(al1.readStrongBinder());
        str1 = al1.readString();
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg04);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.l(clazz.cast(al1), str1); 
        paramParcel2.writeNoException();
        return true;
      case 2:
        sg01 = j31.p0(al1.readStrongBinder());
        mh2.d((Parcel)al1);
        al1 = (al1)j31.q0(sg01);
        if (clazz.isInstance(al1) && cl11 != null)
          cl11.m(clazz.cast(al1)); 
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    j31 j31 = new j31(cl11);
    paramParcel2.writeNoException();
    mh2.c(paramParcel2, j31);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */