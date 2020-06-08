
package InterfaceGrafica;

import Classes.Sistema;
import Serializacao.Serializacao;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class PerfilUsuario extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao bd;
    
    public PerfilUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotãoModificarDados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotãoListarUtilizadores = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PainelID = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PainelListaUtilizadores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUsuarios = new javax.swing.JTable();
        BotãoAddUtilizador = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotãoRemUtilizador = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PainelListaAcessos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        BotãoListarUtilizadores1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_e_Icons/LogoPPpeq_Easy-Resize.com (2).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        BotãoModificarDados.setBackground(new java.awt.Color(21, 167, 202));
        BotãoModificarDados.setToolTipText("");
        BotãoModificarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoModificarDadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotãoModificarDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotãoModificarDadosMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar Dados");

        javax.swing.GroupLayout BotãoModificarDadosLayout = new javax.swing.GroupLayout(BotãoModificarDados);
        BotãoModificarDados.setLayout(BotãoModificarDadosLayout);
        BotãoModificarDadosLayout.setHorizontalGroup(
            BotãoModificarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotãoModificarDadosLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        BotãoModificarDadosLayout.setVerticalGroup(
            BotãoModificarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.add(BotãoModificarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 137, 126, -1));

        BotãoListarUtilizadores.setBackground(new java.awt.Color(21, 167, 202));
        BotãoListarUtilizadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoListarUtilizadoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotãoListarUtilizadoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotãoListarUtilizadoresMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Listar Utilizadores");

        javax.swing.GroupLayout BotãoListarUtilizadoresLayout = new javax.swing.GroupLayout(BotãoListarUtilizadores);
        BotãoListarUtilizadores.setLayout(BotãoListarUtilizadoresLayout);
        BotãoListarUtilizadoresLayout.setHorizontalGroup(
            BotãoListarUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotãoListarUtilizadoresLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        BotãoListarUtilizadoresLayout.setVerticalGroup(
            BotãoListarUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotãoListarUtilizadoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BotãoListarUtilizadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 188, -1, -1));

        jTabbedPane1.setToolTipText("");

        PainelID.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(21, 144, 202));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("O meu perfil");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel10.setText("---------------------");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel11.setText("---------------------");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuário:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelIDLayout = new javax.swing.GroupLayout(PainelID);
        PainelID.setLayout(PainelIDLayout);
        PainelIDLayout.setHorizontalGroup(
            PainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIDLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        PainelIDLayout.setVerticalGroup(
            PainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIDLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", PainelID);

        PainelListaUtilizadores.setBackground(new java.awt.Color(255, 255, 255));

        TabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaUsuarios);
        if (TabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            TabelaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            TabelaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            TabelaUsuarios.getColumnModel().getColumn(2).setResizable(false);
        }

        BotãoAddUtilizador.setBackground(new java.awt.Color(21, 167, 202));
        BotãoAddUtilizador.setToolTipText("");
        BotãoAddUtilizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoAddUtilizadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotãoAddUtilizadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotãoAddUtilizadorMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_e_Icons/icons8_plus_16px_2.png"))); // NOI18N
        jLabel5.setText("Adicionar Utilizador");

        javax.swing.GroupLayout BotãoAddUtilizadorLayout = new javax.swing.GroupLayout(BotãoAddUtilizador);
        BotãoAddUtilizador.setLayout(BotãoAddUtilizadorLayout);
        BotãoAddUtilizadorLayout.setHorizontalGroup(
            BotãoAddUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotãoAddUtilizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(60, 60, 60))
        );
        BotãoAddUtilizadorLayout.setVerticalGroup(
            BotãoAddUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        BotãoRemUtilizador.setBackground(new java.awt.Color(21, 167, 202));
        BotãoRemUtilizador.setToolTipText("");
        BotãoRemUtilizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoRemUtilizadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotãoRemUtilizadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotãoRemUtilizadorMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_e_Icons/icons8_minus_16px_1.png"))); // NOI18N
        jLabel6.setText("Remover Utilizador");

        javax.swing.GroupLayout BotãoRemUtilizadorLayout = new javax.swing.GroupLayout(BotãoRemUtilizador);
        BotãoRemUtilizador.setLayout(BotãoRemUtilizadorLayout);
        BotãoRemUtilizadorLayout.setHorizontalGroup(
            BotãoRemUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotãoRemUtilizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(60, 60, 60))
        );
        BotãoRemUtilizadorLayout.setVerticalGroup(
            BotãoRemUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(29, 134, 195));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modificar Dados do Utilizador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelListaUtilizadoresLayout = new javax.swing.GroupLayout(PainelListaUtilizadores);
        PainelListaUtilizadores.setLayout(PainelListaUtilizadoresLayout);
        PainelListaUtilizadoresLayout.setHorizontalGroup(
            PainelListaUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelListaUtilizadoresLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PainelListaUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelListaUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PainelListaUtilizadoresLayout.createSequentialGroup()
                            .addComponent(BotãoAddUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(BotãoRemUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)))
                    .addGroup(PainelListaUtilizadoresLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        PainelListaUtilizadoresLayout.setVerticalGroup(
            PainelListaUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelListaUtilizadoresLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(PainelListaUtilizadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoAddUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoRemUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", PainelListaUtilizadores);

        PainelListaAcessos.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Acessos", "Nome", "Utilizador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Lista de Acessos");

        javax.swing.GroupLayout PainelListaAcessosLayout = new javax.swing.GroupLayout(PainelListaAcessos);
        PainelListaAcessos.setLayout(PainelListaAcessosLayout);
        PainelListaAcessosLayout.setHorizontalGroup(
            PainelListaAcessosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelListaAcessosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PainelListaAcessosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PainelListaAcessosLayout.setVerticalGroup(
            PainelListaAcessosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelListaAcessosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", PainelListaAcessos);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -40, 510, 450));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_e_Icons/icons8_go_back_32px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        BotãoListarUtilizadores1.setBackground(new java.awt.Color(21, 167, 202));
        BotãoListarUtilizadores1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoListarUtilizadores1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotãoListarUtilizadores1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotãoListarUtilizadores1MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Listar Acessos");

        javax.swing.GroupLayout BotãoListarUtilizadores1Layout = new javax.swing.GroupLayout(BotãoListarUtilizadores1);
        BotãoListarUtilizadores1.setLayout(BotãoListarUtilizadores1Layout);
        BotãoListarUtilizadores1Layout.setHorizontalGroup(
            BotãoListarUtilizadores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotãoListarUtilizadores1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotãoListarUtilizadores1Layout.setVerticalGroup(
            BotãoListarUtilizadores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.add(BotãoListarUtilizadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoModificarDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoModificarDadosMouseEntered
        BotãoModificarDados.setBackground(new Color(21,167,202).darker());  
    }//GEN-LAST:event_BotãoModificarDadosMouseEntered

    private void BotãoAddUtilizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoAddUtilizadorMouseClicked
        CriarUtilizador janela = new CriarUtilizador();
        janela.setVisible(true);
    }//GEN-LAST:event_BotãoAddUtilizadorMouseClicked

    private void BotãoAddUtilizadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoAddUtilizadorMouseEntered
        BotãoAddUtilizador.setBackground(new Color(21,167,202).darker());
    }//GEN-LAST:event_BotãoAddUtilizadorMouseEntered

    private void BotãoAddUtilizadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoAddUtilizadorMouseExited
        BotãoAddUtilizador.setBackground(new Color(21,167,202));
    }//GEN-LAST:event_BotãoAddUtilizadorMouseExited

    private void BotãoRemUtilizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoRemUtilizadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoRemUtilizadorMouseClicked

    private void BotãoRemUtilizadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoRemUtilizadorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoRemUtilizadorMouseEntered

    private void BotãoRemUtilizadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoRemUtilizadorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoRemUtilizadorMouseExited

    private void BotãoModificarDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoModificarDadosMouseExited
        BotãoModificarDados.setBackground(new Color(21,167,202));  
    }//GEN-LAST:event_BotãoModificarDadosMouseExited

    private void BotãoListarUtilizadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoListarUtilizadoresMouseEntered
        BotãoListarUtilizadores.setBackground(new Color(21,167,202).darker());  
    }//GEN-LAST:event_BotãoListarUtilizadoresMouseEntered

    private void BotãoListarUtilizadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoListarUtilizadoresMouseExited
        BotãoListarUtilizadores.setBackground(new Color(21,167,202));  
    }//GEN-LAST:event_BotãoListarUtilizadoresMouseExited

    private void BotãoModificarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoModificarDadosMouseClicked
        ModificarDadosUtilizador janela = new ModificarDadosUtilizador();
        janela.setVisible(true);
    }//GEN-LAST:event_BotãoModificarDadosMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.dispose();
        Tela_Inicial janela = new Tela_Inicial(sistema, bd);
        janela.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void BotãoListarUtilizadores1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoListarUtilizadores1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoListarUtilizadores1MouseEntered

    private void BotãoListarUtilizadores1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoListarUtilizadores1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoListarUtilizadores1MouseExited

    private void BotãoListarUtilizadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoListarUtilizadoresMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_BotãoListarUtilizadoresMouseClicked

    private void BotãoListarUtilizadores1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoListarUtilizadores1MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_BotãoListarUtilizadores1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotãoAddUtilizador;
    private javax.swing.JPanel BotãoListarUtilizadores;
    private javax.swing.JPanel BotãoListarUtilizadores1;
    private javax.swing.JPanel BotãoModificarDados;
    private javax.swing.JPanel BotãoRemUtilizador;
    private javax.swing.JPanel PainelID;
    private javax.swing.JPanel PainelListaAcessos;
    private javax.swing.JPanel PainelListaUtilizadores;
    private javax.swing.JTable TabelaUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
