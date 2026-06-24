package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Html;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.insets.ProtectionLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import dd1;
import e;
import f;
import g92;
import hn;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import jn;
import k91;
import m92;
import ms0;
import n0;
import p01;
import pc;
import qi0;
import qo;
import rs0;
import ss0;
import u00;
import v00;
import ws2;
import z51;
import zo2;

public class AboutActivity extends pc implements View.OnClickListener, View.OnLongClickListener {
  public static AboutActivity Z;
  
  public ss0 R;
  
  public boolean S;
  
  public SmartTextView T;
  
  public SmartTextView U;
  
  public MaterialCardView V;
  
  public int W = 0;
  
  public final e X = new e(0, this);
  
  public p01 Y;
  
  public static void n0(AboutActivity paramAboutActivity, String paramString1, String paramString2, v00 paramv00, String paramString3) {
    Uri.Builder builder = Uri.parse("mailto:musicolet@krosbits.in").buildUpon();
    builder.appendQueryParameter("to", "musicolet@krosbits.in");
    builder.appendQueryParameter("subject", paramString1);
    builder.appendQueryParameter("body", paramString2);
    Intent intent = new Intent("android.intent.action.SENDTO", builder.build());
    intent.putExtra("android.intent.extra.SUBJECT", paramString1);
    intent.putExtra("android.intent.extra.TEXT", paramString2);
    intent.putExtra("android.intent.extra.EMAIL", new String[] { "musicolet@krosbits.in" });
    intent.addFlags(268435456);
    if (paramv00 != null) {
      Uri uri = zo2.s((Context)paramAboutActivity, (u00)paramv00);
      intent.putExtra("android.intent.extra.STREAM", (Parcelable)uri);
      intent.setClipData(ClipData.newRawUri(paramv00.h(), uri));
      intent.addFlags(1);
    } 
    paramAboutActivity.startActivity(Intent.createChooser(intent, paramString3).addFlags(268435456));
  }
  
  public void goBack(View paramView) {
    onBackPressed();
  }
  
  public final void l0(String paramString1, String paramString2) {
    try {
      Intent intent = new Intent();
      return;
    } finally {
      paramString2 = null;
      paramString2.printStackTrace();
    } 
  }
  
  public final void m0(String paramString) {
    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://instagram.com/_u/".concat(paramString)));
    intent.setPackage("com.instagram.android");
    intent.addFlags(268435456);
    try {
      startActivity(intent);
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      try {
        Intent intent1 = new Intent();
        this("android.intent.action.VIEW", Uri.parse("http://instagram.com/".concat(paramString)));
        startActivity(intent1.addFlags(268435456));
      } finally {
        paramString = null;
      } 
    } 
  }
  
  public void moreLinks(View paramView) {
    try {
      findViewById(2131296873).setVisibility(8);
      findViewById(2131296916).setVisibility(0);
      findViewById(2131296912).setVisibility(0);
      findViewById(2131296889).setVisibility(0);
      findViewById(2131296917).setVisibility(0);
    } finally {}
  }
  
  public final void o0(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      InputStream inputStream = getAssets().open(paramString);
      BufferedReader bufferedReader = new BufferedReader();
      InputStreamReader inputStreamReader = new InputStreamReader();
      this(inputStream);
      this(inputStreamReader);
      while (true) {
        String str = bufferedReader.readLine();
        if (str != null) {
          stringBuilder.append(str);
          continue;
        } 
        bufferedReader.close();
        ms0 ms0 = new ms0();
        this((Context)this);
        ms0.n(2131887030);
        qi0 qi0 = new qi0();
        this();
        ms0.c = (MovementMethod)qi0;
        ms0.d((CharSequence)Html.fromHtml(stringBuilder.toString()));
        ms0.p();
        return;
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296633 || i == 2131297833 || paramView == (LinearLayout)this.Y.e) {
      startActivity(new Intent((Context)this, IapActivity.class));
      return;
    } 
    if (i == 2131296874) {
      i = this.W + 1;
      this.W = i;
      if (i >= 5) {
        this.W = 0;
        ms0 ms0 = new ms0((Context)this);
        String str = getString(2131886459);
        boolean bool = MyApplication.o().getBoolean("k_b_dvoe", false);
        ms0.o0 = str;
        ms0.p0 = bool;
        ms0.q0 = null;
        ms0.n(2131887030);
        ms0.k(2131886278);
        ms0.K = false;
        ms0.A = (rs0)new f(0, this);
        ms0.p();
      } 
      e e1 = this.X;
      paramView.removeCallbacks((Runnable)e1);
      paramView.postDelayed((Runnable)e1, 1000L);
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    TextView textView;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    View view = LayoutInflater.from((Context)this).inflate(2131492894, null, false);
    int i = 2131296495;
    if ((MaterialCardView)ws2.C(view, 2131296495) != null) {
      i = 2131296496;
      if ((MaterialCardView)ws2.C(view, 2131296496) != null) {
        i = 2131296497;
        if ((MaterialCardView)ws2.C(view, 2131296497) != null) {
          i = 2131296498;
          if ((MaterialCardView)ws2.C(view, 2131296498) != null) {
            i = 2131296499;
            if ((MaterialCardView)ws2.C(view, 2131296499) != null) {
              i = 2131296500;
              if ((MaterialCardView)ws2.C(view, 2131296500) != null) {
                i = 2131296630;
                if ((MaterialCardView)ws2.C(view, 2131296630) != null) {
                  i = 2131296631;
                  if ((MaterialCardView)ws2.C(view, 2131296631) != null)
                    if ((MaterialCardView)ws2.C(view, 2131296633) != null) {
                      i = 2131296638;
                      MaterialCardView materialCardView = (MaterialCardView)ws2.C(view, 2131296638);
                      if (materialCardView != null) {
                        i = 2131296822;
                        if ((ImageView)ws2.C(view, 2131296822) != null) {
                          i = 2131296873;
                          if ((SmartImageView)ws2.C(view, 2131296873) != null) {
                            i = 2131296874;
                            if ((ImageView)ws2.C(view, 2131296874) != null) {
                              i = 2131296889;
                              if ((SmartImageView)ws2.C(view, 2131296889) != null) {
                                i = 2131296912;
                                if ((SmartImageView)ws2.C(view, 2131296912) != null) {
                                  i = 2131296916;
                                  if ((SmartImageView)ws2.C(view, 2131296916) != null) {
                                    i = 2131296917;
                                    if ((SmartImageView)ws2.C(view, 2131296917) != null) {
                                      i = 2131296931;
                                      if ((ConstraintLayout)ws2.C(view, 2131296931) != null) {
                                        i = 2131296932;
                                        if ((LinearLayout)ws2.C(view, 2131296932) != null) {
                                          i = 2131296933;
                                          if ((LinearLayout)ws2.C(view, 2131296933) != null) {
                                            ProtectionLayout protectionLayout = (ProtectionLayout)view;
                                            i = 2131297035;
                                            LinearLayout linearLayout = (LinearLayout)ws2.C(view, 2131297035);
                                            if (linearLayout != null) {
                                              i = 2131297284;
                                              if ((TextView)ws2.C(view, 2131297284) != null) {
                                                i = 2131297503;
                                                if ((SmartTextView)ws2.C(view, 2131297503) != null) {
                                                  i = 2131297504;
                                                  if ((SmartTextView)ws2.C(view, 2131297504) != null) {
                                                    i = 2131297555;
                                                    if ((ScrollView)ws2.C(view, 2131297555) != null) {
                                                      i = 2131297624;
                                                      if ((TextView)ws2.C(view, 2131297624) != null) {
                                                        i = 2131297681;
                                                        if ((TextView)ws2.C(view, 2131297681) != null) {
                                                          i = 2131297682;
                                                          if ((TextView)ws2.C(view, 2131297682) != null) {
                                                            i = 2131297715;
                                                            if ((TextView)ws2.C(view, 2131297715) != null)
                                                              if ((SmartTextView)ws2.C(view, 2131297833) != null) {
                                                                if ((SmartTextView)ws2.C(view, 2131297834) != null) {
                                                                  i = 2131297882;
                                                                  SmartTextView smartTextView = (SmartTextView)ws2.C(view, 2131297882);
                                                                  if (smartTextView != null) {
                                                                    i = 2131297901;
                                                                    if ((TextView)ws2.C(view, 2131297901) != null) {
                                                                      i = 2131297906;
                                                                      if ((SmartTextView)ws2.C(view, 2131297906) != null) {
                                                                        i = 2131297950;
                                                                        if (ws2.C(view, 2131297950) != null) {
                                                                          this.Y = new p01(protectionLayout, materialCardView, linearLayout, smartTextView);
                                                                          setContentView((View)protectionLayout);
                                                                          g92.c(findViewById(2131297555), true, false);
                                                                          ProtectionLayout protectionLayout1 = (ProtectionLayout)findViewById(2131296941);
                                                                          i = jn.i(m92.h[2], 178);
                                                                          hn hn2 = new hn(2, i);
                                                                          hn hn1 = new hn(8, i);
                                                                          ArrayList<Object> arrayList = new ArrayList(2);
                                                                          for (i = 0; i < 2; i++) {
                                                                            (new Object[2])[0] = hn2;
                                                                            (new Object[2])[1] = hn1;
                                                                            Object object = (new Object[2])[i];
                                                                            Objects.requireNonNull(object);
                                                                            arrayList.add(object);
                                                                          } 
                                                                          protectionLayout1.setProtections(Collections.unmodifiableList(arrayList));
                                                                          new Handler();
                                                                          getSharedPreferences("USP", 0);
                                                                          findViewById(2131296631);
                                                                          ms0 ms0 = new ms0((Context)this);
                                                                          ms0.o(0, true);
                                                                          ms0.c(2131887105);
                                                                          this.R = new ss0(ms0);
                                                                          TextView textView1 = (TextView)findViewById(2131297901);
                                                                          textView = (TextView)findViewById(2131297715);
                                                                          this.T = (SmartTextView)findViewById(2131297834);
                                                                          this.V = (MaterialCardView)findViewById(2131296633);
                                                                          this.U = (SmartTextView)findViewById(2131297833);
                                                                          this.V.setOnClickListener(this);
                                                                          ((LinearLayout)this.Y.e).setOnClickListener(this);
                                                                          this.U.setOnClickListener(this);
                                                                          View view1 = findViewById(2131296874);
                                                                          view1.setOnClickListener(this);
                                                                          view1.setOnLongClickListener(this);
                                                                          this.S = MyApplication.o().getBoolean("k_b_dvoe", false);
                                                                          try {
                                                                            textView1.setText((getPackageManager().getPackageInfo(getPackageName(), 0)).versionName);
                                                                          } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
                                                                            nameNotFoundException.printStackTrace();
                                                                          } 
                                                                          textView.setText("© Maulik Raviya");
                                                                          Z = this;
                                                                          return;
                                                                        } 
                                                                      } 
                                                                    } 
                                                                  } 
                                                                } else {
                                                                  i = 2131297834;
                                                                } 
                                                              } else {
                                                                i = 2131297833;
                                                              }  
                                                          } 
                                                        } 
                                                      } 
                                                    } 
                                                  } 
                                                } 
                                              } 
                                            } 
                                          } 
                                        } 
                                      } 
                                    } 
                                  } 
                                } 
                              } 
                            } 
                          } 
                        } 
                      } 
                    } else {
                      i = 2131296633;
                    }  
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(textView.getResources().getResourceName(i)));
  }
  
  public final void onDestroy() {
    Z = null;
    super.onDestroy();
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296874) {
      MyApplication.w();
      return true;
    } 
    return false;
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    if (paramMenuItem.getItemId() == 16908332)
      finish(); 
    return true;
  }
  
  public final void onResume() {
    byte b1;
    byte b2;
    String str;
    super.onResume();
    if (MyApplication.g && !ws2.U()) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    SmartTextView smartTextView2 = (SmartTextView)this.Y.f;
    if (b1) {
      b2 = 0;
    } else {
      b2 = 8;
    } 
    smartTextView2.setVisibility(b2);
    MaterialCardView materialCardView = (MaterialCardView)this.Y.c;
    if (b1) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    materialCardView.setVisibility(b1);
    boolean bool = ws2.U();
    SmartTextView smartTextView1 = this.U;
    if (bool) {
      smartTextView1.setVisibility(0);
      this.V.setVisibility(0);
      str = ws2.Q();
      SmartTextView smartTextView = this.T;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getString(2131887129));
      stringBuilder.append(" <small>");
      stringBuilder.append(str);
      stringBuilder.append("</small>");
      smartTextView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.T.setCompoundDrawables(getResources().getDrawable(2131231111), null, null, null);
    } else {
      str.setVisibility(8);
      this.T.setText(2131886632);
      this.T.setCompoundDrawables(getResources().getDrawable(2131231096), null, null, null);
      bool = MyApplication.g;
      MaterialCardView materialCardView1 = this.V;
      if (bool) {
        materialCardView1.setVisibility(0);
      } else {
        materialCardView1.setVisibility(8);
      } 
    } 
    ss0 ss01 = this.R;
    if (ss01 != null && ss01.isShowing())
      this.R.dismiss(); 
  }
  
  public void openChannelLog(View paramView) {
    try {
      InputStream inputStream = getAssets().open("change_log.txt");
      BufferedReader bufferedReader = new BufferedReader();
      InputStreamReader inputStreamReader = new InputStreamReader();
      this(inputStream);
      this(inputStreamReader);
      StringBuilder stringBuilder = new StringBuilder();
      this();
      String str = bufferedReader.readLine();
      if (str != null) {
        stringBuilder.append(str);
        while (true) {
          str = bufferedReader.readLine();
          if (str != null) {
            stringBuilder.append("\n");
            stringBuilder.append(str);
            continue;
          } 
          break;
        } 
      } 
      ms0 ms0 = new ms0();
      this((Context)this);
      ms0.q(2131887578);
      ms0.d(stringBuilder.toString());
      ms0.n(2131887030);
      ms0.p();
      return;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
  }
  
  public void openCredits(View paramView) {
    o0("credits.html");
  }
  
  public void openFAQActivity(View paramView) {
    startActivity(new Intent(getApplicationContext(), FAQActivity.class));
  }
  
  public void openFbKrosbits(View paramView) {
    l0("https://www.facebook.com/krosbits", ybWnIKHovcRr.ViMORkMgKoL);
    this.R.show();
  }
  
  public void openFbMusicolet(View paramView) {
    l0("https://www.facebook.com/musicolet", "1080721061973404");
    this.R.show();
  }
  
  public void openInstaKrosbits(View paramView) {
    m0("krosbits");
    this.R.show();
  }
  
  public void openInstaMusicolet(View paramView) {
    m0("musicolet");
    this.R.show();
  }
  
  public void openKrosbitsPlay(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=8059182133280644587"));
      return;
    } finally {
      paramView = null;
      paramView.printStackTrace();
    } 
  }
  
  public void openLicenses(View paramView) {
    o0("about.html");
  }
  
  public void openMusicoletOnPlay(View paramView) {
    ag0.l0(getApplication().getPackageName());
    this.R.show();
  }
  
  public void openPrivacyPolicy(View paramView) {
    MyApplication.i.getApplicationContext().startActivity((new Intent("android.intent.action.VIEW", Uri.parse("https://krosbits.in/musicolet/docs/privacy_policy/"))).addFlags(268435456));
  }
  
  public void openReddit(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("https://reddit.com/r/musicolet"));
      startActivity(intent.addFlags(268435456));
    } catch (Exception exception) {}
  }
  
  public void openTelegram(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("tg://resolve?domain=musicolet"));
      startActivity(intent.addFlags(268435456));
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("https://telegram.me/musicolet"));
      startActivity(intent.addFlags(268435456));
    } finally {}
  }
  
  public void openTwitterKrosbits(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("twitter://user?user_id=4341247094"));
      intent.addFlags(268435456);
      startActivity(intent);
    } catch (Exception exception) {
      Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/krosbits"));
      intent.addFlags(268435456);
    } 
    this.R.show();
  }
  
  public void openTwitterMusicolet(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("twitter://user?user_id=728573267645214720"));
      intent.addFlags(268435456);
      startActivity(intent);
    } catch (Exception exception) {
      Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/musicolet"));
      intent.addFlags(268435456);
    } 
    this.R.show();
  }
  
  public void openWA(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("https://whatsapp.com/channel/0029Va5IVoR9hXFCRBGZQs3D"));
      startActivity(intent.addFlags(268435456));
    } catch (Exception exception) {}
  }
  
  public void openYoutube(View paramView) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", Uri.parse("https://youtube.com/channel/UCKsANyQPiCEwXGqonU3va7A"));
      startActivity(intent.addFlags(268435456));
    } catch (Exception exception) {}
  }
  
  public void reportBugs(View paramView) {
    // Byte code:
    //   0: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   3: ldc_w 'logcat -d'
    //   6: invokevirtual exec : (Ljava/lang/String;)Ljava/lang/Process;
    //   9: astore #9
    //   11: getstatic ag0.a : Ljava/lang/String;
    //   14: astore_1
    //   15: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   18: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   21: invokevirtual getCacheDir : ()Ljava/io/File;
    //   24: invokestatic s : (Ljava/io/File;)Lcd1;
    //   27: ldc_w 'logs'
    //   30: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   33: astore #6
    //   35: aload #6
    //   37: astore_1
    //   38: aload #6
    //   40: invokevirtual k : ()Z
    //   43: ifne -> 77
    //   46: aload #6
    //   48: invokevirtual E : ()Z
    //   51: pop
    //   52: aload #6
    //   54: ldc_w '.nomedia'
    //   57: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   60: invokevirtual p : ()Z
    //   63: pop
    //   64: aload #6
    //   66: astore_1
    //   67: goto -> 77
    //   70: astore_1
    //   71: aload_1
    //   72: invokevirtual printStackTrace : ()V
    //   75: aconst_null
    //   76: astore_1
    //   77: aload_1
    //   78: ldc_w 'musicolet_debug_logs.txt'
    //   81: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   84: astore #7
    //   86: new java/io/BufferedWriter
    //   89: astore #8
    //   91: new java/io/OutputStreamWriter
    //   94: astore_1
    //   95: aload_1
    //   96: aload #7
    //   98: invokestatic o : (Lu00;)Ljava/io/FileOutputStream;
    //   101: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   104: aload #8
    //   106: aload_1
    //   107: invokespecial <init> : (Ljava/io/Writer;)V
    //   110: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   113: invokevirtual p : ()Z
    //   116: istore #5
    //   118: ldc_w ''
    //   121: astore #6
    //   123: lconst_0
    //   124: lstore_3
    //   125: iload #5
    //   127: ifeq -> 183
    //   130: invokestatic y : ()Lv00;
    //   133: ldc_w 'last_crash.txt'
    //   136: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   139: astore #11
    //   141: aload #11
    //   143: invokevirtual l : ()Z
    //   146: ifeq -> 392
    //   149: aload #11
    //   151: invokevirtual m : ()J
    //   154: lstore_3
    //   155: new java/io/BufferedReader
    //   158: astore_1
    //   159: new java/io/InputStreamReader
    //   162: astore #10
    //   164: aload #10
    //   166: aload #11
    //   168: invokestatic n : (Lu00;)Ljava/io/FileInputStream;
    //   171: invokespecial <init> : (Ljava/io/InputStream;)V
    //   174: aload_1
    //   175: aload #10
    //   177: invokespecial <init> : (Ljava/io/Reader;)V
    //   180: goto -> 394
    //   183: getstatic android/os/Build$VERSION.SDK_INT : I
    //   186: bipush #30
    //   188: if_icmplt -> 392
    //   191: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   194: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   197: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   200: astore #11
    //   202: new java/lang/StringBuilder
    //   205: astore_1
    //   206: aload_1
    //   207: invokespecial <init> : ()V
    //   210: aload_1
    //   211: getstatic android/os/Environment.DIRECTORY_DOCUMENTS : Ljava/lang/String;
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload_1
    //   219: ldc_w '/Musicolet/logs/'
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: invokevirtual toString : ()Ljava/lang/String;
    //   230: astore_1
    //   231: ldc_w 'external_primary'
    //   234: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   237: astore #12
    //   239: aload #11
    //   241: aload #12
    //   243: iconst_2
    //   244: anewarray java/lang/String
    //   247: dup
    //   248: iconst_0
    //   249: ldc_w '_id'
    //   252: aastore
    //   253: dup
    //   254: iconst_1
    //   255: ldc_w 'date_modified'
    //   258: aastore
    //   259: ldc_w 'relative_path like ?  AND _display_name like ?'
    //   262: iconst_2
    //   263: anewarray java/lang/String
    //   266: dup
    //   267: iconst_0
    //   268: aload_1
    //   269: aastore
    //   270: dup
    //   271: iconst_1
    //   272: ldc_w 'last_crash%.txt'
    //   275: aastore
    //   276: ldc_w 'date_modified DESC'
    //   279: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   282: astore #10
    //   284: aload #10
    //   286: ifnull -> 392
    //   289: aload #10
    //   291: invokeinterface moveToNext : ()Z
    //   296: ifeq -> 380
    //   299: aload #10
    //   301: iconst_0
    //   302: invokeinterface getInt : (I)I
    //   307: istore_2
    //   308: aload #10
    //   310: iconst_1
    //   311: invokeinterface getInt : (I)I
    //   316: i2l
    //   317: ldc2_w 1000
    //   320: lmul
    //   321: lstore_3
    //   322: new java/io/BufferedReader
    //   325: astore_1
    //   326: new java/io/InputStreamReader
    //   329: astore #14
    //   331: new java/lang/StringBuilder
    //   334: astore #13
    //   336: aload #13
    //   338: ldc_w ''
    //   341: invokespecial <init> : (Ljava/lang/String;)V
    //   344: aload #13
    //   346: iload_2
    //   347: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   350: pop
    //   351: aload #14
    //   353: aload #11
    //   355: aload #12
    //   357: aload #13
    //   359: invokevirtual toString : ()Ljava/lang/String;
    //   362: invokestatic withAppendedPath : (Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   365: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   368: invokespecial <init> : (Ljava/io/InputStream;)V
    //   371: aload_1
    //   372: aload #14
    //   374: invokespecial <init> : (Ljava/io/Reader;)V
    //   377: goto -> 382
    //   380: aconst_null
    //   381: astore_1
    //   382: aload #10
    //   384: invokeinterface close : ()V
    //   389: goto -> 394
    //   392: aconst_null
    //   393: astore_1
    //   394: aload_1
    //   395: ifnull -> 491
    //   398: new java/lang/StringBuilder
    //   401: astore #11
    //   403: aload #11
    //   405: ldc_w 'last_crash.txt file modified at: '
    //   408: invokespecial <init> : (Ljava/lang/String;)V
    //   411: new java/util/Date
    //   414: astore #10
    //   416: aload #10
    //   418: lload_3
    //   419: invokespecial <init> : (J)V
    //   422: aload #11
    //   424: aload #10
    //   426: invokevirtual toString : ()Ljava/lang/String;
    //   429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: pop
    //   433: aload #8
    //   435: aload #11
    //   437: invokevirtual toString : ()Ljava/lang/String;
    //   440: invokevirtual write : (Ljava/lang/String;)V
    //   443: aload #8
    //   445: invokevirtual newLine : ()V
    //   448: aload #8
    //   450: ldc_w '------------'
    //   453: invokevirtual write : (Ljava/lang/String;)V
    //   456: aload #8
    //   458: invokevirtual newLine : ()V
    //   461: aload_1
    //   462: invokevirtual readLine : ()Ljava/lang/String;
    //   465: astore #10
    //   467: aload #10
    //   469: ifnull -> 487
    //   472: aload #8
    //   474: aload #10
    //   476: invokevirtual write : (Ljava/lang/String;)V
    //   479: aload #8
    //   481: invokevirtual newLine : ()V
    //   484: goto -> 461
    //   487: aload_1
    //   488: invokevirtual close : ()V
    //   491: new java/io/BufferedReader
    //   494: astore #10
    //   496: new java/io/InputStreamReader
    //   499: astore_1
    //   500: aload_1
    //   501: aload #9
    //   503: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   506: invokespecial <init> : (Ljava/io/InputStream;)V
    //   509: aload #10
    //   511: aload_1
    //   512: invokespecial <init> : (Ljava/io/Reader;)V
    //   515: aload #8
    //   517: ldc_w '------------'
    //   520: invokevirtual write : (Ljava/lang/String;)V
    //   523: aload #8
    //   525: invokevirtual newLine : ()V
    //   528: aload #8
    //   530: invokevirtual newLine : ()V
    //   533: aload #8
    //   535: ldc_w '------------'
    //   538: invokevirtual write : (Ljava/lang/String;)V
    //   541: new java/lang/StringBuilder
    //   544: astore_1
    //   545: aload_1
    //   546: invokespecial <init> : ()V
    //   549: aload_1
    //   550: ldc_w 'Logs generated at: '
    //   553: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: pop
    //   557: new java/util/Date
    //   560: astore #9
    //   562: aload #9
    //   564: invokespecial <init> : ()V
    //   567: aload_1
    //   568: aload #9
    //   570: invokevirtual toString : ()Ljava/lang/String;
    //   573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: pop
    //   577: aload #8
    //   579: aload_1
    //   580: invokevirtual toString : ()Ljava/lang/String;
    //   583: invokevirtual write : (Ljava/lang/String;)V
    //   586: aload #8
    //   588: invokevirtual newLine : ()V
    //   591: new java/lang/StringBuilder
    //   594: astore #9
    //   596: aload #9
    //   598: invokespecial <init> : ()V
    //   601: aload #9
    //   603: ldc_w 'Device:'
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: pop
    //   610: invokestatic l : ()Z
    //   613: istore #5
    //   615: iload #5
    //   617: ifeq -> 627
    //   620: ldc_w ' '
    //   623: astore_1
    //   624: goto -> 631
    //   627: ldc_w ''
    //   630: astore_1
    //   631: aload #9
    //   633: aload_1
    //   634: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: aload #9
    //   640: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: pop
    //   647: aload #9
    //   649: ldc_w '>'
    //   652: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: pop
    //   656: aload #9
    //   658: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   661: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: pop
    //   665: aload #9
    //   667: ldc_w '>'
    //   670: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   673: pop
    //   674: aload #9
    //   676: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   679: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   682: pop
    //   683: aload #9
    //   685: ldc_w ' API:'
    //   688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   691: pop
    //   692: aload #9
    //   694: getstatic android/os/Build$VERSION.SDK_INT : I
    //   697: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   700: pop
    //   701: aload #9
    //   703: ldc_w ' ABI:'
    //   706: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   709: pop
    //   710: aload #9
    //   712: getstatic android/os/Build.SUPPORTED_ABIS : [Ljava/lang/String;
    //   715: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   718: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   721: pop
    //   722: aload #8
    //   724: aload #9
    //   726: invokevirtual toString : ()Ljava/lang/String;
    //   729: invokevirtual write : (Ljava/lang/String;)V
    //   732: aload #8
    //   734: invokevirtual newLine : ()V
    //   737: aload #8
    //   739: ldc_w 'App: Musicolet 6.14 build530'
    //   742: invokevirtual write : (Ljava/lang/String;)V
    //   745: aload #8
    //   747: invokevirtual newLine : ()V
    //   750: aload #8
    //   752: ldc_w '------------'
    //   755: invokevirtual write : (Ljava/lang/String;)V
    //   758: aload #8
    //   760: invokevirtual newLine : ()V
    //   763: aload #10
    //   765: invokevirtual readLine : ()Ljava/lang/String;
    //   768: astore_1
    //   769: aload_1
    //   770: ifnull -> 787
    //   773: aload #8
    //   775: aload_1
    //   776: invokevirtual write : (Ljava/lang/String;)V
    //   779: aload #8
    //   781: invokevirtual newLine : ()V
    //   784: goto -> 763
    //   787: aload #10
    //   789: invokevirtual close : ()V
    //   792: aload #8
    //   794: invokevirtual close : ()V
    //   797: new java/lang/StringBuilder
    //   800: astore #8
    //   802: aload #8
    //   804: ldc_w 'Device's Detail:\\n'
    //   807: invokespecial <init> : (Ljava/lang/String;)V
    //   810: aload #8
    //   812: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   815: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   818: pop
    //   819: aload #8
    //   821: ldc_w '>'
    //   824: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   827: pop
    //   828: aload #8
    //   830: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   833: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   836: pop
    //   837: aload #8
    //   839: ldc_w '>'
    //   842: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   845: pop
    //   846: aload #8
    //   848: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   851: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   854: pop
    //   855: aload #8
    //   857: ldc_w '\\n'
    //   860: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   863: pop
    //   864: aload #8
    //   866: ldc_w 'ANDRD_'
    //   869: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   872: pop
    //   873: aload #8
    //   875: getstatic android/os/Build$VERSION.SDK_INT : I
    //   878: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   881: pop
    //   882: aload #8
    //   884: ldc_w '\\nApp detail: Musicolet'
    //   887: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: pop
    //   891: aload_0
    //   892: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   895: aload_0
    //   896: invokevirtual getPackageName : ()Ljava/lang/String;
    //   899: iconst_0
    //   900: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   903: astore_1
    //   904: aload #8
    //   906: ldc_w ' '
    //   909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: pop
    //   913: aload #8
    //   915: aload_1
    //   916: getfield versionName : Ljava/lang/String;
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: pop
    //   923: ldc_w ' | b530'
    //   926: astore_1
    //   927: goto -> 939
    //   930: astore_1
    //   931: aload_1
    //   932: invokevirtual printStackTrace : ()V
    //   935: ldc_w ''
    //   938: astore_1
    //   939: new java/lang/StringBuilder
    //   942: astore #9
    //   944: aload #9
    //   946: invokespecial <init> : ()V
    //   949: aload #9
    //   951: ldc_w '\\n\\nHi'
    //   954: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   957: pop
    //   958: invokestatic l : ()Z
    //   961: ifeq -> 969
    //   964: ldc_w '!'
    //   967: astore #6
    //   969: aload #9
    //   971: aload #6
    //   973: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   976: pop
    //   977: aload #9
    //   979: ldc_w ' Developers at Krosbits, I found some bugs while using Musicolet. It is as below... \\n\\n[Describe the bug or crash here. Do not remove debug file from attachment.]\\n\\n'
    //   982: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: pop
    //   986: aload #8
    //   988: aload #9
    //   990: invokevirtual toString : ()Ljava/lang/String;
    //   993: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   996: pop
    //   997: aload #8
    //   999: invokevirtual toString : ()Ljava/lang/String;
    //   1002: astore #6
    //   1004: new java/lang/StringBuilder
    //   1007: astore #8
    //   1009: aload #8
    //   1011: invokespecial <init> : ()V
    //   1014: aload #8
    //   1016: ldc_w 'Musicolet | Bug report'
    //   1019: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1022: pop
    //   1023: aload #8
    //   1025: aload_1
    //   1026: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1029: pop
    //   1030: aload_0
    //   1031: aload #8
    //   1033: invokevirtual toString : ()Ljava/lang/String;
    //   1036: aload #6
    //   1038: aload #7
    //   1040: ldc_w 'Send email via'
    //   1043: invokestatic n0 : (Lin/krosbits/musicolet/AboutActivity;Ljava/lang/String;Ljava/lang/String;Lv00;Ljava/lang/String;)V
    //   1046: aload_0
    //   1047: getfield R : Lss0;
    //   1050: invokevirtual show : ()V
    //   1053: getstatic in/krosbits/musicolet/MyApplication.r : Ljava/lang/String;
    //   1056: invokestatic i : (Ljava/lang/String;)Ljava/util/Locale;
    //   1059: pop
    //   1060: aload_0
    //   1061: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1064: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   1067: getfield locale : Ljava/util/Locale;
    //   1070: astore_1
    //   1071: goto -> 1086
    //   1074: astore_1
    //   1075: aload_1
    //   1076: invokevirtual toString : ()Ljava/lang/String;
    //   1079: invokestatic v : (Ljava/lang/String;)V
    //   1082: aload_1
    //   1083: invokevirtual printStackTrace : ()V
    //   1086: return
    // Exception table:
    //   from	to	target	type
    //   0	15	1074	java/io/IOException
    //   15	35	70	finally
    //   38	64	70	finally
    //   71	75	1074	java/io/IOException
    //   77	118	1074	java/io/IOException
    //   130	180	1074	java/io/IOException
    //   183	284	1074	java/io/IOException
    //   289	377	1074	java/io/IOException
    //   382	389	1074	java/io/IOException
    //   398	461	1074	java/io/IOException
    //   461	467	1074	java/io/IOException
    //   472	484	1074	java/io/IOException
    //   487	491	1074	java/io/IOException
    //   491	615	1074	java/io/IOException
    //   631	763	1074	java/io/IOException
    //   763	769	1074	java/io/IOException
    //   773	784	1074	java/io/IOException
    //   787	891	1074	java/io/IOException
    //   891	923	930	android/content/pm/PackageManager$NameNotFoundException
    //   891	923	1074	java/io/IOException
    //   931	935	1074	java/io/IOException
    //   939	958	1074	java/io/IOException
    //   958	964	1074	java/io/IOException
    //   969	1071	1074	java/io/IOException
  }
  
  public void sendFeedback(View paramView) {
    String str1;
    StringBuilder stringBuilder1 = new StringBuilder("Device's Detail:\n");
    stringBuilder1.append(Build.MANUFACTURER);
    stringBuilder1.append(">");
    stringBuilder1.append(Build.DEVICE);
    stringBuilder1.append(">");
    stringBuilder1.append(Build.MODEL);
    stringBuilder1.append("\nANDRD_");
    stringBuilder1.append(Build.VERSION.SDK_INT);
    stringBuilder1.append("\nApp detail: Musicolet");
    String str2 = "";
    try {
      PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
      stringBuilder1.append(" ");
      stringBuilder1.append(packageInfo.versionName);
      str1 = " | b530";
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      nameNotFoundException.printStackTrace();
      str1 = "";
    } 
    StringBuilder stringBuilder2 = new StringBuilder("\n\nHi");
    if (MyApplication.l())
      str2 = "!"; 
    stringBuilder2.append(str2);
    stringBuilder2.append(" Developers at Krosbits,\n\t");
    stringBuilder1.append(stringBuilder2.toString());
    str2 = stringBuilder1.toString();
    n0(this, "Musicolet | Feedback".concat(str1), str2, null, "Send feedback via");
    this.R.show();
    z51.i(MyApplication.r);
    Locale locale = (getResources().getConfiguration()).locale;
  }
  
  public void shareApp(View paramView) {
    Intent intent = (new Intent("android.intent.action.SEND")).putExtra("android.intent.extra.TEXT", "krosbits.in/musicolet");
    intent.putExtra("android.intent.extra.SUBJECT", "Musicolet - Music player");
    intent.setType("text/plain");
    startActivity(Intent.createChooser(intent, "Share app link via..."));
  }
  
  public void translateProgram(View paramView) {
    ms0 ms0 = new ms0((Context)this);
    ms0.q(2131887493);
    int i = m92.h[6];
    Context context = ms0.b;
    ms0.z = dd1.w(context, i);
    ms0.d((CharSequence)Html.fromHtml(String.format(context.getString(2131887521), new Object[] { "translate.krosbits@gmail.com" })));
    ms0.n(2131887030);
    ms0.p();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\AboutActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */