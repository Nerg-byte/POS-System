/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package posMenus;


import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import posControllers.mainFrame;
import posControllers.KeyControllers;
import posControllers.DBControllers;
import posControllers.DBMethods;
import posClasses.EmployeeModel;
import posClasses.OrderModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;


public class CashierPanel extends javax.swing.JPanel {

    DBMethods db = new DBMethods();
    private final mainFrame parent;
    public static int previousTabIndex = 0;
   
    boolean OrderConfirmed = false;
    
    
    
    public CashierPanel(mainFrame parent) {
        this.parent = parent;
        initComponents();
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        LogoutButton1 = new javax.swing.JButton();
        TabbedPane = new javax.swing.JTabbedPane();
        Panel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        listOfOrders = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        ShowReceipt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        YumBurger = new javax.swing.JButton();
        JollySphagetti = new javax.swing.JButton();
        ChickenJoy = new javax.swing.JButton();
        menu2quantity = new javax.swing.JLabel();
        menu3quantity = new javax.swing.JLabel();
        menu1quantity = new javax.swing.JLabel();
        BurgerSteak = new javax.swing.JButton();
        menu4quantity = new javax.swing.JLabel();
        CheeseBurger = new javax.swing.JButton();
        menu5quantity = new javax.swing.JLabel();
        SteakSphagChicken = new javax.swing.JButton();
        menu6quantity = new javax.swing.JLabel();
        Palabok = new javax.swing.JButton();
        menu7quantity = new javax.swing.JLabel();
        JollyHotdog = new javax.swing.JButton();
        menu8quantity = new javax.swing.JLabel();
        Fries = new javax.swing.JButton();
        menu9quantity = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Change = new javax.swing.JLabel();
        PrintReceipt = new javax.swing.JButton();
        PayOrder = new javax.swing.JButton();
        cashPayment = new javax.swing.JTextField();
        Button7 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        CLRButton = new javax.swing.JButton();
        DELButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        deleteItms = new javax.swing.JButton();
        DotButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        LogoutButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        empIDfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fnamefield = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lnamefield = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PositionBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesReport = new javax.swing.JTable();
        GenerateReport = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fromField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        productField = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cashierField = new javax.swing.JComboBox<>();
        toField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        orderIDField = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        LogoutButton1.setBackground(new java.awt.Color(255, 102, 102));
        LogoutButton1.setText("LOG OUT");
        LogoutButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton1ActionPerformed(evt);
            }
        });

        TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabbedPaneStateChaned(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(255, 204, 204));

        listOfOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM", "QUANTITY", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listOfOrders.setFocusable(false);
        jScrollPane21.setViewportView(listOfOrders);

        ShowReceipt.setEditable(false);
        ShowReceipt.setColumns(20);
        ShowReceipt.setRows(5);
        ShowReceipt.setFocusable(false);
        jScrollPane22.setViewportView(ShowReceipt);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane22)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
        );

        YumBurger.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\yumburger.jpg")); // NOI18N
        YumBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YumBurgerActionPerformed(evt);
            }
        });

        JollySphagetti.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\spaghetti.jpg")); // NOI18N
        JollySphagetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JollySphagettiActionPerformed(evt);
            }
        });

        ChickenJoy.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\chickenjoy.jpg")); // NOI18N
        ChickenJoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenJoyActionPerformed(evt);
            }
        });

        menu2quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu2quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu2quantity.setText("0");

        menu3quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu3quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu3quantity.setText("0");

        menu1quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu1quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu1quantity.setText("0");

        BurgerSteak.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\burgersteak.jpg")); // NOI18N
        BurgerSteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgerSteakActionPerformed(evt);
            }
        });

        menu4quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu4quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu4quantity.setText("0");

        CheeseBurger.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\cheeseburger.jpg")); // NOI18N
        CheeseBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheeseBurgerActionPerformed(evt);
            }
        });

        menu5quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu5quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu5quantity.setText("0");

        SteakSphagChicken.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\chickenspaghetti.jpg")); // NOI18N
        SteakSphagChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SteakSphagChickenActionPerformed(evt);
            }
        });

        menu6quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu6quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu6quantity.setText("0");

        Palabok.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\palabok.jpg")); // NOI18N
        Palabok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabokActionPerformed(evt);
            }
        });

        menu7quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu7quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu7quantity.setText("0");

        JollyHotdog.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\cheesehotdog.jpg")); // NOI18N
        JollyHotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JollyHotdogActionPerformed(evt);
            }
        });

        menu8quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu8quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu8quantity.setText("0");

        Fries.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rikuu\\Desktop\\project-main\\project-main\\test\\[ocs\\fries.jpg")); // NOI18N
        Fries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriesActionPerformed(evt);
            }
        });

        menu9quantity.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menu9quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu9quantity.setText("0");

        LogoutButton.setBackground(new java.awt.Color(255, 102, 102));
        LogoutButton.setText("LOG OUT");
        LogoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ChickenJoy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(YumBurger))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu1quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu2quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JollySphagetti)
                            .addComponent(menu3quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BurgerSteak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menu4quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu5quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menu6quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CheeseBurger)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SteakSphagChicken)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Palabok)
                            .addComponent(menu7quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu8quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu9quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JollyHotdog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fries)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ChickenJoy)
                    .addComponent(JollySphagetti)
                    .addComponent(YumBurger))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu1quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu2quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu3quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BurgerSteak)
                    .addComponent(SteakSphagChicken)
                    .addComponent(CheeseBurger))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu4quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu5quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu6quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Palabok)
                    .addComponent(Fries)
                    .addComponent(JollyHotdog))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu7quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu8quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu9quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Cash:");

        totalPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        totalPrice.setText("0");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Change:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Total:");

        Change.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Change.setText("0");

        PrintReceipt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintReceipt.setText("Print");
        PrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintReceiptActionPerformed(evt);
            }
        });

        PayOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PayOrder.setText("Pay");
        PayOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayOrderActionPerformed(evt);
            }
        });

        cashPayment.setEditable(false);
        cashPayment.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Button7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button7.setText("7");
        Button7.setFocusable(false);
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button4.setText("4");
        Button4.setFocusable(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button1.setText("1");
        Button1.setFocusable(false);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button5.setText("5");
        Button5.setFocusable(false);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button8.setText("8");
        Button8.setFocusable(false);
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button2.setText("2");
        Button2.setFocusable(false);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button9.setText("9");
        Button9.setFocusable(false);
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button6.setText("6");
        Button6.setFocusable(false);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button3.setText("3");
        Button3.setFocusable(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        CLRButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CLRButton.setText("CLR");
        CLRButton.setFocusable(false);
        CLRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLRButtonActionPerformed(evt);
            }
        });

        DELButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DELButton.setText("DEL");
        DELButton.setFocusable(false);
        DELButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELButtonActionPerformed(evt);
            }
        });

        OKButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OKButton.setText("OK");
        OKButton.setFocusable(false);
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        Button0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button0.setText("0");
        Button0.setFocusable(false);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        deleteItms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteItms.setText("Delete");
        deleteItms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItmsActionPerformed(evt);
            }
        });

        DotButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DotButton.setText(".");
        DotButton.setFocusable(false);
        DotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(PayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrintReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteItms)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CLRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DELButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CLRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DELButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(totalPrice))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(cashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(Change)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PrintReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deleteItms))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        TabbedPane.addTab("Order", Panel1);

        Panel2.setBackground(new java.awt.Color(255, 102, 102));

        jPanel8.setBackground(new java.awt.Color(218, 161, 161));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        LogoutButton2.setBackground(new java.awt.Color(255, 102, 102));
        LogoutButton2.setText("LOG OUT");
        LogoutButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LogoutButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setText("Search");
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        EmployeeTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EmployeeTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee I.D.", "First Name", "Last Name", "Role", "Username", "Password"
            }
        ));
        EmployeeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(EmployeeTable);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Employee I.D:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("First Name:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Last Name:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Position:");

        PositionBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PositionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Cashier" }));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Username:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Password:");

        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PositionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(empIDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fnamefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(90, 90, 90)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(359, 359, 359)
                                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(empIDfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(fnamefield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(lnamefield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(PositionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TabbedPane.addTab("Employees", jPanel2);

        Panel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SALES REPORT");

        salesReport.setBackground(new java.awt.Color(204, 204, 204));
        salesReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salesReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Product Name", "Quantity Sold", "Total Price", "Date Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesReport.setFocusable(false);
        jScrollPane1.setViewportView(salesReport);

        GenerateReport.setText("Generate Report");
        GenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("From:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("To:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("FILTER BY:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Cashier:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Product:");

        productField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Date:");

        cashierField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("OrderID:");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addComponent(GenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cashierField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromField)
                            .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel3Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(106, 106, 106))))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel12))
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10)
                                .addComponent(cashierField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(productField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))))
        );

        TabbedPane.addTab("Sales Report", Panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPane)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteItmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItmsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) listOfOrders.getModel();
        int selectedRow = listOfOrders.getSelectedRow();
        if (selectedRow >= 0){
            String itemName = dt.getValueAt(selectedRow, 1).toString();
            dt.removeRow(selectedRow);

            switch(itemName) {
                case "CKNWDRNK":
                menu1quantity.setText("0");
                break;
                case "BRGWDRNK":
                menu2quantity.setText("0");
                break;
                case "SPGWDRNK":
                menu3quantity.setText("0");
                break;
                case "DBLSTKWDRNK":
                menu4quantity.setText("0");
                break;
                case "CHSBRGRWDRNK":
                menu5quantity.setText("0");
                break;
                case "SPGSTKCKNCMB":
                menu6quantity.setText("0");
                break;
                case "PLBKWDRNK":
                menu7quantity.setText("0");
                break;
                case "CHSHTDGWDRNK":
                menu8quantity.setText("0");
                break;
                case "RGLRFRS":
                menu9quantity.setText("0");
                break;
            }
            KeyControllers.updateTotal(listOfOrders, totalPrice);
        }
        else {
            JOptionPane.showMessageDialog(this, "Select an item to remove");
        }
    }//GEN-LAST:event_deleteItmsActionPerformed

    private void YumBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YumBurgerActionPerformed
        // TODO add your handling code here:
        //AddToQntty(JLabel menuQntty)
        KeyControllers.AddToQntty(menu2quantity);
        KeyControllers.addtable(2, "BRGWDRNK", Integer.parseInt(menu2quantity.getText()), 79, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_YumBurgerActionPerformed

    private void JollySphagettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JollySphagettiActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu3quantity);
        KeyControllers.addtable(3, "SPGWDRNK", Integer.parseInt(menu3quantity.getText()), 84, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_JollySphagettiActionPerformed

    private void ChickenJoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenJoyActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu1quantity);
        KeyControllers.addtable(1, "CKNWDRNK", Integer.parseInt(menu1quantity.getText()), 101, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_ChickenJoyActionPerformed

    private void BurgerSteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgerSteakActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu4quantity);
        KeyControllers.addtable(4, "DBLSTKWDRNK", Integer.parseInt(menu4quantity.getText()), 167, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_BurgerSteakActionPerformed

    private void CheeseBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheeseBurgerActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu5quantity);
        KeyControllers.addtable(5, "CHSBRGRWDRNK", Integer.parseInt(menu5quantity.getText()), 95, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_CheeseBurgerActionPerformed

    private void SteakSphagChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SteakSphagChickenActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu6quantity);
        KeyControllers.addtable(6, "SPGSTKCKNCMB", Integer.parseInt(menu6quantity.getText()), 227, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_SteakSphagChickenActionPerformed

    private void PalabokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabokActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu7quantity);
        KeyControllers.addtable(7, "PLBKWDRNK", Integer.parseInt(menu7quantity.getText()), 161, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_PalabokActionPerformed

    private void JollyHotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JollyHotdogActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu8quantity);
        KeyControllers.addtable(8, "CHSHTDGWDRNK", Integer.parseInt(menu8quantity.getText()), 95, listOfOrders, totalPrice);
        
    }//GEN-LAST:event_JollyHotdogActionPerformed

    private void FriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriesActionPerformed
        // TODO add your handling code here:
        KeyControllers.AddToQntty(menu9quantity);
        KeyControllers.addtable(9, "RGLRFRS", Integer.parseInt(menu9quantity.getText()), 60, listOfOrders, totalPrice);
    }//GEN-LAST:event_FriesActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        KeyControllers.Logout(parent, Panel1, parent.getSession());
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void PrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintReceiptActionPerformed
        if(OrderConfirmed){
            KeyControllers.PrintReceipt(listOfOrders, totalPrice, cashPayment, Change, ShowReceipt, parent.getSession());
            OrderConfirmed = false;
        } else {
            JOptionPane.showMessageDialog(parent, "Confirm payment first");
        }
    }//GEN-LAST:event_PrintReceiptActionPerformed

    private void PayOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayOrderActionPerformed
        // TODO add your handling code here:
        int confirm = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Are you sure to confirm this order?",
            "Confirm?",
            javax.swing.JOptionPane.YES_NO_OPTION
        );
        
        if(listOfOrders.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "The table is empty!");
        }
        
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            double cashAmount = Double.parseDouble(cashPayment.getText());
            double totalAmount = Double.parseDouble(totalPrice.getText());
            if(!(totalAmount > cashAmount)){
                double change = cashAmount - totalAmount;
                Change.setText(String.valueOf(change));
                OrderConfirmed = true;
            } else{
                JOptionPane.showMessageDialog(parent, "Insufficient Funds");
            }
        }
        
    }//GEN-LAST:event_PayOrderActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"1",cashPayment);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"2",cashPayment);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"3",cashPayment);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"4",cashPayment);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"5",cashPayment);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"6",cashPayment);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"7",cashPayment);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"8",cashPayment);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"9",cashPayment);
    }//GEN-LAST:event_Button9ActionPerformed

    private void CLRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLRButtonActionPerformed
        KeyControllers.ClearInput(cashPayment);
    }//GEN-LAST:event_CLRButtonActionPerformed

    private void DELButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELButtonActionPerformed
        KeyControllers.Delete(cashPayment);
    }//GEN-LAST:event_DELButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        
    }//GEN-LAST:event_OKButtonActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),"0",cashPayment);
    }//GEN-LAST:event_Button0ActionPerformed

    private void GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportActionPerformed
        //db.loadTableDataItems(salesReport);
        db.filterSales(salesReport, orderIDField, fromField, toField, (JComboBox)cashierField, (JComboBox)productField);
    }//GEN-LAST:event_GenerateReportActionPerformed

    private void TabbedPaneStateChaned(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabbedPaneStateChaned
        KeyControllers.CheckForPermissions(TabbedPane, parent, parent.getSession());
        if(TabbedPane.getSelectedIndex()== 1){
            db.loadTableDataEmp(EmployeeTable);
        }
        if(TabbedPane.getSelectedIndex() == 2){
            db.loadTableDataItems(salesReport);
            db.prepareSales(productField, cashierField);
        }
    }//GEN-LAST:event_TabbedPaneStateChaned

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        KeyControllers.Logout(parent, Panel2, parent.getSession());
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void LogoutButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton2ActionPerformed
        KeyControllers.Logout(parent, Panel3, parent.getSession());
    }//GEN-LAST:event_LogoutButton2ActionPerformed

    private void DotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotButtonActionPerformed
        KeyControllers.ShowOnDisplay(cashPayment.getText(),".",cashPayment);
    }//GEN-LAST:event_DotButtonActionPerformed

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        db.loadEmpData(EmployeeTable, PositionBox, empIDfield, fnamefield, lnamefield, usernamefield, passwordfield);
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        empIDfield.setText("");
        fnamefield.setText("");
        lnamefield.setText("");
        usernamefield.setText("");
        passwordfield.setText("");
        EmployeeTable.clearSelection();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        db.deleteEmployee(EmployeeTable);
        db.loadTableDataEmp(EmployeeTable);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        db.updateEmployee(empIDfield, fnamefield, lnamefield, PositionBox, usernamefield, passwordfield, EmployeeTable);
        db.loadTableDataEmp(EmployeeTable);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        db.addEmployee(empIDfield, fnamefield, lnamefield, PositionBox, usernamefield, passwordfield, EmployeeTable);
        db.loadTableDataEmp(EmployeeTable);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        if(searchField.getText().trim().isEmpty()){
            db.loadTableDataEmp(EmployeeTable);
        }
        db.searchEmployee(EmployeeTable, searchField.getText());
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        if(searchField.getText().trim().isEmpty()){
            db.loadTableDataEmp(EmployeeTable);
        }
        db.searchEmployee(EmployeeTable, searchField.getText());
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        searchField.setText("");
    }//GEN-LAST:event_searchFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BurgerSteak;
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton CLRButton;
    private javax.swing.JLabel Change;
    private javax.swing.JButton CheeseBurger;
    private javax.swing.JButton ChickenJoy;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DELButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DotButton;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton Fries;
    private javax.swing.JButton GenerateReport;
    private javax.swing.JButton JollyHotdog;
    private javax.swing.JButton JollySphagetti;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton LogoutButton1;
    private javax.swing.JButton LogoutButton2;
    private javax.swing.JButton OKButton;
    private javax.swing.JButton Palabok;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton PayOrder;
    private javax.swing.JComboBox<String> PositionBox;
    private javax.swing.JButton PrintReceipt;
    private javax.swing.JTextArea ShowReceipt;
    private javax.swing.JButton SteakSphagChicken;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton YumBurger;
    private javax.swing.JTextField cashPayment;
    private javax.swing.JComboBox<String> cashierField;
    private javax.swing.JButton deleteItms;
    private javax.swing.JTextField empIDfield;
    private javax.swing.JTextField fnamefield;
    private javax.swing.JTextField fromField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JTable listOfOrders;
    private javax.swing.JTextField lnamefield;
    private javax.swing.JLabel menu1quantity;
    private javax.swing.JLabel menu2quantity;
    private javax.swing.JLabel menu3quantity;
    private javax.swing.JLabel menu4quantity;
    private javax.swing.JLabel menu5quantity;
    private javax.swing.JLabel menu6quantity;
    private javax.swing.JLabel menu7quantity;
    private javax.swing.JLabel menu8quantity;
    private javax.swing.JLabel menu9quantity;
    private javax.swing.JTextField orderIDField;
    private javax.swing.JTextField passwordfield;
    private javax.swing.JComboBox<String> productField;
    private javax.swing.JTable salesReport;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField toField;
    private javax.swing.JLabel totalPrice;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
