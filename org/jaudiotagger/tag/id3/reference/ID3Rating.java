package org.jaudiotagger.tag.id3.reference;

import org.jaudiotagger.tag.reference.Tagger;

public abstract class ID3Rating {
  public static ID3Rating getInstance(Tagger paramTagger) {
    int i = null.$SwitchMap$org$jaudiotagger$tag$reference$Tagger[paramTagger.ordinal()];
    return (i != 1) ? ((i != 2) ? ((i != 3) ? MediaPlayerRating.getInstance() : MediaPlayerRating.getInstance()) : MediaMonkeyPlayerRating.getInstance()) : ITunesRating.getInstance();
  }
  
  public abstract int convertRatingFromFiveStarScale(int paramInt);
  
  public abstract int convertRatingToFiveStarScale(int paramInt);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\reference\ID3Rating.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */