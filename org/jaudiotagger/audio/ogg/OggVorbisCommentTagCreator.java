package org.jaudiotagger.audio.ogg;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.ogg.util.VorbisHeader;
import org.jaudiotagger.audio.ogg.util.VorbisPacketType;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentCreator;

public class OggVorbisCommentTagCreator {
  public static final int FIELD_FRAMING_BIT_LENGTH = 1;
  
  public static final byte FRAMING_BIT_VALID_VALUE = 1;
  
  public static Logger logger;
  
  private final byte[] capturePattern = VorbisHeader.CAPTURE_PATTERN_AS_BYTES;
  
  private VorbisCommentCreator creator = new VorbisCommentCreator();
  
  private final byte[] prefix = new byte[] { (byte)VorbisPacketType.COMMENT_HEADER.getType() };
  
  private final boolean shouldWriteFramingBit = true;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public OggVorbisCommentTagCreator() {}
  
  public OggVorbisCommentTagCreator(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean) {}
  
  public ByteBuffer convert(Tag paramTag) {
    ByteBuffer byteBuffer2 = this.creator.convertMetadata(paramTag);
    int j = byteBuffer2.capacity() + this.prefix.length + this.capturePattern.length;
    int i = j;
    if (this.shouldWriteFramingBit)
      i = j + 1; 
    ByteBuffer byteBuffer1 = ByteBuffer.allocate(i);
    byteBuffer1.put(this.prefix);
    byteBuffer1.put(this.capturePattern);
    byteBuffer1.put(byteBuffer2);
    if (this.shouldWriteFramingBit)
      byteBuffer1.put((byte)1); 
    byteBuffer1.rewind();
    return byteBuffer1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\ogg\OggVorbisCommentTagCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */