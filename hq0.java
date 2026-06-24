import in.krosbits.musicolet.LyricsEditActivity;
import in.krosbits.musicolet.MostPlayedActivity;
import in.krosbits.musicolet.MyApplication;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public final class hq0 extends ki {
  public final int c;
  
  public final Object e;
  
  public final void run() {
    int i = this.c;
    Object object = this.e;
    switch (i) {
      default:
        object = object;
        MostPlayedActivity.o0(((by0)object).c, ((by0)object).b);
        return;
      case 0:
        break;
    } 
    object = object;
    LyricsEditActivity lyricsEditActivity = LyricsEditActivity.F0;
    try {
      OutputStream outputStream = ws2.r(MyApplication.F.l(((LyricsEditActivity)object).z0));
      OutputStreamWriter outputStreamWriter = new OutputStreamWriter();
      this(outputStream);
      outputStreamWriter.write(((LyricsEditActivity)object).h0);
      outputStreamWriter.flush();
      outputStreamWriter.close();
      if (object.getIntent().getBooleanExtra("frcinvd", false)) {
        cs1 cs1 = cq0.a;
        km0 km0 = ((LyricsEditActivity)object).j0;
        iq0 iq0 = iq0.e;
        String str2 = ((LyricsEditActivity)object).z0.j().toString();
        String str1 = ((LyricsEditActivity)object).z0.h();
        km0.getClass();
        bq0 bq0 = new bq0();
        this(km0, iq0, iq0, str2, str1, null);
        qv.X(b40.b, bq0);
      } 
    } finally {}
    fq0 fq0 = new fq0();
    this((LyricsEditActivity)object, 0);
    object.runOnUiThread(fq0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */