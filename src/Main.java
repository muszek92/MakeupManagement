
public class Main {
    public static void main(String[] args) {
        Client newClient = new Client();
        System.out.println("\n Imie klientki: " + newClient.getName() + "\n Nazwisko to: " + newClient.getSurname() + "\n Numer do klientki: " + newClient.getPhone()+ "\n Doodatkowe informacje: " + newClient.getAdditionalInformation());
    }

}
