package org.jaudiotagger.tag.id3.framebody;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.nio.ByteBuffer;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.PartOfSet;

public abstract class AbstractFrameBodyNumberTotal extends AbstractID3v2FrameBody {
  public AbstractFrameBodyNumberTotal() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", new PartOfSet.PartOfSetValue());
  }
  
  public AbstractFrameBodyNumberTotal(byte paramByte, Integer paramInteger1, Integer paramInteger2) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Text", new PartOfSet.PartOfSetValue(paramInteger1, paramInteger2));
  }
  
  public AbstractFrameBodyNumberTotal(byte paramByte, String paramString) {
    setObjectValue(eRUgfgGAccgka.dlLFVisGI, Byte.valueOf(paramByte));
    setObjectValue("Text", new PartOfSet.PartOfSetValue(paramString));
  }
  
  public AbstractFrameBodyNumberTotal(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public AbstractFrameBodyNumberTotal(AbstractFrameBodyNumberTotal paramAbstractFrameBodyNumberTotal) {
    super(paramAbstractFrameBodyNumberTotal);
  }
  
  public abstract String getIdentifier();
  
  public Integer getNumber() {
    return ((PartOfSet.PartOfSetValue)getObjectValue("Text")).getCount();
  }
  
  public String getNumberAsText() {
    return ((PartOfSet.PartOfSetValue)getObjectValue("Text")).getCountAsText();
  }
  
  public String getText() {
    return getObjectValue("Text").toString();
  }
  
  public Integer getTotal() {
    return ((PartOfSet.PartOfSetValue)getObjectValue(oXrNDUqUkE.zLchlpTZF)).getTotal();
  }
  
  public String getTotalAsText() {
    return ((PartOfSet.PartOfSetValue)getObjectValue("Text")).getTotalAsText();
  }
  
  public String getUserFriendlyValue() {
    return String.valueOf(((PartOfSet.PartOfSetValue)getObjectValue("Text")).getCount());
  }
  
  public void setNumber(Integer paramInteger) {
    ((PartOfSet.PartOfSetValue)getObjectValue("Text")).setCount(paramInteger);
  }
  
  public void setNumber(String paramString) {
    ((PartOfSet.PartOfSetValue)getObjectValue("Text")).setCount(paramString);
  }
  
  public void setText(String paramString) {
    setObjectValue("Text", new PartOfSet.PartOfSetValue(paramString));
  }
  
  public void setTotal(Integer paramInteger) {
    ((PartOfSet.PartOfSetValue)getObjectValue("Text")).setTotal(paramInteger);
  }
  
  public void setTotal(String paramString) {
    ((PartOfSet.PartOfSetValue)getObjectValue("Text")).setTotal(paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap(PwbbJfsdcHrAjW.LhExaxXXdFDvEM, this, 1));
    this.objectList.add(new PartOfSet("Text", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\AbstractFrameBodyNumberTotal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */