package br.com.contmatic.empresa;

public enum EnderecoType {

                         LOGRADOURO,
                         NUMERO,
                         
                         CEP;

    public int tipoEndereco;

    void EnderecosEnum(int endereco) {
        tipoEndereco = endereco;
    }
}
