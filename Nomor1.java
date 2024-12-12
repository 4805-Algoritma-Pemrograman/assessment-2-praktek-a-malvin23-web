import java.util.Scanner;

public class Nomor1 {
     public static void tampilkanBilanganGanjil(int n) {
        System.out.println("Bilangan ganjil dari 0 hingga " + n + " adalah:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan n: ");
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        tampilkanBilanganGanjil(n);
        
        input.close();
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
