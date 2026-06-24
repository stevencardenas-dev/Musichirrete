package org.jaudiotagger.audio.asf.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import l0;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class AsfStreamer {
  private void copyChunk(GUID paramGUID, InputStream paramInputStream, OutputStream paramOutputStream) {
    long l = Utils.readUINT64(paramInputStream);
    paramOutputStream.write(paramGUID.getBytes());
    Utils.writeUINT64(l, paramOutputStream);
    Utils.copy(paramInputStream, paramOutputStream, l - 24L);
  }
  
  private void modifyFileHeader(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong) {
    paramOutputStream.write(GUID.GUID_FILE.getBytes());
    long l = Utils.readUINT64(paramInputStream);
    Utils.writeUINT64(l, paramOutputStream);
    paramOutputStream.write(Utils.readGUID(paramInputStream).getBytes());
    Utils.writeUINT64(Utils.readUINT64(paramInputStream) + paramLong, paramOutputStream);
    Utils.copy(paramInputStream, paramOutputStream, l - 48L);
  }
  
  public void createModifiedCopy(InputStream paramInputStream, OutputStream paramOutputStream, List<ChunkModifier> paramList) {
    ArrayList<ChunkModifier> arrayList = new ArrayList();
    if (paramList != null)
      arrayList.addAll(paramList); 
    GUID gUID = Utils.readGUID(paramInputStream);
    if (GUID.GUID_HEADER.equals(gUID)) {
      long l1 = Utils.readUINT64(paramInputStream);
      long l5 = Utils.readUINT32(paramInputStream);
      byte b2 = (byte)(paramInputStream.read() & 0xFF);
      byte b1 = (byte)(paramInputStream.read() & 0xFF);
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      long l4 = 0L;
      long l3 = 0L;
      long l2 = 0L;
      ByteArrayOutputStream byteArrayOutputStream1 = null;
      while (l4 < l5) {
        long l6;
        long l7;
        ByteArrayOutputStream byteArrayOutputStream;
        GUID gUID1 = Utils.readGUID(paramInputStream);
        if (GUID.GUID_FILE.equals(gUID1)) {
          byteArrayOutputStream1 = new ByteArrayOutputStream();
          l6 = Utils.readUINT64(paramInputStream);
          Utils.writeUINT64(l6, byteArrayOutputStream1);
          Utils.copy(paramInputStream, byteArrayOutputStream1, l6 - 24L);
          byte[] arrayOfByte = byteArrayOutputStream1.toByteArray();
          l6 = l3;
          l7 = l2;
        } else {
          byte b3 = 0;
          boolean bool = false;
          while (b3 < arrayList.size() && !bool) {
            if (((ChunkModifier)arrayList.get(b3)).isApplicable(gUID1)) {
              ModificationResult modificationResult = ((ChunkModifier)arrayList.get(b3)).modify(gUID1, paramInputStream, byteArrayOutputStream2);
              l2 += modificationResult.getChunkCountDifference();
              l3 += modificationResult.getByteDifference();
              arrayList.remove(b3);
              bool = true;
            } 
            b3++;
          } 
          long l = l1;
          byteArrayOutputStream = byteArrayOutputStream1;
          l6 = l3;
          l7 = l2;
          l1 = l;
          if (!bool) {
            copyChunk(gUID1, paramInputStream, byteArrayOutputStream2);
            l1 = l;
            l7 = l2;
            l6 = l3;
            byteArrayOutputStream = byteArrayOutputStream1;
          } 
        } 
        l4++;
        byteArrayOutputStream1 = byteArrayOutputStream;
        l3 = l6;
        l2 = l7;
      } 
      int i = arrayList.size();
      l4 = l3;
      byte b = 0;
      l3 = l2;
      for (l2 = l4; b < i; l2 += modificationResult.getByteDifference()) {
        ModificationResult modificationResult = (ModificationResult)arrayList.get(b);
        b++;
        modificationResult = ((ChunkModifier)modificationResult).modify(null, null, byteArrayOutputStream2);
        l3 += modificationResult.getChunkCountDifference();
      } 
      paramOutputStream.write(gUID.getBytes());
      Utils.writeUINT64(l1 + l2, paramOutputStream);
      Utils.writeUINT32(l5 + l3, paramOutputStream);
      paramOutputStream.write(new byte[] { b2, b1 });
      modifyFileHeader(new ByteArrayInputStream((byte[])byteArrayOutputStream1), paramOutputStream, l2);
      paramOutputStream.write(byteArrayOutputStream2.toByteArray());
      Utils.flush(paramInputStream, paramOutputStream);
      return;
    } 
    l0.l("No ASF header object.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\AsfStreamer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */