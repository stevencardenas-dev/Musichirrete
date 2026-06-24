package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelpTextView extends LinearLayout {
  TextView bodyTextView;
  
  TextView headerTextView;
  
  public HelpTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void setTextAndVisibility(TextView paramTextView, CharSequence paramCharSequence) {
    byte b;
    paramTextView.setText(paramCharSequence);
    if (true != TextUtils.isEmpty(paramCharSequence)) {
      b = 0;
    } else {
      b = 8;
    } 
    paramTextView.setVisibility(b);
  }
  
  public View asView() {
    return (View)this;
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    TextView textView = (TextView)findViewById(2131296513);
    textView.getClass();
    this.headerTextView = textView;
    textView = (TextView)findViewById(2131296512);
    textView.getClass();
    this.bodyTextView = textView;
  }
  
  public void setText(CharSequence paramCharSequence1, CharSequence paramCharSequence2) {
    setTextAndVisibility(this.headerTextView, paramCharSequence1);
    setTextAndVisibility(this.bodyTextView, paramCharSequence2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\framework\internal\featurehighlight\HelpTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */