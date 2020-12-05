class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int c = calc.divide.apply(a, b);//возможно деление на 0.
        // необходимо либо проверить входное значение b.Либо бросить здесь ошибку.либо в классу калькулятор сделать проверку и выдать 0, что я и сделал.


        int d = calc.pow.apply(a);
        int e = calc.abs.apply(-5);
        boolean f = calc.isPositive.test(8);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        System.out.println(f);


    }


}
