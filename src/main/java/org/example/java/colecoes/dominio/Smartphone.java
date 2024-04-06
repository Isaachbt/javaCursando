package org.example.java.colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //quando usar smart1.equals(smart2) na class principal esse metodo será chamado e ira verificar tudo isso.
        //dessa forma ele esta verificando se os dados dentro das variaveis são iguais, não a referencia.
        if(obj == null) return  false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())return false;//verifacando se os obj (class) são iguais
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
