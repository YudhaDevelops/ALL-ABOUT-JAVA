package knn_csv;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class knn_csv {

    public static void main(String[] args) throws Exception {
        ArrayList<Daun> DataA = new ArrayList<Daun>();
        ArrayList<Daun> DataB = new ArrayList<Daun>();
        ArrayList<Daun> DataC = new ArrayList<Daun>();
        ArrayList<Daun> DataLatih = new ArrayList<Daun>();
        ArrayList<Daun> DataUji = new ArrayList<Daun>();
        
        ArrayList<Includian> DataInclu = new ArrayList<Includian>();
        ArrayList<Includian>listInclu = new ArrayList<Includian>();
        ArrayList<ArrayList<Includian>> DataBesar = new ArrayList<ArrayList<Includian>>();
           
        KNN data = new KNN();
        
        DataA = data.BacaCsvBuffer("C:\\Users\\LENOVO\\Downloads\\data1.csv");
        DataB = data.BacaCsvBuffer("C:\\Users\\LENOVO\\Downloads\\data2.csv");
        DataC = data.BacaCsvBuffer("C:\\Users\\LENOVO\\Downloads\\data3.csv");
        
        //gabung data A & B --> data C (uji)
        DataLatih = data.gabungDataLatih(DataA, DataB);
        DataUji = DataC;
        //data uji DataC
        
        DataBesar = data.HitungIncludianArrayList(DataLatih, DataUji);
        System.out.println("Hitung Includian + Sort : Done");

        System.out.println("");
        
        
//        ArrayList<Daun> listDataDaun = new ArrayList<>();
//        
//        ArrayList<Includian>listInclu = new ArrayList<Includian>();
//        ArrayList<Tebak>listTebak = new ArrayList<Tebak>();
//     
//        for (Daun daun : listDataDaun) {
//            System.out.println("Panjang : " + daun.getPanjang() + " Lebar : " + daun.getLebar() + " Label : " + daun.getLabel());
//        }
//        
//        System.out.println("");
//        //buat data uji
//        Daun dataUji = new Daun(21.4, 6.4 ,"Mangga");
//        
//        //hitung data includian nya
//        listInclu = data.HitungIncludean(listDataDaun, dataUji);
//        for (Includian includian : listInclu) {
//            System.out.println("Hasil Includian : " + includian.getHasilHitung() + " Label : " + includian.getLabel());
//        }
//        
//        //tebak dulu gan datanya
////        System.out.println("\nMenbak Daun");
////        listTebak = data.TebakDaun(listInclu, listDataDaun);
////        for (Tebak tebak : listTebak) {
////            System.out.println("Hasil Includian : " + tebak.getIncludian() +" \tLabel : " + tebak.getLabel() + " \tTebakan : " + tebak.getTebakan());
////        }
//        
//        System.out.println("\nSetelah di sort");
//        //urutin data hasil includian
//        listInclu = data.CekUrutanIncludian(listInclu);
//        for (Includian includian : listInclu) {
//            System.out.println("Hasil Includian : " + includian.getHasilHitung() + " Label : " + includian.getLabel());
//        }
//        
//        System.out.println("");
//        System.out.println("Data Tertebak Berdasarkan K = 1 : " + data.CariKNN(listInclu, 1));
//        System.out.println("Data Tertebak Berdasarkan K = 3 : " + data.CariKNN(listInclu, 3));
//        System.out.println("Data Tertebak Berdasarkan K = 5 : " + data.CariKNN(listInclu, 5));
    }
}