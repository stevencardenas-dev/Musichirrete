package org.jaudiotagger.tag.id3.reference;

import ga1;
import l0;

public class MediaMonkeyPlayerRating extends ID3Rating {
  private static ID3Rating rating;
  
  public static ID3Rating getInstance() {
    if (rating == null)
      rating = new MediaMonkeyPlayerRating(); 
    return rating;
  }
  
  public int convertRatingFromFiveStarScale(int paramInt) {
    if (paramInt >= 0 && paramInt <= 5)
      return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? ((paramInt != 5) ? 0 : 255) : 196) : 128) : 64) : 1; 
    l0.l(ga1.i("convert Ratings from Five Star Scale accepts values from 0 to 5 not:", paramInt));
    return 0;
  }
  
  public int convertRatingToFiveStarScale(int paramInt) {
    return (paramInt <= 0) ? 0 : ((paramInt <= 1) ? 1 : ((paramInt <= 8) ? 0 : ((paramInt <= 18) ? 1 : ((paramInt <= 28) ? 1 : ((paramInt <= 28) ? 1 : ((paramInt <= 28) ? 1 : ((paramInt <= 28) ? 1 : ((paramInt <= 29) ? 2 : ((paramInt <= 39) ? 1 : ((paramInt <= 49) ? 1 : ((paramInt <= 113) ? 2 : ((paramInt <= 167) ? 3 : ((paramInt <= 218) ? 4 : 5)))))))))))));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\reference\MediaMonkeyPlayerRating.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */