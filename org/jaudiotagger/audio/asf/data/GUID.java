package org.jaudiotagger.audio.asf.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import l0;
import org.jaudiotagger.audio.asf.util.Utils;

public final class GUID {
  static final boolean $assertionsDisabled = false;
  
  public static final GUID GUID_AUDIOSTREAM;
  
  public static final GUID GUID_AUDIO_ERROR_CONCEALEMENT_ABSENT;
  
  public static final GUID GUID_AUDIO_ERROR_CONCEALEMENT_INTERLEAVED = new GUID(new int[] { 
        64, 164, 241, 73, 206, 78, 208, 17, 163, 172, 
        0, 160, 201, 3, 72, 246 }, "Interleaved audio error concealment.");
  
  public static final GUID GUID_CONTENTDESCRIPTION;
  
  public static final GUID GUID_CONTENT_BRANDING;
  
  public static final GUID GUID_CONTENT_ENCRYPTION;
  
  public static final GUID GUID_ENCODING;
  
  public static final GUID GUID_EXTENDED_CONTENT_DESCRIPTION;
  
  public static final GUID GUID_FILE;
  
  public static final GUID GUID_HEADER;
  
  public static final GUID GUID_HEADER_EXTENSION;
  
  public static final GUID GUID_LANGUAGE_LIST;
  
  public static final int GUID_LENGTH = 16;
  
  public static final GUID GUID_METADATA;
  
  public static final GUID GUID_METADATA_LIBRARY;
  
  private static final Pattern GUID_PATTERN;
  
  public static final GUID GUID_STREAM;
  
  public static final GUID GUID_STREAM_BITRATE_PROPERTIES;
  
  private static final Map<GUID, GUID> GUID_TO_CONFIGURED;
  
  public static final GUID GUID_UNSPECIFIED;
  
  public static final GUID GUID_VIDEOSTREAM;
  
  public static final GUID[] KNOWN_GUIDS;
  
  public static final GUID SCRIPT_COMMAND_OBJECT;
  
  private String description = "";
  
  private int[] guidData = null;
  
  private int hash;
  
  static {
    GUID gUID17 = new GUID(new int[] { 
          64, 158, 105, 248, 77, 91, 207, 17, 168, 253, 
          0, 128, 95, 92, 68, 43 }, " Audio stream");
    GUID_AUDIOSTREAM = gUID17;
    GUID gUID4 = new GUID(new int[] { 
          250, 179, 17, 34, 35, 189, 210, 17, 180, 183, 
          0, 160, 201, 85, 252, 110 }, "Content Branding");
    GUID_CONTENT_BRANDING = gUID4;
    GUID gUID5 = new GUID(new int[] { 
          251, 179, 17, 34, 35, 189, 210, 17, 180, 183, 
          0, 160, 201, 85, 252, 110 }, "Content Encryption Object");
    GUID_CONTENT_ENCRYPTION = gUID5;
    GUID gUID1 = new GUID(new int[] { 
          51, 38, 178, 117, 142, 102, 207, 17, 166, 217, 
          0, 170, 0, 98, 206, 108 }, "Content Description");
    GUID_CONTENTDESCRIPTION = gUID1;
    GUID gUID6 = new GUID(new int[] { 
          64, 82, 209, 134, 29, 49, 208, 17, 163, 164, 
          0, 160, 201, 3, 72, 246 }, "Encoding description");
    GUID_ENCODING = gUID6;
    GUID gUID13 = new GUID(new int[] { 
          64, 164, 208, 210, 7, 227, 210, 17, 151, 240, 
          0, 160, 201, 94, 168, 80 }, "Extended Content Description");
    GUID_EXTENDED_CONTENT_DESCRIPTION = gUID13;
    GUID gUID11 = new GUID(new int[] { 
          161, 220, 171, 140, 71, 169, 207, 17, 142, 228, 
          0, 192, 12, 32, 83, 101 }, "File header");
    GUID_FILE = gUID11;
    GUID gUID8 = new GUID(new int[] { 
          48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 
          0, 170, 0, 98, 206, 108 }, "Asf header");
    GUID_HEADER = gUID8;
    GUID gUID12 = new GUID(new int[] { 
          181, 3, 191, 95, 46, 169, 207, 17, 142, 227, 
          0, 192, 12, 32, 83, 101 }, "Header Extension");
    GUID_HEADER_EXTENSION = gUID12;
    GUID gUID3 = new GUID(new int[] { 
          169, 70, 67, 124, 224, 239, 252, 75, 178, 41, 
          57, 62, 222, 65, 92, 133 }, "Language List");
    GUID_LANGUAGE_LIST = gUID3;
    GUID gUID14 = new GUID(new int[] { 
          234, 203, 248, 197, 175, 91, 119, 72, 132, 103, 
          170, 140, 68, 250, 76, 202 }, "Metadata");
    GUID_METADATA = gUID14;
    GUID gUID18 = new GUID(new int[] { 
          148, 28, 35, 68, 152, 148, 209, 73, 161, 65, 
          29, 19, 78, 69, 112, 84 }, "Metadata Library");
    GUID_METADATA_LIBRARY = gUID18;
    GUID_PATTERN = Pattern.compile("[a-f0-9]{8}\\-[a-f0-9]{4}\\-[a-f0-9]{4}\\-[a-f0-9]{4}\\-[a-f0-9]{12}", 2);
    GUID gUID16 = new GUID(new int[] { 
          145, 7, 220, 183, 183, 169, 207, 17, 142, 230, 
          0, 192, 12, 32, 83, 101 }, "Stream");
    GUID_STREAM = gUID16;
    GUID gUID15 = new GUID(new int[] { 
          206, 117, 248, 123, 141, 70, 209, 17, 141, 130, 
          0, 96, 151, 201, 162, 178 }, "Stream bitrate properties");
    GUID_STREAM_BITRATE_PROPERTIES = gUID15;
    GUID gUID7 = new GUID(new int[] { 
          0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
          0, 0, 0, 0, 0, 0 }, "Unspecified");
    GUID_UNSPECIFIED = gUID7;
    GUID gUID9 = new GUID(new int[] { 
          192, 239, 25, 188, 77, 91, 207, 17, 168, 253, 
          0, 128, 95, 92, 68, 43 }, "Video stream");
    GUID_VIDEOSTREAM = gUID9;
    GUID gUID10 = new GUID(new int[] { 
          48, 26, 251, 30, 98, 11, 208, 17, 163, 155, 
          0, 160, 201, 3, 72, 246 }, "Script Command Object");
    SCRIPT_COMMAND_OBJECT = gUID10;
    GUID[] arrayOfGUID = new GUID[18];
    arrayOfGUID[0] = gUID2;
    arrayOfGUID[1] = gUID1;
    arrayOfGUID[2] = gUID17;
    arrayOfGUID[3] = gUID6;
    arrayOfGUID[4] = gUID11;
    arrayOfGUID[5] = gUID8;
    arrayOfGUID[6] = gUID16;
    arrayOfGUID[7] = gUID13;
    arrayOfGUID[8] = gUID9;
    arrayOfGUID[9] = gUID12;
    arrayOfGUID[10] = gUID15;
    arrayOfGUID[11] = gUID10;
    arrayOfGUID[12] = gUID5;
    arrayOfGUID[13] = gUID4;
    arrayOfGUID[14] = gUID7;
    arrayOfGUID[15] = gUID18;
    arrayOfGUID[16] = gUID14;
    arrayOfGUID[17] = gUID3;
    KNOWN_GUIDS = arrayOfGUID;
    GUID_TO_CONFIGURED = new HashMap<GUID, GUID>(arrayOfGUID.length);
    int i = arrayOfGUID.length;
    for (byte b = 0; b < i; b++) {
      gUID1 = arrayOfGUID[b];
      GUID_TO_CONFIGURED.put(gUID1, gUID1);
    } 
  }
  
  public GUID(String paramString1, String paramString2) {
    this(parseGUID(paramString1).getGUID());
    if (paramString2 != null) {
      this.description = paramString2;
      return;
    } 
    l0.l("Argument must not be null.");
    throw null;
  }
  
  public GUID(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[paramArrayOfbyte.length];
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      arrayOfInt[b] = paramArrayOfbyte[b] & 0xFF; 
    setGUID(arrayOfInt);
  }
  
  public GUID(int[] paramArrayOfint) {
    setGUID(paramArrayOfint);
  }
  
  public GUID(int[] paramArrayOfint, String paramString) {
    this(paramArrayOfint);
    if (paramString != null) {
      this.description = paramString;
      return;
    } 
    l0.l("Argument must not be null.");
    throw null;
  }
  
  public static boolean assertGUID(int[] paramArrayOfint) {
    return (paramArrayOfint != null && paramArrayOfint.length == 16);
  }
  
  public static GUID getConfigured(GUID paramGUID) {
    return GUID_TO_CONFIGURED.get(paramGUID);
  }
  
  public static String getGuidDescription(GUID paramGUID) {
    if (paramGUID != null)
      return (getConfigured(paramGUID) != null) ? getConfigured(paramGUID).getDescription() : null; 
    l0.l("Argument must not be null.");
    return null;
  }
  
  private String[] getHex(byte[] paramArrayOfbyte) {
    String[] arrayOfString = new String[paramArrayOfbyte.length];
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      stringBuilder.delete(0, stringBuilder.length());
      stringBuilder.append(Integer.toHexString(paramArrayOfbyte[b] & 0xFF));
      if (stringBuilder.length() == 1)
        stringBuilder.insert(0, "0"); 
      arrayOfString[b] = stringBuilder.toString();
    } 
    return arrayOfString;
  }
  
  public static GUID parseGUID(String paramString) {
    if (paramString != null) {
      if (GUID_PATTERN.matcher(paramString).matches()) {
        int[] arrayOfInt = new int[16];
        byte b1 = 0;
        byte b2 = 0;
        while (b1 < paramString.length()) {
          if (paramString.charAt(b1) != '-') {
            (new int[16])[0] = 3;
            (new int[16])[1] = 2;
            (new int[16])[2] = 1;
            (new int[16])[3] = 0;
            (new int[16])[4] = 5;
            (new int[16])[5] = 4;
            (new int[16])[6] = 7;
            (new int[16])[7] = 6;
            (new int[16])[8] = 8;
            (new int[16])[9] = 9;
            (new int[16])[10] = 10;
            (new int[16])[11] = 11;
            (new int[16])[12] = 12;
            (new int[16])[13] = 13;
            (new int[16])[14] = 14;
            (new int[16])[15] = 15;
            arrayOfInt[(new int[16])[b2]] = Integer.parseInt(paramString.substring(b1, b1 + 2), 16);
            b1++;
            b2++;
          } 
          b1++;
        } 
        return new GUID(arrayOfInt);
      } 
      throw new GUIDFormatException("Invalid guidData format.");
    } 
    throw new GUIDFormatException("null");
  }
  
  private void setGUID(int[] paramArrayOfint) {
    if (assertGUID(paramArrayOfint)) {
      int[] arrayOfInt = new int[16];
      this.guidData = arrayOfInt;
      System.arraycopy(paramArrayOfint, 0, arrayOfInt, 0, 16);
      return;
    } 
    l0.l("The given guidData doesn't match the GUID specification.");
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof GUID) {
      paramObject = paramObject;
      return Arrays.equals(getGUID(), paramObject.getGUID());
    } 
    return false;
  }
  
  public byte[] getBytes() {
    int i = this.guidData.length;
    byte[] arrayOfByte = new byte[i];
    for (byte b = 0; b < i; b++)
      arrayOfByte[b] = (byte)(this.guidData[b] & 0xFF); 
    return arrayOfByte;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int[] getGUID() {
    int[] arrayOfInt2 = this.guidData;
    int[] arrayOfInt1 = new int[arrayOfInt2.length];
    System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
    return arrayOfInt1;
  }
  
  public int hashCode() {
    if (this.hash == -1) {
      int[] arrayOfInt = getGUID();
      int j = arrayOfInt.length;
      byte b = 0;
      int i = 0;
      while (b < j) {
        i = i * 31 + arrayOfInt[b];
        b++;
      } 
      this.hash = i;
    } 
    return this.hash;
  }
  
  public boolean isValid() {
    return assertGUID(getGUID());
  }
  
  public String prettyPrint() {
    StringBuilder stringBuilder = new StringBuilder();
    String str2 = getDescription();
    String str1 = str2;
    if (Utils.isBlank(str2))
      str1 = getGuidDescription(this); 
    if (!Utils.isBlank(str1)) {
      stringBuilder.append("Description: ");
      stringBuilder.append(str1);
      stringBuilder.append(Utils.LINE_SEPARATOR);
      stringBuilder.append("   ");
    } 
    stringBuilder.append(toString());
    return stringBuilder.toString();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = getHex(getBytes());
    stringBuilder.append(arrayOfString[3]);
    stringBuilder.append(arrayOfString[2]);
    stringBuilder.append(arrayOfString[1]);
    stringBuilder.append(arrayOfString[0]);
    stringBuilder.append('-');
    stringBuilder.append(arrayOfString[5]);
    stringBuilder.append(arrayOfString[4]);
    stringBuilder.append('-');
    stringBuilder.append(arrayOfString[7]);
    stringBuilder.append(arrayOfString[6]);
    stringBuilder.append('-');
    stringBuilder.append(arrayOfString[8]);
    stringBuilder.append(arrayOfString[9]);
    stringBuilder.append('-');
    stringBuilder.append(arrayOfString[10]);
    stringBuilder.append(arrayOfString[11]);
    stringBuilder.append(arrayOfString[12]);
    stringBuilder.append(arrayOfString[13]);
    stringBuilder.append(arrayOfString[14]);
    stringBuilder.append(arrayOfString[15]);
    return stringBuilder.toString();
  }
  
  static {
    GUID gUID2 = new GUID(new int[] { 
          64, 164, 241, 73, 206, 78, 208, 17, 163, 172, 
          0, 160, 201, 3, 72, 246 }, "Audio error concealment absent.");
    GUID_AUDIO_ERROR_CONCEALEMENT_ABSENT = gUID2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\GUID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */