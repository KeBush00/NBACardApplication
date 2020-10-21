

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class DeckOfCards {
    public ArrayList<Player> deck;
    public Image DeckBackImage;

    public DeckOfCards() throws IOException{
        deck = new ArrayList<Player>();
        Player KI = new Player("Kyrie Irving","PG", ImageIO.read(new File("cardImages/KyrieBKLN.jpg")));
        deck.add(KI);
       
    }

    

}
