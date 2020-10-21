
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player {

    private String name;
    private String position;
    private BufferedImage  cardImage;
    
//private Image PlayerCard;
    /**
     * The constructor for Player Class
     * @param name "Kyrie Irving", "Lebron James"
     * @param position "PG", "PF"
     * @param cardImage cardImage.jpg
     **/

    public Player(String name, String position, BufferedImage cardImage) {
        this.name = name;
        this.position = position;
        this.cardImage = cardImage;

    }
    //This methods returns the names and positions of Players
    public String getName() {

        return name;
    }

    public String getPOS() {
        return position;
    }
    public BufferedImage getImage() {
    	System.out.print(cardImage);
        return cardImage;
    }
    
   
	//toString method
    public String toString() {
        return "Player" + " Name:" + name + " Position:" + position;
    }


}
