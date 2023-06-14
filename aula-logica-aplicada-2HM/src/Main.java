public class Main {
    public static void main(String[] args) {
        //Aula introdutiva de orientaçao á Objetos
        //Declaraçao de objeto
        Pessoa adao;
        //instanciaçao do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir Formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
        //criar novos objetos
        //declarar objeto
        Pessoa rainha;
        //instanciar objetos
        rainha =  new Pessoa();
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        //definiçao de comportamento
        rainha.falar();
        rainha.comer();
    }
}