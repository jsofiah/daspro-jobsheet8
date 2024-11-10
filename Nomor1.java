import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner no1 = new Scanner(System.in);
        int i, n, j;
        System.out.print("Masukkan Nilai N (min 3): ");
        n = no1.nextInt();

        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(n);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
