package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberFixedLength;
import org.jaudiotagger.tag.datatype.NumberVariableLength;

public class FrameBodyASPI extends AbstractID3v2FrameBody implements ID3v24FrameBody {
  private static final String BITS_PER_INDEX_POINT = "BitsPerIndexPoint";
  
  private static final int BITS_PER_INDEX_POINTS_FIELD_SIZE = 1;
  
  private static final int DATA_LENGTH_FIELD_SIZE = 4;
  
  private static final int DATA_START_FIELD_SIZE = 4;
  
  private static final String FRACTION_AT_INDEX = "FractionAtIndex";
  
  private static final int FRACTION_AT_INDEX_MINIMUM_FIELD_SIZE = 1;
  
  private static final String INDEXED_DATA_LENGTH = "IndexedDataLength";
  
  private static final String INDEXED_DATA_START = "IndexedDataStart";
  
  private static final int NO_OF_INDEX_POINTS_FIELD_SIZE = 2;
  
  private static final String NUMBER_OF_INDEX_POINTS = "NumberOfIndexPoints";
  
  public FrameBodyASPI() {}
  
  public FrameBodyASPI(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyASPI(FrameBodyASPI paramFrameBodyASPI) {
    super(paramFrameBodyASPI);
  }
  
  public String getIdentifier() {
    return "ASPI";
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberFixedLength("IndexedDataStart", this, 4));
    this.objectList.add(new NumberFixedLength("IndexedDataLength", this, 4));
    this.objectList.add(new NumberFixedLength("NumberOfIndexPoints", this, 2));
    this.objectList.add(new NumberFixedLength("BitsPerIndexPoint", this, 1));
    this.objectList.add(new NumberVariableLength("FractionAtIndex", this, 1));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyASPI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */