

public class calculator {
	public static int add(int a, int b){
		int Sum =0;
	    Sum = a+b;
	    return Sum;
	  }
	public static int sub(int a, int b){
		int dif =0;
	    dif = a-b;
	    return dif;
	  }
	public static int prod(int a, int b){
		int mul =1;
	    mul = a*b;
	    return mul;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(3,5));
		System.out.println(sub(30,5));
		System.out.println(prod(30,5));
	}

}
