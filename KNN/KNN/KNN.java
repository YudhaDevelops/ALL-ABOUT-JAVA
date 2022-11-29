package KNN;

import java.util.ArrayList;

public class KNN {

    public static double hitungJarakEuclidean(DataLatih latih, DataUji uji) {
        double jarak = 0;
        jarak = Math.sqrt(((latih.getPanjang() - uji.getPanjang()) * (latih.getPanjang() - uji.getPanjang()))
                + ((latih.getLebar() - uji.getLebar()) * (latih.getLebar() - uji.getLebar())));
        return jarak;
    }

    public static ArrayList<DataLatih> urutkanRank(ArrayList<DataLatih> data) {
        DataLatih temp;
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = 0; j < data.size() - 1; j++) {
                if (data.get(j).getEuclidean() > data.get(j + 1).getEuclidean()) {
                    temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        return data;
    }

    public static String cariKNN(ArrayList<DataLatih> data, int k) {

        String[] baru = new String[k + 1];
        String temp = "";
        int count = 0;
        int freq = 0;
        String res = "";
        if ((k > data.size()) || (k <= 0)) {
            return "ERROR: harap masukkan nilai k yang sesuai";
        }
        if (k != 1) {
            for (int i = 0; i < k; i++) {
                baru[i] = data.get(i).getLabel();
            }
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    if (baru[j].equals(baru[i])) {
                        count++;
                    }
                    if (count >= freq) {
                        res = baru[i];
                    } else if (count == freq) {
                        res = "eror";
                    }
                }
            }
        } else {
            return data.get(1).getLabel();
        }
        return "Hasil KNN dengan k = " + k + " adalah " + "\"" + res + "\"";
    }

    public static void main(String[] args) {
        DataLatih latih1 = new DataLatih("tapak dara", 6.3, 3.6);
        DataLatih latih2 = new DataLatih("tapak dara", 6.7, 3.3);
        DataLatih latih3 = new DataLatih("melinjo", 15, 4.5);
        DataLatih latih4 = new DataLatih("melinjo", 14.1, 3.3);
        DataLatih latih5 = new DataLatih("melinjo", 14.1, 3.3);
        DataUji uji1 = new DataUji("tapak dara", 5.6, 3.5);

        ArrayList<DataLatih> dataLatih = new ArrayList<DataLatih>();
        ArrayList<DataUji> dataUji = new ArrayList<DataUji>();

        dataLatih.add(latih1);
        dataLatih.add(latih2);
        dataLatih.add(latih3);
        dataLatih.add(latih4);
        dataLatih.add(latih5);

        for (int i = 0; i < dataLatih.size(); i++) {
            dataLatih.get(i).setEuclidean(hitungJarakEuclidean(dataLatih.get(i), uji1));
        }

        ArrayList<DataLatih> dataUrut = urutkanRank(dataLatih);

        System.out.println(dataUrut);

        System.out.println("\n" + cariKNN(dataUrut, 3));
    }
}
