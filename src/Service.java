import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Service {

    private String name;
    private String additionalInformation;
    private double cost;
    private Date serviceDate;

    Scanner scanner = new Scanner(System.in);

    public Service (String name, String additionalInformation, Date serviceDate, double cost) {
        this.name = name;
        this.additionalInformation = additionalInformation;
        this.serviceDate = serviceDate;
        this.cost = cost;
    }

    public Service(){
        this.name = getNameTerminal();
        this.additionalInformation = getAdditionalInformationTerminal();
        this.serviceDate = getServiceDateTerminal();
        this.cost = getCostTerminal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost < 0 ){
            System.out.println("Koszt usługi nie może być mniejszy od zera");
        }else
        this.cost = cost;
    }

    public String getNameTerminal(){
        System.out.println("Podaj nazwę usługi: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public String getAdditionalInformationTerminal(){
        System.out.println("Podaj dodatkowe infomacje o usłudze: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public Date getServiceDateTerminal(){
        System.out.println("Podaj datę na którą umówiona jest klientka  w formacie <yyyy-mm-dd hh:mm>: ");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm");
        try {
            return dt.parse(scanner.nextLine());
        } catch (ParseException e) {
//            e.printStackTrace();
            System.out.println("Podana data jest nie prawidłowa.");
            return getServiceDateTerminal();
        }
    }

    public Double getCostTerminal(){
        System.out.println("Podaj koszt usługi: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }



}
