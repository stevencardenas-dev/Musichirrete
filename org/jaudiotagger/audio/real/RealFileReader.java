package org.jaudiotagger.audio.real;

import java.io.DataInputStream;
import k91;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import uc1;

public class RealFileReader extends AudioFileReader {
  private RealChunk findContChunk(uc1 paramuc1) {
    RealChunk.readChunk(paramuc1);
    RealChunk.readChunk(paramuc1);
    RealChunk realChunk;
    for (realChunk = RealChunk.readChunk(paramuc1); !realChunk.isCONT(); realChunk = RealChunk.readChunk(paramuc1));
    return realChunk;
  }
  
  private RealChunk findPropChunk(uc1 paramuc1) {
    RealChunk.readChunk(paramuc1);
    return RealChunk.readChunk(paramuc1);
  }
  
  public GenericAudioHeader getEncodingInfo(uc1 paramuc1) {
    GenericAudioHeader genericAudioHeader = new GenericAudioHeader();
    DataInputStream dataInputStream = findPropChunk(paramuc1).getDataInputStream();
    if (Utils.readUint16(dataInputStream) == 0) {
      boolean bool;
      long l2 = Utils.readUint32(dataInputStream) / 1000L;
      long l1 = Utils.readUint32(dataInputStream) / 1000L;
      Utils.readUint32(dataInputStream);
      Utils.readUint32(dataInputStream);
      Utils.readUint32(dataInputStream);
      int i = (int)Utils.readUint32(dataInputStream) / 1000;
      Utils.readUint32(dataInputStream);
      Utils.readUint32(dataInputStream);
      Utils.readUint32(dataInputStream);
      Utils.readUint16(dataInputStream);
      Utils.readUint16(dataInputStream);
      genericAudioHeader.setBitRate((int)l1);
      genericAudioHeader.setPreciseLength(i);
      if (l2 != l1) {
        bool = true;
      } else {
        bool = false;
      } 
      genericAudioHeader.setVariableBitRate(bool);
      genericAudioHeader.setFormat(SupportedFileFormat.RA.getDisplayName());
    } 
    return genericAudioHeader;
  }
  
  public Tag getTag(uc1 paramuc1) {
    DataInputStream dataInputStream = findContChunk(paramuc1).getDataInputStream();
    String str3 = Utils.readString(dataInputStream, Utils.readUint16(dataInputStream));
    String str1 = Utils.readString(dataInputStream, Utils.readUint16(dataInputStream));
    String str2 = Utils.readString(dataInputStream, Utils.readUint16(dataInputStream));
    String str4 = Utils.readString(dataInputStream, Utils.readUint16(dataInputStream));
    RealTag realTag = new RealTag();
    try {
      String str;
      FieldKey fieldKey2 = FieldKey.TITLE;
      if (str3.length() == 0) {
        str = str1;
      } else {
        str = str3;
      } 
      realTag.addField(fieldKey2, new String[] { str });
      FieldKey fieldKey1 = FieldKey.ARTIST;
      if (str3.length() == 0)
        str1 = str2; 
      realTag.addField(fieldKey1, new String[] { str1 });
      realTag.addField(FieldKey.COMMENT, new String[] { str4 });
      return (Tag)realTag;
    } catch (FieldDataInvalidException fieldDataInvalidException) {
      k91.n((Throwable)fieldDataInvalidException);
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\real\RealFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */