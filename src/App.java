import dao.AlunoDao;
import domain.Aluno;
import domain.Responsavel;
import domain.Serie;

import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Serie serie = new Serie( 1, 2021, "A", null);
        
        Responsavel responsavel = new Responsavel(1, "João", "12345678900", "12345678", "Pai", "34911112232","ruan.neres@iftm.edu");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Aluno marcus = new Aluno(11, "Marcus", "12345678900", "12345678", "34911112232", sdf.parse("1999-01-01"), "M",
                "Marcus.yan@iftm.edu", serie, responsavel);
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.inserir(marcus);
        System.out.println(marcus);
    }
}