import android.media.AudioTrack;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import java.lang.ref.ReferenceQueue;

public final class b01 extends Thread {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public b01(ParcelFileDescriptor.AutoCloseOutputStream paramAutoCloseOutputStream, byte[] paramArrayOfbyte) {
    this.c = paramAutoCloseOutputStream;
    this.e = paramArrayOfbyte;
  }
  
  public b01(e01 parame01, AudioTrack paramAudioTrack) {}
  
  public b01(ReferenceQueue paramReferenceQueue, Handler paramHandler) {
    this.c = paramReferenceQueue;
    this.e = paramHandler;
    setDaemon(true);
    setName("Picasso-refQueue");
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_1
    //   5: aload_0
    //   6: getfield e : Ljava/lang/Object;
    //   9: astore_3
    //   10: aload_0
    //   11: getfield c : Ljava/lang/Object;
    //   14: astore_2
    //   15: iload_1
    //   16: tableswitch default -> 40, 0 -> 156, 1 -> 66
    //   40: aload_2
    //   41: checkcast android/os/ParcelFileDescriptor$AutoCloseOutputStream
    //   44: astore_2
    //   45: aload_2
    //   46: aload_3
    //   47: checkcast [B
    //   50: invokevirtual write : ([B)V
    //   53: aload_2
    //   54: invokevirtual close : ()V
    //   57: goto -> 65
    //   60: astore_2
    //   61: aload_2
    //   62: invokevirtual printStackTrace : ()V
    //   65: return
    //   66: aload_3
    //   67: checkcast android/os/Handler
    //   70: astore_3
    //   71: bipush #10
    //   73: invokestatic setThreadPriority : (I)V
    //   76: aload_2
    //   77: checkcast java/lang/ref/ReferenceQueue
    //   80: ldc2_w 1000
    //   83: invokevirtual remove : (J)Ljava/lang/ref/Reference;
    //   86: checkcast g1
    //   89: astore #4
    //   91: aload_3
    //   92: invokevirtual obtainMessage : ()Landroid/os/Message;
    //   95: astore #5
    //   97: aload #4
    //   99: ifnull -> 132
    //   102: aload #5
    //   104: iconst_3
    //   105: putfield what : I
    //   108: aload #5
    //   110: aload #4
    //   112: getfield a : Lkh0;
    //   115: putfield obj : Ljava/lang/Object;
    //   118: aload_3
    //   119: aload #5
    //   121: invokevirtual sendMessage : (Landroid/os/Message;)Z
    //   124: pop
    //   125: goto -> 76
    //   128: astore_2
    //   129: goto -> 140
    //   132: aload #5
    //   134: invokevirtual recycle : ()V
    //   137: goto -> 76
    //   140: aload_3
    //   141: new e3
    //   144: dup
    //   145: bipush #24
    //   147: aload_2
    //   148: invokespecial <init> : (ILjava/lang/Object;)V
    //   151: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   154: pop
    //   155: return
    //   156: aload_3
    //   157: checkcast e01
    //   160: getfield a : Landroid/os/ConditionVariable;
    //   163: astore_3
    //   164: aload_2
    //   165: checkcast android/media/AudioTrack
    //   168: astore_2
    //   169: aload_2
    //   170: invokevirtual flush : ()V
    //   173: aload_2
    //   174: invokevirtual release : ()V
    //   177: aload_3
    //   178: invokevirtual open : ()V
    //   181: return
    //   182: astore_2
    //   183: aload_3
    //   184: invokevirtual open : ()V
    //   187: aload_2
    //   188: athrow
    //   189: astore_2
    //   190: goto -> 155
    // Exception table:
    //   from	to	target	type
    //   45	57	60	finally
    //   76	97	189	java/lang/InterruptedException
    //   76	97	128	java/lang/Exception
    //   102	125	189	java/lang/InterruptedException
    //   102	125	128	java/lang/Exception
    //   132	137	189	java/lang/InterruptedException
    //   132	137	128	java/lang/Exception
    //   169	177	182	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */