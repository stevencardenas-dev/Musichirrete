import android.os.Parcel;

public final class cj2 extends y92 {
  public yc f;
  
  public final int g;
  
  public cj2(yc paramyc, int paramInt) {
    super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
    this.f = paramyc;
    this.g = paramInt;
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: if_icmpeq -> 245
    //   5: iload_1
    //   6: iconst_2
    //   7: if_icmpeq -> 206
    //   10: iload_1
    //   11: iconst_3
    //   12: if_icmpeq -> 17
    //   15: iconst_0
    //   16: ireturn
    //   17: aload_2
    //   18: invokevirtual readInt : ()I
    //   21: istore_1
    //   22: aload_2
    //   23: invokevirtual readStrongBinder : ()Landroid/os/IBinder;
    //   26: astore #5
    //   28: aload_2
    //   29: getstatic gn2.CREATOR : Landroid/os/Parcelable$Creator;
    //   32: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   35: checkcast gn2
    //   38: astore #6
    //   40: aload_2
    //   41: invokestatic c : (Landroid/os/Parcel;)V
    //   44: aload_0
    //   45: getfield f : Lyc;
    //   48: astore_2
    //   49: ldc 'onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService'
    //   51: aload_2
    //   52: invokestatic n : (Ljava/lang/String;Ljava/lang/Object;)V
    //   55: aload #6
    //   57: invokestatic m : (Ljava/lang/Object;)V
    //   60: aload_2
    //   61: aload #6
    //   63: putfield w : Lgn2;
    //   66: aload_2
    //   67: invokevirtual r : ()Z
    //   70: ifeq -> 168
    //   73: aload #6
    //   75: getfield f : Lwp;
    //   78: astore_2
    //   79: invokestatic n : ()Lgh1;
    //   82: astore #7
    //   84: aload_2
    //   85: ifnonnull -> 93
    //   88: aconst_null
    //   89: astore_2
    //   90: goto -> 98
    //   93: aload_2
    //   94: getfield b : Lhh1;
    //   97: astore_2
    //   98: aload #7
    //   100: monitorenter
    //   101: aload_2
    //   102: ifnonnull -> 127
    //   105: getstatic gh1.f : Lhh1;
    //   108: astore #4
    //   110: aload #7
    //   112: aload #4
    //   114: putfield c : Ljava/lang/Object;
    //   117: aload #7
    //   119: monitorexit
    //   120: goto -> 168
    //   123: astore_2
    //   124: goto -> 163
    //   127: aload #7
    //   129: getfield c : Ljava/lang/Object;
    //   132: checkcast hh1
    //   135: astore #8
    //   137: aload_2
    //   138: astore #4
    //   140: aload #8
    //   142: ifnull -> 110
    //   145: aload #8
    //   147: getfield b : I
    //   150: aload_2
    //   151: getfield b : I
    //   154: if_icmpge -> 117
    //   157: aload_2
    //   158: astore #4
    //   160: goto -> 110
    //   163: aload #7
    //   165: monitorexit
    //   166: aload_2
    //   167: athrow
    //   168: aload #6
    //   170: getfield b : Landroid/os/Bundle;
    //   173: astore_2
    //   174: ldc 'onPostInitComplete can be called only once per call to getRemoteService'
    //   176: aload_0
    //   177: getfield f : Lyc;
    //   180: invokestatic n : (Ljava/lang/String;Ljava/lang/Object;)V
    //   183: aload_0
    //   184: getfield f : Lyc;
    //   187: iload_1
    //   188: aload #5
    //   190: aload_2
    //   191: aload_0
    //   192: getfield g : I
    //   195: invokevirtual p : (ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield f : Lyc;
    //   203: goto -> 302
    //   206: aload_2
    //   207: invokevirtual readInt : ()I
    //   210: pop
    //   211: aload_2
    //   212: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   215: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   218: checkcast android/os/Bundle
    //   221: astore #4
    //   223: aload_2
    //   224: invokestatic c : (Landroid/os/Parcel;)V
    //   227: ldc 'GmsClient'
    //   229: ldc 'received deprecated onAccountValidationComplete callback, ignoring'
    //   231: new java/lang/Exception
    //   234: dup
    //   235: invokespecial <init> : ()V
    //   238: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   241: pop
    //   242: goto -> 302
    //   245: aload_2
    //   246: invokevirtual readInt : ()I
    //   249: istore_1
    //   250: aload_2
    //   251: invokevirtual readStrongBinder : ()Landroid/os/IBinder;
    //   254: astore #4
    //   256: aload_2
    //   257: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   260: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   263: checkcast android/os/Bundle
    //   266: astore #5
    //   268: aload_2
    //   269: invokestatic c : (Landroid/os/Parcel;)V
    //   272: ldc 'onPostInitComplete can be called only once per call to getRemoteService'
    //   274: aload_0
    //   275: getfield f : Lyc;
    //   278: invokestatic n : (Ljava/lang/String;Ljava/lang/Object;)V
    //   281: aload_0
    //   282: getfield f : Lyc;
    //   285: iload_1
    //   286: aload #4
    //   288: aload #5
    //   290: aload_0
    //   291: getfield g : I
    //   294: invokevirtual p : (ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    //   297: aload_0
    //   298: aconst_null
    //   299: putfield f : Lyc;
    //   302: aload_3
    //   303: invokevirtual writeNoException : ()V
    //   306: iconst_1
    //   307: ireturn
    // Exception table:
    //   from	to	target	type
    //   105	110	123	finally
    //   110	117	123	finally
    //   127	137	123	finally
    //   145	157	123	finally
    //   163	166	123	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */