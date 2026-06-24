import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class pq {
  public static final int[] d = new int[] { 0, 4, 8 };
  
  public static final SparseIntArray e;
  
  public static final SparseIntArray f;
  
  public final HashMap a = new HashMap<Object, Object>();
  
  public final boolean b = true;
  
  public final HashMap c = new HashMap<Object, Object>();
  
  static {
    SparseIntArray sparseIntArray2 = new SparseIntArray();
    e = sparseIntArray2;
    SparseIntArray sparseIntArray1 = new SparseIntArray();
    f = sparseIntArray1;
    sparseIntArray2.append(82, 25);
    sparseIntArray2.append(83, 26);
    sparseIntArray2.append(85, 29);
    sparseIntArray2.append(86, 30);
    sparseIntArray2.append(92, 36);
    sparseIntArray2.append(91, 35);
    sparseIntArray2.append(63, 4);
    sparseIntArray2.append(62, 3);
    sparseIntArray2.append(58, 1);
    sparseIntArray2.append(60, 91);
    sparseIntArray2.append(59, 92);
    sparseIntArray2.append(101, 6);
    sparseIntArray2.append(102, 7);
    sparseIntArray2.append(70, 17);
    sparseIntArray2.append(71, 18);
    sparseIntArray2.append(72, 19);
    sparseIntArray2.append(54, 99);
    sparseIntArray2.append(0, 27);
    sparseIntArray2.append(87, 32);
    sparseIntArray2.append(88, 33);
    sparseIntArray2.append(69, 10);
    sparseIntArray2.append(68, 9);
    sparseIntArray2.append(106, 13);
    sparseIntArray2.append(109, 16);
    sparseIntArray2.append(107, 14);
    sparseIntArray2.append(104, 11);
    sparseIntArray2.append(108, 15);
    sparseIntArray2.append(105, 12);
    sparseIntArray2.append(95, 40);
    sparseIntArray2.append(80, 39);
    sparseIntArray2.append(79, 41);
    sparseIntArray2.append(94, 42);
    sparseIntArray2.append(78, 20);
    sparseIntArray2.append(93, 37);
    sparseIntArray2.append(67, 5);
    sparseIntArray2.append(81, 87);
    sparseIntArray2.append(90, 87);
    sparseIntArray2.append(84, 87);
    sparseIntArray2.append(61, 87);
    sparseIntArray2.append(57, 87);
    sparseIntArray2.append(5, 24);
    sparseIntArray2.append(7, 28);
    sparseIntArray2.append(23, 31);
    sparseIntArray2.append(24, 8);
    sparseIntArray2.append(6, 34);
    sparseIntArray2.append(8, 2);
    sparseIntArray2.append(3, 23);
    sparseIntArray2.append(4, 21);
    sparseIntArray2.append(96, 95);
    sparseIntArray2.append(73, 96);
    sparseIntArray2.append(2, 22);
    sparseIntArray2.append(13, 43);
    sparseIntArray2.append(26, 44);
    sparseIntArray2.append(21, 45);
    sparseIntArray2.append(22, 46);
    sparseIntArray2.append(20, 60);
    sparseIntArray2.append(18, 47);
    sparseIntArray2.append(19, 48);
    sparseIntArray2.append(14, 49);
    sparseIntArray2.append(15, 50);
    sparseIntArray2.append(16, 51);
    sparseIntArray2.append(17, 52);
    sparseIntArray2.append(25, 53);
    sparseIntArray2.append(97, 54);
    sparseIntArray2.append(74, 55);
    sparseIntArray2.append(98, 56);
    sparseIntArray2.append(75, 57);
    sparseIntArray2.append(99, 58);
    sparseIntArray2.append(76, 59);
    sparseIntArray2.append(64, 61);
    sparseIntArray2.append(66, 62);
    sparseIntArray2.append(65, 63);
    sparseIntArray2.append(28, 64);
    sparseIntArray2.append(121, 65);
    sparseIntArray2.append(35, 66);
    sparseIntArray2.append(122, 67);
    sparseIntArray2.append(113, 79);
    sparseIntArray2.append(1, 38);
    sparseIntArray2.append(112, 68);
    sparseIntArray2.append(100, 69);
    sparseIntArray2.append(77, 70);
    sparseIntArray2.append(111, 97);
    sparseIntArray2.append(32, 71);
    sparseIntArray2.append(30, 72);
    sparseIntArray2.append(31, 73);
    sparseIntArray2.append(33, 74);
    sparseIntArray2.append(29, 75);
    sparseIntArray2.append(114, 76);
    sparseIntArray2.append(89, 77);
    sparseIntArray2.append(123, 78);
    sparseIntArray2.append(56, 80);
    sparseIntArray2.append(55, 81);
    sparseIntArray2.append(116, 82);
    sparseIntArray2.append(120, 83);
    sparseIntArray2.append(119, 84);
    sparseIntArray2.append(118, 85);
    sparseIntArray2.append(117, 86);
    sparseIntArray1.append(85, 6);
    sparseIntArray1.append(85, 7);
    sparseIntArray1.append(0, 27);
    sparseIntArray1.append(89, 13);
    sparseIntArray1.append(92, 16);
    sparseIntArray1.append(90, 14);
    sparseIntArray1.append(87, 11);
    sparseIntArray1.append(91, 15);
    sparseIntArray1.append(88, 12);
    sparseIntArray1.append(78, 40);
    sparseIntArray1.append(71, 39);
    sparseIntArray1.append(70, 41);
    sparseIntArray1.append(77, 42);
    sparseIntArray1.append(69, 20);
    sparseIntArray1.append(76, 37);
    sparseIntArray1.append(60, 5);
    sparseIntArray1.append(72, 87);
    sparseIntArray1.append(75, 87);
    sparseIntArray1.append(73, 87);
    sparseIntArray1.append(57, 87);
    sparseIntArray1.append(56, 87);
    sparseIntArray1.append(5, 24);
    sparseIntArray1.append(7, 28);
    sparseIntArray1.append(23, 31);
    sparseIntArray1.append(24, 8);
    sparseIntArray1.append(6, 34);
    sparseIntArray1.append(8, 2);
    sparseIntArray1.append(3, 23);
    sparseIntArray1.append(4, 21);
    sparseIntArray1.append(79, 95);
    sparseIntArray1.append(64, 96);
    sparseIntArray1.append(2, 22);
    sparseIntArray1.append(13, 43);
    sparseIntArray1.append(26, 44);
    sparseIntArray1.append(21, 45);
    sparseIntArray1.append(22, 46);
    sparseIntArray1.append(20, 60);
    sparseIntArray1.append(18, 47);
    sparseIntArray1.append(19, 48);
    sparseIntArray1.append(14, 49);
    sparseIntArray1.append(15, 50);
    sparseIntArray1.append(16, 51);
    sparseIntArray1.append(17, 52);
    sparseIntArray1.append(25, 53);
    sparseIntArray1.append(80, 54);
    sparseIntArray1.append(65, 55);
    sparseIntArray1.append(81, 56);
    sparseIntArray1.append(66, 57);
    sparseIntArray1.append(82, 58);
    sparseIntArray1.append(67, 59);
    sparseIntArray1.append(59, 62);
    sparseIntArray1.append(58, 63);
    sparseIntArray1.append(28, 64);
    sparseIntArray1.append(105, 65);
    sparseIntArray1.append(34, 66);
    sparseIntArray1.append(106, 67);
    sparseIntArray1.append(96, 79);
    sparseIntArray1.append(1, 38);
    sparseIntArray1.append(97, 98);
    sparseIntArray1.append(95, 68);
    sparseIntArray1.append(83, 69);
    sparseIntArray1.append(68, 70);
    sparseIntArray1.append(32, 71);
    sparseIntArray1.append(30, 72);
    sparseIntArray1.append(31, 73);
    sparseIntArray1.append(33, 74);
    sparseIntArray1.append(29, 75);
    sparseIntArray1.append(98, 76);
    sparseIntArray1.append(74, 77);
    sparseIntArray1.append(107, 78);
    sparseIntArray1.append(55, 80);
    sparseIntArray1.append(54, 81);
    sparseIntArray1.append(100, 82);
    sparseIntArray1.append(104, 83);
    sparseIntArray1.append(103, 84);
    sparseIntArray1.append(102, 85);
    sparseIntArray1.append(101, 86);
    sparseIntArray1.append(94, 97);
  }
  
  public static int[] e(Barrier paramBarrier, String paramString) {
    String[] arrayOfString = paramString.split(",");
    Context context = paramBarrier.getContext();
    int[] arrayOfInt2 = new int[arrayOfString.length];
    byte b2 = 0;
    byte b1;
    for (b1 = 0; b2 < arrayOfString.length; b1++) {
      String str2 = arrayOfString[b2].trim();
      String str1 = null;
      try {
        j = vb1.class.getField(str2).getInt(null);
      } catch (Exception exception) {
        j = 0;
      } 
      int i = j;
      if (!j)
        i = context.getResources().getIdentifier(str2, "id", context.getPackageName()); 
      int j = i;
      if (i == 0) {
        j = i;
        if (paramBarrier.isInEditMode()) {
          j = i;
          if (paramBarrier.getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout)paramBarrier.getParent();
            if (str2 != null) {
              HashMap hashMap = constraintLayout.o;
              paramString = str1;
              if (hashMap != null) {
                paramString = str1;
                if (hashMap.containsKey(str2))
                  paramString = (String)constraintLayout.o.get(str2); 
              } 
            } else {
              constraintLayout.getClass();
              paramString = str1;
            } 
            j = i;
            if (paramString != null) {
              j = i;
              if (paramString instanceof Integer)
                j = ((Integer)paramString).intValue(); 
            } 
          } 
        } 
      } 
      arrayOfInt2[b1] = j;
      b2++;
    } 
    int[] arrayOfInt1 = arrayOfInt2;
    if (b1 != arrayOfString.length)
      arrayOfInt1 = Arrays.copyOf(arrayOfInt2, b1); 
    return arrayOfInt1;
  }
  
  public static kq f(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean) {
    int[] arrayOfInt1;
    kq kq = new kq();
    if (paramBoolean) {
      arrayOfInt1 = fc1.d;
    } else {
      arrayOfInt1 = fc1.a;
    } 
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt1);
    String[] arrayOfString = n21.b;
    nq nq = kq.b;
    oq oq = kq.e;
    mq mq = kq.c;
    lq lq = kq.d;
    int[] arrayOfInt2 = d;
    SparseIntArray sparseIntArray = e;
    if (paramBoolean) {
      int i = typedArray.getIndexCount();
      Object object = new Object();
      ((jq)object).a = new int[10];
      ((jq)object).b = new int[10];
      ((jq)object).c = 0;
      ((jq)object).d = new int[10];
      ((jq)object).e = new float[10];
      ((jq)object).f = 0;
      ((jq)object).g = new int[5];
      ((jq)object).h = new String[5];
      ((jq)object).i = 0;
      ((jq)object).j = new int[4];
      ((jq)object).k = new boolean[4];
      ((jq)object).l = 0;
      mq.getClass();
      lq.getClass();
      oq.getClass();
      for (byte b = 0; b < i; b++) {
        int k;
        StringBuilder stringBuilder;
        int j = typedArray.getIndex(b);
        switch (f.get(j)) {
          default:
            stringBuilder = new StringBuilder("Unknown attribute 0x");
            stringBuilder.append(Integer.toHexString(j));
            stringBuilder.append("   ");
            stringBuilder.append(sparseIntArray.get(j));
            Log.w("ConstraintSet", stringBuilder.toString());
            break;
          case 99:
            object.c(99, typedArray.getBoolean(j, lq.g));
            break;
          case 98:
            k = ey0.s;
            if ((typedArray.peekValue(j)).type == 3) {
              typedArray.getString(j);
              break;
            } 
            kq.a = typedArray.getResourceId(j, kq.a);
            break;
          case 97:
            object.b(97, typedArray.getInt(j, lq.o0));
            break;
          case 96:
            j(object, typedArray, j, 1);
            break;
          case 95:
            j(object, typedArray, j, 0);
            break;
          case 94:
            object.b(94, typedArray.getDimensionPixelSize(j, lq.S));
            break;
          case 93:
            object.b(93, typedArray.getDimensionPixelSize(j, lq.L));
            break;
          case 87:
            stringBuilder = new StringBuilder("unused attribute 0x");
            stringBuilder.append(Integer.toHexString(j));
            stringBuilder.append("   ");
            stringBuilder.append(sparseIntArray.get(j));
            Log.w("ConstraintSet", stringBuilder.toString());
            break;
          case 86:
            k = (typedArray.peekValue(j)).type;
            if (k == 1) {
              j = typedArray.getResourceId(j, -1);
              mq.i = j;
              object.b(89, j);
              if (mq.i != -1)
                object.b(88, -2); 
              break;
            } 
            if (k == 3) {
              String str = typedArray.getString(j);
              mq.h = str;
              object.d(str, 90);
              if (mq.h.indexOf("/") > 0) {
                j = typedArray.getResourceId(j, -1);
                mq.i = j;
                object.b(89, j);
                object.b(88, -2);
                break;
              } 
              object.b(88, -1);
              break;
            } 
            object.b(88, typedArray.getInteger(j, mq.i));
            break;
          case 85:
            object.a(85, typedArray.getFloat(j, mq.f));
            break;
          case 84:
            object.b(84, typedArray.getInteger(j, mq.g));
            break;
          case 83:
            object.b(83, i(typedArray, j, oq.h));
            break;
          case 82:
            object.b(82, typedArray.getInteger(j, mq.b));
            break;
          case 81:
            object.c(81, typedArray.getBoolean(j, lq.m0));
            break;
          case 80:
            object.c(80, typedArray.getBoolean(j, lq.l0));
            break;
          case 79:
            object.a(79, typedArray.getFloat(j, mq.d));
            break;
          case 78:
            object.b(78, typedArray.getInt(j, nq.b));
            break;
          case 77:
            object.d(typedArray.getString(j), 77);
            break;
          case 76:
            object.b(76, typedArray.getInt(j, mq.c));
            break;
          case 75:
            object.c(75, typedArray.getBoolean(j, lq.n0));
            break;
          case 74:
            object.d(typedArray.getString(j), 74);
            break;
          case 73:
            object.b(73, typedArray.getDimensionPixelSize(j, lq.g0));
            break;
          case 72:
            object.b(72, typedArray.getInt(j, lq.f0));
            break;
          case 71:
            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
            break;
          case 70:
            object.a(70, typedArray.getFloat(j, 1.0F));
            break;
          case 69:
            object.a(69, typedArray.getFloat(j, 1.0F));
            break;
          case 68:
            object.a(68, typedArray.getFloat(j, nq.d));
            break;
          case 67:
            object.a(67, typedArray.getFloat(j, mq.e));
            break;
          case 66:
            object.b(66, typedArray.getInt(j, 0));
            break;
          case 65:
            if ((typedArray.peekValue(j)).type == 3) {
              object.d(typedArray.getString(j), 65);
              break;
            } 
            object.d(arrayOfString[typedArray.getInteger(j, 0)], 65);
            break;
          case 64:
            object.b(64, i(typedArray, j, mq.a));
            break;
          case 63:
            object.a(63, typedArray.getFloat(j, lq.B));
            break;
          case 62:
            object.b(62, typedArray.getDimensionPixelSize(j, lq.A));
            break;
          case 60:
            object.a(60, typedArray.getFloat(j, oq.a));
            break;
          case 59:
            object.b(59, typedArray.getDimensionPixelSize(j, lq.c0));
            break;
          case 58:
            object.b(58, typedArray.getDimensionPixelSize(j, lq.b0));
            break;
          case 57:
            object.b(57, typedArray.getDimensionPixelSize(j, lq.a0));
            break;
          case 56:
            object.b(56, typedArray.getDimensionPixelSize(j, lq.Z));
            break;
          case 55:
            object.b(55, typedArray.getInt(j, lq.Y));
            break;
          case 54:
            object.b(54, typedArray.getInt(j, lq.X));
            break;
          case 53:
            object.a(53, typedArray.getDimension(j, oq.k));
            break;
          case 52:
            object.a(52, typedArray.getDimension(j, oq.j));
            break;
          case 51:
            object.a(51, typedArray.getDimension(j, oq.i));
            break;
          case 50:
            object.a(50, typedArray.getDimension(j, oq.g));
            break;
          case 49:
            object.a(49, typedArray.getDimension(j, oq.f));
            break;
          case 48:
            object.a(48, typedArray.getFloat(j, oq.e));
            break;
          case 47:
            object.a(47, typedArray.getFloat(j, oq.d));
            break;
          case 46:
            object.a(46, typedArray.getFloat(j, oq.c));
            break;
          case 45:
            object.a(45, typedArray.getFloat(j, oq.b));
            break;
          case 44:
            object.c(44, true);
            object.a(44, typedArray.getDimension(j, oq.m));
            break;
          case 43:
            object.a(43, typedArray.getFloat(j, nq.c));
            break;
          case 42:
            object.b(42, typedArray.getInt(j, lq.W));
            break;
          case 41:
            object.b(41, typedArray.getInt(j, lq.V));
            break;
          case 40:
            object.a(40, typedArray.getFloat(j, lq.T));
            break;
          case 39:
            object.a(39, typedArray.getFloat(j, lq.U));
            break;
          case 38:
            j = typedArray.getResourceId(j, kq.a);
            kq.a = j;
            object.b(38, j);
            break;
          case 37:
            object.a(37, typedArray.getFloat(j, lq.x));
            break;
          case 34:
            object.b(34, typedArray.getDimensionPixelSize(j, lq.H));
            break;
          case 31:
            object.b(31, typedArray.getDimensionPixelSize(j, lq.K));
            break;
          case 28:
            object.b(28, typedArray.getDimensionPixelSize(j, lq.G));
            break;
          case 27:
            object.b(27, typedArray.getInt(j, lq.E));
            break;
          case 24:
            object.b(24, typedArray.getDimensionPixelSize(j, lq.F));
            break;
          case 23:
            object.b(23, typedArray.getLayoutDimension(j, lq.b));
            break;
          case 22:
            object.b(22, arrayOfInt2[typedArray.getInt(j, nq.a)]);
            break;
          case 21:
            object.b(21, typedArray.getLayoutDimension(j, lq.c));
            break;
          case 20:
            object.a(20, typedArray.getFloat(j, lq.w));
            break;
          case 19:
            object.a(19, typedArray.getFloat(j, lq.f));
            break;
          case 18:
            object.b(18, typedArray.getDimensionPixelOffset(j, lq.e));
            break;
          case 17:
            object.b(17, typedArray.getDimensionPixelOffset(j, lq.d));
            break;
          case 16:
            object.b(16, typedArray.getDimensionPixelSize(j, lq.N));
            break;
          case 15:
            object.b(15, typedArray.getDimensionPixelSize(j, lq.R));
            break;
          case 14:
            object.b(14, typedArray.getDimensionPixelSize(j, lq.O));
            break;
          case 13:
            object.b(13, typedArray.getDimensionPixelSize(j, lq.M));
            break;
          case 12:
            object.b(12, typedArray.getDimensionPixelSize(j, lq.Q));
            break;
          case 11:
            object.b(11, typedArray.getDimensionPixelSize(j, lq.P));
            break;
          case 8:
            object.b(8, typedArray.getDimensionPixelSize(j, lq.J));
            break;
          case 7:
            object.b(7, typedArray.getDimensionPixelOffset(j, lq.D));
            break;
          case 6:
            object.b(6, typedArray.getDimensionPixelOffset(j, lq.C));
            break;
          case 5:
            object.d(typedArray.getString(j), 5);
            break;
          case 2:
            object.b(2, typedArray.getDimensionPixelSize(j, lq.I));
            break;
        } 
      } 
    } else {
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j;
        StringBuilder stringBuilder;
        String str;
        int k = typedArray.getIndex(b);
        if (k != 1 && 23 != k && 24 != k) {
          mq.getClass();
          lq.getClass();
          oq.getClass();
        } 
        switch (sparseIntArray.get(k)) {
          default:
            stringBuilder = new StringBuilder("Unknown attribute 0x");
            stringBuilder.append(Integer.toHexString(k));
            stringBuilder.append("   ");
            stringBuilder.append(sparseIntArray.get(k));
            Log.w("ConstraintSet", stringBuilder.toString());
            break;
          case 97:
            lq.o0 = typedArray.getInt(k, lq.o0);
            break;
          case 96:
            j(lq, typedArray, k, 1);
            break;
          case 95:
            j(lq, typedArray, k, 0);
            break;
          case 94:
            lq.S = typedArray.getDimensionPixelSize(k, lq.S);
            break;
          case 93:
            lq.L = typedArray.getDimensionPixelSize(k, lq.L);
            break;
          case 92:
            lq.r = i(typedArray, k, lq.r);
            break;
          case 91:
            lq.q = i(typedArray, k, lq.q);
            break;
          case 87:
            stringBuilder = new StringBuilder("unused attribute 0x");
            stringBuilder.append(Integer.toHexString(k));
            stringBuilder.append("   ");
            stringBuilder.append(sparseIntArray.get(k));
            Log.w("ConstraintSet", stringBuilder.toString());
            break;
          case 86:
            j = (typedArray.peekValue(k)).type;
            if (j == 1) {
              mq.i = typedArray.getResourceId(k, -1);
              break;
            } 
            if (j == 3) {
              String str1 = typedArray.getString(k);
              mq.h = str1;
              if (str1.indexOf("/") > 0)
                mq.i = typedArray.getResourceId(k, -1); 
              break;
            } 
            typedArray.getInteger(k, mq.i);
            break;
          case 85:
            mq.f = typedArray.getFloat(k, mq.f);
            break;
          case 84:
            mq.g = typedArray.getInteger(k, mq.g);
            break;
          case 83:
            oq.h = i(typedArray, k, oq.h);
            break;
          case 82:
            mq.b = typedArray.getInteger(k, mq.b);
            break;
          case 81:
            lq.m0 = typedArray.getBoolean(k, lq.m0);
            break;
          case 80:
            lq.l0 = typedArray.getBoolean(k, lq.l0);
            break;
          case 79:
            mq.d = typedArray.getFloat(k, mq.d);
            break;
          case 78:
            nq.b = typedArray.getInt(k, nq.b);
            break;
          case 77:
            lq.k0 = typedArray.getString(k);
            break;
          case 76:
            mq.c = typedArray.getInt(k, mq.c);
            break;
          case 75:
            lq.n0 = typedArray.getBoolean(k, lq.n0);
            break;
          case 74:
            lq.j0 = typedArray.getString(k);
            break;
          case 73:
            lq.g0 = typedArray.getDimensionPixelSize(k, lq.g0);
            break;
          case 72:
            lq.f0 = typedArray.getInt(k, lq.f0);
            break;
          case 71:
            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
            break;
          case 70:
            lq.e0 = typedArray.getFloat(k, 1.0F);
            break;
          case 69:
            lq.d0 = typedArray.getFloat(k, 1.0F);
            break;
          case 68:
            nq.d = typedArray.getFloat(k, nq.d);
            break;
          case 67:
            mq.e = typedArray.getFloat(k, mq.e);
            break;
          case 66:
            typedArray.getInt(k, 0);
            mq.getClass();
            break;
          case 65:
            if ((typedArray.peekValue(k)).type == 3) {
              typedArray.getString(k);
              mq.getClass();
              break;
            } 
            str = arrayOfString[typedArray.getInteger(k, 0)];
            mq.getClass();
            break;
          case 64:
            mq.a = i(typedArray, k, mq.a);
            break;
          case 63:
            lq.B = typedArray.getFloat(k, lq.B);
            break;
          case 62:
            lq.A = typedArray.getDimensionPixelSize(k, lq.A);
            break;
          case 61:
            lq.z = i(typedArray, k, lq.z);
            break;
          case 60:
            oq.a = typedArray.getFloat(k, oq.a);
            break;
          case 59:
            lq.c0 = typedArray.getDimensionPixelSize(k, lq.c0);
            break;
          case 58:
            lq.b0 = typedArray.getDimensionPixelSize(k, lq.b0);
            break;
          case 57:
            lq.a0 = typedArray.getDimensionPixelSize(k, lq.a0);
            break;
          case 56:
            lq.Z = typedArray.getDimensionPixelSize(k, lq.Z);
            break;
          case 55:
            lq.Y = typedArray.getInt(k, lq.Y);
            break;
          case 54:
            lq.X = typedArray.getInt(k, lq.X);
            break;
          case 53:
            oq.k = typedArray.getDimension(k, oq.k);
            break;
          case 52:
            oq.j = typedArray.getDimension(k, oq.j);
            break;
          case 51:
            oq.i = typedArray.getDimension(k, oq.i);
            break;
          case 50:
            oq.g = typedArray.getDimension(k, oq.g);
            break;
          case 49:
            oq.f = typedArray.getDimension(k, oq.f);
            break;
          case 48:
            oq.e = typedArray.getFloat(k, oq.e);
            break;
          case 47:
            oq.d = typedArray.getFloat(k, oq.d);
            break;
          case 46:
            oq.c = typedArray.getFloat(k, oq.c);
            break;
          case 45:
            oq.b = typedArray.getFloat(k, oq.b);
            break;
          case 44:
            oq.l = true;
            oq.m = typedArray.getDimension(k, oq.m);
            break;
          case 43:
            nq.c = typedArray.getFloat(k, nq.c);
            break;
          case 42:
            lq.W = typedArray.getInt(k, lq.W);
            break;
          case 41:
            lq.V = typedArray.getInt(k, lq.V);
            break;
          case 40:
            lq.T = typedArray.getFloat(k, lq.T);
            break;
          case 39:
            lq.U = typedArray.getFloat(k, lq.U);
            break;
          case 38:
            kq.a = typedArray.getResourceId(k, kq.a);
            break;
          case 37:
            lq.x = typedArray.getFloat(k, lq.x);
            break;
          case 36:
            lq.l = i(typedArray, k, lq.l);
            break;
          case 35:
            lq.m = i(typedArray, k, lq.m);
            break;
          case 34:
            lq.H = typedArray.getDimensionPixelSize(k, lq.H);
            break;
          case 33:
            lq.t = i(typedArray, k, lq.t);
            break;
          case 32:
            lq.s = i(typedArray, k, lq.s);
            break;
          case 31:
            lq.K = typedArray.getDimensionPixelSize(k, lq.K);
            break;
          case 30:
            lq.k = i(typedArray, k, lq.k);
            break;
          case 29:
            lq.j = i(typedArray, k, lq.j);
            break;
          case 28:
            lq.G = typedArray.getDimensionPixelSize(k, lq.G);
            break;
          case 27:
            lq.E = typedArray.getInt(k, lq.E);
            break;
          case 26:
            lq.i = i(typedArray, k, lq.i);
            break;
          case 25:
            lq.h = i(typedArray, k, lq.h);
            break;
          case 24:
            lq.F = typedArray.getDimensionPixelSize(k, lq.F);
            break;
          case 23:
            lq.b = typedArray.getLayoutDimension(k, lq.b);
            break;
          case 22:
            j = typedArray.getInt(k, nq.a);
            nq.a = j;
            nq.a = arrayOfInt2[j];
            break;
          case 21:
            lq.c = typedArray.getLayoutDimension(k, lq.c);
            break;
          case 20:
            lq.w = typedArray.getFloat(k, lq.w);
            break;
          case 19:
            lq.f = typedArray.getFloat(k, lq.f);
            break;
          case 18:
            lq.e = typedArray.getDimensionPixelOffset(k, lq.e);
            break;
          case 17:
            lq.d = typedArray.getDimensionPixelOffset(k, lq.d);
            break;
          case 16:
            lq.N = typedArray.getDimensionPixelSize(k, lq.N);
            break;
          case 15:
            lq.R = typedArray.getDimensionPixelSize(k, lq.R);
            break;
          case 14:
            lq.O = typedArray.getDimensionPixelSize(k, lq.O);
            break;
          case 13:
            lq.M = typedArray.getDimensionPixelSize(k, lq.M);
            break;
          case 12:
            lq.Q = typedArray.getDimensionPixelSize(k, lq.Q);
            break;
          case 11:
            lq.P = typedArray.getDimensionPixelSize(k, lq.P);
            break;
          case 10:
            lq.u = i(typedArray, k, lq.u);
            break;
          case 9:
            lq.v = i(typedArray, k, lq.v);
            break;
          case 8:
            lq.J = typedArray.getDimensionPixelSize(k, lq.J);
            break;
          case 7:
            lq.D = typedArray.getDimensionPixelOffset(k, lq.D);
            break;
          case 6:
            lq.C = typedArray.getDimensionPixelOffset(k, lq.C);
            break;
          case 5:
            lq.y = typedArray.getString(k);
            break;
          case 4:
            lq.n = i(typedArray, k, lq.n);
            break;
          case 3:
            lq.o = i(typedArray, k, lq.o);
            break;
          case 2:
            lq.I = typedArray.getDimensionPixelSize(k, lq.I);
            break;
          case 1:
            lq.p = i(typedArray, k, lq.p);
            break;
        } 
      } 
      if (lq.j0 != null)
        lq.i0 = null; 
    } 
    typedArray.recycle();
    return kq;
  }
  
  public static int i(TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    paramInt2 = paramTypedArray.getResourceId(paramInt1, paramInt2);
    return (paramInt2 == -1) ? paramTypedArray.getInt(paramInt1, -1) : paramInt2;
  }
  
  public static void j(Object paramObject, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 7
    //   4: goto -> 702
    //   7: aload_1
    //   8: iload_2
    //   9: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   12: getfield type : I
    //   15: istore #6
    //   17: iconst_1
    //   18: istore #7
    //   20: iconst_0
    //   21: istore #5
    //   23: iload #6
    //   25: iconst_3
    //   26: if_icmpeq -> 235
    //   29: iload #6
    //   31: iconst_5
    //   32: if_icmpeq -> 97
    //   35: aload_1
    //   36: iload_2
    //   37: iconst_0
    //   38: invokevirtual getInt : (II)I
    //   41: istore #6
    //   43: iload #6
    //   45: bipush #-4
    //   47: if_icmpeq -> 91
    //   50: iload #6
    //   52: bipush #-3
    //   54: if_icmpeq -> 76
    //   57: iload #6
    //   59: istore_2
    //   60: iload #6
    //   62: bipush #-2
    //   64: if_icmpeq -> 85
    //   67: iload #6
    //   69: istore_2
    //   70: iload #6
    //   72: iconst_m1
    //   73: if_icmpeq -> 85
    //   76: iconst_0
    //   77: istore #7
    //   79: iload #5
    //   81: istore_2
    //   82: goto -> 107
    //   85: iconst_0
    //   86: istore #7
    //   88: goto -> 107
    //   91: bipush #-2
    //   93: istore_2
    //   94: goto -> 107
    //   97: aload_1
    //   98: iload_2
    //   99: iconst_0
    //   100: invokevirtual getDimensionPixelSize : (II)I
    //   103: istore_2
    //   104: goto -> 85
    //   107: aload_0
    //   108: instanceof gq
    //   111: ifeq -> 147
    //   114: aload_0
    //   115: checkcast gq
    //   118: astore_0
    //   119: iload_3
    //   120: ifne -> 135
    //   123: aload_0
    //   124: iload_2
    //   125: putfield width : I
    //   128: aload_0
    //   129: iload #7
    //   131: putfield W : Z
    //   134: return
    //   135: aload_0
    //   136: iload_2
    //   137: putfield height : I
    //   140: aload_0
    //   141: iload #7
    //   143: putfield X : Z
    //   146: return
    //   147: aload_0
    //   148: instanceof lq
    //   151: ifeq -> 187
    //   154: aload_0
    //   155: checkcast lq
    //   158: astore_0
    //   159: iload_3
    //   160: ifne -> 175
    //   163: aload_0
    //   164: iload_2
    //   165: putfield b : I
    //   168: aload_0
    //   169: iload #7
    //   171: putfield l0 : Z
    //   174: return
    //   175: aload_0
    //   176: iload_2
    //   177: putfield c : I
    //   180: aload_0
    //   181: iload #7
    //   183: putfield m0 : Z
    //   186: return
    //   187: aload_0
    //   188: instanceof jq
    //   191: ifeq -> 702
    //   194: aload_0
    //   195: checkcast jq
    //   198: astore_0
    //   199: iload_3
    //   200: ifne -> 219
    //   203: aload_0
    //   204: bipush #23
    //   206: iload_2
    //   207: invokevirtual b : (II)V
    //   210: aload_0
    //   211: bipush #80
    //   213: iload #7
    //   215: invokevirtual c : (IZ)V
    //   218: return
    //   219: aload_0
    //   220: bipush #21
    //   222: iload_2
    //   223: invokevirtual b : (II)V
    //   226: aload_0
    //   227: bipush #81
    //   229: iload #7
    //   231: invokevirtual c : (IZ)V
    //   234: return
    //   235: aload_1
    //   236: iload_2
    //   237: invokevirtual getString : (I)Ljava/lang/String;
    //   240: astore_1
    //   241: aload_1
    //   242: ifnonnull -> 248
    //   245: goto -> 702
    //   248: aload_1
    //   249: bipush #61
    //   251: invokevirtual indexOf : (I)I
    //   254: istore_2
    //   255: aload_1
    //   256: invokevirtual length : ()I
    //   259: istore #5
    //   261: iload_2
    //   262: ifle -> 702
    //   265: iload_2
    //   266: iload #5
    //   268: iconst_1
    //   269: isub
    //   270: if_icmpge -> 702
    //   273: aload_1
    //   274: iconst_0
    //   275: iload_2
    //   276: invokevirtual substring : (II)Ljava/lang/String;
    //   279: astore #8
    //   281: aload_1
    //   282: iload_2
    //   283: iconst_1
    //   284: iadd
    //   285: invokevirtual substring : (I)Ljava/lang/String;
    //   288: astore_1
    //   289: aload_1
    //   290: invokevirtual length : ()I
    //   293: ifle -> 702
    //   296: aload #8
    //   298: invokevirtual trim : ()Ljava/lang/String;
    //   301: astore #8
    //   303: aload_1
    //   304: invokevirtual trim : ()Ljava/lang/String;
    //   307: astore_1
    //   308: ldc_w 'ratio'
    //   311: aload #8
    //   313: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   316: ifeq -> 387
    //   319: aload_0
    //   320: instanceof gq
    //   323: ifeq -> 354
    //   326: aload_0
    //   327: checkcast gq
    //   330: astore_0
    //   331: iload_3
    //   332: ifne -> 343
    //   335: aload_0
    //   336: iconst_0
    //   337: putfield width : I
    //   340: goto -> 348
    //   343: aload_0
    //   344: iconst_0
    //   345: putfield height : I
    //   348: aload_0
    //   349: aload_1
    //   350: invokestatic k : (Lgq;Ljava/lang/String;)V
    //   353: return
    //   354: aload_0
    //   355: instanceof lq
    //   358: ifeq -> 370
    //   361: aload_0
    //   362: checkcast lq
    //   365: aload_1
    //   366: putfield y : Ljava/lang/String;
    //   369: return
    //   370: aload_0
    //   371: instanceof jq
    //   374: ifeq -> 702
    //   377: aload_0
    //   378: checkcast jq
    //   381: aload_1
    //   382: iconst_5
    //   383: invokevirtual d : (Ljava/lang/String;I)V
    //   386: return
    //   387: ldc_w 'weight'
    //   390: aload #8
    //   392: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   395: ifeq -> 532
    //   398: aload_1
    //   399: invokestatic parseFloat : (Ljava/lang/String;)F
    //   402: fstore #4
    //   404: aload_0
    //   405: instanceof gq
    //   408: ifeq -> 444
    //   411: aload_0
    //   412: checkcast gq
    //   415: astore_0
    //   416: iload_3
    //   417: ifne -> 432
    //   420: aload_0
    //   421: iconst_0
    //   422: putfield width : I
    //   425: aload_0
    //   426: fload #4
    //   428: putfield H : F
    //   431: return
    //   432: aload_0
    //   433: iconst_0
    //   434: putfield height : I
    //   437: aload_0
    //   438: fload #4
    //   440: putfield I : F
    //   443: return
    //   444: aload_0
    //   445: instanceof lq
    //   448: ifeq -> 484
    //   451: aload_0
    //   452: checkcast lq
    //   455: astore_0
    //   456: iload_3
    //   457: ifne -> 472
    //   460: aload_0
    //   461: iconst_0
    //   462: putfield b : I
    //   465: aload_0
    //   466: fload #4
    //   468: putfield U : F
    //   471: return
    //   472: aload_0
    //   473: iconst_0
    //   474: putfield c : I
    //   477: aload_0
    //   478: fload #4
    //   480: putfield T : F
    //   483: return
    //   484: aload_0
    //   485: instanceof jq
    //   488: ifeq -> 702
    //   491: aload_0
    //   492: checkcast jq
    //   495: astore_0
    //   496: iload_3
    //   497: ifne -> 516
    //   500: aload_0
    //   501: bipush #23
    //   503: iconst_0
    //   504: invokevirtual b : (II)V
    //   507: aload_0
    //   508: bipush #39
    //   510: fload #4
    //   512: invokevirtual a : (IF)V
    //   515: return
    //   516: aload_0
    //   517: bipush #21
    //   519: iconst_0
    //   520: invokevirtual b : (II)V
    //   523: aload_0
    //   524: bipush #40
    //   526: fload #4
    //   528: invokevirtual a : (IF)V
    //   531: return
    //   532: ldc_w 'parent'
    //   535: aload #8
    //   537: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   540: ifeq -> 702
    //   543: fconst_0
    //   544: fconst_1
    //   545: aload_1
    //   546: invokestatic parseFloat : (Ljava/lang/String;)F
    //   549: invokestatic min : (FF)F
    //   552: invokestatic max : (FF)F
    //   555: fstore #4
    //   557: aload_0
    //   558: instanceof gq
    //   561: ifeq -> 607
    //   564: aload_0
    //   565: checkcast gq
    //   568: astore_0
    //   569: iload_3
    //   570: ifne -> 590
    //   573: aload_0
    //   574: iconst_0
    //   575: putfield width : I
    //   578: aload_0
    //   579: fload #4
    //   581: putfield R : F
    //   584: aload_0
    //   585: iconst_2
    //   586: putfield L : I
    //   589: return
    //   590: aload_0
    //   591: iconst_0
    //   592: putfield height : I
    //   595: aload_0
    //   596: fload #4
    //   598: putfield S : F
    //   601: aload_0
    //   602: iconst_2
    //   603: putfield M : I
    //   606: return
    //   607: aload_0
    //   608: instanceof lq
    //   611: ifeq -> 657
    //   614: aload_0
    //   615: checkcast lq
    //   618: astore_0
    //   619: iload_3
    //   620: ifne -> 640
    //   623: aload_0
    //   624: iconst_0
    //   625: putfield b : I
    //   628: aload_0
    //   629: fload #4
    //   631: putfield d0 : F
    //   634: aload_0
    //   635: iconst_2
    //   636: putfield X : I
    //   639: return
    //   640: aload_0
    //   641: iconst_0
    //   642: putfield c : I
    //   645: aload_0
    //   646: fload #4
    //   648: putfield e0 : F
    //   651: aload_0
    //   652: iconst_2
    //   653: putfield Y : I
    //   656: return
    //   657: aload_0
    //   658: instanceof jq
    //   661: ifeq -> 702
    //   664: aload_0
    //   665: checkcast jq
    //   668: astore_0
    //   669: iload_3
    //   670: ifne -> 688
    //   673: aload_0
    //   674: bipush #23
    //   676: iconst_0
    //   677: invokevirtual b : (II)V
    //   680: aload_0
    //   681: bipush #54
    //   683: iconst_2
    //   684: invokevirtual b : (II)V
    //   687: return
    //   688: aload_0
    //   689: bipush #21
    //   691: iconst_0
    //   692: invokevirtual b : (II)V
    //   695: aload_0
    //   696: bipush #55
    //   698: iconst_2
    //   699: invokevirtual b : (II)V
    //   702: return
    //   703: astore_0
    //   704: goto -> 702
    // Exception table:
    //   from	to	target	type
    //   398	416	703	java/lang/NumberFormatException
    //   420	431	703	java/lang/NumberFormatException
    //   432	443	703	java/lang/NumberFormatException
    //   444	456	703	java/lang/NumberFormatException
    //   460	471	703	java/lang/NumberFormatException
    //   472	483	703	java/lang/NumberFormatException
    //   484	496	703	java/lang/NumberFormatException
    //   500	515	703	java/lang/NumberFormatException
    //   516	531	703	java/lang/NumberFormatException
    //   543	569	703	java/lang/NumberFormatException
    //   573	589	703	java/lang/NumberFormatException
    //   590	606	703	java/lang/NumberFormatException
    //   607	619	703	java/lang/NumberFormatException
    //   623	639	703	java/lang/NumberFormatException
    //   640	656	703	java/lang/NumberFormatException
    //   657	669	703	java/lang/NumberFormatException
    //   673	687	703	java/lang/NumberFormatException
    //   688	702	703	java/lang/NumberFormatException
  }
  
  public static void k(gq paramgq, String paramString) {
    if (paramString != null) {
      int m = paramString.length();
      int n = paramString.indexOf(',');
      byte b2 = 0;
      byte b1 = 0;
      int k = -1;
      int j = b2;
      int i = k;
      if (n > 0) {
        j = b2;
        i = k;
        if (n < m - 1) {
          String str = paramString.substring(0, n);
          if (str.equalsIgnoreCase("W")) {
            i = b1;
          } else if (str.equalsIgnoreCase("H")) {
            i = 1;
          } else {
            i = -1;
          } 
          j = n + 1;
        } 
      } 
      k = paramString.indexOf(':');
      if (k >= 0 && k < m - 1) {
        String str2 = paramString.substring(j, k);
        String str1 = paramString.substring(k + 1);
        if (str2.length() > 0 && str1.length() > 0)
          try {
            float f2 = Float.parseFloat(str2);
            float f1 = Float.parseFloat(str1);
            if (f2 > 0.0F && f1 > 0.0F)
              if (i == 1) {
                Math.abs(f1 / f2);
              } else {
                Math.abs(f2 / f1);
              }  
          } catch (NumberFormatException numberFormatException) {} 
      } else {
        String str = paramString.substring(j);
        if (str.length() > 0)
          Float.parseFloat(str); 
      } 
    } 
    paramgq.G = paramString;
  }
  
  public static String n(int paramInt) {
    switch (paramInt) {
      default:
        return "undefined";
      case 7:
        return "end";
      case 6:
        return "start";
      case 5:
        return "baseline";
      case 4:
        return "bottom";
      case 3:
        return "top";
      case 2:
        return "right";
      case 1:
        break;
    } 
    return "left";
  }
  
  public final void a(ConstraintLayout paramConstraintLayout) {
    b(paramConstraintLayout);
    paramConstraintLayout.setConstraintSet(null);
    paramConstraintLayout.requestLayout();
  }
  
  public final void b(ConstraintLayout paramConstraintLayout) {
    int j = paramConstraintLayout.getChildCount();
    HashMap hashMap = this.c;
    HashSet hashSet = new HashSet(hashMap.keySet());
    int i;
    for (i = 0; i < j; i++) {
      View view = paramConstraintLayout.getChildAt(i);
      int k = view.getId();
      if (!hashMap.containsKey(Integer.valueOf(k))) {
        String str;
        StringBuilder stringBuilder = new StringBuilder("id unknown ");
        try {
          str = view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception exception) {
          str = "UNKNOWN";
        } 
        stringBuilder.append(str);
        Log.w("ConstraintSet", stringBuilder.toString());
      } else if (!this.b || k != -1) {
        if (k != -1)
          if (hashMap.containsKey(Integer.valueOf(k))) {
            hashSet.remove(Integer.valueOf(k));
            kq kq = (kq)hashMap.get(Integer.valueOf(k));
            if (kq != null) {
              nq nq = kq.b;
              lq lq = kq.d;
              oq oq = kq.e;
              if (view instanceof Barrier) {
                lq.h0 = 1;
                Barrier barrier = (Barrier)view;
                barrier.setId(k);
                barrier.setType(lq.f0);
                barrier.setMargin(lq.g0);
                barrier.setAllowsGoneWidget(lq.n0);
                int[] arrayOfInt = lq.i0;
                if (arrayOfInt != null) {
                  barrier.setReferencedIds(arrayOfInt);
                } else {
                  String str = lq.j0;
                  if (str != null) {
                    int[] arrayOfInt1 = e(barrier, str);
                    lq.i0 = arrayOfInt1;
                    barrier.setReferencedIds(arrayOfInt1);
                  } 
                } 
              } 
              gq gq = (gq)view.getLayoutParams();
              gq.a();
              kq.a(gq);
              HashMap hashMap1 = kq.f;
              Class<?> clazz = view.getClass();
              for (String str2 : hashMap1.keySet()) {
                String str1;
                cq cq = (cq)hashMap1.get(str2);
                if (!cq.a) {
                  str1 = x41.k("set", str2);
                } else {
                  str1 = str2;
                } 
                try {
                  StringBuilder stringBuilder1;
                  Method method;
                  ColorDrawable colorDrawable;
                  k = x41.y(cq.b);
                  Class<float> clazz2 = float.class;
                  Class<int> clazz1 = int.class;
                  switch (k) {
                    default:
                      continue;
                    case 7:
                      clazz.getMethod(str1, new Class[] { clazz1 }).invoke(view, new Object[] { Integer.valueOf(cq.c) });
                      continue;
                    case 6:
                      clazz.getMethod(str1, new Class[] { clazz2 }).invoke(view, new Object[] { Float.valueOf(cq.d) });
                      continue;
                    case 5:
                      clazz.getMethod(str1, new Class[] { boolean.class }).invoke(view, new Object[] { Boolean.valueOf(cq.f) });
                      continue;
                    case 4:
                      clazz.getMethod(str1, new Class[] { CharSequence.class }).invoke(view, new Object[] { cq.e });
                      continue;
                    case 3:
                      method = clazz.getMethod(str1, new Class[] { Drawable.class });
                      try {
                        colorDrawable = new ColorDrawable();
                        this();
                        colorDrawable.setColor(cq.g);
                        method.invoke(view, new Object[] { colorDrawable });
                        continue;
                      } catch (NoSuchMethodException noSuchMethodException1) {
                        break;
                      } catch (IllegalAccessException illegalAccessException) {
                      
                      } catch (InvocationTargetException null) {}
                      stringBuilder1 = x41.q(" Custom Attribute \"", (String)noSuchMethodException1, "\" not found on ");
                      stringBuilder1.append(clazz.getName());
                      Log.e("TransitionLayout", stringBuilder1.toString(), invocationTargetException);
                      continue;
                    case 2:
                      clazz.getMethod((String)invocationTargetException, new Class[] { (Class)method }).invoke(view, new Object[] { Integer.valueOf(cq.g) });
                      continue;
                    case 1:
                      clazz.getMethod((String)invocationTargetException, new Class[] { (Class)colorDrawable }).invoke(view, new Object[] { Float.valueOf(cq.d) });
                      continue;
                    case 0:
                      clazz.getMethod((String)invocationTargetException, new Class[] { (Class)method }).invoke(view, new Object[] { Integer.valueOf(cq.c) });
                      continue;
                  } 
                } catch (NoSuchMethodException noSuchMethodException) {
                
                } catch (IllegalAccessException illegalAccessException) {
                
                } catch (InvocationTargetException invocationTargetException) {}
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(clazz.getName());
                stringBuilder.append(" must have a method ");
                stringBuilder.append((String)invocationTargetException);
                Log.e("TransitionLayout", stringBuilder.toString(), noSuchMethodException);
              } 
              HashSet hashSet1 = hashSet;
              k = i;
              view.setLayoutParams((ViewGroup.LayoutParams)gq);
              if (nq.b == 0)
                view.setVisibility(nq.a); 
              view.setAlpha(nq.c);
              view.setRotation(oq.a);
              view.setRotationX(oq.b);
              view.setRotationY(oq.c);
              view.setScaleX(oq.d);
              view.setScaleY(oq.e);
              if (oq.h != -1) {
                View view1 = ((View)view.getParent()).findViewById(oq.h);
                if (view1 != null) {
                  i = view1.getTop();
                  float f2 = (view1.getBottom() + i) / 2.0F;
                  i = view1.getLeft();
                  float f1 = (view1.getRight() + i) / 2.0F;
                  if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                    float f3 = view.getLeft();
                    float f4 = view.getTop();
                    view.setPivotX(f1 - f3);
                    view.setPivotY(f2 - f4);
                  } 
                } 
              } else {
                if (!Float.isNaN(oq.f))
                  view.setPivotX(oq.f); 
                if (!Float.isNaN(oq.g))
                  view.setPivotY(oq.g); 
              } 
              view.setTranslationX(oq.i);
              view.setTranslationY(oq.j);
              view.setTranslationZ(oq.k);
              hashSet = hashSet1;
              i = k;
              if (oq.l) {
                view.setElevation(oq.m);
                hashSet = hashSet1;
                i = k;
              } 
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder(hbrAVtEa.ICD);
            stringBuilder.append(k);
            Log.v("ConstraintSet", stringBuilder.toString());
          }  
      } else {
        l0.f("All children of ConstraintLayout must have ids to use ConstraintSet");
        return;
      } 
    } 
    for (Integer integer : hashSet) {
      kq kq = (kq)hashMap.get(integer);
      if (kq == null)
        continue; 
      lq lq = kq.d;
      if (lq.h0 == 1) {
        Barrier barrier = new Barrier(paramConstraintLayout.getContext());
        barrier.setId(integer.intValue());
        int[] arrayOfInt = lq.i0;
        if (arrayOfInt != null) {
          barrier.setReferencedIds(arrayOfInt);
        } else {
          String str = lq.j0;
          if (str != null) {
            int[] arrayOfInt1 = e(barrier, str);
            lq.i0 = arrayOfInt1;
            barrier.setReferencedIds(arrayOfInt1);
          } 
        } 
        barrier.setType(lq.f0);
        barrier.setMargin(lq.g0);
        km1 km1 = ConstraintLayout.r;
        gq gq = new gq(-2);
        barrier.j();
        kq.a(gq);
        paramConstraintLayout.addView((View)barrier, (ViewGroup.LayoutParams)gq);
      } 
      if (lq.a) {
        Guideline guideline = new Guideline(paramConstraintLayout.getContext());
        guideline.setId(integer.intValue());
        km1 km1 = ConstraintLayout.r;
        gq gq = new gq(-2);
        kq.a(gq);
        paramConstraintLayout.addView((View)guideline, (ViewGroup.LayoutParams)gq);
      } 
    } 
    for (i = 0; i < j; i++) {
      View view = paramConstraintLayout.getChildAt(i);
      if (view instanceof eq)
        ((eq)view).e(paramConstraintLayout); 
    } 
  }
  
  public final void c(ConstraintLayout paramConstraintLayout) {
    int i = paramConstraintLayout.getChildCount();
    HashMap<Integer, kq> hashMap = this.c;
    hashMap.clear();
    byte b = 0;
    while (b < i) {
      View view = paramConstraintLayout.getChildAt(b);
      gq gq = (gq)view.getLayoutParams();
      int j = view.getId();
      if (!this.b || j != -1) {
        if (!hashMap.containsKey(Integer.valueOf(j)))
          hashMap.put(Integer.valueOf(j), new kq()); 
        kq kq = hashMap.get(Integer.valueOf(j));
        if (kq != null) {
          nq nq = kq.b;
          lq lq = kq.d;
          oq oq = kq.e;
          HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
          Class<?> clazz = view.getClass();
          HashMap hashMap1 = this.a;
          for (String str : hashMap1.keySet()) {
            cq cq1 = (cq)hashMap1.get(str);
            try {
              if (str.equals("BackgroundColor")) {
                int k = ((ColorDrawable)view.getBackground()).getColor();
                cq cq = new cq();
                this(cq1, Integer.valueOf(k));
                hashMap2.put(str, cq);
                continue;
              } 
            } catch (NoSuchMethodException noSuchMethodException) {
            
            } catch (IllegalAccessException illegalAccessException) {
            
            } catch (InvocationTargetException invocationTargetException) {}
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("getMap");
            stringBuilder.append(str);
            Object object = clazz.getMethod(stringBuilder.toString(), null).invoke(view, null);
            cq cq2 = new cq();
            this((cq)invocationTargetException, object);
            hashMap2.put(str, cq2);
          } 
          kq.f = hashMap2;
          kq.a = j;
          lq.h = gq.e;
          lq.i = gq.f;
          lq.j = gq.g;
          lq.k = gq.h;
          lq.l = gq.i;
          lq.m = gq.j;
          lq.n = gq.k;
          lq.o = gq.l;
          lq.p = gq.m;
          lq.q = gq.n;
          lq.r = gq.o;
          lq.s = gq.s;
          lq.t = gq.t;
          lq.u = gq.u;
          lq.v = gq.v;
          lq.w = gq.E;
          lq.x = gq.F;
          lq.y = gq.G;
          lq.z = gq.p;
          lq.A = gq.q;
          lq.B = gq.r;
          lq.C = gq.T;
          lq.D = gq.U;
          lq.E = gq.V;
          lq.f = gq.c;
          lq.d = gq.a;
          lq.e = gq.b;
          lq.b = gq.width;
          lq.c = gq.height;
          lq.F = gq.leftMargin;
          lq.G = gq.rightMargin;
          lq.H = gq.topMargin;
          lq.I = gq.bottomMargin;
          lq.L = gq.D;
          lq.T = gq.I;
          lq.U = gq.H;
          lq.W = gq.K;
          lq.V = gq.J;
          lq.l0 = gq.W;
          lq.m0 = gq.X;
          lq.X = gq.L;
          lq.Y = gq.M;
          lq.Z = gq.P;
          lq.a0 = gq.Q;
          lq.b0 = gq.N;
          lq.c0 = gq.O;
          lq.d0 = gq.R;
          lq.e0 = gq.S;
          lq.k0 = gq.Y;
          lq.N = gq.x;
          lq.P = gq.z;
          lq.M = gq.w;
          lq.O = gq.y;
          lq.R = gq.A;
          lq.Q = gq.B;
          lq.S = gq.C;
          lq.o0 = gq.Z;
          lq.J = gq.getMarginEnd();
          lq.K = gq.getMarginStart();
          nq.a = view.getVisibility();
          nq.c = view.getAlpha();
          oq.a = view.getRotation();
          oq.b = view.getRotationX();
          oq.c = view.getRotationY();
          oq.d = view.getScaleX();
          oq.e = view.getScaleY();
          float f1 = view.getPivotX();
          float f2 = view.getPivotY();
          if (f1 != 0.0D || f2 != 0.0D) {
            oq.f = f1;
            oq.g = f2;
          } 
          oq.i = view.getTranslationX();
          oq.j = view.getTranslationY();
          oq.k = view.getTranslationZ();
          if (oq.l)
            oq.m = view.getElevation(); 
          if (view instanceof Barrier) {
            Barrier barrier = (Barrier)view;
            lq.n0 = barrier.getAllowsGoneWidget();
            lq.i0 = barrier.getReferencedIds();
            lq.f0 = barrier.getType();
            lq.g0 = barrier.getMargin();
          } 
        } 
        b++;
        continue;
      } 
      l0.f("All children of ConstraintLayout must have ids to use ConstraintSet");
      return;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    String str1;
    StringBuilder stringBuilder;
    String str2;
    HashMap<Integer, kq> hashMap = this.c;
    if (!hashMap.containsKey(Integer.valueOf(paramInt1)))
      hashMap.put(Integer.valueOf(paramInt1), new kq()); 
    kq kq = hashMap.get(Integer.valueOf(paramInt1));
    if (kq == null)
      return; 
    lq lq = kq.d;
    switch (paramInt2) {
      default:
        str2 = n(paramInt2);
        str1 = n(paramInt4);
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(" to ");
        stringBuilder.append(str1);
        stringBuilder.append(" unknown");
        throw new IllegalArgumentException(stringBuilder.toString());
      case 7:
        if (paramInt4 == 7) {
          ((lq)str1).v = paramInt3;
          ((lq)str1).u = -1;
          return;
        } 
        if (paramInt4 == 6) {
          ((lq)str1).u = paramInt3;
          ((lq)str1).v = -1;
          return;
        } 
        tp.e(n(paramInt4), " undefined", "right to ");
        return;
      case 6:
        if (paramInt4 == 6) {
          ((lq)str1).t = paramInt3;
          ((lq)str1).s = -1;
          return;
        } 
        if (paramInt4 == 7) {
          ((lq)str1).s = paramInt3;
          ((lq)str1).t = -1;
          return;
        } 
        tp.e(n(paramInt4), " undefined", "right to ");
        return;
      case 5:
        if (paramInt4 == 5) {
          ((lq)str1).p = paramInt3;
          ((lq)str1).o = -1;
          ((lq)str1).n = -1;
          ((lq)str1).l = -1;
          ((lq)str1).m = -1;
          return;
        } 
        if (paramInt4 == 3) {
          ((lq)str1).q = paramInt3;
          ((lq)str1).o = -1;
          ((lq)str1).n = -1;
          ((lq)str1).l = -1;
          ((lq)str1).m = -1;
          return;
        } 
        if (paramInt4 == 4) {
          ((lq)str1).r = paramInt3;
          ((lq)str1).o = -1;
          ((lq)str1).n = -1;
          ((lq)str1).l = -1;
          ((lq)str1).m = -1;
          return;
        } 
        tp.e(n(paramInt4), " undefined", "right to ");
        return;
      case 4:
        if (paramInt4 == 4) {
          ((lq)str1).o = paramInt3;
          ((lq)str1).n = -1;
          ((lq)str1).p = -1;
          ((lq)str1).q = -1;
          ((lq)str1).r = -1;
          return;
        } 
        if (paramInt4 == 3) {
          ((lq)str1).n = paramInt3;
          ((lq)str1).o = -1;
          ((lq)str1).p = -1;
          ((lq)str1).q = -1;
          ((lq)str1).r = -1;
          return;
        } 
        tp.e(n(paramInt4), " undefined", "right to ");
        return;
      case 3:
        if (paramInt4 == 3) {
          ((lq)str1).l = paramInt3;
          ((lq)str1).m = -1;
          ((lq)str1).p = -1;
          ((lq)str1).q = -1;
          ((lq)str1).r = -1;
          return;
        } 
        if (paramInt4 == 4) {
          ((lq)str1).m = paramInt3;
          ((lq)str1).l = -1;
          ((lq)str1).p = -1;
          ((lq)str1).q = -1;
          ((lq)str1).r = -1;
          return;
        } 
        tp.e(n(paramInt4), " undefined", "right to ");
        return;
      case 2:
        if (paramInt4 == 1) {
          ((lq)str1).j = paramInt3;
          ((lq)str1).k = -1;
          return;
        } 
        if (paramInt4 == 2) {
          ((lq)str1).k = paramInt3;
          ((lq)str1).j = -1;
          return;
        } 
        tp.e(n(paramInt4), " undefined", "right to ");
        return;
      case 1:
        break;
    } 
    if (paramInt4 == 1) {
      ((lq)str1).h = paramInt3;
      ((lq)str1).i = -1;
      return;
    } 
    if (paramInt4 == 2) {
      ((lq)str1).i = paramInt3;
      ((lq)str1).h = -1;
      return;
    } 
    tp.e(n(paramInt4), " undefined", "left to ");
  }
  
  public final kq g(int paramInt) {
    HashMap<Integer, kq> hashMap = this.c;
    if (!hashMap.containsKey(Integer.valueOf(paramInt)))
      hashMap.put(Integer.valueOf(paramInt), new kq()); 
    return hashMap.get(Integer.valueOf(paramInt));
  }
  
  public final void h(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    try {
      for (int i = xmlResourceParser.getEventType(); i != 1; i = xmlResourceParser.next()) {
        if (i == 2) {
          String str = xmlResourceParser.getName();
          kq kq = f(paramContext, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), false);
          if (str.equalsIgnoreCase("Guideline"))
            kq.d.a = true; 
          this.c.put(Integer.valueOf(kq.a), kq);
        } 
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      StringBuilder stringBuilder = new StringBuilder("Error parsing resource: ");
      stringBuilder.append(paramInt);
      Log.e("ConstraintSet", stringBuilder.toString(), (Throwable)xmlPullParserException);
    } catch (IOException iOException) {}
  }
  
  public final void l(int paramInt1, int paramInt2, int paramInt3) {
    kq kq = g(paramInt1);
    switch (paramInt2) {
      default:
        l0.l("unknown constraint");
        return;
      case 7:
        kq.d.J = paramInt3;
        return;
      case 6:
        kq.d.K = paramInt3;
        return;
      case 5:
        kq.d.L = paramInt3;
        return;
      case 4:
        kq.d.I = paramInt3;
        return;
      case 3:
        kq.d.H = paramInt3;
        return;
      case 2:
        kq.d.G = paramInt3;
        return;
      case 1:
        break;
    } 
    kq.d.F = paramInt3;
  }
  
  public final void m(int paramInt1, int paramInt2) {
    (g(paramInt1)).b.a = paramInt2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */