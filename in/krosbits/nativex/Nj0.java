package in.krosbits.nativex;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;

public class Nj0 {
  public static String a0(File paramFile, String paramString1, String paramString2, String paramString3) {
    try {
      paramFile.mkdirs();
      File file = new File();
      this(paramFile, paramString1);
      if (!file.exists())
        file.createNewFile(); 
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      CipherOutputStream cipherOutputStream = new CipherOutputStream();
      byte[] arrayOfByte = paramString2.getBytes();
      SecretKeySpec secretKeySpec = new SecretKeySpec();
      this(arrayOfByte, "Blowfish");
      Cipher cipher = Cipher.getInstance("Blowfish");
      cipher.init(1, secretKeySpec);
      this(fileOutputStream, cipher);
      cipherOutputStream.write(paramString3.getBytes());
      return file.getAbsolutePath();
    } finally {
      paramFile = null;
      paramFile.printStackTrace();
    } 
  }
  
  public static String a1(File paramFile, String paramString1, String paramString2) {
    try {
      File file = new File();
      this(paramFile, paramString1);
      if (!file.exists())
        return null; 
      FileInputStream fileInputStream = new FileInputStream();
      this(file);
      CipherInputStream cipherInputStream = new CipherInputStream();
      byte[] arrayOfByte2 = paramString2.getBytes();
      SecretKeySpec secretKeySpec = new SecretKeySpec();
      this(arrayOfByte2, "Blowfish");
      Cipher cipher = Cipher.getInstance("Blowfish");
      cipher.init(2, secretKeySpec);
      this(fileInputStream, cipher);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      byte[] arrayOfByte1 = new byte[2048];
      while (true) {
        int i = cipherInputStream.read(arrayOfByte1);
        if (i >= 0) {
          byteArrayOutputStream.write(arrayOfByte1, 0, i);
          continue;
        } 
        String str = new String();
        this(byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        return str;
      } 
    } finally {
      paramFile = null;
      paramFile.printStackTrace();
    } 
  }
  
  public static boolean a2(String paramString1, String paramString2, String paramString3) {
    return false;
  }
  
  public static void a3(File paramFile, String paramString) {
    try {
      File file = new File();
      return;
    } finally {
      paramFile = null;
      paramFile.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\nativex\Nj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */