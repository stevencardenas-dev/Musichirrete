package org.jaudiotagger.tag.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public abstract class AbstractDataType {
  protected static final String TYPE_ELEMENT = "element";
  
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.datatype");
  
  protected AbstractTagFrameBody frameBody;
  
  protected String identifier;
  
  protected int size;
  
  protected Object value = null;
  
  public AbstractDataType(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    this.identifier = paramString;
    this.frameBody = paramAbstractTagFrameBody;
  }
  
  public AbstractDataType(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, Object paramObject) {
    this.identifier = paramString;
    this.frameBody = paramAbstractTagFrameBody;
    setValue(paramObject);
  }
  
  public AbstractDataType(AbstractDataType paramAbstractDataType) {
    this.identifier = "";
    this.frameBody = null;
    this.identifier = paramAbstractDataType.identifier;
    Object<?> object = (Object<?>)paramAbstractDataType.value;
    if (object == null) {
      this.value = null;
      return;
    } 
    if (object instanceof String) {
      this.value = object;
      return;
    } 
    if (object instanceof Boolean) {
      this.value = object;
      return;
    } 
    if (object instanceof Byte) {
      this.value = object;
      return;
    } 
    if (object instanceof Character) {
      this.value = object;
      return;
    } 
    if (object instanceof Double) {
      this.value = object;
      return;
    } 
    if (object instanceof Float) {
      this.value = object;
      return;
    } 
    if (object instanceof Integer) {
      this.value = object;
      return;
    } 
    if (object instanceof Long) {
      this.value = object;
      return;
    } 
    if (object instanceof Short) {
      this.value = object;
      return;
    } 
    if (object instanceof MultipleTextEncodedStringNullTerminated.Values) {
      this.value = object;
      return;
    } 
    if (object instanceof PairedTextEncodedStringNullTerminated.ValuePairs) {
      this.value = object;
      return;
    } 
    if (object instanceof PartOfSet.PartOfSetValue) {
      this.value = object;
      return;
    } 
    if (object instanceof boolean[]) {
      this.value = ((boolean[])object).clone();
      return;
    } 
    if (object instanceof byte[]) {
      this.value = ((byte[])object).clone();
      return;
    } 
    if (object instanceof char[]) {
      this.value = ((char[])object).clone();
      return;
    } 
    if (object instanceof double[]) {
      this.value = ((double[])object).clone();
      return;
    } 
    if (object instanceof float[]) {
      this.value = ((float[])object).clone();
      return;
    } 
    if (object instanceof int[]) {
      this.value = ((int[])object).clone();
      return;
    } 
    if (object instanceof long[]) {
      this.value = ((long[])object).clone();
      return;
    } 
    if (object instanceof short[]) {
      this.value = ((short[])object).clone();
      return;
    } 
    if (object instanceof Object[]) {
      this.value = ((Object[])object).clone();
      return;
    } 
    if (object instanceof ArrayList) {
      this.value = ((ArrayList)object).clone();
      return;
    } 
    if (object instanceof LinkedList) {
      this.value = ((LinkedList)object).clone();
      return;
    } 
    object = (Object<?>)paramAbstractDataType.getClass();
    StringBuilder stringBuilder = new StringBuilder("Unable to create copy of class ");
    stringBuilder.append(object);
    throw new UnsupportedOperationException(stringBuilder.toString());
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().b(this.identifier, getValue().toString());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof AbstractDataType))
      return false; 
    AbstractDataType abstractDataType = (AbstractDataType)paramObject;
    if (!this.identifier.equals(abstractDataType.identifier))
      return false; 
    paramObject = this.value;
    if (paramObject == null && abstractDataType.value == null)
      return true; 
    if (paramObject != null) {
      Object object = abstractDataType.value;
      if (object != null) {
        if (paramObject instanceof boolean[] && object instanceof boolean[]) {
          if (!Arrays.equals((boolean[])paramObject, (boolean[])object))
            return false; 
        } else if (paramObject instanceof byte[] && object instanceof byte[]) {
          if (!Arrays.equals((byte[])paramObject, (byte[])object))
            return false; 
        } else if (paramObject instanceof char[] && object instanceof char[]) {
          if (!Arrays.equals((char[])paramObject, (char[])object))
            return false; 
        } else if (paramObject instanceof double[] && object instanceof double[]) {
          if (!Arrays.equals((double[])paramObject, (double[])object))
            return false; 
        } else if (paramObject instanceof float[] && object instanceof float[]) {
          if (!Arrays.equals((float[])paramObject, (float[])object))
            return false; 
        } else if (paramObject instanceof int[] && object instanceof int[]) {
          if (!Arrays.equals((int[])paramObject, (int[])object))
            return false; 
        } else if (paramObject instanceof long[] && object instanceof long[]) {
          if (!Arrays.equals((long[])paramObject, (long[])object))
            return false; 
        } else if (paramObject instanceof Object[] && object instanceof Object[]) {
          if (!Arrays.equals((Object[])paramObject, (Object[])object))
            return false; 
        } else if (paramObject instanceof short[] && object instanceof short[]) {
          if (!Arrays.equals((short[])paramObject, (short[])object))
            return false; 
        } else if (!paramObject.equals(object)) {
          return false;
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public AbstractTagFrameBody getBody() {
    return this.frameBody;
  }
  
  public String getIdentifier() {
    return this.identifier;
  }
  
  public abstract int getSize();
  
  public Object getValue() {
    return this.value;
  }
  
  public final void readByteArray(byte[] paramArrayOfbyte) {
    readByteArray(paramArrayOfbyte, 0);
  }
  
  public abstract void readByteArray(byte[] paramArrayOfbyte, int paramInt);
  
  public void setBody(AbstractTagFrameBody paramAbstractTagFrameBody) {
    this.frameBody = paramAbstractTagFrameBody;
  }
  
  public void setValue(Object paramObject) {
    this.value = paramObject;
  }
  
  public abstract byte[] writeByteArray();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\AbstractDataType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */