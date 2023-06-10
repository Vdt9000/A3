
package Usuario;


public class Paciente {
    

    private String Nome;
    private int Prontuario;
    private String Rg;
    private String NasData;
    private String bairro;
    private String cel;
    private String cidade;
    private String cpf;
    private String endereco;
    private String endnum;
    private String mae;
    private String pai;
    private String uf;
    private String senha;
    private String tipo;

    public Paciente(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return Nome;
    }


    public int getProntuario() {
        return Prontuario;
    }

    public String getRg() {
        return Rg;
    }

    public String getNasData() {
        return NasData;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCel() {
        return cel;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEndnum() {
        return endnum;
    }

    public String getMae() {
        return mae;
    }

    public String getPai() {
        return pai;
    }

    public String getUf() {
        return uf;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

   

    public void setProntuario(int Prontuario) {
        this.Prontuario = Prontuario;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public void setNasData(String NasData) {
        this.NasData = NasData;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEndnum(String endnum) {
        this.endnum = endnum;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Paciente(String tipo, String Nome, int Prontuario, String Rg, String NasData, String bairro, String cel, String cidade, String cpf, String endereco, String endnum, String mae, String pai, String uf, String senha) {
        this.Nome = Nome;
        this.Prontuario = Prontuario;
        this.Rg = Rg;
        this.NasData = NasData;
        this.bairro = bairro;
        this.cel = cel;
        this.cidade = cidade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.endnum = endnum;
        this.mae = mae;
        this.pai = pai;
        this.uf = uf;
        this.senha = senha;
        this.tipo= tipo;
    }

    public Paciente(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    public Paciente() {

    }

}
    
    
    
    
    

