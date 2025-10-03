import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class RollNo7360_a9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch = 1;
        while (ch != 0){
            System.out.print("\n0. Exit\n1. Get IP from domain name\n2. Get domain name from IP\nChoice: ");
            ch = scanner.nextInt();
            scanner.nextLine();  // consume newline
            if (ch == 1){
                System.out.print("Enter domain name: ");
                String domain = scanner.nextLine();
                try {
                    InetAddress address = InetAddress.getByName(domain);
                    System.out.println("IP Address for " + domain + " is: " + address.getHostAddress());
                } catch (UnknownHostException e) {
                    System.out.println("Unable to resolve host: " + e.getMessage());
                }
            }
            else if (ch == 2){
                System.out.print("Enter IP address: ");
                String ip = scanner.nextLine();
                try {
                    InetAddress addr = InetAddress.getByName(ip);
                    String host = addr.getHostName();
                    System.out.println("Reverse DNS for " + ip + " -> " + host);
                } catch (UnknownHostException e) {
                    System.err.println("Lookup failed: " + e.getMessage());
                }
            }
            else if (ch != 0){
                System.out.println("Invalid choice!");
            }
        }     
        scanner.close(); // OK to close here once
    }
}
