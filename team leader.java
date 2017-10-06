 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        AvailableProjects p=new AvailableProjects();
                       setVisible(false);
                       p.setVisible(true);
                       
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                              Domain d=new Domain();
                                setVisible(false);
                                d.setVisible(true);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                            Add_Employee d=new Add_Employee();
                                setVisible(false);
                                d.setVisible(true);
    }                                        
    public String path="F:\\Project_Management";
    File[] id;
    public String[]  notification_path=new String[5];
    private void jTextArea4AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
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

        File notifications_file=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName()+"\\notifications.txt");
       BufferedReader br = null;
       notification_path[i]=notifications_file.toString();
        System.out.println(notifications_file);
         System.out.println(notifications_file.exists());
        jTextArea4.append("From:"+id[i].getName()+"-"+name[0].getName()+"\r\n");
        try {
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
        jTextArea4.append("\n\r \n\r");
        }
    }                                        
 
    
    public String[] msg_file_path=new String[5];
    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
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

         File msg_file=new File(id[i]+"\\"+name[0].getName()+"\\"+domain1[0].getName()+"\\"+project[0].getName()+"\\messages.txt");
       BufferedReader br = null;
       msg_file_path[i]=msg_file.toString();
        System.out.println(msg_file);
         System.out.println(msg_file.exists());
        jTextArea1.append("From:"+id[i].getName()+"-"+name[0].getName()+"\r\n");
        try {
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
        jTextArea1.append("\n\r \n\r");
        }
    }                                        
      
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
        
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
        
    }                                        

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

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration                   
}