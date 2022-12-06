package knn_csv;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class knn_csv {

    public static void main(String[] args) throws Exception {
//        ArrayList<Daun> DataA = new ArrayList<Daun>();
//        ArrayList<Daun> DataB = new ArrayList<Daun>();
//        ArrayList<Daun> DataC = new ArrayList<Daun>();
//        ArrayList<Daun> DataLatih = new ArrayList<Daun>();
//        ArrayList<Daun> DataUji = new ArrayList<Daun>();

        ArrayList<Buah> DataA = new ArrayList<Buah>();
        ArrayList<Buah> DataB = new ArrayList<Buah>();
        ArrayList<Buah> DataC = new ArrayList<Buah>();
        ArrayList<Buah> DataLatih = new ArrayList<Buah>();
        ArrayList<Buah> DataUji = new ArrayList<Buah>();

        ArrayList<Includian> DataInclu = new ArrayList<Includian>();
        ArrayList<Includian> listInclu = new ArrayList<Includian>();
        ArrayList<DataBesar> DataBesar = new ArrayList<DataBesar>();

        double akurasiA, akurasiB, akurasiC;

        KNN_BUAH data = new KNN_BUAH();

        //daun
//        DataA = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive\\Documents\\GIT_DESKTOP\\ALL_ABOUT_JAVA\\data1.csv");
//        DataB = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive\\Documents\\GIT_DESKTOP\\ALL_ABOUT_JAVA\\data2.csv");
//        DataC = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive\\Documents\\GIT_DESKTOP\\ALL_ABOUT_JAVA\\data3.csv");
        System.out.println("");
        //buah
//        DataA = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive - Universitas Sanata Dharma\\KULIAH SEMESTER 5\\Pemrosesan Citra\\TUGAS\\Data Mangga\\data_set_banyak.csv");
        DataA = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive - Universitas Sanata Dharma\\KULIAH SEMESTER 5\\Pemrosesan Citra\\TUGAS\\Data Mangga\\data1.csv");
        DataB = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive - Universitas Sanata Dharma\\KULIAH SEMESTER 5\\Pemrosesan Citra\\TUGAS\\Data Mangga\\data2.csv");
        DataC = data.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive - Universitas Sanata Dharma\\KULIAH SEMESTER 5\\Pemrosesan Citra\\TUGAS\\Data Mangga\\data3.csv");
//        
//        //gabung data A & B --> data C (uji)
        DataLatih = data.gabungDataLatih(DataA, DataB);
        DataUji = DataC;
//        //data uji DataC
        DataBesar = data.HitungIncludianArrayList(DataLatih, DataUji);
        System.out.println("Hitung Includian + Sort : Done");

        DataBesar = data.CariAkurasiKNNArrayList(DataBesar, DataUji, 3);
        System.out.println("");
//        data.printData(DataBesar);
//        
        System.out.println("");
        System.out.println("Hitung Akurasi");
        akurasiC = data.CariAkurasiSemuaDataUji(DataBesar);
        System.out.printf("Akurasi Dari Seluruhnya : %.2f Persen \n", akurasiC);
//        
        //gabung data A & C --> data B (uji)
        DataLatih = data.gabungDataLatih(DataA, DataC);
        DataUji = DataB;
        //data uji DataC
        DataBesar = data.HitungIncludianArrayList(DataLatih, DataUji);
        System.out.println("Hitung Includian + Sort : Done");

        DataBesar = data.CariAkurasiKNNArrayList(DataBesar,DataUji, 3);
        System.out.println("");
//        data.printData(DataBesar);
        
        System.out.println("");
        System.out.println("Hitung Akurasi");
        akurasiB = data.CariAkurasiSemuaDataUji(DataBesar);
        System.out.printf("Akurasi Dari Seluruhnya : %.2f Persen \n", akurasiB);
        
        //gabung data B & C --> data A (uji)
        DataLatih = data.gabungDataLatih(DataB, DataC);
        DataUji = DataA;
        //data uji DataA
        DataBesar = data.HitungIncludianArrayList(DataLatih, DataUji);
        System.out.println("Hitung Includian + Sort : Done");

        DataBesar = data.CariAkurasiKNNArrayList(DataBesar,DataUji, 3);
        System.out.println("");
//        data.printData(DataBesar);
        
        System.out.println("");
        System.out.println("Hitung Akurasi");
        akurasiA = data.CariAkurasiSemuaDataUji(DataBesar);
        System.out.printf("Akurasi Dari DataUji A : %.2f Persen \n", akurasiA);
        
        //rata rata dari ke 3 akurasi 
        double hasil = (akurasiA + akurasiB + akurasiC) / 3;
        System.out.println("");
        System.out.printf("Akurasi Dari Data Uji A : %.2f Persen \n", akurasiA);
        System.out.printf("Akurasi Dari Data Uji B : %.2f Persen \n", akurasiB);
        System.out.printf("Akurasi Dari Data Uji C : %.2f Persen \n", akurasiC);
        System.out.printf("Rata Rata Dari 3 Akurasi : %.2f Persen" , hasil);
        System.out.println("");
    }
}
