import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class ja1 {
  public static final HashMap e = new HashMap<Object, Object>();
  
  public final boolean a;
  
  public final File b;
  
  public final Lock c;
  
  public FileChannel d;
  
  public ja1(String paramString, File paramFile, boolean paramBoolean) {
    Object object;
    this.a = paramBoolean;
    if (paramFile != null) {
      paramFile = new File(paramFile, paramString.concat(".lck"));
    } else {
      paramFile = null;
    } 
    this.b = paramFile;
    HashMap<String, Object> hashMap = e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      Object object1 = hashMap.get(paramString);
      object = object1;
      if (object1 == null) {
        object = new ReentrantLock();
        super();
        hashMap.put(paramString, object);
      } 
    } finally {}
    Lock lock = (Lock)object;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[ObjectType{java/lang/String}, ObjectType{java/lang/Object}]>}, name=null} */
    this.c = lock;
  }
  
  public final void a(boolean paramBoolean) {
    this.c.lock();
    if (paramBoolean) {
      File file = this.b;
      if (file != null) {
        try {
          File file1 = file.getParentFile();
          if (file1 != null)
            file1.mkdirs(); 
        } catch (IOException iOException1) {}
        FileOutputStream fileOutputStream = new FileOutputStream();
        this((File)iOException1);
        FileChannel fileChannel = fileOutputStream.getChannel();
        fileChannel.lock();
        this.d = fileChannel;
        return;
      } 
      IOException iOException = new IOException();
      this("No lock directory was provided.");
      throw iOException;
    } 
  }
  
  public final void b() {
    try {
      FileChannel fileChannel = this.d;
      if (fileChannel != null)
        fileChannel.close(); 
    } catch (IOException iOException) {}
    this.c.unlock();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ja1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */