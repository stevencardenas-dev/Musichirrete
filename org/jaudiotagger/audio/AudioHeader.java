package org.jaudiotagger.audio;

public interface AudioHeader {
  Long getAudioDataEndPosition();
  
  Long getAudioDataLength();
  
  Long getAudioDataStartPosition();
  
  String getBitRate();
  
  long getBitRateAsNumber();
  
  int getBitsPerSample();
  
  Integer getByteRate();
  
  String getChannels();
  
  String getEncodingType();
  
  String getFormat();
  
  Long getNoOfSamples();
  
  double getPreciseTrackLength();
  
  String getSampleRate();
  
  int getSampleRateAsNumber();
  
  int getTrackLength();
  
  boolean isLossless();
  
  boolean isVariableBitRate();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\AudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */