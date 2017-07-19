import java.text.SimpleDateFormat;

public class Service {

    private String name;
    private String additionalInformation;
    private String monthData;
    private double cost;

    //deklaracja obsługiwanych miesięcy
    String [] months  = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Listopad", "Październik", "Grudzień"};


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

    public String getData() {
        return monthData;
    }

    public void setData(String data) {
        for (int i = 0; i < months.length; i++){
            if (data.equals(months[i])){
                this.monthData = monthData;
                break;
            }else {
                System.out.println("Nie ma takiego miesiąca");
                break; // Jak poprosić o wpisanie ponownie?

            }
        }

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
