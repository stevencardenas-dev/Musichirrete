package org.jaudiotagger.audio;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.aiff.AiffFileReader;
import org.jaudiotagger.audio.aiff.AiffFileWriter;
import org.jaudiotagger.audio.asf.AsfFileReader;
import org.jaudiotagger.audio.asf.AsfFileWriter;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.UnknownFileFormatException;
import org.jaudiotagger.audio.flac.FlacFileReader;
import org.jaudiotagger.audio.flac.FlacFileWriter;
import org.jaudiotagger.audio.generic.AudioFileModificationListener;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.AudioFileWriter;
import org.jaudiotagger.audio.generic.ModificationHandler;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp3.MP3FileReader;
import org.jaudiotagger.audio.mp3.MP3FileWriter;
import org.jaudiotagger.audio.mp4.Mp4FileReader;
import org.jaudiotagger.audio.mp4.Mp4FileWriter;
import org.jaudiotagger.audio.ogg.OggFileReader;
import org.jaudiotagger.audio.ogg.OggFileWriter;
import org.jaudiotagger.audio.opus.OpusFileReader;
import org.jaudiotagger.audio.opus.OpusFileWriter;
import org.jaudiotagger.audio.real.RealFileReader;
import org.jaudiotagger.audio.wav.WavFileReader;
import org.jaudiotagger.audio.wav.WavFileWriter;
import u00;

public class AudioFileIO {
  private static AudioFileIO defaultInstance;
  
  public static Logger logger;
  
  private final ModificationHandler modificationHandler = new ModificationHandler();
  
  private Map<String, AudioFileReader> readers = new HashMap<String, AudioFileReader>();
  
  private Map<String, AudioFileWriter> writers = new HashMap<String, AudioFileWriter>();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public AudioFileIO() {
    prepareReadersAndWriters();
  }
  
  public static AudioFileIO getDefaultAudioFileIO() {
    if (defaultInstance == null)
      defaultInstance = new AudioFileIO(); 
    return defaultInstance;
  }
  
  private void prepareReadersAndWriters() {
    Map<String, AudioFileReader> map1 = this.readers;
    SupportedFileFormat supportedFileFormat1 = SupportedFileFormat.OGG;
    map1.put(supportedFileFormat1.getFilesuffix(), new OggFileReader());
    Map<String, AudioFileReader> map2 = this.readers;
    SupportedFileFormat supportedFileFormat2 = SupportedFileFormat.OGA;
    map2.put(supportedFileFormat2.getFilesuffix(), new OggFileReader());
    Map<String, AudioFileReader> map3 = this.readers;
    SupportedFileFormat supportedFileFormat3 = SupportedFileFormat.FLAC;
    map3.put(supportedFileFormat3.getFilesuffix(), new FlacFileReader());
    Map<String, AudioFileReader> map4 = this.readers;
    SupportedFileFormat supportedFileFormat4 = SupportedFileFormat.MP3;
    map4.put(supportedFileFormat4.getFilesuffix(), new MP3FileReader());
    Map<String, AudioFileReader> map5 = this.readers;
    SupportedFileFormat supportedFileFormat5 = SupportedFileFormat.MP4;
    map5.put(supportedFileFormat5.getFilesuffix(), new Mp4FileReader());
    Map<String, AudioFileReader> map6 = this.readers;
    SupportedFileFormat supportedFileFormat6 = SupportedFileFormat.M4A;
    map6.put(supportedFileFormat6.getFilesuffix(), new Mp4FileReader());
    Map<String, AudioFileReader> map7 = this.readers;
    SupportedFileFormat supportedFileFormat7 = SupportedFileFormat.ALAC;
    map7.put(supportedFileFormat7.getFilesuffix(), new Mp4FileReader());
    Map<String, AudioFileReader> map8 = this.readers;
    SupportedFileFormat supportedFileFormat8 = SupportedFileFormat.M4P;
    map8.put(supportedFileFormat8.getFilesuffix(), new Mp4FileReader());
    Map<String, AudioFileReader> map9 = this.readers;
    SupportedFileFormat supportedFileFormat9 = SupportedFileFormat.M4B;
    map9.put(supportedFileFormat9.getFilesuffix(), new Mp4FileReader());
    Map<String, AudioFileReader> map10 = this.readers;
    SupportedFileFormat supportedFileFormat10 = SupportedFileFormat.WAV;
    map10.put(supportedFileFormat10.getFilesuffix(), new WavFileReader());
    Map<String, AudioFileReader> map11 = this.readers;
    SupportedFileFormat supportedFileFormat11 = SupportedFileFormat.WMA;
    map11.put(supportedFileFormat11.getFilesuffix(), new AsfFileReader());
    Map<String, AudioFileReader> map12 = this.readers;
    SupportedFileFormat supportedFileFormat12 = SupportedFileFormat.ASF;
    map12.put(supportedFileFormat12.getFilesuffix(), new AsfFileReader());
    Map<String, AudioFileReader> map13 = this.readers;
    SupportedFileFormat supportedFileFormat13 = SupportedFileFormat.AIF;
    map13.put(supportedFileFormat13.getFilesuffix(), new AiffFileReader());
    Map<String, AudioFileReader> map14 = this.readers;
    SupportedFileFormat supportedFileFormat14 = SupportedFileFormat.AIFC;
    map14.put(supportedFileFormat14.getFilesuffix(), new AiffFileReader());
    Map<String, AudioFileReader> map15 = this.readers;
    SupportedFileFormat supportedFileFormat15 = SupportedFileFormat.AIFF;
    map15.put(supportedFileFormat15.getFilesuffix(), new AiffFileReader());
    Map<String, AudioFileReader> map16 = this.readers;
    SupportedFileFormat supportedFileFormat16 = SupportedFileFormat.OPUS;
    map16.put(supportedFileFormat16.getFilesuffix(), new OpusFileReader());
    this.readers.put(SupportedFileFormat.RA.getFilesuffix(), new RealFileReader());
    this.readers.put(SupportedFileFormat.RM.getFilesuffix(), new RealFileReader());
    this.writers.put(supportedFileFormat1.getFilesuffix(), new OggFileWriter());
    this.writers.put(supportedFileFormat2.getFilesuffix(), new OggFileWriter());
    this.writers.put(supportedFileFormat16.getFilesuffix(), new OpusFileWriter());
    this.writers.put(supportedFileFormat3.getFilesuffix(), new FlacFileWriter());
    this.writers.put(supportedFileFormat4.getFilesuffix(), new MP3FileWriter());
    this.writers.put(supportedFileFormat5.getFilesuffix(), new Mp4FileWriter());
    this.writers.put(supportedFileFormat6.getFilesuffix(), new Mp4FileWriter());
    this.writers.put(supportedFileFormat7.getFilesuffix(), new Mp4FileWriter());
    this.writers.put(supportedFileFormat8.getFilesuffix(), new Mp4FileWriter());
    this.writers.put(supportedFileFormat9.getFilesuffix(), new Mp4FileWriter());
    this.writers.put(supportedFileFormat10.getFilesuffix(), new WavFileWriter());
    this.writers.put(supportedFileFormat11.getFilesuffix(), new AsfFileWriter());
    this.writers.put(supportedFileFormat12.getFilesuffix(), new AsfFileWriter());
    this.writers.put(supportedFileFormat13.getFilesuffix(), new AiffFileWriter());
    this.writers.put(supportedFileFormat14.getFilesuffix(), new AiffFileWriter());
    this.writers.put(supportedFileFormat15.getFilesuffix(), new AiffFileWriter());
    Iterator<AudioFileWriter> iterator = this.writers.values().iterator();
    while (iterator.hasNext())
      ((AudioFileWriter)iterator.next()).setAudioFileModificationListener((AudioFileModificationListener)this.modificationHandler); 
  }
  
  public static AudioFile read(u00 paramu00) {
    return getDefaultAudioFileIO().readFile(paramu00);
  }
  
  public static AudioFile readMagic(u00 paramu00) {
    return getDefaultAudioFileIO().readFileMagic(paramu00);
  }
  
  public static void write(AudioFile paramAudioFile) {
    getDefaultAudioFileIO().writeFile(paramAudioFile, null);
  }
  
  public static void writeAs(AudioFile paramAudioFile, u00 paramu00) {
    getDefaultAudioFileIO().writeFile(paramAudioFile, paramu00);
  }
  
  public void addAudioFileModificationListener(AudioFileModificationListener paramAudioFileModificationListener) {
    this.modificationHandler.addAudioFileModificationListener(paramAudioFileModificationListener);
  }
  
  public AudioFile readFile(u00 paramu00) {
    String str = Utils.getExtension(paramu00);
    AudioFileReader audioFileReader = this.readers.get(str);
    if (audioFileReader != null) {
      AudioFile audioFile = audioFileReader.read(paramu00);
      audioFile.setExt(str);
      return audioFile;
    } 
    throw new CannotReadException(MessageFormat.format("No Reader associated with this extension:{0}", new Object[] { str }));
  }
  
  public AudioFile readFileMagic(u00 paramu00) {
    String str = Utils.getMagicExtension(paramu00);
    AudioFileReader audioFileReader = this.readers.get(str);
    if (audioFileReader != null) {
      AudioFile audioFile = audioFileReader.read(paramu00);
      audioFile.setExt(str);
      return audioFile;
    } 
    throw new UnknownFileFormatException(MessageFormat.format("No Reader associated with this extension:{0}", new Object[] { str }));
  }
  
  public void removeAudioFileModificationListener(AudioFileModificationListener paramAudioFileModificationListener) {
    this.modificationHandler.removeAudioFileModificationListener(paramAudioFileModificationListener);
  }
  
  public void writeFile(AudioFile paramAudioFile, u00 paramu00) {
    StringBuilder stringBuilder;
    String str = paramAudioFile.getExt();
    if (paramu00 != null)
      try {
        Utils.copyThrowsOnException(paramAudioFile.getFile(), paramu00);
        paramAudioFile.setFile(paramu00);
      } catch (IOException iOException) {
        String str1 = iOException.getMessage();
        stringBuilder = new StringBuilder("Error While Copying");
        stringBuilder.append(str1);
        throw new CannotWriteException(stringBuilder.toString());
      }  
    AudioFileWriter audioFileWriter = this.writers.get(str);
    if (audioFileWriter != null) {
      audioFileWriter.write((AudioFile)stringBuilder);
      return;
    } 
    throw new CannotWriteException(MessageFormat.format("No Writer associated with this extension:{0}", new Object[] { str }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\AudioFileIO.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */