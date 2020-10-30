package if1.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan saldo tabungan
 *                     sampai mencapai target
 * 
 */

public class TargetSaldoTabungan {
    public static double bunga, jmlBunga;
    public static int targetSaldo, lamaBulan, saldoAwal;
    
    public static double hitungBunga(double bunga, int saldo) {
        jmlBunga = bunga * saldo;
        return jmlBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo) {
        lamaBulan = 1;
        while (saldo < targetSaldo) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+lamaBulan+" Rp.%d,%n",saldo);
            lamaBulan++;
        }
    }
    
    public static void main(String[] args) {
        tampilSaldo(0.08,3500000,6000000);
    }
}