package Exercise3_Argument_Matching;

public class CalculatorServiceUser {
    private final CalculatorService service;

    public CalculatorServiceUser(CalculatorService service) {
        this.service = service;
    }

    public int processAddition(int a, int b) {
        return service.add(a, b);
    }
}
