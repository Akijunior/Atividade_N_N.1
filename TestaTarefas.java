package App;

import Domain.Tarefas;

public class TestaTarefas {
	public static void main(String[] args) {
		Tarefas testeTarefas = new Tarefas();
		testeTarefas.Cadastro_de_Tarefas(44.0, "Anivers�rio do F�bio",
							"06/08/2005", 0.65, "Planejamento dos preparativos "
									+ "para a festa de anivers�rio do F�bio, no s�bado,"
									+ " dia 6 de Agosto.");
		System.out.println(testeTarefas.toString());
	}
}
