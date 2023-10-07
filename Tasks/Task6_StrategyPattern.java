class StrategyPattern {
    public static void main(String[] args) {
        Context squareContext = new Context(new squareArea());
        System.out.println("Area of Square: " + squareContext.executeStrategy(2, 2));

        Context circleContext = new Context(new CircleArea());
        System.out.println("Area of Circle: " + circleContext.executeStrategy(5, 0));
    }
}

class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.calculateArea(num1, num2);
    }
}

interface IStrategy {
    int calculateArea(int a, int b);
}

class squareArea implements IStrategy {
    @Override
    public int calculateArea(int x, int y) {
        int height = x;
        return height*height;
    }
}

class CircleArea implements IStrategy {
    @Override
    public int calculateArea(int x,int y) {

        int radius = x;
        return (int) (3.1416 * radius * radius);
    }
}