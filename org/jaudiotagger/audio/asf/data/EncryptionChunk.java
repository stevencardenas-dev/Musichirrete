package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import org.jaudiotagger.audio.asf.util.Utils;
import x41;

public class EncryptionChunk extends Chunk {
  private String keyID = "";
  
  private String licenseURL = "";
  
  private String protectionType = "";
  
  private String secretData = "";
  
  private final ArrayList<String> strings = new ArrayList<String>();
  
  public EncryptionChunk(BigInteger paramBigInteger) {
    super(GUID.GUID_CONTENT_ENCRYPTION, paramBigInteger);
  }
  
  public void addString(String paramString) {
    this.strings.add(paramString);
  }
  
  public String getKeyID() {
    return this.keyID;
  }
  
  public String getLicenseURL() {
    return this.licenseURL;
  }
  
  public String getProtectionType() {
    return this.protectionType;
  }
  
  public String getSecretData() {
    return this.secretData;
  }
  
  public Collection<String> getStrings() {
    return new ArrayList<String>(this.strings);
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder1 = new StringBuilder(super.prettyPrint(paramString));
    StringBuilder stringBuilder2 = new StringBuilder();
    String str1 = Utils.LINE_SEPARATOR;
    stringBuilder2.append(str1);
    stringBuilder2.append(paramString);
    stringBuilder2.append(" Encryption:");
    stringBuilder2.append(str1);
    String str2 = stringBuilder2.toString();
    byte b = 0;
    stringBuilder1.insert(0, str2);
    stringBuilder1.append(paramString);
    stringBuilder1.append("\t|->keyID ");
    x41.v(stringBuilder1, this.keyID, str1, paramString, "\t|->secretData ");
    x41.v(stringBuilder1, this.secretData, str1, paramString, "\t|->protectionType ");
    x41.v(stringBuilder1, this.protectionType, str1, paramString, "\t|->licenseURL ");
    stringBuilder1.append(this.licenseURL);
    stringBuilder1.append(str1);
    this.strings.iterator();
    ArrayList<String> arrayList = this.strings;
    int i = arrayList.size();
    while (b < i) {
      str2 = arrayList.get(b);
      b++;
      str2 = str2;
      stringBuilder1.append(paramString);
      stringBuilder1.append("   |->");
      stringBuilder1.append(str2);
      stringBuilder1.append(Utils.LINE_SEPARATOR);
    } 
    return stringBuilder1.toString();
  }
  
  public void setKeyID(String paramString) {
    this.keyID = paramString;
  }
  
  public void setLicenseURL(String paramString) {
    this.licenseURL = paramString;
  }
  
  public void setProtectionType(String paramString) {
    this.protectionType = paramString;
  }
  
  public void setSecretData(String paramString) {
    this.secretData = paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\EncryptionChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */