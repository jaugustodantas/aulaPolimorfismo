public class Programa {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        Funcionario f = new Funcionario();
        EditorVideo ev = new EditorVideo();

        g.setSalario(5000);
        ev.setSalario(2500);
        f.setSalario(2000);
        
        CalculoBonificacao c = new CalculoBonificacao();
        c.registra(g);
        c.registra(ev);
        c.registra(f);

        System.out.println(c.getSoma());
        
    }
}