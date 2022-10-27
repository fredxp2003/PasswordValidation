import java.util.Scanner;

public class App {

    public static boolean validate(String password) {
        int a = 0;

        if (password.length() < 8 || password.length() > 16) {
            return false;
        } else {
            // check for lowercase
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    a++;
                    break;
                }
            }
            // check for uppercase
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    a++;
                    break;
                }
            }
            // check for digit
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    a++;
                    break;
                }
            }
            // check for special character
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'
                        || password.charAt(i) == '$' || password.charAt(i) == '%'
                        || password.charAt(i) == '^' || password.charAt(i) == '&'
                        || password.charAt(i) == '*' || password.charAt(i) == '('
                        || password.charAt(i) == ')' || password.charAt(i) == '-'
                        || password.charAt(i) == '_' || password.charAt(i) == '+'
                        || password.charAt(i) == '=' || password.charAt(i) == '~') {
                    a++;
                    break;
                }
            }
        }

        if (a >= 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Create a password:  ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (validate(password) == true) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }
        scanner.close();
    }
}
