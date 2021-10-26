import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N > 1 && N < 13) {
            int fatorial = N;
            for (int i = 1; i < N; i++) {
                fatorial = fatorial * (N - i);
            }
            System.out.println(fatorial);
        } else if(N == 1) {
            System.out.println(N);
        } else {
            System.out.println("Valor invalido!");
        }
    }
}