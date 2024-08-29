package FORNECEDOR;

public class Fornecedor {

 private int CodFornecedor;   
 private String Nome; 
 private int CNPJ;
 private String Endereço;
 private float Telefone;
 private String Email;        
 private String NomeContato;       
 private String TProduto;       
 private String CondPagamento;
 private String PrazoEntrega;

    public int getCodFornecedor() {
        return CodFornecedor;
    }

    public void setCodFornecedor(int CodFornecedor) {
        this.CodFornecedor = CodFornecedor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public float getTelefone() {
        return Telefone;
    }

    public void setTelefone(float Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNomeContato() {
        return NomeContato;
    }

    public void setNomeContato(String NomeContato) {
        this.NomeContato = NomeContato;
    }

    public String getTProduto() {
        return TProduto;
    }

    public void setTProduto(String TProduto) {
        this.TProduto = TProduto;
    }

    public String getCondPagamento() {
        return CondPagamento;
    }

    public void setCondPagamento(String CondPagamento) {
        this.CondPagamento = CondPagamento;
    }

    public String getPrazoEntrega() {
        return PrazoEntrega;
    }

    public void setPrazoEntrega(String PrazoEntrega) {
        this.PrazoEntrega = PrazoEntrega;
    }
 
         
}

