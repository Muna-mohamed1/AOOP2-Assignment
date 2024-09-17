package movie;

import java.util.ArrayList;
import java.util.List;


public class movie  {

     private List<movieItem> Items;

     public  movie()
     {
         Items= new ArrayList<>();

     }
     public void addmovieItem(movieItem item)

     {
         Items.add(item);
     }
     public void printmovieDetails()
     {
        for (movieItem item:Items){
            item.printDetails();
        }
     }
}
