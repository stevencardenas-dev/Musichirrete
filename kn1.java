import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.PlaylistEditActivity;

public final class kn1 extends pd1 {
  public final int a;
  
  public final int b;
  
  public final PlaylistEditActivity c;
  
  public kn1(Resources paramResources, PlaylistEditActivity paramPlaylistEditActivity) {
    this.a = (int)(paramResources.getDimension(2131165390) * 4.0F);
    this.b = (int)(paramResources.getDimension(2131165390) * 120.0F);
    this.c = paramPlaylistEditActivity;
  }
  
  public final void d(Rect paramRect, View paramView, RecyclerView paramRecyclerView, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: invokespecial d : (Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Lde1;)V
    //   9: aload_2
    //   10: invokestatic M : (Landroid/view/View;)I
    //   13: istore #7
    //   15: aload_3
    //   16: invokevirtual getAdapter : ()Lid1;
    //   19: invokevirtual c : ()I
    //   22: istore #5
    //   24: aload_3
    //   25: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   28: instanceof androidx/recyclerview/widget/GridLayoutManager
    //   31: istore #10
    //   33: iconst_1
    //   34: istore #9
    //   36: iload #10
    //   38: ifeq -> 114
    //   41: aload_3
    //   42: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   45: checkcast androidx/recyclerview/widget/GridLayoutManager
    //   48: getfield H : I
    //   51: istore #8
    //   53: iload #5
    //   55: iload #8
    //   57: irem
    //   58: istore #6
    //   60: iload #6
    //   62: ifeq -> 87
    //   65: iload #7
    //   67: iload #5
    //   69: iload #6
    //   71: isub
    //   72: if_icmplt -> 81
    //   75: iconst_1
    //   76: istore #5
    //   78: goto -> 100
    //   81: iconst_0
    //   82: istore #5
    //   84: goto -> 100
    //   87: iload #7
    //   89: iload #5
    //   91: iload #8
    //   93: isub
    //   94: if_icmplt -> 81
    //   97: goto -> 75
    //   100: iload #5
    //   102: istore #6
    //   104: iload #7
    //   106: iload #8
    //   108: if_icmpge -> 147
    //   111: goto -> 141
    //   114: iload #7
    //   116: iload #5
    //   118: iconst_1
    //   119: isub
    //   120: if_icmpne -> 129
    //   123: iconst_1
    //   124: istore #5
    //   126: goto -> 132
    //   129: iconst_0
    //   130: istore #5
    //   132: iload #5
    //   134: istore #6
    //   136: iload #7
    //   138: ifne -> 147
    //   141: iconst_1
    //   142: istore #6
    //   144: goto -> 158
    //   147: iconst_0
    //   148: istore #7
    //   150: iload #6
    //   152: istore #5
    //   154: iload #7
    //   156: istore #6
    //   158: iload #6
    //   160: ifeq -> 171
    //   163: aload_1
    //   164: aload_0
    //   165: getfield a : I
    //   168: putfield top : I
    //   171: aload_0
    //   172: getfield c : Lin/krosbits/musicolet/PlaylistEditActivity;
    //   175: astore_2
    //   176: aload_2
    //   177: ifnull -> 199
    //   180: aload_2
    //   181: getfield U : Ljava/util/HashSet;
    //   184: invokevirtual size : ()I
    //   187: ifle -> 193
    //   190: goto -> 204
    //   193: iconst_0
    //   194: istore #9
    //   196: goto -> 204
    //   199: invokestatic d : ()Z
    //   202: istore #9
    //   204: iload #9
    //   206: ifeq -> 222
    //   209: iload #5
    //   211: ifeq -> 222
    //   214: aload_1
    //   215: aload_0
    //   216: getfield b : I
    //   219: putfield bottom : I
    //   222: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */