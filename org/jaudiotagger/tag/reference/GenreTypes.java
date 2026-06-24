package org.jaudiotagger.tag.reference;

import com.google.android.material.tabs.xm.VDgS;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;
import r3.IKWi.AyxAR;

public class GenreTypes extends AbstractIntStringValuePair {
  private static final int MAX_GENRE_ID = 191;
  
  private static final int MAX_STANDARD_GENRE_ID = 125;
  
  private static GenreTypes genreTypes;
  
  private Map<String, Integer> nameToIdMap;
  
  private GenreTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "Blues");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "Classic Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "Country");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(3), "Dance");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(4), "Disco");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(5), "Funk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(6), "Grunge");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(7), "Hip-Hop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(8), "Jazz");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(9), "Metal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(10), "New Age");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(11), "Oldies");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(12), "Other");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(13), "Pop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(14), "R&B");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(15), "Rap");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(16), "Reggae");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(17), "Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(18), "Techno");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(19), "Industrial");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(20), "Alternative");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(21), "Ska");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(22), "Death Metal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(23), "Pranks");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(24), "Soundtrack");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(25), "Euro-Techno");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(26), "Ambient");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(27), "Trip-Hop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(28), "Vocal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(29), "Jazz+Funk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(30), "Fusion");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(31), "Trance");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(32), "Classical");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(33), "Instrumental");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(34), "Acid");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(35), "House");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(36), "Game");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(37), "Sound Clip");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(38), "Gospel");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(39), "Noise");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(40), "AlternRock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(41), "Bass");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(42), "Soul");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(43), "Punk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(44), "Space");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(45), "Meditative");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(46), "Instrumental Pop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(47), "Instrumental Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(48), "Ethnic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(49), "Gothic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(50), "Darkwave");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(51), "Techno-Industrial");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(52), "Electronic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(53), "Pop-Folk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(54), "Eurodance");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(55), "Dream");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(56), "Southern Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(57), VDgS.UPUHXuXCoeiCyJm);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(58), "Cult");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(59), "Gangsta");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(60), "Top 40");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(61), "Christian Rap");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(62), "Pop/Funk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(63), "Jungle");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(64), "Native American");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(65), "Cabaret");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(66), "New Wave");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(67), "Psychadelic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(68), "Rave");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(69), "Showtunes");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(70), "Trailer");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(71), "Lo-Fi");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(72), "Tribal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(73), "Acid Punk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(74), "Acid Jazz");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(75), "Polka");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(76), "Retro");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(77), "Musical");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(78), "Rock & Roll");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(79), "Hard Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(80), "Folk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(81), "Folk-Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(82), "National Folk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(83), JkpGFvCVQHzgc.DRyXxPkA);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(84), "Fast Fusion");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(85), "Bebob");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(86), "Latin");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(87), "Revival");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(88), "Celtic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(89), "Bluegrass");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(90), "Avantgarde");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(91), "Gothic Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(92), "Progressive Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(93), "Psychedelic Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(94), "Symphonic Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(95), "Slow Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(96), "Big Band");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(97), "Chorus");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(98), "Easy Listening");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(99), "Acoustic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(100), "Humour");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(101), "Speech");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(102), "Chanson");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(103), "Opera");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(104), "Chamber Music");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(105), "Sonata");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(106), "Symphony");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(107), "Booty Bass");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(108), "Primus");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(109), "Porn Groove");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(110), "Satire");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(111), "Slow Jam");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(112), "Club");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(113), "Tango");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(114), "Samba");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(115), "Folklore");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(116), "Ballad");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(117), "Power Ballad");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(118), "Rhythmic Soul");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(119), "Freestyle");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(120), JkpGFvCVQHzgc.gTeifhlwFNK);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(121), "Punk Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(122), "Drum Solo");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(123), "Acapella");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(124), "Euro-House");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(125), "Dance Hall");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(126), "Goa");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(127), "Drum & Bass");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(128), "Club-House");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(129), "Hardcore");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(130), "Terror");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(131), "Indie");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(132), "BritPop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(133), "Negerpunk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(134), "Polsk Punk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(135), "Beat");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(136), "Christian Gangsta Rap");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(137), "Heavy Metal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(138), "Black Metal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(139), "Crossover");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(140), "Contemporary Christian");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(141), "Christian Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(142), "Merengue");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(143), "Salsa");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(144), "Thrash Metal");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(145), "Anime");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(146), "JPop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(147), "SynthPop");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(148), "Abstract");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(149), "Art Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(150), "Baroque");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(151), "Bhangra");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(152), "Big Beat");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(153), "Breakbeat");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(154), "Chillout");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(155), "Downtempo");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(156), "Dub");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(157), "EBM");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(158), "Eclectic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(159), "Electro");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(160), "Electroclash");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(161), "Emo");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(162), "Experimental");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(163), AyxAR.gpqCXLEbyj);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(164), "Global");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(165), "IDM");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(166), "Illbient");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(167), "Industro-Goth");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(168), "Jam Band");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(169), "Krautrock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(170), "Leftfield");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(171), "Lounge");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(172), "Math Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(173), "New Romantic");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(174), "Nu-Breakz");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(175), uvJYmft.phLZ);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(176), "Post-Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(177), "Psytrance");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(178), "Shoegaze");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(179), "Space Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(180), "Trop Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(181), "World Music");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(182), "Neoclassical");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(183), "Audiobook");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(184), "Audio Theatre");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(185), CKYHNesT.zyTWfuRrvEEE);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(186), "Podcast");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(187), "Indie Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(188), "G-Funk");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(189), "Dubstep");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(190), "Garage Rock");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(191), "Psybient");
    createMaps();
    this.nameToIdMap = new LinkedHashMap<String, Integer>(((AbstractValuePair)this).idToValue.size());
    for (Map.Entry entry : ((AbstractValuePair)this).idToValue.entrySet())
      this.nameToIdMap.put(((String)entry.getValue()).toLowerCase(), (Integer)entry.getKey()); 
  }
  
  public static GenreTypes getInstanceOf() {
    if (genreTypes == null)
      genreTypes = new GenreTypes(); 
    return genreTypes;
  }
  
  public static int getMaxGenreId() {
    return 191;
  }
  
  public static int getMaxStandardGenreId() {
    return 125;
  }
  
  public Integer getIdForName(String paramString) {
    return this.nameToIdMap.get(paramString.toLowerCase());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\GenreTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */