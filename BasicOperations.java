
// BasicOperations class that extends Calculator
class BasicOperations extends FinalCalculator {
    double memory;

    // constructor
    public BasicOperations() {
        memory = 0.0;
    }
    @Override
    double performOperation() {
        return performBasicOperation();
    }

    // method to perform basic operations
    double performBasicOperation() {
        double inputNumber = Double.parseDouble(getInput());
        switch (getOperationsType()) {
            case "ADD":
                setCurrentResult(getCurrentResult() + inputNumber);
                break;
            case "SUBTRACT":
                setCurrentResult(getCurrentResult() - inputNumber);
                break;
            case "MULTIPLY":
                setCurrentResult(getCurrentResult() * inputNumber);
                break;
            case "DIVIDE":
                if (inputNumber != 0) {
                    setCurrentResult(getCurrentResult() / inputNumber);
                } else {
                    System.out.println("Error: Cannot divide by 0.");
                }
                break;
            default:
                System.out.println("Invalid operation type.");
        }
        return getCurrentResult();
    }

    // clear memory method
    void clearMemory() {
        memory = 0.0;
    }

    // store in memory method
    void storeMemory(double value) {
        memory = value;
    }

    // get memory value
    double getMemory() {
        return memory;
    }
}
