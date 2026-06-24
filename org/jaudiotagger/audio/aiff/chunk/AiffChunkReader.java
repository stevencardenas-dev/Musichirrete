package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import org.jaudiotagger.audio.iff.ChunkHeader;

public abstract class AiffChunkReader {
  public ByteBuffer readChunkDataIntoBuffer(FileChannel paramFileChannel, ChunkHeader paramChunkHeader) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)paramChunkHeader.getSize());
    byteBuffer.order(ByteOrder.BIG_ENDIAN);
    paramFileChannel.read(byteBuffer);
    byteBuffer.position(0);
    return byteBuffer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\AiffChunkReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */