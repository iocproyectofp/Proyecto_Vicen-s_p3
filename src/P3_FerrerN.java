
import java.util.Scanner;

/*
Constantes
int: 
codiMin: 100, 
codiMax: 2100
idSessioMin 4
idSessioMax 27
experienciaMin: 0
experienciaMax : 30


variable
int: codi=0, genere=0, tipus=0, donaSessio=0, idSessio=0, experiencia=0,
boolean dadaCorrecta= true

// demanen dades al usuari

Mostrar en pantalla: quin es el teu codi?
guardar en codi

si codi esta entra codiMin i codiMax
si no esta sortir del programa

demanar genere
Mostrar en pantalla: quin es el teu genere? (1) Dona (2) Home (3) no ho vull dir
guardar en Genere
si es 1 2 3 Ok
sino tancar programa.

demanar tipus
Mostrar en pantalla: Quin tipus de entrada tens asignada? 
0 general
1 educacio
2 empresa
3 premsa
guardar en tipus
Si es 0,1,2,3 continuar programa
Sino sortir del programa.

Donar sesio
Mostrar en pantalla: Dones sesió? 1-si, 0-no
guardar en donaSessio

si dona sesio
mostar: entrar el id de la sessió? (4-27)
si el número esta entre 4 i 27 continuar programa.
sino sortir del programa.

si donaSesio = 0
continuar programa

Si dona sesio no es 1 ni 0,
Sortir del programa

Demanar experiencia en java
Mostrar quants anys d'experiencia tens en Java? 
guardar en experiencia
si valor esta entre 0 i 30 continuar programa
Sino tancar el programa.

Mostrar resum de la dades

Si donaSessio=1 
Mostrar: codi, genere, tipus,donaSessio, idSessio i experiencia
Si donaSessio = 0 
Mostar: codi,genere, tipus, donaSessio i experiencia

*/


public class P3_FerrerN {
    
  
    
  
    public static final int CODIMIN = 100;
    public static final int CODIMAX = 2100;
    public static final int IDSESSIOMINIM = 4;
    public static final int IDSESSIOMAX = 27;
    public static final int EXPERIENCIAMIN =0;
    public static final int EXPERIENCIAMAX = 30;
    public static final int GENEREMIN = 1;
    public static final int GENEREMAX = 3;
    public static final int TIPUSMIN = 0;
    public static final int TIPUSMAX = 3;
    public static final int RESPOSTANO = 0;
    public static final int RESPOSTASI = 1;
    public static final String GENERE1 = "dona";
    public static final String GENERE2 = "home";
    public static final String GENERE3= "prefereix no respondre";
    public static final String TIPUS0 = "general";
    public static final String TIPUS1 = "educació";
    public static final String TIPUS2 = "empresa";
    public static final String TIPUS3 = "premsa";
    public static final String SESSIO1 = "si";
    public static final String SESSIO0 = "no";
    public static final int MAX_INTENTS = 3;
    public static final int MAX_PARTICIPANTS = 10;







    public static void main (String [] args) {

        //declarem variables
        int []codi= new int [MAX_PARTICIPANTS];
        int []tipus = new int [MAX_PARTICIPANTS];
        int []genere= new int [MAX_PARTICIPANTS];
        int []donaSessio = new int [MAX_PARTICIPANTS];
        int []idSessio = new int [MAX_PARTICIPANTS];
        int []experiencia = new int [MAX_PARTICIPANTS];
        int intents=0, mesParticipants =0,participants = 0, seguir=0, icanvi=0 ;
        boolean dadaCorrecta= true, introduirMes = false;
        String genereTipus = "";
        String tipusEntrada= "";
        String sessio = "";


        Scanner lector = new Scanner (System.in);

        do {  

            do{
                //Demanem codi
                System.out.println( "Introduir el vostre codi");
                dadaCorrecta = lector.hasNextInt(); // per analitzar tipues de dada
                if (dadaCorrecta){ //si es número sencer
                    //Llegim dades
                    codi[participants]= lector.nextInt();
                    //Avaluem si és valida. 
                    if ((codi[participants]<CODIMIN)|| (codi[participants] >CODIMAX)){
                        dadaCorrecta = false;
                        System.out.println ("El codi no és correcte");
                    }  
                }
                    intents++;
            } while ((!dadaCorrecta)&& (intents<MAX_INTENTS));


                    if (dadaCorrecta){
                        intents=0;
                        do{
                            //Demanar genere
                            System.out.println("quin es el teu genere? (1)-Dona (2)-Home (3)-No ho vull dir");
                            dadaCorrecta = lector.hasNextInt();
                            if (dadaCorrecta){ //si es número sencer
                                // Llegim dades
                                genere[participants] = lector.nextInt();
                                //Avaluem si és valida.
                                if ((genere[participants] < GENEREMIN) || (genere[participants] > GENEREMAX )){
                                    dadaCorrecta = false;
                                    System.out.println ("El genere no es correcte");   
                                }

                            }
                           intents++; 
                        } while ((!dadaCorrecta)&& (intents<MAX_INTENTS));
                    }

                  if (dadaCorrecta){
                      intents=0;
                      do{
                            System.out.println("Quin tipus de entrada tens asignada?");
                            System.out.println("0-General");
                            System.out.println("1-Educació");
                            System.out.println("2-Empresa");
                            System.out.println("3-Premsa");
                            dadaCorrecta = lector.hasNextInt();
                            if (dadaCorrecta){
                                tipus [participants] = lector.nextInt();
                                if ((tipus[participants] < TIPUSMIN )||(tipus[participants] > TIPUSMAX)){
                                    dadaCorrecta = false;
                                    System.out.println ("El tipus no es correcte");
                                }
                            }
                            intents++;
                        } while ((!dadaCorrecta)&& (intents<MAX_INTENTS)); 
                  }

                  if (dadaCorrecta){
                      intents=0;
                      do{
                        System.out.println("Dona sessió? 1-SI 0-NO");
                        dadaCorrecta = lector.hasNextInt();
                        if (dadaCorrecta){
                                donaSessio [participants] = lector.nextInt();
                                if ((donaSessio [participants] < RESPOSTANO) || (donaSessio [participants] > RESPOSTASI )){
                                    dadaCorrecta = false;
                                    System.out.println("Entrada incorrecta");

                                } else{ //Si arribem aqui es que la dada donaSessio es correcta
                                  switch (donaSessio[participants]){
                                      case 1:
                                          if (dadaCorrecta){
                                              do{
                                                System.out.println("Entra el id de la sessió (4-27)");
                                                dadaCorrecta = lector.hasNextInt();
                                                if (dadaCorrecta){
                                                    idSessio[participants] = lector.nextInt();
                                                    if ((idSessio[participants] < IDSESSIOMINIM)||(idSessio[participants] > IDSESSIOMAX)){
                                                        dadaCorrecta = false;
                                                        System.out.println("Id incorrecta");

                                                     }

                                                 }
                                                intents++;
                                               } while ((!dadaCorrecta)&& (intents<MAX_INTENTS)); 
                                           }


                                  }

                              }

                        }
                      intents++;
                     } while ((!dadaCorrecta)&& (intents<MAX_INTENTS));
                  }
                  if (dadaCorrecta){
                      intents=0;
                      do{
                        System.out.println("Indicar els anys de experiencia en Java");
                        dadaCorrecta = lector.hasNextInt();
                        if (dadaCorrecta){
                            experiencia[participants] = lector.nextInt();
                            if ((experiencia[participants] < EXPERIENCIAMIN )|| (experiencia[participants] > EXPERIENCIAMAX)){
                                dadaCorrecta = false;
                                System.out.println("Anys d'experincia incorrecta");
                            }
                        }
                       intents++; 
                       } while ((!dadaCorrecta)&& (intents<MAX_INTENTS)); 
                  }
                  
                   // avaluem si es volen introdir nous participats
                  System.out.println("Es vol introduir nous participants? 1-Si 0-No");
                  dadaCorrecta= lector.hasNextInt();
                  if (dadaCorrecta){
                      mesParticipants = lector.nextInt();
                      if((mesParticipants < 0)||(mesParticipants>1)){
                          dadaCorrecta = false;
                          System.out.println("Entrada incorrecta");

                      }
                     
                        if (mesParticipants ==1){
                            introduirMes = true;
                            intents = 0;
                        }
                        if (mesParticipants ==0){
                            introduirMes= false;
                        }
                  }
                 participants++;
                 
                  
                 



        } while (introduirMes); 
        

          System.out.println("S' han intriuit  " +participants+ " nous participants");
          
          // Mostrem dades introduices de 0 fins a participants.
          

              for (int i=0; i < participants; i++){ 
                      switch (genere[i]){
                          case 1:
                              genereTipus = GENERE1;
                              break;
                          case 2:
                              genereTipus = GENERE2;
                              break;
                          case 3:
                              genereTipus = GENERE3;
                              break;
                      }
              
                      switch (tipus[i]){
                          case 0:
                              tipusEntrada = TIPUS0;
                              break;
                          case 1:
                              tipusEntrada = TIPUS1;
                              break;
                          case 2:
                              tipusEntrada = TIPUS2;
                              break;
                          case 3:
                              tipusEntrada = TIPUS3;
                              break;
                      }
                      switch (donaSessio[i]){
                          case 0:
                              sessio = SESSIO0;
                              break;
                          case 1:
                              sessio = SESSIO1;
                              break;
                      }
                 System.out.println("CODI    GENERE            TIPUS         SESSIO        ID       EXPERIENCIA");
                System.out.println(codi[i]+"    "+genereTipus+"     "+tipusEntrada+"     "+sessio+"    "+idSessio[i]+"     "  +experiencia[i]);       
              }
              System.out.println("vols mostrar el participants edreçats per experiencia? 1-SI 0-NO");
              dadaCorrecta= lector.hasNextInt();
              if (dadaCorrecta){
                  seguir = lector.nextInt();
                  if (seguir ==1){
                      for (int j=0; j < participants -1; j++){
                         for(int i = j + 1; i < participants; i++){
                             if(experiencia [j] < experiencia [i]){
                                 icanvi = experiencia [j];
                                 experiencia [j]= experiencia [i];
                                 experiencia [i]= icanvi;
                                 
                                 icanvi = codi [j];
                                 codi [j]= codi [i];
                                 codi [i]= icanvi;
                                 
                                 icanvi = tipus [j];
                                 tipus [j]= tipus [i];
                                 tipus [i]= icanvi;
                                 
                                 icanvi = genere [j];
                                 genere [j]= genere [i];
                                 genere [i]= icanvi;
                                 
                                 icanvi = donaSessio [j];
                                 donaSessio [j]= donaSessio [i];
                                 donaSessio [i]= icanvi;
                                 
                                 icanvi = idSessio [j];
                                 idSessio [j]= idSessio [i];
                                 idSessio [i]= icanvi;
                             }
                         } 
                      }
                  }
                  
              }
              for (int i=0; i < participants; i++){ 
                      switch (genere[i]){
                          case 1:
                              genereTipus = GENERE1;
                              break;
                          case 2:
                              genereTipus = GENERE2;
                              break;
                          case 3:
                              genereTipus = GENERE3;
                              break;
                      }
              
                      switch (tipus[i]){
                          case 0:
                              tipusEntrada = TIPUS0;
                              break;
                          case 1:
                              tipusEntrada = TIPUS1;
                              break;
                          case 2:
                              tipusEntrada = TIPUS2;
                              break;
                          case 3:
                              tipusEntrada = TIPUS3;
                              break;
                      }
                      switch (donaSessio[i]){
                          case 0:
                              sessio = SESSIO0;
                              break;
                          case 1:
                              sessio = SESSIO1;
                              break;
                      }
                 System.out.println("CODI    GENERE            TIPUS         SESSIO        ID       EXPERIENCIA");
                 System.out.println(codi[i]+"    "+genereTipus+"     "+tipusEntrada+"     "+sessio+"    "+idSessio[i]+"     "  +experiencia[i]);
              }
    }

}
