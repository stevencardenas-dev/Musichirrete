import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

public final class vq1 extends lt implements View.OnClickListener {
  public static final int A = 0;
  
  public final int k;
  
  public final int l;
  
  public final LayoutInflater m;
  
  public final SearchView n;
  
  public final SearchableInfo o;
  
  public final Context p;
  
  public final WeakHashMap q;
  
  public final int r;
  
  public int s;
  
  public ColorStateList t;
  
  public int u;
  
  public int v;
  
  public int w;
  
  public int x;
  
  public int y;
  
  public int z;
  
  public vq1(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap paramWeakHashMap) {
    d(paramContext, null, 1);
    this.l = i;
    this.k = i;
    this.m = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.s = 1;
    this.u = -1;
    this.v = -1;
    this.w = -1;
    this.x = -1;
    this.y = -1;
    this.z = -1;
    this.n = paramSearchView;
    this.o = paramSearchableInfo;
    this.r = paramSearchView.getSuggestionCommitIconResId();
    this.p = paramContext;
    this.q = paramWeakHashMap;
  }
  
  public static String k(Cursor paramCursor, int paramInt) {
    if (paramInt == -1)
      return null; 
    try {
      return paramCursor.getString(paramInt);
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception);
      return null;
    } 
  }
  
  public final void a(View paramView, Cursor paramCursor) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getTag : ()Ljava/lang/Object;
    //   4: checkcast uq1
    //   7: astore #8
    //   9: aload_0
    //   10: getfield z : I
    //   13: istore_3
    //   14: iload_3
    //   15: iconst_m1
    //   16: if_icmpeq -> 30
    //   19: aload_2
    //   20: iload_3
    //   21: invokeinterface getInt : (I)I
    //   26: istore_3
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_3
    //   32: aload #8
    //   34: getfield a : Landroid/widget/TextView;
    //   37: astore #6
    //   39: aload #8
    //   41: getfield b : Landroid/widget/TextView;
    //   44: astore #5
    //   46: aload #8
    //   48: getfield e : Landroid/widget/ImageView;
    //   51: astore #7
    //   53: aload #6
    //   55: ifnull -> 96
    //   58: aload_2
    //   59: aload_0
    //   60: getfield u : I
    //   63: invokestatic k : (Landroid/database/Cursor;I)Ljava/lang/String;
    //   66: astore_1
    //   67: aload #6
    //   69: aload_1
    //   70: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   73: aload_1
    //   74: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   77: ifeq -> 90
    //   80: aload #6
    //   82: bipush #8
    //   84: invokevirtual setVisibility : (I)V
    //   87: goto -> 96
    //   90: aload #6
    //   92: iconst_0
    //   93: invokevirtual setVisibility : (I)V
    //   96: aload_0
    //   97: getfield p : Landroid/content/Context;
    //   100: astore #9
    //   102: aload #5
    //   104: ifnull -> 288
    //   107: aload_2
    //   108: aload_0
    //   109: getfield w : I
    //   112: invokestatic k : (Landroid/database/Cursor;I)Ljava/lang/String;
    //   115: astore #10
    //   117: aload #10
    //   119: ifnull -> 206
    //   122: aload_0
    //   123: getfield t : Landroid/content/res/ColorStateList;
    //   126: ifnonnull -> 166
    //   129: new android/util/TypedValue
    //   132: dup
    //   133: invokespecial <init> : ()V
    //   136: astore_1
    //   137: aload #9
    //   139: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   142: ldc 2130970144
    //   144: aload_1
    //   145: iconst_1
    //   146: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   149: pop
    //   150: aload_0
    //   151: aload #9
    //   153: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   156: aload_1
    //   157: getfield resourceId : I
    //   160: invokevirtual getColorStateList : (I)Landroid/content/res/ColorStateList;
    //   163: putfield t : Landroid/content/res/ColorStateList;
    //   166: new android/text/SpannableString
    //   169: dup
    //   170: aload #10
    //   172: invokespecial <init> : (Ljava/lang/CharSequence;)V
    //   175: astore_1
    //   176: aload_1
    //   177: new android/text/style/TextAppearanceSpan
    //   180: dup
    //   181: aconst_null
    //   182: iconst_0
    //   183: iconst_0
    //   184: aload_0
    //   185: getfield t : Landroid/content/res/ColorStateList;
    //   188: aconst_null
    //   189: invokespecial <init> : (Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V
    //   192: iconst_0
    //   193: aload #10
    //   195: invokevirtual length : ()I
    //   198: bipush #33
    //   200: invokevirtual setSpan : (Ljava/lang/Object;III)V
    //   203: goto -> 215
    //   206: aload_2
    //   207: aload_0
    //   208: getfield v : I
    //   211: invokestatic k : (Landroid/database/Cursor;I)Ljava/lang/String;
    //   214: astore_1
    //   215: aload_1
    //   216: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   219: ifeq -> 242
    //   222: aload #6
    //   224: ifnull -> 259
    //   227: aload #6
    //   229: iconst_0
    //   230: invokevirtual setSingleLine : (Z)V
    //   233: aload #6
    //   235: iconst_2
    //   236: invokevirtual setMaxLines : (I)V
    //   239: goto -> 259
    //   242: aload #6
    //   244: ifnull -> 259
    //   247: aload #6
    //   249: iconst_1
    //   250: invokevirtual setSingleLine : (Z)V
    //   253: aload #6
    //   255: iconst_1
    //   256: invokevirtual setMaxLines : (I)V
    //   259: aload #5
    //   261: aload_1
    //   262: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   265: aload_1
    //   266: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   269: ifeq -> 282
    //   272: aload #5
    //   274: bipush #8
    //   276: invokevirtual setVisibility : (I)V
    //   279: goto -> 288
    //   282: aload #5
    //   284: iconst_0
    //   285: invokevirtual setVisibility : (I)V
    //   288: aload #8
    //   290: getfield c : Landroid/widget/ImageView;
    //   293: astore #10
    //   295: aload #10
    //   297: ifnull -> 590
    //   300: aload_0
    //   301: getfield x : I
    //   304: istore #4
    //   306: iload #4
    //   308: iconst_m1
    //   309: if_icmpne -> 317
    //   312: aconst_null
    //   313: astore_1
    //   314: goto -> 551
    //   317: aload_0
    //   318: aload_2
    //   319: iload #4
    //   321: invokeinterface getString : (I)Ljava/lang/String;
    //   326: invokevirtual i : (Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   329: astore_1
    //   330: aload_1
    //   331: ifnull -> 337
    //   334: goto -> 551
    //   337: aload_0
    //   338: getfield o : Landroid/app/SearchableInfo;
    //   341: invokevirtual getSearchActivity : ()Landroid/content/ComponentName;
    //   344: astore #5
    //   346: aload #5
    //   348: invokevirtual flattenToShortString : ()Ljava/lang/String;
    //   351: astore #12
    //   353: aload_0
    //   354: getfield q : Ljava/util/WeakHashMap;
    //   357: astore #11
    //   359: aload #11
    //   361: aload #12
    //   363: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   366: ifeq -> 402
    //   369: aload #11
    //   371: aload #12
    //   373: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   376: checkcast android/graphics/drawable/Drawable$ConstantState
    //   379: astore_1
    //   380: aload_1
    //   381: ifnonnull -> 389
    //   384: aconst_null
    //   385: astore_1
    //   386: goto -> 535
    //   389: aload_1
    //   390: aload #9
    //   392: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   395: invokevirtual newDrawable : (Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   398: astore_1
    //   399: goto -> 535
    //   402: aload #9
    //   404: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   407: astore #13
    //   409: aload #13
    //   411: aload #5
    //   413: sipush #128
    //   416: invokevirtual getActivityInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   419: astore_1
    //   420: aload_1
    //   421: invokevirtual getIconResource : ()I
    //   424: istore #4
    //   426: iload #4
    //   428: ifne -> 436
    //   431: aconst_null
    //   432: astore_1
    //   433: goto -> 509
    //   436: aload #13
    //   438: aload #5
    //   440: invokevirtual getPackageName : ()Ljava/lang/String;
    //   443: iload #4
    //   445: aload_1
    //   446: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   449: invokevirtual getDrawable : (Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    //   452: astore_1
    //   453: aload_1
    //   454: ifnonnull -> 492
    //   457: iload #4
    //   459: ldc_w 'Invalid icon resource '
    //   462: ldc_w ' for '
    //   465: invokestatic k : (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: astore_1
    //   469: aload_1
    //   470: aload #5
    //   472: invokevirtual flattenToShortString : ()Ljava/lang/String;
    //   475: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: pop
    //   479: ldc 'SuggestionsAdapter'
    //   481: aload_1
    //   482: invokevirtual toString : ()Ljava/lang/String;
    //   485: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   488: pop
    //   489: goto -> 431
    //   492: goto -> 509
    //   495: astore_1
    //   496: ldc 'SuggestionsAdapter'
    //   498: aload_1
    //   499: invokevirtual toString : ()Ljava/lang/String;
    //   502: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   505: pop
    //   506: goto -> 431
    //   509: aload_1
    //   510: ifnonnull -> 519
    //   513: aconst_null
    //   514: astore #5
    //   516: goto -> 525
    //   519: aload_1
    //   520: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
    //   523: astore #5
    //   525: aload #11
    //   527: aload #12
    //   529: aload #5
    //   531: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   534: pop
    //   535: aload_1
    //   536: ifnull -> 542
    //   539: goto -> 551
    //   542: aload #9
    //   544: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   547: invokevirtual getDefaultActivityIcon : ()Landroid/graphics/drawable/Drawable;
    //   550: astore_1
    //   551: aload #10
    //   553: aload_1
    //   554: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   557: aload_1
    //   558: ifnonnull -> 570
    //   561: aload #10
    //   563: iconst_4
    //   564: invokevirtual setVisibility : (I)V
    //   567: goto -> 590
    //   570: aload #10
    //   572: iconst_0
    //   573: invokevirtual setVisibility : (I)V
    //   576: aload_1
    //   577: iconst_0
    //   578: iconst_0
    //   579: invokevirtual setVisible : (ZZ)Z
    //   582: pop
    //   583: aload_1
    //   584: iconst_1
    //   585: iconst_0
    //   586: invokevirtual setVisible : (ZZ)Z
    //   589: pop
    //   590: aload #8
    //   592: getfield d : Landroid/widget/ImageView;
    //   595: astore #5
    //   597: aload #5
    //   599: ifnull -> 675
    //   602: aload_0
    //   603: getfield y : I
    //   606: istore #4
    //   608: iload #4
    //   610: iconst_m1
    //   611: if_icmpne -> 619
    //   614: aconst_null
    //   615: astore_1
    //   616: goto -> 632
    //   619: aload_0
    //   620: aload_2
    //   621: iload #4
    //   623: invokeinterface getString : (I)Ljava/lang/String;
    //   628: invokevirtual i : (Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   631: astore_1
    //   632: aload #5
    //   634: aload_1
    //   635: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   638: aload_1
    //   639: ifnonnull -> 652
    //   642: aload #5
    //   644: bipush #8
    //   646: invokevirtual setVisibility : (I)V
    //   649: goto -> 675
    //   652: aload #5
    //   654: iconst_0
    //   655: invokevirtual setVisibility : (I)V
    //   658: aload_1
    //   659: iconst_0
    //   660: iconst_0
    //   661: invokevirtual setVisible : (ZZ)Z
    //   664: pop
    //   665: aload_1
    //   666: iconst_1
    //   667: iconst_0
    //   668: invokevirtual setVisible : (ZZ)Z
    //   671: pop
    //   672: goto -> 675
    //   675: aload_0
    //   676: getfield s : I
    //   679: istore #4
    //   681: iload #4
    //   683: iconst_2
    //   684: if_icmpeq -> 699
    //   687: iload #4
    //   689: iconst_1
    //   690: if_icmpne -> 702
    //   693: iload_3
    //   694: iconst_1
    //   695: iand
    //   696: ifeq -> 702
    //   699: goto -> 712
    //   702: aload #7
    //   704: bipush #8
    //   706: invokevirtual setVisibility : (I)V
    //   709: goto -> 734
    //   712: aload #7
    //   714: iconst_0
    //   715: invokevirtual setVisibility : (I)V
    //   718: aload #7
    //   720: aload #6
    //   722: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   725: invokevirtual setTag : (Ljava/lang/Object;)V
    //   728: aload #7
    //   730: aload_0
    //   731: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   734: return
    // Exception table:
    //   from	to	target	type
    //   409	420	495	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public final void b(Cursor paramCursor) {
    try {
      super.b(paramCursor);
      if (paramCursor != null) {
        this.u = paramCursor.getColumnIndex("suggest_text_1");
        this.v = paramCursor.getColumnIndex("suggest_text_2");
        this.w = paramCursor.getColumnIndex("suggest_text_2_url");
        this.x = paramCursor.getColumnIndex("suggest_icon_1");
        this.y = paramCursor.getColumnIndex("suggest_icon_2");
        this.z = paramCursor.getColumnIndex("suggest_flags");
      } 
      return;
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", jHxlGgUTadw.rkUCOeMLtJDf, exception);
      return;
    } 
  }
  
  public final String c(Cursor paramCursor) {
    if (paramCursor != null) {
      String str = k(paramCursor, paramCursor.getColumnIndex("suggest_intent_query"));
      if (str != null)
        return str; 
      SearchableInfo searchableInfo = this.o;
      if (searchableInfo.shouldRewriteQueryFromData()) {
        String str1 = k(paramCursor, paramCursor.getColumnIndex("suggest_intent_data"));
        if (str1 != null)
          return str1; 
      } 
      if (searchableInfo.shouldRewriteQueryFromText()) {
        String str1 = k(paramCursor, paramCursor.getColumnIndex("suggest_text_1"));
        if (str1 != null)
          return str1; 
      } 
    } 
    return null;
  }
  
  public final View e(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    int i = this.l;
    return this.m.inflate(i, paramViewGroup, false);
  }
  
  public final View f(ViewGroup paramViewGroup) {
    int i = this.k;
    View view = this.m.inflate(i, paramViewGroup, false);
    view.setTag(new uq1(view));
    ((ImageView)view.findViewById(2131296680)).setImageResource(this.r);
    return view;
  }
  
  public final Cursor g(CharSequence paramCharSequence) {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    } else {
      paramCharSequence = paramCharSequence.toString();
    } 
    SearchView searchView = this.n;
    if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0)
      try {
        Cursor cursor = j(this.o, (String)paramCharSequence);
        if (cursor != null) {
          cursor.getCount();
          return cursor;
        } 
      } catch (RuntimeException runtimeException) {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", runtimeException);
      }  
    return null;
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getDropDownView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = e(this.p, this.e, paramViewGroup);
      if (view != null)
        ((uq1)view.getTag()).a.setText(runtimeException.toString()); 
      return view;
    } 
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = f(paramViewGroup);
      ((uq1)view.getTag()).a.setText(runtimeException.toString());
      return view;
    } 
  }
  
  public final Drawable h(Uri paramUri) {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str))
      try {
        Resources resources = this.p.getPackageManager().getResourcesForApplication(str);
        List<String> list = paramUri.getPathSegments();
        if (list != null) {
          int i = list.size();
          if (i == 1) {
            try {
              i = Integer.parseInt(list.get(0));
            } catch (NumberFormatException numberFormatException) {
              k91.j("Single path segment is not a resource ID: ", paramUri);
              return null;
            } 
          } else if (i == 2) {
            i = numberFormatException.getIdentifier(list.get(1), list.get(0), str);
          } else {
            k91.j("More than two path segments: ", paramUri);
            return null;
          } 
          if (i != 0)
            return numberFormatException.getDrawable(i); 
          k91.j("No resource found for: ", paramUri);
          return null;
        } 
        k91.j("No path: ", paramUri);
        return null;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        k91.j(oXrNDUqUkE.bZTZXNWHxARQLse, paramUri);
        return null;
      }  
    k91.j("No authority: ", paramUri);
    return null;
  }
  
  public final Drawable i(String paramString) {
    FileNotFoundException fileNotFoundException1;
    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.q;
    Context context = this.p;
    StringBuilder stringBuilder1 = null;
    FileNotFoundException fileNotFoundException2 = null;
    StringBuilder stringBuilder2 = stringBuilder1;
    if (paramString != null) {
      stringBuilder2 = stringBuilder1;
      if (!paramString.isEmpty())
        if ("0".equals(paramString)) {
          stringBuilder2 = stringBuilder1;
        } else {
          try {
            int i = Integer.parseInt(paramString);
            stringBuilder1 = new StringBuilder();
            this("android.resource://");
            stringBuilder1.append(context.getPackageName());
            stringBuilder1.append("/");
            stringBuilder1.append(i);
            String str = stringBuilder1.toString();
            Drawable.ConstantState constantState = (Drawable.ConstantState)weakHashMap.get(str);
            if (constantState == null) {
              constantState = null;
            } else {
              drawable = constantState.newDrawable();
            } 
            if (drawable != null)
              return drawable; 
            Drawable drawable = context.getDrawable(i);
            if (drawable != null)
              weakHashMap.put(str, drawable.getConstantState()); 
            return drawable;
          } catch (NumberFormatException numberFormatException) {
            Drawable drawable;
            Drawable.ConstantState constantState = weakHashMap.get(paramString);
            if (constantState == null) {
              constantState = null;
            } else {
              drawable = constantState.newDrawable();
            } 
            if (drawable != null)
              return drawable; 
            Uri uri = Uri.parse(paramString);
            try {
              FileNotFoundException fileNotFoundException3;
              boolean bool = "android.resource".equals(uri.getScheme());
              if (bool) {
                try {
                  drawable = h(uri);
                } catch (android.content.res.Resources.NotFoundException notFoundException) {
                  fileNotFoundException3 = new FileNotFoundException();
                  StringBuilder stringBuilder = new StringBuilder();
                  this("Resource does not exist: ");
                  stringBuilder.append(uri);
                  this(stringBuilder.toString());
                  throw fileNotFoundException3;
                } 
              } else {
                InputStream inputStream = fileNotFoundException3.getContentResolver().openInputStream(uri);
                if (inputStream != null) {
                  StringBuilder stringBuilder;
                  try {
                    drawable = Drawable.createFromStream(inputStream, null);
                  } finally {
                    try {
                      stringBuilder.close();
                    } catch (IOException iOException) {
                      StringBuilder stringBuilder3 = new StringBuilder();
                      this("Error closing icon stream for ");
                      stringBuilder3.append(uri);
                      Log.e("SuggestionsAdapter", stringBuilder3.toString(), iOException);
                    } 
                  } 
                } else {
                  fileNotFoundException = new FileNotFoundException();
                  StringBuilder stringBuilder = new StringBuilder();
                  this("Failed to open ");
                  stringBuilder.append(uri);
                  this(stringBuilder.toString());
                  throw fileNotFoundException;
                } 
              } 
            } catch (FileNotFoundException fileNotFoundException) {
              StringBuilder stringBuilder = new StringBuilder("Icon not found: ");
              stringBuilder.append(uri);
              stringBuilder.append(", ");
              stringBuilder.append(fileNotFoundException.getMessage());
              Log.w("SuggestionsAdapter", stringBuilder.toString());
              fileNotFoundException = fileNotFoundException2;
            } 
            fileNotFoundException1 = fileNotFoundException;
            if (fileNotFoundException != null) {
              weakHashMap.put(paramString, fileNotFoundException.getConstantState());
              fileNotFoundException1 = fileNotFoundException;
            } 
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            Log.w("SuggestionsAdapter", ybWnIKHovcRr.OXXxkBaNOCBUoBh.concat(paramString));
            return null;
          } 
        }  
    } 
    return (Drawable)fileNotFoundException1;
  }
  
  public final Cursor j(SearchableInfo paramSearchableInfo, String paramString) {
    SearchableInfo searchableInfo = null;
    if (paramSearchableInfo != null) {
      String str = paramSearchableInfo.getSuggestAuthority();
      if (str != null) {
        Uri.Builder builder = (new Uri.Builder()).scheme("content").authority(str).query("").fragment("");
        String str1 = paramSearchableInfo.getSuggestPath();
        if (str1 != null)
          builder.appendEncodedPath(str1); 
        builder.appendPath("search_suggest_query");
        str1 = paramSearchableInfo.getSuggestSelection();
        if (str1 != null) {
          String[] arrayOfString = new String[1];
          arrayOfString[0] = paramString;
        } else {
          builder.appendPath(paramString);
          paramSearchableInfo = searchableInfo;
        } 
        builder.appendQueryParameter("limit", String.valueOf(50));
        Uri uri = builder.build();
        return this.p.getContentResolver().query(uri, null, str1, (String[])paramSearchableInfo, null);
      } 
    } 
    return null;
  }
  
  public final void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    Cursor cursor = this.e;
    if (cursor != null) {
      Bundle bundle = cursor.getExtras();
    } else {
      cursor = null;
    } 
    if (cursor != null)
      cursor.getBoolean("in_progress"); 
  }
  
  public final void notifyDataSetInvalidated() {
    super.notifyDataSetInvalidated();
    Cursor cursor = this.e;
    if (cursor != null) {
      Bundle bundle = cursor.getExtras();
    } else {
      cursor = null;
    } 
    if (cursor != null)
      cursor.getBoolean("in_progress"); 
  }
  
  public final void onClick(View paramView) {
    Object object = paramView.getTag();
    if (object instanceof CharSequence)
      this.n.onQueryRefine((CharSequence)object); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */