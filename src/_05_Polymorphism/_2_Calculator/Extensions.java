package _05_Polymorphism._2_Calculator;

public class Extensions {

    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new ExtensionInputInterpreter(engine);
    }
}
