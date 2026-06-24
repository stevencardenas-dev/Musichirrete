import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.Tag2Activity;
import java.util.ArrayList;

public final class o3 implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, View.OnClickListener {
  public ss0 b;
  
  public LayoutInflater c;
  
  public Tag2Activity e;
  
  public RecyclerView f;
  
  public un g;
  
  public TextView h;
  
  public ArrayList i;
  
  public a3 j;
  
  public final void a() {
    Exception exception;
    ArrayList<Uri> arrayList;
    Uri uri;
    try {
      Cursor cursor;
      arrayList = new ArrayList();
      this(6);
      ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
      uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
      String[] arrayOfString = new String[2];
      arrayOfString[0] = "_id";
      arrayOfString[1] = "date_added";
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString());
      stringBuilder1.append("/Camera/%");
      String str1 = stringBuilder1.toString();
      StringBuilder stringBuilder2 = new StringBuilder();
      this("_data NOT LIKE ");
      stringBuilder2.append(DatabaseUtils.sqlEscapeString(str1));
      String str2 = stringBuilder2.toString();
      if (Build.VERSION.SDK_INT >= 30) {
        Bundle bundle = new Bundle();
        this();
        bundle.putInt("android:query-arg-limit", 6);
        bundle.putString("android:query-arg-sql-selection", str2);
        bundle.putStringArray("android:query-arg-sort-columns", new String[] { "date_added" });
        bundle.putInt("android:query-arg-sort-direction", 1);
        cursor = contentResolver.query(uri, arrayOfString, bundle, null);
      } else {
        cursor = contentResolver.query(uri, (String[])cursor, str2, null, "date_added DESC limit 6");
      } 
    } finally {}
    if (exception != null) {
      while (exception.moveToNext())
        arrayList.add(Uri.withAppendedPath(uri, String.valueOf(exception.getInt(0)))); 
      exception.close();
    } 
    this.i = arrayList;
    Tag2Activity tag2Activity = this.e;
    if (tag2Activity != null && !tag2Activity.isFinishing())
      this.e.runOnUiThread(new m3(this, 0)); 
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296443) {
      Tag2Activity tag2Activity = this.e;
      tag2Activity.getClass();
      n0.A((Activity)tag2Activity, 10311);
      return;
    } 
    if (i == 2131296439) {
      Tag2Activity tag2Activity = this.e;
      tag2Activity.getClass();
      String str = MyApplication.o().getString("sosqala", "album art <al> <t>");
      try {
        return;
      } finally {
        tag2Activity = null;
        tag2Activity.printStackTrace();
      } 
    } 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.b = null;
    this.c = null;
    un un1 = this.g;
    if (un1 != null) {
      un1.onDismiss(null);
      this.g = null;
    } 
    this.e = null;
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    (new Thread(new m3(this, 1))).start();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */