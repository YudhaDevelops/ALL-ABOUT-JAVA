package knn_java;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class KNN_Java {

    public static void main(String[] args) throws IOException, BiffException {
        ArrayList<Daun> dataDaun = new ArrayList<>();
        BacaExcel data = new BacaExcel();
//        data.readFile("C:\\Users\\bimab\\OneDrive\\Documents\\data.xlsx.xls");
        
        dataDaun = data.readFile("C:\\Users\\bimab\\OneDrive\\Documents\\data2.xls");
        for (Daun daun : dataDaun) {
            System.out.println("Panjang : " + daun.getPanjang() + " Lebar : " + daun.getLebar() + " Label : " + daun.getLabel());
        }
        
//        String x = "23,4";
//        System.out.println(Integer.parseInt(x));
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println(df.format(x));
    }

}
