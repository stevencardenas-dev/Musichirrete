package org.jaudiotagger.audio.exceptions;

public class NoReadPermissionsException extends CannotReadException {
  private static final long serialVersionUID = 1917828252842714301L;
  
  public NoReadPermissionsException() {}
  
  public NoReadPermissionsException(String paramString) {
    super(paramString);
  }
  
  public NoReadPermissionsException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public NoReadPermissionsException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\exceptions\NoReadPermissionsException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */