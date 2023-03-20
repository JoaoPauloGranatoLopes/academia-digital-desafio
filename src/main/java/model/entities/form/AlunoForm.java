package model.entities.form;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

/*@Data
@NoArgsConstructor
@AllArgsConstructor*/

public class AlunoForm {

	@NotEmpty(message = "Prencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedvalue}' precisa estar entre {min} e {max} caracteres.")
	private String nome;

	@NotEmpty(message = "Prencha o campo corretamente")
	@CPF(message = "'${validatedValue}' é inválido!")
	private String cpf;

	@NotEmpty(message = "Prencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedvalue}' precisa estar entre {min} e {max} caracteres.")	
	private String bairro;

	@NotNull(message = "Preencha o campo corretamente")
	@Past(message = "Data '${validatedValue}' é invalida.")
	private LocalDate dataDeNascimento;

	public AlunoForm() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
