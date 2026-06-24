package org.jaudiotagger.audio.ogg.util;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import uc1;

public class OggInfoReader {
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  private int computeBitrate(int paramInt, long paramLong) {
    int i = paramInt;
    if (paramInt == 0)
      i = 1; 
    return (int)(paramLong / Utils.KILOBYTE_MULTIPLIER * Utils.BITS_IN_BYTE_MULTIPLIER / i);
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
    paramuc1.h(paramuc1.d() - 2L);
    while (true) {
      if (paramuc1.c() >= 4L) {
        int i = paramuc1.read();
        arrayOfByte2 = OggPageHeader.CAPTURE_PATTERN;
        if (i == arrayOfByte2[3]) {
          paramuc1.h(paramuc1.c() - 4L);
          arrayOfByte1 = new byte[3];
          paramuc1.readFully(arrayOfByte1);
          if (arrayOfByte1[0] == arrayOfByte2[0] && arrayOfByte1[1] == arrayOfByte2[1] && arrayOfByte1[2] == arrayOfByte2[2]) {
            paramuc1.h(paramuc1.c() - 3L);
            l1 = paramuc1.c();
            paramuc1.h(paramuc1.c() + 26L);
            i = paramuc1.readByte();
            paramuc1.h(l1);
            arrayOfByte1 = new byte[(i & 0xFF) + 27];
            paramuc1.readFully(arrayOfByte1);
            OggPageHeader oggPageHeader = new OggPageHeader(arrayOfByte1);
            paramuc1.h(0L);
            l1 = oggPageHeader.getAbsoluteGranulePosition();
            break;
          } 
        } 
        paramuc1.h(paramuc1.c() - 2L);
        continue;
      } 
      l1 = -1L;
      break;
    } 
    if (l1 != -1L) {
      arrayOfByte1 = new byte[OggPageHeader.read(paramuc1).getPageLength()];
      paramuc1.g(arrayOfByte1);
      VorbisIdentificationHeader vorbisIdentificationHeader = new VorbisIdentificationHeader(arrayOfByte1);
      genericAudioHeader.setPreciseLength(((float)l1 / vorbisIdentificationHeader.getSamplingRate()));
      genericAudioHeader.setChannelNumber(vorbisIdentificationHeader.getChannelNumber());
      genericAudioHeader.setSamplingRate(vorbisIdentificationHeader.getSamplingRate());
      genericAudioHeader.setEncodingType(vorbisIdentificationHeader.getEncodingType());
      genericAudioHeader.setFormat(SupportedFileFormat.OGG.getDisplayName());
      genericAudioHeader.setBitsPerSample(16);
      if (vorbisIdentificationHeader.getNominalBitrate() != 0 && vorbisIdentificationHeader.getMaxBitrate() == vorbisIdentificationHeader.getNominalBitrate() && vorbisIdentificationHeader.getMinBitrate() == vorbisIdentificationHeader.getNominalBitrate()) {
        genericAudioHeader.setBitRate(vorbisIdentificationHeader.getNominalBitrate() / 1000);
        genericAudioHeader.setVariableBitRate(false);
        return genericAudioHeader;
      } 
      if (vorbisIdentificationHeader.getNominalBitrate() != 0 && vorbisIdentificationHeader.getMaxBitrate() == 0 && vorbisIdentificationHeader.getMinBitrate() == 0) {
        genericAudioHeader.setBitRate(vorbisIdentificationHeader.getNominalBitrate() / 1000);
        genericAudioHeader.setVariableBitRate(true);
        return genericAudioHeader;
      } 
      genericAudioHeader.setBitRate(computeBitrate(genericAudioHeader.getTrackLength(), paramuc1.d()));
      genericAudioHeader.setVariableBitRate(true);
      return genericAudioHeader;
    } 
    throw new CannotReadException("Could not find the Ogg Setup block");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\OggInfoReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */