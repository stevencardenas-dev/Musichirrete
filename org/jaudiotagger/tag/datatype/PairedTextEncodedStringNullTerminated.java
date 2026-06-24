package org.jaudiotagger.tag.datatype;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.tabs.xm.VDgS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import z51;

public class PairedTextEncodedStringNullTerminated extends AbstractDataType {
  public PairedTextEncodedStringNullTerminated(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
    this.value = new ValuePairs();
  }
  
  public PairedTextEncodedStringNullTerminated(PairedTextEncodedStringNullTerminated paramPairedTextEncodedStringNullTerminated) {
    super(paramPairedTextEncodedStringNullTerminated);
  }
  
  public PairedTextEncodedStringNullTerminated(TextEncodedStringSizeTerminated paramTextEncodedStringSizeTerminated) {
    super(paramTextEncodedStringSizeTerminated);
    this.value = new ValuePairs();
  }
  
  public boolean canBeEncoded() {
    for (Pair pair : ValuePairs.a((ValuePairs)this.value)) {
      if (!(new TextEncodedStringNullTerminated(this.identifier, this.frameBody, pair.getValue())).canBeEncoded())
        return false; 
    } 
    return true;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof PairedTextEncodedStringNullTerminated))
      return false; 
    paramObject = paramObject;
    return z51.a(this.value, ((AbstractDataType)paramObject).value);
  }
  
  public int getSize() {
    return this.size;
  }
  
  public ValuePairs getValue() {
    return (ValuePairs)this.value;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    Logger logger2 = AbstractDataType.logger;
    StringBuilder stringBuilder2 = new StringBuilder("Reading PairTextEncodedStringNullTerminated from array from offset:");
    stringBuilder2.append(paramInt);
    logger2.finer(stringBuilder2.toString());
    try {
      while (true) {
        TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated();
        this(this.identifier, this.frameBody);
        textEncodedStringNullTerminated.readByteArray(paramArrayOfbyte, paramInt);
        this.size += textEncodedStringNullTerminated.getSize();
        int i = paramInt + textEncodedStringNullTerminated.getSize();
        paramInt = textEncodedStringNullTerminated.getSize();
        if (paramInt == 0)
          break; 
        paramInt = i;
        try {
          TextEncodedStringNullTerminated textEncodedStringNullTerminated1 = new TextEncodedStringNullTerminated();
          paramInt = i;
          this(this.identifier, this.frameBody);
          paramInt = i;
          textEncodedStringNullTerminated1.readByteArray(paramArrayOfbyte, i);
          paramInt = i;
          this.size += textEncodedStringNullTerminated1.getSize();
          paramInt = i;
          i += textEncodedStringNullTerminated1.getSize();
          paramInt = i;
          if (textEncodedStringNullTerminated1.getSize() == 0)
            break; 
          paramInt = i;
          ((ValuePairs)this.value).add((String)textEncodedStringNullTerminated.getValue(), (String)textEncodedStringNullTerminated1.getValue());
          if (this.size != 0) {
            paramInt = i;
            continue;
          } 
          AbstractDataType.logger.warning("No null terminated Strings found");
          throw new InvalidDataTypeException("No null terminated Strings found");
        } catch (InvalidDataTypeException invalidDataTypeException) {
          if (paramInt < paramArrayOfbyte.length) {
            TextEncodedStringSizeTerminated textEncodedStringSizeTerminated = new TextEncodedStringSizeTerminated();
            this(this.identifier, this.frameBody);
            textEncodedStringSizeTerminated.readByteArray(paramArrayOfbyte, paramInt);
            this.size += textEncodedStringSizeTerminated.getSize();
            textEncodedStringSizeTerminated.getSize();
            if (textEncodedStringSizeTerminated.getSize() != 0)
              ((ValuePairs)this.value).add((String)textEncodedStringNullTerminated.getValue(), (String)textEncodedStringSizeTerminated.getValue()); 
          } 
        } 
        Logger logger = AbstractDataType.logger;
        StringBuilder stringBuilder = new StringBuilder(tlzLOCPTHRhep.eXJjzEZvR);
        stringBuilder.append(this.value);
        stringBuilder.append(" size:");
        stringBuilder.append(this.size);
        logger.finer(stringBuilder.toString());
        return;
      } 
    } catch (InvalidDataTypeException invalidDataTypeException) {}
    Logger logger1 = AbstractDataType.logger;
    StringBuilder stringBuilder1 = new StringBuilder(tlzLOCPTHRhep.eXJjzEZvR);
    stringBuilder1.append(this.value);
    stringBuilder1.append(" size:");
    stringBuilder1.append(this.size);
    logger1.finer(stringBuilder1.toString());
  }
  
  public String toString() {
    return this.value.toString();
  }
  
  public byte[] writeByteArray() {
    AbstractDataType.logger.finer("Writing PairTextEncodedStringNullTerminated");
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      Iterator<Pair> iterator = ValuePairs.a((ValuePairs)this.value).iterator();
      int i;
      for (i = 0; iterator.hasNext(); i = i + j + k) {
        Pair pair = iterator.next();
        TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated();
        this(this.identifier, this.frameBody, pair.getKey());
        byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
        int j = textEncodedStringNullTerminated.getSize();
        textEncodedStringNullTerminated = new TextEncodedStringNullTerminated();
        this(this.identifier, this.frameBody, pair.getValue());
        byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
        int k = textEncodedStringNullTerminated.getSize();
      } 
      this.size = i;
      AbstractDataType.logger.finer("Written PairTextEncodedStringNullTerminated");
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      AbstractDataType.logger.log(Level.SEVERE, VDgS.nbzRJEY, iOException);
      k91.n(iOException);
      return null;
    } 
  }
  
  public static class ValuePairs {
    private List<Pair> mapping = new ArrayList<Pair>();
    
    public void add(String param1String1, String param1String2) {
      this.mapping.add(new Pair(param1String1, param1String2));
    }
    
    public void add(Pair param1Pair) {
      this.mapping.add(param1Pair);
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof ValuePairs))
        return false; 
      param1Object = param1Object;
      return (getNumberOfValues() == param1Object.getNumberOfValues());
    }
    
    public List<Pair> getMapping() {
      return this.mapping;
    }
    
    public int getNumberOfPairs() {
      return this.mapping.size();
    }
    
    public int getNumberOfValues() {
      return this.mapping.size();
    }
    
    public String toString() {
      StringBuffer stringBuffer = new StringBuffer();
      for (Pair pair : this.mapping) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pair.getKey());
        stringBuilder.append(':');
        stringBuilder.append(pair.getValue());
        stringBuilder.append(',');
        stringBuffer.append(stringBuilder.toString());
      } 
      if (stringBuffer.length() > 0)
        stringBuffer.setLength(stringBuffer.length() - 1); 
      return stringBuffer.toString();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\PairedTextEncodedStringNullTerminated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */