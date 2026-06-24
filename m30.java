import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

public abstract class m30 {
  public static final String[] a = new String[0];
  
  public static String[] a(EditorInfo paramEditorInfo) {
    String[] arrayOfString;
    if (Build.VERSION.SDK_INT >= 25) {
      arrayOfString = paramEditorInfo.contentMimeTypes;
      if (arrayOfString != null)
        return arrayOfString; 
    } else {
      Bundle bundle = ((EditorInfo)arrayOfString).extras;
      if (bundle != null) {
        String[] arrayOfString2 = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        String[] arrayOfString1 = arrayOfString2;
        if (arrayOfString2 == null)
          arrayOfString1 = ((EditorInfo)arrayOfString).extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"); 
        if (arrayOfString1 != null)
          return arrayOfString1; 
      } 
    } 
    return a;
  }
  
  public static void b(EditorInfo paramEditorInfo, String[] paramArrayOfString) {
    if (Build.VERSION.SDK_INT >= 25) {
      paramEditorInfo.contentMimeTypes = paramArrayOfString;
      return;
    } 
    if (paramEditorInfo.extras == null)
      paramEditorInfo.extras = new Bundle(); 
    paramEditorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", paramArrayOfString);
    paramEditorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", paramArrayOfString);
  }
  
  public static void c(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    if (paramEditorInfo.extras == null)
      paramEditorInfo.extras = new Bundle(); 
    if (paramCharSequence != null) {
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(paramCharSequence);
    } else {
      paramCharSequence = null;
    } 
    paramEditorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", paramCharSequence);
    paramEditorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", paramInt1);
    paramEditorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */