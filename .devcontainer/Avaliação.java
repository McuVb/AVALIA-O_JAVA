 package .devcontainer;

public class Avaliação () 
{

    
double soma = 1;
double media;
int contador = 0;


int temperaturar = Integer.parseInt(IO.readln("Digite a temperatura em °C, 999 para encerrar"));


while (temperaturar != 999) {

    soma = soma + temperaturar;
    contador = contador + 1;

      
}

if (contador > 0) {

    media = soma / contador;

    
     IO.println("Leituras registradas: " + contador);
     IO.println("Temperatura média" + media);

    if (media < 18) {
        System.out.println("Temperatura Baixa: Ligar Aquecimento");
    } 
    else if (media <= 28) {
        System.out.println("Temperatura Ideal");
    } 
    else {
        System.out.println("Temperatura Alta: Ligar Ventilação");
    }

} else {
     IO.println("Aviso: Nenhuma leitura foi registrada.");
     IO.println("Não foi possível calcular a temperatura média.");
}


}
