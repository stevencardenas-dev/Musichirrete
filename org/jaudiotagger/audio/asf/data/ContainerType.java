package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public enum ContainerType {
  CONTENT_BRANDING(GUID.GUID_CONTENT_BRANDING, 32, false, false, false, false),
  CONTENT_DESCRIPTION(GUID.GUID_CONTENTDESCRIPTION, 16, false, false, false, false),
  EXTENDED_CONTENT(GUID.GUID_EXTENDED_CONTENT_DESCRIPTION, 16, false, false, false, false),
  METADATA_LIBRARY_OBJECT(GUID.GUID_METADATA_LIBRARY, 32, true, true, true, true),
  METADATA_OBJECT(GUID.GUID_METADATA, 16, false, true, false, true);
  
  private static final ContainerType[] $VALUES;
  
  private final GUID containerGUID;
  
  private final boolean guidEnabled;
  
  private final boolean languageEnabled;
  
  private final BigInteger maximumDataLength;
  
  private final boolean multiValued;
  
  private final long perfMaxDataLen;
  
  private final boolean streamEnabled;
  
  static {
    $VALUES = $values();
  }
  
  ContainerType(GUID paramGUID, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.containerGUID = paramGUID;
    BigInteger bigInteger = BigInteger.valueOf(2L).pow(paramInt1).subtract(BigInteger.ONE);
    this.maximumDataLength = bigInteger;
    if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
      this.perfMaxDataLen = bigInteger.longValue();
    } else {
      this.perfMaxDataLen = -1L;
    } 
    this.guidEnabled = paramBoolean1;
    this.streamEnabled = paramBoolean2;
    this.languageEnabled = paramBoolean3;
    this.multiValued = paramBoolean4;
  }
  
  public static boolean areInCorrectOrder(ContainerType paramContainerType1, ContainerType paramContainerType2) {
    List<ContainerType> list = Arrays.asList(getOrdered());
    return (list.indexOf(paramContainerType1) <= list.indexOf(paramContainerType2));
  }
  
  public static ContainerType[] getOrdered() {
    return new ContainerType[] { CONTENT_DESCRIPTION, CONTENT_BRANDING, EXTENDED_CONTENT, METADATA_OBJECT, METADATA_LIBRARY_OBJECT };
  }
  
  public void assertConstraints(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    RuntimeException runtimeException = checkConstraints(paramString, paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
    if (runtimeException == null)
      return; 
    throw runtimeException;
  }
  
  public RuntimeException checkConstraints(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 53
    //   4: aload_2
    //   5: ifnonnull -> 11
    //   8: goto -> 53
    //   11: aload_1
    //   12: invokestatic isStringLengthValidNullSafe : (Ljava/lang/String;)Z
    //   15: ifne -> 48
    //   18: new java/lang/IllegalArgumentException
    //   21: dup
    //   22: ldc 'Trying to create field but UTF-16LE representation is {0} and exceeds maximum allowed of 65535.'
    //   24: iconst_1
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_1
    //   31: invokevirtual length : ()I
    //   34: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   37: aastore
    //   38: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: astore_1
    //   45: goto -> 63
    //   48: aconst_null
    //   49: astore_1
    //   50: goto -> 63
    //   53: new java/lang/IllegalArgumentException
    //   56: dup
    //   57: ldc 'Arguments must not be null.'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: astore_1
    //   63: aload_1
    //   64: astore #6
    //   66: aload_1
    //   67: ifnonnull -> 126
    //   70: aload_1
    //   71: astore #6
    //   73: aload_0
    //   74: aload_2
    //   75: arraylength
    //   76: i2l
    //   77: invokevirtual isWithinValueRange : (J)Z
    //   80: ifne -> 126
    //   83: new java/lang/IllegalArgumentException
    //   86: dup
    //   87: ldc 'Trying to create field with {0} bytes of data but the maximum data allowed in WMA files is {1} for {2}.'
    //   89: iconst_3
    //   90: anewarray java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_2
    //   96: arraylength
    //   97: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: aload_0
    //   104: invokevirtual getMaximumDataLength : ()Ljava/math/BigInteger;
    //   107: aastore
    //   108: dup
    //   109: iconst_2
    //   110: aload_0
    //   111: invokevirtual getContainerGUID : ()Lorg/jaudiotagger/audio/asf/data/GUID;
    //   114: invokevirtual getDescription : ()Ljava/lang/String;
    //   117: aastore
    //   118: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: astore #6
    //   126: ldc '0'
    //   128: astore #7
    //   130: aload #6
    //   132: astore_1
    //   133: aload #6
    //   135: ifnonnull -> 223
    //   138: iload #4
    //   140: iflt -> 168
    //   143: iload #4
    //   145: bipush #127
    //   147: if_icmpgt -> 168
    //   150: aload #6
    //   152: astore_1
    //   153: aload_0
    //   154: invokevirtual isStreamNumberEnabled : ()Z
    //   157: ifne -> 223
    //   160: aload #6
    //   162: astore_1
    //   163: iload #4
    //   165: ifeq -> 223
    //   168: aload_0
    //   169: invokevirtual isStreamNumberEnabled : ()Z
    //   172: ifeq -> 181
    //   175: ldc '0 to 127'
    //   177: astore_1
    //   178: goto -> 184
    //   181: ldc '0'
    //   183: astore_1
    //   184: new java/lang/IllegalArgumentException
    //   187: dup
    //   188: ldc 'The stream number {0} is invalid. Only {1} allowed for {2}.'
    //   190: iconst_3
    //   191: anewarray java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: iload #4
    //   198: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   201: aastore
    //   202: dup
    //   203: iconst_1
    //   204: aload_1
    //   205: aastore
    //   206: dup
    //   207: iconst_2
    //   208: aload_0
    //   209: invokevirtual getContainerGUID : ()Lorg/jaudiotagger/audio/asf/data/GUID;
    //   212: invokevirtual getDescription : ()Ljava/lang/String;
    //   215: aastore
    //   216: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   219: invokespecial <init> : (Ljava/lang/String;)V
    //   222: astore_1
    //   223: aload_1
    //   224: astore_2
    //   225: aload_1
    //   226: ifnonnull -> 273
    //   229: aload_1
    //   230: astore_2
    //   231: iload_3
    //   232: bipush #6
    //   234: if_icmpne -> 273
    //   237: aload_1
    //   238: astore_2
    //   239: aload_0
    //   240: invokevirtual isGuidEnabled : ()Z
    //   243: ifne -> 273
    //   246: new java/lang/IllegalArgumentException
    //   249: dup
    //   250: ldc 'The use of GUID ist not allowed for {0}'
    //   252: iconst_1
    //   253: anewarray java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload_0
    //   259: invokevirtual getContainerGUID : ()Lorg/jaudiotagger/audio/asf/data/GUID;
    //   262: invokevirtual getDescription : ()Ljava/lang/String;
    //   265: aastore
    //   266: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   269: invokespecial <init> : (Ljava/lang/String;)V
    //   272: astore_2
    //   273: aload_2
    //   274: astore_1
    //   275: aload_2
    //   276: ifnonnull -> 357
    //   279: iload #5
    //   281: ifeq -> 291
    //   284: aload_0
    //   285: invokevirtual isLanguageEnabled : ()Z
    //   288: ifeq -> 305
    //   291: iload #5
    //   293: iflt -> 305
    //   296: aload_2
    //   297: astore_1
    //   298: iload #5
    //   300: bipush #127
    //   302: if_icmplt -> 357
    //   305: aload #7
    //   307: astore_1
    //   308: aload_0
    //   309: invokevirtual isStreamNumberEnabled : ()Z
    //   312: ifeq -> 318
    //   315: ldc '0 to 126'
    //   317: astore_1
    //   318: new java/lang/IllegalArgumentException
    //   321: dup
    //   322: ldc 'The use of language {0} ist not allowed for {1} (only {2} allowed)'
    //   324: iconst_3
    //   325: anewarray java/lang/Object
    //   328: dup
    //   329: iconst_0
    //   330: iload #5
    //   332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_0
    //   339: invokevirtual getContainerGUID : ()Lorg/jaudiotagger/audio/asf/data/GUID;
    //   342: invokevirtual getDescription : ()Ljava/lang/String;
    //   345: aastore
    //   346: dup
    //   347: iconst_2
    //   348: aload_1
    //   349: aastore
    //   350: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   353: invokespecial <init> : (Ljava/lang/String;)V
    //   356: astore_1
    //   357: aload_1
    //   358: ifnonnull -> 382
    //   361: aload_0
    //   362: getstatic org/jaudiotagger/audio/asf/data/ContainerType.CONTENT_DESCRIPTION : Lorg/jaudiotagger/audio/asf/data/ContainerType;
    //   365: if_acmpne -> 382
    //   368: iload_3
    //   369: ifeq -> 382
    //   372: new java/lang/IllegalArgumentException
    //   375: dup
    //   376: ldc 'Only Strings are allowed in content description objects'
    //   378: invokespecial <init> : (Ljava/lang/String;)V
    //   381: areturn
    //   382: aload_1
    //   383: areturn
  }
  
  public GUID getContainerGUID() {
    return this.containerGUID;
  }
  
  public BigInteger getMaximumDataLength() {
    return this.maximumDataLength;
  }
  
  public boolean isGuidEnabled() {
    return this.guidEnabled;
  }
  
  public boolean isLanguageEnabled() {
    return this.languageEnabled;
  }
  
  public boolean isMultiValued() {
    return this.multiValued;
  }
  
  public boolean isStreamNumberEnabled() {
    return this.streamEnabled;
  }
  
  public boolean isWithinValueRange(long paramLong) {
    long l = this.perfMaxDataLen;
    return ((l == -1L || l >= paramLong) && paramLong >= 0L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\ContainerType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */