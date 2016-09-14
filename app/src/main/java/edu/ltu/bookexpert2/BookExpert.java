package edu.ltu.bookexpert2;

import java.util.ArrayList;
import java.util.List;

public class BookExpert
{
    List<String> getBrands(String Book_Category)
    {
        List<String> Books = new ArrayList<>();

        if(Book_Category.equals("Fiction"))
        {
            Books.add("Book1");
            Books.add("Book1-1");
        }
        else
        {
            if(Book_Category.equals("Horror"))
            {
                Books.add("Book2");
                Books.add("Book2-1");
            }
            else
            {Books.add("Book3");
                Books.add(("Book3-1"));
            }
        }
        // ..
        return Books;
    }
}
