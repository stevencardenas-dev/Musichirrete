package org.jaudiotagger.tag.id3;

import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public class ID3v23PreferredFrameOrderComparator implements Comparator<String> {
  private static ID3v23PreferredFrameOrderComparator comparator;
  
  private static List<String> frameIdsInPreferredOrder;
  
  static {
    ArrayList<String> arrayList = new ArrayList();
    frameIdsInPreferredOrder = arrayList;
    arrayList.add("UFID");
    frameIdsInPreferredOrder.add("TIT2");
    frameIdsInPreferredOrder.add("TPE1");
    frameIdsInPreferredOrder.add("TALB");
    frameIdsInPreferredOrder.add("TORY");
    frameIdsInPreferredOrder.add("TCON");
    frameIdsInPreferredOrder.add("TCOM");
    frameIdsInPreferredOrder.add("TPE3");
    frameIdsInPreferredOrder.add("TIT1");
    frameIdsInPreferredOrder.add("TRCK");
    frameIdsInPreferredOrder.add("TYER");
    frameIdsInPreferredOrder.add(oXrNDUqUkE.lrZXCuaykrI);
    frameIdsInPreferredOrder.add("TIME");
    frameIdsInPreferredOrder.add("TBPM");
    frameIdsInPreferredOrder.add("TSRC");
    frameIdsInPreferredOrder.add("TORY");
    frameIdsInPreferredOrder.add("TPE2");
    frameIdsInPreferredOrder.add("TIT3");
    frameIdsInPreferredOrder.add("USLT");
    frameIdsInPreferredOrder.add("TXXX");
    frameIdsInPreferredOrder.add("WXXX");
    frameIdsInPreferredOrder.add("WOAR");
    frameIdsInPreferredOrder.add("WCOM");
    frameIdsInPreferredOrder.add("WCOP");
    frameIdsInPreferredOrder.add("WOAF");
    frameIdsInPreferredOrder.add("WORS");
    frameIdsInPreferredOrder.add("WPAY");
    frameIdsInPreferredOrder.add("WPUB");
    frameIdsInPreferredOrder.add("WCOM");
    frameIdsInPreferredOrder.add("TEXT");
    frameIdsInPreferredOrder.add(xveccWbRzqx.cbMnFuLGDg);
    frameIdsInPreferredOrder.add("IPLS");
    frameIdsInPreferredOrder.add("TLAN");
    frameIdsInPreferredOrder.add("TSOT");
    frameIdsInPreferredOrder.add("TDLY");
    frameIdsInPreferredOrder.add("PCNT");
    frameIdsInPreferredOrder.add("POPM");
    frameIdsInPreferredOrder.add("TPUB");
    frameIdsInPreferredOrder.add("TSO2");
    frameIdsInPreferredOrder.add("TSOC");
    frameIdsInPreferredOrder.add("TCMP");
    frameIdsInPreferredOrder.add("TSOT");
    frameIdsInPreferredOrder.add("TSOP");
    frameIdsInPreferredOrder.add("TSOA");
    frameIdsInPreferredOrder.add("XSOT");
    frameIdsInPreferredOrder.add("XSOP");
    frameIdsInPreferredOrder.add("XSOA");
    frameIdsInPreferredOrder.add("TSO2");
    frameIdsInPreferredOrder.add("TSOC");
    frameIdsInPreferredOrder.add("COMM");
    frameIdsInPreferredOrder.add("TRDA");
    frameIdsInPreferredOrder.add(GMDx.OnFBk);
    frameIdsInPreferredOrder.add("TCOP");
    frameIdsInPreferredOrder.add("TENC");
    frameIdsInPreferredOrder.add("ENCR");
    frameIdsInPreferredOrder.add("EQUA");
    frameIdsInPreferredOrder.add("ETCO");
    frameIdsInPreferredOrder.add("TOWN");
    frameIdsInPreferredOrder.add("TFLT");
    frameIdsInPreferredOrder.add("GRID");
    frameIdsInPreferredOrder.add("TSSE");
    frameIdsInPreferredOrder.add("TKEY");
    frameIdsInPreferredOrder.add("TLEN");
    frameIdsInPreferredOrder.add("LINK");
    frameIdsInPreferredOrder.add("TSIZ");
    frameIdsInPreferredOrder.add("MLLT");
    frameIdsInPreferredOrder.add("TOPE");
    frameIdsInPreferredOrder.add("TOFN");
    frameIdsInPreferredOrder.add("TOLY");
    frameIdsInPreferredOrder.add("TOAL");
    frameIdsInPreferredOrder.add("OWNE");
    frameIdsInPreferredOrder.add("POSS");
    frameIdsInPreferredOrder.add("TRSN");
    frameIdsInPreferredOrder.add("TRSO");
    frameIdsInPreferredOrder.add("RBUF");
    frameIdsInPreferredOrder.add("TPE4");
    frameIdsInPreferredOrder.add("RVRB");
    frameIdsInPreferredOrder.add("TPOS");
    frameIdsInPreferredOrder.add("SYLT");
    frameIdsInPreferredOrder.add("SYTC");
    frameIdsInPreferredOrder.add("USER");
    frameIdsInPreferredOrder.add("APIC");
    frameIdsInPreferredOrder.add("PRIV");
    frameIdsInPreferredOrder.add("MCDI");
    frameIdsInPreferredOrder.add("AENC");
    frameIdsInPreferredOrder.add("GEOB");
  }
  
  public static ID3v23PreferredFrameOrderComparator getInstanceof() {
    if (comparator == null)
      comparator = new ID3v23PreferredFrameOrderComparator(); 
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
    return paramObject instanceof ID3v23PreferredFrameOrderComparator;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v23PreferredFrameOrderComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */