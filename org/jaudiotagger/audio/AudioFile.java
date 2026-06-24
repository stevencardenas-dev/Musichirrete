package org.jaudiotagger.audio;

import c61;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.dsf.Dsf;
import org.jaudiotagger.audio.exceptions.NoReadPermissionsException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.generic.Permissions;
import org.jaudiotagger.audio.real.RealTag;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.aiff.AiffTag;
import org.jaudiotagger.tag.asf.AsfTag;
import org.jaudiotagger.tag.flac.FlacTag;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.AbstractTag;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;
import org.jaudiotagger.tag.mp4.Mp4Tag;
import org.jaudiotagger.tag.reference.ID3V2Version;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import org.jaudiotagger.tag.wav.WavTag;
import u00;
import uc1;
import x41;

public class AudioFile {
  public static Logger logger;
  
  protected AudioHeader audioHeader;
  
  protected String extension;
  
  protected u00 file;
  
  protected Tag tag;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public AudioFile() {}
  
  public AudioFile(u00 paramu00, AudioHeader paramAudioHeader, Tag paramTag) {
    this.file = paramu00;
    this.audioHeader = paramAudioHeader;
    this.tag = paramTag;
  }
  
  public static String getBaseFilename(u00 paramu00) {
    int i = paramu00.h().toLowerCase().lastIndexOf(".");
    return (i > 0) ? paramu00.h().substring(0, i) : paramu00.h();
  }
  
  public void checkFileExists(u00 paramu00) {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Reading file:path");
    stringBuilder.append(paramu00.j());
    logger.config(stringBuilder.toString());
    if (paramu00.f())
      return; 
    logger = logger;
    stringBuilder = new StringBuilder("Unable to find:");
    stringBuilder.append(paramu00.j());
    logger.severe(stringBuilder.toString());
    throw new FileNotFoundException(MessageFormat.format("Unable to find:{0}", new Object[] { paramu00.j() }));
  }
  
  public uc1 checkFilePermissions(u00 paramu00, boolean paramBoolean) {
    StringBuilder stringBuilder;
    c61 c61 = c61.a(paramu00);
    checkFileExists(paramu00);
    if (paramBoolean) {
      if (c61.a.a())
        return new uc1(paramu00, ybWnIKHovcRr.nbMnItcnTqyYd); 
      Logger logger = logger;
      stringBuilder = new StringBuilder("Unable to read file:");
      stringBuilder.append(c61);
      logger.severe(stringBuilder.toString());
      logger.severe(Permissions.displayPermissions(c61));
      throw new NoReadPermissionsException(MessageFormat.format("Unable to read file do not have permission to read: {0}", new Object[] { c61 }));
    } 
    if (!TagOptionSingleton.getInstance().isCheckIsWritable() || c61.a.b())
      return new uc1((u00)stringBuilder, "rw"); 
    logger.severe(Permissions.displayPermissions(c61));
    throw new ReadOnlyFileException(MessageFormat.format("Unable to write to:{0}", new Object[] { c61 }));
  }
  
  public void commit() {
    AudioFileIO.write(this);
  }
  
  public AbstractID3v2Tag convertID3Tag(AbstractID3v2Tag paramAbstractID3v2Tag, ID3V2Version paramID3V2Version) {
    if (paramAbstractID3v2Tag instanceof ID3v24Tag) {
      int i = null.$SwitchMap$org$jaudiotagger$tag$reference$ID3V2Version[paramID3V2Version.ordinal()];
      if (i != 1) {
        if (i == 2)
          return (AbstractID3v2Tag)new ID3v23Tag((AbstractTag)paramAbstractID3v2Tag); 
      } else {
        return (AbstractID3v2Tag)new ID3v22Tag((AbstractTag)paramAbstractID3v2Tag);
      } 
    } else if (paramAbstractID3v2Tag instanceof ID3v23Tag) {
      int i = null.$SwitchMap$org$jaudiotagger$tag$reference$ID3V2Version[paramID3V2Version.ordinal()];
      if (i != 1) {
        if (i == 3)
          return (AbstractID3v2Tag)new ID3v24Tag((AbstractTag)paramAbstractID3v2Tag); 
      } else {
        return (AbstractID3v2Tag)new ID3v22Tag((AbstractTag)paramAbstractID3v2Tag);
      } 
    } else if (paramAbstractID3v2Tag instanceof ID3v22Tag) {
      int i = null.$SwitchMap$org$jaudiotagger$tag$reference$ID3V2Version[paramID3V2Version.ordinal()];
      if (i != 2) {
        if (i == 3)
          return (AbstractID3v2Tag)new ID3v24Tag((AbstractTag)paramAbstractID3v2Tag); 
      } else {
        return (AbstractID3v2Tag)new ID3v23Tag((AbstractTag)paramAbstractID3v2Tag);
      } 
    } 
    return null;
  }
  
  public Tag createDefaultTag() {
    String str2 = getExt();
    String str1 = str2;
    if (str2 == null) {
      str1 = this.file.h();
      str1 = str1.substring(str1.lastIndexOf('.') + 1);
      setExt(str1);
    } 
    if (SupportedFileFormat.FLAC.getFilesuffix().equals(str1))
      return (Tag)new FlacTag(VorbisCommentTag.createNewTag(), new ArrayList()); 
    if (SupportedFileFormat.OGG.getFilesuffix().equals(str1))
      return (Tag)VorbisCommentTag.createNewTag(); 
    if (SupportedFileFormat.OGA.getFilesuffix().equals(str1))
      return (Tag)VorbisCommentTag.createNewTag(); 
    if (SupportedFileFormat.MP4.getFilesuffix().equals(str1))
      return (Tag)new Mp4Tag(); 
    if (SupportedFileFormat.M4A.getFilesuffix().equals(str1))
      return (Tag)new Mp4Tag(); 
    if (SupportedFileFormat.M4P.getFilesuffix().equals(str1))
      return (Tag)new Mp4Tag(); 
    if (SupportedFileFormat.WMA.getFilesuffix().equals(str1))
      return (Tag)new AsfTag(); 
    if (SupportedFileFormat.WAV.getFilesuffix().equals(str1))
      return (Tag)new WavTag(TagOptionSingleton.getInstance().getWavOptions()); 
    if (SupportedFileFormat.RA.getFilesuffix().equals(str1))
      return (Tag)new RealTag(); 
    if (SupportedFileFormat.RM.getFilesuffix().equals(str1))
      return (Tag)new RealTag(); 
    if (SupportedFileFormat.AIF.getFilesuffix().equals(str1))
      return (Tag)new AiffTag(); 
    if (SupportedFileFormat.AIFC.getFilesuffix().equals(str1))
      return (Tag)new AiffTag(); 
    if (SupportedFileFormat.AIFF.getFilesuffix().equals(str1))
      return (Tag)new AiffTag(); 
    if (SupportedFileFormat.DSF.getFilesuffix().equals(str1))
      return Dsf.createDefaultTag(); 
    l0.f("Unable to create default tag for this file format");
    return null;
  }
  
  public String displayStructureAsPlainText() {
    return "";
  }
  
  public String displayStructureAsXML() {
    return "";
  }
  
  public AudioHeader getAudioHeader() {
    return this.audioHeader;
  }
  
  public String getExt() {
    return this.extension;
  }
  
  public u00 getFile() {
    return this.file;
  }
  
  public Tag getTag() {
    return this.tag;
  }
  
  public Tag getTagAndConvertOrCreateAndSetDefault() {
    setTag(getTagAndConvertOrCreateDefault());
    return getTag();
  }
  
  public Tag getTagAndConvertOrCreateDefault() {
    Tag tag = getTagOrCreateDefault();
    if (tag instanceof AbstractID3v2Tag) {
      AbstractID3v2Tag abstractID3v2Tag = convertID3Tag((AbstractID3v2Tag)tag, TagOptionSingleton.getInstance().getID3V2Version());
      if (abstractID3v2Tag != null)
        return (Tag)abstractID3v2Tag; 
    } 
    return tag;
  }
  
  public Tag getTagOrCreateAndSetDefault() {
    Tag tag = getTagOrCreateDefault();
    setTag(tag);
    return tag;
  }
  
  public Tag getTagOrCreateDefault() {
    Tag tag = getTag();
    return (tag == null) ? createDefaultTag() : tag;
  }
  
  public void setExt(String paramString) {
    this.extension = paramString;
  }
  
  public void setFile(u00 paramu00) {
    this.file = paramu00;
  }
  
  public void setTag(Tag paramTag) {
    this.tag = paramTag;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder(oXrNDUqUkE.yBO);
    stringBuilder.append(getFile().j());
    stringBuilder.append("  --------\n");
    stringBuilder.append(this.audioHeader.toString());
    stringBuilder.append("\n");
    Tag tag = this.tag;
    if (tag == null) {
      str = "";
    } else {
      str = str.toString();
    } 
    return x41.n(stringBuilder, str, "\n-------------------");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\AudioFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */