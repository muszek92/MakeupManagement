
import java.util.Calendar;
import java.util.Scanner;

public class Service {

    private String name;
    private String additionalInformation;
    private Calendar serviceDate;
    private double cost;

    Scanner scanner = new Scanner(System.in);

    public Service (String name, String additionalInformation, Calendar serviceDate, double cost) {
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

    public Calendar getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Calendar serviceDate) {
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


}
