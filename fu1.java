import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class fu1 extends f0 {
  public static final Parcelable.Creator<fu1> CREATOR = new yb2(26);
  
  public float b;
  
  public int c;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public String k;
  
  public int l;
  
  public int m;
  
  public String n;
  
  public JSONObject o;
  
  public fu1(float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, String paramString1, int paramInt8, int paramInt9, String paramString2) {
    this.b = paramFloat;
    this.c = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
    this.h = paramInt5;
    this.i = paramInt6;
    this.j = paramInt7;
    this.k = paramString1;
    this.l = paramInt8;
    this.m = paramInt9;
    this.n = paramString2;
    if (paramString2 != null)
      try {
        JSONObject jSONObject = new JSONObject();
        this(this.n);
        this.o = jSONObject;
        return;
      } catch (JSONException jSONException) {
        this.o = null;
        this.n = null;
        return;
      }  
    this.o = null;
  }
  
  public static final int f(String paramString) {
    if (paramString != null && paramString.length() == 9 && paramString.charAt(0) == '#')
      try {
        int i = Integer.parseInt(paramString.substring(1, 3), 16);
        int j = Integer.parseInt(paramString.substring(3, 5), 16);
        null = Integer.parseInt(paramString.substring(5, 7), 16);
        return Color.argb(Integer.parseInt(paramString.substring(7, 9), 16), i, j, null);
      } catch (NumberFormatException numberFormatException) {} 
    return 0;
  }
  
  public static final String i(int paramInt) {
    return String.format("#%02X%02X%02X%02X", new Object[] { Integer.valueOf(Color.red(paramInt)), Integer.valueOf(Color.green(paramInt)), Integer.valueOf(Color.blue(paramInt)), Integer.valueOf(Color.alpha(paramInt)) });
  }
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("fontScale", this.b);
      int i = this.c;
      if (i != 0)
        jSONObject.put("foregroundColor", i(i)); 
      i = this.e;
      if (i != 0)
        jSONObject.put("backgroundColor", i(i)); 
      i = this.f;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i == 4)
                jSONObject.put("edgeType", "DEPRESSED"); 
            } else {
              jSONObject.put("edgeType", ckOPp.kGHMBJGEDAK);
            } 
          } else {
            jSONObject.put("edgeType", "DROP_SHADOW");
          } 
        } else {
          jSONObject.put("edgeType", "OUTLINE");
        } 
      } else {
        jSONObject.put("edgeType", "NONE");
      } 
      i = this.g;
      if (i != 0)
        jSONObject.put("edgeColor", i(i)); 
      i = this.h;
      if (i != 0) {
        if (i != 1) {
          if (i == 2)
            jSONObject.put("windowType", ckOPp.hzjn); 
        } else {
          jSONObject.put("windowType", "NORMAL");
        } 
      } else {
        jSONObject.put("windowType", "NONE");
      } 
      i = this.i;
      if (i != 0)
        jSONObject.put("windowColor", i(i)); 
      if (this.h == 2)
        jSONObject.put("windowRoundedCornerRadius", this.j); 
      String str = this.k;
      if (str != null)
        jSONObject.put("fontFamily", str); 
      i = this.l;
      switch (i) {
        case 6:
          jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
          break;
        case 5:
          jSONObject.put("fontGenericFamily", "CURSIVE");
          break;
        case 4:
          jSONObject.put("fontGenericFamily", "CASUAL");
          break;
        case 3:
          jSONObject.put("fontGenericFamily", KjdXPYm.IxKDj);
          break;
        case 2:
          jSONObject.put("fontGenericFamily", "SERIF");
          break;
        case 1:
          jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
          break;
        case 0:
          jSONObject.put("fontGenericFamily", "SANS_SERIF");
          break;
      } 
      i = this.m;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3)
              jSONObject.put("fontStyle", "BOLD_ITALIC"); 
          } else {
            jSONObject.put("fontStyle", "ITALIC");
          } 
        } else {
          jSONObject.put("fontStyle", "BOLD");
        } 
      } else {
        jSONObject.put("fontStyle", "NORMAL");
      } 
      JSONObject jSONObject1 = this.o;
      if (jSONObject1 != null)
        jSONObject.put("customData", jSONObject1); 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    boolean bool1;
    boolean bool2;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof fu1))
      return false; 
    fu1 fu11 = (fu1)paramObject;
    paramObject = this.o;
    if (paramObject != null) {
      bool1 = false;
    } else {
      bool1 = true;
    } 
    JSONObject jSONObject = fu11.o;
    if (jSONObject != null) {
      bool2 = false;
    } else {
      bool2 = true;
    } 
    return (bool1 != bool2) ? false : ((paramObject != null && jSONObject != null && !vk0.a(paramObject, jSONObject)) ? false : ((this.b == fu11.b && this.c == fu11.c && this.e == fu11.e && this.f == fu11.f && this.g == fu11.g && this.h == fu11.h && this.i == fu11.i && this.j == fu11.j && qj.c(this.k, fu11.k) && this.l == fu11.l && this.m == fu11.m)));
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { 
          Float.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), this.k, Integer.valueOf(this.l), 
          Integer.valueOf(this.m), String.valueOf(this.o) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    String str;
    JSONObject jSONObject = this.o;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str = jSONObject.toString();
    } 
    this.n = str;
    paramInt = qv.D0(paramParcel, 20293);
    float f = this.b;
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeFloat(f);
    int i = this.c;
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(i);
    i = this.e;
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(i);
    i = this.f;
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(i);
    i = this.g;
    qv.C0(paramParcel, 6, 4);
    paramParcel.writeInt(i);
    i = this.h;
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(i);
    i = this.i;
    qv.C0(paramParcel, 8, 4);
    paramParcel.writeInt(i);
    i = this.j;
    qv.C0(paramParcel, 9, 4);
    paramParcel.writeInt(i);
    qv.v0(paramParcel, 10, this.k);
    i = this.l;
    qv.C0(paramParcel, 11, 4);
    paramParcel.writeInt(i);
    i = this.m;
    qv.C0(paramParcel, 12, 4);
    paramParcel.writeInt(i);
    qv.v0(paramParcel, 13, this.n);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */