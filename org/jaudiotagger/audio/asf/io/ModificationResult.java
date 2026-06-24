package org.jaudiotagger.audio.asf.io;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.jaudiotagger.audio.asf.data.GUID;

final class ModificationResult {
  static final boolean $assertionsDisabled = false;
  
  private final long byteDifference;
  
  private final int chunkDifference;
  
  private final Set<GUID> occuredGUIDs;
  
  public ModificationResult(int paramInt, long paramLong, Set<GUID> paramSet) {
    HashSet<GUID> hashSet = new HashSet();
    this.occuredGUIDs = hashSet;
    this.chunkDifference = paramInt;
    this.byteDifference = paramLong;
    hashSet.addAll(paramSet);
  }
  
  public ModificationResult(int paramInt, long paramLong, GUID... paramVarArgs) {
    HashSet<GUID> hashSet = new HashSet();
    this.occuredGUIDs = hashSet;
    this.chunkDifference = paramInt;
    this.byteDifference = paramLong;
    hashSet.addAll(Arrays.asList(paramVarArgs));
  }
  
  public long getByteDifference() {
    return this.byteDifference;
  }
  
  public int getChunkCountDifference() {
    return this.chunkDifference;
  }
  
  public Set<GUID> getOccuredGUIDs() {
    return new HashSet<GUID>(this.occuredGUIDs);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ModificationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */