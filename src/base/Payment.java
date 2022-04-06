package base;

public interface Payment {

    double calculatePayment(int quota, double price);

    double calculatePayment(double payment, double discount);
}
