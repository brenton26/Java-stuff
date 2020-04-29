import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GroceryList myList = new GroceryList();


    }
}



class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public GroceryList() {
        menu();
    }

    private void menu(){
        boolean flag = false;
        while (!flag) {
            System.out.println("\n#####################################################");
            System.out.println("##    Welcome to Ed's fucking grocery list app!    ##");
            System.out.println("#####################################################");
            System.out.println("Options:    1) View List                          |");
            System.out.println("            2) Add Item                           |");
            System.out.println("            3) Edit Item                          |");
            System.out.println("            4) Find Item                          |");
            System.out.println("            5) Delete Item                     \\  |  /");
            System.out.println("            6) Delete List                      \\ | /");
            System.out.println("            7) Quit this stupid fucking app      \\|/");
            System.out.println("                                                  V");
            System.out.print("                    Now choose a fucking option:  ");
            Scanner in = new Scanner(System.in);
            int optionSelection = in.nextInt();

            switch (optionSelection) {

                case 1:
                    printList();
                    break;
                case 2:
                    System.out.println("\n#########################");
                    System.out.println("##    Add Item Menu    ##");
                    System.out.println("#########################");
                    System.out.print("\nItem to add: ");
                    String itemToAdd = in.next();
                    addItem(itemToAdd);
                    break;
                case 3:
                    System.out.println("\n############################");
                    System.out.println("##    Modify Item Menu    ##");
                    System.out.println("############################");
                    System.out.print("\nItem number to modify: ");
                    int index = in.nextInt();
                    String itemToModify = groceryList.get(index-1);
                    System.out.print(String.format("\nWhat the fuck do you want to change %s to?: ", itemToModify));
                    String newItem = in.next();
                    modifyItem(index-1, newItem);
                    break;
                case 4:
                    System.out.println("\n#######################");
                    System.out.println("##    Search Menu    ##");
                    System.out.println("#######################");
                    System.out.print("\nSearch for what fucking item?: ");
                    String itemToFind = in.next();
                    findItem(itemToFind);
                    break;
                case 5:
                    System.out.println("\n############################");
                    System.out.println("##    Delete Item Menu    ##");
                    System.out.println("############################");
                    System.out.print("\nItem number to delete: ");
                    int itemToDelete = in.nextInt();
                    removeItem(itemToDelete-1);
                    break;
                case 6:
                    deleteList();
                    break;
                case 7:
                    flag = true;
                    break;
                default:
                    System.out.println("Not a fucking option");
                    in.nextLine();
                    break;
            }
        }
    }


    private void addItem(String item) {
        groceryList.add(item);
    }

    private void printList() {
        System.out.println("\n########################");
        System.out.println("##    Grocery List    ##");
        System.out.println("########################");
        if (groceryList.size() == 0) {
            System.out.println("  .-'---`-.\n" +
                    ",'          `.\n" +
                    "|             \\\n" +
                    "|              \\\n" +
                    "\\           _  \\\n" +
                    ",\\  _    ,'-,/-)\\\n" +
                    "( * \\ \\,' ,' ,'-)\n" +
                    " `._,)     -',-')\n" +
                    "   \\/         ''/\n" +
                    "    )        / /\n" +
                    "   /       ,'-'");
            System.out.println("List is fucking empty");
            Scanner in = new Scanner(System.in);
            in.nextLine();
        } else {
            for (int i=0; i<groceryList.size(); i++) {
                System.out.println(String.format("%s: %s", i+1, groceryList.get(i)));
            }
            System.out.println("\nHit Enter to continue");
            Scanner in = new Scanner(System.in);
            in.nextLine();
        }
    }

    private void modifyItem(int index, String newItem) {
        String oldItem = groceryList.get(index);
        groceryList.set(index, newItem);
        System.out.println(String.format("%s has been fucking modified to: %s", oldItem, newItem));
    }

    private void removeItem(int index) {
        String deletedItem = groceryList.get(index);
        groceryList.remove(index);
        System.out.println(String.format("%s has been fucking removed from the list", deletedItem));
    }

    private void deleteList() {
        System.out.println("             . . .                         \n" +
                "              \\|/                          \n" +
                "            `--+--'                        \n" +
                "              /|\\                          \n" +
                "             ' | '                         \n" +
                "               |                           \n" +
                "               |                           \n" +
                "           ,--'#`--.                       \n" +
                "           |#######|                       \n" +
                "        _.-'#######`-._                    \n" +
                "     ,-'###############`-.                 \n" +
                "   ,'#####################`,               \n" +
                "  /#########################\\              \n" +
                " |###########################|             \n" +
                "|#############################|            \n" +
                "|#############################|            \n" +
                "|#############################|            \n" +
                "|#############################|            \n" +
                " |###########################|             \n" +
                "  \\#########################/              \n" +
                "   `.#####################,'               \n" +
                "     `._###############_,'                 \n" +
                "        `--..#####..--'");
        try {
            System.out.print("3... ");
            Thread.sleep(1000);
            System.out.print("2... ");
            Thread.sleep(1000);
            System.out.print("1...");
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println("\nStopped deletion!");
        }

        System.out.println("                               ________________\n" +
                "                          ____/ (  (    )   )  \\___\n" +
                "                         /( (  (  )   _    ))  )   )\\\n" +
                "                       ((     (   )(    )  )   (   )  )\n" +
                "                     ((/  ( _(   )   (   _) ) (  () )  )\n" +
                "                    ( (  ( (_)   ((    (   )  .((_ ) .  )_\n" +
                "                   ( (  )    (      (  )    )   ) . ) (   )\n" +
                "                  (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )\n" +
                "                  ( (  (   ) (  )   (  ))     ) _)(   )  )  )\n" +
                "                 ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )\n" +
                "                  (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )\n" +
                "                 ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )\n" +
                "                  ((  (   )(    (     _    )   _) _(_ (  (_ )\n" +
                "                   (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)\n" +
                "                   ((__)        \\\\||lll|l||///          \\_))\n" +
                "                            (   /(/ (  )  ) )\\   )\n" +
                "                          (    ( ( ( | | ) ) )\\   )\n" +
                "                           (   /(| / ( )) ) ) )) )\n" +
                "                         (     ( ((((_(|)_)))))     )\n" +
                "                          (      ||\\(|(|)|/||     )\n" +
                "                        (        |(||(||)||||        )\n" +
                "                          (     //|/l|||)|\\\\ \\     )\n" +
                "                        (/ / //  /|//||||\\\\  \\ \\  \\ _)\n" +
                "-------------------------------------------------------------------------------");
        groceryList.clear();
        System.out.println("Your goddamn list was deleted");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

    private void findItem(String searchTerm) {
        boolean itemInList = groceryList.contains(searchTerm);
        if (!itemInList) {
            System.out.println("\nThat bullshit ain't in the grocery list");
            System.out.println("\nHit Enter to continue");
            Scanner in = new Scanner(System.in);
            in.nextLine();
        } else {
            int index = groceryList.indexOf(searchTerm);
            System.out.println(String.format("\n%s is goddamn item number %s in your mother fucking list", searchTerm, index+1));
            System.out.println("\nHit Enter to continue");
            Scanner in = new Scanner(System.in);
            in.nextLine();
        }
    }
}
