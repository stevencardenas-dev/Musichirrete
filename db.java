import android.util.JsonReader;
import android.util.JsonToken;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.io.BufferedReader;
import java.io.IOException;

public final class db {
  public final long a;
  
  public db(long paramLong) {
    this.a = paramLong;
  }
  
  public static db a(BufferedReader paramBufferedReader) {
    JsonReader jsonReader = new JsonReader(paramBufferedReader);
    try {
      jsonReader.beginObject();
      while (jsonReader.hasNext()) {
        if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
          if (jsonReader.peek() == JsonToken.STRING) {
            db db2 = new db(Long.parseLong(jsonReader.nextString()));
            jsonReader.close();
            return db2;
          } 
          db db1 = new db(jsonReader.nextLong());
          jsonReader.close();
          return db1;
        } 
        jsonReader.skipValue();
      } 
    } finally {
      Exception exception;
    } 
    IOException iOException = new IOException();
    this("Response is missing nextRequestWaitMillis field.");
    throw iOException;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof db) {
      paramObject = paramObject;
      if (this.a == ((db)paramObject).a)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.a;
    return (int)(l >>> 32L ^ l) ^ 0xF4243;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("LogResponse{nextRequestWaitMillis=");
    stringBuilder.append(this.a);
    stringBuilder.append(jLnXOLx.nzwwYGMclxp);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */