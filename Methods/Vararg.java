import java.util.Arrays;

public class Vararg{
	public static void main(String[] args){
		vararg(10, 11, 12, 13, 14);
	}
	
	static void vararg(int ...va){
		System.out.println(Arrays.toString(va));
	}
}
