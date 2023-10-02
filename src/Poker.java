public class Poker {
    public static void main(String[] args){

    }
        }int palos =(int)(Math.random()*4+1);
string palosb=" ";
        if (palos==1) {
            palosb = "picas";
        }
        if (palos==2) {
            palosb = "Corazones";
        }
        if (palos==3) {
            palosb = "Diamantes";
        }
        if (palos==4) {
            palosb = "Treboles";
    }
    int numeros =(int)(Math.random()*13+1);
        string numerosb= " ";
        if (numeros==1){
            numerosb="uno";
    }
         if (numeros==2){
        numerosb="dos";
         }
        if (numeros==3){
            numerosb="tres";
        }
        if (numeros==4){
            numerosb="cuatro";
        }
        if (numeros==5){
            numerosb="cinco";
        }
        if (numeros==6){
            numerosb="seis";
        }
        if (numeros==7){
            numerosb="siete";
        }
        if (numeros==8){
            numerosb="ocho";
        }
        if (numeros==9){
            numerosb="nueve";
        }
        if (numeros==10){
            numerosb="diez";
        }
        if (numeros==11){
            numerosb="once";
        }
        if (numeros==12){
            numerosb="doce";
        }
        if (numeros==13){
            numerosb="trece";
        }
        system.out.println(numerosb + "de" palosb);
}