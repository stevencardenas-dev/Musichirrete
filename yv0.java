import android.media.MediaDescription;
import android.media.session.MediaSession;

public abstract class yv0 {
  public static MediaSession.QueueItem a(MediaDescription paramMediaDescription, long paramLong) {
    return new MediaSession.QueueItem(paramMediaDescription, paramLong);
  }
  
  public static MediaDescription b(MediaSession.QueueItem paramQueueItem) {
    return paramQueueItem.getDescription();
  }
  
  public static long c(MediaSession.QueueItem paramQueueItem) {
    return paramQueueItem.getQueueId();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */