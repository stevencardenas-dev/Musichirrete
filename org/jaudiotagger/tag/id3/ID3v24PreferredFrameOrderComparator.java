package org.jaudiotagger.tag.id3;

import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.material.tabs.xm.VDgS;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public class ID3v24PreferredFrameOrderComparator implements Comparator<String> {
  private static ID3v24PreferredFrameOrderComparator comparator;
  
  private static List<String> frameIdsInPreferredOrder;
  
  static {
    ArrayList<String> arrayList = new ArrayList();
    frameIdsInPreferredOrder = arrayList;
    arrayList.add("UFID");
    frameIdsInPreferredOrder.add("TIT2");
    frameIdsInPreferredOrder.add("TPE1");
    frameIdsInPreferredOrder.add(FgdLmmRfTxSFKI.kpXvKOKXx);
    frameIdsInPreferredOrder.add("TSOA");
    frameIdsInPreferredOrder.add("TCON");
    frameIdsInPreferredOrder.add("TCOM");
    frameIdsInPreferredOrder.add("TPE3");
    frameIdsInPreferredOrder.add("TIT1");
    frameIdsInPreferredOrder.add("TRCK");
    frameIdsInPreferredOrder.add("TDRC");
    frameIdsInPreferredOrder.add("TPE2");
    frameIdsInPreferredOrder.add("TBPM");
    frameIdsInPreferredOrder.add("TSRC");
    frameIdsInPreferredOrder.add("TSOT");
    frameIdsInPreferredOrder.add("TIT3");
    frameIdsInPreferredOrder.add("USLT");
    frameIdsInPreferredOrder.add("TXXX");
    frameIdsInPreferredOrder.add("WXXX");
    frameIdsInPreferredOrder.add("WOAR");
    frameIdsInPreferredOrder.add("WCOM");
    frameIdsInPreferredOrder.add(kOkiWEITVb.PTg);
    frameIdsInPreferredOrder.add("WOAF");
    frameIdsInPreferredOrder.add("WORS");
    frameIdsInPreferredOrder.add("WPAY");
    frameIdsInPreferredOrder.add("WPUB");
    frameIdsInPreferredOrder.add("WCOM");
    frameIdsInPreferredOrder.add("TEXT");
    frameIdsInPreferredOrder.add("TMED");
    frameIdsInPreferredOrder.add("TIPL");
    frameIdsInPreferredOrder.add("TLAN");
    frameIdsInPreferredOrder.add("TSOP");
    frameIdsInPreferredOrder.add(DJqHMztxflt.ROgkUxDnuWi);
    frameIdsInPreferredOrder.add("PCNT");
    frameIdsInPreferredOrder.add("POPM");
    frameIdsInPreferredOrder.add("TPUB");
    frameIdsInPreferredOrder.add(PwbbJfsdcHrAjW.rUP);
    frameIdsInPreferredOrder.add("TSOC");
    frameIdsInPreferredOrder.add("TCMP");
    frameIdsInPreferredOrder.add("COMM");
    frameIdsInPreferredOrder.add("ASPI");
    frameIdsInPreferredOrder.add("COMR");
    frameIdsInPreferredOrder.add("TCOP");
    frameIdsInPreferredOrder.add(VDgS.qUWvwyGddv);
    frameIdsInPreferredOrder.add("TDEN");
    frameIdsInPreferredOrder.add("ENCR");
    frameIdsInPreferredOrder.add("EQU2");
    frameIdsInPreferredOrder.add("ETCO");
    frameIdsInPreferredOrder.add("TOWN");
    frameIdsInPreferredOrder.add("TFLT");
    frameIdsInPreferredOrder.add(RqlokDsQOju.mkZJZvZGVC);
    frameIdsInPreferredOrder.add("TSSE");
    frameIdsInPreferredOrder.add("TKEY");
    frameIdsInPreferredOrder.add("TLEN");
    frameIdsInPreferredOrder.add("LINK");
    frameIdsInPreferredOrder.add("TMOO");
    frameIdsInPreferredOrder.add("MLLT");
    frameIdsInPreferredOrder.add("TMCL");
    frameIdsInPreferredOrder.add("TOPE");
    frameIdsInPreferredOrder.add("TDOR");
    frameIdsInPreferredOrder.add("TOFN");
    frameIdsInPreferredOrder.add("TOLY");
    frameIdsInPreferredOrder.add("TOAL");
    frameIdsInPreferredOrder.add("OWNE");
    frameIdsInPreferredOrder.add("POSS");
    frameIdsInPreferredOrder.add("TPRO");
    frameIdsInPreferredOrder.add("TRSN");
    frameIdsInPreferredOrder.add("TRSO");
    frameIdsInPreferredOrder.add("RBUF");
    frameIdsInPreferredOrder.add("RVA2");
    frameIdsInPreferredOrder.add(jLnXOLx.Iij);
    frameIdsInPreferredOrder.add("TPE4");
    frameIdsInPreferredOrder.add("RVRB");
    frameIdsInPreferredOrder.add("SEEK");
    frameIdsInPreferredOrder.add("TPOS");
    frameIdsInPreferredOrder.add("TSST");
    frameIdsInPreferredOrder.add("SIGN");
    frameIdsInPreferredOrder.add("SYLT");
    frameIdsInPreferredOrder.add("SYTC");
    frameIdsInPreferredOrder.add("TDTG");
    frameIdsInPreferredOrder.add("USER");
    frameIdsInPreferredOrder.add("APIC");
    frameIdsInPreferredOrder.add("PRIV");
    frameIdsInPreferredOrder.add("MCDI");
    frameIdsInPreferredOrder.add("AENC");
    frameIdsInPreferredOrder.add("GEOB");
  }
  
  public static ID3v24PreferredFrameOrderComparator getInstanceof() {
    if (comparator == null)
      comparator = new ID3v24PreferredFrameOrderComparator(); 
    return comparator;
  }
  
  public int compare(String paramString1, String paramString2) {
    int k = frameIdsInPreferredOrder.indexOf(paramString1);
    int j = Integer.MAX_VALUE;
    int i = k;
    if (k == -1)
      i = Integer.MAX_VALUE; 
    k = frameIdsInPreferredOrder.indexOf(paramString2);
    if (k != -1)
      j = k; 
    return (i == j) ? paramString1.compareTo(paramString2) : (i - j);
  }
  
  public boolean equals(Object paramObject) {
    return paramObject instanceof ID3v24PreferredFrameOrderComparator;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v24PreferredFrameOrderComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */