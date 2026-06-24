import com.google.android.gms.common.internal.Qg.nFLlOYeP;

public final class de1 {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public boolean f;
  
  public boolean g;
  
  public boolean h;
  
  public boolean i;
  
  public boolean j;
  
  public boolean k;
  
  public int l;
  
  public long m;
  
  public int n;
  
  public final void a(int paramInt) {
    if ((this.d & paramInt) != 0)
      return; 
    String str1 = Integer.toBinaryString(paramInt);
    String str2 = Integer.toBinaryString(this.d);
    StringBuilder stringBuilder = new StringBuilder("Layout state should be one of ");
    stringBuilder.append(str1);
    stringBuilder.append(" but it is ");
    stringBuilder.append(str2);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final int b() {
    return this.g ? (this.b - this.c) : this.e;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("State{mTargetPosition=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mData=null, mItemCount=");
    stringBuilder.append(this.e);
    stringBuilder.append(", mIsMeasuring=");
    stringBuilder.append(this.i);
    stringBuilder.append(", mPreviousLayoutItemCount=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
    stringBuilder.append(this.c);
    stringBuilder.append(", mStructureChanged=");
    stringBuilder.append(this.f);
    stringBuilder.append(nFLlOYeP.EriyUAChS);
    stringBuilder.append(this.g);
    stringBuilder.append(", mRunSimpleAnimations=");
    stringBuilder.append(this.j);
    stringBuilder.append(", mRunPredictiveAnimations=");
    stringBuilder.append(this.k);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\de1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */