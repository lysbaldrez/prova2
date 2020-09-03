package br.com.contmatic.empresa;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.br.CPF;

// TODO: Auto-generated Javadoc
/**
 * The Class Funcionario.
 */
public class Funcionario {
    
    /** The nome. */
    @NotBlank(message = "Nome não pode estar em branco")
	private String nome;
    
    /** The idade. */
    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
	private String idade;
	
	/** The cpf. */
	@CPF
	private String cpf;
	
	/** The cargo. */
	private String cargo;
	
	/** The date. */
	private String date;

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Gets the cpf.
	 *
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Sets the cpf.
	 *
	 * @param cpf the new cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Sets the cargo.
	 *
	 * @param cargo the new cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * Gets the cargo.
	 *
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
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
	 * Gets the idade.
	 *
	 * @return the idade
	 */
	public String getIdade() {
		return idade;
	}

	/**
	 * Sets the idade.
	 *
	 * @param idade the new idade
	 */
	public void setIdade(String idade) {
		this.idade = idade;
	}

	/**
	 * Equals.
	 *
	 * @param funcionario the funcionario
	 * @return true, if successful
	 */
	public boolean equals(Funcionario funcionario) {
		return EqualsBuilder.reflectionEquals(this, funcionario.getCpf());
	}

	/**
	 * Hash code.
	 *
	 * @param funcionario the funcionario
	 * @return the int
	 */
	public int hashCode(Funcionario funcionario) {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/**
	 * To string.
	 *
	 * @param funcionario the funcionario
	 * @return the string
	 */
	public String toString(Funcionario funcionario) {
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
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
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
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", cargo=" + cargo
				+ ", tempoNaEmpresa=" + date + "]";
	}

}
