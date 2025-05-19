//untuk mengimpor kelas BufferedReader untuk membaca teks dari file baris per baris 
import java.io.BufferedReader;
//untuk mengimpor kelas fileReader yang digunakan sebagai sumber untuk BufferedReader, untuk membaca file per karakter 
import java.io.FileReader;
//untuk mengimpor kelas IOException untuk menangani error terkait I/O
import java.io.IOException;

public class BacaFileTanpaPengecekan {

    //program yang akan dieksekusi pertama kali
    public static void main(String[] args) {
        String namaFile = "file_tidak_ada.txt";
        
        //mencoba untuk membuka dan membaca file 
        try {
            //membuat objek BufferedReader untuk membaca file 
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));
            String line;

            //membaca setiap baris dalam file sampai akhir file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //menutup BufferedReader setelah selesai membaca file
            reader.close();

            //jika file tidak ada maka akan menampilkan pesan kesalahan
        } catch (IOException e) {
            System.err.println("Terjadi error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
