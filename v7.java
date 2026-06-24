import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public abstract class v7 {
  public static TextClassifier a(TextView paramTextView) {
    TextClassificationManager textClassificationManager = (TextClassificationManager)paramTextView.getContext().getSystemService(TextClassificationManager.class);
    return (textClassificationManager != null) ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */