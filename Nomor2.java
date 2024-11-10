import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner porseni = new Scanner(System.in);
        int jmlPoliteknik, i, j;
        String data = "";
        String namaPoliteknik, namaAtlet;

        System.out.println("=================================================================");
        System.out.println("|                       PENDAFTARAN PORSENI                     |");
        System.out.println("=================================================================");
        System.out.println("DAFTAR CABANG OLAHRAGA: ");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola voli");
        System.out.println("=================================================================");
        System.out.print("Jumlah Politeknik yang mendaftar: ");
        jmlPoliteknik = porseni.nextInt();
        porseni.nextLine(); 

        for(i = 1; i <= jmlPoliteknik; i++){
            System.out.println("=================================================================");
            System.out.print("Masukkan nama Politeknik ke-" + i + ": ");
            namaPoliteknik = porseni.nextLine();

            data += "\n================= Data Atlet Politeknik " + namaPoliteknik + " ================\n";

            data += "=================================================================\n";
            data += "Cabang olahraga: Badminton\n";
            for(j = 1; j <= 5; j++){
                System.out.print("Nama atlet ke-" + j + " untuk Badminton: ");
                namaAtlet = porseni.nextLine();
                data += "Atlet ke-" + j + ": " + namaAtlet + "\n";
            }

            data += "=================================================================\n";
            data += "Cabang olahraga: Tenis Meja\n";
            for(j = 1; j <= 5; j++){
                System.out.print("Nama atlet ke-" + j + " untuk Tenis Meja: ");
                namaAtlet = porseni.nextLine();
                data += "Atlet ke-" + j + ": " + namaAtlet + "\n";
            }

            data += "=================================================================\n";
            data += "Cabang olahraga: Basket\n";
            for(j = 1; j <= 5; j++){
                System.out.print("Nama atlet ke-" + j + " untuk Basket: ");
                namaAtlet = porseni.nextLine();
                data += "Atlet ke-" + j + ": " + namaAtlet + "\n";
            }

            data += "=================================================================\n";
            data += "Cabang olahraga: Bola Voli\n";
            for(j = 1; j <= 5; j++){
                System.out.print("Nama atlet ke-" + j + " untuk Bola Voli: ");
                namaAtlet = porseni.nextLine();
                data += "Atlet ke-" + j + ": " + namaAtlet + "\n";
            }
        }

        System.out.println("=================================================================");
        System.out.println("|                      Data Atlet Porseni                       |");
        System.out.println("=================================================================");
        System.out.println(data);

        // porseni.close();
    }
}
