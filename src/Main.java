import controllers.ClientController;
import models.Client;
import views.ClientView;

public class Main {

    public static void main(String[] args) {

        Client model = new Client();
        ClientView view = new ClientView(model);
        ClientController controller = new ClientController(model, view);
        controller.runApp();
    }
}
