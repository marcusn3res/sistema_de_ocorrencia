package domain;

import java.util.List;

public class Funcionario {

    private Integer cod_func;
    private String nome_func;
    private String email_func;
    private List<Ocorrencia> ocorrencias;
    private List<Penalidade> penalidades;

    public List<Penalidade> getPenalidades() {
        return penalidades;
    }

    public void setPenalidades(List<Penalidade> penalidades) {
        this.penalidades = penalidades;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public Integer getCod_func() {
        return cod_func;
    }

    public void setCod_func(Integer cod_func) {
        this.cod_func = cod_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getEmail_func() {
        return email_func;
    }

    public void setEmail_func(String email_func) {
        this.email_func = email_func;
    }

    public Funcionario(String nome_func, String email_func) {
        this.nome_func = nome_func;
        this.email_func = email_func;
    }

}
