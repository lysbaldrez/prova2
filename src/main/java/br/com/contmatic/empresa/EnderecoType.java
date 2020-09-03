package br.com.contmatic.empresa;

// TODO: Auto-generated Javadoc
/**
 * The Enum EnderecoType.
 */
public enum EnderecoType {

                         /** The logradouro. */
                         LOGRADOURO,
                         
                         /** The numero. */
                         NUMERO,
                         
                         /** The cep. */
                         CEP;

    /** The tipo endereco. */
    public int tipoEndereco;

    /**
     * Enderecos enum.
     *
     * @param endereco the endereco
     */
    void EnderecosEnum(int endereco) {
        tipoEndereco = endereco;
    }
}
