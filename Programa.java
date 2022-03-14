public class Programa {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        System.out.println(funcionario.bonificacao());
        System.out.println(funcionario2.bonificacao());
        System.out.println(funcionario3.bonificacao());

        System.out.println(funcionario.getCpf());
        
    }
}