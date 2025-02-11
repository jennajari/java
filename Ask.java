import java.util.Scanner;

public class Ask {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom:");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre age:");
        int age = 0;
        if (scanner.hasNextInt()){
            age = scanner.nextInt();
        }
        else{
            System.out.println("Age non correct!");
            System.exit(0);
        }

        scanner.close();

        System.out.println("Bonjour," + nom + "! Vous avez " + age + "ans");

        if (age > 18) {
            System.out.println("Vous etes majeur !");
        } else {
            System.out.println("vous etes mineur !");
        }

    }
}
