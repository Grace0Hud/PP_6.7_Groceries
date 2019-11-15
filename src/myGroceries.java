import java.util.ArrayList;
import java.util.ListIterator;
public class myGroceries
{
    public static void main(String[] args)
    {
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("chocolate milk");
        groceryList.add("2lb of frosting");
        groceryList.add("hot chocolate");
        ListIterator it = groceryList.listIterator();
        
        System.out.println("You need to get " + groceryList.size() + " items");
        System.out.println("Here's your list: ");
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println();

        System.out.println("--------------------------------");
        System.out.println("You got the frosting!");
        groceryList.remove(2);
        System.out.println("You need to get " + groceryList.size() + " items");
        it = groceryList.listIterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("--------------------------------");
        System.out.println("The first item of the list is: " + groceryList.get(0));

    }//end of main method
}//end of class myGroceries
