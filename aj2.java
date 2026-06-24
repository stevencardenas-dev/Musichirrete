import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.pairip.VMRunner;

public final class aj2 extends AsyncTask {
  public static final rp0 c = new rp0("FetchBitmapTask", null);
  
  public final hl2 a;
  
  public final cn b;
  
  public aj2(Context paramContext, int paramInt1, int paramInt2, cn paramcn) {
    this.b = paramcn;
    Context context = paramContext.getApplicationContext();
    dc2 dc2 = new dc2(this);
    rp0 rp01 = lf2.a;
    try {
      hl2 hl21;
      zf2 zf2 = lf2.b(context.getApplicationContext());
      Context context1 = context.getApplicationContext();
      j31 j31 = new j31();
      this(context1);
      Parcel parcel = zf2.u(zf2.o(), 8);
      int i = parcel.readInt();
      parcel.recycle();
      if (i >= 233700000) {
        j31 j311 = new j31();
        this(this);
        hl21 = zf2.w0(j31, j311, dc2, paramInt1, paramInt2);
      } else {
        j31 = new j31();
        this(this);
        hl21 = zf2.v0(j31, (dc2)hl21, paramInt1, paramInt2);
      } 
    } catch (RemoteException remoteException) {
      lf2.a.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "newFetchBitmapTaskImpl", zf2.class.getSimpleName() });
      remoteException = null;
    } catch (wx0 wx0) {}
    this.a = (hl2)wx0;
  }
  
  public final Object doInBackground(Object[] paramArrayOfObject) {
    return VMRunner.invoke("ng1shFBdTBjxzd7e", new Object[] { aj2.class, { this, paramArrayOfObject } });
  }
  
  public final void onPostExecute(Object paramObject) {
    Bitmap bitmap = (Bitmap)paramObject;
    cn cn1 = this.b;
    if (cn1 != null) {
      paramObject = cn1.g;
      if (paramObject != null)
        paramObject.a(bitmap); 
      cn1.f = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */