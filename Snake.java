import javax.swing.JFrame;
public class Snake {
    public static void main(String[] args) {
        JFrame jfrm=new JFrame("Snake Game");
        GamePanel panel=new GamePanel();

        jfrm.add(panel);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setResizable(false);
        jfrm.pack();
        jfrm.setLocationRelativeTo(null);
        jfrm.setVisible(true);
    }
}
