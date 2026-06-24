import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class gd2 implements sh2 {
  public final int b;
  
  public final sh2 c;
  
  public Object a() {
    int i = this.b;
    sh2 sh21 = this.c;
    ro2 ro21 = null;
    ro2 ro23 = null;
    ro2 ro22 = null;
    switch (i) {
      default:
        ro21 = (ro2)sh21.a();
        if (ro21 == null) {
          k91.h("Cannot return null from a non-@Nullable @Provides method");
          ro21 = ro22;
        } 
        return ro21;
      case 0:
        break;
    } 
    File file = (File)sh21.a();
    if (file == null) {
      ro21 = ro23;
    } else {
      f1 f1 = ic2.c;
      File file1 = new File(file, "local_testing_config.xml");
      if (!file1.exists()) {
        jh2 jh2 = jh2.c;
      } else {
        FileReader fileReader;
        try {
          fileReader = new FileReader();
          this(file1);
          try {
            XmlPullParser xmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParser.setInput(fileReader);
            ic2 ic2 = new ic2();
            this(xmlPullParser);
            eu2 eu2 = new eu2();
            this(ic2, 2);
            ic2.a("local-testing-config", eu2);
            j01 j01 = ic2.b;
            Map<?, ?> map = (Map)j01.e;
            if (map != null) {
              map = Collections.unmodifiableMap(map);
              if (map != null) {
                j01.e = map;
                jh2 jh2 = new jh2();
                this((Integer)j01.c, (Map)j01.e);
              } else {
                k91.h("Null splitInstallErrorCodeByModule");
              } 
            } else {
              tp.f(ckOPp.XUgAkpGaiYugHe);
            } 
            fileReader.close();
          } finally {}
        } catch (IOException iOException) {
        
        } catch (XmlPullParserException xmlPullParserException) {
        
        } catch (RuntimeException runtimeException) {}
        try {
          fileReader.close();
        } finally {
          fileReader = null;
        } 
      } 
    } 
    return runtimeException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */