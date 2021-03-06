/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Man of Steel
 */
public class DynamicForm extends javax.swing.JFrame {

    /**
     * Creates new form DynamicForm
     */
    public DynamicForm() {
        initComponents();
        setup();
        //try{Thread.sleep(1000);}catch(Exception e){}
        this.revalidate();
        this.repaint();
    }
    
    private void setup(){
        try{
            
            BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Project_Management\\Domain.txt")));
            String data = br.readLine();
            br.close();
           
            String[] domains = data.split(",");
            ArrayList<String> domainList = new ArrayList<>();
            
            for(String s : domains){
                s = s.trim();
                domainList.add(s);
            }
            
            //base_panel.setLayout(null);
            if(domainList.size()>0)
                {
            int x = base_panel.getX()+100, y = base_panel.getY()+100;
            System.out.println("Domains -> " + Arrays.toString(domains));
            
            
            
            for(String s : domains){
                JLabel label = new JLabel(s);
                JButton button = new JButton("Delete");
                
                label.setBounds(x, y, s.length()*10, 50);
                button.setBounds(x+label.getWidth()+100, y, 120, 50);
                y+= 150;
                
                button.addActionListener((ActionEvent e) -> {
                    //String[] copy = domains;                    
                    //int position;
                    //for(position = 0; !copy[position].equals(s); ++position);                    
                    //for(; position < copy.length-1; position++)
                        //copy[position] = copy[position+1];
                    //copy[copy.length-1] = "";
                    domainList.remove(s);
                    
                    try{
                       
                        if(domainList.size()>0)
                        {
                        PrintWriter p = new PrintWriter(new File("F:\\Project_Management\\Domain.txt"));
                        String dataToWrite = Arrays.toString(domainList.toArray());
                        p.write(dataToWrite.substring(1, dataToWrite.length()-1));
                        p.close();
                        
                        base_panel.removeAll();
                        setup();
                        }
                        else
                        {
                            System.out.println("ElsePart");
                         PrintWriter p = new PrintWriter(new File("F:\\Project_Management\\Domain.txt"));
                       // String dataToWrite = Arrays.toString(domainList.toArray());
                        p.write("");
                        p.close();
                             base_panel.removeAll();
                        setup();
                        }
                    }
                    catch(IOException ioe)
                    {
                        ioe.printStackTrace();
                    }
                });
                
                base_panel.add(label);
                base_panel.add(button); 
                
                //Thread.sleep(1000);
                
                base_panel.revalidate();
                base_panel.repaint();
                        
            }
                
            }
            
        }
        catch(Exception e){e.printStackTrace();}
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout base_panelLayout = new javax.swing.GroupLayout(base_panel);
        base_panel.setLayout(base_panelLayout);
        base_panelLayout.setHorizontalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        base_panelLayout.setVerticalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DynamicForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DynamicForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DynamicForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DynamicForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DynamicForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base_panel;
    // End of variables declaration//GEN-END:variables
}
