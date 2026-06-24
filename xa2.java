import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.Locale;

public abstract class xa2 {
  public static final zm1 a = new zm1(0);
  
  public static Locale b;
  
  public static String a(Context paramContext, int paramInt) {
    StringBuilder stringBuilder;
    Resources resources = paramContext.getResources();
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder(String.valueOf(paramInt).length() + 22);
        stringBuilder.append("Unexpected error code ");
        stringBuilder.append(paramInt);
        Log.e("GoogleApiAvailability", stringBuilder.toString());
        return null;
      case 20:
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return e((Context)stringBuilder, "common_google_play_services_restricted_profile_title");
      case 17:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return e((Context)stringBuilder, "common_google_play_services_sign_in_failed_title");
      case 16:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        return null;
      case 11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        return null;
      case 10:
        Log.e("GoogleApiAvailability", ckOPp.GSQHVlogvKvexQ);
        return null;
      case 9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        return null;
      case 8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        return null;
      case 7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        return e((Context)stringBuilder, "common_google_play_services_network_error_title");
      case 5:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        return e((Context)stringBuilder, "common_google_play_services_invalid_account_title");
      case 4:
      case 6:
      case 18:
        return null;
      case 3:
        return resources.getString(2131886378);
      case 2:
        return resources.getString(2131886388);
      case 1:
        break;
    } 
    return resources.getString(2131886381);
  }
  
  public static String b(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    String str = c(paramContext);
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 5) {
            if (paramInt != 7) {
              if (paramInt != 9) {
                if (paramInt != 20) {
                  switch (paramInt) {
                    default:
                      return resources.getString(2131886384, new Object[] { str });
                    case 18:
                      return resources.getString(2131886389, new Object[] { str });
                    case 17:
                      return d(paramContext, "common_google_play_services_sign_in_failed_text", str);
                    case 16:
                      break;
                  } 
                  return d(paramContext, "common_google_play_services_api_unavailable_text", str);
                } 
                return d(paramContext, "common_google_play_services_restricted_profile_text", str);
              } 
              return resources.getString(2131886385, new Object[] { str });
            } 
            return d(paramContext, nFLlOYeP.DSATHIYSBs, str);
          } 
          return d(paramContext, "common_google_play_services_invalid_account_text", str);
        } 
        return resources.getString(2131886377, new Object[] { str });
      } 
      return n21.H(paramContext) ? resources.getString(2131886390) : resources.getString(2131886387, new Object[] { str });
    } 
    return resources.getString(2131886380, new Object[] { str });
  }
  
  public static String c(Context paramContext) {
    String str = paramContext.getPackageName();
    try {
      Context context = (t82.a(paramContext)).b;
      return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0)).toString();
    } catch (android.content.pm.PackageManager.NameNotFoundException|NullPointerException nameNotFoundException) {
      String str1 = (paramContext.getApplicationInfo()).name;
      return TextUtils.isEmpty(str1) ? str : str1;
    } 
  }
  
  public static String d(Context paramContext, String paramString1, String paramString2) {
    Resources resources = paramContext.getResources();
    paramString1 = e(paramContext, paramString1);
    String str = paramString1;
    if (paramString1 == null)
      str = resources.getString(2131886384); 
    return String.format((resources.getConfiguration()).locale, str, new Object[] { paramString2 });
  }
  
  public static String e(Context paramContext, String paramString) {
    zm1 zm11 = a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
    try {
      LocaleList localeList = paramContext.getResources().getConfiguration().getLocales();
      vo0 vo0 = new vo0();
      Locale locale = localeList.get(0);
      if (!locale.equals(b)) {
        zm11.clear();
        b = locale;
      } 
    } finally {}
    String str = (String)zm11.get(paramString);
    if (str != null) {
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
      return str;
    } 
    int i = pe0.c;
    try {
      Resources resources = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      nameNotFoundException = null;
    } 
    if (nameNotFoundException == null) {
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
    } else {
      StringBuilder stringBuilder;
      i = nameNotFoundException.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0) {
        i = paramString.length();
        stringBuilder = new StringBuilder();
        this(i + 18);
        stringBuilder.append("Missing resource: ");
        stringBuilder.append(paramString);
        Log.w("GoogleApiAvailability", stringBuilder.toString());
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
      } else {
        StringBuilder stringBuilder1;
        String str1 = stringBuilder.getString(i);
        if (TextUtils.isEmpty(str1)) {
          i = paramString.length();
          stringBuilder1 = new StringBuilder();
          this(i + 20);
          stringBuilder1.append("Got empty resource: ");
          stringBuilder1.append(paramString);
          Log.w("GoogleApiAvailability", stringBuilder1.toString());
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
          return null;
        } 
        zm11.put(paramString, stringBuilder1);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zm1}, name=null} */
        return (String)stringBuilder1;
      } 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */