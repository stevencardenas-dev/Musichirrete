package org.jaudiotagger.audio.iff;

import wf2;

public class ChunkSummary {
  private String chunkId;
  
  private long chunkSize;
  
  private long fileStartLocation;
  
  public ChunkSummary(String paramString, long paramLong1, long paramLong2) {
    this.chunkId = paramString;
    this.fileStartLocation = paramLong1;
    this.chunkSize = paramLong2;
  }
  
  public String getChunkId() {
    return this.chunkId;
  }
  
  public long getChunkSize() {
    return this.chunkSize;
  }
  
  public long getEndLocation() {
    return this.fileStartLocation + this.chunkSize + 8L;
  }
  
  public long getFileStartLocation() {
    return this.fileStartLocation;
  }
  
  public void setChunkId(String paramString) {
    this.chunkId = paramString;
  }
  
  public void setChunkSize(long paramLong) {
    this.chunkSize = paramLong;
  }
  
  public void setFileStartLocation(long paramLong) {
    this.fileStartLocation = paramLong;
  }
  
  public String toString() {
    long l1 = this.fileStartLocation;
    long l2 = this.chunkSize;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.chunkId);
    stringBuilder.append(":StartLocation:");
    stringBuilder.append(wf2.c(this.fileStartLocation));
    stringBuilder.append(":SizeIncHeader:");
    stringBuilder.append(this.chunkSize + 8L);
    stringBuilder.append(":EndLocation:");
    stringBuilder.append(wf2.c(l1 + l2 + 8L));
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\iff\ChunkSummary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */