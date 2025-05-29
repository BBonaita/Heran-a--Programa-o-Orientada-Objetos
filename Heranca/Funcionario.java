public class Funcionario extends Pessoa{

    //atribuitos
    private int salario;

    //construtor + super classe
    
    public Funcionario (int salario,
        String nome,
        String email,
        String endereco,
        String telefone
    ){
        super (nome, email, endereco, telefone);
        this.salario = salario;
    }

    //GET E SET
    public int getSalario(){
        return this.salario;
    }
    public void setSalario (int salario){
        this.salario = salario;
    }

    //toString
    public String toString(){
        String resposta = "Salario: " + this.salario;
        return resposta;
    }
}