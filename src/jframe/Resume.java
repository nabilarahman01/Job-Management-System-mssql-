/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ariji
 */
public class Resume extends javax.swing.JFrame {

    public static String aid;
    /**
     * Creates new form SignupPage
     */
    public Resume(String appid) {
        initComponents();
        aid=appid;
        //System.out.println(aid);
        getResume();
        showimage();
    }
    
    private void showimage(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://NABILARAHMAN:1433;databaseName=ANJobs;selectMethod=cursor", "hello", "12345678");
            
            String qq="select applicantimage from applicant where applicantid="+aid;
            PreparedStatement pst= connection.prepareStatement(qq);
            ResultSet rs= pst.executeQuery();
            
            if(rs.next())
            {
                byte[] imagedata= rs.getBytes("applicantimage");
                
                ImageIcon ic= new ImageIcon(imagedata);
                Image image=ic.getImage();
                Image scaledimg= image.getScaledInstance(250,230, Image.SCALE_SMOOTH);
                imagelabel.setIcon(new ImageIcon(scaledimg));
            }
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    private void getResume(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://NABILARAHMAN:1433;databaseName=ANJobs;selectMethod=cursor", "hello", "12345678");
            
            String Jquery = " select * from Applicant where applicantid="+aid;
            PreparedStatement pst= connection.prepareStatement(Jquery);
            ResultSet rs= pst.executeQuery();
            
            while(rs.next())
            {
                jLabel8.setText(rs.getString("firstname"));
                jLabel7.setText(rs.getString("lastname"));
                jLabel18.setText(rs.getString("phonenumber"));
                jLabel15.setText(rs.getString("email"));
                jLabel4.setText(rs.getString("address"));
                jLabel39.setText(rs.getString("profile"));
            }
            
            String q2 = " select * from resume where applicantid="+aid;
            PreparedStatement p2= connection.prepareStatement(q2);
            ResultSet r2= p2.executeQuery();
            
            while(r2.next())
            {
                jLabel24.setText(r2.getString("SchoolName"));
                jLabel20.setText(r2.getString("sscyear"));
                jLabel23.setText(r2.getString("sscgrade"));
                jLabel27.setText(r2.getString("collegename"));
                jLabel28.setText(r2.getString("hscyear"));
                jLabel29.setText(r2.getString("hscgrade"));
                jLabel31.setText(r2.getString("uguniversity"));
                jLabel32.setText(r2.getString("gradyear"));
                jLabel33.setText(r2.getString("gradcg"));
                jLabel35.setText(r2.getString("pguniversity"));
                jLabel36.setText(r2.getString("pgyear"));
                jLabel37.setText(r2.getString("pgcg"));
                jLabel52.setText(r2.getString("skills"));
                jLabel41.setText(r2.getString("major"));
                jLabel56.setText(r2.getString("languages"));
                jLabel54.setText(r2.getString("extracurricular"));
                jLabel13.setText(r2.getString("interests"));
            }
            
            String q3 = " select * from experience where applicantid="+aid;
            PreparedStatement p3= connection.prepareStatement(q3);
            ResultSet r3= p3.executeQuery();
            
            while(r3.next())
            {
                jLabel59.setText(r3.getString("company"));
                jLabel60.setText(r3.getString("position"));
                jLabel61.setText(r3.getString("responsibilities"));
                jLabel48.setText(r3.getString("startdate")+"  to   "+ r3.getString("enddate"));
                
            }
            
             String q4 = " select * from reference where applicantid="+aid;
            PreparedStatement p4= connection.prepareStatement(q4);
            ResultSet r4= p4.executeQuery();
            
            if(r4.next())
            {
                jLabel67.setText(r4.getString("name"));
                jLabel68.setText(r4.getString("designation"));
                jLabel69.setText(r4.getString("email"));
                if(r4.next())
                {
                jLabel70.setText(r4.getString("name"));
                 jLabel71.setText(r4.getString("designation"));
                jLabel66.setText(r4.getString("email"));
                }
            }
            
             } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        imagelabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagelabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        jPanel4.add(imagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 250, 230));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 130, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 290, 40));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Interests");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 130, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 230, 60));

        jLabel8.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 220, 60));

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 60));

        jLabel57.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Last Name:");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 60));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 430, 140));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/address-icon-white-28.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 50, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("-");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 390, 70));

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 130, 40));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("-");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 290, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 400, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 400, -1));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 400, -1));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 400, -1));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 682, 430, 10));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("-");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 290, 40));

        jLabel19.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contact");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 40));

        jLabel22.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PHONE");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 800));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Major In");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 120, 60));

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Position:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 90, 50));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1110, -1));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        jLabel20.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("--");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 150, 40));

        jLabel23.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("-");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 60, 40));

        jLabel24.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("-");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 40));

        jLabel25.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("SSc");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, 40));

        jLabel26.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HSc");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, 40));

        jLabel27.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("-");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, 40));

        jLabel28.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("--");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 150, 40));

        jLabel29.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("-");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 60, 40));

        jLabel30.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("U.graduate");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 40));

        jLabel31.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("-");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 40));

        jLabel32.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("--");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 150, 40));

        jLabel33.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("-");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 60, 40));

        jLabel34.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("P.graduate");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 40));

        jLabel35.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("-");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 40));

        jLabel36.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("--");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 150, 40));

        jLabel37.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("-");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 60, 40));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 620, -1));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 630, -1));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 630, -1));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 640, -1));

        jLabel38.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Profile");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 40));

        jLabel39.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("--");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 960, 70));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 670, -1));

        jLabel40.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Skills");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 40));

        jLabel41.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("---");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 260, 80));

        jLabel42.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("---");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, 20, 50));

        jLabel44.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Responsibilities:");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, 50));

        jLabel45.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("year");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 70, 50));

        jLabel46.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("year");
        jPanel3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, 70, 50));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Reference");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        jLabel43.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("REfERENCE 2---");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 50));

        jLabel49.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("REfERENCE 1---");
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 50));
        jPanel5.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 10));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMAIL:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 30));

        jLabel62.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Designation: ");
        jPanel5.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));
        jPanel5.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 430, 10));

        jLabel63.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("NAME:");
        jPanel5.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        jLabel64.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Designation: ");
        jPanel5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 30));

        jLabel65.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("EMAIL:");
        jPanel5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 30));

        jLabel66.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("--");
        jPanel5.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        jLabel67.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("--");
        jPanel5.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 30));

        jLabel68.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("--");
        jPanel5.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, 30));

        jLabel69.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("--");
        jPanel5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        jLabel70.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("--");
        jPanel5.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 30));

        jLabel71.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("--");
        jPanel5.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 410, 390));

        jLabel47.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Experience");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 130, 40));

        jLabel48.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, 300, 50));
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));
        jPanel3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 162, -1, 360));
        jPanel3.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 152, 0, 380));

        jLabel50.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Skills");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 40));

        jLabel51.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Education");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));

        jLabel52.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("----");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 660, 70));

        jLabel53.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("ECA");
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 130, 40));

        jLabel54.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("--");
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 410, 60));

        jLabel55.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Language");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 130, 40));

        jLabel56.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("--");
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 390, 80));
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 80, -1));
        jPanel3.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 130, -1));
        jPanel3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel6.setText("Back");
        jLabel6.setFocusTraversalPolicyProvider(true);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 10, 150, 40));

        jLabel58.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Company Name:");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 140, 50));

        jLabel59.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 300, 50));

        jLabel60.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 300, 50));

        jLabel61.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, 300, 50));

        jLabel72.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel72.setText("BACK");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 140, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 1130, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 800));

        setSize(new java.awt.Dimension(1579, 848));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        // TODO add your handling code here:
        InterviewSetter set= new InterviewSetter();
        set.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel72MouseClicked

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
            java.util.logging.Logger.getLogger(Resume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resume(aid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagelabel;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
