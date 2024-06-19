public class Operadores {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        boolean simNao = a == b;

        System.out.println("n1 é igual a n2? " + simNao);

        simNao = a != b;

        System.out.println("n1 é diferente a n2? " + simNao);

        simNao = a > b;

        System.out.println("a é maior que b?" + simNao);

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.print("Os dois valores precisam ser verdadeiros");;
        }
        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2){
            System.out.print("Um dos valores precisa ser verdadeiro");

    }

}
}
