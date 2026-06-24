package org.jaudiotagger.audio.opus;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.ogg.OggVorbisTagReader;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentReader;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import uc1;

public class OpusVorbisTagReader extends OggVorbisTagReader {
  private VorbisCommentReader tagReader = new VorbisCommentReader();
  
  public byte[] convertToVorbisCommentPacket(OggPageHeader paramOggPageHeader, uc1 paramuc1) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[((OggPageHeader.PacketStartAndLength)paramOggPageHeader.getPacketList().get(0)).getLength() - OpusHeader.TAGS_CAPTURE_PATTERN_LENGTH];
    paramuc1.g(arrayOfByte);
    byteArrayOutputStream.write(arrayOfByte);
    if (paramOggPageHeader.getPacketList().size() > 1 || !paramOggPageHeader.isLastPacketIncomplete())
      return byteArrayOutputStream.toByteArray(); 
    while (true) {
      OggVorbisTagReader.logger.config("Reading comment page");
      OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
      byte[] arrayOfByte1 = new byte[((OggPageHeader.PacketStartAndLength)oggPageHeader.getPacketList().get(0)).getLength()];
      paramuc1.g(arrayOfByte1);
      byteArrayOutputStream.write(arrayOfByte1);
      if (oggPageHeader.getPacketList().size() > 1) {
        OggVorbisTagReader.logger.config("Comments finish on Page because there is another packet on this page");
        return byteArrayOutputStream.toByteArray();
      } 
      if (!oggPageHeader.isLastPacketIncomplete()) {
        OggVorbisTagReader.logger.config("Comments finish on Page because this packet is complete");
        return byteArrayOutputStream.toByteArray();
      } 
    } 
  }
  
  public boolean isVorbisCommentHeader(byte[] paramArrayOfbyte) {
    return (new String(paramArrayOfbyte, 0, OpusHeader.TAGS_CAPTURE_PATTERN_LENGTH, Charset.forName("ISO-8859-1"))).equals("OpusTags");
  }
  
  public Tag read(uc1 paramuc1) {
    OggVorbisTagReader.logger.config("Starting to read ogg vorbis tag from file:");
    byte[] arrayOfByte = readRawPacketData(paramuc1);
    VorbisCommentTag vorbisCommentTag = this.tagReader.read(arrayOfByte, false, null);
    OggVorbisTagReader.logger.fine("CompletedReadCommentTag");
    return (Tag)vorbisCommentTag;
  }
  
  public byte[] readRawPacketData(uc1 paramuc1) {
    OggVorbisTagReader.logger.fine("Read 1st page");
    OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
    paramuc1.h(paramuc1.c() + oggPageHeader.getPageLength());
    OggVorbisTagReader.logger.fine("Read 2nd page");
    oggPageHeader = OggPageHeader.read(paramuc1);
    byte[] arrayOfByte = new byte[OpusHeader.TAGS_CAPTURE_PATTERN_LENGTH];
    paramuc1.g(arrayOfByte);
    if (isVorbisCommentHeader(arrayOfByte))
      return convertToVorbisCommentPacket(oggPageHeader, paramuc1); 
    throw new CannotReadException("Cannot find comment block (no vorbiscomment header)");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\opus\OpusVorbisTagReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */