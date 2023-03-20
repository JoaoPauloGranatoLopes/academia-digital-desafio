package model.entities.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;
  
  public MatriculaForm() {
	  
  }

public MatriculaForm(Long alunoId) {
	this.alunoId = alunoId;
}

public Long getAlunoId() {
	return alunoId;
}

public void setAlunoId(Long alunoId) {
	this.alunoId = alunoId;
}

  
}
