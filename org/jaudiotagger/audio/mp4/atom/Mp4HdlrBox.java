package org.jaudiotagger.audio.mp4.atom;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import com.google.android.material.tabs.xm.VDgS;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.mp4.Mp4AtomIdentifier;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public class Mp4HdlrBox extends AbstractMp4Box {
  public static final int HANDLER_LENGTH = 4;
  
  public static final int HANDLER_POS = 8;
  
  public static final int ITUNES_META_HDLR_DAT_LENGTH = 26;
  
  public static final int NAME_LENGTH = 2;
  
  public static final int OTHER_FLAG_LENGTH = 3;
  
  public static final int RESERVED1_LENGTH = 4;
  
  public static final int RESERVED1_POS = 12;
  
  public static final int RESERVED2_LENGTH = 4;
  
  public static final int RESERVED3_LENGTH = 4;
  
  public static final int RESERVED_FLAG_LENGTH = 4;
  
  public static final int VERSION_FLAG_LENGTH = 1;
  
  private static Map<String, MediaDataType> mediaDataTypeMap = new HashMap<String, MediaDataType>();
  
  private String handlerType;
  
  private MediaDataType mediaDataType;
  
  static {
    for (MediaDataType mediaDataType : MediaDataType.values())
      mediaDataTypeMap.put(mediaDataType.getId(), mediaDataType); 
  }
  
  public Mp4HdlrBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    this.dataBuffer = paramByteBuffer;
  }
  
  public static Mp4HdlrBox createiTunesStyleHdlrBox() {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(Mp4AtomIdentifier.HDLR.getFieldName());
    mp4BoxHeader.setLength(34);
    ByteBuffer byteBuffer = ByteBuffer.allocate(26);
    byteBuffer.put(8, (byte)109);
    byteBuffer.put(9, (byte)100);
    byteBuffer.put(10, (byte)105);
    byteBuffer.put(11, (byte)114);
    byteBuffer.put(12, (byte)97);
    byteBuffer.put(13, (byte)112);
    byteBuffer.put(14, (byte)112);
    byteBuffer.put(15, (byte)108);
    byteBuffer.rewind();
    return new Mp4HdlrBox(mp4BoxHeader, byteBuffer);
  }
  
  public String getHandlerType() {
    return this.handlerType;
  }
  
  public MediaDataType getMediaDataType() {
    return this.mediaDataType;
  }
  
  public void processData() {
    ByteBuffer byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 8);
    CharsetDecoder charsetDecoder = Charset.forName("ISO-8859-1").newDecoder();
    try {
      this.handlerType = charsetDecoder.decode((ByteBuffer)this.dataBuffer.slice().limit(4)).toString();
    } catch (CharacterCodingException characterCodingException) {}
    this.mediaDataType = mediaDataTypeMap.get(this.handlerType);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("handlerType:");
    stringBuilder.append(this.handlerType);
    stringBuilder.append(":human readable:");
    stringBuilder.append(this.mediaDataType.getDescription());
    return stringBuilder.toString();
  }
  
  public enum MediaDataType {
    APPL,
    CRSM,
    HINT,
    IPSM,
    M7SM,
    MDIR,
    META,
    MJSM,
    MP7B,
    MP7T,
    OCSM,
    ODSM("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
    SDSM("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
    SOUN("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
    VIDE("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
    
    private static final MediaDataType[] $VALUES;
    
    private String description;
    
    private String id;
    
    static {
      M7SM = new MediaDataType("M7SM", 3, "m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
      OCSM = new MediaDataType("OCSM", 4, "ocsm", hrSTyFuSIm.sGlhSkQIPrsO);
      IPSM = new MediaDataType("IPSM", 5, "ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
      MJSM = new MediaDataType("MJSM", 6, "mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
      MDIR = new MediaDataType("MDIR", 7, "mdir", "Apple Meta Data iTunes Reader");
      MP7B = new MediaDataType("MP7B", 8, "mp7b", "MPEG-7 binary XML");
      MP7T = new MediaDataType("MP7T", 9, "mp7t", "MPEG-7 XML");
      VIDE = new MediaDataType("VIDE", 10, "vide", "Video Track");
      SOUN = new MediaDataType("SOUN", 11, "soun", "Sound Track");
      HINT = new MediaDataType("HINT", 12, "hint", "Hint Track");
      APPL = new MediaDataType("APPL", 13, "appl", "Apple specific");
      META = new MediaDataType("META", 14, IGBYXeDFmKYajx.kMnDfg, "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
      $VALUES = $values();
    }
    
    MediaDataType(String param1String1, String param1String2) {
      this.id = param1String1;
      this.description = param1String2;
    }
    
    public String getDescription() {
      return this.description;
    }
    
    public String getId() {
      return this.id;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4HdlrBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */