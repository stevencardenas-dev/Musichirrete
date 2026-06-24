package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

public final class a implements Externalizable {
  private static final long serialVersionUID = -8885321777449118786L;
  
  public byte a;
  
  public Object b;
  
  public a() {}
  
  public a(byte paramByte, Object paramObject) {
    this.a = paramByte;
    this.b = paramObject;
  }
  
  public static long a(DataInput paramDataInput) {
    int i = paramDataInput.readByte() & 0xFF;
    return (i == 255) ? paramDataInput.readLong() : (((i << 16) + ((paramDataInput.readByte() & 0xFF) << 8) + (paramDataInput.readByte() & 0xFF)) * 900L - 4575744000L);
  }
  
  public static ZoneOffset b(DataInput paramDataInput) {
    byte b = paramDataInput.readByte();
    return (b == Byte.MAX_VALUE) ? ZoneOffset.ofTotalSeconds(paramDataInput.readInt()) : ZoneOffset.ofTotalSeconds(b * 900);
  }
  
  public static void c(long paramLong, DataOutput paramDataOutput) {
    if (paramLong >= -4575744000L && paramLong < 10413792000L && paramLong % 900L == 0L) {
      int i = (int)((paramLong + 4575744000L) / 900L);
      paramDataOutput.writeByte(i >>> 16 & 0xFF);
      paramDataOutput.writeByte(i >>> 8 & 0xFF);
      paramDataOutput.writeByte(i & 0xFF);
      return;
    } 
    paramDataOutput.writeByte(255);
    paramDataOutput.writeLong(paramLong);
  }
  
  public static void d(ZoneOffset paramZoneOffset, DataOutput paramDataOutput) {
    byte b;
    int i = paramZoneOffset.getTotalSeconds();
    if (i % 900 == 0) {
      b = i / 900;
    } else {
      b = 127;
    } 
    paramDataOutput.writeByte(b);
    if (b == 127)
      paramDataOutput.writeInt(i); 
  }
  
  private Object readResolve() {
    return this.b;
  }
  
  public final void readExternal(ObjectInput paramObjectInput) {
    b b;
    f f;
    byte b1 = paramObjectInput.readByte();
    this.a = b1;
    if (b1 != 1) {
      e e;
      if (b1 != 2) {
        if (b1 != 3) {
          if (b1 == 100) {
            f = new f(TimeZone.getTimeZone(paramObjectInput.readUTF()));
          } else {
            throw new StreamCorruptedException("Unknown serialized type");
          } 
        } else {
          e = e.a((DataInput)f);
        } 
      } else {
        int i = b.e;
        long l = a((DataInput)e);
        ZoneOffset zoneOffset2 = b((DataInput)e);
        ZoneOffset zoneOffset1 = b((DataInput)e);
        if (!zoneOffset2.equals(zoneOffset1)) {
          b = new b(l, zoneOffset2, zoneOffset1);
        } else {
          throw new IllegalArgumentException("Offsets must not be equal");
        } 
      } 
    } else {
      long[] arrayOfLong1;
      e[] arrayOfE;
      long[] arrayOfLong2 = f.i;
      int i = b.readInt();
      if (i == 0) {
        arrayOfLong1 = arrayOfLong2;
      } else {
        arrayOfLong1 = new long[i];
      } 
      boolean bool = false;
      byte b2;
      for (b2 = 0; b2 < i; b2++)
        arrayOfLong1[b2] = a((DataInput)b); 
      ZoneOffset[] arrayOfZoneOffset1 = new ZoneOffset[++i];
      for (b2 = 0; b2 < i; b2++)
        arrayOfZoneOffset1[b2] = b((DataInput)b); 
      i = b.readInt();
      if (i != 0)
        arrayOfLong2 = new long[i]; 
      for (b2 = 0; b2 < i; b2++)
        arrayOfLong2[b2] = a((DataInput)b); 
      ZoneOffset[] arrayOfZoneOffset2 = new ZoneOffset[++i];
      for (b2 = 0; b2 < i; b2++)
        arrayOfZoneOffset2[b2] = b((DataInput)b); 
      i = b.readByte();
      if (i == 0) {
        arrayOfE = f.j;
      } else {
        arrayOfE = new e[i];
      } 
      for (b2 = bool; b2 < i; b2++)
        arrayOfE[b2] = e.a((DataInput)b); 
      f = new f(arrayOfLong1, arrayOfZoneOffset1, arrayOfLong2, arrayOfZoneOffset2, arrayOfE);
    } 
    this.b = f;
  }
  
  public final void writeExternal(ObjectOutput paramObjectOutput) {
    byte b = this.a;
    Object object = this.b;
    paramObjectOutput.writeByte(b);
    if (b != 1) {
      if (b != 2) {
        if (b != 3) {
          if (b == 100) {
            paramObjectOutput.writeUTF(((f)object).g.getID());
            return;
          } 
          throw new InvalidClassException("Unknown serialized type");
        } 
        ((e)object).b(paramObjectOutput);
        return;
      } 
      object = object;
      c(((b)object).a, paramObjectOutput);
      d(((b)object).c, paramObjectOutput);
      d(((b)object).d, paramObjectOutput);
      return;
    } 
    object = object;
    paramObjectOutput.writeInt(((f)object).a.length);
    long[] arrayOfLong2 = ((f)object).a;
    int i = arrayOfLong2.length;
    boolean bool = false;
    for (b = 0; b < i; b++)
      c(arrayOfLong2[b], paramObjectOutput); 
    ZoneOffset[] arrayOfZoneOffset2 = ((f)object).b;
    i = arrayOfZoneOffset2.length;
    for (b = 0; b < i; b++)
      d(arrayOfZoneOffset2[b], paramObjectOutput); 
    paramObjectOutput.writeInt(((f)object).c.length);
    long[] arrayOfLong1 = ((f)object).c;
    i = arrayOfLong1.length;
    for (b = 0; b < i; b++)
      c(arrayOfLong1[b], paramObjectOutput); 
    ZoneOffset[] arrayOfZoneOffset1 = ((f)object).e;
    i = arrayOfZoneOffset1.length;
    for (b = 0; b < i; b++)
      d(arrayOfZoneOffset1[b], paramObjectOutput); 
    paramObjectOutput.writeByte(((f)object).f.length);
    object = ((f)object).f;
    i = object.length;
    for (b = bool; b < i; b++)
      object[b].b(paramObjectOutput); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\zone\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */