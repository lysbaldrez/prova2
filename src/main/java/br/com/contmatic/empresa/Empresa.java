package br.com.contmatic.empresa;

import java.util.HashSet;
import org.joda.time.*;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CNPJ;
import org.joda.time.DateTime;

// TODO: Auto-generated Javadoc
/**
 * The Class Empresa.
 */
public class Empresa {
    

    /** The nome. */
    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;
    
    /** The nome fantasia. */
    @Size(min = 10, max = 200, message 
            = "About Me must be between 10 and 200 characters")
    private String nomeFantasia;
    
    /** The cnpj. */
    @CNPJ
    private String cnpj;
    
    /** The tipo de empresa. */
    @Length(min = 3, max = 15)
    private String tipoDeEmpresa;
    
    /** The porte da empresa. */
    @Null
    @Range(min=0, max=0)
    @Range(min=15, max = 80)
    private String porteDaEmpresa;
    
    /** The funcionarios. */
    @NotNull
    private List<Funcionario> funcionarios;
    
    /** The situacao cadastral. */
    @NotNull
    private String situacaoCadastral;
    
    /** The data. */
    private String data;
    
    /** The telefone. */
    @NotEmpty
    private String telefone;
    
    /** The email. */
    @Email
    private String email;
    
    /** The situacao especial. */
    private String situacaoEspecial; 
    
    /** The site. */
    @URL
    private String site;
    
    /** The enderecos. */
    private Set<Endereco> enderecos;
    
    /** The dia cadastro. */
    @Future
    private DateTime diaCadastro;

    
    
    /**
     * Gets the dia cadastro.
     *
     * @return the dia cadastro
     */
    public DateTime getDiaCadastro() {
        return diaCadastro;
    }

    /**
     * Sets the dia cadastro.
     *
     * @param diaCadastro the new dia cadastro
     */
    public void setDiaCadastro(DateTime diaCadastro) {
        this.diaCadastro = diaCadastro;
    }

    /**
     * Gets the nome fantasia.
     *
     * @return the nome fantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Sets the nome fantasia.
     *
     * @param nomeFantasia the new nome fantasia
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * Gets the situacao cadastral.
     *
     * @return the situacao cadastral
     */
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    /**
     * Sets the situacao cadastral.
     *
     * @param situacaoCadastral the new situacao cadastral
     */
    public void setSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Gets the telefone.
     *
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets the telefone.
     *
     * @param telefone the new telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Gets the porte da empresa.
     *
     * @return the porte da empresa
     */
    public String getPorteDaEmpresa() {
        return porteDaEmpresa;
    }

    /**
     * Sets the porte da empresa.
     *
     * @param porteDaEmpresa the new porte da empresa
     */
    public void setPorteDaEmpresa(String porteDaEmpresa) {
        this.porteDaEmpresa = porteDaEmpresa;
    }

    /**
     * Gets the tipo de empresa.
     *
     * @return the tipo de empresa
     */
    public String getTipoDeEmpresa() {
        return tipoDeEmpresa;
    }

    /**
     * Sets the tipo de empresa.
     *
     * @param tipoDeEmpresa the new tipo de empresa
     */
    public void setTipoDeEmpresa(String tipoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the cnpj.
     *
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Sets the cnpj.
     *
     * @param cnpj the new cnpj
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Gets the funcionarios.
     *
     * @return the funcionarios
     */
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**
     * Equals.
     *
     * @param empresa the empresa
     * @return true, if successful
     */
    public boolean equals(Empresa empresa) {
        return EqualsBuilder.reflectionEquals(this, empresa.getCnpj());
    }

    /**
     * Hash code.
     *
     * @param empresa the empresa
     * @return the int
     */
    public int hashCode(Empresa empresa) {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * To string.
     *
     * @param empresa the empresa
     * @return the string
     */
    public String toString(Empresa empresa) {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the situacao especial.
     *
     * @return the situacao especial
     */
    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    /**
     * Sets the situacao especial.
     *
     * @param situacaoEspecial the new situacao especial
     */
    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    /**
     * Gets the site.
     *
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the site.
     *
     * @param site the new site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        return result;
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass())
            return false;
        Empresa other = (Empresa) obj;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        return true;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", tipoDeEmpresa=" + tipoDeEmpresa + ", porteDaEmpresa=" + porteDaEmpresa + ", funcionarios=" + funcionarios + "]";
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
