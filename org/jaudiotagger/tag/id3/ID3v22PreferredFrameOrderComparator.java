package org.jaudiotagger.tag.id3;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ID3v22PreferredFrameOrderComparator implements Comparator<String> {
  private static ID3v22PreferredFrameOrderComparator comparator;
  
  private static List<String> frameIdsInPreferredOrder;
  
  static {
    ArrayList<String> arrayList = new ArrayList();
    frameIdsInPreferredOrder = arrayList;
    arrayList.add("UFI");
    frameIdsInPreferredOrder.add("TT2");
    frameIdsInPreferredOrder.add("TP1");
    frameIdsInPreferredOrder.add("TAL");
    frameIdsInPreferredOrder.add("TOR");
    frameIdsInPreferredOrder.add("TCO");
    frameIdsInPreferredOrder.add("TCM");
    frameIdsInPreferredOrder.add("TP3");
    frameIdsInPreferredOrder.add("TT1");
    frameIdsInPreferredOrder.add(OETETTfAjV.YXGFvmD);
    frameIdsInPreferredOrder.add("TYE");
    frameIdsInPreferredOrder.add(jLnXOLx.UoCa);
    frameIdsInPreferredOrder.add("TIM");
    frameIdsInPreferredOrder.add("TBP");
    frameIdsInPreferredOrder.add("TRC");
    frameIdsInPreferredOrder.add("TOR");
    frameIdsInPreferredOrder.add("TP2");
    frameIdsInPreferredOrder.add("TT3");
    frameIdsInPreferredOrder.add("ULT");
    frameIdsInPreferredOrder.add("TXX");
    frameIdsInPreferredOrder.add("WXX");
    frameIdsInPreferredOrder.add("WAR");
    frameIdsInPreferredOrder.add("WCM");
    frameIdsInPreferredOrder.add("WCP");
    frameIdsInPreferredOrder.add("WAF");
    frameIdsInPreferredOrder.add("WRS");
    frameIdsInPreferredOrder.add(IGBYXeDFmKYajx.vwHmuqUYPf);
    frameIdsInPreferredOrder.add("WPB");
    frameIdsInPreferredOrder.add("WCM");
    frameIdsInPreferredOrder.add("TXT");
    frameIdsInPreferredOrder.add("TMT");
    frameIdsInPreferredOrder.add("IPL");
    frameIdsInPreferredOrder.add("TLA");
    frameIdsInPreferredOrder.add("TST");
    frameIdsInPreferredOrder.add("TDY");
    frameIdsInPreferredOrder.add("CNT");
    frameIdsInPreferredOrder.add("POP");
    frameIdsInPreferredOrder.add("TPB");
    frameIdsInPreferredOrder.add("TS2");
    frameIdsInPreferredOrder.add("TSC");
    frameIdsInPreferredOrder.add("TCP");
    frameIdsInPreferredOrder.add("TST");
    frameIdsInPreferredOrder.add("TSP");
    frameIdsInPreferredOrder.add("TSA");
    frameIdsInPreferredOrder.add("TS2");
    frameIdsInPreferredOrder.add("TSC");
    frameIdsInPreferredOrder.add(RqlokDsQOju.VfBjl);
    frameIdsInPreferredOrder.add("TRD");
    frameIdsInPreferredOrder.add("TCR");
    frameIdsInPreferredOrder.add("TEN");
    frameIdsInPreferredOrder.add("EQU");
    frameIdsInPreferredOrder.add("ETC");
    frameIdsInPreferredOrder.add("TFT");
    frameIdsInPreferredOrder.add("TSS");
    frameIdsInPreferredOrder.add("TKE");
    frameIdsInPreferredOrder.add("TLE");
    frameIdsInPreferredOrder.add("LNK");
    frameIdsInPreferredOrder.add("TSI");
    frameIdsInPreferredOrder.add("MLL");
    frameIdsInPreferredOrder.add("TOA");
    frameIdsInPreferredOrder.add("TOF");
    frameIdsInPreferredOrder.add("TOL");
    frameIdsInPreferredOrder.add("TOT");
    frameIdsInPreferredOrder.add("BUF");
    frameIdsInPreferredOrder.add("TP4");
    frameIdsInPreferredOrder.add("REV");
    frameIdsInPreferredOrder.add("TPA");
    frameIdsInPreferredOrder.add("SLT");
    frameIdsInPreferredOrder.add("STC");
    frameIdsInPreferredOrder.add("PIC");
    frameIdsInPreferredOrder.add("MCI");
    frameIdsInPreferredOrder.add("CRA");
    frameIdsInPreferredOrder.add("GEO");
  }
  
  public static ID3v22PreferredFrameOrderComparator getInstanceof() {
    if (comparator == null)
      comparator = new ID3v22PreferredFrameOrderComparator(); 
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
    return paramObject instanceof ID3v22PreferredFrameOrderComparator;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v22PreferredFrameOrderComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */