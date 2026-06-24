import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class hy0 extends Binder implements og0 {
  public final MultiInstanceInvalidationService e;
  
  public hy0(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {
    attachInterface(this, og0.b);
  }
  
  public final void Z(int paramInt, String[] paramArrayOfString) {
    String str;
    paramArrayOfString.getClass();
    MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
    iy0 iy0 = multiInstanceInvalidationService.e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{iy0}, name=null} */
    try {
      str = (String)multiInstanceInvalidationService.c.get(Integer.valueOf(paramInt));
      if (str == null) {
        Log.w("ROOM", zLtYiJUm.qyvEyq);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{iy0}, name=null} */
        return;
      } 
    } finally {}
    int i = multiInstanceInvalidationService.e.beginBroadcast();
    byte b = 0;
    while (true) {
      iy0 iy01 = multiInstanceInvalidationService.e;
      if (b < i) {
        try {
          object = iy01.getBroadcastCookie(b);
          object.getClass();
          object = object;
          int j = object.intValue();
          object = multiInstanceInvalidationService.c.get(object);
          if (paramInt != j) {
            boolean bool = str.equals(object);
            if (bool)
              try {
                ((ng0)multiInstanceInvalidationService.e.getBroadcastItem(b)).t(paramArrayOfString);
              } catch (RemoteException object) {
                Log.w("ROOM", "Error invoking a remote callback", (Throwable)object);
              }  
          } 
        } finally {}
        b++;
        continue;
      } 
      object.finishBroadcast();
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{iy0}, name=null} */
      return;
    } 
  }
  
  public final IBinder asBinder() {
    return (IBinder)this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    MultiInstanceInvalidationService multiInstanceInvalidationService;
    Object object = og0.b;
    if (paramInt1 >= 1 && paramInt1 <= 16777215)
      paramParcel1.enforceInterface((String)object); 
    if (paramInt1 == 1598968902) {
      paramParcel2.writeString((String)object);
      return true;
    } 
    IBinder iBinder1 = null;
    object = null;
    if (paramInt1 != 1) {
      Object object1;
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); 
        Z(paramParcel1.readInt(), paramParcel1.createStringArray());
        return true;
      } 
      iBinder1 = paramParcel1.readStrongBinder();
      if (iBinder1 != null) {
        object1 = iBinder1.queryLocalInterface(ng0.a);
        if (object1 != null && object1 instanceof ng0) {
          object1 = object1;
        } else {
          object1 = new Object();
          ((mg0)object1).e = iBinder1;
        } 
      } 
      paramInt1 = paramParcel1.readInt();
      object1.getClass();
      multiInstanceInvalidationService = this.e;
      synchronized (multiInstanceInvalidationService.e) {
        multiInstanceInvalidationService.e.unregister((IInterface)object1);
        object1 = multiInstanceInvalidationService.c.remove(Integer.valueOf(paramInt1));
        paramParcel2.writeNoException();
        return true;
      } 
    } 
    IBinder iBinder2 = paramParcel1.readStrongBinder();
    if (iBinder2 == null) {
      MultiInstanceInvalidationService multiInstanceInvalidationService1 = multiInstanceInvalidationService;
    } else {
      IInterface iInterface = iBinder2.queryLocalInterface(ng0.a);
      if (iInterface != null && iInterface instanceof ng0) {
        iInterface = iInterface;
      } else {
        object = new Object();
        ((mg0)object).e = iBinder2;
      } 
    } 
    String str = paramParcel1.readString();
    object.getClass();
    paramInt2 = 0;
    paramInt1 = 0;
    if (str == null) {
      paramInt1 = paramInt2;
    } else {
      MultiInstanceInvalidationService multiInstanceInvalidationService1 = this.e;
      iy0 iy0 = multiInstanceInvalidationService1.e;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{iy0}, name=null} */
      try {
        paramInt2 = multiInstanceInvalidationService1.b + 1;
        multiInstanceInvalidationService1.b = paramInt2;
        if (multiInstanceInvalidationService1.e.register((IInterface)object, Integer.valueOf(paramInt2))) {
          multiInstanceInvalidationService1.c.put(Integer.valueOf(paramInt2), str);
          paramInt1 = paramInt2;
        } else {
          multiInstanceInvalidationService1.b--;
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{iy0}, name=null} */
    } 
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */