import in.krosbits.musicolet.MyApplication;

public final class aq0 {
  @vk1("srct")
  public final iq0 a;
  
  @vk1("srpf")
  public final iq0 b;
  
  @vk1("srfo")
  public final iq0 c;
  
  @vk1("aflmdt")
  public final Long d;
  
  @vk1("lclmdt")
  public final Long e;
  
  @vk1("clts")
  public final String f;
  
  @vk1("lfur")
  public final String g;
  
  @vk1("lfnm")
  public final String h;
  
  public aq0(iq0 paramiq01, iq0 paramiq02, iq0 paramiq03, Long paramLong1, Long paramLong2, String paramString1, String paramString2, String paramString3) {
    this.a = paramiq01;
    this.b = paramiq02;
    this.c = paramiq03;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramString3;
  }
  
  public final String a() {
    return this.f;
  }
  
  public final iq0 b() {
    return this.a;
  }
  
  public final iq0 c() {
    return this.c;
  }
  
  public final String d() {
    return this.h;
  }
  
  public final String e() {
    return this.g;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof aq0))
      return false; 
    paramObject = paramObject;
    return (this.a != ((aq0)paramObject).a) ? false : ((this.b != ((aq0)paramObject).b) ? false : ((this.c != ((aq0)paramObject).c) ? false : (!ui0.c(this.d, ((aq0)paramObject).d) ? false : (!ui0.c(this.e, ((aq0)paramObject).e) ? false : (!ui0.c(this.f, ((aq0)paramObject).f) ? false : (!ui0.c(this.g, ((aq0)paramObject).g) ? false : (!!ui0.c(this.h, ((aq0)paramObject).h))))))));
  }
  
  public final iq0 f() {
    return this.b;
  }
  
  public final boolean g(km0 paramkm0, iq0 paramiq0) {
    paramkm0.getClass();
    paramiq0.getClass();
    if (paramiq0 == this.b && this.a != null) {
      Long long_ = this.d;
      if (long_ != null) {
        long l = paramkm0.l;
        if (long_ != null && l == long_.longValue()) {
          iq0 iq01 = this.a;
          if (iq01 == iq0.c)
            return true; 
          if (iq01 == iq0.e && this.g != null && this.h != null)
            try {
              v00 v00 = v00.q(MyApplication.i.getApplicationContext(), this.g);
              long_ = this.e;
              if (v00 != null) {
                Long long_1 = Long.valueOf(v00.m());
              } else {
                v00 = null;
              } 
              return ui0.c(long_, v00);
            } finally {} 
        } 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    iq0 iq01 = this.a;
    int i3 = 0;
    if (iq01 == null) {
      i = 0;
    } else {
      i = iq01.hashCode();
    } 
    iq01 = this.b;
    if (iq01 == null) {
      j = 0;
    } else {
      j = iq01.hashCode();
    } 
    iq01 = this.c;
    if (iq01 == null) {
      k = 0;
    } else {
      k = iq01.hashCode();
    } 
    Long long_ = this.d;
    if (long_ == null) {
      m = 0;
    } else {
      m = long_.hashCode();
    } 
    long_ = this.e;
    if (long_ == null) {
      n = 0;
    } else {
      n = long_.hashCode();
    } 
    String str = this.f;
    if (str == null) {
      i1 = 0;
    } else {
      i1 = str.hashCode();
    } 
    str = this.g;
    if (str == null) {
      i2 = 0;
    } else {
      i2 = str.hashCode();
    } 
    str = this.h;
    if (str != null)
      i3 = str.hashCode(); 
    return ((((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3;
  }
  
  public final String toString() {
    iq0 iq02 = this.a;
    iq0 iq01 = this.b;
    iq0 iq03 = this.c;
    Long long_1 = this.d;
    Long long_2 = this.e;
    String str2 = this.f;
    String str1 = this.g;
    String str3 = this.h;
    StringBuilder stringBuilder = new StringBuilder("LyricsCacheInfo(currentSource=");
    stringBuilder.append(iq02);
    stringBuilder.append(", preferredSource=");
    stringBuilder.append(iq01);
    stringBuilder.append(", forcedSource=");
    stringBuilder.append(iq03);
    stringBuilder.append(", audioFileLastModifiedTimeMs=");
    stringBuilder.append(long_1);
    stringBuilder.append(", lrcFileLastModifiedTimeMs=");
    stringBuilder.append(long_2);
    stringBuilder.append(", cachedLyricsText=");
    stringBuilder.append(str2);
    stringBuilder.append(", lrcFileUri=");
    stringBuilder.append(str1);
    stringBuilder.append(", lrcFileName=");
    stringBuilder.append(str3);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */