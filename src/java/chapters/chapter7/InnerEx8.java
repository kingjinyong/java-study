package chapter7;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//익명 클래스 변환 후
public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    System.out.println("ActionEvent occurred!!");
                                }
                            }// 익명 클래스의 끝
        );
    }
}
