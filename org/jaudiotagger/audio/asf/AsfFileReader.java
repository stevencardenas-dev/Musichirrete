package org.jaudiotagger.audio.asf;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.MetadataContainer;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
import org.jaudiotagger.audio.asf.io.AsfExtHeaderReader;
import org.jaudiotagger.audio.asf.io.AsfHeaderReader;
import org.jaudiotagger.audio.asf.io.ContentBrandingReader;
import org.jaudiotagger.audio.asf.io.ContentDescriptionReader;
import org.jaudiotagger.audio.asf.io.FileHeaderReader;
import org.jaudiotagger.audio.asf.io.FullRequestInputStream;
import org.jaudiotagger.audio.asf.io.LanguageListReader;
import org.jaudiotagger.audio.asf.io.MetadataReader;
import org.jaudiotagger.audio.asf.io.StreamChunkReader;
import org.jaudiotagger.audio.asf.util.TagConverter;
import org.jaudiotagger.audio.asf.util.Utils;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.asf.AsfTag;
import u00;
import uc1;
import ws2;

public class AsfFileReader extends AudioFileReader {
  static final boolean $assertionsDisabled = false;
  
  private static final AsfHeaderReader HEADER_READER;
  
  private static final Logger LOGGER = Logger.getLogger("org.jaudiotagger.audio.asf");
  
  static {
    AudioFileReader.logger.setLevel(Level.SEVERE);
    ArrayList<Class<ContentDescriptionReader>> arrayList = new ArrayList();
    arrayList.add(ContentDescriptionReader.class);
    arrayList.add(ContentBrandingReader.class);
    arrayList.add(MetadataReader.class);
    arrayList.add(LanguageListReader.class);
    AsfExtHeaderReader asfExtHeaderReader = new AsfExtHeaderReader(arrayList, true);
    arrayList.add(FileHeaderReader.class);
    arrayList.add(StreamChunkReader.class);
    AsfHeaderReader asfHeaderReader = new AsfHeaderReader(arrayList, true);
    HEADER_READER = asfHeaderReader;
    asfHeaderReader.setExtendedHeaderReader(asfExtHeaderReader);
  }
  
  private boolean determineVariableBitrate(AsfHeader paramAsfHeader) {
    MetadataContainer metadataContainer = paramAsfHeader.findExtendedContentDescription();
    if (metadataContainer != null) {
      List<MetadataDescriptor> list = metadataContainer.getDescriptorsByName("IsVBR");
      if (list != null && !list.isEmpty())
        return Boolean.TRUE.toString().equals(((MetadataDescriptor)list.get(0)).getString()); 
    } 
    return false;
  }
  
  private GenericAudioHeader getAudioHeader(AsfHeader paramAsfHeader) {
    GenericAudioHeader genericAudioHeader = new GenericAudioHeader();
    if (paramAsfHeader.getFileHeader() != null) {
      if (paramAsfHeader.getAudioStreamChunk() != null) {
        boolean bool;
        genericAudioHeader.setBitRate(paramAsfHeader.getAudioStreamChunk().getKbps());
        genericAudioHeader.setChannelNumber((int)paramAsfHeader.getAudioStreamChunk().getChannelCount());
        genericAudioHeader.setFormat(SupportedFileFormat.WMA.getDisplayName());
        StringBuilder stringBuilder = new StringBuilder("ASF (audio): ");
        stringBuilder.append(paramAsfHeader.getAudioStreamChunk().getCodecDescription());
        genericAudioHeader.setEncodingType(stringBuilder.toString());
        if (paramAsfHeader.getAudioStreamChunk().getCompressionFormat() == 355L) {
          bool = true;
        } else {
          bool = false;
        } 
        genericAudioHeader.setLossless(bool);
        genericAudioHeader.setPreciseLength(paramAsfHeader.getFileHeader().getPreciseDuration());
        genericAudioHeader.setSamplingRate((int)paramAsfHeader.getAudioStreamChunk().getSamplingRate());
        genericAudioHeader.setVariableBitRate(determineVariableBitrate(paramAsfHeader));
        genericAudioHeader.setBitsPerSample(paramAsfHeader.getAudioStreamChunk().getBitsPerSample());
        return genericAudioHeader;
      } 
      throw new CannotReadException("Invalid ASF/WMA file. No audio stream contained.");
    } 
    throw new CannotReadException("Invalid ASF/WMA file. File header object not available.");
  }
  
  private AsfTag getTag(AsfHeader paramAsfHeader) {
    return TagConverter.createTagOf(paramAsfHeader);
  }
  
  public GenericAudioHeader getEncodingInfo(uc1 paramuc1) {
    paramuc1.h(0L);
    try {
      AsfHeader asfHeader = AsfHeaderReader.readInfoHeader(paramuc1);
      if (asfHeader != null)
        return getAudioHeader(asfHeader); 
      CannotReadException cannotReadException = new CannotReadException();
      this(tlzLOCPTHRhep.zENjselwoI);
      throw cannotReadException;
    } catch (Exception exception) {
      if (!(exception instanceof IOException)) {
        if (exception instanceof CannotReadException)
          throw (CannotReadException)exception; 
        String str = exception.getMessage();
        StringBuilder stringBuilder = new StringBuilder("Failed to read. Cause: ");
        stringBuilder.append(str);
        throw new CannotReadException(stringBuilder.toString(), exception);
      } 
      throw (IOException)exception;
    } 
  }
  
  public AsfTag getTag(uc1 paramuc1) {
    paramuc1.h(0L);
    try {
      AsfHeader asfHeader = AsfHeaderReader.readTagHeader(paramuc1);
      if (asfHeader != null)
        return TagConverter.createTagOf(asfHeader); 
      CannotReadException cannotReadException = new CannotReadException();
      this("Some values must have been incorrect for interpretation as asf with wma content.");
      throw cannotReadException;
    } catch (Exception exception) {
      String str;
      AudioFileReader.logger.severe(exception.getMessage());
      if (!(exception instanceof IOException)) {
        if (exception instanceof CannotReadException)
          throw (CannotReadException)exception; 
        str = exception.getMessage();
        StringBuilder stringBuilder = new StringBuilder("Failed to read. Cause: ");
        stringBuilder.append(str);
        throw new CannotReadException(stringBuilder.toString());
      } 
      throw (IOException)str;
    } 
  }
  
  public AudioFile read(u00 paramu00) {
    if (!paramu00.a()) {
      if (!paramu00.f()) {
        Logger logger = AudioFileReader.logger;
        stringBuilder2 = new StringBuilder(ckOPp.ESdqjhmPhbUsi);
        stringBuilder2.append(paramu00.j());
        logger.severe(stringBuilder2.toString());
        throw new FileNotFoundException(MessageFormat.format("Unable to find:{0}", new Object[] { paramu00.j() }));
      } 
      throw new CannotReadException(MessageFormat.format("Unable to read file do not have permission to read: {0}", new Object[] { paramu00.j() }));
    } 
    StringBuilder stringBuilder4 = null;
    StringBuilder stringBuilder3 = null;
    AsfHeader asfHeader2 = null;
    AsfHeader asfHeader1 = asfHeader2;
    try {
      FullRequestInputStream fullRequestInputStream = new FullRequestInputStream();
      asfHeader1 = asfHeader2;
      BufferedInputStream bufferedInputStream = new BufferedInputStream();
      asfHeader1 = asfHeader2;
      this(ws2.n(paramu00));
      asfHeader1 = asfHeader2;
      this(bufferedInputStream);
      try {
        asfHeader1 = (AsfHeader)HEADER_READER.read(Utils.readGUID((InputStream)fullRequestInputStream), (InputStream)fullRequestInputStream, 0L);
        if (asfHeader1 != null) {
          if (asfHeader1.getFileHeader() != null) {
            if (asfHeader1.getFileHeader().getFileSize().longValue() != paramu00.n())
              AudioFileReader.logger.warning(MessageFormat.format("For file {0} the File header size is {1} but different to actual file size of {2}", new Object[] { paramu00.j(), Long.valueOf(asfHeader1.getFileHeader().getFileSize().longValue()), Long.valueOf(paramu00.n()) })); 
            AudioFile audioFile = new AudioFile(paramu00, (AudioHeader)getAudioHeader(asfHeader1), (Tag)getTag(asfHeader1));
            try {
              return audioFile;
            } catch (Exception exception) {
              Logger logger = LOGGER;
              stringBuilder3 = new StringBuilder("\"");
              stringBuilder3.append(paramu00);
              stringBuilder3.append("\" :");
              return audioFile;
            } 
          } 
          CannotReadException cannotReadException2 = new CannotReadException();
          this(MessageFormat.format("For file {0} the File Header missing. Invalid ASF/WMA file.", new Object[] { paramu00.j() }));
          throw cannotReadException2;
        } 
      } catch (CannotReadException cannotReadException2) {
        Exception exception1 = exception;
      } catch (Exception exception1) {
      
      } finally {}
      CannotReadException cannotReadException1 = new CannotReadException();
      this(MessageFormat.format("For file {0} the Asf Header missing. Invalid ASF/WMA file.", new Object[] { paramu00.j() }));
      throw cannotReadException1;
    } catch (CannotReadException cannotReadException1) {
    
    } catch (Exception exception) {
    
    } finally {
      AsfHeader asfHeader;
      asfHeader2 = null;
      stringBuilder2 = stringBuilder1;
    } 
    StringBuilder stringBuilder1 = stringBuilder2;
    CannotReadException cannotReadException = new CannotReadException();
    stringBuilder1 = stringBuilder2;
    stringBuilder4 = new StringBuilder();
    stringBuilder1 = stringBuilder2;
    this("\"");
    StringBuilder stringBuilder2;
    stringBuilder1 = stringBuilder2;
    stringBuilder4.append(paramu00);
    stringBuilder1 = stringBuilder2;
    stringBuilder4.append("\" :");
    stringBuilder1 = stringBuilder2;
    stringBuilder4.append(asfHeader2);
    stringBuilder1 = stringBuilder2;
    this(stringBuilder4.toString(), (Throwable)asfHeader2);
    stringBuilder1 = stringBuilder2;
    throw cannotReadException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\AsfFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */