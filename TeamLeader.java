/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management;

import java.io.File;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.RandomAccessFile;

/**
 *
 * @author Tejaswini Kumar
 */
public class TeamLeader extends javax.swing.JFrame {

    /**
     * Creates new form TeamLeader
     */
    public TeamLeader() {
        initComponents();
        this.setSize(600, 600);
        jTextArea1.removeAll();
        jTextArea1.append("no new notifications");
        jTextArea4.removeAll();
        jTextArea4.append("no new messages");
        
        //this.setBounds(200, 200, 0, 0);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(403, 134, 0, 0);

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

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(10, 10, 310, 210);

        jButton4.setText("Seen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(110, 230, 57, 23);

        jTabbedPane1.addTab("Notifications", jPanel2);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Seen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Reply");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Received Messages");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Reply to messages");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 123, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(132, 132, 132))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Messages", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(190, 0, 330, 290);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("TEAM LEADER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 0, 130, 36);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 150, 119, 25);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Add Domain");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 80, 109, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Assign Projects");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(38, 218, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/management/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 540, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AvailableProjects p=new AvailableProjects();
                       setVisible(false);
                       p.setVisible(true);
                       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                              Domain d=new Domain();
                                setVisible(false);
                                d.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                            Add_Employee d=new Add_Employee();
                                setVisible(false);
                                d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public String path="F:\\Project_Management";
    File[] id;
    public String[]  notification_path=new String[5];
    private void jTextArea4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea4AncestorAdded
        // TODO add your handling code here:
        jTextArea4.removeAll();
         File folder=new File(path);
        File[] id = folder.listFiles();
        
        for(int i=0;i<id.length;i++)
        {
         File folder1=new File(path+"\\"+id[i].getName());
            System.out.println("........."+id[i].getName());

        File[] name = folder1.listFiles();
          System.out.println(""+name[0].getName()+"....."+folder1);
          
          
          File domain=new File(id[i]+"\\"+name[0].getName());
          System.out.println(domain);
        File[] domain1 = domain.listFiles();
        System.out.println("..."+domain1);
        System.out.println("...."+domain1[0].getName());
        
        
         File assigned_project=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName());
         System.out.println("..."+assigned_project);
        File[]  project= assigned_project.listFiles();
                System.out.println("...."+project[0].getName());

        File notifications_file=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName()+"\\new notifications.txt");
        File all_notifications_file=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName()+"\\notifications history.txt");

       BufferedReader br = null;
       notification_path[i]=notifications_file.toString();
        System.out.println(notifications_file);
         System.out.println(notifications_file.exists());
        try {
              jTextArea4.append("From:"+id[i].getName()+"-"+name[0].getName()+"\r\n");

            if (notifications_file.exists()) {
                br = new BufferedReader(new FileReader(notifications_file));
                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    jTextArea4.append(" "+sCurrentLine+"");
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //coping the same contents to all notifications file
         try {
            if (all_notifications_file.exists()) {
                br = new BufferedReader(new FileReader(all_notifications_file));
                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
         
        jTextArea4.append("\n\r \n\r");
        }
    }//GEN-LAST:event_jTextArea4AncestorAdded
 
    
    public String[] msg_file_path=new String[5];
    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:
        
         File folder=new File(path);
        File[] id = folder.listFiles();
        
        for(int i=0;i<id.length;i++)
        {
         File folder1=new File(path+"\\"+id[i].getName());
            System.out.println("........."+id[i].getName());

        File[] name = folder1.listFiles();
          System.out.println(""+name[0].getName()+"....."+folder1);
          
          
          File domain=new File(id[i]+"\\"+name[0].getName());
          System.out.println(domain);
        File[] domain1 = domain.listFiles();
        System.out.println("..."+domain1);
        System.out.println("...."+domain1[0].getName());
        
        
         File assigned_project=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName());
         System.out.println("..."+assigned_project);
        File[]  project= assigned_project.listFiles();
                System.out.println("...."+project[0].getName());

         File msg_file=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName()+"\\new messages.txt");
         File all_msg_file=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName()+"\\messages history.txt");

       BufferedReader br = null;
       msg_file_path[i]=msg_file.toString();
        System.out.println(msg_file);
         System.out.println(msg_file.exists());
        try {
           jTextArea1.append("From:"+id[i].getName()+"-"+name[0].getName()+"\r\n");

            if (msg_file.exists()) {
                br = new BufferedReader(new FileReader(msg_file));
                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    jTextArea1.append(" "+sCurrentLine+"");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            if (all_msg_file.exists()) {
                br = new BufferedReader(new FileReader(all_msg_file));
                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        jTextArea1.append("\n\r \n\r");
        }
    }//GEN-LAST:event_jTextArea1AncestorAdded
      
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                jTextArea4.removeAll();

       // System.out.println("msg_file_path..."+msg_file_path);
        System.out.println("notification_path"+notification_path[0]);
        System.out.println("notification_path[1)......"+notification_path[1]);
        File folder=new File(path);
        File[] id = folder.listFiles();
        for (int y = 0; y <id.length; y++) {
            //if (notification_path[y] != null) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(notification_path[y]));
                    if (br.readLine() == null) {
                        System.out.println("No errors, and file empty");
                    } 
                    
                    else {
                        //FileWriter a = new FileWriter(msg_file_path, false);
                        FileWriter b = new FileWriter(notification_path[y], false);
                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();

                }
                System.out.println("y"+y);
                
            
    }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         System.out.println("msg_file_path[y]"+msg_file_path[0]);
         System.out.println("msg_file_path[y]"+msg_file_path[1]);
          
        File folder=new File(path);
        File[] id = folder.listFiles();
        for (int y = 0; y <id.length; y++) {
          System.out.println(".........."+id.length);
                try {
                    BufferedReader br = new BufferedReader(new FileReader(msg_file_path[y]));
                    if (br.readLine() == null) {
                        System.out.println("No errors, and file empty");
                    } 
                    
                    else {
                        //FileWriter a = new FileWriter(msg_file_path, false);
                        FileWriter k = new FileWriter(msg_file_path[y], false);
                        System.out.println("file will be emptied");

                    }
                } 
                catch (Exception e) {
                    e.printStackTrace();

                }
                System.out.println("y"+y);
                
            
    }
        
        jTextArea1.removeAll();
        
    }//GEN-LAST:event_jButton5ActionPerformed
                public  String list_id_string[]=new String[7];
                public  String list_name_string[]=new String[7];
             public String path5="F:\\Project_Management\\";
            // public String[] path_compilation=new String[7];

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
	            File folder=new File("F:\\Project_Management");
	        File[] list_of_id = folder.listFiles();

	           for (int i = 0; i < list_of_id.length; i++) {
                if (list_of_id[i].isFile()) {
                    System.out.println("File " + list_of_id[i].getName());
                } else if (list_of_id[i].isDirectory()) {
                    list_id_string[i] = list_of_id[i].getName();
                    System.out.println("list_id_string[i]" + list_id_string[i]);
                }

                //System.err.println(".............................");
            }

            for (int y = 0; y < list_of_id.length; y++) {
                File folder1 = new File(path5 + list_id_string[y]);
              //  path_compilation[y]=path5 + list_id_string[y];
              //  System.out.println("path_compilation[y]"+path_compilation[y]);
                System.out.println("......path + list_id_string[y]"+path5 + list_id_string[y]);
                File[] name = folder1.listFiles();

                list_name_string[y] = list_id_string[y] + "-" + name[0].getName();
               System.out.println("list_name_string" + list_name_string[y]);

            }

            JList list = new JList(list_name_string);
            JOptionPane.showMessageDialog(null, list, "Choose: employee ID-NAME", JOptionPane.PLAIN_MESSAGE, null);
            System.out.println(".................................");
            String selected = list.getSelectedValue().toString();
            System.out.println("selected" + selected);
            String[] selected_id_assignment = selected.split("-");
            System.out.println("selected id" + selected_id_assignment[0]);
            System.out.println(path5 + selected_id_assignment[0]);
            ////////////////////////////////////////////////////
                       File folder2=new File(path5+selected_id_assignment[0]);
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
                       
                  File Replied_msg=new File(project_selected1[0].toString()+"\\"+"Replied messages.txt");
	               System.out.println(Replied_msg);
                       
                       Replied_msg.createNewFile();
                if (Replied_msg.createNewFile()){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
                String path_replied_msg=project_selected1[0].toString()+"\\"+"Replied messages.txt";
                String notifications=jTextArea2.getText();
                       System.out.println(".............."+notifications);
		
                  PrintWriter printWriter=new PrintWriter(new FileWriter(path_replied_msg,true));
		  printWriter.write(notifications+"\r\n "+"\\ ");
		  printWriter.close();
	        
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamLeader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
