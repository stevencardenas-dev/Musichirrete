import android.content.Context;
import android.media.audiofx.EnvironmentalReverb;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class j50 {
  public static int a;
  
  public static final HashMap b = new HashMap<Object, Object>();
  
  public static Context c = null;
  
  public static final HashMap d = new HashMap<Object, Object>(6);
  
  public static ArrayList e;
  
  public static ArrayList f;
  
  public static ArrayList g;
  
  public static JSONArray h;
  
  public static JSONArray i;
  
  public static final ArrayList j;
  
  public static final ArrayList k;
  
  public static final ArrayList l;
  
  public static final ArrayList m;
  
  public static final ArrayList n;
  
  static {
    String str3 = k50.a;
    ea1 ea11 = new ea1(new short[] { 0, 0, 0 }, str3);
    String str11 = k50.b;
    ea1 ea113 = new ea1(new short[] { 600, -100, 0 }, str11);
    String str2 = k50.c;
    ea1 ea19 = new ea1(new short[] { -100, 600, -100 }, str2);
    String str14 = k50.d;
    ea1 ea112 = new ea1(new short[] { 0, -100, 600 }, str14);
    String str8 = k50.e;
    ea1 ea16 = new ea1(new short[] { 600, -300, 600 }, str8);
    String str12 = k50.f;
    ea1 ea15 = new ea1(new short[] { 1000, -450, 0 }, str12);
    String str7 = k50.g;
    ea1 ea110 = new ea1(new short[] { -450, 1000, -450 }, str7);
    String str5 = k50.h;
    ea1 ea12 = new ea1(new short[] { 0, -450, 1000 }, str5);
    String str9 = k50.i;
    ea1 ea111 = new ea1(new short[] { -600, 0, 0 }, str9);
    String str4 = k50.j;
    ea1 ea14 = new ea1(new short[] { 0, -600, 0 }, str4);
    String str6 = k50.k;
    ea1 ea13 = new ea1(new short[] { 0, 0, -600 }, str6);
    String str13 = k50.l;
    ea1 ea18 = new ea1(new short[] { -1500, 0, 0 }, str13);
    String str10 = k50.m;
    ea1 ea17 = new ea1(new short[] { 0, -1500, 0 }, str10);
    String str1 = k50.n;
    j = new ArrayList(Arrays.asList((Object[])new ea1[] { 
            ea11, ea113, ea19, ea112, ea16, ea15, ea110, ea12, ea111, ea14, 
            ea13, ea18, ea17, new ea1(new short[] { 0, 0, -1500 }, str1) }));
    ea1 ea117 = new ea1(new short[] { 0, 0, 0, 0, 0 }, str3);
    ea1 ea116 = new ea1(new short[] { 600, 300, -300, -150, -150 }, str11);
    ea19 = new ea1(new short[] { -150, 100, 600, 100, -150 }, str2);
    ea1 ea118 = new ea1(new short[] { -150, -150, -300, 300, 600 }, str14);
    ea1 ea114 = new ea1(new short[] { 600, 150, -300, 150, 600 }, str8);
    ea17 = new ea1(new short[] { 1000, 450, -600, -450, -300 }, str12);
    ea18 = new ea1(new short[] { -300, 200, 1000, 200, -300 }, str7);
    ea110 = new ea1(new short[] { -300, -450, -600, 450, 1000 }, str5);
    ea15 = new ea1(new short[] { -1000, -450, 0, 0, 0 }, str9);
    ea1 ea119 = new ea1(new short[] { 0, -450, -1000, -450, 0 }, str4);
    ea1 ea120 = new ea1(new short[] { 0, 0, 0, -450, -1000 }, str6);
    ea1 ea115 = new ea1(new short[] { -1500, -900, 0, 0, 0 }, str13);
    ea16 = new ea1(new short[] { 0, -900, -1500, -900, 0 }, str10);
    ea112 = new ea1(new short[] { 0, 0, 0, -900, -1500 }, str1);
    String str20 = k50.o;
    ea13 = new ea1(new short[] { 0, 0, 0, -300, -400 }, str20);
    String str15 = k50.p;
    ea111 = new ea1(new short[] { 350, 50, -250, -210, 0 }, str15);
    String str16 = k50.q;
    ea1 ea123 = new ea1(new short[] { -380, 220, 220, 160, 150 }, str16);
    String str19 = k50.r;
    ea14 = new ea1(new short[] { -900, -150, 300, 300, 300 }, str19);
    String str18 = k50.s;
    ea1 ea121 = new ea1(new short[] { 430, 330, 20, 0, 260 }, str18);
    String str22 = k50.t;
    ea1 ea122 = new ea1(new short[] { 340, -250, 150, 540, 580 }, str22);
    String str17 = k50.u;
    ea11 = new ea1(new short[] { 270, -220, -970, -1310, -770 }, str17);
    String str21 = k50.v;
    k = new ArrayList(Arrays.asList((Object[])new ea1[] { 
            ea117, ea116, ea19, ea118, ea114, ea17, ea18, ea110, ea15, ea119, 
            ea120, ea115, ea16, ea112, ea13, ea111, ea123, ea14, ea121, ea122, 
            ea11, new ea1(new short[] { 580, -250, -40, 670, 760 }, str21) }));
    l = new ArrayList(Arrays.asList((Object[])new ea1[] { 
            new ea1(new short[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, str3), new ea1(new short[] { 600, 600, 449, 229, 70, -300, -240, -150, -150, -150 }, str11), new ea1(new short[] { -150, -150, -60, 110, 300, 600, 400, 90, -10, -150 }, str2), new ea1(new short[] { -150, -150, -150, -150, -210, -280, -60, 310, 450, 600 }, str14), new ea1(new short[] { 600, 600, 450, 150, -20, -300, -120, 170, 400, 600 }, str8), new ea1(new short[] { 1000, 1000, 800, 430, 50, -600, -540, -440, -400, -300 }, str12), new ea1(new short[] { -300, -300, -120, 220, 510, 980, 680, 180, -10, -300 }, str7), new ea1(new short[] { -300, -300, -350, -450, -510, -570, -180, 470, 680, 1000 }, str5), new ea1(new short[] { -1000, -1000, -800, -440, -280, 0, 0, 0, 0, 0 }, str9), new ea1(new short[] { 0, 0, -160, -460, -660, -1000, -780, -430, -260, 0 }, str4), 
            new ea1(new short[] { 0, 0, 0, 0, 0, -10, -180, -470, -680, -1000 }, str6), new ea1(new short[] { -1500, -1500, -1280, -880, -550, 0, 0, 0, 0, 0 }, str13), new ea1(new short[] { 0, 0, -330, -910, -1130, -1500, -1260, -860, -520, 0 }, str10), new ea1(new short[] { 0, 0, 0, 0, 0, -30, -360, -920, -1200, -1500 }, str1), new ea1(new short[] { 0, 0, 0, 0, 0, -10, -120, -300, -350, -410 }, str20), new ea1(new short[] { 580, 320, 210, 0, 0, -270, -200, -220, -60, 10 }, str15), new ea1(new short[] { -450, -380, 220, 220, 220, 220, 210, 150, 150, 150 }, str16), new ea1(new short[] { -900, -890, -630, -140, 20, 300, 300, 300, 300, 300 }, str19), new ea1(new short[] { 150, 450, 580, 300, 150, 0, 0, 0, 150, 300 }, str18), new ea1(new short[] { 580, 320, 130, -300, -230, 230, 360, 580, 580, 580 }, str22), 
            new ea1(new short[] { 550, 250, 90, -260, -500, -1060, -1240, -1330, -1060, -670 }, str17), new ea1(new short[] { 580, 580, 280, -250, -170, -20, 250, 660, 700, 775 }, str21) }));
    m = new ArrayList(Arrays.asList((Object[])new ea1[] { 
            new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0 }, str3), new ea1(new short[] { 
                600, 600, 590, 530, 430, 290, 160, -50, -300, -260, 
                -210, -150, -150, -150, -150 }, str11), new ea1(new short[] { 
                -150, -150, -150, -90, -10, 110, 220, 390, 580, 470, 
                300, 90, 30, -60, -150 }, str2), new ea1(new short[] { 
                -150, -150, -150, -150, -150, -150, -190, -240, -280, -150, 
                60, 310, 380, 490, 600 }, str14), new ea1(new short[] { 
                600, 600, 590, 500, 350, 140, 40, -110, -290, -190, 
                -30, 170, 270, 430, 600 }, str8), new ea1(new short[] { 
                1000, 1000, 990, 870, 690, 430, 200, -160, -600, -560, 
                -510, -440, -410, -360, -300 }, str12), new ea1(new short[] { 
                -300, -300, -290, -190, -20, 220, 390, 670, 970, 800, 
                520, 180, 70, -110, -300 }, str7), new ea1(new short[] { 
                -300, -300, -300, -330, -380, -450, -490, -520, -570, -330, 
                0, 470, 600, 770, 1000 }, str5), new ea1(new short[] { 
                -1000, -1000, -990, -870, -690, -440, -340, -190, 0, 0, 
                0, 0, 0, 0, 0 }, str9), new ea1(new short[] { 
                0, 0, -10, -10, -250, -460, -580, -770, -1000, -860, 
                -670, -430, -330, -170, 0 }, str4), 
            new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, -10, -110, 
                -260, -470, -600, -770, -1000 }, str6), new ea1(new short[] { 
                -1500, -1500, -1490, -1360, -1160, -880, -680, -380, 0, 0, 
                0, 0, 0, 0, 0 }, str13), new ea1(new short[] { 
                0, 0, -20, -210, -500, -910, -1040, -1250, -1480, -1350, 
                -1140, -860, -660, -340, 0 }, str10), new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, -30, -230, 
                -540, -920, -1060, -1270, -1500 }, str1), new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, -10, -80, 
                -180, -300, -330, -370, -410 }, str20), new ea1(new short[] { 
                580, 510, 310, 250, 160, 0, 0, -70, -270, -230, 
                -200, -220, -130, -40, 10 }, str15), new ea1(new short[] { 
                -450, -430, -370, -10, 220, 220, 220, 220, 220, 220, 
                190, 150, 150, 150, 150 }, str16), new ea1(new short[] { 
                -900, -900, -890, -730, -480, -140, -140, -40, 110, 300, 
                300, 300, 300, 300, 300 }, str19), new ea1(new short[] { 
                150, 240, 450, 530, 510, 300, 210, 110, 0, 0, 
                0, 0, 90, 190, 300 }, str18), new ea1(new short[] { 
                580, 510, 320, 200, 20, -300, -250, -110, 230, 300, 
                420, 580, 580, 580, 580 }, str22), 
            new ea1(new short[] { 
                550, 460, 250, 150, 0, -260, -400, -640, -1060, -1170, 
                -1270, -1330, -1170, -960, -670 }, str17), new ea1(new short[] { 
                580, 580, 570, 390, 140, -250, -200, -130, -10, 140, 
                360, 660, 680, 710, 750 }, str21) }));
    n = new ArrayList(Arrays.asList((Object[])new ea1[] { 
            new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0 }, str3), new ea1(new short[] { 
                600, 600, 600, 600, 600, 600, 590, 560, 519, 471, 
                409, 329, 263, 198, 116, 11, -122, -291, -286, -269, 
                -247, -219, -183, -150, -150, -150, -150, -150, -150, -150, 
                -150 }, str11), new ea1(new short[] { 
                -150, -150, -150, -150, -150, -150, -141, -115, -82, -42, 
                8, 75, 130, 184, 253, 340, 451, 592, 556, 498, 
                424, 331, 212, 95, 70, 39, 0, -49, -112, -150, 
                -150 }, str2), new ea1(new short[] { 
                -150, -300, -150, -150, -150, -150, -150, -150, -150, -150, 
                -150, -150, -159, -175, -195, -222, -255, -297, -247, -177, 
                -89, 22, 164, 305, 334, 372, 419, 478, 554, 600, 
                600 }, str14), new ea1(new short[] { 
                600, 600, 600, 600, 600, 600, 584, 538, 479, 407, 
                314, 193, 122, 74, 12, -66, -166, -293, -260, -208, 
                -142, -58, 48, 158, 202, 258, 328, 418, 532, 600, 
                600 }, str8), new ea1(new short[] { 
                1000, 1000, 1000, 1000, 1000, 1000, 981, 924, 852, 764, 
                651, 503, 386, 272, 128, -54, -289, -584, -586, -569, 
                -547, -519, -483, -447, -432, -413, -390, -360, -322, -300, 
                -300 }, str12), new ea1(new short[] { 
                -300, -300, -300, -300, -300, -300, -282, -231, -165, -85, 
                17, 151, 248, 334, 445, 584, 763, 1000, 929, 836, 
                719, 570, 380, 190, 141, 79, 1, -98, -224, -300, 
                -300 }, str7), new ea1(new short[] { 
                -300, -300, -300, -300, -300, -301, -305, -320, -340, -363, 
                -391, -428, -459, -475, -495, -515, -534, -557, -507, -386, 
                -231, -60, 143, 403, 514, 582, 668, 754, 858, 991, 
                1000 }, str5), new ea1(new short[] { 
                -1000, -1000, -1000, -1000, -1000, -1000, -981, -924, -852, -764, 
                -651, -503, -422, -374, -312, -233, -133, -6, 0, 0, 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0 }, str9), new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, -15, -61, -120, -192, 
                -285, -406, -483, -542, -618, -714, -837, -1000, -952, -887, 
                -807, -704, -574, -441, -397, -341, -271, -181, -67, 0, 
                0 }, str4), 
            new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0, -1, -5, -10, -39, -91, 
                -157, -233, -324, -440, -514, -582, -668, -754, -858, -1000, 
                -1000 }, str6), new ea1(new short[] { 
                -1500, -1500, -1500, -1500, -1500, -1500, -1479, -1417, -1338, -1242, 
                -1119, -958, -845, -748, -624, -467, -266, -13, 0, 0, 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0 }, str13), new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, -30, -123, -241, -385, 
                -570, -812, -936, -1001, -1083, -1188, -1322, -1500, -1447, -1377, 
                -1289, -1177, -1035, -882, -795, -683, -542, -363, -135, 0, 
                0 }, str10), new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0, 0, 0, 0, -79, -183, 
                -315, -483, -696, -911, -969, -1044, -1138, -1257, -1409, -1500, 
                -1500 }, str1), new ea1(new short[] { 
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0, 0, 0, 0, -26, -61, 
                -105, -161, -232, -302, -313, -327, -344, -367, -395, -412, 
                -412 }, str20), new ea1(new short[] { 
                584, 584, 584, 576, 497, 402, 308, 278, 241, 194, 
                150, 54, 0, 0, 0, -33, -114, -217, -256, -235, 
                -208, -201, -208, -216, -187, -136, -71, -44, -20, 8, 
                10 }, str15), new ea1(new short[] { 
                -450, -450, -450, -447, -425, -400, -336, -162, 60, 225, 
                225, 225, 225, 225, 225, 225, 225, 225, 222, 218, 
                212, 199, 180, 156, 150, 150, 150, 150, 150, 150, 
                150 }, str16), new ea1(new short[] { 
                -900, -900, -900, -900, -900, -900, -874, -797, -698, -578, 
                -424, -222, -122, -74, -12, 66, 166, 293, 300, 300, 
                300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 
                300 }, str19), new ea1(new short[] { 
                150, 150, 155, 190, 246, 349, 458, 497, 528, 518, 
                480, 374, 284, 240, 191, 140, 85, 28, 0, 0, 
                0, 0, 0, 0, 29, 78, 125, 181, 0, 0, 
                0 }, str18), new ea1(new short[] { 
                600, 584, 584, 576, 499, 405, 307, 252, 183, 94, 
                -28, -189, -290, -269, -241, -168, -31, 141, 245, 287, 
                340, 399, 470, 560, 584, 584, 584, 584, 584, 584, 
                584 }, str22), 
            new ea1(new short[] { 
                600, 553, 553, 543, 455, 346, 237, 192, 133, 59, 
                -41, -173, -288, -356, -444, -566, -737, -953, -1086, -1143, 
                -1216, -1259, -1288, -1323, -1278, -1189, -1076, -970, -843, -683, 
                -671 }, str17), new ea1(new short[] { 
                580, 580, 580, 580, 580, 580, 560, 470, 360, 240, 
                80, -110, -240, -210, -190, -150, -100, -40, 30, 110, 
                200, 320, 450, 620, 670, 680, 700, 710, 730, 750, 
                750 }, str21) }));
  }
  
  public static void A() {
    try {
      xg1 xg19;
      ArrayList<xg1> arrayList16 = new ArrayList();
      this(27);
      e = arrayList16;
      xg1 xg18 = new xg1();
      this("Default", c(new short[] { -6000, 0, 1490, 420, 0, 0, -6000, 0, 1000, 1000 }, ), 1.0D);
      arrayList16.add(xg18);
      arrayList16 = e;
      xg18 = new xg1();
      this("Generic", c(new short[] { -1000, -100, 1490, 830, -2602, 7, 200, 11, 1000, 1000 }, ), 1.0D);
      arrayList16.add(xg18);
      ArrayList<xg1> arrayList8 = e;
      xg1 xg116 = new xg1();
      this("Padded cell", c(new short[] { -1000, -6000, 170, 100, -1204, 1, 207, 2, 1000, 1000 }, ), 1.0D);
      arrayList8.add(xg116);
      ArrayList<xg1> arrayList15 = e;
      xg1 xg17 = new xg1();
      this("Room", c(new short[] { -1000, -454, 400, 830, -1646, 2, 53, 3, 1000, 1000 }, ), 1.0D);
      arrayList15.add(xg17);
      ArrayList<xg1> arrayList7 = e;
      xg1 xg115 = new xg1();
      this("Living room", c(new short[] { -1000, -6000, 500, 100, -1376, 3, -1104, 4, 1000, 1000 }, ), 1.0D);
      arrayList7.add(xg115);
      ArrayList<xg1> arrayList14 = e;
      xg1 xg16 = new xg1();
      this("Stone room", c(new short[] { -1000, -300, 2310, 640, -711, 12, 83, 17, 1000, 1000 }, ), 1.0D);
      arrayList14.add(xg16);
      ArrayList<xg1> arrayList6 = e;
      xg1 xg114 = new xg1();
      this("Auditorium", c(new short[] { -1000, -476, 4320, 590, -789, 20, -289, 30, 1000, 1000 }, ), 1.0D);
      arrayList6.add(xg114);
      ArrayList<xg1> arrayList13 = e;
      xg1 xg15 = new xg1();
      this("Concert hall", c(new short[] { -1000, -500, 3920, 700, -1230, 20, -2, 29, 1000, 1000 }, ), 1.0D);
      arrayList13.add(xg15);
      arrayList13 = e;
      xg15 = new xg1();
      this("Cave", c(new short[] { -1000, 0, 2910, 1300, -602, 15, -302, 22, 1000, 1000 }, ), 1.0D);
      arrayList13.add(xg15);
      ArrayList<xg1> arrayList5 = e;
      xg1 xg113 = new xg1();
      this("Arena", c(new short[] { -1000, -698, 7240, 330, -1166, 20, 16, 30, 1000, 1000 }, ), 1.0D);
      arrayList5.add(xg113);
      ArrayList<xg1> arrayList12 = e;
      xg1 xg14 = new xg1();
      this("Hanger", c(new short[] { -1000, -1000, 10050, 230, -602, 20, 198, 30, 1000, 1000 }, ), 1.0D);
      arrayList12.add(xg14);
      arrayList12 = e;
      xg14 = new xg1();
      this("Carpeted hallway", c(new short[] { -1000, -4000, 300, 100, -1831, 2, -1630, 30, 1000, 1000 }, ), 1.0D);
      arrayList12.add(xg14);
      arrayList12 = e;
      xg14 = new xg1();
      this("Hallway", c(new short[] { -1000, -300, 1490, 590, -1219, 7, 441, 11, 1000, 1000 }, ), 1.0D);
      arrayList12.add(xg14);
      ArrayList<xg1> arrayList4 = e;
      xg1 xg112 = new xg1();
      this("Stone corridor", c(new short[] { -1000, -237, 2700, 790, -1214, 13, 395, 20, 1000, 1000 }, ), 1.0D);
      arrayList4.add(xg112);
      arrayList4 = e;
      xg112 = new xg1();
      this("Alley", c(new short[] { -1000, -270, 1490, 860, -1204, 7, -4, 11, 1000, 1000 }, ), 1.0D);
      arrayList4.add(xg112);
      ArrayList<xg1> arrayList11 = e;
      xg1 xg13 = new xg1();
      this("Forest", c(new short[] { -1000, -3300, 1490, 540, -2560, 162, -613, 88, 790, 1000 }, ), 1.0D);
      arrayList11.add(xg13);
      ArrayList<xg1> arrayList3 = e;
      xg1 xg111 = new xg1();
      this("City", c(new short[] { -1000, -800, 1490, 670, -2273, 7, -2217, 11, 500, 1000 }, ), 1.0D);
      arrayList3.add(xg111);
      arrayList3 = e;
      xg111 = new xg1();
      this("Mountains", c(new short[] { -1000, -2500, 1490, 210, -2780, 300, -2014, 100, 270, 1000 }, ), 1.0D);
      arrayList3.add(xg111);
      ArrayList<xg1> arrayList10 = e;
      xg1 xg12 = new xg1();
      this("Quarry", c(new short[] { -1000, -1000, 1490, 830, 8000, 61, 500, 25, 1000, 1000 }, ), 1.0D);
      arrayList10.add(xg12);
      arrayList10 = e;
      xg12 = new xg1();
      this("Plain", c(new short[] { -1000, -2000, 1490, 500, -2466, 179, -2514, 100, 210, 1000 }, ), 1.0D);
      arrayList10.add(xg12);
      ArrayList<xg1> arrayList2 = e;
      xg1 xg110 = new xg1();
      this("Parking lot", c(new short[] { -1000, 0, 1650, 1500, -1363, 8, -1153, 12, 1000, 1000 }, ), 1.0D);
      arrayList2.add(xg110);
      arrayList2 = e;
      xg110 = new xg1();
      this("Small room", c(new short[] { -1000, -600, 1100, 830, -400, 5, 500, 10, 1000, 1000 }, ), 1.0D);
      arrayList2.add(xg110);
      arrayList2 = e;
      xg110 = new xg1();
      this("Medium room", c(new short[] { -1000, -600, 1300, 830, -1000, 20, -200, 20, 1000, 1000 }, ), 1.0D);
      arrayList2.add(xg110);
      ArrayList<xg1> arrayList9 = e;
      xg1 xg11 = new xg1();
      this("Large room", c(new short[] { -1000, -600, 1500, 830, -1600, 5, -1000, 40, 1000, 1000 }, ), 1.0D);
      arrayList9.add(xg11);
      arrayList9 = e;
      xg11 = new xg1();
      this("Medium hall", c(new short[] { -1000, -600, 1800, 700, -1300, 15, -800, 30, 1000, 1000 }, ), 1.0D);
      arrayList9.add(xg11);
      arrayList9 = e;
      xg11 = new xg1();
      this("Large hall", c(new short[] { -1000, -600, 1800, 700, -2000, 30, -1400, 60, 1000, 1000 }, ), 1.0D);
      arrayList9.add(xg11);
      ArrayList<xg1> arrayList1 = e;
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
      n21.v(exception.toString());
    } 
  }
  
  public static void B(int paramInt, ArrayList<ea1> paramArrayList) {
    JSONArray jSONArray = new JSONArray();
    for (byte b = 0; b < paramArrayList.size(); b++)
      jSONArray.put(((ea1)paramArrayList.get(b)).toString()); 
    MyApplication.o().edit().putString(ga1.i("EQUPJA_", paramInt), jSONArray.toString()).apply();
  }
  
  public static void C() {
    if (f == null)
      return; 
    JSONArray jSONArray = new JSONArray();
    for (byte b = 0; b < f.size(); b++)
      jSONArray.put(((xg1)f.get(b)).toString()); 
    MyApplication.o().edit().putString("EQURPJA", jSONArray.toString()).apply();
  }
  
  public static void D(int paramInt, xg1 paramxg1) {
    String str = ga1.i("CRBPR_", paramInt);
    MyApplication.o().edit().putString(str, paramxg1.toString()).apply();
  }
  
  public static void a(xg1 paramxg1, EnvironmentalReverb paramEnvironmentalReverb, hc paramhc) {
    if (paramxg1 != null && paramEnvironmentalReverb != null) {
      paramEnvironmentalReverb.setProperties(paramxg1.b);
      if (paramhc != null)
        paramhc.U(); 
    } 
  }
  
  public static int b() {
    byte b1;
    byte b2 = 0;
    try {
      short[] arrayOfShort = ((ea1)m(0).get(0)).b;
      b1 = b2;
    } finally {
      Exception exception = null;
    } 
    return b1;
  }
  
  public static EnvironmentalReverb.Settings c(short[] paramArrayOfshort) {
    EnvironmentalReverb.Settings settings = new EnvironmentalReverb.Settings();
    settings.roomLevel = paramArrayOfshort[0];
    settings.roomHFLevel = paramArrayOfshort[1];
    settings.decayTime = paramArrayOfshort[2];
    settings.decayHFRatio = paramArrayOfshort[3];
    settings.reflectionsLevel = paramArrayOfshort[4];
    settings.reflectionsDelay = paramArrayOfshort[5];
    settings.reverbLevel = paramArrayOfshort[6];
    settings.reverbDelay = paramArrayOfshort[7];
    settings.diffusion = paramArrayOfshort[8];
    settings.density = paramArrayOfshort[9];
    return settings;
  }
  
  public static int d(int paramInt) {
    String str = ga1.i("EQCHBL_", paramInt);
    return MyApplication.o().getInt(str, 100);
  }
  
  public static ea1 e(int paramInt1, int paramInt2) {
    String str = ga1.j("CEQPR_", paramInt1, paramInt2, "_");
    JSONArray jSONArray = new JSONArray(MyApplication.o().getString(str, "[]"));
    short[] arrayOfShort = new short[jSONArray.length()];
    for (paramInt1 = 0; paramInt1 < jSONArray.length(); paramInt1++)
      arrayOfShort[paramInt1] = (short)jSONArray.getInt(paramInt1); 
    return new ea1(arrayOfShort, MyApplication.i.getApplicationContext().getString(2131886420));
  }
  
  public static xg1 f(int paramInt) {
    String str = ga1.i("CRBPR_", paramInt);
    str = MyApplication.o().getString(str, null);
    return (str == null) ? n().get(0) : new xg1(str);
  }
  
  public static String g() {
    MusicService musicService = MusicService.P0;
    return (musicService != null && musicService.J()) ? MyApplication.i.getApplicationContext().getString(2131886358) : ((h() == 0) ? MyApplication.i.getApplicationContext().getString(2131886960) : MyApplication.i.getApplicationContext().getString(2131887482));
  }
  
  public static int h() {
    return MyApplication.o().getInt("k_i_adt", 0);
  }
  
  public static int i(int paramInt1, int paramInt2) {
    boolean bool = false;
    if (paramInt2 == 1)
      return 0; 
    String str = ga1.j("EQNB_", paramInt1, paramInt2, "_");
    paramInt1 = bool;
    if (paramInt2 == 0)
      paramInt1 = 10; 
    return MyApplication.o().getInt(str, paramInt1);
  }
  
  public static final int j() {
    // Byte code:
    //   0: invokestatic e : ()Landroid/media/AudioManager;
    //   3: invokevirtual isWiredHeadsetOn : ()Z
    //   6: istore_3
    //   7: invokestatic e : ()Landroid/media/AudioManager;
    //   10: invokevirtual isBluetoothA2dpOn : ()Z
    //   13: istore_2
    //   14: invokestatic m : ()Landroid/media/MediaRouter;
    //   17: iconst_1
    //   18: invokevirtual getSelectedRoute : (I)Landroid/media/MediaRouter$RouteInfo;
    //   21: astore #7
    //   23: getstatic j50.c : Landroid/content/Context;
    //   26: ifnonnull -> 66
    //   29: new android/content/res/Configuration
    //   32: astore #4
    //   34: aload #4
    //   36: invokespecial <init> : ()V
    //   39: aload #4
    //   41: invokevirtual setToDefaults : ()V
    //   44: aload #4
    //   46: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   49: invokevirtual setLocale : (Ljava/util/Locale;)V
    //   52: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   55: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   58: aload #4
    //   60: invokevirtual createConfigurationContext : (Landroid/content/res/Configuration;)Landroid/content/Context;
    //   63: putstatic j50.c : Landroid/content/Context;
    //   66: aload #7
    //   68: getstatic j50.c : Landroid/content/Context;
    //   71: invokevirtual getName : (Landroid/content/Context;)Ljava/lang/CharSequence;
    //   74: astore #8
    //   76: aload #7
    //   78: invokevirtual getDeviceType : ()I
    //   81: istore_0
    //   82: aload #8
    //   84: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   87: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   90: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   93: ldc_w '[^a-zA-Z0-9]'
    //   96: ldc_w ''
    //   99: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   102: astore #5
    //   104: aload #7
    //   106: invokevirtual getDescription : ()Ljava/lang/CharSequence;
    //   109: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   112: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   115: astore #4
    //   117: getstatic j50.b : Ljava/util/HashMap;
    //   120: astore #6
    //   122: iload_2
    //   123: ifeq -> 279
    //   126: iload_0
    //   127: iconst_3
    //   128: if_icmpeq -> 163
    //   131: aload #5
    //   133: ldc_w 'bluetooth'
    //   136: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   139: ifne -> 163
    //   142: aload #4
    //   144: ldc_w 'bluetooth'
    //   147: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   150: istore_1
    //   151: iload_1
    //   152: ifeq -> 279
    //   155: goto -> 163
    //   158: astore #4
    //   160: goto -> 528
    //   163: aload #8
    //   165: ifnull -> 277
    //   168: aload #8
    //   170: invokeinterface toString : ()Ljava/lang/String;
    //   175: invokevirtual trim : ()Ljava/lang/String;
    //   178: astore #7
    //   180: aload #7
    //   182: invokevirtual length : ()I
    //   185: ifle -> 277
    //   188: aload #6
    //   190: aload #7
    //   192: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   195: checkcast java/lang/Integer
    //   198: astore #5
    //   200: aload #5
    //   202: astore #4
    //   204: aload #5
    //   206: ifnonnull -> 241
    //   209: getstatic in/krosbits/musicolet/MyApplication.k : Lc;
    //   212: aload #7
    //   214: iconst_0
    //   215: invokevirtual a : (Ljava/lang/String;I)I
    //   218: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   221: astore #4
    //   223: aload #6
    //   225: aload #7
    //   227: aload #4
    //   229: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   232: pop
    //   233: goto -> 241
    //   236: astore #4
    //   238: goto -> 272
    //   241: aload #4
    //   243: invokevirtual intValue : ()I
    //   246: iflt -> 277
    //   249: aload #4
    //   251: invokevirtual intValue : ()I
    //   254: sipush #9999
    //   257: if_icmpgt -> 277
    //   260: aload #4
    //   262: invokevirtual intValue : ()I
    //   265: istore_0
    //   266: iload_0
    //   267: ldc_w 40000
    //   270: iadd
    //   271: ireturn
    //   272: aload #4
    //   274: invokevirtual printStackTrace : ()V
    //   277: iconst_4
    //   278: ireturn
    //   279: aload #7
    //   281: invokevirtual getPresentationDisplay : ()Landroid/view/Display;
    //   284: astore #7
    //   286: aload #7
    //   288: ifnull -> 413
    //   291: aload #7
    //   293: invokevirtual getName : ()Ljava/lang/String;
    //   296: astore #7
    //   298: aload #7
    //   300: ifnull -> 413
    //   303: aload #7
    //   305: invokevirtual toString : ()Ljava/lang/String;
    //   308: invokevirtual trim : ()Ljava/lang/String;
    //   311: astore #7
    //   313: aload #7
    //   315: invokevirtual length : ()I
    //   318: ifle -> 526
    //   321: aload #6
    //   323: aload #7
    //   325: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   328: checkcast java/lang/Integer
    //   331: astore #5
    //   333: aload #5
    //   335: astore #4
    //   337: aload #5
    //   339: ifnonnull -> 374
    //   342: getstatic in/krosbits/musicolet/MyApplication.k : Lc;
    //   345: aload #7
    //   347: iconst_2
    //   348: invokevirtual a : (Ljava/lang/String;I)I
    //   351: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   354: astore #4
    //   356: aload #6
    //   358: aload #7
    //   360: aload #4
    //   362: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   365: pop
    //   366: goto -> 374
    //   369: astore #4
    //   371: goto -> 405
    //   374: aload #4
    //   376: invokevirtual intValue : ()I
    //   379: iflt -> 526
    //   382: aload #4
    //   384: invokevirtual intValue : ()I
    //   387: sipush #9999
    //   390: if_icmpgt -> 526
    //   393: aload #4
    //   395: invokevirtual intValue : ()I
    //   398: istore_0
    //   399: iload_0
    //   400: ldc_w 40000
    //   403: iadd
    //   404: ireturn
    //   405: aload #4
    //   407: invokevirtual printStackTrace : ()V
    //   410: goto -> 526
    //   413: iload_3
    //   414: ifeq -> 526
    //   417: aload #5
    //   419: ldc_w 'usb'
    //   422: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   425: ifne -> 524
    //   428: aload #4
    //   430: ldc_w 'usb'
    //   433: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   436: ifne -> 524
    //   439: getstatic in/krosbits/musicolet/MusicService.R0 : I
    //   442: iconst_1
    //   443: if_icmpne -> 458
    //   446: getstatic in/krosbits/musicolet/MusicService.T0 : Ljava/lang/String;
    //   449: ldc_w 'usb'
    //   452: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   455: ifne -> 524
    //   458: ldc_w 'headphones'
    //   461: aload #5
    //   463: invokevirtual equals : (Ljava/lang/Object;)Z
    //   466: ifne -> 478
    //   469: invokestatic b : ()Z
    //   472: ifeq -> 478
    //   475: goto -> 524
    //   478: aload #5
    //   480: ldc_w 'headphones'
    //   483: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   486: ifne -> 504
    //   489: aload #4
    //   491: ldc_w 'headphones'
    //   494: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   497: ifne -> 504
    //   500: iload_2
    //   501: ifne -> 526
    //   504: getstatic in/krosbits/musicolet/MusicService.R0 : I
    //   507: iconst_1
    //   508: if_icmpne -> 522
    //   511: getstatic in/krosbits/musicolet/MusicService.S0 : I
    //   514: istore_0
    //   515: iload_0
    //   516: iconst_1
    //   517: if_icmpne -> 522
    //   520: iconst_3
    //   521: ireturn
    //   522: iconst_2
    //   523: ireturn
    //   524: iconst_5
    //   525: ireturn
    //   526: iconst_1
    //   527: ireturn
    //   528: aload #4
    //   530: invokevirtual printStackTrace : ()V
    //   533: iconst_1
    //   534: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	66	158	finally
    //   66	117	158	finally
    //   131	151	158	finally
    //   168	200	236	finally
    //   209	233	236	finally
    //   241	266	236	finally
    //   272	277	158	finally
    //   279	286	158	finally
    //   291	298	158	finally
    //   303	333	369	finally
    //   342	366	369	finally
    //   374	399	369	finally
    //   405	410	158	finally
    //   417	458	158	finally
    //   458	475	158	finally
    //   478	500	158	finally
    //   504	515	158	finally
  }
  
  public static int k(int paramInt1, int paramInt2) {
    String str = ga1.j("EQSELP_", paramInt1, paramInt2, "_");
    return MyApplication.o().getInt(str, 0);
  }
  
  public static int[] l() {
    if (i == null)
      try {
        String str2 = MyApplication.o().getString("SEQMNMX", null);
        String str1 = str2;
        if (str2 == null) {
          z();
          str1 = MyApplication.o().getString("SEQMNMX", "[]");
        } 
        JSONArray jSONArray = new JSONArray();
        this(str1);
        i = jSONArray;
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      }  
    int[] arrayOfInt = new int[2];
    try {
      arrayOfInt[0] = i.getInt(0);
      arrayOfInt[1] = i.getInt(1);
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    return arrayOfInt;
  }
  
  public static ArrayList m(int paramInt) {
    if (paramInt == 0) {
      if (g == null) {
        g = new ArrayList();
        try {
          String str2 = MyApplication.o().getString("EQSPJA", null);
          String str1 = str2;
          if (str2 == null) {
            z();
            str1 = MyApplication.o().getString("EQSPJA", "[]");
          } 
        } catch (JSONException jSONException) {}
        JSONArray jSONArray = new JSONArray();
        this((String)jSONException);
        for (paramInt = 0; paramInt < jSONArray.length(); paramInt++) {
          ArrayList<ea1> arrayList = g;
          ea1 ea1 = new ea1();
          this(jSONArray.getString(paramInt));
          arrayList.add(ea1);
        } 
      } 
      return g;
    } 
    if (paramInt == 3)
      return j; 
    if (paramInt == 5)
      return k; 
    if (paramInt == 10)
      return l; 
    if (paramInt == 15)
      return m; 
    if (paramInt == 31)
      return n; 
    l0.l(ga1.i("EHM:gsp>", paramInt));
    return null;
  }
  
  public static ArrayList n() {
    if (e == null)
      try {
        A();
      } finally {
        Exception exception = null;
      }  
    return e;
  }
  
  public static ArrayList o(int paramInt) {
    HashMap<Integer, ArrayList<ea1>> hashMap = d;
    ArrayList<ea1> arrayList2 = (ArrayList)hashMap.get(Integer.valueOf(paramInt));
    String str = ga1.i("EQUPJA_", paramInt);
    ArrayList<ea1> arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      try {
        JSONArray jSONArray = new JSONArray();
        this(MyApplication.o().getString(str, "[]"));
        for (byte b = 0; b < jSONArray.length(); b++) {
          ea1 ea1 = new ea1();
          this(jSONArray.getString(b));
          arrayList1.add(ea1);
        } 
      } catch (JSONException jSONException) {}
      hashMap.put(Integer.valueOf(paramInt), arrayList1);
    } 
    return arrayList1;
  }
  
  public static ArrayList p() {
    if (f == null) {
      f = new ArrayList();
      try {
        JSONArray jSONArray = new JSONArray();
        this(MyApplication.o().getString("EQURPJA", "[]"));
      } finally {
        Exception exception = null;
      } 
    } 
    return f;
  }
  
  public static boolean q(int paramInt, hc paramhc) {
    return (!r(paramInt) || (paramhc instanceof kd && ((kd)paramhc).o != 1) || paramhc instanceof w60);
  }
  
  public static boolean r(int paramInt) {
    String str = ga1.i("IEQON_", paramInt);
    return MyApplication.o().getBoolean(str, false);
  }
  
  public static boolean s(int paramInt) {
    String str = ga1.i("k_b_moau_", paramInt);
    return MyApplication.o().getBoolean(str, false);
  }
  
  public static boolean t(int paramInt) {
    String str = ga1.i(KjdXPYm.IOiYgll, paramInt);
    return MyApplication.o().getBoolean(str, false);
  }
  
  public static boolean u() {
    return (h() == 0);
  }
  
  public static boolean v(int paramInt) {
    return (paramInt == 4 || (paramInt >= 40000 && paramInt <= 49999));
  }
  
  public static void w(hc paramhc) {
    if (paramhc == null)
      return; 
    int i = MusicService.D0;
    int j = MyApplication.o().getInt("etu2", 0);
    if ((j == 0 || j == 2) && q(i, paramhc)) {
      paramhc.S(d(i));
      return;
    } 
    paramhc.S(100);
  }
  
  public static void x(ow paramow) {
    if (paramow != null) {
      ea1 ea1;
      int j = i(MusicService.D0, h());
      int i = k(MusicService.D0, j);
      ArrayList<ea1> arrayList1 = m(j);
      ArrayList<ea1> arrayList2 = o(j);
      if (i < arrayList1.size()) {
        ea1 = arrayList1.get(i);
      } else if (i == ea1.size()) {
        ea1 = e(MusicService.D0, j);
      } else {
        ea1 = arrayList2.get(i - ea1.size() - 1);
      } 
      if (ea1 != null) {
        short s = 0;
        try {
          while (true) {
            short[] arrayOfShort = ea1.b;
            if (arrayOfShort != null) {
              i = (short)arrayOfShort.length;
            } else {
              i = 0;
            } 
            if (s < i) {
              boolean bool;
              if (s >= 0 && s < arrayOfShort.length) {
                bool = arrayOfShort[s];
              } else {
                bool = false;
              } 
              paramow.b(s, bool);
              s = (short)(s + 1);
              continue;
            } 
            break;
          } 
        } finally {
          paramow = null;
        } 
      } 
    } 
  }
  
  public static void y(EnvironmentalReverb paramEnvironmentalReverb, hc paramhc) {
    if (paramEnvironmentalReverb == null)
      return; 
    ArrayList<xg1> arrayList1 = n();
    ArrayList<xg1> arrayList2 = p();
    String str = ga1.i("EQSRVPTP_", MusicService.D0);
    int j = MyApplication.o().getInt(str, 0);
    int k = arrayList1.size();
    int i = j;
    if (j >= arrayList2.size() + k + 1)
      i = arrayList1.size() + arrayList2.size(); 
    try {
      xg1 xg1;
      if (i < arrayList1.size()) {
        xg1 = arrayList1.get(i);
      } else if (i == xg1.size()) {
        xg1 = f(MusicService.D0);
      } else {
        xg1 = arrayList2.get(i - xg1.size() - 1);
      } 
    } finally {
      arrayList1 = null;
      arrayList1.printStackTrace();
    } 
  }
  
  public static void z() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new android/media/audiofx/Equalizer
    //   5: astore #5
    //   7: aload #5
    //   9: iconst_0
    //   10: iconst_1
    //   11: invokespecial <init> : (II)V
    //   14: aload #5
    //   16: invokevirtual getNumberOfPresets : ()S
    //   19: istore #4
    //   21: new java/util/ArrayList
    //   24: astore #6
    //   26: aload #6
    //   28: iload #4
    //   30: invokespecial <init> : (I)V
    //   33: aload #6
    //   35: putstatic j50.g : Ljava/util/ArrayList;
    //   38: aload #5
    //   40: invokevirtual getNumberOfBands : ()S
    //   43: istore_3
    //   44: new org/json/JSONArray
    //   47: astore #6
    //   49: aload #6
    //   51: invokespecial <init> : ()V
    //   54: aload #6
    //   56: putstatic j50.h : Lorg/json/JSONArray;
    //   59: iconst_0
    //   60: istore_0
    //   61: iload_0
    //   62: iload_3
    //   63: if_icmpge -> 92
    //   66: getstatic j50.h : Lorg/json/JSONArray;
    //   69: aload #5
    //   71: iload_0
    //   72: invokevirtual getCenterFreq : (S)I
    //   75: invokevirtual put : (I)Lorg/json/JSONArray;
    //   78: pop
    //   79: iload_0
    //   80: iconst_1
    //   81: iadd
    //   82: i2s
    //   83: istore_0
    //   84: goto -> 61
    //   87: astore #6
    //   89: goto -> 240
    //   92: new org/json/JSONArray
    //   95: astore #6
    //   97: aload #6
    //   99: invokespecial <init> : ()V
    //   102: aload #6
    //   104: putstatic j50.i : Lorg/json/JSONArray;
    //   107: aload #5
    //   109: invokevirtual getBandLevelRange : ()[S
    //   112: astore #6
    //   114: getstatic j50.i : Lorg/json/JSONArray;
    //   117: aload #6
    //   119: iconst_0
    //   120: saload
    //   121: invokevirtual put : (I)Lorg/json/JSONArray;
    //   124: pop
    //   125: getstatic j50.i : Lorg/json/JSONArray;
    //   128: aload #6
    //   130: iconst_1
    //   131: saload
    //   132: invokevirtual put : (I)Lorg/json/JSONArray;
    //   135: pop
    //   136: iconst_0
    //   137: istore_0
    //   138: aload #5
    //   140: astore #6
    //   142: iload_0
    //   143: iload #4
    //   145: if_icmpge -> 227
    //   148: aload #5
    //   150: iload_0
    //   151: invokevirtual usePreset : (S)V
    //   154: aload #5
    //   156: iload_0
    //   157: invokevirtual getPresetName : (S)Ljava/lang/String;
    //   160: astore #7
    //   162: iload_3
    //   163: newarray short
    //   165: astore #6
    //   167: iconst_0
    //   168: istore_1
    //   169: iload_1
    //   170: iload_3
    //   171: if_icmpge -> 192
    //   174: aload #6
    //   176: iload_1
    //   177: aload #5
    //   179: iload_1
    //   180: invokevirtual getBandLevel : (S)S
    //   183: sastore
    //   184: iload_1
    //   185: iconst_1
    //   186: iadd
    //   187: i2s
    //   188: istore_1
    //   189: goto -> 169
    //   192: getstatic j50.g : Ljava/util/ArrayList;
    //   195: astore #9
    //   197: new ea1
    //   200: astore #8
    //   202: aload #8
    //   204: aload #6
    //   206: aload #7
    //   208: invokespecial <init> : ([SLjava/lang/String;)V
    //   211: aload #9
    //   213: aload #8
    //   215: invokevirtual add : (Ljava/lang/Object;)Z
    //   218: pop
    //   219: iload_0
    //   220: iconst_1
    //   221: iadd
    //   222: i2s
    //   223: istore_0
    //   224: goto -> 138
    //   227: aload #6
    //   229: invokevirtual release : ()V
    //   232: goto -> 260
    //   235: astore #6
    //   237: aconst_null
    //   238: astore #5
    //   240: aload #6
    //   242: invokevirtual toString : ()Ljava/lang/String;
    //   245: invokestatic v : (Ljava/lang/String;)V
    //   248: aload #5
    //   250: ifnull -> 260
    //   253: aload #5
    //   255: astore #6
    //   257: goto -> 227
    //   260: getstatic j50.g : Ljava/util/ArrayList;
    //   263: ifnull -> 373
    //   266: getstatic j50.h : Lorg/json/JSONArray;
    //   269: ifnonnull -> 275
    //   272: goto -> 373
    //   275: new org/json/JSONArray
    //   278: dup
    //   279: invokespecial <init> : ()V
    //   282: astore #5
    //   284: iload_2
    //   285: getstatic j50.g : Ljava/util/ArrayList;
    //   288: invokevirtual size : ()I
    //   291: if_icmpge -> 319
    //   294: aload #5
    //   296: getstatic j50.g : Ljava/util/ArrayList;
    //   299: iload_2
    //   300: invokevirtual get : (I)Ljava/lang/Object;
    //   303: checkcast ea1
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
    //   312: pop
    //   313: iinc #2, 1
    //   316: goto -> 284
    //   319: invokestatic o : ()Landroid/content/SharedPreferences;
    //   322: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   327: ldc_w 'EQSPJA'
    //   330: aload #5
    //   332: invokevirtual toString : ()Ljava/lang/String;
    //   335: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   340: ldc_w 'SEQCF'
    //   343: getstatic j50.h : Lorg/json/JSONArray;
    //   346: invokevirtual toString : ()Ljava/lang/String;
    //   349: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   354: ldc_w 'SEQMNMX'
    //   357: getstatic j50.i : Lorg/json/JSONArray;
    //   360: invokevirtual toString : ()Ljava/lang/String;
    //   363: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   368: invokeinterface apply : ()V
    //   373: return
    //   374: astore #6
    //   376: aload #5
    //   378: ifnull -> 386
    //   381: aload #5
    //   383: invokevirtual release : ()V
    //   386: aload #6
    //   388: athrow
    //   389: astore #5
    //   391: goto -> 260
    //   394: astore #5
    //   396: goto -> 386
    // Exception table:
    //   from	to	target	type
    //   2	14	235	finally
    //   14	59	87	finally
    //   66	79	87	finally
    //   92	136	87	finally
    //   148	167	87	finally
    //   174	184	87	finally
    //   192	219	87	finally
    //   227	232	389	finally
    //   240	248	374	finally
    //   381	386	394	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */