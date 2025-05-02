import java.util.ArrayList;
import Item.*;

public class Budget{
    private ArrayList<Item> items = new ArrayList<>();

    //how do we store items in the Budget? Array? Idk how to do this in Java.

    public void addIteam(Item item){
        items.add(item);
    }

    public double total(){
        int total = 0.0;
        for (Item item : items){
            if (item instanceof OneTimeIncome || item instanceof RecurringIncome){
            total += item.getAmount();
        }else{
            total -= item.getValue();
        }
    }
    return total;
  }
