package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0;
import org.jaudiotagger.audio.asf.util.ChunkPositionComparator;
import org.jaudiotagger.audio.asf.util.Utils;

public class ChunkContainer extends Chunk {
  static final boolean $assertionsDisabled = false;
  
  private static final Set<GUID> MULTI_CHUNKS;
  
  private final Map<GUID, List<Chunk>> chunkTable = new Hashtable<GUID, List<Chunk>>();
  
  static {
    HashSet<GUID> hashSet = new HashSet();
    MULTI_CHUNKS = hashSet;
    hashSet.add(GUID.GUID_STREAM);
  }
  
  public ChunkContainer(GUID paramGUID, long paramLong, BigInteger paramBigInteger) {
    super(paramGUID, paramLong, paramBigInteger);
  }
  
  public static boolean chunkstartsUnique(ChunkContainer paramChunkContainer) {
    HashSet<Long> hashSet = new HashSet();
    Iterator<Chunk> iterator = paramChunkContainer.getChunks().iterator();
    boolean bool;
    for (bool = true; iterator.hasNext(); bool &= hashSet.add(Long.valueOf(((Chunk)iterator.next()).getPosition())));
    return bool;
  }
  
  public void addChunk(Chunk paramChunk) {
    List<Chunk> list = assertChunkList(paramChunk.getGuid());
    if (list.isEmpty() || MULTI_CHUNKS.contains(paramChunk.getGuid())) {
      list.add(paramChunk);
      return;
    } 
    l0.l("The GUID of the given chunk indicates, that there is no more instance allowed.");
  }
  
  public List<Chunk> assertChunkList(GUID paramGUID) {
    List<Chunk> list2 = this.chunkTable.get(paramGUID);
    List<Chunk> list1 = list2;
    if (list2 == null) {
      list1 = new ArrayList();
      this.chunkTable.put(paramGUID, list1);
    } 
    return list1;
  }
  
  public Collection<Chunk> getChunks() {
    ArrayList<Chunk> arrayList = new ArrayList();
    Iterator<List> iterator = this.chunkTable.values().iterator();
    while (iterator.hasNext())
      arrayList.addAll(iterator.next()); 
    return arrayList;
  }
  
  public Chunk getFirst(GUID paramGUID, Class<? extends Chunk> paramClass) {
    List<Chunk> list = this.chunkTable.get(paramGUID);
    if (list != null && !list.isEmpty()) {
      Chunk chunk = list.get(0);
      if (paramClass.isAssignableFrom(chunk.getClass()))
        return chunk; 
    } 
    return null;
  }
  
  public boolean hasChunkByGUID(GUID paramGUID) {
    return this.chunkTable.containsKey(paramGUID);
  }
  
  public String prettyPrint(String paramString) {
    return prettyPrint(paramString, "");
  }
  
  public String prettyPrint(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString1));
    stringBuilder.append(paramString2);
    stringBuilder.append(paramString1);
    stringBuilder.append("  |");
    stringBuilder.append(Utils.LINE_SEPARATOR);
    ArrayList<Chunk> arrayList = new ArrayList<Chunk>(getChunks());
    Collections.sort(arrayList, (Comparator<? super Chunk>)new ChunkPositionComparator());
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      Chunk chunk = (Chunk)arrayList.get(b);
      b++;
      chunk = chunk;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString1);
      stringBuilder1.append("  |");
      stringBuilder.append(chunk.prettyPrint(stringBuilder1.toString()));
      stringBuilder.append(paramString1);
      stringBuilder.append("  |");
      stringBuilder.append(Utils.LINE_SEPARATOR);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\ChunkContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */