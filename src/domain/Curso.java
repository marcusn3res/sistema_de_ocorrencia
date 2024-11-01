package domain;

import java.util.List;

public class Curso {

    private Integer cod_curso;
    private String sigla_curso;
    private String nome;
    private List<Serie> series;

    public List<Serie> getSeries() {
        return series;
    }
    public void setSeries(List<Serie> series) {
        this.series = series;
    }
    public Integer getCod_curso() {
        return cod_curso;
    }
    public void setCod_curso(Integer cod_curso) {
        this.cod_curso = cod_curso;
    }
    public String getSigla_curso() {
        return sigla_curso;
    }
    public void setSigla_curso(String sigla_curso) {
        this.sigla_curso = sigla_curso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Curso(Integer cod_curso, String sigla_curso, String nome) {
        this.cod_curso = cod_curso;
        this.sigla_curso = sigla_curso;
        this.nome = nome;
    }

}