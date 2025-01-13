import java.util.Scanner;

public class TryCatch {
    public static void registerUser (String login, String password, String confirmPassword) throws IllegalArgumentException
    {
        // Проверка логина
        if (!isValidLogin(login))
        {
            throw new IllegalArgumentException("логин должен содержать только латинские буквы, цифры и точку, и быть менее 15 символов");
        }

        // Проверка пароля
        if (!isValidPassword(password))
        {
            throw new IllegalArgumentException("пароль должен содержать только латинские буквы, цифры и точку, и быть от 6 до 20 символов");
        }

        // Проверка совпадения пароля и его подтверждения
        if (!password.equals(confirmPassword))
        {
            throw new IllegalArgumentException("пароли не совпадают");
        }

        // Если все проверки пройдены, можно продолжать регистрацию
        System.out.println("пользователь успешно зарегистрирован");
    }

    private static boolean isValidLogin(String login) {
        return login.matches("^[a-zA-Z0-9.]{1,14}$");
    }

    private static boolean isValidPassword(String password) {
        return password.matches("^[a-zA-Z0-9.]{6,20}$");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите логин: ");
        String login = scanner.nextLine();

        System.out.print("введите пароль: ");
        String password = scanner.nextLine();

        System.out.print("повторите пароль: ");
        String confirmPassword = scanner.nextLine();

        try {
            registerUser (login, password, confirmPassword);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
