package com.lab3;

import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

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
    private JButton btnSquare;
    private JButton btnPlus;
    private JButton btnEquals;

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(screen.getText());
        screen.setText("");
    }

    private void expressionEvaluate(String str) {
        System.out.println(str.substring(str.length() - 1));
        if (str.substring(str.length() - 1).equals('(')) {
            screen.setText("");
        }
    }

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
                screen.setText(btnMinusText);;
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
        btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSquareText = screen.getText() + btnSquare.getText();
                screen.setText(btnSquareText);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                screen.setText("");
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //expressionEvaluate(screen.getText());
                String str = screen.getText();
                int n = str.length();
                char last = str.charAt(n-1);
                if(!Character.isDigit(last)) {
                    screen.setText("Error please clear");
                }

                HashMap<Character, Integer> map = new HashMap<>();
                map.put('+', 1);
                map.put('-', 1);
                map.put('*', 2);
                map.put('/', 2);
                map.put('^', 3);
                map.put('(', Integer.MIN_VALUE);

                Stack<Character> operator = new Stack<>();
                Stack<Integer> operand = new Stack<>();
                str = '(' + str + ')';

                for(int i=0;i<str.length();i++){
                    char ch = str.charAt(i);

                    if(ch=='+' || ch == '-' || ch=='*' || ch=='/' || ch == '^'){
                        while(!operator.isEmpty() && map.get(ch)<=map.get(operator.peek())){
                            char op = operator.pop();
                            int pop1 = operand.pop();
                            int pop2 = operand.pop();
                            switch(op){
                                case '+':{
                                    operand.push(pop2+pop1);
                                    break;
                                }
                                case '-':{
                                    operand.push(pop2-pop1);
                                    break;
                                }
                                case '*':{
                                    operand.push(pop2*pop1);
                                    break;
                                }
                                case '/':{
                                    operand.push(pop2/pop1);
                                    break;
                                }
                                case '^':{
                                    operand.push(pop2^pop1);
                                    break;
                                }
                            }
                        }
                        operator.push(ch);
                    }else if(ch=='('){
                        operator.push(ch);
                    }else if(ch==')'){
                        while(!operator.isEmpty() && operator.peek()!='('){
                            char op = operator.pop();
                            int pop1 = operand.pop();
                            int pop2 = operand.pop();
                            switch(op){
                                case '+':{
                                    operand.push(pop2+pop1);
                                    break;
                                }
                                case '-':{
                                    operand.push(pop2-pop1);
                                    break;
                                }
                                case '*':{
                                    operand.push(pop2*pop1);
                                    break;
                                }
                                case '/':{
                                    operand.push(pop2/pop1);
                                    break;
                                }
                                case '^':{
                                    operand.push(pop2^pop1);
                                    break;
                                }
                            }
                        }
                        operator.pop();
                    }else if(ch!=' '){
                        int x = 0;
                        while(Character.isDigit(str.charAt(i))){
                            x = x*10 + Integer.valueOf(str.charAt(i)+"");
                            i++;
                        }
                        i--;
                        operand.push(x);

                    }
                }

                int k = operand.pop();
                screen.setText(String.valueOf(k));
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

//    public static void expressionEvaluate(String str) {
//        if (str.substring(str.length() - 1).equals('(')) {
//            screen.setText("");
//        }
//    }
}

