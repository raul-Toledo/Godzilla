import anfibio.java;

//Vamos a crear un Monstruo Godzilla el cual es anfibio
//como es anfibio heredara de la clase abstracta MonstruoAnfibio
 public class Godzilla extends MonstruoAnfibio{
  
  //Como hereda de una clase abstracta se tiene que implementar
  //el método abstracto 
  protected void Ataca(){
  	System.out.println("Godzilla Ataca con: " + this.strAtaquePpal);
  }
  
    public static void main(String[] args)
  {
      Godzilla monGodzilla = new Godzilla();
      //Como el atributo strNombre es publico podemos acceder al mismo
      //de manera directa
      monGodzilla.strNombre = "Godzilla";
      
      //Como el atributo setDebilidad es protegido, este es publico para
      //las clases "hijas" pero es privado para el resto
      //Asi que se puede acceder mediante los metodos set/get o directamente
      monGodzilla.setDebilidad("Hollywood");
      monGodzilla.strDebilidad = "altos voltajes de eletricidad";
      
      monGodzilla.setAtaque("Lanzar Fuego");
      
      //La suerte definira si ataca o no
      if(Math.random()<0.5){
        monGodzilla.setAtaca(true);
      }else{
        monGodzilla.setAtaca(false);
      }
      
      System.out.println(monGodzilla.strNombre);
      System.out.println(monGodzilla.getDebilidad());
      
      if(monGodzilla.getAtaca()){
      	monGodzilla.Ataca();
      }else{
      	System.out.println(monGodzilla.strNombre + " Esta Dormido ");
      }
  }
  
}