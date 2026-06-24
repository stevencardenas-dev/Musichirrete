package org.jaudiotagger.tag.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import r3.IKWi.AyxAR;

public class TCONString extends TextEncodedStringSizeTerminated {
  private boolean isNullSeperateMultipleValues = true;
  
  public TCONString(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public TCONString(TCONString paramTCONString) {
    super(paramTCONString);
  }
  
  public static List<String> splitV23(String paramString) {
    List<String> list2 = Arrays.asList(paramString.replaceAll("(\\(\\d+\\)|\\(RX\\)|\\(CR\\)\\w*)", "$1\000").split("\000"));
    List<String> list1 = list2;
    if (list2.size() == 0) {
      list1 = new ArrayList<String>(1);
      list1.add(AyxAR.Wlkh);
    } 
    return list1;
  }
  
  public void addValue(String paramString) {
    if (isNullSeperateMultipleValues()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.value);
      stringBuilder1.append("\000");
      stringBuilder1.append(paramString);
      setValue(stringBuilder1.toString());
      return;
    } 
    boolean bool = paramString.startsWith("(");
    Object object = this.value;
    if (bool) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(object);
      stringBuilder1.append(paramString);
      setValue(stringBuilder1.toString());
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(object);
    stringBuilder.append("\000");
    stringBuilder.append(paramString);
    setValue(stringBuilder.toString());
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof TCONString && super.equals(paramObject)));
  }
  
  public int getNumberOfValues() {
    return getValues().size();
  }
  
  public String getValueAtIndex(int paramInt) {
    return getValues().get(paramInt);
  }
  
  public String getValueWithoutTrailingNull() {
    List<String> list = getValues();
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < list.size(); b++) {
      if (b != 0)
        stringBuffer.append("\000"); 
      stringBuffer.append(list.get(b));
    } 
    return stringBuffer.toString();
  }
  
  public List<String> getValues() {
    boolean bool = isNullSeperateMultipleValues();
    Object object = this.value;
    return bool ? TextEncodedStringSizeTerminated.splitByNullSeperator((String)object) : splitV23((String)object);
  }
  
  public boolean isNullSeperateMultipleValues() {
    return this.isNullSeperateMultipleValues;
  }
  
  public void setNullSeperateMultipleValues(boolean paramBoolean) {
    this.isNullSeperateMultipleValues = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\TCONString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */