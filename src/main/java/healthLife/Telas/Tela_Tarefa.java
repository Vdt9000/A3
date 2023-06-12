package healthLife.Telas;
import DAO.DAOTarefas;
import Usuario.Tarefa;


public class Tela_Tarefa extends javax.swing.JFrame {


    public Tela_Tarefa(String cpf) {
        initComponents();
    }

 Tela_Tarefa() {
initComponents();
 }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        check_Segunda = new javax.swing.JCheckBox();
        check_Terça = new javax.swing.JCheckBox();
        check_Quarta = new javax.swing.JCheckBox();
        check_Quinta = new javax.swing.JCheckBox();
        check_Sexta = new javax.swing.JCheckBox();
        check_Sabado = new javax.swing.JCheckBox();
        check_Domingo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btn_visualizar = new javax.swing.JButton();
        btn_inserirtarefa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_descricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        check_Segunda.setText("Segunda-feira");
        check_Segunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_SegundaActionPerformed(evt);
            }
        });

        check_Terça.setText("Terça-feira");

        check_Quarta.setText("Quarta-feira");

        check_Quinta.setText("Quinta-feira");

        check_Sexta.setText("Sexta-feira");

        check_Sabado.setText("Sábado");

        check_Domingo.setText("Domingo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione o dia da semana");

        btn_visualizar.setBackground(new java.awt.Color(204, 255, 204));
        btn_visualizar.setText("Visualizar");
        btn_visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualizarActionPerformed(evt);
            }
        });

        btn_inserirtarefa.setBackground(new java.awt.Color(204, 255, 204));
        btn_inserirtarefa.setText("Inserir Tarefa ");
        btn_inserirtarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirtarefaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de atividades");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição Tarefa");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\victo\\OneDrive\\Área de Trabalho\\codigos a3\\coração.png")); // NOI18N

        txt_descricao.setBackground(new java.awt.Color(204, 255, 204));
        txt_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(check_Segunda)
                            .addComponent(check_Terça)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btn_visualizar)
                                .addGap(34, 34, 34)
                                .addComponent(btn_inserirtarefa))
                            .addComponent(check_Domingo)
                            .addComponent(check_Sabado)
                            .addComponent(check_Sexta)
                            .addComponent(check_Quarta)
                            .addComponent(check_Quinta))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(check_Segunda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_visualizar)
                            .addComponent(btn_inserirtarefa)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check_Terça)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_Quarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_Quinta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_Sexta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_Sabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_Domingo))
                    .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_SegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_SegundaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_SegundaActionPerformed

    private void btn_inserirtarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirtarefaActionPerformed
        
    }//GEN-LAST:event_btn_inserirtarefaActionPerformed

    private void btn_visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualizarActionPerformed
        // TODO add your handling code here:
        tela_paciente ab = new tela_paciente ();
        ab.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btn_visualizarActionPerformed

    private void txt_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descricaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_descricaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              Tela_Tarefa telaTarefa = new Tela_Tarefa();
            telaTarefa.setVisible(true);  
            
            
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inserirtarefa;
    private javax.swing.JButton btn_visualizar;
    private javax.swing.JCheckBox check_Domingo;
    private javax.swing.JCheckBox check_Quarta;
    private javax.swing.JCheckBox check_Quinta;
    private javax.swing.JCheckBox check_Sabado;
    private javax.swing.JCheckBox check_Segunda;
    private javax.swing.JCheckBox check_Sexta;
    private javax.swing.JCheckBox check_Terça;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_descricao;
    // End of variables declaration//GEN-END:variables
}
