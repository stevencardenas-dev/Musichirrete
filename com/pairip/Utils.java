package com.pairip;

import java.util.concurrent.ThreadFactory;

public final class Utils {
  public static ThreadFactory createThreadFactory(final boolean isDaemon, final int priority) {
    return new ThreadFactory() {
        final boolean val$isDaemon;
        
        final int val$priority;
        
        public Thread newThread(Runnable param1Runnable) {
          param1Runnable = new Thread(param1Runnable);
          param1Runnable.setDaemon(isDaemon);
          param1Runnable.setPriority(priority);
          return (Thread)param1Runnable;
        }
      };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pairip\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */