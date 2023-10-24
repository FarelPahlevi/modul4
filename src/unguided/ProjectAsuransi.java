package unguided;

public class ProjectAsuransi {
    public static void main(String[] args) {

        Satpam S = new Satpam("FAREL", "123", "Jl. TELUK", 2000, 300000, 5);
        Sales T = new Sales("PAHLEVI", "777", "Jl. BERKOH", 2006, 500000, 10);
        Manajer M = new Manajer("AZHAR", "017", "Jl. WIRADADI", 1999, 1500000, "Keuangan");

        System.out.println("\n\n==DISPLAY DATA PEGAWAI==\n");
        S.cetakSatpam();
        T.cetakSales();
        M.cetakManajer();
    }
}
