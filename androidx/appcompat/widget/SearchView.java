package androidx.appcompat.widget;

import ag0;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import d42;
import en0;
import fm;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;
import j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lb;
import lb0;
import lt;
import nc1;
import p7;
import qj1;
import qv;
import rj1;
import rl1;
import sj1;
import sl1;
import tj1;
import ua0;
import uj1;
import v22;
import vg;
import vj1;
import vm;
import vq1;
import wj1;
import yi1;
import z10;
import zv0;

public class SearchView extends en0 implements fm {
  static final boolean DBG = false;
  
  private static final String IME_OPTION_NO_MICROPHONE = "nm";
  
  static final String LOG_TAG = "SearchView";
  
  static final uj1 PRE_API_29_HIDDEN_METHOD_INVOKER;
  
  private Bundle mAppSearchData;
  
  private boolean mClearingFocus;
  
  final ImageView mCloseButton;
  
  private final ImageView mCollapsedIcon;
  
  private int mCollapsedImeOptions;
  
  private final CharSequence mDefaultQueryHint;
  
  private final View mDropDownAnchor;
  
  private boolean mExpandedInActionView;
  
  final ImageView mGoButton;
  
  private boolean mIconified;
  
  private boolean mIconifiedByDefault;
  
  private int mMaxWidth;
  
  private CharSequence mOldQueryText;
  
  private final View.OnClickListener mOnClickListener;
  
  private rj1 mOnCloseListener;
  
  private final TextView.OnEditorActionListener mOnEditorActionListener;
  
  private final AdapterView.OnItemClickListener mOnItemClickListener;
  
  private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
  
  private sj1 mOnQueryChangeListener;
  
  View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
  
  private View.OnClickListener mOnSearchClickListener;
  
  private tj1 mOnSuggestionListener;
  
  private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache = new WeakHashMap<String, Drawable.ConstantState>();
  
  private CharSequence mQueryHint;
  
  private boolean mQueryRefinement;
  
  private Runnable mReleaseCursorRunnable = new a(this);
  
  final ImageView mSearchButton;
  
  private final View mSearchEditFrame;
  
  private final Drawable mSearchHintIcon;
  
  private final View mSearchPlate;
  
  final SearchAutoComplete mSearchSrcTextView;
  
  private Rect mSearchSrcTextViewBounds = new Rect();
  
  private Rect mSearchSrtTextViewBoundsExpanded = new Rect();
  
  SearchableInfo mSearchable;
  
  private final View mSubmitArea;
  
  private boolean mSubmitButtonEnabled;
  
  private final int mSuggestionCommitIconResId;
  
  private final int mSuggestionRowLayout;
  
  lt mSuggestionsAdapter;
  
  private int[] mTemp = new int[2];
  
  private int[] mTemp2 = new int[2];
  
  View.OnKeyListener mTextKeyListener;
  
  private TextWatcher mTextWatcher;
  
  private wj1 mTouchDelegate;
  
  private final Runnable mUpdateDrawableStateRunnable = (Runnable)new yi1(1, this);
  
  private CharSequence mUserQuery;
  
  private final Intent mVoiceAppSearchIntent;
  
  final ImageView mVoiceButton;
  
  private boolean mVoiceButtonEnabled;
  
  private final Intent mVoiceWebSearchIntent;
  
  static {
    int i = Build.VERSION.SDK_INT;
    Object object = null;
    if (i < 29) {
      object = new Object();
      ((uj1)object).a = null;
      ((uj1)object).b = null;
      ((uj1)object).c = null;
      uj1.a();
      try {
        Method method = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
        ((uj1)object).a = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        Method method = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
        ((uj1)object).b = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
        ((uj1)object).c = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
    } 
    PRE_API_29_HIDDEN_METHOD_INVOKER = (uj1)object;
  }
  
  public SearchView(Context paramContext) {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969892);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    c c = new c(this);
    this.mOnClickListener = c;
    this.mTextKeyListener = new d(this);
    qj1 qj1 = new qj1(this);
    this.mOnEditorActionListener = (TextView.OnEditorActionListener)qj1;
    p7 p7 = new p7(2, this);
    this.mOnItemClickListener = (AdapterView.OnItemClickListener)p7;
    z10 z10 = new z10(3, this);
    this.mOnItemSelectedListener = (AdapterView.OnItemSelectedListener)z10;
    this.mTextWatcher = (TextWatcher)new vm(5, this);
    int[] arrayOfInt = nc1.u;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    zv0 zv0 = new zv0(paramContext, typedArray);
    v22.m((View)this, paramContext, arrayOfInt, paramAttributeSet, typedArray, paramInt);
    LayoutInflater.from(paramContext).inflate(typedArray.getResourceId(19, 2131492889), (ViewGroup)this, true);
    SearchAutoComplete searchAutoComplete = (SearchAutoComplete)findViewById(2131297460);
    this.mSearchSrcTextView = searchAutoComplete;
    searchAutoComplete.setSearchView(this);
    this.mSearchEditFrame = findViewById(2131297456);
    View view3 = findViewById(2131297459);
    this.mSearchPlate = view3;
    View view2 = findViewById(2131297550);
    this.mSubmitArea = view2;
    ImageView imageView1 = (ImageView)findViewById(2131297454);
    this.mSearchButton = imageView1;
    ImageView imageView4 = (ImageView)findViewById(2131297457);
    this.mGoButton = imageView4;
    ImageView imageView2 = (ImageView)findViewById(2131297455);
    this.mCloseButton = imageView2;
    ImageView imageView5 = (ImageView)findViewById(2131297461);
    this.mVoiceButton = imageView5;
    ImageView imageView3 = (ImageView)findViewById(2131297458);
    this.mCollapsedIcon = imageView3;
    view3.setBackground(zv0.o(20));
    view2.setBackground(zv0.o(25));
    imageView1.setImageDrawable(zv0.o(23));
    imageView4.setImageDrawable(zv0.o(15));
    imageView2.setImageDrawable(zv0.o(12));
    imageView5.setImageDrawable(zv0.o(28));
    imageView3.setImageDrawable(zv0.o(23));
    this.mSearchHintIcon = zv0.o(22);
    qv.Y((View)imageView1, getResources().getString(2131886108));
    this.mSuggestionRowLayout = typedArray.getResourceId(26, 2131492888);
    this.mSuggestionCommitIconResId = typedArray.getResourceId(13, 0);
    imageView1.setOnClickListener(c);
    imageView2.setOnClickListener(c);
    imageView4.setOnClickListener(c);
    imageView5.setOnClickListener(c);
    searchAutoComplete.setOnClickListener(c);
    searchAutoComplete.addTextChangedListener(this.mTextWatcher);
    searchAutoComplete.setOnEditorActionListener((TextView.OnEditorActionListener)qj1);
    searchAutoComplete.setOnItemClickListener((AdapterView.OnItemClickListener)p7);
    searchAutoComplete.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)z10);
    searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
    searchAutoComplete.setOnFocusChangeListener(new b(this));
    setIconifiedByDefault(typedArray.getBoolean(18, true));
    paramInt = typedArray.getDimensionPixelSize(2, -1);
    if (paramInt != -1)
      setMaxWidth(paramInt); 
    this.mDefaultQueryHint = typedArray.getText(14);
    this.mQueryHint = typedArray.getText(21);
    paramInt = typedArray.getInt(6, -1);
    if (paramInt != -1)
      setImeOptions(paramInt); 
    paramInt = typedArray.getInt(5, -1);
    if (paramInt != -1)
      setInputType(paramInt); 
    setFocusable(typedArray.getBoolean(1, true));
    zv0.z();
    Intent intent = new Intent("android.speech.action.WEB_SEARCH");
    this.mVoiceWebSearchIntent = intent;
    intent.addFlags(268435456);
    intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.mVoiceAppSearchIntent = intent;
    intent.addFlags(268435456);
    View view1 = findViewById(searchAutoComplete.getDropDownAnchor());
    this.mDropDownAnchor = view1;
    if (view1 != null)
      view1.addOnLayoutChangeListener((View.OnLayoutChangeListener)new vg(1, this)); 
    updateViewsVisibility(this.mIconifiedByDefault);
    updateQueryHint();
  }
  
  private Intent createIntent(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4) {
    Intent intent = new Intent(paramString1);
    intent.addFlags(268435456);
    if (paramUri != null)
      intent.setData(paramUri); 
    intent.putExtra("user_query", this.mUserQuery);
    if (paramString3 != null)
      intent.putExtra("query", paramString3); 
    if (paramString2 != null)
      intent.putExtra(FgdLmmRfTxSFKI.KuiqxUOeewUatRN, paramString2); 
    Bundle bundle = this.mAppSearchData;
    if (bundle != null)
      intent.putExtra("app_data", bundle); 
    if (paramInt != 0) {
      intent.putExtra(RqlokDsQOju.rbIPtMFnSpSsMD, paramInt);
      intent.putExtra("action_msg", paramString4);
    } 
    intent.setComponent(this.mSearchable.getSearchActivity());
    return intent;
  }
  
  private Intent createIntentFromSuggestion(Cursor paramCursor, int paramInt, String paramString) {
    Uri uri;
    try {
      int i = vq1.A;
      String str = vq1.k(paramCursor, paramCursor.getColumnIndex("suggest_intent_action"));
      str1 = str;
      if (str == null)
        str1 = this.mSearchable.getSuggestIntentAction(); 
    } catch (RuntimeException runtimeException) {}
    String str2 = str1;
    if (str1 == null)
      str2 = "android.intent.action.SEARCH"; 
    String str3 = vq1.k(paramCursor, paramCursor.getColumnIndex("suggest_intent_data"));
    String str1 = str3;
    if (str3 == null)
      str1 = this.mSearchable.getSuggestIntentData(); 
    str3 = str1;
    if (str1 != null) {
      String str = vq1.k(paramCursor, paramCursor.getColumnIndex("suggest_intent_data_id"));
      str3 = str1;
      if (str != null) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(str1);
        stringBuilder.append("/");
        stringBuilder.append(Uri.encode(str));
        str3 = stringBuilder.toString();
      } 
    } 
    if (str3 == null) {
      str1 = null;
    } else {
      uri = Uri.parse(str3);
    } 
    str3 = vq1.k(paramCursor, paramCursor.getColumnIndex("suggest_intent_query"));
    return createIntent(str2, uri, vq1.k(paramCursor, paramCursor.getColumnIndex("suggest_intent_extra_data")), str3, paramInt, (String)runtimeException);
  }
  
  private Intent createVoiceAppSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str1;
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    Intent intent1 = new Intent(nFLlOYeP.szqNg);
    intent1.setComponent(componentName);
    PendingIntent pendingIntent = PendingIntent.getActivity(getContext(), 0, intent1, 1107296256);
    Bundle bundle2 = new Bundle();
    Bundle bundle1 = this.mAppSearchData;
    if (bundle1 != null)
      bundle2.putParcelable("app_data", (Parcelable)bundle1); 
    Intent intent2 = new Intent(paramIntent);
    Resources resources = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      str1 = resources.getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      str1 = ybWnIKHovcRr.YPorGFYAr;
    } 
    int i = paramSearchableInfo.getVoicePromptTextId();
    String str2 = null;
    if (i != 0) {
      String str = resources.getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      bundle1 = null;
    } 
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      String str = resources.getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      resources = null;
    } 
    if (paramSearchableInfo.getVoiceMaxResults() != 0) {
      i = paramSearchableInfo.getVoiceMaxResults();
    } else {
      i = 1;
    } 
    intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", str1);
    intent2.putExtra("android.speech.extra.PROMPT", (String)bundle1);
    intent2.putExtra("android.speech.extra.LANGUAGE", (String)resources);
    intent2.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (componentName == null) {
      str1 = str2;
    } else {
      str1 = componentName.flattenToShortString();
    } 
    intent2.putExtra("calling_package", str1);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)pendingIntent);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle2);
    return intent2;
  }
  
  private Intent createVoiceWebSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str;
    Intent intent = new Intent(paramIntent);
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    if (componentName == null) {
      componentName = null;
    } else {
      str = componentName.flattenToShortString();
    } 
    intent.putExtra("calling_package", str);
    return intent;
  }
  
  private void dismissSuggestions() {
    this.mSearchSrcTextView.dismissDropDown();
  }
  
  private void getChildBoundsWithinSearchView(View paramView, Rect paramRect) {
    paramView.getLocationInWindow(this.mTemp);
    getLocationInWindow(this.mTemp2);
    int[] arrayOfInt2 = this.mTemp;
    int i = arrayOfInt2[1];
    int[] arrayOfInt1 = this.mTemp2;
    int j = i - arrayOfInt1[1];
    i = arrayOfInt2[0] - arrayOfInt1[0];
    paramRect.set(i, j, paramView.getWidth() + i, paramView.getHeight() + j);
  }
  
  private CharSequence getDecoratedHint(CharSequence paramCharSequence) {
    if (!this.mIconifiedByDefault || this.mSearchHintIcon == null)
      return paramCharSequence; 
    int i = (int)(this.mSearchSrcTextView.getTextSize() * 1.25D);
    this.mSearchHintIcon.setBounds(0, 0, i, i);
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
    spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
    spannableStringBuilder.append(paramCharSequence);
    return (CharSequence)spannableStringBuilder;
  }
  
  private int getPreferredHeight() {
    return getContext().getResources().getDimensionPixelSize(2131165238);
  }
  
  private int getPreferredWidth() {
    return getContext().getResources().getDimensionPixelSize(2131165239);
  }
  
  private boolean hasVoiceSearch() {
    SearchableInfo searchableInfo = this.mSearchable;
    if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
      if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
        Intent intent = this.mVoiceWebSearchIntent;
      } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
        Intent intent = this.mVoiceAppSearchIntent;
      } else {
        searchableInfo = null;
      } 
      if (searchableInfo != null && getContext().getPackageManager().resolveActivity((Intent)searchableInfo, 65536) != null)
        return true; 
    } 
    return false;
  }
  
  public static boolean isLandscapeMode(Context paramContext) {
    return ((paramContext.getResources().getConfiguration()).orientation == 2);
  }
  
  private boolean isSubmitAreaEnabled() {
    return ((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified());
  }
  
  private void launchIntent(Intent paramIntent) {
    if (paramIntent == null)
      return; 
    try {
      getContext().startActivity(paramIntent);
      return;
    } catch (RuntimeException runtimeException) {
      StringBuilder stringBuilder = new StringBuilder("Failed launch activity: ");
      stringBuilder.append(paramIntent);
      Log.e("SearchView", stringBuilder.toString(), runtimeException);
      return;
    } 
  }
  
  private boolean launchSuggestion(int paramInt1, int paramInt2, String paramString) {
    Cursor cursor = this.mSuggestionsAdapter.e;
    if (cursor != null && cursor.moveToPosition(paramInt1)) {
      launchIntent(createIntentFromSuggestion(cursor, paramInt2, paramString));
      return true;
    } 
    return false;
  }
  
  private void postUpdateFocusedState() {
    post(this.mUpdateDrawableStateRunnable);
  }
  
  private void rewriteQueryFromSuggestion(int paramInt) {
    Editable editable = this.mSearchSrcTextView.getText();
    Cursor cursor = this.mSuggestionsAdapter.e;
    if (cursor == null)
      return; 
    if (cursor.moveToPosition(paramInt)) {
      String str = this.mSuggestionsAdapter.c(cursor);
      if (str != null) {
        setQuery(str);
        return;
      } 
      setQuery((CharSequence)editable);
      return;
    } 
    setQuery((CharSequence)editable);
  }
  
  private void setQuery(CharSequence paramCharSequence) {
    int i;
    this.mSearchSrcTextView.setText(paramCharSequence);
    SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    } 
    searchAutoComplete.setSelection(i);
  }
  
  private void updateCloseButton() {
    byte b1;
    boolean bool = TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText());
    byte b2 = 0;
    if (!bool || (this.mIconifiedByDefault && !this.mExpandedInActionView)) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    ImageView imageView = this.mCloseButton;
    if (b1) {
      b1 = b2;
    } else {
      b1 = 8;
    } 
    imageView.setVisibility(b1);
    Drawable drawable = this.mCloseButton.getDrawable();
    if (drawable != null) {
      int[] arrayOfInt;
      if (!bool) {
        arrayOfInt = ViewGroup.ENABLED_STATE_SET;
      } else {
        arrayOfInt = ViewGroup.EMPTY_STATE_SET;
      } 
      drawable.setState(arrayOfInt);
    } 
  }
  
  private void updateQueryHint() {
    CharSequence charSequence2 = getQueryHint();
    SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = ""; 
    searchAutoComplete.setHint(getDecoratedHint(charSequence1));
  }
  
  private void updateSearchAutoComplete() {
    this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
    this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
    int j = this.mSearchable.getInputType();
    boolean bool = true;
    int i = j;
    if ((j & 0xF) == 1) {
      j &= 0xFFFEFFFF;
      i = j;
      if (this.mSearchable.getSuggestAuthority() != null)
        i = j | 0x90000; 
    } 
    this.mSearchSrcTextView.setInputType(i);
    lt lt1 = this.mSuggestionsAdapter;
    if (lt1 != null)
      lt1.b(null); 
    if (this.mSearchable.getSuggestAuthority() != null) {
      vq1 vq1 = new vq1(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
      this.mSuggestionsAdapter = (lt)vq1;
      this.mSearchSrcTextView.setAdapter((ListAdapter)vq1);
      vq1 = (vq1)this.mSuggestionsAdapter;
      i = bool;
      if (this.mQueryRefinement)
        i = 2; 
      vq1.s = i;
    } 
  }
  
  private void updateSubmitArea() {
    byte b;
    if (isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) {
      b = 0;
    } else {
      b = 8;
    } 
    this.mSubmitArea.setVisibility(b);
  }
  
  private void updateSubmitButton(boolean paramBoolean) {
    byte b;
    if (this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (paramBoolean || !this.mVoiceButtonEnabled)) {
      b = 0;
    } else {
      b = 8;
    } 
    this.mGoButton.setVisibility(b);
  }
  
  private void updateViewsVisibility(boolean paramBoolean) {
    this.mIconified = paramBoolean;
    byte b2 = 8;
    if (paramBoolean) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    boolean bool = TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText());
    this.mSearchButton.setVisibility(b1);
    updateSubmitButton(bool ^ true);
    View view = this.mSearchEditFrame;
    if (paramBoolean) {
      b1 = 8;
    } else {
      b1 = 0;
    } 
    view.setVisibility(b1);
    byte b1 = b2;
    if (this.mCollapsedIcon.getDrawable() != null)
      if (this.mIconifiedByDefault) {
        b1 = b2;
      } else {
        b1 = 0;
      }  
    this.mCollapsedIcon.setVisibility(b1);
    updateCloseButton();
    updateVoiceButton(bool);
    updateSubmitArea();
  }
  
  private void updateVoiceButton(boolean paramBoolean) {
    boolean bool = this.mVoiceButtonEnabled;
    byte b2 = 8;
    byte b1 = b2;
    if (bool) {
      b1 = b2;
      if (!isIconified()) {
        b1 = b2;
        if (paramBoolean) {
          this.mGoButton.setVisibility(8);
          b1 = 0;
        } 
      } 
    } 
    this.mVoiceButton.setVisibility(b1);
  }
  
  public void adjustDropDownSizeAndPosition() {
    int i = this.mDropDownAnchor.getWidth();
    int j = 1;
    if (i > 1) {
      Resources resources = getContext().getResources();
      int k = this.mSearchPlate.getPaddingLeft();
      Rect rect = new Rect();
      boolean bool = d42.a;
      int m = getLayoutDirection();
      i = 0;
      if (m != 1)
        j = 0; 
      if (this.mIconifiedByDefault) {
        i = resources.getDimensionPixelSize(2131165225);
        i = resources.getDimensionPixelSize(2131165226) + i;
      } 
      this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
      m = rect.left;
      if (j) {
        j = -m;
      } else {
        j = k - m + i;
      } 
      this.mSearchSrcTextView.setDropDownHorizontalOffset(j);
      j = this.mDropDownAnchor.getWidth();
      int n = rect.left;
      m = rect.right;
      this.mSearchSrcTextView.setDropDownWidth(j + n + m + i - k);
    } 
  }
  
  public void clearFocus() {
    this.mClearingFocus = true;
    super.clearFocus();
    this.mSearchSrcTextView.clearFocus();
    this.mSearchSrcTextView.setImeVisibility(false);
    this.mClearingFocus = false;
  }
  
  public void forceSuggestionQuery() {
    int i = Build.VERSION.SDK_INT;
    SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
    if (i >= 29) {
      e.a(searchAutoComplete);
      return;
    } 
    uj1 uj12 = PRE_API_29_HIDDEN_METHOD_INVOKER;
    uj12.getClass();
    uj1.a();
    Method method2 = uj12.a;
    if (method2 != null)
      try {
        method2.invoke(searchAutoComplete, null);
      } catch (Exception exception) {} 
    uj1 uj11 = PRE_API_29_HIDDEN_METHOD_INVOKER;
    searchAutoComplete = this.mSearchSrcTextView;
    uj11.getClass();
    uj1.a();
    Method method1 = uj11.b;
    if (method1 != null)
      try {
        method1.invoke(searchAutoComplete, null);
      } catch (Exception exception) {} 
  }
  
  public int getImeOptions() {
    return this.mSearchSrcTextView.getImeOptions();
  }
  
  public int getInputType() {
    return this.mSearchSrcTextView.getInputType();
  }
  
  public int getMaxWidth() {
    return this.mMaxWidth;
  }
  
  public CharSequence getQuery() {
    return (CharSequence)this.mSearchSrcTextView.getText();
  }
  
  public CharSequence getQueryHint() {
    CharSequence charSequence = this.mQueryHint;
    if (charSequence != null)
      return charSequence; 
    SearchableInfo searchableInfo = this.mSearchable;
    return (searchableInfo != null && searchableInfo.getHintId() != 0) ? getContext().getText(this.mSearchable.getHintId()) : this.mDefaultQueryHint;
  }
  
  public int getSuggestionCommitIconResId() {
    return this.mSuggestionCommitIconResId;
  }
  
  public int getSuggestionRowLayout() {
    return this.mSuggestionRowLayout;
  }
  
  public lt getSuggestionsAdapter() {
    return this.mSuggestionsAdapter;
  }
  
  public boolean isIconfiedByDefault() {
    return this.mIconifiedByDefault;
  }
  
  public boolean isIconified() {
    return this.mIconified;
  }
  
  public boolean isQueryRefinementEnabled() {
    return this.mQueryRefinement;
  }
  
  public boolean isSubmitButtonEnabled() {
    return this.mSubmitButtonEnabled;
  }
  
  public void launchQuerySearch(int paramInt, String paramString1, String paramString2) {
    Intent intent = createIntent("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(intent);
  }
  
  public void onActionViewCollapsed() {
    setQuery("", false);
    clearFocus();
    updateViewsVisibility(true);
    this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
    this.mExpandedInActionView = false;
  }
  
  public void onActionViewExpanded() {
    if (this.mExpandedInActionView)
      return; 
    this.mExpandedInActionView = true;
    int i = this.mSearchSrcTextView.getImeOptions();
    this.mCollapsedImeOptions = i;
    this.mSearchSrcTextView.setImeOptions(i | 0x2000000);
    this.mSearchSrcTextView.setText("");
    setIconified(false);
  }
  
  public void onCloseClicked() {
    if (TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText())) {
      if (this.mIconifiedByDefault) {
        rj1 rj11 = this.mOnCloseListener;
        if (rj11 != null)
          rj11.getClass(); 
        clearFocus();
        updateViewsVisibility(true);
      } 
      return;
    } 
    this.mSearchSrcTextView.setText("");
    this.mSearchSrcTextView.requestFocus();
    this.mSearchSrcTextView.setImeVisibility(true);
  }
  
  public void onDetachedFromWindow() {
    removeCallbacks(this.mUpdateDrawableStateRunnable);
    post(this.mReleaseCursorRunnable);
    super.onDetachedFromWindow();
  }
  
  public boolean onItemClicked(int paramInt1, int paramInt2, String paramString) {
    tj1 tj11 = this.mOnSuggestionListener;
    int i = 1;
    if (tj11 != null) {
      SettingsActivity settingsActivity = (SettingsActivity)tj11;
      rl1 rl1 = settingsActivity.W.get(paramInt1);
      ArrayList<String> arrayList = rl1.e;
      paramInt1 = arrayList.size();
      String str = rl1.g;
      paramInt2 = i;
      if ("mseqs".equals(str)) {
        int j = MyApplication.o().getInt("etu2", 0);
        paramInt2 = i;
        if (j != 0)
          if (j == 2) {
            paramInt2 = i;
          } else {
            paramInt2 = 0;
          }  
      } 
      if (paramInt1 > 0) {
        lb0 lb0 = settingsActivity.Z();
        while (lb0.U(-1, 0));
        settingsActivity.Z = null;
        int j = arrayList.size();
        for (paramInt1 = 0; paramInt1 < j; paramInt1 = i + 1) {
          lb lb = new lb(lb0);
          String str1 = arrayList.get(paramInt1);
          sl1 sl1 = new sl1();
          Bundle bundle = new Bundle();
          bundle.putString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT", str1);
          sl1.x0(bundle);
          lb.k(2131296751, (ua0)sl1, str1);
          if (!"S".equals(str1))
            lb.c(str1); 
          i = paramInt1;
          if (paramInt2 == 0) {
            i = paramInt1;
            if (paramInt1 == j - 2)
              i = paramInt1 + 1; 
          } 
          if (i == j - 1)
            bundle.putString("H", str); 
          lb.f();
        } 
      } 
      return false;
    } 
    launchSuggestion(paramInt1, 0, null);
    this.mSearchSrcTextView.setImeVisibility(false);
    dismissSuggestions();
    return true;
  }
  
  public boolean onItemSelected(int paramInt) {
    tj1 tj11 = this.mOnSuggestionListener;
    if (tj11 != null) {
      tj11.getClass();
      return false;
    } 
    rewriteQueryFromSuggestion(paramInt);
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      getChildBoundsWithinSearchView((View)this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
      Rect rect1 = this.mSearchSrtTextViewBoundsExpanded;
      Rect rect2 = this.mSearchSrcTextViewBounds;
      rect1.set(rect2.left, 0, rect2.right, paramInt4 - paramInt2);
      wj1 wj11 = this.mTouchDelegate;
      if (wj11 == null) {
        rect1 = this.mSearchSrtTextViewBoundsExpanded;
        rect2 = this.mSearchSrcTextViewBounds;
        wj1 wj12 = new wj1((View)this.mSearchSrcTextView, rect1, rect2);
        this.mTouchDelegate = wj12;
        setTouchDelegate((TouchDelegate)wj12);
        return;
      } 
      Rect rect3 = this.mSearchSrtTextViewBoundsExpanded;
      rect1 = this.mSearchSrcTextViewBounds;
      wj11.b.set(rect3);
      rect2 = wj11.d;
      rect2.set(rect3);
      paramInt1 = -wj11.e;
      rect2.inset(paramInt1, paramInt1);
      wj11.c.set(rect1);
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    if (isIconified()) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    int j = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    if (j != Integer.MIN_VALUE) {
      if (j != 0) {
        if (j != 1073741824) {
          paramInt1 = i;
        } else {
          j = this.mMaxWidth;
          paramInt1 = i;
          if (j > 0)
            paramInt1 = Math.min(j, i); 
        } 
      } else {
        paramInt1 = this.mMaxWidth;
        if (paramInt1 <= 0)
          paramInt1 = getPreferredWidth(); 
      } 
    } else {
      paramInt1 = this.mMaxWidth;
      if (paramInt1 > 0) {
        paramInt1 = Math.min(paramInt1, i);
      } else {
        paramInt1 = Math.min(getPreferredWidth(), i);
      } 
    } 
    i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i != Integer.MIN_VALUE) {
      if (i == 0)
        paramInt2 = getPreferredHeight(); 
    } else {
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
    } 
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  public void onQueryRefine(CharSequence paramCharSequence) {
    setQuery(paramCharSequence);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof vj1)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    vj1 vj1 = (vj1)paramParcelable;
    super.onRestoreInstanceState(((j)vj1).b);
    updateViewsVisibility(vj1.e);
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    ((vj1)j).e = isIconified();
    return (Parcelable)j;
  }
  
  public void onSearchClicked() {
    updateViewsVisibility(false);
    this.mSearchSrcTextView.requestFocus();
    this.mSearchSrcTextView.setImeVisibility(true);
    View.OnClickListener onClickListener = this.mOnSearchClickListener;
    if (onClickListener != null)
      onClickListener.onClick((View)this); 
  }
  
  public void onSubmitQuery() {
    Editable editable = this.mSearchSrcTextView.getText();
    if (editable != null && TextUtils.getTrimmedLength((CharSequence)editable) > 0) {
      sj1 sj11 = this.mOnQueryChangeListener;
      if (sj11 != null) {
        editable.toString();
        ((SettingsActivity)sj11).n0();
      } 
      if (this.mSearchable != null)
        launchQuerySearch(0, null, editable.toString()); 
      this.mSearchSrcTextView.setImeVisibility(false);
      dismissSuggestions();
    } 
  }
  
  public boolean onSuggestionsKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (this.mSearchable == null)
      return false; 
    if (this.mSuggestionsAdapter == null)
      return false; 
    if (paramKeyEvent.getAction() == 0 && paramKeyEvent.hasNoModifiers()) {
      if (paramInt == 66 || paramInt == 84 || paramInt == 61)
        return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null); 
      if (paramInt == 21 || paramInt == 22) {
        if (paramInt == 21) {
          paramInt = 0;
        } else {
          paramInt = this.mSearchSrcTextView.length();
        } 
        this.mSearchSrcTextView.setSelection(paramInt);
        this.mSearchSrcTextView.setListSelection(0);
        this.mSearchSrcTextView.clearListSelection();
        this.mSearchSrcTextView.a();
        return true;
      } 
      if (paramInt == 19) {
        this.mSearchSrcTextView.getListSelection();
        return false;
      } 
    } 
    return false;
  }
  
  public void onTextChanged(CharSequence paramCharSequence) {
    Editable editable = this.mSearchSrcTextView.getText();
    this.mUserQuery = (CharSequence)editable;
    boolean bool = TextUtils.isEmpty((CharSequence)editable);
    updateSubmitButton(bool ^ true);
    updateVoiceButton(bool);
    updateCloseButton();
    updateSubmitArea();
    if (this.mOnQueryChangeListener != null && !TextUtils.equals(paramCharSequence, this.mOldQueryText)) {
      sj1 sj11 = this.mOnQueryChangeListener;
      String str2 = paramCharSequence.toString();
      SettingsActivity settingsActivity = (SettingsActivity)sj11;
      ArrayList<rl1> arrayList = settingsActivity.W;
      arrayList.clear();
      String str1 = str2;
      if (str2 != null)
        str1 = ag0.i0(str2.trim().toUpperCase().toLowerCase()); 
      if (str1 == null || str1.length() == 0) {
        settingsActivity.U.notifyDataSetChanged();
      } else {
        String[] arrayOfString = str1.split(" ");
        ArrayList<Object> arrayList1 = settingsActivity.V;
        int j = arrayList1.size();
        int i = 0;
        while (i < j) {
          rl1 rl1 = (rl1)arrayList1.get(i);
          int k = i + 1;
          rl1 = rl1;
          if (!rl1.h.x) {
            i = k;
            continue;
          } 
          if (ag0.g0(rl1.b, arrayOfString)) {
            arrayList.add(rl1);
            i = k;
            continue;
          } 
          i = k;
          if (ag0.g0(rl1.c, arrayOfString)) {
            arrayList.add(rl1);
            i = k;
          } 
        } 
        settingsActivity.U.notifyDataSetChanged();
      } 
    } 
    this.mOldQueryText = paramCharSequence.toString();
  }
  
  public void onTextFocusChanged() {
    updateViewsVisibility(isIconified());
    postUpdateFocusedState();
    if (this.mSearchSrcTextView.hasFocus())
      forceSuggestionQuery(); 
  }
  
  public void onVoiceClicked() {
    SearchableInfo searchableInfo = this.mSearchable;
    if (searchableInfo != null)
      try {
        Intent intent;
        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
          intent = createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo);
          getContext().startActivity(intent);
          return;
        } 
        if (intent.getVoiceSearchLaunchRecognizer()) {
          intent = createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, (SearchableInfo)intent);
          getContext().startActivity(intent);
        } 
        return;
      } catch (ActivityNotFoundException activityNotFoundException) {
        Log.w("SearchView", "Could not find voice search activity");
        return;
      }  
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    postUpdateFocusedState();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    if (this.mClearingFocus)
      return false; 
    if (!isFocusable())
      return false; 
    if (!isIconified()) {
      boolean bool = this.mSearchSrcTextView.requestFocus(paramInt, paramRect);
      if (bool)
        updateViewsVisibility(false); 
      return bool;
    } 
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle) {
    this.mAppSearchData = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean) {
    if (paramBoolean) {
      onCloseClicked();
      return;
    } 
    onSearchClicked();
  }
  
  public void setIconifiedByDefault(boolean paramBoolean) {
    if (this.mIconifiedByDefault == paramBoolean)
      return; 
    this.mIconifiedByDefault = paramBoolean;
    updateViewsVisibility(paramBoolean);
    updateQueryHint();
  }
  
  public void setImeOptions(int paramInt) {
    this.mSearchSrcTextView.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt) {
    this.mSearchSrcTextView.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt) {
    this.mMaxWidth = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(rj1 paramrj1) {
    this.mOnCloseListener = paramrj1;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) {
    this.mOnQueryTextFocusChangeListener = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(sj1 paramsj1) {
    this.mOnQueryChangeListener = paramsj1;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener) {
    this.mOnSearchClickListener = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(tj1 paramtj1) {
    this.mOnSuggestionListener = paramtj1;
  }
  
  public void setQuery(CharSequence paramCharSequence, boolean paramBoolean) {
    this.mSearchSrcTextView.setText(paramCharSequence);
    if (paramCharSequence != null) {
      SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
      searchAutoComplete.setSelection(searchAutoComplete.length());
      this.mUserQuery = paramCharSequence;
    } 
    if (paramBoolean && !TextUtils.isEmpty(paramCharSequence))
      onSubmitQuery(); 
  }
  
  public void setQueryHint(CharSequence paramCharSequence) {
    this.mQueryHint = paramCharSequence;
    updateQueryHint();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean) {
    this.mQueryRefinement = paramBoolean;
    lt lt1 = this.mSuggestionsAdapter;
    if (lt1 instanceof vq1) {
      boolean bool;
      vq1 vq1 = (vq1)lt1;
      if (paramBoolean) {
        bool = true;
      } else {
        bool = true;
      } 
      vq1.s = bool;
    } 
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo) {
    this.mSearchable = paramSearchableInfo;
    if (paramSearchableInfo != null) {
      updateSearchAutoComplete();
      updateQueryHint();
    } 
    boolean bool = hasVoiceSearch();
    this.mVoiceButtonEnabled = bool;
    if (bool)
      this.mSearchSrcTextView.setPrivateImeOptions("nm"); 
    updateViewsVisibility(isIconified());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean) {
    this.mSubmitButtonEnabled = paramBoolean;
    updateViewsVisibility(isIconified());
  }
  
  public void setSuggestionsAdapter(lt paramlt) {
    this.mSuggestionsAdapter = paramlt;
    this.mSearchSrcTextView.setAdapter((ListAdapter)paramlt);
  }
  
  public void updateFocusedState() {
    int[] arrayOfInt;
    if (this.mSearchSrcTextView.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    } 
    Drawable drawable = this.mSearchPlate.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    drawable = this.mSubmitArea.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    invalidate();
  }
  
  public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
    public int g = getThreshold();
    
    public SearchView h;
    
    public boolean i;
    
    public final f j = new f(this);
    
    public SearchAutoComplete(Context param1Context) {
      this(param1Context, null);
    }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet) {
      this(param1Context, param1AttributeSet, 2130968650);
    }
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
    }
    
    private int getSearchViewTextMinWidthDp() {
      Configuration configuration = getResources().getConfiguration();
      int i = configuration.screenWidthDp;
      int j = configuration.screenHeightDp;
      return (i >= 960 && j >= 720 && configuration.orientation == 2) ? 256 : ((i >= 600 || (i >= 640 && j >= 480)) ? 192 : 160);
    }
    
    public final void a() {
      if (Build.VERSION.SDK_INT >= 29) {
        e.b(this, 1);
        if (enoughToFilter()) {
          showDropDown();
          return;
        } 
      } else {
        uj1 uj1 = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
        uj1.getClass();
        uj1.a();
        Method method = uj1.c;
        if (method != null)
          try {
            method.invoke(this, new Object[] { Boolean.TRUE });
          } catch (Exception exception) {} 
      } 
    }
    
    public final boolean enoughToFilter() {
      return (this.g <= 0 || super.enoughToFilter());
    }
    
    public final InputConnection onCreateInputConnection(EditorInfo param1EditorInfo) {
      InputConnection inputConnection = super.onCreateInputConnection(param1EditorInfo);
      if (this.i) {
        f f1 = this.j;
        removeCallbacks(f1);
        post(f1);
      } 
      return inputConnection;
    }
    
    public final void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displayMetrics));
    }
    
    public final void onFocusChanged(boolean param1Boolean, int param1Int, Rect param1Rect) {
      super.onFocusChanged(param1Boolean, param1Int, param1Rect);
      this.h.onTextFocusChanged();
    }
    
    public final boolean onKeyPreIme(int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4) {
        if (param1KeyEvent.getAction() == 0 && param1KeyEvent.getRepeatCount() == 0) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.startTracking(param1KeyEvent, this); 
          return true;
        } 
        if (param1KeyEvent.getAction() == 1) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.handleUpEvent(param1KeyEvent); 
          if (param1KeyEvent.isTracking() && !param1KeyEvent.isCanceled()) {
            this.h.clearFocus();
            setImeVisibility(false);
            return true;
          } 
        } 
      } 
      return super.onKeyPreIme(param1Int, param1KeyEvent);
    }
    
    public final void onWindowFocusChanged(boolean param1Boolean) {
      super.onWindowFocusChanged(param1Boolean);
      if (param1Boolean && this.h.hasFocus() && getVisibility() == 0) {
        this.i = true;
        if (SearchView.isLandscapeMode(getContext()))
          a(); 
      } 
    }
    
    public final void performCompletion() {}
    
    public final void replaceText(CharSequence param1CharSequence) {}
    
    public void setImeVisibility(boolean param1Boolean) {
      InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      f f1 = this.j;
      if (!param1Boolean) {
        this.i = false;
        removeCallbacks(f1);
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      } 
      if (inputMethodManager.isActive((View)this)) {
        this.i = false;
        removeCallbacks(f1);
        inputMethodManager.showSoftInput((View)this, 0);
        return;
      } 
      this.i = true;
    }
    
    public void setSearchView(SearchView param1SearchView) {
      this.h = param1SearchView;
    }
    
    public void setThreshold(int param1Int) {
      super.setThreshold(param1Int);
      this.g = param1Int;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */