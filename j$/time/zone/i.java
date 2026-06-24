package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i {
  public static final CopyOnWriteArrayList b;
  
  public static final ConcurrentMap c = new ConcurrentHashMap<Object, Object>(512, 0.75F, 2);
  
  public final Set a;
  
  static {
    ArrayList arrayList = new ArrayList();
    AccessController.doPrivileged(new h(arrayList));
    copyOnWriteArrayList.addAll(arrayList);
  }
  
  public i() {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    String[] arrayOfString = TimeZone.getAvailableIDs();
    int j = arrayOfString.length;
    for (byte b = 0; b < j; b++)
      linkedHashSet.add(arrayOfString[b]); 
    this.a = Collections.unmodifiableSet(linkedHashSet);
  }
  
  public static f a(String paramString) {
    Objects.requireNonNull(paramString, "zoneId");
    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)c;
    i i1 = (i)concurrentHashMap.get(paramString);
    if (i1 == null) {
      if (concurrentHashMap.isEmpty())
        throw new RuntimeException("No time-zone data files registered"); 
      throw new RuntimeException("Unknown time-zone ID: ".concat(paramString));
    } 
    if (i1.a.contains(paramString))
      return new f(TimeZone.getTimeZone(paramString)); 
    throw new RuntimeException("Not a built-in time zone: ".concat(paramString));
  }
  
  public static void b(i parami) {
    Objects.requireNonNull(parami, "provider");
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{j$/time/zone/i}} */
    try {
      Iterator<String> iterator = parami.a.iterator();
      while (iterator.hasNext()) {
        String str = iterator.next();
        Objects.requireNonNull(str, "zoneId");
        if ((i)((ConcurrentHashMap<String, i>)c).putIfAbsent(str, parami) == null)
          continue; 
        g g = new g();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Unable to register zone as one already registered with that ID: ");
        stringBuilder.append(str);
        stringBuilder.append(", currently loading from provider: ");
        stringBuilder.append(parami);
        super(stringBuilder.toString());
        throw g;
      } 
    } finally {}
    HashSet<?> hashSet = new HashSet();
    this(((ConcurrentHashMap)c).keySet());
    Collections.unmodifiableSet(hashSet);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{j$/time/zone/i}} */
    b.add(parami);
  }
  
  static {
    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
    b = copyOnWriteArrayList;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\zone\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */