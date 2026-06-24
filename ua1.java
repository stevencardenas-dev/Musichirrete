import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class ua1 {
  public final int a;
  
  public final int b;
  
  public final long c;
  
  public final long d;
  
  public ua1(int paramInt1, int paramInt2, long paramLong1, long paramLong2) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong1;
    this.d = paramLong2;
  }
  
  public static ua1 a(File paramFile) {
    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(paramFile));
    try {
      return new ua1(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
    } finally {
      try {
        dataInputStream.close();
      } finally {
        dataInputStream = null;
      } 
    } 
  }
  
  public final void b(File paramFile) {
    paramFile.delete();
    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(paramFile));
    try {
      dataOutputStream.writeInt(this.a);
      dataOutputStream.writeInt(this.b);
      dataOutputStream.writeLong(this.c);
      dataOutputStream.writeLong(this.d);
      return;
    } finally {
      try {
        dataOutputStream.close();
      } finally {
        dataOutputStream = null;
      } 
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && paramObject instanceof ua1) {
      paramObject = paramObject;
      if (this.b == ((ua1)paramObject).b && this.c == ((ua1)paramObject).c && this.a == ((ua1)paramObject).a && this.d == ((ua1)paramObject).d)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ua1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */