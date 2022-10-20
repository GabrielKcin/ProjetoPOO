import java.util.ArrayList;

public class Atividade
{
    private String identificacao;
    private ArrayList<String> descricao;
    private String dataInicio;
    private String dataTermino;
    private Usuario responsavelAtividade;
    private ArrayList<Usuario> usuarioAtividade;
    
    /**
     * @return String return the identificacao
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * @param identificacao the identificacao to set
     */
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * @return ArrayList<String> return the descricao
     */
    public ArrayList<String> getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(ArrayList<String> descricao) {
        this.descricao = descricao;
    }

    /**
     * @return String return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return String return the dataTermino
     */
    public String getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return Usuario return the responsavelAtividade
     */
    public Usuario getResponsavelAtividade() {
        return responsavelAtividade;
    }

    /**
     * @param responsavelAtividade the responsavelAtividade to set
     */
    public void setResponsavelAtividade(Usuario responsavelAtividade) {
        this.responsavelAtividade = responsavelAtividade;
    }

    /**
     * @return ArrayList<Usuario> return the usuarioAtividade
     */
    public ArrayList<Usuario> getUsuarioAtividade() {
        return usuarioAtividade;
    }

    /**
     * @param usuarioAtividade the usuarioAtividade to set
     */
    public void setUsuarioAtividade(ArrayList<Usuario> usuarioAtividade) {
        this.usuarioAtividade = usuarioAtividade;
    }

}