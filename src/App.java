import dao.AlunoDao;
import domain.Aluno;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno marcus = new Aluno(1, "Marcus", "12345678901", "1234567", "34912345678","1999-01-01", "M", "email@gmail",1,1);
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.inserir(marcus);
        System.out.println(marcus);
    }
}