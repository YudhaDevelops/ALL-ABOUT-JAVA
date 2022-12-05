package knn_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class KNN_BUAH {

    ArrayList<Includian> includean = new ArrayList<>();
    ArrayList<Buah> DataLatih = new ArrayList<>();
    String Label = "";

    public ArrayList<Buah> BacaCsvBuffer(String directory) {
        String line = "";
        String splitBy = ",";
        ArrayList<Buah> data = new ArrayList<>();

        try {
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader(directory));
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] buah = line.split(splitBy);    // use comma as separator  
                if (buah[0].equalsIgnoreCase("R_Mean") || buah[1].equalsIgnoreCase("G_Mean") || buah[2].equalsIgnoreCase("B_Mean")
                        || buah[3].equalsIgnoreCase("R_Varian") || buah[4].equalsIgnoreCase("G_Varian") || buah[5].equalsIgnoreCase("B_Varian")
                        || buah[6].equalsIgnoreCase("R_skewness") || buah[7].equalsIgnoreCase("G_skewness") || buah[8].equalsIgnoreCase("B_skewness")
                        || buah[9].equalsIgnoreCase("R_kurtosis") || buah[10].equalsIgnoreCase("G_kurtosis") || buah[11].equalsIgnoreCase("B_kurtosis")
                        || buah[12].equalsIgnoreCase("Kematangan/Keterangan")) {
                    continue;

                } else {
                    Buah dataBuah = new Buah();
                    //RGB Mean
                    dataBuah.setR_Men(Double.parseDouble(buah[0]));
                    dataBuah.setG_Men(Double.parseDouble(buah[1]));
                    dataBuah.setB_Men(Double.parseDouble(buah[2]));

                    //RGB Varian
                    dataBuah.setR_Var(Double.parseDouble(buah[3]));
                    dataBuah.setG_Var(Double.parseDouble(buah[4]));
                    dataBuah.setB_Var(Double.parseDouble(buah[5]));

                    //RGB skewness
                    dataBuah.setR_Skew(Double.parseDouble(buah[6]));
                    dataBuah.setG_Skew(Double.parseDouble(buah[7]));
                    dataBuah.setB_Skew(Double.parseDouble(buah[8]));

                    //RGB Kurtosis
                    dataBuah.setR_Kur(Double.parseDouble(buah[9]));
                    dataBuah.setG_Kur(Double.parseDouble(buah[10]));
                    dataBuah.setB_Kur(Double.parseDouble(buah[11]));

                    dataBuah.setLabel(buah[12]);
                    data.add(dataBuah);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
    public double CariAkurasiSemuaDataUji(ArrayList<DataBesar> data){
        double akurasi = 0;
        for (int i = 0; i < data.size(); i++) {
            //akurasi / semua data
            akurasi = akurasi + data.get(i).getAkurasi();
        }
        double hasil = akurasi / data.size();
        return hasil;
    }

    public ArrayList<Buah> gabungDataLatih(ArrayList<Buah> Data1, ArrayList<Buah> Data2) {
        for (Buah buah1 : Data1) {
            Buah data = new Buah();
            //RGB Mean
            data.setR_Men(buah1.getR_Men());
            data.setG_Men(buah1.getG_Men());
            data.setB_Men(buah1.getB_Men());

            //RGB Varian
            data.setR_Var(buah1.getR_Var());
            data.setG_Var(buah1.getG_Var());
            data.setB_Var(buah1.getB_Var());

            //RGB skewness
            data.setR_Skew(buah1.getR_Skew());
            data.setG_Skew(buah1.getG_Skew());
            data.setB_Skew(buah1.getB_Skew());

            //RGB Kurtosis
            data.setR_Kur(buah1.getR_Kur());
            data.setG_Kur(buah1.getG_Kur());
            data.setB_Kur(buah1.getB_Kur());
            
            data.setLabel(buah1.getLabel());
            DataLatih.add(buah1);
        }
        for (Buah buah2 : Data2) {
            Buah data = new Buah();
            //RGB Mean
            data.setR_Men(buah2.getR_Men());
            data.setG_Men(buah2.getG_Men());
            data.setB_Men(buah2.getB_Men());

            //RGB Varian
            data.setR_Var(buah2.getR_Var());
            data.setG_Var(buah2.getG_Var());
            data.setB_Var(buah2.getB_Var());

            //RGB skewness
            data.setR_Skew(buah2.getR_Skew());
            data.setG_Skew(buah2.getG_Skew());
            data.setB_Skew(buah2.getB_Skew());

            //RGB Kurtosis
            data.setR_Kur(buah2.getR_Kur());
            data.setG_Kur(buah2.getG_Kur());
            data.setB_Kur(buah2.getB_Kur());
            
            data.setLabel(buah2.getLabel());
            DataLatih.add(data);
        }
        return DataLatih;
    }
    
    public ArrayList<DataBesar> HitungIncludianArrayList(ArrayList<Buah> dataLatih, ArrayList<Buah> dataUji) {
        double hasil;
        ArrayList<DataBesar> data = new ArrayList<DataBesar>();
        ArrayList<Includian> temp = new ArrayList<Includian>();
        for (int i = 0; i < dataUji.size(); i++) {
            System.out.println("Data Uji : " + dataUji.get(i).getLabel());
            ArrayList<Includian> d = new ArrayList<Includian>();

            for (int j = 0; j < dataLatih.size(); j++) {
                hasil = Math.sqrt((
                        //RGB MEAN
                        (
                                dataLatih.get(j).getR_Men() - dataUji.get(i).getR_Men()) * (
                                dataLatih.get(j).getR_Men() - dataUji.get(i).getR_Men()
                                ))
                        + (
                                (dataLatih.get(j).getG_Men()- dataUji.get(i).getG_Men()) * (
                                dataLatih.get(j).getG_Men() - dataUji.get(i).getG_Men()
                                ))
                        + (
                                (dataLatih.get(j).getB_Men()- dataUji.get(i).getB_Men()) * (
                                dataLatih.get(j).getB_Men() - dataUji.get(i).getB_Men()
                                ))
                        //RGB VARIAN
                        + (
                                (dataLatih.get(j).getR_Var()- dataUji.get(i).getR_Var()) * (
                                dataLatih.get(j).getR_Var() - dataUji.get(i).getR_Var()
                                ))
                        + (
                                (dataLatih.get(j).getG_Var()- dataUji.get(i).getG_Var()) * (
                                dataLatih.get(j).getG_Var() - dataUji.get(i).getG_Var()
                                ))
                        + (
                                (dataLatih.get(j).getB_Var()- dataUji.get(i).getB_Var()) * (
                                dataLatih.get(j).getB_Var() - dataUji.get(i).getB_Var()
                                ))
                        //RGB SKEWNESS
                        + (
                                (dataLatih.get(j).getR_Skew() - dataUji.get(i).getR_Skew()) * (
                                dataLatih.get(j).getR_Skew() - dataUji.get(i).getR_Skew()
                                ))
                        + (
                                (dataLatih.get(j).getG_Skew()- dataUji.get(i).getG_Skew()) * (
                                dataLatih.get(j).getG_Skew() - dataUji.get(i).getG_Skew()
                                ))
                        + (
                                (dataLatih.get(j).getB_Skew()- dataUji.get(i).getB_Skew()) * (
                                dataLatih.get(j).getB_Skew() - dataUji.get(i).getB_Skew()
                                ))
                        //RGB KURTOSIS
                        + (
                                (dataLatih.get(j).getB_Kur() - dataUji.get(i).getR_Kur()) * (
                                dataLatih.get(j).getR_Kur() - dataUji.get(i).getR_Kur()
                                ))
                        + (
                                (dataLatih.get(j).getG_Kur()- dataUji.get(i).getG_Kur()) * (
                                dataLatih.get(j).getG_Kur() - dataUji.get(i).getG_Kur()
                                ))
                        + (
                                (dataLatih.get(j).getB_Kur()- dataUji.get(i).getB_Kur()) * (
                                dataLatih.get(j).getB_Kur() - dataUji.get(i).getB_Kur()
                                ))
                );
                Includian inclu = new Includian(hasil, dataLatih.get(j).getLabel());
                d.add(inclu);
            }
            temp = this.CekUrutanIncludian(d);
            this.CariKNNPrint(temp, 1);
            this.CariKNNPrint(temp, 3);
            this.CariKNNPrint(temp, 5);
            System.out.println("");
            DataBesar dataBesar = new DataBesar(temp);
            data.add(dataBesar);
        }
        return data;
    }
    
    //Method untuk mengurutkan data berdasarkan class includian
    public ArrayList<Includian> CekUrutanIncludian(ArrayList<Includian> data) {
        Includian temp;
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = 0; j < data.size() - 1; j++) {
                if (data.get(j).getHasilHitung() > data.get(j + 1).getHasilHitung()) {
                    temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        return data;
    }
    
    public void CariKNNPrint(ArrayList<Includian> data, int k) {
        String label = "Error";
        if (k > 1) {
            //buat tempat e dulu berdasarkan banyak nya k
            String[] dataTampung = new String[k];

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
        } else {
            label = data.get(0).getLabel();
        }
        System.out.println("K = " + k + " Hasil : " + label);
    }

    public ArrayList<DataBesar> CariAkurasiKNNArrayList(ArrayList<DataBesar> data, ArrayList<Buah> dataUji, int k) {
        this.Label = "Error";
        if (k > 1) {
            //loopArray dari data besar
            for (int i = 0; i < data.size(); i++) {//buat tempat e dulu berdasarkan banyak nya k
                String[] dataTampung = new String[k];
                //masukkno datane nang array berdasarkan banyak nya k
                for (int j = 0; j < k; j++) {
                    dataTampung[j] = data.get(i).getListInclu().get(j).getLabel();
                }

                //cek jumlah e akeh po rane seko data nang array
                double benar = 0, salah = 0;
                double akurasiPerK = 0;
                for (int j = 0; j < k; j++) {
                    if (dataTampung[j].equals(dataUji.get(i).getLabel())) {
                        benar += 1;
                    } else {
                        salah += 1;
                    }
                }
                akurasiPerK = (benar / (benar + salah)) * 100;
                data.get(i).setTebakBenar(benar);
                data.get(i).setTebakSalah(salah);
                data.get(i).setAkurasi(akurasiPerK);
                data.get(i).setTebakK(Label);
            }

        } else {
            System.out.println("K Anda Tidak Saya Terima");
        }
        return data;
    }
    
    public void printData(ArrayList<DataBesar> data) {
        System.out.println("Print Data");
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j <= data.get(i).getListInclu().size() - 1; j++) {
                System.out.println(
                        "Data Uji Ke :" + i
                        + " Index ke " + j
                        + " Tebak Benar : " + data.get(i).getTebakBenar()
                        + " Tebak Salah : " + data.get(i).getTebakSalah()
                        + " Akurasi : " + data.get(i).getAkurasi()
                        + " Includian : " + data.get(i).getListInclu().get(j).getHasilHitung()
                        + " Label :" + data.get(i).getListInclu().get(j).getLabel()
                );
            }
            System.out.println("");
        }
    }
    
}
