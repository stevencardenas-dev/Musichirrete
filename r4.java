import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.FileDescriptor;
import java.util.List;
import java.util.Map;

public final class r4 extends MediaPlayer {
  public int a;
  
  public int b;
  
  public int c = 100;
  
  public boolean d = false;
  
  public r4(int paramInt1, int paramInt2) {
    try {
      this.a = paramInt1;
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void a(int paramInt) {
    this.c = paramInt;
    float f1 = (this.a * paramInt) / 10000.0F;
    float f2 = (this.b * paramInt) / 10000.0F;
    StringBuilder stringBuilder = new StringBuilder("AMP:");
    stringBuilder.append(f1);
    stringBuilder.append(",");
    stringBuilder.append(f2);
    n21.F(stringBuilder.toString());
    try {
      return;
    } finally {
      stringBuilder = null;
      stringBuilder.printStackTrace();
    } 
  }
  
  public final void reset() {
    if (this.d) {
      n21.F("AMP:r");
      super.reset();
      this.d = false;
    } 
  }
  
  public final void setDataSource(Context paramContext, Uri paramUri) {
    super.setDataSource(paramContext, paramUri);
    this.d = true;
  }
  
  public final void setDataSource(Context paramContext, Uri paramUri, Map paramMap) {
    super.setDataSource(paramContext, paramUri, paramMap);
    this.d = true;
  }
  
  public final void setDataSource(Context paramContext, Uri paramUri, Map paramMap, List paramList) {
    super.setDataSource(paramContext, paramUri, paramMap, paramList);
    this.d = true;
  }
  
  public final void setDataSource(AssetFileDescriptor paramAssetFileDescriptor) {
    super.setDataSource(paramAssetFileDescriptor);
    this.d = true;
  }
  
  public final void setDataSource(MediaDataSource paramMediaDataSource) {
    super.setDataSource(paramMediaDataSource);
    this.d = true;
  }
  
  public final void setDataSource(FileDescriptor paramFileDescriptor) {
    super.setDataSource(paramFileDescriptor);
    this.d = true;
  }
  
  public final void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) {
    super.setDataSource(paramFileDescriptor, paramLong1, paramLong2);
    this.d = true;
  }
  
  public final void setDataSource(String paramString) {
    super.setDataSource(paramString);
    this.d = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */