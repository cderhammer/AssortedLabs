
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cderh
 */
public class BookChapterReadWrite {

    public static BookChapter loadBookChapterFromFile(String filename) throws FileNotFoundException, IOException {

        File file = new File(filename);
        Scanner s = new Scanner(file);
        String title = s.nextLine();
        String author = s.nextLine();
        int linesPerPage = Integer.parseInt(s.nextLine());

        ArrayList<Page> pages = new ArrayList<>();
        while(s.hasNextLine()){
            pages.add(getPage(s, linesPerPage));
        }
        s.close();
        BookChapter chapter = new BookChapter(linesPerPage, pages, title, author);
        return chapter;
    }

    public static Page getPage(Scanner scanner, int numLines) {
        
        
        String[] a = new String[numLines];
        for (int i = 0; i < numLines; i++) {
            a[i] = scanner.nextLine();
        }
        return new Page(a);
    }

    @Override
    public String toString(){
        return "";
    }
    public static void writeBookChapterToFile(BookChapter book, String filename) throws FileNotFoundException, IOException {
        FileOutputStream c = new FileOutputStream(filename);
        PrintWriter d=new PrintWriter(c);
        d.print(book);
        for(int i = 0; i < book.getPages().size(); i++){
            for(int k = 0; k < book.getPages().get(i).getLines().length; k++){
                d.print(book.getPages().get(i).getLines()[k]);
            }
        }
        d.flush();
        c.close();

    }

}
