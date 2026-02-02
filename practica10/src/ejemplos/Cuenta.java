package ejemplos;

import java.util.Objects;

// Clase Cuenta
public class Cuenta 
{
	// Variables miembro de objeto
	private String numCuenta;
	private String titular;
	private float saldo;
	private int numSecreto;
	
	// Constructor
	public Cuenta(String num, String tit, float s, int numSecr)
	{
		numCuenta = num;
		titular = tit;
		saldo = s;
		numSecreto = numSecr;
	}

	// M�todos miembro de objeto
	
	// M�todos set y get
	public String getNumCuenta() {return numCuenta;}
	public String getTitular()   {return titular;}
	public float getSaldo()      {return saldo;}
	public int getNumSecreto()   {return numSecreto;}
	
	public void setNumCuenta(String nc) {numCuenta=nc;}
	public void setTitular(String t)    {titular=t;}
	public void setSaldo(float s)       {saldo=s;}
	public void setNumSecreto(int n)    {numSecreto=n;}
	
	
	// M�todo que permite ingresar dinero en una cuenta
	public void imposicion(float cantidad) {saldo = saldo + cantidad;}
	
	// M�todo que permite sacar dinero en una cuenta
	public boolean reintegro(float cantidad)  {
		saldo = saldo - cantidad;
		return true;
	}

	// M�todo que devuelve informaci�n sobre la cuenta
	public String toString()
	{
		return "\nN�mero de cuenta: " + numCuenta +
		       "\nTitular de la cuenta: " + titular +
		       "\nSaldo actual: " + saldo;
	}

	// Metodo para validar el n�mero secreto
	public boolean validar(int num)
	{
		//if (num==numSecreto) return true; else return false;
		
		return num==numSecreto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(numCuenta, other.numCuenta);
	}	
	

	

}









