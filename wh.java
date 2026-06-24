import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class wh extends u00 {
  public final u00 b;
  
  public final ParcelFileDescriptor c;
  
  public final FileDescriptor d;
  
  public final d02 e;
  
  public final s70 f;
  
  public final c02 g;
  
  public Long h = null;
  
  public wh(u00 paramu00) {
    super(null);
    this.b = paramu00;
    ParcelFileDescriptor parcelFileDescriptor = ws2.K(paramu00.j(), fXMDNeMWaILNVh.vYsOgKDRr);
    this.c = parcelFileDescriptor;
    this.e = (d02)new ParcelFileDescriptor(parcelFileDescriptor);
    FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
    this.d = fileDescriptor;
    s70 s701 = new s70(fileDescriptor, 1);
    this.f = s701;
    this.g = s701.d();
    if (paramu00.l() && paramu00.a() && n() > 0L)
      return; 
    throw new IOException();
  }
  
  public final boolean a() {
    return true;
  }
  
  public final boolean b() {
    return false;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    return null;
  }
  
  public final boolean e() {
    return false;
  }
  
  public final boolean f() {
    return true;
  }
  
  public final void finalize() {}
  
  public final String h() {
    return this.b.h();
  }
  
  public final Uri j() {
    return this.b.j();
  }
  
  public final boolean k() {
    return false;
  }
  
  public final boolean l() {
    return true;
  }
  
  public final long n() {
    if (this.h == null) {
      try {
        this.h = Long.valueOf((Os.fstat(this.d)).st_size);
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      } 
      if (this.h == null)
        this.h = Long.valueOf(this.b.n()); 
    } 
    return this.h.longValue();
  }
  
  public final boolean o(String paramString) {
    return false;
  }
  
  public final void p() {
    try {
      c02 c021 = this.g;
      boolean bool = c021.c;
    } finally {
      Exception exception = null;
    } 
    try {
      this.f.a();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void q() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */