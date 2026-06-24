package org.jaudiotagger.audio.dsf;

import c61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import k91;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.generic.AudioFileWriter2;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;

public class DsfFileWriter extends AudioFileWriter2 {
  public ByteBuffer convert(AbstractID3v2Tag paramAbstractID3v2Tag) {
    try {
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      this();
      long l2 = paramAbstractID3v2Tag.getSize();
      long l1 = l2;
      if (l2 > 0L) {
        l1 = l2;
        if (Utils.isOddLength(l2))
          l1 = l2 + 1L; 
      } 
      paramAbstractID3v2Tag.write(byteArrayOutputStream2, (int)l1);
      ByteArrayOutputStream byteArrayOutputStream1 = byteArrayOutputStream2;
      if (Utils.isOddLength((byteArrayOutputStream2.toByteArray()).length)) {
        int i = (byteArrayOutputStream2.toByteArray()).length;
        byteArrayOutputStream1 = new ByteArrayOutputStream();
        this();
        paramAbstractID3v2Tag.write(byteArrayOutputStream1, i + 1);
      } 
      ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayOutputStream1.toByteArray());
      byteBuffer.rewind();
      return byteBuffer;
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public void deleteTag(Tag paramTag, c61 paramc61) {
    try {
      FileChannel fileChannel = paramc61.b("wr");
      try {
        DsdChunk dsdChunk = DsdChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, DsdChunk.DSD_HEADER_LENGTH));
        if (dsdChunk != null && dsdChunk.getMetadataOffset() > 0L) {
          fileChannel.position(dsdChunk.getMetadataOffset());
          if (ID3Chunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, (int)(fileChannel.size() - fileChannel.position()))) != null) {
            fileChannel.truncate(dsdChunk.getMetadataOffset());
            dsdChunk.setMetadataOffset(0L);
            dsdChunk.setFileLength(fileChannel.size());
            fileChannel.position(0L);
            fileChannel.write(dsdChunk.write());
          } 
        } 
      } finally {
        Exception exception;
      } 
      if (fileChannel != null) {
        fileChannel.close();
        return;
      } 
    } catch (IOException iOException) {}
  }
  
  public void writeTag(Tag paramTag, c61 paramc61) {
    try {
      FileChannel fileChannel = paramc61.b("wr");
      try {
        DsdChunk dsdChunk = DsdChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, DsdChunk.DSD_HEADER_LENGTH));
        if (dsdChunk != null) {
          CannotWriteException cannotWriteException;
          StringBuilder stringBuilder;
          if (dsdChunk.getMetadataOffset() > 0L) {
            fileChannel.position(dsdChunk.getMetadataOffset());
            if (fileChannel.size() - fileChannel.position() >= DsfChunkType.ID3.getCode().length()) {
              if (ID3Chunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, (int)(fileChannel.size() - fileChannel.position()))) != null) {
                fileChannel.position(dsdChunk.getMetadataOffset());
                fileChannel.truncate(fileChannel.position());
                fileChannel.write(convert((AbstractID3v2Tag)paramTag));
                dsdChunk.setFileLength(fileChannel.size());
                fileChannel.position(0L);
                fileChannel.write(dsdChunk.write());
              } else {
                cannotWriteException = new CannotWriteException();
                stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(paramc61);
                stringBuilder.append("Could not find existing ID3v2 Tag (1)");
                this(stringBuilder.toString());
                throw cannotWriteException;
              } 
            } else {
              fileChannel.position(stringBuilder.getMetadataOffset());
              fileChannel.truncate(fileChannel.position());
              fileChannel.write(convert((AbstractID3v2Tag)cannotWriteException));
              stringBuilder.setFileLength(fileChannel.size());
              fileChannel.position(0L);
              fileChannel.write(stringBuilder.write());
            } 
          } else {
            fileChannel.position(fileChannel.size());
            stringBuilder.setMetadataOffset(fileChannel.size());
            fileChannel.write(convert((AbstractID3v2Tag)cannotWriteException));
            stringBuilder.setFileLength(fileChannel.size());
            fileChannel.position(0L);
            fileChannel.write(stringBuilder.write());
          } 
        } 
      } finally {}
      if (fileChannel != null)
        fileChannel.close(); 
      return;
    } catch (IOException iOException) {
      throw new CannotWriteException(iOException.getMessage());
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\DsfFileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */