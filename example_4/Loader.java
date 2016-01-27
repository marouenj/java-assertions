import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Loader {
  public static void main(String[] args) {
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    cl.setDefaultAssertionStatus(true);

    Method main = null;
    try {
      main = cl.loadClass("Main").getMethod("main", String[].class);
    } catch (ClassNotFoundException e1) {
      e1.printStackTrace();
    } catch (NoSuchMethodException e2) {
      e2.printStackTrace();
    }

    try {
      main.invoke(null, (Object) new String[0]);
    } catch (IllegalAccessException e1) {
      e1.printStackTrace();
    } catch (InvocationTargetException e) {
      if (e.getCause() instanceof AssertionError) {
        e.getCause().printStackTrace();
      } else {
        e.printStackTrace();
      }
    }
  }
}
