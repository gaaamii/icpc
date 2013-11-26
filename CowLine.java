public class CowLine{
	// 入力
  static String inputString = "ACDBCB";
  static int N = inputString.length();
	static char S[] = inputString.toCharArray();

	public static void main(String[] args){
		// S[a], S[a + 1], .....S[b]が残っている文字列
		int head = 0, tail = N -1;
		while (head <= tail){
			// 左からみた場合と右から見た場合を比較
			Boolean left = false;
			for (int i = 0; head + i <= tail; i++){
				int head_var = head + i;
				int tail_var = tail - i;

				if(S[head_var] < S[tail_var]){
					left = true;
					break;
				}else if(S[head_var] > S[tail_var]){
					left = false;
					break;
				}
			}
			if (left) System.out.println(S[head++]);
			else System.out.println(S[tail--]);
  	}
		System.out.println();
	}
}
