import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class n92 {
  public static final ha2 a = new ha2("PhoneskyVerificationUtils");
  
  public static boolean a(Signature[] paramArrayOfSignature) {
    ha2 ha21 = a;
    if (paramArrayOfSignature != null) {
      int i = paramArrayOfSignature.length;
      if (i != 0) {
        ArrayList<String> arrayList = new ArrayList();
        byte b = 0;
        while (b < i) {
          String str;
          byte[] arrayOfByte = paramArrayOfSignature[b].toByteArray();
          try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(arrayOfByte);
            str = Base64.encodeToString(messageDigest.digest(), 11);
          } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            str = "";
          } 
          arrayList.add(str);
          if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
            String str1 = Build.TAGS;
            if ((!str1.contains(tlzLOCPTHRhep.ZcJzoalHo) && !str1.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
              b++;
              continue;
            } 
          } 
          return true;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<String> iterator = arrayList.iterator();
        if (iterator.hasNext())
          while (true) {
            stringBuilder.append(iterator.next());
            if (iterator.hasNext()) {
              stringBuilder.append(", ");
              continue;
            } 
            break;
          }  
        ha21.b(x41.w("Play Store package certs are not valid. Found these sha256 certs: [", stringBuilder.toString(), "]."), new Object[0]);
        return false;
      } 
    } 
    ha21.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */