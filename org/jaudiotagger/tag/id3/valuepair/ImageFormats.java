package org.jaudiotagger.tag.id3.valuepair;

import java.util.HashMap;
import java.util.Map;

public class ImageFormats {
  public static final String MIME_TYPE_BMP = "image/bmp";
  
  public static final String MIME_TYPE_GIF = "image/gif";
  
  public static final String MIME_TYPE_JPEG = "image/jpeg";
  
  public static final String MIME_TYPE_JPG = "image/jpg";
  
  public static final String MIME_TYPE_PDF = "image/pdf";
  
  public static final String MIME_TYPE_PICT = "image/x-pict";
  
  public static final String MIME_TYPE_PNG = "image/png";
  
  public static final String MIME_TYPE_TIFF = "image/tiff";
  
  public static final String V22_BMP_FORMAT = "BMP";
  
  public static final String V22_GIF_FORMAT = "GIF";
  
  public static final String V22_JPG_FORMAT = "JPG";
  
  public static final String V22_PDF_FORMAT = "PDF";
  
  public static final String V22_PIC_FORMAT = "PIC";
  
  public static final String V22_PNG_FORMAT = "PNG";
  
  public static final String V22_TIF_FORMAT = "TIF";
  
  private static Map<String, String> imageFormatsToMimeType = new HashMap<String, String>();
  
  private static Map<String, String> imageMimeTypeToFormat = new HashMap<String, String>();
  
  static {
    imageFormatsToMimeType.put("JPG", "image/jpeg");
    imageFormatsToMimeType.put("PNG", "image/png");
    imageFormatsToMimeType.put("GIF", "image/gif");
    imageFormatsToMimeType.put("BMP", "image/bmp");
    imageFormatsToMimeType.put("TIF", "image/tiff");
    imageFormatsToMimeType.put("PDF", "image/pdf");
    imageFormatsToMimeType.put("PIC", "image/x-pict");
    for (String str1 : imageFormatsToMimeType.keySet()) {
      String str2 = imageFormatsToMimeType.get(str1);
      imageMimeTypeToFormat.put(str2, str1);
    } 
    imageMimeTypeToFormat.put("image/jpg", "JPG");
  }
  
  public static boolean binaryDataIsBmpFormat(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 2) ? false : ((66 == (paramArrayOfbyte[0] & 0xFF) && 77 == (paramArrayOfbyte[1] & 0xFF)));
  }
  
  public static boolean binaryDataIsGifFormat(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 3) ? false : ((71 == (paramArrayOfbyte[0] & 0xFF) && 73 == (paramArrayOfbyte[1] & 0xFF) && 70 == (paramArrayOfbyte[2] & 0xFF)));
  }
  
  public static boolean binaryDataIsJpgFormat(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 4) ? false : ((255 == (paramArrayOfbyte[0] & 0xFF) && 216 == (paramArrayOfbyte[1] & 0xFF) && 255 == (paramArrayOfbyte[2] & 0xFF) && 219 <= (paramArrayOfbyte[3] & 0xFF)));
  }
  
  public static boolean binaryDataIsPdfFormat(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 4) ? false : ((37 == (paramArrayOfbyte[0] & 0xFF) && 80 == (paramArrayOfbyte[1] & 0xFF) && 68 == (paramArrayOfbyte[2] & 0xFF) && 70 == (paramArrayOfbyte[3] & 0xFF)));
  }
  
  public static boolean binaryDataIsPngFormat(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 4) ? false : ((137 == (paramArrayOfbyte[0] & 0xFF) && 80 == (paramArrayOfbyte[1] & 0xFF) && 78 == (paramArrayOfbyte[2] & 0xFF) && 71 == (paramArrayOfbyte[3] & 0xFF)));
  }
  
  public static boolean binaryDataIsTiffFormat(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length < 4)
      return false; 
    byte b = paramArrayOfbyte[0];
    return ((73 == (b & 0xFF) && 73 == (paramArrayOfbyte[1] & 0xFF) && 42 == (paramArrayOfbyte[2] & 0xFF) && (paramArrayOfbyte[3] & 0xFF) == 0) || (77 == (b & 0xFF) && 77 == (paramArrayOfbyte[1] & 0xFF) && (paramArrayOfbyte[2] & 0xFF) == 0 && 42 == (paramArrayOfbyte[3] & 0xFF)));
  }
  
  public static String getFormatForMimeType(String paramString) {
    return imageMimeTypeToFormat.get(paramString);
  }
  
  public static String getMimeTypeForBinarySignature(byte[] paramArrayOfbyte) {
    return binaryDataIsPngFormat(paramArrayOfbyte) ? "image/png" : (binaryDataIsJpgFormat(paramArrayOfbyte) ? "image/jpeg" : (binaryDataIsGifFormat(paramArrayOfbyte) ? "image/gif" : (binaryDataIsBmpFormat(paramArrayOfbyte) ? "image/bmp" : (binaryDataIsPdfFormat(paramArrayOfbyte) ? "image/pdf" : (binaryDataIsTiffFormat(paramArrayOfbyte) ? "image/tiff" : null)))));
  }
  
  public static String getMimeTypeForFormat(String paramString) {
    return imageFormatsToMimeType.get(paramString);
  }
  
  public static boolean isPortableFormat(byte[] paramArrayOfbyte) {
    return (binaryDataIsPngFormat(paramArrayOfbyte) || binaryDataIsJpgFormat(paramArrayOfbyte) || binaryDataIsGifFormat(paramArrayOfbyte));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\ImageFormats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */