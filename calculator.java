public class Calculator {
    
    //construtor
    public Calculator(){

    }

    //metodo add
    public int add(int a, int b){
        int result = a + b;
        return result;
    }
    
    //metodo subtract
    public int subtract(int a, int b){
        int substrair = a - b;
        return substrair;
    }

    //metodo multiply
    public int multiply(int a, int b){
        int multiplicar = a * b;
        return multiplicar;
    }

    //metodo divide
    public int divide(int a, int b){
        int dividir = a / b;
        return dividir;
    }

    //metodo modulo
    public int modulo(int a, int b){
        int modular = a % b;
        return modular;
    }

    //main
    public static void main(String args[]) {
        Calculator myCalculator = new Calculator();
        int addResult = myCalculator.add(5, 7);
        int subtractResult = myCalculator.subtract(45, 11);
        System.out.println("Resultado da adição: " + addResult);
        System.out.println("Resultado da subtração: " + subtractResult); 
    }
}