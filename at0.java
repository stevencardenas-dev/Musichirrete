import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

public final class at0 extends Handler {
  public final int a;
  
  public boolean b = false;
  
  public final IBinder.DeathRecipient c;
  
  public final void handleMessage(Message paramMessage) {
    CharSequence charSequence2;
    List list2;
    i01 i01;
    MediaMetadataCompat mediaMetadataCompat;
    String str2;
    CharSequence charSequence1;
    List list1;
    dt0 dt0;
    int i = this.a;
    IBinder.DeathRecipient deathRecipient = this.c;
    switch (i) {
      default:
        deathRecipient = deathRecipient;
        if (!this.b);
        switch (paramMessage.what) {
          default:
            return;
          case 12:
            ((Integer)paramMessage.obj).getClass();
          case 11:
            ((Boolean)paramMessage.obj).getClass();
          case 9:
            ((Integer)paramMessage.obj).getClass();
          case 7:
            p01.d((Bundle)paramMessage.obj);
          case 6:
            charSequence2 = (CharSequence)paramMessage.obj;
          case 5:
            list2 = (List)((Message)charSequence2).obj;
          case 4:
            i01 = (i01)((Message)list2).obj;
          case 3:
            mediaMetadataCompat = (MediaMetadataCompat)((Message)i01).obj;
            deathRecipient.a();
          case 2:
            deathRecipient.b((PlaybackStateCompat)((Message)mediaMetadataCompat).obj);
          case 1:
            break;
        } 
        p01.d(mediaMetadataCompat.getData());
        str2 = (String)((Message)mediaMetadataCompat).obj;
      case 0:
        break;
    } 
    deathRecipient = deathRecipient;
    if (!this.b);
    switch (((Message)str2).what) {
      default:
        return;
      case 12:
        ((Integer)((Message)str2).obj).getClass();
      case 11:
        ((Boolean)((Message)str2).obj).getClass();
      case 9:
        ((Integer)((Message)str2).obj).getClass();
      case 8:
        deathRecipient.c();
      case 7:
        zv0.m((Bundle)((Message)str2).obj);
      case 6:
        charSequence1 = (CharSequence)((Message)str2).obj;
      case 5:
        list1 = (List)((Message)charSequence1).obj;
      case 4:
        dt0 = (dt0)((Message)list1).obj;
      case 3:
        deathRecipient.a((MediaMetadataCompat)((Message)dt0).obj);
      case 2:
        deathRecipient.b((PlaybackStateCompat)((Message)dt0).obj);
      case 1:
        break;
    } 
    zv0.m(dt0.getData());
    String str1 = (String)((Message)dt0).obj;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\at0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */