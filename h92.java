import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.utils.SgV.zpEN;
import java.util.HashMap;

public abstract class h92 {
  public static final HashMap a;
  
  public static final HashMap b;
  
  static {
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    a = hashMap1;
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    b = hashMap2;
    Integer integer8 = Integer.valueOf(-1);
    hashMap1.put(integer8, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n");
    Integer integer14 = Integer.valueOf(-2);
    hashMap1.put(integer14, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
    Integer integer6 = Integer.valueOf(-3);
    hashMap1.put(integer6, "Network error: unable to obtain integrity details.\nRecommended actions:\n1) Ask the user to check and enable their network connection.\n2) For a guided user experience to help the user establish a network connection, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n");
    Integer integer18 = Integer.valueOf(-4);
    hashMap1.put(integer18, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
    Integer integer13 = Integer.valueOf(-5);
    hashMap1.put(integer13, zpEN.ZOQbuISeagQpcF);
    Integer integer11 = Integer.valueOf(-6);
    hashMap1.put(integer11, "Google Play Services is not available or version is too old.\nRecommended actions:\n1) Ask the user to install or update Play Services.\n2) For a guided user experience that helps the user to enable, install or update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n");
    Integer integer9 = Integer.valueOf(-7);
    hashMap1.put(integer9, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
    Integer integer15 = Integer.valueOf(-8);
    hashMap1.put(integer15, "The calling app has made too many requests to the API and has been throttled, or your app has exceeded its daily request quota.\nRetry with an exponential backoff. Request an increase to your daily request quota if you're at your daily request limit.\n");
    Integer integer2 = Integer.valueOf(-9);
    hashMap1.put(integer2, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
    Integer integer7 = Integer.valueOf(-10);
    hashMap1.put(integer7, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
    Integer integer1 = Integer.valueOf(-11);
    hashMap1.put(integer1, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n");
    Integer integer4 = Integer.valueOf(-12);
    hashMap1.put(integer4, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
    Integer integer16 = Integer.valueOf(-13);
    hashMap1.put(integer16, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n");
    Integer integer3 = Integer.valueOf(-14);
    hashMap1.put(integer3, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
    Integer integer12 = Integer.valueOf(-15);
    hashMap1.put(integer12, "Play Services needs to be updated.\nRecommended actions:\n1) Ask the user to update Google Play Services.\n2) For a guided user experience that helps the user to update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n");
    Integer integer10 = Integer.valueOf(-16);
    hashMap1.put(integer10, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
    Integer integer5 = Integer.valueOf(-100);
    hashMap1.put(integer5, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
    Integer integer17 = Integer.valueOf(-17);
    hashMap1.put(integer17, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
    hashMap2.put(integer8, "API_NOT_AVAILABLE");
    hashMap2.put(integer6, "NETWORK_ERROR");
    hashMap2.put(integer14, "PLAY_STORE_NOT_FOUND");
    hashMap2.put(integer18, "PLAY_STORE_ACCOUNT_NOT_FOUND");
    hashMap2.put(integer3, "PLAY_STORE_VERSION_OUTDATED");
    hashMap2.put(integer13, "APP_NOT_INSTALLED");
    hashMap2.put(integer11, "PLAY_SERVICES_NOT_FOUND");
    hashMap2.put(integer12, "PLAY_SERVICES_VERSION_OUTDATED");
    hashMap2.put(integer9, "APP_UID_MISMATCH");
    hashMap2.put(integer15, "TOO_MANY_REQUESTS");
    hashMap2.put(integer2, "CANNOT_BIND_TO_SERVICE");
    hashMap2.put(integer7, "NONCE_TOO_SHORT");
    hashMap2.put(integer1, "NONCE_TOO_LONG");
    hashMap2.put(integer16, "NONCE_IS_NOT_BASE64");
    hashMap2.put(integer10, ckOPp.zuLqXsKLdOASP);
    hashMap2.put(integer4, "GOOGLE_SERVER_UNAVAILABLE");
    hashMap2.put(integer5, "INTERNAL_ERROR");
    hashMap2.put(integer17, "CLIENT_TRANSIENT_ERROR");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */