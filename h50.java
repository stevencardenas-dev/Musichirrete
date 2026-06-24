import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MusicActivity;
import java.util.ArrayList;

public final class h50 extends p51 {
  public final lb0 b;
  
  public lb c = null;
  
  public final ArrayList d = new ArrayList();
  
  public final ArrayList e = new ArrayList();
  
  public ua0 f = null;
  
  public boolean g;
  
  public final int h;
  
  public final pc i;
  
  public h50(pc parampc, lb0 paramlb0, int paramInt) {
    this.b = paramlb0;
  }
  
  public final void a(int paramInt, Object paramObject) {
    // Byte code:
    //   0: aload_2
    //   1: checkcast ua0
    //   4: astore_3
    //   5: aload_0
    //   6: getfield c : Llb;
    //   9: astore #4
    //   11: aload_0
    //   12: getfield b : Llb0;
    //   15: astore_2
    //   16: aload #4
    //   18: ifnonnull -> 38
    //   21: aload_2
    //   22: invokevirtual getClass : ()Ljava/lang/Class;
    //   25: pop
    //   26: aload_0
    //   27: new lb
    //   30: dup
    //   31: aload_2
    //   32: invokespecial <init> : (Llb0;)V
    //   35: putfield c : Llb;
    //   38: aload_0
    //   39: getfield d : Ljava/util/ArrayList;
    //   42: astore #4
    //   44: aload #4
    //   46: invokevirtual size : ()I
    //   49: iload_1
    //   50: if_icmpgt -> 63
    //   53: aload #4
    //   55: aconst_null
    //   56: invokevirtual add : (Ljava/lang/Object;)Z
    //   59: pop
    //   60: goto -> 38
    //   63: aload_3
    //   64: invokevirtual Y : ()Z
    //   67: ifeq -> 170
    //   70: aload_2
    //   71: getfield c : Ln2;
    //   74: astore #5
    //   76: aload_3
    //   77: getfield h : Ljava/lang/String;
    //   80: astore #6
    //   82: aload #5
    //   84: getfield e : Ljava/lang/Object;
    //   87: checkcast java/util/HashMap
    //   90: aload #6
    //   92: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   95: checkcast sb0
    //   98: astore #6
    //   100: aload #6
    //   102: ifnull -> 149
    //   105: aload #6
    //   107: getfield c : Lua0;
    //   110: astore #5
    //   112: aload #5
    //   114: invokevirtual getClass : ()Ljava/lang/Class;
    //   117: pop
    //   118: aload #5
    //   120: aload_3
    //   121: if_acmpne -> 149
    //   124: aload #5
    //   126: getfield b : I
    //   129: iconst_m1
    //   130: if_icmple -> 170
    //   133: new ta0
    //   136: dup
    //   137: aload #6
    //   139: invokevirtual o : ()Landroid/os/Bundle;
    //   142: invokespecial <init> : (Landroid/os/Bundle;)V
    //   145: astore_2
    //   146: goto -> 172
    //   149: aload_2
    //   150: new java/lang/IllegalStateException
    //   153: dup
    //   154: ldc 'Fragment '
    //   156: aload_3
    //   157: ldc ' is not currently in the FragmentManager'
    //   159: invokestatic j : (Ljava/lang/String;Lua0;Ljava/lang/String;)Ljava/lang/String;
    //   162: invokespecial <init> : (Ljava/lang/String;)V
    //   165: invokevirtual i0 : (Ljava/lang/IllegalStateException;)V
    //   168: aconst_null
    //   169: athrow
    //   170: aconst_null
    //   171: astore_2
    //   172: aload #4
    //   174: iload_1
    //   175: aload_2
    //   176: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   179: pop
    //   180: aload_0
    //   181: getfield e : Ljava/util/ArrayList;
    //   184: iload_1
    //   185: aconst_null
    //   186: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: aload_0
    //   191: getfield c : Llb;
    //   194: aload_3
    //   195: invokevirtual j : (Lua0;)V
    //   198: aload_3
    //   199: aload_0
    //   200: getfield f : Lua0;
    //   203: if_acmpeq -> 207
    //   206: return
    //   207: aload_0
    //   208: aconst_null
    //   209: putfield f : Lua0;
    //   212: return
  }
  
  public final void b() {
    lb lb1 = this.c;
    if (lb1 != null) {
      if (!this.g)
        try {
          this.g = true;
        } finally {
          this.g = false;
        }  
      this.c = null;
    } 
  }
  
  public final int c() {
    ArrayList arrayList;
    int i = this.h;
    pc pc1 = this.i;
    switch (i) {
      default:
        arrayList = ((MusicActivity)pc1).R;
        if (arrayList != null) {
          i = arrayList.size();
        } else {
          i = 0;
        } 
        return i;
      case 0:
        break;
    } 
    return ((EqualizerActivity2)arrayList).Y.length;
  }
  
  public ua0 d(t32 paramt32, int paramInt) {
    ArrayList<ua0> arrayList1 = this.e;
    if (arrayList1.size() > paramInt) {
      ua0 ua02 = arrayList1.get(paramInt);
      if (ua02 != null)
        return ua02; 
    } 
    if (this.c == null) {
      lb0 lb01 = this.b;
      lb01.getClass();
      this.c = new lb(lb01);
    } 
    ua0 ua01 = h(paramInt);
    ArrayList<ta0> arrayList = this.d;
    if (arrayList.size() > paramInt) {
      ta0 ta0 = arrayList.get(paramInt);
      if (ta0 != null)
        if (ua01.w == null) {
          Bundle bundle = ta0.b;
          if (bundle == null)
            bundle = null; 
          ua01.c = bundle;
        } else {
          tp.f("Fragment already added");
          return null;
        }  
    } 
    while (arrayList1.size() <= paramInt)
      arrayList1.add(null); 
    if (ua01.H)
      ua01.H = false; 
    ua01.A0(false);
    arrayList1.set(paramInt, ua01);
    this.c.h(paramt32.getId(), ua01, null, 1);
    return ua01;
  }
  
  public void e(Parcelable paramParcelable, ClassLoader paramClassLoader) {
    switch (this.h) {
      default:
        i(paramParcelable, paramClassLoader);
        return;
      case 1:
        break;
    } 
    try {
      i(paramParcelable, paramClassLoader);
    } finally {
      paramParcelable = null;
    } 
  }
  
  public Bundle f() {
    ArrayList<ua0> arrayList1;
    ArrayList<ua0> arrayList2 = this.d;
    if (arrayList2.size() > 0) {
      arrayList1 = (ArrayList<ua0>)new Bundle();
      ta0[] arrayOfTa0 = new ta0[arrayList2.size()];
      arrayList2.toArray((Object[])arrayOfTa0);
      arrayList1.putParcelableArray("states", (Parcelable[])arrayOfTa0);
    } else {
      arrayList1 = null;
    } 
    byte b = 0;
    while (true) {
      Bundle bundle;
      arrayList2 = this.e;
      if (b < arrayList2.size()) {
        Bundle bundle1;
        ua0 ua01 = arrayList2.get(b);
        arrayList2 = arrayList1;
        if (ua01 != null) {
          arrayList2 = arrayList1;
          if (ua01.Y()) {
            arrayList2 = arrayList1;
            if (arrayList1 == null)
              bundle1 = new Bundle(); 
            String str = ga1.i("f", b);
            this.b.W(bundle1, str, ua01);
          } 
        } 
        b++;
        bundle = bundle1;
        continue;
      } 
      return bundle;
    } 
  }
  
  public final void g(t32 paramt32) {
    if (paramt32.getId() != -1)
      return; 
    m60.h(this, " requires a view id", "ViewPager with adapter ");
  }
  
  public final ua0 h(int paramInt) {
    gf0 gf0;
    r90 r90;
    int i = this.h;
    pc pc1 = this.i;
    switch (i) {
      default:
        null = (MusicActivity)pc1;
        switch (((Integer)null.R.get(paramInt)).intValue()) {
          default:
            return null;
          case 6:
            if (((MusicActivity)pc1).b0 == null) {
              wn wn = new wn();
              wn.J0 = 3;
              ((MusicActivity)pc1).b0 = wn;
            } 
            return ((MusicActivity)pc1).b0;
          case 5:
            if (((MusicActivity)pc1).e0 == null)
              ((MusicActivity)pc1).e0 = new l81(); 
            return ((MusicActivity)pc1).e0;
          case 4:
            if (((MusicActivity)pc1).a0 == null) {
              wn wn = new wn();
              wn.J0 = 2;
              ((MusicActivity)pc1).a0 = wn;
            } 
            return ((MusicActivity)pc1).a0;
          case 3:
            if (((MusicActivity)pc1).Z == null) {
              wn wn = new wn();
              wn.J0 = 1;
              ((MusicActivity)pc1).Z = wn;
            } 
            return ((MusicActivity)pc1).Z;
          case 2:
            if (((MusicActivity)pc1).v0) {
              if (((MusicActivity)pc1).g0 == null)
                ((MusicActivity)pc1).g0 = new gf0(); 
              gf0 = ((MusicActivity)pc1).g0;
            } else {
              if (((MusicActivity)gf0).c0 == null)
                ((MusicActivity)gf0).c0 = new r90(); 
              r90 = ((MusicActivity)gf0).c0;
            } 
            return r90;
          case 1:
            if (((MusicActivity)r90).d0 == null)
              ((MusicActivity)r90).d0 = new z71(); 
            return ((MusicActivity)r90).d0;
          case 0:
            break;
        } 
        if (((MusicActivity)r90).f0 == null)
          ((MusicActivity)r90).f0 = new lb1(); 
        return ((MusicActivity)r90).f0;
      case 0:
        break;
    } 
    return ((EqualizerActivity2)r90).Y[paramInt];
  }
  
  public final void i(Parcelable paramParcelable, ClassLoader paramClassLoader) {
    if (paramParcelable != null) {
      Bundle bundle = (Bundle)paramParcelable;
      bundle.setClassLoader(paramClassLoader);
      Parcelable[] arrayOfParcelable = bundle.getParcelableArray("states");
      ArrayList<ta0> arrayList1 = this.d;
      arrayList1.clear();
      ArrayList<ua0> arrayList = this.e;
      arrayList.clear();
      if (arrayOfParcelable != null)
        for (byte b = 0; b < arrayOfParcelable.length; b++)
          arrayList1.add((ta0)arrayOfParcelable[b]);  
      for (String str : bundle.keySet()) {
        if (str.startsWith("f")) {
          int i = Integer.parseInt(str.substring(1));
          ua0 ua01 = this.b.H(str, bundle);
          if (ua01 != null) {
            while (arrayList.size() <= i)
              arrayList.add(null); 
            if (ua01.H)
              ua01.H = false; 
            arrayList.set(i, ua01);
            continue;
          } 
          Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */