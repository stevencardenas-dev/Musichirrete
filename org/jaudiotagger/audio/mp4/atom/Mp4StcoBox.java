package org.jaudiotagger.audio.mp4.atom;

import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.Mp4AtomIdentifier;

public class Mp4StcoBox extends AbstractMp4Box {
  public static final int NO_OF_OFFSETS_LENGTH = 4;
  
  public static final int NO_OF_OFFSETS_POS = 4;
  
  public static final int OFFSET_LENGTH = 4;
  
  public static final int OTHER_FLAG_LENGTH = 3;
  
  public static final int OTHER_FLAG_POS = 1;
  
  public static final int VERSION_FLAG_LENGTH = 1;
  
  public static final int VERSION_FLAG_POS = 0;
  
  private int firstOffSet;
  
  private int noOfOffSets;
  
  public Mp4StcoBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.noOfOffSets = 0;
    this.header = paramMp4BoxHeader;
    ByteBuffer byteBuffer = paramByteBuffer.slice();
    this.dataBuffer = byteBuffer;
    byteBuffer.order(ByteOrder.BIG_ENDIAN);
    byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 4);
    this.noOfOffSets = this.dataBuffer.getInt();
    this.firstOffSet = this.dataBuffer.getInt();
  }
  
  public Mp4StcoBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer, int paramInt) {
    byte b = 0;
    this.noOfOffSets = 0;
    this.header = paramMp4BoxHeader;
    ByteBuffer byteBuffer = paramByteBuffer.slice();
    this.dataBuffer = byteBuffer;
    byteBuffer.position(byteBuffer.position() + 4);
    byteBuffer = this.dataBuffer;
    this.noOfOffSets = Utils.getIntBE(byteBuffer, byteBuffer.position(), this.dataBuffer.position() + 3);
    byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 4);
    while (b < this.noOfOffSets) {
      byteBuffer = this.dataBuffer;
      int i = Utils.getIntBE(byteBuffer, byteBuffer.position(), this.dataBuffer.position() + 3);
      this.dataBuffer.put(Utils.getSizeBEInt32(i + paramInt));
      b++;
    } 
  }
  
  public static void debugShowStcoInfo(RandomAccessFile paramRandomAccessFile) {
    getStco(paramRandomAccessFile).printAllOffsets();
  }
  
  public static Mp4StcoBox getStco(RandomAccessFile paramRandomAccessFile) {
    FileChannel fileChannel = paramRandomAccessFile.getChannel();
    Mp4BoxHeader mp4BoxHeader = Mp4BoxHeader.seekWithinLevel(fileChannel, Mp4AtomIdentifier.MOOV.getFieldName());
    if (mp4BoxHeader != null) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(mp4BoxHeader.getLength() - 8);
      fileChannel.read(byteBuffer);
      byteBuffer.rewind();
      Mp4BoxHeader mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.MVHD.getFieldName());
      if (mp4BoxHeader1 != null) {
        byteBuffer = byteBuffer.slice();
        int i = byteBuffer.position();
        byteBuffer.position(mp4BoxHeader1.getDataLength() + i);
        if (Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.TRAK.getFieldName()) != null) {
          if (Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.MDIA.getFieldName()) != null) {
            mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.MDHD.getFieldName());
            if (mp4BoxHeader1 != null) {
              i = byteBuffer.position();
              byteBuffer.position(mp4BoxHeader1.getDataLength() + i);
              if (Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.MINF.getFieldName()) != null) {
                mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.SMHD.getFieldName());
                if (mp4BoxHeader1 != null) {
                  i = byteBuffer.position();
                  byteBuffer.position(mp4BoxHeader1.getDataLength() + i);
                  if (Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.STBL.getFieldName()) != null) {
                    mp4BoxHeader1 = Mp4BoxHeader.seekWithinLevel(byteBuffer, Mp4AtomIdentifier.STCO.getFieldName());
                    if (mp4BoxHeader1 != null)
                      return new Mp4StcoBox(mp4BoxHeader1, byteBuffer); 
                    throw new CannotReadException("This file does not appear to be an audio file");
                  } 
                  throw new CannotReadException("This file does not appear to be an audio file");
                } 
                throw new CannotReadException("This file does not appear to be an audio file");
              } 
              throw new CannotReadException("This file does not appear to be an audio file");
            } 
            throw new CannotReadException("This file does not appear to be an audio file");
          } 
          throw new CannotReadException("This file does not appear to be an audio file");
        } 
        throw new CannotReadException("This file does not appear to be an audio file");
      } 
      throw new CannotReadException("This file does not appear to be an audio file");
    } 
    throw new CannotReadException("This file does not appear to be an audio file");
  }
  
  public void adjustOffsets(int paramInt) {
    this.dataBuffer.rewind();
    ByteBuffer byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 8);
    for (byte b = 0; b < this.noOfOffSets; b++) {
      int i = this.dataBuffer.getInt();
      byteBuffer = this.dataBuffer;
      byteBuffer.position(byteBuffer.position() - 4);
      this.dataBuffer.putInt(i + paramInt);
    } 
  }
  
  public int getFirstOffSet() {
    return this.firstOffSet;
  }
  
  public int getNoOfOffSets() {
    return this.noOfOffSets;
  }
  
  public void printAllOffsets() {
    System.out.println("Print Offsets:start");
    this.dataBuffer.rewind();
    this.dataBuffer.position(8);
    int i = 0;
    while (true) {
      int j = this.noOfOffSets;
      ByteBuffer byteBuffer = this.dataBuffer;
      if (i < j - 1) {
        j = byteBuffer.getInt();
        printStream = System.out;
        StringBuilder stringBuilder1 = new StringBuilder("offset into audio data is:");
        stringBuilder1.append(j);
        printStream.println(stringBuilder1.toString());
        i++;
        continue;
      } 
      i = printStream.getInt();
      PrintStream printStream = System.out;
      StringBuilder stringBuilder = new StringBuilder("offset into audio data is:");
      stringBuilder.append(i);
      printStream.println(stringBuilder.toString());
      System.out.println("Print Offsets:end");
      return;
    } 
  }
  
  public void printTotalOffset() {
    this.dataBuffer.rewind();
    this.dataBuffer.position(8);
    int j = 0;
    int i = 0;
    while (true) {
      int k = this.noOfOffSets;
      ByteBuffer byteBuffer = this.dataBuffer;
      if (j < k - 1) {
        i += Utils.getIntBE(byteBuffer, byteBuffer.position(), this.dataBuffer.position() + 3);
        byteBuffer = this.dataBuffer;
        byteBuffer.position(byteBuffer.position() + 4);
        j++;
        continue;
      } 
      j = Utils.getIntBE(byteBuffer, byteBuffer.position(), this.dataBuffer.position() + 3);
      PrintStream printStream = System.out;
      StringBuilder stringBuilder = new StringBuilder("Print Offset Total:");
      stringBuilder.append(j + i);
      printStream.println(stringBuilder.toString());
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4StcoBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */