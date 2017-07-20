import java.util.Scanner;

public class Client {
    private String name;
    private String surname;
    private int phone;
    private String additionalInformation;



    public Client(String name, String surname, int phone, String additionalInformation) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.additionalInformation = additionalInformation;
    }

    public Client(Scanner scanner){
        this.name = getNameTerminal(scanner);
        this.surname = getSurnameTerminal(scanner);
        this.phone = getPhoneTerminal(scanner);
        this.additionalInformation = getAditionalInformationTerminal(scanner);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getNameTerminal(Scanner scanner){
        System.out.println("Podaj imie klientki: ");
        return scanner.next();
    }

    public String getSurnameTerminal(Scanner scanner){
        System.out.println("Podaj nazwisko klientki: ");
        return scanner.next();
    }

    public int getPhoneTerminal(Scanner scanner){
        System.out.println("Podaj telefon klientki: ");
        return scanner.nextInt();
    }

    public String getAditionalInformationTerminal(Scanner scanner){
        System.out.println("Podaj dodatkowe informacje:");
        return scanner.next();
    }

}