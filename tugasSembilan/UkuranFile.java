//untuk mempresentasikan file atau direktori dalam sistem file 
import java.io.File;

public class UkuranFile {

    //program yang akan dieksekusi pertama kali
    public static void main(String[] args) {

        //membuat objek file yang mempresentasikan file bernama "test.txt"
        var file = new File("test.txt");

        //mengecek apakah file test.txt benar-benar ada 
        if(file.exists()) {
            long sizeInBytes = file.length(); //mengambil ukuran file dalam byte, menggunakan length()
            double sizeInKb = sizeInBytes / 1024.0; //mengonverensi ukuran dari byte ke kilobyte, dibagi 1024  karena 1 Kb = 1024 byte 
            double sizeInMb = sizeInKb / 1024.0; //mengonverensi ukuran dari kilobyte ke megabyte, dibagi 1024 karena 1 Mb = 1024 Kb

            //menentukan satuan mana yang akan ditampilkan, jika ukuran file lebih dari 1 Mb maka ditampilkan dalam satuan Mb, jika tidak maka ditampilkan dalam satuan Kb
            if(sizeInMb >= 1){
                System.out.printf("Ukuran file: %.2f MB\n", sizeInMb);
            }else{
                System.out.printf("Ukuran file: %.2f KB\n", sizeInKb);
            }

        //jika file test.txt tidak ada maka akan menampilkan pesan kesalahan 
        }else{
            System.out.println("File tidak ditemukan!");
        }

    }

}
