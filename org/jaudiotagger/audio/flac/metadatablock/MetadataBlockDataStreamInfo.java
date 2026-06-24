package org.jaudiotagger.audio.flac.metadatablock;

import ga1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.generic.Utils;
import x41;

public class MetadataBlockDataStreamInfo implements MetadataBlockData {
  public static final int STREAM_INFO_DATA_LENGTH = 34;
  
  private static final char[] hexArray;
  
  public static Logger logger;
  
  private int bitsPerSample;
  
  private boolean isValid = true;
  
  private int maxBlockSize;
  
  private int maxFrameSize;
  
  private String md5;
  
  private int minBlockSize;
  
  private int minFrameSize;
  
  private int noOfChannels;
  
  private int noOfSamples;
  
  private ByteBuffer rawdata;
  
  private int samplingRate;
  
  private int samplingRatePerChannel;
  
  private float trackLength;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac.MetadataBlockDataStreamInfo");
    logger = logger;
    logger.setLevel(Level.SEVERE);
    hexArray = new char[] { 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f' };
  }
  
  public MetadataBlockDataStreamInfo(MetadataBlockHeader paramMetadataBlockHeader, FileChannel paramFileChannel) {
    if (paramMetadataBlockHeader.getDataLength() >= 34) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(paramMetadataBlockHeader.getDataLength());
      this.rawdata = byteBuffer;
      byteBuffer.order(ByteOrder.BIG_ENDIAN);
      int j = paramFileChannel.read(this.rawdata);
      if (j >= paramMetadataBlockHeader.getDataLength()) {
        this.rawdata.flip();
        this.minBlockSize = Utils.u(this.rawdata.getShort());
        this.maxBlockSize = Utils.u(this.rawdata.getShort());
        this.minFrameSize = readThreeByteInteger(this.rawdata.get(), this.rawdata.get(), this.rawdata.get());
        this.maxFrameSize = readThreeByteInteger(this.rawdata.get(), this.rawdata.get(), this.rawdata.get());
        this.samplingRate = readSamplingRate();
        this.noOfChannels = readNoOfChannels();
        this.bitsPerSample = readBitsPerSample();
        this.noOfSamples = readTotalNumberOfSamples();
        this.md5 = readMd5();
        double d = this.noOfSamples;
        j = this.samplingRate;
        this.trackLength = (float)(d / j);
        this.samplingRatePerChannel = j / this.noOfChannels;
        this.rawdata.rewind();
        return;
      } 
      this.isValid = false;
      StringBuilder stringBuilder1 = ga1.k(j, "Unable to read required number of bytes, read:", ":required:");
      stringBuilder1.append(paramMetadataBlockHeader.getDataLength());
      throw new IOException(stringBuilder1.toString());
    } 
    this.isValid = false;
    int i = paramMetadataBlockHeader.getDataLength();
    StringBuilder stringBuilder = new StringBuilder("MetadataBlockDataStreamInfo HeaderDataSize is invalid:");
    stringBuilder.append(i);
    throw new IOException(stringBuilder.toString());
  }
  
  private int readBitsPerSample() {
    return ((Utils.u(this.rawdata.get(12)) & 0x1) << 4) + ((Utils.u(this.rawdata.get(13)) & 0xF0) >>> 4) + 1;
  }
  
  private String readMd5() {
    char[] arrayOfChar = new char[32];
    if (this.rawdata.limit() >= 34)
      for (byte b = 0; b < 16; b++) {
        byte b1 = this.rawdata.get(b + 18);
        int i = b * 2;
        char[] arrayOfChar1 = hexArray;
        arrayOfChar[i] = arrayOfChar1[(b1 & 0xFF) >>> 4];
        arrayOfChar[i + 1] = arrayOfChar1[b1 & 0xF];
      }  
    return new String(arrayOfChar);
  }
  
  private int readNoOfChannels() {
    return ((Utils.u(this.rawdata.get(12)) & 0xE) >>> 1) + 1;
  }
  
  private int readSamplingRate() {
    return (Utils.u(this.rawdata.get(10)) << 12) + (Utils.u(this.rawdata.get(11)) << 4) + ((Utils.u(this.rawdata.get(12)) & 0xF0) >>> 4);
  }
  
  private int readThreeByteInteger(byte paramByte1, byte paramByte2, byte paramByte3) {
    int j = Utils.u(paramByte1);
    int i = Utils.u(paramByte2);
    return Utils.u(paramByte3) + (j << 16) + (i << 8);
  }
  
  private int readTotalNumberOfSamples() {
    return Utils.u(this.rawdata.get(17)) + (Utils.u(this.rawdata.get(16)) << 8) + (Utils.u(this.rawdata.get(15)) << 16) + (Utils.u(this.rawdata.get(14)) << 24) + ((Utils.u(this.rawdata.get(13)) & 0xF) << 32);
  }
  
  public int getBitsPerSample() {
    return this.bitsPerSample;
  }
  
  public ByteBuffer getBytes() {
    return this.rawdata;
  }
  
  public String getEncodingType() {
    return x41.m(new StringBuilder("FLAC "), this.bitsPerSample, " bits");
  }
  
  public int getLength() {
    return this.rawdata.limit();
  }
  
  public String getMD5Signature() {
    return this.md5;
  }
  
  public int getNoOfChannels() {
    return this.noOfChannels;
  }
  
  public long getNoOfSamples() {
    return this.noOfSamples;
  }
  
  public float getPreciseLength() {
    return this.trackLength;
  }
  
  public int getSamplingRate() {
    return this.samplingRate;
  }
  
  public int getSamplingRatePerChannel() {
    return this.samplingRatePerChannel;
  }
  
  public boolean isValid() {
    return this.isValid;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("MinBlockSize:");
    stringBuilder.append(this.minBlockSize);
    stringBuilder.append("MaxBlockSize:");
    stringBuilder.append(this.maxBlockSize);
    stringBuilder.append("MinFrameSize:");
    stringBuilder.append(this.minFrameSize);
    stringBuilder.append("MaxFrameSize:");
    stringBuilder.append(this.maxFrameSize);
    stringBuilder.append("SampleRateTotal:");
    stringBuilder.append(this.samplingRate);
    stringBuilder.append("SampleRatePerChannel:");
    stringBuilder.append(this.samplingRatePerChannel);
    stringBuilder.append(":Channel number:");
    stringBuilder.append(this.noOfChannels);
    stringBuilder.append(":Bits per sample: ");
    stringBuilder.append(this.bitsPerSample);
    stringBuilder.append(":TotalNumberOfSamples: ");
    stringBuilder.append(this.noOfSamples);
    stringBuilder.append(":Length: ");
    stringBuilder.append(this.trackLength);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\MetadataBlockDataStreamInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */