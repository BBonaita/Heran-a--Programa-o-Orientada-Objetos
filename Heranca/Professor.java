public class Professor {
    private String graduacao;
    private String disciplinas;

    //construtor + super classe
    public Professor(int salario
        String nome,
        String email,
        String endereco,
        String telefone,
        String diciplinas,
        String graduacao
        ){
            super (nome, email, endereco, telefone, disciplinas, graduacao);
            this.salario = salario;

        }

    //GET E SET
    public String getGraduacao(){
        return this.graduacao;
    
    }
    public void setGraduacao (String graduacao){
        this.graduacao = graduacao;
    }

    public String getDisciplinas(){
        return this.disciplinas;
    
    }
    public void setDisciplinas (String diciplinas){
        this.disciplinas = diciplinas;
    }

    public int getSalario(){
        return this.salario;
    }
    public void setSalario (int salario){
        this.salario = salario;
    }

    class Pessoa extends Professor;

    //toString
    public String toString(){
        String resposta = "Nome: "        + this.nome         +"\n"  +
                          "Email: "       + this.email        +"\n"  +
                          "Endereco: "    + this.endereco     + "\n" +
                          "Telefone: "    + this.telefone     + "\n" +
                          "Disciplinas: " + this.disciplinas  + "\n" +
                          "Graduacao: "   + this.gruduacao;
        return resposta;
     }
}