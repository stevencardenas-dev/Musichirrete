package org.jaudiotagger.audio.flac;

import c61;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.flac.metadatablock.BlockType;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataStreamInfo;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockHeader;
import org.jaudiotagger.audio.generic.Utils;
import u00;
import ws2;

public class FlacInfoReader {
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  private int computeBitrate(long paramLong, float paramFloat) {
    return (int)((float)(paramLong / Utils.KILOBYTE_MULTIPLIER * Utils.BITS_IN_BYTE_MULTIPLIER) / paramFloat);
  }
  
  public int countMetaBlocks(u00 paramu00) {
    byte b;
    FileChannel fileChannel = ws2.n(paramu00).getChannel();
    try {
      FlacStreamReader flacStreamReader = new FlacStreamReader();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(paramu00.j().toString());
      stringBuilder.append(" ");
      this(fileChannel, stringBuilder.toString());
      flacStreamReader.findStream();
      boolean bool = false;
      for (b = 0; !bool; b++) {
        MetadataBlockHeader metadataBlockHeader = MetadataBlockHeader.readHeader(fileChannel);
        Logger logger = logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(paramu00);
        stringBuilder1.append(":Found block:");
        stringBuilder1.append(metadataBlockHeader.getBlockType());
        logger.config(stringBuilder1.toString());
        fileChannel.position(fileChannel.position() + metadataBlockHeader.getDataLength());
        bool = metadataBlockHeader.isLastBlock();
      } 
    } finally {}
    if (fileChannel != null)
      fileChannel.close(); 
    return b;
  }
  
  public FlacAudioHeader read(c61 paramc61) {
    Logger logger = logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramc61);
    stringBuilder2.append(":start");
    logger.config(stringBuilder2.toString());
    FileChannel fileChannel = paramc61.b("r");
    try {
      FlacStreamReader flacStreamReader = new FlacStreamReader();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(paramc61.toString());
      stringBuilder.append(" ");
      this(fileChannel, stringBuilder.toString());
      flacStreamReader.findStream();
      flacStreamReader = null;
      boolean bool;
      for (bool = false; !bool; bool = cannotReadException1.isLastBlock()) {
        CannotReadException cannotReadException1;
        MetadataBlockHeader metadataBlockHeader = MetadataBlockHeader.readHeader(fileChannel);
        Logger logger1 = logger;
        StringBuilder stringBuilder4 = new StringBuilder();
        this();
        stringBuilder4.append(paramc61.toString());
        stringBuilder4.append(" ");
        stringBuilder4.append(metadataBlockHeader.toString());
        logger1.info(stringBuilder4.toString());
        if (metadataBlockHeader.getBlockType() == BlockType.STREAMINFO) {
          if (metadataBlockHeader.getDataLength() != 0) {
            MetadataBlockDataStreamInfo metadataBlockDataStreamInfo = new MetadataBlockDataStreamInfo();
            this(metadataBlockHeader, fileChannel);
            if (!metadataBlockDataStreamInfo.isValid()) {
              cannotReadException1 = new CannotReadException();
              stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append(paramc61);
              stringBuilder1.append(":FLAC StreamInfo not valid");
              this(stringBuilder1.toString());
              throw cannotReadException1;
            } 
          } else {
            cannotReadException1 = new CannotReadException();
            stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append(paramc61);
            stringBuilder1.append(":FLAC StreamInfo has zeo data length");
            this(stringBuilder1.toString());
            throw cannotReadException1;
          } 
        } else {
          fileChannel.position(fileChannel.position() + cannotReadException1.getDataLength());
        } 
      } 
    } finally {}
    long l = fileChannel.position();
    if (stringBuilder1 != null) {
      flacAudioHeader = new FlacAudioHeader();
      this();
      flacAudioHeader.setNoOfSamples(Long.valueOf(stringBuilder1.getNoOfSamples()));
      flacAudioHeader.setPreciseLength(stringBuilder1.getPreciseLength());
      flacAudioHeader.setChannelNumber(stringBuilder1.getNoOfChannels());
      flacAudioHeader.setSamplingRate(stringBuilder1.getSamplingRate());
      flacAudioHeader.setBitsPerSample(stringBuilder1.getBitsPerSample());
      flacAudioHeader.setEncodingType(stringBuilder1.getEncodingType());
      flacAudioHeader.setFormat(SupportedFileFormat.FLAC.getDisplayName());
      flacAudioHeader.setLossless(true);
      flacAudioHeader.setMd5(stringBuilder1.getMD5Signature());
      flacAudioHeader.setAudioDataLength(fileChannel.size() - l);
      flacAudioHeader.setAudioDataStartPosition(Long.valueOf(l));
      flacAudioHeader.setAudioDataEndPosition(Long.valueOf(fileChannel.size()));
      flacAudioHeader.setBitRate(computeBitrate(flacAudioHeader.getAudioDataLength().longValue(), stringBuilder1.getPreciseLength()));
      fileChannel.close();
      return flacAudioHeader;
    } 
    CannotReadException cannotReadException = new CannotReadException();
    StringBuilder stringBuilder3 = new StringBuilder();
    this();
    FlacAudioHeader flacAudioHeader;
    StringBuilder stringBuilder1;
    stringBuilder3.append(flacAudioHeader);
    stringBuilder3.append(":Unable to find Flac StreamInfo");
    this(stringBuilder3.toString());
    throw cannotReadException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacInfoReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */