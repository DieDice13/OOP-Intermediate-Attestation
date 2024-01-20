package Service;
import Interfaces.iOperation;
import java.util.logging.Logger;
import Operations.Addition;
import Operations.Multiplication;
import Operations.Division;

public class OperationFactory {
    private static final Logger logger = Logger.getLogger(OperationFactory.class.getName());

    // Метод createOperation принимает строку с типом операции и возвращает объект соответствующего класса.
    public iOperation createOperation(String operationType) {
        switch (operationType) {
            case "addition":
                return new Addition();
            case "multiplication":
                return new Multiplication();
            case "division":
                return new Division();
            default:
            // Если тип операции неизвестен, записываем ошибку в лог и возвращаем null.
                logger.severe("Неизвестный тип операции");
                return null;
        }
    }
}


