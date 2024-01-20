package Service;
import Interfaces.iOperation;
import java.util.logging.Logger;

import Domain.ComplexNumber;

// Класс ComplexNumsCalculator представляет собой калькулятор для выполнения операций над комплексными числами.
public class ComplexNumsCalculator {
    // Логгер для записи информации о выполнении операций.
    private static final Logger logger = Logger.getLogger(ComplexNumsCalculator.class.getName());

    // Объект, реализующий интерфейс iOperation. Определяет операцию, которую следует выполнить.
    iOperation operation;
    
    // Фабрика операций, используемая для создания объектов операций.
    OperationFactory operationFactory;

    // Конструктор класса. Принимает фабрику операций и сохраняет ее в поле operationFactory.
    public ComplexNumsCalculator(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    // Метод для установки операции. Принимает тип операции в виде строки и создает соответствующий объект операции.
    public void setOperation(String operationType) {
        this.operation = operationFactory.createOperation(operationType);
    }

    // Метод для выполнения операции над двумя комплексными числами. Если операция не была установлена, записывает ошибку в лог и возвращает null.
    public ComplexNumber executeOperation(ComplexNumber num1, ComplexNumber num2) {
        if (operation == null) {
            logger.severe("Не задана операция");
            return null;
        }
        return operation.execute(num1, num2);
    }
}



