/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management;
import java.io.File;
import project.management.Add_Employee;
import static project.management.Add_Employee.employee_id;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Tejaswini Kumar
 */

public class Employee1 extends javax.swing.JFrame {

    
    /**
     * Creates new form Employee1
     */
     /* public static String employee_name[]=new String[5];
        public static String employee_id[]=new String[5];
        public static String employee_domain[]=new String[5];*/
    public String path="F:\\Project_Management\\";
    public Employee1() {
        //initComponents();
            
        
    }
      public Employee1(String id) {
        initComponents();
            this.setSize(600, 600);


        jTextField1.setText(id);
        File folder=new File(path+id);
        File[] name = folder.listFiles();
        //name[0].getName();
      //    System.out.println(""+name[0].getName());
          jTextField2.setText(name[0].getName());
          File domain=new File(path+id+"\\"+name[0].getName());
        File[] domain1 = domain.listFiles();
        jTextField3.setText(domain1[0].getName());
        
         File assigned_project=new File(path+id+"\\"+name[0].getName()+"\\"+domain1[0].getName());
        File[]  project= assigned_project.listFiles();
        System.out.println("hhhhhhhhhhhhhh"+project.length);
        jTextArea1.setText(project[0].getName());
//        if(project[1].getName()!=null)
//        {
//        jTextArea1.append("\n"+project[1].getName());
//        }
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jTextArea1.setEditable(false);

         path1=path+id+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName();


       
    }
   public String path1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Employee Page");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(166, 11, 127, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Messages");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(307, 167, 55, 23);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 45, 109, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 73, 109, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Assigned Project");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(172, 104, 95, 17);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 127, 429, 34);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(28, 196, 187, 114);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(233, 196, 198, 62);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 44, 39, 21);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 74, 39, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Daily Notifications");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(75, 167, 109, 23);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("DOMAIN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(242, 45, 82, 21);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(242, 72, 95, 20);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(97, 321, 57, 23);

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(307, 259, 57, 21);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(233, 306, 198, 44);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Received messages");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(233, 286, 90, 14);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/management/background.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 460, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents
      //public int y=0;
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        //System.out.println(Add_Employee.employee_id[0]);
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
                

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                   try {
               File assign_project=new File(path1+"\\new notifications.txt");
	        assign_project.createNewFile();
                if (assign_project.createNewFile()){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
                
                
                String path_notifications=path1+"\\new notifications.txt";

                 String notifications=jTextArea2.getText();
                       System.out.println(".............."+notifications);
		
                  PrintWriter printWriter=new PrintWriter(new FileWriter(path_notifications,true));
		  printWriter.write(notifications+"\r\n "+"\\ ");
		  printWriter.close();
                 
                  
	    
    	} catch (Exception e) {
	      e.printStackTrace();
	}
               try{
               File assign_project1=new File(path1+"\\notifications history.txt");
	        assign_project1.createNewFile();
                if (assign_project1.createNewFile()){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
                String path_notifications1=path1+"\\notifications history.txt";

                 String notifications=jTextArea2.getText();
                PrintWriter printWriter=new PrintWriter(new FileWriter(path_notifications1,true));
		  printWriter.write(notifications+"\r\n "+"\\ ");
		  printWriter.close();
               }
                catch (Exception e) {
	      e.printStackTrace();
                        
	}       
                   
                   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
	           
                   try {
                       
               File assign_project=new File(path1+"\\new messages.txt");
                if (assign_project.createNewFile()){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }

                 String message=jTextArea3.getText();
                       System.out.println(message);
		String message_path=path1+"\\new messages.txt";
                  PrintWriter printWriter=new PrintWriter(new FileWriter(message_path,true));
		  printWriter.write(message+"\r\n "+"\\ ");
		  printWriter.close();
                 
                   }
                   catch (Exception e) {
	      e.printStackTrace();
	}
                try {
                       
               File assign_project=new File(path1+"\\messages history.txt");
	        assign_project.createNewFile();
                if (assign_project.createNewFile()){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
                String message=jTextArea3.getText();
		String message_path=path1+"\\messages history.txt";
                  PrintWriter printWriter=new PrintWriter(new FileWriter(message_path,true));
		  printWriter.write(message+"\r\n "+"\\ ");
		  printWriter.close();
                }
                     catch (Exception e) {
	      e.printStackTrace();
	}
        
    }//GEN-LAST:event_jButton2ActionPerformed
                         public String path5="F:\\Project_Management\\";

    private void jTextArea4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea4AncestorAdded
        // TODO add your handling code here:
      /*  File folder2=new File(path5+jTextField1.getText());
	               File[] name1 = folder2.listFiles();
	                 System.out.println("after selected item name  "+name1[0]);
	                 
	               File domain_selected=new File(name1[0].toString());
	               System.out.println("\n"+name1[0].toString());
	               File[] domain2 = domain_selected.listFiles();
	               System.out.println("........................................................................................................................");
	               System.out.println(domain2[0]);
                       
	               File project_selected=new File(domain2[0].toString());
	               System.out.println("\n"+domain2[0].toString());
	               File[] project_selected1 = project_selected.listFiles();
                       
                  File Replied_msg=new File(project_selected1[0].toString()+"\\Replied messages.txt");
              */    
    }//GEN-LAST:event_jTextArea4AncestorAdded
    
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
            java.util.logging.Logger.getLogger(Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee1().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
