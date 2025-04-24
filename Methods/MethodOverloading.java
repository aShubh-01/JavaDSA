public class MethodOverloading{
	public static void main(String[] args){
		print(10, 30);
	}

	static void print(int a){
		System.out.println(a);
	}

	static void print(int a, int b){
		System.out.println(a+b);
	}
}
