package lista;

public class ListaCrescenteInt {

	private class NO{
		int dado;
		NO prox;
	}
	
	NO lista = null;
	
	public boolean isEmpty() {
		return (lista==null);
	}
	
	public void add(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (isEmpty()) {
			novo.prox = null;
			lista = novo;
		}else
			if(novo.dado < lista.dado) { //se o valor for menor ele inverte e novo vira lista
			novo.prox = lista;
			lista = novo;
			}else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox!=null && !achou) { //se o prximo for preenchido - prenncher por linha
					if (aux.prox.dado < novo.dado) {
						aux = aux.prox;
					}
					else {
						achou = true;
				}
				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
	}
	public void show() {
		NO aux = lista;
		System.out.println("********** LISTA **********");
		while (aux!=null) {
			System.out.print(aux.dado + "\t");
			aux = aux.prox;
		}
		System.out.println();
	}
}
