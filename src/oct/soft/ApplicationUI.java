/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
<<<<<<< HEAD
import oct.soft.model.v7.AnafResult;
import oct.soft.model.CompanyReqInfo;
import oct.soft.model.v7.Found;
import oct.soft.util.AnafResultUtil;
import oct.soft.util.ConfigurationUtil;
=======
<<<<<<< HEAD
import oct.soft.dao.CompanyInfoDao;
=======
>>>>>>> beforedb
import oct.soft.model.BaseObject;
import oct.soft.model.CompanyInfo;
import oct.soft.model.CompanyReqInfo;
import oct.soft.util.DBManager;
>>>>>>> b44724e168da4a001b6cafb5887f27351e7675b3
import oct.soft.util.OkHttpUtil;
import oct.soft.util.ReadCSV;
import oct.soft.util.WriteResultToCSV;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Octavian Santau
 */
public class ApplicationUI extends javax.swing.JFrame {

    /**
     * Creates new form ApplicationUI
     */
    public ApplicationUI() {
<<<<<<< HEAD
        ConfigurationUtil conf = new ConfigurationUtil();
        URL_ANAF = conf.URL_ANAF;
=======
        if(DBManager.isH2database()){
         DBManager.startDB();   
        }        
>>>>>>> b44724e168da4a001b6cafb5887f27351e7675b3
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserSursa = new javax.swing.JFileChooser();
        jFileChooserDestinatie = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        btnOpenChooserSrcFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelInf1 = new javax.swing.JLabel();
        jLabelInf2 = new javax.swing.JLabel();
        jComboBoxCsvSeparator = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButtonProcess = new javax.swing.JButton();
        jButtonPunctualCheck = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        jFileChooserSursa.setDialogTitle("Selectati fisier sursa");
        jFileChooserSursa.setFileFilter(new oct.soft.file.filter.CustomFileFilter());
        jFileChooserSursa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserSursaActionPerformed(evt);
            }
        });

        jFileChooserDestinatie.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooserDestinatie.setDialogTitle("Selectati fisier destinatie");
        jFileChooserDestinatie.setFileFilter(new oct.soft.file.filter.CustomFileFilter());
        jFileChooserDestinatie.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooserDestinatie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserDestinatieActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verificare agenti economici");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Selectati fisier sursa:");

        btnOpenChooserSrcFile.setText("Deschide fiser");
        btnOpenChooserSrcFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenChooserSrcFileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Fisier destinatie:");

        jLabelInf1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelInf2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jComboBoxCsvSeparator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ";", "," }));
        jComboBoxCsvSeparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCsvSeparatorActionPerformed(evt);
            }
        });

        jLabel3.setText("Separator CSV");

        jButtonProcess.setText("Proceseaza");
        jButtonProcess.setEnabled(false);
        jButtonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcessActionPerformed(evt);
            }
        });

        jButtonPunctualCheck.setText("Verificare puntuala");
        jButtonPunctualCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPunctualCheckActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInf1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpenChooserSrcFile)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCsvSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonProcess)
                                        .addGap(263, 263, 263))
                                    .addComponent(jLabelInf2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jButtonPunctualCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenChooserSrcFile)
                    .addComponent(jComboBoxCsvSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInf1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInf2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProcess)
                    .addComponent(jButtonPunctualCheck))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnOpenChooserSrcFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenChooserSrcFileActionPerformed
        // TODO add your handling code here:
        int result = jFileChooserSursa.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = jFileChooserSursa.getSelectedFile();
        if( selectedFile != null) {
        sourceFilePath = selectedFile.getPath();
        jLabelInf1.setText(sourceFilePath);
        destFilePath = selectedFile.getParentFile().getPath()+File.separator+"rezultat.csv";
        jLabelInf2.setText(destFilePath);
        jButtonProcess.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selectati un fisier !", "Atentie", JOptionPane.WARNING_MESSAGE);
        }
        } 
    }//GEN-LAST:event_btnOpenChooserSrcFileActionPerformed

    private void jFileChooserSursaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserSursaActionPerformed
        // TODO add your handling code here:                
    }//GEN-LAST:event_jFileChooserSursaActionPerformed

    private void jComboBoxCsvSeparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCsvSeparatorActionPerformed

    }//GEN-LAST:event_jComboBoxCsvSeparatorActionPerformed

    private void jFileChooserDestinatieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserDestinatieActionPerformed
//         jLabelInf2.setText(jFileChooserSursa.getSelectedFile().toString());
    }//GEN-LAST:event_jFileChooserDestinatieActionPerformed

    private void jButtonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcessActionPerformed
<<<<<<< HEAD
        try {                             
=======
        try {                           
>>>>>>> beforedb
		final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
		ObjectMapper mapper = new ObjectMapper();
                csvSeparator = jComboBoxCsvSeparator.getSelectedItem().toString();
		List<CompanyReqInfo> lista = ReadCSV.getCompanyInfoFromFile(sourceFilePath,csvSeparator);                
                if( lista != null && lista.size()>0) {
                this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		String postBody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista);
		          System.out.println(ReadCSV.numRecords);
		OkHttpUtil.init(true);
		OkHttpClient client = OkHttpUtil.getClient();
		RequestBody body = RequestBody.create(JSON, postBody);
		Request request = new Request.Builder().url(URL_ANAF).post(body).build();
		Response response = client.newCall(request).execute();
		String content = response.body().string();	
<<<<<<< HEAD
		AnafResult anafResult = mapper.readValue(content, AnafResult.class);                
                WriteResultToCSV.writeToFile(anafResult, destFilePath);	
=======
		BaseObject baseObject = mapper.readValue(content, BaseObject.class);
                System.out.println(baseObject.getFound().size());
                WriteResultToCSV.writeToFile(baseObject, destFilePath);	
                CompanyInfoDao companyInfoDao = new CompanyInfoDao();
                companyInfoDao.save(baseObject.getFound());
>>>>>>> b44724e168da4a001b6cafb5887f27351e7675b3
                jFileChooserSursa.setSelectedFile(new File(""));     
                this.setCursor(Cursor.getDefaultCursor());
                String message = "S-au procesat:"+WriteResultToCSV.numRecords+" din "+ReadCSV.numRecords+" !";
                JOptionPane.showMessageDialog(this, message, "Procesare inregistrari", JOptionPane.INFORMATION_MESSAGE);                
                ReadCSV.numRecords=0;
                }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this,"Eroare: "+ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Eroare");
        }
                
    }//GEN-LAST:event_jButtonProcessActionPerformed

    private void jButtonPunctualCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPunctualCheckActionPerformed
        // TODO add your handling code here:
        JTextField cif = new JTextField();
        JXDatePicker data = new JXDatePicker();
        data.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        data.setDate(new Date());
        data.setLocale(new Locale("ro"));
        
        Object[] message = {"CIF:",cif,"Data verificare:",data};
        int option  = JOptionPane.showConfirmDialog(rootPane, message,"Verificare puntuala",JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (cif.getText().trim().length() ==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Campul CIF este obligatoriu!","Atentie!",JOptionPane.ERROR_MESSAGE);
                return;
<<<<<<< HEAD
            } else {               
=======
            } else {                
>>>>>>> beforedb
		final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                ObjectMapper mapper = new ObjectMapper();
                List<CompanyReqInfo> lista = new ArrayList<>();
                lista.add(new CompanyReqInfo(Integer.valueOf(cif.getText().trim())
                        , new SimpleDateFormat("yyyy-MM-dd").format(data.getDate())));
                try{
                String postBody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista);
		
		OkHttpUtil.init(true);
		OkHttpClient client = OkHttpUtil.getClient();
		RequestBody body = RequestBody.create(JSON, postBody);
		Request request = new Request.Builder().url(URL_ANAF).post(body).build();
		Response response = client.newCall(request).execute();
		String content = response.body().string();
<<<<<<< HEAD
                AnafResult anafResult = mapper.readValue(content, AnafResult.class);
                Found found = anafResult.getFound().get(0);
//                StringBuilder sb = new StringBuilder("<html>");
//                for (String s : WriteResultToCSV.getHeader()){                    
//                    sb.append(s+" = "+field.get(companyInfo)).append("<br />");
//                }
//                sb.append("</html>");
                  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                 JEditorPane jEditorPane = new JEditorPane();
                    jEditorPane.setEditable(false);                                                      
                    HTMLEditorKit kit = new HTMLEditorKit();
                    jEditorPane.setEditorKit(kit);
                    Document doc = kit.createDefaultDocument();                     
                    jEditorPane.setDocument(doc); 
                    jEditorPane.setText(AnafResultUtil.getHtmlInfo(found));                                                           
                    JFrame responseFrame = new JFrame("Informatii pt. "+found.getDateGenerale().getDenumire());                    
                    responseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    responseFrame.getContentPane().add(new JScrollPane(jEditorPane), BorderLayout.CENTER);
                    responseFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                    responseFrame.pack();
                    responseFrame.setVisible(true);
=======
                BaseObject baseObject = mapper.readValue(content, BaseObject.class);
                CompanyInfo companyInfo= baseObject.getFound().get(0);
                CompanyInfoDao companyInfoDao = new CompanyInfoDao();
                companyInfoDao.save(companyInfo);                
                StringBuilder sb = new StringBuilder("<html>");
                for (String s:WriteResultToCSV.getHeader()){
                    Field field = companyInfo.getClass().getDeclaredField(s);
                    field.setAccessible(true);
                    sb.append(s+" = "+field.get(companyInfo)).append("<br />");
                }
                sb.append("</html>");
<<<<<<< HEAD
                    JEditorPane jEditorPane = new JEditorPane();
=======
                 JEditorPane jEditorPane = new JEditorPane();
>>>>>>> beforedb
                    jEditorPane.setEditable(false);
                    JScrollPane scrollPane = new JScrollPane(jEditorPane); 
                    HTMLEditorKit kit = new HTMLEditorKit();
                    jEditorPane.setEditorKit(kit);
                    Document doc = kit.createDefaultDocument();                     
                    jEditorPane.setDocument(doc);
                    jEditorPane.setText(companyInfo.getHtmlInfo());
                JOptionPane.showMessageDialog(rootPane, jEditorPane,"Informatii pt "+companyInfo.getDenumire(),
                        JOptionPane.INFORMATION_MESSAGE);
              /*      SessionImpl session = (SessionImpl) HibernateUtil.getSessionFactory().openSession();
                    
                    JasperReport report = JasperCompileManager.compileReport("./reports/company.jrxml");
                    Map<String, Object> parameters = new HashMap<String, Object>();
                    parameters.put("CompanyInfoId",companyInfo.getId());
                    JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, session.connection());
                    session.close();
                    JasperViewer viewer = new JasperViewer(jasperPrint);
                    viewer.setVisible(true);*/
                    
>>>>>>> b44724e168da4a001b6cafb5887f27351e7675b3
                }
                catch (Exception ex){
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        }
                
            }                  
        }
    }//GEN-LAST:event_jButtonPunctualCheckActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(DBManager.isH2database()) {
            DBManager.stopDB();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationUI().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnOpenChooserSrcFile;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButtonProcess;
    private javax.swing.JButton jButtonPunctualCheck;
    private javax.swing.JComboBox<String> jComboBoxCsvSeparator;
    private javax.swing.JFileChooser jFileChooserDestinatie;
    private javax.swing.JFileChooser jFileChooserSursa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelInf1;
    private javax.swing.JLabel jLabelInf2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

  private String sourceFilePath;
  private String destFilePath;
  private String csvSeparator; 
<<<<<<< HEAD
  private final String URL_ANAF;
=======
<<<<<<< HEAD
  private final String url = "https://webservicesp.anaf.ro/PlatitorTvaRest/api/v4/ws/tva";
=======
  private final String URL_ANAF = "https://webservicesp.anaf.ro/PlatitorTvaRest/api/v6/ws/tva";
>>>>>>> beforedb
>>>>>>> b44724e168da4a001b6cafb5887f27351e7675b3
}
