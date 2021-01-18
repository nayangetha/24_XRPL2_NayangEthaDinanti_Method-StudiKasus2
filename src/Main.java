
public class Main {

    public static void main(String[] args) {
        
        System.out.println(" Selamat Datang di Perpustakaan");
        System.out.println("=================================");
        
        Void tampil = new Void();
        
        System.out.println(tampil.perintah());
        
        tampil.user();
        
        System.out.println("Biaya Peminjaman : Rp."+tampil.total());
        
        System.out.println("=================================");
        
        System.out.println("Nota Peminjaman Buku Perpustakaan");
        System.out.println("");
        
        System.out.println("Nama = "+tampil.nama());
        System.out.println("Kelas = "+tampil.kelas());
        System.out.println("Judul Buku = "+tampil.judul());
        System.out.println("Waktu Peminjaman = "+tampil.tanggal());
        System.out.println("Lama Peminjaman = "+tampil.hari()+" hari");
        System.out.println("Tarif Peminjaman / buku = Rp."+tampil.biaya()+" /hari");
        System.out.println("Total Biaya Peminjaman selama "+tampil.hari()+" hari adalah Rp."+tampil.total());
        
        System.out.println("");
        System.out.println(tampil.reminder());
    }
    
}
