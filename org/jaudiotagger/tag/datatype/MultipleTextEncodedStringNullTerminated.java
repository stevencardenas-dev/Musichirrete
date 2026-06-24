package org.jaudiotagger.tag.datatype;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class MultipleTextEncodedStringNullTerminated extends AbstractDataType {
  public MultipleTextEncodedStringNullTerminated(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
    this.value = new Values();
  }
  
  public MultipleTextEncodedStringNullTerminated(MultipleTextEncodedStringNullTerminated paramMultipleTextEncodedStringNullTerminated) {
    super(paramMultipleTextEncodedStringNullTerminated);
  }
  
  public MultipleTextEncodedStringNullTerminated(TextEncodedStringSizeTerminated paramTextEncodedStringSizeTerminated) {
    super(paramTextEncodedStringSizeTerminated);
    this.value = new Values();
  }
  
  public boolean canBeEncoded() {
    ListIterator<String> listIterator = ((Values)this.value).getList().listIterator();
    while (listIterator.hasNext()) {
      if (!(new TextEncodedStringNullTerminated(this.identifier, this.frameBody, listIterator.next())).canBeEncoded())
        return false; 
    } 
    return true;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof MultipleTextEncodedStringNullTerminated && super.equals(paramObject));
  }
  
  public int getSize() {
    return this.size;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    Logger logger2 = AbstractDataType.logger;
    StringBuilder stringBuilder = new StringBuilder("Reading MultipleTextEncodedStringNullTerminated from array from offset:");
    stringBuilder.append(paramInt);
    logger2.finer(stringBuilder.toString());
    try {
      while (true) {
        TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated();
        this(this.identifier, this.frameBody);
        textEncodedStringNullTerminated.readByteArray(paramArrayOfbyte, paramInt);
        if (textEncodedStringNullTerminated.getSize() == 0)
          break; 
        ((Values)this.value).add((String)textEncodedStringNullTerminated.getValue());
        this.size += textEncodedStringNullTerminated.getSize();
        int i = textEncodedStringNullTerminated.getSize();
        paramInt += i;
        if (this.size != 0)
          continue; 
        AbstractDataType.logger.warning("No null terminated Strings found");
        throw new InvalidDataTypeException("No null terminated Strings found");
      } 
    } catch (InvalidDataTypeException invalidDataTypeException) {}
    Logger logger1 = AbstractDataType.logger;
    stringBuilder = new StringBuilder("Read  MultipleTextEncodedStringNullTerminated:");
    stringBuilder.append(this.value);
    stringBuilder.append(" size:");
    stringBuilder.append(this.size);
    logger1.finer(stringBuilder.toString());
  }
  
  public byte[] writeByteArray() {
    AbstractDataType.logger.finer("Writing MultipleTextEncodedStringNullTerminated");
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      ListIterator<String> listIterator = ((Values)this.value).getList().listIterator();
      int i;
      for (i = 0; listIterator.hasNext(); i += j) {
        TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated();
        this(this.identifier, this.frameBody, listIterator.next());
        byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
        int j = textEncodedStringNullTerminated.getSize();
      } 
      this.size = i;
      AbstractDataType.logger.finer("Written MultipleTextEncodedStringNullTerminated");
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      AbstractDataType.logger.log(Level.SEVERE, "IOException in MultipleTextEncodedStringNullTerminated when writing byte array", iOException);
      k91.n(iOException);
      return null;
    } 
  }
  
  public static class Values {
    private List<String> valueList = new ArrayList<String>();
    
    public void add(String param1String) {
      this.valueList.add(param1String);
    }
    
    public List<String> getList() {
      return this.valueList;
    }
    
    public int getNumberOfValues() {
      return this.valueList.size();
    }
    
    public String toString() {
      StringBuffer stringBuffer = new StringBuffer();
      ListIterator<String> listIterator = this.valueList.listIterator();
      while (listIterator.hasNext()) {
        stringBuffer.append(listIterator.next());
        if (listIterator.hasNext())
          stringBuffer.append(","); 
      } 
      return stringBuffer.toString();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\MultipleTextEncodedStringNullTerminated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */