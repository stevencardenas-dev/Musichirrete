import in.krosbits.nativex.FDTS;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ArrayBlockingQueue;

public final class nz0 extends ki {
  public final ArrayBlockingQueue c;
  
  public final ArrayBlockingQueue e;
  
  public final FDTS f;
  
  public final boolean g;
  
  public boolean h;
  
  public boolean i;
  
  public nz0(FDTS paramFDTS, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    super(stringBuilder.toString());
    this.b = false;
    this.h = false;
    this.f = paramFDTS;
    this.g = paramBoolean2;
    this.i = paramBoolean1;
    this.c = new ArrayBlockingQueue(paramInt, true);
    this.e = new ArrayBlockingQueue(paramInt, true);
  }
  
  public static void b(nz0 paramnz0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: invokevirtual a : (Z)V
    //   7: aload_0
    //   8: getfield c : Ljava/util/concurrent/ArrayBlockingQueue;
    //   11: invokevirtual clear : ()V
    //   14: aload_0
    //   15: getfield e : Ljava/util/concurrent/ArrayBlockingQueue;
    //   18: invokevirtual clear : ()V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
    //   25	27	24	finally
  }
  
  public final void run() {
    ArrayBlockingQueue<rv> arrayBlockingQueue = this.e;
    while (true) {
      if (!this.b && !this.h)
        try {
          rv rv = arrayBlockingQueue.take();
          return;
        } finally {
          Exception exception = null;
        }  
      return;
    } 
  }
  
  public final void start() {
    /* monitor enter ThisExpression{ObjectType{nz0}} */
    try {
      int j = this.e.remainingCapacity();
      FDTS fDTS = this.f;
      long l = fDTS.p;
      int i = fDTS.osR;
      int m = fDTS.obPS;
      int k = fDTS.ocC;
      int n = (int)Math.ceil(i / 1000.0D * l);
      if (this.g) {
        i = 2;
      } else {
        i = 4;
      } 
      for (byte b = 0; b < j; b++) {
        rv rv = new rv();
        this();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n * k * m * i);
        rv.a = byteBuffer;
        byteBuffer.order(ByteOrder.nativeOrder());
        try {
          this.e.put(rv);
        } catch (InterruptedException interruptedException) {
          interruptedException.printStackTrace();
        } 
      } 
    } finally {
      Exception exception;
    } 
    super.start();
    /* monitor exit ThisExpression{ObjectType{nz0}} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */