public class Loader {
  public static void main(String[] args) {
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    cl.setDefaultAssertionStatus(true);

    Main main = null;
    try {
      main = (Main) cl.loadClass("Main").newInstance();
    } catch (ClassNotFoundException e1) {
      e1.printStackTrace();
    } catch (InstantiationException e2) {
      e2.printStackTrace();
    } catch (IllegalAccessException e3) {
      e3.printStackTrace();
    }

    main.main(new String[0]);
  }
}
