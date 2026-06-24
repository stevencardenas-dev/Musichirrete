package org.jaudiotagger.audio.ogg;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import ga1;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.audio.ogg.util.VorbisHeader;
import org.jaudiotagger.audio.ogg.util.VorbisPacketType;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentReader;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import uc1;

public class OggVorbisTagReader {
  public static Logger logger;
  
  private VorbisCommentReader vorbisCommentReader = new VorbisCommentReader();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public byte[] convertToVorbisCommentPacket(OggPageHeader paramOggPageHeader, uc1 paramuc1) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[((OggPageHeader.PacketStartAndLength)paramOggPageHeader.getPacketList().get(0)).getLength() - VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH + 1];
    paramuc1.g(arrayOfByte);
    byteArrayOutputStream.write(arrayOfByte);
    if (paramOggPageHeader.getPacketList().size() > 1) {
      logger.config("Comments finish on 2nd Page because there is another packet on this page");
      return byteArrayOutputStream.toByteArray();
    } 
    if (paramOggPageHeader.isLastPage()) {
      logger.config("Comments finish on 2nd Page because this packet is complete");
      return byteArrayOutputStream.toByteArray();
    } 
    while (true) {
      logger.config("Reading next page");
      OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
      byte[] arrayOfByte1 = new byte[((OggPageHeader.PacketStartAndLength)oggPageHeader.getPacketList().get(0)).getLength()];
      paramuc1.g(arrayOfByte1);
      byteArrayOutputStream.write(arrayOfByte1);
      if (oggPageHeader.getPacketList().size() > 1) {
        logger.config("Comments finish on Page because there is another packet on this page");
        return byteArrayOutputStream.toByteArray();
      } 
      if (!oggPageHeader.isLastPacketIncomplete()) {
        logger.config("Comments finish on Page because this packet is complete");
        return byteArrayOutputStream.toByteArray();
      } 
    } 
  }
  
  public byte[] convertToVorbisSetupHeaderPacketAndAdditionalPackets(long paramLong, uc1 paramuc1) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramuc1.h(paramLong);
    OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
    if (oggPageHeader.getPacketList().size() > 1)
      paramuc1.skipBytes(((OggPageHeader.PacketStartAndLength)oggPageHeader.getPacketList().get(0)).getLength()); 
    int i = VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH + 1;
    byte[] arrayOfByte = new byte[i];
    paramuc1.g(arrayOfByte);
    if (isVorbisSetupHeader(arrayOfByte)) {
      paramuc1.h(paramuc1.c() - i);
      if (oggPageHeader.getPacketList().size() > 1) {
        arrayOfByte = new byte[((OggPageHeader.PacketStartAndLength)oggPageHeader.getPacketList().get(1)).getLength()];
        paramuc1.g(arrayOfByte);
        byteArrayOutputStream.write(arrayOfByte);
      } else {
        arrayOfByte = new byte[((OggPageHeader.PacketStartAndLength)oggPageHeader.getPacketList().get(0)).getLength()];
        paramuc1.g(arrayOfByte);
        byteArrayOutputStream.write(arrayOfByte);
      } 
      boolean bool = oggPageHeader.isLastPacketIncomplete();
      i = 2;
      if (!bool || oggPageHeader.getPacketList().size() > 2) {
        logger.config("Setupheader finishes on this page");
        if (oggPageHeader.getPacketList().size() > 2)
          while (i < oggPageHeader.getPacketList().size()) {
            arrayOfByte = new byte[((OggPageHeader.PacketStartAndLength)oggPageHeader.getPacketList().get(i)).getLength()];
            paramuc1.g(arrayOfByte);
            byteArrayOutputStream.write(arrayOfByte);
            i++;
          }  
        return byteArrayOutputStream.toByteArray();
      } 
      while (true) {
        logger.config("Reading another page");
        OggPageHeader oggPageHeader1 = OggPageHeader.read(paramuc1);
        byte[] arrayOfByte1 = new byte[((OggPageHeader.PacketStartAndLength)oggPageHeader1.getPacketList().get(0)).getLength()];
        paramuc1.g(arrayOfByte1);
        byteArrayOutputStream.write(arrayOfByte1);
        if (oggPageHeader1.getPacketList().size() > 1) {
          logger.config("Setup header finishes on this page");
          return byteArrayOutputStream.toByteArray();
        } 
        if (!oggPageHeader1.isLastPacketIncomplete()) {
          logger.config("Setup header finish on Page because this packet is complete");
          return byteArrayOutputStream.toByteArray();
        } 
      } 
    } 
    throw new CannotReadException("Unable to find setup header(2), unable to write ogg file");
  }
  
  public boolean isVorbisCommentHeader(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, 1, VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH, mk.b);
    return (paramArrayOfbyte[0] == VorbisPacketType.COMMENT_HEADER.getType() && str.equals("vorbis"));
  }
  
  public boolean isVorbisSetupHeader(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, 1, VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH, mk.b);
    return (paramArrayOfbyte[0] == VorbisPacketType.SETUP_HEADER.getType() && str.equals("vorbis"));
  }
  
  public Tag read(uc1 paramuc1) {
    logger.config("Starting to read ogg vorbis tag from file:");
    byte[] arrayOfByte = readRawPacketData(paramuc1);
    VorbisCommentTag vorbisCommentTag = this.vorbisCommentReader.read(arrayOfByte, true, null);
    logger.fine("CompletedReadCommentTag");
    return (Tag)vorbisCommentTag;
  }
  
  public OggVorbisHeaderSizes readOggVorbisHeaderSizes(uc1 paramuc1) {
    logger.fine("Started to read comment and setup header sizes:");
    long l1 = paramuc1.c();
    ArrayList arrayList = new ArrayList();
    OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
    paramuc1.h(paramuc1.c() + oggPageHeader.getPageLength());
    oggPageHeader = OggPageHeader.read(paramuc1);
    long l2 = paramuc1.c() - ((oggPageHeader.getSegmentTable()).length + 27);
    int i = VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH + 1;
    byte[] arrayOfByte = new byte[i];
    paramuc1.g(arrayOfByte);
    if (isVorbisCommentHeader(arrayOfByte)) {
      int j;
      long l;
      Logger logger1;
      Logger logger2;
      List<OggPageHeader.PacketStartAndLength> list;
      paramuc1.h(paramuc1.c() - i);
      Logger logger4 = logger;
      StringBuilder stringBuilder1 = new StringBuilder("Found start of comment header at:");
      stringBuilder1.append(paramuc1.c());
      logger4.config(stringBuilder1.toString());
      for (i = 0;; i = j) {
        list = oggPageHeader.getPacketList();
        j = ((OggPageHeader.PacketStartAndLength)list.get(0)).getLength() + i;
        paramuc1.skipBytes(((OggPageHeader.PacketStartAndLength)list.get(0)).getLength());
        if (list.size() > 1 || !oggPageHeader.isLastPacketIncomplete())
          break; 
        oggPageHeader = OggPageHeader.read(paramuc1);
      } 
      Logger logger3 = logger;
      StringBuilder stringBuilder2 = ga1.k(j, oXrNDUqUkE.FRfKRZ, "finishes at file position:");
      stringBuilder2.append(paramuc1.c());
      logger3.config(stringBuilder2.toString());
      i = oggPageHeader.getPacketList().size();
      String str = LHyji.VjDbSsP;
      if (i == 1) {
        OggPageHeader oggPageHeader1 = OggPageHeader.read(paramuc1);
        List list1 = oggPageHeader1.getPacketList();
        OggPageHeader.PacketStartAndLength packetStartAndLength = oggPageHeader1.getPacketList().get(0);
        i = VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH + 1;
        byte[] arrayOfByte1 = new byte[i];
        paramuc1.g(arrayOfByte1);
        if (isVorbisSetupHeader(arrayOfByte1)) {
          paramuc1.h(paramuc1.c() - i);
          Logger logger = logger;
          StringBuilder stringBuilder3 = new StringBuilder(str);
          stringBuilder3.append(paramuc1.c());
          logger.config(stringBuilder3.toString());
          l = paramuc1.c() - ((oggPageHeader1.getSegmentTable()).length + 27);
          int k = packetStartAndLength.getLength();
          logger = logger;
          stringBuilder3 = new StringBuilder("Adding:");
          stringBuilder3.append(packetStartAndLength.getLength());
          stringBuilder3.append(" to setup header size");
          logger.fine(stringBuilder3.toString());
          paramuc1.skipBytes(packetStartAndLength.getLength());
          if (list1.size() > 1 || !oggPageHeader1.isLastPacketIncomplete()) {
            List<OggPageHeader.PacketStartAndLength> list2;
            Logger logger5 = logger;
            stringBuilder3 = ga1.k(k, "Found end of setupheader:size:", "finishes at:");
            stringBuilder3.append(paramuc1.c());
            logger5.config(stringBuilder3.toString());
            i = k;
            if (list1.size() > 1) {
              list2 = list1.subList(1, list1.size());
              i = k;
            } 
            paramuc1.h(l1);
            return new OggVorbisHeaderSizes(l2, l, j, i, list2);
          } 
          OggPageHeader oggPageHeader2 = OggPageHeader.read(paramuc1);
          list = oggPageHeader2.getPacketList();
          while (true) {
            k += ((OggPageHeader.PacketStartAndLength)list.get(0)).getLength();
            Logger logger5 = logger;
            StringBuilder stringBuilder = new StringBuilder("Adding:");
            stringBuilder.append(((OggPageHeader.PacketStartAndLength)list.get(0)).getLength());
            stringBuilder.append(" to setup header size");
            logger5.fine(stringBuilder.toString());
            paramuc1.skipBytes(((OggPageHeader.PacketStartAndLength)list.get(0)).getLength());
            if (list.size() > 1 || !oggPageHeader2.isLastPacketIncomplete())
              break; 
            oggPageHeader2 = OggPageHeader.read(paramuc1);
          } 
          logger2 = logger;
          StringBuilder stringBuilder4 = ga1.k(k, "Found end of setupheader:size:", "finishes at:");
          stringBuilder4.append(paramuc1.c());
          logger2.fine(stringBuilder4.toString());
          i = k;
          if (list.size() > 1) {
            List<OggPageHeader.PacketStartAndLength> list2 = list.subList(1, list.size());
            i = k;
          } 
        } else {
          throw new CannotReadException("Cannot find vorbis setup parentHeader");
        } 
      } else {
        Logger logger;
        OggPageHeader.PacketStartAndLength packetStartAndLength = logger2.getPacketList().get(1);
        List list1 = logger2.getPacketList();
        i = VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH + 1;
        byte[] arrayOfByte1 = new byte[i];
        paramuc1.g(arrayOfByte1);
        if (isVorbisSetupHeader(arrayOfByte1)) {
          List<OggPageHeader.PacketStartAndLength> list2;
          paramuc1.h(paramuc1.c() - i);
          logger = logger;
          StringBuilder stringBuilder4 = new StringBuilder((String)list);
          stringBuilder4.append(paramuc1.c());
          logger.config(stringBuilder4.toString());
          l = paramuc1.c() - ((logger2.getSegmentTable()).length + 27) - ((OggPageHeader.PacketStartAndLength)logger2.getPacketList().get(0)).getLength();
          int k = packetStartAndLength.getLength();
          logger = logger;
          stringBuilder4 = new StringBuilder("Adding:");
          stringBuilder4.append(packetStartAndLength.getLength());
          stringBuilder4.append(" to setup header size");
          logger.fine(stringBuilder4.toString());
          paramuc1.skipBytes(packetStartAndLength.getLength());
          if (list1.size() > 2 || !logger2.isLastPacketIncomplete()) {
            Logger logger6 = logger;
            StringBuilder stringBuilder5 = ga1.k(k, "Found end of setupheader:size:", "finishes at:");
            stringBuilder5.append(paramuc1.c());
            logger6.fine(stringBuilder5.toString());
            i = k;
            if (list1.size() > 2) {
              list2 = list1.subList(2, list1.size());
              i = k;
            } 
            paramuc1.h(l1);
            return new OggVorbisHeaderSizes(l2, l, j, i, list2);
          } 
          OggPageHeader oggPageHeader1 = OggPageHeader.read(paramuc1);
          List<OggPageHeader.PacketStartAndLength> list3 = oggPageHeader1.getPacketList();
          while (true) {
            k += ((OggPageHeader.PacketStartAndLength)list3.get(0)).getLength();
            Logger logger6 = logger;
            StringBuilder stringBuilder5 = new StringBuilder("Adding:");
            stringBuilder5.append(((OggPageHeader.PacketStartAndLength)list3.get(0)).getLength());
            stringBuilder5.append(" to setup header size");
            logger6.fine(stringBuilder5.toString());
            paramuc1.skipBytes(((OggPageHeader.PacketStartAndLength)list3.get(0)).getLength());
            if (list3.size() > 1 || !oggPageHeader1.isLastPacketIncomplete())
              break; 
            oggPageHeader1 = OggPageHeader.read(paramuc1);
          } 
          Logger logger5 = logger;
          StringBuilder stringBuilder3 = ga1.k(k, "Found end of setupheader:size:", "finishes at:");
          stringBuilder3.append(paramuc1.c());
          logger5.fine(stringBuilder3.toString());
          i = k;
          if (list3.size() > 1) {
            list2 = list3.subList(1, list3.size());
            i = k;
          } 
          paramuc1.h(l1);
          return new OggVorbisHeaderSizes(l2, l, j, i, list2);
        } 
        logger1 = logger;
        StringBuilder stringBuilder = new StringBuilder("Expecting but got:");
        stringBuilder.append(new String((byte[])logger));
        stringBuilder.append("at ");
        stringBuilder.append(paramuc1.c() - i);
        logger1.warning(stringBuilder.toString());
        throw new CannotReadException("Cannot find vorbis setup parentHeader");
      } 
      paramuc1.h(l1);
      return new OggVorbisHeaderSizes(l2, l, j, i, (List<OggPageHeader.PacketStartAndLength>)logger1);
    } 
    throw new CannotReadException("Cannot find comment block (no vorbiscomment header)");
  }
  
  public byte[] readRawPacketData(uc1 paramuc1) {
    logger.fine("Read 1st page");
    OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
    paramuc1.h(paramuc1.c() + oggPageHeader.getPageLength());
    logger.fine("Read 2nd page");
    oggPageHeader = OggPageHeader.read(paramuc1);
    byte[] arrayOfByte = new byte[VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH + 1];
    paramuc1.g(arrayOfByte);
    if (isVorbisCommentHeader(arrayOfByte))
      return convertToVorbisCommentPacket(oggPageHeader, paramuc1); 
    throw new CannotReadException("Cannot find comment block (no vorbiscomment header)");
  }
  
  public static class OggVorbisHeaderSizes {
    private int commentHeaderSize;
    
    private long commentHeaderStartPosition;
    
    private List<OggPageHeader.PacketStartAndLength> packetList;
    
    private int setupHeaderSize;
    
    private long setupHeaderStartPosition;
    
    public OggVorbisHeaderSizes(long param1Long1, long param1Long2, int param1Int1, int param1Int2, List<OggPageHeader.PacketStartAndLength> param1List) {
      this.packetList = param1List;
      this.commentHeaderStartPosition = param1Long1;
      this.setupHeaderStartPosition = param1Long2;
      this.commentHeaderSize = param1Int1;
      this.setupHeaderSize = param1Int2;
    }
    
    public int getCommentHeaderSize() {
      return this.commentHeaderSize;
    }
    
    public long getCommentHeaderStartPosition() {
      return this.commentHeaderStartPosition;
    }
    
    public int getExtraPacketDataSize() {
      Iterator<OggPageHeader.PacketStartAndLength> iterator = this.packetList.iterator();
      int i;
      for (i = 0; iterator.hasNext(); i += ((OggPageHeader.PacketStartAndLength)iterator.next()).getLength());
      return i;
    }
    
    public List<OggPageHeader.PacketStartAndLength> getExtraPacketList() {
      return this.packetList;
    }
    
    public int getSetupHeaderSize() {
      return this.setupHeaderSize;
    }
    
    public long getSetupHeaderStartPosition() {
      return this.setupHeaderStartPosition;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\ogg\OggVorbisTagReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */