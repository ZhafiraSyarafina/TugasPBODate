import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Kelas utama yang berisi metode main
public class Minimarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
       
    do{
        try{
        // Membuat objek SimpleDateFormat untuk format tanggal dan waktu
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss z");

        // Mendapatkan tanggal dan waktu saat ini
        Date currentDate = new Date();

        // Menampilkan informasi header
        System.out.println("MINIMARKET");
        System.out.println("Tanggal : " + dateFormat.format(currentDate));
        System.out.println("Waktu   : " + timeFormat.format(currentDate));
        System.out.println("========================");

        // Input data pelanggan
        DataPelanggan dataPelanggan = inputDataPelanggan();

        // Input data pembelian barang
        DataPembelian dataPembelian = inputDataPembelian();

        // Menampilkan semua data yang telah diinput
        System.out.println(dataPelanggan.toString());
        System.out.println(dataPembelian.toString());

        // Menampilkan kasir (sebagai contoh, kita masukkan kasir "John Doe")
        System.out.println("Kasir    : Dea");
    
        inputValid = true;
    } catch (Exception e) {
    System.out.println("Terjadi kesalahan       : " + e.getMessage() + "\n");
    scanner.nextLine(); // Membersihkan newline 
    }
} while (!inputValid);

scanner.close(); // Menutup scanner apabila telah benar atau valid
}

    // Metode untuk input data pelanggan
    private static DataPelanggan inputDataPelanggan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Pelanggan : ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("No. HP         : ");
        String noHP = scanner.nextLine();

        System.out.print("Alamat         : ");
        String alamat = scanner.nextLine();

        return new DataPelanggan(namaPelanggan, noHP, alamat);
    }

    // Metode untuk input data pembelian
    private static DataPembelian inputDataPembelian() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode Barang    : ");
        String kodeBarang = scanner.nextLine();

        System.out.print("Nama Barang    : ");
        String namaBarang = scanner.nextLine();

        System.out.print("Harga Barang   : ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Jumlah Beli    : ");
        int jumlahBeli = scanner.nextInt();

        return new DataPembelian(kodeBarang, namaBarang, hargaBarang, jumlahBeli);
    }
}

