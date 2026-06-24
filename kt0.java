import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r3.IKWi.AyxAR;

public final class kt0 extends f0 {
  public static final Parcelable.Creator<kt0> CREATOR;
  
  public static final String[] f = new String[] { "none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long" };
  
  public static final p01 g;
  
  public final List b;
  
  public final Bundle c;
  
  public int e;
  
  static {
    CREATOR = new yb2(16);
    p01 p011 = new p01();
    p011.v(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
    p011.v(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
    p011.v(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
    p011.v(1, "com.google.android.gms.cast.metadata.TITLE", "title");
    p011.v(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
    p011.v(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
    p011.v(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
    p011.v(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
    p011.v(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
    p011.v(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
    p011.v(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
    p011.v(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
    p011.v(2, OETETTfAjV.vViKVBPhbb, "episode");
    p011.v(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
    p011.v(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
    p011.v(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
    p011.v(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
    p011.v(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
    p011.v(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
    p011.v(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
    p011.v(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
    p011.v(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
    p011.v(5, CKYHNesT.nZrOjVPPXzEntYS, "sectionStartAbsoluteTime");
    p011.v(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
    p011.v(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
    p011.v(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
    p011.v(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
    p011.v(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
    g = p011;
  }
  
  public kt0(int paramInt) {
    this(new ArrayList(), new Bundle(), paramInt);
  }
  
  public kt0(ArrayList paramArrayList, Bundle paramBundle, int paramInt) {
    this.b = paramArrayList;
    this.c = paramBundle;
    this.e = paramInt;
  }
  
  public static void e(String paramString, int paramInt) {
    if (!TextUtils.isEmpty(paramString)) {
      int i;
      Integer integer = (Integer)((HashMap)g.f).get(paramString);
      if (integer != null) {
        i = integer.intValue();
      } else {
        i = 0;
      } 
      if (i == paramInt || i == 0)
        return; 
      String str = f[paramInt];
      StringBuilder stringBuilder = new StringBuilder(paramString.length() + 21 + String.valueOf(str).length());
      stringBuilder.append("Value for ");
      stringBuilder.append(paramString);
      stringBuilder.append(" must be a ");
      stringBuilder.append(str);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    l0.l("null and empty keys are not allowed");
  }
  
  public static boolean j(Bundle paramBundle1, Bundle paramBundle2) {
    if (paramBundle1.size() != paramBundle2.size())
      return false; 
    for (String str : paramBundle1.keySet()) {
      Object object2 = paramBundle1.get(str);
      Object object1 = paramBundle2.get(str);
      if (object2 instanceof Bundle && object1 instanceof Bundle && !j((Bundle)object2, (Bundle)object1))
        continue; 
      if (object2 == null) {
        if (object1 == null) {
          if (!paramBundle2.containsKey(str))
            continue; 
          continue;
        } 
        continue;
      } 
      if (!object2.equals(object1))
        continue; 
    } 
    return true;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof kt0) {
      paramObject = paramObject;
      if (j(this.c, ((kt0)paramObject).c) && this.b.equals(((kt0)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final JSONObject f() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("metadataType", this.e);
    } catch (JSONException jSONException) {}
    JSONArray jSONArray = xb2.b(this.b);
    if (jSONArray.length() != 0)
      try {
        jSONObject.put("images", jSONArray);
      } catch (JSONException jSONException) {} 
    ArrayList<? super String> arrayList = new ArrayList();
    int i = this.e;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE" }); 
            } else {
              Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
            } 
          } else {
            Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", FgdLmmRfTxSFKI.ZKbod, "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          } 
        } else {
          Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        } 
      } else {
        Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
      } 
    } else {
      Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.TITLE", fXMDNeMWaILNVh.qOON, "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
    } 
    Collections.addAll(arrayList, new String[] { "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID" });
    try {
      int j = arrayList.size();
      i = 0;
      while (true) {
        Pattern pattern;
        Bundle bundle = this.c;
        if (i < j) {
          String str1 = (String)arrayList.get(i);
          int k = i + 1;
          String str2 = str1;
          i = k;
          if (str2 != null) {
            i = k;
            if (bundle.containsKey(str2)) {
              p01 p011 = g;
              str1 = (String)((HashMap)p011.c).get(str2);
              i = k;
              if (str1 != null) {
                Integer integer = (Integer)((HashMap)p011.f).get(str2);
                if (integer != null) {
                  i = integer.intValue();
                } else {
                  i = 0;
                } 
                if (i != 1)
                  if (i != 2) {
                    if (i != 3) {
                      if (i != 4) {
                        if (i != 5) {
                          i = k;
                          continue;
                        } 
                        long l = bundle.getLong(str2);
                        pattern = qj.a;
                        jSONObject.put(str1, l / 1000.0D);
                        i = k;
                        continue;
                      } 
                    } else {
                      jSONObject.put(str1, pattern.getDouble(str2));
                      i = k;
                      continue;
                    } 
                  } else {
                    jSONObject.put(str1, pattern.getInt(str2));
                    i = k;
                    continue;
                  }  
                jSONObject.put(str1, pattern.getString(str2));
                i = k;
              } 
            } 
          } 
          continue;
        } 
        for (String str : pattern.keySet()) {
          if (!str.startsWith("com.google.")) {
            Object object = pattern.get(str);
            if (object instanceof String) {
              jSONObject.put(str, object);
              continue;
            } 
            if (object instanceof Integer) {
              jSONObject.put(str, object);
              continue;
            } 
            if (object instanceof Double)
              jSONObject.put(str, object); 
          } 
        } 
        return jSONObject;
      } 
    } catch (JSONException jSONException) {}
  }
  
  public final int hashCode() {
    int i = 17;
    Bundle bundle = this.c;
    int j = i;
    if (bundle != null) {
      Iterator<String> iterator = bundle.keySet().iterator();
      while (true) {
        j = i;
        if (iterator.hasNext()) {
          Object object = bundle.get(iterator.next());
          if (object != null) {
            j = object.hashCode();
          } else {
            j = 0;
          } 
          i = i * 31 + j;
          continue;
        } 
        break;
      } 
    } 
    return this.b.hashCode() + j * 31;
  }
  
  public final void i(JSONObject paramJSONObject) {
    Bundle bundle = this.c;
    bundle.clear();
    List<? super String> list = this.b;
    list.clear();
    this.e = 0;
    try {
      this.e = paramJSONObject.getInt("metadataType");
    } catch (JSONException jSONException) {}
    JSONArray jSONArray = paramJSONObject.optJSONArray("images");
    if (jSONArray != null)
      xb2.a(list, jSONArray); 
    list = new ArrayList();
    int i = this.e;
    String str = AyxAR.cJuQNzAMMQLq;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", ybWnIKHovcRr.RolNxUNVvPRuRAi, "com.google.android.gms.cast.metadata.SUBTITLE" }); 
            } else {
              Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
            } 
          } else {
            Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          } 
        } else {
          Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        } 
      } else {
        Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", str });
      } 
    } else {
      Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", str });
    } 
    Collections.addAll(list, new String[] { "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", kOkiWEITVb.XfIkl });
    HashSet<String> hashSet = new HashSet<String>((Collection)list);
    try {
      Iterator<String> iterator = paramJSONObject.keys();
      while (true) {
        if (iterator.hasNext()) {
          String str1 = iterator.next();
          if (str1 != null && !"metadataType".equals(str1)) {
            p01 p011 = g;
            String str2 = (String)((HashMap)p011.e).get(str1);
            if (str2 != null) {
              boolean bool = hashSet.contains(str2);
              if (bool)
                try {
                  Object object1 = paramJSONObject.get(str1);
                  if (object1 != null) {
                    Integer integer = (Integer)((HashMap)p011.f).get(str2);
                    if (integer != null) {
                      i = integer.intValue();
                    } else {
                      i = 0;
                    } 
                    if (i != 1) {
                      if (i != 2) {
                        if (i != 3) {
                          if (i != 4) {
                            if (i != 5)
                              continue; 
                            long l = paramJSONObject.optLong(str1);
                            Pattern pattern = qj.a;
                            bundle.putLong(str2, l * 1000L);
                            continue;
                          } 
                          if (object1 instanceof String) {
                            str1 = (String)object1;
                            if (xb2.c(str1) != null)
                              bundle.putString(str2, str1); 
                          } 
                          continue;
                        } 
                        double d = paramJSONObject.optDouble(str1);
                        if (!Double.isNaN(d))
                          bundle.putDouble(str2, d); 
                        continue;
                      } 
                      if (object1 instanceof Integer)
                        bundle.putInt(str2, ((Integer)object1).intValue()); 
                      continue;
                    } 
                    if (object1 instanceof String)
                      bundle.putString(str2, (String)object1); 
                  } 
                } catch (JSONException jSONException) {} 
              continue;
            } 
            Object object = paramJSONObject.get(str1);
            if (object instanceof String) {
              bundle.putString(str1, (String)object);
              continue;
            } 
            if (object instanceof Integer) {
              bundle.putInt(str1, ((Integer)object).intValue());
              continue;
            } 
            if (object instanceof Double)
              bundle.putDouble(str1, ((Double)object).doubleValue()); 
          } 
          continue;
        } 
        return;
      } 
    } catch (JSONException jSONException) {}
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.y0(paramParcel, 2, this.b);
    qv.p0(paramParcel, 3, this.c);
    int i = this.e;
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(i);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */