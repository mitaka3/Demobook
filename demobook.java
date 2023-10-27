/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class DemoBook {
    public static void main(String[] args)
    {
        Book first = new Book();
        first.setTitle("Solo leveling");
        first.setBookNumber(167);
        
        TextBook second = new TextBook();
        second.setGradeYear(2016);
        
        
        JOptionPane.showMessageDialog(null,"Book Name: " + first.getTitle() + "\nPages: " + first.getBookNumber() + 
                "\nThe year that the book is released: " + second.GetGradeYear());
 
    }
}