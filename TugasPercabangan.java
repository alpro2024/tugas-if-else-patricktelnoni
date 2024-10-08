import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
        int lamaKerja, jumlahJamKerja;
        double totalGaji, honorLembur;
        int gajiPokok = 5000000;

        Scanner scanner = new Scanner(System.in);
        lamaKerja       = scanner.nextInt();
        jumlahJamKerja  = scanner.nextInt();

        /* 
            Tuliskan proses perhitungan gaji di sini
        */

         if(lamaKerja < 5){
           totalGaji = gajiPokok;
        }else if (lamaKerja >= 5 && lamaKerja < 10){
           totalGaji = gajiPokok + (gajiPokok * 0.05);
        }
        else{
            totalGaji = gajiPokok + (gajiPokok * 0.1);
        }

        if(jumlahJamKerja > 40){       
            int jumlahJamLembur = jumlahJamKerja - 40;
            honorLembur  = jumlahJamLembur * 50000;
        }
        else{
            honorLembur = 0;
        }
        totalGaji += honorLembur;
       
        
        System.out.println(totalGaji);
    }
}
