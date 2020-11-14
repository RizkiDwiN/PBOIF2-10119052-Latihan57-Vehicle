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
public class Skateboard extends Vehicle{
  private double myboardlength;

    public void skateboard() {
        System.out.println("Skateboard");
        System.out.println("Brand : "+getMybrand());
        System.out.println("Model : "+getMymodel());
        System.out.println("Panjangnya Board : "+myboardlength);
    }

    public double getMyboardlength() {
        return myboardlength;
    }

    public void setMyboardlength(double myboardlength) {
        this.myboardlength = myboardlength;
    }  
}
