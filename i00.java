import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;

public final class i00 {
  public final h00 a;
  
  static {
    new i00(tlzLOCPTHRhep.AmRqnZyXXKzAcC, 0, 0);
  }
  
  public i00(String paramString, int paramInt1, int paramInt2) {
    this.a = new h00(paramString, paramInt1, paramInt2);
  }
  
  public static i00 a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    String str;
    if (paramBoolean) {
      paramInt3 = paramInt1 / 2;
      paramInt4 = paramInt2 / 2;
      StringBuilder stringBuilder = new StringBuilder("M0,");
      stringBuilder.append(paramInt4);
      stringBuilder.append(" A");
      stringBuilder.append(paramInt3);
      stringBuilder.append(",");
      stringBuilder.append(paramInt4);
      stringBuilder.append(" 0 1,1 ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(",");
      stringBuilder.append(paramInt4);
      stringBuilder.append(" A");
      stringBuilder.append(paramInt3);
      stringBuilder.append(",");
      stringBuilder.append(paramInt4);
      stringBuilder.append(" 0 1,1 0,");
      stringBuilder.append(paramInt4);
      stringBuilder.append(" Z");
      str = stringBuilder.toString();
    } else {
      StringBuilder stringBuilder = new StringBuilder("M ");
      int i = Math.min(paramInt1 / 2, paramInt2 / 2);
      paramInt3 = Math.min(i, paramInt3);
      paramInt4 = Math.min(i, paramInt4);
      paramInt5 = Math.min(i, paramInt5);
      paramInt6 = Math.min(i, paramInt6);
      stringBuilder.append(paramInt3);
      stringBuilder.append(ckOPp.xvDaDZXZH);
      stringBuilder.append(paramInt1 - paramInt4);
      str = hbrAVtEa.cgQygNn;
      stringBuilder.append(str);
      if (paramInt4 > 0) {
        stringBuilder.append(" A ");
        stringBuilder.append(paramInt4);
        stringBuilder.append(",");
        stringBuilder.append(paramInt4);
        stringBuilder.append(" 0 0,1 ");
        stringBuilder.append(paramInt1);
        stringBuilder.append(",");
        stringBuilder.append(paramInt4);
      } 
      stringBuilder.append(" L ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(",");
      stringBuilder.append(paramInt2 - paramInt5);
      if (paramInt5 > 0) {
        stringBuilder.append(" A ");
        stringBuilder.append(paramInt5);
        stringBuilder.append(",");
        stringBuilder.append(paramInt5);
        stringBuilder.append(" 0 0,1 ");
        stringBuilder.append(paramInt1 - paramInt5);
        stringBuilder.append(",");
        stringBuilder.append(paramInt2);
      } 
      stringBuilder.append(" L ");
      stringBuilder.append(paramInt6);
      stringBuilder.append(",");
      stringBuilder.append(paramInt2);
      if (paramInt6 > 0) {
        stringBuilder.append(" A ");
        stringBuilder.append(paramInt6);
        stringBuilder.append(",");
        stringBuilder.append(paramInt6);
        stringBuilder.append(" 0 0,1 0,");
        stringBuilder.append(paramInt2 - paramInt6);
      } 
      if (paramInt3 > 0) {
        stringBuilder.append(" L 0,");
        stringBuilder.append(paramInt3);
        stringBuilder.append(" A ");
        stringBuilder.append(paramInt3);
        stringBuilder.append(",");
        stringBuilder.append(paramInt3);
        stringBuilder.append(" 0 0,1 ");
        stringBuilder.append(paramInt3);
        stringBuilder.append(str);
      } 
      stringBuilder.append(" Z");
      str = stringBuilder.toString();
    } 
    return new i00(str, paramInt1, paramInt2);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof i00))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((i00)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    return this.a.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */