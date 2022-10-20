import java.util.ArrayList;
import java.util.Date;

public class Projeto
{
    private String identificacao; //NOME DO PROJETO
    private ArrayList<String> descricao; //SERIA UMA ESPÉCIE DE "SINOPSE/RESUMO" DO PROJETO
    private Date dataInicio;
    private Date dataTermino;
    private Usuario coordenadorProjeto; //SÓ PODE SER UM "COORDENADOR" OU UM "PESQUISADOR"
    private ArrayList<Atividade> atividades;   
    private ArrayList<Usuario> usuariosDentroDoProjeto;
    private VigenciaBolsa periodoDaBolsa;
    
    
    public Projeto(){
        this.descricao = new ArrayList<String>();
        this.atividades = new ArrayList<Atividade>();
        this.usuariosDentroDoProjeto = new ArrayList<Usuario>();
        this.descricao.clear();
        this.atividades.clear();
        this.usuariosDentroDoProjeto.clear();
    };

    public ArrayList<String> getDescricao(){
        return this.descricao;
    }

    public void setDescricao(ArrayList<String> descricao)
    {
        this.descricao = descricao;
    }


    public String getIdentificacao(){
        return this.identificacao;
    }

    public void setIdentificacao(String identificacao){
        this.identificacao = identificacao;
    }

    /**
     * @return Date return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return Date return the dataTermino
     */
    public Date getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return ArrayList<Atividade> return the atividades
     */
    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    /**
     * @param atividades the atividades to set
     */
    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

    /**
     * @return ArrayList<Usuario> return the usuariosDentroDoProjeto
     */
    public ArrayList<Usuario> getUsuariosDentroDoProjeto() {
        return usuariosDentroDoProjeto;
    }

    /**
     * @param usuariosDentroDoProjeto the usuariosDentroDoProjeto to set
     */
    public void setUsuariosDentroDoProjeto(ArrayList<Usuario> usuariosDentroDoProjeto) {
        this.usuariosDentroDoProjeto = usuariosDentroDoProjeto;
    }

    /**
     * @return VigenciaBolsa return the periodoDaBolsa
     */
    public VigenciaBolsa getPeriodoDaBolsa() {
        return periodoDaBolsa;
    }

    /**
     * @param periodoDaBolsa the periodoDaBolsa to set
     */
    public void setPeriodoDaBolsa(VigenciaBolsa periodoDaBolsa) {
        this.periodoDaBolsa = periodoDaBolsa;
    }

}