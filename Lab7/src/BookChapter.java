
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cderh
 */
public class BookChapter {
    
    private int linesPerPage;
    private ArrayList<Page> pages;
    private String title;
    private String author;

    public BookChapter() {
        
    }

    public int getLinesPerPage() {
        return linesPerPage;
    }

    public void setLinesPerPage(int linesPerPage) {
        this.linesPerPage = linesPerPage;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public BookChapter(int l){
        this.linesPerPage = l;
    }
    public BookChapter(int l, ArrayList<Page> p){
        this.linesPerPage = l;
        this.pages = p;
        
    }
    public BookChapter(int l, ArrayList<Page>p, String t, String a){
        this.linesPerPage = l;
        this.pages = p;
        this.title = t;
        this.author = a;
    }
    
    @Override
    public String toString(){
        String print = "";
        print += "Title: "+this.title +"\n";
        print += "Author: "+this.author +"\n";
        print += "Pages: "+this.pages +"\n";
        print += "Lines per page: "+this.linesPerPage +"\n";
        return print;
        
    }
}
