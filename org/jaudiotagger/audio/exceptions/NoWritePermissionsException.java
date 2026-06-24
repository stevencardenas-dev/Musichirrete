package org.jaudiotagger.audio.exceptions;

public class NoWritePermissionsException extends CannotWriteException {
  private static final long serialVersionUID = -156467854598317547L;
  
  public NoWritePermissionsException() {}
  
  public NoWritePermissionsException(String paramString) {
    super(paramString);
  }
  
  public NoWritePermissionsException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public NoWritePermissionsException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\exceptions\NoWritePermissionsException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */