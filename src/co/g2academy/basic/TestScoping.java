package co.g2academy.basic;

public class TestScoping {
    public static void main(String[] args) {
        ScopeExample scope = new ScopeExample();
        scope.firstMethod();
        scope.printVariable();
        scope.secondMethod(10);
        scope.printVariable();
    }
}
