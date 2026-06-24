import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.Log;
import android.window.ldG.XUaAMlaMSa;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class j60 {
  public static final byte[] A;
  
  public static final byte[] B;
  
  public static final String[] C;
  
  public static final int[] D;
  
  public static final byte[] E;
  
  public static final g60 F;
  
  public static final g60[][] G;
  
  public static final g60[] H;
  
  public static final HashMap[] I;
  
  public static final HashMap[] J;
  
  public static final Set K;
  
  public static final HashMap L;
  
  public static final Charset M;
  
  public static final byte[] N;
  
  public static final byte[] O;
  
  public static final boolean m = Log.isLoggable("ExifInterface", 3);
  
  public static final int[] n = new int[] { 8, 8, 8 };
  
  public static final int[] o = new int[] { 8 };
  
  public static final byte[] p = new byte[] { -1, -40, -1 };
  
  public static final byte[] q = new byte[] { 102, 116, 121, 112 };
  
  public static final byte[] r = new byte[] { 109, 105, 102, 49 };
  
  public static final byte[] s = new byte[] { 104, 101, 105, 99 };
  
  public static final byte[] t = new byte[] { 97, 118, 105, 102 };
  
  public static final byte[] u = new byte[] { 97, 118, 105, 115 };
  
  public static final byte[] v = new byte[] { 79, 76, 89, 77, 80, 0 };
  
  public static final byte[] w = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
  
  public static final byte[] x = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
  
  public static final byte[] y = "XML:com.adobe.xmp\000\000\000\000\000".getBytes(StandardCharsets.UTF_8);
  
  public static final byte[] z = new byte[] { 82, 73, 70, 70 };
  
  public final String a;
  
  public final FileDescriptor b;
  
  public int c;
  
  public final HashMap[] d;
  
  public final HashSet e;
  
  public ByteOrder f;
  
  public boolean g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public f60 l;
  
  static {
    A = new byte[] { 87, 69, 66, 80 };
    B = new byte[] { 69, 88, 73, 70 };
    "VP8X".getBytes(Charset.defaultCharset());
    "VP8L".getBytes(Charset.defaultCharset());
    "VP8 ".getBytes(Charset.defaultCharset());
    "ANIM".getBytes(Charset.defaultCharset());
    "ANMF".getBytes(Charset.defaultCharset());
    C = new String[] { 
        "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", 
        "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
    D = new int[] { 
        0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
        8, 4, 8, 1 };
    E = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
    g60 g6010 = new g60("NewSubfileType", 254, 4);
    g60 g6025 = new g60("SubfileType", 255, 4);
    g60 g6027 = new g60(256, 3, 4, "ImageWidth");
    g60 g6036 = new g60(257, 3, 4, "ImageLength");
    g60 g6019 = new g60("BitsPerSample", 258, 3);
    String str = IGBYXeDFmKYajx.jOhiG;
    g60 g6016 = new g60(str, 259, 3);
    g60 g6031 = new g60("PhotometricInterpretation", 262, 3);
    g60 g608 = new g60("ImageDescription", 270, 2);
    g60 g6038 = new g60("Make", 271, 2);
    g60 g6022 = new g60("Model", 272, 2);
    g60 g6029 = new g60(273, 3, 4, "StripOffsets");
    g60 g6034 = new g60("Orientation", 274, 3);
    g60 g6014 = new g60("SamplesPerPixel", 277, 3);
    g60 g6041 = new g60(278, 3, 4, oXrNDUqUkE.LRLjnajGjDWdOD);
    g60 g607 = new g60(279, 3, 4, "StripByteCounts");
    g60 g6013 = new g60("XResolution", 282, 5);
    g60 g6033 = new g60("YResolution", 283, 5);
    g60 g6011 = new g60("PlanarConfiguration", 284, 3);
    g60 g609 = new g60("ResolutionUnit", 296, 3);
    g60 g6023 = new g60("TransferFunction", 301, 3);
    g60 g6012 = new g60("Software", 305, 2);
    g60 g6035 = new g60("DateTime", 306, 2);
    g60 g6032 = new g60("Artist", 315, 2);
    g60 g606 = new g60("WhitePoint", 318, 5);
    g60 g6026 = new g60("PrimaryChromaticities", 319, 5);
    g60 g6015 = new g60("SubIFDPointer", 330, 4);
    g60 g6024 = new g60("JPEGInterchangeFormat", 513, 4);
    g60 g6042 = new g60("JPEGInterchangeFormatLength", 514, 4);
    g60 g605 = new g60("YCbCrCoefficients", 529, 5);
    g60 g602 = new g60("YCbCrSubSampling", 530, 3);
    g60 g6020 = new g60("YCbCrPositioning", 531, 3);
    g60 g6028 = new g60("ReferenceBlackWhite", 532, 5);
    g60 g6018 = new g60("Copyright", 33432, 2);
    g60 g6030 = new g60("ExifIFDPointer", 34665, 4);
    g60 g6017 = new g60("GPSInfoIFDPointer", 34853, 4);
    g60 g6043 = new g60("SensorTopBorder", 4, 4);
    g60 g603 = new g60("SensorLeftBorder", 5, 4);
    g60 g6021 = new g60("SensorBottomBorder", 6, 4);
    g60 g6040 = new g60("SensorRightBorder", 7, 4);
    g60 g6037 = new g60("ISO", 23, 3);
    g60 g6039 = new g60("JpgFromRaw", 46, 7);
    g60 g604 = new g60("Xmp", 700, 1);
    g60[] arrayOfG601 = new g60[42];
    arrayOfG601[0] = g6010;
    arrayOfG601[1] = g6025;
    arrayOfG601[2] = g6027;
    arrayOfG601[3] = g6036;
    arrayOfG601[4] = g6019;
    arrayOfG601[5] = g6016;
    arrayOfG601[6] = g6031;
    arrayOfG601[7] = g608;
    arrayOfG601[8] = g6038;
    arrayOfG601[9] = g6022;
    arrayOfG601[10] = g6029;
    arrayOfG601[11] = g6034;
    arrayOfG601[12] = g6014;
    arrayOfG601[13] = g6041;
    arrayOfG601[14] = g607;
    arrayOfG601[15] = g6013;
    arrayOfG601[16] = g6033;
    arrayOfG601[17] = g6011;
    arrayOfG601[18] = g609;
    arrayOfG601[19] = g6023;
    arrayOfG601[20] = g6012;
    arrayOfG601[21] = g6035;
    arrayOfG601[22] = g6032;
    arrayOfG601[23] = g606;
    arrayOfG601[24] = g6026;
    arrayOfG601[25] = g6015;
    arrayOfG601[26] = g6024;
    arrayOfG601[27] = g6042;
    arrayOfG601[28] = g605;
    arrayOfG601[29] = g602;
    arrayOfG601[30] = g6020;
    arrayOfG601[31] = g6028;
    arrayOfG601[32] = g6018;
    arrayOfG601[33] = g6030;
    arrayOfG601[34] = g6017;
    arrayOfG601[35] = g6043;
    arrayOfG601[36] = g603;
    arrayOfG601[37] = g6021;
    arrayOfG601[38] = g6040;
    arrayOfG601[39] = g6037;
    arrayOfG601[40] = g6039;
    arrayOfG601[41] = g604;
    g60 g6057 = new g60("ExposureTime", 33434, 5);
    g60 g6075 = new g60("FNumber", 33437, 5);
    g6018 = new g60("ExposureProgram", 34850, 3);
    g6037 = new g60("SpectralSensitivity", 34852, 2);
    g60 g6060 = new g60(xveccWbRzqx.vGSwBYGsjjFvl, 34855, 3);
    g60 g6048 = new g60("OECF", 34856, 7);
    g6013 = new g60("SensitivityType", 34864, 3);
    g60 g6049 = new g60("StandardOutputSensitivity", 34865, 4);
    g60 g6076 = new g60("RecommendedExposureIndex", 34866, 4);
    g6025 = new g60("ISOSpeed", 34867, 4);
    g60 g6071 = new g60("ISOSpeedLatitudeyyy", 34868, 4);
    g604 = new g60("ISOSpeedLatitudezzz", 34869, 4);
    g6041 = new g60("ExifVersion", 36864, 2);
    g605 = new g60("DateTimeOriginal", 36867, 2);
    g60 g6055 = new g60("DateTimeDigitized", 36868, 2);
    g6010 = new g60(VDgS.wUzuvyQYiixMG, 36880, 2);
    g6036 = new g60("OffsetTimeOriginal", 36881, 2);
    g60 g6074 = new g60("OffsetTimeDigitized", 36882, 2);
    g6022 = new g60("ComponentsConfiguration", 37121, 7);
    g60 g6056 = new g60("CompressedBitsPerPixel", 37122, 5);
    g60 g6050 = new g60("ShutterSpeedValue", 37377, 10);
    g6038 = new g60("ApertureValue", 37378, 5);
    g6032 = new g60("BrightnessValue", 37379, 10);
    g6023 = new g60("ExposureBiasValue", 37380, 10);
    g609 = new g60("MaxApertureValue", 37381, 5);
    g60 g6073 = new g60("SubjectDistance", 37382, 5);
    g6040 = new g60("MeteringMode", 37383, 3);
    g60 g6081 = new g60("LightSource", 37384, 3);
    g60 g6067 = new g60("Flash", 37385, 3);
    g6011 = new g60("FocalLength", 37386, 5);
    g60 g6065 = new g60("SubjectArea", 37396, 3);
    g6043 = new g60("MakerNote", 37500, 7);
    g6017 = new g60("UserComment", 37510, 7);
    g60 g6079 = new g60("SubSecTime", 37520, 2);
    g608 = new g60("SubSecTimeOriginal", 37521, 2);
    g60 g6059 = new g60("SubSecTimeDigitized", 37522, 2);
    g6042 = new g60("FlashpixVersion", 40960, 7);
    g6026 = new g60("ColorSpace", 40961, 3);
    g603 = new g60(40962, 3, 4, "PixelXDimension");
    g60 g6068 = new g60(40963, 3, 4, "PixelYDimension");
    g6024 = new g60("RelatedSoundFile", 40964, 2);
    g60 g6069 = new g60("InteroperabilityIFDPointer", 40965, 4);
    g6021 = new g60("FlashEnergy", 41483, 5);
    g60 g6045 = new g60("SpatialFrequencyResponse", 41484, 7);
    g60 g6046 = new g60("FocalPlaneXResolution", 41486, 5);
    g6031 = new g60("FocalPlaneYResolution", 41487, 5);
    g6012 = new g60("FocalPlaneResolutionUnit", 41488, 3);
    g60 g6053 = new g60("SubjectLocation", 41492, 3);
    g6033 = new g60("ExposureIndex", 41493, 5);
    g6019 = new g60("SensingMethod", 41495, 3);
    g60 g6054 = new g60("FileSource", 41728, 7);
    g6015 = new g60("SceneType", 41729, 7);
    g6014 = new g60("CFAPattern", 41730, 7);
    g6028 = new g60("CustomRendered", 41985, 3);
    g606 = new g60("ExposureMode", 41986, 3);
    g6030 = new g60("WhiteBalance", 41987, 3);
    g60 g6072 = new g60("DigitalZoomRatio", 41988, 5);
    g60 g6061 = new g60("FocalLengthIn35mmFilm", 41989, 3);
    g60 g6070 = new g60("SceneCaptureType", 41990, 3);
    g60 g6044 = new g60("GainControl", 41991, 3);
    g60 g6062 = new g60("Contrast", 41992, 3);
    g6029 = new g60("Saturation", 41993, 3);
    g6034 = new g60("Sharpness", 41994, 3);
    g60 g6047 = new g60("DeviceSettingDescription", 41995, 7);
    g6016 = new g60("SubjectDistanceRange", 41996, 3);
    g602 = new g60("ImageUniqueID", 42016, 2);
    g6027 = new g60("CameraOwnerName", 42032, 2);
    g6020 = new g60("BodySerialNumber", 42033, 2);
    g60 g6078 = new g60("LensSpecification", 42034, 5);
    g60 g6051 = new g60("LensMake", 42035, 2);
    g60 g6066 = new g60("LensModel", 42036, 2);
    g6035 = new g60("Gamma", 42240, 5);
    g6039 = new g60("DNGVersion", 50706, 1);
    g60 g6077 = new g60(50720, 3, 4, "DefaultCropSize");
    g60 g60110 = new g60("GPSVersionID", 0, 1);
    g60 g60114 = new g60("GPSLatitudeRef", 1, 2);
    g60 g60105 = new g60(2, 5, 10, "GPSLatitude");
    g60 g6092 = new g60("GPSLongitudeRef", 3, 2);
    g60 g60149 = new g60(4, 5, 10, "GPSLongitude");
    g60 g6094 = new g60("GPSAltitudeRef", 5, 1);
    g60 g60100 = new g60("GPSAltitude", 6, 5);
    g60 g60129 = new g60("GPSTimeStamp", 7, 5);
    g60 g6099 = new g60("GPSSatellites", 8, 2);
    g60 g60117 = new g60("GPSStatus", 9, 2);
    g60 g60119 = new g60("GPSMeasureMode", 10, 2);
    g60 g60141 = new g60("GPSDOP", 11, 5);
    g60 g60132 = new g60("GPSSpeedRef", 12, 2);
    g60 g60131 = new g60("GPSSpeed", 13, 5);
    g60 g6090 = new g60("GPSTrackRef", 14, 2);
    g60 g6091 = new g60("GPSTrack", 15, 5);
    g60 g60102 = new g60("GPSImgDirectionRef", 16, 2);
    g60 g60107 = new g60("GPSImgDirection", 17, 5);
    g60 g60145 = new g60("GPSMapDatum", 18, 2);
    g60 g60123 = new g60("GPSDestLatitudeRef", 19, 2);
    g60 g60151 = new g60("GPSDestLatitude", 20, 5);
    g60 g60133 = new g60("GPSDestLongitudeRef", 21, 2);
    g60 g60127 = new g60("GPSDestLongitude", 22, 5);
    g60 g60147 = new g60("GPSDestBearingRef", 23, 2);
    g60 g60115 = new g60("GPSDestBearing", 24, 5);
    g60 g60111 = new g60("GPSDestDistanceRef", 25, 2);
    g60 g6082 = new g60(oXrNDUqUkE.TdCKT, 26, 5);
    g60 g60108 = new g60("GPSProcessingMethod", 27, 7);
    g60 g60126 = new g60("GPSAreaInformation", 28, 7);
    g60 g60143 = new g60("GPSDateStamp", 29, 2);
    g60 g60106 = new g60("GPSDifferential", 30, 3);
    g60 g60140 = new g60("GPSHPositioningError", 31, 5);
    g60 g6058 = new g60("InteroperabilityIndex", 1, 2);
    g607 = new g60("NewSubfileType", 254, 4);
    g60 g6052 = new g60("SubfileType", 255, 4);
    g60 g6063 = new g60(256, 3, 4, "ThumbnailImageWidth");
    g60 g6080 = new g60(257, 3, 4, "ThumbnailImageLength");
    g60 g6064 = new g60("BitsPerSample", 258, 3);
    g60 g60134 = new g60(str, 259, 3);
    g60 g6098 = new g60("PhotometricInterpretation", 262, 3);
    g60 g60121 = new g60("ImageDescription", 270, 2);
    g60 g6083 = new g60("Make", 271, 2);
    g60 g60138 = new g60("Model", 272, 2);
    g60 g60137 = new g60(273, 3, 4, "StripOffsets");
    g60 g60101 = new g60("ThumbnailOrientation", 274, 3);
    g60 g6085 = new g60("SamplesPerPixel", 277, 3);
    g60 g60148 = new g60(278, 3, 4, "RowsPerStrip");
    g60 g6096 = new g60(279, 3, 4, "StripByteCounts");
    g60 g60120 = new g60(CKYHNesT.rqO, 282, 5);
    g60 g60135 = new g60("YResolution", 283, 5);
    g60 g60124 = new g60("PlanarConfiguration", 284, 3);
    g60 g60128 = new g60("ResolutionUnit", 296, 3);
    g60 g6097 = new g60("TransferFunction", 301, 3);
    g60 g6088 = new g60("Software", 305, 2);
    g60 g6093 = new g60("DateTime", 306, 2);
    g60 g6095 = new g60("Artist", 315, 2);
    g60 g60139 = new g60("WhitePoint", 318, 5);
    g60 g60109 = new g60("PrimaryChromaticities", 319, 5);
    g60 g60144 = new g60("SubIFDPointer", 330, 4);
    g60 g60113 = new g60("JPEGInterchangeFormat", 513, 4);
    g60 g60150 = new g60("JPEGInterchangeFormatLength", 514, 4);
    g60 g6086 = new g60("YCbCrCoefficients", 529, 5);
    g60 g60136 = new g60("YCbCrSubSampling", 530, 3);
    g60 g60122 = new g60("YCbCrPositioning", 531, 3);
    g60 g60104 = new g60("ReferenceBlackWhite", 532, 5);
    g60 g6084 = new g60("Copyright", 33432, 2);
    g601 = new g60("ExifIFDPointer", 34665, 4);
    g60 g60130 = new g60("GPSInfoIFDPointer", 34853, 4);
    g60 g6089 = new g60("DNGVersion", 50706, 1);
    g60 g60112 = new g60(50720, 3, 4, "DefaultCropSize");
    F = new g60("StripOffsets", 273, 3);
    g60 g60125 = new g60("ThumbnailImage", 256, 7);
    g60 g6087 = new g60("CameraSettingsIFDPointer", 8224, 4);
    g60 g60146 = new g60("ImageProcessingIFDPointer", 8256, 4);
    g60 g60142 = new g60("PreviewImageStart", 257, 4);
    g60 g60118 = new g60("PreviewImageLength", 258, 4);
    g60 g60103 = new g60("AspectFrame", 4371, 3);
    g60 g60116 = new g60("ColorSpace", 55, 3);
    g60[] arrayOfG602 = { 
        g60110, g60114, g60105, g6092, g60149, g6094, g60100, g60129, g6099, g60117, 
        g60119, g60141, g60132, g60131, g6090, g6091, g60102, g60107, g60145, g60123, 
        g60151, g60133, g60127, g60147, g60115, g60111, g6082, g60108, g60126, g60143, 
        g60106, g60140 };
    G = new g60[][] { arrayOfG601, { 
          g6057, g6075, g6018, g6037, g6060, g6048, g6013, g6049, g6076, g6025, 
          g6071, g604, g6041, g605, g6055, g6010, g6036, g6074, g6022, g6056, 
          g6050, g6038, g6032, g6023, g609, g6073, g6040, g6081, g6067, g6011, 
          g6065, g6043, g6017, g6079, g608, g6059, g6042, g6026, g603, g6068, 
          g6024, g6069, g6021, g6045, g6046, g6031, g6012, g6053, g6033, g6019, 
          g6054, g6015, g6014, g6028, g606, g6030, g6072, g6061, g6070, g6044, 
          g6062, g6029, g6034, g6047, g6016, g602, g6027, g6020, g6078, g6051, 
          g6066, g6035, g6039, g6077 }, arrayOfG602, { g6058 }, { 
          g607, g6052, g6063, g6080, g6064, g60134, g6098, g60121, g6083, g60138, 
          g60137, g60101, g6085, g60148, g6096, g60120, g60135, g60124, g60128, g6097, 
          g6088, g6093, g6095, g60139, g60109, g60144, g60113, g60150, g6086, g60136, 
          g60122, g60104, g6084, g601, g60130, g6089, g60112 }, arrayOfG601, { g60125, g6087, g60146 }, { g60142, g60118 }, { g60103 }, { g60116 } };
    H = new g60[] { new g60("SubIFDPointer", 330, 4), new g60("ExifIFDPointer", 34665, 4), new g60("GPSInfoIFDPointer", 34853, 4), new g60("InteroperabilityIFDPointer", 40965, 4), new g60("CameraSettingsIFDPointer", 8224, 1), new g60("ImageProcessingIFDPointer", 8256, 1) };
    I = new HashMap[10];
    J = new HashMap[10];
    K = Collections.unmodifiableSet(new HashSet(Arrays.asList((Object[])new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance" })));
    L = new HashMap<Object, Object>();
    Charset charset = Charset.forName("US-ASCII");
    M = charset;
    N = "Exif\000\000".getBytes(charset);
    O = "http://ns.adobe.com/xap/1.0/\000".getBytes(charset);
    Locale locale = Locale.US;
    (new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    byte b = 0;
    while (true) {
      g60[][] arrayOfG603 = G;
      if (b < arrayOfG603.length) {
        I[b] = new HashMap<Object, Object>();
        J[b] = new HashMap<Object, Object>();
        for (g60 g601 : arrayOfG603[b]) {
          I[b].put(Integer.valueOf(g601.a), g601);
          J[b].put(g601.b, g601);
        } 
        b++;
        continue;
      } 
      HashMap<Integer, Integer> hashMap = L;
      g60[] arrayOfG60 = H;
      hashMap.put(Integer.valueOf((arrayOfG60[0]).a), integer6);
      hashMap.put(Integer.valueOf((arrayOfG60[1]).a), integer3);
      hashMap.put(Integer.valueOf((arrayOfG60[2]).a), integer2);
      hashMap.put(Integer.valueOf((arrayOfG60[3]).a), integer5);
      hashMap.put(Integer.valueOf((arrayOfG60[4]).a), integer1);
      hashMap.put(Integer.valueOf((arrayOfG60[5]).a), integer4);
      Pattern.compile(".*[1-9].*");
      Pattern.compile(uvJYmft.pMAAyngJyWBw);
      Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
      Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
      return;
    } 
  }
  
  public j60(String paramString) {
    g60[][] arrayOfG601 = G;
    this.d = new HashMap[arrayOfG601.length];
    this.e = new HashSet(arrayOfG601.length);
    this.f = ByteOrder.BIG_ENDIAN;
    g60[][] arrayOfG602 = null;
    if (paramString != null) {
      this.a = paramString;
      try {
        FileInputStream fileInputStream = new FileInputStream();
        this(paramString);
      } finally {
        paramString = null;
        arrayOfG601 = arrayOfG602;
        if (arrayOfG601 != null)
          try {
            arrayOfG601.close();
          } catch (RuntimeException runtimeException) {
            throw runtimeException;
          } catch (Exception exception) {} 
      } 
    } 
    k91.h("filename cannot be null");
    throw null;
  }
  
  public static ByteOrder r(e60 parame60) {
    short s = parame60.readShort();
    boolean bool = m;
    if (s != 18761) {
      if (s == 19789) {
        if (bool)
          Log.d("ExifInterface", "readExifSegment: Byte Align MM"); 
        return ByteOrder.BIG_ENDIAN;
      } 
      tp.m("Invalid byte order: ", Integer.toHexString(s));
      return null;
    } 
    if (bool)
      Log.d("ExifInterface", "readExifSegment: Byte Align II"); 
    return ByteOrder.LITTLE_ENDIAN;
  }
  
  public final void a() {
    String str = b("DateTimeOriginal");
    HashMap[] arrayOfHashMap = this.d;
    if (str != null && b("DateTime") == null) {
      HashMap<String, f60> hashMap = arrayOfHashMap[0];
      byte[] arrayOfByte = str.concat("\000").getBytes(M);
      hashMap.put("DateTime", new f60(arrayOfByte, 2, arrayOfByte.length));
    } 
    if (b("ImageWidth") == null)
      arrayOfHashMap[0].put("ImageWidth", f60.a(0L, this.f)); 
    if (b("ImageLength") == null)
      arrayOfHashMap[0].put("ImageLength", f60.a(0L, this.f)); 
    if (b("Orientation") == null)
      arrayOfHashMap[0].put("Orientation", f60.a(0L, this.f)); 
    if (b("LightSource") == null)
      arrayOfHashMap[1].put("LightSource", f60.a(0L, this.f)); 
  }
  
  public final String b(String paramString) {
    f60 f601 = c(paramString);
    if (f601 != null) {
      h60 h601;
      h60 h602;
      int i = f601.a;
      if (paramString.equals("GPSTimeStamp")) {
        if (i != 5 && i != 10) {
          StringBuilder stringBuilder = new StringBuilder("GPS Timestamp format is not rational. format=");
          stringBuilder.append(i);
          Log.w("ExifInterface", stringBuilder.toString());
          return null;
        } 
        h60[] arrayOfH60 = (h60[])f601.g(this.f);
        if (arrayOfH60 == null || arrayOfH60.length != 3) {
          StringBuilder stringBuilder = new StringBuilder("Invalid GPS Timestamp array. array=");
          stringBuilder.append(Arrays.toString((Object[])arrayOfH60));
          Log.w("ExifInterface", stringBuilder.toString());
          return null;
        } 
        h602 = arrayOfH60[0];
        i = (int)((float)h602.a / (float)h602.b);
        h602 = arrayOfH60[1];
        int j = (int)((float)h602.a / (float)h602.b);
        h601 = arrayOfH60[2];
        return String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf((int)((float)h601.a / (float)h601.b)) });
      } 
      boolean bool = K.contains(h601);
      ByteOrder byteOrder = this.f;
      if (bool) {
        try {
          return Double.toString(h602.d(byteOrder));
        } catch (NumberFormatException numberFormatException) {}
        return null;
      } 
      return h602.f((ByteOrder)numberFormatException);
    } 
    return null;
  }
  
  public final f60 c(String paramString) {
    String str = paramString;
    if ("ISOSpeedRatings".equals(paramString)) {
      if (m)
        Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."); 
      str = "PhotographicSensitivity";
    } 
    if ("Xmp".equals(str)) {
      int i = this.c;
      if (i != 4 && (i == 9 || i == 15 || i == 12 || i == 13)) {
        f60 f601 = this.l;
        if (f601 != null)
          return f601; 
      } 
    } 
    for (byte b = 0; b < G.length; b++) {
      f60 f601 = this.d[b].get(str);
      if (f601 != null)
        return f601; 
    } 
    if ("Xmp".equals(str)) {
      f60 f601 = this.l;
      if (f601 != null)
        return f601; 
    } 
    return null;
  }
  
  public final void d(i60 parami60, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      if (paramInt != 15 || i >= 31) {
        IOException iOException;
        String str1;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
          d60 d60 = new d60();
          this(parami60);
          mediaMetadataRetriever.setDataSource(d60);
          str3 = mediaMetadataRetriever.extractMetadata(33);
          str4 = mediaMetadataRetriever.extractMetadata(34);
          str1 = mediaMetadataRetriever.extractMetadata(26);
          String str = mediaMetadataRetriever.extractMetadata(17);
          if ("yes".equals(str1)) {
            str = mediaMetadataRetriever.extractMetadata(29);
            str2 = mediaMetadataRetriever.extractMetadata(30);
            str1 = mediaMetadataRetriever.extractMetadata(31);
          } else if ("yes".equals(str)) {
            str = mediaMetadataRetriever.extractMetadata(18);
            str2 = mediaMetadataRetriever.extractMetadata(19);
            str1 = mediaMetadataRetriever.extractMetadata(24);
          } else {
            str = null;
            str1 = null;
            str2 = null;
          } 
        } catch (RuntimeException runtimeException) {
        
        } finally {}
        HashMap[] arrayOfHashMap = this.d;
        if (runtimeException != null)
          arrayOfHashMap[0].put("ImageWidth", f60.c(Integer.parseInt((String)runtimeException), this.f)); 
        if (str2 != null)
          arrayOfHashMap[0].put("ImageLength", f60.c(Integer.parseInt(str2), this.f)); 
        if (str1 != null) {
          paramInt = Integer.parseInt(str1);
          if (paramInt != 90) {
            if (paramInt != 180) {
              if (paramInt != 270) {
                paramInt = 1;
              } else {
                paramInt = 8;
              } 
            } else {
              paramInt = 3;
            } 
          } else {
            paramInt = 6;
          } 
          arrayOfHashMap[0].put("Orientation", f60.c(paramInt, this.f));
        } 
        if (str3 != null && str4 != null) {
          paramInt = Integer.parseInt(str3);
          i = Integer.parseInt(str4);
          if (i > 6) {
            parami60.c(paramInt);
            byte[] arrayOfByte = new byte[6];
            parami60.readFully(arrayOfByte);
            if (Arrays.equals(arrayOfByte, N)) {
              arrayOfByte = new byte[i - 6];
              parami60.readFully(arrayOfByte);
              this.h = paramInt + 6;
              s(0, arrayOfByte);
            } else {
              iOException = new IOException();
              this("Invalid identifier");
              throw iOException;
            } 
          } else {
            iOException = new IOException();
            this("Invalid exif length");
            throw iOException;
          } 
        } 
        String str4 = mediaMetadataRetriever.extractMetadata(41);
        String str3 = mediaMetadataRetriever.extractMetadata(42);
        if (str4 != null && str3 != null) {
          paramInt = Integer.parseInt(str4);
          i = Integer.parseInt(str3);
          long l = paramInt;
          iOException.c(l);
          byte[] arrayOfByte = new byte[i];
          iOException.readFully(arrayOfByte);
          f60 f601 = new f60();
          this(l, arrayOfByte, 1, i);
          this.l = f601;
        } 
        if (m) {
          String str = LHyji.fwUJnUuOKX;
          StringBuilder stringBuilder = new StringBuilder();
          this("Heif meta: ");
          stringBuilder.append((String)runtimeException);
          stringBuilder.append("x");
          stringBuilder.append(str2);
          stringBuilder.append(", rotation ");
          stringBuilder.append(str1);
          Log.d(str, stringBuilder.toString());
        } 
        try {
          mediaMetadataRetriever.release();
        } catch (IOException iOException1) {}
        return;
      } 
      tp.j("Reading EXIF from AVIF files is supported from SDK 31 and above");
      return;
    } 
    tp.j("Reading EXIF from HEIC files is supported from SDK 28 and above");
  }
  
  public final void e(e60 parame60, int paramInt1, int paramInt2) {
    boolean bool = m;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("getJpegAttributes starting with: ");
      stringBuilder.append(parame60);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    parame60.e = ByteOrder.BIG_ENDIAN;
    int i = parame60.readByte();
    if (i == -1) {
      if (parame60.readByte() == -40) {
        i = 2;
        label75: while (true) {
          int j = parame60.readByte();
          if (j == -1) {
            while (true) {
              byte b = parame60.readByte();
              if (b != -1) {
                if (bool) {
                  StringBuilder stringBuilder = new StringBuilder("Found JPEG segment indicator: ");
                  stringBuilder.append(Integer.toHexString(b & 0xFF));
                  Log.d("ExifInterface", stringBuilder.toString());
                } 
                if (b == -39 || b == -38) {
                  parame60.e = this.f;
                  return;
                } 
                int m = parame60.readUnsignedShort();
                int k = m - 2;
                j = i + 4;
                if (bool) {
                  StringBuilder stringBuilder = new StringBuilder("JPEG segment: ");
                  stringBuilder.append(Integer.toHexString(b & 0xFF));
                  stringBuilder.append(" (length: ");
                  stringBuilder.append(m);
                  stringBuilder.append(")");
                  Log.d("ExifInterface", stringBuilder.toString());
                } 
                if (k >= 0) {
                  if (b != -31) {
                    HashMap<String, f60> hashMap;
                    HashMap[] arrayOfHashMap = this.d;
                    if (b != -2) {
                      String str;
                      HashMap<String, f60> hashMap1;
                      switch (b) {
                        default:
                          switch (b) {
                            default:
                              switch (b) {
                                default:
                                  switch (b) {
                                    default:
                                      i = k;
                                      break;
                                    case -51:
                                    case -50:
                                    case -49:
                                      break;
                                  } 
                                  break;
                                case -55:
                                case -54:
                                case -53:
                                  break;
                              } 
                              break;
                            case -59:
                            case -58:
                            case -57:
                              break;
                          } 
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                          parame60.a(1);
                          hashMap1 = arrayOfHashMap[paramInt2];
                          if (paramInt2 != 4) {
                            str = "ImageLength";
                          } else {
                            str = "ThumbnailImageLength";
                          } 
                          hashMap1.put(str, f60.a(parame60.readUnsignedShort(), this.f));
                          hashMap = arrayOfHashMap[paramInt2];
                          if (paramInt2 != 4) {
                            str = "ImageWidth";
                          } else {
                            str = "ThumbnailImageWidth";
                          } 
                          hashMap.put(str, f60.a(parame60.readUnsignedShort(), this.f));
                          i = m - 7;
                          break;
                      } 
                    } else {
                      byte[] arrayOfByte = new byte[k];
                      parame60.readFully(arrayOfByte);
                      i = j;
                      if (b("UserComment") == null) {
                        HashMap<String, f60> hashMap1 = hashMap[1];
                        Charset charset = M;
                        byte[] arrayOfByte1 = (new String(arrayOfByte, charset)).concat("\000").getBytes(charset);
                        hashMap1.put("UserComment", new f60(arrayOfByte1, 2, arrayOfByte1.length));
                        i = j;
                      } 
                      k = 0;
                      j = i;
                      i = k;
                    } 
                  } else {
                    byte[] arrayOfByte1 = new byte[k];
                    parame60.readFully(arrayOfByte1);
                    byte[] arrayOfByte2 = N;
                    if (g92.d0(arrayOfByte1, arrayOfByte2)) {
                      arrayOfByte1 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, k);
                      this.h = paramInt1 + j + arrayOfByte2.length;
                      s(paramInt2, arrayOfByte1);
                      v(new e60(arrayOfByte1));
                    } else {
                      arrayOfByte2 = O;
                      if (g92.d0(arrayOfByte1, arrayOfByte2)) {
                        int n = arrayOfByte2.length;
                        arrayOfByte1 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, k);
                        m = arrayOfByte1.length;
                        this.l = new f60((j + n), arrayOfByte1, 1, m);
                      } 
                    } 
                    i = j + k;
                    k = 0;
                    j = i;
                    i = k;
                  } 
                  if (i >= 0) {
                    parame60.a(i);
                    i = j + i;
                    continue label75;
                  } 
                  m60.i("Invalid length");
                  return;
                } 
                m60.i("Invalid length");
                return;
              } 
              i++;
            } 
            break;
          } 
          tp.m("Invalid marker:", Integer.toHexString(j & 0xFF));
          return;
        } 
      } 
      tp.m("Invalid marker: ", Integer.toHexString(i & 0xFF));
      return;
    } 
    tp.m("Invalid marker: ", Integer.toHexString(i & 0xFF));
  }
  
  public final int f(BufferedInputStream paramBufferedInputStream) {
    paramBufferedInputStream.mark(5000);
    byte[] arrayOfByte = new byte[5000];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    for (byte b = 0;; b++) {
      byte[] arrayOfByte1 = p;
      if (b < arrayOfByte1.length) {
        if (arrayOfByte[b] != arrayOfByte1[b]) {
          arrayOfByte1 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
          b = 0;
          while (true)
            b++; 
          return 9;
        } 
        continue;
      } 
      return 4;
    } 
  }
  
  public final void g(i60 parami60) {
    j(parami60);
    HashMap[] arrayOfHashMap = this.d;
    f60 f601 = arrayOfHashMap[1].get("MakerNote");
    if (f601 != null) {
      i60 i601 = new i60(f601.d);
      i601.e = this.f;
      byte[] arrayOfByte1 = v;
      byte[] arrayOfByte4 = new byte[arrayOfByte1.length];
      i601.readFully(arrayOfByte4);
      i601.c(0L);
      byte[] arrayOfByte2 = w;
      byte[] arrayOfByte3 = new byte[arrayOfByte2.length];
      i601.readFully(arrayOfByte3);
      if (Arrays.equals(arrayOfByte4, arrayOfByte1)) {
        i601.c(8L);
      } else if (Arrays.equals(arrayOfByte3, arrayOfByte2)) {
        i601.c(12L);
      } 
      t(i601, 6);
      f60 f603 = arrayOfHashMap[7].get("PreviewImageStart");
      f60 f602 = arrayOfHashMap[7].get("PreviewImageLength");
      if (f603 != null && f602 != null) {
        arrayOfHashMap[5].put("JPEGInterchangeFormat", f603);
        arrayOfHashMap[5].put("JPEGInterchangeFormatLength", f602);
      } 
      f602 = arrayOfHashMap[8].get("AspectFrame");
      if (f602 != null) {
        StringBuilder stringBuilder;
        int[] arrayOfInt = (int[])f602.g(this.f);
        if (arrayOfInt == null || arrayOfInt.length != 4) {
          stringBuilder = new StringBuilder(XUaAMlaMSa.vUeJGsvgU);
          stringBuilder.append(Arrays.toString(arrayOfInt));
          Log.w("ExifInterface", stringBuilder.toString());
          return;
        } 
        int i = arrayOfInt[2];
        int j = arrayOfInt[0];
        if (i > j) {
          int m = arrayOfInt[3];
          int k = arrayOfInt[1];
          if (m > k) {
            i = i - j + 1;
            j = m - k + 1;
            m = i;
            k = j;
            if (i < j) {
              m = i + j;
              k = m - j;
              m -= k;
            } 
            f603 = f60.c(m, this.f);
            f60 f604 = f60.c(k, this.f);
            stringBuilder[0].put("ImageWidth", f603);
            stringBuilder[0].put("ImageLength", f604);
            return;
          } 
        } 
      } 
    } 
  }
  
  public final void h(e60 parame60) {
    if (m) {
      StringBuilder stringBuilder = new StringBuilder("getPngAttributes starting with: ");
      stringBuilder.append(parame60);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    parame60.e = ByteOrder.BIG_ENDIAN;
    int k = parame60.c;
    parame60.a(x.length);
    int i = 0;
    int j = 0;
    while (true) {
      if (!i || !j)
        try {
          int i1 = parame60.readInt();
          int i2 = parame60.readInt();
          int n = parame60.c;
          int m = n - k;
          if (m != 16 || i2 == 1229472850) {
            if (i2 != 1229278788) {
              StringBuilder stringBuilder;
              int i3;
              if (i2 == 1700284774 && !i) {
                e60 e601;
                this.h = m;
                byte[] arrayOfByte = new byte[i1];
                parame60.readFully(arrayOfByte);
                i = parame60.readInt();
                CRC32 cRC32 = new CRC32();
                this();
                cRC32.update(i2 >>> 24);
                cRC32.update(i2 >>> 16);
                cRC32.update(i2 >>> 8);
                cRC32.update(i2);
                cRC32.update(arrayOfByte);
                if ((int)cRC32.getValue() == i) {
                  s(0, arrayOfByte);
                  y();
                  e601 = new e60();
                  this(arrayOfByte);
                  v(e601);
                  m = 1;
                  i3 = j;
                } else {
                  IOException iOException1 = new IOException();
                  stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                  stringBuilder.append(i);
                  stringBuilder.append(", calculated CRC value: ");
                  stringBuilder.append(e601.getValue());
                  this(stringBuilder.toString());
                  throw iOException1;
                } 
              } else {
                m = i;
                i3 = j;
                if (i2 == 1767135348) {
                  m = i;
                  i3 = j;
                  if (!j) {
                    byte[] arrayOfByte = y;
                    m = i;
                    i3 = j;
                    if (i1 >= arrayOfByte.length) {
                      i2 = arrayOfByte.length;
                      byte[] arrayOfByte1 = new byte[i2];
                      stringBuilder.readFully(arrayOfByte1);
                      m = i;
                      i3 = j;
                      if (Arrays.equals(arrayOfByte1, arrayOfByte)) {
                        j = ((e60)stringBuilder).c;
                        m = i1 - i2;
                        arrayOfByte1 = new byte[m];
                        stringBuilder.readFully(arrayOfByte1);
                        f60 f601 = new f60();
                        this((j - k), arrayOfByte1, 1, m);
                        this.l = f601;
                        i3 = 1;
                        m = i;
                      } 
                    } 
                  } 
                } 
              } 
              stringBuilder.a(n + i1 + 4 - ((e60)stringBuilder).c);
              i = m;
              j = i3;
              continue;
            } 
            return;
          } 
          IOException iOException = new IOException();
          this("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
          throw iOException;
        } catch (EOFException eOFException) {
          throw new IOException("Encountered corrupt PNG file.", eOFException);
        }  
      return;
    } 
  }
  
  public final void i(e60 parame60) {
    boolean bool = m;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("getRafAttributes starting with: ");
      stringBuilder.append(parame60);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    parame60.a(84);
    byte[] arrayOfByte3 = new byte[4];
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[4];
    parame60.readFully(arrayOfByte3);
    parame60.readFully(arrayOfByte1);
    parame60.readFully(arrayOfByte2);
    int i = ByteBuffer.wrap(arrayOfByte3).getInt();
    int j = ByteBuffer.wrap(arrayOfByte1).getInt();
    int k = ByteBuffer.wrap(arrayOfByte2).getInt();
    arrayOfByte1 = new byte[j];
    parame60.a(i - parame60.c);
    parame60.readFully(arrayOfByte1);
    e(new e60(arrayOfByte1), i, 5);
    parame60.a(k - parame60.c);
    parame60.e = ByteOrder.BIG_ENDIAN;
    j = parame60.readInt();
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("numberOfDirectoryEntry: ");
      stringBuilder.append(j);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    for (i = 0; i < j; i++) {
      StringBuilder stringBuilder;
      int m = parame60.readUnsignedShort();
      k = parame60.readUnsignedShort();
      if (m == F.a) {
        i = parame60.readShort();
        j = parame60.readShort();
        f60 f601 = f60.c(i, this.f);
        f60 f602 = f60.c(j, this.f);
        HashMap[] arrayOfHashMap = this.d;
        arrayOfHashMap[0].put("ImageLength", f601);
        arrayOfHashMap[0].put("ImageWidth", f602);
        if (bool) {
          stringBuilder = new StringBuilder("Updated to length: ");
          stringBuilder.append(i);
          stringBuilder.append(", width: ");
          stringBuilder.append(j);
          Log.d("ExifInterface", stringBuilder.toString());
          return;
        } 
        break;
      } 
      stringBuilder.a(k);
    } 
  }
  
  public final void j(i60 parami60) {
    p(parami60);
    t(parami60, 0);
    x(parami60, 0);
    x(parami60, 5);
    x(parami60, 4);
    y();
    if (this.c == 8) {
      HashMap[] arrayOfHashMap = this.d;
      f60 f601 = arrayOfHashMap[1].get(hbrAVtEa.ospGkj);
      if (f601 != null) {
        i60 i601 = new i60(f601.d);
        i601.e = this.f;
        i601.a(6);
        t(i601, 9);
        f60 f602 = arrayOfHashMap[9].get("ColorSpace");
        if (f602 != null)
          arrayOfHashMap[1].put("ColorSpace", f602); 
      } 
    } 
  }
  
  public final void k(i60 parami60) {
    if (m) {
      StringBuilder stringBuilder = new StringBuilder("getRw2Attributes starting with: ");
      stringBuilder.append(parami60);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    j(parami60);
    HashMap[] arrayOfHashMap = this.d;
    f60 f601 = arrayOfHashMap[0].get("JpgFromRaw");
    if (f601 != null)
      e(new e60(f601.d), (int)f601.c, 5); 
    f601 = arrayOfHashMap[0].get("ISO");
    f60 f602 = arrayOfHashMap[1].get("PhotographicSensitivity");
    if (f601 != null && f602 == null)
      arrayOfHashMap[1].put("PhotographicSensitivity", f601); 
  }
  
  public final void l(e60 parame60) {
    if (m) {
      StringBuilder stringBuilder = new StringBuilder("getWebpAttributes starting with: ");
      stringBuilder.append(parame60);
      Log.d("ExifInterface", stringBuilder.toString());
    } 
    parame60.e = ByteOrder.LITTLE_ENDIAN;
    parame60.a(z.length);
    int j = parame60.readInt() + 8;
    byte[] arrayOfByte = A;
    parame60.a(arrayOfByte.length);
    int i = arrayOfByte.length + 8;
    try {
      while (true) {
        byte[] arrayOfByte1;
        arrayOfByte = new byte[4];
        parame60.readFully(arrayOfByte);
        int k = parame60.readInt();
        int m = i + 8;
        if (Arrays.equals(B, arrayOfByte)) {
          arrayOfByte = new byte[k];
          parame60.readFully(arrayOfByte);
          byte[] arrayOfByte2 = N;
          arrayOfByte1 = arrayOfByte;
          if (g92.d0(arrayOfByte, arrayOfByte2))
            arrayOfByte1 = Arrays.copyOfRange(arrayOfByte, arrayOfByte2.length, k); 
          this.h = m;
          s(0, arrayOfByte1);
          e60 e601 = new e60();
          this(arrayOfByte1);
          v(e601);
          return;
        } 
        i = k;
        if (k % 2 == 1)
          i = k + 1; 
        k = m + i;
        if (k == j)
          return; 
        if (k <= j) {
          arrayOfByte1.a(i);
          i = k;
          continue;
        } 
        IOException iOException = new IOException();
        this("Encountered WebP file with invalid chunk size");
        throw iOException;
      } 
    } catch (EOFException eOFException) {
      throw new IOException("Encountered corrupt WebP file.", eOFException);
    } 
  }
  
  public final void m(e60 parame60, HashMap paramHashMap) {
    f60 f602 = (f60)paramHashMap.get("JPEGInterchangeFormat");
    f60 f601 = (f60)paramHashMap.get("JPEGInterchangeFormatLength");
    if (f602 != null && f601 != null) {
      int j = f602.e(this.f);
      int k = f601.e(this.f);
      int i = j;
      if (this.c == 7)
        i = j + this.i; 
      if (i > 0 && k > 0 && this.a == null && this.b == null) {
        byte[] arrayOfByte = new byte[k];
        parame60.a(i);
        parame60.readFully(arrayOfByte);
      } 
      if (m) {
        StringBuilder stringBuilder = new StringBuilder("Setting thumbnail attributes with offset: ");
        stringBuilder.append(i);
        stringBuilder.append(", length: ");
        stringBuilder.append(k);
        Log.d("ExifInterface", stringBuilder.toString());
      } 
    } 
  }
  
  public final boolean n(HashMap paramHashMap) {
    f60 f602 = (f60)paramHashMap.get("ImageLength");
    f60 f601 = (f60)paramHashMap.get("ImageWidth");
    if (f602 != null && f601 != null) {
      int i = f602.e(this.f);
      int j = f601.e(this.f);
      if (i <= 512 && j <= 512)
        return true; 
    } 
    return false;
  }
  
  public final void o(FileInputStream paramFileInputStream) {
    boolean bool = m;
    int i = 0;
    try {
      while (i < G.length) {
        this.d[i] = new HashMap<Object, Object>();
        i++;
      } 
    } catch (IOException iOException) {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
    
    } finally {}
    BufferedInputStream bufferedInputStream = new BufferedInputStream();
    this(paramFileInputStream, 5000);
    i = f(bufferedInputStream);
    this.c = i;
    if (i == 4 || i == 9 || i == 13 || i == 14) {
      e60 e60 = new e60();
      this(bufferedInputStream);
      i = this.c;
      if (i == 4) {
        e(e60, 0, 0);
      } else if (i == 13) {
        h(e60);
      } else if (i == 9) {
        i(e60);
      } else if (i == 14) {
        l(e60);
      } 
    } else {
      i60 i60 = new i60();
      this(bufferedInputStream);
      i = this.c;
      if (i == 12 || i == 15) {
        d(i60, i);
      } else if (i == 7) {
        g(i60);
      } else if (i == 10) {
        k(i60);
      } else {
        j(i60);
      } 
      i60.c(this.h);
      v(i60);
    } 
    a();
    if (bool) {
      q();
      return;
    } 
  }
  
  public final void p(i60 parami60) {
    ByteOrder byteOrder = r(parami60);
    this.f = byteOrder;
    parami60.e = byteOrder;
    int j = parami60.readUnsignedShort();
    int i = this.c;
    if (i == 7 || i == 10 || j == 42) {
      i = parami60.readInt();
      if (i >= 8) {
        i -= 8;
        if (i > 0)
          parami60.a(i); 
        return;
      } 
      m60.i(ga1.i("Invalid first Ifd offset: ", i));
      return;
    } 
    tp.m("Invalid start code: ", Integer.toHexString(j));
  }
  
  public final void q() {
    byte b = 0;
    while (true) {
      HashMap[] arrayOfHashMap = this.d;
      if (b < arrayOfHashMap.length) {
        StringBuilder stringBuilder = ga1.k(b, "The size of tag group[", "]: ");
        stringBuilder.append(arrayOfHashMap[b].size());
        Log.d("ExifInterface", stringBuilder.toString());
        for (Map.Entry<?, ?> entry : arrayOfHashMap[b].entrySet()) {
          f60 f601 = (f60)entry.getValue();
          StringBuilder stringBuilder1 = new StringBuilder("tagName: ");
          stringBuilder1.append((String)entry.getKey());
          stringBuilder1.append(", tagType: ");
          stringBuilder1.append(f601.toString());
          stringBuilder1.append(", tagValue: '");
          stringBuilder1.append(f601.f(this.f));
          stringBuilder1.append("'");
          Log.d("ExifInterface", stringBuilder1.toString());
        } 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void s(int paramInt, byte[] paramArrayOfbyte) {
    i60 i60 = new i60(paramArrayOfbyte);
    p(i60);
    t(i60, paramInt);
  }
  
  public final void t(i60 parami60, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: getfield c : I
    //   4: istore_3
    //   5: aload_1
    //   6: getfield g : I
    //   9: istore #8
    //   11: aload_0
    //   12: getfield e : Ljava/util/HashSet;
    //   15: astore #18
    //   17: aload #18
    //   19: iload_3
    //   20: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   23: invokevirtual add : (Ljava/lang/Object;)Z
    //   26: pop
    //   27: aload_1
    //   28: invokevirtual readShort : ()S
    //   31: istore #5
    //   33: getstatic j60.m : Z
    //   36: istore #11
    //   38: iload #11
    //   40: ifeq -> 74
    //   43: new java/lang/StringBuilder
    //   46: dup
    //   47: ldc_w 'numberOfDirectoryEntry: '
    //   50: invokespecial <init> : (Ljava/lang/String;)V
    //   53: astore #19
    //   55: aload #19
    //   57: iload #5
    //   59: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: ldc 'ExifInterface'
    //   65: aload #19
    //   67: invokevirtual toString : ()Ljava/lang/String;
    //   70: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: iload #5
    //   76: ifgt -> 82
    //   79: goto -> 1615
    //   82: iconst_0
    //   83: istore #6
    //   85: aload_0
    //   86: getfield d : [Ljava/util/HashMap;
    //   89: astore #21
    //   91: iload #6
    //   93: iload #5
    //   95: if_icmpge -> 1454
    //   98: aload_1
    //   99: invokevirtual readUnsignedShort : ()I
    //   102: istore #10
    //   104: aload_1
    //   105: invokevirtual readUnsignedShort : ()I
    //   108: istore #4
    //   110: aload_1
    //   111: invokevirtual readInt : ()I
    //   114: istore #9
    //   116: aload_1
    //   117: getfield c : I
    //   120: i2l
    //   121: ldc2_w 4
    //   124: ladd
    //   125: lstore #16
    //   127: getstatic j60.I : [Ljava/util/HashMap;
    //   130: iload_2
    //   131: aaload
    //   132: iload #10
    //   134: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   137: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   140: checkcast g60
    //   143: astore #20
    //   145: iload #11
    //   147: ifeq -> 226
    //   150: aload #20
    //   152: ifnull -> 165
    //   155: aload #20
    //   157: getfield b : Ljava/lang/String;
    //   160: astore #19
    //   162: goto -> 171
    //   165: aconst_null
    //   166: astore #19
    //   168: goto -> 162
    //   171: ldc 'ExifInterface'
    //   173: ldc_w 'ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d'
    //   176: iconst_5
    //   177: anewarray java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: iload_2
    //   183: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   186: aastore
    //   187: dup
    //   188: iconst_1
    //   189: iload #10
    //   191: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   194: aastore
    //   195: dup
    //   196: iconst_2
    //   197: aload #19
    //   199: aastore
    //   200: dup
    //   201: iconst_3
    //   202: iload #4
    //   204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   207: aastore
    //   208: dup
    //   209: iconst_4
    //   210: iload #9
    //   212: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   215: aastore
    //   216: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   219: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   222: pop
    //   223: goto -> 226
    //   226: aload #20
    //   228: ifnonnull -> 270
    //   231: iload #11
    //   233: ifeq -> 267
    //   236: new java/lang/StringBuilder
    //   239: dup
    //   240: ldc_w 'Skip the tag entry since tag number is not defined: '
    //   243: invokespecial <init> : (Ljava/lang/String;)V
    //   246: astore #19
    //   248: aload #19
    //   250: iload #10
    //   252: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: ldc 'ExifInterface'
    //   258: aload #19
    //   260: invokevirtual toString : ()Ljava/lang/String;
    //   263: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   266: pop
    //   267: goto -> 620
    //   270: iload #4
    //   272: ifle -> 288
    //   275: getstatic j60.D : [I
    //   278: astore #19
    //   280: iload #4
    //   282: aload #19
    //   284: arraylength
    //   285: if_icmplt -> 291
    //   288: goto -> 584
    //   291: aload #20
    //   293: getfield c : I
    //   296: istore #7
    //   298: iload #7
    //   300: bipush #7
    //   302: if_icmpeq -> 360
    //   305: iload #4
    //   307: bipush #7
    //   309: if_icmpne -> 315
    //   312: goto -> 360
    //   315: iload #7
    //   317: iload #4
    //   319: if_icmpeq -> 360
    //   322: aload #20
    //   324: getfield d : I
    //   327: istore_3
    //   328: iload_3
    //   329: iload #4
    //   331: if_icmpne -> 337
    //   334: goto -> 360
    //   337: iload #7
    //   339: iconst_4
    //   340: if_icmpeq -> 354
    //   343: iload_3
    //   344: iconst_4
    //   345: if_icmpne -> 351
    //   348: goto -> 354
    //   351: goto -> 363
    //   354: iload #4
    //   356: iconst_3
    //   357: if_icmpne -> 351
    //   360: goto -> 472
    //   363: iload #7
    //   365: bipush #9
    //   367: if_icmpeq -> 376
    //   370: iload_3
    //   371: bipush #9
    //   373: if_icmpne -> 386
    //   376: iload #4
    //   378: bipush #8
    //   380: if_icmpne -> 386
    //   383: goto -> 360
    //   386: iload #7
    //   388: bipush #12
    //   390: if_icmpeq -> 399
    //   393: iload_3
    //   394: bipush #12
    //   396: if_icmpne -> 409
    //   399: iload #4
    //   401: bipush #11
    //   403: if_icmpne -> 409
    //   406: goto -> 360
    //   409: iload #11
    //   411: ifeq -> 267
    //   414: new java/lang/StringBuilder
    //   417: dup
    //   418: ldc_w 'Skip the tag entry since data format ('
    //   421: invokespecial <init> : (Ljava/lang/String;)V
    //   424: astore #19
    //   426: aload #19
    //   428: getstatic j60.C : [Ljava/lang/String;
    //   431: iload #4
    //   433: aaload
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: pop
    //   438: aload #19
    //   440: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.pncPBMYzDTgLS : Ljava/lang/String;
    //   443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: pop
    //   447: aload #19
    //   449: aload #20
    //   451: getfield b : Ljava/lang/String;
    //   454: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: pop
    //   458: ldc 'ExifInterface'
    //   460: aload #19
    //   462: invokevirtual toString : ()Ljava/lang/String;
    //   465: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   468: pop
    //   469: goto -> 267
    //   472: iload #4
    //   474: istore_3
    //   475: iload #4
    //   477: bipush #7
    //   479: if_icmpne -> 485
    //   482: iload #7
    //   484: istore_3
    //   485: iload #9
    //   487: i2l
    //   488: aload #19
    //   490: iload_3
    //   491: iaload
    //   492: i2l
    //   493: lmul
    //   494: lstore #14
    //   496: lload #14
    //   498: lconst_0
    //   499: lcmp
    //   500: iflt -> 525
    //   503: lload #14
    //   505: ldc2_w 2147483647
    //   508: lcmp
    //   509: ifle -> 515
    //   512: goto -> 525
    //   515: iconst_1
    //   516: istore #7
    //   518: lload #14
    //   520: lstore #12
    //   522: goto -> 626
    //   525: lload #14
    //   527: lstore #12
    //   529: iload_3
    //   530: istore #4
    //   532: iload #11
    //   534: ifeq -> 575
    //   537: new java/lang/StringBuilder
    //   540: dup
    //   541: ldc_w 'Skip the tag entry since the number of components is invalid: '
    //   544: invokespecial <init> : (Ljava/lang/String;)V
    //   547: astore #19
    //   549: aload #19
    //   551: iload #9
    //   553: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   556: pop
    //   557: ldc 'ExifInterface'
    //   559: aload #19
    //   561: invokevirtual toString : ()Ljava/lang/String;
    //   564: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   567: pop
    //   568: iload_3
    //   569: istore #4
    //   571: lload #14
    //   573: lstore #12
    //   575: iconst_0
    //   576: istore #7
    //   578: iload #4
    //   580: istore_3
    //   581: goto -> 626
    //   584: iload #11
    //   586: ifeq -> 620
    //   589: new java/lang/StringBuilder
    //   592: dup
    //   593: ldc_w 'Skip the tag entry since data format is invalid: '
    //   596: invokespecial <init> : (Ljava/lang/String;)V
    //   599: astore #19
    //   601: aload #19
    //   603: iload #4
    //   605: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: ldc 'ExifInterface'
    //   611: aload #19
    //   613: invokevirtual toString : ()Ljava/lang/String;
    //   616: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   619: pop
    //   620: lconst_0
    //   621: lstore #12
    //   623: goto -> 575
    //   626: iload #7
    //   628: ifne -> 640
    //   631: aload_1
    //   632: lload #16
    //   634: invokevirtual c : (J)V
    //   637: goto -> 1444
    //   640: lload #12
    //   642: ldc2_w 4
    //   645: lcmp
    //   646: ifle -> 846
    //   649: aload_1
    //   650: invokevirtual readInt : ()I
    //   653: istore #4
    //   655: iload #11
    //   657: ifeq -> 694
    //   660: new java/lang/StringBuilder
    //   663: dup
    //   664: ldc_w 'seek to data offset: '
    //   667: invokespecial <init> : (Ljava/lang/String;)V
    //   670: astore #19
    //   672: aload #19
    //   674: iload #4
    //   676: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   679: pop
    //   680: ldc 'ExifInterface'
    //   682: aload #19
    //   684: invokevirtual toString : ()Ljava/lang/String;
    //   687: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   690: pop
    //   691: goto -> 694
    //   694: aload_0
    //   695: getfield c : I
    //   698: bipush #7
    //   700: if_icmpne -> 723
    //   703: ldc_w 'MakerNote'
    //   706: aload #20
    //   708: getfield b : Ljava/lang/String;
    //   711: invokevirtual equals : (Ljava/lang/Object;)Z
    //   714: ifeq -> 726
    //   717: aload_0
    //   718: iload #4
    //   720: putfield i : I
    //   723: goto -> 836
    //   726: iload_2
    //   727: bipush #6
    //   729: if_icmpne -> 723
    //   732: ldc_w 'ThumbnailImage'
    //   735: aload #20
    //   737: getfield b : Ljava/lang/String;
    //   740: invokevirtual equals : (Ljava/lang/Object;)Z
    //   743: ifeq -> 723
    //   746: aload_0
    //   747: iload #4
    //   749: putfield j : I
    //   752: aload_0
    //   753: iload #9
    //   755: putfield k : I
    //   758: bipush #6
    //   760: aload_0
    //   761: getfield f : Ljava/nio/ByteOrder;
    //   764: invokestatic c : (ILjava/nio/ByteOrder;)Lf60;
    //   767: astore #19
    //   769: aload_0
    //   770: getfield j : I
    //   773: i2l
    //   774: aload_0
    //   775: getfield f : Ljava/nio/ByteOrder;
    //   778: invokestatic a : (JLjava/nio/ByteOrder;)Lf60;
    //   781: astore #22
    //   783: aload_0
    //   784: getfield k : I
    //   787: i2l
    //   788: aload_0
    //   789: getfield f : Ljava/nio/ByteOrder;
    //   792: invokestatic a : (JLjava/nio/ByteOrder;)Lf60;
    //   795: astore #23
    //   797: aload #21
    //   799: iconst_4
    //   800: aaload
    //   801: ldc_w 'Compression'
    //   804: aload #19
    //   806: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   809: pop
    //   810: aload #21
    //   812: iconst_4
    //   813: aaload
    //   814: ldc_w 'JPEGInterchangeFormat'
    //   817: aload #22
    //   819: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   822: pop
    //   823: aload #21
    //   825: iconst_4
    //   826: aaload
    //   827: ldc_w 'JPEGInterchangeFormatLength'
    //   830: aload #23
    //   832: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   835: pop
    //   836: aload_1
    //   837: iload #4
    //   839: i2l
    //   840: invokevirtual c : (J)V
    //   843: goto -> 846
    //   846: getstatic j60.L : Ljava/util/HashMap;
    //   849: iload #10
    //   851: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   854: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   857: checkcast java/lang/Integer
    //   860: astore #19
    //   862: iload #11
    //   864: ifeq -> 915
    //   867: new java/lang/StringBuilder
    //   870: dup
    //   871: ldc_w 'nextIfdType: '
    //   874: invokespecial <init> : (Ljava/lang/String;)V
    //   877: astore #22
    //   879: aload #22
    //   881: aload #19
    //   883: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   886: pop
    //   887: aload #22
    //   889: ldc_w ' byteCount: '
    //   892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: pop
    //   896: aload #22
    //   898: lload #12
    //   900: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   903: pop
    //   904: ldc 'ExifInterface'
    //   906: aload #22
    //   908: invokevirtual toString : ()Ljava/lang/String;
    //   911: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   914: pop
    //   915: aload #19
    //   917: ifnull -> 1273
    //   920: iload_3
    //   921: iconst_3
    //   922: if_icmpeq -> 990
    //   925: iload_3
    //   926: iconst_4
    //   927: if_icmpeq -> 976
    //   930: iload_3
    //   931: bipush #8
    //   933: if_icmpeq -> 968
    //   936: iload_3
    //   937: bipush #9
    //   939: if_icmpeq -> 956
    //   942: iload_3
    //   943: bipush #13
    //   945: if_icmpeq -> 956
    //   948: ldc2_w -1
    //   951: lstore #12
    //   953: goto -> 998
    //   956: aload_1
    //   957: invokevirtual readInt : ()I
    //   960: istore_3
    //   961: iload_3
    //   962: i2l
    //   963: lstore #12
    //   965: goto -> 998
    //   968: aload_1
    //   969: invokevirtual readShort : ()S
    //   972: istore_3
    //   973: goto -> 961
    //   976: aload_1
    //   977: invokevirtual readInt : ()I
    //   980: i2l
    //   981: ldc2_w 4294967295
    //   984: land
    //   985: lstore #12
    //   987: goto -> 998
    //   990: aload_1
    //   991: invokevirtual readUnsignedShort : ()I
    //   994: istore_3
    //   995: goto -> 961
    //   998: iload #11
    //   1000: ifeq -> 1035
    //   1003: ldc 'ExifInterface'
    //   1005: ldc_w 'Offset: %d, tagName: %s'
    //   1008: iconst_2
    //   1009: anewarray java/lang/Object
    //   1012: dup
    //   1013: iconst_0
    //   1014: lload #12
    //   1016: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: aload #20
    //   1024: getfield b : Ljava/lang/String;
    //   1027: aastore
    //   1028: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1031: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1034: pop
    //   1035: lload #12
    //   1037: lconst_0
    //   1038: lcmp
    //   1039: ifle -> 1060
    //   1042: iload #8
    //   1044: iconst_m1
    //   1045: if_icmpeq -> 1063
    //   1048: lload #12
    //   1050: iload #8
    //   1052: i2l
    //   1053: lcmp
    //   1054: ifge -> 1060
    //   1057: goto -> 1063
    //   1060: goto -> 1161
    //   1063: aload #18
    //   1065: lload #12
    //   1067: l2i
    //   1068: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1071: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1074: ifne -> 1096
    //   1077: aload_1
    //   1078: lload #12
    //   1080: invokevirtual c : (J)V
    //   1083: aload_0
    //   1084: aload_1
    //   1085: aload #19
    //   1087: invokevirtual intValue : ()I
    //   1090: invokevirtual t : (Li60;I)V
    //   1093: goto -> 1264
    //   1096: iload #11
    //   1098: ifeq -> 1093
    //   1101: new java/lang/StringBuilder
    //   1104: dup
    //   1105: ldc_w 'Skip jump into the IFD since it has already been read: IfdType '
    //   1108: invokespecial <init> : (Ljava/lang/String;)V
    //   1111: astore #20
    //   1113: aload #20
    //   1115: aload #19
    //   1117: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1120: pop
    //   1121: aload #20
    //   1123: ldc_w ' (at '
    //   1126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1129: pop
    //   1130: aload #20
    //   1132: lload #12
    //   1134: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1137: pop
    //   1138: aload #20
    //   1140: ldc_w ')'
    //   1143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1146: pop
    //   1147: ldc 'ExifInterface'
    //   1149: aload #20
    //   1151: invokevirtual toString : ()Ljava/lang/String;
    //   1154: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1157: pop
    //   1158: goto -> 1093
    //   1161: iload #11
    //   1163: ifeq -> 1093
    //   1166: new java/lang/StringBuilder
    //   1169: dup
    //   1170: ldc_w 'Skip jump into the IFD since its offset is invalid: '
    //   1173: invokespecial <init> : (Ljava/lang/String;)V
    //   1176: astore #19
    //   1178: aload #19
    //   1180: lload #12
    //   1182: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1185: pop
    //   1186: aload #19
    //   1188: invokevirtual toString : ()Ljava/lang/String;
    //   1191: astore #20
    //   1193: aload #20
    //   1195: astore #19
    //   1197: iload #8
    //   1199: iconst_m1
    //   1200: if_icmpeq -> 1253
    //   1203: new java/lang/StringBuilder
    //   1206: dup
    //   1207: invokespecial <init> : ()V
    //   1210: astore #19
    //   1212: aload #19
    //   1214: aload #20
    //   1216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1219: pop
    //   1220: aload #19
    //   1222: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.VIDgGdpIdokExc : Ljava/lang/String;
    //   1225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1228: pop
    //   1229: aload #19
    //   1231: iload #8
    //   1233: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1236: pop
    //   1237: aload #19
    //   1239: ldc_w ')'
    //   1242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1245: pop
    //   1246: aload #19
    //   1248: invokevirtual toString : ()Ljava/lang/String;
    //   1251: astore #19
    //   1253: ldc 'ExifInterface'
    //   1255: aload #19
    //   1257: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1260: pop
    //   1261: goto -> 1093
    //   1264: aload_1
    //   1265: lload #16
    //   1267: invokevirtual c : (J)V
    //   1270: goto -> 1444
    //   1273: aload_1
    //   1274: getfield c : I
    //   1277: istore #7
    //   1279: aload_0
    //   1280: getfield h : I
    //   1283: istore #4
    //   1285: lload #12
    //   1287: l2i
    //   1288: newarray byte
    //   1290: astore #19
    //   1292: aload_1
    //   1293: aload #19
    //   1295: invokevirtual readFully : ([B)V
    //   1298: new f60
    //   1301: dup
    //   1302: iload #7
    //   1304: iload #4
    //   1306: iadd
    //   1307: i2l
    //   1308: aload #19
    //   1310: iload_3
    //   1311: iload #9
    //   1313: invokespecial <init> : (J[BII)V
    //   1316: astore #19
    //   1318: aload #21
    //   1320: iload_2
    //   1321: aaload
    //   1322: astore #21
    //   1324: aload #20
    //   1326: getfield b : Ljava/lang/String;
    //   1329: astore #20
    //   1331: aload #21
    //   1333: aload #20
    //   1335: aload #19
    //   1337: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1340: pop
    //   1341: ldc_w 'DNGVersion'
    //   1344: aload #20
    //   1346: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1349: ifeq -> 1357
    //   1352: aload_0
    //   1353: iconst_3
    //   1354: putfield c : I
    //   1357: ldc 'Make'
    //   1359: aload #20
    //   1361: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1364: ifne -> 1377
    //   1367: ldc 'Model'
    //   1369: aload #20
    //   1371: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1374: ifeq -> 1395
    //   1377: aload #19
    //   1379: aload_0
    //   1380: getfield f : Ljava/nio/ByteOrder;
    //   1383: invokevirtual f : (Ljava/nio/ByteOrder;)Ljava/lang/String;
    //   1386: ldc_w 'PENTAX'
    //   1389: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1392: ifne -> 1421
    //   1395: ldc_w 'Compression'
    //   1398: aload #20
    //   1400: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1403: ifeq -> 1427
    //   1406: aload #19
    //   1408: aload_0
    //   1409: getfield f : Ljava/nio/ByteOrder;
    //   1412: invokevirtual e : (Ljava/nio/ByteOrder;)I
    //   1415: ldc_w 65535
    //   1418: if_icmpne -> 1427
    //   1421: aload_0
    //   1422: bipush #8
    //   1424: putfield c : I
    //   1427: aload_1
    //   1428: getfield c : I
    //   1431: i2l
    //   1432: lload #16
    //   1434: lcmp
    //   1435: ifeq -> 1444
    //   1438: aload_1
    //   1439: lload #16
    //   1441: invokevirtual c : (J)V
    //   1444: iload #6
    //   1446: iconst_1
    //   1447: iadd
    //   1448: i2s
    //   1449: istore #6
    //   1451: goto -> 85
    //   1454: aload_1
    //   1455: invokevirtual readInt : ()I
    //   1458: istore_2
    //   1459: iload #11
    //   1461: ifeq -> 1487
    //   1464: ldc 'ExifInterface'
    //   1466: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.mtmjWNdpjjyE : Ljava/lang/String;
    //   1469: iconst_1
    //   1470: anewarray java/lang/Object
    //   1473: dup
    //   1474: iconst_0
    //   1475: iload_2
    //   1476: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1479: aastore
    //   1480: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1483: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1486: pop
    //   1487: iload_2
    //   1488: i2l
    //   1489: lstore #12
    //   1491: lload #12
    //   1493: lconst_0
    //   1494: lcmp
    //   1495: ifle -> 1583
    //   1498: aload #18
    //   1500: iload_2
    //   1501: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1504: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1507: ifne -> 1550
    //   1510: aload_1
    //   1511: lload #12
    //   1513: invokevirtual c : (J)V
    //   1516: aload #21
    //   1518: iconst_4
    //   1519: aaload
    //   1520: invokevirtual isEmpty : ()Z
    //   1523: ifeq -> 1533
    //   1526: aload_0
    //   1527: aload_1
    //   1528: iconst_4
    //   1529: invokevirtual t : (Li60;I)V
    //   1532: return
    //   1533: aload #21
    //   1535: iconst_5
    //   1536: aaload
    //   1537: invokevirtual isEmpty : ()Z
    //   1540: ifeq -> 1615
    //   1543: aload_0
    //   1544: aload_1
    //   1545: iconst_5
    //   1546: invokevirtual t : (Li60;I)V
    //   1549: return
    //   1550: iload #11
    //   1552: ifeq -> 1615
    //   1555: new java/lang/StringBuilder
    //   1558: dup
    //   1559: ldc_w 'Stop reading file since re-reading an IFD may cause an infinite loop: '
    //   1562: invokespecial <init> : (Ljava/lang/String;)V
    //   1565: astore_1
    //   1566: aload_1
    //   1567: iload_2
    //   1568: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1571: pop
    //   1572: ldc 'ExifInterface'
    //   1574: aload_1
    //   1575: invokevirtual toString : ()Ljava/lang/String;
    //   1578: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1581: pop
    //   1582: return
    //   1583: iload #11
    //   1585: ifeq -> 1615
    //   1588: new java/lang/StringBuilder
    //   1591: dup
    //   1592: ldc_w 'Stop reading file since a wrong offset may cause an infinite loop: '
    //   1595: invokespecial <init> : (Ljava/lang/String;)V
    //   1598: astore_1
    //   1599: aload_1
    //   1600: iload_2
    //   1601: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1604: pop
    //   1605: ldc 'ExifInterface'
    //   1607: aload_1
    //   1608: invokevirtual toString : ()Ljava/lang/String;
    //   1611: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1614: pop
    //   1615: return
  }
  
  public final void u(int paramInt, String paramString1, String paramString2) {
    HashMap[] arrayOfHashMap = this.d;
    if (!arrayOfHashMap[paramInt].isEmpty() && arrayOfHashMap[paramInt].get(paramString1) != null) {
      HashMap<String, f60> hashMap = arrayOfHashMap[paramInt];
      hashMap.put(paramString2, hashMap.get(paramString1));
      arrayOfHashMap[paramInt].remove(paramString1);
    } 
  }
  
  public final void v(e60 parame60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : [Ljava/util/HashMap;
    //   4: iconst_4
    //   5: aaload
    //   6: astore #9
    //   8: aload #9
    //   10: ldc_w 'Compression'
    //   13: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   16: checkcast f60
    //   19: astore #10
    //   21: aload #10
    //   23: ifnull -> 603
    //   26: aload #10
    //   28: aload_0
    //   29: getfield f : Ljava/nio/ByteOrder;
    //   32: invokevirtual e : (Ljava/nio/ByteOrder;)I
    //   35: istore_2
    //   36: iload_2
    //   37: iconst_1
    //   38: if_icmpeq -> 64
    //   41: iload_2
    //   42: bipush #6
    //   44: if_icmpeq -> 56
    //   47: iload_2
    //   48: bipush #7
    //   50: if_icmpeq -> 64
    //   53: goto -> 602
    //   56: aload_0
    //   57: aload_1
    //   58: aload #9
    //   60: invokevirtual m : (Le60;Ljava/util/HashMap;)V
    //   63: return
    //   64: aload #9
    //   66: ldc 'BitsPerSample'
    //   68: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   71: checkcast f60
    //   74: astore #10
    //   76: aload #10
    //   78: ifnull -> 587
    //   81: aload #10
    //   83: aload_0
    //   84: getfield f : Ljava/nio/ByteOrder;
    //   87: invokevirtual g : (Ljava/nio/ByteOrder;)Ljava/io/Serializable;
    //   90: checkcast [I
    //   93: astore #10
    //   95: getstatic j60.n : [I
    //   98: astore #11
    //   100: aload #11
    //   102: aload #10
    //   104: invokestatic equals : ([I[I)Z
    //   107: ifeq -> 113
    //   110: goto -> 180
    //   113: aload_0
    //   114: getfield c : I
    //   117: iconst_3
    //   118: if_icmpne -> 587
    //   121: aload #9
    //   123: ldc 'PhotometricInterpretation'
    //   125: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: checkcast f60
    //   131: astore #12
    //   133: aload #12
    //   135: ifnull -> 587
    //   138: aload #12
    //   140: aload_0
    //   141: getfield f : Ljava/nio/ByteOrder;
    //   144: invokevirtual e : (Ljava/nio/ByteOrder;)I
    //   147: istore_2
    //   148: iload_2
    //   149: iconst_1
    //   150: if_icmpne -> 164
    //   153: aload #10
    //   155: getstatic j60.o : [I
    //   158: invokestatic equals : ([I[I)Z
    //   161: ifne -> 180
    //   164: iload_2
    //   165: bipush #6
    //   167: if_icmpne -> 587
    //   170: aload #10
    //   172: aload #11
    //   174: invokestatic equals : ([I[I)Z
    //   177: ifeq -> 587
    //   180: aload #9
    //   182: ldc 'StripOffsets'
    //   184: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   187: checkcast f60
    //   190: astore #11
    //   192: aload #9
    //   194: ldc_w 'StripByteCounts'
    //   197: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   200: checkcast f60
    //   203: astore #10
    //   205: aload #11
    //   207: ifnull -> 602
    //   210: aload #10
    //   212: ifnull -> 602
    //   215: aload #11
    //   217: aload_0
    //   218: getfield f : Ljava/nio/ByteOrder;
    //   221: invokevirtual g : (Ljava/nio/ByteOrder;)Ljava/io/Serializable;
    //   224: invokestatic s : (Ljava/io/Serializable;)[J
    //   227: astore #9
    //   229: aload #10
    //   231: aload_0
    //   232: getfield f : Ljava/nio/ByteOrder;
    //   235: invokevirtual g : (Ljava/nio/ByteOrder;)Ljava/io/Serializable;
    //   238: invokestatic s : (Ljava/io/Serializable;)[J
    //   241: astore #12
    //   243: aload #9
    //   245: ifnull -> 575
    //   248: aload #9
    //   250: arraylength
    //   251: ifne -> 257
    //   254: goto -> 575
    //   257: aload #12
    //   259: ifnull -> 563
    //   262: aload #12
    //   264: arraylength
    //   265: ifne -> 271
    //   268: goto -> 563
    //   271: aload #9
    //   273: arraylength
    //   274: aload #12
    //   276: arraylength
    //   277: if_icmpeq -> 292
    //   280: ldc 'ExifInterface'
    //   282: ldc_w 'stripOffsets and stripByteCounts should have same length.'
    //   285: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   288: pop
    //   289: goto -> 602
    //   292: aload #12
    //   294: arraylength
    //   295: istore_3
    //   296: lconst_0
    //   297: lstore #7
    //   299: iconst_0
    //   300: istore_2
    //   301: iload_2
    //   302: iload_3
    //   303: if_icmpge -> 321
    //   306: lload #7
    //   308: aload #12
    //   310: iload_2
    //   311: laload
    //   312: ladd
    //   313: lstore #7
    //   315: iinc #2, 1
    //   318: goto -> 301
    //   321: lload #7
    //   323: l2i
    //   324: newarray byte
    //   326: astore #10
    //   328: aload_0
    //   329: iconst_1
    //   330: putfield g : Z
    //   333: iconst_0
    //   334: istore #4
    //   336: iconst_0
    //   337: istore_3
    //   338: iload_3
    //   339: istore_2
    //   340: iload #4
    //   342: aload #9
    //   344: arraylength
    //   345: if_icmpge -> 547
    //   348: aload #9
    //   350: iload #4
    //   352: laload
    //   353: l2i
    //   354: istore #6
    //   356: aload #12
    //   358: iload #4
    //   360: laload
    //   361: l2i
    //   362: istore #5
    //   364: iload #4
    //   366: aload #9
    //   368: arraylength
    //   369: iconst_1
    //   370: isub
    //   371: if_icmpge -> 396
    //   374: iload #6
    //   376: iload #5
    //   378: iadd
    //   379: i2l
    //   380: aload #9
    //   382: iload #4
    //   384: iconst_1
    //   385: iadd
    //   386: laload
    //   387: lcmp
    //   388: ifeq -> 396
    //   391: aload_0
    //   392: iconst_0
    //   393: putfield g : Z
    //   396: iload #6
    //   398: iload_3
    //   399: isub
    //   400: istore #6
    //   402: iload #6
    //   404: ifge -> 419
    //   407: ldc 'ExifInterface'
    //   409: ldc_w 'Invalid strip offset value'
    //   412: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   415: pop
    //   416: goto -> 602
    //   419: aload_1
    //   420: iload #6
    //   422: invokevirtual a : (I)V
    //   425: iload #5
    //   427: newarray byte
    //   429: astore #11
    //   431: aload_1
    //   432: aload #11
    //   434: invokevirtual readFully : ([B)V
    //   437: iload_3
    //   438: iload #6
    //   440: iadd
    //   441: iload #5
    //   443: iadd
    //   444: istore_3
    //   445: aload #11
    //   447: iconst_0
    //   448: aload #10
    //   450: iload_2
    //   451: iload #5
    //   453: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   456: iload_2
    //   457: iload #5
    //   459: iadd
    //   460: istore_2
    //   461: iinc #4, 1
    //   464: goto -> 340
    //   467: astore_1
    //   468: new java/lang/StringBuilder
    //   471: dup
    //   472: ldc_w 'Failed to read '
    //   475: invokespecial <init> : (Ljava/lang/String;)V
    //   478: astore_1
    //   479: aload_1
    //   480: iload #5
    //   482: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   485: pop
    //   486: aload_1
    //   487: ldc_w ' bytes.'
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: pop
    //   494: ldc 'ExifInterface'
    //   496: aload_1
    //   497: invokevirtual toString : ()Ljava/lang/String;
    //   500: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   503: pop
    //   504: goto -> 602
    //   507: astore_1
    //   508: new java/lang/StringBuilder
    //   511: dup
    //   512: ldc_w 'Failed to skip '
    //   515: invokespecial <init> : (Ljava/lang/String;)V
    //   518: astore_1
    //   519: aload_1
    //   520: iload #6
    //   522: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   525: pop
    //   526: aload_1
    //   527: ldc_w ' bytes.'
    //   530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: pop
    //   534: ldc 'ExifInterface'
    //   536: aload_1
    //   537: invokevirtual toString : ()Ljava/lang/String;
    //   540: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   543: pop
    //   544: goto -> 602
    //   547: aload_0
    //   548: getfield g : Z
    //   551: ifeq -> 602
    //   554: aload #9
    //   556: iconst_0
    //   557: laload
    //   558: lstore #7
    //   560: goto -> 602
    //   563: ldc 'ExifInterface'
    //   565: ldc_w 'stripByteCounts should not be null or have zero length.'
    //   568: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   571: pop
    //   572: goto -> 602
    //   575: ldc 'ExifInterface'
    //   577: ldc_w 'stripOffsets should not be null or have zero length.'
    //   580: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   583: pop
    //   584: goto -> 602
    //   587: getstatic j60.m : Z
    //   590: ifeq -> 602
    //   593: ldc 'ExifInterface'
    //   595: ldc_w 'Unsupported data type value'
    //   598: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   601: pop
    //   602: return
    //   603: aload_0
    //   604: aload_1
    //   605: aload #9
    //   607: invokevirtual m : (Le60;Ljava/util/HashMap;)V
    //   610: return
    // Exception table:
    //   from	to	target	type
    //   419	425	507	java/io/EOFException
    //   431	437	467	java/io/EOFException
  }
  
  public final void w(int paramInt1, int paramInt2) {
    HashMap[] arrayOfHashMap = this.d;
    boolean bool1 = arrayOfHashMap[paramInt1].isEmpty();
    boolean bool2 = m;
    if (bool1 || arrayOfHashMap[paramInt2].isEmpty()) {
      if (bool2)
        Log.d("ExifInterface", "Cannot perform swap since only one image data exists"); 
      return;
    } 
    f60 f604 = arrayOfHashMap[paramInt1].get("ImageLength");
    f60 f601 = arrayOfHashMap[paramInt1].get("ImageWidth");
    f60 f603 = arrayOfHashMap[paramInt2].get("ImageLength");
    f60 f602 = arrayOfHashMap[paramInt2].get("ImageWidth");
    if (f604 == null || f601 == null) {
      if (bool2) {
        Log.d("ExifInterface", "First image does not contain valid size information");
        return;
      } 
      return;
    } 
    if (f603 == null || f602 == null) {
      if (bool2) {
        Log.d("ExifInterface", "Second image does not contain valid size information");
        return;
      } 
      return;
    } 
    int j = f604.e(this.f);
    int i = f601.e(this.f);
    int m = f603.e(this.f);
    int k = f602.e(this.f);
    if (j < m && i < k) {
      HashMap hashMap = arrayOfHashMap[paramInt1];
      arrayOfHashMap[paramInt1] = arrayOfHashMap[paramInt2];
      arrayOfHashMap[paramInt2] = hashMap;
      return;
    } 
  }
  
  public final void x(i60 parami60, int paramInt) {
    f60 f601;
    HashMap[] arrayOfHashMap = this.d;
    f60 f602 = arrayOfHashMap[paramInt].get("DefaultCropSize");
    f60 f604 = arrayOfHashMap[paramInt].get("SensorTopBorder");
    f60 f606 = arrayOfHashMap[paramInt].get("SensorLeftBorder");
    f60 f605 = arrayOfHashMap[paramInt].get("SensorBottomBorder");
    f60 f603 = arrayOfHashMap[paramInt].get("SensorRightBorder");
    if (f602 != null) {
      f60 f607;
      int i = f602.a;
      ByteOrder byteOrder = this.f;
      if (i == 5) {
        h60[] arrayOfH60 = (h60[])f602.g(byteOrder);
        if (arrayOfH60 == null || arrayOfH60.length != 2) {
          StringBuilder stringBuilder = new StringBuilder("Invalid crop size values. cropSize=");
          stringBuilder.append(Arrays.toString((Object[])arrayOfH60));
          Log.w("ExifInterface", stringBuilder.toString());
          return;
        } 
        f601 = f60.b(arrayOfH60[0], this.f);
        f607 = f60.b(arrayOfH60[1], this.f);
      } else {
        int[] arrayOfInt = (int[])f607.g((ByteOrder)f601);
        if (arrayOfInt == null || arrayOfInt.length != 2) {
          StringBuilder stringBuilder = new StringBuilder("Invalid crop size values. cropSize=");
          stringBuilder.append(Arrays.toString(arrayOfInt));
          Log.w("ExifInterface", stringBuilder.toString());
          return;
        } 
        f601 = f60.c(arrayOfInt[0], this.f);
        f607 = f60.c(arrayOfInt[1], this.f);
      } 
      arrayOfHashMap[paramInt].put("ImageWidth", f601);
      arrayOfHashMap[paramInt].put("ImageLength", f607);
      return;
    } 
    if (f604 != null && f606 != null && f605 != null && f603 != null) {
      int m = f604.e(this.f);
      int j = f605.e(this.f);
      int k = f603.e(this.f);
      int i = f606.e(this.f);
      if (j > m && k > i) {
        f602 = f60.c(j - m, this.f);
        f601 = f60.c(k - i, this.f);
        arrayOfHashMap[paramInt].put("ImageLength", f602);
        arrayOfHashMap[paramInt].put("ImageWidth", f601);
        return;
      } 
    } else {
      f602 = arrayOfHashMap[paramInt].get("ImageLength");
      f603 = arrayOfHashMap[paramInt].get("ImageWidth");
      if (f602 == null || f603 == null) {
        f602 = arrayOfHashMap[paramInt].get("JPEGInterchangeFormat");
        f60 f607 = arrayOfHashMap[paramInt].get("JPEGInterchangeFormatLength");
        if (f602 != null && f607 != null) {
          int i = f602.e(this.f);
          int j = f602.e(this.f);
          f601.c(i);
          byte[] arrayOfByte = new byte[j];
          f601.readFully(arrayOfByte);
          e(new e60(arrayOfByte), i, paramInt);
        } 
      } 
    } 
  }
  
  public final void y() {
    w(0, 5);
    w(0, 4);
    w(5, 4);
    HashMap[] arrayOfHashMap = this.d;
    f60 f601 = arrayOfHashMap[1].get("PixelXDimension");
    f60 f602 = arrayOfHashMap[1].get("PixelYDimension");
    if (f601 != null && f602 != null) {
      arrayOfHashMap[0].put("ImageWidth", f601);
      arrayOfHashMap[0].put("ImageLength", f602);
    } 
    if (arrayOfHashMap[4].isEmpty() && n(arrayOfHashMap[5])) {
      arrayOfHashMap[4] = arrayOfHashMap[5];
      arrayOfHashMap[5] = new HashMap<Object, Object>();
    } 
    if (!n(arrayOfHashMap[4]))
      Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image."); 
    u(0, "ThumbnailOrientation", "Orientation");
    u(0, "ThumbnailImageLength", "ImageLength");
    u(0, "ThumbnailImageWidth", "ImageWidth");
    u(5, "ThumbnailOrientation", "Orientation");
    u(5, "ThumbnailImageLength", "ImageLength");
    u(5, "ThumbnailImageWidth", "ImageWidth");
    u(4, "Orientation", "ThumbnailOrientation");
    u(4, "ImageLength", "ThumbnailImageLength");
    u(4, "ImageWidth", "ThumbnailImageWidth");
  }
  
  static {
    Integer integer5 = Integer.valueOf(3);
  }
  
  static {
    Integer integer3 = Integer.valueOf(1);
    Integer integer4 = Integer.valueOf(8);
    Arrays.asList(new Integer[] { integer3, Integer.valueOf(6), integer5, integer4 });
    Integer integer2 = Integer.valueOf(2);
    Integer integer1 = Integer.valueOf(7);
    Integer integer6 = Integer.valueOf(5);
    Arrays.asList(new Integer[] { integer2, integer1, Integer.valueOf(4), integer6 });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */