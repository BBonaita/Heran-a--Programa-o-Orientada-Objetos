public class Pessoa {
    //atribuitos
    private String nome;
    private String email;   
    private String endereco;
    private String telefone;

    //classe construtora
    public Pessoa (){

    }
    public Pessoa (String nome,
                   String email,
                   String endereco,
                   String telefone){

        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
     }

     //GET E SET
     public String getNome(){
        return this.nome;
     }
     public void setNome (String nome){
        this.nome = nome;
     }

      public String getEmail(){
        return this.email;
     }
     public void setEmail (String email){
        this.email = email;
     }

      public String getEndereco(){
        return this.endereco;
     }
     public void setEndereco (String endereco){
        this.endereco = endereco;
     }

      public String getTelefone(){
        return this.telefone;
     }
     public void setTelefone (String telefone){
        this.telefone = telefone;
     }

     //toString
     public String toString(){
        String resposta = "Nome: "     + this.nome      +"\n"  +
                          "Email: "    + this.email     +"\n"  +
                          "Endereco: " + this.endereco  + "\n" +
                          "Telefone: " + this.telefone;
        return resposta;
     }


}