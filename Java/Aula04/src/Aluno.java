public class Aluno {
    String nome;
    String turma;
    double cp1;
    double cp2;
    double cp3;
    double gs;
    double ch;

    double calcularMedia() {
        double mediaCp = (cp1 + cp2 + cp3) / 3;

        double media = mediaCp * 0.2 + ch * 0.2 + gs * 0.6;
        return media;

    }
}


