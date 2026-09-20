package _06_vault;

public class SecretAgent {

	
	public SecretAgent() {
		// TODO Auto-generated constructor stub
		
	}
	
	void findCode(Vault vault){
	for(int i=0; i<1000000;i++) {
	if(vault.tryCode(i)) {
		System.out.println("the code was " + i);  }
		//break;
	}}
	
	
}
