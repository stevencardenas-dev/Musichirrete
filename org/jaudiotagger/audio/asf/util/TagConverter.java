package org.jaudiotagger.audio.asf.util;

import java.util.Iterator;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.ContainerType;
import org.jaudiotagger.audio.asf.data.MetadataContainer;
import org.jaudiotagger.audio.asf.data.MetadataContainerFactory;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.asf.AsfFieldKey;
import org.jaudiotagger.tag.asf.AsfTag;
import org.jaudiotagger.tag.asf.AsfTagBannerField;
import org.jaudiotagger.tag.asf.AsfTagCoverField;
import org.jaudiotagger.tag.asf.AsfTagField;
import org.jaudiotagger.tag.asf.AsfTagTextField;
import org.jaudiotagger.tag.reference.GenreTypes;

public final class TagConverter {
  static final boolean $assertionsDisabled = false;
  
  public static void assignCommonTagValues(Tag paramTag, MetadataContainer paramMetadataContainer) {
    FieldKey fieldKey2 = FieldKey.ALBUM;
    if (!Utils.isBlank(paramTag.getFirst(fieldKey2))) {
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(paramMetadataContainer.getContainerType(), AsfFieldKey.ALBUM.getFieldName(), 0);
      metadataDescriptor.setStringValue(paramTag.getFirst(fieldKey2));
      paramMetadataContainer.removeDescriptorsByName(metadataDescriptor.getName());
      paramMetadataContainer.addDescriptor(metadataDescriptor);
    } else {
      paramMetadataContainer.removeDescriptorsByName(AsfFieldKey.ALBUM.getFieldName());
    } 
    fieldKey2 = FieldKey.TRACK;
    if (!Utils.isBlank(paramTag.getFirst(fieldKey2))) {
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(paramMetadataContainer.getContainerType(), AsfFieldKey.TRACK.getFieldName(), 0);
      metadataDescriptor.setStringValue(paramTag.getFirst(fieldKey2));
      paramMetadataContainer.removeDescriptorsByName(metadataDescriptor.getName());
      paramMetadataContainer.addDescriptor(metadataDescriptor);
    } else {
      paramMetadataContainer.removeDescriptorsByName(AsfFieldKey.TRACK.getFieldName());
    } 
    fieldKey2 = FieldKey.YEAR;
    if (!Utils.isBlank(paramTag.getFirst(fieldKey2))) {
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(paramMetadataContainer.getContainerType(), AsfFieldKey.YEAR.getFieldName(), 0);
      metadataDescriptor.setStringValue(paramTag.getFirst(fieldKey2));
      paramMetadataContainer.removeDescriptorsByName(metadataDescriptor.getName());
      paramMetadataContainer.addDescriptor(metadataDescriptor);
    } else {
      paramMetadataContainer.removeDescriptorsByName(AsfFieldKey.YEAR.getFieldName());
    } 
    FieldKey fieldKey1 = FieldKey.GENRE;
    if (!Utils.isBlank(paramTag.getFirst(fieldKey1))) {
      MetadataDescriptor metadataDescriptor = new MetadataDescriptor(paramMetadataContainer.getContainerType(), AsfFieldKey.GENRE.getFieldName(), 0);
      metadataDescriptor.setStringValue(paramTag.getFirst(fieldKey1));
      paramMetadataContainer.removeDescriptorsByName(metadataDescriptor.getName());
      paramMetadataContainer.addDescriptor(metadataDescriptor);
      Integer integer = GenreTypes.getInstanceOf().getIdForName(paramTag.getFirst(fieldKey1));
      if (integer != null) {
        MetadataDescriptor metadataDescriptor1 = new MetadataDescriptor(paramMetadataContainer.getContainerType(), AsfFieldKey.GENRE_ID.getFieldName(), 0);
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(integer);
        stringBuilder.append(")");
        metadataDescriptor1.setStringValue(stringBuilder.toString());
        paramMetadataContainer.removeDescriptorsByName(metadataDescriptor1.getName());
        paramMetadataContainer.addDescriptor(metadataDescriptor1);
        return;
      } 
      paramMetadataContainer.removeDescriptorsByName(AsfFieldKey.GENRE_ID.getFieldName());
      return;
    } 
    paramMetadataContainer.removeDescriptorsByName(AsfFieldKey.GENRE.getFieldName());
    paramMetadataContainer.removeDescriptorsByName(AsfFieldKey.GENRE_ID.getFieldName());
  }
  
  public static AsfTag createTagOf(AsfHeader paramAsfHeader) {
    AsfTag asfTag = new AsfTag(true);
    for (byte b = 0; b < (ContainerType.values()).length; b++) {
      MetadataContainer metadataContainer = paramAsfHeader.findMetadataContainer(ContainerType.values()[b]);
      if (metadataContainer != null)
        for (MetadataDescriptor metadataDescriptor : metadataContainer.getDescriptors()) {
          AsfTagField asfTagField;
          AsfTagTextField asfTagTextField;
          if (metadataDescriptor.getType() == 1) {
            AsfTagCoverField asfTagCoverField;
            if (metadataDescriptor.getName().equals(AsfFieldKey.COVER_ART.getFieldName())) {
              asfTagCoverField = new AsfTagCoverField(metadataDescriptor);
            } else {
              AsfTagBannerField asfTagBannerField;
              if (asfTagCoverField.getName().equals(AsfFieldKey.BANNER_IMAGE.getFieldName())) {
                asfTagBannerField = new AsfTagBannerField((MetadataDescriptor)asfTagCoverField);
              } else {
                asfTagField = new AsfTagField((MetadataDescriptor)asfTagBannerField);
              } 
            } 
          } else {
            asfTagTextField = new AsfTagTextField((MetadataDescriptor)asfTagField);
          } 
          asfTag.addField((TagField)asfTagTextField);
        }  
    } 
    return asfTag;
  }
  
  public static MetadataContainer[] distributeMetadata(AsfTag paramAsfTag) {
    Iterator<AsfTagField> iterator = paramAsfTag.getAsfFields();
    MetadataContainer[] arrayOfMetadataContainer = MetadataContainerFactory.getInstance().createContainers(ContainerType.getOrdered());
    while (iterator.hasNext()) {
      AsfTagField asfTagField = iterator.next();
      boolean bool = false;
      byte b = 0;
      while (!bool && b < arrayOfMetadataContainer.length) {
        boolean bool1 = bool;
        if (ContainerType.areInCorrectOrder(arrayOfMetadataContainer[b].getContainerType(), AsfFieldKey.getAsfFieldKey(asfTagField.getId()).getHighestContainer())) {
          bool1 = bool;
          if (arrayOfMetadataContainer[b].isAddSupported(asfTagField.getDescriptor())) {
            arrayOfMetadataContainer[b].addDescriptor(asfTagField.getDescriptor());
            bool1 = true;
          } 
        } 
        b++;
        bool = bool1;
      } 
    } 
    return arrayOfMetadataContainer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\as\\util\TagConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */