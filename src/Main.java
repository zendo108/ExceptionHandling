/*
 * Page 406 javanotes7 Textbook
 */
import com.inc108.classes.IvanError;
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
    static String name = "Ivan";
    public static void main(String[] args){
//        try {
//            // TODO code application logic here
//            FileWriter writer = new FileWriter("/data.txt");
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        try{
            
            if(name != "Ivan"){
                System.out.println("name is wrong, throwing IvanError");
                throw new IvanError("The name is wrong");
            }else{
                System.out.println("name is right");
            }
        }catch(IvanError ie){
            System.out.println("caught the IvanError");
        }
    }
    
    static void getUserData() throws ParseError {
        
    }
    
}
