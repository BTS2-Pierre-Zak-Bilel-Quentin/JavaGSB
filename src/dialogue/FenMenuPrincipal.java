package dialogue;

public class FenMenuPrincipal extends javax.swing.JFrame {

    public FenMenuPrincipal() {
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

        jLab_Quitter = new javax.swing.JLabel();
        jLab_Titre = new javax.swing.JLabel();
        jLab_Client = new javax.swing.JLabel();
        jLab_Article = new javax.swing.JLabel();
        jLab_TableauxBord = new javax.swing.JLabel();
        jLab_parametres = new javax.swing.JLabel();
        jLab_Facture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/quitter1.png"))); // NOI18N
        jLab_Quitter.setToolTipText("");
        jLab_Quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_QuitterMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 165, 52));

        jLab_Titre.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLab_Titre.setForeground(new java.awt.Color(204, 204, 255));
        jLab_Titre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo gsb.jpg"))); // NOI18N
        jLab_Titre.setToolTipText("");
        getContentPane().add(jLab_Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 170));

        jLab_Client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/marcheur1.png"))); // NOI18N
        jLab_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ClientMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLab_Article.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/powerBook.png"))); // NOI18N
        jLab_Article.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ArticleMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Article, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLab_TableauxBord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/camembert.png"))); // NOI18N
        jLab_TableauxBord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_TableauxBordMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_TableauxBord, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLab_parametres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/parametre1.png"))); // NOI18N
        getContentPane().add(jLab_parametres, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jLab_Facture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/classeur1.png"))); // NOI18N
        jLab_Facture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_FactureMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Facture, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fond/fond.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 580));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        setSize(new java.awt.Dimension(948, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_QuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_QuitterMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLab_QuitterMouseClicked

    private void jLab_ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ClientMouseClicked
        FenTableClient laFenetre = new FenTableClient();
        laFenetre.setVisible(true);
    }//GEN-LAST:event_jLab_ClientMouseClicked

    private void jLab_ArticleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ArticleMouseClicked
        FenArticle laFenetre = new FenArticle();
        laFenetre.setVisible(true);

    }//GEN-LAST:event_jLab_ArticleMouseClicked

    private void jLab_FactureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_FactureMouseClicked
        FenFacture laFenetre = new FenFacture();
        laFenetre.setVisible(true);
    }//GEN-LAST:event_jLab_FactureMouseClicked

    private void jLab_TableauxBordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_TableauxBordMouseClicked
        FenTableauBord tableau = new FenTableauBord(this, rootPaneCheckingEnabled);
        tableau.setModal(true);
        tableau.setLocationRelativeTo(tableau.getParent());
        tableau.setVisible(true);
    }//GEN-LAST:event_jLab_TableauxBordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FenMenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLab_Article;
    private javax.swing.JLabel jLab_Client;
    private javax.swing.JLabel jLab_Facture;
    private javax.swing.JLabel jLab_Quitter;
    private javax.swing.JLabel jLab_TableauxBord;
    private javax.swing.JLabel jLab_Titre;
    private javax.swing.JLabel jLab_parametres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}