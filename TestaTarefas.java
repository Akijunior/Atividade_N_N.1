package App;

import Domain.Tarefas;

public class TestaTarefas {
	public static void main(String[] args) {
		Tarefas testeTarefas = new Tarefas();
		testeTarefas.Cadastro_de_Tarefas(44.0, "Aniversário do Fábio",
							"06/08/2005", 0.65, "Planejamento dos preparativos "
									+ "para a festa de aniversário do Fábio, no sábado,"
									+ " dia 6 de Agosto.");
		System.out.println(testeTarefas.toString());
	}
}
