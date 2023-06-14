public class Pessoa extends Animal {
    //atributos da classe
    public String sobrenome;
    //metodos de classe
    public void falar(){
        System.out.println("Boa noite");
    }
    public String falar(String texto){
        return "boa dia";
    }

    //sobrescita do método
    public void comer() {
        System.out.println("pessoa comeu");

    }
}
