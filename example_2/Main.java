public class Main {
  public static void main(String[] args) {
    Thread.currentThread().getContextClassLoader().setDefaultAssertionStatus(true);
    assert 1 == 2;
  }
}
