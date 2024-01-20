import java.util.Scanner;

import Domain.ComplexNumber;
import Service.ComplexNumsCalculator;
import Service.OperationFactory;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику операций
        OperationFactory operationFactory = new OperationFactory();

        // Создаем калькулятор, передавая ему фабрику операций
        ComplexNumsCalculator calculator = new ComplexNumsCalculator(operationFactory);

        // Создаем сканер для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Спрашиваем у пользователя тип операции
        System.out.println("Введите номер операции (1 - сложение, 2 - умножение, 3 - деление):");
        int operationType = scanner.nextInt();
        String operationName = "";
        switch (operationType) {
            case 1:
                operationName = "addition";
                break;
            case 2:
                operationName = "multiplication";
                break;
            case 3:
                operationName = "division";
                break;
            default:
                System.out.println("Неверный номер операции");
                System.exit(0);
        }

        // Устанавливаем операцию
        calculator.setOperation(operationName);

        // Спрашиваем у пользователя комплексные числа
        System.out.println("Введите действительную и мнимую части первого числа:");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imag1);

        System.out.println("Введите действительную и мнимую части второго числа:");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imag2);

        // Выполняем операцию и выводим результат
        ComplexNumber result = calculator.executeOperation(num1, num2);
        System.out.println("Результат: " + result);

        // Закрываем сканер
        scanner.close();
    }
}


