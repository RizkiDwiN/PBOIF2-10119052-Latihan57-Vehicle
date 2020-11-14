package pboif2.pkg10119052.latihan57.vehicle;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * vehicle dengan metode polymorphism
 * 
 */
public class Bicycle extends Vehicle{
    private int mygearcount;

    public void bicycle() {
        System.out.println("Bicycle");
        System.out.println("Brand : "+getMybrand());
        System.out.println("Model : "+getMymodel());
        System.out.println("Jumlah Gear : "+mygearcount);
    }

    public int getMygearcount() {
        
        return mygearcount;
    }

    public void setMygearcount(int mygearcount) {
        this.mygearcount = mygearcount;
    }
}
