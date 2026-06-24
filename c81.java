import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import in.krosbits.musicolet.MyApplication;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class c81 {
  public static b81 a;
  
  public static ArrayList b;
  
  public static final HashMap c = new HashMap<Object, Object>();
  
  public static void a(Context paramContext, String paramString) {
    g(paramContext);
    if (!b.contains(paramString)) {
      b.add(paramString);
      Collections.sort(b, new w00(11));
      l(paramContext);
    } 
  }
  
  public static String b(String paramString) {
    ArrayList<Object> arrayList = g(MyApplication.i.getApplicationContext());
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      String str = (String)arrayList.get(b);
      b++;
      str = str;
      if (str.equalsIgnoreCase(paramString))
        return str; 
    } 
    return null;
  }
  
  public static b81 c(Context paramContext) {
    wn1 wn1 = MyApplication.j;
    if (wn1 == null || wn1.c == null)
      return new b81("", new ArrayList(0)); 
    if (a == null) {
      ArrayList arrayList;
      String str = paramContext.getString(2131886556);
      wn1 = MyApplication.j;
      if (wn1 == null || wn1.c == null) {
        arrayList = new ArrayList(0);
      } else {
        File file = new File(paramContext.getFilesDir(), "0.favs");
        boolean[] arrayOfBoolean = new boolean[1];
        wn1 wn12 = MyApplication.j;
        wn1 wn11 = null;
        ArrayList arrayList1 = null;
        wn1 = wn11;
        if (wn12 != null) {
          lm0 lm0 = wn12.c;
          wn1 = wn11;
          if (lm0 != null) {
            km0 km0 = yk1.a;
            try {
              ArrayList arrayList2 = yk1.c(lm0, xk1.c(file).g(), false, arrayOfBoolean);
              arrayList1 = arrayList2;
            } finally {}
            arrayList = arrayList1;
            if (arrayOfBoolean[0]) {
              arrayList = arrayList1;
              if (arrayList1 == null)
                arrayList = new ArrayList(); 
              a = new b81(paramContext.getString(2131886556), arrayList);
              if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                j();
              } else {
                i();
              } 
            } 
          } 
        } 
        if (arrayList == null)
          arrayList = new ArrayList(0); 
      } 
      a = new b81(str, arrayList);
    } 
    return a;
  }
  
  public static ArrayList d(ArrayList<Object> paramArrayList) {
    ArrayList<km0> arrayList = new ArrayList(paramArrayList.size());
    int j = paramArrayList.size();
    int i = 0;
    while (i < j) {
      km0 km0 = (km0)paramArrayList.get(i);
      int k = i + 1;
      km0 = km0;
      i = k;
      if (km0.u != 64) {
        arrayList.add(km0);
        i = k;
      } 
    } 
    return arrayList;
  }
  
  public static int e(String paramString) {
    SharedPreferences sharedPreferences = MyApplication.o();
    StringBuilder stringBuilder = new StringBuilder("I_K_SRTBYF_UPL_");
    stringBuilder.append(paramString);
    return sharedPreferences.getInt(stringBuilder.toString(), -1);
  }
  
  public static b81 f(Context paramContext, String paramString) {
    String str = paramString;
    if (paramString == null)
      str = ""; 
    ArrayList arrayList2 = (ArrayList)c.get(str);
    if (arrayList2 != null)
      return new b81(str, arrayList2); 
    ArrayList arrayList3 = new ArrayList();
    wn1 wn1 = MyApplication.j;
    if (wn1 == null || wn1.c == null)
      return new b81(str, arrayList3); 
    boolean[] arrayOfBoolean = new boolean[1];
    ArrayList arrayList1 = arrayList3;
    if (g(paramContext).contains(str))
      File file = new File(paramContext.getFilesDir(), str.concat(".mpl")); 
    if (arrayOfBoolean[0]) {
      b81 b811 = new b81(str, arrayList1);
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        k(MyApplication.i.getApplicationContext(), b811);
      } else {
        m(MyApplication.i.getApplicationContext(), b811);
      } 
    } 
    return new b81(str, arrayList1);
  }
  
  public static ArrayList g(Context paramContext) {
    if (b == null) {
      ArrayList<?> arrayList1;
      File file = new File(paramContext.getFilesDir(), "0.names");
      FileInputStream fileInputStream = null;
      paramContext = null;
      ArrayList<?> arrayList3 = null;
      ArrayList<?> arrayList2 = arrayList3;
      try {
        if (file.exists()) {
          arrayList2 = arrayList3;
          ObjectInputStream objectInputStream = new ObjectInputStream();
          arrayList2 = arrayList3;
          FileInputStream fileInputStream1 = new FileInputStream();
          arrayList2 = arrayList3;
          this(file);
          arrayList2 = arrayList3;
          this(fileInputStream1);
          arrayList2 = arrayList3;
          Object object = objectInputStream.readObject();
          fileInputStream1 = fileInputStream;
          if (object != null) {
            arrayList2 = arrayList3;
            arrayList1 = (ArrayList)object;
          } 
          arrayList2 = arrayList1;
          objectInputStream.close();
        } 
      } finally {
        paramContext = null;
        paramContext.printStackTrace();
      } 
      Collections.sort(arrayList2, new w00(11));
      b = arrayList2;
    } 
    return b;
  }
  
  public static void h(Context paramContext, b81 paramb81) {
    g(paramContext);
    File file = new File(paramContext.getFilesDir(), x41.n(new StringBuilder(), paramb81.b, ".mpl"));
    c.remove(paramb81.b);
    if (file.delete() || !file.exists()) {
      b.remove(paramb81.b);
      l(paramContext);
    } 
    SharedPreferences.Editor editor = MyApplication.o().edit();
    String str = paramb81.b;
    StringBuilder stringBuilder = new StringBuilder("I_K_SRTBYF_UPL_");
    stringBuilder.append(str);
    editor.remove(stringBuilder.toString()).apply();
  }
  
  public static void i() {
    b81 b811 = a;
    if (b811 != null && b811.c != null) {
      wn1 wn1 = MyApplication.j;
      if (wn1 != null && wn1.c != null) {
        File file = new File(MyApplication.i.getApplicationContext().getFilesDir(), "0.favs");
        xk1.e(a.c, file);
      } 
    } 
  }
  
  public static void j() {
    try {
      lt0 lt0 = new lt0();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void k(Context paramContext, b81 paramb81) {
    wn1 wn1 = MyApplication.j;
    if (wn1 != null && wn1.c != null) {
      a(paramContext, paramb81.b);
      String str = paramb81.b;
      ArrayList arrayList = paramb81.c;
      c.put(str, arrayList);
      (new br0(paramContext, paramb81)).execute(new Object[0]);
    } 
  }
  
  public static void l(Context paramContext) {
    g(paramContext);
    File file = new File(paramContext.getFilesDir(), "0.names");
    try {
      if (!file.exists())
        file.createNewFile(); 
      ObjectOutputStream objectOutputStream = new ObjectOutputStream();
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      this(fileOutputStream);
      objectOutputStream.writeObject(b);
      objectOutputStream.close();
      return;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
  }
  
  public static void m(Context paramContext, b81 paramb81) {
    wn1 wn1 = MyApplication.j;
    if (wn1 != null && wn1.c != null) {
      a(paramContext, paramb81.b);
      File file = new File(paramContext.getFilesDir(), x41.n(new StringBuilder(), paramb81.b, ".mpl"));
      try {
        if (!file.exists())
          file.createNewFile(); 
        xk1.e(paramb81.c, file);
        return;
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
  }
  
  public static void n(String paramString, int paramInt) {
    SharedPreferences.Editor editor = MyApplication.o().edit();
    StringBuilder stringBuilder = new StringBuilder("I_K_SRTBYF_UPL_");
    stringBuilder.append(paramString);
    editor.putInt(stringBuilder.toString(), paramInt).apply();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */