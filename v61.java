import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public final class v61 {
  public static final cl i = new cl(Looper.getMainLooper(), 1, false);
  
  public final List a;
  
  public final Context b;
  
  public final c00 c;
  
  public final bh0 d;
  
  public final rp1 e;
  
  public final WeakHashMap f;
  
  public final WeakHashMap g;
  
  public final ReferenceQueue h;
  
  public v61(Context paramContext, c00 paramc00, bh0 parambh0, ArrayList<? extends yr> paramArrayList, rp1 paramrp1) {
    this.b = paramContext;
    this.c = paramc00;
    this.d = parambh0;
    ArrayList<yr> arrayList = new ArrayList(paramArrayList.size() + 7);
    arrayList.add(new yr(paramContext, 1));
    arrayList.addAll(paramArrayList);
    arrayList.add(new or(paramContext));
    arrayList.add(new mw0(paramContext, 0));
    arrayList.add(new yr(paramContext, 0));
    arrayList.add(new yr(paramContext));
    arrayList.add(new mw0(paramContext, 1));
    arrayList.add(new y11(paramc00.c, paramrp1));
    this.a = Collections.unmodifiableList(arrayList);
    this.e = paramrp1;
    this.f = new WeakHashMap<Object, Object>();
    this.g = new WeakHashMap<Object, Object>();
    ReferenceQueue referenceQueue = new ReferenceQueue();
    this.h = referenceQueue;
    (new b01(referenceQueue, i)).start();
  }
  
  public final void a(Object paramObject) {
    ii0.b();
    kh0 kh0 = (kh0)this.f.remove(paramObject);
    if (kh0 != null) {
      switch (kh0.j) {
        default:
          kh0.i = true;
          break;
        case 0:
          kh0.i = true;
          break;
      } 
      cj cj = this.c.h;
      cj.sendMessage(cj.obtainMessage(2, kh0));
    } 
    if (paramObject instanceof ImageView) {
      paramObject = paramObject;
      paramObject = this.g.remove(paramObject);
      if (paramObject != null) {
        ((tx)paramObject).b.g = null;
        WeakReference<ImageView> weakReference = ((tx)paramObject).c;
        ImageView imageView = weakReference.get();
        if (imageView != null) {
          weakReference.clear();
          imageView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)paramObject);
          ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
          if (viewTreeObserver.isAlive())
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)paramObject); 
        } 
      } 
    } 
  }
  
  public final void b(kt1 paramkt1) {
    if (paramkt1 == null)
      return; 
    a(paramkt1);
  }
  
  public final void c(Bitmap paramBitmap, int paramInt, kh0 paramkh0) {
    kt1 kt11;
    kt1 kt12;
    if (paramkh0.i)
      return; 
    if (!paramkh0.h)
      this.f.remove(paramkh0.a()); 
    if (paramBitmap != null) {
      if (paramInt != 0) {
        switch (paramkh0.j) {
          default:
            if (paramBitmap != null) {
              kt12 = (kt1)paramkh0.a();
              if (kt12 != null && !paramBitmap.isRecycled())
                kt12.c(paramBitmap); 
            } 
            return;
          case 0:
            break;
        } 
        if (paramBitmap != null) {
          ImageView imageView1 = ((kh0)kt12).c.get();
          if (imageView1 != null)
            y61.a(imageView1, ((kh0)kt12).a.b, paramBitmap, paramInt, ((kh0)kt12).d); 
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder("Attempted to complete action with no result!\n");
        stringBuilder.append(kt12);
        throw new AssertionError(stringBuilder.toString());
      } 
      throw new AssertionError("LoadedFrom cannot be null.");
    } 
    switch (((kh0)kt12).j) {
      default:
        kt11 = (kt1)kt12.a();
        if (kt11 != null)
          kt11.b(); 
        return;
      case 0:
        break;
    } 
    ImageView imageView = ((kh0)kt12).c.get();
  }
  
  public final void d(kh0 paramkh0) {
    Object object = paramkh0.a();
    if (object != null) {
      WeakHashMap<Object, kh0> weakHashMap = this.f;
      if (weakHashMap.get(object) != paramkh0) {
        a(object);
        weakHashMap.put(object, paramkh0);
      } 
    } 
    cj cj = this.c.h;
    cj.sendMessage(cj.obtainMessage(1, paramkh0));
  }
  
  public final ag1 e(int paramInt) {
    if (paramInt != 0)
      return new ag1(this, null, paramInt); 
    l0.l("Resource ID must not be zero.");
    return null;
  }
  
  public final ag1 f(Uri paramUri) {
    return new ag1(this, paramUri, 0);
  }
  
  public final Bitmap g(String paramString) {
    up0 up01 = (up0)((tp0)this.d.c).f(paramString);
    up0 up02 = null;
    if (up01 != null) {
      Bitmap bitmap = up01.a;
    } else {
      up01 = null;
    } 
    if (up01 != null && up01.isRecycled())
      up01 = up02; 
    rp1 rp11 = this.e;
    if (up01 != null) {
      rp11.b.sendEmptyMessage(0);
      return (Bitmap)up01;
    } 
    rp11.b.sendEmptyMessage(1);
    return (Bitmap)up01;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */