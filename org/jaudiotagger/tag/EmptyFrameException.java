package org.jaudiotagger.tag;

public class EmptyFrameException extends InvalidFrameException {
  private static final long serialVersionUID = 5761623018903709948L;
  
  public EmptyFrameException() {}
  
  public EmptyFrameException(String paramString) {
    super(paramString);
  }
  
  public EmptyFrameException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public EmptyFrameException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\EmptyFrameException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */