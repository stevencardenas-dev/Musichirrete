import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cast.CastDevice;
import com.google.android.material.appbar.AppBarLayout;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class lf0 implements Runnable {
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public Object f;
  
  public lf0(cu2 paramcu2, cv2 paramcv2, String paramString1, String paramString2) {
    this.c = paramcv2;
    this.e = paramString1;
    this.f = paramString2;
  }
  
  public final void run() {
    int i;
    int j;
    HashMap hashMap1;
    String str1;
    ArrayList<Intent> arrayList;
    HashMap hashMap2;
    String str3;
    aa0 aa0;
    String str2;
    m70 m70;
    mg2 mg2;
    ss0 ss0;
    ArrayList<String> arrayList1;
    ae2 ae2;
    TextView textView;
    ArrayList<Object> arrayList2;
    tb2 tb2;
    Context context;
    kk2 kk2;
    List list;
    ge2 ge2;
    switch (this.b) {
      default:
        null = (cv2)this.c;
        synchronized (null.D) {
          nf1 nf1 = (nf1)null.D.get(this.e);
          if (nf1 != null) {
            nf1.n((String)this.f);
          } else {
            str1 = (String)this.e;
            cv2.S.b("Discarded message for unknown namespace '%s'", new Object[] { str1 });
          } 
          return;
        } 
      case 7:
        m70 = (m70)this.c;
        arrayList2 = (ArrayList)this.e;
        null = (ArrayList)this.f;
        arrayList = new ArrayList();
        arrayList1 = new ArrayList();
        j = arrayList2.size();
        i = 0;
        while (i < j) {
          File file = (File)arrayList2.get(i);
          i++;
          file = file;
          String str = g92.h0(file);
          Uri uri = Uri.fromFile(file);
          Intent intent = new Intent(IGBYXeDFmKYajx.vljY);
          intent.setDataAndType(uri, m70.b.getContentResolver().getType(uri));
          intent.addFlags(1);
          intent.putExtra("module_name", str.split("\\.config\\.", 2)[0]);
          intent.putExtra("split_id", str);
          arrayList.add(intent);
          arrayList1.add(g92.h0(file).split("\\.config\\.", 2)[0]);
        } 
        tb2 = m70.k.get();
        if (tb2 != null) {
          long l = tb2.e;
          m70.h.execute(new zi2(m70, l, arrayList, arrayList1, null));
        } 
        return;
      case 6:
        wi2.L((wi2)this.c, (f1)this.e, (hf)this.f);
        return;
      case 5:
        wi2.M((wi2)this.c, (ib1)this.e, (hf)this.f);
        return;
      case 4:
        mg2 = (mg2)this.c;
        hashMap2 = mg2.g.C;
        synchronized ((String)this.e) {
          nf1 nf1 = (nf1)hashMap2.get(null);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
          if (nf1 != null) {
            str3 = (String)this.f;
            CastDevice castDevice = mg2.g.A;
            nf1.n(str3);
          } else {
            pg2.G.b("Discarded message for unknown namespace '%s'", new Object[] { null });
          } 
          return;
        } 
      case 3:
        list = (List)this.c;
        ae2 = (ae2)this.f;
        context = ae2.a;
        ge2 = ae2.c;
        kk2 = (kk2)this.e;
        try {
          Iterator<Intent> iterator = list.iterator();
          while (iterator.hasNext()) {
            str1 = ((Intent)iterator.next()).getStringExtra("split_id");
            pz0 pz0 = ge2.a;
            pz0.getClass();
            File file = new File();
            this(pz0.k(), "verified-splits");
            pz0.i(file);
            boolean bool = pz0.h(file, String.valueOf(str1).concat(".apk")).exists();
            if (!bool) {
              Integer integer;
              pz0 pz01 = ae2.b;
              try {
                Integer integer1;
                RandomAccessFile randomAccessFile = new RandomAccessFile();
                pz01.getClass();
                File file2 = new File();
                File file1 = pz01.k();
                try {
                  Integer integer2;
                  this(file1, "lock.tmp");
                  this(file2, "rw");
                  FileChannel fileChannel = randomAccessFile.getChannel();
                  try {
                    FileLock fileLock = fileChannel.tryLock();
                  } catch (OverlappingFileLockException overlappingFileLockException) {
                    ae2 = null;
                  } finally {}
                  if (ae2 != null) {
                    FileChannel fileChannel2 = fileChannel;
                    FileChannel fileChannel1 = fileChannel;
                    try {
                      Log.i("SplitCompat", "Copying splits.");
                      fileChannel2 = fileChannel;
                      fileChannel1 = fileChannel;
                      Iterator iterator1 = list.iterator();
                      while (true) {
                        fileChannel2 = fileChannel;
                        fileChannel1 = fileChannel;
                        fileChannel = fileChannel1;
                      } 
                    } catch (Exception exception1) {
                      fileChannel2 = fileChannel1;
                      Exception exception2 = exception1;
                      FileChannel fileChannel3 = fileChannel2;
                      Log.e("SplitCompat", "Error copying splits.", exception2);
                      FileChannel fileChannel4 = fileChannel2;
                      i = -13;
                      fileChannel3 = fileChannel4;
                      integer = Integer.valueOf(i);
                      fileChannel3 = fileChannel4;
                      ae2.release();
                      break;
                    } finally {
                      fileChannel1 = null;
                    } 
                  } else {
                    file2 = null;
                    integer1 = integer2;
                    File file3 = file2;
                  } 
                } catch (Exception null) {}
                Exception exception = (Exception)object;
                if (integer1 != null) {
                  integer1.close();
                  exception = (Exception)object;
                } 
              } catch (Exception null) {
                Log.e("SplitCompat", "Error locking files.", (Throwable)object);
                integer = Integer.valueOf(-13);
              } 
              if (integer != null)
                if (integer.intValue() == 0) {
                  kk2.d();
                } else {
                  kk2.c(integer.intValue());
                }  
              return;
            } 
          } 
          try {
            Context context2 = context.getApplicationContext();
            Context context1 = context;
            if (context2 != null)
              context1 = context2; 
            boolean bool = io1.d(context1, true);
            if (!bool) {
              Log.e("SplitCompat", "Emulating splits failed.");
              kk2.c(-12);
            } else {
              Log.i("SplitCompat", "Splits installed.");
              kk2.a();
            } 
          } catch (Exception null) {
            Log.e("SplitCompat", "Error emulating splits.", (Throwable)object);
            kk2.c(-12);
          } 
        } catch (Exception null) {
          Log.e("SplitCompat", "Error checking verified files.", (Throwable)object);
          kk2.c(-11);
        } 
        return;
      case 2:
        try {
          object = ((z90)this.c).call();
        } catch (Exception object) {
          object = null;
        } 
        aa0 = (aa0)this.e;
        ((Handler)this.f).post(new vi2(14, aa0, object));
        return;
      case 1:
        str2 = "";
        ss0 = (ss0)this.f;
        object = ss0.j;
        if (object == null) {
          i = -1;
        } else {
          i = object.getMax();
        } 
        textView = ss0.k;
        if (textView != null) {
          if (i < 0) {
            object = "";
          } else {
            NumberFormat numberFormat = (NumberFormat)this.c;
            object = ss0.j;
            if (object == null) {
              j = -1;
            } else {
              j = object.getProgress();
            } 
            object = numberFormat.format((j / i));
          } 
          textView.setText((CharSequence)object);
        } 
        textView = ss0.l;
        if (textView != null) {
          if (i < 0) {
            object = str2;
          } else {
            str2 = (String)this.e;
            object = ss0.j;
            if (object == null) {
              j = -1;
            } else {
              j = object.getProgress();
            } 
            object = String.format(str2, new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          } 
          textView.setText((CharSequence)object);
        } 
        if (i == -1)
          ss0.j.setIndeterminate(true); 
        return;
      case 0:
        break;
    } 
    object = this.c;
    mf0 mf0 = (mf0)this.f;
    View view = (View)this.e;
    if (view != null) {
      OverScroller overScroller = mf0.d;
      if (overScroller != null)
        if (overScroller.computeScrollOffset()) {
          mf0.A((CoordinatorLayout)object, view, mf0.d.getCurrY());
          view.postOnAnimation(this);
        } else {
          AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior)mf0;
          AppBarLayout appBarLayout = (AppBarLayout)view;
          baseBehavior.H((CoordinatorLayout)object, appBarLayout);
          if (appBarLayout.n)
            appBarLayout.g(appBarLayout.h(AppBarLayout.BaseBehavior.D((CoordinatorLayout)object))); 
        }  
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */