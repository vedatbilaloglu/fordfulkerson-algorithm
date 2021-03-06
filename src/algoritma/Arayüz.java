package algoritma;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Arayüz extends javax.swing.JFrame {

    static ArrayList<Integer> yeniArrayList = new ArrayList<>();
    ArrayList<Integer> pipeLineInfoList = new ArrayList<>();
    ArrayList<Integer> pipeLineKapasite = new ArrayList<>();
    static ArrayList<Integer> yollariAt = new ArrayList<>();
    static ArrayList<Integer> maksYollariAt = new ArrayList<>();
    static ArrayList<Integer> basmaSirasi = new ArrayList<>();
    int nodeSayisi = 0;
    int baslangicNodeBilgisi = 0, bitisNodeBilgisi = 0;
    static int sayac = 0, maksButtonSayac=0;
    static int maxFlowBilgisi;
    ArrayList<String> numbersString = new ArrayList<String>();
    boolean nodeNumberButtonClicked = false;
    boolean pipeLineInfoButtonClicked = false;
    boolean baslangicNodeButtonClicked = false;
    DefaultTableModel model;

    public Arayüz() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);
        JTableHeader header = table.getTableHeader();
        header.setForeground(Color.black);
        header.setFont(new Font("DialogInput", Font.BOLD, 18));

        table.setOpaque(true);
        table.setFillsViewportHeight(true);
        table.setBackground(Color.black);
        getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nodeNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        startField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        finishField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pipeLineButton = new javax.swing.JButton();
        pipeLineErrorLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kapasiteField = new javax.swing.JTextField();
        ileriButton = new javax.swing.JButton();
        ileriErrorLabel = new javax.swing.JLabel();
        nodeNumberButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        baslangicNode = new javax.swing.JTextField();
        baslangicNodeButton = new javax.swing.JButton();
        baslangicNodeErrorLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        bitisNode = new javax.swing.JTextField();
        bitisNodeButton = new javax.swing.JButton();
        bitisNodeErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Düğüm Sayisi:");

        nodeNumber.setBackground(new java.awt.Color(0, 0, 0));
        nodeNumber.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        nodeNumber.setForeground(new java.awt.Color(255, 255, 255));
        nodeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeNumberActionPerformed(evt);
            }
        });
        nodeNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nodeNumberKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Boru Hattı Bağlantı Bilgisi: ");

        startField.setBackground(new java.awt.Color(0, 0, 0));
        startField.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        startField.setForeground(new java.awt.Color(255, 255, 255));
        startField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Başlangıç Node:");

        finishField.setBackground(new java.awt.Color(0, 0, 0));
        finishField.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        finishField.setForeground(new java.awt.Color(255, 255, 255));
        finishField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                finishFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bitiş Node:");

        pipeLineButton.setBackground(new java.awt.Color(0, 0, 0));
        pipeLineButton.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        pipeLineButton.setForeground(new java.awt.Color(255, 255, 255));
        pipeLineButton.setText("Gönder");
        pipeLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeLineButtonActionPerformed(evt);
            }
        });

        pipeLineErrorLabel.setBackground(new java.awt.Color(255, 255, 255));
        pipeLineErrorLabel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        pipeLineErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Kapasite:");

        kapasiteField.setBackground(new java.awt.Color(0, 0, 0));
        kapasiteField.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        kapasiteField.setForeground(new java.awt.Color(255, 255, 255));
        kapasiteField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kapasiteFieldKeyTyped(evt);
            }
        });

        ileriButton.setBackground(new java.awt.Color(0, 0, 0));
        ileriButton.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        ileriButton.setForeground(new java.awt.Color(255, 255, 255));
        ileriButton.setText("İLERİ");
        ileriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ileriButtonActionPerformed(evt);
            }
        });

        ileriErrorLabel.setBackground(new java.awt.Color(255, 255, 255));
        ileriErrorLabel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        ileriErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        nodeNumberButton.setBackground(new java.awt.Color(0, 0, 0));
        nodeNumberButton.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        nodeNumberButton.setForeground(new java.awt.Color(255, 255, 255));
        nodeNumberButton.setText("Gönder");
        nodeNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeNumberButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Başlangıç Düğüm:");

        baslangicNode.setBackground(new java.awt.Color(0, 0, 0));
        baslangicNode.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        baslangicNode.setForeground(new java.awt.Color(255, 255, 255));
        baslangicNode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                baslangicNodeKeyTyped(evt);
            }
        });

        baslangicNodeButton.setBackground(new java.awt.Color(0, 0, 0));
        baslangicNodeButton.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        baslangicNodeButton.setForeground(new java.awt.Color(255, 255, 255));
        baslangicNodeButton.setText("Gönder");
        baslangicNodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslangicNodeButtonActionPerformed(evt);
            }
        });

        baslangicNodeErrorLabel.setBackground(new java.awt.Color(255, 255, 255));
        baslangicNodeErrorLabel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        baslangicNodeErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        table.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "fromNode", "toNode", "Kapasite"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Bitiş Düğüm:");

        bitisNode.setBackground(new java.awt.Color(0, 0, 0));
        bitisNode.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        bitisNode.setForeground(new java.awt.Color(255, 255, 255));
        bitisNode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bitisNodeKeyTyped(evt);
            }
        });

        bitisNodeButton.setBackground(new java.awt.Color(0, 0, 0));
        bitisNodeButton.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        bitisNodeButton.setForeground(new java.awt.Color(255, 255, 255));
        bitisNodeButton.setText("Gönder");
        bitisNodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitisNodeButtonActionPerformed(evt);
            }
        });

        bitisNodeErrorLabel.setBackground(new java.awt.Color(255, 255, 255));
        bitisNodeErrorLabel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        bitisNodeErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(finishField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(kapasiteField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pipeLineErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pipeLineButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(baslangicNode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nodeNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bitisNode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nodeNumberButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(baslangicNodeButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(baslangicNodeErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bitisNodeButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(bitisNodeErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(ileriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ileriErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nodeNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baslangicNodeErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(bitisNodeErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(baslangicNode)
                            .addComponent(jLabel9)
                            .addComponent(baslangicNodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(bitisNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bitisNodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pipeLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pipeLineErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finishField)
                    .addComponent(kapasiteField))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ileriErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ileriButton))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nodeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeNumberActionPerformed

    }//GEN-LAST:event_nodeNumberActionPerformed

    //Bu buton ile başlangıç ve bitiş nodeları girilince değerleri işletmek için kullandım.
    private void pipeLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeLineButtonActionPerformed

        if (nodeNumberButtonClicked) {
            pipeLineInfoButtonClicked = true;
            pipeLineErrorLabel.setText("");
            pipeLineInfoList.add(Integer.parseInt(startField.getText()));
            pipeLineInfoList.add(Integer.parseInt(finishField.getText()));
            pipeLineInfoList.add(Integer.parseInt(kapasiteField.getText()));    // Girilen boru hattı bilgilerini ArrayList içine attım.
            pipeLineKapasite.add(Integer.parseInt(kapasiteField.getText()));    // Girilen kapasite bilgilerini ArrayList içine attım.

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            model.insertRow(model.getRowCount(), new Object[]{startField.getText(), finishField.getText(), kapasiteField.getText()});

            startField.setText("");
            finishField.setText("");
            kapasiteField.setText("");  // Bir sonraki değer girmesi için başlangıç ve bitiş alanlarını boşalttım. 

        } else {
            pipeLineErrorLabel.setText("Önce Node Sayisini giriniz !"); // Node sayisi girilmemişse hata ekranda gösterilir.
        }
    }//GEN-LAST:event_pipeLineButtonActionPerformed

    private void nodeNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nodeNumberKeyTyped
        // Kullanıcı tarafından girilecek olan node sayisina sadece sayı girilmesini sağlamak için bu fonksiyonu kullandım.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_nodeNumberKeyTyped

    private void startFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startFieldKeyTyped
        // Kullanıcı tarafından girilecek olan başlangıç kenara sadece sayı girilmesini sağlamak için bu fonksiyonu kullandım.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_startFieldKeyTyped

    private void finishFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finishFieldKeyTyped
        // Kullanıcı tarafından girilecek olan bitiş kenarına sadece sayı girilmesini sağlamak için bu fonksiyonu kullandım.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_finishFieldKeyTyped

    private void kapasiteFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kapasiteFieldKeyTyped
        // Kullanıcı tarafından girilecek olan kapasite bilgisine sadece sayı girilmesini sağlamak için bu fonksiyonu kullandım.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_kapasiteFieldKeyTyped

    private void nodeNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeNumberButtonActionPerformed
        // Kullanıcı tarafından girilen node sayısını bu butonun vasıtasıyla integer ifadeye çevirdim.
        nodeNumberButtonClicked = true;
        nodeSayisi = Integer.parseInt(nodeNumber.getText());
    }//GEN-LAST:event_nodeNumberButtonActionPerformed

    private void ileriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ileriButtonActionPerformed

        if (pipeLineInfoButtonClicked) { // Tüm işlemlerin sırasıyla gitmesi için ilerleye basmadan kenar girmesi için kontrol yaptım.

            ileriErrorLabel.setText("");

            MaxFlow mf = new MaxFlow(nodeSayisi, bitisNodeBilgisi); // MaxFlow göstermek için bu classı çağırdım.
            MinCut mc = new MinCut(); // minCut'ı göstermek için bu classı çağırdım.

            for (int l = 0; l < pipeLineKapasite.size(); l++) { // Kullanıcı tarafından alınan kapasite bilgisi gösterilir.
                System.out.println(pipeLineKapasite.get(l));
            }
            for (int l = 0; l < pipeLineInfoList.size(); l++) { // Kullanıcı tarafından alınan kenar bilgileri ve 
                System.out.println(pipeLineInfoList.get(l));    // kenarların kapasite bilgileri burada gösterilir
            }

            int graph[][] = new int[nodeSayisi][nodeSayisi]; // Graph yapısını oluşturmadan önce tüm matris değerlerine 0 atadım.
            for (int i = 0; i < nodeSayisi; i++) {
                for (int j = 0; j < nodeSayisi; j++) {
                    graph[i][j] = 0;
                }
            }

            for (int k = 0; k < pipeLineInfoList.size(); k += 3) { // Graph içine koyacağımız kapasite bilgisini bu for ile sağlıyoruz.
                graph[pipeLineInfoList.get(k)][pipeLineInfoList.get(k + 1)] = pipeLineInfoList.get(k + 2);
            }

            for (int i = 0; i < nodeSayisi; i++) { // MaxFlow ve minCut classların hesaplanıcak graph yapısının son görüntüsünü bu for ile ekrana gösteriyoruz.
                for (int j = 0; j < nodeSayisi; j++) {
                    System.out.print(graph[i][j] + " ");
                }
                System.out.println();
            }
            

            yollariAt = mf.fordFulkerson(graph, baslangicNodeBilgisi, bitisNodeBilgisi);
            System.out.println("NEW The maximum possible flow is " + yollariAt.get(yollariAt.size() - 1));

            try {
                maxFlowBilgisi = Arayüz.yollariAt.get(Arayüz.yollariAt.size() - 1);
                Arayüz.yollariAt.remove(Arayüz.yollariAt.size() - 1); // yollariAt arrayListinin son elemanı maksimum flow sayısını attım.
                for (int i = 0; i < Arayüz.yollariAt.size(); i++) {
                    System.out.println(Arayüz.yollariAt.get(i));
                }
            } catch (Exception e) {
                System.out.println("hata burada: " + e);
            }

            System.out.println("MaxFlow Bilgisi: " + maxFlowBilgisi);
            System.out.println("baslangic node: " + baslangicNode);

            for (int k = 0; k < Arayüz.yollariAt.size(); k++) {
                try {
                    if (k == 0) {
                        maksYollariAt.add(Arayüz.yollariAt.get(k));
                        maksYollariAt.add(Arayüz.yollariAt.get(k + 1));
                        System.out.println("k:" + k);
                        System.out.println("maks 1. eleman: " + maksYollariAt.get(k));
                        System.out.println("maks 1. eleman: " + maksYollariAt.get(k + 1));
                        //gfx.drawLine(nodeKordinatTut.get(maksYollariAt.get(k)*2)+nodeSize, nodeKordinatTut.get((maksYollariAt.get(k)*2)+1)+nodeSize, nodeKordinatTut.get(maksYollariAt.get(k+1)*2)+nodeSize, nodeKordinatTut.get((maksYollariAt.get(k+1)*2)+1)+nodeSize);
                    } else {
                        if ((Arayüz.yollariAt.get(k + 1) != baslangicNodeBilgisi) && ((k + 1) != Arayüz.yollariAt.size() - 1)) {
                            maksYollariAt.add(Arayüz.yollariAt.get(k));
                            maksYollariAt.add(Arayüz.yollariAt.get(k + 1));

                            System.out.println("k:" + k);
                            System.out.println("maks 1. eleman: " + maksYollariAt.get(k));
                            System.out.println("maks 1. eleman: " + maksYollariAt.get(k + 1));
                            //gfx.drawLine(nodeKordinatTut.get(maksYollariAt.get(k)*2)+nodeSize, nodeKordinatTut.get((maksYollariAt.get(k)*2)+1)+nodeSize, nodeKordinatTut.get(maksYollariAt.get(k+1)*2)+nodeSize, nodeKordinatTut.get((maksYollariAt.get(k+1)*2)+1)+nodeSize);
                        } else {
                            if ((k + 1) == Arayüz.yollariAt.size() - 1) {
                                maksYollariAt.add(Arayüz.yollariAt.get(k));
                                maksYollariAt.add(Arayüz.yollariAt.get(k + 1));
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

            System.out.println("maks yollari at size(): " + maksYollariAt.size());
            System.out.println("*************** Maks Yollari At Calisiyor **********");
            for (int i = 0; i < maksYollariAt.size(); i += 2) {
                System.out.println(maksYollariAt.get(i) + "  " + maksYollariAt.get(i + 1));
                if(maksYollariAt.get(i) == baslangicNodeBilgisi){
                    sayac++;
                    basmaSirasi.add(i);
                }
                
            }
            for (int i = 0; i < basmaSirasi.size(); i++) {
                System.out.println("basma Sirasi: " + basmaSirasi.get(i));
            }

            yeniArrayList = mc.minCut(graph, baslangicNodeBilgisi, bitisNodeBilgisi); // Burada minCut classı ile bağlantı kurularak geriye ArrayList yapısında değer döndürür.

            System.out.println("*******************");
            System.out.println("Atılması gereken köprü sayisi: " + yeniArrayList.size() / 2); // Kaç tane kenarın atılması gerektiğini burada ekrana gösteririz.
            for (int k = 0; k < yeniArrayList.size(); k += 2) { // Hangi kenarların olduklarını bu for yardımı ile gösterdim.
                System.out.println(yeniArrayList.get(k) + " - " + yeniArrayList.get(k + 1));
            }

            ArrayList<Integer> dest = new ArrayList<>();
            int sayac = 1;
            for (int j = 0; j < pipeLineInfoList.size(); j++) {
                if (sayac % 3 != 0) {
                    dest.add(pipeLineInfoList.get(j));
                    sayac++;
                } else {
                    sayac = 1;
                }
            }

            System.out.println("************");
            for (int j = 0; j < dest.size(); j++) {  // Yukarıda yaptığın for işlemlerinin doğru çalışıp çalışmadığını burada kontrol ettim.
                System.out.println("dest: " + dest.get(j));
            }
            System.out.println("**************");

            System.out.println("************");
            for (int j = 0; j < pipeLineInfoList.size(); j++) {  // Yukarıda yaptığın for işlemlerinin doğru çalışıp çalışmadığını burada kontrol ettim.
                System.out.println("pipeLineInfo: " + pipeLineInfoList.get(j));
            }

            System.out.println("**************");

            Screen screen = new Screen(nodeSayisi, dest, pipeLineKapasite, baslangicNodeBilgisi, bitisNodeBilgisi); // Diğer ekrana constructor ile bilgileri gönderdim.
            this.setVisible(false);
            screen.pack();
            screen.setVisible(true); // Bu ekranı kapatıp diğer ekrana geçiş yaptım.

        } else {
            ileriErrorLabel.setText("Boru Hattı Bilgisi Giriniz"); // Eğer işlemler atlanmışsa ekrana hata mesajı gösterilir.
        }
    }//GEN-LAST:event_ileriButtonActionPerformed

    private void baslangicNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslangicNodeButtonActionPerformed
        if (nodeNumberButtonClicked) {
            baslangicNodeBilgisi = Integer.parseInt(baslangicNode.getText()); // Baslangic node bilgisini kullanıcıdan alıp integera donusturdum.
            baslangicNodeErrorLabel.setText("");
        } else {
            baslangicNodeErrorLabel.setText("Musluk sayisini giriniz");
        }

        if (nodeSayisi <= baslangicNodeBilgisi || (nodeSayisi - baslangicNodeBilgisi) <= 1) {
            baslangicNodeErrorLabel.setText("Lütfen uygun girişler yapin");
        } else {
            baslangicNodeErrorLabel.setText("");
        }

    }//GEN-LAST:event_baslangicNodeButtonActionPerformed

    private void baslangicNodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_baslangicNodeKeyTyped
        // Kullanıcı tarafından girilecek olan baslangic node sayısının girilmesini sağlamak için bu fonksiyonu kullandım.
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_baslangicNodeKeyTyped

    private void bitisNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitisNodeButtonActionPerformed

        if (nodeNumberButtonClicked) {
            bitisNodeBilgisi = Integer.parseInt(bitisNode.getText()); // Baslangic node bilgisini kullanıcıdan alıp integera donusturdum.
            bitisNodeErrorLabel.setText("");
        } else {
            baslangicNodeErrorLabel.setText("Musluk sayisini giriniz");
        }

        if (nodeSayisi <= bitisNodeBilgisi || (nodeSayisi - bitisNodeBilgisi) == 0) {
            bitisNodeErrorLabel.setText("Lütfen uygun girişler yapin");
        } else {
            bitisNodeErrorLabel.setText("");
        }
    }//GEN-LAST:event_bitisNodeButtonActionPerformed

    private void bitisNodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bitisNodeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_bitisNodeKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arayüz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baslangicNode;
    private javax.swing.JButton baslangicNodeButton;
    private javax.swing.JLabel baslangicNodeErrorLabel;
    private javax.swing.JTextField bitisNode;
    private javax.swing.JButton bitisNodeButton;
    private javax.swing.JLabel bitisNodeErrorLabel;
    private javax.swing.JTextField finishField;
    private javax.swing.JButton ileriButton;
    private javax.swing.JLabel ileriErrorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kapasiteField;
    private javax.swing.JTextField nodeNumber;
    private javax.swing.JButton nodeNumberButton;
    private javax.swing.JButton pipeLineButton;
    private javax.swing.JLabel pipeLineErrorLabel;
    private javax.swing.JTextField startField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
