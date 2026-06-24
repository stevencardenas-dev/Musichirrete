import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.a;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import in.krosbits.musicolet.MyApplication;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Mac;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.xmlpull.v1.XmlPullParser;
import r3.IKWi.AyxAR;

public abstract class dd1 {
  public static final Object b = new Object();
  
  public static final f1 c = new f1("REMOVED_TASK", 4);
  
  public static final f1 e = new f1("CLOSED_EMPTY", 4);
  
  public static final f1 f = new f1("NULL", 4);
  
  public static final f1 g = new f1("UNINITIALIZED", 4);
  
  public static final Object h = new Object();
  
  public static final u70 i;
  
  public static final u70[] j;
  
  public static WeakReference k;
  
  public static WeakReference l;
  
  public static km0 m;
  
  public static j52 n;
  
  public static SharedPreferences o;
  
  static {
    u70 u701 = new u70("CLIENT_TELEMETRY", -1, 1L, false);
    i = u701;
    j = new u70[] { u701 };
  }
  
  public static ei A(ci paramci) {
    Object object = new Object();
    ((bi)object).c = (hg1)new Object();
    ei ei = new ei((bi)object);
    ((bi)object).b = ei;
    ((bi)object).a = paramci.getClass();
    try {
      Object object1 = paramci.d((bi)object);
      if (object1 != null) {
        ((bi)object).a = object1;
        return ei;
      } 
    } catch (Exception exception) {}
    return ei;
  }
  
  public static Object A0(ad0 paramad0, Object paramObject, cs paramcs) {
    paramad0.getClass();
    os os = paramcs.e();
    if (os == b40.b) {
      paramcs = new pg1(paramcs);
    } else {
      paramcs = new ds(paramcs, os);
    } 
    qz1.d(2, paramad0);
    return paramad0.g(paramObject, paramcs);
  }
  
  public static Drawable B(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    Drawable drawable = ws2.I(paramContext, typedArray.getResourceId(0, 0));
    if (Q(paramContext))
      drawable.setTint(paramContext.getColor(2131100666)); 
    typedArray.recycle();
    return drawable;
  }
  
  public static Mac C(String paramString, Key paramKey) {
    try {
      Mac mac = Mac.getInstance(paramString);
      try {
        mac.init(paramKey);
        return mac;
      } catch (InvalidKeyException invalidKeyException) {
        throw new Exception("", invalidKeyException);
      } 
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new Exception("", noSuchAlgorithmException);
    } catch (NoSuchProviderException noSuchProviderException) {
      throw new Exception("", noSuchProviderException);
    } 
  }
  
  public static d7 D(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt) {
    if (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null) {
      TypedValue typedValue = new TypedValue();
      paramTypedArray.getValue(paramInt, typedValue);
      int i = typedValue.type;
      if (i >= 28 && i <= 31)
        return new d7(typedValue.data, null, null); 
      Resources resources = paramTypedArray.getResources();
      paramInt = paramTypedArray.getResourceId(paramInt, 0);
      try {
        d7 d7 = d7.c(resources, paramInt, paramTheme);
      } catch (Exception exception) {
        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", exception);
        exception = null;
      } 
      if (exception != null)
        return (d7)exception; 
    } 
    return new d7(0, null, null);
  }
  
  public static int E(ContextThemeWrapper paramContextThemeWrapper, int paramInt) {
    TypedValue typedValue = new TypedValue();
    return paramContextThemeWrapper.getTheme().resolveAttribute(paramInt, typedValue, true) ? typedValue.resourceId : 0;
  }
  
  public static j52 F(Context paramContext, km0 paramkm0) {
    if (paramkm0 != null && paramkm0.equals(m))
      return n; 
    f();
    j52 j521 = new j52(paramContext, paramkm0, true);
    m = paramkm0;
    try {
      n = j521;
    } finally {
      j521 = null;
    } 
  }
  
  public static SharedPreferences G0(Context paramContext) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{android/content/SharedPreferences}} */
    try {
      if (o == null) {
        ah2 ah2 = new ah2();
        this(1, paramContext);
        o = (SharedPreferences)qv.B0(ah2);
      } 
    } finally {}
    SharedPreferences sharedPreferences = o;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{android/content/SharedPreferences}} */
    return sharedPreferences;
  }
  
  public static X509Certificate[][] H0(String paramString) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramString, "r");
    try {
      Pair pair;
      if (randomAccessFile.length() < 22L) {
        paramString = null;
      } else {
        pair = m92.c0(randomAccessFile, 0);
        if (pair == null)
          pair = m92.c0(randomAccessFile, 65535); 
      } 
      if (pair != null) {
        ByteBuffer byteBuffer = (ByteBuffer)pair.first;
        long l2 = ((Long)pair.second).longValue();
        long l1 = l2 - 20L;
        if (l1 >= 0L) {
          randomAccessFile.seek(l1);
          if (randomAccessFile.readInt() == 1347094023) {
            i12 i122 = new i12();
            super("ZIP64 APK not supported");
            throw i122;
          } 
        } 
        m92.d0(byteBuffer);
        l1 = byteBuffer.getInt(byteBuffer.position() + 16) & 0xFFFFFFFFL;
        if (l1 < l2) {
          m92.d0(byteBuffer);
          if ((byteBuffer.getInt(byteBuffer.position() + 12) & 0xFFFFFFFFL) + l1 == l2) {
            if (l1 >= 32L) {
              ByteBuffer byteBuffer1 = ByteBuffer.allocate(24);
              ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
              byteBuffer1.order(byteOrder);
              randomAccessFile.seek(l1 - byteBuffer1.capacity());
              randomAccessFile.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
              if (byteBuffer1.getLong(8) == 2334950737559900225L && byteBuffer1.getLong(16) == 3617552046287187010L) {
                long l3 = byteBuffer1.getLong(0);
                int i = byteBuffer1.capacity();
                if (l3 >= i && l3 <= 2147483639L) {
                  i = (int)(8L + l3);
                  long l4 = l1 - i;
                  if (l4 >= 0L) {
                    byteBuffer1 = ByteBuffer.allocate(i);
                    byteBuffer1.order(byteOrder);
                    randomAccessFile.seek(l4);
                    randomAccessFile.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
                    long l5 = byteBuffer1.getLong(0);
                    if (l5 == l3) {
                      Pair pair1 = Pair.create(byteBuffer1, Long.valueOf(l4));
                      byteBuffer1 = (ByteBuffer)pair1.first;
                      l3 = ((Long)pair1.second).longValue();
                      if (byteBuffer1.order() == byteOrder) {
                        i = byteBuffer1.capacity() - 24;
                        if (i >= 8) {
                          int j = byteBuffer1.capacity();
                          if (i <= byteBuffer1.capacity()) {
                            i12 i128;
                            j = byteBuffer1.limit();
                            int k = byteBuffer1.position();
                            try {
                              byteBuffer1.position(0);
                              byteBuffer1.limit(i);
                              byteBuffer1.position(8);
                              ByteBuffer byteBuffer2 = byteBuffer1.slice();
                              byteBuffer2.order(byteBuffer1.order());
                              byteBuffer1.position(0);
                              byteBuffer1.limit(j);
                              byteBuffer1.position(k);
                              i = 0;
                              byteBuffer1 = byteBuffer;
                              while (byteBuffer2.hasRemaining()) {
                                i++;
                                if (byteBuffer2.remaining() >= 8) {
                                  l5 = byteBuffer2.getLong();
                                  String str = hrSTyFuSIm.bGYF;
                                  if (l5 >= 4L && l5 <= 2147483647L) {
                                    aa aa;
                                    k = byteBuffer2.position();
                                    j = (int)l5;
                                    if (j <= byteBuffer2.remaining()) {
                                      if (byteBuffer2.getInt() == 1896449818) {
                                        ByteBuffer byteBuffer3 = L0(byteBuffer2, j - 4);
                                        aa = new aa();
                                        this(byteBuffer3, l3, l1, l2, byteBuffer1);
                                        return arrayOfX509Certificate;
                                      } 
                                      aa.position(k + j);
                                      continue;
                                    } 
                                    i12 i1211 = new i12();
                                    k = aa.remaining();
                                    StringBuilder stringBuilder10 = new StringBuilder();
                                    this();
                                    stringBuilder10.append((String)iOException);
                                    stringBuilder10.append(i);
                                    stringBuilder10.append(" size out of range: ");
                                    stringBuilder10.append(j);
                                    stringBuilder10.append(eRUgfgGAccgka.lrb);
                                    stringBuilder10.append(k);
                                    super(stringBuilder10.toString());
                                    throw i1211;
                                  } 
                                  i12 i1210 = new i12();
                                  StringBuilder stringBuilder9 = new StringBuilder();
                                  this();
                                  stringBuilder9.append((String)iOException);
                                  stringBuilder9.append(i);
                                  stringBuilder9.append(" size out of range: ");
                                  stringBuilder9.append(l5);
                                  super(stringBuilder9.toString());
                                  throw i1210;
                                } 
                                i12 i129 = new i12();
                                StringBuilder stringBuilder8 = new StringBuilder();
                                this();
                                stringBuilder8.append("Insufficient data to read size of APK Signing Block entry #");
                                stringBuilder8.append(i);
                                super(stringBuilder8.toString());
                                throw i129;
                              } 
                              i128 = new i12();
                              super("No APK Signature Scheme v2 block in APK Signing Block");
                              throw i128;
                            } finally {
                              i128.position(0);
                              i128.limit(j);
                              i128.position(k);
                            } 
                          } 
                          IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                          StringBuilder stringBuilder7 = new StringBuilder();
                          this("end > capacity: ");
                          stringBuilder7.append(i);
                          stringBuilder7.append(" > ");
                          stringBuilder7.append(j);
                          this(stringBuilder7.toString());
                          throw illegalArgumentException2;
                        } 
                        IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
                        StringBuilder stringBuilder6 = new StringBuilder();
                        this("end < start: ");
                        stringBuilder6.append(i);
                        stringBuilder6.append(" < 8");
                        this(stringBuilder6.toString());
                        throw illegalArgumentException1;
                      } 
                      IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                      this("ByteBuffer byte order must be little endian");
                      throw illegalArgumentException;
                    } 
                    i12 i127 = new i12();
                    StringBuilder stringBuilder5 = new StringBuilder();
                    this("APK Signing Block sizes in header and footer do not match: ");
                    stringBuilder5.append(l5);
                    stringBuilder5.append(" vs ");
                    stringBuilder5.append(l3);
                    super(stringBuilder5.toString());
                    throw i127;
                  } 
                  i12 i126 = new i12();
                  StringBuilder stringBuilder4 = new StringBuilder();
                  this("APK Signing Block offset out of range: ");
                  stringBuilder4.append(l4);
                  super(stringBuilder4.toString());
                  throw i126;
                } 
                i12 i125 = new i12();
                StringBuilder stringBuilder3 = new StringBuilder();
                this("APK Signing Block size out of range: ");
                stringBuilder3.append(l3);
                super(stringBuilder3.toString());
                throw i125;
              } 
              i12 i124 = new i12();
              super("No APK Signing Block before ZIP Central Directory");
              throw i124;
            } 
            i12 i123 = new i12();
            StringBuilder stringBuilder2 = new StringBuilder();
            this("APK too small for APK Signing Block. ZIP Central Directory offset: ");
            stringBuilder2.append(l1);
            super(stringBuilder2.toString());
            throw i123;
          } 
          i12 i122 = new i12();
          super("ZIP Central Directory is not immediately followed by End of Central Directory");
          throw i122;
        } 
        i12 i121 = new i12();
        StringBuilder stringBuilder1 = new StringBuilder();
        this("ZIP Central Directory offset out of range: ");
        stringBuilder1.append(l1);
        stringBuilder1.append(". ZIP End of Central Directory offset: ");
        stringBuilder1.append(l2);
        super(stringBuilder1.toString());
        throw i121;
      } 
    } finally {}
    i12 i12 = new i12();
    long l = randomAccessFile.length();
    StringBuilder stringBuilder = new StringBuilder();
    this("Not an APK file: ZIP End of Central Directory record not found in file with ");
    stringBuilder.append(l);
    stringBuilder.append(" bytes");
    super(stringBuilder.toString());
    throw i12;
  }
  
  public static int I0(int paramInt) {
    if (paramInt != 1) {
      if (paramInt == 2)
        return 64; 
      l0.l(ga1.i("Unknown content digest algorthm: ", paramInt));
      return 0;
    } 
    return 32;
  }
  
  public static boolean J(XmlPullParser paramXmlPullParser, String paramString) {
    return (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null);
  }
  
  public static int J0(int paramInt) {
    if (paramInt != 513)
      if (paramInt != 514) {
        if (paramInt != 769)
          switch (paramInt) {
            default:
              l0.l("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(paramInt))));
              return 0;
            case 258:
            case 260:
              return 2;
            case 257:
            case 259:
              break;
          }  
        return 1;
      }  
    return 1;
  }
  
  public static String K0(int paramInt) {
    if (paramInt != 1) {
      if (paramInt == 2)
        return "SHA-512"; 
      l0.l(ga1.i("Unknown content digest algorthm: ", paramInt));
      return null;
    } 
    return "SHA-256";
  }
  
  public static ByteBuffer L0(ByteBuffer paramByteBuffer, int paramInt) {
    int i = paramByteBuffer.limit();
    int j = paramByteBuffer.position();
    paramInt += j;
    if (paramInt >= j && paramInt <= i) {
      paramByteBuffer.limit(paramInt);
      try {
        ByteBuffer byteBuffer = paramByteBuffer.slice();
        byteBuffer.order(paramByteBuffer.order());
        paramByteBuffer.position(paramInt);
        return byteBuffer;
      } finally {
        paramByteBuffer.limit(i);
      } 
    } 
    throw new BufferUnderflowException();
  }
  
  public static ByteBuffer M0(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() >= 4) {
      int i = paramByteBuffer.getInt();
      if (i >= 0) {
        if (i <= paramByteBuffer.remaining())
          return L0(paramByteBuffer, i); 
        m60.i(ga1.j("Length-prefixed field longer than remaining buffer. Field length: ", i, paramByteBuffer.remaining(), ", remaining: "));
        return null;
      } 
      l0.l("Negative length");
      return null;
    } 
    m60.i(ga1.i("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", paramByteBuffer.remaining()));
    return null;
  }
  
  public static cs N(cs paramcs) {
    ds ds1;
    ds ds2;
    paramcs.getClass();
    if (paramcs instanceof ds) {
      ds2 = (ds)paramcs;
    } else {
      ds2 = null;
    } 
    if (ds2 != null) {
      cs cs1 = ds2.e;
      paramcs = cs1;
      if (cs1 == null) {
        rs rs = (rs)ds2.e().l(vs2.c);
        if (rs != null) {
          xz xz = new xz(rs, ds2);
        } else {
          ds1 = ds2;
        } 
        ds2.e = ds1;
        return ds1;
      } 
    } 
    return ds1;
  }
  
  public static void N0(int paramInt, byte[] paramArrayOfbyte) {
    paramArrayOfbyte[1] = (byte)(paramInt & 0xFF);
    paramArrayOfbyte[2] = (byte)(paramInt >>> 8 & 0xFF);
    paramArrayOfbyte[3] = (byte)(paramInt >>> 16 & 0xFF);
    paramArrayOfbyte[4] = (byte)(paramInt >> 24);
  }
  
  public static boolean O(int paramInt) {
    double d1 = Color.red(paramInt);
    double d2 = Color.green(paramInt);
    return (1.0D - (Color.blue(paramInt) * 0.114D + d2 * 0.587D + d1 * 0.299D) / 255.0D >= 0.5D);
  }
  
  public static byte[] O0(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    if (i >= 0) {
      if (i <= paramByteBuffer.remaining()) {
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte);
        return arrayOfByte;
      } 
      m60.i(ga1.j("Underflow while reading length-prefixed value. Length: ", i, paramByteBuffer.remaining(), AyxAR.OMyqkEIHUktoC));
      return null;
    } 
    m60.i("Negative length");
    return null;
  }
  
  public static boolean P(Context paramContext, Locale paramLocale) {
    if (!MyApplication.l() && !paramLocale.getLanguage().equals("en")) {
      HashSet<String> hashSet;
      WeakReference<Set> weakReference1 = l;
      if (weakReference1 != null) {
        Set set = weakReference1.get();
      } else {
        weakReference1 = null;
      } 
      WeakReference<Set> weakReference2 = weakReference1;
      if (weakReference1 == null) {
        hashSet = new HashSet(q0(paramContext).i());
        if (Build.VERSION.SDK_INT >= 35) {
          if (hashSet.contains("iw"))
            hashSet.add("he"); 
          if (hashSet.contains("in"))
            hashSet.add("id"); 
        } 
        StringBuilder stringBuilder = new StringBuilder("SPLMG>il:");
        stringBuilder.append(TextUtils.join(", ", hashSet));
        n21.F(stringBuilder.toString());
        l = new WeakReference<HashSet<String>>(hashSet);
      } 
      if (!hashSet.contains(paramLocale.getLanguage()) && ((TextUtils.isEmpty(paramLocale.getCountry()) && TextUtils.isEmpty(paramLocale.getVariant())) || !hashSet.contains(paramLocale.toString())))
        return false; 
    } 
    return true;
  }
  
  public static X509Certificate[] P0(ByteBuffer paramByteBuffer, HashMap<Integer, ?> paramHashMap, CertificateFactory paramCertificateFactory) {
    Pair pair;
    String str1;
    Signature signature;
    ByteBuffer byteBuffer2 = M0(paramByteBuffer);
    ByteBuffer byteBuffer1 = M0(paramByteBuffer);
    byte[] arrayOfByte2 = O0(paramByteBuffer);
    ArrayList<Integer> arrayList = new ArrayList();
    AlgorithmParameterSpec algorithmParameterSpec2 = null;
    byte[] arrayOfByte1 = null;
    int i = -1;
    int j = 0;
    while (byteBuffer1.hasRemaining()) {
      int k = j + 1;
      try {
        paramByteBuffer = M0(byteBuffer1);
        if (paramByteBuffer.remaining() >= 8) {
          int m = paramByteBuffer.getInt();
          arrayList.add(Integer.valueOf(m));
          if (m != 513 && m != 514 && m != 769) {
            switch (m) {
              case 257:
              case 258:
              case 259:
              case 260:
                if (i != -1) {
                  int i1 = J0(m);
                  int n = J0(i);
                  j = k;
                  if (i1 != 1) {
                    if (n != 1) {
                      j = k;
                      break;
                    } 
                  } else {
                    break;
                  } 
                } 
                arrayOfByte1 = O0(paramByteBuffer);
                i = m;
                j = k;
                break;
            } 
            continue;
          } 
        } 
      } catch (IOException iOException) {
      
      } catch (BufferUnderflowException bufferUnderflowException) {
        continue;
      } 
      SecurityException securityException = new SecurityException();
      this("Signature record too short");
      throw securityException;
    } 
    if (i == -1) {
      if (j == 0)
        throw new SecurityException("No signatures found"); 
      throw new SecurityException("No supported signatures found");
    } 
    if (i != 513 && i != 514) {
      if (i != 769) {
        switch (i) {
          default:
            l0.l("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            return null;
          case 257:
          case 258:
          case 259:
          case 260:
            break;
        } 
        str1 = "RSA";
      } else {
        str1 = "DSA";
      } 
    } else {
      str1 = "EC";
    } 
    if (i != 513) {
      if (i != 514) {
        if (i != 769) {
          switch (i) {
            default:
              l0.l("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
              return null;
            case 260:
              pair = Pair.create("SHA512withRSA", null);
              break;
            case 259:
              pair = Pair.create("SHA256withRSA", null);
              break;
            case 258:
              pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
              break;
            case 257:
              pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
              break;
          } 
        } else {
          pair = Pair.create("SHA256withDSA", null);
        } 
      } else {
        pair = Pair.create("SHA512withECDSA", null);
      } 
    } else {
      pair = Pair.create("SHA256withECDSA", null);
    } 
    String str2 = (String)pair.first;
    AlgorithmParameterSpec algorithmParameterSpec1 = (AlgorithmParameterSpec)pair.second;
    try {
      KeyFactory keyFactory = KeyFactory.getInstance(str1);
      X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec();
      this(arrayOfByte2);
      PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
      signature = Signature.getInstance(str2);
      signature.initVerify(publicKey);
      if (algorithmParameterSpec1 != null)
        signature.setParameter(algorithmParameterSpec1); 
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
    
    } catch (InvalidKeySpecException invalidKeySpecException) {
    
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
    
    } catch (SignatureException signatureException) {}
    signature.update(byteBuffer2);
    boolean bool = signature.verify(arrayOfByte1);
    if (bool) {
      IOException iOException;
      byteBuffer2.clear();
      ByteBuffer byteBuffer = M0(byteBuffer2);
      ArrayList<Integer> arrayList1 = new ArrayList();
      j = 0;
      algorithmParameterSpec1 = algorithmParameterSpec2;
      while (byteBuffer.hasRemaining()) {
        int k = j + 1;
        try {
          ByteBuffer byteBuffer3 = M0(byteBuffer);
          if (byteBuffer3.remaining() >= 8) {
            int m = byteBuffer3.getInt();
            arrayList1.add(Integer.valueOf(m));
            j = k;
            if (m == i) {
              byte[] arrayOfByte = O0(byteBuffer3);
              j = k;
            } 
            continue;
          } 
        } catch (IOException iOException1) {
          continue;
        } catch (BufferUnderflowException bufferUnderflowException) {}
        iOException = new IOException();
        this("Record too short");
        throw iOException;
      } 
      if (arrayList.equals(arrayList1)) {
        i = J0(i);
        byte[] arrayOfByte = (byte[])paramHashMap.put(Integer.valueOf(i), iOException);
        if (arrayOfByte == null || MessageDigest.isEqual(arrayOfByte, (byte[])iOException)) {
          ByteBuffer byteBuffer3 = M0(byteBuffer2);
          ArrayList<e12> arrayList2 = new ArrayList();
          i = 0;
          while (byteBuffer3.hasRemaining()) {
            i++;
            byte[] arrayOfByte3 = O0(byteBuffer3);
            try {
              ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
              this(arrayOfByte3);
              X509Certificate x509Certificate = (X509Certificate)paramCertificateFactory.generateCertificate(byteArrayInputStream);
              arrayList2.add(new e12(x509Certificate, arrayOfByte3, 1));
            } catch (CertificateException certificateException) {
              throw new SecurityException(ga1.i("Failed to decode certificate #", i), certificateException);
            } 
          } 
          if (!arrayList2.isEmpty()) {
            if (Arrays.equals(arrayOfByte2, ((X509Certificate)arrayList2.get(0)).getPublicKey().getEncoded()))
              return arrayList2.<X509Certificate>toArray(new X509Certificate[arrayList2.size()]); 
            throw new SecurityException("Public key mismatch between certificate and signature record");
          } 
          throw new SecurityException("No certificates listed");
        } 
        throw new SecurityException(K0(i).concat(AyxAR.MrSWE));
      } 
      throw new SecurityException("Signature algorithms don't match between digests and signatures records");
    } 
    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
  }
  
  public static boolean Q(Context paramContext) {
    TypedValue typedValue = new TypedValue();
    return (paramContext.getTheme().resolveAttribute(2130969355, typedValue, true) && typedValue.data != 0);
  }
  
  public static byte[][] Q0(int[] paramArrayOfint, rf2[] paramArrayOfrf2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore_2
    //   4: lconst_0
    //   5: lstore #11
    //   7: iload_2
    //   8: iconst_3
    //   9: if_icmpge -> 39
    //   12: lload #11
    //   14: aload_1
    //   15: iload_2
    //   16: aaload
    //   17: invokeinterface a : ()J
    //   22: ldc2_w 1048575
    //   25: ladd
    //   26: ldc2_w 1048576
    //   29: ldiv
    //   30: ladd
    //   31: lstore #11
    //   33: iinc #2, 1
    //   36: goto -> 7
    //   39: lload #11
    //   41: ldc2_w 2097151
    //   44: lcmp
    //   45: ifge -> 526
    //   48: aload_0
    //   49: arraylength
    //   50: anewarray [B
    //   53: astore #17
    //   55: iconst_0
    //   56: istore_2
    //   57: aload_0
    //   58: arraylength
    //   59: istore #7
    //   61: iconst_5
    //   62: istore #5
    //   64: iload_2
    //   65: iload #7
    //   67: if_icmpge -> 115
    //   70: lload #11
    //   72: l2i
    //   73: istore #4
    //   75: aload_0
    //   76: iload_2
    //   77: iaload
    //   78: invokestatic I0 : (I)I
    //   81: iload #4
    //   83: imul
    //   84: iconst_5
    //   85: iadd
    //   86: newarray byte
    //   88: astore #18
    //   90: aload #18
    //   92: iconst_0
    //   93: bipush #90
    //   95: bastore
    //   96: iload #4
    //   98: aload #18
    //   100: invokestatic N0 : (I[B)V
    //   103: aload #17
    //   105: iload_2
    //   106: aload #18
    //   108: aastore
    //   109: iinc #2, 1
    //   112: goto -> 57
    //   115: iconst_5
    //   116: newarray byte
    //   118: astore #21
    //   120: aload #21
    //   122: iconst_0
    //   123: bipush #-91
    //   125: bastore
    //   126: iload #7
    //   128: anewarray java/security/MessageDigest
    //   131: astore #22
    //   133: iconst_0
    //   134: istore_2
    //   135: aload_0
    //   136: arraylength
    //   137: istore #4
    //   139: aconst_null
    //   140: astore #19
    //   142: ldc_w ' digest not supported'
    //   145: astore #18
    //   147: iload_2
    //   148: iload #4
    //   150: if_icmpge -> 191
    //   153: aload_0
    //   154: iload_2
    //   155: iaload
    //   156: invokestatic K0 : (I)Ljava/lang/String;
    //   159: astore #18
    //   161: aload #22
    //   163: iload_2
    //   164: aload #18
    //   166: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   169: aastore
    //   170: iinc #2, 1
    //   173: goto -> 135
    //   176: astore_0
    //   177: aload #18
    //   179: ldc_w ' digest not supported'
    //   182: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   185: aload_0
    //   186: invokestatic m : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   189: aconst_null
    //   190: areturn
    //   191: iconst_0
    //   192: istore_2
    //   193: iconst_0
    //   194: istore #4
    //   196: iload_2
    //   197: iconst_3
    //   198: if_icmpge -> 456
    //   201: aload_1
    //   202: iload_2
    //   203: aaload
    //   204: astore #20
    //   206: aload #20
    //   208: invokeinterface a : ()J
    //   213: lstore #11
    //   215: lconst_0
    //   216: lstore #13
    //   218: lload #11
    //   220: lconst_0
    //   221: lcmp
    //   222: ifle -> 447
    //   225: lload #11
    //   227: ldc2_w 1048576
    //   230: invokestatic min : (JJ)J
    //   233: l2i
    //   234: istore #8
    //   236: iload #8
    //   238: aload #21
    //   240: invokestatic N0 : (I[B)V
    //   243: iconst_0
    //   244: istore #6
    //   246: iload #6
    //   248: iload #7
    //   250: if_icmpge -> 269
    //   253: aload #22
    //   255: iload #6
    //   257: aaload
    //   258: aload #21
    //   260: invokevirtual update : ([B)V
    //   263: iinc #6, 1
    //   266: goto -> 246
    //   269: aload #20
    //   271: aload #22
    //   273: lload #13
    //   275: iload #8
    //   277: invokeinterface g : ([Ljava/security/MessageDigest;JI)V
    //   282: iconst_0
    //   283: istore #6
    //   285: iload #6
    //   287: aload_0
    //   288: arraylength
    //   289: if_icmpge -> 400
    //   292: aload_0
    //   293: iload #6
    //   295: iaload
    //   296: istore #9
    //   298: aload #17
    //   300: iload #6
    //   302: aaload
    //   303: astore #23
    //   305: iload #9
    //   307: invokestatic I0 : (I)I
    //   310: istore #10
    //   312: aload #22
    //   314: iload #6
    //   316: aaload
    //   317: astore #24
    //   319: aload #24
    //   321: aload #23
    //   323: iload #4
    //   325: iload #10
    //   327: imul
    //   328: iconst_5
    //   329: iadd
    //   330: iload #10
    //   332: invokevirtual digest : ([BII)I
    //   335: istore #9
    //   337: iload #9
    //   339: iload #10
    //   341: if_icmpne -> 350
    //   344: iinc #6, 1
    //   347: goto -> 285
    //   350: aload #24
    //   352: invokevirtual getAlgorithm : ()Ljava/lang/String;
    //   355: astore_1
    //   356: new java/lang/StringBuilder
    //   359: dup
    //   360: ldc_w 'Unexpected output size of '
    //   363: invokespecial <init> : (Ljava/lang/String;)V
    //   366: astore_0
    //   367: aload_0
    //   368: aload_1
    //   369: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: aload_0
    //   374: ldc_w ' digest: '
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload_0
    //   382: iload #9
    //   384: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: new java/lang/RuntimeException
    //   391: dup
    //   392: aload_0
    //   393: invokevirtual toString : ()Ljava/lang/String;
    //   396: invokespecial <init> : (Ljava/lang/String;)V
    //   399: athrow
    //   400: iload #8
    //   402: i2l
    //   403: lstore #15
    //   405: lload #13
    //   407: lload #15
    //   409: ladd
    //   410: lstore #13
    //   412: lload #11
    //   414: lload #15
    //   416: lsub
    //   417: lstore #11
    //   419: iinc #4, 1
    //   422: goto -> 218
    //   425: astore_0
    //   426: new java/security/DigestException
    //   429: dup
    //   430: ldc_w 'Failed to digest chunk #'
    //   433: iload #4
    //   435: iload_3
    //   436: ldc_w ' of section #'
    //   439: invokestatic j : (Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    //   442: aload_0
    //   443: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   446: athrow
    //   447: iinc #3, 1
    //   450: iinc #2, 1
    //   453: goto -> 196
    //   456: aload_0
    //   457: arraylength
    //   458: anewarray [B
    //   461: astore #21
    //   463: iconst_0
    //   464: istore_2
    //   465: iload_2
    //   466: aload_0
    //   467: arraylength
    //   468: if_icmpge -> 523
    //   471: aload_0
    //   472: iload_2
    //   473: iaload
    //   474: istore_3
    //   475: aload #17
    //   477: iload_2
    //   478: aaload
    //   479: astore #22
    //   481: iload_3
    //   482: invokestatic K0 : (I)Ljava/lang/String;
    //   485: astore_1
    //   486: aload_1
    //   487: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   490: astore #20
    //   492: aload #21
    //   494: iload_2
    //   495: aload #20
    //   497: aload #22
    //   499: invokevirtual digest : ([B)[B
    //   502: aastore
    //   503: iinc #2, 1
    //   506: goto -> 465
    //   509: astore_0
    //   510: aload_1
    //   511: aload #18
    //   513: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   516: aload_0
    //   517: invokestatic m : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   520: aload #19
    //   522: areturn
    //   523: aload #21
    //   525: areturn
    //   526: new java/lang/StringBuilder
    //   529: dup
    //   530: ldc_w 'Too many chunks: '
    //   533: invokespecial <init> : (Ljava/lang/String;)V
    //   536: astore_0
    //   537: aload_0
    //   538: lload #11
    //   540: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   543: pop
    //   544: new java/security/DigestException
    //   547: dup
    //   548: aload_0
    //   549: invokevirtual toString : ()Ljava/lang/String;
    //   552: invokespecial <init> : (Ljava/lang/String;)V
    //   555: athrow
    // Exception table:
    //   from	to	target	type
    //   161	170	176	java/security/NoSuchAlgorithmException
    //   269	282	425	java/io/IOException
    //   486	492	509	java/security/NoSuchAlgorithmException
  }
  
  public static vl0 R(lc0 paramlc0) {
    j30 j30 = j30.g;
    Object object = new Object();
    ((s02)object).b = paramlc0;
    ((s02)object).c = j30;
    return (vl0)object;
  }
  
  public static X509Certificate[][] R0(FileChannel paramFileChannel, aa paramaa) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    ArrayList<X509Certificate[]> arrayList = new ArrayList();
    try {
      CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
      try {
        ByteBuffer byteBuffer = M0((ByteBuffer)paramaa.d);
        int j = 0;
        int i = 0;
        while (byteBuffer.hasRemaining()) {
          i++;
          try {
            arrayList.add(P0(M0(byteBuffer), hashMap, certificateFactory));
            continue;
          } catch (IOException iOException) {
            continue;
          } catch (BufferUnderflowException bufferUnderflowException) {
            continue;
          } catch (SecurityException securityException) {}
          throw new SecurityException(x41.i(i, "Failed to parse/verify signer #", " block"), securityException);
        } 
        if (i > 0) {
          if (!hashMap.isEmpty()) {
            long l2 = paramaa.a;
            long l3 = paramaa.b;
            long l1 = paramaa.c;
            ByteBuffer byteBuffer1 = (ByteBuffer)paramaa.e;
            if (!hashMap.isEmpty()) {
              ih2 ih22 = new ih2((FileChannel)securityException, 0L, l2);
              ih2 ih21 = new ih2((FileChannel)securityException, l3, l1 - l3);
              byteBuffer1 = byteBuffer1.duplicate();
              byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
              m92.d0(byteBuffer1);
              i = byteBuffer1.position();
              if (l2 >= 0L && l2 <= 4294967295L) {
                byteBuffer1.putInt(byteBuffer1.position() + i + 16, (int)l2);
                a42 a42 = new a42(byteBuffer1);
                int k = hashMap.size();
                int[] arrayOfInt = new int[k];
                Iterator iterator = hashMap.keySet().iterator();
                for (i = 0; iterator.hasNext(); i++)
                  arrayOfInt[i] = ((Integer)iterator.next()).intValue(); 
                try {
                  byte[][] arrayOfByte = Q0(arrayOfInt, new rf2[] { ih22, ih21, a42 });
                  i = j;
                  while (i < k) {
                    j = arrayOfInt[i];
                    if (MessageDigest.isEqual((byte[])hashMap.get(Integer.valueOf(j)), arrayOfByte[i])) {
                      i++;
                      continue;
                    } 
                    throw new SecurityException(K0(j).concat(eRUgfgGAccgka.qNC));
                  } 
                  return arrayList.<X509Certificate[]>toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException digestException) {
                  throw new SecurityException("Failed to compute digest(s) of contents", digestException);
                } 
              } 
              StringBuilder stringBuilder = new StringBuilder("uint32 value of out range: ");
              stringBuilder.append(l2);
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
            throw new SecurityException("No digests provided");
          } 
          throw new SecurityException("No content digests found");
        } 
        throw new SecurityException("No signers found");
      } catch (IOException iOException) {
        throw new SecurityException("Failed to read list of signers", iOException);
      } 
    } catch (CertificateException certificateException) {
      k91.m("Failed to obtain X.509 CertificateFactory", certificateException);
      return null;
    } 
  }
  
  public static os V(ms paramms, ns paramns) {
    b40 b40;
    paramns.getClass();
    ms ms1 = paramms;
    if (ui0.c(paramms.getKey(), paramns))
      b40 = b40.b; 
    return b40;
  }
  
  public static void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    paramThrowable1.getClass();
    paramThrowable2.getClass();
    if (paramThrowable1 != paramThrowable2) {
      Integer integer = jj0.a;
      if (integer == null || integer.intValue() >= 19) {
        paramThrowable1.addSuppressed(paramThrowable2);
        return;
      } 
      Method method = g71.a;
      if (method != null) {
        method.invoke(paramThrowable1, new Object[] { paramThrowable2 });
        return;
      } 
    } 
  }
  
  public static int b(int paramInt, float paramFloat) {
    return Color.argb(Math.round(Color.alpha(paramInt) * paramFloat), Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
  }
  
  public static TypedArray b0(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfint) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, 0, 0);
  }
  
  public static void c(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN)
      return; 
    l0.l("ByteBuffer byte order must be little endian");
  }
  
  public static void c0(String paramString, bv0 parambv0) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 424
    //   4: new tq0
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore #6
    //   13: new sq0
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #5
    //   22: new m51
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #4
    //   31: aload_0
    //   32: ldc_w '.'
    //   35: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   38: istore_2
    //   39: iload_2
    //   40: iconst_m1
    //   41: if_icmpeq -> 57
    //   44: aload_0
    //   45: iload_2
    //   46: aload_0
    //   47: invokevirtual length : ()I
    //   50: invokevirtual substring : (II)Ljava/lang/String;
    //   53: astore_3
    //   54: goto -> 60
    //   57: ldc ''
    //   59: astore_3
    //   60: aload_3
    //   61: ldc_w '.m3u'
    //   64: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   67: ifeq -> 76
    //   70: aload #6
    //   72: astore_3
    //   73: goto -> 105
    //   76: aload_3
    //   77: ldc_w '.m3u8'
    //   80: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   83: ifeq -> 92
    //   86: aload #5
    //   88: astore_3
    //   89: goto -> 105
    //   92: aload_3
    //   93: ldc_w '.pls'
    //   96: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   99: ifeq -> 413
    //   102: aload #4
    //   104: astore_3
    //   105: aconst_null
    //   106: astore #9
    //   108: aconst_null
    //   109: astore #7
    //   111: aconst_null
    //   112: astore #5
    //   114: aconst_null
    //   115: astore #6
    //   117: aconst_null
    //   118: astore #4
    //   120: aconst_null
    //   121: astore #8
    //   123: new java/net/URL
    //   126: astore #10
    //   128: aload #10
    //   130: aload_0
    //   131: ldc_w 'UTF-8'
    //   134: invokestatic decode : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: aload #10
    //   142: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   145: checkcast java/net/HttpURLConnection
    //   148: astore_0
    //   149: aload #8
    //   151: astore #6
    //   153: aload #9
    //   155: astore #4
    //   157: aload #7
    //   159: astore #5
    //   161: aload_0
    //   162: sipush #6000
    //   165: invokevirtual setConnectTimeout : (I)V
    //   168: aload #8
    //   170: astore #6
    //   172: aload #9
    //   174: astore #4
    //   176: aload #7
    //   178: astore #5
    //   180: aload_0
    //   181: sipush #6000
    //   184: invokevirtual setReadTimeout : (I)V
    //   187: aload #8
    //   189: astore #6
    //   191: aload #9
    //   193: astore #4
    //   195: aload #7
    //   197: astore #5
    //   199: aload_0
    //   200: ldc_w 'GET'
    //   203: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   206: aload #8
    //   208: astore #6
    //   210: aload #9
    //   212: astore #4
    //   214: aload #7
    //   216: astore #5
    //   218: aload_0
    //   219: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   222: astore #7
    //   224: aload #7
    //   226: astore #6
    //   228: aload #7
    //   230: astore #4
    //   232: aload #7
    //   234: astore #5
    //   236: aload_3
    //   237: aload #7
    //   239: aload_1
    //   240: invokevirtual J : (Ljava/io/InputStream;Lbv0;)V
    //   243: aload_0
    //   244: invokevirtual disconnect : ()V
    //   247: aload #7
    //   249: ifnull -> 394
    //   252: aload #7
    //   254: invokevirtual close : ()V
    //   257: return
    //   258: astore #4
    //   260: aload #6
    //   262: astore_1
    //   263: aload_0
    //   264: astore_3
    //   265: aload #4
    //   267: astore_0
    //   268: goto -> 395
    //   271: astore_1
    //   272: aload #4
    //   274: astore_3
    //   275: aload_0
    //   276: astore #4
    //   278: aload_3
    //   279: astore_0
    //   280: aload_1
    //   281: astore #5
    //   283: goto -> 332
    //   286: astore_1
    //   287: aload_0
    //   288: astore #4
    //   290: aload #5
    //   292: astore_0
    //   293: aload_1
    //   294: astore #5
    //   296: goto -> 367
    //   299: astore_0
    //   300: aconst_null
    //   301: astore_1
    //   302: aload #4
    //   304: astore_3
    //   305: goto -> 395
    //   308: astore_1
    //   309: aconst_null
    //   310: astore_0
    //   311: aload #5
    //   313: astore #4
    //   315: aload_1
    //   316: astore #5
    //   318: goto -> 332
    //   321: astore #5
    //   323: aconst_null
    //   324: astore_0
    //   325: aload #6
    //   327: astore #4
    //   329: goto -> 367
    //   332: aload #4
    //   334: astore_3
    //   335: aload_0
    //   336: astore_1
    //   337: aload #5
    //   339: invokevirtual printStackTrace : ()V
    //   342: aload #4
    //   344: ifnull -> 352
    //   347: aload #4
    //   349: invokevirtual disconnect : ()V
    //   352: aload_0
    //   353: ifnull -> 394
    //   356: aload_0
    //   357: invokevirtual close : ()V
    //   360: goto -> 394
    //   363: astore_0
    //   364: goto -> 395
    //   367: aload #4
    //   369: astore_3
    //   370: aload_0
    //   371: astore_1
    //   372: aload #5
    //   374: invokevirtual printStackTrace : ()V
    //   377: aload #4
    //   379: ifnull -> 387
    //   382: aload #4
    //   384: invokevirtual disconnect : ()V
    //   387: aload_0
    //   388: ifnull -> 394
    //   391: goto -> 356
    //   394: return
    //   395: aload_3
    //   396: ifnull -> 403
    //   399: aload_3
    //   400: invokevirtual disconnect : ()V
    //   403: aload_1
    //   404: ifnull -> 411
    //   407: aload_1
    //   408: invokevirtual close : ()V
    //   411: aload_0
    //   412: athrow
    //   413: new java/lang/Exception
    //   416: dup
    //   417: ldc_w 'Unsupported format'
    //   420: invokespecial <init> : (Ljava/lang/String;)V
    //   423: athrow
    //   424: ldc_w 'URI cannot be NULL'
    //   427: invokestatic l : (Ljava/lang/String;)V
    //   430: return
    //   431: astore_0
    //   432: goto -> 394
    //   435: astore_1
    //   436: goto -> 411
    // Exception table:
    //   from	to	target	type
    //   123	149	321	java/net/MalformedURLException
    //   123	149	308	java/io/IOException
    //   123	149	299	finally
    //   161	168	286	java/net/MalformedURLException
    //   161	168	271	java/io/IOException
    //   161	168	258	finally
    //   180	187	286	java/net/MalformedURLException
    //   180	187	271	java/io/IOException
    //   180	187	258	finally
    //   199	206	286	java/net/MalformedURLException
    //   199	206	271	java/io/IOException
    //   199	206	258	finally
    //   218	224	286	java/net/MalformedURLException
    //   218	224	271	java/io/IOException
    //   218	224	258	finally
    //   236	243	286	java/net/MalformedURLException
    //   236	243	271	java/io/IOException
    //   236	243	258	finally
    //   252	257	431	java/io/IOException
    //   337	342	363	finally
    //   356	360	431	java/io/IOException
    //   372	377	363	finally
    //   407	411	435	java/io/IOException
  }
  
  public static void d0(String paramString, FileInputStream paramFileInputStream, bv0 parambv0) {
    if (paramString != null) {
      if (paramFileInputStream != null) {
        m51 m511;
        String str1;
        String str2 = "";
        if (("".split("\\;")).length > 0) {
          str1 = "".split("\\;")[0];
        } else {
          str1 = "";
        } 
        tq0 tq02 = new tq0();
        sq0 sq0 = new sq0();
        m51 m512 = new m51();
        int i = paramString.lastIndexOf(".");
        if (i != -1)
          str2 = paramString.substring(i, paramString.length()); 
        tq0 tq01 = tq02;
        if (!str2.equalsIgnoreCase(".m3u")) {
          tq0 tq0;
          Set set = tq0.x;
          if (set.contains(nw0.c(str1)) && !str2.equalsIgnoreCase(".m3u8")) {
            tq0 = tq02;
          } else if (str2.equalsIgnoreCase(".m3u8") || tq0.contains(nw0.c(str1))) {
            sq0 sq01 = sq0;
          } else if (str2.equalsIgnoreCase(".pls") || m51.v.contains(nw0.c(str1))) {
            m511 = m512;
          } else {
            throw new Exception("Unsupported format");
          } 
        } 
        m511.J(paramFileInputStream, parambv0);
        return;
      } 
      l0.l("2");
      return;
    } 
    l0.l("1");
  }
  
  public static void e0(Context paramContext, String paramString) {
    // Byte code:
    //   0: getstatic dd1.b : Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_2
    //   5: monitorenter
    //   6: aload_1
    //   7: ldc ''
    //   9: invokevirtual equals : (Ljava/lang/Object;)Z
    //   12: ifeq -> 30
    //   15: aload_0
    //   16: ldc_w 'androidx.appcompat.app.AppCompatDelegate.application_locales_record_file'
    //   19: invokevirtual deleteFile : (Ljava/lang/String;)Z
    //   22: pop
    //   23: aload_2
    //   24: monitorexit
    //   25: return
    //   26: astore_0
    //   27: goto -> 166
    //   30: aload_0
    //   31: ldc_w 'androidx.appcompat.app.AppCompatDelegate.application_locales_record_file'
    //   34: iconst_0
    //   35: invokevirtual openFileOutput : (Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   38: astore_0
    //   39: invokestatic newSerializer : ()Lorg/xmlpull/v1/XmlSerializer;
    //   42: astore_3
    //   43: aload_3
    //   44: aload_0
    //   45: aconst_null
    //   46: invokeinterface setOutput : (Ljava/io/OutputStream;Ljava/lang/String;)V
    //   51: aload_3
    //   52: ldc_w 'UTF-8'
    //   55: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   58: invokeinterface startDocument : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   63: aload_3
    //   64: aconst_null
    //   65: getstatic in/krosbits/utils/SgV/YbNJ.UPTXP : Ljava/lang/String;
    //   68: invokeinterface startTag : (Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    //   73: pop
    //   74: aload_3
    //   75: aconst_null
    //   76: ldc_w 'application_locales'
    //   79: aload_1
    //   80: invokeinterface attribute : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    //   85: pop
    //   86: aload_3
    //   87: aconst_null
    //   88: ldc_w 'locales'
    //   91: invokeinterface endTag : (Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    //   96: pop
    //   97: aload_3
    //   98: invokeinterface endDocument : ()V
    //   103: aload_0
    //   104: ifnull -> 137
    //   107: aload_0
    //   108: invokevirtual close : ()V
    //   111: goto -> 137
    //   114: astore_1
    //   115: goto -> 142
    //   118: astore_1
    //   119: ldc_w 'AppLocalesStorageHelper'
    //   122: ldc_w 'Storing App Locales : Failed to persist app-locales in storage '
    //   125: aload_1
    //   126: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   129: pop
    //   130: aload_0
    //   131: ifnull -> 137
    //   134: goto -> 107
    //   137: aload_2
    //   138: monitorexit
    //   139: goto -> 165
    //   142: aload_0
    //   143: ifnull -> 150
    //   146: aload_0
    //   147: invokevirtual close : ()V
    //   150: aload_1
    //   151: athrow
    //   152: astore_0
    //   153: ldc_w 'AppLocalesStorageHelper'
    //   156: ldc_w 'Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing '
    //   159: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   162: pop
    //   163: aload_2
    //   164: monitorexit
    //   165: return
    //   166: aload_2
    //   167: monitorexit
    //   168: aload_0
    //   169: athrow
    //   170: astore_0
    //   171: goto -> 137
    //   174: astore_0
    //   175: goto -> 150
    // Exception table:
    //   from	to	target	type
    //   6	25	26	finally
    //   30	39	152	java/io/FileNotFoundException
    //   30	39	26	finally
    //   39	43	26	finally
    //   43	103	118	java/lang/Exception
    //   43	103	114	finally
    //   107	111	170	java/io/IOException
    //   107	111	26	finally
    //   119	130	114	finally
    //   137	139	26	finally
    //   146	150	174	java/io/IOException
    //   146	150	26	finally
    //   150	152	26	finally
    //   153	165	26	finally
    //   166	168	26	finally
  }
  
  public static void f() {
    j52 j521 = n;
    if (j521 != null) {
      j521.k[0] = true;
      z2 z2 = j521.l;
      if (z2 != null)
        try {
          z2.cancel(true);
          j521.l = null;
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      j521.h = null;
      n = null;
    } 
    m = null;
  }
  
  public static os f0(ms paramms, os paramos) {
    paramos.getClass();
    return (paramos == b40.b) ? paramms : (os)paramos.h(paramms, new on(1));
  }
  
  public static String g0(Context paramContext) {
    // Byte code:
    //   0: getstatic dd1.b : Ljava/lang/Object;
    //   3: astore #6
    //   5: aload #6
    //   7: monitorenter
    //   8: getstatic r3/IKWi/AyxAR.aOa : Ljava/lang/String;
    //   11: astore #4
    //   13: aload_0
    //   14: ldc_w 'androidx.appcompat.app.AppCompatDelegate.application_locales_record_file'
    //   17: invokevirtual openFileInput : (Ljava/lang/String;)Ljava/io/FileInputStream;
    //   20: astore #7
    //   22: invokestatic newPullParser : ()Lorg/xmlpull/v1/XmlPullParser;
    //   25: astore #5
    //   27: aload #5
    //   29: aload #7
    //   31: ldc_w 'UTF-8'
    //   34: invokeinterface setInput : (Ljava/io/InputStream;Ljava/lang/String;)V
    //   39: aload #5
    //   41: invokeinterface getDepth : ()I
    //   46: istore_2
    //   47: aload #5
    //   49: invokeinterface next : ()I
    //   54: istore_1
    //   55: aload #4
    //   57: astore_3
    //   58: iload_1
    //   59: iconst_1
    //   60: if_icmpeq -> 130
    //   63: iload_1
    //   64: iconst_3
    //   65: if_icmpne -> 89
    //   68: aload #4
    //   70: astore_3
    //   71: aload #5
    //   73: invokeinterface getDepth : ()I
    //   78: iload_2
    //   79: if_icmple -> 130
    //   82: goto -> 89
    //   85: astore_0
    //   86: goto -> 204
    //   89: iload_1
    //   90: iconst_3
    //   91: if_icmpeq -> 47
    //   94: iload_1
    //   95: iconst_4
    //   96: if_icmpne -> 102
    //   99: goto -> 47
    //   102: aload #5
    //   104: invokeinterface getName : ()Ljava/lang/String;
    //   109: ldc_w 'locales'
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 47
    //   118: aload #5
    //   120: aconst_null
    //   121: getstatic in/krosbits/utils/SgV/YbNJ.RBpteZs : Ljava/lang/String;
    //   124: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   129: astore_3
    //   130: aload_3
    //   131: astore #5
    //   133: aload #7
    //   135: ifnull -> 179
    //   138: aload #7
    //   140: invokevirtual close : ()V
    //   143: aload_3
    //   144: astore #5
    //   146: goto -> 179
    //   149: astore_0
    //   150: goto -> 223
    //   153: astore_3
    //   154: ldc_w 'AppLocalesStorageHelper'
    //   157: ldc_w 'Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file'
    //   160: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   163: pop
    //   164: aload #4
    //   166: astore #5
    //   168: aload #7
    //   170: ifnull -> 179
    //   173: aload #4
    //   175: astore_3
    //   176: goto -> 138
    //   179: aload #5
    //   181: invokevirtual isEmpty : ()Z
    //   184: ifne -> 190
    //   187: goto -> 198
    //   190: aload_0
    //   191: ldc_w 'androidx.appcompat.app.AppCompatDelegate.application_locales_record_file'
    //   194: invokevirtual deleteFile : (Ljava/lang/String;)Z
    //   197: pop
    //   198: aload #6
    //   200: monitorexit
    //   201: aload #5
    //   203: areturn
    //   204: aload #7
    //   206: ifnull -> 214
    //   209: aload #7
    //   211: invokevirtual close : ()V
    //   214: aload_0
    //   215: athrow
    //   216: astore_0
    //   217: aload #6
    //   219: monitorexit
    //   220: aload #4
    //   222: areturn
    //   223: aload #6
    //   225: monitorexit
    //   226: aload_0
    //   227: athrow
    //   228: astore #4
    //   230: aload_3
    //   231: astore #5
    //   233: goto -> 179
    //   236: astore_3
    //   237: goto -> 214
    // Exception table:
    //   from	to	target	type
    //   8	13	149	finally
    //   13	22	216	java/io/FileNotFoundException
    //   13	22	149	finally
    //   22	47	153	org/xmlpull/v1/XmlPullParserException
    //   22	47	153	java/io/IOException
    //   22	47	85	finally
    //   47	55	153	org/xmlpull/v1/XmlPullParserException
    //   47	55	153	java/io/IOException
    //   47	55	85	finally
    //   71	82	153	org/xmlpull/v1/XmlPullParserException
    //   71	82	153	java/io/IOException
    //   71	82	85	finally
    //   102	130	153	org/xmlpull/v1/XmlPullParserException
    //   102	130	153	java/io/IOException
    //   102	130	85	finally
    //   138	143	228	java/io/IOException
    //   138	143	149	finally
    //   154	164	85	finally
    //   179	187	149	finally
    //   190	198	149	finally
    //   198	201	149	finally
    //   209	214	236	java/io/IOException
    //   209	214	149	finally
    //   214	216	149	finally
    //   217	220	149	finally
    //   223	226	149	finally
  }
  
  public static ColorStateList h0(Context paramContext, int paramInt, ColorStateList paramColorStateList) {
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try {
      TypedValue typedValue = typedArray.peekValue(0);
      if (typedValue == null) {
        typedArray.recycle();
        return paramColorStateList;
      } 
      paramInt = typedValue.type;
      if (paramInt >= 28 && paramInt <= 31) {
        ColorStateList colorStateList1 = w(paramContext, typedValue.data);
        typedArray.recycle();
        return colorStateList1;
      } 
    } finally {}
    ColorStateList colorStateList = typedArray.getColorStateList(0);
    if (colorStateList != null) {
      typedArray.recycle();
      return colorStateList;
    } 
    typedArray.recycle();
    return paramColorStateList;
  }
  
  public static int i(de1 paramde1, f51 paramf51, View paramView1, View paramView2, a parama, boolean paramBoolean) {
    if (parama.G() == 0 || paramde1.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return Math.abs(a.R(paramView1) - a.R(paramView2)) + 1; 
    int i = paramf51.d(paramView2);
    int j = paramf51.g(paramView1);
    return Math.min(paramf51.n(), i - j);
  }
  
  public static boolean i0(Context paramContext, int paramInt, boolean paramBoolean) {
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try {
      paramBoolean = typedArray.getBoolean(0, paramBoolean);
      return paramBoolean;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int j(de1 paramde1, f51 paramf51, View paramView1, View paramView2, a parama, boolean paramBoolean1, boolean paramBoolean2) {
    if (parama.G() == 0 || paramde1.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    int j = Math.min(a.R(paramView1), a.R(paramView2));
    int i = Math.max(a.R(paramView1), a.R(paramView2));
    if (paramBoolean2) {
      i = Math.max(0, paramde1.b() - i - 1);
    } else {
      i = Math.max(0, j);
    } 
    if (!paramBoolean1)
      return i; 
    int k = Math.abs(paramf51.d(paramView2) - paramf51.g(paramView1));
    j = Math.abs(a.R(paramView1) - a.R(paramView2));
    float f = k / (j + 1);
    return Math.round(i * f + (paramf51.m() - paramf51.g(paramView1)));
  }
  
  public static int j0(Context paramContext, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt1 });
    try {
      paramInt1 = typedArray.getColor(0, paramInt2);
      return paramInt1;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int k(de1 paramde1, f51 paramf51, View paramView1, View paramView2, a parama, boolean paramBoolean) {
    if (parama.G() == 0 || paramde1.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return paramde1.b(); 
    int i = paramf51.d(paramView2);
    int j = paramf51.g(paramView1);
    int k = Math.abs(a.R(paramView1) - a.R(paramView2));
    return (int)((i - j) / (k + 1) * paramde1.b());
  }
  
  public static Drawable k0(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try {
      return typedArray.getDrawable(0);
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static final qg1 l(Throwable paramThrowable) {
    paramThrowable.getClass();
    return new qg1(paramThrowable);
  }
  
  public static re0 l0(Context paramContext, int paramInt, re0 paramre0) {
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try {
      paramInt = paramre0.ordinal();
      if (paramInt != 1) {
        if (paramInt != 2) {
          paramInt = 0;
        } else {
          paramInt = 2;
        } 
      } else {
        paramInt = 1;
      } 
      paramInt = typedArray.getInt(0, paramInt);
      if (paramInt != 1) {
        if (paramInt != 2) {
          paramre0 = re0.b;
          typedArray.recycle();
          return paramre0;
        } 
        paramre0 = re0.e;
        typedArray.recycle();
        return paramre0;
      } 
    } finally {}
    paramre0 = re0.c;
    typedArray.recycle();
    return paramre0;
  }
  
  public static void p0(Preference paramPreference, String paramString) {
    if (paramString != null) {
      StringBuilder stringBuilder;
      Context context = MyApplication.i.getApplicationContext();
      if (paramString.equals("k_b_mmpsb")) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(context.getString(2131887363));
        stringBuilder.append(" ");
        stringBuilder.append(context.getString(2131886842));
        paramPreference.B(stringBuilder.toString());
        return;
      } 
      if (stringBuilder.equals("k_b_msflcpbt")) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(context.getString(2131886128));
        stringBuilder.append(" ");
        stringBuilder.append(context.getString(2131887182));
        stringBuilder.append(", ");
        stringBuilder.append(context.getString(2131887395));
        stringBuilder.append(", ");
        stringBuilder.append(context.getString(2131886556));
        paramPreference.B(stringBuilder.toString());
        return;
      } 
      if (stringBuilder.equals("k_b_accf")) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(context.getString(2131886357));
        stringBuilder.append(", ");
        stringBuilder.append(context.getString(2131887290));
        paramPreference.B(stringBuilder.toString());
      } 
    } 
  }
  
  public static final boolean q(String paramString1, String paramString2) {
    paramString1.getClass();
    if (paramString1.equals(paramString2))
      return true; 
    if (paramString1.length() != 0) {
      byte b = 0;
      int i = 0;
      for (int j = i; b < paramString1.length(); j++) {
        char c = paramString1.charAt(b);
        if (!j && c != '(')
          // Byte code: goto -> 147 
        if (c != '(') {
          if (c == ')') {
            int k = i - 1;
            i = k;
            if (k == 0) {
              i = k;
              if (j != paramString1.length() - 1)
                // Byte code: goto -> 147 
            } 
          } 
        } else {
          i++;
        } 
        b++;
      } 
      if (i == 0)
        return ui0.c(gq1.Q0(paramString1.substring(1, paramString1.length() - 1)).toString(), paramString2); 
    } 
    return false;
  }
  
  public static ko1 q0(Context paramContext) {
    WeakReference<ko1> weakReference = k;
    if (weakReference != null) {
      ko1 ko1 = weakReference.get();
    } else {
      weakReference = null;
    } 
    if (weakReference == null) {
      ko1 ko1 = z51.e(paramContext);
      k = new WeakReference<ko1>(ko1);
      return ko1;
    } 
    return (ko1)weakReference;
  }
  
  public static final void r0(Object paramObject) {
    if (!(paramObject instanceof qg1))
      return; 
    throw ((qg1)paramObject).b;
  }
  
  public static int s0(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(16973825, new int[] { paramInt });
    paramInt = typedArray.getResourceId(0, -1);
    typedArray.recycle();
    return paramInt;
  }
  
  public static s51 t(vc1 paramvc1, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iflt -> 196
    //   4: iload_1
    //   5: ldc_w 65535
    //   8: if_icmpgt -> 196
    //   11: aload_0
    //   12: invokevirtual size : ()J
    //   15: lstore #5
    //   17: lload #5
    //   19: ldc2_w 22
    //   22: lcmp
    //   23: ifge -> 29
    //   26: goto -> 158
    //   29: iload_1
    //   30: i2l
    //   31: lload #5
    //   33: ldc2_w 22
    //   36: lsub
    //   37: invokestatic min : (JJ)J
    //   40: l2i
    //   41: bipush #22
    //   43: iadd
    //   44: istore_1
    //   45: lload #5
    //   47: iload_1
    //   48: i2l
    //   49: lsub
    //   50: lstore #5
    //   52: aload_0
    //   53: iload_1
    //   54: lload #5
    //   56: invokevirtual c : (IJ)Ljava/nio/ByteBuffer;
    //   59: astore_0
    //   60: aload_0
    //   61: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   64: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   67: pop
    //   68: aload_0
    //   69: invokestatic c : (Ljava/nio/ByteBuffer;)V
    //   72: aload_0
    //   73: invokevirtual capacity : ()I
    //   76: istore_1
    //   77: iload_1
    //   78: bipush #22
    //   80: if_icmpge -> 88
    //   83: iconst_m1
    //   84: istore_1
    //   85: goto -> 153
    //   88: iload_1
    //   89: bipush #22
    //   91: isub
    //   92: istore #4
    //   94: iload #4
    //   96: ldc_w 65535
    //   99: invokestatic min : (II)I
    //   102: istore_3
    //   103: iconst_0
    //   104: istore_1
    //   105: iload_1
    //   106: iload_3
    //   107: if_icmpgt -> 83
    //   110: iload #4
    //   112: iload_1
    //   113: isub
    //   114: istore_2
    //   115: aload_0
    //   116: iload_2
    //   117: invokevirtual getInt : (I)I
    //   120: ldc_w 101010256
    //   123: if_icmpne -> 147
    //   126: aload_0
    //   127: iload_2
    //   128: bipush #20
    //   130: iadd
    //   131: invokevirtual getShort : (I)S
    //   134: ldc_w 65535
    //   137: iand
    //   138: iload_1
    //   139: if_icmpne -> 147
    //   142: iload_2
    //   143: istore_1
    //   144: goto -> 153
    //   147: iinc #1, 1
    //   150: goto -> 105
    //   153: iload_1
    //   154: iconst_m1
    //   155: if_icmpne -> 160
    //   158: aconst_null
    //   159: areturn
    //   160: aload_0
    //   161: iload_1
    //   162: invokevirtual position : (I)Ljava/nio/Buffer;
    //   165: pop
    //   166: aload_0
    //   167: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   170: astore_0
    //   171: aload_0
    //   172: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   175: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   178: pop
    //   179: new s51
    //   182: dup
    //   183: aload_0
    //   184: lload #5
    //   186: iload_1
    //   187: i2l
    //   188: ladd
    //   189: invokestatic valueOf : (J)Ljava/lang/Long;
    //   192: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   195: areturn
    //   196: ldc_w 'maxCommentSize: '
    //   199: iload_1
    //   200: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   203: invokestatic l : (Ljava/lang/String;)V
    //   206: aconst_null
    //   207: areturn
  }
  
  public static final String u(Collection paramCollection) {
    paramCollection.getClass();
    return !paramCollection.isEmpty() ? hq1.A0(nm.p0(paramCollection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
  }
  
  public static ms v(ms paramms, ns paramns) {
    paramns.getClass();
    return ui0.c(paramms.getKey(), paramns) ? paramms : null;
  }
  
  public static ColorStateList w(Context paramContext, int paramInt) {
    int j = j0(paramContext, 16842806, 0);
    int i = paramInt;
    if (paramInt == 0)
      i = j; 
    paramInt = b(i, 0.4F);
    return new ColorStateList(new int[][] { { -16842910 }, , {} }, new int[] { paramInt, i });
  }
  
  public static int x(Context paramContext, int paramInt1, int paramInt2) {
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt1, typedValue, true);
    return (typedValue.resourceId != 0) ? paramInt1 : paramInt2;
  }
  
  public static int y(ContextThemeWrapper paramContextThemeWrapper) {
    int i;
    TypedValue typedValue = new TypedValue();
    paramContextThemeWrapper.getTheme().resolveAttribute(2130968930, typedValue, true);
    if (typedValue.resourceId != 0) {
      i = paramContextThemeWrapper.getResources().getColor(typedValue.resourceId);
    } else {
      i = typedValue.data;
    } 
    return (jn.d(-1, i) >= 3.0D) ? -1 : -570425344;
  }
  
  public abstract hu B0();
  
  public abstract hu C0();
  
  public abstract hu D0();
  
  public abstract g20 E0();
  
  public abstract long F0();
  
  public abstract hv G();
  
  public abstract hu H();
  
  public abstract g20 I();
  
  public abstract hu K();
  
  public abstract hu L();
  
  public abstract g20 M();
  
  public abstract g20 S();
  
  public abstract hu T();
  
  public abstract hu U();
  
  public abstract hu W();
  
  public abstract hu X();
  
  public abstract g20 Y();
  
  public abstract hu Z();
  
  public abstract g20 a0();
  
  public abstract g20 d();
  
  public abstract hu e();
  
  public abstract hu g();
  
  public abstract hu h();
  
  public abstract hu m();
  
  public abstract hu m0();
  
  public abstract hu n();
  
  public abstract hu n0();
  
  public abstract hu o();
  
  public abstract g20 o0();
  
  public abstract g20 p();
  
  public abstract hu r();
  
  public abstract g20 s();
  
  public abstract hu t0();
  
  public abstract g20 u0();
  
  public abstract hu v0();
  
  public abstract hu w0();
  
  public abstract g20 x0();
  
  public abstract dd1 y0();
  
  public abstract long z(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public abstract dd1 z0(hv paramhv);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */