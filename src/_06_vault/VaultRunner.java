package _06_vault;

public class VaultRunner {
public static void main(String[] args) {
	
	Vault vault = new Vault();
	SecretAgent agent = new SecretAgent();
	vault.tryCode(92);
	agent.findCode(vault);
	
}
}
