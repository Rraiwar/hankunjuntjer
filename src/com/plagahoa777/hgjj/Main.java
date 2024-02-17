package com.plagahoa777.hgjj;

import com.plagahoa777.hgjj.helpers.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    public static void main(String[] args) {
        // สร้าง Frame
        JFrame frame = new JFrame("หารกันจนเจอ");
        frame.setSize(640,480);
        frame.setLayout(null);





        // สร้าง Input
        JTextField inputTextfield = new JTextField();
        inputTextfield.setBounds(20,20,550,50);
        frame.add(inputTextfield);

        //สร้าง ตัวอักษรแสดงข้อความ **ทำเป็น Output แสดงข้อความได้**
        JLabel outputlebel = new JLabel("...");
        outputlebel.setBounds(20,160,550,60);
        frame.add(outputlebel);

        //สร้าง BUTTON
        JButton button = new JButton("OK");
        button.setBounds(20,100,250,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextfield.getText();
                int inputnumber = Integer.parseInt(inputText);
                String output= Calculator.getDivisibleOutput(inputnumber);
                outputlebel.setText(output);
            }
        });
        frame.add(button);

        // ตั้งค่าให้ JLabel อยู่ด้านหลังสุด (ให้องค์ประกอบอื่น ๆ อยู่ด้านหน้า)

        //ออกจากโปรแกรมโดยไม่ต้องปิดโปรแกรม
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //แสดงโปรแกรม
        frame.setVisible(true);
    }


}