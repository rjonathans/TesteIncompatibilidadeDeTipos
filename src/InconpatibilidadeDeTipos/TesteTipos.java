package InconpatibilidadeDeTipos;

public class TesteTipos {

    public static void main(String[] args) {

        /*A linguagem java é fortemente tipada e as vezes eles podem brigar
         *entre si devido a incompatiblidade entre numeros e String
         * Será que é possível colocar um valor int dentro de uma String
         */

        int idade = 30;
        String valor1 = idade; //dessa forma não é possível pois os tipos são incompatíveis
        String valor2 = String(idade); // mesmo com Typecast não foi possível

        String valor3 = Integer.toString(idade); //AGORA DEU CERTO
        // a maneira de resolver isso seria usando as classes Involucro
        //note que aqui vc tem um metodo .toString que converte um numero inteiro para String.

        // e o contrário

        String valor4 = "30";
        int idade1 = valor; // Atribuicao invalida
        int idade2 = (int)valor; // typecast não resolveu
        int idade3 = Integer.parseInt(valor4); // PARSE SIGNIFICA CONVERTER

        String valor5 = "30.5";
        float idade6 = Float.parseFloat(valor5); // O contratio tambem funciona






    }
}
