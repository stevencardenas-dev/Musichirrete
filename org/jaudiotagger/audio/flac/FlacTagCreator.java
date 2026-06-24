package org.jaudiotagger.audio.flac;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.flac.metadatablock.BlockType;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockHeader;
import org.jaudiotagger.audio.generic.AbstractTagCreator;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.flac.FlacTag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentCreator;

public class FlacTagCreator extends AbstractTagCreator {
  public static final int DEFAULT_PADDING = 4000;
  
  private static final VorbisCommentCreator creator;
  
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac");
    logger = logger;
    logger.setLevel(Level.SEVERE);
    creator = new VorbisCommentCreator();
  }
  
  public ByteBuffer convertMetadata(Tag paramTag, boolean paramBoolean) {
    int i;
    FlacTag flacTag = (FlacTag)paramTag;
    if (flacTag.getVorbisCommentTag() != null) {
      ByteBuffer byteBuffer1 = creator.convertMetadata((Tag)flacTag.getVorbisCommentTag());
      i = byteBuffer1.capacity() + 4;
    } else {
      paramTag = null;
      i = 0;
    } 
    Iterator<MetadataBlockDataPicture> iterator = flacTag.getImages().iterator();
    while (iterator.hasNext())
      i += ((MetadataBlockDataPicture)iterator.next()).getBytes().limit() + 4; 
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Convert flac tag:taglength:");
    stringBuilder.append(i);
    logger.config(stringBuilder.toString());
    ByteBuffer byteBuffer = ByteBuffer.allocate(i);
    if (flacTag.getVorbisCommentTag() != null) {
      MetadataBlockHeader metadataBlockHeader;
      if (paramBoolean || flacTag.getImages().size() > 0) {
        metadataBlockHeader = new MetadataBlockHeader(false, BlockType.VORBIS_COMMENT, paramTag.capacity());
      } else {
        metadataBlockHeader = new MetadataBlockHeader(true, BlockType.VORBIS_COMMENT, paramTag.capacity());
      } 
      byteBuffer.put(metadataBlockHeader.getBytes());
      byteBuffer.put((ByteBuffer)paramTag);
    } 
    ListIterator<MetadataBlockDataPicture> listIterator = flacTag.getImages().listIterator();
    while (listIterator.hasNext()) {
      MetadataBlockHeader metadataBlockHeader;
      MetadataBlockDataPicture metadataBlockDataPicture = listIterator.next();
      if (paramBoolean || listIterator.hasNext()) {
        metadataBlockHeader = new MetadataBlockHeader(false, BlockType.PICTURE, metadataBlockDataPicture.getLength());
      } else {
        metadataBlockHeader = new MetadataBlockHeader(true, BlockType.PICTURE, metadataBlockDataPicture.getLength());
      } 
      byteBuffer.put(metadataBlockHeader.getBytes());
      byteBuffer.put(metadataBlockDataPicture.getBytes());
    } 
    byteBuffer.rewind();
    return byteBuffer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacTagCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */