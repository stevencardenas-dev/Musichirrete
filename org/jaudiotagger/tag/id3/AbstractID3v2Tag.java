package org.jaudiotagger.tag.id3;

import c61;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import in.krosbits.utils.SgV.YbNJ;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import m92;
import mk;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.exceptions.UnableToCreateFileException;
import org.jaudiotagger.audio.exceptions.UnableToModifyFileException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.Pair;
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyNumberTotal;
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyPairs;
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyTextInfo;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyIPLS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPOPM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIPL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTMCL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTXXX;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUFID;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUSLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWOAR;
import org.jaudiotagger.tag.id3.framebody.FrameBodyWXXX;
import org.jaudiotagger.tag.id3.valuepair.ID3NumberTotalFields;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import org.jaudiotagger.tag.reference.PictureTypes;
import tp;
import u00;
import uc1;
import ws2;
import x41;

public abstract class AbstractID3v2Tag extends AbstractID3Tag implements Tag {
  public static final int FIELD_TAGID_LENGTH = 3;
  
  public static final int FIELD_TAGID_POS = 0;
  
  public static final int FIELD_TAG_FLAG_LENGTH = 1;
  
  public static final int FIELD_TAG_FLAG_POS = 5;
  
  public static final int FIELD_TAG_MAJOR_VERSION_LENGTH = 1;
  
  public static final int FIELD_TAG_MAJOR_VERSION_POS = 3;
  
  public static final int FIELD_TAG_MINOR_VERSION_LENGTH = 1;
  
  public static final int FIELD_TAG_MINOR_VERSION_POS = 4;
  
  public static final int FIELD_TAG_SIZE_LENGTH = 4;
  
  public static final int FIELD_TAG_SIZE_POS = 6;
  
  public static final String TAGID = "ID3";
  
  public static final int TAG_HEADER_LENGTH = 10;
  
  public static final byte[] TAG_ID = new byte[] { 73, 68, 51 };
  
  protected static final int TAG_SIZE_INCREMENT = 100;
  
  protected static final String TYPE_BODY = "body";
  
  protected static final String TYPE_DUPLICATEBYTES = "duplicateBytes";
  
  protected static final String TYPE_DUPLICATEFRAMEID = "duplicateFrameId";
  
  protected static final String TYPE_EMPTYFRAMEBYTES = "emptyFrameBytes";
  
  protected static final String TYPE_FILEREADSIZE = "fileReadSize";
  
  protected static final String TYPE_HEADER = "header";
  
  protected static final String TYPE_INVALIDFRAMES = "invalidFrames";
  
  protected int duplicateBytes = 0;
  
  protected String duplicateFrameId = "";
  
  protected int emptyFrameBytes = 0;
  
  protected Map<String, List<TagField>> encryptedFrameMap = null;
  
  private Long endLocationInFile = null;
  
  protected int fileReadSize = 0;
  
  protected Map<String, List<TagField>> frameMap = null;
  
  protected int invalidFrames = 0;
  
  private Long startLocationInFile = null;
  
  public AbstractID3v2Tag() {}
  
  public AbstractID3v2Tag(AbstractID3v2Tag paramAbstractID3v2Tag) {}
  
  private void addNewFrameOrAddField(List<TagField> paramList, Map<String, List<TagField>> paramMap, AbstractID3v2Frame paramAbstractID3v2Frame1, AbstractID3v2Frame paramAbstractID3v2Frame2) {
    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal1;
    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal2;
    ListIterator<AbstractID3v2Frame> listIterator;
    ArrayList<AbstractID3v2Frame> arrayList = new ArrayList();
    if (paramAbstractID3v2Frame1 != null) {
      arrayList.add(paramAbstractID3v2Frame1);
    } else {
      arrayList.addAll(paramList);
    } 
    if (paramAbstractID3v2Frame2.getBody() instanceof FrameBodyTXXX) {
      FrameBodyTXXX frameBodyTXXX = (FrameBodyTXXX)paramAbstractID3v2Frame2.getBody();
      listIterator = arrayList.listIterator();
      while (listIterator.hasNext()) {
        FrameBodyTXXX frameBodyTXXX1 = (FrameBodyTXXX)((AbstractID3v2Frame)listIterator.next()).getBody();
        if (frameBodyTXXX.getDescription().equals(frameBodyTXXX1.getDescription())) {
          frameBodyTXXX1.addTextValue(frameBodyTXXX.getText());
          return;
        } 
      } 
      addNewFrameToMap(paramList, paramMap, paramAbstractID3v2Frame1, paramAbstractID3v2Frame2);
      return;
    } 
    if (paramAbstractID3v2Frame2.getBody() instanceof FrameBodyWXXX) {
      FrameBodyWXXX frameBodyWXXX = (FrameBodyWXXX)paramAbstractID3v2Frame2.getBody();
      ListIterator<AbstractID3v2Frame> listIterator1 = listIterator.listIterator();
      while (listIterator1.hasNext()) {
        FrameBodyWXXX frameBodyWXXX1 = (FrameBodyWXXX)((AbstractID3v2Frame)listIterator1.next()).getBody();
        if (frameBodyWXXX.getDescription().equals(frameBodyWXXX1.getDescription())) {
          frameBodyWXXX1.addUrlLink(frameBodyWXXX.getUrlLink());
          return;
        } 
      } 
      addNewFrameToMap(paramList, paramMap, paramAbstractID3v2Frame1, paramAbstractID3v2Frame2);
      return;
    } 
    if (paramAbstractID3v2Frame2.getBody() instanceof AbstractFrameBodyTextInfo) {
      AbstractFrameBodyTextInfo abstractFrameBodyTextInfo = (AbstractFrameBodyTextInfo)paramAbstractID3v2Frame2.getBody();
      ((AbstractFrameBodyTextInfo)paramAbstractID3v2Frame1.getBody()).addTextValue(abstractFrameBodyTextInfo.getText());
      return;
    } 
    if (paramAbstractID3v2Frame2.getBody() instanceof AbstractFrameBodyPairs) {
      AbstractFrameBodyPairs abstractFrameBodyPairs = (AbstractFrameBodyPairs)paramAbstractID3v2Frame2.getBody();
      ((AbstractFrameBodyPairs)paramAbstractID3v2Frame1.getBody()).addPair(abstractFrameBodyPairs.getText());
      return;
    } 
    if (paramAbstractID3v2Frame2.getBody() instanceof AbstractFrameBodyNumberTotal) {
      abstractFrameBodyNumberTotal1 = (AbstractFrameBodyNumberTotal)paramAbstractID3v2Frame2.getBody();
      abstractFrameBodyNumberTotal2 = (AbstractFrameBodyNumberTotal)paramAbstractID3v2Frame1.getBody();
      if (abstractFrameBodyNumberTotal1.getNumber() != null && abstractFrameBodyNumberTotal1.getNumber().intValue() > 0)
        abstractFrameBodyNumberTotal2.setNumber(abstractFrameBodyNumberTotal1.getNumberAsText()); 
      if (abstractFrameBodyNumberTotal1.getTotal() != null && abstractFrameBodyNumberTotal1.getTotal().intValue() > 0)
        abstractFrameBodyNumberTotal2.setTotal(abstractFrameBodyNumberTotal1.getTotalAsText()); 
      return;
    } 
    addNewFrameToMap((List<TagField>)abstractFrameBodyNumberTotal1, (Map<String, List<TagField>>)abstractFrameBodyNumberTotal2, paramAbstractID3v2Frame1, paramAbstractID3v2Frame2);
  }
  
  private void addNewFrameToMap(List<TagField> paramList, Map<String, List<TagField>> paramMap, AbstractID3v2Frame paramAbstractID3v2Frame1, AbstractID3v2Frame paramAbstractID3v2Frame2) {
    if (paramList.size() == 0) {
      paramList.add(paramAbstractID3v2Frame1);
      paramList.add(paramAbstractID3v2Frame2);
      paramMap.put(paramAbstractID3v2Frame2.getId(), paramList);
      return;
    } 
    paramList.add(paramAbstractID3v2Frame2);
  }
  
  private boolean containsAggregatedFrame(Collection<TagField> paramCollection) {
    if (paramCollection != null) {
      Iterator<TagField> iterator = paramCollection.iterator();
      while (iterator.hasNext()) {
        if ((TagField)iterator.next() instanceof AggregatedFrame)
          return true; 
      } 
    } 
    return false;
  }
  
  private void deleteNumberTotalFrame(FrameAndSubId paramFrameAndSubId, FieldKey paramFieldKey1, FieldKey paramFieldKey2, boolean paramBoolean) {
    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal;
    Integer integer = Integer.valueOf(0);
    if (paramBoolean) {
      if (getFirst(paramFieldKey2).length() == 0) {
        doDeleteTagField(paramFrameAndSubId);
        return;
      } 
      List<TagField> list = getFrame(paramFrameAndSubId.getFrameId());
      if (list.size() > 0) {
        abstractFrameBodyNumberTotal = (AbstractFrameBodyNumberTotal)((AbstractID3v2Frame)list.get(0)).getBody();
        if (abstractFrameBodyNumberTotal.getTotal().intValue() == 0) {
          doDeleteTagField(paramFrameAndSubId);
          return;
        } 
        abstractFrameBodyNumberTotal.setNumber(integer);
        return;
      } 
    } else {
      if (getFirst((FieldKey)abstractFrameBodyNumberTotal).length() == 0) {
        doDeleteTagField(paramFrameAndSubId);
        return;
      } 
      for (TagField tagField : getFrame(paramFrameAndSubId.getFrameId())) {
        if (tagField instanceof AbstractID3v2Frame) {
          AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal1 = (AbstractFrameBodyNumberTotal)((AbstractID3v2Frame)tagField).getBody();
          if (abstractFrameBodyNumberTotal1.getNumber().intValue() == 0)
            doDeleteTagField(paramFrameAndSubId); 
          abstractFrameBodyNumberTotal1.setTotal(integer);
        } 
      } 
    } 
  }
  
  private String getTextValueForFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    return paramAbstractID3v2Frame.getBody().getUserFriendlyValue();
  }
  
  public static long getV2TagSizeIfExists(u00 paramu00) {
    byte[] arrayOfByte;
    ByteBuffer byteBuffer = null;
    u00 u001 = null;
    try {
      FileInputStream fileInputStream = ws2.n(paramu00);
      paramu00 = u001;
    } finally {
      paramu00 = null;
    } 
    if (arrayOfByte != null)
      arrayOfByte.close(); 
    if (u001 != null)
      u001.close(); 
    throw paramu00;
  }
  
  private static boolean isID3V2Header(FileChannel paramFileChannel) {
    long l = paramFileChannel.position();
    ByteBuffer byteBuffer = Utils.readFileDataIntoBufferBE(paramFileChannel, 3);
    paramFileChannel.position(l);
    return Utils.readThreeBytesAsChars(byteBuffer).equals("ID3");
  }
  
  private static boolean isID3V2Header(uc1 paramuc1) {
    long l = paramuc1.c();
    byte[] arrayOfByte = new byte[3];
    paramuc1.g(arrayOfByte);
    paramuc1.h(l);
    return !!Arrays.equals(arrayOfByte, TAG_ID);
  }
  
  public static boolean isId3Tag(FileChannel paramFileChannel) {
    if (!isID3V2Header(paramFileChannel))
      return false; 
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4);
    paramFileChannel.position(paramFileChannel.position() + 6L);
    paramFileChannel.read(byteBuffer);
    byteBuffer.flip();
    paramFileChannel.position((ID3SyncSafeInteger.bufferToValue(byteBuffer) + 10));
    return true;
  }
  
  public static boolean isId3Tag(uc1 paramuc1) {
    if (!isID3V2Header(paramuc1))
      return false; 
    byte[] arrayOfByte = new byte[4];
    paramuc1.h(paramuc1.c() + 6L);
    paramuc1.g(arrayOfByte);
    paramuc1.h((ID3SyncSafeInteger.bufferToValue(ByteBuffer.wrap(arrayOfByte)) + 10));
    return true;
  }
  
  private void writeFramesToBufferStream(Map<String, List<TagField>> paramMap, ByteArrayOutputStream paramByteArrayOutputStream) {
    TreeSet<String> treeSet = new TreeSet<String>(getPreferredFrameOrderComparator());
    treeSet.addAll(paramMap.keySet());
    Iterator<String> iterator = treeSet.iterator();
    while (iterator.hasNext()) {
      for (TagField tagField : paramMap.get(iterator.next())) {
        if (tagField instanceof AbstractID3v2Frame) {
          abstractID3v2Frame = (AbstractID3v2Frame)tagField;
          abstractID3v2Frame.setLoggingFilename(getLoggingFilename());
          abstractID3v2Frame.write(paramByteArrayOutputStream);
          continue;
        } 
        if (abstractID3v2Frame instanceof AggregatedFrame)
          for (AbstractID3v2Frame abstractID3v2Frame : ((AggregatedFrame)abstractID3v2Frame).getFrames()) {
            abstractID3v2Frame.setLoggingFilename(getLoggingFilename());
            abstractID3v2Frame.write(paramByteArrayOutputStream);
          }  
      } 
    } 
  }
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    addField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void addField(TagField paramTagField) {
    if (paramTagField == null)
      return; 
    boolean bool = paramTagField instanceof AbstractID3v2Frame;
    if (bool || paramTagField instanceof AggregatedFrame) {
      if (bool) {
        AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame)paramTagField;
        List<TagField> list = this.frameMap.get(paramTagField.getId());
        if (list == null) {
          list = new ArrayList();
          list.add(paramTagField);
          this.frameMap.put(paramTagField.getId(), list);
          return;
        } 
        if (list.size() == 1 && list.get(0) instanceof AbstractID3v2Frame) {
          addNewFrameOrAddField(list, this.frameMap, (AbstractID3v2Frame)list.get(0), abstractID3v2Frame);
          return;
        } 
        addNewFrameOrAddField(list, this.frameMap, null, abstractID3v2Frame);
        return;
      } 
      setTagField(paramTagField.getId(), paramTagField);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Field ");
    stringBuilder.append(paramTagField);
    stringBuilder.append(" is not of type AbstractID3v2Frame or AggregatedFrame");
    throw new FieldDataInvalidException(stringBuilder.toString());
  }
  
  public void addField(Artwork paramArtwork) {
    addField(createField(paramArtwork));
  }
  
  public abstract void addFrame(AbstractID3v2Frame paramAbstractID3v2Frame);
  
  public int calculateTagSize(int paramInt1, int paramInt2) {
    return TagOptionSingleton.getInstance().isId3v2PaddingWillShorten() ? paramInt1 : ((paramInt1 <= paramInt2) ? paramInt2 : (paramInt1 + 100));
  }
  
  public void combineFrames(AbstractID3v2Frame paramAbstractID3v2Frame, List<TagField> paramList) {
    paramList.add(paramAbstractID3v2Frame);
  }
  
  public abstract List<AbstractID3v2Frame> convertFrame(AbstractID3v2Frame paramAbstractID3v2Frame);
  
  public final void copyFrameIntoMap(String paramString, AbstractID3v2Frame paramAbstractID3v2Frame) {
    ArrayList<AbstractID3v2Frame> arrayList;
    StringBuilder stringBuilder;
    Logger logger;
    List<TagField> list = this.frameMap.get(paramAbstractID3v2Frame.getIdentifier());
    if (list == null) {
      arrayList = new ArrayList();
      arrayList.add(paramAbstractID3v2Frame);
      this.frameMap.put(paramAbstractID3v2Frame.getIdentifier(), arrayList);
      return;
    } 
    if (containsAggregatedFrame(list)) {
      logger = AbstractID3Tag.logger;
      stringBuilder = new StringBuilder("Duplicated Aggregate Frame, ignoring:");
      stringBuilder.append((String)arrayList);
      logger.severe(stringBuilder.toString());
      return;
    } 
    combineFrames((AbstractID3v2Frame)stringBuilder, (List<TagField>)logger);
  }
  
  public void copyFrames(AbstractID3v2Tag paramAbstractID3v2Tag) {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    for (String str : paramAbstractID3v2Tag.frameMap.keySet()) {
      for (TagField tagField : paramAbstractID3v2Tag.frameMap.get(str)) {
        if (tagField instanceof AbstractID3v2Frame) {
          addFrame((AbstractID3v2Frame)tagField);
          continue;
        } 
        if (tagField instanceof TyerTdatAggregatedFrame) {
          Iterator<AbstractID3v2Frame> iterator = ((TyerTdatAggregatedFrame)tagField).getFrames().iterator();
          while (iterator.hasNext())
            addFrame(iterator.next()); 
        } 
      } 
    } 
  }
  
  public void copyPrimitives(AbstractID3v2Tag paramAbstractID3v2Tag) {
    AbstractID3Tag.logger.config("Copying Primitives");
    this.duplicateFrameId = paramAbstractID3v2Tag.duplicateFrameId;
    this.duplicateBytes = paramAbstractID3v2Tag.duplicateBytes;
    this.emptyFrameBytes = paramAbstractID3v2Tag.emptyFrameBytes;
    this.fileReadSize = paramAbstractID3v2Tag.fileReadSize;
    this.invalidFrames = paramAbstractID3v2Tag.invalidFrames;
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return paramBoolean ? createField(FieldKey.IS_COMPILATION, new String[] { YbNJ.EyNkxXtUCe }) : createField(FieldKey.IS_COMPILATION, new String[] { "0" });
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramFieldKey != null) {
      if (paramVarArgs != null) {
        String str = paramVarArgs[0];
        if (str != null) {
          AbstractID3v2Frame abstractID3v2Frame;
          FrameAndSubId frameAndSubId = getFrameAndSubIdFromGenericKey(paramFieldKey);
          if (ID3NumberTotalFields.isNumber(paramFieldKey)) {
            abstractID3v2Frame = createFrame(frameAndSubId.getFrameId());
            ((AbstractFrameBodyNumberTotal)abstractID3v2Frame.getBody()).setNumber(str);
            return (TagField)abstractID3v2Frame;
          } 
          if (ID3NumberTotalFields.isTotal((FieldKey)abstractID3v2Frame)) {
            abstractID3v2Frame = createFrame(frameAndSubId.getFrameId());
            ((AbstractFrameBodyNumberTotal)abstractID3v2Frame.getBody()).setTotal(str);
            return (TagField)abstractID3v2Frame;
          } 
          return doCreateTagField(frameAndSubId, paramVarArgs);
        } 
      } 
      l0.l("Argument cannot be null");
      return null;
    } 
    l0.d();
    return null;
  }
  
  public abstract AbstractID3v2Frame createFrame(String paramString);
  
  public TagField createLinkedArtworkField(String paramString) {
    AbstractID3v2Frame abstractID3v2Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    if (abstractID3v2Frame.getBody() instanceof FrameBodyAPIC) {
      FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC)abstractID3v2Frame.getBody();
      frameBodyAPIC.setObjectValue("PictureData", paramString.getBytes(mk.b));
      frameBodyAPIC.setObjectValue("PictureType", PictureTypes.DEFAULT_ID);
      frameBodyAPIC.setObjectValue("MIMEType", "-->");
      frameBodyAPIC.setObjectValue("Description", "");
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyPIC) {
      FrameBodyPIC frameBodyPIC = (FrameBodyPIC)abstractID3v2Frame.getBody();
      frameBodyPIC.setObjectValue("PictureData", paramString.getBytes(mk.b));
      frameBodyPIC.setObjectValue("PictureType", PictureTypes.DEFAULT_ID);
      frameBodyPIC.setObjectValue(fXMDNeMWaILNVh.XQKgUIAdaUNK, "-->");
      frameBodyPIC.setObjectValue("Description", "");
    } 
    return (TagField)abstractID3v2Frame;
  }
  
  public void createStructure() {
    createStructureHeader();
    createStructureBody();
  }
  
  public void createStructureBody() {
    MP3File.getStructureFormatter().f("body", "");
    Iterator<List> iterator = this.frameMap.values().iterator();
    while (iterator.hasNext()) {
      for (TagField tagField : iterator.next()) {
        if (tagField instanceof AbstractID3v2Frame)
          ((AbstractID3v2Frame)tagField).createStructure(); 
      } 
    } 
    MP3File.getStructureFormatter().d("body");
  }
  
  public void createStructureHeader() {
    MP3File.getStructureFormatter().a("duplicateBytes", this.duplicateBytes);
    MP3File.getStructureFormatter().b("duplicateFrameId", this.duplicateFrameId);
    MP3File.getStructureFormatter().a("emptyFrameBytes", this.emptyFrameBytes);
    MP3File.getStructureFormatter().a("fileReadSize", this.fileReadSize);
    MP3File.getStructureFormatter().a("invalidFrames", this.invalidFrames);
  }
  
  public void delete(uc1 paramuc1) {
    byte[] arrayOfByte = new byte[3];
    FileChannel fileChannel = paramuc1.a();
    fileChannel.position();
    ByteBuffer byteBuffer = ByteBuffer.allocate(10);
    fileChannel.read(byteBuffer, 0L);
    byteBuffer.flip();
    if (seek(byteBuffer)) {
      paramuc1.h(0L);
      paramuc1.write(arrayOfByte);
    } 
  }
  
  public void deleteArtworkField() {
    deleteField(FieldKey.COVER_ART);
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    FrameAndSubId frameAndSubId = getFrameAndSubIdFromGenericKey(paramFieldKey);
    if (paramFieldKey != null) {
      switch (paramFieldKey) {
        default:
          doDeleteTagField(frameAndSubId);
          return;
        case null:
          deleteNumberTotalFrame(frameAndSubId, FieldKey.MOVEMENT_NO, FieldKey.MOVEMENT_TOTAL, false);
          return;
        case null:
          deleteNumberTotalFrame(frameAndSubId, FieldKey.MOVEMENT_NO, FieldKey.MOVEMENT_TOTAL, true);
          return;
        case null:
          deleteNumberTotalFrame(frameAndSubId, FieldKey.DISC_NO, FieldKey.DISC_TOTAL, false);
          return;
        case null:
          deleteNumberTotalFrame(frameAndSubId, FieldKey.DISC_NO, FieldKey.DISC_TOTAL, true);
          return;
        case null:
          deleteNumberTotalFrame(frameAndSubId, FieldKey.TRACK, FieldKey.TRACK_TOTAL, false);
          return;
        case null:
          break;
      } 
      deleteNumberTotalFrame(frameAndSubId, FieldKey.TRACK, FieldKey.TRACK_TOTAL, true);
      return;
    } 
    l0.d();
  }
  
  public TagField doCreateTagField(FrameAndSubId paramFrameAndSubId, String... paramVarArgs) {
    String str = paramVarArgs[0];
    AbstractID3v2Frame abstractID3v2Frame = createFrame(paramFrameAndSubId.getFrameId());
    if (abstractID3v2Frame.getBody() instanceof FrameBodyUFID) {
      ((FrameBodyUFID)abstractID3v2Frame.getBody()).setOwner(paramFrameAndSubId.getSubId());
      try {
        ((FrameBodyUFID)abstractID3v2Frame.getBody()).setUniqueIdentifier(str.getBytes("ISO-8859-1"));
        return (TagField)abstractID3v2Frame;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        l0.f("When encoding UFID charset ISO-8859-1 was deemed unsupported");
        return null;
      } 
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyTXXX) {
      ((FrameBodyTXXX)abstractID3v2Frame.getBody()).setDescription(unsupportedEncodingException.getSubId());
      ((FrameBodyTXXX)abstractID3v2Frame.getBody()).setText(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyWXXX) {
      ((FrameBodyWXXX)abstractID3v2Frame.getBody()).setDescription(unsupportedEncodingException.getSubId());
      ((FrameBodyWXXX)abstractID3v2Frame.getBody()).setUrlLink(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyCOMM) {
      if (unsupportedEncodingException.getSubId() != null) {
        ((FrameBodyCOMM)abstractID3v2Frame.getBody()).setDescription(unsupportedEncodingException.getSubId());
        if (((FrameBodyCOMM)abstractID3v2Frame.getBody()).isMediaMonkeyFrame())
          ((FrameBodyCOMM)abstractID3v2Frame.getBody()).setLanguage("XXX"); 
      } 
      ((FrameBodyCOMM)abstractID3v2Frame.getBody()).setText(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyUSLT) {
      ((FrameBodyUSLT)abstractID3v2Frame.getBody()).setDescription("");
      ((FrameBodyUSLT)abstractID3v2Frame.getBody()).setLyric(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyWOAR) {
      ((FrameBodyWOAR)abstractID3v2Frame.getBody()).setUrlLink(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof AbstractFrameBodyTextInfo) {
      ((AbstractFrameBodyTextInfo)abstractID3v2Frame.getBody()).setText(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyPOPM) {
      ((FrameBodyPOPM)abstractID3v2Frame.getBody()).parseString(str);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyIPLS) {
      if (unsupportedEncodingException.getSubId() != null) {
        ((FrameBodyIPLS)abstractID3v2Frame.getBody()).addPair(unsupportedEncodingException.getSubId(), str);
        return (TagField)abstractID3v2Frame;
      } 
      if (paramVarArgs.length >= 2) {
        ((FrameBodyIPLS)abstractID3v2Frame.getBody()).addPair(paramVarArgs[0], paramVarArgs[1]);
        return (TagField)abstractID3v2Frame;
      } 
      ((FrameBodyIPLS)abstractID3v2Frame.getBody()).addPair(paramVarArgs[0]);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyTIPL) {
      if (unsupportedEncodingException.getSubId() != null) {
        ((FrameBodyTIPL)abstractID3v2Frame.getBody()).addPair(unsupportedEncodingException.getSubId(), str);
        return (TagField)abstractID3v2Frame;
      } 
      if (paramVarArgs.length >= 2) {
        ((FrameBodyTIPL)abstractID3v2Frame.getBody()).addPair(paramVarArgs[0], paramVarArgs[1]);
        return (TagField)abstractID3v2Frame;
      } 
      ((FrameBodyTIPL)abstractID3v2Frame.getBody()).addPair(paramVarArgs[0]);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyTMCL) {
      if (paramVarArgs.length >= 2) {
        ((FrameBodyTMCL)abstractID3v2Frame.getBody()).addPair(paramVarArgs[0], paramVarArgs[1]);
        return (TagField)abstractID3v2Frame;
      } 
      ((FrameBodyTMCL)abstractID3v2Frame.getBody()).addPair(paramVarArgs[0]);
      return (TagField)abstractID3v2Frame;
    } 
    if (abstractID3v2Frame.getBody() instanceof FrameBodyAPIC || abstractID3v2Frame.getBody() instanceof FrameBodyPIC) {
      tp.j(xveccWbRzqx.jOekyfFxwa);
      return null;
    } 
    throw new FieldDataInvalidException(x41.o(new StringBuilder("Field with key of:"), unsupportedEncodingException.getFrameId(), ":does not accept cannot parse data:", str));
  }
  
  public void doDeleteTagField(FrameAndSubId paramFrameAndSubId) {
    if (paramFrameAndSubId.getSubId() != null) {
      List<TagField> list = getFields(paramFrameAndSubId.getFrameId());
      ListIterator<TagField> listIterator = list.listIterator();
      while (listIterator.hasNext()) {
        AbstractTagFrameBody abstractTagFrameBody = ((AbstractID3v2Frame)listIterator.next()).getBody();
        if (abstractTagFrameBody instanceof FrameBodyTXXX) {
          if (((FrameBodyTXXX)abstractTagFrameBody).getDescription().equals(paramFrameAndSubId.getSubId())) {
            if (list.size() == 1) {
              removeFrame(paramFrameAndSubId.getFrameId());
              continue;
            } 
            listIterator.remove();
          } 
          continue;
        } 
        if (abstractTagFrameBody instanceof FrameBodyCOMM) {
          if (((FrameBodyCOMM)abstractTagFrameBody).getDescription().equals(paramFrameAndSubId.getSubId())) {
            if (list.size() == 1) {
              removeFrame(paramFrameAndSubId.getFrameId());
              continue;
            } 
            listIterator.remove();
          } 
          continue;
        } 
        if (abstractTagFrameBody instanceof FrameBodyWXXX) {
          if (((FrameBodyWXXX)abstractTagFrameBody).getDescription().equals(paramFrameAndSubId.getSubId())) {
            if (list.size() == 1) {
              removeFrame(paramFrameAndSubId.getFrameId());
              continue;
            } 
            listIterator.remove();
          } 
          continue;
        } 
        if (abstractTagFrameBody instanceof FrameBodyUFID) {
          if (((FrameBodyUFID)abstractTagFrameBody).getOwner().equals(paramFrameAndSubId.getSubId())) {
            if (list.size() == 1) {
              removeFrame(paramFrameAndSubId.getFrameId());
              continue;
            } 
            listIterator.remove();
          } 
          continue;
        } 
        l0.h("Need to implement getFields(FieldKey genericKey) for:", abstractTagFrameBody.getClass());
        return;
      } 
    } else if (paramFrameAndSubId.getSubId() == null) {
      removeFrame(paramFrameAndSubId.getFrameId());
    } 
  }
  
  public String doGetValueAtIndex(FrameAndSubId paramFrameAndSubId, int paramInt) {
    List<String> list = doGetValues(paramFrameAndSubId);
    return (list.size() > paramInt) ? list.get(paramInt) : "";
  }
  
  public List<String> doGetValues(FrameAndSubId paramFrameAndSubId) {
    ArrayList<String> arrayList = new ArrayList();
    if (paramFrameAndSubId.getSubId() != null) {
      ListIterator<TagField> listIterator = getFields(paramFrameAndSubId.getFrameId()).listIterator();
      while (listIterator.hasNext()) {
        AbstractTagFrameBody abstractTagFrameBody = ((AbstractID3v2Frame)listIterator.next()).getBody();
        if (abstractTagFrameBody instanceof FrameBodyTXXX) {
          FrameBodyTXXX frameBodyTXXX = (FrameBodyTXXX)abstractTagFrameBody;
          if (frameBodyTXXX.getDescription().equals(paramFrameAndSubId.getSubId()))
            arrayList.addAll(frameBodyTXXX.getValues()); 
          continue;
        } 
        if (abstractTagFrameBody instanceof FrameBodyWXXX) {
          FrameBodyWXXX frameBodyWXXX = (FrameBodyWXXX)abstractTagFrameBody;
          if (frameBodyWXXX.getDescription().equals(paramFrameAndSubId.getSubId()))
            arrayList.addAll(frameBodyWXXX.getUrlLinks()); 
          continue;
        } 
        if (abstractTagFrameBody instanceof FrameBodyCOMM) {
          FrameBodyCOMM frameBodyCOMM = (FrameBodyCOMM)abstractTagFrameBody;
          if (frameBodyCOMM.getDescription().equals(paramFrameAndSubId.getSubId()))
            arrayList.addAll(frameBodyCOMM.getValues()); 
          continue;
        } 
        if (abstractTagFrameBody instanceof FrameBodyUFID) {
          FrameBodyUFID frameBodyUFID = (FrameBodyUFID)abstractTagFrameBody;
          if (frameBodyUFID.getOwner().equals(paramFrameAndSubId.getSubId()) && frameBodyUFID.getUniqueIdentifier() != null)
            arrayList.add(new String(frameBodyUFID.getUniqueIdentifier())); 
          continue;
        } 
        if (abstractTagFrameBody instanceof AbstractFrameBodyPairs) {
          for (Pair pair : ((AbstractFrameBodyPairs)abstractTagFrameBody).getPairing().getMapping()) {
            if (pair.getKey().equals(paramFrameAndSubId.getSubId()) && pair.getValue() != null)
              arrayList.add(pair.getValue()); 
          } 
          continue;
        } 
        Logger logger = AbstractID3Tag.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Need to implement getFields(FieldKey genericKey) for:");
        stringBuilder.append(paramFrameAndSubId);
        stringBuilder.append(abstractTagFrameBody.getClass());
        logger.severe(stringBuilder.toString());
      } 
    } else {
      ListIterator<TagField> listIterator;
      if (paramFrameAndSubId.getGenericKey() != null && paramFrameAndSubId.getGenericKey() == FieldKey.INVOLVEDPEOPLE) {
        listIterator = getFields(paramFrameAndSubId.getFrameId()).listIterator();
        while (listIterator.hasNext()) {
          AbstractTagFrameBody abstractTagFrameBody = ((AbstractID3v2Frame)listIterator.next()).getBody();
          if (abstractTagFrameBody instanceof AbstractFrameBodyPairs)
            for (Pair pair : ((AbstractFrameBodyPairs)abstractTagFrameBody).getPairing().getMapping()) {
              if (!pair.getValue().isEmpty()) {
                if (!pair.getKey().isEmpty()) {
                  arrayList.add(pair.getPairValue());
                  continue;
                } 
                arrayList.add(pair.getValue());
              } 
            }  
        } 
      } else {
        for (AbstractID3v2Frame abstractID3v2Frame : getFields(listIterator.getFrameId())) {
          if (abstractID3v2Frame != null) {
            if (abstractID3v2Frame.getBody() instanceof AbstractFrameBodyTextInfo) {
              arrayList.addAll(((AbstractFrameBodyTextInfo)abstractID3v2Frame.getBody()).getValues());
              continue;
            } 
            arrayList.add(getTextValueForFrame(abstractID3v2Frame));
          } 
        } 
      } 
    } 
    return arrayList;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof AbstractID3v2Tag))
      return false; 
    AbstractID3v2Tag abstractID3v2Tag = (AbstractID3v2Tag)paramObject;
    return (this.frameMap.equals(abstractID3v2Tag.frameMap) && super.equals(paramObject));
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    ArrayList<String> arrayList = new ArrayList();
    List<TagField> list = getFields(paramFieldKey);
    if (ID3NumberTotalFields.isNumber(paramFieldKey)) {
      if (list != null && list.size() > 0) {
        arrayList.add(((AbstractFrameBodyNumberTotal)((AbstractID3v2Frame)list.get(0)).getBody()).getNumberAsText());
        return arrayList;
      } 
    } else if (ID3NumberTotalFields.isTotal(paramFieldKey)) {
      if (list != null && list.size() > 0) {
        arrayList.add(((AbstractFrameBodyNumberTotal)((AbstractID3v2Frame)list.get(0)).getBody()).getTotalAsText());
        return arrayList;
      } 
    } else {
      if (paramFieldKey == FieldKey.RATING) {
        if (list != null && list.size() > 0)
          arrayList.add(String.valueOf(((FrameBodyPOPM)((AbstractID3v2Frame)list.get(0)).getBody()).getRating())); 
        return arrayList;
      } 
      return doGetValues(getFrameAndSubIdFromGenericKey(paramFieldKey));
    } 
    return arrayList;
  }
  
  public int getDuplicateBytes() {
    return this.duplicateBytes;
  }
  
  public String getDuplicateFrameId() {
    return this.duplicateFrameId;
  }
  
  public int getEmptyFrameBytes() {
    return this.emptyFrameBytes;
  }
  
  public List<TagField> getEncryptedFrame(String paramString) {
    return this.encryptedFrameMap.get(paramString);
  }
  
  public Long getEndLocationInFile() {
    return this.endLocationInFile;
  }
  
  public int getFieldCount() {
    Iterator<TagField> iterator = getFields();
    byte b = 0;
    try {
      while (true) {
        iterator.next();
        b++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      return b;
    } 
  }
  
  public int getFieldCountIncludingSubValues() {
    Iterator<TagField> iterator = getFields();
    int i = 0;
    try {
      while (true) {
        TagField tagField = iterator.next();
        if (tagField instanceof AbstractID3v2Frame) {
          AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame)tagField;
          if (abstractID3v2Frame.getBody() instanceof AbstractFrameBodyTextInfo && !(abstractID3v2Frame.getBody() instanceof FrameBodyTXXX)) {
            int j = ((AbstractFrameBodyTextInfo)abstractID3v2Frame.getBody()).getNumberOfValues();
            i += j;
            continue;
          } 
        } 
        i++;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      return i;
    } 
  }
  
  public Iterator<TagField> getFields() {
    ArrayList<TagField> arrayList = new ArrayList();
    Iterator<List> iterator = this.frameMap.values().iterator();
    while (iterator.hasNext())
      arrayList.addAll(iterator.next()); 
    return arrayList.iterator();
  }
  
  public List<TagField> getFields(String paramString) {
    List<TagField> list2 = getFrame(paramString);
    List<TagField> list1 = list2;
    if (list2 == null)
      list1 = new ArrayList<TagField>(); 
    return list1;
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      FrameAndSubId frameAndSubId = getFrameAndSubIdFromGenericKey(paramFieldKey);
      if (frameAndSubId != null) {
        Iterator<Pair> iterator;
        List<TagField> list = getFields(frameAndSubId.getFrameId());
        ArrayList<TagField> arrayList = new ArrayList();
        if (frameAndSubId.getSubId() != null) {
          for (TagField tagField : list) {
            AbstractTagFrameBody abstractTagFrameBody = ((AbstractID3v2Frame)tagField).getBody();
            if (abstractTagFrameBody instanceof FrameBodyTXXX) {
              if (((FrameBodyTXXX)abstractTagFrameBody).getDescription().equals(frameAndSubId.getSubId()))
                arrayList.add(tagField); 
              continue;
            } 
            if (abstractTagFrameBody instanceof FrameBodyWXXX) {
              if (((FrameBodyWXXX)abstractTagFrameBody).getDescription().equals(frameAndSubId.getSubId()))
                arrayList.add(tagField); 
              continue;
            } 
            if (abstractTagFrameBody instanceof FrameBodyCOMM) {
              if (((FrameBodyCOMM)abstractTagFrameBody).getDescription().equals(frameAndSubId.getSubId()))
                arrayList.add(tagField); 
              continue;
            } 
            if (abstractTagFrameBody instanceof FrameBodyUFID) {
              if (((FrameBodyUFID)abstractTagFrameBody).getOwner().equals(frameAndSubId.getSubId()))
                arrayList.add(tagField); 
              continue;
            } 
            if (abstractTagFrameBody instanceof FrameBodyIPLS) {
              iterator = ((FrameBodyIPLS)abstractTagFrameBody).getPairing().getMapping().iterator();
              while (iterator.hasNext()) {
                if (((Pair)iterator.next()).getKey().equals(frameAndSubId.getSubId()))
                  arrayList.add(tagField); 
              } 
              continue;
            } 
            if (iterator instanceof FrameBodyTIPL) {
              iterator = ((FrameBodyTIPL)iterator).getPairing().getMapping().iterator();
              while (iterator.hasNext()) {
                if (((Pair)iterator.next()).getKey().equals(frameAndSubId.getSubId()))
                  arrayList.add(tagField); 
              } 
              continue;
            } 
            Logger logger = AbstractID3Tag.logger;
            StringBuilder stringBuilder = new StringBuilder("Need to implement getFields(FieldKey genericKey) for:");
            stringBuilder.append(frameAndSubId);
            stringBuilder.append(iterator.getClass());
            logger.severe(stringBuilder.toString());
          } 
        } else {
          AbstractTagFrameBody abstractTagFrameBody;
          if (ID3NumberTotalFields.isNumber(paramFieldKey)) {
            for (TagField tagField : iterator) {
              abstractTagFrameBody = ((AbstractID3v2Frame)tagField).getBody();
              if (abstractTagFrameBody instanceof AbstractFrameBodyNumberTotal && ((AbstractFrameBodyNumberTotal)abstractTagFrameBody).getNumber() != null)
                arrayList.add(tagField); 
            } 
          } else {
            if (ID3NumberTotalFields.isTotal((FieldKey)abstractTagFrameBody)) {
              for (TagField tagField : iterator) {
                abstractTagFrameBody = ((AbstractID3v2Frame)tagField).getBody();
                if (abstractTagFrameBody instanceof AbstractFrameBodyNumberTotal && ((AbstractFrameBodyNumberTotal)abstractTagFrameBody).getTotal() != null)
                  arrayList.add(tagField); 
              } 
              return arrayList;
            } 
            return (List)iterator;
          } 
        } 
        return arrayList;
      } 
      l0.d();
      return null;
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public int getFileReadBytes() {
    return this.fileReadSize;
  }
  
  public String getFirst(String paramString) {
    AbstractID3v2Frame abstractID3v2Frame = getFirstField(paramString);
    return (abstractID3v2Frame == null) ? "" : getTextValueForFrame(abstractID3v2Frame);
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    try {
      return getValue(paramFieldKey, 0);
    } finally {
      paramFieldKey = null;
    } 
  }
  
  public Artwork getFirstArtwork() {
    List<Artwork> list = getArtworkList();
    return (list.size() > 0) ? list.get(0) : null;
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    List<TagField> list = getFields(paramFieldKey);
    return (list.size() > 0) ? list.get(0) : null;
  }
  
  public AbstractID3v2Frame getFirstField(String paramString) {
    List<TagField> list = getFrame(paramString);
    return (list == null || list.isEmpty() || containsAggregatedFrame(list)) ? null : (AbstractID3v2Frame)list.get(0);
  }
  
  public List<TagField> getFrame(String paramString) {
    return this.frameMap.get(paramString);
  }
  
  public abstract FrameAndSubId getFrameAndSubIdFromGenericKey(FieldKey paramFieldKey);
  
  public Iterator<Object> getFrameOfType(String paramString) {
    Iterator<String> iterator = this.frameMap.keySet().iterator();
    HashSet<Iterator> hashSet = new HashSet();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (str.startsWith(paramString)) {
        Iterator iterator1;
        str = (String)this.frameMap.get(str);
        if (str instanceof List) {
          iterator1 = ((List)str).iterator();
          while (iterator1.hasNext())
            hashSet.add(iterator1.next()); 
          continue;
        } 
        hashSet.add(iterator1);
      } 
    } 
    return hashSet.iterator();
  }
  
  public abstract ID3Frames getID3Frames();
  
  public int getInvalidFrames() {
    return this.invalidFrames;
  }
  
  public abstract Comparator<String> getPreferredFrameOrderComparator();
  
  public int getSize() {
    Iterator<List> iterator = this.frameMap.values().iterator();
    int i = 0;
    label23: while (iterator.hasNext()) {
      List list = iterator.next();
      if (list != null) {
        Iterator<TagField> iterator1 = list.iterator();
        int j = i;
        label21: while (true) {
          i = j;
          if (iterator1.hasNext()) {
            Iterator<AbstractID3v2Frame> iterator2;
            TagField tagField = iterator1.next();
            if (tagField instanceof AggregatedFrame) {
              iterator2 = ((AggregatedFrame)tagField).frames.iterator();
              i = j;
              while (true) {
                j = i;
                if (iterator2.hasNext()) {
                  i += ((AbstractID3v2Frame)iterator2.next()).getSize();
                  continue;
                } 
                continue label21;
              } 
              break;
            } 
            if (iterator2 instanceof AbstractID3v2Frame)
              j = ((AbstractID3v2Frame)iterator2).getSize() + j; 
            continue;
          } 
          continue label23;
        } 
      } 
    } 
    return i;
  }
  
  public Long getStartLocationInFile() {
    return this.startLocationInFile;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    if (paramFieldKey != null) {
      List<TagField> list;
      if (ID3NumberTotalFields.isNumber(paramFieldKey) || ID3NumberTotalFields.isTotal(paramFieldKey)) {
        List<TagField> list1 = getFields(paramFieldKey);
        if (list1 != null && list1.size() > 0) {
          AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame)list1.get(0);
          return ID3NumberTotalFields.isNumber(paramFieldKey) ? ((AbstractFrameBodyNumberTotal)abstractID3v2Frame.getBody()).getNumberAsText() : (ID3NumberTotalFields.isTotal(paramFieldKey) ? ((AbstractFrameBodyNumberTotal)abstractID3v2Frame.getBody()).getTotalAsText() : doGetValueAtIndex(getFrameAndSubIdFromGenericKey(paramFieldKey), paramInt));
        } 
        return "";
      } 
      if (paramFieldKey == FieldKey.RATING) {
        list = getFields(paramFieldKey);
        return (list != null && list.size() > paramInt) ? String.valueOf(((FrameBodyPOPM)((AbstractID3v2Frame)list.get(paramInt)).getBody()).getRating()) : "";
      } 
      return doGetValueAtIndex(getFrameAndSubIdFromGenericKey((FieldKey)list), paramInt);
    } 
    l0.d();
    return null;
  }
  
  public boolean hasCommonFields() {
    return true;
  }
  
  public boolean hasField(String paramString) {
    return hasFrame(paramString);
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    if (paramFieldKey != null)
      try {
        TagField tagField = getFirstField(paramFieldKey);
        return (tagField != null);
      } catch (KeyNotFoundException keyNotFoundException) {
        AbstractID3Tag.logger.log(Level.SEVERE, keyNotFoundException.getMessage(), (Throwable)keyNotFoundException);
        return false;
      }  
    l0.l("Argument cannot be null");
    return false;
  }
  
  public boolean hasFrame(String paramString) {
    return this.frameMap.containsKey(paramString);
  }
  
  public boolean hasFrameAndBody(String paramString) {
    if (hasFrame(paramString)) {
      List<TagField> list = getFrame(paramString);
      if (list.size() > 0) {
        TagField tagField = list.get(0);
        return (tagField instanceof AbstractID3v2Frame) ? (((AbstractID3v2Frame)tagField).getBody() instanceof org.jaudiotagger.tag.id3.framebody.FrameBodyUnsupported ^ true) : true;
      } 
    } 
    return false;
  }
  
  public boolean hasFrameOfType(String paramString) {
    Iterator<String> iterator = this.frameMap.keySet().iterator();
    boolean bool = false;
    while (iterator.hasNext() && !bool) {
      if (((String)iterator.next()).startsWith(paramString))
        bool = true; 
    } 
    return bool;
  }
  
  public boolean isEmpty() {
    return (this.frameMap.size() == 0);
  }
  
  public Iterator<List<TagField>> iterator() {
    return this.frameMap.values().iterator();
  }
  
  public void loadFrameIntoMap(String paramString, AbstractID3v2Frame paramAbstractID3v2Frame) {
    if (paramAbstractID3v2Frame.getBody() instanceof org.jaudiotagger.tag.id3.framebody.FrameBodyEncrypted) {
      loadFrameIntoSpecifiedMap(this.encryptedFrameMap, paramString, paramAbstractID3v2Frame);
      return;
    } 
    loadFrameIntoSpecifiedMap(this.frameMap, paramString, paramAbstractID3v2Frame);
  }
  
  public void loadFrameIntoSpecifiedMap(Map<String, List<TagField>> paramMap, String paramString, AbstractID3v2Frame paramAbstractID3v2Frame) {
    Logger logger1;
    if (ID3v24Frames.getInstanceOf().isMultipleAllowed(paramString) || ID3v23Frames.getInstanceOf().isMultipleAllowed(paramString) || ID3v22Frames.getInstanceOf().isMultipleAllowed(paramString)) {
      if (paramMap.containsKey(paramString)) {
        ((List<AbstractID3v2Frame>)paramMap.get(paramString)).add(paramAbstractID3v2Frame);
        return;
      } 
      Logger logger = AbstractID3Tag.logger;
      StringBuilder stringBuilder1 = new StringBuilder("Adding Multi FrameList(3)");
      stringBuilder1.append(paramString);
      logger.finer(stringBuilder1.toString());
      ArrayList<AbstractID3v2Frame> arrayList1 = new ArrayList();
      arrayList1.add(paramAbstractID3v2Frame);
      paramMap.put(paramString, arrayList1);
      return;
    } 
    if (paramMap.containsKey(paramString) && !((List)paramMap.get(paramString)).isEmpty()) {
      logger1 = AbstractID3Tag.logger;
      StringBuilder stringBuilder1 = new StringBuilder("Ignoring Duplicate Frame:");
      stringBuilder1.append(paramString);
      logger1.warning(stringBuilder1.toString());
      if (this.duplicateFrameId.length() > 0)
        this.duplicateFrameId = x41.n(new StringBuilder(), this.duplicateFrameId, ";"); 
      this.duplicateFrameId = x41.n(new StringBuilder(), this.duplicateFrameId, paramString);
      for (TagField tagField : this.frameMap.get(paramString)) {
        if (tagField instanceof AbstractID3v2Frame) {
          int i = this.duplicateBytes;
          this.duplicateBytes = ((AbstractID3v2Frame)tagField).getSize() + i;
        } 
      } 
      return;
    } 
    Logger logger2 = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder("Adding Frame");
    stringBuilder.append(paramString);
    logger2.finer(stringBuilder.toString());
    ArrayList<Logger> arrayList = new ArrayList();
    arrayList.add(logger1);
    tagField.put(paramString, arrayList);
  }
  
  public void mergeDuplicateFrames(AbstractID3v2Frame paramAbstractID3v2Frame) {
    AbstractFrameBodyPairs abstractFrameBodyPairs;
    List<TagField> list2 = this.frameMap.get(paramAbstractID3v2Frame.getId());
    List<TagField> list1 = list2;
    if (list2 == null)
      list1 = new ArrayList(); 
    ListIterator<TagField> listIterator = list1.listIterator();
    while (listIterator.hasNext()) {
      TagField tagField = listIterator.next();
      if (!(tagField instanceof AbstractID3v2Frame))
        continue; 
      AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame)tagField;
      if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyTXXX) {
        if (((FrameBodyTXXX)paramAbstractID3v2Frame.getBody()).getDescription().equals(((FrameBodyTXXX)abstractID3v2Frame.getBody()).getDescription())) {
          listIterator.set(paramAbstractID3v2Frame);
          this.frameMap.put(paramAbstractID3v2Frame.getId(), list1);
          return;
        } 
        continue;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyWXXX) {
        if (((FrameBodyWXXX)paramAbstractID3v2Frame.getBody()).getDescription().equals(((FrameBodyWXXX)abstractID3v2Frame.getBody()).getDescription())) {
          listIterator.set(paramAbstractID3v2Frame);
          this.frameMap.put(paramAbstractID3v2Frame.getId(), list1);
          return;
        } 
        continue;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyCOMM) {
        if (((FrameBodyCOMM)paramAbstractID3v2Frame.getBody()).getDescription().equals(((FrameBodyCOMM)abstractID3v2Frame.getBody()).getDescription())) {
          listIterator.set(paramAbstractID3v2Frame);
          this.frameMap.put(paramAbstractID3v2Frame.getId(), list1);
          return;
        } 
        continue;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyUFID) {
        if (((FrameBodyUFID)paramAbstractID3v2Frame.getBody()).getOwner().equals(((FrameBodyUFID)abstractID3v2Frame.getBody()).getOwner())) {
          listIterator.set(paramAbstractID3v2Frame);
          this.frameMap.put(paramAbstractID3v2Frame.getId(), list1);
          return;
        } 
        continue;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyUSLT) {
        if (((FrameBodyUSLT)paramAbstractID3v2Frame.getBody()).getDescription().equals(((FrameBodyUSLT)abstractID3v2Frame.getBody()).getDescription())) {
          listIterator.set(paramAbstractID3v2Frame);
          this.frameMap.put(paramAbstractID3v2Frame.getId(), list1);
          return;
        } 
        continue;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyPOPM) {
        if (((FrameBodyPOPM)paramAbstractID3v2Frame.getBody()).getEmailToUser().equals(((FrameBodyPOPM)abstractID3v2Frame.getBody()).getEmailToUser())) {
          listIterator.set(paramAbstractID3v2Frame);
          this.frameMap.put(paramAbstractID3v2Frame.getId(), list1);
          return;
        } 
        continue;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof AbstractFrameBodyNumberTotal) {
        mergeNumberTotalFrames(paramAbstractID3v2Frame, abstractID3v2Frame);
        return;
      } 
      if (paramAbstractID3v2Frame.getBody() instanceof AbstractFrameBodyPairs) {
        abstractFrameBodyPairs = (AbstractFrameBodyPairs)paramAbstractID3v2Frame.getBody();
        ((AbstractFrameBodyPairs)abstractID3v2Frame.getBody()).addPair(abstractFrameBodyPairs.getText());
        return;
      } 
    } 
    if (!getID3Frames().isMultipleAllowed(abstractFrameBodyPairs.getId())) {
      setFrame((AbstractID3v2Frame)abstractFrameBodyPairs);
      return;
    } 
    list1.add(abstractFrameBodyPairs);
    this.frameMap.put(abstractFrameBodyPairs.getId(), list1);
  }
  
  public void mergeNumberTotalFrames(AbstractID3v2Frame paramAbstractID3v2Frame1, AbstractID3v2Frame paramAbstractID3v2Frame2) {
    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal1 = (AbstractFrameBodyNumberTotal)paramAbstractID3v2Frame1.getBody();
    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal2 = (AbstractFrameBodyNumberTotal)paramAbstractID3v2Frame2.getBody();
    if (abstractFrameBodyNumberTotal1.getNumber() != null && abstractFrameBodyNumberTotal1.getNumber().intValue() > 0)
      abstractFrameBodyNumberTotal2.setNumber(abstractFrameBodyNumberTotal1.getNumberAsText()); 
    if (abstractFrameBodyNumberTotal1.getTotal() != null && abstractFrameBodyNumberTotal1.getTotal().intValue() > 0)
      abstractFrameBodyNumberTotal2.setTotal(abstractFrameBodyNumberTotal1.getTotalAsText()); 
  }
  
  public void removeFrame(String paramString) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder("Removing frame with identifier:");
    stringBuilder.append(paramString);
    logger.config(stringBuilder.toString());
    this.frameMap.remove(paramString);
  }
  
  public void removeFrameOfType(String paramString) {
    HashSet<String> hashSet = new HashSet();
    for (String str : this.frameMap.keySet()) {
      if (str.startsWith(paramString))
        hashSet.add(str); 
    } 
    for (String str : hashSet) {
      Logger logger = AbstractID3Tag.logger;
      StringBuilder stringBuilder = new StringBuilder("Removing frame with identifier:");
      stringBuilder.append(str);
      stringBuilder.append("because starts with:");
      stringBuilder.append(paramString);
      logger.finest(stringBuilder.toString());
      this.frameMap.remove(str);
    } 
  }
  
  public void removeUnsupportedFrames() {
    Iterator<List<TagField>> iterator = iterator();
    while (iterator.hasNext()) {
      List list = iterator.next();
      Iterator<TagField> iterator1 = list.iterator();
      while (iterator1.hasNext()) {
        TagField tagField = iterator1.next();
        if (tagField instanceof AbstractID3v2Frame) {
          AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame)tagField;
          if (abstractID3v2Frame.getBody() instanceof org.jaudiotagger.tag.id3.framebody.FrameBodyUnsupported) {
            Logger logger = AbstractID3Tag.logger;
            StringBuilder stringBuilder = new StringBuilder("Removing frame");
            stringBuilder.append(abstractID3v2Frame.getIdentifier());
            logger.finest(stringBuilder.toString());
            iterator1.remove();
          } 
        } 
      } 
      if (list.isEmpty())
        iterator.remove(); 
    } 
  }
  
  public boolean seek(ByteBuffer paramByteBuffer) {
    paramByteBuffer.rewind();
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder("ByteBuffer pos:");
    stringBuilder.append(paramByteBuffer.position());
    stringBuilder.append(":limit");
    stringBuilder.append(paramByteBuffer.limit());
    stringBuilder.append(":cap");
    stringBuilder.append(paramByteBuffer.capacity());
    logger.config(stringBuilder.toString());
    byte[] arrayOfByte = new byte[3];
    paramByteBuffer.get(arrayOfByte, 0, 3);
    return !Arrays.equals(arrayOfByte, TAG_ID) ? false : ((paramByteBuffer.get() != getMajorVersion()) ? false : ((paramByteBuffer.get() == getRevision())));
  }
  
  public boolean setEncoding(Charset paramCharset) {
    throw new UnsupportedOperationException(GMDx.JjmVGiPdhr);
  }
  
  public void setEndLocationInFile(long paramLong) {
    this.endLocationInFile = Long.valueOf(paramLong);
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    setField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void setField(TagField paramTagField) {
    boolean bool = paramTagField instanceof AbstractID3v2Frame;
    if (bool || paramTagField instanceof AggregatedFrame) {
      if (bool) {
        mergeDuplicateFrames((AbstractID3v2Frame)paramTagField);
        return;
      } 
      setTagField(paramTagField.getId(), paramTagField);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Field ");
    stringBuilder.append(paramTagField);
    stringBuilder.append(" is not of type AbstractID3v2Frame nor AggregatedFrame");
    throw new FieldDataInvalidException(stringBuilder.toString());
  }
  
  public void setField(Artwork paramArtwork) {
    setField(createField(paramArtwork));
  }
  
  public void setFrame(String paramString, List<TagField> paramList) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder("Adding ");
    stringBuilder.append(paramList.size());
    stringBuilder.append(" frames for ");
    stringBuilder.append(paramString);
    logger.finest(stringBuilder.toString());
    this.frameMap.put(paramString, paramList);
  }
  
  public void setFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    ArrayList<AbstractID3v2Frame> arrayList = new ArrayList();
    arrayList.add(paramAbstractID3v2Frame);
    this.frameMap.put(paramAbstractID3v2Frame.getIdentifier(), arrayList);
  }
  
  public void setStartLocationInFile(long paramLong) {
    this.startLocationInFile = Long.valueOf(paramLong);
  }
  
  public void setTagField(String paramString, TagField paramTagField) {
    ArrayList<TagField> arrayList = new ArrayList();
    arrayList.add(paramTagField);
    this.frameMap.put(paramString, arrayList);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Tag content:\n");
    Iterator<TagField> iterator = getFields();
    while (iterator.hasNext()) {
      TagField tagField = iterator.next();
      stringBuilder.append("\t");
      stringBuilder.append(tagField.getId());
      stringBuilder.append(":");
      stringBuilder.append(tagField.toString());
      stringBuilder.append("\n");
    } 
    return stringBuilder.toString();
  }
  
  public abstract long write(u00 paramu00, long paramLong);
  
  public void write(OutputStream paramOutputStream) {
    write(Channels.newChannel(paramOutputStream), 0);
  }
  
  public void write(OutputStream paramOutputStream, int paramInt) {
    write(Channels.newChannel(paramOutputStream), paramInt);
  }
  
  public void write(WritableByteChannel paramWritableByteChannel, int paramInt) {}
  
  public void write(uc1 paramuc1) {}
  
  public void writeBufferToFile(u00 paramu00, ByteBuffer paramByteBuffer, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, long paramLong) {
    UnableToCreateFileException unableToCreateFileException1;
    UnableToCreateFileException unableToCreateFileException2;
    FileLock fileLock3 = null;
    FileLock fileLock2 = null;
    FileLock fileLock1 = null;
    FileLock fileLock4 = null;
    try {
      IOException iOException1;
      FileChannel fileChannel1;
      FileChannel fileChannel2 = c61.a(paramu00).b("rw");
      fileLock1 = fileLock4;
      fileLock2 = fileLock3;
      try {
        fileLock3 = m92.B(fileChannel2, paramu00.j().toString());
        long l = paramInt2;
      } catch (IOException iOException2) {
      
      } finally {
        paramu00 = null;
        iOException1 = iOException2;
      } 
      FileLock fileLock = fileLock3;
      fileLock2 = fileLock3;
      fileChannel2.position(0L);
      fileLock = fileLock3;
      fileLock2 = fileLock3;
      fileChannel2.write((ByteBuffer)iOException1);
      fileLock = fileLock3;
      fileLock2 = fileLock3;
      fileChannel2.write(ByteBuffer.wrap((byte[])fileChannel1));
      fileLock = fileLock3;
      fileLock2 = fileLock3;
      fileChannel2.write(ByteBuffer.wrap(new byte[paramInt1]));
      return;
    } catch (IOException iOException1) {
      paramByteBuffer = null;
      FileLock fileLock = fileLock2;
      try {
        Logger logger = AbstractID3Tag.logger;
        Level level = Level.SEVERE;
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(iOException1.getMessage());
        logger.log(level, stringBuilder.toString(), iOException1);
        boolean bool = "Access is denied".equals(iOException1.getMessage());
        if (bool) {
          AbstractID3Tag.logger.severe(MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { iOException.i().j() }));
          UnableToModifyFileException unableToModifyFileException = new UnableToModifyFileException();
          this(MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { iOException.i().j() }));
          throw unableToModifyFileException;
        } 
      } finally {}
      AbstractID3Tag.logger.severe(MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { iOException.i().j() }));
      unableToCreateFileException2 = new UnableToCreateFileException();
      this(MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { iOException.i().j() }));
      throw unableToCreateFileException2;
    } finally {
      iOException = null;
      paramByteBuffer = null;
    } 
    if (unableToCreateFileException1 != null) {
      if (paramByteBuffer != null)
        try {
          paramByteBuffer.release();
        } catch (IOException iOException1) {
          iOException1.printStackTrace();
        }  
      try {
        unableToCreateFileException1.close();
      } catch (IOException iOException1) {
        iOException1.printStackTrace();
      } 
    } 
    throw iOException;
  }
  
  public ByteArrayOutputStream writeFramesToBuffer() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    writeFramesToBufferStream(this.frameMap, byteArrayOutputStream);
    writeFramesToBufferStream(this.encryptedFrameMap, byteArrayOutputStream);
    return byteArrayOutputStream;
  }
  
  public void writePadding(WritableByteChannel paramWritableByteChannel, int paramInt) {
    if (paramInt > 0)
      paramWritableByteChannel.write(ByteBuffer.wrap(new byte[paramInt])); 
  }
  
  public class FrameAndSubId {
    private String frameId;
    
    private FieldKey genericKey;
    
    private String subId;
    
    final AbstractID3v2Tag this$0;
    
    public FrameAndSubId(FieldKey param1FieldKey, String param1String1, String param1String2) {
      this.genericKey = param1FieldKey;
      this.frameId = param1String1;
      this.subId = param1String2;
    }
    
    public String getFrameId() {
      return this.frameId;
    }
    
    public FieldKey getGenericKey() {
      return this.genericKey;
    }
    
    public String getSubId() {
      return this.subId;
    }
    
    public String toString() {
      String str2 = this.genericKey.name();
      String str1 = this.frameId;
      String str3 = this.subId;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append(":");
      stringBuilder.append(str1);
      stringBuilder.append(":");
      stringBuilder.append(str3);
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractID3v2Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */