import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class NBACARDSTEST{


    public static void main(String[] args) throws IOException {
    	//Adding the Player Cards to deck
    	ArrayList <Player> deck = new ArrayList <Player>(); 
        Player KIBKLN = new Player ("Kyrie Irving", "PG", ImageIO.read(new File("/C:/Users/Keimon/eclipse-workspace/NBACARDS/src/CardImages/KyrieBKLN.jpg")));
        Player LBLAKE = new Player ("Lebron James", "PF", ImageIO.read(new File("/C:/Users/Keimon/eclipse-workspace/NBACARDS/src/CardImages/LBJLKS.png")));
        deck.add(KIBKLN);
        deck.add(LBLAKE);
        //Creating window and panel
        JFrame window = new JFrame("Card Display");
        window.setSize(800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel CardPane = new JPanel();
        CardPane.setLayout(new FlowLayout());
        JPanel LeftSpace = new JPanel();
        JPanel RightSpace = new JPanel();
        
        //Making labels to put the cards in and resizing them according to label size
        JLabel FocusedCard = new JLabel();
        JLabel KyrieLabel = new JLabel();
        JLabel LebronLabel = new JLabel();
        LebronLabel.setIcon(new ImageIcon(new ImageIcon(LBLAKE.getImage()).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        KyrieLabel.setIcon(new ImageIcon(new ImageIcon(KIBKLN.getImage()).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        
        Border border = new LineBorder(Color.ORANGE, 4, true);
        Border border2 = new LineBorder(Color.RED, 4, true);
        Border border3 = new LineBorder(Color.BLUE, 4, true);
        Border border4 = new LineBorder(Color.GREEN, 4, true);
        //Cosmetics for MainPane
        //Sizing&Cosmetics&Label Adding for CardPane
        CardPane.add(LebronLabel);
        CardPane.add(KyrieLabel);
        CardPane.setBorder(border);
        CardPane.setSize(800, 300);
      //Sizing&Cosmetics&Label Adding for FocusCardPane
        FocusedCard.setBorder(border2);
        LeftSpace.setBorder(border3);
        RightSpace.setBorder(border4);
        LeftSpace.setPreferredSize(new Dimension(400, 400));
        RightSpace.setPreferredSize(new Dimension(400, 400));
        FocusedCard.setPreferredSize(new Dimension(400, 400));
       
        window.add(FocusedCard,BorderLayout.CENTER);
        window.add(CardPane, BorderLayout.PAGE_END);
        window.add(LeftSpace,BorderLayout.LINE_START);
        window.add(RightSpace,BorderLayout.LINE_END);
        
        LebronLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	FocusedCard.setIcon(new ImageIcon(new ImageIcon(LBLAKE.getImage()).getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH)));
            }
        });
        
        KyrieLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	FocusedCard.setIcon(new ImageIcon(new ImageIcon(KIBKLN.getImage()).getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH)));
            }
        });
        window.setVisible(true);
    }

    
}
