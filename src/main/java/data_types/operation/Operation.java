package data_types.operation;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}

class IdenticalOperation extends Operation {
    @Override
    public double apply(double number) {
        return number;
    }
}

class SqrtOperation extends Operation {
    @Override
    public double apply(double number) {
        return Math.sqrt(number);
    }
}

class TangentOperation extends Operation {
    @Override
    public double apply(double number) {
        return Math.tan(number);
    }
}