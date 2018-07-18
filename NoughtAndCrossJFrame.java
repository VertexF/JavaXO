/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guixo;

import java.awt.Color;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class NoughtAndCrossJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NoughtAndCrossJFrame
     */
    private Board board;
    
    public NoughtAndCrossJFrame() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
        
        board = new Board();
    }
    
    private void gameScore()
    {
        jbLPlayerX.setText(String.valueOf(board.getXScore()));
        jbLPlayerO.setText(String.valueOf(board.getOScore()));
    }
    
    private void reset()
    {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        board.resetBoard();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    //// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jbLPlayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jbLPlayerO = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jbntReset = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbntExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Noughts And Crosses");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Noughts And Crosses");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
    
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jPanel6.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jbLPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbLPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbLPlayerX.setText("0");
        jPanel8.add(jbLPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());
        
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        
        jPanel9.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        
        jPanel10.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        
        jPanel11.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel12.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jbLPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbLPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbLPlayerO.setText("0");
        jPanel13.add(jbLPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());
        
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        jPanel14.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());
        
        
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        jPanel15.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());
        
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        
        jPanel16.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbntReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbntReset.setText("Reset");
        jbntReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntResetActionPerformed(evt);
            }
        });
        jPanel17.add(jbntReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jbntExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbntExit.setText("Exit");
        jbntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntExitActionPerformed(evt);
            }
        });
        jPanel18.add(jbntExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton1.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton1.setForeground(Color.RED);
        }
        else
        {
            jButton1.setForeground(Color.GREEN);
        }
        jButton1.setEnabled(false);
        board.chooseAPlayer();
        board.setButton1Text(jButton1.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore(); 
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
        
    }      
    

    private void jbntExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(JOptionPane.showConfirmDialog(this, "Comfirm you want to exit it", "X's And O's",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }                                        

    private void jbntResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        reset();
    }                                         
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton2.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton2.setForeground(Color.RED);
        }
        else
        {
            jButton2.setForeground(Color.GREEN);
        }
        jButton2.setEnabled(false);
        board.chooseAPlayer();
        board.setButton2Text(jButton2.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore(); 
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton3.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton3.setForeground(Color.RED);
        }
        else
        {
            jButton3.setForeground(Color.GREEN);
        }
        jButton3.setEnabled(false);
        board.chooseAPlayer();
        board.setButton3Text(jButton3.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton4.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton4.setForeground(Color.RED);
        }
        else
        {
            jButton4.setForeground(Color.GREEN);
        }
        jButton4.setEnabled(false);
        board.chooseAPlayer();
        board.setButton4Text(jButton4.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton5.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton5.setForeground(Color.RED);
        }
        else
        {
            jButton5.setForeground(Color.GREEN);
        }
        jButton5.setEnabled(false);
        board.chooseAPlayer();
        board.setButton5Text(jButton5.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton6.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton6.setForeground(Color.RED);
        }
        else
        {
            jButton6.setForeground(Color.GREEN);
        }
        jButton6.setEnabled(false);
        board.chooseAPlayer();
        board.setButton6Text(jButton6.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton7.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton7.setForeground(Color.RED);
        }
        else
        {
            jButton7.setForeground(Color.GREEN);
        }
        jButton7.setEnabled(false);
        board.chooseAPlayer();
        board.setButton7Text(jButton7.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton8.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton8.setForeground(Color.RED);
        }
        else
        {
            jButton8.setForeground(Color.GREEN);
        }
        jButton8.setEnabled(false);
        board.chooseAPlayer();
        board.setButton8Text(jButton8.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton9.setText(board.getButtonText());
        if(board.getButtonText().equals("X"))
        {
            jButton9.setForeground(Color.RED);
        }
        else
        {
            jButton9.setForeground(Color.GREEN);
        }
        jButton9.setEnabled(false);
        board.chooseAPlayer();
        board.setButton9Text(jButton9.getText());
        if(board.winningGame() == 1)
        {
            if(JOptionPane.showConfirmDialog(this, "Player X is a winner!", "X", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                reset();
                gameScore();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else if(board.winningGame() == 2)
        {
            if(JOptionPane.showConfirmDialog(this, "Player O is a winner!", "O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
            {
                gameScore();
                reset();
            }
            else
            {
                gameScore();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
            }
        }
        else
        {
            if(board.isDraw())
            {
                if(JOptionPane.showConfirmDialog(this, "It's a Draw", "X and O", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                {
                    reset();
                }
            }
        }
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
            java.util.logging.Logger.getLogger(NoughtAndCrossJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoughtAndCrossJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoughtAndCrossJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoughtAndCrossJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        NoughtAndCrossJFrame test = new NoughtAndCrossJFrame();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                test.setVisible(true);
            }
       });
        
        
        //Game game = new Game();
        //game.mainLoop();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jbLPlayerO;
    private javax.swing.JLabel jbLPlayerX;
    private javax.swing.JButton jbntExit;
    private javax.swing.JButton jbntReset;
    // End of variables declaration    
}