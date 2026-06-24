package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import ga1;
import in.krosbits.utils.SgV.YbNJ;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.tag.id3.AbstractTagItem;

public class FrameBodyTDRC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  private static final int PRECISION_DAY = 3;
  
  private static final int PRECISION_HOUR = 2;
  
  private static final int PRECISION_MINUTE = 1;
  
  private static final int PRECISION_MONTH = 4;
  
  private static final int PRECISION_SECOND = 0;
  
  private static final int PRECISION_YEAR = 5;
  
  private static SimpleDateFormat formatDateIn;
  
  private static SimpleDateFormat formatDateOut;
  
  private static SimpleDateFormat formatHoursOut;
  
  private static SimpleDateFormat formatMonthOut;
  
  private static SimpleDateFormat formatTimeIn;
  
  private static SimpleDateFormat formatTimeOut;
  
  private static SimpleDateFormat formatYearIn;
  
  private static SimpleDateFormat formatYearOut;
  
  private static final List<SimpleDateFormat> formatters;
  
  private String date = "";
  
  private boolean hoursOnly = false;
  
  private boolean monthOnly = false;
  
  private String originalID;
  
  private String time = "";
  
  private String year = "";
  
  static {
    ArrayList<SimpleDateFormat> arrayList = new ArrayList();
    formatters = arrayList;
    Locale locale = Locale.UK;
    arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale));
    arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", locale));
    arrayList.add(new SimpleDateFormat(oXrNDUqUkE.xVzanMIVdQL, locale));
    arrayList.add(new SimpleDateFormat("yyyy-MM-dd", locale));
    arrayList.add(new SimpleDateFormat("yyyy-MM", locale));
    arrayList.add(new SimpleDateFormat("yyyy", locale));
    formatYearIn = new SimpleDateFormat("yyyy", locale);
    formatDateIn = new SimpleDateFormat("ddMM", locale);
    formatTimeIn = new SimpleDateFormat("HHmm", locale);
    formatYearOut = new SimpleDateFormat("yyyy", locale);
    formatDateOut = new SimpleDateFormat("-MM-dd", locale);
    formatMonthOut = new SimpleDateFormat("-MM", locale);
    formatTimeOut = new SimpleDateFormat("'T'HH:mm", locale);
    formatHoursOut = new SimpleDateFormat("'T'HH", locale);
  }
  
  public FrameBodyTDRC() {}
  
  public FrameBodyTDRC(byte paramByte, String paramString) {
    super(paramByte, paramString);
    findMatchingMaskAndExtractV3Values();
  }
  
  public FrameBodyTDRC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
    findMatchingMaskAndExtractV3Values();
  }
  
  public FrameBodyTDRC(FrameBodyTDAT paramFrameBodyTDAT) {
    this.originalID = "TDAT";
    this.date = paramFrameBodyTDAT.getText();
    setMonthOnly(paramFrameBodyTDAT.isMonthOnly());
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", getFormattedText());
  }
  
  public FrameBodyTDRC(FrameBodyTDRC paramFrameBodyTDRC) {
    super(paramFrameBodyTDRC);
  }
  
  public FrameBodyTDRC(FrameBodyTIME paramFrameBodyTIME) {
    this.originalID = "TIME";
    this.time = paramFrameBodyTIME.getText();
    setHoursOnly(paramFrameBodyTIME.isHoursOnly());
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", getFormattedText());
  }
  
  public FrameBodyTDRC(FrameBodyTRDA paramFrameBodyTRDA) {
    this.originalID = "TRDA";
    this.date = paramFrameBodyTRDA.getText();
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", getFormattedText());
  }
  
  public FrameBodyTDRC(FrameBodyTYER paramFrameBodyTYER) {
    this.originalID = "TYER";
    this.year = paramFrameBodyTYER.getText();
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", getFormattedText());
  }
  
  private void extractID3v23Formats(Date paramDate, int paramInt) {
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = ga1.k(paramInt, YbNJ.XlNhvNcP, "for date:");
    stringBuilder.append(paramDate.toString());
    logger.fine(stringBuilder.toString());
    if (paramInt == 5) {
      setYear(formatDateAsYear(paramDate));
      return;
    } 
    if (paramInt == 4) {
      setYear(formatDateAsYear(paramDate));
      setDate(formatDateAsDate(paramDate));
      this.monthOnly = true;
      return;
    } 
    if (paramInt == 3) {
      setYear(formatDateAsYear(paramDate));
      setDate(formatDateAsDate(paramDate));
      return;
    } 
    if (paramInt == 2) {
      setYear(formatDateAsYear(paramDate));
      setDate(formatDateAsDate(paramDate));
      setTime(formatDateAsTime(paramDate));
      this.hoursOnly = true;
      return;
    } 
    if (paramInt == 1) {
      setYear(formatDateAsYear(paramDate));
      setDate(formatDateAsDate(paramDate));
      setTime(formatDateAsTime(paramDate));
      return;
    } 
    if (paramInt == 0) {
      setYear(formatDateAsYear(paramDate));
      setDate(formatDateAsDate(paramDate));
      setTime(formatDateAsTime(paramDate));
    } 
  }
  
  private static String formatAndParse(SimpleDateFormat paramSimpleDateFormat1, SimpleDateFormat paramSimpleDateFormat2, String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC}} */
    try {
      String str = paramSimpleDateFormat1.format(paramSimpleDateFormat2.parse(paramString));
      /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC}} */
      return str;
    } catch (ParseException parseException) {
      Logger logger = AbstractTagItem.logger;
      StringBuilder stringBuilder = new StringBuilder();
      this("Unable to parse:");
      stringBuilder.append(paramString);
      logger.warning(stringBuilder.toString());
      /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC}} */
      return "";
    } finally {}
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC}} */
    throw paramSimpleDateFormat1;
  }
  
  private static String formatDateAsDate(Date paramDate) {
    // Byte code:
    //   0: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   2: monitorenter
    //   3: getstatic org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC.formatDateIn : Ljava/text/SimpleDateFormat;
    //   6: aload_0
    //   7: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   10: astore_0
    //   11: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   13: monitorexit
    //   14: aload_0
    //   15: areturn
    //   16: astore_0
    //   17: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   19: monitorexit
    //   20: aload_0
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   3	11	16	finally
    //   17	20	16	finally
  }
  
  private static String formatDateAsTime(Date paramDate) {
    // Byte code:
    //   0: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   2: monitorenter
    //   3: getstatic org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC.formatTimeIn : Ljava/text/SimpleDateFormat;
    //   6: aload_0
    //   7: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   10: astore_0
    //   11: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   13: monitorexit
    //   14: aload_0
    //   15: areturn
    //   16: astore_0
    //   17: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   19: monitorexit
    //   20: aload_0
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   3	11	16	finally
    //   17	20	16	finally
  }
  
  private static String formatDateAsYear(Date paramDate) {
    // Byte code:
    //   0: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   2: monitorenter
    //   3: getstatic org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC.formatYearIn : Ljava/text/SimpleDateFormat;
    //   6: aload_0
    //   7: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   10: astore_0
    //   11: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   13: monitorexit
    //   14: aload_0
    //   15: areturn
    //   16: astore_0
    //   17: ldc org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   19: monitorexit
    //   20: aload_0
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   3	11	16	finally
    //   17	20	16	finally
  }
  
  public void findMatchingMaskAndExtractV3Values() {
    byte b = 0;
    while (true) {
      List<SimpleDateFormat> list = formatters;
      if (b < list.size()) {
        try {
          synchronized ((SimpleDateFormat)list.get(b)) {
            Date date = ((SimpleDateFormat)list.get(b)).parse(getText());
            if (date != null) {
              extractID3v23Formats(date, b);
              return;
            } 
          } 
        } catch (ParseException parseException) {
        
        } catch (NumberFormatException numberFormatException) {
          Logger logger = AbstractTagItem.logger;
          Level level = Level.WARNING;
          StringBuilder stringBuilder = new StringBuilder("Date Formatter:");
          stringBuilder.append(((SimpleDateFormat)formatters.get(b)).toPattern());
          stringBuilder.append("failed to parse:");
          stringBuilder.append(getText());
          stringBuilder.append("with ");
          stringBuilder.append(numberFormatException.getMessage());
          logger.log(level, stringBuilder.toString(), numberFormatException);
        } 
        b++;
        continue;
      } 
      return;
    } 
  }
  
  public String getDate() {
    return this.date;
  }
  
  public String getFormattedText() {
    StringBuffer stringBuffer = new StringBuffer();
    if (this.originalID == null)
      return getText(); 
    String str = this.year;
    if (str != null && !str.trim().isEmpty())
      stringBuffer.append(formatAndParse(formatYearOut, formatYearIn, this.year)); 
    if (!this.date.equals("")) {
      boolean bool = isMonthOnly();
      str = this.date;
      if (bool) {
        stringBuffer.append(formatAndParse(formatMonthOut, formatDateIn, str));
      } else {
        stringBuffer.append(formatAndParse(formatDateOut, formatDateIn, str));
      } 
    } 
    if (!this.time.equals("")) {
      boolean bool = isHoursOnly();
      str = this.time;
      if (bool) {
        stringBuffer.append(formatAndParse(formatHoursOut, formatTimeIn, str));
      } else {
        stringBuffer.append(formatAndParse(formatTimeOut, formatTimeIn, str));
      } 
    } 
    return stringBuffer.toString();
  }
  
  public String getIdentifier() {
    return "TDRC";
  }
  
  public String getOriginalID() {
    return this.originalID;
  }
  
  public String getTime() {
    return this.time;
  }
  
  public String getYear() {
    return this.year;
  }
  
  public boolean isHoursOnly() {
    return this.hoursOnly;
  }
  
  public boolean isMonthOnly() {
    return this.monthOnly;
  }
  
  public void setDate(String paramString) {
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder("Setting date to:");
    stringBuilder.append(paramString);
    logger.finest(stringBuilder.toString());
    this.date = paramString;
  }
  
  public void setHoursOnly(boolean paramBoolean) {
    this.hoursOnly = paramBoolean;
  }
  
  public void setMonthOnly(boolean paramBoolean) {
    this.monthOnly = paramBoolean;
  }
  
  public void setTime(String paramString) {
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder("Setting time to:");
    stringBuilder.append(paramString);
    logger.finest(stringBuilder.toString());
    this.time = paramString;
  }
  
  public void setYear(String paramString) {
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder("Setting year to");
    stringBuilder.append(paramString);
    logger.finest(stringBuilder.toString());
    this.year = paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDRC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */