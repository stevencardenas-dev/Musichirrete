import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class bi0 extends InputConnectionWrapper {
  public final f a;
  
  public bi0(InputConnection paramInputConnection, f paramf) {
    super(paramInputConnection, false);
  }
  
  public final boolean performPrivateCommand(String paramString, Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lf;
    //   4: astore #8
    //   6: iconst_0
    //   7: istore #4
    //   9: iconst_0
    //   10: istore #5
    //   12: aload_2
    //   13: ifnonnull -> 19
    //   16: goto -> 287
    //   19: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT'
    //   21: aload_1
    //   22: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   25: ifeq -> 33
    //   28: iconst_0
    //   29: istore_3
    //   30: goto -> 44
    //   33: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT'
    //   35: aload_1
    //   36: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   39: ifeq -> 287
    //   42: iconst_1
    //   43: istore_3
    //   44: iload_3
    //   45: ifeq -> 61
    //   48: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER'
    //   50: astore #6
    //   52: goto -> 65
    //   55: astore_2
    //   56: aconst_null
    //   57: astore_1
    //   58: goto -> 275
    //   61: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER'
    //   63: astore #6
    //   65: aload_2
    //   66: aload #6
    //   68: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   71: checkcast android/os/ResultReceiver
    //   74: astore #7
    //   76: iload_3
    //   77: ifeq -> 94
    //   80: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI'
    //   82: astore #6
    //   84: goto -> 98
    //   87: astore_2
    //   88: aload #7
    //   90: astore_1
    //   91: goto -> 275
    //   94: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI'
    //   96: astore #6
    //   98: aload_2
    //   99: aload #6
    //   101: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   104: checkcast android/net/Uri
    //   107: astore #9
    //   109: iload_3
    //   110: ifeq -> 120
    //   113: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION'
    //   115: astore #6
    //   117: goto -> 124
    //   120: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION'
    //   122: astore #6
    //   124: aload_2
    //   125: aload #6
    //   127: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   130: checkcast android/content/ClipDescription
    //   133: astore #10
    //   135: iload_3
    //   136: ifeq -> 146
    //   139: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI'
    //   141: astore #6
    //   143: goto -> 150
    //   146: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI'
    //   148: astore #6
    //   150: aload_2
    //   151: aload #6
    //   153: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   156: checkcast android/net/Uri
    //   159: astore #11
    //   161: iload_3
    //   162: ifeq -> 172
    //   165: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS'
    //   167: astore #6
    //   169: goto -> 176
    //   172: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS'
    //   174: astore #6
    //   176: aload_2
    //   177: aload #6
    //   179: invokevirtual getInt : (Ljava/lang/String;)I
    //   182: istore #4
    //   184: iload_3
    //   185: ifeq -> 195
    //   188: ldc 'android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS'
    //   190: astore #6
    //   192: goto -> 199
    //   195: ldc 'androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS'
    //   197: astore #6
    //   199: aload_2
    //   200: aload #6
    //   202: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   205: checkcast android/os/Bundle
    //   208: astore #12
    //   210: iload #5
    //   212: istore_3
    //   213: aload #9
    //   215: ifnull -> 254
    //   218: iload #5
    //   220: istore_3
    //   221: aload #10
    //   223: ifnull -> 254
    //   226: new bh0
    //   229: astore #6
    //   231: aload #6
    //   233: aload #9
    //   235: aload #10
    //   237: aload #11
    //   239: invokespecial <init> : (Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    //   242: aload #8
    //   244: aload #6
    //   246: iload #4
    //   248: aload #12
    //   250: invokevirtual h : (Lbh0;ILandroid/os/Bundle;)Z
    //   253: istore_3
    //   254: iload_3
    //   255: istore #4
    //   257: aload #7
    //   259: ifnull -> 287
    //   262: aload #7
    //   264: iload_3
    //   265: aconst_null
    //   266: invokevirtual send : (ILandroid/os/Bundle;)V
    //   269: iload_3
    //   270: istore #4
    //   272: goto -> 287
    //   275: aload_1
    //   276: ifnull -> 285
    //   279: aload_1
    //   280: iconst_0
    //   281: aconst_null
    //   282: invokevirtual send : (ILandroid/os/Bundle;)V
    //   285: aload_2
    //   286: athrow
    //   287: iload #4
    //   289: ifeq -> 294
    //   292: iconst_1
    //   293: ireturn
    //   294: aload_0
    //   295: aload_1
    //   296: aload_2
    //   297: invokespecial performPrivateCommand : (Ljava/lang/String;Landroid/os/Bundle;)Z
    //   300: ireturn
    // Exception table:
    //   from	to	target	type
    //   65	76	55	finally
    //   98	109	87	finally
    //   124	135	87	finally
    //   150	161	87	finally
    //   176	184	87	finally
    //   199	210	87	finally
    //   226	254	87	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */