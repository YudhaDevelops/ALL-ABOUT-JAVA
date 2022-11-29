package knn_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import knn_java.*;

public class KNN {
    ArrayList<Includian> includean = new ArrayList<>();
    
    public String CariKNN(ArrayList<Includian> data, int k){
        String label = "Error";
        if (k > 1) {
            //buat tempat e dulu berdasarkan banyak nya k
            String [] dataTampung = new String[k];
            
            //masukkno datane nang array berdasarkan banyak nya k
            for (int i = 0; i < k; i++) {
                dataTampung[i] = data.get(i).getLabel();
            }
            
            //cek jumlah e akeh po rane seko data nang array
            int count = 0, freq = 0;
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    if (dataTampung[j].equals(dataTampung[i])) {
                        count++;
                    }
                    if (count >= freq) {
                        label = dataTampung[i];
                    } else if (count == freq) {
                        label = "eror";
                    }
                }
            }
        }else{
            label = data.get(0).getLabel();
        }
        return label;
    }
    
    public ArrayList<Tebak> TebakDaun(ArrayList<Includian> dataHasilInclu, ArrayList<Daun> dataLatih){
        //NOTE method ini di pakai sebelum di sort atau di urutkan untuk dataHasilInclu
        ArrayList<Tebak> listTebak = new ArrayList<Tebak>();
        
        for (int i = 0; i < dataHasilInclu.size(); i++) {
            Tebak t = new Tebak(dataHasilInclu.get(i).getHasilHitung(), dataHasilInclu.get(i).getLabel());
            if (dataHasilInclu.get(i).getLabel().equals(dataLatih.get(i).getLabel())) {
                t.setTebakan("Benar");
            }else{
                t.setTebakan("Salah");
            }
            listTebak.add(t);
        }
        return listTebak;
    }
    
    //Method untuk mengurutkan data berdasarkan class includian
    public ArrayList<Includian> CekUrutanIncludian(ArrayList<Includian> data){
        Includian temp;
        for (int i = 0; i < data.size()-1; i++) {
            for (int j = 0; j < data.size()-1; j++) {
                if (data.get(j).getHasilHitung() > data.get(j + 1).getHasilHitung()) {
                    temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        return data;
    }
    
    public ArrayList<Tebak> CekUrutanTebak(ArrayList<Tebak> data){
        Tebak temp;
        for (int i = 0; i < data.size()-1; i++) {
            for (int j = 0; j < data.size()-1; j++) {
                if (data.get(j).getIncludian() > data.get(j + 1).getIncludian()) {
                    temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        return data;
    }
    
    public ArrayList<Includian> HitungIncludean(ArrayList<Daun> dataLatih, Daun dataUji){
        double hasil;
        
        for (Daun daun : dataLatih) {
            hasil = Math.sqrt(((daun.getPanjang() - dataUji.getPanjang()) * (daun.getPanjang() - dataUji.getPanjang()))
                            + ((daun.getLebar() - dataUji.getLebar()) * (daun.getLebar() - dataUji.getLebar())));
            Includian inclu = new Includian(hasil,daun.getLabel());
            includean.add(inclu);
        }
        return this.includean;
    }
    
    public ArrayList<Daun> BacaCsvBuffer(String directory) {
        String line = "";
        String splitBy = ",";
        ArrayList<Daun> data = new ArrayList<>();

        try {
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader(directory));
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] daun = line.split(splitBy);    // use comma as separator  
                if (daun[0].equalsIgnoreCase("Panjang") || daun[1].equalsIgnoreCase("Lebar") || daun[2].equalsIgnoreCase("Daun")) {
                    continue;
                }else{
                    Daun dataDaun = new Daun();
                    dataDaun.setPanjang(Double.parseDouble(daun[0]));
                    dataDaun.setLebar(Double.parseDouble(daun[1]));
                    dataDaun.setLabel(daun[2]);
                    data.add(dataDaun);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  data;
    }
    
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
                } else {
                    if (j == 0) {
                        dataDaun.setPanjang(Double.parseDouble(ret));
                    } else if (j == 1) {
                        dataDaun.setLebar(Double.parseDouble(ret));
                    } else {
                        dataDaun.setLabel(ret);
                        data.add(dataDaun);
                    }
//                    System.out.println(ret);
                }

            }
        }
        return data;
    }

    public void BacaCsv(String directory) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(directory));
        sc.useDelimiter(",");   //sets the delimiter pattern  
        while (sc.hasNext()) //returns a boolean value  
        {
            if (sc.next().equalsIgnoreCase("Panjang") || sc.next().equalsIgnoreCase("Lebar") || sc.next().equalsIgnoreCase("Daun")) {
                continue;
            }
            System.out.print(sc.next());  //find and returns the next complete token from this scanner  
        }
        sc.close();  //closes the scanner  
    }

    
}
