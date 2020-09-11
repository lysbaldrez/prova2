package br.com.contmatic.empresa;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Telefone {

    
    @Length(max = 2)
    private String ddd; 
    @Length(max = 9)
    private String numero;
    @NotNull(message = "Tipo de telefone não pode ser nulo")
    private String tipoDoTelefone;
    
    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTipoDoTelefone() {
        return tipoDoTelefone;
    }
    public void setTipoDoTelefone(String tipoDoTelefone) {
        this.tipoDoTelefone = tipoDoTelefone;
    }
    
    
}
