import android.content.SharedPreferences;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class v90 {
  public final int a;
  
  public ArrayList b = new ArrayList();
  
  public ArrayList c = new ArrayList();
  
  public void a(Uri paramUri) {
    HashSet<String> hashSet = new HashSet(MyApplication.v().getStringSet("SAF_SS_SFTSU", new HashSet(0)));
    if (!hashSet.contains(paramUri.toString())) {
      MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission(paramUri, 3);
      hashSet.add(paramUri.toString());
      MyApplication.v().edit().putStringSet("SAF_SS_SFTSU", hashSet).apply();
      this.b = null;
    } 
  }
  
  public ArrayList b() {
    /* monitor enter ThisExpression{ObjectType{v90}} */
    if (this.b == null) {
      Exception exception;
      try {
        List list = MyApplication.i.getApplicationContext().getContentResolver().getPersistedUriPermissions();
        HashSet<String> hashSet1 = new HashSet();
        this(list.size());
        for (UriPermission uriPermission : list) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("f2sm:r>p:");
          stringBuilder.append(uriPermission.getUri().toString());
          stringBuilder.append(":");
          stringBuilder.append(uriPermission.isReadPermission());
          n21.F(stringBuilder.toString());
          if (uriPermission.isReadPermission())
            hashSet1.add(uriPermission.getUri().toString()); 
        } 
      } finally {}
      SharedPreferences sharedPreferences = MyApplication.v();
      HashSet hashSet = new HashSet();
      byte b2 = 0;
      this(0);
      Set set = sharedPreferences.getStringSet("SAF_SS_SFTSU", hashSet);
      ArrayList<v00> arrayList = new ArrayList();
      this(set.size());
      Iterator<String> iterator = set.iterator();
      byte b1;
      for (b1 = 0; iterator.hasNext(); b1 = 1) {
        String str = iterator.next();
        if (exception.contains(str)) {
          Uri uri = Uri.parse(str);
          v00 v00 = v00.t(MyApplication.i.getApplicationContext(), uri);
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("f2sm:r>f:");
          stringBuilder.append(v00);
          n21.F(stringBuilder.toString());
          if (v00 != null) {
            arrayList.add(v00);
            continue;
          } 
        } 
      } 
      if (b1) {
        HashSet<String> hashSet1 = new HashSet();
        this(arrayList.size());
        int i = arrayList.size();
        b1 = b2;
        while (b1 < i) {
          exception = (Exception)arrayList.get(b1);
          b1++;
          hashSet1.add(((ww1)exception).J().toString());
        } 
        MyApplication.v().edit().putStringSet("SAF_SS_SFTSU", hashSet1).apply();
      } 
      w00 w00 = new w00();
      this(2);
      arrayList.sort(w00);
      this.b = arrayList;
      /* monitor exit ThisExpression{ObjectType{v90}} */
    } 
    return new ArrayList(this.b);
  }
  
  public v00 c(String paramString) {
    ArrayList<Object> arrayList = b();
    int j = arrayList.size();
    int i = 0;
    while (true) {
      String str = null;
      if (i < j) {
        v00 v001 = (v00)arrayList.get(i);
        int k = i + 1;
        v00 v002 = v001;
        String str1 = v002.b.toString();
        i = k;
        if (paramString.startsWith(str1)) {
          if (paramString.length() == str1.length())
            return v002; 
          i = k;
          if (paramString.length() >= str1.length() + 1) {
            i = k;
            if (paramString.charAt(str1.length()) == '/') {
              try {
                str1 = paramString.substring(str1.length() + 1);
                str = str1;
              } finally {}
              i = k;
              if (str != null)
                return v002.A(str); 
            } 
          } 
        } 
        continue;
      } 
      return null;
    } 
  }
  
  public ArrayList d() {
    if (this.c == null) {
      Set set = MyApplication.v().getStringSet("SAF_SS_SMSU", new HashSet(0));
      ArrayList<lw0> arrayList = new ArrayList(set.size());
      Iterator<String> iterator = set.iterator();
      while (iterator.hasNext())
        arrayList.add(lw0.K(Uri.parse(iterator.next()))); 
      this.c = arrayList;
    } 
    return new ArrayList(this.c);
  }
  
  public void e(Uri paramUri) {
    HashSet hashSet = new HashSet(MyApplication.v().getStringSet("SAF_SS_SFTSU", new HashSet(0)));
    if (hashSet.contains(paramUri.toString())) {
      hashSet.remove(paramUri.toString());
      MyApplication.v().edit().putStringSet("SAF_SS_SFTSU", hashSet).apply();
      this.b = null;
    } 
  }
  
  public void f(Uri paramUri) {
    String str = String.valueOf(paramUri).trim();
    HashSet hashSet = new HashSet(MyApplication.v().getStringSet("SAF_SS_SMSU", new HashSet(0)));
    if (hashSet.contains(str)) {
      hashSet.remove(str);
      MyApplication.v().edit().putStringSet("SAF_SS_SMSU", hashSet).apply();
      this.c = null;
    } 
  }
  
  public boolean g() {
    return (Build.VERSION.SDK_INT >= 30 && !d().isEmpty());
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 2:
        break;
    } 
    ArrayList arrayList2 = this.b;
    ArrayList arrayList1 = this.c;
    return String.format(GMDx.ZUXxqMM, new Object[] { arrayList2, arrayList1 });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */