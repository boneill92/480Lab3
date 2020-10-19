package com.lab3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField screen;
    private JPanel mainPanel;
    private JButton btnZero;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnClear;
    private JButton btnLeft;
    private JButton btnRight;
    private JButton btnSin;
    private JButton btnCos;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnDivide;
    private JButton btnTan;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnMultiply;
    private JButton btnLog;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnMinus;
    private JButton btnLn;
    private JButton btnDecimal;
    private JButton btnNegative;
    private JButton btnPlus;
    private JButton btnEquals;

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = screen.getText() + btnOne.getText();
                screen.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = screen.getText() + btnTwo.getText();
                screen.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = screen.getText() + btnThree.getText();
                screen.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = screen.getText() + btnFour.getText();
                screen.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = screen.getText() + btnFive.getText();
                screen.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = screen.getText() + btnSix.getText();
                screen.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = screen.getText() + btnSeven.getText();
                screen.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = screen.getText() + btnEight.getText();
                screen.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = screen.getText() + btnNine.getText();
                screen.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = screen.getText() + btnZero.getText();
                screen.setText(btnZeroText);
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDecimalText = screen.getText() + btnDecimal.getText();
                screen.setText(btnDecimalText);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEqualsText = screen.getText() + btnEquals.getText();
                screen.setText(btnEqualsText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPlusText = screen.getText() + btnPlus.getText();
                screen.setText(btnPlusText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMinusText = screen.getText() + btnMinus.getText();
                screen.setText(btnMinusText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMultiplyText = screen.getText() + btnMultiply.getText();
                screen.setText(btnMultiplyText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDivideText = screen.getText() + btnDivide.getText();
                screen.setText(btnDivideText);
            }
        });
        btnSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSinText = screen.getText() + btnSin.getText();
                screen.setText(btnSinText);
            }
        });
        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnCosText = screen.getText() + btnCos.getText();
                screen.setText(btnCosText);
            }
        });
        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTanText = screen.getText() + btnTan.getText();
                screen.setText(btnTanText);
            }
        });
        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnLeftText = screen.getText() + btnLeft.getText();
                screen.setText(btnLeftText);
            }
        });
        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnRightText = screen.getText() + btnRight.getText();
                screen.setText(btnRightText);
            }
        });
        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnLogText = screen.getText() + btnLog.getText();
                screen.setText(btnLogText);
            }
        });
        btnLn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnLnText = screen.getText() + btnLn.getText();
                screen.setText(btnLnText);
            }
        });
        btnNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNegativeText = screen.getText() + btnNegative.getText();
                screen.setText(btnNegativeText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

