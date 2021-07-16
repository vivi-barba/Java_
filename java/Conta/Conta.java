package Conta;

class Conta 
{
    String Titular;
    int Numero;
    int Agencia;
    Double Saldo;
    String data_de_abertura;


public Conta(String Titular, int Numero, int Agencia, double Saldo, String data_de_abertura)
{
    this.Titular = Titular;
    this.Numero = Numero;
    this.Agencia = Agencia;
    this.Saldo = Saldo;
    this.data_de_abertura = data_de_abertura;
}

}