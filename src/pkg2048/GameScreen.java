package pkg2048;

import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import pkg2048.util.RandomCollection;

public final class GameScreen extends javax.swing.JFrame {
    public Board board;
    private RandomCollection<Integer> rc;
        
    public boolean setValueAt(int value, int lin, int col){
        return this.board.setValue(value, lin, col);
    }
            
    public void setValueAtRandomPosition(int value){
        Random r = new Random();
        int l, c;
        
        if (this.board.isFull())
            return;
        
        do { 
            l = r.nextInt(4);
            c = r.nextInt(4);
        
        } while (!this.setValueAt(value, l, c));
    }
    
    public GameScreen(){
        initComponents();
        this.setTitle("2048");
        
        this.rc = new RandomCollection();
        this.rc.addItem(.90, 2).addItem(.10, 4);
        
        this.board = Board.getInstance();
        this.board.addSlot(new Slot(btn00), 0, 0);
        this.board.addSlot(new Slot(btn01), 0, 1);
        this.board.addSlot(new Slot(btn02), 0, 2);
        this.board.addSlot(new Slot(btn03), 0, 3);
        this.board.addSlot(new Slot(btn10), 1, 0);
        this.board.addSlot(new Slot(btn11), 1, 1);
        this.board.addSlot(new Slot(btn12), 1, 2);
        this.board.addSlot(new Slot(btn13), 1, 3);
        this.board.addSlot(new Slot(btn20), 2, 0);
        this.board.addSlot(new Slot(btn21), 2, 1);
        this.board.addSlot(new Slot(btn22), 2, 2);
        this.board.addSlot(new Slot(btn23), 2, 3);
        this.board.addSlot(new Slot(btn30), 3, 0);
        this.board.addSlot(new Slot(btn31), 3, 1);
        this.board.addSlot(new Slot(btn32), 3, 2);
        this.board.addSlot(new Slot(btn33), 3, 3);
                
        InputMap im = this.getRootPane().getInputMap();
        ActionMap am = this.getRootPane().getActionMap();
        
        im.put(KeyStroke.getKeyStroke("UP"), "UP");
        am.put("UP", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                board.moveUp();
                setValueAtRandomPosition(rc.nextItem());
            }
        });
        
        im.put(KeyStroke.getKeyStroke("DOWN"), "DOWN");
        am.put("DOWN", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                board.moveDown();
                setValueAtRandomPosition(rc.nextItem());
            }
        });
        
        im.put(KeyStroke.getKeyStroke("LEFT"), "LEFT");
        am.put("LEFT", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                board.moveLeft();
                setValueAtRandomPosition(rc.nextItem());
            }
        });
        
        im.put(KeyStroke.getKeyStroke("RIGHT"), "RIGHT");
        am.put("RIGHT", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                board.moveRight();
                setValueAtRandomPosition(rc.nextItem());
            }
        });
        
        this.setValueAtRandomPosition(this.rc.nextItem());
        this.setValueAtRandomPosition(this.rc.nextItem());
    }
    
    public static void main(String[] args){
        new GameScreen().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("jButton1");
        jButton5.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton6.setText("jButton1");
        jButton6.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton7.setText("jButton1");
        jButton7.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton8.setText("jButton1");
        jButton8.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jButton9.setText("jButton1");
        jButton9.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton10.setText("jButton1");
        jButton10.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton11.setText("jButton1");
        jButton11.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton12.setText("jButton1");
        jButton12.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton25.setText("jButton15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn00.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn00.setAlignmentY(0.0F);
        btn00.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn00.setEnabled(false);
        btn00.setFocusable(false);
        btn00.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn00.setMaximumSize(new java.awt.Dimension(100, 100));
        btn00.setMinimumSize(new java.awt.Dimension(100, 100));
        btn00.setPreferredSize(new java.awt.Dimension(100, 100));

        btn10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn10.setAlignmentY(0.0F);
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn10.setEnabled(false);
        btn10.setFocusable(false);
        btn10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn10.setMaximumSize(new java.awt.Dimension(100, 100));
        btn10.setMinimumSize(new java.awt.Dimension(100, 100));
        btn10.setPreferredSize(new java.awt.Dimension(100, 100));

        btn20.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn20.setAlignmentY(0.0F);
        btn20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn20.setEnabled(false);
        btn20.setFocusable(false);
        btn20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn20.setMaximumSize(new java.awt.Dimension(100, 100));
        btn20.setMinimumSize(new java.awt.Dimension(100, 100));
        btn20.setPreferredSize(new java.awt.Dimension(100, 100));

        btn30.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn30.setAlignmentY(0.0F);
        btn30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn30.setEnabled(false);
        btn30.setFocusable(false);
        btn30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn30.setMaximumSize(new java.awt.Dimension(100, 100));
        btn30.setMinimumSize(new java.awt.Dimension(100, 100));
        btn30.setPreferredSize(new java.awt.Dimension(100, 100));

        btn01.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn01.setAlignmentY(0.0F);
        btn01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn01.setEnabled(false);
        btn01.setFocusable(false);
        btn01.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn01.setMaximumSize(new java.awt.Dimension(100, 100));
        btn01.setMinimumSize(new java.awt.Dimension(100, 100));
        btn01.setPreferredSize(new java.awt.Dimension(100, 100));

        btn02.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn02.setAlignmentY(0.0F);
        btn02.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn02.setEnabled(false);
        btn02.setFocusable(false);
        btn02.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn02.setMaximumSize(new java.awt.Dimension(100, 100));
        btn02.setMinimumSize(new java.awt.Dimension(100, 100));
        btn02.setPreferredSize(new java.awt.Dimension(100, 100));

        btn03.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn03.setAlignmentY(0.0F);
        btn03.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn03.setEnabled(false);
        btn03.setFocusable(false);
        btn03.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn03.setMaximumSize(new java.awt.Dimension(100, 100));
        btn03.setMinimumSize(new java.awt.Dimension(100, 100));
        btn03.setPreferredSize(new java.awt.Dimension(100, 100));

        btn11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn11.setAlignmentY(0.0F);
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn11.setEnabled(false);
        btn11.setFocusable(false);
        btn11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn11.setMaximumSize(new java.awt.Dimension(100, 100));
        btn11.setMinimumSize(new java.awt.Dimension(100, 100));
        btn11.setPreferredSize(new java.awt.Dimension(100, 100));

        btn12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn12.setAlignmentY(0.0F);
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn12.setEnabled(false);
        btn12.setFocusable(false);
        btn12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn12.setMaximumSize(new java.awt.Dimension(100, 100));
        btn12.setMinimumSize(new java.awt.Dimension(100, 100));
        btn12.setPreferredSize(new java.awt.Dimension(100, 100));

        btn13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn13.setAlignmentY(0.0F);
        btn13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn13.setEnabled(false);
        btn13.setFocusable(false);
        btn13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn13.setMaximumSize(new java.awt.Dimension(100, 100));
        btn13.setMinimumSize(new java.awt.Dimension(100, 100));
        btn13.setPreferredSize(new java.awt.Dimension(100, 100));

        btn21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn21.setAlignmentY(0.0F);
        btn21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn21.setEnabled(false);
        btn21.setFocusable(false);
        btn21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn21.setMaximumSize(new java.awt.Dimension(100, 100));
        btn21.setMinimumSize(new java.awt.Dimension(100, 100));
        btn21.setPreferredSize(new java.awt.Dimension(100, 100));

        btn22.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn22.setAlignmentY(0.0F);
        btn22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn22.setEnabled(false);
        btn22.setFocusable(false);
        btn22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn22.setMaximumSize(new java.awt.Dimension(100, 100));
        btn22.setMinimumSize(new java.awt.Dimension(100, 100));
        btn22.setPreferredSize(new java.awt.Dimension(100, 100));

        btn23.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn23.setAlignmentY(0.0F);
        btn23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn23.setEnabled(false);
        btn23.setFocusable(false);
        btn23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn23.setMaximumSize(new java.awt.Dimension(100, 100));
        btn23.setMinimumSize(new java.awt.Dimension(100, 100));
        btn23.setPreferredSize(new java.awt.Dimension(100, 100));

        btn31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn31.setAlignmentY(0.0F);
        btn31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn31.setEnabled(false);
        btn31.setFocusable(false);
        btn31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn31.setMaximumSize(new java.awt.Dimension(100, 100));
        btn31.setMinimumSize(new java.awt.Dimension(100, 100));
        btn31.setPreferredSize(new java.awt.Dimension(100, 100));

        btn32.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn32.setAlignmentY(0.0F);
        btn32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn32.setEnabled(false);
        btn32.setFocusable(false);
        btn32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn32.setMaximumSize(new java.awt.Dimension(100, 100));
        btn32.setMinimumSize(new java.awt.Dimension(100, 100));
        btn32.setPreferredSize(new java.awt.Dimension(100, 100));

        btn33.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn33.setAlignmentY(0.0F);
        btn33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn33.setEnabled(false);
        btn33.setFocusable(false);
        btn33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn33.setMaximumSize(new java.awt.Dimension(100, 100));
        btn33.setMinimumSize(new java.awt.Dimension(100, 100));
        btn33.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
