import java.util.Scanner;
import java.util.Arrays;

public class Triangle{
  private static int squareInt(int x) {
    return x * x;
  }
  private static boolean isChokkaku(int[] lines) {
    Arrays.sort(lines);
    if (squareInt(lines[0]) + squareInt(lines[1]) == squareInt(lines[2])) {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n =  s.nextInt();
    int[] lines = new int[3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++){
        lines[j] = s.nextInt();
      }
      if (isChokkaku(lines)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
