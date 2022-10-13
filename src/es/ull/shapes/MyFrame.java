package es.ull.shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    private MyPanel panel = new MyPanel();
    public MyFrame() {
        setSize(780, 600);
        setTitle("Shapes");
        setLocationRelativeTo(this);
        panel.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.getContentPane().add(panel);
        setLabels();
        setButtons();
    }

    private void setLabels() {
        MyLabel label1 = new MyLabel("Choose one of the following shapes", 200, 10, 500, 50);
        label1.setVisible(true);
        panel.add(label1);

        setLabelsImage("Square.png", 50);
        setLabelsImage("Triangle.jpg",300);
        setLabelsImage("Circle.png", 550);
    }

    private void setLabelsImage(String text, int x) {
        ImageIcon image = new ImageIcon(text);
        MyLabel label2 = new MyLabel();
        label2.setBounds(x, 300, 150, 150);
        label2.setIcon(new ImageIcon(image.getImage().getScaledInstance(label2.getWidth(),label2.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(label2);
    }

    private void setButtons() {

        setButtonSquare();
        setButtonTriangle();
        setButtonCircle();
        putExitButtonPrincipal();
    }

    private void setButtonSquare() {
        MyButton button1 = new MyButton("Square", 50, 200, 150, 30);
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog1 = new MyDialog("Square - data", 500, 350);

                MyLabel labelSq = new MyLabel("Type the value of the side of the square", 50, 30, 400,30);
                dialog1.add(labelSq);

                MyTextField textField1 = new MyTextField(150,70,200, 30);
                dialog1.add(textField1);

                MyButton exitB = new MyButton("Exit", 10, 200,150, 30);
                dialog1.add(exitB);
                ActionListener listenerExit = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog1.dispose();
                    }
                };
                exitB.addActionListener(listenerExit);

                MyButton buttonSq = new MyButton("Calculate",300, 200, 150, 30);
                dialog1.add(buttonSq);

                ActionListener listener2 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Square sq = new Square(Double.parseDouble(textField1.getText()));
                        MyDialog dialog2 = new MyDialog("Result", 500,400);
                        MyLabel labelResultArea = new MyLabel("", 70, 50, 500, 30);
                        labelResultArea.setText("The value of the area is: " + sq.getArea());
                        dialog2.add(labelResultArea);

                        MyLabel labelResultPerim = new MyLabel("", 70, 100, 500, 30);
                        labelResultPerim.setText("The value of the perimeter is: " + sq.getPerimeter());
                        dialog2.add(labelResultPerim);
                    }
                };
                buttonSq.addActionListener(listener2);
            }
        };
        button1.addActionListener(listener1);
        panel.add(button1);
    }

    private void setButtonTriangle() {
        MyButton button1 = new MyButton("Triangle", 300, 200, 150, 30);
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog1 = new MyDialog("Triangle - data", 500, 350);

                MyLabel labelTr = new MyLabel("Type the value of the side of the triangle", 50, 30, 400,30);
                dialog1.add(labelTr);

                MyTextField textField1 = new MyTextField(150,70,200, 30);
                dialog1.add(textField1);

                MyLabel labelTr2 = new MyLabel("Type the value of the height of the triangle", 50, 100, 400,30);
                dialog1.add(labelTr2);

                MyTextField textField2 = new MyTextField(150,140,200, 30);
                dialog1.add(textField2);

                MyButton exitB = new MyButton("Exit", 10, 200,150, 30);
                dialog1.add(exitB);
                ActionListener listenerExit = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog1.dispose();
                    }
                };
                exitB.addActionListener(listenerExit);

                MyButton buttonTr = new MyButton("Calculate",300, 200, 150, 30);
                dialog1.add(buttonTr);

                ActionListener listener2 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Triangle tr = new Triangle(Double.parseDouble(textField1.getText()), Double.parseDouble(textField2.getText()));
                        MyDialog dialog2 = new MyDialog("Result", 500,400);
                        MyLabel labelResultArea = new MyLabel("", 70, 50, 500, 30);
                        labelResultArea.setText("The value of the area is: " + tr.getArea());
                        dialog2.add(labelResultArea);

                        MyLabel labelResultPerim = new MyLabel("", 70, 100, 500, 30);
                        labelResultPerim.setText("The value of the perimeter is: " + tr.getPerimeter());
                        dialog2.add(labelResultPerim);
                    }
                };
                buttonTr.addActionListener(listener2);
            }
        };
        button1.addActionListener(listener1);
        panel.add(button1);
    }

    private void setButtonCircle() {

        MyButton button3 = new MyButton("Circle", 550, 200, 150, 30);
        button3.setVisible(true);
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog1 = new MyDialog("Circle - data", 500, 350);

                MyLabel labelCir = new MyLabel("Type the value of the radius of the circle", 50, 30, 400,30);
                dialog1.add(labelCir);

                MyTextField textField1 = new MyTextField(150,70,200, 30);
                dialog1.add(textField1);

                MyButton exitB = new MyButton("Exit", 10, 200,150, 30);
                dialog1.add(exitB);
                ActionListener listenerExit = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog1.dispose();
                    }
                };
                exitB.addActionListener(listenerExit);

                MyButton buttonCir = new MyButton("Calculate",300, 200, 150, 30);
                dialog1.add(buttonCir);

                ActionListener listener2 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Circle cir = new Circle(Double.parseDouble(textField1.getText()));
                        MyDialog dialog2 = new MyDialog("Result", 500,400);
                        MyLabel labelResultArea = new MyLabel("", 70, 50, 500, 30);
                        labelResultArea.setText("The value of the area is: " + cir.getArea());
                        dialog2.add(labelResultArea);

                        MyLabel labelResultPerim = new MyLabel("", 70, 100, 500, 30);
                        labelResultPerim.setText("The value of the perimeter is: " + cir.getPerimeter());
                        dialog2.add(labelResultPerim);
                    }
                };
                buttonCir.addActionListener(listener2);
            }
        };
        button3.addActionListener(listener1);
        panel.add(button3);
    }

    private void putExitButtonPrincipal() {
        MyButton exitB = new MyButton("Exit", 550, 500,150, 30);
        panel.add(exitB);

        ActionListener listener = e -> dispose();
        exitB.addActionListener(listener);
    }

}
