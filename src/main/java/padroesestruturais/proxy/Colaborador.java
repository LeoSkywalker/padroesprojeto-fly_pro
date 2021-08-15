package padroesestruturais.proxy;

public class Colaborador {

    private String cpf;
    private boolean admin;

    public Colaborador(String cpf, boolean admin) {
        this.cpf = cpf;
        this.admin = admin;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
