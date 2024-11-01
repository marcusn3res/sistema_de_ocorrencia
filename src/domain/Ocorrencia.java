package domain;

import java.util.Date;
import java.util.List;

public class Ocorrencia {

    private Integer cod_ocorrencia;
    private Date data_ocorrencia;
    private Date horario;
    private String descricao;
    private Aluno aluno;
    private Funcionario funcionario;
    private Professor professor;
    private List<Penalidade> penalidades;

    public List<Penalidade> getPenalidades() {
        return penalidades;
    }

    public void setPenalidades(List<Penalidade> penalidades) {
        this.penalidades = penalidades;
    }

    public Ocorrencia(Integer cod_ocorrencia, Date data_ocorrencia, Date horario, String descricao, Aluno aluno,
            Funcionario funcionario, Professor professor) {
        this.cod_ocorrencia = cod_ocorrencia;
        this.data_ocorrencia = data_ocorrencia;
        this.horario = horario;
        this.descricao = descricao;
        this.aluno = aluno;
        this.funcionario = funcionario;
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getCod_ocorrencia() {
        return cod_ocorrencia;
    }

    public void setCod_ocorrencia(Integer cod_ocorrencia) {
        this.cod_ocorrencia = cod_ocorrencia;
    }

    public Date getData_ocorrencia() {
        return data_ocorrencia;
    }

    public void setData_ocorrencia(Date data_ocorrencia) {
        this.data_ocorrencia = data_ocorrencia;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
