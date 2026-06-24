package org.jaudiotagger.tag.reference;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.utils.SgV.YbNJ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import r3.IKWi.AyxAR;

public class ISOScript {
  private static Map<String, Script> codeMap = new HashMap<String, Script>();
  
  private static Map<String, Script> descriptionMap = new HashMap<String, Script>();
  
  static {
    Script[] arrayOfScript2 = Script.values();
    i = arrayOfScript2.length;
    for (b = bool; b < i; b++) {
      Script script = arrayOfScript2[b];
      descriptionMap.put(Script.b(script), script);
    } 
  }
  
  public static String[] getDescriptionsAsArray() {
    ArrayList<String> arrayList = new ArrayList();
    Script[] arrayOfScript = Script.values();
    int i = arrayOfScript.length;
    for (byte b = 0; b < i; b++)
      arrayList.add(Script.b(arrayOfScript[b])); 
    return arrayList.<String>toArray(new String[0]);
  }
  
  public static Script getScriptByCode(String paramString) {
    return codeMap.get(paramString);
  }
  
  public static Script getScriptByDescription(String paramString) {
    return descriptionMap.get(paramString);
  }
  
  static {
    Script[] arrayOfScript1 = Script.values();
    int i = arrayOfScript1.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      Script script = arrayOfScript1[b];
      codeMap.put(Script.a(script), script);
    } 
  }
  
  public enum Script {
    ARABIC("Arab", "Arabic"),
    ARMENIAN("Arab", "Arabic"),
    AVESTAN("Arab", "Arabic"),
    BALINESE("Arab", "Arabic"),
    BATAK("Arab", "Arabic"),
    BENGALI("Arab", "Arabic"),
    BLISSYMBOLS("Arab", "Arabic"),
    BOOK_PAHLAVI("Arab", "Arabic"),
    BOPOMOFO("Arab", "Arabic"),
    BRAHMI("Arab", "Arabic"),
    BRAILLE("Arab", "Arabic"),
    BUGINESE("Arab", "Arabic"),
    BUHID("Arab", "Arabic"),
    CANADIAN_SYLLABICS("Arab", "Arabic"),
    CARIAN("Arab", "Arabic"),
    CHAKMA("Arab", "Arabic"),
    CHAM("Arab", "Arabic"),
    CHEROKEE("Arab", "Arabic"),
    CIRTH("Arab", "Arabic"),
    COPTIC("Arab", "Arabic"),
    CUNEIFORM_SUMERO_AKKADIAN("Arab", "Arabic"),
    CYPRIOT("Arab", "Arabic"),
    CYRILLIC("Arab", "Arabic"),
    CYRILLIC_OLD_CHURCH_SLAVONIC_VARIANT("Arab", "Arabic"),
    DESERET("Arab", "Arabic"),
    DEVANAGARI("Arab", "Arabic"),
    EGYPTIAN_DEMOTIC("Arab", "Arabic"),
    EGYPTIAN_HIERATIC("Arab", "Arabic"),
    EGYPTIAN_HIEROGLYPHS("Arab", "Arabic"),
    ETHIOPIC("Arab", "Arabic"),
    GEORGIAN("Arab", "Arabic"),
    GLAGOLITIC("Arab", "Arabic"),
    GOTHIC("Arab", "Arabic"),
    GREEK("Arab", "Arabic"),
    GUJARATI("Arab", "Arabic"),
    GURMUKHI("Arab", "Arabic"),
    HANGUL("Arab", "Arabic"),
    HANUNOO("Arab", "Arabic"),
    HAN_HANJA("Arab", "Arabic"),
    HAN_SIMPLIFIED("Arab", "Arabic"),
    HAN_TRADITIONAL("Arab", "Arabic"),
    HEBREW("Arab", "Arabic"),
    HIRAGANA("Arab", "Arabic"),
    HIRAGANA_KATAKANA("Arab", "Arabic"),
    IMPERIAL_ARAMAIC("Armi", "Imperial Aramaic"),
    INDUS("Armi", "Imperial Aramaic"),
    INSCRIPTIONAL_PAHLAVI("Armi", "Imperial Aramaic"),
    INSCRIPTIONAL_PARTHIAN("Armi", "Imperial Aramaic"),
    JAPANESE("Armi", "Imperial Aramaic"),
    JAVANESE("Armi", "Imperial Aramaic"),
    KAITHI("Armi", "Imperial Aramaic"),
    KANNADA("Armi", "Imperial Aramaic"),
    KATAKANA("Armi", "Imperial Aramaic"),
    KAYAH_LI("Armi", "Imperial Aramaic"),
    KHAROSHTHI("Armi", "Imperial Aramaic"),
    KHMER("Armi", "Imperial Aramaic"),
    KHUTSURI("Armi", "Imperial Aramaic"),
    KOREAN("Armi", "Imperial Aramaic"),
    LANNA("Armi", "Imperial Aramaic"),
    LAO("Armi", "Imperial Aramaic"),
    LATIN("Armi", "Imperial Aramaic"),
    LATIN_FRAKTUR_VARIANT("Armi", "Imperial Aramaic"),
    LATIN_GAELIC_VARIANT("Armi", "Imperial Aramaic"),
    LEPCHA("Armi", "Imperial Aramaic"),
    LIMBU("Armi", "Imperial Aramaic"),
    LINEAR_A("Armi", "Imperial Aramaic"),
    LINEAR_B("Armi", "Imperial Aramaic"),
    LYCIAN("Armi", "Imperial Aramaic"),
    LYDIAN("Armi", "Imperial Aramaic"),
    MALAYALAM("Armi", "Imperial Aramaic"),
    MANDAEAN("Armi", "Imperial Aramaic"),
    MANICHAEAN("Armi", "Imperial Aramaic"),
    MATHEMATICAL_NOTATION("Armi", "Imperial Aramaic"),
    MAYAN_HIEROGLYPHS("Armi", "Imperial Aramaic"),
    MEITEI_MAYEK("Armi", "Imperial Aramaic"),
    MEROITIC("Armi", "Imperial Aramaic"),
    MONGOLIAN("Armi", "Imperial Aramaic"),
    MOON("Armi", "Imperial Aramaic"),
    MYANMAR("Armi", "Imperial Aramaic"),
    NKO("Armi", "Imperial Aramaic"),
    OGHAM("Armi", "Imperial Aramaic"),
    OLD_HUNGARIAN("Armi", "Imperial Aramaic"),
    OLD_ITALIC("Armi", "Imperial Aramaic"),
    OLD_PERMIC("Armi", "Imperial Aramaic"),
    OLD_PERSIAN("Armi", "Imperial Aramaic"),
    OL_CHIKI("Armi", "Imperial Aramaic"),
    ORIYA("Armi", "Imperial Aramaic"),
    ORKHON("Armi", "Imperial Aramaic"),
    OSMANYA("Armi", "Imperial Aramaic"),
    PAHAWH_HMONG("Armi", "Imperial Aramaic"),
    PHAGS_PA("Armi", "Imperial Aramaic"),
    PHOENICIAN("Armi", "Imperial Aramaic"),
    POLLARD_PHONETIC("Armi", "Imperial Aramaic"),
    PSALTER_PAHLAVI("Armi", "Imperial Aramaic"),
    REJANG("Armi", "Imperial Aramaic"),
    RONGORONGO("Armi", "Imperial Aramaic"),
    RUNIC("Armi", "Imperial Aramaic"),
    SAMARITAN("Armi", "Imperial Aramaic"),
    SARATI("Armi", "Imperial Aramaic"),
    SAURASHTRA("Armi", "Imperial Aramaic"),
    SHAVIAN("Armi", "Imperial Aramaic"),
    SIGNWRITING("Armi", "Imperial Aramaic"),
    SINHALA("Armi", "Imperial Aramaic"),
    SUNDANESE("Armi", "Imperial Aramaic"),
    SYLOTI_NAGRI("Armi", "Imperial Aramaic"),
    SYMBOLS("Armi", "Imperial Aramaic"),
    SYRIAC("Armi", "Imperial Aramaic"),
    SYRIAC_EASTERN_VARIANT("Armi", "Imperial Aramaic"),
    SYRIAC_ESTRANGELO_VARIANT("Armi", "Imperial Aramaic"),
    SYRIAC_WESTERN_VARIANT("Armi", "Imperial Aramaic"),
    TAGALOG("Armi", "Imperial Aramaic"),
    TAGBANWA("Armi", "Imperial Aramaic"),
    TAI_LE("Armi", "Imperial Aramaic"),
    TAI_LUE("Armi", "Imperial Aramaic"),
    TAI_VIET("Armi", "Imperial Aramaic"),
    TAMIL("Armi", "Imperial Aramaic"),
    TELUGU("Armi", "Imperial Aramaic"),
    TENGWAR("Armi", "Imperial Aramaic"),
    THAANA("Armi", "Imperial Aramaic"),
    THAI("Armi", "Imperial Aramaic"),
    TIBETAN("Armi", "Imperial Aramaic"),
    TIFINAGH("Armi", "Imperial Aramaic"),
    UGARITIC("Armi", "Imperial Aramaic"),
    VAI("Armi", "Imperial Aramaic"),
    VISIBLE_SPEECH("Armi", "Imperial Aramaic"),
    YI("Armi", "Imperial Aramaic");
    
    private static final Script[] $VALUES;
    
    private String code;
    
    private String description;
    
    static {
      CANADIAN_SYLLABICS = new Script("CANADIAN_SYLLABICS", 14, "Cans", "Canadian Syllabics");
      CARIAN = new Script("CARIAN", 15, "Cari", AyxAR.gUupvH);
      CHAM = new Script("CHAM", 16, "Cham", "Cham");
      CHEROKEE = new Script("CHEROKEE", 17, "Cher", "Cherokee");
      CIRTH = new Script("CIRTH", 18, "Cirt", "Cirth");
      COPTIC = new Script("COPTIC", 19, "Copt", "Coptic");
      CYPRIOT = new Script("CYPRIOT", 20, "Cprt", "Cypriot");
      CYRILLIC = new Script("CYRILLIC", 21, "Cyrl", "Cyrillic");
      CYRILLIC_OLD_CHURCH_SLAVONIC_VARIANT = new Script("CYRILLIC_OLD_CHURCH_SLAVONIC_VARIANT", 22, "Cyrs", "Cyrillic (Old Church Slavonic variant)");
      DEVANAGARI = new Script("DEVANAGARI", 23, "Deva", "Devanagari");
      DESERET = new Script("DESERET", 24, "Dsrt", "Deseret");
      EGYPTIAN_DEMOTIC = new Script("EGYPTIAN_DEMOTIC", 25, "Egyd", "Egyptian demotic");
      EGYPTIAN_HIERATIC = new Script("EGYPTIAN_HIERATIC", 26, "Egyh", "Egyptian hieratic");
      EGYPTIAN_HIEROGLYPHS = new Script("EGYPTIAN_HIEROGLYPHS", 27, "Egyp", "Egyptian hieroglyphs");
      ETHIOPIC = new Script("ETHIOPIC", 28, "Ethi", "Ethiopic");
      KHUTSURI = new Script(nBRIsU.uyKkV, 29, "Geok", "Khutsuri");
      GEORGIAN = new Script("GEORGIAN", 30, "Geor", "Georgian");
      GLAGOLITIC = new Script(CKYHNesT.iogeM, 31, "Glag", "Glagolitic");
      GOTHIC = new Script("GOTHIC", 32, "Goth", "Gothic");
      GREEK = new Script("GREEK", 33, "Grek", "Greek");
      GUJARATI = new Script("GUJARATI", 34, "Gujr", "Gujarati");
      GURMUKHI = new Script("GURMUKHI", 35, "Guru", "Gurmukhi");
      HANGUL = new Script("HANGUL", 36, "Hang", zLtYiJUm.UQJaitNtvmNVS);
      HAN_HANJA = new Script("HAN_HANJA", 37, "Hani", "Han (Hanzi, Kanji, Hanja)");
      HANUNOO = new Script("HANUNOO", 38, "Hano", "Hanunoo");
      HAN_SIMPLIFIED = new Script("HAN_SIMPLIFIED", 39, "Hans", "Han (Simplified variant)");
      HAN_TRADITIONAL = new Script("HAN_TRADITIONAL", 40, "Hant", "Han (Traditional variant)");
      HEBREW = new Script("HEBREW", 41, "Hebr", fXMDNeMWaILNVh.sscc);
      HIRAGANA = new Script("HIRAGANA", 42, "Hira", "Hiragana");
      PAHAWH_HMONG = new Script("PAHAWH_HMONG", 43, "Hmng", "Pahawh Hmong");
      HIRAGANA_KATAKANA = new Script(OETETTfAjV.JGpZXg, 44, "Hrkt", "Hiragana + Katakana");
      OLD_HUNGARIAN = new Script("OLD_HUNGARIAN", 45, "Hung", "Old Hungarian");
      String str = PwbbJfsdcHrAjW.yFoTIxGe;
      INDUS = new Script(PwbbJfsdcHrAjW.tShuVgFqzep, 46, "Inds", str);
      OLD_ITALIC = new Script("OLD_ITALIC", 47, "Ital", "Old Italic");
      JAVANESE = new Script("JAVANESE", 48, "Java", "Javanese");
      JAPANESE = new Script("JAPANESE", 49, IGBYXeDFmKYajx.YpcSOZbu, "Japanese");
      KAYAH_LI = new Script("KAYAH_LI", 50, "Kali", GMDx.hyuSqRvX);
      KATAKANA = new Script("KATAKANA", 51, "Kana", "Katakana");
      KHAROSHTHI = new Script("KHAROSHTHI", 52, "Khar", "Kharoshthi");
      KHMER = new Script("KHMER", 53, "Khmr", "Khmer");
      KANNADA = new Script("KANNADA", 54, "Knda", "Kannada");
      KOREAN = new Script("KOREAN", 55, "Kore", "Korean");
      KAITHI = new Script("KAITHI", 56, "Kthi", "Kaithi");
      LANNA = new Script("LANNA", 57, "Lana", "Lanna");
      LAO = new Script("LAO", 58, "Laoo", "Lao");
      LATIN_FRAKTUR_VARIANT = new Script("LATIN_FRAKTUR_VARIANT", 59, "Latf", "Latin (Fraktur variant)");
      LATIN_GAELIC_VARIANT = new Script("LATIN_GAELIC_VARIANT", 60, zLtYiJUm.RCK, hbrAVtEa.ZMStrIRvzmc);
      LATIN = new Script("LATIN", 61, "Latn", nBRIsU.ybQwBT);
      LEPCHA = new Script("LEPCHA", 62, "Lepc", "Lepcha");
      LIMBU = new Script("LIMBU", 63, "Limb", "Limbu");
      LINEAR_A = new Script("LINEAR_A", 64, "Lina", "Linear A");
      LINEAR_B = new Script("LINEAR_B", 65, "Linb", "Linear B");
      LYCIAN = new Script("LYCIAN", 66, "Lyci", "Lycian");
      LYDIAN = new Script("LYDIAN", 67, "Lydi", "Lydian");
      MANDAEAN = new Script("MANDAEAN", 68, "Mand", "Mandaean");
      MANICHAEAN = new Script("MANICHAEAN", 69, "Mani", "Manichaean");
      MAYAN_HIEROGLYPHS = new Script("MAYAN_HIEROGLYPHS", 70, "Maya", "Mayan hieroglyphs");
      MEROITIC = new Script("MEROITIC", 71, "Mero", LHyji.tSbMGSrXbgQzOzk);
      MALAYALAM = new Script("MALAYALAM", 72, "Mlym", "Malayalam");
      MONGOLIAN = new Script("MONGOLIAN", 73, "Mong", "Mongolian");
      str = oXrNDUqUkE.xvaRZNdcJ;
      MOON = new Script("MOON", 74, str, str);
      MEITEI_MAYEK = new Script("MEITEI_MAYEK", 75, "Mtei", "Meitei Mayek");
      MYANMAR = new Script("MYANMAR", 76, "Mymr", "Myanmar");
      NKO = new Script("NKO", 77, "Nkoo", "N'ko");
      OGHAM = new Script("OGHAM", 78, "Ogam", "Ogham");
      OL_CHIKI = new Script("OL_CHIKI", 79, "Olck", "Ol Chiki");
      ORKHON = new Script("ORKHON", 80, "Orkh", "Orkhon");
      ORIYA = new Script("ORIYA", 81, uvJYmft.ryOQjHO, "Oriya");
      OSMANYA = new Script("OSMANYA", 82, "Osma", "Osmanya");
      OLD_PERMIC = new Script("OLD_PERMIC", 83, "Perm", "Old Permic");
      PHAGS_PA = new Script("PHAGS_PA", 84, "Phag", "Phags-pa");
      INSCRIPTIONAL_PAHLAVI = new Script("INSCRIPTIONAL_PAHLAVI", 85, "Phli", "Inscriptional Pahlavi");
      PSALTER_PAHLAVI = new Script("PSALTER_PAHLAVI", 86, "Phlp", "Psalter Pahlavi");
      BOOK_PAHLAVI = new Script("BOOK_PAHLAVI", 87, "Phlv", "Book Pahlavi");
      PHOENICIAN = new Script("PHOENICIAN", 88, "Phnx", "Phoenician");
      POLLARD_PHONETIC = new Script("POLLARD_PHONETIC", 89, "Plrd", "Pollard Phonetic");
      INSCRIPTIONAL_PARTHIAN = new Script("INSCRIPTIONAL_PARTHIAN", 90, "Prti", "Inscriptional Parthian");
      REJANG = new Script("REJANG", 91, "Rjng", "Rejang");
      RONGORONGO = new Script("RONGORONGO", 92, "Roro", "Rongorongo");
      RUNIC = new Script("RUNIC", 93, "Runr", "Runic");
      SAMARITAN = new Script("SAMARITAN", 94, zLtYiJUm.RXRv, "Samaritan");
      SARATI = new Script("SARATI", 95, "Sara", "Sarati");
      SAURASHTRA = new Script("SAURASHTRA", 96, "Saur", "Saurashtra");
      SIGNWRITING = new Script("SIGNWRITING", 97, "Sgnw", "SignWriting");
      SHAVIAN = new Script("SHAVIAN", 98, "Shaw", "Shavian");
      SINHALA = new Script("SINHALA", 99, "Sinh", "Sinhala");
      SUNDANESE = new Script("SUNDANESE", 100, "Sund", "Sundanese");
      SYLOTI_NAGRI = new Script("SYLOTI_NAGRI", 101, "Sylo", "Syloti Nagri");
      SYRIAC = new Script("SYRIAC", 102, "Syrc", "Syriac");
      SYRIAC_ESTRANGELO_VARIANT = new Script("SYRIAC_ESTRANGELO_VARIANT", 103, "Syre", "Syriac (Estrangelo variant)");
      SYRIAC_WESTERN_VARIANT = new Script("SYRIAC_WESTERN_VARIANT", 104, "Syrj", "Syriac (Western variant)");
      SYRIAC_EASTERN_VARIANT = new Script("SYRIAC_EASTERN_VARIANT", 105, "Syrn", "Syriac (Eastern variant)");
      TAGBANWA = new Script("TAGBANWA", 106, "Tagb", "Tagbanwa");
      TAI_LE = new Script("TAI_LE", 107, "Tale", "Tai Le");
      TAI_LUE = new Script("TAI_LUE", 108, "Talu", "Tai Lue");
      TAMIL = new Script("TAMIL", 109, "Taml", "Tamil");
      TAI_VIET = new Script("TAI_VIET", 110, "Tavt", "Tai Viet");
      TELUGU = new Script(GMDx.QsCbMi, 111, "Telu", "Telugu");
      TENGWAR = new Script("TENGWAR", 112, "Teng", "Tengwar");
      TIFINAGH = new Script("TIFINAGH", 113, "Tfng", "Tifinagh");
      TAGALOG = new Script("TAGALOG", 114, "Tglg", "Tagalog");
      THAANA = new Script("THAANA", 115, "Thaa", "Thaana");
      THAI = new Script("THAI", 116, "Thai", "Thai");
      TIBETAN = new Script("TIBETAN", 117, "Tibt", "Tibetan");
      UGARITIC = new Script(DJqHMztxflt.QSKrJVLNiCf, 118, "Ugar", "Ugaritic");
      VAI = new Script("VAI", 119, "Vaii", "Vai");
      VISIBLE_SPEECH = new Script("VISIBLE_SPEECH", 120, "Visp", "Visible Speech");
      OLD_PERSIAN = new Script("OLD_PERSIAN", 121, "Xpeo", "Old Persian");
      CUNEIFORM_SUMERO_AKKADIAN = new Script(GMDx.FpJF, 122, "Xsux", "Cuneiform, Sumero-Akkadian");
      YI = new Script("YI", 123, "Yiii", "Yi");
      MATHEMATICAL_NOTATION = new Script("MATHEMATICAL_NOTATION", 124, "Zmth", "Mathematical notation");
      SYMBOLS = new Script("SYMBOLS", 125, "Zsym", "Symbols");
      $VALUES = $values();
    }
    
    Script(String param1String1, String param1String2) {
      this.code = param1String1;
      this.description = param1String2;
    }
    
    public String getCode() {
      return this.code;
    }
    
    public String getDescription() {
      return this.description;
    }
    
    public String toString() {
      return getDescription();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\ISOScript.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */