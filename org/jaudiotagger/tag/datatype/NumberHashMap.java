package org.jaudiotagger.tag.datatype;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import l0;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.ChannelTypes;
import org.jaudiotagger.tag.id3.valuepair.EventTimingTimestampTypes;
import org.jaudiotagger.tag.id3.valuepair.EventTimingTypes;
import org.jaudiotagger.tag.id3.valuepair.InterpolationTypes;
import org.jaudiotagger.tag.id3.valuepair.ReceivedAsTypes;
import org.jaudiotagger.tag.id3.valuepair.SynchronisedLyricsContentType;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;
import org.jaudiotagger.tag.reference.GenreTypes;
import org.jaudiotagger.tag.reference.PictureTypes;
import z51;

public class NumberHashMap extends NumberFixedLength implements HashMapInterface<Integer, String> {
  private boolean hasEmptyValue = false;
  
  private Map<Integer, String> keyToValue = null;
  
  private Map<String, Integer> valueToKey = null;
  
  public NumberHashMap(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt) {
    super(paramString, paramAbstractTagFrameBody, paramInt);
    if (paramString.equals("Genre")) {
      this.valueToKey = GenreTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = GenreTypes.getInstanceOf().getIdToValueMap();
      this.hasEmptyValue = true;
      return;
    } 
    if (paramString.equals("TextEncoding")) {
      this.valueToKey = TextEncoding.getInstanceOf().getValueToIdMap();
      this.keyToValue = TextEncoding.getInstanceOf().getIdToValueMap();
      return;
    } 
    if (paramString.equals("InterpolationMethod")) {
      this.valueToKey = InterpolationTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = InterpolationTypes.getInstanceOf().getIdToValueMap();
      return;
    } 
    if (paramString.equals("PictureType")) {
      this.valueToKey = PictureTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = PictureTypes.getInstanceOf().getIdToValueMap();
      this.hasEmptyValue = true;
      return;
    } 
    if (paramString.equals("TypeOfEvent")) {
      this.valueToKey = EventTimingTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = EventTimingTypes.getInstanceOf().getIdToValueMap();
      return;
    } 
    if (paramString.equals("TimeStampFormat")) {
      this.valueToKey = EventTimingTimestampTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = EventTimingTimestampTypes.getInstanceOf().getIdToValueMap();
      return;
    } 
    if (paramString.equals("TypeOfChannel")) {
      this.valueToKey = ChannelTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = ChannelTypes.getInstanceOf().getIdToValueMap();
      return;
    } 
    if (paramString.equals("RecievedAs")) {
      this.valueToKey = ReceivedAsTypes.getInstanceOf().getValueToIdMap();
      this.keyToValue = ReceivedAsTypes.getInstanceOf().getIdToValueMap();
      return;
    } 
    if (paramString.equals("contentType")) {
      this.valueToKey = SynchronisedLyricsContentType.getInstanceOf().getValueToIdMap();
      this.keyToValue = SynchronisedLyricsContentType.getInstanceOf().getIdToValueMap();
      return;
    } 
    l0.l("Hashmap identifier not defined in this class: ".concat(paramString));
    throw null;
  }
  
  public NumberHashMap(NumberHashMap paramNumberHashMap) {
    super(paramNumberHashMap);
    this.hasEmptyValue = paramNumberHashMap.hasEmptyValue;
    this.keyToValue = paramNumberHashMap.keyToValue;
    this.valueToKey = paramNumberHashMap.valueToKey;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof NumberHashMap))
      return false; 
    paramObject = paramObject;
    return (this.hasEmptyValue == ((NumberHashMap)paramObject).hasEmptyValue && z51.a(this.keyToValue, ((NumberHashMap)paramObject).keyToValue) && z51.a(this.valueToKey, ((NumberHashMap)paramObject).valueToKey) && super.equals(paramObject));
  }
  
  public Map<Integer, String> getKeyToValue() {
    return this.keyToValue;
  }
  
  public Map<String, Integer> getValueToKey() {
    return this.valueToKey;
  }
  
  public Iterator<String> iterator() {
    if (this.keyToValue == null)
      return null; 
    TreeSet<String> treeSet = new TreeSet(this.keyToValue.values());
    if (this.hasEmptyValue)
      treeSet.add(""); 
    return treeSet.iterator();
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    super.readByteArray(paramArrayOfbyte, paramInt);
    Integer integer = Integer.valueOf(((Long)this.value).intValue());
    if (!this.keyToValue.containsKey(integer))
      if (this.hasEmptyValue) {
        if (this.identifier.equals("PictureType")) {
          AbstractDataType.logger.warning(MessageFormat.format("Picture Type is set to invalid value:{0}", new Object[] { this.value }));
          return;
        } 
      } else {
        throw new InvalidDataTypeException(MessageFormat.format("{0}:No key could be found with the value of:{1}", new Object[] { this.identifier, integer }));
      }  
  }
  
  public void setValue(Object paramObject) {
    if (paramObject instanceof Byte) {
      this.value = Long.valueOf(((Byte)paramObject).byteValue());
      return;
    } 
    if (paramObject instanceof Short) {
      this.value = Long.valueOf(((Short)paramObject).shortValue());
      return;
    } 
    if (paramObject instanceof Integer) {
      this.value = Long.valueOf(((Integer)paramObject).intValue());
      return;
    } 
    this.value = paramObject;
  }
  
  public String toString() {
    Object object = this.value;
    return (object == null) ? "" : ((this.keyToValue.get(object) == null) ? "" : this.keyToValue.get(this.value));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\NumberHashMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */