package SL67;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock(3000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"是否退出?");
        System.exit(0);
    }
}
