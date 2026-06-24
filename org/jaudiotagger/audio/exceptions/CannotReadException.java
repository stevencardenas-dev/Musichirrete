package org.jaudiotagger.audio.exceptions;

public class CannotReadException extends Exception {
  private static final long serialVersionUID = 8012136673806032717L;
  
  public CannotReadException() {}
  
  public CannotReadException(String paramString) {
    super(paramString);
  }
  
  public CannotReadException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public CannotReadException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\exceptions\CannotReadException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */