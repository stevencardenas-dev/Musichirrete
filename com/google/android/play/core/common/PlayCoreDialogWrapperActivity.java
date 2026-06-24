package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
  public ResultReceiver b;
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 0) {
      ResultReceiver resultReceiver = this.b;
      if (resultReceiver != null)
        if (paramInt2 == -1) {
          resultReceiver.send(1, new Bundle());
        } else if (paramInt2 == 0) {
          resultReceiver.send(2, new Bundle());
        }  
    } 
    finish();
  }
  
  public final void onCreate(Bundle paramBundle) {
    Intent intent;
    int i = getIntent().getIntExtra("window_flags", 0);
    Bundle bundle = null;
    if (i != 0) {
      getWindow().getDecorView().setSystemUiVisibility(i);
      intent = new Intent();
      intent.putExtra("window_flags", i);
    } else {
      intent = null;
    } 
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      PendingIntent pendingIntent;
      ResultReceiver resultReceiver1;
      this.b = (ResultReceiver)getIntent().getParcelableExtra("result_receiver");
      Bundle bundle1 = getIntent().getExtras();
      paramBundle = bundle;
      if (bundle1 != null)
        pendingIntent = (PendingIntent)bundle1.get("confirmation_intent"); 
      if (bundle1 == null || pendingIntent == null) {
        resultReceiver1 = this.b;
        if (resultReceiver1 != null)
          resultReceiver1.send(3, new Bundle()); 
        finish();
        return;
      } 
      try {
        IntentSender intentSender = resultReceiver1.getIntentSender();
        try {
          startIntentSenderForResult(intentSender, 0, intent, 0, 0, 0);
          return;
        } catch (android.content.IntentSender.SendIntentException null) {}
      } catch (android.content.IntentSender.SendIntentException sendIntentException) {}
    } else {
      this.b = (ResultReceiver)sendIntentException.getParcelable("result_receiver");
      return;
    } 
    ResultReceiver resultReceiver = this.b;
    if (resultReceiver != null)
      resultReceiver.send(3, new Bundle()); 
    finish();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.putParcelable("result_receiver", (Parcelable)this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\play\core\common\PlayCoreDialogWrapperActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */