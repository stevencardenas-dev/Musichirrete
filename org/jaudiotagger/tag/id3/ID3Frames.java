package org.jaudiotagger.tag.id3;

import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.datatype.AbstractStringStringValuePair;

public abstract class ID3Frames extends AbstractStringStringValuePair {
  public static final Map<String, String> convertv22Tov23 = new LinkedHashMap<String, String>();
  
  public static final Map<String, String> convertv23Tov22 = new LinkedHashMap<String, String>();
  
  public static final Map<String, String> convertv23Tov24;
  
  public static final Map<String, String> convertv24Tov23;
  
  public static final Map<String, String> forcev22Tov23 = new LinkedHashMap<String, String>();
  
  public static final Map<String, String> forcev23Tov22 = new LinkedHashMap<String, String>();
  
  public static final Map<String, String> forcev23Tov24;
  
  public static final Map<String, String> forcev24Tov23;
  
  protected TreeSet<String> binaryFrames = new TreeSet<String>();
  
  protected TreeSet<String> commonFrames = new TreeSet<String>();
  
  protected TreeSet<String> discardIfFileAlteredFrames = new TreeSet<String>();
  
  protected TreeSet<String> extensionFrames = new TreeSet<String>();
  
  protected TreeSet<String> multipleFrames = new TreeSet<String>();
  
  protected TreeSet<String> supportedFrames = new TreeSet<String>();
  
  static {
    convertv23Tov24 = new LinkedHashMap<String, String>();
    convertv24Tov23 = new LinkedHashMap<String, String>();
    forcev23Tov24 = new LinkedHashMap<String, String>();
    forcev24Tov23 = new LinkedHashMap<String, String>();
    loadID3v22ID3v23Mapping();
    loadID3v23ID3v24Mapping();
  }
  
  private static void loadID3v22ID3v23Mapping() {
    Map<String, String> map = convertv22Tov23;
    map.put("TP2", "TPE2");
    map.put("TAL", "TALB");
    map.put("TP1", "TPE1");
    map.put("CRA", "AENC");
    map.put("TBP", "TBPM");
    map.put("COM", "COMM");
    map.put("COM", "COMM");
    map.put("TCM", "TCOM");
    map.put("TP3", "TPE3");
    map.put("TT1", "TIT1");
    map.put("TCR", "TCOP");
    map.put("TEN", "TENC");
    map.put("EQU", "EQUA");
    map.put("ETC", "ETCO");
    map.put("TFT", "TFLT");
    map.put("GEO", "GEOB");
    map.put("TCO", "TCON");
    map.put("TSS", "TSSE");
    map.put("TKE", "TKEY");
    map.put("IPL", "IPLS");
    map.put("TRC", "TSRC");
    map.put("GP1", "GRP1");
    map.put(ckOPp.OSClItr, "TLAN");
    map.put("TLE", "TLEN");
    map.put("LNK", "LINK");
    map.put("TXT", "TEXT");
    map.put("TMT", "TMED");
    map.put("MVN", "MVNM");
    map.put("MVI", "MVIN");
    map.put("MLL", "MLLT");
    map.put("MCI", "MCDI");
    map.put("TOA", "TOPE");
    map.put("TOF", "TOFN");
    map.put("TOL", "TOLY");
    map.put("TOT", "TOAL");
    map.put("TDY", "TDLY");
    map.put("CNT", "PCNT");
    map.put("CNT", "PCNT");
    map.put("POP", "POPM");
    map.put("TPB", "TPUB");
    map.put("BUF", "RBUF");
    map.put("BUF", "RBUF");
    map.put("RVA", "RVAD");
    map.put("TP4", "TPE4");
    map.put("REV", "RVRB");
    map.put("TPA", "TPOS");
    map.put("TPS", "TSST");
    map.put("SLT", "SYLT");
    map.put("STC", "SYTC");
    map.put("TDA", "TDAT");
    map.put("TIM", "TIME");
    map.put("TT3", "TIT3");
    map.put("TOR", "TORY");
    map.put("TRK", "TRCK");
    map.put("TRD", "TRDA");
    map.put("TSI", "TSIZ");
    map.put("TYE", "TYER");
    map.put("UFI", "UFID");
    map.put("UFI", "UFID");
    map.put("ULT", "USLT");
    map.put(ybWnIKHovcRr.KqZPaHOjWpo, "WOAR");
    map.put("WCM", "WCOM");
    map.put("WCP", "WCOP");
    map.put(JkpGFvCVQHzgc.wXcoEq, "WOAF");
    map.put("WRS", "WORS");
    map.put("WPAY", "WPAY");
    map.put("WPB", "WPUB");
    map.put("WAS", "WOAS");
    map.put("TXX", "TXXX");
    map.put("WXX", "WXXX");
    map.put("TT2", "TIT2");
    map.put("TCP", "TCMP");
    map.put("TST", "TSOT");
    map.put("TSP", "TSOP");
    map.put("TSA", "TSOA");
    map.put("TS2", "TSO2");
    map.put("TSC", "TSOC");
    for (String str1 : map.keySet()) {
      String str2 = convertv22Tov23.get(str1);
      convertv23Tov22.put(str2, str1);
    } 
    map = convertv23Tov22;
    map.put("XSOT", "TST");
    map.put("XSOP", "TSP");
    map.put("XSOA", "TSA");
    forcev22Tov23.put("PIC", "APIC");
    forcev23Tov22.put("APIC", "PIC");
  }
  
  private static void loadID3v23ID3v24Mapping() {
    Map<String, String> map = convertv23Tov24;
    map.put("XSOT", hbrAVtEa.oenldVw);
    map.put("XSOP", "TSOP");
    map.put("XSOA", "TSOA");
    map = forcev23Tov24;
    map.put("RVAD", "RVA2");
    map.put("EQUA", "EQU2");
    map.put("IPLS", "TIPL");
    map.put(ybWnIKHovcRr.GIARVPYqwFrDBZ, "TDRC");
    map.put("TIME", "TDRC");
    map.put("TORY", "TDOR");
    map.put("TRDA", "TDRC");
    map.put("TYER", "TDRC");
    map = forcev24Tov23;
    map.put("RVA2", "RVAD");
    map.put("TIPL", "IPLS");
    map.put("TMOO", "TXXX");
    map.put("TDOR", "TORY");
  }
  
  public TreeSet<String> getSupportedFrames() {
    return this.supportedFrames;
  }
  
  public boolean isBinary(String paramString) {
    return this.binaryFrames.contains(paramString);
  }
  
  public boolean isCommon(String paramString) {
    return this.commonFrames.contains(paramString);
  }
  
  public boolean isDiscardIfFileAltered(String paramString) {
    return this.discardIfFileAlteredFrames.contains(paramString);
  }
  
  public boolean isExtensionFrames(String paramString) {
    return this.extensionFrames.contains(paramString);
  }
  
  public boolean isMultipleAllowed(String paramString) {
    return this.multipleFrames.contains(paramString);
  }
  
  public boolean isSupportedFrames(String paramString) {
    return this.supportedFrames.contains(paramString);
  }
  
  public abstract void setITunes12_6WorkGroupingMode(boolean paramBoolean);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3Frames.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */