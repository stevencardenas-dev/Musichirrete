package org.jaudiotagger.audio.mp3;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import c61;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import d71;
import h0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.logging.Logger;
import m60;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.NoWritePermissionsException;
import org.jaudiotagger.audio.exceptions.UnableToModifyFileException;
import org.jaudiotagger.audio.generic.Permissions;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.AbstractTag;
import org.jaudiotagger.tag.id3.ID3v11Tag;
import org.jaudiotagger.tag.id3.ID3v1Tag;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;
import org.jaudiotagger.tag.lyrics3.AbstractLyrics3;
import org.jaudiotagger.tag.reference.ID3V2Version;
import u00;
import uc1;
import wf2;
import ws2;
import x82;

public class MP3File extends AudioFile {
  public static final int LOAD_ALL = 14;
  
  public static final int LOAD_IDV1TAG = 2;
  
  public static final int LOAD_IDV2TAG = 4;
  
  public static final int LOAD_LYRICS3 = 8;
  
  private static final int MINIMUM_FILESIZE = 150;
  
  protected static h0 tagFormatter;
  
  private ID3v1Tag id3v1tag;
  
  private ID3v24Tag id3v2Asv24tag;
  
  private AbstractID3v2Tag id3v2tag;
  
  private AbstractLyrics3 lyrics3tag;
  
  public MP3File() {
    this.id3v2tag = null;
    this.id3v2Asv24tag = null;
    this.lyrics3tag = null;
    this.id3v1tag = null;
  }
  
  public MP3File(u00 paramu00, int paramInt, boolean paramBoolean) {
    AbstractID3v2Tag abstractID3v2Tag;
    MP3AudioHeader mP3AudioHeader = null;
    this.id3v2tag = null;
    this.id3v2Asv24tag = null;
    this.lyrics3tag = null;
    this.id3v1tag = null;
    try {
      this.file = paramu00;
      uc1 uc1 = checkFilePermissions(paramu00, paramBoolean);
      try {
        long l = AbstractID3v2Tag.getV2TagSizeIfExists(paramu00);
        AudioFile.logger.config("TagHeaderSize:".concat(wf2.f(l)));
        mP3AudioHeader = new MP3AudioHeader();
        this(paramu00, l);
        this.audioHeader = mP3AudioHeader;
        if (l != mP3AudioHeader.getMp3StartByte()) {
          Logger logger = AudioFile.logger;
          StringBuilder stringBuilder = new StringBuilder();
          this("First header found after tag:");
          stringBuilder.append(this.audioHeader);
          logger.config(stringBuilder.toString());
          this.audioHeader = checkAudioStart(l, (MP3AudioHeader)this.audioHeader);
        } 
      } finally {}
      readV1Tag(paramu00, uc1, paramInt);
      readV2Tag(paramu00, paramInt, (int)((MP3AudioHeader)this.audioHeader).getMp3StartByte());
      return;
    } finally {
      AbstractID3v2Tag abstractID3v2Tag1 = abstractID3v2Tag;
      if (abstractID3v2Tag1 != null)
        abstractID3v2Tag1.close(); 
    } 
  }
  
  private MP3AudioHeader checkAudioStart(long paramLong, MP3AudioHeader paramMP3AudioHeader) {
    AudioFile.logger.warning(MessageFormat.format(" {0}:Checking further because the ID3 Tag ends at {1} but the mp3 audio doesnt start until {2}", new Object[] { this.file.j(), wf2.f(paramLong), wf2.f(paramMP3AudioHeader.getMp3StartByte()) }));
    MP3AudioHeader mP3AudioHeader1 = new MP3AudioHeader(this.file, 0L);
    Logger logger = AudioFile.logger;
    StringBuilder stringBuilder = new StringBuilder("Checking from start:");
    stringBuilder.append(mP3AudioHeader1);
    logger.config(stringBuilder.toString());
    long l2 = paramMP3AudioHeader.getMp3StartByte();
    long l1 = mP3AudioHeader1.getMp3StartByte();
    u00 u002 = this.file;
    if (l2 == l1) {
      AudioFile.logger.config(MessageFormat.format("{0}: Confirmed audio starts at {1} whether searching from start or from end of ID3 tag", new Object[] { u002.j(), wf2.f(mP3AudioHeader1.getMp3StartByte()) }));
      return paramMP3AudioHeader;
    } 
    AudioFile.logger.config(MessageFormat.format("{0}: Recalculated possible start of the audio to be at {1}", new Object[] { u002.j(), wf2.f(mP3AudioHeader1.getMp3StartByte()) }));
    if (paramMP3AudioHeader.getNumberOfFrames() == mP3AudioHeader1.getNumberOfFrames()) {
      AudioFile.logger.warning(MessageFormat.format("{0}: Recalculated the start of the audio to be at {1}", new Object[] { this.file.j(), wf2.f(mP3AudioHeader1.getMp3StartByte()) }));
      return mP3AudioHeader1;
    } 
    if (isFilePortionNull((int)paramLong, (int)paramMP3AudioHeader.getMp3StartByte()))
      return paramMP3AudioHeader; 
    MP3AudioHeader mP3AudioHeader2 = new MP3AudioHeader(this.file, mP3AudioHeader1.getMp3StartByte() + mP3AudioHeader1.mp3FrameHeader.getFrameLength());
    if (mP3AudioHeader2.getMp3StartByte() == paramMP3AudioHeader.getMp3StartByte()) {
      AudioFile.logger.warning(MessageFormat.format("{0}: Confirmed audio starts at {1} whether searching from start or from end of ID3 tag", new Object[] { this.file.j(), wf2.f(paramMP3AudioHeader.getMp3StartByte()) }));
      return paramMP3AudioHeader;
    } 
    l1 = mP3AudioHeader2.getNumberOfFrames();
    paramLong = mP3AudioHeader1.getNumberOfFrames();
    u00 u001 = this.file;
    if (l1 == paramLong) {
      AudioFile.logger.warning(MessageFormat.format("{0}: Recalculated the start of the audio to be at {1}", new Object[] { u001.j(), wf2.f(mP3AudioHeader1.getMp3StartByte()) }));
      return mP3AudioHeader1;
    } 
    AudioFile.logger.warning(MessageFormat.format("{0}: Recalculated the start of the audio to be at {1}", new Object[] { u001.j(), wf2.f(paramMP3AudioHeader.getMp3StartByte()) }));
    return paramMP3AudioHeader;
  }
  
  private static void createPlainTextStructureFormatter() {
    Object object = new Object();
    ((d71)object).b = new StringBuffer();
    ((d71)object).c = new StringBuffer();
    tagFormatter = (h0)object;
  }
  
  private static void createXMLStructureFormatter() {
    Object object = new Object();
    ((x82)object).b = new StringBuffer();
    tagFormatter = (h0)object;
  }
  
  public static h0 getStructureFormatter() {
    return tagFormatter;
  }
  
  private boolean isFilePortionNull(int paramInt1, int paramInt2) {
    FileChannel fileChannel;
    FileInputStream fileInputStream;
    Logger logger = AudioFile.logger;
    StringBuilder stringBuilder = new StringBuilder("Checking file portion:");
    stringBuilder.append(wf2.e(paramInt1));
    stringBuilder.append(":");
    stringBuilder.append(wf2.e(paramInt2));
    logger.config(stringBuilder.toString());
    logger = null;
    stringBuilder = null;
    try {
      fileInputStream = ws2.n(this.file);
      StringBuilder stringBuilder1 = stringBuilder;
    } finally {
      stringBuilder = null;
    } 
    if (fileChannel != null)
      fileChannel.close(); 
    if (fileInputStream != null)
      fileInputStream.close(); 
    throw stringBuilder;
  }
  
  private static void mergeAKeyFromSrcToDest(FieldKey paramFieldKey, Tag paramTag1, Tag paramTag2) {
    try {
      if (TextUtils.isEmpty(paramTag2.getFirst(paramFieldKey))) {
        String str = paramTag1.getFirst(paramFieldKey);
        if (!TextUtils.isEmpty(str))
          paramTag2.setField(paramFieldKey, new String[] { str }); 
      } 
    } catch (KeyNotFoundException|org.jaudiotagger.tag.FieldDataInvalidException keyNotFoundException) {}
  }
  
  private void readV1Tag(u00 paramu00, uc1 paramuc1, int paramInt) {
    if ((paramInt & 0x2) != 0) {
      AudioFile.logger.finer("Attempting to read id3v1tags");
      try {
        ID3v11Tag iD3v11Tag = new ID3v11Tag();
        this(paramuc1, paramu00.h());
        this.id3v1tag = (ID3v1Tag)iD3v11Tag;
      } catch (TagNotFoundException tagNotFoundException) {
        AudioFile.logger.config("No ids3v11 tag found");
      } 
      try {
        if (this.id3v1tag == null) {
          ID3v1Tag iD3v1Tag = new ID3v1Tag();
          this(paramuc1, paramu00.h());
          this.id3v1tag = iD3v1Tag;
        } 
      } catch (TagNotFoundException tagNotFoundException) {
        AudioFile.logger.config("No id3v1 tag found");
      } 
    } 
  }
  
  private void readV2Tag(u00 paramu00, int paramInt1, int paramInt2) {
    if (paramInt2 >= 10) {
      AudioFile.logger.finer("Attempting to read id3v2tags");
      FileInputStream fileInputStream = ws2.n(paramu00);
      try {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(paramInt2);
        fileInputStream.getChannel().read(byteBuffer, 0L);
        byteBuffer.rewind();
        if ((paramInt1 & 0x4) != 0) {
          AudioFile.logger.config("Attempting to read id3v2tags");
          try {
            ID3v24Tag iD3v24Tag = new ID3v24Tag();
            this(byteBuffer, paramu00.h());
            setID3v2Tag((AbstractID3v2Tag)iD3v24Tag);
          } catch (TagNotFoundException tagNotFoundException) {
            AudioFile.logger.config("No id3v24 tag found");
          } 
          try {
            if (this.id3v2tag == null) {
              ID3v23Tag iD3v23Tag = new ID3v23Tag();
              this(byteBuffer, paramu00.h());
              setID3v2Tag((AbstractID3v2Tag)iD3v23Tag);
            } 
          } catch (TagNotFoundException tagNotFoundException) {
            AudioFile.logger.config("No id3v23 tag found");
          } 
          try {
            if (this.id3v2tag == null) {
              ID3v22Tag iD3v22Tag = new ID3v22Tag();
              this(byteBuffer, paramu00.h());
              setID3v2Tag((AbstractID3v2Tag)iD3v22Tag);
            } 
          } catch (TagNotFoundException tagNotFoundException) {
            AudioFile.logger.config("No id3v22 tag found");
          } 
        } 
      } finally {}
      fileInputStream.close();
      return;
    } 
    Logger logger = AudioFile.logger;
    StringBuilder stringBuilder = new StringBuilder("Not enough room for valid id3v2 tag:");
    stringBuilder.append(paramInt2);
    logger.config(stringBuilder.toString());
  }
  
  public void commit() {
    try {
      save();
      return;
    } catch (UnableToModifyFileException unableToModifyFileException) {
      throw new NoWritePermissionsException(unableToModifyFileException);
    } catch (IOException iOException) {
      throw new CannotWriteException(iOException);
    } catch (TagException tagException) {
      throw new CannotWriteException(tagException);
    } 
  }
  
  public Tag createDefaultTag() {
    return (Tag)((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V24) ? new ID3v24Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V23) ? new ID3v23Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V22) ? new ID3v22Tag() : new ID3v24Tag())));
  }
  
  public void delete(AbstractTag paramAbstractTag) {
    uc1 uc1 = new uc1(this.file, "rw");
    paramAbstractTag.delete(uc1);
    uc1.close();
    if (paramAbstractTag instanceof ID3v1Tag)
      this.id3v1tag = null; 
    if (paramAbstractTag instanceof AbstractID3v2Tag)
      this.id3v2tag = null; 
  }
  
  public String displayStructureAsPlainText() {
    createPlainTextStructureFormatter();
    tagFormatter.f("file", getFile().j().toString());
    if (getID3v1Tag() != null)
      getID3v1Tag().createStructure(); 
    if (getID3v2Tag() != null)
      getID3v2Tag().createStructure(); 
    tagFormatter.d("file");
    return tagFormatter.toString();
  }
  
  public String displayStructureAsXML() {
    createXMLStructureFormatter();
    tagFormatter.f("file", getFile().j().toString());
    if (getID3v1Tag() != null)
      getID3v1Tag().createStructure(); 
    if (getID3v2Tag() != null)
      getID3v2Tag().createStructure(); 
    tagFormatter.d("file");
    return tagFormatter.toString();
  }
  
  public u00 extractID3v2TagDataIntoFile(u00 paramu00) {
    int i = (int)((MP3AudioHeader)this.audioHeader).getMp3StartByte();
    if (i >= 0) {
      FileInputStream fileInputStream = ws2.n(this.file);
      FileChannel fileChannel = fileInputStream.getChannel();
      ByteBuffer byteBuffer = ByteBuffer.allocate(i);
      fileChannel.read(byteBuffer);
      FileOutputStream fileOutputStream = ws2.o(paramu00);
      fileOutputStream.write(byteBuffer.array());
      fileOutputStream.close();
      fileChannel.close();
      fileInputStream.close();
      return paramu00;
    } 
    throw new TagNotFoundException("There is no ID3v2Tag data in this file");
  }
  
  public byte[] getHash() {
    return getHash("MD5", 32768);
  }
  
  public byte[] getHash(int paramInt) {
    return getHash("MD5", paramInt);
  }
  
  public byte[] getHash(String paramString) {
    return getHash(paramString, 32768);
  }
  
  public byte[] getHash(String paramString, int paramInt) {
    u00 u00 = getFile();
    long l = getMP3StartByte(u00);
    if (hasID3v1Tag()) {
      i = getID3v1Tag().getSize();
    } else {
      i = 0;
    } 
    FileInputStream fileInputStream = ws2.n(u00);
    byte[] arrayOfByte = new byte[paramInt];
    MessageDigest messageDigest = MessageDigest.getInstance(paramString);
    fileInputStream.skip(l);
    l = u00.n() - l - i;
    int i;
    for (i = paramInt; i <= l; i += paramInt)
      messageDigest.update(arrayOfByte, 0, fileInputStream.read(arrayOfByte)); 
    messageDigest.update(arrayOfByte, 0, fileInputStream.read(arrayOfByte, 0, (int)l - i + paramInt));
    return messageDigest.digest();
  }
  
  public ID3v1Tag getID3v1Tag() {
    return this.id3v1tag;
  }
  
  public AbstractID3v2Tag getID3v2Tag() {
    return this.id3v2tag;
  }
  
  public ID3v24Tag getID3v2TagAsv24() {
    return this.id3v2Asv24tag;
  }
  
  public MP3AudioHeader getMP3AudioHeader() {
    return (MP3AudioHeader)getAudioHeader();
  }
  
  public long getMP3StartByte(u00 paramu00) {
    long l = AbstractID3v2Tag.getV2TagSizeIfExists(paramu00);
    MP3AudioHeader mP3AudioHeader2 = new MP3AudioHeader(paramu00, l);
    MP3AudioHeader mP3AudioHeader1 = mP3AudioHeader2;
    if (l != mP3AudioHeader2.getMp3StartByte()) {
      Logger logger = AudioFile.logger;
      StringBuilder stringBuilder = new StringBuilder(nFLlOYeP.WtHiXqzWcaypMQf);
      stringBuilder.append(mP3AudioHeader2);
      logger.config(stringBuilder.toString());
      mP3AudioHeader1 = checkAudioStart(l, mP3AudioHeader2);
    } 
    return mP3AudioHeader1.getMp3StartByte();
  }
  
  public Tag getTagAndConvertOrCreateAndSetDefault() {
    setTag(getTagAndConvertOrCreateDefault());
    return getTag();
  }
  
  public Tag getTagAndConvertOrCreateDefault() {
    Tag tag = getTagOrCreateDefault();
    AbstractID3v2Tag abstractID3v2Tag = convertID3Tag((AbstractID3v2Tag)tag, TagOptionSingleton.getInstance().getID3V2Version());
    return (Tag)((abstractID3v2Tag != null) ? abstractID3v2Tag : tag);
  }
  
  public Tag getTagOrCreateDefault() {
    AbstractID3v2Tag abstractID3v2Tag = getID3v2Tag();
    return (Tag)((abstractID3v2Tag == null) ? createDefaultTag() : abstractID3v2Tag);
  }
  
  public boolean hasID3v1Tag() {
    return (this.id3v1tag != null);
  }
  
  public boolean hasID3v2Tag() {
    return (this.id3v2tag != null);
  }
  
  public void precheck(u00 paramu00) {
    c61 c61 = c61.a(paramu00);
    if (paramu00.f()) {
      if (!TagOptionSingleton.getInstance().isCheckIsWritable() || c61.a.b()) {
        if (paramu00.n() > 150L)
          return; 
        AudioFile.logger.severe(MessageFormat.format("Cannot make changes to file {0} because too small to be an audio file", new Object[] { paramu00.h() }));
        m60.i(MessageFormat.format("Cannot make changes to file {0} because too small to be an audio file", new Object[] { paramu00.h() }));
        return;
      } 
      AudioFile.logger.severe(Permissions.displayPermissions(c61));
      AudioFile.logger.severe(MessageFormat.format("Cannot make changes to file {0}", new Object[] { paramu00.h() }));
      m60.i(MessageFormat.format("Cannot make changes to file {0}", new Object[] { paramu00.h() }));
      return;
    } 
    AudioFile.logger.severe(MessageFormat.format("Cannot make changes to file {0} because the file cannot be found", new Object[] { paramu00.h() }));
    m60.i(MessageFormat.format("Cannot make changes to file {0} because the file cannot be found", new Object[] { paramu00.h() }));
  }
  
  public void save() {
    save(this.file);
  }
  
  public void save(u00 paramu00) {
    String str = IGBYXeDFmKYajx.EXtUKG;
    Logger logger1 = AudioFile.logger;
    StringBuilder stringBuilder1 = new StringBuilder(oXrNDUqUkE.GOScetBTaGIVMI);
    stringBuilder1.append(paramu00.j());
    logger1.config(stringBuilder1.toString());
    precheck(paramu00);
    uc1 uc110 = null;
    uc1 uc12 = null;
    uc1 uc19 = null;
    Logger logger2 = null;
    StringBuilder stringBuilder2 = null;
    stringBuilder1 = stringBuilder2;
    uc1 uc14 = uc110;
    uc1 uc16 = uc12;
    uc1 uc18 = uc19;
    try {
      boolean bool = TagOptionSingleton.getInstance().isId3v2Save();
      logger1 = logger2;
      if (bool) {
        StringBuilder stringBuilder;
        Logger logger;
        stringBuilder1 = stringBuilder2;
        uc14 = uc110;
        uc16 = uc12;
        uc18 = uc19;
        if (this.id3v2tag == null) {
          stringBuilder1 = stringBuilder2;
          uc14 = uc110;
          uc16 = uc12;
          uc18 = uc19;
          uc1 uc112 = new uc1();
          stringBuilder1 = stringBuilder2;
          uc14 = uc110;
          uc16 = uc12;
          uc18 = uc19;
          this(paramu00, "rw");
          uc1 uc111 = uc112;
          uc18 = uc112;
          uc16 = uc112;
          uc14 = uc112;
          try {
            ID3v24Tag iD3v24Tag = new ID3v24Tag();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            this();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            iD3v24Tag.delete(uc112);
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            ID3v23Tag iD3v23Tag = new ID3v23Tag();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            this();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            iD3v23Tag.delete(uc112);
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            ID3v22Tag iD3v22Tag = new ID3v22Tag();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            this();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            iD3v22Tag.delete(uc112);
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            logger = AudioFile.logger;
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            stringBuilder = new StringBuilder();
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            this("Deleting ID3v2 tag:");
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            stringBuilder.append(paramu00.h());
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            logger.config(stringBuilder.toString());
            uc111 = uc112;
            uc18 = uc112;
            uc16 = uc112;
            uc14 = uc112;
            uc112.close();
          } catch (FileNotFoundException fileNotFoundException1) {
            uc18 = uc14;
            FileNotFoundException fileNotFoundException2 = fileNotFoundException1;
          } catch (IOException iOException1) {
            IOException iOException2 = iOException1;
          } catch (RuntimeException runtimeException) {
            uc14 = uc18;
            runtimeException2 = runtimeException;
          } finally {}
        } else {
          Logger logger3 = logger;
          uc14 = uc110;
          StringBuilder stringBuilder4 = stringBuilder;
          uc18 = uc19;
          Logger logger5 = AudioFile.logger;
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          StringBuilder stringBuilder3 = new StringBuilder();
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          this("Writing ID3v2 tag:");
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          stringBuilder3.append(paramu00.h());
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          logger5.config(stringBuilder3.toString());
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          MP3AudioHeader mP3AudioHeader = (MP3AudioHeader)getAudioHeader();
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          long l2 = mP3AudioHeader.getMp3StartByte();
          logger3 = logger;
          uc14 = uc110;
          stringBuilder4 = stringBuilder;
          uc18 = uc19;
          long l1 = this.id3v2tag.write(paramu00, l2);
          Logger logger4 = logger2;
          if (l2 != l1) {
            logger3 = logger;
            uc14 = uc110;
            stringBuilder4 = stringBuilder;
            uc18 = uc19;
            logger4 = AudioFile.logger;
            logger3 = logger;
            uc14 = uc110;
            stringBuilder4 = stringBuilder;
            uc18 = uc19;
            StringBuilder stringBuilder5 = new StringBuilder();
            logger3 = logger;
            uc14 = uc110;
            stringBuilder4 = stringBuilder;
            uc18 = uc19;
            this("New mp3 start byte: ");
            logger3 = logger;
            uc14 = uc110;
            stringBuilder4 = stringBuilder;
            uc18 = uc19;
            stringBuilder5.append(l1);
            logger3 = logger;
            uc14 = uc110;
            stringBuilder4 = stringBuilder;
            uc18 = uc19;
            logger4.config(stringBuilder5.toString());
            logger3 = logger;
            uc14 = uc110;
            stringBuilder4 = stringBuilder;
            uc18 = uc19;
            mP3AudioHeader.setMp3StartByte(l1);
            logger4 = logger2;
          } 
        } 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
    
    } catch (IOException iOException) {
    
    } catch (RuntimeException runtimeException) {
      runtimeException2 = runtimeException;
    } finally {}
    RuntimeException runtimeException1 = runtimeException2;
    RuntimeException runtimeException3 = runtimeException2;
    RuntimeException runtimeException4 = runtimeException2;
    RuntimeException runtimeException5 = runtimeException2;
    uc12 = new uc1();
    runtimeException1 = runtimeException2;
    runtimeException3 = runtimeException2;
    runtimeException4 = runtimeException2;
    runtimeException5 = runtimeException2;
    this(paramu00, "rw");
    RuntimeException runtimeException2;
    uc1 uc11 = uc12;
    uc1 uc17 = uc12;
    uc1 uc15 = uc12;
    uc1 uc13 = uc12;
    if (TagOptionSingleton.getInstance().isLyrics3Save()) {
      uc11 = uc12;
      uc17 = uc12;
      uc15 = uc12;
      uc13 = uc12;
      AbstractLyrics3 abstractLyrics3 = this.lyrics3tag;
      if (abstractLyrics3 != null) {
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        abstractLyrics3.write(uc12);
      } 
    } 
    uc11 = uc12;
    uc17 = uc12;
    uc15 = uc12;
    uc13 = uc12;
    if (TagOptionSingleton.getInstance().isId3v1Save()) {
      uc11 = uc12;
      uc17 = uc12;
      uc15 = uc12;
      uc13 = uc12;
      AudioFile.logger.config("Processing ID3v1");
      uc11 = uc12;
      uc17 = uc12;
      uc15 = uc12;
      uc13 = uc12;
      if (this.id3v1tag == null) {
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        AudioFile.logger.config("Deleting ID3v1");
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        ID3v1Tag iD3v1Tag = new ID3v1Tag();
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        this();
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        iD3v1Tag.delete(uc12);
      } else {
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        AudioFile.logger.config("Saving ID3v1");
        uc11 = uc12;
        uc17 = uc12;
        uc15 = uc12;
        uc13 = uc12;
        this.id3v1tag.write(uc12);
      } 
    } 
    uc12.close();
  }
  
  public void setID3v1Tag(Tag paramTag) {
    AudioFile.logger.config("setting tagv1:v1 tag");
    this.id3v1tag = (ID3v1Tag)paramTag;
  }
  
  public void setID3v1Tag(AbstractTag paramAbstractTag) {
    AudioFile.logger.config("setting tagv1:abstract");
    this.id3v1tag = (ID3v1Tag)new ID3v11Tag(paramAbstractTag);
  }
  
  public void setID3v1Tag(ID3v1Tag paramID3v1Tag) {
    AudioFile.logger.config(IGBYXeDFmKYajx.sBzE);
    this.id3v1tag = paramID3v1Tag;
  }
  
  public void setID3v2Tag(AbstractID3v2Tag paramAbstractID3v2Tag) {
    this.id3v2tag = paramAbstractID3v2Tag;
    if (paramAbstractID3v2Tag instanceof ID3v24Tag) {
      this.id3v2Asv24tag = (ID3v24Tag)paramAbstractID3v2Tag;
      return;
    } 
    this.id3v2Asv24tag = new ID3v24Tag((AbstractTag)paramAbstractID3v2Tag);
  }
  
  public void setID3v2Tag(AbstractTag paramAbstractTag) {
    this.id3v2tag = (AbstractID3v2Tag)new ID3v24Tag(paramAbstractTag);
  }
  
  public void setID3v2TagOnly(AbstractID3v2Tag paramAbstractID3v2Tag) {
    this.id3v2tag = paramAbstractID3v2Tag;
    this.id3v2Asv24tag = null;
  }
  
  public void setTag(Tag paramTag) {
    this.tag = paramTag;
    if (paramTag instanceof ID3v1Tag) {
      setID3v1Tag((ID3v1Tag)paramTag);
      return;
    } 
    setID3v2Tag((AbstractID3v2Tag)paramTag);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\MP3File.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */