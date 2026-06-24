import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class su0 {
  public final Bundle a;
  
  public su0(Bundle paramBundle) {
    this.a = paramBundle;
  }
  
  public final HashSet a() {
    Bundle bundle = this.a;
    return !bundle.containsKey("allowedPackages") ? new HashSet() : new HashSet(bundle.getStringArrayList("allowedPackages"));
  }
  
  public final ArrayList b() {
    Bundle bundle = this.a;
    return !bundle.containsKey("controlFilters") ? new ArrayList() : new ArrayList(bundle.getParcelableArrayList("controlFilters"));
  }
  
  public final ArrayList c() {
    Bundle bundle = this.a;
    return !bundle.containsKey("groupMemberIds") ? new ArrayList() : new ArrayList(bundle.getStringArrayList("groupMemberIds"));
  }
  
  public final String d() {
    return this.a.getString(CKYHNesT.imEbKYZFo);
  }
  
  public final boolean e() {
    return !(TextUtils.isEmpty(d()) || TextUtils.isEmpty(this.a.getString(ckOPp.esR)) || b().contains(null));
  }
  
  public final String toString() {
    Uri uri;
    StringBuilder stringBuilder = new StringBuilder(tlzLOCPTHRhep.gNVuR);
    stringBuilder.append(d());
    stringBuilder.append(", groupMemberIds=");
    stringBuilder.append(c());
    stringBuilder.append(", name=");
    Bundle bundle = this.a;
    stringBuilder.append(bundle.getString("name"));
    stringBuilder.append(", description=");
    stringBuilder.append(bundle.getString("status"));
    stringBuilder.append(", iconUri=");
    String str = bundle.getString("iconUri");
    if (str == null) {
      str = null;
    } else {
      uri = Uri.parse(str);
    } 
    stringBuilder.append(uri);
    stringBuilder.append(", isEnabled=");
    stringBuilder.append(bundle.getBoolean("enabled", true));
    stringBuilder.append(", isSystemRoute=");
    stringBuilder.append(bundle.getBoolean("isSystemRoute", false));
    stringBuilder.append(", connectionState=");
    stringBuilder.append(bundle.getInt("connectionState", 0));
    stringBuilder.append(kOkiWEITVb.IVWvyJOdMbH);
    stringBuilder.append(Arrays.toString(b().toArray()));
    stringBuilder.append(tlzLOCPTHRhep.mixhG);
    stringBuilder.append(bundle.getInt(hrSTyFuSIm.eOrvRBhDfzvpd, 1));
    stringBuilder.append(", playbackStream=");
    stringBuilder.append(bundle.getInt(nBRIsU.tYQm, -1));
    stringBuilder.append(", deviceType=");
    stringBuilder.append(bundle.getInt("deviceType"));
    stringBuilder.append(", volume=");
    stringBuilder.append(bundle.getInt("volume"));
    stringBuilder.append(", volumeMax=");
    stringBuilder.append(bundle.getInt("volumeMax"));
    stringBuilder.append(JkpGFvCVQHzgc.bwRNUDIhefc);
    stringBuilder.append(bundle.getInt("volumeHandling", 0));
    stringBuilder.append(", presentationDisplayId=");
    stringBuilder.append(bundle.getInt("presentationDisplayId", -1));
    stringBuilder.append(FgdLmmRfTxSFKI.ChCLtEO);
    stringBuilder.append(bundle.getBundle("extras"));
    stringBuilder.append(JkpGFvCVQHzgc.ZoAXgeDrSHA);
    stringBuilder.append(e());
    stringBuilder.append(", minClientVersion=");
    stringBuilder.append(bundle.getInt("minClientVersion", 1));
    stringBuilder.append(", maxClientVersion=");
    stringBuilder.append(bundle.getInt("maxClientVersion", 2147483647));
    stringBuilder.append(", isVisibilityPublic=");
    stringBuilder.append(bundle.getBoolean("isVisibilityPublic", true));
    stringBuilder.append(", allowedPackages=");
    stringBuilder.append(Arrays.toString(a().toArray()));
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\su0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */