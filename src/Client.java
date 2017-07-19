import java.util.Scanner;

public class Client {
    private String name;
    private String surname;
    private int phone;
    private String additionalInformation;

    Scanner scanner = new Scanner(System.in);

    public Client(String name, String surname, int phone, String additionalInformation) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.additionalInformation = additionalInformation;
    }

    public Client(){
        this.name = getNameTerminal();
        this.surname = getSurnameTerminal();
        this.phone = getPhoneTerminal();
        this.additionalInformation = getAditionalInformationTerminal();
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

    public String getNameTerminal(){
        System.out.println("Podaj imie klientki: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String getSurnameTerminal(){
        System.out.println("Podaj nazwisko klientki: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int getPhoneTerminal(){
        System.out.println("Podaj telefon klientki: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String getAditionalInformationTerminal(){
        System.out.println("Podaj dodatkowe informacje:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}