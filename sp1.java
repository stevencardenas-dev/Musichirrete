import java.io.PrintWriter;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class sp1 {
  public final int a;
  
  public final int b;
  
  public final long c;
  
  public final long d;
  
  public final long e;
  
  public final long f;
  
  public final long g;
  
  public final long h;
  
  public final long i;
  
  public final long j;
  
  public final int k;
  
  public final int l;
  
  public final int m;
  
  public final long n;
  
  public sp1(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, int paramInt3, int paramInt4, int paramInt5, long paramLong9) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramLong4;
    this.g = paramLong5;
    this.h = paramLong6;
    this.i = paramLong7;
    this.j = paramLong8;
    this.k = paramInt3;
    this.l = paramInt4;
    this.m = paramInt5;
    this.n = paramLong9;
  }
  
  public final void a(PrintWriter paramPrintWriter) {
    paramPrintWriter.println("===============BEGIN PICASSO STATS ===============");
    paramPrintWriter.println(hrSTyFuSIm.IQVlIrETzQrAl);
    paramPrintWriter.print("  Max Cache Size: ");
    int j = this.a;
    paramPrintWriter.println(j);
    paramPrintWriter.print("  Cache Size: ");
    int i = this.b;
    paramPrintWriter.println(i);
    paramPrintWriter.print("  Cache % Full: ");
    paramPrintWriter.println((int)Math.ceil((i / j * 100.0F)));
    paramPrintWriter.print("  Cache Hits: ");
    paramPrintWriter.println(this.c);
    paramPrintWriter.print("  Cache Misses: ");
    paramPrintWriter.println(this.d);
    paramPrintWriter.println("Network Stats");
    paramPrintWriter.print("  Download Count: ");
    paramPrintWriter.println(this.k);
    paramPrintWriter.print("  Total Download Size: ");
    paramPrintWriter.println(this.e);
    paramPrintWriter.print("  Average Download Size: ");
    paramPrintWriter.println(this.h);
    paramPrintWriter.println("Bitmap Stats");
    paramPrintWriter.print("  Total Bitmaps Decoded: ");
    paramPrintWriter.println(this.l);
    paramPrintWriter.print("  Total Bitmap Size: ");
    paramPrintWriter.println(this.f);
    paramPrintWriter.print("  Total Transformed Bitmaps: ");
    paramPrintWriter.println(this.m);
    paramPrintWriter.print("  Total Transformed Bitmap Size: ");
    paramPrintWriter.println(this.g);
    paramPrintWriter.print("  Average Bitmap Size: ");
    paramPrintWriter.println(this.i);
    paramPrintWriter.print("  Average Transformed Bitmap Size: ");
    paramPrintWriter.println(this.j);
    paramPrintWriter.println("===============END PICASSO STATS ===============");
    paramPrintWriter.flush();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(PwbbJfsdcHrAjW.xBbecfORQC);
    stringBuilder.append(this.a);
    stringBuilder.append(", size=");
    stringBuilder.append(this.b);
    stringBuilder.append(", cacheHits=");
    stringBuilder.append(this.c);
    stringBuilder.append(", cacheMisses=");
    stringBuilder.append(this.d);
    stringBuilder.append(", downloadCount=");
    stringBuilder.append(this.k);
    stringBuilder.append(", totalDownloadSize=");
    stringBuilder.append(this.e);
    stringBuilder.append(", averageDownloadSize=");
    stringBuilder.append(this.h);
    stringBuilder.append(", totalOriginalBitmapSize=");
    stringBuilder.append(this.f);
    stringBuilder.append(", totalTransformedBitmapSize=");
    stringBuilder.append(this.g);
    stringBuilder.append(", averageOriginalBitmapSize=");
    stringBuilder.append(this.i);
    stringBuilder.append(", averageTransformedBitmapSize=");
    stringBuilder.append(this.j);
    stringBuilder.append(", originalBitmapCount=");
    stringBuilder.append(this.l);
    stringBuilder.append(", transformedBitmapCount=");
    stringBuilder.append(this.m);
    stringBuilder.append(", timeStamp=");
    stringBuilder.append(this.n);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */