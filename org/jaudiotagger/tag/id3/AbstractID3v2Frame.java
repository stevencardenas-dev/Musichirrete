package org.jaudiotagger.tag.id3;

import android.window.ldG.XUaAMlaMSa;
import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.utils.SgV.zpEN;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.PaddingException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.id3.framebody.AbstractID3v2FrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAENC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyASPI;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCHAP;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMR;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCRM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCTOC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyENCR;
import org.jaudiotagger.tag.id3.framebody.FrameBodyEQU2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyETCO;
import org.jaudiotagger.tag.id3.framebody.FrameBodyEncrypted;
import org.jaudiotagger.tag.id3.framebody.FrameBodyGEOB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyGRID;
import org.jaudiotagger.tag.id3.framebody.FrameBodyGRP1;
import org.jaudiotagger.tag.id3.framebody.FrameBodyIPLS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyLINK;
import org.jaudiotagger.tag.id3.framebody.FrameBodyMCDI;
import org.jaudiotagger.tag.id3.framebody.FrameBodyMVIN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyMVNM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyOWNE;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPCNT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPOPM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPOSS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPRIV;
import org.jaudiotagger.tag.id3.framebody.FrameBodyRBUF;
import org.jaudiotagger.tag.id3.framebody.FrameBodyRVA2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyRVAD;
import org.jaudiotagger.tag.id3.framebody.FrameBodyRVRB;
import org.jaudiotagger.tag.id3.framebody.FrameBodySEEK;
import org.jaudiotagger.tag.id3.framebody.FrameBodySIGN;
import org.jaudiotagger.tag.id3.framebody.FrameBodySYLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodySYTC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTALB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTBPM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCMP;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCON;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCOP;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDAT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDEN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDLY;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDOR;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDRC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDRL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDTG;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTENC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTEXT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTFLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIME;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIPL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIT1;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIT2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIT3;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTKEY;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTLAN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTLEN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTMCL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTMED;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTMOO;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTOAL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTOFN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTOLY;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTOPE;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTORY;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTOWN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE1;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE3;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE4;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPOS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPRO;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPUB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTRCK;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTRDA;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTRSN;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTRSO;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSIZ;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSO2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSOA;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSOC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSOP;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSOT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSRC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSSE;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTSST;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTXXX;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTYER;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUFID;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUSER;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUSLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUnsupported;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWCOM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWCOP;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWOAF;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWOAR;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWOAS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWORS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWPAY;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWPUB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWXXX;
import org.jaudiotagger.tag.id3.framebody.FrameBodyXSOA;
import org.jaudiotagger.tag.id3.framebody.FrameBodyXSOP;
import org.jaudiotagger.tag.id3.framebody.FrameBodyXSOT;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;
import x41;

public abstract class AbstractID3v2Frame extends AbstractTagFrame implements TagTextField {
  protected static final String TYPE_FRAME = "frame";
  
  protected static final String TYPE_FRAME_SIZE = "frameSize";
  
  protected static final String UNSUPPORTED_ID = "Unsupported";
  
  EncodingFlags encodingFlags = null;
  
  protected int frameSize;
  
  protected String identifier = "";
  
  private String loggingFilename = "";
  
  StatusFlags statusFlags = null;
  
  public AbstractID3v2Frame() {}
  
  public AbstractID3v2Frame(String paramString) {
    Logger logger2 = AbstractTagItem.logger;
    StringBuilder stringBuilder1 = new StringBuilder("Creating empty frame of type");
    stringBuilder1.append(paramString);
    logger2.config(stringBuilder1.toString());
    this.identifier = paramString;
    try {
      stringBuilder1 = new StringBuilder();
      this("org.jaudiotagger.tag.id3.framebody.FrameBody");
      stringBuilder1.append(paramString);
      this.frameBody = (AbstractTagFrameBody)Class.forName(stringBuilder1.toString()).newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
      AbstractTagItem.logger.severe(classNotFoundException.getMessage());
      this.frameBody = (AbstractTagFrameBody)new FrameBodyUnsupported(paramString);
    } catch (InstantiationException instantiationException) {
    
    } catch (IllegalAccessException illegalAccessException) {}
    this.frameBody.setHeader(this);
    if (this instanceof ID3v24Frame) {
      this.frameBody.setTextEncoding(TagOptionSingleton.getInstance().getId3v24DefaultTextEncoding());
    } else if (this instanceof ID3v23Frame) {
      this.frameBody.setTextEncoding(TagOptionSingleton.getInstance().getId3v23DefaultTextEncoding());
    } 
    Logger logger1 = AbstractTagItem.logger;
    StringBuilder stringBuilder2 = new StringBuilder("Created empty frame of type");
    stringBuilder2.append(paramString);
    logger1.config(stringBuilder2.toString());
  }
  
  public AbstractID3v2Frame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    super(paramAbstractID3v2Frame);
  }
  
  public AbstractID3v2Frame(AbstractID3v2FrameBody paramAbstractID3v2FrameBody) {
    this.frameBody = (AbstractTagFrameBody)paramAbstractID3v2FrameBody;
    paramAbstractID3v2FrameBody.setHeader(this);
  }
  
  public void copyContent(TagField paramTagField) {}
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("frame", getIdentifier());
    MP3File.getStructureFormatter().d("frame");
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!(paramObject instanceof AbstractID3v2Frame) ? false : super.equals(paramObject));
  }
  
  public String getContent() {
    return getBody().getUserFriendlyValue();
  }
  
  public Charset getEncoding() {
    byte b = getBody().getTextEncoding();
    return TextEncoding.getInstanceOf().getCharsetForId(b);
  }
  
  public EncodingFlags getEncodingFlags() {
    return this.encodingFlags;
  }
  
  public abstract int getFrameHeaderSize();
  
  public abstract int getFrameIdSize();
  
  public abstract int getFrameSizeSize();
  
  public String getId() {
    return getIdentifier();
  }
  
  public String getIdentifier() {
    return this.identifier;
  }
  
  public String getLoggingFilename() {
    return this.loggingFilename;
  }
  
  public byte[] getRawContent() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    write(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public StatusFlags getStatusFlags() {
    return this.statusFlags;
  }
  
  public void isBinary(boolean paramBoolean) {}
  
  public boolean isEmpty() {
    return (getBody() == null);
  }
  
  public boolean isPadding(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte[0] == 0 && paramArrayOfbyte[1] == 0 && paramArrayOfbyte[2] == 0 && paramArrayOfbyte[3] == 0);
  }
  
  public AbstractID3v2FrameBody readBody(String paramString, ByteBuffer paramByteBuffer, int paramInt) {
    StringBuilder stringBuilder;
    AbstractTagItem.logger.finest("Creating framebody:start");
    try {
      FrameBodyXSOT frameBodyXSOT;
      FrameBodyXSOP frameBodyXSOP;
      FrameBodyXSOA frameBodyXSOA;
      FrameBodyWXXX frameBodyWXXX;
      FrameBodyWPUB frameBodyWPUB;
      FrameBodyWPAY frameBodyWPAY;
      FrameBodyWORS frameBodyWORS;
      FrameBodyWOAS frameBodyWOAS;
      FrameBodyWOAR frameBodyWOAR;
      FrameBodyWOAF frameBodyWOAF;
      FrameBodyWCOP frameBodyWCOP;
      FrameBodyWCOM frameBodyWCOM;
      FrameBodyUSLT frameBodyUSLT;
      FrameBodyUSER frameBodyUSER;
      FrameBodyUFID frameBodyUFID;
      FrameBodyTYER frameBodyTYER;
      FrameBodyTXXX frameBodyTXXX;
      FrameBodyTSST frameBodyTSST;
      FrameBodyTSSE frameBodyTSSE;
      FrameBodyTSRC frameBodyTSRC;
      FrameBodyTSOT frameBodyTSOT;
      FrameBodyTSOP frameBodyTSOP;
      FrameBodyTSOC frameBodyTSOC;
      FrameBodyTSOA frameBodyTSOA;
      FrameBodyTSO2 frameBodyTSO2;
      FrameBodyTSIZ frameBodyTSIZ;
      FrameBodyTRSO frameBodyTRSO;
      FrameBodyTRSN frameBodyTRSN;
      FrameBodyTRDA frameBodyTRDA;
      FrameBodyTRCK frameBodyTRCK;
      FrameBodyTPUB frameBodyTPUB;
      FrameBodyTPRO frameBodyTPRO;
      FrameBodyTPOS frameBodyTPOS;
      FrameBodyTPE4 frameBodyTPE4;
      FrameBodyTPE3 frameBodyTPE3;
      FrameBodyTPE2 frameBodyTPE2;
      FrameBodyTPE1 frameBodyTPE1;
      FrameBodyTOWN frameBodyTOWN;
      FrameBodyTORY frameBodyTORY;
      FrameBodyTOPE frameBodyTOPE;
      FrameBodyTOLY frameBodyTOLY;
      FrameBodyTOFN frameBodyTOFN;
      FrameBodyTOAL frameBodyTOAL;
      FrameBodyTMOO frameBodyTMOO;
      FrameBodyTMED frameBodyTMED;
      FrameBodyTMCL frameBodyTMCL;
      FrameBodyTLEN frameBodyTLEN;
      FrameBodyTLAN frameBodyTLAN;
      FrameBodyTKEY frameBodyTKEY;
      FrameBodyTIT3 frameBodyTIT3;
      FrameBodyTIT2 frameBodyTIT2;
      FrameBodyTIT1 frameBodyTIT1;
      FrameBodyTIPL frameBodyTIPL;
      FrameBodyTIME frameBodyTIME;
      FrameBodyTFLT frameBodyTFLT;
      FrameBodyTEXT frameBodyTEXT;
      FrameBodyTENC frameBodyTENC;
      FrameBodyTDTG frameBodyTDTG;
      FrameBodyTDRL frameBodyTDRL;
      FrameBodyTDRC frameBodyTDRC;
      FrameBodyTDOR frameBodyTDOR;
      FrameBodyTDLY frameBodyTDLY;
      FrameBodyTDEN frameBodyTDEN;
      FrameBodyTDAT frameBodyTDAT;
      FrameBodyTCOP frameBodyTCOP;
      FrameBodyTCON frameBodyTCON;
      FrameBodyTCMP frameBodyTCMP;
      FrameBodyTBPM frameBodyTBPM;
      FrameBodyTALB frameBodyTALB;
      FrameBodySYTC frameBodySYTC;
      FrameBodySYLT frameBodySYLT;
      FrameBodySIGN frameBodySIGN;
      FrameBodySEEK frameBodySEEK;
      FrameBodyRVRB frameBodyRVRB;
      FrameBodyRVAD frameBodyRVAD;
      FrameBodyRVA2 frameBodyRVA2;
      FrameBodyRBUF frameBodyRBUF;
      FrameBodyPRIV frameBodyPRIV;
      FrameBodyPOSS frameBodyPOSS;
      FrameBodyPOPM frameBodyPOPM;
      FrameBodyPCNT frameBodyPCNT;
      FrameBodyOWNE frameBodyOWNE;
      FrameBodyMVNM frameBodyMVNM;
      FrameBodyMVIN frameBodyMVIN;
      FrameBodyMCDI frameBodyMCDI;
      FrameBodyLINK frameBodyLINK;
      FrameBodyIPLS frameBodyIPLS;
      FrameBodyGRP1 frameBodyGRP1;
      FrameBodyGRID frameBodyGRID;
      FrameBodyGEOB frameBodyGEOB;
      FrameBodyETCO frameBodyETCO;
      FrameBodyEQU2 frameBodyEQU2;
      FrameBodyENCR frameBodyENCR;
      FrameBodyCTOC frameBodyCTOC;
      FrameBodyCOMR frameBodyCOMR;
      FrameBodyCOMM frameBodyCOMM;
      FrameBodyCHAP frameBodyCHAP;
      FrameBodyASPI frameBodyASPI;
      FrameBodyAPIC frameBodyAPIC;
      FrameBodyAENC frameBodyAENC;
      FrameBodyPIC frameBodyPIC;
      FrameBodyCRM frameBodyCRM;
      switch (paramString.hashCode()) {
        case 2703904:
          if (paramString.equals("XSOT")) {
            FrameBodyXSOT frameBodyXSOT1 = new FrameBodyXSOT(paramByteBuffer, paramInt);
            frameBodyXSOT = frameBodyXSOT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyXSOT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyXSOT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyXSOT;
          } 
          break;
        case 2703900:
          if (frameBodyXSOT.equals("XSOP")) {
            FrameBodyXSOP frameBodyXSOP1 = new FrameBodyXSOP((ByteBuffer)stringBuilder, paramInt);
            frameBodyXSOP = frameBodyXSOP1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyXSOP.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyXSOP.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyXSOP;
          } 
          break;
        case 2703885:
          if (frameBodyXSOP.equals("XSOA")) {
            FrameBodyXSOA frameBodyXSOA1 = new FrameBodyXSOA((ByteBuffer)stringBuilder, paramInt);
            frameBodyXSOA = frameBodyXSOA1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyXSOA.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyXSOA.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyXSOA;
          } 
          break;
        case 2679201:
          if (frameBodyXSOA.equals("WXXX")) {
            FrameBodyWXXX frameBodyWXXX1 = new FrameBodyWXXX((ByteBuffer)stringBuilder, paramInt);
            frameBodyWXXX = frameBodyWXXX1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWXXX.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWXXX.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWXXX;
          } 
          break;
        case 2671398:
          if (frameBodyWXXX.equals(nBRIsU.viMfjoBa)) {
            FrameBodyWPUB frameBodyWPUB1 = new FrameBodyWPUB((ByteBuffer)stringBuilder, paramInt);
            frameBodyWPUB = frameBodyWPUB1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWPUB.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWPUB.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWPUB;
          } 
          break;
        case 2670801:
          if (frameBodyWPUB.equals("WPAY")) {
            FrameBodyWPAY frameBodyWPAY1 = new FrameBodyWPAY((ByteBuffer)stringBuilder, paramInt);
            frameBodyWPAY = frameBodyWPAY1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWPAY.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWPAY.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWPAY;
          } 
          break;
        case 2670361:
          if (frameBodyWPAY.equals("WORS")) {
            FrameBodyWORS frameBodyWORS1 = new FrameBodyWORS((ByteBuffer)stringBuilder, paramInt);
            frameBodyWORS = frameBodyWORS1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWORS.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWORS.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWORS;
          } 
          break;
        case 2669834:
          if (frameBodyWORS.equals("WOAS")) {
            FrameBodyWOAS frameBodyWOAS1 = new FrameBodyWOAS((ByteBuffer)stringBuilder, paramInt);
            frameBodyWOAS = frameBodyWOAS1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWOAS.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWOAS.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWOAS;
          } 
          break;
        case 2669833:
          if (frameBodyWOAS.equals("WOAR")) {
            FrameBodyWOAR frameBodyWOAR1 = new FrameBodyWOAR((ByteBuffer)stringBuilder, paramInt);
            frameBodyWOAR = frameBodyWOAR1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWOAR.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWOAR.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWOAR;
          } 
          break;
        case 2669821:
          if (frameBodyWOAR.equals("WOAF")) {
            FrameBodyWOAF frameBodyWOAF1 = new FrameBodyWOAF((ByteBuffer)stringBuilder, paramInt);
            frameBodyWOAF = frameBodyWOAF1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWOAF.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWOAF.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWOAF;
          } 
          break;
        case 2658733:
          if (frameBodyWOAF.equals("WCOP")) {
            FrameBodyWCOP frameBodyWCOP1 = new FrameBodyWCOP((ByteBuffer)stringBuilder, paramInt);
            frameBodyWCOP = frameBodyWCOP1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWCOP.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWCOP.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWCOP;
          } 
          break;
        case 2658730:
          if (frameBodyWCOP.equals("WCOM")) {
            FrameBodyWCOM frameBodyWCOM1 = new FrameBodyWCOM((ByteBuffer)stringBuilder, paramInt);
            frameBodyWCOM = frameBodyWCOM1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyWCOM.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyWCOM.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyWCOM;
          } 
          break;
        case 2614438:
          if (frameBodyWCOM.equals("USLT")) {
            FrameBodyUSLT frameBodyUSLT1 = new FrameBodyUSLT((ByteBuffer)stringBuilder, paramInt);
            frameBodyUSLT = frameBodyUSLT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyUSLT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyUSLT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyUSLT;
          } 
          break;
        case 2614219:
          if (frameBodyUSLT.equals("USER")) {
            FrameBodyUSER frameBodyUSER1 = new FrameBodyUSER((ByteBuffer)stringBuilder, paramInt);
            frameBodyUSER = frameBodyUSER1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyUSER.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyUSER.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyUSER;
          } 
          break;
        case 2601836:
          if (frameBodyUSER.equals("UFID")) {
            FrameBodyUFID frameBodyUFID1 = new FrameBodyUFID((ByteBuffer)stringBuilder, paramInt);
            frameBodyUFID = frameBodyUFID1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyUFID.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyUFID.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyUFID;
          } 
          break;
        case 2590194:
          if (frameBodyUFID.equals("TYER")) {
            FrameBodyTYER frameBodyTYER1 = new FrameBodyTYER((ByteBuffer)stringBuilder, paramInt);
            frameBodyTYER = frameBodyTYER1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTYER.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTYER.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTYER;
          } 
          break;
        case 2589828:
          if (frameBodyTYER.equals("TXXX")) {
            FrameBodyTXXX frameBodyTXXX1 = new FrameBodyTXXX((ByteBuffer)stringBuilder, paramInt);
            frameBodyTXXX = frameBodyTXXX1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTXXX.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTXXX.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTXXX;
          } 
          break;
        case 2584864:
          if (frameBodyTXXX.equals("TSST")) {
            FrameBodyTSST frameBodyTSST1 = new FrameBodyTSST((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSST = frameBodyTSST1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSST.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSST.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSST;
          } 
          break;
        case 2584849:
          if (frameBodyTSST.equals("TSSE")) {
            FrameBodyTSSE frameBodyTSSE1 = new FrameBodyTSSE((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSSE = frameBodyTSSE1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSSE.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSSE.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSSE;
          } 
          break;
        case 2584816:
          if (frameBodyTSSE.equals("TSRC")) {
            FrameBodyTSRC frameBodyTSRC1 = new FrameBodyTSRC((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSRC = frameBodyTSRC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSRC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSRC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSRC;
          } 
          break;
        case 2584740:
          if (frameBodyTSRC.equals("TSOT")) {
            FrameBodyTSOT frameBodyTSOT1 = new FrameBodyTSOT((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSOT = frameBodyTSOT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSOT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSOT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSOT;
          } 
          break;
        case 2584736:
          if (frameBodyTSOT.equals("TSOP")) {
            FrameBodyTSOP frameBodyTSOP1 = new FrameBodyTSOP((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSOP = frameBodyTSOP1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSOP.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSOP.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSOP;
          } 
          break;
        case 2584723:
          if (frameBodyTSOP.equals("TSOC")) {
            FrameBodyTSOC frameBodyTSOC1 = new FrameBodyTSOC((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSOC = frameBodyTSOC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSOC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSOC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSOC;
          } 
          break;
        case 2584721:
          if (frameBodyTSOC.equals("TSOA")) {
            FrameBodyTSOA frameBodyTSOA1 = new FrameBodyTSOA((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSOA = frameBodyTSOA1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSOA.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSOA.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSOA;
          } 
          break;
        case 2584706:
          if (frameBodyTSOA.equals("TSO2")) {
            FrameBodyTSO2 frameBodyTSO21 = new FrameBodyTSO2((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSO2 = frameBodyTSO21;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSO2.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSO2.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSO2;
          } 
          break;
        case 2584560:
          if (frameBodyTSO2.equals("TSIZ")) {
            FrameBodyTSIZ frameBodyTSIZ1 = new FrameBodyTSIZ((ByteBuffer)stringBuilder, paramInt);
            frameBodyTSIZ = frameBodyTSIZ1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTSIZ.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTSIZ.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTSIZ;
          } 
          break;
        case 2583898:
          if (frameBodyTSIZ.equals("TRSO")) {
            FrameBodyTRSO frameBodyTRSO1 = new FrameBodyTRSO((ByteBuffer)stringBuilder, paramInt);
            frameBodyTRSO = frameBodyTRSO1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTRSO.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTRSO.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTRSO;
          } 
          break;
        case 2583897:
          if (frameBodyTRSO.equals("TRSN")) {
            FrameBodyTRSN frameBodyTRSN1 = new FrameBodyTRSN((ByteBuffer)stringBuilder, paramInt);
            frameBodyTRSN = frameBodyTRSN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTRSN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTRSN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTRSN;
          } 
          break;
        case 2583419:
          if (frameBodyTRSN.equals("TRDA")) {
            FrameBodyTRDA frameBodyTRDA1 = new FrameBodyTRDA((ByteBuffer)stringBuilder, paramInt);
            frameBodyTRDA = frameBodyTRDA1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTRDA.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTRDA.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTRDA;
          } 
          break;
        case 2583398:
          if (frameBodyTRDA.equals("TRCK")) {
            FrameBodyTRCK frameBodyTRCK1 = new FrameBodyTRCK((ByteBuffer)stringBuilder, paramInt);
            frameBodyTRCK = frameBodyTRCK1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTRCK.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTRCK.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTRCK;
          } 
          break;
        case 2582025:
          if (frameBodyTRCK.equals("TPUB")) {
            FrameBodyTPUB frameBodyTPUB1 = new FrameBodyTPUB((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPUB = frameBodyTPUB1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPUB.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPUB.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPUB;
          } 
          break;
        case 2581945:
          if (frameBodyTPUB.equals("TPRO")) {
            FrameBodyTPRO frameBodyTPRO1 = new FrameBodyTPRO((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPRO = frameBodyTPRO1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPRO.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPRO.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPRO;
          } 
          break;
        case 2581856:
          if (frameBodyTPRO.equals("TPOS")) {
            FrameBodyTPOS frameBodyTPOS1 = new FrameBodyTPOS((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPOS = frameBodyTPOS1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPOS.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPOS.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPOS;
          } 
          break;
        case 2581515:
          if (frameBodyTPOS.equals("TPE4")) {
            FrameBodyTPE4 frameBodyTPE41 = new FrameBodyTPE4((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPE4 = frameBodyTPE41;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPE4.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPE4.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPE4;
          } 
          break;
        case 2581514:
          if (frameBodyTPE4.equals("TPE3")) {
            FrameBodyTPE3 frameBodyTPE31 = new FrameBodyTPE3((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPE3 = frameBodyTPE31;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPE3.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPE3.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPE3;
          } 
          break;
        case 2581513:
          if (frameBodyTPE3.equals("TPE2")) {
            FrameBodyTPE2 frameBodyTPE21 = new FrameBodyTPE2((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPE2 = frameBodyTPE21;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPE2.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPE2.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPE2;
          } 
          break;
        case 2581512:
          if (frameBodyTPE2.equals("TPE1")) {
            FrameBodyTPE1 frameBodyTPE11 = new FrameBodyTPE1((ByteBuffer)stringBuilder, paramInt);
            frameBodyTPE1 = frameBodyTPE11;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTPE1.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTPE1.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTPE1;
          } 
          break;
        case 2581138:
          if (frameBodyTPE1.equals("TOWN")) {
            FrameBodyTOWN frameBodyTOWN1 = new FrameBodyTOWN((ByteBuffer)stringBuilder, paramInt);
            frameBodyTOWN = frameBodyTOWN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTOWN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTOWN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTOWN;
          } 
          break;
        case 2580994:
          if (frameBodyTOWN.equals("TORY")) {
            FrameBodyTORY frameBodyTORY1 = new FrameBodyTORY((ByteBuffer)stringBuilder, paramInt);
            frameBodyTORY = frameBodyTORY1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTORY.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTORY.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTORY;
          } 
          break;
        case 2580912:
          if (frameBodyTORY.equals("TOPE")) {
            FrameBodyTOPE frameBodyTOPE1 = new FrameBodyTOPE((ByteBuffer)stringBuilder, paramInt);
            frameBodyTOPE = frameBodyTOPE1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTOPE.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTOPE.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTOPE;
          } 
          break;
        case 2580808:
          if (frameBodyTOPE.equals(kOkiWEITVb.LrfI)) {
            FrameBodyTOLY frameBodyTOLY1 = new FrameBodyTOLY((ByteBuffer)stringBuilder, paramInt);
            frameBodyTOLY = frameBodyTOLY1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTOLY.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTOLY.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTOLY;
          } 
          break;
        case 2580611:
          if (frameBodyTOLY.equals("TOFN")) {
            FrameBodyTOFN frameBodyTOFN1 = new FrameBodyTOFN((ByteBuffer)stringBuilder, paramInt);
            frameBodyTOFN = frameBodyTOFN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTOFN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTOFN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTOFN;
          } 
          break;
        case 2580454:
          if (frameBodyTOFN.equals("TOAL")) {
            FrameBodyTOAL frameBodyTOAL1 = new FrameBodyTOAL((ByteBuffer)stringBuilder, paramInt);
            frameBodyTOAL = frameBodyTOAL1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTOAL.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTOAL.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTOAL;
          } 
          break;
        case 2578969:
          if (frameBodyTOAL.equals("TMOO")) {
            FrameBodyTMOO frameBodyTMOO1 = new FrameBodyTMOO((ByteBuffer)stringBuilder, paramInt);
            frameBodyTMOO = frameBodyTMOO1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTMOO.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTMOO.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTMOO;
          } 
          break;
        case 2578648:
          if (frameBodyTMOO.equals("TMED")) {
            FrameBodyTMED frameBodyTMED1 = new FrameBodyTMED((ByteBuffer)stringBuilder, paramInt);
            frameBodyTMED = frameBodyTMED1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTMED.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTMED.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTMED;
          } 
          break;
        case 2578594:
          if (frameBodyTMED.equals("TMCL")) {
            FrameBodyTMCL frameBodyTMCL1 = new FrameBodyTMCL((ByteBuffer)stringBuilder, paramInt);
            frameBodyTMCL = frameBodyTMCL1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTMCL.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTMCL.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTMCL;
          } 
          break;
        case 2577697:
          if (frameBodyTMCL.equals(ybWnIKHovcRr.CjScbZH)) {
            FrameBodyTLEN frameBodyTLEN1 = new FrameBodyTLEN((ByteBuffer)stringBuilder, paramInt);
            frameBodyTLEN = frameBodyTLEN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTLEN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTLEN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTLEN;
          } 
          break;
        case 2577573:
          if (frameBodyTLEN.equals("TLAN")) {
            FrameBodyTLAN frameBodyTLAN1 = new FrameBodyTLAN((ByteBuffer)stringBuilder, paramInt);
            frameBodyTLAN = frameBodyTLAN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTLAN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTLAN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTLAN;
          } 
          break;
        case 2576747:
          if (frameBodyTLAN.equals("TKEY")) {
            FrameBodyTKEY frameBodyTKEY1 = new FrameBodyTKEY((ByteBuffer)stringBuilder, paramInt);
            frameBodyTKEY = frameBodyTKEY1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTKEY.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTKEY.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTKEY;
          } 
          break;
        case 2575252:
          if (frameBodyTKEY.equals("TIT3")) {
            FrameBodyTIT3 frameBodyTIT31 = new FrameBodyTIT3((ByteBuffer)stringBuilder, paramInt);
            frameBodyTIT3 = frameBodyTIT31;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTIT3.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTIT3.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTIT3;
          } 
          break;
        case 2575251:
          if (frameBodyTIT3.equals("TIT2")) {
            FrameBodyTIT2 frameBodyTIT21 = new FrameBodyTIT2((ByteBuffer)stringBuilder, paramInt);
            frameBodyTIT2 = frameBodyTIT21;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTIT2.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTIT2.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTIT2;
          } 
          break;
        case 2575250:
          if (frameBodyTIT2.equals("TIT1")) {
            FrameBodyTIT1 frameBodyTIT11 = new FrameBodyTIT1((ByteBuffer)stringBuilder, paramInt);
            frameBodyTIT1 = frameBodyTIT11;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTIT1.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTIT1.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTIT1;
          } 
          break;
        case 2575153:
          if (frameBodyTIT1.equals("TIPL")) {
            FrameBodyTIPL frameBodyTIPL1 = new FrameBodyTIPL((ByteBuffer)stringBuilder, paramInt);
            frameBodyTIPL = frameBodyTIPL1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTIPL.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTIPL.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTIPL;
          } 
          break;
        case 2575053:
          if (frameBodyTIPL.equals("TIME")) {
            FrameBodyTIME frameBodyTIME1 = new FrameBodyTIME((ByteBuffer)stringBuilder, paramInt);
            frameBodyTIME = frameBodyTIME1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTIME.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTIME.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTIME;
          } 
          break;
        case 2572154:
          if (frameBodyTIME.equals("TFLT")) {
            FrameBodyTFLT frameBodyTFLT1 = new FrameBodyTFLT((ByteBuffer)stringBuilder, paramInt);
            frameBodyTFLT = frameBodyTFLT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTFLT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTFLT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTFLT;
          } 
          break;
        case 2571565:
          if (frameBodyTFLT.equals("TEXT")) {
            FrameBodyTEXT frameBodyTEXT1 = new FrameBodyTEXT((ByteBuffer)stringBuilder, paramInt);
            frameBodyTEXT = frameBodyTEXT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTEXT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTEXT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTEXT;
          } 
          break;
        case 2571238:
          if (frameBodyTEXT.equals("TENC")) {
            FrameBodyTENC frameBodyTENC1 = new FrameBodyTENC((ByteBuffer)stringBuilder, paramInt);
            frameBodyTENC = frameBodyTENC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTENC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTENC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTENC;
          } 
          break;
        case 2570467:
          if (frameBodyTENC.equals("TDTG")) {
            FrameBodyTDTG frameBodyTDTG1 = new FrameBodyTDTG((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDTG = frameBodyTDTG1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDTG.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDTG.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDTG;
          } 
          break;
        case 2570410:
          if (frameBodyTDTG.equals("TDRL")) {
            FrameBodyTDRL frameBodyTDRL1 = new FrameBodyTDRL((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDRL = frameBodyTDRL1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDRL.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDRL.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDRL;
          } 
          break;
        case 2570401:
          if (frameBodyTDRL.equals("TDRC")) {
            FrameBodyTDRC frameBodyTDRC1 = new FrameBodyTDRC((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDRC = frameBodyTDRC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDRC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDRC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDRC;
          } 
          break;
        case 2570323:
          if (frameBodyTDRC.equals("TDOR")) {
            FrameBodyTDOR frameBodyTDOR1 = new FrameBodyTDOR((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDOR = frameBodyTDOR1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDOR.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDOR.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDOR;
          } 
          break;
        case 2570237:
          if (frameBodyTDOR.equals("TDLY")) {
            FrameBodyTDLY frameBodyTDLY1 = new FrameBodyTDLY((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDLY = frameBodyTDLY1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDLY.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDLY.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDLY;
          } 
          break;
        case 2570009:
          if (frameBodyTDLY.equals("TDEN")) {
            FrameBodyTDEN frameBodyTDEN1 = new FrameBodyTDEN((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDEN = frameBodyTDEN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDEN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDEN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDEN;
          } 
          break;
        case 2569891:
          if (frameBodyTDEN.equals("TDAT")) {
            FrameBodyTDAT frameBodyTDAT1 = new FrameBodyTDAT((ByteBuffer)stringBuilder, paramInt);
            frameBodyTDAT = frameBodyTDAT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTDAT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTDAT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTDAT;
          } 
          break;
        case 2569360:
          if (frameBodyTDAT.equals("TCOP")) {
            FrameBodyTCOP frameBodyTCOP1 = new FrameBodyTCOP((ByteBuffer)stringBuilder, paramInt);
            frameBodyTCOP = frameBodyTCOP1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTCOP.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTCOP.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTCOP;
          } 
          break;
        case 2569358:
          if (frameBodyTCOP.equals("TCON")) {
            FrameBodyTCON frameBodyTCON1 = new FrameBodyTCON((ByteBuffer)stringBuilder, paramInt);
            frameBodyTCON = frameBodyTCON1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTCON.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTCON.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTCON;
          } 
          break;
        case 2569298:
          if (frameBodyTCON.equals("TCMP")) {
            FrameBodyTCMP frameBodyTCMP1 = new FrameBodyTCMP((ByteBuffer)stringBuilder, paramInt);
            frameBodyTCMP = frameBodyTCMP1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTCMP.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTCMP.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTCMP;
          } 
          break;
        case 2568427:
          if (frameBodyTCMP.equals("TBPM")) {
            FrameBodyTBPM frameBodyTBPM1 = new FrameBodyTBPM((ByteBuffer)stringBuilder, paramInt);
            frameBodyTBPM = frameBodyTBPM1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTBPM.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTBPM.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTBPM;
          } 
          break;
        case 2567331:
          if (frameBodyTBPM.equals("TALB")) {
            FrameBodyTALB frameBodyTALB1 = new FrameBodyTALB((ByteBuffer)stringBuilder, paramInt);
            frameBodyTALB = frameBodyTALB1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyTALB.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyTALB.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyTALB;
          } 
          break;
        case 2560853:
          if (frameBodyTALB.equals(uvJYmft.KDyi)) {
            FrameBodySYTC frameBodySYTC1 = new FrameBodySYTC((ByteBuffer)stringBuilder, paramInt);
            frameBodySYTC = frameBodySYTC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodySYTC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodySYTC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodySYTC;
          } 
          break;
        case 2560622:
          if (frameBodySYTC.equals("SYLT")) {
            FrameBodySYLT frameBodySYLT1 = new FrameBodySYLT((ByteBuffer)stringBuilder, paramInt);
            frameBodySYLT = frameBodySYLT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodySYLT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodySYLT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodySYLT;
          } 
          break;
        case 2545085:
          if (frameBodySYLT.equals("SIGN")) {
            FrameBodySIGN frameBodySIGN1 = new FrameBodySIGN((ByteBuffer)stringBuilder, paramInt);
            frameBodySIGN = frameBodySIGN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodySIGN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodySIGN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodySIGN;
          } 
          break;
        case 2541176:
          if (frameBodySIGN.equals("SEEK")) {
            FrameBodySEEK frameBodySEEK1 = new FrameBodySEEK((ByteBuffer)stringBuilder, paramInt);
            frameBodySEEK = frameBodySEEK1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodySEEK.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodySEEK.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodySEEK;
          } 
          break;
        case 2528116:
          if (frameBodySEEK.equals("RVRB")) {
            FrameBodyRVRB frameBodyRVRB1 = new FrameBodyRVRB((ByteBuffer)stringBuilder, paramInt);
            frameBodyRVRB = frameBodyRVRB1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyRVRB.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyRVRB.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyRVRB;
          } 
          break;
        case 2527591:
          if (frameBodyRVRB.equals("RVAD")) {
            FrameBodyRVAD frameBodyRVAD1 = new FrameBodyRVAD((ByteBuffer)stringBuilder, paramInt);
            frameBodyRVAD = frameBodyRVAD1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyRVAD.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyRVAD.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyRVAD;
          } 
          break;
        case 2527573:
          if (frameBodyRVAD.equals("RVA2")) {
            FrameBodyRVA2 frameBodyRVA21 = new FrameBodyRVA2((ByteBuffer)stringBuilder, paramInt);
            frameBodyRVA2 = frameBodyRVA21;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyRVA2.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyRVA2.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyRVA2;
          } 
          break;
        case 2508993:
          if (frameBodyRVA2.equals("RBUF")) {
            FrameBodyRBUF frameBodyRBUF1 = new FrameBodyRBUF((ByteBuffer)stringBuilder, paramInt);
            frameBodyRBUF = frameBodyRBUF1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyRBUF.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyRBUF.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyRBUF;
          } 
          break;
        case 2464431:
          if (frameBodyRBUF.equals("PRIV")) {
            FrameBodyPRIV frameBodyPRIV1 = new FrameBodyPRIV((ByteBuffer)stringBuilder, paramInt);
            frameBodyPRIV = frameBodyPRIV1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyPRIV.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyPRIV.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyPRIV;
          } 
          break;
        case 2461855:
          if (frameBodyPRIV.equals("POSS")) {
            FrameBodyPOSS frameBodyPOSS1 = new FrameBodyPOSS((ByteBuffer)stringBuilder, paramInt);
            frameBodyPOSS = frameBodyPOSS1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyPOSS.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyPOSS.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyPOSS;
          } 
          break;
        case 2461756:
          if (frameBodyPOSS.equals("POPM")) {
            FrameBodyPOPM frameBodyPOPM1 = new FrameBodyPOPM((ByteBuffer)stringBuilder, paramInt);
            frameBodyPOPM = frameBodyPOPM1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyPOPM.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyPOPM.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyPOPM;
          } 
          break;
        case 2450169:
          if (frameBodyPOPM.equals("PCNT")) {
            FrameBodyPCNT frameBodyPCNT1 = new FrameBodyPCNT((ByteBuffer)stringBuilder, paramInt);
            frameBodyPCNT = frameBodyPCNT1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyPCNT.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyPCNT.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyPCNT;
          } 
          break;
        case 2439583:
          if (frameBodyPCNT.equals(CKYHNesT.KdDRamMbETK)) {
            FrameBodyOWNE frameBodyOWNE1 = new FrameBodyOWNE((ByteBuffer)stringBuilder, paramInt);
            frameBodyOWNE = frameBodyOWNE1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyOWNE.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyOWNE.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyOWNE;
          } 
          break;
        case 2379048:
          if (frameBodyOWNE.equals("MVNM")) {
            FrameBodyMVNM frameBodyMVNM1 = new FrameBodyMVNM((ByteBuffer)stringBuilder, paramInt);
            frameBodyMVNM = frameBodyMVNM1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyMVNM.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyMVNM.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyMVNM;
          } 
          break;
        case 2378894:
          if (frameBodyMVNM.equals("MVIN")) {
            FrameBodyMVIN frameBodyMVIN1 = new FrameBodyMVIN((ByteBuffer)stringBuilder, paramInt);
            frameBodyMVIN = frameBodyMVIN1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyMVIN.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyMVIN.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyMVIN;
          } 
          break;
        case 2360475:
          if (frameBodyMVIN.equals("MCDI")) {
            FrameBodyMCDI frameBodyMCDI1 = new FrameBodyMCDI((ByteBuffer)stringBuilder, paramInt);
            frameBodyMCDI = frameBodyMCDI1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyMCDI.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyMCDI.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyMCDI;
          } 
          break;
        case 2336762:
          if (frameBodyMCDI.equals("LINK")) {
            FrameBodyLINK frameBodyLINK1 = new FrameBodyLINK((ByteBuffer)stringBuilder, paramInt);
            frameBodyLINK = frameBodyLINK1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyLINK.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyLINK.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyLINK;
          } 
          break;
        case 2254062:
          if (frameBodyLINK.equals("IPLS")) {
            FrameBodyIPLS frameBodyIPLS1 = new FrameBodyIPLS((ByteBuffer)stringBuilder, paramInt);
            frameBodyIPLS = frameBodyIPLS1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyIPLS.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyIPLS.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyIPLS;
          } 
          break;
        case 2196492:
          if (frameBodyIPLS.equals("GRP1")) {
            FrameBodyGRP1 frameBodyGRP11 = new FrameBodyGRP1((ByteBuffer)stringBuilder, paramInt);
            frameBodyGRP1 = frameBodyGRP11;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyGRP1.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyGRP1.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyGRP1;
          } 
          break;
        case 2196294:
          if (frameBodyGRP1.equals("GRID")) {
            FrameBodyGRID frameBodyGRID1 = new FrameBodyGRID((ByteBuffer)stringBuilder, paramInt);
            frameBodyGRID = frameBodyGRID1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyGRID.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyGRID.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyGRID;
          } 
          break;
        case 2183985:
          if (frameBodyGRID.equals("GEOB")) {
            FrameBodyGEOB frameBodyGEOB1 = new FrameBodyGEOB((ByteBuffer)stringBuilder, paramInt);
            frameBodyGEOB = frameBodyGEOB1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyGEOB.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyGEOB.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyGEOB;
          } 
          break;
        case 2138459:
          if (frameBodyGEOB.equals("ETCO")) {
            FrameBodyETCO frameBodyETCO1 = new FrameBodyETCO((ByteBuffer)stringBuilder, paramInt);
            frameBodyETCO = frameBodyETCO1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyETCO.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyETCO.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyETCO;
          } 
          break;
        case 2136105:
          if (frameBodyETCO.equals("EQU2")) {
            FrameBodyEQU2 frameBodyEQU21 = new FrameBodyEQU2((ByteBuffer)stringBuilder, paramInt);
            frameBodyEQU2 = frameBodyEQU21;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyEQU2.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyEQU2.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyEQU2;
          } 
          break;
        case 2132696:
          if (frameBodyEQU2.equals("ENCR")) {
            FrameBodyENCR frameBodyENCR1 = new FrameBodyENCR((ByteBuffer)stringBuilder, paramInt);
            frameBodyENCR = frameBodyENCR1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyENCR.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyENCR.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyENCR;
          } 
          break;
        case 2079237:
          if (frameBodyENCR.equals("CTOC")) {
            FrameBodyCTOC frameBodyCTOC1 = new FrameBodyCTOC((ByteBuffer)stringBuilder, paramInt);
            frameBodyCTOC = frameBodyCTOC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyCTOC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyCTOC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyCTOC;
          } 
          break;
        case 2074385:
          if (frameBodyCTOC.equals("COMR")) {
            FrameBodyCOMR frameBodyCOMR1 = new FrameBodyCOMR((ByteBuffer)stringBuilder, paramInt);
            frameBodyCOMR = frameBodyCOMR1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyCOMR.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyCOMR.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyCOMR;
          } 
          break;
        case 2074380:
          if (frameBodyCOMR.equals("COMM")) {
            FrameBodyCOMM frameBodyCOMM1 = new FrameBodyCOMM((ByteBuffer)stringBuilder, paramInt);
            frameBodyCOMM = frameBodyCOMM1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyCOMM.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyCOMM.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyCOMM;
          } 
          break;
        case 2067284:
          if (frameBodyCOMM.equals("CHAP")) {
            FrameBodyCHAP frameBodyCHAP1 = new FrameBodyCHAP((ByteBuffer)stringBuilder, paramInt);
            frameBodyCHAP = frameBodyCHAP1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyCHAP.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyCHAP.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyCHAP;
          } 
          break;
        case 2018731:
          if (frameBodyCHAP.equals("ASPI")) {
            FrameBodyASPI frameBodyASPI1 = new FrameBodyASPI((ByteBuffer)stringBuilder, paramInt);
            frameBodyASPI = frameBodyASPI1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyASPI.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyASPI.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyASPI;
          } 
          break;
        case 2015625:
          if (frameBodyASPI.equals("APIC")) {
            FrameBodyAPIC frameBodyAPIC1 = new FrameBodyAPIC((ByteBuffer)stringBuilder, paramInt);
            frameBodyAPIC = frameBodyAPIC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyAPIC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyAPIC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyAPIC;
          } 
          break;
        case 2005209:
          if (frameBodyAPIC.equals("AENC")) {
            FrameBodyAENC frameBodyAENC1 = new FrameBodyAENC((ByteBuffer)stringBuilder, paramInt);
            frameBodyAENC = frameBodyAENC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyAENC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyAENC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyAENC;
          } 
          break;
        case 79210:
          if (frameBodyAENC.equals("PIC")) {
            FrameBodyPIC frameBodyPIC1 = new FrameBodyPIC((ByteBuffer)stringBuilder, paramInt);
            frameBodyPIC = frameBodyPIC1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyPIC.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyPIC.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyPIC;
          } 
          break;
        case 67006:
          if (frameBodyPIC.equals("CRM")) {
            FrameBodyCRM frameBodyCRM1 = new FrameBodyCRM((ByteBuffer)stringBuilder, paramInt);
            frameBodyCRM = frameBodyCRM1;
            Logger logger1 = AbstractTagItem.logger;
            stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Created framebody:end");
            stringBuilder.append(frameBodyCRM.getIdentifier());
            logger1.finest(stringBuilder.toString());
            frameBodyCRM.setHeader(this);
            return (AbstractID3v2FrameBody)frameBodyCRM;
          } 
          break;
      } 
      AbstractID3v2FrameBody abstractID3v2FrameBody2 = Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody".concat((String)frameBodyCRM)).getConstructor(new Class[] { Class.forName("java.nio.ByteBuffer"), int.class }).newInstance(new Object[] { stringBuilder, Integer.valueOf(paramInt) });
      AbstractID3v2FrameBody abstractID3v2FrameBody1 = abstractID3v2FrameBody2;
      Logger logger = AbstractTagItem.logger;
      stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":Created framebody:end");
      stringBuilder.append(abstractID3v2FrameBody1.getIdentifier());
      logger.finest(stringBuilder.toString());
      abstractID3v2FrameBody1.setHeader(this);
      return abstractID3v2FrameBody1;
    } catch (InvalidTagException null) {
      throw new InvalidFrameException(invalidTagException.getMessage());
    } catch (ClassNotFoundException classNotFoundException) {
      Logger logger = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":Identifier not recognised:");
      stringBuilder1.append((String)invalidTagException);
      stringBuilder1.append(" using FrameBodyUnsupported");
      logger.config(stringBuilder1.toString());
      try {
        FrameBodyUnsupported frameBodyUnsupported = new FrameBodyUnsupported((ByteBuffer)stringBuilder, paramInt);
        Logger logger1 = AbstractTagItem.logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Created framebody:end");
        stringBuilder.append(frameBodyUnsupported.getIdentifier());
        logger1.finest(stringBuilder.toString());
        frameBodyUnsupported.setHeader(this);
        return (AbstractID3v2FrameBody)frameBodyUnsupported;
      } catch (InvalidFrameException invalidFrameException) {
        throw invalidFrameException;
      } catch (InvalidTagException invalidTagException) {
        throw new InvalidFrameException(invalidTagException.getMessage());
      } 
    } catch (InvocationTargetException invocationTargetException) {
      Logger logger = AbstractTagItem.logger;
      stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":An error occurred within abstractID3v2FrameBody for identifier:");
      stringBuilder.append((String)invalidTagException);
      stringBuilder.append(":");
      stringBuilder.append(invocationTargetException.getCause().getMessage());
      logger.severe(stringBuilder.toString());
      if (!(invocationTargetException.getCause() instanceof Error)) {
        if (!(invocationTargetException.getCause() instanceof RuntimeException)) {
          if (!(invocationTargetException.getCause() instanceof InvalidFrameException)) {
            if (invocationTargetException.getCause() instanceof InvalidDataTypeException)
              throw (InvalidDataTypeException)invocationTargetException.getCause(); 
            throw new InvalidFrameException(invocationTargetException.getCause().getMessage());
          } 
          throw (InvalidFrameException)invocationTargetException.getCause();
        } 
        throw (RuntimeException)invocationTargetException.getCause();
      } 
      throw (Error)invocationTargetException.getCause();
    } catch (NoSuchMethodException noSuchMethodException) {
      Logger logger = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":No such method:");
      stringBuilder1.append(noSuchMethodException.getMessage());
      logger.log(level, stringBuilder1.toString(), noSuchMethodException);
      l0.f(noSuchMethodException.getMessage());
      return null;
    } catch (InstantiationException instantiationException) {
      Logger logger = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":Instantiation exception:");
      stringBuilder.append(instantiationException.getMessage());
      logger.log(level, stringBuilder.toString(), instantiationException);
      l0.f(instantiationException.getMessage());
      return null;
    } catch (IllegalAccessException illegalAccessException) {
      Logger logger = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":Illegal access exception :");
      stringBuilder.append(illegalAccessException.getMessage());
      logger.log(level, stringBuilder.toString(), illegalAccessException);
      l0.f(illegalAccessException.getMessage());
      return null;
    } 
  }
  
  public AbstractID3v2FrameBody readBody(String paramString, AbstractID3v2FrameBody paramAbstractID3v2FrameBody) {
    StringBuilder stringBuilder;
    Logger logger;
    String str = zpEN.vnChgLBM;
    try {
      StringBuilder stringBuilder1 = new StringBuilder();
      this("org.jaudiotagger.tag.id3.framebody.FrameBody");
      stringBuilder1.append(paramString);
      AbstractID3v2FrameBody abstractID3v2FrameBody = Class.forName(stringBuilder1.toString()).getConstructor(new Class[] { paramAbstractID3v2FrameBody.getClass() }).newInstance(new Object[] { paramAbstractID3v2FrameBody });
      logger = AbstractTagItem.logger;
      stringBuilder = new StringBuilder("frame Body created");
      stringBuilder.append(abstractID3v2FrameBody.getIdentifier());
      logger.finer(stringBuilder.toString());
      abstractID3v2FrameBody.setHeader(this);
      return abstractID3v2FrameBody;
    } catch (ClassNotFoundException classNotFoundException) {
      logger = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("Identifier not recognised:");
      stringBuilder1.append((String)stringBuilder);
      stringBuilder1.append(" unable to create framebody");
      logger.config(stringBuilder1.toString());
      throw new InvalidFrameException(x41.w(str, stringBuilder, " does not exist"));
    } catch (NoSuchMethodException noSuchMethodException) {
      Logger logger1 = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder1 = new StringBuilder("No such method:");
      stringBuilder1.append(noSuchMethodException.getMessage());
      logger1.log(level, stringBuilder1.toString(), noSuchMethodException);
      stringBuilder = x41.q(str, (String)stringBuilder, " does not have a constructor that takes:");
      stringBuilder.append(logger.getClass().getName());
      throw new InvalidFrameException(stringBuilder.toString());
    } catch (InvocationTargetException invocationTargetException) {
      AbstractTagItem.logger.severe(XUaAMlaMSa.tlVwaVJiDm);
      Logger logger1 = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder1 = new StringBuilder(ybWnIKHovcRr.EpruXOTWXDJd);
      stringBuilder1.append(invocationTargetException.getCause().getMessage());
      logger1.log(level, stringBuilder1.toString(), invocationTargetException.getCause());
      if (!(invocationTargetException.getCause() instanceof Error)) {
        if (invocationTargetException.getCause() instanceof RuntimeException)
          throw (RuntimeException)invocationTargetException.getCause(); 
        throw new InvalidFrameException(invocationTargetException.getCause().getMessage());
      } 
      throw (Error)invocationTargetException.getCause();
    } catch (InstantiationException instantiationException) {
      Logger logger1 = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      stringBuilder = new StringBuilder("Instantiation exception:");
      stringBuilder.append(instantiationException.getMessage());
      logger1.log(level, stringBuilder.toString(), instantiationException);
      l0.f(instantiationException.getMessage());
      return null;
    } catch (IllegalAccessException illegalAccessException) {
      Logger logger1 = AbstractTagItem.logger;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder1 = new StringBuilder("Illegal access exception :");
      stringBuilder1.append(illegalAccessException.getMessage());
      logger1.log(level, stringBuilder1.toString(), illegalAccessException);
      l0.f(illegalAccessException.getMessage());
      return null;
    } 
  }
  
  public AbstractID3v2FrameBody readEncryptedBody(String paramString, ByteBuffer paramByteBuffer, int paramInt) {
    try {
      FrameBodyEncrypted frameBodyEncrypted = new FrameBodyEncrypted();
      this(paramString, paramByteBuffer, paramInt);
      frameBodyEncrypted.setHeader(this);
      return (AbstractID3v2FrameBody)frameBodyEncrypted;
    } catch (InvalidTagException invalidTagException) {
      throw new InvalidDataTypeException(invalidTagException);
    } 
  }
  
  public String readIdentifier(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[getFrameIdSize()];
    if (getFrameIdSize() <= paramByteBuffer.remaining())
      paramByteBuffer.get(arrayOfByte, 0, getFrameIdSize()); 
    if (!isPadding(arrayOfByte)) {
      if (getFrameHeaderSize() - getFrameIdSize() <= paramByteBuffer.remaining()) {
        this.identifier = new String(arrayOfByte);
        Logger logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(getLoggingFilename());
        stringBuilder2.append(":Identifier is");
        stringBuilder2.append(this.identifier);
        logger1.fine(stringBuilder2.toString());
        return this.identifier;
      } 
      Logger logger = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":No space to find another frame:");
      logger.warning(stringBuilder1.toString());
      String str1 = getLoggingFilename();
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(":No space to find another frame");
      throw new InvalidFrameException(stringBuilder1.toString());
    } 
    String str = getLoggingFilename();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(":only padding found");
    throw new PaddingException(stringBuilder.toString());
  }
  
  public void setContent(String paramString) {
    throw new UnsupportedOperationException("Not implemented please use the generic tag methods for setting content");
  }
  
  public void setLoggingFilename(String paramString) {
    this.loggingFilename = paramString;
  }
  
  public abstract void write(ByteArrayOutputStream paramByteArrayOutputStream);
  
  public class EncodingFlags {
    protected static final String TYPE_FLAGS = "encodingFlags";
    
    protected byte flags;
    
    final AbstractID3v2Frame this$0;
    
    public EncodingFlags() {
      resetFlags();
    }
    
    public EncodingFlags(byte param1Byte) {
      setFlags(param1Byte);
    }
    
    public void createStructure() {}
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof EncodingFlags))
        return false; 
      param1Object = param1Object;
      return (getFlags() == param1Object.getFlags());
    }
    
    public byte getFlags() {
      return this.flags;
    }
    
    public void resetFlags() {
      setFlags((byte)0);
    }
    
    public void setFlags(byte param1Byte) {
      this.flags = param1Byte;
    }
  }
  
  public class StatusFlags {
    protected static final String TYPE_FLAGS = "statusFlags";
    
    protected byte originalFlags;
    
    final AbstractID3v2Frame this$0;
    
    protected byte writeFlags;
    
    public void createStructure() {}
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof StatusFlags))
        return false; 
      param1Object = param1Object;
      return (getOriginalFlags() == param1Object.getOriginalFlags() && getWriteFlags() == param1Object.getWriteFlags());
    }
    
    public byte getOriginalFlags() {
      return this.originalFlags;
    }
    
    public byte getWriteFlags() {
      return this.writeFlags;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractID3v2Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */