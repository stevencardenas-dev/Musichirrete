package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.ChunkContainer;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

abstract class ChunkContainerReader<ChunkType extends ChunkContainer> implements ChunkReader {
  static final boolean $assertionsDisabled = false;
  
  protected static final Logger LOGGER;
  
  public static final int READ_LIMIT = 8192;
  
  protected final boolean eachChunkOnce;
  
  protected boolean hasFailingReaders = false;
  
  protected final Map<GUID, ChunkReader> readerMap = new HashMap<GUID, ChunkReader>();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotabgger.audio");
    LOGGER = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public ChunkContainerReader(List<Class<? extends ChunkReader>> paramList, boolean paramBoolean) {
    this.eachChunkOnce = paramBoolean;
    Iterator<Class<? extends ChunkReader>> iterator = paramList.iterator();
    while (iterator.hasNext())
      register((Class<ChunkReader>)iterator.next()); 
  }
  
  private <T extends ChunkReader> void register(Class<T> paramClass) {
    try {
      ChunkReader chunkReader = (ChunkReader)paramClass.newInstance();
      for (GUID gUID : chunkReader.getApplyingIds())
        this.readerMap.put(gUID, chunkReader); 
    } catch (InstantiationException instantiationException) {
      LOGGER.severe(instantiationException.getMessage());
    } catch (IllegalAccessException illegalAccessException) {
      LOGGER.severe(illegalAccessException.getMessage());
    } 
  }
  
  public void checkStream(InputStream paramInputStream) {
    if (this.hasFailingReaders && !paramInputStream.markSupported())
      l0.l("Stream has to support mark/reset."); 
  }
  
  public abstract ChunkType createContainer(long paramLong, BigInteger paramBigInteger, InputStream paramInputStream);
  
  public ChunkReader getReader(GUID paramGUID) {
    return this.readerMap.get(paramGUID);
  }
  
  public boolean isReaderAvailable(GUID paramGUID) {
    return this.readerMap.containsKey(paramGUID);
  }
  
  public ChunkType read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    checkStream(paramInputStream);
    paramInputStream = new CountingInputStream(paramInputStream);
    if (Arrays.<GUID>asList(getApplyingIds()).contains(paramGUID)) {
      ChunkType chunkType = createContainer(paramLong, Utils.readBig64(paramInputStream), paramInputStream);
      paramLong = paramLong + paramInputStream.getReadCount() + 16L;
      HashSet<GUID> hashSet = new HashSet();
      while (paramLong < chunkType.getChunkEnd()) {
        Chunk chunk;
        boolean bool;
        paramGUID = Utils.readGUID(paramInputStream);
        if (this.eachChunkOnce && (!isReaderAvailable(paramGUID) || !hashSet.add(paramGUID))) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool && isReaderAvailable(paramGUID)) {
          if (getReader(paramGUID).canFail())
            paramInputStream.mark(8192); 
          chunk = getReader(paramGUID).read(paramGUID, paramInputStream, paramLong);
        } else {
          chunk = ChunkHeaderReader.getInstance().read((GUID)chunk, paramInputStream, paramLong);
        } 
        if (chunk == null) {
          paramInputStream.reset();
          continue;
        } 
        if (!bool)
          chunkType.addChunk(chunk); 
        paramLong = chunk.getChunkEnd();
      } 
      return chunkType;
    } 
    l0.l("provided GUID is not supported by this reader.");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ChunkContainerReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */