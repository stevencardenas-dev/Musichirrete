import java.util.Arrays;

public final class wo {
  public final byte a;
  
  public final String[] b;
  
  public wo(String paramString, q01 paramq01) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: ldc 'file:///'
    //   7: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   10: ifeq -> 94
    //   13: aload_0
    //   14: iconst_2
    //   15: putfield a : B
    //   18: iconst_2
    //   19: anewarray java/lang/String
    //   22: astore #5
    //   24: aload_0
    //   25: aload #5
    //   27: putfield b : [Ljava/lang/String;
    //   30: aload_1
    //   31: bipush #47
    //   33: invokevirtual lastIndexOf : (I)I
    //   36: istore #4
    //   38: bipush #8
    //   40: istore_3
    //   41: iload #4
    //   43: iconst_m1
    //   44: if_icmpeq -> 77
    //   47: iload #4
    //   49: bipush #8
    //   51: if_icmpge -> 57
    //   54: goto -> 77
    //   57: aload #5
    //   59: iconst_0
    //   60: aload_1
    //   61: bipush #8
    //   63: iload #4
    //   65: invokevirtual substring : (II)Ljava/lang/String;
    //   68: aastore
    //   69: iload #4
    //   71: iconst_1
    //   72: iadd
    //   73: istore_3
    //   74: goto -> 82
    //   77: aload #5
    //   79: iconst_0
    //   80: aconst_null
    //   81: aastore
    //   82: aload #5
    //   84: iconst_1
    //   85: aload_1
    //   86: iload_3
    //   87: invokevirtual substring : (I)Ljava/lang/String;
    //   90: aastore
    //   91: goto -> 334
    //   94: aload_1
    //   95: ldc 'musicolet://media-store?p_v='
    //   97: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   100: ifeq -> 160
    //   103: aload_1
    //   104: ldc '&p_dn='
    //   106: bipush #34
    //   108: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   111: istore_3
    //   112: iload_3
    //   113: iconst_m1
    //   114: if_icmpeq -> 160
    //   117: aload_0
    //   118: iconst_3
    //   119: putfield a : B
    //   122: iconst_2
    //   123: anewarray java/lang/String
    //   126: astore #5
    //   128: aload_0
    //   129: aload #5
    //   131: putfield b : [Ljava/lang/String;
    //   134: aload #5
    //   136: iconst_0
    //   137: aload_1
    //   138: bipush #28
    //   140: iload_3
    //   141: invokevirtual substring : (II)Ljava/lang/String;
    //   144: aastore
    //   145: aload #5
    //   147: iconst_1
    //   148: aload_1
    //   149: iload_3
    //   150: bipush #6
    //   152: iadd
    //   153: invokevirtual substring : (I)Ljava/lang/String;
    //   156: aastore
    //   157: goto -> 334
    //   160: aload_1
    //   161: ldc 'content://com.android.externalstorage.documents/tree/'
    //   163: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   166: ifeq -> 245
    //   169: aload_1
    //   170: ldc '/document/'
    //   172: bipush #53
    //   174: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   177: istore_3
    //   178: iload_3
    //   179: iconst_m1
    //   180: if_icmpeq -> 245
    //   183: aload_1
    //   184: bipush #53
    //   186: iload_3
    //   187: invokevirtual substring : (II)Ljava/lang/String;
    //   190: astore #5
    //   192: iinc #3, 10
    //   195: aload_1
    //   196: aload #5
    //   198: iload_3
    //   199: invokevirtual startsWith : (Ljava/lang/String;I)Z
    //   202: ifeq -> 245
    //   205: aload_0
    //   206: iconst_4
    //   207: putfield a : B
    //   210: iconst_3
    //   211: anewarray java/lang/String
    //   214: astore #6
    //   216: aload_0
    //   217: aload #6
    //   219: putfield b : [Ljava/lang/String;
    //   222: aload #6
    //   224: iconst_0
    //   225: aload #5
    //   227: aastore
    //   228: aload_1
    //   229: aload #5
    //   231: invokevirtual length : ()I
    //   234: iload_3
    //   235: iadd
    //   236: aload #6
    //   238: iconst_1
    //   239: invokestatic c : (Ljava/lang/String;I[Ljava/lang/String;I)V
    //   242: goto -> 334
    //   245: aload_1
    //   246: ldc 'content://'
    //   248: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   251: ifeq -> 309
    //   254: aload_1
    //   255: bipush #47
    //   257: bipush #10
    //   259: invokevirtual indexOf : (II)I
    //   262: istore_3
    //   263: iload_3
    //   264: iconst_m1
    //   265: if_icmpeq -> 309
    //   268: aload_0
    //   269: iconst_1
    //   270: putfield a : B
    //   273: iconst_4
    //   274: anewarray java/lang/String
    //   277: astore #5
    //   279: aload_0
    //   280: aload #5
    //   282: putfield b : [Ljava/lang/String;
    //   285: aload #5
    //   287: iconst_0
    //   288: aload_1
    //   289: bipush #10
    //   291: iload_3
    //   292: invokevirtual substring : (II)Ljava/lang/String;
    //   295: aastore
    //   296: aload_1
    //   297: iload_3
    //   298: iconst_1
    //   299: iadd
    //   300: aload #5
    //   302: iconst_1
    //   303: invokestatic d : (Ljava/lang/String;I[Ljava/lang/String;I)V
    //   306: goto -> 334
    //   309: aload_0
    //   310: iconst_0
    //   311: putfield a : B
    //   314: iconst_3
    //   315: anewarray java/lang/String
    //   318: astore #5
    //   320: aload_0
    //   321: aload #5
    //   323: putfield b : [Ljava/lang/String;
    //   326: aload_1
    //   327: iconst_0
    //   328: aload #5
    //   330: iconst_0
    //   331: invokestatic d : (Ljava/lang/String;I[Ljava/lang/String;I)V
    //   334: aload_2
    //   335: ifnull -> 343
    //   338: aload_0
    //   339: aload_2
    //   340: invokevirtual e : (Lq01;)V
    //   343: return
  }
  
  public static String a(int paramInt, String[] paramArrayOfString) {
    if (paramArrayOfString[paramInt] != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramArrayOfString[paramInt]);
      stringBuilder.append("/");
      stringBuilder.append(b(paramInt + 1, paramArrayOfString));
      return stringBuilder.toString();
    } 
    return b(paramInt + 1, paramArrayOfString);
  }
  
  public static String b(int paramInt, String[] paramArrayOfString) {
    if (paramArrayOfString[paramInt] != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramArrayOfString[paramInt]);
      stringBuilder.append("%2F");
      stringBuilder.append(paramArrayOfString[paramInt + 1]);
      return stringBuilder.toString();
    } 
    return paramArrayOfString[paramInt + 1];
  }
  
  public static void c(String paramString, int paramInt1, String[] paramArrayOfString, int paramInt2) {
    int j = paramString.lastIndexOf("%2F");
    int i = j;
    if (j < paramInt1)
      i = -1; 
    if (i == -1) {
      paramArrayOfString[paramInt2] = null;
      paramArrayOfString[paramInt2 + 1] = paramString.substring(paramInt1);
      return;
    } 
    paramArrayOfString[paramInt2] = paramString.substring(paramInt1, i);
    paramArrayOfString[paramInt2 + 1] = paramString.substring(i + 3);
  }
  
  public static void d(String paramString, int paramInt1, String[] paramArrayOfString, int paramInt2) {
    int i = paramString.lastIndexOf('/');
    if (i == -1 || i < paramInt1) {
      paramArrayOfString[paramInt2] = null;
    } else {
      paramArrayOfString[paramInt2] = paramString.substring(paramInt1, i);
      paramInt1 = i + 1;
    } 
    c(paramString, paramInt1, paramArrayOfString, paramInt2 + 1);
  }
  
  public final void e(q01 paramq01) {
    byte b = 0;
    while (true) {
      String[] arrayOfString = this.b;
      if (b < arrayOfString.length - 1) {
        arrayOfString[b] = paramq01.a(arrayOfString[b]);
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (paramObject == null || wo.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      if (this.a != ((wo)paramObject).a)
        return false; 
      String[] arrayOfString = ((wo)paramObject).b;
      paramObject = this.b;
      if (paramObject != arrayOfString) {
        if (paramObject == null || arrayOfString == null)
          return false; 
        int i = paramObject.length;
        if (arrayOfString.length != i)
          return false; 
        for (byte b = 0; b < i; b++) {
          if (paramObject[b] != arrayOfString[b]) {
            for (b = 0; b < i; b++) {
              Object object = paramObject[b];
              String str = arrayOfString[b];
              if (object != str) {
                byte b1;
                int j = -1;
                if (object != null) {
                  b1 = object.length();
                } else {
                  b1 = -1;
                } 
                if (str != null)
                  j = str.length(); 
                if (b1 != j)
                  // Byte code: goto -> 291 
              } 
            } 
            for (b = 0; b < i; b++) {
              Object object = paramObject[b];
              String str = arrayOfString[b];
              if (object != str)
                if (object != null) {
                  if (str == null)
                    // Byte code: goto -> 291 
                  int j = object.length();
                  if (str.length() != j)
                    // Byte code: goto -> 291 
                  for (byte b1 = 0; b1 < j; b1++) {
                    if (object.charAt(b1) != str.charAt(b1))
                      // Byte code: goto -> 291 
                  } 
                } else {
                  // Byte code: goto -> 291
                }  
            } 
            break;
          } 
        } 
      } 
    } 
    return true;
  }
  
  public final int hashCode() {
    return this.a * 31 + Arrays.hashCode((Object[])this.b);
  }
  
  public final String toString() {
    String str;
    String[] arrayOfString = this.b;
    byte b = this.a;
    if (b == 2) {
      StringBuilder stringBuilder = new StringBuilder("file:///");
      if (arrayOfString[0] != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(arrayOfString[0]);
        stringBuilder1.append("/");
        stringBuilder1.append(arrayOfString[1]);
        str = stringBuilder1.toString();
      } else {
        str = str[1];
      } 
      stringBuilder.append(str);
      return stringBuilder.toString();
    } 
    if (b == 3) {
      StringBuilder stringBuilder = new StringBuilder("musicolet://media-store?p_v=");
      stringBuilder.append(str[0]);
      stringBuilder.append("&p_dn=");
      stringBuilder.append(str[1]);
      return stringBuilder.toString();
    } 
    if (b == 4) {
      StringBuilder stringBuilder = new StringBuilder("content://com.android.externalstorage.documents/tree/");
      stringBuilder.append(str[0]);
      stringBuilder.append("/document/");
      stringBuilder.append(str[0]);
      stringBuilder.append(b(1, (String[])str));
      return stringBuilder.toString();
    } 
    if (b == 1) {
      StringBuilder stringBuilder = new StringBuilder("content://");
      stringBuilder.append(str[0]);
      stringBuilder.append("/");
      stringBuilder.append(a(1, (String[])str));
      return stringBuilder.toString();
    } 
    return a(0, (String[])str);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */