package model;

public class DataLoguin {


    private String userName;
    private String password;
    private String texto;
    private String numero;

    private String select;

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getTexto() {     return texto;   }

    public void setTexto(String texto) {  this.texto = texto;   }

    public String getNumero() { return numero;  }

    public void setNumero(String numero) {   this.numero = numero;   }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}