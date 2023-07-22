package gayathri;

public class Power {
	public static int power(int A, int B, int C) {
        if (B == 0) {
            return 1 % C; 
        }

        long result;

        if (B % 2 == 0) {
           
            long temp = power(A, B / 2, C);
            result = (temp * temp) % C;
        }
        else {
            
            long temp = power(A, B - 1, C);
            result = (temp * A) % C;
        }

        return (int) ((result + C) % C); 
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 3;
        int result = power(A, B, C);
        System.out.println(result); 

        A = 3;
        B = 3;
        C = 1;
        result = power(A, B, C);
        System.out.println(result); 
    }

}
