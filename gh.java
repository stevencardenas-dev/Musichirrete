public abstract class gh {
  public int flags;
  
  public final void addFlag(int paramInt) {
    this.flags = paramInt | this.flags;
  }
  
  public void clear() {
    this.flags = 0;
  }
  
  public final void clearFlag(int paramInt) {
    this.flags = (paramInt ^ 0xFFFFFFFF) & this.flags;
  }
  
  public final int getAllFlagsAsInt() {
    return this.flags;
  }
  
  public final boolean getFlag(int paramInt) {
    return ((this.flags & paramInt) == paramInt);
  }
  
  public final boolean hasSupplementalData() {
    return getFlag(268435456);
  }
  
  public final boolean isDecodeOnly() {
    return getFlag(-2147483648);
  }
  
  public final boolean isEndOfStream() {
    return getFlag(4);
  }
  
  public final boolean isKeyFrame() {
    return getFlag(1);
  }
  
  public final void setFlags(int paramInt) {
    this.flags = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */