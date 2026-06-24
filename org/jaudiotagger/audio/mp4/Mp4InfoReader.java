package org.jaudiotagger.audio.mp4;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import c61;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotReadVideoException;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4AlacBox;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.audio.mp4.atom.Mp4DrmsBox;
import org.jaudiotagger.audio.mp4.atom.Mp4EsdsBox;
import org.jaudiotagger.audio.mp4.atom.Mp4FtypBox;
import org.jaudiotagger.audio.mp4.atom.Mp4MdhdBox;
import org.jaudiotagger.audio.mp4.atom.Mp4Mp4aBox;
import org.jaudiotagger.audio.mp4.atom.Mp4MvhdBox;
import org.jaudiotagger.audio.mp4.atom.Mp4StcoBox;
import org.jaudiotagger.audio.mp4.atom.Mp4StsdBox;

public class Mp4InfoReader {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.mp4.atom");
  
  private boolean isTrackAtomVideo(Mp4FtypBox paramMp4FtypBox, Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    if (Mp4BoxHeader.seekWithinLevel(paramByteBuffer, Mp4AtomIdentifier.MDIA.getFieldName()) == null)
      return false; 
    Mp4BoxHeader mp4BoxHeader = Mp4BoxHeader.seekWithinLevel(paramByteBuffer, Mp4AtomIdentifier.MDHD.getFieldName());
    if (mp4BoxHeader == null)
      return false; 
    int i = paramByteBuffer.position();
    paramByteBuffer.position(mp4BoxHeader.getDataLength() + i);
    return (Mp4BoxHeader.seekWithinLevel(paramByteBuffer, Mp4AtomIdentifier.MINF.getFieldName()) == null) ? false : ((Mp4BoxHeader.seekWithinLevel(paramByteBuffer, Mp4AtomIdentifier.VMHD.getFieldName()) != null));
  }
  
  public GenericAudioHeader read(c61 paramc61) {
    FileChannel fileChannel = paramc61.b("r");
    try {
      Mp4AudioHeader mp4AudioHeader = new Mp4AudioHeader();
      this();
      Mp4BoxHeader mp4BoxHeader = Mp4BoxHeader.seekWithinLevel(fileChannel, Mp4AtomIdentifier.FTYP.getFieldName());
      if (mp4BoxHeader != null) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(mp4BoxHeader.getLength() - 8);
        fileChannel.read(byteBuffer);
        byteBuffer.rewind();
        Mp4FtypBox mp4FtypBox = new Mp4FtypBox();
        this(mp4BoxHeader, byteBuffer);
        mp4FtypBox.processData();
        mp4AudioHeader.setBrand(mp4FtypBox.getMajorBrand());
        mp4BoxHeader = Mp4BoxHeader.seekWithinLevel(fileChannel, Mp4AtomIdentifier.MOOV.getFieldName());
        if (mp4BoxHeader != null) {
          ByteBuffer byteBuffer1 = ByteBuffer.allocate(mp4BoxHeader.getLength() - 8);
          byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
          fileChannel.read(byteBuffer1);
          byteBuffer1.rewind();
          Mp4BoxHeader mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.MVHD.getFieldName());
          if (mp4BoxHeader1 != null) {
            byteBuffer1 = byteBuffer1.slice();
            Mp4MvhdBox mp4MvhdBox = new Mp4MvhdBox();
            this(mp4BoxHeader1, byteBuffer1);
            mp4AudioHeader.setPreciseLength(mp4MvhdBox.getPreciseLength());
            byteBuffer1.position(byteBuffer1.position() + mp4BoxHeader1.getDataLength());
            mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.TRAK.getFieldName());
            if (mp4BoxHeader1 != null) {
              int j = byteBuffer1.position();
              int i = mp4BoxHeader1.getDataLength();
              if (Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.MDIA.getFieldName()) != null) {
                mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.MDHD.getFieldName());
                if (mp4BoxHeader1 != null) {
                  Mp4MdhdBox mp4MdhdBox = new Mp4MdhdBox();
                  this(mp4BoxHeader1, byteBuffer1.slice());
                  mp4AudioHeader.setSamplingRate(mp4MdhdBox.getSampleRate());
                  byteBuffer1.position(byteBuffer1.position() + mp4BoxHeader1.getDataLength());
                  if (Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.MINF.getFieldName()) != null) {
                    int k = byteBuffer1.position();
                    Mp4BoxHeader mp4BoxHeader2 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.SMHD.getFieldName());
                    String str = eRUgfgGAccgka.bRpQd;
                    if (mp4BoxHeader2 == null) {
                      byteBuffer1.position(k);
                      if (Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.VMHD.getFieldName()) != null) {
                        CannotReadVideoException cannotReadVideoException = new CannotReadVideoException();
                        this(str);
                        throw cannotReadVideoException;
                      } 
                      cannotReadException7 = new CannotReadException();
                      this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
                      throw cannotReadException7;
                    } 
                    byteBuffer1.position(k);
                    if (Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.STBL.getFieldName()) != null) {
                      int m = byteBuffer1.position();
                      Mp4BoxHeader mp4BoxHeader3 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.STSD.getFieldName());
                      if (mp4BoxHeader3 != null) {
                        Mp4StsdBox mp4StsdBox = new Mp4StsdBox();
                        this(mp4BoxHeader3, byteBuffer1);
                        mp4StsdBox.processData();
                        k = byteBuffer1.position();
                        mp4BoxHeader3 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.MP4A.getFieldName());
                        if (mp4BoxHeader3 != null) {
                          ByteBuffer byteBuffer2 = byteBuffer1.slice();
                          Mp4Mp4aBox mp4Mp4aBox = new Mp4Mp4aBox();
                          this(mp4BoxHeader3, byteBuffer2);
                          mp4Mp4aBox.processData();
                          Mp4BoxHeader mp4BoxHeader4 = Mp4BoxHeader.seekWithinLevel(byteBuffer2, Mp4AtomIdentifier.ESDS.getFieldName());
                          if (mp4BoxHeader4 != null) {
                            Mp4EsdsBox mp4EsdsBox = new Mp4EsdsBox();
                            this(mp4BoxHeader4, byteBuffer2.slice());
                            mp4AudioHeader.setBitRate(mp4EsdsBox.getAvgBitrate() / Utils.KILOBYTE_MULTIPLIER);
                            mp4AudioHeader.setChannelNumber(mp4EsdsBox.getNumberOfChannels());
                            mp4AudioHeader.setKind(mp4EsdsBox.getKind());
                            mp4AudioHeader.setProfile(mp4EsdsBox.getAudioProfile());
                            mp4AudioHeader.setEncodingType(EncoderType.AAC.getDescription());
                          } 
                        } else {
                          byteBuffer1.position(k);
                          mp4BoxHeader3 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.DRMS.getFieldName());
                          if (mp4BoxHeader3 != null) {
                            Mp4DrmsBox mp4DrmsBox = new Mp4DrmsBox();
                            this(mp4BoxHeader3, byteBuffer1);
                            mp4DrmsBox.processData();
                            mp4BoxHeader3 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.ESDS.getFieldName());
                            if (mp4BoxHeader3 != null) {
                              Mp4EsdsBox mp4EsdsBox = new Mp4EsdsBox();
                              this(mp4BoxHeader3, byteBuffer1.slice());
                              mp4AudioHeader.setBitRate(mp4EsdsBox.getAvgBitrate() / Utils.KILOBYTE_MULTIPLIER);
                              mp4AudioHeader.setChannelNumber(mp4EsdsBox.getNumberOfChannels());
                              mp4AudioHeader.setKind(mp4EsdsBox.getKind());
                              mp4AudioHeader.setProfile(mp4EsdsBox.getAudioProfile());
                              mp4AudioHeader.setEncodingType(EncoderType.DRM_AAC.getDescription());
                            } 
                          } else {
                            byteBuffer1.position(k);
                            Mp4AtomIdentifier mp4AtomIdentifier = Mp4AtomIdentifier.ALAC;
                            Mp4BoxHeader mp4BoxHeader4 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, mp4AtomIdentifier.getFieldName());
                            if (mp4BoxHeader4 != null) {
                              Mp4AlacBox mp4AlacBox = new Mp4AlacBox();
                              this(mp4BoxHeader4, byteBuffer1);
                              mp4AlacBox.processData();
                              mp4BoxHeader4 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, mp4AtomIdentifier.getFieldName());
                              if (mp4BoxHeader4 != null) {
                                mp4AlacBox = new Mp4AlacBox();
                                this(mp4BoxHeader4, byteBuffer1);
                                mp4AlacBox.processData();
                                mp4AudioHeader.setEncodingType(EncoderType.APPLE_LOSSLESS.getDescription());
                                mp4AudioHeader.setChannelNumber(mp4AlacBox.getChannels());
                                mp4AudioHeader.setBitRate(mp4AlacBox.getBitRate() / Utils.KILOBYTE_MULTIPLIER);
                                mp4AudioHeader.setBitsPerSample(mp4AlacBox.getSampleSize());
                              } 
                            } 
                          } 
                        } 
                      } 
                      byteBuffer1.position(m);
                      mp4BoxHeader2 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.STCO.getFieldName());
                      if (mp4BoxHeader2 != null) {
                        Mp4StcoBox mp4StcoBox = new Mp4StcoBox();
                        this(mp4BoxHeader2, byteBuffer1);
                        mp4AudioHeader.setAudioDataStartPosition(Long.valueOf(mp4StcoBox.getFirstOffSet()));
                        mp4AudioHeader.setAudioDataEndPosition(Long.valueOf(fileChannel.size()));
                        mp4AudioHeader.setAudioDataLength(fileChannel.size() - mp4StcoBox.getFirstOffSet());
                      } 
                      if (mp4AudioHeader.getChannelNumber() == -1)
                        mp4AudioHeader.setChannelNumber(2); 
                      if (mp4AudioHeader.getBitRateAsNumber() == -1L)
                        mp4AudioHeader.setBitRate(128); 
                      if (mp4AudioHeader.getBitsPerSample() == -1)
                        mp4AudioHeader.setBitsPerSample(16); 
                      if ("".equals(mp4AudioHeader.getEncodingType()))
                        mp4AudioHeader.setEncodingType(EncoderType.AAC.getDescription()); 
                      logger.config(mp4AudioHeader.toString());
                      byteBuffer1.position(j + i);
                      while (byteBuffer1.hasRemaining()) {
                        mp4BoxHeader2 = Mp4BoxHeader.seekWithinLevel(byteBuffer1, Mp4AtomIdentifier.TRAK.getFieldName());
                        if (mp4BoxHeader2 != null) {
                          if (!isTrackAtomVideo((Mp4FtypBox)cannotReadException7, mp4BoxHeader2, byteBuffer1))
                            continue; 
                          CannotReadVideoException cannotReadVideoException = new CannotReadVideoException();
                          this(str);
                          throw cannotReadVideoException;
                        } 
                      } 
                      mp4AudioHeader.setFormat(mp4AudioHeader.getEncodingType());
                      new Mp4AtomTree(fileChannel, false);
                      fileChannel.close();
                      return mp4AudioHeader;
                    } 
                    CannotReadException cannotReadException7 = new CannotReadException();
                    this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
                    throw cannotReadException7;
                  } 
                  CannotReadException cannotReadException6 = new CannotReadException();
                  this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
                  throw cannotReadException6;
                } 
                CannotReadException cannotReadException5 = new CannotReadException();
                this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
                throw cannotReadException5;
              } 
              CannotReadException cannotReadException4 = new CannotReadException();
              this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
              throw cannotReadException4;
            } 
            CannotReadException cannotReadException3 = new CannotReadException();
            this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
            throw cannotReadException3;
          } 
          CannotReadException cannotReadException2 = new CannotReadException();
          this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
          throw cannotReadException2;
        } 
        CannotReadException cannotReadException1 = new CannotReadException();
        this("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
        throw cannotReadException1;
      } 
    } finally {
      Exception exception;
    } 
    CannotReadException cannotReadException = new CannotReadException();
    this("This file does not appear to be an Mp4 file");
    throw cannotReadException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4InfoReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */