import java.awt.*;
class Win
{
    static Frame f = new Frame("Result");
    Label l ,k;
    Win()
    {
        
        l = new Label("      Victory!!!");
        l.setForeground(Color.red);
        l.setBackground(Color.black);
        l.setBounds(0,0,800,600);
        l.setFont(new java.awt.Font("w",Font.BOLD,65));
        f.add(l);
        k = new Label();
        f.add(k);
    }
    public static void main()
    {
        new Win();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(800,600);
    }
}