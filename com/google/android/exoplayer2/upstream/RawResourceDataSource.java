package com.google.android.exoplayer2.upstream;

import android.net.Uri;

public final class RawResourceDataSource {
  public static Uri buildRawResourceUri(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder("rawresource:///");
    stringBuilder.append(paramInt);
    return Uri.parse(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\exoplayer\\upstream\RawResourceDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */