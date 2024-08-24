public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      
        //TIPOS
        
        String meuNome = "Cleyson Martins";
        double salarioMinimo = 2500.44;
        int dataNascimento = 1996;


        byte idade = 123;
        short ano = 2000;
        int cep = 14844300; //se começar com zero, talvez tenha que ser outro tipo (string)
        long cpf = 43524142800L; //se começar com zero, talvez tenha que  outro tipo (string)
        float pi = 3.14F; //todo float precisa terminar com o "F" ou "f"
        double salario = 4000.01;

        /* Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F 
         * e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.
         */


         // CONSTANTES E VARIAVEIS
         int numero = 1; //desta maneira a declaração pode ser alterada
         numero = 10; //aqui podemos efetuar a alteração apenas indicando apenas o nome atribuido

         System.out.print(numero);

         final double VALOR_DE_PI = 3.14;

         /* Pela convensão, devemos utilizar caixa alta ao declarar o nome, mas isso não impede que o 
          * valor seja alterado, então por padrão devemos incluir a expressão "final" antes do tipo.
          */
    }
}
