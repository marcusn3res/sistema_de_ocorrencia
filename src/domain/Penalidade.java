package domain;

import java.util.Date;

public class Penalidade {

    private Integer cod_penal;
    private String duracao;
    private String tipo_penal;
    private Date data_aplicacao;
    private Ocorrencia ocorrencia;
    private Funcionario funcionario;

    public Penalidade(Integer cod_penal, String duracao, String tipo_penal, Date data_aplicacao, Ocorrencia ocorrencia,
            Funcionario funcionario) {
        this.cod_penal = cod_penal;
        this.duracao = duracao;
        this.tipo_penal = tipo_penal;
        this.data_aplicacao = data_aplicacao;
        this.ocorrencia = ocorrencia;
        this.funcionario = funcionario;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getCod_penal() {
        return cod_penal;
    }

    public void setCod_penal(Integer cod_penal) {
        this.cod_penal = cod_penal;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTipo_penal() {
        return tipo_penal;
    }

    public void setTipo_penal(String tipo_penal) {
        this.tipo_penal = tipo_penal;
    }

    public Date getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(Date data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }

}
