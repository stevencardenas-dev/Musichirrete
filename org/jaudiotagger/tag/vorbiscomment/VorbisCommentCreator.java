package org.jaudiotagger.tag.vorbiscomment;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import k91;
import mk;
import org.jaudiotagger.audio.generic.AbstractTagCreator;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;

public class VorbisCommentCreator extends AbstractTagCreator {
  public ByteBuffer convertMetadata(Tag paramTag, boolean paramBoolean) {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      String str = ((VorbisCommentTag)paramTag).getVendor();
      Charset charset = mk.c;
      byteArrayOutputStream.write(Utils.getSizeLEInt32((str.getBytes(charset)).length));
      byteArrayOutputStream.write(str.getBytes(charset));
      int j = paramTag.getFieldCount();
      int i = j;
      if (((VorbisCommentTag)paramTag).hasField(VorbisCommentFieldKey.VENDOR))
        i = j - 1; 
      byteArrayOutputStream.write(Utils.getSizeLEInt32(i));
      Iterator<TagField> iterator = paramTag.getFields();
      while (iterator.hasNext()) {
        TagField tagField = iterator.next();
        if (tagField.getId().equals(VorbisCommentFieldKey.VENDOR.getFieldName()))
          continue; 
        byteArrayOutputStream.write(tagField.getRawContent());
      } 
      ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
      byteBuffer.rewind();
      return byteBuffer;
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisCommentCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */