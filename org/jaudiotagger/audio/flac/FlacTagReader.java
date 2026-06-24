package org.jaudiotagger.audio.flac;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import c61;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.flac.metadatablock.BlockType;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockHeader;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.flac.FlacTag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentReader;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import wf2;

public class FlacTagReader {
  public static Logger logger;
  
  private VorbisCommentReader vorbisCommentReader = new VorbisCommentReader();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public FlacTag read(c61 paramc61) {
    FileChannel fileChannel = paramc61.b("r");
    try {
      FlacStreamReader flacStreamReader = new FlacStreamReader();
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append(paramc61.toString());
      stringBuilder1.append(" ");
      this(fileChannel, stringBuilder1.toString());
      flacStreamReader.findStream();
      arrayList = new ArrayList();
      this();
      flacStreamReader = null;
      boolean bool = false;
      while (true) {
        VorbisCommentTag vorbisCommentTag;
        MetadataBlockHeader metadataBlockHeader;
        if (!bool) {
          Logger logger1 = logger;
          Level level = Level.CONFIG;
          if (logger1.isLoggable(level)) {
            logger1 = logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            this();
            stringBuilder2.append(paramc61);
            stringBuilder2.append(" Looking for MetaBlockHeader at:");
            stringBuilder2.append(fileChannel.position());
            logger1.config(stringBuilder2.toString());
          } 
          metadataBlockHeader = MetadataBlockHeader.readHeader(fileChannel);
          if (metadataBlockHeader == null)
            break; 
          if (logger.isLoggable(level)) {
            logger1 = logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            this();
            stringBuilder2.append(paramc61);
            stringBuilder2.append(" Reading MetadataBlockHeader:");
            stringBuilder2.append(metadataBlockHeader.toString());
            stringBuilder2.append(" ending at ");
            stringBuilder2.append(fileChannel.position());
            logger1.config(stringBuilder2.toString());
          } 
          FlacStreamReader flacStreamReader1 = flacStreamReader;
          if (metadataBlockHeader.getBlockType() != null) {
            int i = null.$SwitchMap$org$jaudiotagger$audio$flac$metadatablock$BlockType[metadataBlockHeader.getBlockType().ordinal()];
            if (i != 1) {
              if (i != 2) {
                if (i != 3) {
                  if (logger.isLoggable(level)) {
                    Logger logger2 = logger;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    this();
                    stringBuilder2.append(paramc61);
                    stringBuilder2.append("Ignoring MetadataBlock:");
                    stringBuilder2.append(metadataBlockHeader.getBlockType());
                    logger2.config(stringBuilder2.toString());
                  } 
                  fileChannel.position(fileChannel.position() + metadataBlockHeader.getDataLength());
                  flacStreamReader1 = flacStreamReader;
                } else {
                  try {
                    fileChannel.position(fileChannel.position() + metadataBlockHeader.getDataLength());
                    flacStreamReader1 = flacStreamReader;
                  } catch (IOException iOException) {
                    Logger logger2 = logger;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    this();
                    stringBuilder2.append(paramc61);
                    stringBuilder2.append("Unable to readseek metablock, ignoring:");
                    stringBuilder2.append(iOException.getMessage());
                    logger2.warning(stringBuilder2.toString());
                    FlacStreamReader flacStreamReader2 = flacStreamReader;
                  } 
                } 
              } else {
                try {
                  MetadataBlockDataPicture metadataBlockDataPicture = new MetadataBlockDataPicture();
                  this(metadataBlockHeader, fileChannel);
                  arrayList.add(metadataBlockDataPicture);
                  FlacStreamReader flacStreamReader2 = flacStreamReader;
                } catch (IOException iOException) {
                  Logger logger2 = logger;
                  StringBuilder stringBuilder2 = new StringBuilder();
                  this();
                  stringBuilder2.append(paramc61);
                  stringBuilder2.append(eRUgfgGAccgka.JvgP);
                  stringBuilder2.append(iOException.getMessage());
                  logger2.warning(stringBuilder2.toString());
                  FlacStreamReader flacStreamReader2 = flacStreamReader;
                } catch (InvalidFrameException invalidFrameException) {}
              } 
            } else {
              ByteBuffer byteBuffer = ByteBuffer.allocate(metadataBlockHeader.getDataLength());
              fileChannel.read(byteBuffer);
              vorbisCommentTag = this.vorbisCommentReader.read(byteBuffer.array(), false, paramc61);
            } 
          } 
        } else {
          break;
        } 
        bool = metadataBlockHeader.isLastBlock();
        vorbisCommentTag2 = vorbisCommentTag;
      } 
    } finally {}
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    this();
    VorbisCommentTag vorbisCommentTag2;
    ArrayList<MetadataBlockDataPicture> arrayList;
    stringBuilder.append("Audio should start at:");
    stringBuilder.append(wf2.f(fileChannel.position()));
    logger.config(stringBuilder.toString());
    VorbisCommentTag vorbisCommentTag1 = vorbisCommentTag2;
    if (vorbisCommentTag2 == null)
      vorbisCommentTag1 = VorbisCommentTag.createNewTag(); 
    FlacTag flacTag = new FlacTag(vorbisCommentTag1, arrayList);
    fileChannel.close();
    return flacTag;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacTagReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */