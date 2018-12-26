package package2;

import package1.Book;

/**
 * Created by aselsan on 26.12.2018 at 11:10.
 */

public class SubBook extends Book {
    protected void get(){
        getAll();
        name = "Another package";

        Book b = new Book();
        // b.name = "adasd"; // NOT ACCESSIBLE

        // surname = "Asd"; // NOT ACCESSIBLE SINCE IT'S PACKAGE PRIVATE
        // b.surname = "Asd"; // NOT ACCESSIBLE SINCE IT'S PACKAGE PRIVATE
    }
}
