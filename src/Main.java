/**Universidad del Valle de Guatemala
 Fecha: 22/01/2021
 Nombres:
 Juan Carlos Bajan: 20109
 Pablo Gonzalez: 20362
 Clase Main
 */

import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    RadioGeneral radio = new RadioSonora();
    Scanner scan = new Scanner(System.in);

    boolean run2 = true;
    while(run2){

      if(radio.isON()==false){

        boolean run = true;
        while(run){
          try{
            System.out.println("Desea encender la Radio? (Ingrese '1' para hacerlo)");
            int opc1=scan.nextInt();
            if(opc1==1){
              run=false;
              radio.encender();
            }
            else{
              System.out.println("Ingrese un numero valido");
            }
          }catch(Exception e){
            System.out.println("Por favor ingrese numeros unicamente");
            scan.nextLine();
          }
        }


      } else{
        /**Menu cuando el usuario entra a la radio*/
        System.out.println("######-MENU-######");
        System.out.println("1. Incrementar");
        System.out.println("2. Asignar");
        System.out.println("3. Seleccionar emisora guardada");
        System.out.println("4. Cambiar Radiofrecuencia");
        System.out.println("5. Apagar");
        System.out.println("6. Salir");

        boolean run = true;
        int opc = 0;
        while(run){
          try{
            System.out.println("Ingrese la opcion que desee");
            opc = scan.nextInt();
            if(opc < 1 || opc > 6){
              System.out.println("Por favor ingrese el numero correcto");
            } else{
              run = false;
            }
          }catch(Exception e){
            System.out.println("Por favor ingrese numeros unicamente");
            scan.nextLine();
          }
        }

        switch(opc){

          case 1:
            radio.incrementar();/**Caso 1 incrementa la estacion segun sea fm o am.*/
            break;
          case 2:/**Asignar emisora a uno de los 12 botones.*/
            System.out.println("Por favor ingrese la emisora que desea seleccionar (1-12)");
            boolean run3 = true;
            int opc2 = 0;
            while(run3){
              try{
                opc2 = scan.nextInt();
                if(opc2 < 1 || opc2 > 12){
                  System.out.println("Por favor ingrese el numero correcto");
                } else{
                  run3 = false;
                }
              }catch(Exception e){
                System.out.println("Por favor ingrese numeros unicamente");
                scan.nextLine();
              }
            }
            radio.asignar(opc2);
            break;
          case 3:/**Seleccionar emisora guardada en uno de los 12 botones.*/
            System.out.println("Por favor ingrese la emisora que desea seleccionar (1-12)");
            boolean run4 = true;
            int opc3 = 0;
            while(run4){
              try{
                opc3 = scan.nextInt();
                if(opc3 < 1 || opc3 > 12){
                  System.out.println("Por favor ingrese el numero correcto");
                } else{
                  run4 = false;
                }
              }catch(Exception e){
                System.out.println("Por favor ingrese numeros unicamente");
                scan.nextLine();
              }
            }
            radio.emisora(opc3);
            break;
          case 4:/** Cambiar de am a fm.*/
            radio.frecuencia();
            break;
          case 5:/**Apagar el radio para que se vuelva a mostrar el menu principal*/
            radio.apagar();
            break;
          case 6:/**Terminar el programa*/
            run2=false;
            break;
        }

      }
    }
  }
}