/*
 * Page 406 javanotes7 Textbook
 */
import com.inc108.classes.ParseError;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author IvanAranda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            // TODO code application logic here
            FileWriter writer = new FileWriter("/data.txt");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void getUserData() throws ParseError {
        
    }
    
}
