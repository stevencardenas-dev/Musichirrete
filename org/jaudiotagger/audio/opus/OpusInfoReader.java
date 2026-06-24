package org.jaudiotagger.audio.opus;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.audio.opus.util.OpusVorbisIdentificationHeader;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import uc1;

public class OpusInfoReader {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.opus.atom");
  
  private OggPageHeader lastValidHeader(uc1 paramuc1) {
    OggPageHeader oggPageHeader = null;
    try {
      while (true) {
        OggPageHeader oggPageHeader1 = OggPageHeader.read(paramuc1);
        paramuc1.h(paramuc1.c() + oggPageHeader1.getPageLength());
        if (oggPageHeader1.isValid()) {
          boolean bool = oggPageHeader1.isLastPacketIncomplete();
          if (!bool)
            oggPageHeader = oggPageHeader1; 
        } 
      } 
    } catch (CannotReadException cannotReadException) {
      return oggPageHeader;
    } 
  }
  
  public GenericAudioHeader read(uc1 paramuc1) {
    long l2 = paramuc1.c();
    GenericAudioHeader genericAudioHeader = new GenericAudioHeader();
    logger.fine("Started");
    byte[] arrayOfByte1 = OggPageHeader.CAPTURE_PATTERN;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    paramuc1.g(arrayOfByte2);
    long l1 = l2;
    if (!Arrays.equals(arrayOfByte2, arrayOfByte1)) {
      paramuc1.h(0L);
      if (AbstractID3v2Tag.isId3Tag(paramuc1)) {
        paramuc1.g(arrayOfByte2);
        l1 = l2;
        if (Arrays.equals(arrayOfByte2, arrayOfByte1))
          l1 = paramuc1.c(); 
      } else {
        throw new CannotReadException(MessageFormat.format("OggS Header could not be found, not an ogg stream {0}", new Object[] { new String(arrayOfByte2) }));
      } 
    } 
    paramuc1.h(l1);
    arrayOfByte1 = new byte[OggPageHeader.read(paramuc1).getPageLength()];
    paramuc1.g(arrayOfByte1);
    OpusVorbisIdentificationHeader opusVorbisIdentificationHeader = new OpusVorbisIdentificationHeader(arrayOfByte1);
    genericAudioHeader.setChannelNumber(opusVorbisIdentificationHeader.getAudioChannels());
    genericAudioHeader.setSamplingRate(opusVorbisIdentificationHeader.getAudioSampleRate());
    genericAudioHeader.setEncodingType("Opus Vorbis 1.0");
    OggPageHeader oggPageHeader = lastValidHeader(paramuc1);
    if (oggPageHeader != null) {
      genericAudioHeader.setNoOfSamples(Long.valueOf(oggPageHeader.getAbsoluteGranulePosition() - opusVorbisIdentificationHeader.getPreSkip()));
      genericAudioHeader.setPreciseLength(genericAudioHeader.getNoOfSamples().longValue() / 48000.0D);
      return genericAudioHeader;
    } 
    throw new CannotReadException("Opus file contains ID and Comment headers but no audio content");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\opus\OpusInfoReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */