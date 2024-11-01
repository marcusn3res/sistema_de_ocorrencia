package domain;

import java.util.List;

public class Professor {

    private Integer cod_id;
    private String nome_prof;
    private String cpf;
    private String sexo;
    private String area_atuacao;
    private List<Ocorrencia> ocorrencias;

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public Integer getCod_id() {
        return cod_id;
    }

    public void setCod_id(Integer cod_id) {
        this.cod_id = cod_id;
    }

    public String getNome_prof() {
        return nome_prof;
    }

    public void setNome_prof(String nome_prof) {
        this.nome_prof = nome_prof;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    public Professor(Integer cod_id, String nome_prof, String cpf, String sexo, String area_atuacao) {
        this.cod_id = cod_id;
        this.nome_prof = nome_prof;
        this.cpf = cpf;
        this.sexo = sexo;
        this.area_atuacao = area_atuacao;
    }

}
