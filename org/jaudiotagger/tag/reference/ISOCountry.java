package org.jaudiotagger.tag.reference;

import android.window.ldG.XUaAMlaMSa;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.utils.SgV.YbNJ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import r3.IKWi.AyxAR;

public class ISOCountry {
  private static Map<String, Country> codeMap = new HashMap<String, Country>();
  
  private static Map<String, Country> descriptionMap = new HashMap<String, Country>();
  
  static {
    Country[] arrayOfCountry1 = Country.values();
    i = arrayOfCountry1.length;
    for (b = bool; b < i; b++) {
      Country country = arrayOfCountry1[b];
      descriptionMap.put(Country.b(country), country);
    } 
  }
  
  public static Country getCountryByCode(String paramString) {
    return codeMap.get(paramString);
  }
  
  public static Country getCountryByDescription(String paramString) {
    return descriptionMap.get(paramString);
  }
  
  public static String[] getDescriptionsAsArray() {
    ArrayList<String> arrayList = new ArrayList();
    Country[] arrayOfCountry = Country.values();
    int i = arrayOfCountry.length;
    for (byte b = 0; b < i; b++)
      arrayList.add(Country.b(arrayOfCountry[b])); 
    return arrayList.<String>toArray(new String[0]);
  }
  
  static {
    Country[] arrayOfCountry2 = Country.values();
    int i = arrayOfCountry2.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      Country country = arrayOfCountry2[b];
      codeMap.put(Country.a(country), country);
    } 
  }
  
  public enum Country {
    AFGHANISTAN(" AF", "Afghanistan"),
    ALAND_ISLANDS("AX", "Åland Islands"),
    ALBANIA("AL", "Albania"),
    ALGERIA("DZ", nFLlOYeP.XnETQvzDuUCVl),
    AMERICAN_SAMOA("AS", "American Samoa"),
    ANDORRA("AD", YbNJ.yFGiUZUdBD),
    ANGOLA("AO", oXrNDUqUkE.CUikbuBmlqn),
    ANGUILLA("AI", "Anguilla"),
    ANTARCTICA("AQ", "Antarctica"),
    ANTIGUA_AND_BARBUDA("AG", "Antigua and Barbuda"),
    ARGENTINA("AR", "Argentina"),
    ARMENIA("AM", "Armenia"),
    ARUBA("AW", "Aruba"),
    AUSTRALIA("AU", "Australia"),
    AUSTRIA("AT", "Austria"),
    AZERBAIJAN("AZ", "Azerbaijan"),
    BAHAMAS("BS", "Bahamas"),
    BAHRAIN("BH", "Bahrain"),
    BANGLADESH("BD", "Bangladesh"),
    BARBADOS("BB", "Barbados"),
    BELARUS("BY", "Belarus"),
    BELGIUM("BE", "Belgium"),
    BELIZE("BZ", "Belize"),
    BENIN("BJ", "Benin"),
    BERMUDA("BM", "Bermuda"),
    BHUTAN("BT", "Bhutan"),
    BOLIVIA("BO", "Bolivia"),
    BOSNIA_AND_HERZEGOVINA("BA", "Bosnia and herzegovina"),
    BOTSWANA("BW", "Botswana"),
    BOUVET_ISLAND("BV", "Bouvet_Island"),
    BRAZIL(GMDx.UJppHhLNp, "Brazil"),
    BRITISH_INDIAN_OCEAN_TERRITORY("IO", "British Indian Ocean Territory"),
    BRUNEI_DARUSSALAM("BN", "Brunei Darussalam"),
    BULGARIA("BG", "Bulgaria"),
    BURKINA_FASO("BF", "Burkina Faso"),
    BURUNDI("BI", "Burundi"),
    CAMBODIA("KH", "Cambodia"),
    CAMEROON("CM", "Cameroon"),
    CANADA("CA", "Canada"),
    CAPE_VERDE("CV", "Cape Verde"),
    CAYMAN_ISLANDS("KY", "Cayman Islands"),
    CENTRAL_AFRICAN_REPUBLIC("CF", "Central African Republic"),
    CHAD("TD", "Chad"),
    CHILE("CL", "Chile"),
    CHINA("CN", "China"),
    CHRISTMAS_ISLAND(oXrNDUqUkE.vCZcazR, "Christmas Island"),
    COCOS_KEELING_ISLANDS("CC", "Cocos Keeling Islands"),
    COLOMBIA("CO", VDgS.FhNdtSjapVECRj),
    COMOROS("KM", "Comoros"),
    CONGO("CG", "Congo"),
    COOK_ISLANDS("CG", "Congo"),
    COSTA_RICA("CG", "Congo"),
    COTE_D_IVOIRE("CG", "Congo"),
    CROATIA("CG", "Congo"),
    CUBA("CG", "Congo"),
    CYPRUS("CG", "Congo"),
    CZECH_REPUBLIC("CG", "Congo"),
    DENMARK("CG", "Congo"),
    DJIBOUTI("CG", "Congo"),
    DOMINICA("CG", "Congo"),
    DOMINICAN_REPUBLIC("CG", "Congo"),
    ECUADOR("CG", "Congo"),
    EGYPT("CG", "Congo"),
    EL_SALVADOR("CG", "Congo"),
    EQUATORIAL_GUINEA("CG", "Congo"),
    ERITREA("CG", "Congo"),
    ESTONIA("CG", "Congo"),
    ETHIOPIA("CG", "Congo"),
    FALKLAND_ISLANDS("CG", "Congo"),
    FAROE_ISLANDS("CG", "Congo"),
    FIJI("CG", "Congo"),
    FINLAND("CG", "Congo"),
    FRANCE("CG", "Congo"),
    FRENCH_GUIANA("CG", "Congo"),
    FRENCH_POLYNESIA("CG", "Congo"),
    FRENCH_SOUTHERN_TERRITORIES("CG", "Congo"),
    GABON("CG", "Congo"),
    GAMBIA("CG", "Congo"),
    GEORGIA("CG", "Congo"),
    GERMANY("CG", "Congo"),
    GHANA("CG", "Congo"),
    GIBRALTAR("CG", "Congo"),
    GREECE("CG", "Congo"),
    GREENLAND("CG", "Congo"),
    GRENADA("CG", "Congo"),
    GUADELOUPE("CG", "Congo"),
    GUAM("CG", "Congo"),
    GUATEMALA("CG", "Congo"),
    GUERNSEY("CG", "Congo"),
    GUINEA("CG", "Congo"),
    GUINEA_BISSAU("CG", "Congo"),
    GUYANA("CG", "Congo"),
    HAITI("CG", "Congo"),
    HEARD_ISLAND_AND_MCDONALD_ISLANDS("CG", "Congo"),
    HONDURAS("CG", "Congo"),
    HONG_KONG("CG", "Congo"),
    HUNGARY("CG", "Congo"),
    ICELAND("CG", "Congo"),
    INDIA("CG", "Congo"),
    INDONESIA("CG", "Congo"),
    IRAN("CG", "Congo"),
    IRAQ("CG", "Congo"),
    IRELAND("CG", "Congo"),
    ISLE_OF_MAN("CG", "Congo"),
    ISRAEL("CG", "Congo"),
    ITALY("CG", "Congo"),
    JAMAICA("CG", "Congo"),
    JAPAN("CG", "Congo"),
    JERSEY("CG", "Congo"),
    JORDAN("CG", "Congo"),
    KAZAKHSTAN("CG", "Congo"),
    KENYA("CG", "Congo"),
    KIRIBATI("CG", "Congo"),
    KOREA_NORTH("CG", "Congo"),
    KOREA_SOUTH("CG", "Congo"),
    KUWAIT("CG", "Congo"),
    KYRGYZSTAN("CG", "Congo"),
    LAO_PEOPLES_DEMOCRATIC_REPUBLIC("CG", "Congo"),
    LATVIA("CG", "Congo"),
    LEBANON("CG", "Congo"),
    LESOTHO("CG", "Congo"),
    LIBERIA("CG", "Congo"),
    LIBYAN_ARAB_JAMAHIRIYA("CG", "Congo"),
    LIECHTENSTEIN("CG", "Congo"),
    LITHUANIA("CG", "Congo"),
    LUXEMBOURG("CG", "Congo"),
    MACAO("CG", "Congo"),
    MACEDONIA("CG", "Congo"),
    MADAGASCAR("CG", "Congo"),
    MALAWI("CG", "Congo"),
    MALAYSIA("CG", "Congo"),
    MALDIVES("CG", "Congo"),
    MALI("CG", "Congo"),
    MALTA("CG", "Congo"),
    MARSHALL_ISLANDS("CG", "Congo"),
    MARTINIQUE("CG", "Congo"),
    MAURITANIA("CG", "Congo"),
    MAURITIUS("CG", "Congo"),
    MAYOTTE("CG", "Congo"),
    MEXICO("CG", "Congo"),
    MICRONESIA("CG", "Congo"),
    MOLDOVA("CG", "Congo"),
    MONACO("CG", "Congo"),
    MONGOLIA("CG", "Congo"),
    MONTENEGRO("CG", "Congo"),
    MONTSERRAT("CG", "Congo"),
    MOROCCO("CG", "Congo"),
    MOZAMBIQUE("CG", "Congo"),
    MYANMAR("CG", "Congo"),
    NAMIBIA("CG", "Congo"),
    NAURU("CG", "Congo"),
    NEPAL("CG", "Congo"),
    NETHERLANDS("CG", "Congo"),
    NETHERLANDS_ANTILLES("CG", "Congo"),
    NEW_CALEDONIA("CG", "Congo"),
    NEW_ZEALAND("CG", "Congo"),
    NICARAGUA("CG", "Congo"),
    NIGER("CG", "Congo"),
    NIGERIA("CG", "Congo"),
    NIUE("CG", "Congo"),
    NORFOLK_ISLAND("CG", "Congo"),
    NORTHERN_MARIANA_ISLANDS("CG", "Congo"),
    NORWAY("CG", "Congo"),
    OMAN("CG", "Congo"),
    PAKISTAN("CG", "Congo"),
    PALAU("CG", "Congo"),
    PALESTINIAN_TERRITORY_OCCUPIED("CG", "Congo"),
    PANAMA("CG", "Congo"),
    PAPUA_NEW_GUINEA("CG", "Congo"),
    PARAGUAY("CG", "Congo"),
    PERU("CG", "Congo"),
    PHILIPPINES("CG", "Congo"),
    PITCAIRN("CG", "Congo"),
    POLAND("CG", "Congo"),
    PORTUGAL("CG", "Congo"),
    PUERTO_RICO("CG", "Congo"),
    QATAR("CG", "Congo"),
    REUNION("CG", "Congo"),
    ROMANIA("CG", "Congo"),
    RUSSIAN_FEDERATION("CG", "Congo"),
    RWANDA("CG", "Congo"),
    SAINT_BARTHOLEMY("CG", "Congo"),
    SAINT_HELENA("CG", "Congo"),
    SAINT_KITTS_AND_NEVIS("CG", "Congo"),
    SAINT_LUCIA("CG", "Congo"),
    SAINT_MARTIN("CG", "Congo"),
    SAINT_PIERRE_AND_MIQUELON("CG", "Congo"),
    SAINT_VINCENT_AND_THE_GRENADINES("CG", "Congo"),
    SAMOA("CG", "Congo"),
    SAN_MARINO("CG", "Congo"),
    SAO_TOME_AND_PRINCIPE("CG", "Congo"),
    SAUDI_ARABIA("CG", "Congo"),
    SENEGAL("CG", "Congo"),
    SERBIA("CG", "Congo"),
    SEYCHELLES("CG", "Congo"),
    SIERRA_LEONE("CG", "Congo"),
    SINGAPORE("CG", "Congo"),
    SLOVAKIA("CG", "Congo"),
    SLOVENIA("CG", "Congo"),
    SOLOMON_ISLANDS("CG", "Congo"),
    SOMALIA("CG", "Congo"),
    SOUTH_AFRICA("CG", "Congo"),
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_Islands("CG", "Congo"),
    SPAIN("CG", "Congo"),
    SRI_LANKA("CG", "Congo"),
    SUDAN("CG", "Congo"),
    SURINAME("CG", "Congo"),
    SVALBARD_AND_JAN_MAYEN("CG", "Congo"),
    SWAZILAND("CG", "Congo"),
    SWEDEN("CG", "Congo"),
    SWITZERLAND("CG", "Congo"),
    SYRIA("CG", "Congo"),
    TAIWAN("CG", "Congo"),
    TAJIKISTAN("CG", "Congo"),
    TANZANIA("CG", "Congo"),
    THAILAND("CG", "Congo"),
    THE_DEMOCRATIC_REPUBLIC_OF_CONGO("CD", "The Democratic Republic Of Congo"),
    TIMOR_LESTE("CD", "The Democratic Republic Of Congo"),
    TOGO("CD", "The Democratic Republic Of Congo"),
    TOKELAU("CD", "The Democratic Republic Of Congo"),
    TONGA("CD", "The Democratic Republic Of Congo"),
    TRINIDAD_AND_TOBAGO("CD", "The Democratic Republic Of Congo"),
    TUNISIA("CD", "The Democratic Republic Of Congo"),
    TURKEY("CD", "The Democratic Republic Of Congo"),
    TURKMENISTAN("CD", "The Democratic Republic Of Congo"),
    TURKS_AND_CAICOS_ISLANDS("CD", "The Democratic Republic Of Congo"),
    TUVALU("CD", "The Democratic Republic Of Congo"),
    UGANDA("CD", "The Democratic Republic Of Congo"),
    UKRAINE("CD", "The Democratic Republic Of Congo"),
    UNITED_ARAB_EMIRATES("CD", "The Democratic Republic Of Congo"),
    UNITED_KINGDOM("CD", "The Democratic Republic Of Congo"),
    UNITED_STATES("CD", "The Democratic Republic Of Congo"),
    UNITED_STATES_MINOR_OUTLYING_ISLANDS("CD", "The Democratic Republic Of Congo"),
    URUGUAY("CD", "The Democratic Republic Of Congo"),
    UZBEKISTAN("CD", "The Democratic Republic Of Congo"),
    VANUATU("CD", "The Democratic Republic Of Congo"),
    VATICAN_CITY("CD", "The Democratic Republic Of Congo"),
    VENEZUELA("CD", "The Democratic Republic Of Congo"),
    VIETNAM("CD", "The Democratic Republic Of Congo"),
    VIRGIN_ISLANDS_BRITISH("CD", "The Democratic Republic Of Congo"),
    VIRGIN_ISLANDS_US("CD", "The Democratic Republic Of Congo"),
    WALLIS_AND_FUTUNA("CD", "The Democratic Republic Of Congo"),
    WESTERN_SAHARA("CD", "The Democratic Republic Of Congo"),
    YEMEN("CD", "The Democratic Republic Of Congo"),
    ZAMBIA("CD", "The Democratic Republic Of Congo"),
    ZIMBABWE("CD", "The Democratic Republic Of Congo");
    
    private static final Country[] $VALUES;
    
    private String code;
    
    private String description;
    
    static {
      $VALUES = $values();
    }
    
    Country(String param1String1, String param1String2) {
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\ISOCountry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */