
package Domain;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
	
	public List<Tarefas> tarefas_concluidas = new ArrayList<>();
	private double num_prioridade, percentualConcluido;
	private String nome_tarefa, data, detalhamento;

	public void Cadastro_de_Tarefas(double num_prioridade, String nome_tarefa, String data, 
			double percentualConcluido, String detalhamento){
		
				this.num_prioridade = num_prioridade;
				this.nome_tarefa = nome_tarefa;
				this.data = data;
				this.percentualConcluido = percentualConcluido;
				this.detalhamento = detalhamento;	
			}

	@Override
	public String toString() {
		return "Tarefas Concluidas = " + tarefas_concluidas + "\nData limite = " + data +
				"\nPercentual Concluido = " + percentualConcluido * 100 +
				"%\nNumero de Prioridade = " + num_prioridade
				+  "\nNome da tarefa = " + nome_tarefa 
				+ "\nDetalhamento=" + detalhamento;
	}
		}
