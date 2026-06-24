package org.jaudiotagger.audio.asf.data;

import ga1;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;
import org.jaudiotagger.audio.asf.util.Utils;

public final class AsfHeader extends ChunkContainer {
  public static final Charset ASF_CHARSET = Charset.forName("UTF-16LE");
  
  public static final byte[] ZERO_TERM = new byte[] { 0, 0 };
  
  private final long chunkCount;
  
  static {
    (new HashSet<GUID>()).add(GUID.GUID_STREAM);
  }
  
  public AsfHeader(long paramLong1, BigInteger paramBigInteger, long paramLong2) {
    super(GUID.GUID_HEADER, paramLong1, paramBigInteger);
    this.chunkCount = paramLong2;
  }
  
  public ContentDescription findContentDescription() {
    ContentDescription contentDescription = getContentDescription();
    return (contentDescription == null && getExtendedHeader() != null) ? getExtendedHeader().getContentDescription() : contentDescription;
  }
  
  public MetadataContainer findExtendedContentDescription() {
    MetadataContainer metadataContainer = getExtendedContentDescription();
    return (metadataContainer == null && getExtendedHeader() != null) ? getExtendedHeader().getExtendedContentDescription() : metadataContainer;
  }
  
  public MetadataContainer findMetadataContainer(ContainerType paramContainerType) {
    MetadataContainer metadataContainer = (MetadataContainer)getFirst(paramContainerType.getContainerGUID(), (Class)MetadataContainer.class);
    return (metadataContainer == null) ? (MetadataContainer)getExtendedHeader().getFirst(paramContainerType.getContainerGUID(), (Class)MetadataContainer.class) : metadataContainer;
  }
  
  public AudioStreamChunk getAudioStreamChunk() {
    List<Chunk> list = assertChunkList(GUID.GUID_STREAM);
    AudioStreamChunk audioStreamChunk = null;
    for (byte b = 0; b < list.size() && audioStreamChunk == null; b++) {
      if (list.get(b) instanceof AudioStreamChunk)
        audioStreamChunk = (AudioStreamChunk)list.get(b); 
    } 
    return audioStreamChunk;
  }
  
  public long getChunkCount() {
    return this.chunkCount;
  }
  
  public ContentDescription getContentDescription() {
    return (ContentDescription)getFirst(GUID.GUID_CONTENTDESCRIPTION, (Class)ContentDescription.class);
  }
  
  public EncodingChunk getEncodingChunk() {
    return (EncodingChunk)getFirst(GUID.GUID_ENCODING, (Class)EncodingChunk.class);
  }
  
  public EncryptionChunk getEncryptionChunk() {
    return (EncryptionChunk)getFirst(GUID.GUID_CONTENT_ENCRYPTION, (Class)EncryptionChunk.class);
  }
  
  public MetadataContainer getExtendedContentDescription() {
    return (MetadataContainer)getFirst(GUID.GUID_EXTENDED_CONTENT_DESCRIPTION, (Class)MetadataContainer.class);
  }
  
  public AsfExtendedHeader getExtendedHeader() {
    return (AsfExtendedHeader)getFirst(GUID.GUID_HEADER_EXTENSION, (Class)AsfExtendedHeader.class);
  }
  
  public FileHeader getFileHeader() {
    return (FileHeader)getFirst(GUID.GUID_FILE, (Class)FileHeader.class);
  }
  
  public StreamBitratePropertiesChunk getStreamBitratePropertiesChunk() {
    return (StreamBitratePropertiesChunk)getFirst(GUID.GUID_STREAM_BITRATE_PROPERTIES, (Class)StreamBitratePropertiesChunk.class);
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = ga1.l(paramString, "  | : Contains: \"");
    stringBuilder.append(getChunkCount());
    stringBuilder.append("\" chunks");
    stringBuilder.append(Utils.LINE_SEPARATOR);
    return (new StringBuilder(prettyPrint(paramString, stringBuilder.toString()))).toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\AsfHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */