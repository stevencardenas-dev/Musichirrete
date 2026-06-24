package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.a;
import j$.time.temporal.q;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

public final class f0 implements Externalizable {
  private static final long serialVersionUID = -6103370247208168577L;
  
  public byte a;
  
  public Object b;
  
  public f0() {}
  
  public f0(byte paramByte, Object paramObject) {
    this.a = paramByte;
    this.b = paramObject;
  }
  
  private Object readResolve() {
    return this.b;
  }
  
  public final void readExternal(ObjectInput paramObjectInput) {
    h h;
    j0 j0;
    d0 d0;
    r r;
    z z1;
    y y;
    ZoneId zoneId;
    j j;
    e e1;
    m m;
    int i;
    byte b2;
    int k;
    int n;
    p p;
    z z2;
    LocalDate localDate;
    ZoneOffset zoneOffset;
    ConcurrentHashMap concurrentHashMap;
    e e2;
    byte b1 = paramObjectInput.readByte();
    this.a = b1;
    switch (b1) {
      default:
        throw new StreamCorruptedException("Unknown serialized type");
      case 9:
        i = h.e;
        h = new h(m.of(paramObjectInput.readUTF()), paramObjectInput.readInt(), paramObjectInput.readInt(), paramObjectInput.readInt());
        break;
      case 8:
        n = h.readInt();
        b2 = h.readByte();
        i = h.readByte();
        h0.c.getClass();
        j0 = new j0(LocalDate.of(n - 543, b2, i));
        break;
      case 7:
        k = j0.readInt();
        i = j0.readByte();
        n = j0.readByte();
        b0.c.getClass();
        d0 = new d0(LocalDate.of(k + 1911, i, n));
        break;
      case 6:
        p = (p)d0.readObject();
        i = d0.readInt();
        n = d0.readByte();
        k = d0.readByte();
        p.getClass();
        r = new r(p, i, n, k);
        break;
      case 5:
        z2 = z.d;
        z1 = z.r(r.readByte());
        break;
      case 4:
        localDate = y.d;
        k = z1.readInt();
        i = z1.readByte();
        n = z1.readByte();
        w.c.getClass();
        y = new y(LocalDate.of(k, i, n));
        break;
      case 3:
        e2 = (e)y.readObject();
        zoneOffset = (ZoneOffset)y.readObject();
        zoneId = (ZoneId)y.readObject();
        j = e2.o(zoneOffset).v(zoneId);
        break;
      case 2:
        e1 = ((b)j.readObject()).B((LocalTime)j.readObject());
        break;
      case 1:
        concurrentHashMap = a.a;
        m = m.of(e1.readUTF());
        break;
    } 
    this.b = m;
  }
  
  public final void writeExternal(ObjectOutput paramObjectOutput) {
    byte b = this.a;
    Object object = this.b;
    paramObjectOutput.writeByte(b);
    switch (b) {
      default:
        throw new InvalidClassException("Unknown serialized type");
      case 9:
        object = object;
        paramObjectOutput.writeUTF(((h)object).a.getId());
        paramObjectOutput.writeInt(((h)object).b);
        paramObjectOutput.writeInt(((h)object).c);
        paramObjectOutput.writeInt(((h)object).d);
        return;
      case 8:
        object = object;
        object.getClass();
        paramObjectOutput.writeInt(object.e((q)a.YEAR));
        paramObjectOutput.writeByte(object.e((q)a.MONTH_OF_YEAR));
        paramObjectOutput.writeByte(object.e((q)a.DAY_OF_MONTH));
        return;
      case 7:
        object = object;
        object.getClass();
        paramObjectOutput.writeInt(object.e((q)a.YEAR));
        paramObjectOutput.writeByte(object.e((q)a.MONTH_OF_YEAR));
        paramObjectOutput.writeByte(object.e((q)a.DAY_OF_MONTH));
        return;
      case 6:
        object = object;
        paramObjectOutput.writeObject(((r)object).a);
        paramObjectOutput.writeInt(object.e((q)a.YEAR));
        paramObjectOutput.writeByte(object.e((q)a.MONTH_OF_YEAR));
        paramObjectOutput.writeByte(object.e((q)a.DAY_OF_MONTH));
        return;
      case 5:
        paramObjectOutput.writeByte(((z)object).a);
        return;
      case 4:
        object = object;
        object.getClass();
        paramObjectOutput.writeInt(object.e((q)a.YEAR));
        paramObjectOutput.writeByte(object.e((q)a.MONTH_OF_YEAR));
        paramObjectOutput.writeByte(object.e((q)a.DAY_OF_MONTH));
        return;
      case 3:
        object = object;
        paramObjectOutput.writeObject(((l)object).a);
        paramObjectOutput.writeObject(((l)object).b);
        paramObjectOutput.writeObject(((l)object).c);
        return;
      case 2:
        object = object;
        paramObjectOutput.writeObject(((g)object).a);
        paramObjectOutput.writeObject(((g)object).b);
        return;
      case 1:
        break;
    } 
    paramObjectOutput.writeUTF(((a)object).getId());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */