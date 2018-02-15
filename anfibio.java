//Creamos una clase abstracta porque pueden existir varios 
//monstruos anfibios con caracteristicas en comun
import monstruo.java;

abstract class MonstruoAnfibio extends Monstruo{

  protected String strAtaquePpal;
  
  //los metodos abstractos NO SE IMPLEMENTAN
  protected abstract void Ataca();
  
  public void setAtaque (String strAtributo){
  	this.strAtaquePpal = strAtributo;
  }
  
}