package org.jaudiotagger.tag;

public class InvalidDataTypeException extends InvalidTagException {
  private static final long serialVersionUID = -57193274023749388L;
  
  public InvalidDataTypeException() {}
  
  public InvalidDataTypeException(String paramString) {
    super(paramString);
  }
  
  public InvalidDataTypeException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public InvalidDataTypeException(Throwable paramThrowable) {
    super(paramThrowable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\InvalidDataTypeException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */