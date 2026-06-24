package org.jaudiotagger.audio.dff;

import c61;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidChunkException;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.AudioFileReader2;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.Tag;

public class DffFileReader extends AudioFileReader2 {
  private GenericAudioHeader buildAudioHeader(int paramInt1, int paramInt2, long paramLong, int paramInt3, boolean paramBoolean) {
    GenericAudioHeader genericAudioHeader = new GenericAudioHeader();
    genericAudioHeader.setEncodingType("DFF");
    genericAudioHeader.setBitRate(paramInt3 * paramInt2 * paramInt1);
    genericAudioHeader.setBitsPerSample(paramInt3);
    genericAudioHeader.setChannelNumber(paramInt1);
    genericAudioHeader.setSamplingRate(paramInt2);
    genericAudioHeader.setNoOfSamples(Long.valueOf(paramLong));
    genericAudioHeader.setPreciseLength(((float)paramLong / paramInt2));
    genericAudioHeader.setVariableBitRate(paramBoolean);
    Logger logger = AudioFileReader.logger;
    Level level = Level.FINE;
    StringBuilder stringBuilder = new StringBuilder("Created audio header: ");
    stringBuilder.append(genericAudioHeader);
    logger.log(level, stringBuilder.toString());
    return genericAudioHeader;
  }
  
  public GenericAudioHeader getEncodingInfo(c61 paramc61) {
    FileChannel fileChannel = paramc61.b("r");
    try {
      if (Frm8Chunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, 12)) != null) {
        GenericAudioHeader genericAudioHeader;
        if (DsdChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, 8)) != null) {
          do {
          
          } while (PropChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, 12)) == null);
          SndChunk sndChunk = SndChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, 4));
          if (sndChunk != null) {
            ChnlChunk chnlChunk = null;
            FsChunk fsChunk = null;
            SndChunk sndChunk1 = null;
            sndChunk = sndChunk1;
            while (true) {
              try {
                BaseChunk baseChunk = BaseChunk.readIdChunk(Utils.readFileDataIntoBufferLE(fileChannel, 4));
                if (baseChunk instanceof FsChunk) {
                  fsChunk = (FsChunk)baseChunk;
                  fsChunk.readDataChunch(fileChannel);
                  continue;
                } 
                if (baseChunk instanceof ChnlChunk) {
                  chnlChunk = (ChnlChunk)baseChunk;
                  chnlChunk.readDataChunch(fileChannel);
                  continue;
                } 
                if (baseChunk instanceof CmprChunk) {
                  ((CmprChunk)baseChunk).readDataChunch(fileChannel);
                  continue;
                } 
                if (baseChunk instanceof DitiChunk) {
                  ((DitiChunk)baseChunk).readDataChunch(fileChannel);
                  continue;
                } 
                if (baseChunk instanceof EndChunk) {
                  baseChunk = baseChunk;
                  baseChunk.readDataChunch(fileChannel);
                  if (chnlChunk != null) {
                    if (fsChunk != null) {
                      if (sndChunk1 == null || sndChunk != null) {
                        long l;
                        boolean bool;
                        short s = chnlChunk.getNumChannels().shortValue();
                        int i = fsChunk.getSampleRate();
                        if (sndChunk1 != null) {
                          l = (sndChunk.getNumFrames() / sndChunk.getRate().shortValue() * i);
                        } else {
                          l = baseChunk.getDataEnd().longValue();
                          long l1 = baseChunk.getDataStart().longValue();
                          l = (8 / s) * (l - l1);
                        } 
                        if (sndChunk1 != null) {
                          bool = true;
                        } else {
                          bool = false;
                        } 
                        genericAudioHeader = buildAudioHeader(s, i, l, 1, bool);
                        if (fileChannel != null)
                          fileChannel.close(); 
                        return genericAudioHeader;
                      } 
                      CannotReadException cannotReadException5 = new CannotReadException();
                      StringBuilder stringBuilder5 = new StringBuilder();
                      this();
                      stringBuilder5.append(genericAudioHeader);
                      stringBuilder5.append(" Not a valid dst file. Missing 'FRTE' chunk");
                      this(stringBuilder5.toString());
                      throw cannotReadException5;
                    } 
                    CannotReadException cannotReadException4 = new CannotReadException();
                    StringBuilder stringBuilder4 = new StringBuilder();
                    this();
                    stringBuilder4.append(genericAudioHeader);
                    stringBuilder4.append(" Not a valid dff file. Missing 'FS' chunk");
                    this(stringBuilder4.toString());
                    throw cannotReadException4;
                  } 
                  CannotReadException cannotReadException3 = new CannotReadException();
                  StringBuilder stringBuilder3 = new StringBuilder();
                  this();
                  stringBuilder3.append(genericAudioHeader);
                  stringBuilder3.append(" Not a valid dff file. Missing 'CHNL' chunk");
                  this(stringBuilder3.toString());
                  throw cannotReadException3;
                } 
                if (baseChunk instanceof DstChunk) {
                  baseChunk = baseChunk;
                  baseChunk.readDataChunch(fileChannel);
                  try {
                    FrteChunk frteChunk2 = (FrteChunk)BaseChunk.readIdChunk(Utils.readFileDataIntoBufferLE(fileChannel, 4));
                    BaseChunk baseChunk1 = baseChunk;
                    FrteChunk frteChunk1 = frteChunk2;
                    if (frteChunk2 != null) {
                      frteChunk2.readDataChunch(fileChannel);
                      baseChunk1 = baseChunk;
                      frteChunk1 = frteChunk2;
                    } 
                  } catch (InvalidChunkException invalidChunkException) {
                    CannotReadException cannotReadException3 = new CannotReadException();
                    StringBuilder stringBuilder3 = new StringBuilder();
                    this();
                    stringBuilder3.append(genericAudioHeader);
                    stringBuilder3.append("Not a valid dft file. Missing 'FRTE' chunk");
                    this(stringBuilder3.toString());
                    throw cannotReadException3;
                  } 
                  continue;
                } 
                if (baseChunk instanceof Id3Chunk)
                  ((Id3Chunk)baseChunk).readDataChunch(fileChannel); 
              } catch (InvalidChunkException invalidChunkException) {}
            } 
          } 
          CannotReadException cannotReadException2 = new CannotReadException();
          StringBuilder stringBuilder2 = new StringBuilder();
          this();
          stringBuilder2.append(genericAudioHeader);
          stringBuilder2.append(" Not a valid dff file. Missing 'SND '  after 'PROP' ");
          this(stringBuilder2.toString());
          throw cannotReadException2;
        } 
        CannotReadException cannotReadException1 = new CannotReadException();
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(genericAudioHeader);
        stringBuilder1.append(" Not a valid dff file. Missing 'DSD '  after 'FRM8' ");
        this(stringBuilder1.toString());
        throw cannotReadException1;
      } 
    } finally {}
    CannotReadException cannotReadException = new CannotReadException();
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append(paramc61);
    stringBuilder.append(" Not a valid dff file. Content does not start with 'FRM8'");
    this(stringBuilder.toString());
    throw cannotReadException;
  }
  
  public Tag getTag(c61 paramc61) {
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\DffFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */