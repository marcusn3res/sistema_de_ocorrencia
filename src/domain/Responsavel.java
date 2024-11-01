package domain;

import java.util.List;

public class Responsavel {

    private Integer cod_resp;
    private String nome_resp;
    private String cpf;
    private String rg;
    private String parentesco;
    private String telefone;
    private String email;
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Integer getCod_resp() {
        return cod_resp;
    }

    public void setCod_resp(Integer cod_resp) {
        this.cod_resp = cod_resp;
    }

    public String getNome_resp() {
        return nome_resp;
    }

    public void setNome_resp(String nome_resp) {
        this.nome_resp = nome_resp;
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Responsavel(Integer cod_resp, String nome_resp, String cpf, String rg, String parentesco, String telefone,
            String email) {
        this.cod_resp = cod_resp;
        this.nome_resp = nome_resp;
        this.cpf = cpf;
        this.rg = rg;
        this.parentesco = parentesco;
        this.telefone = telefone;
        this.email = email;
    }

}
