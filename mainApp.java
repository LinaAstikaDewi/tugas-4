package Tugas4;

public class mainApp {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Mobil mobil= new Mobil();
        Kreta_Api kreta_api= new Kreta_Api();
        Pesawat pesawat= new Pesawat();

        kendaraan.bahan_bakar();

        kendaraan= mobil;
        kendaraan.bahan_bakar();

        kendaraan= kreta_api;
        kendaraan.bahan_bakar();

        kendaraan= pesawat;
        kendaraan.bahan_bakar();
    }
}
