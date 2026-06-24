import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import in.krosbits.musicolet.SetLcWallActivity;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public final class gl1 extends pr1 implements ad0 {
  public int g;
  
  public final SetLcWallActivity h;
  
  public final Uri i;
  
  public final int j;
  
  public gl1(SetLcWallActivity paramSetLcWallActivity, Uri paramUri, int paramInt, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((gl1)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    paramObject = this.i;
    int i = this.j;
    return new gl1(this.h, (Uri)paramObject, i, paramcs);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    if (i != 0) {
      if (i == 1) {
        try {
          dd1.r0(paramObject);
        } finally {}
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      dd1.r0(paramObject);
      paramObject = this.h;
      ParcelFileDescriptor parcelFileDescriptor = paramObject.getContentResolver().openFileDescriptor(this.i, tlzLOCPTHRhep.gwMCNrYHqtkcmh);
      if (parcelFileDescriptor != null) {
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        if (fileDescriptor != null) {
          i = this.j;
          Bitmap bitmap = p3.o(fileDescriptor, i, i);
          if (bitmap != null) {
            Context context = paramObject.getApplicationContext();
            File file = new File();
            this(context.getFilesDir(), "lc_wall.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream();
            this(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            yw yw = e00.a;
            if0 if0 = fr0.a;
            fl1 fl1 = new fl1();
            this((SetLcWallActivity)paramObject, null, 0);
            this.g = 1;
            Object object = qv.l0(if0, fl1, this);
            paramObject = ys.b;
            if (object == paramObject)
              return paramObject; 
          } 
        } 
      } 
    } 
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */