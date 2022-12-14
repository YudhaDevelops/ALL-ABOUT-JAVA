package knn_csv;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class knn_csv {

    public static void main(String[] args) throws Exception {
        ArrayList<Daun> listDataDaun = new ArrayList<>();
        ArrayList<Includian>listInclu = new ArrayList<Includian>();
        ArrayList<Tebak>listTebak = new ArrayList<Tebak>();
        
        KNN data = new KNN();
//        data.BacaCsv("C:\\Users\\bimab\\OneDrive\\Documents\\data_csv.csv");
        listDataDaun = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive\\Documents\\data_csv.csv");
        for (Daun daun : listDataDaun) {
            System.out.println("Panjang : " + daun.getPanjang() + " Lebar : " + daun.getLebar() + " Label : " + daun.getLabel());
        }
        
        System.out.println("");
        //buat data uji
        Daun dataUji = new Daun(21.4, 6.4 ,"Mangga");
        
        //hitung data includian nya
        listInclu = data.HitungIncludean(listDataDaun, dataUji);
        for (Includian includian : listInclu) {
            System.out.println("Hasil Includian : " + includian.getHasilHitung() + " Label : " + includian.getLabel());
        }
        
        //tebak dulu gan datanya
//        System.out.println("\nMenbak Daun");
//        listTebak = data.TebakDaun(listInclu, listDataDaun);
//        for (Tebak tebak : listTebak) {
//            System.out.println("Hasil Includian : " + tebak.getIncludian() +" \tLabel : " + tebak.getLabel() + " \tTebakan : " + tebak.getTebakan());
//        }
        
        System.out.println("\nSetelah di sort");
        //urutin data hasil includian
        listInclu = data.CekUrutanIncludian(listInclu);
        for (Includian includian : listInclu) {
            System.out.println("Hasil Includian : " + includian.getHasilHitung() + " Label : " + includian.getLabel());
        }
        //cari akurasi jumlah bener / total
        System.out.println("");
        System.out.println("Data Tertebak Berdasarkan K = 1 : " + data.CariKNN(listInclu, 1));
        System.out.println("Data Tertebak Berdasarkan K = 3 : " + data.CariKNN(listInclu, 3));
//        System.out.println("\nAkurasi K2 : " + data.CariAkurasi(listInclu, dataUji.getLabel()));
        System.out.println("Data Tertebak Berdasarkan K = 5 : " + data.CariKNN(listInclu, 5));
//        System.out.println("\nAkurasi K3 : " + + data.CariAkurasi(listInclu, dataUji.getLabel()));
        
        if (data.CariKNN(listInclu, 1).equalsIgnoreCase(dataUji.getLabel())) {
            System.out.println("Benar");
        }
        
//        String hasil = data.CariKNN(listInclu, 3)
        if (data.CariKNN(listInclu, 11).equalsIgnoreCase(dataUji.getLabel())) {
            System.out.println("Benar");
        }

    }
}
