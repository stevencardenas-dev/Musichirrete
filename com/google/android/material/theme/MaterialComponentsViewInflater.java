package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import m8;

public class MaterialComponentsViewInflater extends m8 {
  public final AppCompatAutoCompleteTextView a(Context paramContext, AttributeSet paramAttributeSet) {
    return (AppCompatAutoCompleteTextView)new MaterialAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  public final AppCompatButton b(Context paramContext, AttributeSet paramAttributeSet) {
    return (AppCompatButton)new MaterialButton(paramContext, paramAttributeSet);
  }
  
  public final AppCompatCheckBox c(Context paramContext, AttributeSet paramAttributeSet) {
    return (AppCompatCheckBox)new MaterialCheckBox(paramContext, paramAttributeSet);
  }
  
  public final AppCompatRadioButton d(Context paramContext, AttributeSet paramAttributeSet) {
    return (AppCompatRadioButton)new MaterialRadioButton(paramContext, paramAttributeSet);
  }
  
  public final AppCompatTextView e(Context paramContext, AttributeSet paramAttributeSet) {
    return (AppCompatTextView)new MaterialTextView(paramContext, paramAttributeSet);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\theme\MaterialComponentsViewInflater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */