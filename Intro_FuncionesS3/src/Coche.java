import javax.swing.*;

public class Coche {

 public int puertas=3 ;


 public Coche() {

 }

 public Coche(int puertas) {
  this.puertas = puertas;
 }



 public int incrementoPuertas(){

  if (puertas==3){

   puertas+=1;

  }
  return puertas;

 }

}
