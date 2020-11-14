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
public class PBOIF210119052Latihan57Vehicle {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMybrand("Trek Bike");
        bicycle.setMymodel("7.4FX");
        bicycle.setMygearcount((int) 23);
        bicycle.bicycle();
        System.out.println("");
        Skateboard skateboard = new Skateboard();
        skateboard.setMybrand("Ally Skate");
        skateboard.setMymodel("rocket");
        skateboard.setMyboardlength((double)54.5);
        skateboard.skateboard(); 
    }
    
}
