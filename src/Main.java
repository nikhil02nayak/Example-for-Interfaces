import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Nikhil",20,25);
        System.out.println(player.toString()) ;
        saveobject(player);
        loadobjects(player);
        System.out.println(player);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveobject (Isaveable objecttosave )
    {

        for (int i = 0 ; i<objecttosave.write().size() ; i++)
        {
            System.out.println("saving " + objecttosave.write().get(i) + " to storage device");
        }
    }
    public static void loadobjects (Isaveable objecttoload)
    {
        ArrayList<String> values = readValues() ;
        objecttoload.read(values);
    }


}
