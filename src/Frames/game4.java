/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import backEnd.exceptions.InputsVaciosException;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import damasInglesas.*;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author angelrg
 */
public class game4 extends javax.swing.JFrame {

    public game newGame;
    public final int dimension = 8;
    private final int pixels = 80;
    public final int idGamer1 = 0;
    public final int idGamer2 = 1;
    public final int noId = 2;
    public int playing;
    Random rand = new Random();
    private framePrincipal principal;
    private JButton temporalBotton;

    /**
     * Creates new form game4
     */
    public game4(framePrincipal p, String name1, String name2) {
        this.principal = p;
        initComponents();
        temporalBotton = null;
        newGame = new game(this);
        newGame.setName1(name1);
        newGame.setName2(name2);
        player1Label.setText(name1);
        player2Label.setText(name2);
        image1Button.setIcon(new ImageIcon("src/Images/Ficha1.png"));
        image2Button.setIcon(new ImageIcon("src/Images/Ficha2.png"));
        addPixels(boardPanel);
        playing = randomInit();
        showInitTurn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        player1Label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        turnoNomLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        deadHeatButton = new javax.swing.JButton();
        image1Button = new javax.swing.JButton();
        image2Button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        restartMenuItem = new javax.swing.JMenuItem();
        backMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Damas Inglesas");

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel1.setText("Player 1");

        player1Label.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        player1Label.setText("Nombre 1");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel3.setText("Player 2");

        player2Label.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        player2Label.setText("Nombre 2");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel2.setText("Turn:");

        turnoNomLabel.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        turnoNomLabel.setText("Turno");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        deadHeatButton.setText("Dead Heat");

        jMenu1.setText("Options");

        newMenuItem.setText("New game");
        jMenu1.add(newMenuItem);

        restartMenuItem.setText("Restart");
        jMenu1.add(restartMenuItem);

        backMenuItem.setText("Back to menu");
        jMenu1.add(backMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        aboutMenuItem.setText("About");
        jMenu2.add(aboutMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deadHeatButton))
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(turnoNomLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(player2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addComponent(player1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(image1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton)
                            .addComponent(deadHeatButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(player1Label)
                        .addGap(18, 18, 18)
                        .addComponent(image1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(player2Label)
                        .addGap(18, 18, 18)
                        .addComponent(image2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(turnoNomLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void showInitTurn(){
        if (playing == idGamer1) {
            JOptionPane.showMessageDialog(this, "it's the turn of "+newGame.getName1(), "Turn", JOptionPane.INFORMATION_MESSAGE);
            turnoNomLabel.setText(newGame.getName1());
        } else {
            JOptionPane.showMessageDialog(this, "it's the turn of "+newGame.getName2(), "Turn", JOptionPane.INFORMATION_MESSAGE);
            turnoNomLabel.setText(newGame.getName2());
        }
    }
    private int  randomInit(){
        return rand.nextInt(2);
    }
    
    public void changeTurn(){
        if (playing == idGamer1) {
            JOptionPane.showMessageDialog(this, "it's the turn of "+newGame.getName2(), "Turn", JOptionPane.INFORMATION_MESSAGE);
            turnoNomLabel.setText(newGame.getName2());
            playing = idGamer2;
        } else {
            JOptionPane.showMessageDialog(this, "it's the turn of "+newGame.getName1(), "Turn", JOptionPane.INFORMATION_MESSAGE);
            turnoNomLabel.setText(newGame.getName1());
            playing = idGamer1;
        }
    }
    
    private void selectOrMove(java.awt.event.ActionEvent ev, JButton boton) {
        try {
            if ((temporalBotton != null) && (temporalBotton == boton)) {
                temporalBotton = null;
            } else if ((temporalBotton == null) && !buttonIsAvailable(boton)) {
                temporalBotton = boton;
            } else if (((temporalBotton != null) && !buttonIsAvailable(boton))) {
                if (newGame.canKillSimpleCoin(getXButton(temporalBotton), getYButton(temporalBotton), getXButton(boton), getYButton(boton))) {
                    newGame.simpleCoinKill(temporalBotton, boton);
                    temporalBotton = null;
                    changeTurn();
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede elminar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if ((temporalBotton != null) && buttonIsAvailable(boton)) {
                if (newGame.canSimpleCoinMove(getXButton(temporalBotton), getYButton(temporalBotton), getXButton(boton), getYButton(boton))) {
                    newGame.simpleCoinMove(temporalBotton, boton);
                    temporalBotton = null;
                    changeTurn();
                } else {
                    JOptionPane.showMessageDialog(this, "Movimiento Invalido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (InputsVaciosException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            temporalBotton = null;
        }
    }

    private void addPixels(Container pane) {
        //pane.setLayout(null);
        Dimension panelDimension = new Dimension(dimension * pixels, dimension * pixels);
        pane.setSize(panelDimension);
        pane.setPreferredSize(panelDimension);
        pane.setMinimumSize(panelDimension);

        Insets insets = pane.getInsets();
        for (int x = 0; x < dimension; x++) {
            for (int y = 0; y < dimension; y++) {
                JButton auxButton = new JButton();
                coin auxCoin = new coin(x, y, true);

                if ((x % 2) == 0) {
                    if ((y % 2) == 0) {
                        auxButton.setBackground(Color.black);
                    } else {
                        auxButton.setBackground(Color.white);
                    }
                } else {
                    if ((y % 2) == 0) {
                        auxButton.setBackground(Color.white);
                    } else {
                        auxButton.setBackground(Color.black);
                    }
                }

                try {
                    if (((x % 2 == 0) && ((y == 0) || (y == 2))) || ((x % 2 == 1) && (y == 1))) {
                        auxButton.setIcon(new ImageIcon("src/Images/Ficha1.png"));
                        auxCoin.setNumber(idGamer1);
                        newGame.addCoinToGamer1(auxCoin);
                        newGame.addToTablero(new tableSquare(auxButton, idGamer1), x, y);
                    } else if (((x % 2 == 0) && (y == 6)) || ((x % 2 == 1) && ((y == 7) || (y == 5)))) {
                        auxButton.setIcon(new ImageIcon("src/Images/Ficha2.png"));
                        auxCoin.setNumber(idGamer2);
                        newGame.addCoinToGamer2(auxCoin);
                        newGame.addToTablero(new tableSquare(auxButton, idGamer2), x, y);
                    } else {
                        newGame.addToTablero(new tableSquare(auxButton, noId), x, y);
                    }
                } catch (Exception ex) {
                    System.out.println(ex);

                }
                auxButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        selectOrMove(evt, auxButton);
                    }
                });
                pane.add(auxButton);
                auxButton.setBounds((x * pixels) + insets.left, (y * pixels) + insets.top, pixels, pixels);
            }
        }
        System.out.println("pixeles agregados");
    }

    private boolean buttonIsAvailable(JButton boton) {
        return (newGame.getTableSquare(getXButton(boton), getYButton(boton)).getIdGamer() == noId);
    }

    private int buttonOwner(JButton boton) {
        return (newGame.getTableSquare(getXButton(boton), getYButton(boton)).getIdGamer());
    }

    public int getXButton(JButton boton) {
        Insets insets = boardPanel.getInsets();
        return ((boton.getLocation().x - insets.left) / pixels);
    }

    public int getYButton(JButton boton) {
        Insets insets = boardPanel.getInsets();
        return ((boton.getLocation().y - insets.top) / pixels);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem backMenuItem;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deadHeatButton;
    private javax.swing.JButton image1Button;
    private javax.swing.JButton image2Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.JMenuItem restartMenuItem;
    private javax.swing.JLabel turnoNomLabel;
    // End of variables declaration//GEN-END:variables
}
