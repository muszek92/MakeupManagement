import java.util.Scanner;

public class Customer {

    private String name;
    private String surname;
    private String phone;
    private String additionalInformation;
    Scanner scanner = new Scanner(System.in);


    Service service = new Service();

    public void sprawdzanieDaty(){
        System.out.println("Podaj date");
        service.setData(scanner.next());
    }

}
