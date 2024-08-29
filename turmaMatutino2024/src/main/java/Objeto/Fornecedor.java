package Objeto;

/**
 *
 * @author Senac
 */


public class Fornecedor {
  
 private String Nome;   
 private String Razao_social;
 private String Nome_fantasia; 
 private String Inscricao_estadual;
 private float Cnpj;
 private float Cep;
 private String Endereco;
 private String bairro;
 private String UF;
 private String Email;
 private double telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRazao_social() {
        return Razao_social;
    }

    public void setRazao_social(String Razao_social) {
        this.Razao_social = Razao_social;
    }

    public String getNome_fantasia() {
        return Nome_fantasia;
    }

    public void setNome_fantasia(String Nome_fantasia) {
        this.Nome_fantasia = Nome_fantasia;
    }

    public String getInscricao_estadual() {
        return Inscricao_estadual;
    }

    public void setInscricao_estadual(String Inscricao_estadual) {
        this.Inscricao_estadual = Inscricao_estadual;
    }

    public float getCnpj() {
        return Cnpj;
    }

    public void setCnpj(float Cnpj) {
        this.Cnpj = Cnpj;
    }

    public float getCep() {
        return Cep;
    }

    public void setCep(float Cep) {
        this.Cep = Cep;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    
}