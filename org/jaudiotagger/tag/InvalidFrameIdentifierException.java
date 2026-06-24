package org.jaudiotagger.tag;

public class InvalidFrameIdentifierException extends InvalidFrameException {
  private static final long serialVersionUID = 6459527941265009134L;
  
  public InvalidFrameIdentifierException() {}
  
  public InvalidFrameIdentifierException(String paramString) {
    super(paramString);
  }
  
  public InvalidFrameIdentifierException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public InvalidFrameIdentifierException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\InvalidFrameIdentifierException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */