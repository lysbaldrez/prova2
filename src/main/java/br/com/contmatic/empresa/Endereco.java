package br.com.contmatic.empresa;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Endereco.
 */
public class Endereco {

    /** The logradouro. */
    @Valid
    @Pattern(regexp = "^[A-ZÀ-Úa-zà-ú0-9]{0,1}[A-ZÀ-Ú a-zà-ú_0-9]{0,10}[A-ZÀ-Úa-zà-ú0-9]{0,1}$", message = "O complemento deve ter até 8 caracteres alfanumericos")
	private String logradouro;
	
	/** The numero. */
	@NotNull (message = "Número não pode ser nulo")
	private String numero;
	
	/** The cidade. */
	@NotBlank(message = "Não deve aceitar cidade nula nem vazia")
	private String cidade;
	
	/** The pais. */
	 @Pattern(regexp = "^[A-ZÀ-Úa-zà-ú][A-ZÀ-Ú a-zà-ú]{0,48}", message = "O país deve ter até 50 caracteres alfanumericos")
	private String pais;
	
	/** The cep. */
	 @Pattern(regexp = "\\d{8}", message = "O CEP deve conter somente 8 digítos numéricos")
	@NotNull (message = "Não deve conter CEP nulo")
	private String cep;

	/**
	 * Gets the cep.
	 *
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Sets the cep.
	 *
	 * @param cep the new cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Gets the logradouro.
	 *
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * Sets the logradouro.
	 *
	 * @param logradouro the new logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Gets the cidade.
	 *
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Sets the cidade.
	 *
	 * @param cidade the new cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Gets the pais.
	 *
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Sets the pais.
	 *
	 * @param pais the new pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Equals.
	 *
	 * @param endereco the endereco
	 * @return true, if successful
	 */
	public boolean equals(Endereco endereco) {
		return EqualsBuilder.reflectionEquals(this, endereco.getCep());
	}

	/**
	 * Hash code.
	 *
	 * @param endereco the endereco
	 * @return the int
	 */
	public int hashCode(Endereco endereco) {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/**
	 * To string.
	 *
	 * @param endereco the endereco
	 * @return the string
	 */
	public String toString(Endereco endereco) {
		return ToStringBuilder.reflectionToString(this);
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
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Endereco other = (Endereco) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
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
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + ", pais=" + pais
				+ ", cep=" + cep + "]";
	}
}
