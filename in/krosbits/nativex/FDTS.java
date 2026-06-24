package in.krosbits.nativex;

import android.content.ContentResolver;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import d12;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import lw0;
import s4;
import ui0;

public class FDTS {
  public final Uri a;
  
  public final Context b;
  
  public final ContentResolver c;
  
  public int d;
  
  public int e;
  
  public ParcelFileDescriptor f;
  
  public int g = 0;
  
  public FileChannel h;
  
  public InputStream i;
  
  public long j;
  
  public long k;
  
  public boolean l;
  
  public long l_Hps;
  
  public long l_Tps;
  
  public long m = -1L;
  
  public long n = -1L;
  
  public int n_sISoF;
  
  public boolean nte0F;
  
  public s4 o;
  
  public String oCont;
  
  public String oEnc;
  
  public int obPS;
  
  public int ocC;
  
  public long odUs;
  
  public int osR;
  
  public long p = 200L;
  
  public boolean sKBl;
  
  public FDTS(Context paramContext, Uri paramUri) {
    try {
      Object object = NativeLibx.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      while (true) {
        try {
          boolean bool = NativeLibx.b;
          if (!bool) {
            try {
              NativeLibx.a.wait();
            } catch (InterruptedException interruptedException) {
              interruptedException.printStackTrace();
            } 
            continue;
          } 
        } finally {
          Exception exception;
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        break;
      } 
    } finally {
      Exception exception = null;
    } 
    Uri uri = paramUri;
    if (lw0.N(paramUri))
      uri = lw0.M(paramUri); 
    this.a = uri;
    this.b = paramContext;
    this.c = paramContext.getContentResolver();
  }
  
  private synchronized native int ntFPDt(long paramLong, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
  
  private synchronized native void ntSkTUs(long paramLong1, long paramLong2, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3);
  
  private synchronized native void tg_CA(long paramLong);
  
  private synchronized native long tg_PR(int paramInt1, int paramInt2);
  
  private synchronized native float[] tg_clr(long paramLong);
  
  private native void tg_cn_clr(long paramLong);
  
  private synchronized native byte[] tg_empc(long paramLong);
  
  private synchronized native String[] tg_rv(long paramLong, String[] paramArrayOfString);
  
  private synchronized native String tg_rv8(long paramLong, String paramString);
  
  public final void a() {
    /* monitor enter ThisExpression{ObjectType{in/krosbits/nativex/FDTS}} */
    try {
      if (this.j != 0L) {
        StringBuilder stringBuilder = new StringBuilder();
        this("J_FDts ca: npr_dc1=");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.a);
        ui0.G(stringBuilder.toString());
        ntRDTS(this.j);
        stringBuilder = new StringBuilder();
        this("J_FDts ca: npr_dc2=");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.a);
        ui0.G(stringBuilder.toString());
        this.j = 0L;
      } 
    } finally {
      Exception exception;
    } 
    s4 s41 = this.o;
    if (s41 != null) {
      MediaCodec mediaCodec = s41.d;
      if (mediaCodec != null)
        mediaCodec.release(); 
      MediaExtractor mediaExtractor = s41.c;
      if (mediaExtractor != null)
        mediaExtractor.release(); 
    } 
    long l = this.k;
    if (l != 0L) {
      tg_CA(l);
      this.k = 0L;
    } 
    FileChannel fileChannel = this.h;
    if (fileChannel != null)
      try {
        fileChannel.close();
      } finally {
        fileChannel = null;
      }  
    InputStream inputStream = this.i;
    if (inputStream != null)
      try {
        inputStream.close();
      } finally {
        inputStream = null;
      }  
    ParcelFileDescriptor parcelFileDescriptor = this.f;
    if (parcelFileDescriptor != null)
      try {
        parcelFileDescriptor.close();
      } finally {
        parcelFileDescriptor = null;
      }  
    /* monitor exit ThisExpression{ObjectType{in/krosbits/nativex/FDTS}} */
  }
  
  public final int b(ByteBuffer paramByteBuffer) {
    FDTS fDTS1;
    FDTS fDTS2;
    /* monitor enter ThisExpression{ObjectType{in/krosbits/nativex/FDTS}} */
    try {
      if (paramByteBuffer.remaining() > 0 && !this.nte0F) {
        long l = this.j;
        if (l != 0L) {
          int i = paramByteBuffer.position();
          int j = paramByteBuffer.limit();
          fDTS2 = this;
          FDTS fDTS = fDTS2;
          try {
            return i;
          } finally {
            paramByteBuffer = null;
          } 
        } else {
          return 0;
        } 
      } else {
        return 0;
      } 
    } finally {
      paramByteBuffer = null;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{in/krosbits/nativex/FDTS}, name=null} */
    throw paramByteBuffer;
  }
  
  public final boolean c(long paramLong, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, boolean paramBoolean3, int paramInt2, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: aload_0
    //   5: getfield g : I
    //   8: aload_0
    //   9: getfield n : J
    //   12: lload_1
    //   13: iload_3
    //   14: iload #4
    //   16: iload #5
    //   18: fload #6
    //   20: fload #7
    //   22: iload #8
    //   24: iload #9
    //   26: aload #10
    //   28: aload #11
    //   30: aload #12
    //   32: invokevirtual ntIDTS : (IJJIZZFFZI[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)J
    //   35: putfield j : J
    //   38: goto -> 48
    //   41: astore #10
    //   43: aload #10
    //   45: invokevirtual printStackTrace : ()V
    //   48: aload_0
    //   49: getfield j : J
    //   52: lstore_1
    //   53: lload_1
    //   54: lconst_0
    //   55: lcmp
    //   56: ifeq -> 65
    //   59: iconst_1
    //   60: istore #4
    //   62: goto -> 68
    //   65: iconst_0
    //   66: istore #4
    //   68: aload_0
    //   69: monitorexit
    //   70: iload #4
    //   72: ireturn
    //   73: astore #10
    //   75: aload_0
    //   76: monitorexit
    //   77: aload #10
    //   79: athrow
    // Exception table:
    //   from	to	target	type
    //   2	38	41	finally
    //   43	48	73	finally
    //   48	53	73	finally
    //   75	77	73	finally
  }
  
  public final boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield l : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne -> 143
    //   11: aload_0
    //   12: aload_0
    //   13: getfield c : Landroid/content/ContentResolver;
    //   16: aload_0
    //   17: getfield a : Landroid/net/Uri;
    //   20: getstatic android/window/ldG/XUaAMlaMSa.nVJVzwarXIgysC : Ljava/lang/String;
    //   23: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   26: putfield f : Landroid/os/ParcelFileDescriptor;
    //   29: new java/io/FileInputStream
    //   32: astore_3
    //   33: aload_3
    //   34: aload_0
    //   35: getfield f : Landroid/os/ParcelFileDescriptor;
    //   38: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   41: invokespecial <init> : (Ljava/io/FileDescriptor;)V
    //   44: aload_0
    //   45: aload_3
    //   46: putfield i : Ljava/io/InputStream;
    //   49: aload_3
    //   50: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   53: astore_3
    //   54: aload_0
    //   55: aload_3
    //   56: putfield h : Ljava/nio/channels/FileChannel;
    //   59: aload_0
    //   60: aload_3
    //   61: invokevirtual position : ()J
    //   64: putfield m : J
    //   67: aload_0
    //   68: aload_0
    //   69: getfield h : Ljava/nio/channels/FileChannel;
    //   72: invokevirtual size : ()J
    //   75: putfield n : J
    //   78: aload_0
    //   79: getfield f : Landroid/os/ParcelFileDescriptor;
    //   82: invokevirtual getFd : ()I
    //   85: istore_1
    //   86: aload_0
    //   87: iload_1
    //   88: putfield g : I
    //   91: iload_1
    //   92: ifeq -> 143
    //   95: aload_0
    //   96: getfield h : Ljava/nio/channels/FileChannel;
    //   99: invokevirtual close : ()V
    //   102: aload_0
    //   103: iconst_1
    //   104: putfield l : Z
    //   107: goto -> 143
    //   110: astore_3
    //   111: aload_3
    //   112: invokevirtual printStackTrace : ()V
    //   115: aload_0
    //   116: getfield f : Landroid/os/ParcelFileDescriptor;
    //   119: astore_3
    //   120: aload_3
    //   121: ifnull -> 143
    //   124: aload_3
    //   125: invokevirtual close : ()V
    //   128: goto -> 143
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual printStackTrace : ()V
    //   136: goto -> 143
    //   139: astore_3
    //   140: goto -> 356
    //   143: aload_0
    //   144: getfield l : Z
    //   147: istore_2
    //   148: iload_2
    //   149: ifne -> 318
    //   152: aload_0
    //   153: aload_0
    //   154: getfield c : Landroid/content/ContentResolver;
    //   157: aload_0
    //   158: getfield a : Landroid/net/Uri;
    //   161: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   164: putfield i : Ljava/io/InputStream;
    //   167: aload_0
    //   168: lconst_0
    //   169: putfield m : J
    //   172: aconst_null
    //   173: astore_3
    //   174: aload_0
    //   175: getfield c : Landroid/content/ContentResolver;
    //   178: aload_0
    //   179: getfield a : Landroid/net/Uri;
    //   182: iconst_1
    //   183: anewarray java/lang/String
    //   186: dup
    //   187: iconst_0
    //   188: ldc_w '_size'
    //   191: aastore
    //   192: aconst_null
    //   193: aconst_null
    //   194: aconst_null
    //   195: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   198: astore #4
    //   200: aload #4
    //   202: astore_3
    //   203: aload #4
    //   205: astore #5
    //   207: aload #4
    //   209: invokeinterface moveToFirst : ()Z
    //   214: ifeq -> 262
    //   217: aload #4
    //   219: astore_3
    //   220: aload #4
    //   222: astore #5
    //   224: aload #4
    //   226: iconst_0
    //   227: invokeinterface isNull : (I)Z
    //   232: ifne -> 262
    //   235: aload #4
    //   237: astore_3
    //   238: aload_0
    //   239: aload #4
    //   241: iconst_0
    //   242: invokeinterface getLong : (I)J
    //   247: putfield n : J
    //   250: aload #4
    //   252: astore #5
    //   254: goto -> 262
    //   257: astore #4
    //   259: goto -> 272
    //   262: aload #5
    //   264: invokeinterface close : ()V
    //   269: goto -> 287
    //   272: aload #4
    //   274: invokevirtual printStackTrace : ()V
    //   277: aload_3
    //   278: ifnull -> 287
    //   281: aload_3
    //   282: astore #5
    //   284: goto -> 262
    //   287: aload_0
    //   288: iconst_1
    //   289: putfield l : Z
    //   292: goto -> 318
    //   295: astore_3
    //   296: goto -> 314
    //   299: astore #4
    //   301: aload_3
    //   302: ifnull -> 311
    //   305: aload_3
    //   306: invokeinterface close : ()V
    //   311: aload #4
    //   313: athrow
    //   314: aload_3
    //   315: invokevirtual printStackTrace : ()V
    //   318: aload_0
    //   319: getfield n : J
    //   322: lconst_0
    //   323: lcmp
    //   324: ifle -> 332
    //   327: iconst_1
    //   328: istore_2
    //   329: goto -> 334
    //   332: iconst_0
    //   333: istore_2
    //   334: aload_0
    //   335: iload_2
    //   336: putfield sKBl : Z
    //   339: aload_0
    //   340: getfield l : Z
    //   343: istore_2
    //   344: iload_2
    //   345: ifeq -> 352
    //   348: aload_0
    //   349: monitorexit
    //   350: iconst_1
    //   351: ireturn
    //   352: aload_0
    //   353: monitorexit
    //   354: iconst_0
    //   355: ireturn
    //   356: aload_0
    //   357: monitorexit
    //   358: aload_3
    //   359: athrow
    //   360: astore_3
    //   361: goto -> 287
    //   364: astore_3
    //   365: goto -> 311
    // Exception table:
    //   from	to	target	type
    //   2	7	139	finally
    //   11	91	110	finally
    //   95	107	110	finally
    //   111	115	139	finally
    //   115	120	131	finally
    //   124	128	131	finally
    //   132	136	139	finally
    //   143	148	139	finally
    //   152	172	295	finally
    //   174	200	257	finally
    //   207	217	257	finally
    //   224	235	257	finally
    //   238	250	257	finally
    //   262	269	360	finally
    //   272	277	299	finally
    //   287	292	295	finally
    //   305	311	364	finally
    //   311	314	295	finally
    //   314	318	139	finally
    //   318	327	139	finally
    //   334	344	139	finally
    //   356	358	139	finally
  }
  
  public final boolean e(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: aload_0
    //   5: getfield g : I
    //   8: iload_1
    //   9: invokespecial tg_PR : (II)J
    //   12: putfield k : J
    //   15: goto -> 25
    //   18: astore #5
    //   20: aload #5
    //   22: invokevirtual printStackTrace : ()V
    //   25: aload_0
    //   26: getfield k : J
    //   29: lstore_3
    //   30: lload_3
    //   31: lconst_0
    //   32: lcmp
    //   33: ifeq -> 41
    //   36: iconst_1
    //   37: istore_2
    //   38: goto -> 43
    //   41: iconst_0
    //   42: istore_2
    //   43: aload_0
    //   44: monitorexit
    //   45: iload_2
    //   46: ireturn
    //   47: astore #5
    //   49: aload_0
    //   50: monitorexit
    //   51: aload #5
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	18	finally
    //   20	25	47	finally
    //   25	30	47	finally
    //   49	51	47	finally
  }
  
  public final void f(long paramLong, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3) {
    /* monitor enter ThisExpression{ObjectType{in/krosbits/nativex/FDTS}} */
    try {
      long l = this.j;
      if (l != 0L)
        ntSkTUs(l, paramLong, paramInt, paramArrayOfString1, paramArrayOfString2, paramArrayOfString3); 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{in/krosbits/nativex/FDTS}} */
  }
  
  public int fr1(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2;
    try {
      if (paramInt2 > paramArrayOfbyte.length)
        i = paramArrayOfbyte.length; 
      return paramInt1;
    } finally {
      paramArrayOfbyte = null;
      paramArrayOfbyte.printStackTrace();
    } 
  }
  
  public long fr2(long paramLong, int paramInt) {
    long l1;
    long l2 = this.n;
    if (l2 < 0L)
      return -1L; 
    if (paramInt == 65536)
      return l2; 
    if (paramInt == 1) {
      l1 = paramLong + this.m;
    } else {
      l1 = paramLong;
      if (paramInt == 2)
        l1 = l2 - paramLong; 
    } 
    if (l1 >= 0L && l1 <= l2) {
      paramLong = this.m;
      if (paramLong == l1)
        return paramLong; 
      FileChannel fileChannel = this.h;
      if (fileChannel != null) {
        fileChannel.position(l1);
        paramLong = this.h.position();
        this.m = paramLong;
        return paramLong;
      } 
      InputStream inputStream = this.i;
      if (inputStream != null) {
        if (l1 < paramLong)
          try {
            inputStream.close();
          } finally {} 
        paramLong = this.m;
        if (paramLong == l1)
          return paramLong; 
        paramInt = 0;
        while (paramInt < 3) {
          paramLong = l1 - this.m;
          if (paramLong > 0L) {
            paramLong = this.i.skip(paramLong);
            if (paramLong == 0L) {
              paramInt++;
            } else {
              paramInt = 0;
            } 
            this.m += paramLong;
          } 
        } 
        return this.m;
      } 
    } 
    return -1L;
  }
  
  public final float[] g() {
    return tg_clr(this.k);
  }
  
  public final void h() {
    tg_cn_clr(this.k);
  }
  
  public final byte[] i() {
    return tg_empc(this.k);
  }
  
  public final String j(String paramString) {
    return tg_rv8(this.k, paramString);
  }
  
  public final String[] k(String[] paramArrayOfString) {
    return tg_rv(this.k, paramArrayOfString);
  }
  
  public synchronized native long ntIDTS(int paramInt1, long paramLong1, long paramLong2, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, boolean paramBoolean3, int paramInt3, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3);
  
  public synchronized native void ntRDTS(long paramLong);
  
  public synchronized native void ntSCD(long paramLong, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3);
  
  public int nt_ams_fP(byte[] paramArrayOfbyte, long[] paramArrayOflong) {
    int i;
    s4 s41 = this.o;
    ByteBuffer byteBuffer = s41.k;
    Object object = null;
    if (byteBuffer != null) {
      int j = s41.b(byteBuffer, paramArrayOfbyte);
      if (s41.k.remaining() > 0) {
        i = j;
      } else {
        s41.k = null;
        int k = j;
      } 
    } else {
      boolean bool1 = false;
      boolean bool2 = bool1;
    } 
    if (i == 0)
      this.nte0F = this.o.i; 
    return i;
  }
  
  public void nt_ams_sk(long paramLong) {
    s4 s41 = this.o;
    s41.k = null;
    s41.d.flush();
    s41.c.seekTo(paramLong, 0);
  }
  
  public boolean nt_gAMS(int[] paramArrayOfint) {
    int i;
    MediaFormat mediaFormat;
    Context context = this.b;
    Uri uri = this.a;
    Object object = new Object();
    ((s4)object).b = false;
    ((s4)object).j = new MediaCodec.BufferInfo();
    ui0.G("AMS_J");
    MediaExtractor mediaExtractor2 = new MediaExtractor();
    ((s4)object).c = mediaExtractor2;
    try {
      mediaExtractor2.setDataSource(context, uri, null);
      i = 0;
      mediaExtractor2 = null;
      while (true) {
        if (i < ((s4)object).c.getTrackCount()) {
          mediaFormat = ((s4)object).c.getTrackFormat(i);
          String str = mediaFormat.getString("mime");
          ((s4)object).f = str;
          if (str != null && str.startsWith("audio/")) {
            ((s4)object).c.selectTrack(i);
            ((s4)object).e = mediaFormat.getLong("durationUs");
            i = 1;
            break;
          } 
          i++;
          continue;
        } 
        i = 0;
        break;
      } 
    } finally {}
    if (i != 0) {
      MediaCodec mediaCodec1 = MediaCodec.createDecoderByType(((s4)object).f);
      ((s4)object).d = mediaCodec1;
      mediaFormat.setInteger("pcm-encoding", 2);
      mediaCodec1.configure(mediaFormat, null, null, 0);
      mediaCodec1.start();
      mediaFormat = mediaCodec1.getOutputFormat();
      i = mediaFormat.getInteger("channel-count");
      ((s4)object).a = i;
      paramArrayOfint[0] = mediaFormat.getInteger("sample-rate");
      paramArrayOfint[1] = i;
      paramArrayOfint[2] = (int)((s4)object).e;
      ((s4)object).b = true;
      if (d12.a < 21) {
        ((s4)object).g = mediaCodec1.getInputBuffers();
        ((s4)object).h = mediaCodec1.getOutputBuffers();
      } 
    } 
    if (((s4)object).b) {
      this.o = (s4)object;
      return true;
    } 
    MediaCodec mediaCodec = ((s4)object).d;
    if (mediaCodec != null)
      mediaCodec.release(); 
    MediaExtractor mediaExtractor1 = ((s4)object).c;
    if (mediaExtractor1 != null)
      mediaExtractor1.release(); 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\nativex\FDTS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */