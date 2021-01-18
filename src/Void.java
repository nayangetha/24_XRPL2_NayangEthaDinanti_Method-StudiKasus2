import java.util.Scanner;

public class Void {
    
        String nama,kelas,judul,tanggal;
        int hari,total;
        int biaya = 2000;
    
    String perintah = "Isi Data Dibawah Ini Dengan Benar";
    String perintah(){
        return perintah;
    }
    void user(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        
        System.out.println("Nama : ");
        nama = input.nextLine();
        
        System.out.println("Kelas :");
        kelas = input.nextLine();
        
        System.out.println("Judul Buku Yang Dipinjam : ");
        judul = input.nextLine();
        
        System.out.println("Tanggal Peminjaman : ");
        tanggal = input.nextLine();
        
        System.out.println("Lama Peminjaman (jumlah hari) : ");
        hari = input.nextInt();
    }
    int total(){
        total = hari*biaya;
        return total;
    }
    String nama(){
        return nama;
    }
    String kelas(){
        return kelas;
    }
    String judul(){
        return judul;
    }
    String tanggal(){
        return tanggal;
    }
    int hari(){
        return hari;
    }
    int biaya(){
        return biaya;
    }
    String reminder = "Kembalikan Tetap Waktu!";
    String reminder(){
        return reminder;
    }
}
