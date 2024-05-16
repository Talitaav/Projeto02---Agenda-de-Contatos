package projeto02;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

class Contato {
	private String nome;
	private String telefone;
	private String email;

	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Contato{" + "nome='" + nome + '\'' + ", telefone='" + telefone + '\'' + ", email='" + email + '\''
				+ '}';
	}
}

class AgendaContatos {
	private ArrayList<Contato> contatos;

	public AgendaContatos() {
		this.contatos = new ArrayList<>();
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void mostrarContatos() {
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato cadastrado.");
		} else {
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AgendaContatos agenda = new AgendaContatos();
		int opcao;

		do {
			System.out.println("1. Adicionar contato");
			System.out.println("2. Mostrar contatos");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				Contato novoContato = new Contato(nome, telefone, email);
				agenda.adicionarContato(novoContato);
				break;
			case 2:
				agenda.mostrarContatos();
				break;
			case 3:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (opcao != 3);

		sc.close();
	}
}
