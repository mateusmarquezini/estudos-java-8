package ordenacao;

/**
 * Created by mmn on 22/02/17.
 */
public class Usuario {

    private boolean isModerador;

    private String nome;

    private int pontos;

    public Usuario(final String pNome, final int pPontos, final boolean pIsModerador) {
	nome = pNome;
	pontos = pPontos;
	isModerador = pIsModerador;
    }

    public String getNome() {
	return nome;
    }

    public int getPontos() {
	return pontos;
    }

    public boolean isModerador() {
	return isModerador;
    }

    public void setModerador(final boolean pModerador) {
	isModerador = pModerador;
    }

    public void setNome(final String pNome) {
	nome = pNome;
    }

    public void setPontos(final int pPontos) {
	pontos = pPontos;
    }
}
