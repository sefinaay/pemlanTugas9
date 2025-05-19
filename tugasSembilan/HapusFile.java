//untuk mempresentasikan file atau direktori dalam sistem file 
import java.io.File;

public class HapusFile {

    //program yang akan dieksekusi pertama kali
    public static void main(String[] args) {

        //membuat objek file yang mempresentasikan direktori bernama "ujiCoba"
        var dir = new File("ujiCoba");

        //mengecek apakah objek dir benar-benar ada dan merupakan direktori 
        if(dir.exists() && dir.isDirectory()){
            //mengambil daftar file  dan folder di dalam direktori ujiCoba dalam bentuk array objek File
            File[] files = dir.listFiles();
            //memastikan bahwa isi direktori tidak kosong atau null
            if(files != null){
                //melakukan perulangan untuk setiap file atau folder dalam direktori ujiCoba 
                for(File file : files){
                    //memeriksa apakah objek file tersebut adalah file biasa 
                    if(file.isFile()){
                        //menghapus file tersebut dari sistem file 
                        file.delete();
                    }
                }
            }

            //menghapus direktori ujiCoba setelah semua file di dalamnya dihapus, setelah itu menampilkan pesan berhasil atau gagal
            boolean result = dir.delete();
            System.out.println(result ? "File berhasil dihapus" : "File gagal dihapus");

        //jika direktori tidak ada maka akan menampilkan pesan kesalahan 
        }else{
            System.out.println("File tidak ditemukan!");
        }
    }

}
