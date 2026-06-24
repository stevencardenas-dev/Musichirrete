import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ic2 {
  public static final f1 c = new f1(eRUgfgGAccgka.gaTztwAOZQlD);
  
  public final XmlPullParser a;
  
  public final j01 b;
  
  public ic2(XmlPullParser paramXmlPullParser) {
    this.a = paramXmlPullParser;
    jh2 jh2 = jh2.c;
    j01 j011 = new j01(25, false);
    j011.e = new HashMap<Object, Object>();
    this.b = j011;
  }
  
  public final void a(String paramString, eu2 parameu2) {
    label53: while (true) {
      XmlPullParser xmlPullParser = this.a;
      int i = xmlPullParser.next();
      if (i == 3 || i == 1)
        break; 
      if (xmlPullParser.getEventType() == 2) {
        Map<String, Integer> map;
        if (xmlPullParser.getName().equals(paramString)) {
          int j = parameu2.a;
          i = 0;
          switch (j) {
            default:
              ic21 = parameu2.b;
              ic21.a("split-install-errors", new eu2(ic21, 1));
              continue;
            case 1:
              ic21 = parameu2.b;
              i = 0;
              while (true) {
                XmlPullParser xmlPullParser1 = ic21.a;
                if (i < xmlPullParser1.getAttributeCount()) {
                  if ("defaultErrorCode".equals(xmlPullParser1.getAttributeName(i))) {
                    j01 j011 = ic21.b;
                    String str2 = xmlPullParser1.getAttributeValue(i);
                    Integer integer = (Integer)ub2.c.get(str2);
                    if (integer != null) {
                      j011.c = integer;
                    } else {
                      l0.l(String.valueOf(str2).concat(" is unknown error."));
                      continue label53;
                    } 
                  } 
                  i++;
                  continue;
                } 
                ic21.a("split-install-error", new eu2(ic21, 0));
              } 
            case 0:
              break;
          } 
          ic2 ic22 = parameu2.b;
          String str1 = null;
          ic2 ic21 = null;
          while (true) {
            String str2;
            XmlPullParser xmlPullParser1 = ic22.a;
            if (i < xmlPullParser1.getAttributeCount()) {
              if ("module".equals(xmlPullParser1.getAttributeName(i)))
                str1 = xmlPullParser1.getAttributeValue(i); 
              if ("errorCode".equals(xmlPullParser1.getAttributeName(i)))
                str2 = xmlPullParser1.getAttributeValue(i); 
              i++;
              continue;
            } 
            if (str1 != null && str2 != null) {
              j01 j011 = ic22.b;
              Integer integer = (Integer)ub2.c.get(str2);
              if (integer != null) {
                map = (Map)j011.e;
                if (map != null) {
                  map.put(str1, integer);
                  do {
                  
                  } while (xmlPullParser1.next() != 3);
                  continue;
                } 
                tp.f("Property \"splitInstallErrorCodeByModule\" has not been set");
                continue;
              } 
              break;
            } 
            throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser1, null);
          } 
          l0.l(map.concat(" is unknown error."));
          continue;
        } 
        String str = map.getName();
        StringBuilder stringBuilder = new StringBuilder("Expected '");
        stringBuilder.append(paramString);
        stringBuilder.append("' tag but found '");
        stringBuilder.append(str);
        stringBuilder.append("'.");
        throw new XmlPullParserException(stringBuilder.toString(), map, null);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ic2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */