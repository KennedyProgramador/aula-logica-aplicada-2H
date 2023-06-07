public class Main {
    public static void main(String[] args) {
//Construir Balão
        balao b1 = new balao();
        //adiciona voo do balão
        //Chamado do método voar()
        String resposta = b1.voar(new Combustivel());
        System.out.println(resposta);

        balao b2 = new balao();
        Combustivel alcool = new Combustivel();
        System.out.println(b2.voar(alcool));
    }
}









