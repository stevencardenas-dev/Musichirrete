package me.zhanghai.android.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

class Interpolators {
  public static class INDETERMINATE_HORIZONTAL_RECT1_SCALE_X {
    public static final Interpolator INSTANCE;
    
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X;
    
    static {
      Path path = new Path();
      PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X = path;
      path.moveTo(0.0F, 0.0F);
      path.lineTo(0.3665F, 0.0F);
      path.cubicTo(0.4725262F, 0.06240991F, 0.6154161F, 0.5F, 0.68325F, 0.5F);
      path.cubicTo(0.7547506F, 0.5F, 0.7572583F, 0.8145101F, 1.0F, 1.0F);
      INSTANCE = (Interpolator)new PathInterpolator(path);
    }
  }
  
  public static class INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X {
    public static final Interpolator INSTANCE;
    
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X;
    
    static {
      Path path = new Path();
      PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X = path;
      path.moveTo(0.0F, 0.0F);
      path.lineTo(0.2F, 0.0F);
      path.cubicTo(0.39583334F, 0.0F, 0.47484508F, 0.20679761F, 0.59166664F, 0.41708294F);
      path.cubicTo(0.715161F, 0.6393796F, 0.81625F, 0.9745569F, 1.0F, 1.0F);
      INSTANCE = (Interpolator)new PathInterpolator(path);
    }
  }
  
  public static class INDETERMINATE_HORIZONTAL_RECT2_SCALE_X {
    public static final Interpolator INSTANCE;
    
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X;
    
    static {
      Path path = new Path();
      PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X = path;
      path.moveTo(0.0F, 0.0F);
      path.cubicTo(0.06834272F, 0.019925667F, 0.19220331F, 0.15855429F, 0.33333334F, 0.3492616F);
      path.cubicTo(0.38410434F, 0.41477913F, 0.5494579F, 0.6813603F, 0.6666667F, 0.68279964F);
      path.cubicTo(0.75258625F, 0.6817962F, 0.73725396F, 0.8788962F, 1.0F, 1.0F);
      INSTANCE = (Interpolator)new PathInterpolator(path);
    }
  }
  
  public static class INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X {
    public static final Interpolator INSTANCE;
    
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X;
    
    static {
      Path path = new Path();
      PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X = path;
      path.moveTo(0.0F, 0.0F);
      path.cubicTo(0.0375F, 0.0F, 0.12876461F, 0.0895381F, 0.25F, 0.21855351F);
      path.cubicTo(0.32241032F, 0.2956106F, 0.43666667F, 0.41759142F, 0.48333332F, 0.48982617F);
      path.cubicTo(0.69F, 0.80972296F, 0.79333335F, 0.95001614F, 1.0F, 1.0F);
      INSTANCE = (Interpolator)new PathInterpolator(path);
    }
  }
  
  public static class LINEAR {
    public static final Interpolator INSTANCE = (Interpolator)new LinearInterpolator();
  }
  
  public static class TRIM_PATH_END {
    public static final Interpolator INSTANCE;
    
    private static final Path PATH_TRIM_PATH_END;
    
    static {
      Path path = new Path();
      PATH_TRIM_PATH_END = path;
      path.cubicTo(0.2F, 0.0F, 0.1F, 1.0F, 0.5F, 1.0F);
      path.lineTo(1.0F, 1.0F);
      INSTANCE = (Interpolator)new PathInterpolator(path);
    }
  }
  
  public static class TRIM_PATH_START {
    public static final Interpolator INSTANCE;
    
    private static final Path PATH_TRIM_PATH_START;
    
    static {
      Path path = new Path();
      PATH_TRIM_PATH_START = path;
      path.lineTo(0.5F, 0.0F);
      path.cubicTo(0.7F, 0.0F, 0.6F, 1.0F, 1.0F, 1.0F);
      INSTANCE = (Interpolator)new PathInterpolator(path);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\Interpolators.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */