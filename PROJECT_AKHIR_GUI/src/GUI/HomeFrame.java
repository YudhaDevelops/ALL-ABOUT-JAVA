package GUI;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HomeFrame extends javax.swing.JFrame {

    public KNN knn;
    public String path;
    public double BenarUjiA, BenarUjiB, BenarUjiC, SalahUjiA, SalahUjiB, SalahUjiC;
    public double AkurasiUjiA, AkurasiUjiB, AkurasiUjiC;
    public ArrayList<Buah> dataUji = new ArrayList<>();
    public ArrayList<Buah> dataLatih = new ArrayList<>();

    public ArrayList<Buah> LatihA = new ArrayList<>();
    public ArrayList<Buah> LatihB = new ArrayList<>();
    public ArrayList<Buah> LatihC = new ArrayList<>();
    public ArrayList<Buah> DataUtuh = new ArrayList<>();
    public ArrayList<DataBesar> DataBesar;
    int nilai;

    public ArrayList<Buah> getDataUji() {
        return dataUji;
    }

    public void setDataUji(ArrayList<Buah> data) {
        for (int i = 0; i < data.size(); i++) {
            dataUji.add(data.get(i));
        }
    }

    public ArrayList<Buah> getDataLatih() {
        return dataLatih;
    }

    public ArrayList<Buah> getLatihA() {
        return LatihA;
    }

    public void setLatihA(ArrayList<Buah> LatihA) {
        this.LatihA = LatihA;
    }

    public ArrayList<Buah> getLatihB() {
        return LatihB;
    }

    public void setLatihB(ArrayList<Buah> LatihB) {
        this.LatihB = LatihB;
    }

    public ArrayList<Buah> getLatihC() {
        return LatihC;
    }

    public void setLatihC(ArrayList<Buah> LatihC) {
        this.LatihC = LatihC;
    }

    public double getAkurasiUjiA() {
        return AkurasiUjiA;
    }

    public void setAkurasiUjiA(double AkurasiUjiA) {
        this.AkurasiUjiA = AkurasiUjiA;
    }

    public double getAkurasiUjiB() {
        return AkurasiUjiB;
    }

    public void setAkurasiUjiB(double AkurasiUjiB) {
        this.AkurasiUjiB = AkurasiUjiB;
    }

    public double getAkurasiUjiC() {
        return AkurasiUjiC;
    }

    public void setAkurasiUjiC(double AkurasiUjiC) {
        this.AkurasiUjiC = AkurasiUjiC;
    }

    public HomeFrame() {
        initComponents();
        knn = new KNN();
        DataBesar = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihUji = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nilaiK = new javax.swing.JTextField();
        btnBacaFile = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nama_path = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        akurasiUjiA = new javax.swing.JLabel();
        akurasiUjiB = new javax.swing.JLabel();
        akurasiUjiC = new javax.swing.JLabel();
        labelNilaiAkurasiSemua = new javax.swing.JLabel();
        nilaiLabelK = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelBenarUjiA = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelSalahUjiA = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelBenarUjiB = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelSalahUjiB = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labelBenarUjiC = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelSalahUjiC = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnKnn = new javax.swing.JButton();
        btnGetUjiLatih = new javax.swing.JButton();
        btnNilaiAkurasi = new javax.swing.JButton();
        btnPecah = new javax.swing.JButton();
        dataA = new javax.swing.JCheckBox();
        dataB = new javax.swing.JCheckBox();
        dataC = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi CIPOL");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROJECT AKHIR MATA KULIAH CITRA DAN POLA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton1.setText("SELECT FILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CEK DATA UJI & DATA LATIH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("ABOUT TEAM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("CEK Data A, B & C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Masukkan Nilai K :");

        nilaiK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnBacaFile.setText("Baca File");
        btnBacaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacaFileActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setText("Status Path :");

        nama_path.setText("path");

        jLabel6.setText("Nilai K :");

        jLabel7.setText("nilai k");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama_path, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama_path))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setText("Akurasi Data Uji A :");

        jLabel9.setText("Akurasi Data Uji B :");

        jLabel10.setText("Akurasi Data Uji C :");

        jLabel13.setText("Akurasi Data Uji Keseluruhan :");

        jLabel14.setText("Nilai K :");

        akurasiUjiA.setText("progres");

        akurasiUjiB.setText("progres");

        akurasiUjiC.setText("progres");

        labelNilaiAkurasiSemua.setText("progres");

        nilaiLabelK.setText("progres");

        jLabel15.setText("Benar Data Uji A:");

        labelBenarUjiA.setText("progres");

        jLabel16.setText("Salah Data Uji A:");

        labelSalahUjiA.setText("progres");

        jLabel17.setText("Benar Data Uji B:");

        labelBenarUjiB.setText("progres");

        jLabel18.setText("Salah Data Uji B:");

        labelSalahUjiB.setText("progres");

        jLabel19.setText("Benar Data Uji C:");

        labelBenarUjiC.setText("progres");

        jLabel20.setText("Salah Data Uji A:");

        labelSalahUjiC.setText("progres");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNilaiAkurasiSemua))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nilaiLabelK))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(akurasiUjiA))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(akurasiUjiB))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(akurasiUjiC)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBenarUjiC)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelSalahUjiC))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBenarUjiA)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelSalahUjiA))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBenarUjiB)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelSalahUjiB)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(akurasiUjiA)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(labelBenarUjiA)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(labelSalahUjiA))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(akurasiUjiB)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(labelBenarUjiB)
                        .addComponent(jLabel18)
                        .addComponent(labelSalahUjiB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(akurasiUjiC)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(labelBenarUjiC)
                        .addComponent(jLabel20)
                        .addComponent(labelSalahUjiC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labelNilaiAkurasiSemua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nilaiLabelK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Pilih Data Uji");

        btnKnn.setText("Cari KNN");
        btnKnn.setEnabled(false);
        btnKnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKnnActionPerformed(evt);
            }
        });

        btnGetUjiLatih.setText("Get Data Uji & Latih");
        btnGetUjiLatih.setEnabled(false);
        btnGetUjiLatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetUjiLatihActionPerformed(evt);
            }
        });

        btnNilaiAkurasi.setText("Cek Nilai Akurasi");
        btnNilaiAkurasi.setEnabled(false);
        btnNilaiAkurasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNilaiAkurasiActionPerformed(evt);
            }
        });

        btnPecah.setText("Pecah Data");
        btnPecah.setEnabled(false);
        btnPecah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPecahActionPerformed(evt);
            }
        });

        dataA.setText("Data A");
        dataA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAActionPerformed(evt);
            }
        });

        dataB.setText("Data B");
        dataB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBActionPerformed(evt);
            }
        });

        dataC.setText("Data C");
        dataC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/USD3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataC)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nilaiK, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnKnn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGetUjiLatih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNilaiAkurasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPecah, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btnBacaFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nilaiK)
                                .addComponent(btnKnn)
                                .addComponent(btnNilaiAkurasi))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dataA)
                                    .addComponent(dataB)
                                    .addComponent(dataC))
                                .addComponent(btnGetUjiLatih, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPecah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBacaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            nama_path.setText(file.getPath());
            path = file.getPath();
        } else {
            nama_path.setText("Open command canceled");
            path = null;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TableDataLatihUji tableUjiLatih = new TableDataLatihUji(this, true, dataUji, dataLatih);
        tableUjiLatih.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Team team = new Team(this, true);
        team.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBacaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacaFileActionPerformed
//        DataUtuh = this.knn.BacaCsvBuffer("C:\\Users\\bimab\\OneDrive\\Documents\\data_huruf.csv");
        if (this.path == null) {
            JOptionPane.showMessageDialog(rootPane, "Path Nya Mana Gan?");
        } else {
            if (DataUtuh.size() > 0) {
                int pilih = JOptionPane.showConfirmDialog(rootPane, "Data Sudah Ada \n Apakah Anda Ingin Meload Ulang Data Anda?", "Info..", JOptionPane.YES_NO_OPTION);
                if (pilih == 0) {
                    DataUtuh.clear();
                    DataUtuh = this.knn.BacaCsvBuffer(this.path);
                    JOptionPane.showMessageDialog(rootPane, "Siap!!, Data Anda Sudah Di Load Ulang");
                    btnPecah.setEnabled(true);
                }
            } else {
                DataUtuh = this.knn.BacaCsvBuffer(this.path);
                JOptionPane.showMessageDialog(rootPane, "Data Anda Berhasil Di Load");
                btnPecah.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnBacaFileActionPerformed

    private void btnGetUjiLatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetUjiLatihActionPerformed
        if (!dataA.isSelected() && !dataB.isSelected() && !dataC.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Harap Pilih Dua Dari Ketiga Data");
            btnKnn.setEnabled(false);
        } else if (dataA.isSelected() && dataB.isSelected() && dataC.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Hanya Boleh Memilih Dua Dari Ketiga Data");
            btnKnn.setEnabled(false);
        } else {
            this.dataLatih.clear();
            this.dataUji.clear();

            if (dataA.isSelected() && dataB.isSelected()) {
                gabungDataLatih(this.getLatihA(), this.getLatihB());
                this.setDataUji(this.getLatihC());
            } else if (dataA.isSelected() && dataC.isSelected()) {
                gabungDataLatih(this.getLatihA(), this.getLatihC());
                this.setDataUji(this.getLatihB());
            } else {
                gabungDataLatih(this.getLatihB(), this.getLatihC());
                this.setDataUji(this.getLatihA());
            }
            JOptionPane.showMessageDialog(rootPane, "Data Uji Dan Data Latih Berhasil Di Load");
            btnKnn.setEnabled(true);
//            System.out.println("\nData Latih");
//            this.printData(this.getDataLatih());
//            System.out.println("\nData Uji");
//            this.printData(this.getDataUji());
//            System.out.println("\nLatih A");
//            this.printData(LatihA);
//            System.out.println("\nLatih B");
//            this.printData(LatihB);
//            System.out.println("\nLatih C");
//            this.printData(LatihC);
        }
    }//GEN-LAST:event_btnGetUjiLatihActionPerformed

    public void gabungDataLatih(ArrayList<Buah> Data1, ArrayList<Buah> Data2) {
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
            dataLatih.add(buah1);
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
            dataLatih.add(data);
        }
    }

    public void PecahData(ArrayList<Buah> data) {
        this.LatihA.clear();
        this.LatihB.clear();
        this.LatihC.clear();

        int bagi = data.size() / 3; //genap
        Random GetRandom = new Random();
        data.get(GetRandom.nextInt(data.size()));

        for (int i = 0; i < data.size(); i++) {
            if (this.LatihA.size() < bagi) {
                this.LatihA.add(data.get(i));
            } else if (this.LatihB.size() < bagi) {
                this.LatihB.add(data.get(i));
            } else if (this.LatihC.size() < bagi) {
                this.LatihC.add(data.get(i));
            }
        }
    }

    private void btnKnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKnnActionPerformed
        int k = Integer.parseInt(nilaiK.getText());
        nilaiLabelK.setText(nilaiK.getText());
        this.DataBesar = this.knn.HitungIncludianArrayList(dataLatih, dataUji, k);
        btnNilaiAkurasi.setEnabled(true);
    }//GEN-LAST:event_btnKnnActionPerformed

    private void btnNilaiAkurasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNilaiAkurasiActionPerformed
        int k = Integer.parseInt(nilaiK.getText());
        this.DataBesar = knn.CariAkurasiKNNArrayList(DataBesar, dataUji, k);

        if (dataA.isSelected() && dataB.isSelected()) {
            this.BenarUjiC = knn.getBenar();
            this.SalahUjiC = knn.getSalah();
            this.setAkurasiUjiC(knn.CariAkurasiSemuaDataUji(DataBesar));
            System.out.println("Benar : " + BenarUjiC);
            System.out.println("Salah : " + SalahUjiC);
            System.out.println("Akurasi C : " + AkurasiUjiC);

        } else if (dataA.isSelected() && dataC.isSelected()) {
            this.BenarUjiB = knn.getBenar();
            this.SalahUjiB = knn.getSalah();
            this.setAkurasiUjiB(knn.CariAkurasiSemuaDataUji(DataBesar));
            System.out.println("Benar : " + BenarUjiB);
            System.out.println("Salah : " + SalahUjiB);
            System.out.println("Akurasi B : " + AkurasiUjiB);

        } else {
            this.BenarUjiA = knn.getBenar();
            this.SalahUjiA = knn.getSalah();
            this.setAkurasiUjiA(knn.CariAkurasiSemuaDataUji(DataBesar));
            System.out.println("Benar : " + BenarUjiA);
            System.out.println("Salah : " + SalahUjiA);
            System.out.println("Akurasi A : " + AkurasiUjiA);
        }

        if (AkurasiUjiA != 0) {
            akurasiUjiA.setText(String.valueOf(AkurasiUjiA));
            labelBenarUjiA.setText(String.valueOf(BenarUjiA));
            labelSalahUjiA.setText(String.valueOf(SalahUjiA));
        }

        if (AkurasiUjiB != 0) {
            akurasiUjiB.setText(String.valueOf(AkurasiUjiB));
            labelBenarUjiB.setText(String.valueOf(BenarUjiB));
            labelSalahUjiB.setText(String.valueOf(SalahUjiB));
        }

        if (AkurasiUjiC != 0) {
            akurasiUjiC.setText(String.valueOf(AkurasiUjiC));
            labelBenarUjiC.setText(String.valueOf(BenarUjiC));
            labelSalahUjiC.setText(String.valueOf(SalahUjiC));
        }

        nilaiLabelK.setText(nilaiK.getText());

        if (AkurasiUjiA != 0 && AkurasiUjiB != 0 && AkurasiUjiC != 0) {
            double hasil = (AkurasiUjiA + AkurasiUjiB + AkurasiUjiC) / 3;
            labelNilaiAkurasiSemua.setText(String.valueOf(hasil));
            System.out.println("Rata Rata Dari Ketiga Akurasi :" + hasil);
        }
        btnGetUjiLatih.setEnabled(false);
        btnKnn.setEnabled(false);
        btnNilaiAkurasi.setEnabled(false);
        dataA.setSelected(false);
        dataB.setSelected(false);
        dataC.setSelected(false);
    }//GEN-LAST:event_btnNilaiAkurasiActionPerformed


    private void btnPecahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPecahActionPerformed
        if (this.DataUtuh.size() > 1) {
            if (LatihA.size() > 1 && LatihB.size() > 1 && LatihC.size() > 1) {
                int jawab = JOptionPane.showOptionDialog(this, "Yakin Ingin Membagi Data Kembali", "Bagi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (jawab == 0) {
                    this.PecahData(DataUtuh);
                    JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Pecah Menjadi 3 Data");
                }
            } else {
                this.PecahData(DataUtuh);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Pecah Menjadi 3 Data");
            }
//            System.out.println("\nLatih A");
//            this.printData(this.getLatihA());
//            System.out.println("\nLatih B");
//            this.printData(this.getLatihB());
//            System.out.println("\nLatih C");
//            this.printData(this.getLatihC());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Data Masih Kosong Kak");
        }
    }//GEN-LAST:event_btnPecahActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TableDataSemua tblSemua = new TableDataSemua(this, true,this.getLatihA(), this.getLatihB(), this.getLatihC());
        tblSemua.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void printData(ArrayList<Buah> data) {
        for (Buah buah : data) {
            System.out.println("Nama Label :" + buah.getLabel());
        }
    }

    private void dataBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBActionPerformed
        if (this.dataB.isSelected() && dataA.isSelected() || this.dataB.isSelected() && dataC.isSelected()) {
            btnGetUjiLatih.setEnabled(true);
        } else {
            btnGetUjiLatih.setEnabled(false);
        }
    }//GEN-LAST:event_dataBActionPerformed

    private void dataCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCActionPerformed
        if (this.dataC.isSelected() && dataA.isSelected() || this.dataC.isSelected() && dataB.isSelected()) {
            btnGetUjiLatih.setEnabled(true);
        } else {
            btnGetUjiLatih.setEnabled(false);
        }
    }//GEN-LAST:event_dataCActionPerformed

    private void dataAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAActionPerformed
        if (this.dataA.isSelected() && dataB.isSelected() || this.dataA.isSelected() && dataC.isSelected()) {
            btnGetUjiLatih.setEnabled(true);
        } else {
            btnGetUjiLatih.setEnabled(false);
        }
    }//GEN-LAST:event_dataAActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel akurasiUjiA;
    private javax.swing.JLabel akurasiUjiB;
    private javax.swing.JLabel akurasiUjiC;
    private javax.swing.JButton btnBacaFile;
    private javax.swing.JButton btnGetUjiLatih;
    private javax.swing.JButton btnKnn;
    private javax.swing.JButton btnNilaiAkurasi;
    private javax.swing.JButton btnPecah;
    private javax.swing.JCheckBox dataA;
    private javax.swing.JCheckBox dataB;
    private javax.swing.JCheckBox dataC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelBenarUjiA;
    private javax.swing.JLabel labelBenarUjiB;
    private javax.swing.JLabel labelBenarUjiC;
    private javax.swing.JLabel labelNilaiAkurasiSemua;
    private javax.swing.JLabel labelSalahUjiA;
    private javax.swing.JLabel labelSalahUjiB;
    private javax.swing.JLabel labelSalahUjiC;
    private javax.swing.JLabel nama_path;
    private javax.swing.JTextField nilaiK;
    private javax.swing.JLabel nilaiLabelK;
    private javax.swing.ButtonGroup pilihUji;
    // End of variables declaration//GEN-END:variables
}
