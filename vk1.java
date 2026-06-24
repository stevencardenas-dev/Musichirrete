import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface vk1 {
  String[] alternate() default {};
  
  String value();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */