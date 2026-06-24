package j$.time;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

public final class m implements Externalizable {
  private static final long serialVersionUID = -7683839454370182990L;
  
  public byte a;
  
  public Object b;
  
  public m() {}
  
  public m(byte paramByte, Object paramObject) {
    this.a = paramByte;
    this.b = paramObject;
  }
  
  public static Object a(byte paramByte, ObjectInput paramObjectInput) {
    int i;
    ZoneId zoneId;
    Period period;
    LocalDate localDate3;
    LocalDateTime localDateTime2;
    LocalDate localDate2;
    LocalDateTime localDateTime1;
    LocalDate localDate1;
    Instant instant;
    ZoneOffset zoneOffset;
    switch (paramByte) {
      default:
        throw new StreamCorruptedException("Unknown serialized type");
      case 14:
        period = Period.d;
        return Period.of(paramObjectInput.readInt(), paramObjectInput.readInt(), paramObjectInput.readInt());
      case 13:
        i = MonthDay.c;
        return MonthDay.of(paramObjectInput.readByte(), paramObjectInput.readByte());
      case 12:
        i = YearMonth.c;
        return YearMonth.of(paramObjectInput.readInt(), paramObjectInput.readByte());
      case 11:
        i = Year.b;
        return Year.of(paramObjectInput.readInt());
      case 10:
        i = OffsetDateTime.c;
        localDate3 = LocalDate.d;
        return OffsetDateTime.of(LocalDateTime.of(LocalDate.of(paramObjectInput.readInt(), paramObjectInput.readByte(), paramObjectInput.readByte()), LocalTime.N(paramObjectInput)), ZoneOffset.L(paramObjectInput));
      case 9:
        i = OffsetTime.c;
        return OffsetTime.of(LocalTime.N(paramObjectInput), ZoneOffset.L(paramObjectInput));
      case 8:
        return ZoneOffset.L(paramObjectInput);
      case 7:
        i = p.c;
        return ZoneId.t(paramObjectInput.readUTF(), false);
      case 6:
        localDateTime2 = LocalDateTime.c;
        localDate2 = LocalDate.d;
        localDateTime1 = LocalDateTime.of(LocalDate.of(paramObjectInput.readInt(), paramObjectInput.readByte(), paramObjectInput.readByte()), LocalTime.N(paramObjectInput));
        zoneOffset = ZoneOffset.L(paramObjectInput);
        zoneId = (ZoneId)a(paramObjectInput.readByte(), paramObjectInput);
        Objects.requireNonNull(localDateTime1, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffset.equals(zoneId))
          return new ZonedDateTime(localDateTime1, zoneOffset, zoneId); 
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
      case 5:
        localDateTime1 = LocalDateTime.c;
        localDate1 = LocalDate.d;
        return LocalDateTime.of(LocalDate.of(zoneId.readInt(), zoneId.readByte(), zoneId.readByte()), LocalTime.N((DataInput)zoneId));
      case 4:
        return LocalTime.N((DataInput)zoneId);
      case 3:
        localDate1 = LocalDate.d;
        return LocalDate.of(zoneId.readInt(), zoneId.readByte(), zoneId.readByte());
      case 2:
        instant = Instant.c;
        return Instant.ofEpochSecond(zoneId.readLong(), zoneId.readInt());
      case 1:
        break;
    } 
    Duration duration = Duration.c;
    return Duration.ofSeconds(zoneId.readLong(), zoneId.readInt());
  }
  
  private Object readResolve() {
    return this.b;
  }
  
  public final void readExternal(ObjectInput paramObjectInput) {
    byte b = paramObjectInput.readByte();
    this.a = b;
    this.b = a(b, paramObjectInput);
  }
  
  public final void writeExternal(ObjectOutput paramObjectOutput) {
    LocalDate localDate2;
    ZonedDateTime zonedDateTime;
    LocalDate localDate1;
    LocalDateTime localDateTime;
    byte b = this.a;
    Object object = this.b;
    paramObjectOutput.writeByte(b);
    switch (b) {
      default:
        throw new InvalidClassException("Unknown serialized type");
      case 14:
        object = object;
        paramObjectOutput.writeInt(((Period)object).a);
        paramObjectOutput.writeInt(((Period)object).b);
        paramObjectOutput.writeInt(((Period)object).c);
        return;
      case 13:
        object = object;
        paramObjectOutput.writeByte(((MonthDay)object).a);
        paramObjectOutput.writeByte(((MonthDay)object).b);
        return;
      case 12:
        object = object;
        paramObjectOutput.writeInt(((YearMonth)object).a);
        paramObjectOutput.writeByte(((YearMonth)object).b);
        return;
      case 11:
        paramObjectOutput.writeInt(((Year)object).a);
        return;
      case 10:
        object = object;
        localDateTime = ((OffsetDateTime)object).a;
        localDate2 = localDateTime.a;
        paramObjectOutput.writeInt(localDate2.a);
        paramObjectOutput.writeByte(localDate2.b);
        paramObjectOutput.writeByte(localDate2.c);
        localDateTime.b.S(paramObjectOutput);
        ((OffsetDateTime)object).b.M(paramObjectOutput);
        return;
      case 9:
        object = object;
        ((OffsetTime)object).a.S(paramObjectOutput);
        ((OffsetTime)object).b.M(paramObjectOutput);
        return;
      case 8:
        ((ZoneOffset)object).M(paramObjectOutput);
        return;
      case 7:
        paramObjectOutput.writeUTF(((p)object).a);
        return;
      case 6:
        zonedDateTime = (ZonedDateTime)object;
        localDateTime = zonedDateTime.a;
        object = localDateTime.a;
        paramObjectOutput.writeInt(((LocalDate)object).a);
        paramObjectOutput.writeByte(((LocalDate)object).b);
        paramObjectOutput.writeByte(((LocalDate)object).c);
        localDateTime.b.S(paramObjectOutput);
        zonedDateTime.b.M(paramObjectOutput);
        zonedDateTime.c.G(paramObjectOutput);
        return;
      case 5:
        object = object;
        localDate1 = ((LocalDateTime)object).a;
        paramObjectOutput.writeInt(localDate1.a);
        paramObjectOutput.writeByte(localDate1.b);
        paramObjectOutput.writeByte(localDate1.c);
        ((LocalDateTime)object).b.S(paramObjectOutput);
        return;
      case 4:
        ((LocalTime)object).S(paramObjectOutput);
        return;
      case 3:
        object = object;
        paramObjectOutput.writeInt(((LocalDate)object).a);
        paramObjectOutput.writeByte(((LocalDate)object).b);
        paramObjectOutput.writeByte(((LocalDate)object).c);
        return;
      case 2:
        object = object;
        paramObjectOutput.writeLong(((Instant)object).a);
        paramObjectOutput.writeInt(((Instant)object).b);
        return;
      case 1:
        break;
    } 
    object = object;
    paramObjectOutput.writeLong(((Duration)object).a);
    paramObjectOutput.writeInt(((Duration)object).b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */