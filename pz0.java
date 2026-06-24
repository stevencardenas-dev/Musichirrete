import android.content.Context;
import android.util.Log;
import in.krosbits.nativex.FDTS;
import in.krosbits.utils.SgV.YbNJ;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;

public final class pz0 implements li1 {
  public long a;
  
  public Object b;
  
  public Object c;
  
  public static void g(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null)
        for (byte b = 0; b < arrayOfFile.length; b++)
          g(arrayOfFile[b]);  
    } 
    if (paramFile.exists() && !paramFile.delete())
      m60.i(x41.w("Failed to delete '", paramFile.getAbsolutePath(), "'")); 
  }
  
  public static File h(File paramFile, String paramString) {
    File file = new File(paramFile, paramString);
    if (file.getCanonicalPath().startsWith(paramFile.getCanonicalPath()))
      return file; 
    l0.l("split ID cannot be placed in target directory");
    return null;
  }
  
  public static void i(File paramFile) {
    if (paramFile.exists()) {
      if (!paramFile.isDirectory()) {
        l0.l("File input must be directory when it exists.");
        return;
      } 
    } else {
      paramFile.mkdirs();
      if (!paramFile.isDirectory()) {
        m60.i("Unable to create directory: ".concat(String.valueOf(paramFile.getAbsolutePath())));
        return;
      } 
    } 
  }
  
  public int a(gh1 paramgh1, rv paramrv, boolean paramBoolean) {
    qz0 qz0 = (qz0)this.c;
    if (paramBoolean) {
      paramgh1.c = qz0.i;
      return -5;
    } 
    if (!qz0.y.isEmpty()) {
      ArrayList arrayList;
      FDTS fDTS;
      ui0.G("mmp:mstr>rd:pcds");
      synchronized (((qz0)this.c).y) {
        ui0.G("mmp:mstr>rd:pcds1");
        int i = ((qz0)this.c).y.size();
        String[] arrayOfString2 = new String[i];
        String[] arrayOfString1 = new String[((qz0)this.c).y.size()];
        String[] arrayOfString3 = new String[((qz0)this.c).y.size()];
        byte b = 0;
        while (true) {
          qn qn;
          int j = ((qz0)this.c).y.size();
          ArrayList<qn> arrayList1 = ((qz0)this.c).y;
          if (b < j) {
            qn = arrayList1.get(b);
            arrayOfString2[b] = qn.b;
            arrayOfString1[b] = qn.c;
            arrayOfString3[b] = qn.d;
            b++;
            continue;
          } 
          qn.clear();
          ui0.G("mmp:mstr>rd:pcds2");
          fDTS = ((qz0)this.c).g;
          /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{in/krosbits/nativex/FDTS}, name=null} */
          try {
            long l = fDTS.j;
            if (l != 0L)
              fDTS.ntSCD(l, i, arrayOfString2, arrayOfString1, arrayOfString3); 
          } finally {}
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{in/krosbits/nativex/FDTS}, name=null} */
          break;
        } 
      } 
    } 
    if (!((qz0)this.c).t || (nz0)this.b != null) {
      if (paramrv.a != null) {
        if (this.a >= 0L) {
          d(false, false);
          oz0 oz0 = ((qz0)this.c).p();
          ((qz0)this.c).g.f(this.a, oz0.b, (String[])oz0.c, (String[])oz0.e, (String[])oz0.f);
          this.a = -1L;
          qz0 qz02 = (qz0)this.c;
          qz02.g.nte0F = false;
          qz02.c = false;
          nz0 nz0 = (nz0)this.b;
          if (nz0 != null)
            nz0.start(); 
        } 
        qz0 qz01 = (qz0)this.c;
        if (qz01.t) {
          try {
            if (!qz01.c) {
              rv rv1 = ((nz0)this.b).c.take();
              rv1.a.flip();
              int k = rv1.a.remaining();
              if (paramrv.a.remaining() < k) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(rv1.a.capacity());
                paramrv.a = byteBuffer;
                byteBuffer.order(ByteOrder.nativeOrder());
              } 
              paramrv.a.put(rv1.a);
              paramrv.c = rv1.c;
              paramrv.b = rv1.b;
              paramrv.setFlags(rv1.getAllFlagsAsInt());
              ((qz0)this.c).b = paramrv.c;
              if (rv1.getFlag(4))
                ((qz0)this.c).c = true; 
              rv1.clear();
              ((nz0)this.b).e.put(rv1);
              return -4;
            } 
          } catch (InterruptedException interruptedException) {}
          paramrv.addFlag(4);
          return -4;
        } 
        int j = paramrv.a.position();
        int i = ((qz0)this.c).g.b(paramrv.a) / 32;
        if (i > 0) {
          paramrv.a.position(j + i);
          qz01 = (qz0)this.c;
          FDTS fDTS = qz01.g;
          paramrv.b = fDTS.l_Hps;
          qz01.b = fDTS.l_Tps;
          paramrv.addFlag(1);
        } 
        qz01 = (qz0)this.c;
        paramBoolean = qz01.g.nte0F;
        qz01.c = paramBoolean;
        if (i == 0 && paramBoolean) {
          paramrv.addFlag(4);
          return -4;
        } 
        paramrv.clearFlag(4);
      } 
      return -4;
    } 
    d(false, true);
    return -4;
  }
  
  public boolean b() {
    return true;
  }
  
  public void c() {}
  
  public void d(boolean paramBoolean1, boolean paramBoolean2) {
    qz0 qz0 = (qz0)this.c;
    nz0 nz0 = (nz0)this.b;
    if (nz0 != null) {
      nz0.b(nz0);
      try {
        ((nz0)this.b).join();
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
    if (qz0.t) {
      byte b;
      FDTS fDTS = qz0.g;
      boolean bool = qz0.e;
      if (bool) {
        b = 1;
      } else {
        b = 2;
      } 
      nz0 nz01 = new nz0(fDTS, b, paramBoolean1, bool);
      this.b = nz01;
      if (paramBoolean2)
        nz01.start(); 
    } 
  }
  
  public HashSet e() {
    File file = new File(k(), "verified-splits");
    i(file);
    HashSet<qf2> hashSet = new HashSet();
    File[] arrayOfFile = file.listFiles();
    if (arrayOfFile != null)
      for (byte b = 0; b < arrayOfFile.length; b++) {
        file = arrayOfFile[b];
        if (file.isFile() && file.getName().endsWith(".apk") && !file.canWrite()) {
          String str = file.getName();
          hashSet.add(new qf2(file, str.substring(0, str.length() - 4)));
        } 
      }  
    return hashSet;
  }
  
  public void f() {
    long l = this.a;
    File file = j();
    String[] arrayOfString = file.list();
    if (arrayOfString != null)
      for (byte b = 0; b < arrayOfString.length; b++) {
        String str = arrayOfString[b];
        if (!str.equals(Long.toString(l))) {
          File file1 = new File(file, str);
          String str1 = file1.toString();
          StringBuilder stringBuilder = new StringBuilder("FileStorage: removing directory for different version code (directory = ");
          stringBuilder.append(str1);
          stringBuilder.append(", current version code = ");
          stringBuilder.append(l);
          stringBuilder.append(YbNJ.JKVOaBSHLT);
          Log.d("SplitCompat", stringBuilder.toString());
          g(file1);
        } 
      }  
  }
  
  public File j() {
    if ((File)this.c == null) {
      Context context = (Context)this.b;
      if (context != null) {
        this.c = context.getFilesDir();
      } else {
        tp.f("context must be non-null to populate null filesDir");
        return null;
      } 
    } 
    File file = new File((File)this.c, "splitcompat");
    i(file);
    return file;
  }
  
  public File k() {
    File file = new File(j(), Long.toString(this.a));
    i(file);
    return file;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */