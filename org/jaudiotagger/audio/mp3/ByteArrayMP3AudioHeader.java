package org.jaudiotagger.audio.mp3;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;

public class ByteArrayMP3AudioHeader extends MP3AudioHeader {
  public ByteArrayMP3AudioHeader(byte[] paramArrayOfbyte) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
    long l = 0L;
    for (boolean bool = false;; bool = bool1) {
      boolean bool1 = bool;
      if (MPEGFrameHeader.isMPEGFrame(byteBuffer))
        try {
          MPEGFrameHeader mPEGFrameHeader = MPEGFrameHeader.parseMPEGHeader(byteBuffer);
          this.mp3FrameHeader = mPEGFrameHeader;
          try {
            ByteBuffer byteBuffer1 = XingFrame.isXingFrame(byteBuffer, mPEGFrameHeader);
            if (byteBuffer1 != null) {
              try {
                this.mp3XingFrame = XingFrame.parseXingFrame(byteBuffer1);
              } catch (InvalidAudioFrameException invalidAudioFrameException) {}
            } else {
              bool = isNextFrameValid((ByteBuffer)invalidAudioFrameException);
              bool1 = bool;
              if (bool) {
                setFileSize(paramArrayOfbyte.length);
                setMp3StartByte(l);
                setTimePerFrame();
                setNumberOfFrames();
                setTrackLength();
                setBitRate();
                setEncoder();
                return;
              } 
              invalidAudioFrameException.position(invalidAudioFrameException.position() + 1);
              long l2 = l + 1L;
              l = l2;
              bool = bool1;
            } 
          } catch (InvalidAudioFrameException invalidAudioFrameException1) {
            bool1 = true;
            invalidAudioFrameException.position(invalidAudioFrameException.position() + 1);
            long l2 = l + 1L;
            l = l2;
            bool = bool1;
          } 
          setFileSize(paramArrayOfbyte.length);
          setMp3StartByte(l);
          setTimePerFrame();
          setNumberOfFrames();
          setTrackLength();
          setBitRate();
          setEncoder();
          return;
        } catch (InvalidAudioFrameException invalidAudioFrameException1) {
          bool1 = bool;
        }  
      invalidAudioFrameException.position(invalidAudioFrameException.position() + 1);
      long l1 = l + 1L;
      l = l1;
    } 
  }
  
  private boolean isNextFrameValid(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.position();
    paramByteBuffer.position(this.mp3FrameHeader.getFrameLength() + j);
    boolean bool = MPEGFrameHeader.isMPEGFrame(paramByteBuffer);
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool)
      try {
        MPEGFrameHeader.parseMPEGHeader(paramByteBuffer);
        MP3AudioHeader.logger.finer("Check next frame confirms is an audio header ");
        bool1 = true;
      } catch (InvalidAudioFrameException invalidAudioFrameException) {
        MP3AudioHeader.logger.finer("Check next frame has identified this is not an audio header");
        bool1 = bool2;
      }  
    paramByteBuffer.position(i);
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\ByteArrayMP3AudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */