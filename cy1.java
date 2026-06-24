import android.graphics.Bitmap;
import android.util.Size;
import in.krosbits.nativex.Cn;
import java.util.List;

public final class cy1 {
  public final km0 a;
  
  public final boolean b;
  
  public final List c;
  
  public final boolean d;
  
  public final float e;
  
  public final float f;
  
  public final float g;
  
  public final i51 h;
  
  public final float i;
  
  public final vj0 j;
  
  public final vj0 k;
  
  public final vj0 l;
  
  public final vj0 m;
  
  public final Cn n;
  
  public final cd1 o;
  
  public final List p;
  
  public final i51 q;
  
  public final CharSequence r;
  
  public final String s;
  
  public final Size t;
  
  public final Bitmap u;
  
  public cy1(km0 paramkm0, boolean paramBoolean1, List paramList1, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, i51 parami511, float paramFloat4, vj0 paramvj01, vj0 paramvj02, vj0 paramvj03, vj0 paramvj04, Cn paramCn, cd1 paramcd1, List paramList2, i51 parami512, CharSequence paramCharSequence, String paramString, Size paramSize, Bitmap paramBitmap) {
    this.a = paramkm0;
    this.b = paramBoolean1;
    this.c = paramList1;
    this.d = paramBoolean2;
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramFloat3;
    this.h = parami511;
    this.i = paramFloat4;
    this.j = paramvj01;
    this.k = paramvj02;
    this.l = paramvj03;
    this.m = paramvj04;
    this.n = paramCn;
    this.o = paramcd1;
    this.p = paramList2;
    this.q = parami512;
    this.r = paramCharSequence;
    this.s = paramString;
    this.t = paramSize;
    this.u = paramBitmap;
  }
  
  public static cy1 a(cy1 paramcy1, List paramList1, float paramFloat1, float paramFloat2, float paramFloat3, i51 parami511, float paramFloat4, bp1 parambp11, bp1 parambp12, bp1 parambp13, bp1 parambp14, Cn paramCn, cd1 paramcd1, List paramList2, i51 parami512, String paramString1, String paramString2, Size paramSize, Bitmap paramBitmap, int paramInt) {
    vj0 vj01;
    vj0 vj02;
    vj0 vj03;
    vj0 vj04;
    CharSequence charSequence;
    km0 km01 = paramcy1.a;
    boolean bool1 = paramcy1.b;
    if ((paramInt & 0x4) != 0)
      paramList1 = paramcy1.c; 
    boolean bool2 = paramcy1.d;
    if ((paramInt & 0x10) != 0)
      paramFloat1 = paramcy1.e; 
    if ((paramInt & 0x20) != 0)
      paramFloat2 = paramcy1.f; 
    if ((paramInt & 0x40) != 0)
      paramFloat3 = paramcy1.g; 
    if ((paramInt & 0x80) != 0)
      parami511 = paramcy1.h; 
    if ((paramInt & 0x100) != 0)
      paramFloat4 = paramcy1.i; 
    if ((paramInt & 0x200) != 0)
      vj01 = paramcy1.j; 
    if ((paramInt & 0x400) != 0)
      vj02 = paramcy1.k; 
    if ((paramInt & 0x800) != 0)
      vj03 = paramcy1.l; 
    if ((paramInt & 0x1000) != 0)
      vj04 = paramcy1.m; 
    if ((paramInt & 0x2000) != 0)
      paramCn = paramcy1.n; 
    if ((paramInt & 0x4000) != 0)
      paramcd1 = paramcy1.o; 
    if ((paramInt & 0x8000) != 0)
      paramList2 = paramcy1.p; 
    if ((paramInt & 0x10000) != 0)
      parami512 = paramcy1.q; 
    if ((paramInt & 0x20000) != 0)
      charSequence = paramcy1.r; 
    if ((paramInt & 0x40000) != 0)
      paramString2 = paramcy1.s; 
    if ((paramInt & 0x80000) != 0)
      paramSize = paramcy1.t; 
    if ((paramInt & 0x100000) != 0)
      paramBitmap = paramcy1.u; 
    paramcy1.getClass();
    km01.getClass();
    return new cy1(km01, bool1, paramList1, bool2, paramFloat1, paramFloat2, paramFloat3, parami511, paramFloat4, vj01, vj02, vj03, vj04, paramCn, paramcd1, paramList2, parami512, charSequence, paramString2, paramSize, paramBitmap);
  }
  
  public final i51 b() {
    return this.h;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (!(paramObject instanceof cy1))
        return false; 
      paramObject = paramObject;
      if (!ui0.c(this.a, ((cy1)paramObject).a) || this.b != ((cy1)paramObject).b || !this.c.equals(((cy1)paramObject).c) || this.d != ((cy1)paramObject).d || Float.compare(this.e, ((cy1)paramObject).e) != 0 || Float.compare(this.f, ((cy1)paramObject).f) != 0 || Float.compare(this.g, ((cy1)paramObject).g) != 0 || this.h != ((cy1)paramObject).h || Float.compare(this.i, ((cy1)paramObject).i) != 0 || !ui0.c(this.j, ((cy1)paramObject).j) || !ui0.c(this.k, ((cy1)paramObject).k) || !ui0.c(this.l, ((cy1)paramObject).l) || !ui0.c(this.m, ((cy1)paramObject).m) || !ui0.c(this.n, ((cy1)paramObject).n) || !ui0.c(this.o, ((cy1)paramObject).o) || !ui0.c(this.p, ((cy1)paramObject).p) || this.q != ((cy1)paramObject).q || !ui0.c(this.r, ((cy1)paramObject).r) || !ui0.c(this.s, ((cy1)paramObject).s) || !this.t.equals(((cy1)paramObject).t) || !ui0.c(this.u, ((cy1)paramObject).u))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i10 = this.a.hashCode();
    int i12 = Boolean.hashCode(this.b);
    int i11 = this.c.hashCode();
    int i13 = Boolean.hashCode(this.d);
    int i7 = Float.hashCode(this.e);
    int i14 = Float.hashCode(this.f);
    int i8 = Float.hashCode(this.g);
    int i15 = this.h.hashCode();
    int i9 = Float.hashCode(this.i);
    int i6 = 0;
    vj0 vj01 = this.j;
    if (vj01 == null) {
      i = 0;
    } else {
      i = vj01.hashCode();
    } 
    vj01 = this.k;
    if (vj01 == null) {
      j = 0;
    } else {
      j = vj01.hashCode();
    } 
    vj01 = this.l;
    if (vj01 == null) {
      k = 0;
    } else {
      k = vj01.hashCode();
    } 
    vj01 = this.m;
    if (vj01 == null) {
      m = 0;
    } else {
      m = vj01.hashCode();
    } 
    Cn cn = this.n;
    if (cn == null) {
      n = 0;
    } else {
      n = cn.hashCode();
    } 
    cd1 cd11 = this.o;
    if (cd11 == null) {
      i1 = 0;
    } else {
      i1 = cd11.hashCode();
    } 
    List list = this.p;
    if (list == null) {
      i2 = 0;
    } else {
      i2 = list.hashCode();
    } 
    i51 i511 = this.q;
    if (i511 == null) {
      i3 = 0;
    } else {
      i3 = i511.hashCode();
    } 
    CharSequence charSequence = this.r;
    if (charSequence == null) {
      i4 = 0;
    } else {
      i4 = charSequence.hashCode();
    } 
    charSequence = this.s;
    if (charSequence == null) {
      i5 = 0;
    } else {
      i5 = charSequence.hashCode();
    } 
    int i16 = this.t.hashCode();
    Bitmap bitmap = this.u;
    if (bitmap != null)
      i6 = bitmap.hashCode(); 
    return (i16 + (((((((((((i9 + (i15 + (i8 + (i14 + (i7 + (i13 + (i11 + (i12 + i10 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31) * 31 + i6;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("TrimData(songInfoWrapper=");
    stringBuilder.append(this.a);
    stringBuilder.append(", isRingtoneMode=");
    stringBuilder.append(this.b);
    stringBuilder.append(", selectedRangeValues=");
    stringBuilder.append(this.c);
    stringBuilder.append(", showHours=");
    stringBuilder.append(this.d);
    stringBuilder.append(", currentPosition=");
    stringBuilder.append(this.e);
    stringBuilder.append(", startIncrement=");
    stringBuilder.append(this.f);
    stringBuilder.append(", endIncrement=");
    stringBuilder.append(this.g);
    stringBuilder.append(", outputFormatEncoding=");
    stringBuilder.append(this.h);
    stringBuilder.append(", progress=");
    stringBuilder.append(this.i);
    stringBuilder.append(", convertingJob=");
    stringBuilder.append(this.j);
    stringBuilder.append(", preparingJob=");
    stringBuilder.append(this.k);
    stringBuilder.append(", generateNewWaveBitmapJob=");
    stringBuilder.append(this.l);
    stringBuilder.append(", finalSavingJob=");
    stringBuilder.append(this.m);
    stringBuilder.append(", converterObject=");
    stringBuilder.append(this.n);
    stringBuilder.append(", previewFileReady=");
    stringBuilder.append(this.o);
    stringBuilder.append(", previewFileRange=");
    stringBuilder.append(this.p);
    stringBuilder.append(", previewFileFormat=");
    stringBuilder.append(this.q);
    stringBuilder.append(", previewText=");
    stringBuilder.append(this.r);
    stringBuilder.append(", finalMessage=");
    stringBuilder.append(this.s);
    stringBuilder.append(", waveFormViewSize=");
    stringBuilder.append(this.t);
    stringBuilder.append(", waveFormBitmap=");
    stringBuilder.append(this.u);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */