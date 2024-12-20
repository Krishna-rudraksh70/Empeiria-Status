import javax.swing.*;

public class wtf {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Background Task Example");
        JButton button = new JButton("Start Task");

        button.addActionListener(e -> {
            Thread backgroundThread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Background Task " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            backgroundThread.start();
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
