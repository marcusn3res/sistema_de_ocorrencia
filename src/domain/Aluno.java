package domain;

import java.util.Date;
import java.util.List;

public class Aluno {

    private Integer cod_mat;
    private String nome_aluno;
    private String cpf;
    private String rg;
    private String telefone;
    private Date data_nasc;
    private String sexo;
    private String email;
    private Serie serie;
    private Responsavel responsavel;
    private List<Ocorrencia> ocorrencias;

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public Serie getSerie() {
        return serie;
    }

    @Override
    public String toString() {
        return "Aluno [cod_mat=" + cod_mat + ", nome_aluno=" + nome_aluno + ", cpf=" + cpf + ", rg=" + rg
                + ", telefone=" + telefone + ", data_nasc=" + data_nasc + ", sexo=" + sexo + ", email=" + email
                + ", serie=" + serie + ", responsavel=" + responsavel + "]";
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getCod_mat() {
        return cod_mat;
    }

    public void setCod_mat(Integer cod_mat) {
        this.cod_mat = cod_mat;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Aluno(Integer cod_mat, String nome_aluno, String cpf, String rg, String telefone, Date data_nasc,
            String sexo, String email, Serie serie, Responsavel responsavel) {
        this.cod_mat = cod_mat;
        this.nome_aluno = nome_aluno;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.email = email;
        this.serie = serie;
        this.responsavel = responsavel;
    }

}
