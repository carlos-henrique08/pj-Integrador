package ALUNO;

import ClasseEspeciais.Dao;
import java.util.ArrayList;

public class AlunoControle implements Dao {

    @Override
    public void insert(Object o) {
         AlunoDao AD = new AlunoDao();
        AD.insert(o);
    }

    @Override
    public void update(Object o) {
        AlunoDao AD = new AlunoDao();
        AD.update(o);
    }

    @Override
    public void delete(int cod) {
        AlunoDao AD = new AlunoDao();
        AD.delete(cod);
           
    }

 
    public void selectAll() {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAluno().ExibirTabela();
            } 
     });
    }
}
 
    

