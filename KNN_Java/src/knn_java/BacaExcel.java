package knn_java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BacaExcel {

    public ArrayList<Daun> readFile(String directory) throws IOException, BiffException {
        ArrayList<Daun> data = new ArrayList<>();
        File file = new File(directory);

        Workbook workbook = Workbook.getWorkbook(file);
        Sheet[] sheet = workbook.getSheets();

        int x = sheet[0].getRows();
        int y = sheet[0].getColumns();
        System.out.println("Panjang\t\t Lebar\t\t Daun");
        for (int i = 0; i < x; ++i) {
            Daun dataDaun = new Daun();
            for (int j = 0; j < y; ++j) {
                String ret = sheet[0].getCell(j, i).getContents();
//                System.out.println("cell : " + i + " , " + j + " : " + ret);
                if (ret.equalsIgnoreCase("Panjang") || ret.equalsIgnoreCase("Lebar") || ret.equalsIgnoreCase("Daun")) {
                    continue;
                }else{
                    if (j == 0) {
                        dataDaun.setPanjang(Double.parseDouble(ret));
                    }else if(j == 1){
                        dataDaun.setLebar(Double.parseDouble(ret));
                    }else{
                        dataDaun.setLabel(ret);
                        data.add(dataDaun);
                    }
//                    System.out.println(ret);
                }
                
            }
        }
        return data;
    }
}
