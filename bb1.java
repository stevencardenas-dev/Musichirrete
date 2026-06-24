import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class bb1 implements g31 {
  public static final Charset f = Charset.forName("UTF-8");
  
  public static final v70 g;
  
  public static final v70 h;
  
  public static final jk0 i = new jk0(1);
  
  public OutputStream a;
  
  public final HashMap b;
  
  public final HashMap c;
  
  public final f31 d;
  
  public final cb1 e = new cb1(this);
  
  public bb1(ByteArrayOutputStream paramByteArrayOutputStream, HashMap paramHashMap1, HashMap paramHashMap2, f31 paramf31) {
    this.a = paramByteArrayOutputStream;
    this.b = paramHashMap1;
    this.c = paramHashMap2;
    this.d = paramf31;
  }
  
  public static int g(v70 paramv70) {
    ab1 ab1 = (ab1)paramv70.b.get(ab1.class);
    if (ab1 != null)
      return ab1.tag(); 
    throw new RuntimeException("Field has no @Protobuf config");
  }
  
  public final g31 a(v70 paramv70, Object paramObject) {
    e(paramv70, paramObject, true);
    return this;
  }
  
  public final void b(v70 paramv70, int paramInt, boolean paramBoolean) {
    if (!paramBoolean || paramInt != 0) {
      ab1 ab1 = (ab1)paramv70.b.get(ab1.class);
      if (ab1 != null) {
        int i = ab1.intEncoding().ordinal();
        if (i != 0) {
          if (i != 1) {
            if (i == 2) {
              h(ab1.tag() << 3 | 0x5);
              this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(paramInt).array());
              return;
            } 
            return;
          } 
          h(ab1.tag() << 3);
          h(paramInt << 1 ^ paramInt >> 31);
          return;
        } 
        h(ab1.tag() << 3);
        h(paramInt);
        return;
      } 
      throw new RuntimeException("Field has no @Protobuf config");
    } 
  }
  
  public final void c(v70 paramv70, long paramLong, boolean paramBoolean) {
    if (!paramBoolean || paramLong != 0L) {
      ab1 ab1 = (ab1)paramv70.b.get(ab1.class);
      if (ab1 != null) {
        int i = ab1.intEncoding().ordinal();
        if (i != 0) {
          if (i != 1) {
            if (i == 2) {
              h(ab1.tag() << 3 | 0x1);
              this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(paramLong).array());
              return;
            } 
            return;
          } 
          h(ab1.tag() << 3);
          i(paramLong >> 63L ^ paramLong << 1L);
          return;
        } 
        h(ab1.tag() << 3);
        i(paramLong);
        return;
      } 
      throw new RuntimeException("Field has no @Protobuf config");
    } 
  }
  
  public final g31 d(v70 paramv70, long paramLong) {
    c(paramv70, paramLong, true);
    return this;
  }
  
  public final void e(v70 paramv70, Object paramObject, boolean paramBoolean) {
    if (paramObject != null) {
      byte[] arrayOfByte;
      if (paramObject instanceof CharSequence) {
        paramObject = paramObject;
        if (!paramBoolean || paramObject.length() != 0) {
          h(g(paramv70) << 3 | 0x2);
          arrayOfByte = paramObject.toString().getBytes(f);
          h(arrayOfByte.length);
          this.a.write(arrayOfByte);
          return;
        } 
      } else if (paramObject instanceof Collection) {
        paramObject = ((Collection)paramObject).iterator();
        while (paramObject.hasNext())
          e((v70)arrayOfByte, paramObject.next(), false); 
      } else if (paramObject instanceof Map) {
        for (Object paramObject : ((Map)paramObject).entrySet())
          f(i, (v70)arrayOfByte, paramObject, false); 
      } else if (paramObject instanceof Double) {
        double d = ((Double)paramObject).doubleValue();
        if (!paramBoolean || d != 0.0D) {
          h(g((v70)arrayOfByte) << 3 | 0x1);
          this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
          return;
        } 
      } else if (paramObject instanceof Float) {
        float f = ((Float)paramObject).floatValue();
        if (!paramBoolean || f != 0.0F) {
          h(g((v70)arrayOfByte) << 3 | 0x5);
          this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
          return;
        } 
      } else {
        if (paramObject instanceof Number) {
          c((v70)arrayOfByte, ((Number)paramObject).longValue(), paramBoolean);
          return;
        } 
        if (paramObject instanceof Boolean) {
          b((v70)arrayOfByte, ((Boolean)paramObject).booleanValue(), paramBoolean);
          return;
        } 
        if (paramObject instanceof byte[]) {
          paramObject = paramObject;
          if (!paramBoolean || paramObject.length != 0) {
            h(g((v70)arrayOfByte) << 3 | 0x2);
            h(paramObject.length);
            this.a.write((byte[])paramObject);
            return;
          } 
          return;
        } 
        f31 f311 = (f31)this.b.get(paramObject.getClass());
        if (f311 != null) {
          f(f311, (v70)arrayOfByte, paramObject, paramBoolean);
          return;
        } 
        k12 k12 = (k12)this.c.get(paramObject.getClass());
        if (k12 != null) {
          cb1 cb11 = this.e;
          cb11.a = false;
          cb11.c = (v70)arrayOfByte;
          cb11.b = paramBoolean;
          k12.a(paramObject, cb11);
          return;
        } 
        if (paramObject instanceof lp0) {
          b((v70)arrayOfByte, ((lp0)paramObject).b, true);
          return;
        } 
        if (paramObject instanceof Enum) {
          b((v70)arrayOfByte, ((Enum)paramObject).ordinal(), true);
          return;
        } 
        f(this.d, (v70)arrayOfByte, paramObject, paramBoolean);
        return;
      } 
    } 
  }
  
  public final void f(f31 paramf31, v70 paramv70, Object paramObject, boolean paramBoolean) {
    OutputStream outputStream2;
    OutputStream outputStream1 = new OutputStream();
    ((gm0)outputStream1).b = 0L;
    try {
      outputStream2 = this.a;
      this.a = outputStream1;
      try {
        paramf31.a(paramObject, this);
        this.a = outputStream2;
        long l = ((gm0)outputStream1).b;
        outputStream1.close();
        if (paramBoolean && l == 0L)
          return; 
        h(g(paramv70) << 3 | 0x2);
        i(l);
        paramf31.a(paramObject, this);
        return;
      } finally {}
    } finally {}
    this.a = outputStream2;
    throw paramf31;
  }
  
  public final void h(int paramInt) {
    while (true) {
      long l = (paramInt & 0xFFFFFF80);
      OutputStream outputStream = this.a;
      if (l != 0L) {
        outputStream.write(paramInt & 0x7F | 0x80);
        paramInt >>>= 7;
        continue;
      } 
      outputStream.write(paramInt & 0x7F);
      return;
    } 
  }
  
  public final void i(long paramLong) {
    while (true) {
      OutputStream outputStream = this.a;
      if ((0xFFFFFFFFFFFFFF80L & paramLong) != 0L) {
        outputStream.write((int)paramLong & 0x7F | 0x80);
        paramLong >>>= 7L;
        continue;
      } 
      outputStream.write((int)paramLong & 0x7F);
      return;
    } 
  }
  
  static {
    j9 j91 = new j9(1);
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    hashMap2.put(ab1.class, j91);
    g = new v70("key", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap2)));
    j9 j92 = new j9(2);
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    hashMap1.put(ab1.class, j92);
    h = new v70("value", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap1)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */