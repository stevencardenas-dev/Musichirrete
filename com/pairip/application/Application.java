package com.pairip.application;

import android.content.Context;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;
import in.krosbits.musicolet.MyApplication;

public class Application extends MyApplication {
  protected void attachBaseContext(Context paramContext) {
    VMRunner.setContext(paramContext);
    SignatureCheck.verifyIntegrity(paramContext);
    attachBaseContext(paramContext);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pairip\application\Application.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */