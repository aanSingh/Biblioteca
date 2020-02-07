public class Bibliotecha {
    String welcomeMessage;

    Bibliotecha() {
        welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
    }

    void welcome() {
        System.out.println(welcomeMessage);
    }

    public static void main(String[] args) {
        Bibliotecha bibliotecha = new Bibliotecha();
        bibliotecha.welcome();
    }
}
