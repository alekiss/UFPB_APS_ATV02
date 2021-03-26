package br.ufpb.dcx.aps.atividades.atv02;

import java.util.LinkedList;
import java.util.List;

public class Disciplina {
    private int codigoDisciplina;
    private Turma turma;
    private List<Turma> turmas = new LinkedList<Turma>();

    public Disciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;

    }

    public Turma criarTurma(int codTurma){
        if (codTurma >= 1){
            Turma a = new Turma(codTurma);
            turmas.add(a);
            return a;
        }
        else{
            throw new RuntimeException("Código de turma inválido: -1");
        }
    }

    public int getCodigoDisciplina() {

        return codigoDisciplina;
    }
    public Turma getTurma(int codTurma) {
        for (Turma d : turmas){
            if (d.getCodigo() == codTurma){
                this.turma = d;
            }

        }
        if (turmas.isEmpty()){
            turma = null;
        }
        return turma;
    }
    public List<Turma> getTurmas() {

        return turmas;
    }

}
