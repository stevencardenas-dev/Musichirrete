package org.jaudiotagger.tag.id3.framebody;

import ga1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.tag.datatype.EventTimingCode;
import org.jaudiotagger.tag.datatype.EventTimingCodeList;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.id3.AbstractTagItem;
import org.jaudiotagger.tag.id3.valuepair.EventTimingTimestampTypes;

public class FrameBodyETCO extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public static final int MILLISECONDS = 2;
  
  public static final int MPEG_FRAMES = 1;
  
  public FrameBodyETCO() {
    setObjectValue("TimeStampFormat", Integer.valueOf(2));
  }
  
  public FrameBodyETCO(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyETCO(FrameBodyETCO paramFrameBodyETCO) {
    super(paramFrameBodyETCO);
  }
  
  private void resolveRelativeTimestamps() {
    Iterator<EventTimingCode> iterator = ((List)getObjectValue("TimedEventList")).iterator();
    long l = 0L;
    while (iterator.hasNext()) {
      EventTimingCode eventTimingCode = iterator.next();
      if (eventTimingCode.getTimestamp() != 0L)
        l = eventTimingCode.getTimestamp(); 
      eventTimingCode.setTimestamp(l);
    } 
  }
  
  private static Set<Integer> toSet(int... paramVarArgs) {
    HashSet<Integer> hashSet = new HashSet();
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++)
      hashSet.add(Integer.valueOf(paramVarArgs[b])); 
    return hashSet;
  }
  
  public void addTimingCode(long paramLong, int... paramVarArgs) {
    List<EventTimingCode> list = (List)getObjectValue("TimedEventList");
    if (!list.isEmpty() && ((EventTimingCode)list.get(0)).getTimestamp() <= paramLong) {
      Iterator<EventTimingCode> iterator = list.iterator();
      byte b = 0;
      long l = 0L;
      while (true) {
        b1 = b;
        if (iterator.hasNext()) {
          EventTimingCode eventTimingCode = iterator.next();
          if (eventTimingCode.getTimestamp() != 0L)
            l = eventTimingCode.getTimestamp(); 
          if (paramLong < l) {
            b1 = b;
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } else {
      b1 = 0;
    } 
    int i = paramVarArgs.length;
    byte b3 = 0;
    byte b2 = b1;
    for (byte b1 = b3; b1 < i; b1++) {
      list.add(b2, new EventTimingCode("TimedEvent", this, paramVarArgs[b1], paramLong));
      b2++;
    } 
  }
  
  public void clearTimingCodes() {
    ((List)getObjectValue("TimedEventList")).clear();
  }
  
  public String getIdentifier() {
    return "ETCO";
  }
  
  public int getTimestampFormat() {
    return ((Number)getObjectValue("TimeStampFormat")).intValue();
  }
  
  public List<Long> getTimestamps(int... paramVarArgs) {
    Set<Integer> set = toSet(paramVarArgs);
    ArrayList<Long> arrayList = new ArrayList();
    Iterator<EventTimingCode> iterator = ((List)getObjectValue("TimedEventList")).iterator();
    long l = 0L;
    while (iterator.hasNext()) {
      long l1;
      EventTimingCode eventTimingCode = iterator.next();
      if (eventTimingCode.getTimestamp() == 0L) {
        l1 = l;
      } else {
        l1 = eventTimingCode.getTimestamp();
      } 
      l = l1;
      if (set.contains(Integer.valueOf(eventTimingCode.getType()))) {
        arrayList.add(Long.valueOf(l1));
        l = l1;
      } 
    } 
    return Collections.unmodifiableList(arrayList);
  }
  
  public Map<Long, int[]> getTimingCodes() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    Iterator<EventTimingCode> iterator = ((List)getObjectValue("TimedEventList")).iterator();
    long l = 0L;
    while (iterator.hasNext()) {
      EventTimingCode eventTimingCode = iterator.next();
      if (eventTimingCode.getTimestamp() != 0L)
        l = eventTimingCode.getTimestamp(); 
      int[] arrayOfInt2 = (int[])linkedHashMap.get(Long.valueOf(l));
      if (arrayOfInt2 == null) {
        linkedHashMap.put(Long.valueOf(l), new int[] { eventTimingCode.getType() });
        continue;
      } 
      int i = arrayOfInt2.length;
      int[] arrayOfInt1 = new int[i + 1];
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
      arrayOfInt1[i] = eventTimingCode.getType();
      linkedHashMap.put(Long.valueOf(l), arrayOfInt1);
    } 
    return (Map)Collections.unmodifiableMap(linkedHashMap);
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    super.read(paramByteBuffer);
    Iterator<EventTimingCode> iterator = ((List)getObjectValue("TimedEventList")).iterator();
    for (long l = 0L; iterator.hasNext(); l = l1) {
      long l1;
      EventTimingCode eventTimingCode = iterator.next();
      if (eventTimingCode.getTimestamp() == 0L) {
        l1 = l;
      } else {
        l1 = eventTimingCode.getTimestamp();
      } 
      if (eventTimingCode.getTimestamp() < l) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder("Event codes are not in chronological order. ");
        stringBuilder.append(l);
        stringBuilder.append(" is followed by ");
        stringBuilder.append(eventTimingCode.getTimestamp());
        stringBuilder.append(".");
        logger.warning(stringBuilder.toString());
      } 
    } 
  }
  
  public boolean removeTimingCode(long paramLong, int... paramVarArgs) {
    boolean bool2;
    resolveRelativeTimestamps();
    Set<Integer> set = toSet(paramVarArgs);
    ListIterator<EventTimingCode> listIterator = ((List)getObjectValue("TimedEventList")).listIterator();
    boolean bool1 = false;
    while (true) {
      bool2 = bool1;
      if (listIterator.hasNext()) {
        EventTimingCode eventTimingCode = listIterator.next();
        bool2 = bool1;
        if (paramLong == eventTimingCode.getTimestamp()) {
          bool2 = bool1;
          if (set.contains(Integer.valueOf(eventTimingCode.getType()))) {
            listIterator.remove();
            bool2 = true;
          } 
        } 
        bool1 = bool2;
        if (paramLong > eventTimingCode.getTimestamp())
          break; 
        continue;
      } 
      break;
    } 
    return bool2;
  }
  
  public void setTimestampFormat(int paramInt) {
    if (EventTimingTimestampTypes.getInstanceOf().getValueForId(paramInt) != null) {
      setObjectValue("TimeStampFormat", Integer.valueOf(paramInt));
      return;
    } 
    l0.l(ga1.i("Timestamp format must be 1 or 2 (ID3v2.4, 4.5): ", paramInt));
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TimeStampFormat", this, 1));
    this.objectList.add(new EventTimingCodeList(this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyETCO.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */