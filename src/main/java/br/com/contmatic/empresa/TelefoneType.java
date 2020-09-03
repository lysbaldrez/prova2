package br.com.contmatic.empresa;

// TODO: Auto-generated Javadoc
/**
 * The Enum TelefoneType.
 */
public enum TelefoneType {

                          /** The celular. */
                          CELULAR,
                          
                          /** The fixo. */
                          FIXO;

    /** The tipo telefone. */
    public int tipoTelefone;

    /**
     * Telefones enum.
     *
     * @param telefone the telefone
     */
    void TelefonesEnum(int telefone) {
        tipoTelefone = telefone;
    }

}
