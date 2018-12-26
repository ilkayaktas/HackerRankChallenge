package package1;

/**
 * Created by aselsan on 26.12.2018 at 11:09.
 */

public class SubBook extends Book {
    protected void getAgain(){
        getAll();
        name = "Aktas";

        Book b = new Book();
        b.name = "QQQ";
        b.getAll();

        getPackagePrivate();
        surname = "Surname";

        b.surname = "Asd";
        b.getPackagePrivate();
    }
}
