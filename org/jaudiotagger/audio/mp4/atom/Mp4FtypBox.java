package org.jaudiotagger.audio.mp4.atom;

import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public class Mp4FtypBox extends AbstractMp4Box {
  private static final int COMPATIBLE_BRAND_LENGTH = 4;
  
  private static final int MAJOR_BRAND_LENGTH = 4;
  
  private List<String> compatibleBrands = new ArrayList<String>();
  
  private String majorBrand;
  
  private int majorBrandVersion;
  
  public Mp4FtypBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    this.dataBuffer = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
  }
  
  public List<String> getCompatibleBrands() {
    return this.compatibleBrands;
  }
  
  public String getMajorBrand() {
    return this.majorBrand;
  }
  
  public int getMajorBrandVersion() {
    return this.majorBrandVersion;
  }
  
  public void processData() {
    CharsetDecoder charsetDecoder = Charset.forName("ISO-8859-1").newDecoder();
    try {
      this.majorBrand = charsetDecoder.decode((ByteBuffer)this.dataBuffer.slice().limit(4)).toString();
    } catch (CharacterCodingException characterCodingException) {}
    ByteBuffer byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 4);
    this.majorBrandVersion = this.dataBuffer.getInt();
    while (true) {
      if (this.dataBuffer.position() < this.dataBuffer.limit() && this.dataBuffer.limit() - this.dataBuffer.position() >= 4) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        charsetDecoder.onMalformedInput(codingErrorAction);
        charsetDecoder.onMalformedInput(codingErrorAction);
        try {
          String str = charsetDecoder.decode((ByteBuffer)this.dataBuffer.slice().limit(4)).toString();
          if (!str.equals("\000\000\000\000"))
            this.compatibleBrands.add(str); 
        } catch (CharacterCodingException characterCodingException) {}
        ByteBuffer byteBuffer1 = this.dataBuffer;
        byteBuffer1.position(byteBuffer1.position() + 4);
        continue;
      } 
      return;
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Major Brand:");
    stringBuilder.append(this.majorBrand);
    stringBuilder.append("Version:");
    stringBuilder.append(this.majorBrandVersion);
    String str = stringBuilder.toString();
    if (this.compatibleBrands.size() > 0) {
      str = str.concat("Compatible:");
      for (String str1 : this.compatibleBrands) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(str1);
        str = stringBuilder1.toString().concat(",");
      } 
      return str.substring(0, str.length() - 1);
    } 
    return str;
  }
  
  public enum Brand {
    AES_ENCRYPTED_AUDIO,
    APPLE_AAC_AUDIO,
    APPLE_AUDIO,
    APPLE_AUDIO_ONLY,
    ISO14496_12_BASE_MEDIA,
    ISO14496_12_MPEG7_METADATA,
    ISO14496_1_BASE_MEDIA("isom", "ISO 14496-1"),
    ISO14496_1_VERSION_1("isom", "ISO 14496-1"),
    ISO14496_1_VERSION_2("isom", "ISO 14496-1"),
    JVT_AVC("isom", "ISO 14496-1"),
    QUICKTIME_MOVIE("isom", "ISO 14496-1"),
    THREEG_MOBILE_MP4("isom", "ISO 14496-1");
    
    private static final Brand[] $VALUES;
    
    private String description;
    
    private String id;
    
    static {
      JVT_AVC = new Brand("JVT_AVC", 5, "avc1", uvJYmft.qDsoGRFJUrzGqv);
      THREEG_MOBILE_MP4 = new Brand("THREEG_MOBILE_MP4", 6, "MPA ", "3G Mobile");
      APPLE_AAC_AUDIO = new Brand("APPLE_AAC_AUDIO", 7, "M4P ", "Apple Audio");
      AES_ENCRYPTED_AUDIO = new Brand("AES_ENCRYPTED_AUDIO", 8, "M4B ", "Apple encrypted Audio");
      APPLE_AUDIO = new Brand("APPLE_AUDIO", 9, "mp71", "Apple Audio");
      ISO14496_12_MPEG7_METADATA = new Brand(nFLlOYeP.WGPwNHpknvvPOh, 10, "mp71", "MAIN_SYNTHESIS");
      APPLE_AUDIO_ONLY = new Brand("APPLE_AUDIO_ONLY", 11, "M4A ", "M4A Audio");
      $VALUES = $values();
    }
    
    Brand(String param1String1, String param1String2) {
      this.id = param1String1;
      this.description = param1String2;
    }
    
    public String getDescription() {
      return this.description;
    }
    
    public String getId() {
      return this.id;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4FtypBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */