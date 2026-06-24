package org.jaudiotagger.audio.asf.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class AsfExtHeaderModifier implements ChunkModifier {
  static final boolean $assertionsDisabled = false;
  
  private final List<ChunkModifier> modifierList;
  
  public AsfExtHeaderModifier(List<ChunkModifier> paramList) {
    this.modifierList = new ArrayList<ChunkModifier>(paramList);
  }
  
  private void copyChunk(GUID paramGUID, InputStream paramInputStream, OutputStream paramOutputStream) {
    long l = Utils.readUINT64(paramInputStream);
    paramOutputStream.write(paramGUID.getBytes());
    Utils.writeUINT64(l, paramOutputStream);
    Utils.copy(paramInputStream, paramOutputStream, l - 24L);
  }
  
  public boolean isApplicable(GUID paramGUID) {
    return GUID.GUID_HEADER_EXTENSION.equals(paramGUID);
  }
  
  public ModificationResult modify(GUID paramGUID, InputStream paramInputStream, OutputStream paramOutputStream) {
    ArrayList<ChunkModifier> arrayList = new ArrayList<ChunkModifier>(this.modifierList);
    HashSet<GUID> hashSet = new HashSet();
    hashSet.add(paramGUID);
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    paramGUID = Utils.readGUID(paramInputStream);
    int i = Utils.readUINT16(paramInputStream);
    long l2 = Utils.readUINT32(paramInputStream);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramInputStream = new CountingInputStream(paramInputStream);
    long l1 = 0L;
    while (true) {
      long l = paramInputStream.getReadCount();
      byte b = 0;
      if (l < l2) {
        GUID gUID = Utils.readGUID(paramInputStream);
        boolean bool = false;
        while (b < arrayList.size() && !bool) {
          l = l1;
          if (((ChunkModifier)arrayList.get(b)).isApplicable(gUID)) {
            ModificationResult modificationResult = ((ChunkModifier)arrayList.get(b)).modify(gUID, paramInputStream, byteArrayOutputStream);
            l = l1 + modificationResult.getByteDifference();
            hashSet.addAll(modificationResult.getOccuredGUIDs());
            arrayList.remove(b);
            bool = true;
          } 
          b++;
          l1 = l;
        } 
        if (!bool) {
          hashSet.add(gUID);
          copyChunk(gUID, paramInputStream, byteArrayOutputStream);
        } 
        continue;
      } 
      int j = arrayList.size();
      b = 0;
      while (b < j) {
        paramInputStream = (InputStream)arrayList.get(b);
        b++;
        ModificationResult modificationResult = ((ChunkModifier)paramInputStream).modify(null, null, byteArrayOutputStream);
        l1 += modificationResult.getByteDifference();
        hashSet.addAll(modificationResult.getOccuredGUIDs());
      } 
      paramOutputStream.write(GUID.GUID_HEADER_EXTENSION.getBytes());
      Utils.writeUINT64(bigInteger.add(BigInteger.valueOf(l1)).longValue(), paramOutputStream);
      paramOutputStream.write(paramGUID.getBytes());
      Utils.writeUINT16(i, paramOutputStream);
      Utils.writeUINT32(l2 + l1, paramOutputStream);
      paramOutputStream.write(byteArrayOutputStream.toByteArray());
      return new ModificationResult(0, l1, hashSet);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\AsfExtHeaderModifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */