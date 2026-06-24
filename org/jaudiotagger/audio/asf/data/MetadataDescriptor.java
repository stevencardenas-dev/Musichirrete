package org.jaudiotagger.audio.asf.data;

import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.asf.util.Utils;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.TagOptionSingleton;
import tp;
import x41;

public class MetadataDescriptor implements Comparable<MetadataDescriptor>, Cloneable {
  static final boolean $assertionsDisabled = false;
  
  public static final long DWORD_MAXVALUE = (new BigInteger("FFFFFFFF", 16)).longValue();
  
  private static final Logger LOGGER;
  
  public static final int MAX_LANG_INDEX = 127;
  
  public static final int MAX_STREAM_NUMBER = 127;
  
  public static final BigInteger QWORD_MAXVALUE = new BigInteger("FFFFFFFFFFFFFFFF", 16);
  
  public static final int TYPE_BINARY = 1;
  
  public static final int TYPE_BOOLEAN = 2;
  
  public static final int TYPE_DWORD = 3;
  
  public static final int TYPE_GUID = 6;
  
  public static final int TYPE_QWORD = 4;
  
  public static final int TYPE_STRING = 0;
  
  public static final int TYPE_WORD = 5;
  
  public static final int WORD_MAXVALUE = 65535;
  
  private final ContainerType containerType;
  
  private byte[] content = new byte[0];
  
  private int descriptorType;
  
  private int languageIndex = 0;
  
  private final String name;
  
  private int streamNumber = 0;
  
  public MetadataDescriptor(String paramString) {
    this(paramString, 0);
  }
  
  public MetadataDescriptor(String paramString, int paramInt) {
    this(ContainerType.METADATA_LIBRARY_OBJECT, paramString, paramInt, 0, 0);
  }
  
  public MetadataDescriptor(ContainerType paramContainerType, String paramString, int paramInt) {
    this(paramContainerType, paramString, paramInt, 0, 0);
  }
  
  public MetadataDescriptor(ContainerType paramContainerType, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    paramContainerType.assertConstraints(paramString, new byte[0], paramInt1, paramInt2, paramInt3);
    this.containerType = paramContainerType;
    this.name = paramString;
    this.descriptorType = paramInt1;
    this.streamNumber = paramInt2;
    this.languageIndex = paramInt3;
  }
  
  public BigInteger asNumber() {
    BigInteger bigInteger;
    byte[] arrayOfByte;
    switch (this.descriptorType) {
      default:
        throw new IllegalStateException();
      case 6:
        throw new NumberFormatException("GUID cannot be converted to a number.");
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        if (this.content.length <= 8) {
          arrayOfByte = null;
          break;
        } 
        throw new NumberFormatException("Binary data would exceed QWORD");
      case 0:
        bigInteger = new BigInteger(getString(), 10);
        break;
    } 
    if (bigInteger == null) {
      int j = this.content.length;
      byte[] arrayOfByte1 = new byte[j];
      for (int i = 0; i < j; i = k) {
        arrayOfByte = this.content;
        int m = arrayOfByte.length;
        int k = i + 1;
        arrayOfByte1[i] = arrayOfByte[m - k];
      } 
      return new BigInteger(1, arrayOfByte1);
    } 
    return (BigInteger)arrayOfByte;
  }
  
  public Object clone() {
    return super.clone();
  }
  
  public int compareTo(MetadataDescriptor paramMetadataDescriptor) {
    return getName().compareTo(paramMetadataDescriptor.getName());
  }
  
  public MetadataDescriptor createCopy() {
    MetadataDescriptor metadataDescriptor = new MetadataDescriptor(this.containerType, this.name, this.descriptorType, this.streamNumber, this.languageIndex);
    metadataDescriptor.content = getRawData();
    return metadataDescriptor;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof MetadataDescriptor) {
      if (paramObject == this)
        return true; 
      paramObject = paramObject;
      if (paramObject.getName().equals(getName()) && ((MetadataDescriptor)paramObject).descriptorType == this.descriptorType && ((MetadataDescriptor)paramObject).languageIndex == this.languageIndex && ((MetadataDescriptor)paramObject).streamNumber == this.streamNumber && Arrays.equals(this.content, ((MetadataDescriptor)paramObject).content))
        return true; 
    } 
    return false;
  }
  
  public boolean getBoolean() {
    byte[] arrayOfByte = this.content;
    return (arrayOfByte.length > 0 && arrayOfByte[0] != 0);
  }
  
  @Deprecated
  public byte[] getBytes() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      writeInto(byteArrayOutputStream, this.containerType);
    } catch (IOException iOException) {
      LOGGER.warning(iOException.getMessage());
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public ContainerType getContainerType() {
    return this.containerType;
  }
  
  public int getCurrentAsfSize(ContainerType paramContainerType) {
    ContainerType containerType = ContainerType.EXTENDED_CONTENT;
    if (paramContainerType != containerType) {
      i = 14;
    } else {
      i = 8;
    } 
    int i = getName().length() * 2 + i;
    if (getType() == 2)
      return (paramContainerType == containerType) ? (i + 4) : (i + 2); 
    int j = i + this.content.length;
    i = j;
    if (getType() == 0)
      i = j + 2; 
    return i;
  }
  
  public GUID getGuid() {
    return (getType() == 6 && this.content.length == 16) ? new GUID(this.content) : null;
  }
  
  public int getLanguageIndex() {
    return this.languageIndex;
  }
  
  public String getName() {
    return this.name;
  }
  
  public long getNumber() {
    int j = getType();
    int i = 2;
    if (j != 2) {
      if (j != 3) {
        if (j != 4) {
          if (j != 5) {
            i = getType();
            StringBuilder stringBuilder = new StringBuilder("The current type doesn't allow an interpretation as a number. (");
            stringBuilder.append(i);
            stringBuilder.append(")");
            throw new UnsupportedOperationException(stringBuilder.toString());
          } 
        } else {
          i = 8;
        } 
      } else {
        i = 4;
      } 
    } else {
      i = 1;
    } 
    j = this.content.length;
    long l = 0L;
    if (i <= j) {
      for (j = 0; j < i; j++)
        l |= (this.content[j] & 0xFFL) << j * 8; 
      return l;
    } 
    tp.f("The stored data cannot represent the type of current object.");
    return 0L;
  }
  
  public byte[] getRawData() {
    byte[] arrayOfByte1 = this.content;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }
  
  public int getRawDataSize() {
    return this.content.length;
  }
  
  public int getStreamNumber() {
    return this.streamNumber;
  }
  
  public String getString() {
    switch (getType()) {
      default:
        tp.f("Current type is not known.");
        return null;
      case 6:
        return (getGuid() == null) ? "Invalid GUID" : getGuid().toString();
      case 3:
      case 4:
      case 5:
        return String.valueOf(getNumber());
      case 2:
        return String.valueOf(getBoolean());
      case 1:
        return "binary data";
      case 0:
        break;
    } 
    try {
      return new String(this.content, "UTF-16LE");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      LOGGER.warning(unsupportedEncodingException.getMessage());
      return null;
    } 
  }
  
  public int getType() {
    return this.descriptorType;
  }
  
  public int hashCode() {
    return this.name.hashCode();
  }
  
  public boolean isEmpty() {
    return (this.content.length == 0);
  }
  
  public void setBinaryValue(byte[] paramArrayOfbyte) {
    this.containerType.assertConstraints(this.name, paramArrayOfbyte, this.descriptorType, this.streamNumber, this.languageIndex);
    this.content = (byte[])paramArrayOfbyte.clone();
    this.descriptorType = 1;
  }
  
  public void setBooleanValue(boolean paramBoolean) {
    this.content = new byte[] { paramBoolean };
    this.descriptorType = 2;
  }
  
  public void setDWordValue(long paramLong) {
    if (paramLong >= 0L && paramLong <= DWORD_MAXVALUE) {
      this.content = Utils.getBytes(paramLong, 4);
      this.descriptorType = 3;
      return;
    } 
    paramLong = DWORD_MAXVALUE;
    StringBuilder stringBuilder = new StringBuilder("value out of range (0-");
    stringBuilder.append(paramLong);
    stringBuilder.append(ckOPp.qdAZB);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setGUIDValue(GUID paramGUID) {
    this.containerType.assertConstraints(this.name, paramGUID.getBytes(), 6, this.streamNumber, this.languageIndex);
    this.content = paramGUID.getBytes();
    this.descriptorType = 6;
  }
  
  public void setLanguageIndex(int paramInt) {
    this.containerType.assertConstraints(this.name, this.content, this.descriptorType, this.streamNumber, paramInt);
    this.languageIndex = paramInt;
  }
  
  public void setQWordValue(long paramLong) {
    if (paramLong >= 0L) {
      this.content = Utils.getBytes(paramLong, 8);
      this.descriptorType = 4;
      return;
    } 
    BigInteger bigInteger = QWORD_MAXVALUE;
    StringBuilder stringBuilder = new StringBuilder("value out of range (0-");
    stringBuilder.append(bigInteger.toString());
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setQWordValue(BigInteger paramBigInteger) {
    if (paramBigInteger != null) {
      if (BigInteger.ZERO.compareTo(paramBigInteger) <= 0) {
        if (QWORD_MAXVALUE.compareTo(paramBigInteger) >= 0) {
          this.content = new byte[8];
          byte[] arrayOfByte = paramBigInteger.toByteArray();
          if (arrayOfByte.length <= 8) {
            for (int i = arrayOfByte.length - 1; i >= 0; i--)
              this.content[arrayOfByte.length - i + 1] = arrayOfByte[i]; 
          } else {
            Arrays.fill(this.content, (byte)-1);
          } 
          this.descriptorType = 4;
          return;
        } 
        l0.l("Value exceeds QWORD (64 bit unsigned)");
        return;
      } 
      l0.l("Only unsigned values allowed (no negative)");
      return;
    } 
    throw new NumberFormatException(JkpGFvCVQHzgc.SBGnsHi);
  }
  
  public void setStreamNumber(int paramInt) {
    this.containerType.assertConstraints(this.name, this.content, this.descriptorType, paramInt, this.languageIndex);
    this.streamNumber = paramInt;
  }
  
  public void setString(String paramString) {
    try {
      IllegalStateException illegalStateException;
      BigInteger bigInteger;
      IllegalArgumentException illegalArgumentException;
      switch (getType()) {
        default:
          illegalStateException = new IllegalStateException();
          this();
          throw illegalStateException;
        case 6:
          setGUIDValue(GUID.parseGUID(paramString));
          return;
        case 5:
          setWordValue(Integer.parseInt(paramString));
          return;
        case 4:
          bigInteger = new BigInteger();
          this(paramString, 10);
          setQWordValue(bigInteger);
          return;
        case 3:
          setDWordValue(Long.parseLong(paramString));
          return;
        case 2:
          setBooleanValue(Boolean.parseBoolean(paramString));
          return;
        case 1:
          illegalArgumentException = new IllegalArgumentException();
          this("Cannot interpret binary as string.");
          throw illegalArgumentException;
        case 0:
          break;
      } 
    } catch (NumberFormatException numberFormatException) {}
    setStringValue(paramString);
  }
  
  public void setStringValue(String paramString) {
    if (paramString == null) {
      this.content = new byte[0];
    } else {
      byte[] arrayOfByte = Utils.getBytes(paramString, AsfHeader.ASF_CHARSET);
      if (getContainerType().isWithinValueRange(arrayOfByte.length)) {
        this.content = arrayOfByte;
      } else if (TagOptionSingleton.getInstance().isTruncateTextWithoutErrors()) {
        int i = (int)getContainerType().getMaximumDataLength().longValue();
        if (i % 2 != 0)
          i--; 
        byte[] arrayOfByte1 = new byte[i];
        this.content = arrayOfByte1;
        System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
      } else {
        l0.l(MessageFormat.format("Trying to create field with {0} bytes of data but the maximum data allowed in WMA files is {1} for {2}.", new Object[] { Integer.valueOf(arrayOfByte.length), getContainerType().getMaximumDataLength(), getContainerType().getContainerGUID().getDescription() }));
        return;
      } 
    } 
    this.descriptorType = 0;
  }
  
  public void setWordValue(int paramInt) {
    if (paramInt >= 0 && paramInt <= 65535) {
      this.content = Utils.getBytes(paramInt, 2);
      this.descriptorType = 5;
      return;
    } 
    l0.l("value out of range (0-65535)");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getName());
    stringBuilder.append(" : ");
    int i = this.descriptorType;
    (new String[7])[0] = "String: ";
    (new String[7])[1] = "Binary: ";
    (new String[7])[2] = "Boolean: ";
    (new String[7])[3] = "DWORD: ";
    (new String[7])[4] = "QWORD:";
    (new String[7])[5] = "WORD:";
    (new String[7])[6] = "GUID:";
    stringBuilder.append((new String[7])[i]);
    stringBuilder.append(getString());
    stringBuilder.append(" (language: ");
    stringBuilder.append(this.languageIndex);
    stringBuilder.append(" / stream: ");
    return x41.m(stringBuilder, this.streamNumber, ")");
  }
  
  public int writeInto(OutputStream paramOutputStream, ContainerType paramContainerType) {
    byte[] arrayOfByte;
    int k = getCurrentAsfSize(paramContainerType);
    if (this.descriptorType == 2) {
      byte b;
      if (paramContainerType == ContainerType.EXTENDED_CONTENT) {
        b = 4;
      } else {
        b = 2;
      } 
      arrayOfByte = new byte[b];
      arrayOfByte[0] = (byte)getBoolean();
    } else {
      arrayOfByte = this.content;
    } 
    ContainerType containerType = ContainerType.EXTENDED_CONTENT;
    if (paramContainerType != containerType) {
      Utils.writeUINT16(getLanguageIndex(), paramOutputStream);
      Utils.writeUINT16(getStreamNumber(), paramOutputStream);
    } 
    Utils.writeUINT16(getName().length() * 2 + 2, paramOutputStream);
    if (paramContainerType == containerType) {
      paramOutputStream.write(Utils.getBytes(getName(), AsfHeader.ASF_CHARSET));
      paramOutputStream.write(AsfHeader.ZERO_TERM);
    } 
    int m = getType();
    Utils.writeUINT16(m, paramOutputStream);
    int j = arrayOfByte.length;
    int i = j;
    if (m == 0)
      i = j + 2; 
    if (paramContainerType == containerType) {
      Utils.writeUINT16(i, paramOutputStream);
    } else {
      Utils.writeUINT32(i, paramOutputStream);
    } 
    if (paramContainerType != containerType) {
      paramOutputStream.write(Utils.getBytes(getName(), AsfHeader.ASF_CHARSET));
      paramOutputStream.write(AsfHeader.ZERO_TERM);
    } 
    paramOutputStream.write(arrayOfByte);
    if (m == 0)
      paramOutputStream.write(AsfHeader.ZERO_TERM); 
    return k;
  }
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.asf.data");
    LOGGER = logger;
    logger.setLevel(Level.SEVERE);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\MetadataDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */