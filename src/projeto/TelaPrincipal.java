package projeto;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class TelaPrincipal extends javax.swing.JFrame {

// Declaração dos ArrayLists    
    ArrayList<Hacker> listaHacker;
    ArrayList<Podcast> listaPodcast;
// Declaração dos grids
    PessoasTM hackers;
    PodcastTM podcasts;
// Declaração do arquivo    
    Arquivo arq;

    public TelaPrincipal() {
// Cria os ArrayLists
        listaHacker = new ArrayList();
        listaPodcast = new ArrayList();
// Cria os componentes da janela
        initComponents();
// Incializa a janela no meio da tela
        setLocationRelativeTo(null);
// Indica que nao permite maximizar a tela        
        setResizable(false);
// Cria o grid de Hackers
        hackers = new PessoasTM();
        tbl_hackers.setModel(hackers);
// Cria o grid de Podcasts        
        podcasts = new PodcastTM();
        tbl_podcast.setModel(podcasts);
// Cria um objeto arquivo
        arq = new Arquivo();
// Carrega os Hackers
        try {
            carregaHackers();
        } catch (Exception e) {
        }
// Carrega os Podcasts
        try {
            carregaPodcast();
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hackers = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_podcast = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c_nivel = new javax.swing.JComboBox<>();
        c_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JButton();
        c_titulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c_responsavel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        c_link = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A seita Hacker");

        tbl_hackers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Nivel", "Email"
            }
        ));
        jScrollPane1.setViewportView(tbl_hackers);

        tbl_podcast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "Responsável", "Link do Youtube"
            }
        ));
        jScrollPane2.setViewportView(tbl_podcast);

        jLabel1.setText("Hackers");

        jLabel2.setText("Podcasts");

        jLabel3.setText("A seita Hacker");

        jLabel4.setText("Nome");

        jLabel5.setText("Nivel");

        c_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico", "Aprendiz" }));
        c_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nivelActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/adicionar.png"))); // NOI18N
        btn_1.setText("Incluir");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Título");

        c_responsavel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_responsavelFocusLost(evt);
            }
        });

        jLabel8.setText("Responsável");

        jLabel9.setText("Link");

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/adicionar.png"))); // NOI18N
        btn_2.setText("Incluir");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/youtube.png"))); // NOI18N
        btn_3.setToolTipText("Abre o link do podcast selecionado");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(242, 242, 242)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c_nome)
                                    .addComponent(c_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(c_link)
                            .addComponent(c_responsavel)
                            .addComponent(c_titulo))
                        .addGap(122, 122, 122))))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(c_link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1)
                    .addComponent(btn_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nivelActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
// Variavel auxiliar para definir se é Tecnico ou Aprendiz 
        int sel;
// Instancia um novo hacker
        Hacker h1 = new Hacker();
        h1.setNome(c_nome.getText());
        sel = c_nivel.getSelectedIndex();
        if (sel == 0){
            h1.setNivel("Tecnico");
           } else {
            h1.setNivel("Aprendiz");
        } 
        h1.setEmail(c_email.getText());
        listaHacker.add(h1);
        hackers.addPessoa(h1);
// Grava o hacker no arquivo
        try {
            arq.escritor(h1);
        } catch (IOException ex) {
            System.out.println("Problema na escrita");
        }
        limpaCamposPessoa();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        boolean encontrou;
        encontrou = verificaResponsavel(c_responsavel.getText());
        if (!(encontrou)){
            JOptionPane.showMessageDialog(null, "O responsável informado não está cadastrado! É necessário cadastrá-lo!");
            return;
        }
        Podcast p1 = new Podcast();
        Hacker h1;
        p1.setTitulo(c_titulo.getText());
        h1 = retornaHackerValido(c_responsavel.getText());
        p1.setResponsavel(h1);
        p1.setLink(c_link.getText());
        try {
            arq.escritor(p1);
        } catch (IOException ex) {
            System.out.println("Problema na escrita");
        }
        listaPodcast.add(p1);
        imprimeListaPodcast();
        podcasts.addPodcast(p1);
        limpaCamposPodcast();     
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        int linha;
        Podcast p1;
        linha = tbl_podcast.getSelectedRow();
        p1 = podcasts.getPodcast(linha);
        try {
            Process p = Runtime.getRuntime().exec("cmd /c start " + p1.getLink());
        } catch (IOException e1) {
            System.out.println(e1);
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void c_responsavelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_responsavelFocusLost
        boolean encontrou;
        encontrou = verificaResponsavel(c_responsavel.getText());
        if (!(encontrou)){
            JOptionPane.showMessageDialog(null, "O responsável informado não está cadastrado! É necessário cadastrá-lo!");
        }
    }//GEN-LAST:event_c_responsavelFocusLost

    public void limpaCamposPessoa(){
        c_nome.setText("");
        c_email.setText("");
    }

    public void limpaCamposPodcast(){
        c_titulo.setText("");
        c_responsavel.setText("");
        c_link.setText("");
    }
    
    public void carregaHackers() throws IOException{
// Arraylist com o conteúdo do arquivo de Hackers    
        ArrayList<String> listaHackers = new ArrayList();
        listaHackers = arq.leitorHacker();
        for (String linha : listaHackers) {
            String[] textoSeparado = linha.split(";");
            Hacker h1 = new Hacker();
            h1.setNome(arq.descriptografar(textoSeparado[0]));
            h1.setNivel(arq.descriptografar(textoSeparado[1]));
            h1.setEmail(arq.descriptografar(textoSeparado[2]));
            listaHacker.add(h1);
            hackers.addPessoa(h1);
        }
    }

    public void carregaPodcast() throws IOException{
// Arraylist com o conteúdo do arquivo de Hackers    
        ArrayList<String> listaPodcasts = new ArrayList();
        listaPodcasts = arq.leitorPodcast();
        for (String linha : listaPodcasts) {
            System.out.println(linha);
            String[] textoSeparado = linha.split(";");
            Podcast p1 = new Podcast();
            Hacker h1;
            p1.setTitulo(arq.descriptografar(textoSeparado[0]));            
            h1 = retornaHackerValido(arq.descriptografar(textoSeparado[1]));
            p1.setResponsavel(h1);
            p1.setLink(textoSeparado[2]);
            listaPodcast.add(p1);
            podcasts.addPodcast(p1);
        }
    }

// Imprime lista de Hackers    
    public void imprimeListaHacker() {
        System.out.println("HACKER CADASTRADOS");
        for (int i = 0; i < listaHacker.size(); i++) {
            System.out.println("Nome: " + listaHacker.get(i).getNome());
        }
    }

// Imprime lista de Podcast
    public void imprimeListaPodcast() {
        System.out.println("PODCASTS CADASTRADOS");
        for (int i = 0; i < listaPodcast.size(); i++) {                                                        
            System.out.println("Titulo: " + listaPodcast.get(i).getTitulo());
        }
    }
    
// Verifica se o responsáel está cadastrado    
    public boolean verificaResponsavel(String nome){
        boolean encontrou = false;
        for (Hacker listaHackers : listaHacker) {
            if (listaHackers.getNome().equals(nome)) {
                encontrou = true;
                break;
            }
        }
        return encontrou;
    }
    
// Retorna o Hacker do Arraylist    
    public Hacker retornaHackerValido(String nome){
        Hacker h1 = null;
        for (Hacker listaHackers : listaHacker) {
            if (listaHackers.getNome().equals(nome)) {
                h1 = listaHackers; 
            }
        }
        return h1;
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_link;
    private javax.swing.JComboBox<String> c_nivel;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_responsavel;
    private javax.swing.JTextField c_titulo;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbl_hackers;
    private javax.swing.JTable tbl_podcast;
    // End of variables declaration//GEN-END:variables
}
