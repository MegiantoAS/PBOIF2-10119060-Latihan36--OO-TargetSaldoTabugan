/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target;

/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Target Saldo Tabungan
 */
public class target {
    public double saldoAwal = 3500000;
    public double bunga = 0.08;
    public double saldoTarget = 6000000;
    
    public void hitungSaldo(double saldo, double saldoAkhir){
        for (int i = 1; saldoAkhir <= saldoTarget; i++){
            saldo = saldoAwal * bunga;
            saldoAkhir = saldo + saldoAwal;
            System.out.printf("Saldo di bulan ke-"+ i + " Rp.%,1.0f%n", saldoAkhir);
            saldoAwal += saldo;
            
        }
    }
    
}
