/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.doit.view;

import br.ufpr.doit.controls.ListRN;
import br.ufpr.doit.controls.TaskRN;
import br.ufpr.doit.controls.UserRN;
import br.ufpr.doit.model.Lista;
import br.ufpr.doit.model.Task;
import br.ufpr.doit.model.User;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author soneg
 */
public class App extends javax.swing.JFrame {

    static User user = new User();
    static UserRN userRN = new UserRN();
    
    static ListRN listRN = new ListRN();
    
    static ArrayList<Task> list = new ArrayList<>();
    
    static ArrayList<Task> quadro1 = new ArrayList<>();
    static ArrayList<Task> importante = new ArrayList<>();
    static ArrayList<Task> concluido = new ArrayList<>();
    
    
    public App(User user) {
        initComponents();
        this.user = user;
        jLabelUsuario.setText(user.getNome());
        renderQuadros();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelNavBar = new javax.swing.JPanel();
        jLabelDoIt = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelIconeUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jPanelListas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAddLista = new javax.swing.JLabel();
        jPanelQuadros = new javax.swing.JPanel();
        jPanelAtrasado = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelImportante = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelConcluido = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTituloDetalhe = new javax.swing.JLabel();
        jLabelDescricaoDetalhe = new javax.swing.JLabel();
        jPanelListaTarefas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DoIt!");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setName("doit"); // NOI18N

        jPanelFundo.setBackground(new java.awt.Color(34, 49, 63));

        jPanelNavBar.setBackground(new java.awt.Color(44, 62, 80));

        jLabelDoIt.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDoIt.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        jLabelDoIt.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDoIt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDoIt.setText("DoIt!");

        jPanelUsuario.setBackground(new java.awt.Color(52, 73, 94));

        jLabelIconeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_gender_neutral_user_32px.png"))); // NOI18N

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIconeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelListas.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listas");

        jLabelAddLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_add_list_32px.png"))); // NOI18N
        jLabelAddLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelAddListaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelListasLayout = new javax.swing.GroupLayout(jPanelListas);
        jPanelListas.setLayout(jPanelListasLayout);
        jPanelListasLayout.setHorizontalGroup(
            jPanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAddLista)
                .addContainerGap())
        );
        jPanelListasLayout.setVerticalGroup(
            jPanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAddLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelQuadros.setBackground(new java.awt.Color(44, 62, 80));

        jPanelAtrasado.setBackground(new java.awt.Color(52, 73, 94));
        jPanelAtrasado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelAtrasadoMouseReleased(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_property_time_32px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Atrasado");

        javax.swing.GroupLayout jPanelAtrasadoLayout = new javax.swing.GroupLayout(jPanelAtrasado);
        jPanelAtrasado.setLayout(jPanelAtrasadoLayout);
        jPanelAtrasadoLayout.setHorizontalGroup(
            jPanelAtrasadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtrasadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanelAtrasadoLayout.setVerticalGroup(
            jPanelAtrasadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtrasadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAtrasadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelImportante.setBackground(new java.awt.Color(52, 73, 94));
        jPanelImportante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelImportanteMouseReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_important_property_32px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Importante");

        javax.swing.GroupLayout jPanelImportanteLayout = new javax.swing.GroupLayout(jPanelImportante);
        jPanelImportante.setLayout(jPanelImportanteLayout);
        jPanelImportanteLayout.setHorizontalGroup(
            jPanelImportanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImportanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanelImportanteLayout.setVerticalGroup(
            jPanelImportanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImportanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImportanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelConcluido.setBackground(new java.awt.Color(52, 73, 94));
        jPanelConcluido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelConcluidoMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Concluido");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_checkmark_26px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelConcluidoLayout = new javax.swing.GroupLayout(jPanelConcluido);
        jPanelConcluido.setLayout(jPanelConcluidoLayout);
        jPanelConcluidoLayout.setHorizontalGroup(
            jPanelConcluidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConcluidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanelConcluidoLayout.setVerticalGroup(
            jPanelConcluidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConcluidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConcluidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelQuadrosLayout = new javax.swing.GroupLayout(jPanelQuadros);
        jPanelQuadros.setLayout(jPanelQuadrosLayout);
        jPanelQuadrosLayout.setHorizontalGroup(
            jPanelQuadrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtrasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelImportante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelConcluido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelQuadrosLayout.setVerticalGroup(
            jPanelQuadrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuadrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelImportante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelNavBarLayout = new javax.swing.GroupLayout(jPanelNavBar);
        jPanelNavBar.setLayout(jPanelNavBarLayout);
        jPanelNavBarLayout.setHorizontalGroup(
            jPanelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelListas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDoIt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelNavBarLayout.createSequentialGroup()
                .addComponent(jPanelQuadros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelNavBarLayout.setVerticalGroup(
            jPanelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDoIt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelQuadros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));

        jLabelTituloDetalhe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTituloDetalhe.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloDetalhe.setText("Tarefa");

        jLabelDescricaoDetalhe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescricaoDetalhe.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescricaoDetalhe.setText("<html><body>Mussum Ipsum, cacilds vidis litro abertis. Atirei o pau no gatis, per gatis num morreus. Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis. Mé faiz elementum girarzis, nisi eros vermeio.<body><html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloDetalhe)
                .addContainerGap(800, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelDescricaoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloDetalhe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricaoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanelListaTarefas.setBackground(new java.awt.Color(52, 73, 94));

        javax.swing.GroupLayout jPanelListaTarefasLayout = new javax.swing.GroupLayout(jPanelListaTarefas);
        jPanelListaTarefas.setLayout(jPanelListaTarefasLayout);
        jPanelListaTarefasLayout.setHorizontalGroup(
            jPanelListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanelListaTarefasLayout.setVerticalGroup(
            jPanelListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addComponent(jPanelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelListaTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelListaTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAddListaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddListaMouseReleased
        criarQuadro();
    }//GEN-LAST:event_jLabelAddListaMouseReleased

    private void jPanelAtrasadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAtrasadoMouseReleased
        deselecionarTudo(jPanelQuadros);
        selecionado((JPanel) evt.getSource());
        try {
            userRN.listarTasksConcluidas(list, user);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jPanelAtrasadoMouseReleased

    private void jPanelImportanteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelImportanteMouseReleased
        list.clear();
        list.addAll(importante);
        deselecionarTudo(jPanelQuadros);
        selecionado((JPanel) evt.getSource());
        render();
    }//GEN-LAST:event_jPanelImportanteMouseReleased

    private void jPanelConcluidoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConcluidoMouseReleased
        list.clear();
        list.addAll(concluido);
        deselecionarTudo(jPanelQuadros);
        selecionado((JPanel) evt.getSource());
        try {
            userRN.listarTasksConcluidas(list, user);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        render();
    }//GEN-LAST:event_jPanelConcluidoMouseReleased

    public void criarQuadro(){
        Lista quadro = new Lista();
        quadro.setFK_user(user.getPK_user());
        new NovoQuadro(quadro).setVisible(true);
        renderQuadros();
    }
    
    public static void selecionado(JPanel panel){
        panel.setBackground(new java.awt.Color(52, 152, 219));
    }
    
    public static void deselecionarTudo(JPanel jpanel){
        for (int i=0; i < jpanel.getComponentCount(); i++) {
            Component c = jpanel.getComponent(i);
            if (c instanceof JPanel) {
                c.setBackground(new Color(52,73,94));
            }
            if (c instanceof Tarefa) {;
                ((Tarefa) c).setCor(new Color(44,62,80));
            }
            if (c instanceof Quadro) {;
                ((Quadro) c).setCor(new Color(52,73,94));
            }
        }
    }
    
    public static void popLista(int quant, String nome, ArrayList<Task> lista){
        int i = 0;
        while(i<quant){
            Task tarefa = new Task();
            tarefa.setNome(nome + " " + (i+1));
            lista.add(tarefa);
            i++;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Tarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
//        popLista(4, "Tarefa", quadro1);
        popLista(4, "Importante", importante);
        popLista(4, "Concluido", concluido);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new App(user).setVisible(true);
        });
    }
    
    public void render(){
        jPanelListaTarefas.removeAll();
        for (Task t : list) {
            Tarefa sub = new Tarefa(t);
            sub.setBounds(5,5 + jPanelListaTarefas.getComponentCount()*60,870,60);
            sub.setBackground(new java.awt.Color(52,73,94));
            jPanelListaTarefas.add(sub);
        }
        jPanelListaTarefas.repaint();
        jPanelListaTarefas.revalidate();
    }
    
    public void renderQuadros(){
        List<Lista> lists = new ArrayList<>();
        try {
            listRN.listarListsBD(lists, user);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
         for (int i=0; i < jPanelQuadros.getComponentCount(); i++) {

            Component c = jPanelQuadros.getComponent(i);

            if (c != jPanelImportante && c != jPanelConcluido && c != jPanelAtrasado) {
                jPanelQuadros.remove(c);
            }
        }
        for(Lista l : lists){
            Quadro quad = new Quadro(l);
            quad.setBounds(0, 10 + (jPanelQuadros.getComponentCount()-3)*50, 292, 45);
            quad.setBackground(new java.awt.Color(52,73,94));
            jPanelQuadros.add(quad);
        }
        jPanelQuadros.repaint();
        jPanelQuadros.revalidate();
    }
    
    private class Tarefa extends JPanel {

        public Task tarefa;
        private TaskRN taskRN = new TaskRN();

        public Tarefa(Task tarefa) {
            initComponents();
            this.tarefa = tarefa;
            setCampos();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jPanelTarefa = new javax.swing.JPanel();
            jLabelTarefa = new javax.swing.JLabel();
            jLabelExcluir = new javax.swing.JLabel();
            jLabeDone = new javax.swing.JLabel();
            jLabelImportante = new javax.swing.JLabel();

            jPanelTarefa.setBackground(new java.awt.Color(44, 62, 80));
            jPanelTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    jPanelTarefaMouseReleased(evt);
                }
            });

            jLabelTarefa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabelTarefa.setForeground(new java.awt.Color(255, 255, 255));
            jLabelTarefa.setText("Tarefa");

            jLabelExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_trash_32px_2.png"))); // NOI18N
            jLabelExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    jLabelExcluirMouseReleased(evt);
                }
            });

            jLabeDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_checkmark_26px.png"))); // NOI18N
            jLabeDone.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    jLabeDoneMouseReleased(evt);
                }
            });

            jLabelImportante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_important_property_32px.png"))); // NOI18N
            jLabelImportante.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    jLabelImportanteMouseReleased(evt);
                }
            });

            javax.swing.GroupLayout jPanelTarefaLayout = new javax.swing.GroupLayout(jPanelTarefa);
            jPanelTarefa.setLayout(jPanelTarefaLayout);
            jPanelTarefaLayout.setHorizontalGroup(
                jPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTarefaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelImportante)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabeDone)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelExcluir)
                    .addContainerGap())
            );
            jPanelTarefaLayout.setVerticalGroup(
                jPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTarefaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelImportante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabeDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jLabelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }// </editor-fold>                        

        private void jLabelImportanteMouseReleased(java.awt.event.MouseEvent evt) {                                               
            
        }                                              

        private void jLabeDoneMouseReleased(java.awt.event.MouseEvent evt) {                                        
            
        }                                       

        private void jLabelExcluirMouseReleased(java.awt.event.MouseEvent evt) {
            try {
                taskRN.deletar(this.tarefa.getPK_task());
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            list.remove(this.tarefa);
            render();
        }                                           

        private void jPanelTarefaMouseReleased(java.awt.event.MouseEvent evt) {
            deselecionarTudo(jPanelListaTarefas);
            selecionado((JPanel) evt.getSource());
            setDetalhes(tarefa);
        }                                          

        public void setCampos(){
            jLabelTarefa.setText(this.tarefa.getNome());
        }

        public void setCor(Color c){
            jPanelTarefa.setBackground(c);
        }
        
        public void setDetalhes(Task tarefa){
            jLabelTituloDetalhe.setText(tarefa.getNome());
            jLabelDescricaoDetalhe.setText(tarefa.getDescricao());
        }
        
        // Variables declaration - do not modify                     
        private javax.swing.JLabel jLabeDone;
        private javax.swing.JLabel jLabelExcluir;
        private javax.swing.JLabel jLabelImportante;
        private javax.swing.JLabel jLabelTarefa;
        private javax.swing.JPanel jPanelTarefa;
    // End of variables declaration                   
    }
    
    public class Quadro extends JPanel {

        public Lista lista;
        private TaskRN taskRN = new TaskRN();
        
        public Quadro(Lista lista) {
            initComponents();
            this.lista = lista;
            setNome();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jPanelQuadro = new javax.swing.JPanel();
            jLabelNome = new javax.swing.JLabel();
            jLabelAdd = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanelQuadro.setBackground(new java.awt.Color(52, 73, 94));
            jPanelQuadro.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    jPanelQuadroMouseReleased(evt);
                }
            });

            jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
            jLabelNome.setText("Quadro Sem Nome");

            jLabelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufpr/doit/view/icons8_tasklist_32px.png"))); // NOI18N
            jLabelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    jLabelAddMouseReleased(evt);
                }
            });

            javax.swing.GroupLayout jPanelQuadroLayout = new javax.swing.GroupLayout(jPanelQuadro);
            jPanelQuadro.setLayout(jPanelQuadroLayout);
            jPanelQuadroLayout.setHorizontalGroup(
                jPanelQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelQuadroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelAdd)
                    .addContainerGap())
            );
            jPanelQuadroLayout.setVerticalGroup(
                jPanelQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuadroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelQuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelQuadro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
        }// </editor-fold>                        

        private void jPanelQuadroMouseReleased(java.awt.event.MouseEvent evt) {                                           
            deselecionarTudo(jPanelQuadros);
            selecionado((JPanel) evt.getSource());
            buscarTarefas();
        }                                          

        private void jLabelAddMouseReleased(java.awt.event.MouseEvent evt) {                                        
            new NovaTarefa(lista).setVisible(true);
        }
        
        public void setNome(){
            jLabelNome.setText(this.lista.getNome());
        }
        
        public void setCor(Color cor){
            this.jPanelQuadro.setBackground(cor);
        }
        
        private void buscarTarefas(){
            list.clear();
            ArrayList<String> teste = new ArrayList<>();
            teste.add(this.lista.getPK_List());
            try {
                taskRN.listarTasksBD(list, teste);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            render();
        }

        // Variables declaration - do not modify                     
        private javax.swing.JLabel jLabelAdd;
        private javax.swing.JLabel jLabelNome;
        private javax.swing.JPanel jPanelQuadro;
        // End of variables declaration                   
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddLista;
    private javax.swing.JLabel jLabelDescricaoDetalhe;
    private javax.swing.JLabel jLabelDoIt;
    private javax.swing.JLabel jLabelIconeUsuario;
    private javax.swing.JLabel jLabelTituloDetalhe;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAtrasado;
    private javax.swing.JPanel jPanelConcluido;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelImportante;
    private javax.swing.JPanel jPanelListaTarefas;
    private javax.swing.JPanel jPanelListas;
    private javax.swing.JPanel jPanelNavBar;
    private javax.swing.JPanel jPanelQuadros;
    private javax.swing.JPanel jPanelUsuario;
    // End of variables declaration//GEN-END:variables
}