import java.awt.*;
class Tie 
{
    static Frame f = new Frame("Result");
    Label l ,k;
    Tie()
    {
                
        l = new Label("   It's a Tie !!!");
        l.setForeground(Color.black);
        l.setBackground(Color.yellow);
        l.setBounds(0,0,800,600);
        l.setFont(new java.awt.Font("w",Font.BOLD,65));
        f.add(l);
        k = new Label();
        f.add(k); 
        
        f.dispose();
        
    }
    
    public static void main()
    {
        new Tie();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(800,600);
    }
}