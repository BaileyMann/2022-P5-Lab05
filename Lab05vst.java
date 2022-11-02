// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);

        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;
//bottom right
        for (int k = 0; k < 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 -= 12;


        }
//bottom left
        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;

        for (int k = 0; k < 49; k++) {
            g.drawLine(x2, y2, x1, y1);
            x2 -= 20;
            y1 -= 12;


        }
        //top left
        x1 = 990;
        y1 = 10;
        x2 = 10;
        y2 = 10;

        for (int k = 0; k < 49; k++) {
            g.drawLine(x2, y2, x1, y1);
            x1 -= 20;
            y2 += 13;
        }
//top right
        x1 = 10;
        y1 = 10;
        x2 = 990;
        y2 = 10;

        for (int k = 0; k < 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 += 12;
        }
        //110 point rectangle
        int width2 = 490;
        int height2 = 315;
        g.drawRect(262, 165, width2, height2);

        //110 point top right
        x1 = 262;
        y1 = 165;
        x2 = 752;
        y2 = 175;

        for (int k = 0; k < 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 10;
            y2 += 6;
        }
        //110 point top left
        x1 = 262;
        y1 = 165;
        x2 = 752;
        y2 = 175;
        for (int k = 0; k < 49; k++) {
            g.drawLine(x2, y1, x1, y2);
            x2 -= 10;
            y2 += 6;

        }
        //110 point bottom right
        x1 = 262;
        y1 = 480;
        x2 = 752;
        y2 = 480;
        for (int k = 0; k < 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 10;
            y2 -= 6;


        }
        //110 point bottom left
        x1 = 262;
        y1 = 480;
        x2 = 752;
        y2 = 470;
        for (int k = 0; k < 49; k++) {
            g.drawLine(x2, y1, x1, y2);
            x2 -= 10;
            y2 -= 6;
        }


    }}
