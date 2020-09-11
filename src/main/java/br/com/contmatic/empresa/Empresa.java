package br.com.contmatic.empresa;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
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
    @Pattern(regexp = "\\d{15}", message = "O nome deve conter até 15 caracteres")
    private String nome;
    
    /** The nome fantasia. */
    @Size(min = 10, max = 200, message 
            = "O nome fantasia tem que ter 10 caracteres mínimos e 200 máximos.")
    private String nomeFantasia;
    
    /** The cnpj. */
    @Pattern(regexp = "\\d{11}", message = "O CNPJ deve conter somente 11 digítos numéricos")
    @CNPJ
    private String cnpj;
    
    /** The tipo de empresa. */
    @Length(min = 3, max = 15)
    @Pattern(regexp = "^['A-ZÀ-Úa-zà-ú0-9!@#$%&*-+_§.,;]", message = "Tipo de empresa inválido")
    private String tipoDeEmpresa;
    
    /** The porte da empresa. */
   @NotNull(message = "Porte da empresa não pode ser nulo")
   @Pattern(regexp = "^['A-ZÀ-Úa-zà-ú0-9!@#$%&*-+_§.,;]", message = "Porte da empresa inválido")
    private String porteDaEmpresa;
    
    /** The funcionarios. */
    @NotNull (message = "Lista de funcionários não pode ser nula")
    private List<Funcionario> funcionarios;
    
    /** The situacao cadastral. */
    @NotNull
    private String situacaoCadastral;
    
    /** The data. */
    @NotEmpty(message = "Não deve aceitar data nula nem vazia")
    private String data;
    
    
    /** The email. */
    @Pattern(regexp = "^['A-ZÀ-Úa-zà-ú!*¨$;]", message = "Email inválido")
    @Email
    private String email;
    
    /** The situacao especial. */
    @Pattern(regexp = "^['A-ZÀ-Úa-zà-ú0-9!@#$%&*-+_§.,;]", message = "Situação especial inválida")
    private String situacaoEspecial; 
    
    /** The site. */
    @NotNull(message = "Site não pode ser nulo")
    @URL
    private String site;
    
    /** The enderecos. */
    @NotNull(message = "Não deve aceitar endereco nulo")
    private Set<Endereco> enderecos;
    
    @NotNull(message = "Não deve aceitar telefone nulo")
    private Set<Telefone> telefones;
    
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

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    
    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
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

    
}
