package com.mateusbisporamos.codechallengepwc;

import com.mateusbisporamos.codechallengepwc.CodeChallengePWC; // import dos métodos
import java.awt.Color;

public class MainView extends javax.swing.JFrame {
    
    public MainView() {
        initComponents();
        
        getContentPane().setBackground(new Color(13, 13, 13));
        
        txf_input_c1.setBackground(new Color(13, 13, 13));
        txf_input_c2.setBackground(new Color(13, 13, 13));
        txf_input_c3.setBackground(new Color(13, 13, 13));
        txf_input_c4.setBackground(new Color(13, 13, 13));
        txf_input_c5.setBackground(new Color(13, 13, 13));
        
        txf_output_c1.setBackground(new Color(13, 13, 13));
        txf_output_c2.setBackground(new Color(13, 13, 13));
        txf_output_c3.setBackground(new Color(13, 13, 13));
        txf_output_c4.setBackground(new Color(13, 13, 13));
        txf_output_c5.setBackground(new Color(13, 13, 13));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Challenge1 = new javax.swing.JPanel();
        title_c1 = new javax.swing.JTextPane();
        lab_input_c1 = new javax.swing.JLabel();
        txf_input_c1 = new javax.swing.JTextField();
        lab_output_c1 = new javax.swing.JLabel();
        txf_output_c1 = new javax.swing.JTextField();
        Challenge2 = new javax.swing.JPanel();
        title_c2 = new javax.swing.JTextPane();
        lab_input_c2 = new javax.swing.JLabel();
        txf_input_c2 = new javax.swing.JTextField();
        lab_output_c2 = new javax.swing.JLabel();
        txf_output_c2 = new javax.swing.JTextField();
        Challenge3 = new javax.swing.JPanel();
        title_c3 = new javax.swing.JTextPane();
        lab_input_c3 = new javax.swing.JLabel();
        txf_input_c3 = new javax.swing.JTextField();
        lab_output_c3 = new javax.swing.JLabel();
        txf_output_c3 = new javax.swing.JTextField();
        Challenge4 = new javax.swing.JPanel();
        title_c4 = new javax.swing.JTextPane();
        lab_input_c4 = new javax.swing.JLabel();
        txf_input_c4 = new javax.swing.JTextField();
        lab_output_c4 = new javax.swing.JLabel();
        txf_output_c4 = new javax.swing.JTextField();
        Challenge5 = new javax.swing.JPanel();
        title_c5 = new javax.swing.JTextPane();
        lab_input_c5 = new javax.swing.JLabel();
        txf_input_c5 = new javax.swing.JTextField();
        lab_output_c5 = new javax.swing.JLabel();
        txf_output_c5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desafio de Código PWC");
        setBackground(new java.awt.Color(13, 13, 13));
        setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(13, 13, 13));
        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setName("Desafio de Código PWC"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        Header.setBackground(new java.awt.Color(242, 172, 41));
        Header.setAlignmentY(0.0F);
        Header.setAutoscrolls(true);
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setMaximumSize(new java.awt.Dimension(500, 80));
        Header.setMinimumSize(new java.awt.Dimension(500, 80));
        Header.setPreferredSize(new java.awt.Dimension(500, 80));

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        title.setForeground(new java.awt.Color(13, 13, 13));
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Desafio de Código ");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        subtitle.setBackground(new java.awt.Color(0, 0, 0));
        subtitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        subtitle.setForeground(new java.awt.Color(13, 13, 13));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitle.setText("| MANIPULAÇÃO DE STRINGS");
        subtitle.setAlignmentY(0.3F);
        subtitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nirem\\OneDrive\\Área de Trabalho\\projects\\CodeChallengePWC\\src\\main\\res\\images\\pwc_logo.png")); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Challenge1.setBackground(new java.awt.Color(242, 172, 41));
        Challenge1.setMaximumSize(new java.awt.Dimension(400, 90));
        Challenge1.setMinimumSize(new java.awt.Dimension(400, 90));
        Challenge1.setPreferredSize(new java.awt.Dimension(400, 90));

        title_c1.setEditable(false);
        title_c1.setBackground(new java.awt.Color(242, 172, 41));
        title_c1.setBorder(null);
        title_c1.setForeground(new java.awt.Color(13, 13, 13));
        title_c1.setText("1. Reverta a ordem das palavras nas frases, mantendo a ordem das palavras:");
        title_c1.setCaretColor(new java.awt.Color(242, 172, 41));
        title_c1.setDisabledTextColor(new java.awt.Color(242, 172, 41));

        lab_input_c1.setForeground(new java.awt.Color(13, 13, 13));
        lab_input_c1.setText("input:");

        txf_input_c1.setForeground(new java.awt.Color(255, 255, 255));
        txf_input_c1.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_input_c1.setDisabledTextColor(new java.awt.Color(70, 73, 75));
        txf_input_c1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txf_input_c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_input_c1KeyReleased(evt);
            }
        });

        lab_output_c1.setForeground(new java.awt.Color(13, 13, 13));
        lab_output_c1.setText("output:");

        txf_output_c1.setEditable(false);
        txf_output_c1.setForeground(new java.awt.Color(255, 255, 255));
        txf_output_c1.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_output_c1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txf_output_c1.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Challenge1Layout = new javax.swing.GroupLayout(Challenge1);
        Challenge1.setLayout(Challenge1Layout);
        Challenge1Layout.setHorizontalGroup(
            Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_c1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(Challenge1Layout.createSequentialGroup()
                        .addGroup(Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Challenge1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lab_output_c1))
                            .addComponent(lab_input_c1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_input_c1)
                            .addComponent(txf_output_c1))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        Challenge1Layout.setVerticalGroup(
            Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_input_c1)
                    .addComponent(txf_input_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_output_c1)
                    .addComponent(txf_output_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Challenge2.setBackground(new java.awt.Color(242, 172, 41));
        Challenge2.setMaximumSize(new java.awt.Dimension(400, 90));
        Challenge2.setMinimumSize(new java.awt.Dimension(400, 90));
        Challenge2.setPreferredSize(new java.awt.Dimension(400, 90));

        title_c2.setEditable(false);
        title_c2.setBackground(new java.awt.Color(242, 172, 41));
        title_c2.setForeground(new java.awt.Color(13, 13, 13));
        title_c2.setText("2. Remova todos os caracteres repetidos da string abaixo:");

        lab_input_c2.setForeground(new java.awt.Color(13, 13, 13));
        lab_input_c2.setText("input:");

        txf_input_c2.setForeground(new java.awt.Color(255, 255, 255));
        txf_input_c2.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_input_c2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txf_input_c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_input_c2KeyReleased(evt);
            }
        });

        lab_output_c2.setForeground(new java.awt.Color(13, 13, 13));
        lab_output_c2.setText("output:");

        txf_output_c2.setEditable(false);
        txf_output_c2.setForeground(new java.awt.Color(255, 255, 255));
        txf_output_c2.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_output_c2.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Challenge2Layout = new javax.swing.GroupLayout(Challenge2);
        Challenge2.setLayout(Challenge2Layout);
        Challenge2Layout.setHorizontalGroup(
            Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_c2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(Challenge2Layout.createSequentialGroup()
                        .addGroup(Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Challenge2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lab_output_c2))
                            .addComponent(lab_input_c2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_input_c2)
                            .addComponent(txf_output_c2))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        Challenge2Layout.setVerticalGroup(
            Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_input_c2)
                    .addComponent(txf_input_c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_output_c2)
                    .addComponent(txf_output_c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Challenge3.setBackground(new java.awt.Color(242, 172, 41));
        Challenge3.setMaximumSize(new java.awt.Dimension(400, 90));
        Challenge3.setMinimumSize(new java.awt.Dimension(400, 90));
        Challenge3.setPreferredSize(new java.awt.Dimension(400, 90));

        title_c3.setEditable(false);
        title_c3.setBackground(new java.awt.Color(242, 172, 41));
        title_c3.setForeground(new java.awt.Color(13, 13, 13));
        title_c3.setText("3. Encontre a substring palindorma mais longa da string abaixo:");

        lab_input_c3.setForeground(new java.awt.Color(13, 13, 13));
        lab_input_c3.setText("input:");

        txf_input_c3.setForeground(new java.awt.Color(255, 255, 255));
        txf_input_c3.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_input_c3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txf_input_c3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_input_c3KeyReleased(evt);
            }
        });

        lab_output_c3.setForeground(new java.awt.Color(13, 13, 13));
        lab_output_c3.setText("output:");

        txf_output_c3.setEditable(false);
        txf_output_c3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Challenge3Layout = new javax.swing.GroupLayout(Challenge3);
        Challenge3.setLayout(Challenge3Layout);
        Challenge3Layout.setHorizontalGroup(
            Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_c3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(Challenge3Layout.createSequentialGroup()
                        .addGroup(Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Challenge3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lab_output_c3))
                            .addComponent(lab_input_c3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_input_c3)
                            .addComponent(txf_output_c3))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        Challenge3Layout.setVerticalGroup(
            Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_input_c3)
                    .addComponent(txf_input_c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_output_c3)
                    .addComponent(txf_output_c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Challenge4.setBackground(new java.awt.Color(242, 172, 41));
        Challenge4.setMaximumSize(new java.awt.Dimension(400, 90));
        Challenge4.setMinimumSize(new java.awt.Dimension(400, 90));
        Challenge4.setPreferredSize(new java.awt.Dimension(400, 90));

        title_c4.setEditable(false);
        title_c4.setBackground(new java.awt.Color(242, 172, 41));
        title_c4.setForeground(new java.awt.Color(13, 13, 13));
        title_c4.setText("4. Coloque em maiúscula a primeira letra de cada frase da string:");

        lab_input_c4.setForeground(new java.awt.Color(13, 13, 13));
        lab_input_c4.setText("input:");

        txf_input_c4.setForeground(new java.awt.Color(255, 255, 255));
        txf_input_c4.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_input_c4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txf_input_c4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_input_c4KeyReleased(evt);
            }
        });

        lab_output_c4.setForeground(new java.awt.Color(13, 13, 13));
        lab_output_c4.setText("output:");

        txf_output_c4.setEditable(false);
        txf_output_c4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Challenge4Layout = new javax.swing.GroupLayout(Challenge4);
        Challenge4.setLayout(Challenge4Layout);
        Challenge4Layout.setHorizontalGroup(
            Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_c4, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(Challenge4Layout.createSequentialGroup()
                        .addGroup(Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Challenge4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lab_output_c4))
                            .addComponent(lab_input_c4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_input_c4)
                            .addComponent(txf_output_c4))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        Challenge4Layout.setVerticalGroup(
            Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_input_c4)
                    .addComponent(txf_input_c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_output_c4)
                    .addComponent(txf_output_c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Challenge5.setBackground(new java.awt.Color(242, 172, 41));
        Challenge5.setMaximumSize(new java.awt.Dimension(400, 90));
        Challenge5.setMinimumSize(new java.awt.Dimension(400, 90));
        Challenge5.setPreferredSize(new java.awt.Dimension(400, 90));

        title_c5.setEditable(false);
        title_c5.setBackground(new java.awt.Color(242, 172, 41));
        title_c5.setForeground(new java.awt.Color(13, 13, 13));
        title_c5.setText("5. Verifique se a string é um anagrama de um palindromo:");

        lab_input_c5.setForeground(new java.awt.Color(13, 13, 13));
        lab_input_c5.setText("input:");

        txf_input_c5.setForeground(new java.awt.Color(255, 255, 255));
        txf_input_c5.setCaretColor(new java.awt.Color(255, 255, 255));
        txf_input_c5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txf_input_c5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_input_c5KeyReleased(evt);
            }
        });

        lab_output_c5.setForeground(new java.awt.Color(13, 13, 13));
        lab_output_c5.setText("output:");

        txf_output_c5.setEditable(false);
        txf_output_c5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Challenge5Layout = new javax.swing.GroupLayout(Challenge5);
        Challenge5.setLayout(Challenge5Layout);
        Challenge5Layout.setHorizontalGroup(
            Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_c5, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(Challenge5Layout.createSequentialGroup()
                        .addGroup(Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Challenge5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lab_output_c5))
                            .addComponent(lab_input_c5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_input_c5)
                            .addComponent(txf_output_c5))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        Challenge5Layout.setVerticalGroup(
            Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Challenge5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_input_c5)
                    .addComponent(txf_input_c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Challenge5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_output_c5)
                    .addComponent(txf_output_c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Challenge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Challenge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Challenge3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Challenge4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Challenge5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Challenge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Challenge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Challenge3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Challenge4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Challenge5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // método executado ao digitar no input do desafio 1
    private void txf_input_c1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_input_c1KeyReleased
        String str = txf_input_c1.getText(); // aramazena o texto do input na variável
        txf_output_c1.setText(CodeChallengePWC.stringInversion(str)); // insere o retorno da função no oputput
    }//GEN-LAST:event_txf_input_c1KeyReleased

    // método executado ao digitar no input do desafio 2
    private void txf_input_c2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_input_c2KeyReleased
        String str = txf_input_c2.getText(); // aramazena o texto do input na variável
        txf_output_c2.setText(CodeChallengePWC.removeDuplicates(str)); // insere o retorno da função no oputput
    }//GEN-LAST:event_txf_input_c2KeyReleased

    // método executado ao digitar no input do desafio 3
    private void txf_input_c3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_input_c3KeyReleased
        String str = txf_input_c3.getText(); // aramazena o texto do input na variável
        txf_output_c3.setText(CodeChallengePWC.palindromeSubstring(str)); // insere o retorno da função no oputput
    }//GEN-LAST:event_txf_input_c3KeyReleased

    // método executado ao digitar no input do desafio 4
    private void txf_input_c4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_input_c4KeyReleased
        String str = txf_input_c4.getText(); // aramazena o texto do input na variável
        txf_output_c4.setText(CodeChallengePWC.upperCase(str)); // insere o retorno da função no oputput
    }//GEN-LAST:event_txf_input_c4KeyReleased

    // método executado ao digitar no input do desafio 5
    private void txf_input_c5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_input_c5KeyReleased
        String str = txf_input_c5.getText(); // aramazena o texto do input na variável
        txf_output_c5.setText(Boolean.toString(CodeChallengePWC.isPalindrome(str))); // insere o retorno da função no oputput
    }//GEN-LAST:event_txf_input_c5KeyReleased

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Challenge1;
    private javax.swing.JPanel Challenge2;
    private javax.swing.JPanel Challenge3;
    private javax.swing.JPanel Challenge4;
    private javax.swing.JPanel Challenge5;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lab_input_c1;
    private javax.swing.JLabel lab_input_c2;
    private javax.swing.JLabel lab_input_c3;
    private javax.swing.JLabel lab_input_c4;
    private javax.swing.JLabel lab_input_c5;
    private javax.swing.JLabel lab_output_c1;
    private javax.swing.JLabel lab_output_c2;
    private javax.swing.JLabel lab_output_c3;
    private javax.swing.JLabel lab_output_c4;
    private javax.swing.JLabel lab_output_c5;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextPane title_c1;
    private javax.swing.JTextPane title_c2;
    private javax.swing.JTextPane title_c3;
    private javax.swing.JTextPane title_c4;
    private javax.swing.JTextPane title_c5;
    private javax.swing.JTextField txf_input_c1;
    private javax.swing.JTextField txf_input_c2;
    private javax.swing.JTextField txf_input_c3;
    private javax.swing.JTextField txf_input_c4;
    private javax.swing.JTextField txf_input_c5;
    private javax.swing.JTextField txf_output_c1;
    private javax.swing.JTextField txf_output_c2;
    private javax.swing.JTextField txf_output_c3;
    private javax.swing.JTextField txf_output_c4;
    private javax.swing.JTextField txf_output_c5;
    // End of variables declaration//GEN-END:variables
}
