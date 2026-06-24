package org.jaudiotagger.tag.mp4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import k91;
import mk;
import org.jaudiotagger.audio.generic.AbstractTagCreator;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.Mp4AtomIdentifier;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;

public class Mp4TagCreator extends AbstractTagCreator {
  public ByteBuffer convertMetadata(Tag paramTag, boolean paramBoolean) {
    try {
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      this();
      Iterator<TagField> iterator = paramTag.getFields();
      boolean bool = false;
      while (iterator.hasNext()) {
        byte[] arrayOfByte;
        TagField tagField = iterator.next();
        if (tagField instanceof org.jaudiotagger.tag.mp4.field.Mp4TagCoverField) {
          if (bool)
            continue; 
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          this();
          try {
            Iterator<Mp4TagField> iterator1 = paramTag.getFields(FieldKey.COVER_ART).iterator();
            while (iterator1.hasNext())
              byteArrayOutputStream.write(((Mp4TagField)iterator1.next()).getRawContentDataOnly()); 
            arrayOfByte = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream2.write(Utils.getSizeBEInt32(arrayOfByte.length + 8));
            byteArrayOutputStream2.write(Mp4FieldKey.ARTWORK.getFieldName().getBytes(mk.b));
            byteArrayOutputStream2.write(arrayOfByte);
            bool = true;
          } catch (KeyNotFoundException keyNotFoundException) {
            RuntimeException runtimeException = new RuntimeException();
            this("Unable to find COVERART Key");
            throw runtimeException;
          } 
          continue;
        } 
        byteArrayOutputStream2.write(arrayOfByte.getRawContent());
      } 
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      this();
      byteArrayOutputStream1.write(Utils.getSizeBEInt32(byteArrayOutputStream2.size() + 8));
      byteArrayOutputStream1.write(Mp4AtomIdentifier.ILST.getFieldName().getBytes(mk.b));
      byteArrayOutputStream1.write(byteArrayOutputStream2.toByteArray());
      ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayOutputStream1.toByteArray());
      byteBuffer.rewind();
      return byteBuffer;
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\Mp4TagCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */