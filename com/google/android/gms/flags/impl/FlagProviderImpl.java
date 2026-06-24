package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.util.Log;
import cc2;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import dd1;
import ej2;
import j31;
import java.util.concurrent.Callable;
import qv;
import sg0;

public class FlagProviderImpl extends ej2 {
  public boolean e;
  
  public SharedPreferences f;
  
  public FlagProviderImpl() {
    attachInterface((IInterface)this, "com.google.android.gms.flags.IFlagProvider");
    this.e = false;
  }
  
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt) {
    Boolean bool1;
    if (!this.e)
      return paramBoolean; 
    SharedPreferences sharedPreferences = this.f;
    Boolean bool2 = Boolean.valueOf(paramBoolean);
    try {
      cc2 cc2 = new cc2();
      this(sharedPreferences, paramString, bool2, 0);
      bool1 = (Boolean)qv.B0((Callable)cc2);
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      bool1 = bool2;
    } 
    return bool1.booleanValue();
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2) {
    Integer integer1;
    if (!this.e)
      return paramInt1; 
    SharedPreferences sharedPreferences = this.f;
    Integer integer2 = Integer.valueOf(paramInt1);
    try {
      cc2 cc2 = new cc2();
      this(sharedPreferences, paramString, integer2, 3);
      integer1 = (Integer)qv.B0((Callable)cc2);
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      integer1 = integer2;
    } 
    return integer1.intValue();
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt) {
    Long long_1;
    if (!this.e)
      return paramLong; 
    SharedPreferences sharedPreferences = this.f;
    Long long_2 = Long.valueOf(paramLong);
    try {
      cc2 cc2 = new cc2();
      this(sharedPreferences, paramString, long_2, 6);
      long_1 = (Long)qv.B0((Callable)cc2);
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Flag value not available, returning default: ".concat(str);
      } else {
        str = new String("Flag value not available, returning default: ");
      } 
      Log.w("FlagDataUtils", str);
      long_1 = long_2;
    } 
    return long_1.longValue();
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt) {
    if (!this.e)
      return paramString2; 
    SharedPreferences sharedPreferences = this.f;
    try {
      cc2 cc2 = new cc2();
      this(sharedPreferences, paramString1, paramString2, 7);
      return (String)qv.B0((Callable)cc2);
    } catch (Exception exception) {
      String str1 = String.valueOf(exception.getMessage());
      paramInt = str1.length();
      String str2 = nFLlOYeP.ZDKFLWZgKeziT;
      if (paramInt != 0) {
        str1 = str2.concat(str1);
      } else {
        str1 = new String(str2);
      } 
      Log.w("FlagDataUtils", str1);
      return paramString2;
    } 
  }
  
  public void init(sg0 paramsg0) {
    Context context = (Context)j31.q0(paramsg0);
    if (!this.e)
      try {
        this.f = dd1.G0(context.createPackageContext("com.google.android.gms", 0));
        this.e = true;
        return;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      
      } catch (Exception exception) {
        String str = String.valueOf(exception.getMessage());
        if (str.length() != 0) {
          str = "Could not retrieve sdk flags, continuing with defaults: ".concat(str);
        } else {
          str = new String("Could not retrieve sdk flags, continuing with defaults: ");
        } 
        Log.w("FlagProviderImpl", str);
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\flags\impl\FlagProviderImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */