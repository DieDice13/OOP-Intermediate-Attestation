package Operations;
import java.util.logging.Logger;

import Domain.ComplexNumber;
import Interfaces.iOperation;

public class Division implements iOperation {
    private static final Logger logger = Logger.getLogger(Division.class.getName());

    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        double denom = num2.getReal() * num2.getReal() + num2.getImag() * num2.getImag();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImag() * num2.getImag()) / denom;
        double imagPart = (num1.getImag() * num2.getReal() - num1.getReal() * num2.getImag()) / denom;
        ComplexNumber result = new ComplexNumber(realPart, imagPart);

        // Записываем информацию о выполнении операции в лог.
        logger.info("Выполнено деление: " + num1 + " / " + num2 + " = " + result);

        // Возвращаем результат.
        return result;
    }
}


