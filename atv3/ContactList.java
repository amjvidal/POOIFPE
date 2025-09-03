public class ContactList {
	private Contact[] contacts;
	private int count; 
	
	public ContactList() {
		this.contacts = new Contact[2];
		this.count = 0;
	}
	
	public void add(Contact c) {
		if (count == contacts.length) {
			System.out.println("Redimencionar array de contatos.");
			
			Contact[] newArray = new Contact[contacts.length*2];
			
			for (int i = 0; i < contacts.length; i++) {
				newArray[i] = contacts[i];
			}
			this.contacts = newArray;
			System.out.println("Contatos copiados!");
		}
		contacts[count] = c;
		count++;
	}
	
	// É importante copiar as referencias de todos os objetos para que 
	// o garbage colector do java não limpe a memoria dos objetos já
	// criados anteriormente. Copiando as referencias dos objetos uma por uma
	// faz com que elas se mantenham no novo array criado, sendo colocado como o array contacts principal depois.
	
	public void printAll() {
		System.out.println("Lista de contatos: ");
		for (int i = 0; i < count; i++) {
			System.out.print(contacts[i].name + " : ");
			System.out.println(contacts[i].phone);
		}
		System.out.println("-----------------\n");
	}
	// função para printar todos os contatos
	
	public void showReferences() {
		System.out.println("Referencia dos Contatos: ");
		for (int i = 0; i < count; i++) {
			System.out.println(contacts[i]);
		}
		System.out.println("-----------------\n");
	}
	// função pra printar todas as referencias da memoria dos contatos
	
	public static void main(String[] args) {
		ContactList List = new ContactList(); 
		
		// adicionando os contatos
		Contact c1 = new Contact("Ana", "111-1111");
        Contact c2 = new Contact("Beto", "222-2222");
        Contact c3 = new Contact("Carla", "333-3333");
        Contact c4 = new Contact("Daniel", "444-4444");
        Contact c5 = new Contact("Eduarda", "555-5555");
        
        List.add(c1);
        List.add(c2);
        List.printAll();
        List.showReferences();
        
        List.add(c3);
        List.add(c4);
        System.out.println(List.contacts.length);
        
        List.add(c5);
        System.out.println(List.contacts.length);
        List.printAll();
        List.showReferences();
	}
}
