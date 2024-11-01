package domain;

import java.util.List;

public class Serie {

    private Integer cod_serie;
    private Integer ano_serie;
    private String turma;
    private Curso curso;
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Integer getCod_serie() {
        return cod_serie;
    }

    public void setCod_serie(Integer cod_serie) {
        this.cod_serie = cod_serie;
    }

    public Integer getAno_serie() {
        return ano_serie;
    }

    public void setAno_serie(Integer ano_serie) {
        this.ano_serie = ano_serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Serie(Integer cod_serie, Integer ano_serie, String turma, Curso curso) {
        this.cod_serie = cod_serie;
        this.ano_serie = ano_serie;
        this.turma = turma;
        this.curso = curso;
    }
}