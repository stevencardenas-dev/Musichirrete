import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

public final class lq {
  public static final SparseIntArray p0;
  
  public int A;
  
  public float B;
  
  public int C;
  
  public int D;
  
  public int E;
  
  public int F;
  
  public int G;
  
  public int H;
  
  public int I;
  
  public int J;
  
  public int K;
  
  public int L;
  
  public int M;
  
  public int N;
  
  public int O;
  
  public int P;
  
  public int Q;
  
  public int R;
  
  public int S;
  
  public float T;
  
  public float U;
  
  public int V;
  
  public int W;
  
  public int X;
  
  public int Y;
  
  public int Z;
  
  public boolean a;
  
  public int a0;
  
  public int b;
  
  public int b0;
  
  public int c;
  
  public int c0;
  
  public int d;
  
  public float d0;
  
  public int e;
  
  public float e0;
  
  public float f;
  
  public int f0;
  
  public boolean g;
  
  public int g0;
  
  public int h;
  
  public int h0;
  
  public int i;
  
  public int[] i0;
  
  public int j;
  
  public String j0;
  
  public int k;
  
  public String k0;
  
  public int l;
  
  public boolean l0;
  
  public int m;
  
  public boolean m0;
  
  public int n;
  
  public boolean n0;
  
  public int o;
  
  public int o0;
  
  public int p;
  
  public int q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public int u;
  
  public int v;
  
  public float w;
  
  public float x;
  
  public String y;
  
  public int z;
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    p0 = sparseIntArray;
    sparseIntArray.append(43, 24);
    sparseIntArray.append(44, 25);
    sparseIntArray.append(46, 28);
    sparseIntArray.append(47, 29);
    sparseIntArray.append(52, 35);
    sparseIntArray.append(51, 34);
    sparseIntArray.append(24, 4);
    sparseIntArray.append(23, 3);
    sparseIntArray.append(19, 1);
    sparseIntArray.append(61, 6);
    sparseIntArray.append(62, 7);
    sparseIntArray.append(31, 17);
    sparseIntArray.append(32, 18);
    sparseIntArray.append(33, 19);
    sparseIntArray.append(15, 90);
    sparseIntArray.append(0, 26);
    sparseIntArray.append(48, 31);
    sparseIntArray.append(49, 32);
    sparseIntArray.append(30, 10);
    sparseIntArray.append(29, 9);
    sparseIntArray.append(66, 13);
    sparseIntArray.append(69, 16);
    sparseIntArray.append(67, 14);
    sparseIntArray.append(64, 11);
    sparseIntArray.append(68, 15);
    sparseIntArray.append(65, 12);
    sparseIntArray.append(55, 38);
    sparseIntArray.append(41, 37);
    sparseIntArray.append(40, 39);
    sparseIntArray.append(54, 40);
    sparseIntArray.append(39, 20);
    sparseIntArray.append(53, 36);
    sparseIntArray.append(28, 5);
    sparseIntArray.append(42, 91);
    sparseIntArray.append(50, 91);
    sparseIntArray.append(45, 91);
    sparseIntArray.append(22, 91);
    sparseIntArray.append(18, 91);
    sparseIntArray.append(3, 23);
    sparseIntArray.append(5, 27);
    sparseIntArray.append(7, 30);
    sparseIntArray.append(8, 8);
    sparseIntArray.append(4, 33);
    sparseIntArray.append(6, 2);
    sparseIntArray.append(1, 22);
    sparseIntArray.append(2, 21);
    sparseIntArray.append(56, 41);
    sparseIntArray.append(34, 42);
    sparseIntArray.append(17, 87);
    sparseIntArray.append(16, 88);
    sparseIntArray.append(71, 76);
    sparseIntArray.append(25, 61);
    sparseIntArray.append(27, 62);
    sparseIntArray.append(26, 63);
    sparseIntArray.append(60, 69);
    sparseIntArray.append(38, 70);
    sparseIntArray.append(12, 71);
    sparseIntArray.append(10, 72);
    sparseIntArray.append(11, 73);
    sparseIntArray.append(13, 74);
    sparseIntArray.append(9, 75);
    sparseIntArray.append(58, 84);
    sparseIntArray.append(59, 86);
    sparseIntArray.append(58, 83);
    sparseIntArray.append(37, 85);
    sparseIntArray.append(56, 87);
    sparseIntArray.append(34, 88);
    sparseIntArray.append(91, 89);
    sparseIntArray.append(15, 90);
  }
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fc1.f);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      StringBuilder stringBuilder;
      int j = typedArray.getIndex(b);
      SparseIntArray sparseIntArray = p0;
      int k = sparseIntArray.get(j);
      switch (k) {
        default:
          switch (k) {
            default:
              switch (k) {
                default:
                  stringBuilder = new StringBuilder("Unknown attribute 0x");
                  stringBuilder.append(Integer.toHexString(j));
                  stringBuilder.append("   ");
                  stringBuilder.append(sparseIntArray.get(j));
                  Log.w("ConstraintSet", stringBuilder.toString());
                  break;
                case 91:
                  stringBuilder = new StringBuilder("unused attribute 0x");
                  stringBuilder.append(Integer.toHexString(j));
                  stringBuilder.append("   ");
                  stringBuilder.append(sparseIntArray.get(j));
                  Log.w("ConstraintSet", stringBuilder.toString());
                  break;
                case 90:
                  this.g = typedArray.getBoolean(j, this.g);
                  break;
                case 89:
                  this.k0 = typedArray.getString(j);
                  break;
                case 88:
                  this.m0 = typedArray.getBoolean(j, this.m0);
                  break;
                case 87:
                  this.l0 = typedArray.getBoolean(j, this.l0);
                  break;
                case 86:
                  this.b0 = typedArray.getDimensionPixelSize(j, this.b0);
                  break;
                case 85:
                  this.c0 = typedArray.getDimensionPixelSize(j, this.c0);
                  break;
                case 84:
                  this.Z = typedArray.getDimensionPixelSize(j, this.Z);
                  break;
                case 83:
                  this.a0 = typedArray.getDimensionPixelSize(j, this.a0);
                  break;
                case 82:
                  this.Y = typedArray.getInt(j, this.Y);
                  break;
                case 81:
                  this.X = typedArray.getInt(j, this.X);
                  break;
                case 80:
                  this.L = typedArray.getDimensionPixelSize(j, this.L);
                  break;
                case 79:
                  this.S = typedArray.getDimensionPixelSize(j, this.S);
                  break;
                case 78:
                  this.r = pq.i(typedArray, j, this.r);
                  break;
                case 77:
                  this.q = pq.i(typedArray, j, this.q);
                  break;
                case 76:
                  this.o0 = typedArray.getInt(j, this.o0);
                  break;
                case 75:
                  this.n0 = typedArray.getBoolean(j, this.n0);
                  break;
                case 74:
                  this.j0 = typedArray.getString(j);
                  break;
                case 73:
                  this.g0 = typedArray.getDimensionPixelSize(j, this.g0);
                  break;
                case 72:
                  this.f0 = typedArray.getInt(j, this.f0);
                  break;
                case 71:
                  Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                  break;
                case 70:
                  this.e0 = typedArray.getFloat(j, 1.0F);
                  break;
                case 69:
                  break;
              } 
              this.d0 = typedArray.getFloat(j, 1.0F);
              break;
            case 63:
              this.B = typedArray.getFloat(j, this.B);
              break;
            case 62:
              this.A = typedArray.getDimensionPixelSize(j, this.A);
              break;
            case 61:
              break;
          } 
          this.z = pq.i(typedArray, j, this.z);
          break;
        case 42:
          pq.j(this, typedArray, j, 1);
          break;
        case 41:
          pq.j(this, typedArray, j, 0);
          break;
        case 40:
          this.W = typedArray.getInt(j, this.W);
          break;
        case 39:
          this.V = typedArray.getInt(j, this.V);
          break;
        case 38:
          this.T = typedArray.getFloat(j, this.T);
          break;
        case 37:
          this.U = typedArray.getFloat(j, this.U);
          break;
        case 36:
          this.x = typedArray.getFloat(j, this.x);
          break;
        case 35:
          this.l = pq.i(typedArray, j, this.l);
          break;
        case 34:
          this.m = pq.i(typedArray, j, this.m);
          break;
        case 33:
          this.H = typedArray.getDimensionPixelSize(j, this.H);
          break;
        case 32:
          this.t = pq.i(typedArray, j, this.t);
          break;
        case 31:
          this.s = pq.i(typedArray, j, this.s);
          break;
        case 30:
          this.K = typedArray.getDimensionPixelSize(j, this.K);
          break;
        case 29:
          this.k = pq.i(typedArray, j, this.k);
          break;
        case 28:
          this.j = pq.i(typedArray, j, this.j);
          break;
        case 27:
          this.G = typedArray.getDimensionPixelSize(j, this.G);
          break;
        case 26:
          this.E = typedArray.getInt(j, this.E);
          break;
        case 25:
          this.i = pq.i(typedArray, j, this.i);
          break;
        case 24:
          this.h = pq.i(typedArray, j, this.h);
          break;
        case 23:
          this.F = typedArray.getDimensionPixelSize(j, this.F);
          break;
        case 22:
          this.b = typedArray.getLayoutDimension(j, this.b);
          break;
        case 21:
          this.c = typedArray.getLayoutDimension(j, this.c);
          break;
        case 20:
          this.w = typedArray.getFloat(j, this.w);
          break;
        case 19:
          this.f = typedArray.getFloat(j, this.f);
          break;
        case 18:
          this.e = typedArray.getDimensionPixelOffset(j, this.e);
          break;
        case 17:
          this.d = typedArray.getDimensionPixelOffset(j, this.d);
          break;
        case 16:
          this.N = typedArray.getDimensionPixelSize(j, this.N);
          break;
        case 15:
          this.R = typedArray.getDimensionPixelSize(j, this.R);
          break;
        case 14:
          this.O = typedArray.getDimensionPixelSize(j, this.O);
          break;
        case 13:
          this.M = typedArray.getDimensionPixelSize(j, this.M);
          break;
        case 12:
          this.Q = typedArray.getDimensionPixelSize(j, this.Q);
          break;
        case 11:
          this.P = typedArray.getDimensionPixelSize(j, this.P);
          break;
        case 10:
          this.u = pq.i(typedArray, j, this.u);
          break;
        case 9:
          this.v = pq.i(typedArray, j, this.v);
          break;
        case 8:
          this.J = typedArray.getDimensionPixelSize(j, this.J);
          break;
        case 7:
          this.D = typedArray.getDimensionPixelOffset(j, this.D);
          break;
        case 6:
          this.C = typedArray.getDimensionPixelOffset(j, this.C);
          break;
        case 5:
          this.y = typedArray.getString(j);
          break;
        case 4:
          this.n = pq.i(typedArray, j, this.n);
          break;
        case 3:
          this.o = pq.i(typedArray, j, this.o);
          break;
        case 2:
          this.I = typedArray.getDimensionPixelSize(j, this.I);
          break;
        case 1:
          this.p = pq.i(typedArray, j, this.p);
          break;
      } 
    } 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */