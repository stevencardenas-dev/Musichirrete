package org.jaudiotagger.audio.ogg;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.ogg.util.OggInfoReader;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.tag.Tag;
import u00;
import uc1;

public class OggFileReader extends AudioFileReader {
  public static Logger logger;
  
  private OggInfoReader ir = new OggInfoReader();
  
  private OggVorbisTagReader vtr = new OggVorbisTagReader();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public GenericAudioHeader getEncodingInfo(uc1 paramuc1) {
    return this.ir.read(paramuc1);
  }
  
  public Tag getTag(uc1 paramuc1) {
    return this.vtr.read(paramuc1);
  }
  
  public OggPageHeader readOggPageHeader(uc1 paramuc1, int paramInt) {
    OggPageHeader oggPageHeader = OggPageHeader.read(paramuc1);
    while (paramInt > 0) {
      paramuc1.h(paramuc1.c() + oggPageHeader.getPageLength());
      oggPageHeader = OggPageHeader.read(paramuc1);
      paramInt--;
    } 
    return oggPageHeader;
  }
  
  public void shortSummarizeOggPageHeaders(u00 paramu00) {
    uc1 uc1 = new uc1(paramu00, "r");
    int i = 0;
    while (uc1.c() < uc1.d()) {
      PrintStream printStream1 = System.out;
      StringBuilder stringBuilder1 = new StringBuilder("pageHeader starts at absolute file position:");
      stringBuilder1.append(uc1.c());
      printStream1.println(stringBuilder1.toString());
      OggPageHeader oggPageHeader = OggPageHeader.read(uc1);
      PrintStream printStream2 = System.out;
      StringBuilder stringBuilder2 = new StringBuilder("pageHeader finishes at absolute file position:");
      stringBuilder2.append(uc1.c());
      printStream2.println(stringBuilder2.toString());
      printStream2 = System.out;
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(oggPageHeader);
      stringBuilder2.append("\n");
      printStream2.println(stringBuilder2.toString());
      uc1.h(uc1.c() + oggPageHeader.getPageLength());
      int j = i + 1;
      i = j;
      if (j >= 5)
        break; 
    } 
    PrintStream printStream = System.out;
    StringBuilder stringBuilder = new StringBuilder("Raf File Pointer at:");
    stringBuilder.append(uc1.c());
    stringBuilder.append("File Size is:");
    stringBuilder.append(uc1.d());
    printStream.println(stringBuilder.toString());
    uc1.close();
  }
  
  public void summarizeOggPageHeaders(u00 paramu00) {
    uc1 uc1 = new uc1(paramu00, "r");
    while (uc1.c() < uc1.d()) {
      PrintStream printStream1 = System.out;
      StringBuilder stringBuilder1 = new StringBuilder("pageHeader starts at absolute file position:");
      stringBuilder1.append(uc1.c());
      printStream1.println(stringBuilder1.toString());
      OggPageHeader oggPageHeader = OggPageHeader.read(uc1);
      printStream1 = System.out;
      StringBuilder stringBuilder2 = new StringBuilder("pageHeader finishes at absolute file position:");
      stringBuilder2.append(uc1.c());
      printStream1.println(stringBuilder2.toString());
      printStream1 = System.out;
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(oggPageHeader);
      stringBuilder2.append("\n");
      printStream1.println(stringBuilder2.toString());
      uc1.h(uc1.c() + oggPageHeader.getPageLength());
    } 
    PrintStream printStream = System.out;
    StringBuilder stringBuilder = new StringBuilder("Raf File Pointer at:");
    stringBuilder.append(uc1.c());
    stringBuilder.append("File Size is:");
    stringBuilder.append(uc1.d());
    printStream.println(stringBuilder.toString());
    uc1.close();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\ogg\OggFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */