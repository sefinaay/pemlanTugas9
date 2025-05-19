//untuk mempresentasikan file atau direktori dalam sistem file 
import java.io.File;

public class NamaFile {

    //program yang akan dieksekusi pertama kali
    public static void main(String[] args) {

        //membuat objek file yang mempresentasikan direktori saar ini, "." menunjukan ke direktori saat ini
        var dir = new File(".");

        //memeriksa apakah objek file tersebut ada dan merupakan direktori, jika iya maka akan menampilkan daftar file
        if(dir.exists() && dir.isDirectory()){
            System.out.println("Daftar file di direktori saat ini: " + dir.getAbsolutePath() + ":");

            //mengambil daftar nama file dan folder dakam direktori sebagai array string 
            String[] list = dir.list();
            //melakukan perulangan untuk menampilkan nama file
            for(String fileName : list){
                System.out.println(fileName);
            }
        //jika direktori tidak ada maka akan menampilkan pesan kesalahan 
        }else{
            System.out.println("Direktori tidak ditemukan!");
        }

    }

}
