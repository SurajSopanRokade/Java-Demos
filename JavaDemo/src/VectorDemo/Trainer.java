package VectorDemo;

public class Trainer {
	String name;
	int exp;
	String quali;
	
	
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", exp=" + exp + ", quali=" + quali + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public String getQuali() {
		return quali;
	}


	public void setQuali(String quali) {
		this.quali = quali;
	}


	public Trainer(String name, int exp, String quali) {
		super();
		this.name = name;
		this.exp = exp;
		this.quali = quali;
	}


	public Trainer() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
