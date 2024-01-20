package Operations;
import java.util.logging.Logger;

import Domain.ComplexNumber;
import Interfaces.iOperation;

// Класс Addition реализует интерфейс iOperation для операции сложения.
public class Addition implements iOperation {
    private static final Logger logger = Logger.getLogger(Addition.class.getName());

    // Метод execute выполняет сложение двух комплексных чисел.
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        ComplexNumber result = new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImag() + num2.getImag());

        // Записываем информацию о выполнении операции в лог.
        logger.info("Выполнено сложение: " + num1 + " + " + num2 + " = " + result);

        // Возвращаем результат.
        return result;
    }
}




