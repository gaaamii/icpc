import java.util.Scanner;
import java.util.Arrays;

public class Triangle{

  public static int squareInt(int x){
    return x * x;
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n =  s.nextInt();
    int[] lengths = new int[3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++){
        lengths[j] = s.nextInt();
      }
      Arrays.sort(lengths);
      if (squareInt(lengths[0]) + squareInt(lengths[1]) == squareInt(lengths[2])){
        System.out.println("YES");
      } else{
        System.out.println("NO");
      }
    }
  }

}
