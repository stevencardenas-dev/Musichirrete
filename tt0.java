import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class tt0 extends f0 {
  public static final Parcelable.Creator<tt0> CREATOR = new yb2(18);
  
  public String b;
  
  public String c;
  
  public int e;
  
  public String f;
  
  public st0 g;
  
  public int h;
  
  public List i;
  
  public int j;
  
  public long k;
  
  public boolean l;
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      if (!TextUtils.isEmpty(this.b))
        jSONObject.put("id", this.b); 
      if (!TextUtils.isEmpty(this.c))
        jSONObject.put("entity", this.c); 
      int i = this.e;
      switch (i) {
        case 9:
          jSONObject.put("queueType", "MOVIE");
          break;
        case 8:
          jSONObject.put("queueType", "LIVE_TV");
          break;
        case 7:
          jSONObject.put("queueType", "VIDEO_PLAYLIST");
          break;
        case 6:
          jSONObject.put("queueType", "TV_SERIES");
          break;
        case 5:
          jSONObject.put("queueType", "PODCAST_SERIES");
          break;
        case 4:
          jSONObject.put("queueType", "RADIO_STATION");
          break;
        case 3:
          jSONObject.put("queueType", "AUDIOBOOK");
          break;
        case 2:
          jSONObject.put("queueType", "PLAYLIST");
          break;
        case 1:
          jSONObject.put("queueType", "ALBUM");
          break;
      } 
      if (!TextUtils.isEmpty(this.f))
        jSONObject.put("name", this.f); 
      st0 st01 = this.g;
      if (st01 != null)
        jSONObject.put("containerMetadata", st01.e()); 
      String str = n21.W(Integer.valueOf(this.h));
      if (str != null)
        jSONObject.put(fXMDNeMWaILNVh.pYrJLipaLUBfq, str); 
      List list = this.i;
      if (list != null && !list.isEmpty()) {
        JSONArray jSONArray = new JSONArray();
        this();
        Iterator<ut0> iterator = this.i.iterator();
        while (iterator.hasNext())
          jSONArray.put(((ut0)iterator.next()).f()); 
        jSONObject.put("items", jSONArray);
      } 
      jSONObject.put("startIndex", this.j);
      long l = this.k;
      if (l != -1L) {
        Pattern pattern = qj.a;
        jSONObject.put("startTime", l / 1000.0D);
      } 
      jSONObject.put("shuffle", this.l);
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof tt0))
      return false; 
    paramObject = paramObject;
    return (TextUtils.equals(this.b, ((tt0)paramObject).b) && TextUtils.equals(this.c, ((tt0)paramObject).c) && this.e == ((tt0)paramObject).e && TextUtils.equals(this.f, ((tt0)paramObject).f) && z51.g(this.g, ((tt0)paramObject).g) && this.h == ((tt0)paramObject).h && z51.g(this.i, ((tt0)paramObject).i) && this.j == ((tt0)paramObject).j && this.k == ((tt0)paramObject).k && this.l == ((tt0)paramObject).l);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, this.c, Integer.valueOf(this.e), this.f, this.g, Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Long.valueOf(this.k), Boolean.valueOf(this.l) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    int j = this.e;
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(j);
    qv.v0(paramParcel, 5, this.f);
    qv.u0(paramParcel, 6, this.g, paramInt);
    paramInt = this.h;
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(paramInt);
    List<?> list = this.i;
    if (list == null) {
      list = null;
    } else {
      list = Collections.unmodifiableList(list);
    } 
    qv.y0(paramParcel, 8, list);
    paramInt = this.j;
    qv.C0(paramParcel, 9, 4);
    paramParcel.writeInt(paramInt);
    long l = this.k;
    qv.C0(paramParcel, 10, 8);
    paramParcel.writeLong(l);
    boolean bool = this.l;
    qv.C0(paramParcel, 11, 4);
    paramParcel.writeInt(bool);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */