package org.jaudiotagger.tag.id3.framebody;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.nio.ByteBuffer;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.datatype.BooleanByte;
import org.jaudiotagger.tag.datatype.NumberFixedLength;

public class FrameBodyRBUF extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  private static int BUFFER_FIELD_SIZE = 3;
  
  private static int EMBED_FLAG_BIT_POSITION = 1;
  
  private static int OFFSET_FIELD_SIZE = 4;
  
  public FrameBodyRBUF() {
    Byte byte_ = Byte.valueOf((byte)0);
    setObjectValue("BufferSize", byte_);
    setObjectValue("EmbedFlag", Boolean.FALSE);
    setObjectValue("Offset", byte_);
  }
  
  public FrameBodyRBUF(byte paramByte1, boolean paramBoolean, byte paramByte2) {
    setObjectValue("BufferSize", Byte.valueOf(paramByte1));
    setObjectValue(PwbbJfsdcHrAjW.IENeIArFetkG, Boolean.valueOf(paramBoolean));
    setObjectValue(IGBYXeDFmKYajx.mQIlKvoxTRcqwFz, Byte.valueOf(paramByte2));
  }
  
  public FrameBodyRBUF(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyRBUF(FrameBodyRBUF paramFrameBodyRBUF) {
    super(paramFrameBodyRBUF);
  }
  
  public String getIdentifier() {
    return "RBUF";
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberFixedLength("BufferSize", this, BUFFER_FIELD_SIZE));
    this.objectList.add(new BooleanByte("EmbedFlag", this, (byte)EMBED_FLAG_BIT_POSITION));
    this.objectList.add(new NumberFixedLength("Offset", this, OFFSET_FIELD_SIZE));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyRBUF.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */