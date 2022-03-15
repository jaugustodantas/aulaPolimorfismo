public class Funcionario {

    private String nome;
    private String cpf;
    protected double salario;

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
//    public void setTipo(int tipo) {
//        this.tipo = tipo;
//    }
    //fim dos sets

    // começo gets
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }


    //metodos
    public double bonificacao(){
            return this.salario *0.1;
    }

    //fim metodos
}