import java.util.ArrayList;


public class Usuario implements MetodosComuns {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String cargo;
    private String valorBolsa;
    private ArrayList<Projeto> projetosParticipando;

    public Usuario()
    {
        
    }

    public Usuario(String nome, String cpf, String login, String senha, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.projetosParticipando = new ArrayList<Projeto>();
    }

    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome() {
        String nome;
        nome = Servo.retornaString();
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha() {
        String senha;
        senha = Servo.retornaString();
        this.senha = senha;
    }

    public void setCargo() {
        String cargo = "";
        String a[] = { "ADMINISTRADOR", "ALUNO DE GRADUAÇÃO", "ALUNO DE MESTRADO", "ALUNO DE DOUTORADO", "PROFESSOR",
                "PESQUISADOR", "PROFISSIONAL", "TÉCNICO" };
        int escolha = -99;
        System.out.println("\nQual é o seu cargo?");
        System.out.println("1 - ALUNO DE GRADUAÇÃO");
        System.out.println("2 - ALUNO DE MESTRADO");
        System.out.println("3 - ALUNO DE DOUTORADO");
        System.out.println("4 - PROFESSOR");
        System.out.println("5 - PESQUISADOR");
        System.out.println("6 - PROFISSIONAL (DESENVOLVEDOR, TESTADOR OU ANALISTA)");
        System.out.println("7 - TÉCNICO");
        System.out.print("Digite a escolha respectiva ao seu cargo: ");
        escolha = Servo.retornaInteiroIntervalo(1, 7); //SÓ SAI QUANDO O INTEIRO É UM NÚMERO ENTRE O INTERVALO 1 OU 7
        switch (escolha) {
            case 1:
                cargo = a[escolha];
                break;

            case 2:
                cargo = a[escolha];
                break;

            case 3:
                cargo = a[escolha];
                break;

            case 4:
                cargo = a[escolha];
                break;

            case 5:
                cargo = a[escolha];
                break;

            case 6:
                cargo = a[escolha];
                System.out.println("\nVocê disse que é um \"PROFISSIONAL\", mas que tipo você é?");
                System.out.println("\n1 - DESENVOLVEDOR\n2 - TESTADOR \n3 - ANALISTA");
                System.out.print("Digite a \"Opção que você é\": ");
                escolha = Servo.retornaInteiroIntervalo(1, 3);
                switch (escolha) {
                    case 1:
                        cargo.concat(" - DESENVOLVEDOR");
                        break;
                    case 2:
                        cargo.concat(" - TESTADOR");
                        break;
                    case 3:
                        cargo.concat(" - ANALISTA");
                        break;
                }
                break;

            case 7:
                cargo = a[escolha];
                break;
        }

        this.cargo = cargo;
    }


    /**
     * @return String return the valorBolsa
     */
    public String getValorBolsa() {
        return valorBolsa;
    }

    /**
     * @param valorBolsa the valorBolsa to set
     */
    public void setValorBolsa(String valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    /**
     * @return ArrayList<Projeto> return the projetosParticipando
     */
    public ArrayList<Projeto> getProjetosParticipando() {
        return projetosParticipando;
    }

    /**
     * @param projetosParticipando the projetosParticipando to set
     */
    public void setProjetosParticipando(ArrayList<Projeto> projetosParticipando) {
        this.projetosParticipando = projetosParticipando;
    }

}