
public class Example {

  public static void main(String[] args) {
    for (int i = 1; i<=5; i++) {
      System.out.println(i + ": executed before continue");
      if (i > 2)
          continue;
        System.out.println("  " + i + ": executed only 2 times");
    }
  }
}
