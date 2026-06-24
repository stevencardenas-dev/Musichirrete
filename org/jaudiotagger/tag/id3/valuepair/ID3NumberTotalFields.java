package org.jaudiotagger.tag.id3.valuepair;

import java.util.EnumSet;
import org.jaudiotagger.tag.FieldKey;

public class ID3NumberTotalFields {
  private static EnumSet<FieldKey> numberField = EnumSet.noneOf(FieldKey.class);
  
  private static EnumSet<FieldKey> totalField = EnumSet.noneOf(FieldKey.class);
  
  static {
    numberField.add(FieldKey.TRACK);
    numberField.add(FieldKey.DISC_NO);
    numberField.add(FieldKey.MOVEMENT_NO);
    totalField.add(FieldKey.TRACK_TOTAL);
    totalField.add(FieldKey.DISC_TOTAL);
    totalField.add(FieldKey.MOVEMENT_TOTAL);
  }
  
  public static boolean isNumber(FieldKey paramFieldKey) {
    return numberField.contains(paramFieldKey);
  }
  
  public static boolean isTotal(FieldKey paramFieldKey) {
    return totalField.contains(paramFieldKey);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\ID3NumberTotalFields.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */