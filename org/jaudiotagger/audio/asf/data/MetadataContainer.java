package org.jaudiotagger.audio.asf.data;

import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0;
import org.jaudiotagger.audio.asf.io.WriteableChunk;
import org.jaudiotagger.audio.asf.util.Utils;

public class MetadataContainer extends Chunk implements WriteableChunk {
  static final boolean $assertionsDisabled = false;
  
  private final ContainerType containerType;
  
  private final Map<DescriptorPointer, List<MetadataDescriptor>> descriptors = new Hashtable<DescriptorPointer, List<MetadataDescriptor>>();
  
  private final DescriptorPointer perfPoint = new DescriptorPointer(new MetadataDescriptor(""));
  
  public MetadataContainer(ContainerType paramContainerType) {
    this(paramContainerType, 0L, BigInteger.ZERO);
  }
  
  public MetadataContainer(ContainerType paramContainerType, long paramLong, BigInteger paramBigInteger) {
    super(paramContainerType.getContainerGUID(), paramLong, paramBigInteger);
    this.containerType = paramContainerType;
  }
  
  public MetadataContainer(GUID paramGUID, long paramLong, BigInteger paramBigInteger) {
    this(determineType(paramGUID), paramLong, paramBigInteger);
  }
  
  private static ContainerType determineType(GUID paramGUID) {
    // Byte code:
    //   0: invokestatic values : ()[Lorg/jaudiotagger/audio/asf/data/ContainerType;
    //   3: astore #4
    //   5: aload #4
    //   7: arraylength
    //   8: istore_2
    //   9: iconst_0
    //   10: istore_1
    //   11: iload_1
    //   12: iload_2
    //   13: if_icmpge -> 41
    //   16: aload #4
    //   18: iload_1
    //   19: aaload
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual getContainerGUID : ()Lorg/jaudiotagger/audio/asf/data/GUID;
    //   25: aload_0
    //   26: invokevirtual equals : (Ljava/lang/Object;)Z
    //   29: ifeq -> 35
    //   32: goto -> 43
    //   35: iinc #1, 1
    //   38: goto -> 11
    //   41: aconst_null
    //   42: astore_3
    //   43: aload_3
    //   44: ifnull -> 49
    //   47: aload_3
    //   48: areturn
    //   49: new java/lang/StringBuilder
    //   52: dup
    //   53: ldc 'Unknown metadata container specified by GUID ('
    //   55: invokespecial <init> : (Ljava/lang/String;)V
    //   58: astore_3
    //   59: aload_3
    //   60: aload_0
    //   61: invokevirtual toString : ()Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: ldc ')'
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: new java/lang/IllegalArgumentException
    //   78: dup
    //   79: aload_3
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: athrow
  }
  
  public final void addDescriptor(MetadataDescriptor paramMetadataDescriptor) {
    this.containerType.assertConstraints(paramMetadataDescriptor.getName(), paramMetadataDescriptor.getRawData(), paramMetadataDescriptor.getType(), paramMetadataDescriptor.getStreamNumber(), paramMetadataDescriptor.getLanguageIndex());
    if (isAddSupported(paramMetadataDescriptor)) {
      DescriptorPointer descriptorPointer;
      List<MetadataDescriptor> list;
      synchronized (this.perfPoint) {
        List<MetadataDescriptor> list1 = this.descriptors.get(this.perfPoint.setDescriptor(paramMetadataDescriptor));
        if (list1 == null) {
          list = new ArrayList();
          this.descriptors.put(new DescriptorPointer(paramMetadataDescriptor), list);
        } else {
          list = list1;
          if (!list1.isEmpty())
            if (this.containerType.isMultiValued()) {
              list = list1;
            } else {
              l0.l("Container does not allow multiple values of descriptors with same name, language index and stream number");
              return;
            }  
        } 
        list.add(paramMetadataDescriptor);
        return;
      } 
    } 
    l0.l("Descriptor cannot be added, see isAddSupported(...)");
  }
  
  public final MetadataDescriptor assertDescriptor(String paramString) {
    return assertDescriptor(paramString, 0);
  }
  
  public final MetadataDescriptor assertDescriptor(String paramString, int paramInt) {
    List<MetadataDescriptor> list = getDescriptorsByName(paramString);
    if (list == null || list.isEmpty()) {
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(getContainerType(), paramString, paramInt);
      addDescriptor(metadataDescriptor);
      return metadataDescriptor;
    } 
    return list.get(0);
  }
  
  public final boolean containsDescriptor(MetadataDescriptor paramMetadataDescriptor) {
    return this.descriptors.containsKey(this.perfPoint.setDescriptor(paramMetadataDescriptor));
  }
  
  public final ContainerType getContainerType() {
    return this.containerType;
  }
  
  public long getCurrentAsfChunkSize() {
    Iterator<MetadataDescriptor> iterator = getDescriptors().iterator();
    long l;
    for (l = 26L; iterator.hasNext(); l += ((MetadataDescriptor)iterator.next()).getCurrentAsfSize(this.containerType));
    return l;
  }
  
  public final int getDescriptorCount() {
    return getDescriptors().size();
  }
  
  public final List<MetadataDescriptor> getDescriptors() {
    ArrayList<MetadataDescriptor> arrayList = new ArrayList();
    Iterator<List> iterator = this.descriptors.values().iterator();
    while (iterator.hasNext())
      arrayList.addAll(iterator.next()); 
    return arrayList;
  }
  
  public final List<MetadataDescriptor> getDescriptorsByName(String paramString) {
    ArrayList<MetadataDescriptor> arrayList = new ArrayList();
    for (List<MetadataDescriptor> list : this.descriptors.values()) {
      if (!list.isEmpty() && ((MetadataDescriptor)list.get(0)).getName().equals(paramString))
        arrayList.addAll(list); 
    } 
    return arrayList;
  }
  
  public final String getValueFor(String paramString) {
    List<MetadataDescriptor> list = getDescriptorsByName(paramString);
    return (list != null && !list.isEmpty()) ? ((MetadataDescriptor)list.get(0)).getString() : "";
  }
  
  public final boolean hasDescriptor(String paramString) {
    return getDescriptorsByName(paramString).isEmpty() ^ true;
  }
  
  public boolean isAddSupported(MetadataDescriptor paramMetadataDescriptor) {
    boolean bool;
    if (getContainerType().checkConstraints(paramMetadataDescriptor.getName(), paramMetadataDescriptor.getRawData(), paramMetadataDescriptor.getType(), paramMetadataDescriptor.getStreamNumber(), paramMetadataDescriptor.getLanguageIndex()) == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool && !getContainerType().isMultiValued()) {
      DescriptorPointer descriptorPointer = this.perfPoint;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=InnerObjectType{ObjectType{org/jaudiotagger/audio/asf/data/MetadataContainer}.Lorg/jaudiotagger/audio/asf/data/MetadataContainer$DescriptorPointer;}, name=null} */
      try {
        List list = this.descriptors.get(this.perfPoint.setDescriptor(paramMetadataDescriptor));
        if (list != null)
          bool = list.isEmpty(); 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=InnerObjectType{ObjectType{org/jaudiotagger/audio/asf/data/MetadataContainer}.Lorg/jaudiotagger/audio/asf/data/MetadataContainer$DescriptorPointer;}, name=null} */
      return bool;
    } 
    return bool;
  }
  
  public final boolean isEmpty() {
    int i = getDescriptorCount();
    boolean bool2 = true;
    boolean bool1 = true;
    if (i != 0) {
      Iterator<MetadataDescriptor> iterator = getDescriptors().iterator();
      while (true) {
        bool2 = bool1;
        if (bool1) {
          bool2 = bool1;
          if (iterator.hasNext()) {
            bool1 &= ((MetadataDescriptor)iterator.next()).isEmpty();
            continue;
          } 
        } 
        break;
      } 
    } 
    return bool2;
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    for (MetadataDescriptor metadataDescriptor : getDescriptors()) {
      stringBuilder.append(paramString);
      stringBuilder.append("  |-> ");
      stringBuilder.append(metadataDescriptor);
      stringBuilder.append(Utils.LINE_SEPARATOR);
    } 
    return stringBuilder.toString();
  }
  
  public final void removeDescriptorsByName(String paramString) {
    Iterator<List> iterator = this.descriptors.values().iterator();
    while (iterator.hasNext()) {
      List<MetadataDescriptor> list = iterator.next();
      if (!list.isEmpty() && ((MetadataDescriptor)list.get(0)).getName().equals(paramString))
        iterator.remove(); 
    } 
  }
  
  public final void setStringValue(String paramString1, String paramString2) {
    assertDescriptor(paramString1).setStringValue(paramString2);
  }
  
  public long writeInto(OutputStream paramOutputStream) {
    long l = getCurrentAsfChunkSize();
    List<MetadataDescriptor> list = getDescriptors();
    paramOutputStream.write(getGuid().getBytes());
    Utils.writeUINT64(l, paramOutputStream);
    Utils.writeUINT16(list.size(), paramOutputStream);
    Iterator<MetadataDescriptor> iterator = list.iterator();
    while (iterator.hasNext())
      ((MetadataDescriptor)iterator.next()).writeInto(paramOutputStream, this.containerType); 
    return l;
  }
  
  public static final class DescriptorPointer {
    static final boolean $assertionsDisabled = false;
    
    private MetadataDescriptor desc;
    
    public DescriptorPointer(MetadataDescriptor param1MetadataDescriptor) {
      setDescriptor(param1MetadataDescriptor);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool2;
      boolean bool1 = false;
      if (param1Object == this) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (param1Object instanceof DescriptorPointer && !bool2) {
        boolean bool;
        param1Object = ((DescriptorPointer)param1Object).desc;
        bool2 = this.desc.getName().equals(param1Object.getName());
        if (this.desc.getLanguageIndex() == param1Object.getLanguageIndex()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (this.desc.getStreamNumber() == param1Object.getStreamNumber())
          bool1 = true; 
        return bool2 & bool & bool1;
      } 
      return bool2;
    }
    
    public int hashCode() {
      int i = this.desc.getName().hashCode();
      int j = this.desc.getLanguageIndex();
      return this.desc.getStreamNumber() + (j + i * 31) * 31;
    }
    
    public DescriptorPointer setDescriptor(MetadataDescriptor param1MetadataDescriptor) {
      this.desc = param1MetadataDescriptor;
      return this;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\MetadataContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */