package org.jaudiotagger.tag.id3.framebody;

import ga1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.SynchronisedTempoCode;
import org.jaudiotagger.tag.datatype.SynchronisedTempoCodeList;
import org.jaudiotagger.tag.id3.AbstractTagItem;
import org.jaudiotagger.tag.id3.valuepair.EventTimingTimestampTypes;

public class FrameBodySYTC extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public static final int MILLISECONDS = 2;
  
  public static final int MPEG_FRAMES = 1;
  
  public FrameBodySYTC() {
    setObjectValue("TimeStampFormat", Integer.valueOf(2));
  }
  
  public FrameBodySYTC(int paramInt, byte[] paramArrayOfbyte) {
    setObjectValue("TimeStampFormat", Integer.valueOf(paramInt));
    setObjectValue("SynchronisedTempoList", paramArrayOfbyte);
  }
  
  public FrameBodySYTC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodySYTC(FrameBodySYTC paramFrameBodySYTC) {
    super(paramFrameBodySYTC);
  }
  
  public void addTempo(long paramLong, int paramInt) {
    removeTempo(paramLong);
    List<SynchronisedTempoCode> list = (List)getObjectValue("SynchronisedTempoList");
    boolean bool = list.isEmpty();
    byte b3 = 0;
    byte b1 = 0;
    byte b2 = b3;
    if (!bool) {
      b2 = b3;
      if (((SynchronisedTempoCode)list.get(0)).getTimestamp() <= paramLong) {
        Iterator<SynchronisedTempoCode> iterator = list.iterator();
        while (true) {
          b2 = b1;
          if (iterator.hasNext()) {
            if (paramLong < ((SynchronisedTempoCode)iterator.next()).getTimestamp()) {
              b2 = b1;
              break;
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    list.add(b2, new SynchronisedTempoCode("SynchronisedTempo", this, paramInt, paramLong));
  }
  
  public void clearTempi() {
    ((List)getObjectValue("SynchronisedTempoList")).clear();
  }
  
  public String getIdentifier() {
    return "SYTC";
  }
  
  public Map<Long, Integer> getTempi() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    for (SynchronisedTempoCode synchronisedTempoCode : getObjectValue("SynchronisedTempoList"))
      linkedHashMap.put(Long.valueOf(synchronisedTempoCode.getTimestamp()), Integer.valueOf(synchronisedTempoCode.getTempo())); 
    return (Map)Collections.unmodifiableMap(linkedHashMap);
  }
  
  public int getTimestampFormat() {
    return ((Number)getObjectValue("TimeStampFormat")).intValue();
  }
  
  public List<Long> getTimestamps() {
    ArrayList<Long> arrayList = new ArrayList();
    Iterator<SynchronisedTempoCode> iterator = ((List)getObjectValue("SynchronisedTempoList")).iterator();
    while (iterator.hasNext())
      arrayList.add(Long.valueOf(((SynchronisedTempoCode)iterator.next()).getTimestamp())); 
    return Collections.unmodifiableList(arrayList);
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    super.read(paramByteBuffer);
    Iterator<SynchronisedTempoCode> iterator = ((List)getObjectValue("SynchronisedTempoList")).iterator();
    for (long l = 0L; iterator.hasNext(); l = synchronisedTempoCode.getTimestamp()) {
      SynchronisedTempoCode synchronisedTempoCode = iterator.next();
      if (synchronisedTempoCode.getTimestamp() < l) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder("Synchronised tempo codes are not in chronological order. ");
        stringBuilder.append(l);
        stringBuilder.append(" is followed by ");
        stringBuilder.append(synchronisedTempoCode.getTimestamp());
        stringBuilder.append(".");
        logger.warning(stringBuilder.toString());
      } 
    } 
  }
  
  public boolean removeTempo(long paramLong) {
    boolean bool2;
    ListIterator<SynchronisedTempoCode> listIterator = ((List)getObjectValue("SynchronisedTempoList")).listIterator();
    boolean bool1 = false;
    while (true) {
      bool2 = bool1;
      if (listIterator.hasNext()) {
        SynchronisedTempoCode synchronisedTempoCode = listIterator.next();
        bool2 = bool1;
        if (paramLong == synchronisedTempoCode.getTimestamp()) {
          listIterator.remove();
          bool2 = true;
        } 
        bool1 = bool2;
        if (paramLong > synchronisedTempoCode.getTimestamp())
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
    l0.l(ga1.i("Timestamp format must be 1 or 2 (ID3v2.4, 4.7): ", paramInt));
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TimeStampFormat", this, 1));
    this.objectList.add(new SynchronisedTempoCodeList(this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodySYTC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */