package org.jaudiotagger.tag;

public class InvalidTagException extends TagException {
  private static final long serialVersionUID = -8871114835151336156L;
  
  public InvalidTagException() {}
  
  public InvalidTagException(String paramString) {
    super(paramString);
  }
  
  public InvalidTagException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public InvalidTagException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\InvalidTagException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */