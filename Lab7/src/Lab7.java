
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cderh
 */
public class Lab7 {
    
    BookChapterReadWrite bcrw;
    BookChapter bc;

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception{
        
        
        BookChapter bookChapter = new BookChapter();
        
        BookChapterReadWrite.loadBookChapterFromFile("C:\\Users\\cderh\\OneDrive\\Documents\\NetBeansProjects\\Lab7\\Lab7GOT.txt");
        
        System.out.println(bookChapter.toString());
        
        BookChapterReadWrite.writeBookChapterToFile(bookChapter, "C:\\Users\\cderh\\OneDrive\\Documents\\NetBeansProjects\\Lab7\\Lab7GOT.txt");
    }
    
}
