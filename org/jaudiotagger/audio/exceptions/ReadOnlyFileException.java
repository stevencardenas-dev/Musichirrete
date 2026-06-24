package org.jaudiotagger.audio.exceptions;

public class ReadOnlyFileException extends Exception {
  private static final long serialVersionUID = 3390133566776688874L;
  
  public ReadOnlyFileException() {}
  
  public ReadOnlyFileException(String paramString) {
    super(paramString);
  }
  
  public ReadOnlyFileException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public ReadOnlyFileException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\exceptions\ReadOnlyFileException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */