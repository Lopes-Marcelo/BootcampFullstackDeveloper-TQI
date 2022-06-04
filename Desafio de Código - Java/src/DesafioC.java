import java.util.Scanner;

public class DesafioC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String linha = teclado.nextLine();
        String[] valores = linha.split(" ");
        float a = Float.parseFloat(valores[0]);
        float b = Float.parseFloat(valores[1]);

        String linha1 = teclado.nextLine();
        String[] valores1 = linha1.split(" ");
        float c = Float.parseFloat(valores1[0]);
        float d = Float.parseFloat(valores1[1]);

        double distancia = Math.sqrt((Math. pow((c-a),2)) + (Math. pow((d-b),2)));
        System.out.printf("%.4f %n", distancia);

        teclado.close();
    }
}

/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, conforme a fórmula:

Distancia = fórmula da distancia entre dois pontos.

Entrada: O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2. 1.0 7.0
5.0 9.0

Saída: Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal. 4.4721 */
