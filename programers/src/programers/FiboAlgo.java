package programers;

public class FiboAlgo {

	public static void main(String[] args) {

		String str1 = "str1";
		String str2 = "str2";
		String str3 = new String("str2");
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : "+ str2);
		System.out.println("str1 : "+ System.identityHashCode(str1));
		System.out.println("str2 : "+ System.identityHashCode(str2));
		System.out.println("str2 : "+ System.identityHashCode(str3));
		System.out.println("str1 : "+ str1.hashCode());
		System.out.println("str2 : "+ str2.hashCode());
		System.out.println("str3 : "+ str3.hashCode());
		
		System.out.println(str2 == str3);
		
		
	}

	public static int ans(int n, int m) {
		int answer = 0;

		for (int i = n; i <= m; i++) {
			answer += Fibo(i);
		}

		return answer;
	}

	public static int Fibo(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}

		return Fibo(n - 1) + Fibo(n - 2);

	}
}
