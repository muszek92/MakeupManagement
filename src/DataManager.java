import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataManager {

    private Scanner scanner;
    private DataStorage dataManager;

    public DataManager(){
        this.dataManager = new DataStorage();
        scanner = new Scanner(System.in);
    }

    public void addCustumerToArray(DataStorage dataManager){
        System.out.println("Podaj imie klientki: ");
        List<String> dataArray = new ArrayList<String>();
        dataArray.add(scanner.next());
    }

}
