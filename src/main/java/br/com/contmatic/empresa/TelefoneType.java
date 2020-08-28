package br.com.contmatic.empresa;

public enum TelefoneType {

                          CELULAR,
                          FIXO;

    public int tipoTelefone;

    void TelefonesEnum(int telefone) {
        tipoTelefone = telefone;
    }

}
