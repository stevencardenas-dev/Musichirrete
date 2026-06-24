import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import in.krosbits.utils.SgV.YbNJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class g2 extends z51 {
  public final int O;
  
  public final Object C(Intent paramIntent, int paramInt) {
    switch (this.O) {
      default:
        return new e2(paramIntent, paramInt);
      case 2:
        return new e2(paramIntent, paramInt);
      case 1:
        return new e2(paramIntent, paramInt);
      case 0:
        break;
    } 
    if (paramInt != -1 || paramIntent == null)
      return e40.b; 
    String[] arrayOfString = paramIntent.getStringArrayExtra(YbNJ.IadtfACMYkqD);
    int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
    if (arrayOfInt == null || arrayOfString == null)
      return e40.b; 
    ArrayList<Boolean> arrayList = new ArrayList(arrayOfInt.length);
    int i = arrayOfInt.length;
    boolean bool = false;
    for (paramInt = 0; paramInt < i; paramInt++) {
      boolean bool1;
      if (arrayOfInt[paramInt] == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      arrayList.add(Boolean.valueOf(bool1));
    } 
    ArrayList<String> arrayList1 = new ArrayList();
    i = arrayOfString.length;
    for (paramInt = bool; paramInt < i; paramInt++) {
      String str = arrayOfString[paramInt];
      if (str != null)
        arrayList1.add(str); 
    } 
    Iterator<String> iterator1 = arrayList1.iterator();
    Iterator<Boolean> iterator = arrayList.iterator();
    arrayList = new ArrayList<Boolean>(Math.min(pm.k0(arrayList1), pm.k0(arrayList)));
    while (iterator1.hasNext() && iterator.hasNext())
      arrayList.add(new t51(iterator1.next(), iterator.next())); 
    return or0.b0(arrayList);
  }
  
  public final Intent f(Context paramContext, Object paramObject) {
    Intent intent1;
    Intent intent2;
    switch (this.O) {
      default:
        paramObject = paramObject;
        intent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        intent2 = ((oi0)paramObject).c;
        object = paramObject;
        if (intent2 != null) {
          Bundle bundle = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          object = paramObject;
          if (bundle != null) {
            intent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            object = paramObject;
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
              object = ((oi0)paramObject).b;
              object.getClass();
              int i = ((oi0)paramObject).f;
              object = new oi0((IntentSender)object, null, ((oi0)paramObject).e, i);
            } 
          } 
        } 
        intent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)object);
        if (lb0.M(2)) {
          object = new StringBuilder("CreateIntent created the following intent: ");
          object.append(intent1);
          Log.v("FragmentManager", object.toString());
        } 
        return intent1;
      case 2:
        object = paramObject;
        object.getClass();
        object = (new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")).putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)object);
        object.getClass();
        return (Intent)object;
      case 1:
        object = paramObject;
        object.getClass();
        return (Intent)object;
      case 0:
        break;
    } 
    Object object = paramObject;
    object.getClass();
    object = (new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[])object);
    object.getClass();
    return (Intent)object;
  }
  
  public s0 p(Context paramContext, Object paramObject) {
    s0 s0;
    switch (this.O) {
      default:
        return super.p(paramContext, paramObject);
      case 0:
        break;
    } 
    paramObject = paramObject;
    paramObject.getClass();
    if (paramObject.length == 0) {
      s0 = new s0(e40.b);
    } else {
      int j = paramObject.length;
      boolean bool = false;
      int i = 0;
      while (i < j) {
        if (n21.p((Context)s0, (String)paramObject[i]) == 0) {
          i++;
          continue;
        } 
        return null;
      } 
      j = or0.a0(paramObject.length);
      i = j;
      if (j < 16)
        i = 16; 
      LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
      j = paramObject.length;
      for (i = bool; i < j; i++)
        linkedHashMap.put(paramObject[i], Boolean.TRUE); 
      s0 = new s0(linkedHashMap);
    } 
    return s0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */