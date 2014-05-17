import java.util.Scanner;

public class Main{
  public static int[] gcd(int x, int y){
    while((r = x % y) != 0)  {
      x = y;
      x = r;
    }
    return y;
  }

  public static int[] lcm(int x, int y){
    while((r = x % y) != 0)  {
      x = y;
      x = r;
    }
    return y;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(s.hasNextLine()){
      int a = s.nextInt();
      int b = s.nextInt();
      int[] answer = GcdLcm(a,b);
      System.out.println(answer[0]);
      System.out.println(answer[1]);
    }
  }
}
