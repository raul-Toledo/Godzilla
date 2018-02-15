//*******************************************************************
// Una Clase se compone principalmente de tres partes
// Nombre
// Atributos
// Metodos
//*******************************************************************


// Nombre de la clase
class Monstruo
{
  //Atributos de la clase
  public String strNombre;
  private	boolean bitAtaca;
  protected String strDebilidad;
    
  //Metodos de la clase
  //Encapsulamos los metodos mbitAtacaediante los metodos get y set
  //Como strNombre es publico no requerimos metodos set y get
  public void setAtaca (boolean bolBandera){
  	this.bitAtaca = bolBandera;
  }
  
  public boolean getAtaca(){
  	return this.bitAtaca;
  }
  
  public void setDebilidad (String strAtributo){
  	this.strDebilidad = strAtributo;
  }
  
  public String getDebilidad(){
  	return this.strDebilidad;
  }
}

