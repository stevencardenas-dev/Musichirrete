import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public class tk0 implements Closeable {
  public final Reader b;
  
  public final char[] c = new char[1024];
  
  public int e = 0;
  
  public int f = 0;
  
  public int g = 0;
  
  public int h = 0;
  
  public int i = 0;
  
  public long j;
  
  public int k;
  
  public String l;
  
  public int[] m;
  
  public int n;
  
  public String[] o;
  
  public int[] p;
  
  public int q = 2;
  
  static {
    zb0.c = new zb0(2);
  }
  
  public tk0(Reader paramReader) {
    int[] arrayOfInt = new int[32];
    this.m = arrayOfInt;
    this.n = 1;
    arrayOfInt[0] = 6;
    this.o = new String[32];
    this.p = new int[32];
    this.b = paramReader;
  }
  
  public final String A() {
    String str;
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 10) {
      str = B();
    } else if (i == 8) {
      str = z('\'');
    } else if (i == 9) {
      str = z('"');
    } else if (i == 11) {
      str = this.l;
      this.l = null;
    } else if (i == 15) {
      str = Long.toString(this.j);
    } else {
      if (i == 16) {
        i = this.e;
        j = this.k;
        str = new String(this.c, i, j);
        this.e += this.k;
        this.i = 0;
        int[] arrayOfInt1 = this.p;
        i = this.n - 1;
        arrayOfInt1[i] = arrayOfInt1[i] + 1;
        return str;
      } 
      throw P("a string");
    } 
    this.i = 0;
    int[] arrayOfInt = this.p;
    i = this.n - 1;
    arrayOfInt[i] = arrayOfInt[i] + 1;
    return str;
  }
  
  public final String B() {
    int i;
    StringBuilder stringBuilder1;
    String str;
    char[] arrayOfChar;
    StringBuilder stringBuilder2 = null;
    int j = 0;
    while (true) {
      i = 0;
      while (true) {
        int m = this.e + i;
        int k = this.f;
        arrayOfChar = this.c;
        if (m < k) {
          k = arrayOfChar[m];
          if (k != 9 && k != 10 && k != 12 && k != 13 && k != 32)
            if (k != 35) {
              if (k != 44)
                if (k != 47 && k != 61) {
                  if (k != 123 && k != 125 && k != 58)
                    if (k != 59) {
                      switch (k) {
                        default:
                          i++;
                          continue;
                        case 92:
                          d();
                          break;
                        case 91:
                        case 93:
                          break;
                      } 
                    } else {
                    
                    }  
                } else {
                
                }  
            } else {
            
            }  
        } else if (i < arrayOfChar.length) {
          if (l(i + 1))
            continue; 
        } else {
          StringBuilder stringBuilder = stringBuilder2;
          if (stringBuilder2 == null)
            stringBuilder = new StringBuilder(Math.max(i, 16)); 
          stringBuilder.append(arrayOfChar, this.e, i);
          this.e += i;
          stringBuilder2 = stringBuilder;
          break;
        } 
        stringBuilder1 = stringBuilder2;
        break;
      } 
      if (!l(1)) {
        i = j;
        break;
      } 
    } 
    j = this.e;
    if (stringBuilder1 == null) {
      str = new String(arrayOfChar, j, i);
    } else {
      str.append(arrayOfChar, j, i);
      str = str.toString();
    } 
    this.e += i;
    return str;
  }
  
  public final int C() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    switch (i) {
      default:
        throw new AssertionError();
      case 17:
        return 10;
      case 15:
      case 16:
        return 7;
      case 12:
      case 13:
      case 14:
        return 5;
      case 8:
      case 9:
      case 10:
      case 11:
        return 6;
      case 7:
        return 9;
      case 5:
      case 6:
        return 8;
      case 4:
        return 2;
      case 3:
        return 1;
      case 2:
        return 4;
      case 1:
        break;
    } 
    return 3;
  }
  
  public final void D(int paramInt) {
    int i = this.n;
    if (i - 1 < 255) {
      int[] arrayOfInt = this.m;
      if (i == arrayOfInt.length) {
        i *= 2;
        this.m = Arrays.copyOf(arrayOfInt, i);
        this.p = Arrays.copyOf(this.p, i);
        this.o = Arrays.<String>copyOf(this.o, i);
      } 
      arrayOfInt = this.m;
      i = this.n;
      this.n = i + 1;
      arrayOfInt[i] = paramInt;
      return;
    } 
    throw new IOException("Nesting limit 255 reached".concat(q()));
  }
  
  public final char E() {
    if (this.e != this.f || l(1)) {
      int i = this.e;
      int j = i + 1;
      this.e = j;
      char[] arrayOfChar = this.c;
      char c = arrayOfChar[i];
      if (c != '\n') {
        if (c != '"') {
          if (c != '\'') {
            if (c != '/' && c != '\\') {
              if (c != 'b') {
                if (c != 'f') {
                  if (c != 'n') {
                    if (c != 'r') {
                      if (c != 't') {
                        if (c == 'u') {
                          if (i + 5 <= this.f || l(4)) {
                            int k = this.e;
                            j = 0;
                            i = k;
                            while (true) {
                              int m = i;
                              if (m < k + 4) {
                                i = arrayOfChar[m];
                                if (i >= 48 && i <= 57) {
                                  i -= 48;
                                } else if (i >= 97 && i <= 102) {
                                  i -= 87;
                                } else if (i >= 65) {
                                  if (i <= 70) {
                                    i -= 55;
                                  } else {
                                    continue;
                                  } 
                                } else {
                                  N("Malformed Unicode escape \\u".concat(new String(arrayOfChar, this.e, 4)));
                                  throw null;
                                } 
                                j = i + (j << 4);
                                i = m + 1;
                                continue;
                              } 
                              this.e += 4;
                              return (char)j;
                            } 
                          } 
                          N("Unterminated escape sequence");
                          throw null;
                        } 
                        N(PwbbJfsdcHrAjW.FhfRm);
                        throw null;
                      } 
                      return '\t';
                    } 
                    return '\r';
                  } 
                  return '\n';
                } 
                return '\f';
              } 
              return '\b';
            } 
            return c;
          } 
        } else {
          return c;
        } 
      } else if (this.q != 3) {
        this.g++;
        this.h = j;
      } else {
        N("Cannot escape a newline character in strict mode");
        throw null;
      } 
      if (this.q == 3) {
        N("Invalid escaped character \"'\" in strict mode");
        throw null;
      } 
      return c;
    } 
    N("Unterminated escape sequence");
    throw null;
  }
  
  public final void F(int paramInt) {
    if (paramInt != 0) {
      this.q = paramInt;
      return;
    } 
    throw null;
  }
  
  public final void G(char paramChar) {
    while (true) {
      int i = this.e;
      int j = this.f;
      while (i < j) {
        int k = i + 1;
        i = this.c[i];
        if (i == paramChar) {
          this.e = k;
          return;
        } 
        if (i == 92) {
          this.e = k;
          E();
          i = this.e;
          j = this.f;
          continue;
        } 
        if (i == 10) {
          this.g++;
          this.h = k;
        } 
        i = k;
      } 
      this.e = i;
      if (l(1))
        continue; 
      N("Unterminated string");
      throw null;
    } 
  }
  
  public final void H() {
    while (this.e < this.f || l(1)) {
      int j = this.e;
      int i = j + 1;
      this.e = i;
      j = this.c[j];
      if (j == 10) {
        this.g++;
        this.h = i;
        return;
      } 
      if (j == 13)
        break; 
    } 
  }
  
  public final void J() {
    do {
      byte b = 0;
      while (true) {
        int i = this.e + b;
        if (i < this.f) {
          i = this.c[i];
          if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32)
            if (i != 35) {
              if (i != 44)
                if (i != 47 && i != 61) {
                  if (i != 123 && i != 125 && i != 58)
                    if (i != 59) {
                      switch (i) {
                        default:
                          b++;
                          continue;
                        case 92:
                          d();
                          break;
                        case 91:
                        case 93:
                          break;
                      } 
                    } else {
                    
                    }  
                } else {
                
                }  
            } else {
            
            }  
          this.e += b;
          return;
        } 
        this.e = i;
        break;
      } 
    } while (l(1));
  }
  
  public final void K() {
    int i = 0;
    while (true) {
      int k = this.i;
      int j = k;
      if (k == 0)
        j = g(); 
      switch (j) {
        default:
          j = i;
          break;
        case 17:
          return;
        case 16:
          this.e += this.k;
          j = i;
          break;
        case 14:
          J();
          j = i;
          if (!i) {
            this.o[this.n - 1] = "<skipped>";
            j = i;
          } 
          break;
        case 13:
          G('"');
          j = i;
          if (!i) {
            this.o[this.n - 1] = "<skipped>";
            j = i;
          } 
          break;
        case 12:
          G('\'');
          j = i;
          if (!i) {
            this.o[this.n - 1] = "<skipped>";
            j = i;
          } 
          break;
        case 10:
          J();
          j = i;
          break;
        case 9:
          G('"');
          j = i;
          break;
        case 8:
          G('\'');
          j = i;
          break;
        case 4:
          this.n--;
          j = i - 1;
          break;
        case 3:
          D(1);
          j = i + 1;
          break;
        case 2:
          if (i == 0)
            this.o[this.n - 1] = null; 
          this.n--;
          j = i - 1;
          break;
        case 1:
          D(3);
          j = i + 1;
          break;
      } 
      this.i = 0;
      i = j;
      if (j <= 0) {
        int[] arrayOfInt = this.p;
        j = this.n - 1;
        arrayOfInt[j] = arrayOfInt[j] + 1;
        return;
      } 
    } 
  }
  
  public final void N(String paramString) {
    StringBuilder stringBuilder = x41.p(paramString);
    stringBuilder.append(q());
    stringBuilder.append("\nSee ");
    stringBuilder.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    throw new IOException(stringBuilder.toString());
  }
  
  public final IllegalStateException P(String paramString) {
    String str;
    if (C() == 9) {
      str = "adapter-not-null-safe";
    } else {
      str = "unexpected-json-structure";
    } 
    StringBuilder stringBuilder = x41.q("Expected ", paramString, " but was ");
    stringBuilder.append(x41.z(C()));
    stringBuilder.append(q());
    stringBuilder.append("\nSee ");
    stringBuilder.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str));
    return new IllegalStateException(stringBuilder.toString());
  }
  
  public final void Q(String paramString) {
    byte b = 0;
    while (b < paramString.length()) {
      if (paramString.charAt(b) <= '') {
        b++;
        continue;
      } 
      N("String contains non-ASCII characters: ".concat(paramString));
      throw null;
    } 
  }
  
  public final void a() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 3) {
      D(1);
      this.p[this.n - 1] = 0;
      this.i = 0;
      return;
    } 
    throw P("BEGIN_ARRAY");
  }
  
  public final void c() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 1) {
      D(3);
      this.i = 0;
      return;
    } 
    throw P(tlzLOCPTHRhep.qhLqCnRl);
  }
  
  public final void close() {
    this.i = 0;
    this.m[0] = 8;
    this.n = 1;
    this.b.close();
  }
  
  public final void d() {
    if (this.q == 1)
      return; 
    N("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    throw null;
  }
  
  public final int g() {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : [I
    //   4: astore #14
    //   6: aload_0
    //   7: getfield n : I
    //   10: iconst_1
    //   11: isub
    //   12: istore_3
    //   13: aload #14
    //   15: iload_3
    //   16: iaload
    //   17: istore_2
    //   18: aload_0
    //   19: getfield c : [C
    //   22: astore #16
    //   24: iload_2
    //   25: iconst_1
    //   26: if_icmpne -> 37
    //   29: aload #14
    //   31: iload_3
    //   32: iconst_2
    //   33: iastore
    //   34: goto -> 368
    //   37: iload_2
    //   38: iconst_2
    //   39: if_icmpne -> 88
    //   42: aload_0
    //   43: iconst_1
    //   44: invokevirtual x : (Z)I
    //   47: istore_3
    //   48: iload_3
    //   49: bipush #44
    //   51: if_icmpeq -> 368
    //   54: iload_3
    //   55: bipush #59
    //   57: if_icmpeq -> 81
    //   60: iload_3
    //   61: bipush #93
    //   63: if_icmpne -> 73
    //   66: aload_0
    //   67: iconst_4
    //   68: putfield i : I
    //   71: iconst_4
    //   72: ireturn
    //   73: aload_0
    //   74: ldc 'Unterminated array'
    //   76: invokevirtual N : (Ljava/lang/String;)V
    //   79: aconst_null
    //   80: athrow
    //   81: aload_0
    //   82: invokevirtual d : ()V
    //   85: goto -> 368
    //   88: iload_2
    //   89: iconst_3
    //   90: if_icmpeq -> 98
    //   93: iload_2
    //   94: iconst_5
    //   95: if_icmpne -> 101
    //   98: goto -> 1316
    //   101: iload_2
    //   102: iconst_4
    //   103: if_icmpne -> 184
    //   106: aload #14
    //   108: iload_3
    //   109: iconst_5
    //   110: iastore
    //   111: aload_0
    //   112: iconst_1
    //   113: invokevirtual x : (Z)I
    //   116: istore_3
    //   117: iload_3
    //   118: bipush #58
    //   120: if_icmpeq -> 368
    //   123: iload_3
    //   124: bipush #61
    //   126: if_icmpne -> 176
    //   129: aload_0
    //   130: invokevirtual d : ()V
    //   133: aload_0
    //   134: getfield e : I
    //   137: aload_0
    //   138: getfield f : I
    //   141: if_icmplt -> 152
    //   144: aload_0
    //   145: iconst_1
    //   146: invokevirtual l : (I)Z
    //   149: ifeq -> 368
    //   152: aload_0
    //   153: getfield e : I
    //   156: istore_3
    //   157: aload #16
    //   159: iload_3
    //   160: caload
    //   161: bipush #62
    //   163: if_icmpne -> 368
    //   166: aload_0
    //   167: iload_3
    //   168: iconst_1
    //   169: iadd
    //   170: putfield e : I
    //   173: goto -> 368
    //   176: aload_0
    //   177: ldc 'Expected ':''
    //   179: invokevirtual N : (Ljava/lang/String;)V
    //   182: aconst_null
    //   183: athrow
    //   184: iload_2
    //   185: bipush #6
    //   187: if_icmpne -> 321
    //   190: aload_0
    //   191: getfield q : I
    //   194: iconst_1
    //   195: if_icmpne -> 305
    //   198: aload_0
    //   199: iconst_1
    //   200: invokevirtual x : (Z)I
    //   203: pop
    //   204: aload_0
    //   205: getfield e : I
    //   208: istore_3
    //   209: aload_0
    //   210: iload_3
    //   211: iconst_1
    //   212: isub
    //   213: putfield e : I
    //   216: iload_3
    //   217: iconst_4
    //   218: iadd
    //   219: aload_0
    //   220: getfield f : I
    //   223: if_icmple -> 237
    //   226: aload_0
    //   227: iconst_5
    //   228: invokevirtual l : (I)Z
    //   231: ifne -> 237
    //   234: goto -> 305
    //   237: aload_0
    //   238: getfield e : I
    //   241: istore_3
    //   242: aload #16
    //   244: iload_3
    //   245: caload
    //   246: bipush #41
    //   248: if_icmpne -> 305
    //   251: aload #16
    //   253: iload_3
    //   254: iconst_1
    //   255: iadd
    //   256: caload
    //   257: bipush #93
    //   259: if_icmpne -> 305
    //   262: aload #16
    //   264: iload_3
    //   265: iconst_2
    //   266: iadd
    //   267: caload
    //   268: bipush #125
    //   270: if_icmpne -> 305
    //   273: aload #16
    //   275: iload_3
    //   276: iconst_3
    //   277: iadd
    //   278: caload
    //   279: bipush #39
    //   281: if_icmpne -> 305
    //   284: aload #16
    //   286: iload_3
    //   287: iconst_4
    //   288: iadd
    //   289: caload
    //   290: bipush #10
    //   292: if_icmpeq -> 298
    //   295: goto -> 305
    //   298: aload_0
    //   299: iload_3
    //   300: iconst_5
    //   301: iadd
    //   302: putfield e : I
    //   305: aload_0
    //   306: getfield m : [I
    //   309: aload_0
    //   310: getfield n : I
    //   313: iconst_1
    //   314: isub
    //   315: bipush #7
    //   317: iastore
    //   318: goto -> 368
    //   321: iload_2
    //   322: bipush #7
    //   324: if_icmpne -> 362
    //   327: aload_0
    //   328: iconst_0
    //   329: invokevirtual x : (Z)I
    //   332: iconst_m1
    //   333: if_icmpne -> 345
    //   336: aload_0
    //   337: bipush #17
    //   339: putfield i : I
    //   342: bipush #17
    //   344: ireturn
    //   345: aload_0
    //   346: invokevirtual d : ()V
    //   349: aload_0
    //   350: aload_0
    //   351: getfield e : I
    //   354: iconst_1
    //   355: isub
    //   356: putfield e : I
    //   359: goto -> 368
    //   362: iload_2
    //   363: bipush #8
    //   365: if_icmpeq -> 1308
    //   368: aload_0
    //   369: iconst_1
    //   370: invokevirtual x : (Z)I
    //   373: istore_3
    //   374: iload_3
    //   375: bipush #34
    //   377: if_icmpeq -> 1299
    //   380: iload_3
    //   381: bipush #39
    //   383: if_icmpeq -> 1286
    //   386: iload_3
    //   387: bipush #44
    //   389: if_icmpeq -> 1241
    //   392: iload_3
    //   393: bipush #59
    //   395: if_icmpeq -> 1241
    //   398: iload_3
    //   399: bipush #91
    //   401: if_icmpeq -> 1234
    //   404: iload_3
    //   405: bipush #93
    //   407: if_icmpeq -> 1222
    //   410: iload_3
    //   411: bipush #123
    //   413: if_icmpeq -> 1215
    //   416: aload_0
    //   417: getfield e : I
    //   420: iconst_1
    //   421: isub
    //   422: istore_2
    //   423: aload_0
    //   424: iload_2
    //   425: putfield e : I
    //   428: aload #16
    //   430: iload_2
    //   431: caload
    //   432: istore_2
    //   433: iload_2
    //   434: bipush #116
    //   436: if_icmpeq -> 513
    //   439: iload_2
    //   440: bipush #84
    //   442: if_icmpne -> 448
    //   445: goto -> 513
    //   448: iload_2
    //   449: bipush #102
    //   451: if_icmpeq -> 497
    //   454: iload_2
    //   455: bipush #70
    //   457: if_icmpne -> 463
    //   460: goto -> 497
    //   463: iload_2
    //   464: bipush #110
    //   466: if_icmpeq -> 483
    //   469: iload_2
    //   470: bipush #78
    //   472: if_icmpne -> 478
    //   475: goto -> 483
    //   478: iconst_0
    //   479: istore_2
    //   480: goto -> 696
    //   483: ldc 'null'
    //   485: astore #14
    //   487: ldc 'NULL'
    //   489: astore #15
    //   491: bipush #7
    //   493: istore_2
    //   494: goto -> 525
    //   497: getstatic me/zhanghai/android/materialprogressbar/internal/pozR/kOkiWEITVb.zdeemuVWbNF : Ljava/lang/String;
    //   500: astore #14
    //   502: ldc_w 'FALSE'
    //   505: astore #15
    //   507: bipush #6
    //   509: istore_2
    //   510: goto -> 525
    //   513: ldc_w 'true'
    //   516: astore #14
    //   518: ldc_w 'TRUE'
    //   521: astore #15
    //   523: iconst_5
    //   524: istore_2
    //   525: aload_0
    //   526: getfield q : I
    //   529: iconst_3
    //   530: if_icmpeq -> 538
    //   533: iconst_1
    //   534: istore_3
    //   535: goto -> 540
    //   538: iconst_0
    //   539: istore_3
    //   540: aload #14
    //   542: invokevirtual length : ()I
    //   545: istore #5
    //   547: iconst_0
    //   548: istore #4
    //   550: aload_0
    //   551: getfield e : I
    //   554: istore #6
    //   556: aload_0
    //   557: getfield f : I
    //   560: istore #7
    //   562: iload #4
    //   564: iload #5
    //   566: if_icmpge -> 639
    //   569: iload #6
    //   571: iload #4
    //   573: iadd
    //   574: iload #7
    //   576: if_icmplt -> 593
    //   579: aload_0
    //   580: iload #4
    //   582: iconst_1
    //   583: iadd
    //   584: invokevirtual l : (I)Z
    //   587: ifne -> 593
    //   590: goto -> 478
    //   593: aload #16
    //   595: aload_0
    //   596: getfield e : I
    //   599: iload #4
    //   601: iadd
    //   602: caload
    //   603: istore #6
    //   605: iload #6
    //   607: aload #14
    //   609: iload #4
    //   611: invokevirtual charAt : (I)C
    //   614: if_icmpeq -> 633
    //   617: iload_3
    //   618: ifeq -> 478
    //   621: iload #6
    //   623: aload #15
    //   625: iload #4
    //   627: invokevirtual charAt : (I)C
    //   630: if_icmpne -> 478
    //   633: iinc #4, 1
    //   636: goto -> 550
    //   639: iload #6
    //   641: iload #5
    //   643: iadd
    //   644: iload #7
    //   646: if_icmplt -> 660
    //   649: aload_0
    //   650: iload #5
    //   652: iconst_1
    //   653: iadd
    //   654: invokevirtual l : (I)Z
    //   657: ifeq -> 680
    //   660: aload_0
    //   661: aload #16
    //   663: aload_0
    //   664: getfield e : I
    //   667: iload #5
    //   669: iadd
    //   670: caload
    //   671: invokevirtual p : (C)Z
    //   674: ifeq -> 680
    //   677: goto -> 478
    //   680: aload_0
    //   681: aload_0
    //   682: getfield e : I
    //   685: iload #5
    //   687: iadd
    //   688: putfield e : I
    //   691: aload_0
    //   692: iload_2
    //   693: putfield i : I
    //   696: iload_2
    //   697: ifeq -> 702
    //   700: iload_2
    //   701: ireturn
    //   702: aload_0
    //   703: getfield e : I
    //   706: istore #9
    //   708: aload_0
    //   709: getfield f : I
    //   712: istore #8
    //   714: iconst_1
    //   715: istore_3
    //   716: iconst_0
    //   717: istore #4
    //   719: lconst_0
    //   720: lstore #10
    //   722: iconst_0
    //   723: istore #7
    //   725: iconst_0
    //   726: istore_2
    //   727: iload #9
    //   729: istore #6
    //   731: iload #8
    //   733: istore #5
    //   735: iload #9
    //   737: iload #4
    //   739: iadd
    //   740: iload #8
    //   742: if_icmpne -> 784
    //   745: iload #4
    //   747: aload #16
    //   749: arraylength
    //   750: if_icmpne -> 758
    //   753: iconst_0
    //   754: istore_2
    //   755: goto -> 1173
    //   758: aload_0
    //   759: iload #4
    //   761: iconst_1
    //   762: iadd
    //   763: invokevirtual l : (I)Z
    //   766: ifne -> 772
    //   769: goto -> 986
    //   772: aload_0
    //   773: getfield e : I
    //   776: istore #6
    //   778: aload_0
    //   779: getfield f : I
    //   782: istore #5
    //   784: aload #16
    //   786: iload #6
    //   788: iload #4
    //   790: iadd
    //   791: caload
    //   792: istore_1
    //   793: iload_1
    //   794: bipush #43
    //   796: if_icmpeq -> 1151
    //   799: iload_1
    //   800: bipush #69
    //   802: if_icmpeq -> 1136
    //   805: iload_1
    //   806: bipush #101
    //   808: if_icmpeq -> 1136
    //   811: iload_1
    //   812: bipush #45
    //   814: if_icmpeq -> 1113
    //   817: iload_1
    //   818: bipush #46
    //   820: if_icmpeq -> 1103
    //   823: iload_1
    //   824: bipush #48
    //   826: if_icmplt -> 835
    //   829: iload_1
    //   830: bipush #57
    //   832: if_icmple -> 838
    //   835: goto -> 975
    //   838: iload_2
    //   839: iconst_1
    //   840: if_icmpeq -> 962
    //   843: iload_2
    //   844: ifne -> 850
    //   847: goto -> 962
    //   850: iload_2
    //   851: iconst_2
    //   852: if_icmpne -> 929
    //   855: lload #10
    //   857: lconst_0
    //   858: lcmp
    //   859: ifne -> 865
    //   862: goto -> 753
    //   865: ldc2_w 10
    //   868: lload #10
    //   870: lmul
    //   871: iload_1
    //   872: bipush #48
    //   874: isub
    //   875: i2l
    //   876: lsub
    //   877: lstore #12
    //   879: lload #10
    //   881: ldc2_w -922337203685477580
    //   884: lcmp
    //   885: istore #8
    //   887: iload #8
    //   889: ifgt -> 914
    //   892: iload #8
    //   894: ifne -> 908
    //   897: lload #12
    //   899: lload #10
    //   901: lcmp
    //   902: ifge -> 908
    //   905: goto -> 914
    //   908: iconst_0
    //   909: istore #8
    //   911: goto -> 917
    //   914: iconst_1
    //   915: istore #8
    //   917: iload_3
    //   918: iload #8
    //   920: iand
    //   921: istore_3
    //   922: lload #12
    //   924: lstore #10
    //   926: goto -> 1159
    //   929: iload_2
    //   930: iconst_3
    //   931: if_icmpne -> 939
    //   934: iconst_4
    //   935: istore_2
    //   936: goto -> 1159
    //   939: iload_2
    //   940: iconst_5
    //   941: if_icmpeq -> 956
    //   944: iload_2
    //   945: bipush #6
    //   947: if_icmpne -> 953
    //   950: goto -> 956
    //   953: goto -> 1159
    //   956: bipush #7
    //   958: istore_2
    //   959: goto -> 1159
    //   962: iload_1
    //   963: bipush #48
    //   965: isub
    //   966: ineg
    //   967: i2l
    //   968: lstore #10
    //   970: iconst_2
    //   971: istore_2
    //   972: goto -> 1159
    //   975: aload_0
    //   976: iload_1
    //   977: invokevirtual p : (C)Z
    //   980: ifne -> 753
    //   983: goto -> 769
    //   986: iload_2
    //   987: iconst_2
    //   988: if_icmpne -> 1069
    //   991: iload_3
    //   992: ifeq -> 1012
    //   995: lload #10
    //   997: ldc2_w -9223372036854775808
    //   1000: lcmp
    //   1001: ifne -> 1015
    //   1004: iload #7
    //   1006: ifeq -> 1012
    //   1009: goto -> 1015
    //   1012: goto -> 1069
    //   1015: lload #10
    //   1017: lconst_0
    //   1018: lcmp
    //   1019: ifne -> 1027
    //   1022: iload #7
    //   1024: ifne -> 1012
    //   1027: iload #7
    //   1029: ifeq -> 1035
    //   1032: goto -> 1040
    //   1035: lload #10
    //   1037: lneg
    //   1038: lstore #10
    //   1040: aload_0
    //   1041: lload #10
    //   1043: putfield j : J
    //   1046: aload_0
    //   1047: aload_0
    //   1048: getfield e : I
    //   1051: iload #4
    //   1053: iadd
    //   1054: putfield e : I
    //   1057: bipush #15
    //   1059: istore_2
    //   1060: aload_0
    //   1061: bipush #15
    //   1063: putfield i : I
    //   1066: goto -> 1173
    //   1069: iload_2
    //   1070: iconst_2
    //   1071: if_icmpeq -> 1085
    //   1074: iload_2
    //   1075: iconst_4
    //   1076: if_icmpeq -> 1085
    //   1079: iload_2
    //   1080: bipush #7
    //   1082: if_icmpne -> 753
    //   1085: aload_0
    //   1086: iload #4
    //   1088: putfield k : I
    //   1091: bipush #16
    //   1093: istore_2
    //   1094: aload_0
    //   1095: bipush #16
    //   1097: putfield i : I
    //   1100: goto -> 1173
    //   1103: iload_2
    //   1104: iconst_2
    //   1105: if_icmpne -> 753
    //   1108: iconst_3
    //   1109: istore_2
    //   1110: goto -> 1159
    //   1113: iload_2
    //   1114: ifne -> 1125
    //   1117: iconst_1
    //   1118: istore #7
    //   1120: iconst_1
    //   1121: istore_2
    //   1122: goto -> 1159
    //   1125: iload_2
    //   1126: iconst_5
    //   1127: if_icmpne -> 753
    //   1130: bipush #6
    //   1132: istore_2
    //   1133: goto -> 1159
    //   1136: iload_2
    //   1137: iconst_2
    //   1138: if_icmpeq -> 1146
    //   1141: iload_2
    //   1142: iconst_4
    //   1143: if_icmpne -> 753
    //   1146: iconst_5
    //   1147: istore_2
    //   1148: goto -> 1159
    //   1151: iload_2
    //   1152: iconst_5
    //   1153: if_icmpne -> 753
    //   1156: goto -> 1130
    //   1159: iinc #4, 1
    //   1162: iload #6
    //   1164: istore #9
    //   1166: iload #5
    //   1168: istore #8
    //   1170: goto -> 727
    //   1173: iload_2
    //   1174: ifeq -> 1179
    //   1177: iload_2
    //   1178: ireturn
    //   1179: aload_0
    //   1180: aload #16
    //   1182: aload_0
    //   1183: getfield e : I
    //   1186: caload
    //   1187: invokevirtual p : (C)Z
    //   1190: ifeq -> 1206
    //   1193: aload_0
    //   1194: invokevirtual d : ()V
    //   1197: aload_0
    //   1198: bipush #10
    //   1200: putfield i : I
    //   1203: bipush #10
    //   1205: ireturn
    //   1206: aload_0
    //   1207: ldc_w 'Expected value'
    //   1210: invokevirtual N : (Ljava/lang/String;)V
    //   1213: aconst_null
    //   1214: athrow
    //   1215: aload_0
    //   1216: iconst_1
    //   1217: putfield i : I
    //   1220: iconst_1
    //   1221: ireturn
    //   1222: iload_2
    //   1223: iconst_1
    //   1224: if_icmpne -> 1241
    //   1227: aload_0
    //   1228: iconst_4
    //   1229: putfield i : I
    //   1232: iconst_4
    //   1233: ireturn
    //   1234: aload_0
    //   1235: iconst_3
    //   1236: putfield i : I
    //   1239: iconst_3
    //   1240: ireturn
    //   1241: iload_2
    //   1242: iconst_1
    //   1243: if_icmpeq -> 1263
    //   1246: iload_2
    //   1247: iconst_2
    //   1248: if_icmpne -> 1254
    //   1251: goto -> 1263
    //   1254: aload_0
    //   1255: ldc_w 'Unexpected value'
    //   1258: invokevirtual N : (Ljava/lang/String;)V
    //   1261: aconst_null
    //   1262: athrow
    //   1263: aload_0
    //   1264: invokevirtual d : ()V
    //   1267: aload_0
    //   1268: aload_0
    //   1269: getfield e : I
    //   1272: iconst_1
    //   1273: isub
    //   1274: putfield e : I
    //   1277: aload_0
    //   1278: bipush #7
    //   1280: putfield i : I
    //   1283: bipush #7
    //   1285: ireturn
    //   1286: aload_0
    //   1287: invokevirtual d : ()V
    //   1290: aload_0
    //   1291: bipush #8
    //   1293: putfield i : I
    //   1296: bipush #8
    //   1298: ireturn
    //   1299: aload_0
    //   1300: bipush #9
    //   1302: putfield i : I
    //   1305: bipush #9
    //   1307: ireturn
    //   1308: ldc_w 'JsonReader is closed'
    //   1311: invokestatic f : (Ljava/lang/String;)V
    //   1314: iconst_0
    //   1315: ireturn
    //   1316: aload #14
    //   1318: iload_3
    //   1319: iconst_4
    //   1320: iastore
    //   1321: iload_2
    //   1322: iconst_5
    //   1323: if_icmpne -> 1370
    //   1326: aload_0
    //   1327: iconst_1
    //   1328: invokevirtual x : (Z)I
    //   1331: istore_3
    //   1332: iload_3
    //   1333: bipush #44
    //   1335: if_icmpeq -> 1370
    //   1338: iload_3
    //   1339: bipush #59
    //   1341: if_icmpeq -> 1366
    //   1344: iload_3
    //   1345: bipush #125
    //   1347: if_icmpne -> 1357
    //   1350: aload_0
    //   1351: iconst_2
    //   1352: putfield i : I
    //   1355: iconst_2
    //   1356: ireturn
    //   1357: aload_0
    //   1358: ldc_w 'Unterminated object'
    //   1361: invokevirtual N : (Ljava/lang/String;)V
    //   1364: aconst_null
    //   1365: athrow
    //   1366: aload_0
    //   1367: invokevirtual d : ()V
    //   1370: aload_0
    //   1371: iconst_1
    //   1372: invokevirtual x : (Z)I
    //   1375: istore_3
    //   1376: iload_3
    //   1377: bipush #34
    //   1379: if_icmpeq -> 1469
    //   1382: iload_3
    //   1383: bipush #39
    //   1385: if_icmpeq -> 1456
    //   1388: iload_3
    //   1389: bipush #125
    //   1391: if_icmpeq -> 1435
    //   1394: aload_0
    //   1395: invokevirtual d : ()V
    //   1398: aload_0
    //   1399: aload_0
    //   1400: getfield e : I
    //   1403: iconst_1
    //   1404: isub
    //   1405: putfield e : I
    //   1408: aload_0
    //   1409: iload_3
    //   1410: i2c
    //   1411: invokevirtual p : (C)Z
    //   1414: ifeq -> 1426
    //   1417: aload_0
    //   1418: bipush #14
    //   1420: putfield i : I
    //   1423: bipush #14
    //   1425: ireturn
    //   1426: aload_0
    //   1427: ldc_w 'Expected name'
    //   1430: invokevirtual N : (Ljava/lang/String;)V
    //   1433: aconst_null
    //   1434: athrow
    //   1435: iload_2
    //   1436: iconst_5
    //   1437: if_icmpeq -> 1447
    //   1440: aload_0
    //   1441: iconst_2
    //   1442: putfield i : I
    //   1445: iconst_2
    //   1446: ireturn
    //   1447: aload_0
    //   1448: ldc_w 'Expected name'
    //   1451: invokevirtual N : (Ljava/lang/String;)V
    //   1454: aconst_null
    //   1455: athrow
    //   1456: aload_0
    //   1457: invokevirtual d : ()V
    //   1460: aload_0
    //   1461: bipush #12
    //   1463: putfield i : I
    //   1466: bipush #12
    //   1468: ireturn
    //   1469: aload_0
    //   1470: bipush #13
    //   1472: putfield i : I
    //   1475: bipush #13
    //   1477: ireturn
  }
  
  public final void h() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 4) {
      i = this.n;
      this.n = i - 1;
      int[] arrayOfInt = this.p;
      i -= 2;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      this.i = 0;
      return;
    } 
    throw P("END_ARRAY");
  }
  
  public final void k() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 2) {
      j = this.n;
      i = j - 1;
      this.n = i;
      this.o[i] = null;
      int[] arrayOfInt = this.p;
      i = j - 2;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      this.i = 0;
      return;
    } 
    throw P("END_OBJECT");
  }
  
  public final boolean l(int paramInt) {
    int j = this.h;
    int i = this.e;
    this.h = j - i;
    j = this.f;
    char[] arrayOfChar = this.c;
    if (j != i) {
      j -= i;
      this.f = j;
      System.arraycopy(arrayOfChar, i, arrayOfChar, 0, j);
    } else {
      this.f = 0;
    } 
    this.e = 0;
    while (true) {
      j = this.f;
      i = arrayOfChar.length;
      i = this.b.read(arrayOfChar, j, i - j);
      if (i != -1) {
        j = this.f + i;
        this.f = j;
        i = paramInt;
        if (this.g == 0) {
          int k = this.h;
          i = paramInt;
          if (k == 0) {
            i = paramInt;
            if (j > 0) {
              i = paramInt;
              if (arrayOfChar[0] == '﻿') {
                this.e++;
                this.h = k + 1;
                i = paramInt + 1;
              } 
            } 
          } 
        } 
        paramInt = i;
        if (j >= i)
          return true; 
        continue;
      } 
      return false;
    } 
  }
  
  public final String m(boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder("$");
    byte b = 0;
    while (true) {
      int i = this.n;
      if (b < i) {
        int k;
        String str;
        int j = this.m[b];
        switch (j) {
          default:
            throw new AssertionError(ga1.i("Unknown scope value: ", j));
          case 3:
          case 4:
          case 5:
            stringBuilder.append('.');
            str = this.o[b];
            if (str != null)
              stringBuilder.append(str); 
            break;
          case 1:
          case 2:
            k = this.p[b];
            j = k;
            if (paramBoolean) {
              j = k;
              if (k > 0) {
                j = k;
                if (b == i - 1)
                  j = k - 1; 
              } 
            } 
            stringBuilder.append('[');
            stringBuilder.append(j);
            stringBuilder.append(']');
            break;
          case 6:
          case 7:
          case 8:
            break;
        } 
        b++;
        continue;
      } 
      return stringBuilder.toString();
    } 
  }
  
  public final boolean o() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    return (i != 2 && i != 4 && i != 17);
  }
  
  public final boolean p(char paramChar) {
    if (paramChar != '\t' && paramChar != '\n' && paramChar != '\f' && paramChar != '\r' && paramChar != ' ')
      if (paramChar != '#') {
        if (paramChar != ',')
          if (paramChar != '/' && paramChar != '=') {
            if (paramChar != '{' && paramChar != '}' && paramChar != ':')
              if (paramChar != ';') {
                switch (paramChar) {
                  default:
                    return true;
                  case '\\':
                    d();
                    break;
                  case '[':
                  case ']':
                    break;
                } 
                return false;
              }  
            return false;
          }  
        return false;
      }  
    return false;
  }
  
  public final String q() {
    int j = this.g;
    int i = this.e;
    int k = this.h;
    StringBuilder stringBuilder = new StringBuilder(" at line ");
    stringBuilder.append(j + 1);
    stringBuilder.append(" column ");
    stringBuilder.append(i - k + 1);
    stringBuilder.append(" path ");
    stringBuilder.append(m(false));
    return stringBuilder.toString();
  }
  
  public final boolean r() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 5) {
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return true;
    } 
    if (i == 6) {
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return false;
    } 
    throw P("a boolean");
  }
  
  public final double s() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 15) {
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return this.j;
    } 
    if (i == 16) {
      j = this.e;
      i = this.k;
      this.l = new String(this.c, j, i);
      this.e += this.k;
    } else if (i == 8 || i == 9) {
      byte b;
      if (i == 8) {
        b = 39;
      } else {
        b = 34;
      } 
      this.l = z(b);
    } else if (i == 10) {
      this.l = B();
    } else if (i != 11) {
      throw P("a double");
    } 
    this.i = 11;
    double d = Double.parseDouble(this.l);
    if (this.q == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
      this.l = null;
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return d;
    } 
    StringBuilder stringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
    stringBuilder.append(d);
    N(stringBuilder.toString());
    throw null;
  }
  
  public final String toString() {
    return tk0.class.getSimpleName().concat(q());
  }
  
  public final int u() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 15) {
      long l = this.j;
      j = (int)l;
      if (l == j) {
        this.i = 0;
        int[] arrayOfInt = this.p;
        i = this.n - 1;
        arrayOfInt[i] = arrayOfInt[i] + 1;
        return j;
      } 
      l = this.j;
      String str = q();
      StringBuilder stringBuilder1 = new StringBuilder("Expected an int but was ");
      stringBuilder1.append(l);
      stringBuilder1.append(str);
      throw new NumberFormatException(stringBuilder1.toString());
    } 
    if (i == 16) {
      i = this.e;
      j = this.k;
      this.l = new String(this.c, i, j);
      this.e += this.k;
    } else if (i == 8 || i == 9 || i == 10) {
      if (i == 10) {
        this.l = B();
      } else {
        byte b;
        if (i == 8) {
          b = 39;
        } else {
          b = 34;
        } 
        this.l = z(b);
      } 
      Q(this.l);
      try {
        i = Integer.parseInt(this.l);
        this.i = 0;
        int[] arrayOfInt = this.p;
        j = this.n - 1;
        arrayOfInt[j] = arrayOfInt[j] + 1;
        return i;
      } catch (NumberFormatException numberFormatException) {}
    } else {
      throw P("an int");
    } 
    this.i = 11;
    double d = Double.parseDouble(this.l);
    i = (int)d;
    if (i == d) {
      this.l = null;
      this.i = 0;
      int[] arrayOfInt = this.p;
      j = this.n - 1;
      arrayOfInt[j] = arrayOfInt[j] + 1;
      return i;
    } 
    String str1 = this.l;
    String str2 = q();
    StringBuilder stringBuilder = new StringBuilder("Expected an int but was ");
    stringBuilder.append(str1);
    stringBuilder.append(str2);
    throw new NumberFormatException(stringBuilder.toString());
  }
  
  public final long v() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 15) {
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return this.j;
    } 
    if (i == 16) {
      j = this.e;
      i = this.k;
      this.l = new String(this.c, j, i);
      this.e += this.k;
    } else if (i == 8 || i == 9 || i == 10) {
      if (i == 10) {
        this.l = B();
      } else {
        byte b;
        if (i == 8) {
          b = 39;
        } else {
          b = 34;
        } 
        this.l = z(b);
      } 
      Q(this.l);
      try {
        long l1 = Long.parseLong(this.l);
        this.i = 0;
        int[] arrayOfInt = this.p;
        i = this.n - 1;
        arrayOfInt[i] = arrayOfInt[i] + 1;
        return l1;
      } catch (NumberFormatException numberFormatException) {}
    } else {
      throw P("a long");
    } 
    this.i = 11;
    double d = Double.parseDouble(this.l);
    long l = (long)d;
    if (l == d) {
      this.l = null;
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return l;
    } 
    String str2 = this.l;
    String str1 = q();
    StringBuilder stringBuilder = new StringBuilder("Expected a long but was ");
    stringBuilder.append(str2);
    stringBuilder.append(str1);
    throw new NumberFormatException(stringBuilder.toString());
  }
  
  public final String w() {
    String str;
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 14) {
      str = B();
    } else if (i == 12) {
      str = z('\'');
    } else {
      if (i == 13) {
        str = z('"');
        this.i = 0;
        this.o[this.n - 1] = str;
        return str;
      } 
      throw P("a name");
    } 
    this.i = 0;
    this.o[this.n - 1] = str;
    return str;
  }
  
  public final int x(boolean paramBoolean) {
    int i = this.e;
    for (int j = this.f;; j = k) {
      int m = i;
      int k = j;
      if (i == j) {
        this.e = i;
        if (!l(1)) {
          if (!paramBoolean)
            return -1; 
          throw new EOFException("End of input".concat(q()));
        } 
        m = this.e;
        k = this.f;
      } 
      i = m + 1;
      char[] arrayOfChar = this.c;
      j = arrayOfChar[m];
      if (j == 10) {
        this.g++;
        this.h = i;
      } else if (j != 32 && j != 13 && j != 9) {
        if (j == 47) {
          this.e = i;
          if (i == k) {
            this.e = m;
            boolean bool = l(2);
            this.e++;
            if (!bool)
              return j; 
          } 
          d();
          k = this.e;
          i = arrayOfChar[k];
          if (i != 42) {
            if (i == 47) {
              this.e = k + 1;
              H();
              i = this.e;
              j = this.f;
              continue;
            } 
            return j;
          } 
          this.e = k + 1;
          label57: while (true) {
            if (this.e + 2 <= this.f || l(2)) {
              i = this.e;
              if (arrayOfChar[i] == '\n') {
                this.g++;
                this.h = i + 1;
                continue;
              } 
              i = 0;
              while (true) {
                j = this.e;
                if (i < 2) {
                  if (arrayOfChar[j + i] != "*/".charAt(i)) {
                    this.e++;
                    continue label57;
                  } 
                  i++;
                  continue;
                } 
                i = j + 2;
                j = this.f;
              } 
              break;
            } 
            N("Unterminated comment");
            throw null;
          } 
          break;
        } 
        if (j == 35) {
          this.e = i;
          d();
          H();
          i = this.e;
          j = this.f;
          continue;
        } 
        this.e = i;
        return j;
      } 
    } 
  }
  
  public final void y() {
    int j = this.i;
    int i = j;
    if (j == 0)
      i = g(); 
    if (i == 7) {
      this.i = 0;
      int[] arrayOfInt = this.p;
      i = this.n - 1;
      arrayOfInt[i] = arrayOfInt[i] + 1;
      return;
    } 
    throw P(RqlokDsQOju.FyIxJpC);
  }
  
  public final String z(char paramChar) {
    for (StringBuilder stringBuilder = null;; stringBuilder = stringBuilder1) {
      StringBuilder stringBuilder1;
      int i = this.e;
      int j = this.f;
      label35: while (true) {
        int k = i;
        while (true) {
          int m = k;
          char[] arrayOfChar = this.c;
          if (m < j) {
            k = m + 1;
            m = arrayOfChar[m];
            if (this.q != 3 || m >= 32) {
              if (m == paramChar) {
                this.e = k;
                int n = k - i - 1;
                if (stringBuilder == null)
                  return new String(arrayOfChar, i, n); 
                stringBuilder.append(arrayOfChar, i, n);
                return stringBuilder.toString();
              } 
              if (m == 92) {
                this.e = k;
                k -= i;
                StringBuilder stringBuilder2 = stringBuilder;
                if (stringBuilder == null)
                  stringBuilder2 = new StringBuilder(Math.max(k * 2, 16)); 
                stringBuilder2.append(arrayOfChar, i, k - 1);
                stringBuilder2.append(E());
                i = this.e;
                j = this.f;
                stringBuilder = stringBuilder2;
                continue label35;
              } 
              if (m == 10) {
                this.g++;
                this.h = k;
              } 
              continue;
            } 
            N("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
            throw null;
          } 
          stringBuilder1 = stringBuilder;
          if (stringBuilder == null)
            stringBuilder1 = new StringBuilder(Math.max((m - i) * 2, 16)); 
          stringBuilder1.append(arrayOfChar, i, m - i);
          this.e = m;
          if (l(1))
            break; 
          N("Unterminated string");
          throw null;
        } 
        break;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */