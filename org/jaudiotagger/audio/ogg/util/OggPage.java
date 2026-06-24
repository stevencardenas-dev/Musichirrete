package org.jaudiotagger.audio.ogg.util;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.generic.Utils;

public class OggPage {
  private final ByteBuffer content;
  
  private final OggPageHeader header;
  
  public OggPage(OggPageHeader paramOggPageHeader, ByteBuffer paramByteBuffer) {
    this.header = paramOggPageHeader;
    this.content = paramByteBuffer;
    fixCksum();
  }
  
  private void fixCksum() {
    ByteBuffer byteBuffer = ByteBuffer.allocate(size());
    write(byteBuffer);
    byteBuffer.putInt(22, 0);
    int i = Utils.getIntLE(OggCRCFactory.computeCRC(byteBuffer.array()));
    this.header.setChecksum(i);
  }
  
  public static OggPage parse(ByteBuffer paramByteBuffer) {
    OggPageHeader oggPageHeader = OggPageHeader.read(paramByteBuffer);
    ByteBuffer byteBuffer = paramByteBuffer.slice();
    byteBuffer.limit(oggPageHeader.getPageLength());
    Utils.skip(paramByteBuffer, oggPageHeader.getPageLength());
    return new OggPage(oggPageHeader, byteBuffer);
  }
  
  public ByteBuffer getContent() {
    return this.content;
  }
  
  public OggPageHeader getHeader() {
    return this.header;
  }
  
  public void setSequenceNo(int paramInt) {
    this.header.setPageSequence(paramInt);
    fixCksum();
  }
  
  public int size() {
    int i = (this.header.getSegmentTable()).length;
    return this.header.getPageLength() + i + 27;
  }
  
  public void write(ByteBuffer paramByteBuffer) {
    this.header.write(paramByteBuffer);
    paramByteBuffer.put(this.content.duplicate());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\OggPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */