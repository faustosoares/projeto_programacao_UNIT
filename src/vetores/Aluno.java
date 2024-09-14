package vetores;

public class Aluno {

    //Atributos Encapsulados (Pilar da Orientacao a Objetos)
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;

    public Aluno(){}

    public Aluno(String nome, String matricula, float n1, float n2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = n1;
        this.nota2 = n2;
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Metodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nomeCompleto) {
        this.nome = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }

    public void imprimir(){
        System.out.println("NOME: " + this.nome + "\n" +
                "MATRICULA: " + this.matricula + "\n" +
                "MEDIA: " + this.calcularMedia());
    }
}
