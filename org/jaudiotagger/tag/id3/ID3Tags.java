package org.jaudiotagger.tag.id3;

import ga1;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;
import k91;
import l0;
import m60;
import org.jaudiotagger.tag.TagException;

public class ID3Tags {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  public static String convertFrameID22To23(String paramString) {
    return (paramString.length() < 3) ? null : ID3Frames.convertv22Tov23.get(paramString.subSequence(0, 3));
  }
  
  public static String convertFrameID22To24(String paramString) {
    if (paramString.length() < 3)
      return null; 
    String str = ID3Frames.convertv22Tov23.get(paramString.substring(0, 3));
    if (str != null) {
      paramString = ID3Frames.convertv23Tov24.get(str);
      return (paramString == null) ? ((ID3v24Frames.getInstanceOf().getIdToValueMap().get(str) != null) ? str : null) : paramString;
    } 
    return null;
  }
  
  public static String convertFrameID23To22(String paramString) {
    return (paramString.length() < 4) ? null : (ID3v23Frames.getInstanceOf().getIdToValueMap().containsKey(paramString) ? ID3Frames.convertv23Tov22.get(paramString.substring(0, 4)) : null);
  }
  
  public static String convertFrameID23To24(String paramString) {
    return (paramString.length() < 4) ? null : (ID3v23Frames.getInstanceOf().getIdToValueMap().containsKey(paramString) ? (ID3v24Frames.getInstanceOf().getIdToValueMap().containsKey(paramString) ? paramString : ID3Frames.convertv23Tov24.get(paramString.substring(0, 4))) : null);
  }
  
  public static String convertFrameID24To23(String paramString) {
    if (paramString.length() < 4)
      return null; 
    String str = ID3Frames.convertv24Tov23.get(paramString);
    return (str == null && ID3v23Frames.getInstanceOf().getIdToValueMap().containsKey(paramString)) ? paramString : str;
  }
  
  public static Object copyObject(Object paramObject) {
    if (paramObject == null)
      return null; 
    try {
      null = paramObject.getClass();
      return paramObject.getClass().getConstructor(new Class[] { null }).newInstance(new Object[] { paramObject });
    } catch (NoSuchMethodException noSuchMethodException) {
      l0.l("NoSuchMethodException: Error finding constructor to create copy:".concat(paramObject.getClass().getName()));
      return null;
    } catch (IllegalAccessException illegalAccessException) {
      l0.l("IllegalAccessException: No access to run constructor to create copy".concat(paramObject.getClass().getName()));
      return null;
    } catch (InstantiationException instantiationException) {
      l0.l("InstantiationException: Unable to instantiate constructor to copy".concat(paramObject.getClass().getName()));
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      if (!(invocationTargetException.getCause() instanceof Error)) {
        if (!(invocationTargetException.getCause() instanceof RuntimeException)) {
          l0.l("InvocationTargetException: Unable to invoke constructor to create copy");
          return null;
        } 
        throw (RuntimeException)invocationTargetException.getCause();
      } 
      throw (Error)invocationTargetException.getCause();
    } 
  }
  
  public static long findNumber(String paramString) {
    return findNumber(paramString, 0);
  }
  
  public static long findNumber(String paramString, int paramInt) {
    if (paramString != null) {
      if (paramInt >= 0 && paramInt < paramString.length()) {
        while (paramInt < paramString.length() && (paramString.charAt(paramInt) < '0' || paramString.charAt(paramInt) > '9') && paramString.charAt(paramInt) != '-')
          paramInt++; 
        int i;
        for (i = paramInt + 1; i < paramString.length() && paramString.charAt(i) >= '0' && paramString.charAt(i) <= '9'; i++);
        if (i <= paramString.length() && i > paramInt) {
          String str = paramString.substring(paramInt, i);
          if (!str.equals("-"))
            return Long.parseLong(str); 
          throw new TagException("Unable to find integer in string: ".concat(paramString));
        } 
        throw new TagException("Unable to find integer in string: ".concat(paramString));
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to image string is out of bounds: offset = ", ", string.length()");
      m60.g(paramString.length(), stringBuilder);
      return 0L;
    } 
    k91.h("String is null");
    return 0L;
  }
  
  public static String forceFrameID22To23(String paramString) {
    return ID3Frames.forcev22Tov23.get(paramString);
  }
  
  public static String forceFrameID23To22(String paramString) {
    return ID3Frames.forcev23Tov22.get(paramString);
  }
  
  public static String forceFrameID23To24(String paramString) {
    return ID3Frames.forcev23Tov24.get(paramString);
  }
  
  public static String forceFrameID24To23(String paramString) {
    return ID3Frames.forcev24Tov23.get(paramString);
  }
  
  public static long getWholeNumber(Object paramObject) {
    if (paramObject instanceof String)
      return Long.parseLong((String)paramObject); 
    if (paramObject instanceof Byte)
      return ((Byte)paramObject).byteValue(); 
    if (paramObject instanceof Short)
      return ((Short)paramObject).shortValue(); 
    if (paramObject instanceof Integer)
      return ((Integer)paramObject).intValue(); 
    if (paramObject instanceof Long)
      return ((Long)paramObject).longValue(); 
    l0.l("Unsupported value class: ".concat(paramObject.getClass().getName()));
    return 0L;
  }
  
  public static boolean isID3v22FrameIdentifier(String paramString) {
    return (paramString.length() < 3) ? false : ((paramString.length() == 3 && ID3v22Frames.getInstanceOf().getIdToValueMap().containsKey(paramString)));
  }
  
  public static boolean isID3v23FrameIdentifier(String paramString) {
    return (paramString.length() >= 4 && ID3v23Frames.getInstanceOf().getIdToValueMap().containsKey(paramString.substring(0, 4)));
  }
  
  public static boolean isID3v24FrameIdentifier(String paramString) {
    return (paramString.length() >= 4 && ID3v24Frames.getInstanceOf().getIdToValueMap().containsKey(paramString.substring(0, 4)));
  }
  
  public static String stripChar(String paramString, char paramChar) {
    if (paramString != null) {
      char[] arrayOfChar = new char[paramString.length()];
      byte b = 0;
      int i;
      for (i = 0; b < paramString.length(); i = j) {
        int j = i;
        if (paramString.charAt(b) != paramChar) {
          arrayOfChar[i] = paramString.charAt(b);
          j = i + 1;
        } 
        b++;
      } 
      return new String(arrayOfChar, 0, i);
    } 
    return null;
  }
  
  public static String truncate(String paramString, int paramInt) {
    if (paramString == null)
      return null; 
    if (paramInt < 0)
      return null; 
    String str = paramString;
    if (paramString.length() > paramInt)
      str = paramString.substring(0, paramInt); 
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3Tags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */