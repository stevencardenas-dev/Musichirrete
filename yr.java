import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.util.List;

public class yr extends dg1 {
  public final int a;
  
  public final Object b;
  
  public yr(Context paramContext) {
    this.b = paramContext.getAssets();
  }
  
  public boolean b(zf1 paramzf1) {
    Uri uri;
    int i = this.a;
    boolean bool1 = true;
    boolean bool2 = true;
    switch (i) {
      default:
        uri = paramzf1.b;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        return bool1;
      case 1:
        if (((zf1)uri).c == 0)
          bool1 = "android.resource".equals(((zf1)uri).b.getScheme()); 
        return bool1;
      case 0:
        break;
    } 
    return "content".equals(((zf1)uri).b.getScheme());
  }
  
  public m40 e(zf1 paramzf1) {
    Bitmap bitmap;
    int j;
    PackageManager.NameNotFoundException nameNotFoundException;
    BitmapFactory.Options options;
    Uri uri;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        return new m40(((AssetManager)object).open(paramzf1.b.toString().substring(22)), 2);
      case 1:
        object = object;
        i = paramzf1.c;
        uri = paramzf1.b;
        nameNotFoundException = null;
        if (i != 0 || uri == null) {
          object = object.getResources();
        } else {
          String str = uri.getAuthority();
          if (str != null) {
            try {
              object = object.getPackageManager().getResourcesForApplication(str);
            } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException1) {
              k91.j("Unable to obtain resources for package: ", uri);
              nameNotFoundException1 = nameNotFoundException;
            } 
          } else {
            k91.j("No package provided: ", uri);
            return (m40)nameNotFoundException;
          } 
        } 
        j = paramzf1.c;
        i = j;
        if (j == 0)
          if (uri == null) {
            i = j;
          } else {
            String str1;
            String str2 = uri.getAuthority();
            if (str2 != null) {
              List<String> list = uri.getPathSegments();
              if (list != null && !list.isEmpty()) {
                if (list.size() == 1) {
                  try {
                    i = Integer.parseInt(list.get(0));
                  } catch (NumberFormatException numberFormatException) {
                    k91.j("Last path segment is not a resource ID: ", uri);
                    PackageManager.NameNotFoundException nameNotFoundException1 = nameNotFoundException;
                  } 
                } else if (list.size() == 2) {
                  str1 = list.get(0);
                  i = object.getIdentifier(list.get(1), str1, str2);
                } else {
                  k91.j("More than two path segments: ", uri);
                  return (m40)str1;
                } 
              } else {
                k91.j("No path segments: ", uri);
                return (m40)str1;
              } 
            } else {
              k91.j("No package provided: ", uri);
              return (m40)str1;
            } 
          }  
        options = dg1.c(paramzf1);
        if (options != null && options.inJustDecodeBounds) {
          BitmapFactory.decodeResource((Resources)object, i, options);
          dg1.a(paramzf1.e, paramzf1.f, options.outWidth, options.outHeight, options, paramzf1);
        } 
        bitmap = BitmapFactory.decodeResource((Resources)object, i, options);
        if (bitmap != null)
          return new m40(bitmap, null, 2, 0); 
        k91.h("bitmap == null");
        throw null;
      case 0:
        break;
    } 
    return new m40(((Context)object).getContentResolver().openInputStream(((zf1)bitmap).b), 2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */