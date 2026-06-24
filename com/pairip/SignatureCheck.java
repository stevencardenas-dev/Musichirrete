package com.pairip;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignatureCheck {
  private static final String ALLOWLISTED_SIG = "Vn3kj4pUblROi2S+QfRRL9nhsaO2uoHQg6+dpEtxdTE=";
  
  private static final String TAG = "SignatureCheck";
  
  private static String expectedLegacyUpgradedSignature = "ik1BIfVB42RMH9Hlw1AutL6kl5LK/SbmANQTzR8QhR8=";
  
  private static String expectedSignature = "ik1BIfVB42RMH9Hlw1AutL6kl5LK/SbmANQTzR8QhR8=";
  
  private static String expectedTestSignature = "ik1BIfVB42RMH9Hlw1AutL6kl5LK/SbmANQTzR8QhR8=";
  
  public static void verifyIntegrity(Context paramContext) {
    try {
      PackageInfo packageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64);
      String str = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(packageInfo.signatures[0].toByteArray()), 2);
    } catch (NoSuchAlgorithmException|android.content.pm.PackageManager.NameNotFoundException noSuchAlgorithmException) {
      noSuchAlgorithmException = null;
    } 
    if (verifySignatureMatches((String)noSuchAlgorithmException) || expectedTestSignature.equals(noSuchAlgorithmException) || "Vn3kj4pUblROi2S+QfRRL9nhsaO2uoHQg6+dpEtxdTE=".equals(noSuchAlgorithmException)) {
      Log.i("SignatureCheck", "Signature check ok");
      return;
    } 
    throw new SignatureTamperedException("Apk signature is invalid.");
  }
  
  public static boolean verifySignatureMatches(String paramString) {
    return (expectedSignature.equals(paramString) || expectedLegacyUpgradedSignature.equals(paramString));
  }
  
  private static class SignatureTamperedException extends RuntimeException {
    public SignatureTamperedException(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pairip\SignatureCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */