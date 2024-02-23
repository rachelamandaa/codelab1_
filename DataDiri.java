import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");

        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate tanggalSekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, tanggalSekarang);
        int umurTahun = selisih.getYears();
        int umurBulan = selisih.getMonths();
        int umurHari = selisih.getDays();

        System.out.println("// output");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur Anda : " + umurTahun + " tahun " + umurBulan + " bulan" );

        scanner.close();
            }
    }

