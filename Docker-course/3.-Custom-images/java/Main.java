import java.util.Base64;

public class Main {
  public static void main(String[] args) {
    String original = "Hola mundo";
    String encoded = Base64.getMimeEncoder().encodeToString(original.getBytes());
    System.out.println("String Original: " + original);
    System.out.println("Encoded string: " + encoded);
  }
}