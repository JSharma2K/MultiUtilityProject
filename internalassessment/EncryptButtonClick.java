/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment;



import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.*;

import javax.swing.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.apache.commons.codec.binary.Base64;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
/**
 *
 * @author jivitesh's PC
 */
public class EncryptButtonClick extends javax.swing.JFrame {

    /**
     * Creates new form EncryptButtonClick
     */
    public EncryptButtonClick() {
        initComponents();
    }
    public static Key generateKey() throws Exception {
        //secretkeyspec is used to create a scerekey the spec stands for specific meaning u wnat key of what alogirth eg AES,RSA,Des and creates key of thta algorithm
        //it takes a byte array as a parameter and then a start value and end value form eher it should start making the key and where it should end and then type of key it should create
        return new SecretKeySpec(keyValue, "AES");
    }         
    public void close(){
        WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 24, 24));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 165, 0), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 165, 0));
        jLabel2.setText("JSEncrypt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 95, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180), 3));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Click Button To Open File Navigator");

        jButton1.setForeground(new java.awt.Color(5, 5, 5));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/if_Location_18_1530070.png"))); // NOI18N
        jButton1.setText("Navigator");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/if_Map_-_Location_Solid_Style_18_2216363.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/internalassessment/if_Map_-_Location_Solid_Style_18_2216363.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("null")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JOptionPane.showMessageDialog(null,"Please choose a Word/.docx type file","Reminder",JOptionPane.INFORMATION_MESSAGE);
     
        JFileChooser SelectEncryptionFile=new JFileChooser();
        
            
                //open dialog mwthod opens the dialog box of JFile chooser
                //the method below required a int parametr here we juts put null
                int Value=SelectEncryptionFile.showOpenDialog(null);
                
                //the line belwo only shows the directories of the file as we are only working with directories
                //  Select.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                          try{
                    //we need a file input stream with parameter as the file selected by user through Jchooser and file input stream will read the data as bytes
                    //fileinputstream obtains input bytes from a file in a file system. and takes a file input in this case form the JFile chooser
                    ChosenFile= new FileInputStream (SelectEncryptionFile.getSelectedFile());
                        } catch (FileNotFoundException free){
                            System.out.print(free);
                            
                }
                //the if statemnet below says if the user clicks the open file option in the filechooser the...
                        try{
                       if(Value==JFileChooser.APPROVE_OPTION && !SelectEncryptionFile.getSelectedFile().getName().endsWith(".docx")){
                           JOptionPane.showMessageDialog(null,"The File "+ SelectEncryptionFile.getSelectedFile()+" is not a word file,Please choose another file.","Error",JOptionPane.ERROR_MESSAGE);
                   
                    }
                   else{System.out.println("");
                }
                        }catch(NotOfficeXmlFileException docu){}
                /*we could have use fileInputStream here instad of buffred reader but fileinputstraem read one byte at a time and i would like the program to read awhole line
                the buffred reader has an input stream reader as a parametr because to get a file we need an input straem and secondly beacuse we have to cast the fileInputStream objcet
                as a generic reader(input stream readr object) so buffrend reader can understand it
                */
               //input streamreader raeds bytes and turns them in to charactres and chosenfile was in byte format
                 try{    
                
                Document=new XWPFDocument(ChosenFile);
                extract= new XWPFWordExtractor(Document);
                Words=extract.getText();
                //AreaForText.setText(Words);
                
            }catch(IOException | NotOfficeXmlFileException docum){
            }
            
        
               /* List<XWPFParagraph> FetchParagraph=Document.getParagraphs();
                for(XWPFParagraph para:FetchParagraph){
                    String Paragraph=para.getText();
                }*/
               
               
               
               /* BufferedReader iterator=new BufferedReader(new InputStreamReader(ChosenFile));
                      
                        
                   
                         try{
                        while((ReadLine=iterator.readLine())!=null){
                            //this just adds the cureently read line to a string TextGoingToBeRead 
                            TextGoingToBeRead=TextGoingToBeRead+ReadLine;
                            try{
                            //next it reds the 2nd line,then 3rd etc...
                            ReadLine=iterator.readLine();
                        } catch(Exception oneMoreException){
                        }
                        //increse the count of the line so the same line is not raed everytime
                          
                    }
                     }catch(Exception ko){
                } 
                */
               
              
                    
                    try{
                    //belwo we store the key created using the generatekey method which  creats a secret key spec using the byte array we created called KeyValue
                     SecretKey = generateKey();
                
                    //the line below creates a cipher of AES type
                    //getInstance method takes the type of encryption ans input RSA,AES one can add padding i have not
                     encode = Cipher.getInstance("AES");
                          
                    //the line below intailizes the cipher and tells it to go into encrypt mode (can also be told to go into decrypt mode) 
                    //the 2nd parameter required a key input wheich we stored in variable secret key created by generateKey method
                    encode.init(Cipher.ENCRYPT_MODE, SecretKey);
                    //byte[] encVal = c.doFinal(TextGoingToBeRead.getBytes());
                    //line b
                
                   
                   
                  /*the do final method enxrpts the data in a single line or multi line operation it requires a byte input i have used getBytes to convert the String in to the byte 
                  and stored itin the byte variable ByteFormat which is an instance variable
                 
                  */
                  ByteFormat = encode.doFinal(Words.getBytes());
                  //the varible Stringform convers the encrypted byte data in ByteFormat to a string using encode To STring method
                  StringForm=Base64.encodeBase64String(ByteFormat);
                  //line belwo sets the text recieved form String Form to a text Arae in another class DisplayedEncryptedText
                  DisplayedEncryptedText DEncrypted= new DisplayedEncryptedText();
                  DEncrypted.setVisible(true);
                  DEncrypted.jTextArea1.setText(StringForm);
                  close();
                    
                }catch(Exception ErrorsThrown){
                }
               
                
                System.out.println();//+" " +Rea );
                
                //create TextArea get text from file set the recieved from file into text area using settext to see if program manages to read the whole file
                //if it does go on to encrytp the cocntent of the file and print the encrypted contenst in teh text area so one can easily see how much has been encrypted and save the stuff
                //into the file ready for decryption
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptButtonClick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EncryptButtonClick().setVisible(true);
        });
    }

    void setVisibele(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
   private FileInputStream ChosenFile;
  
    //the line Below Creates a byte the cipher will use for tocreate the key it has 16 characters because we are using 128bit AES encryption

  private static final byte[] keyValue = new byte[]{'T', 'h', 'e', 'B', 'e', 's', 't', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};
   private Key SecretKey;
   private Cipher encode;      
   private byte[] ByteFormat;
   private String StringForm;
   
   
   
   private XWPFDocument Document;
  
   private XWPFWordExtractor extract;
   private String Words;
   
   
  
   
   
   
   

}


