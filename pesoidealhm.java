import java.util.Scanner;

public class pesoidealhm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double altura, pesoidealH, pesoidealM;
        String sexoBiologico;

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();
        System.out.print("Digite seu sexo biológico(F/M): ");
        sexoBiologico = teclado.next();

        pesoidealH = (72.7 * altura) - 58;
        pesoidealM = (62.1 * altura) - 44.7;

        if (sexoBiologico.equals("F") || sexoBiologico.equals("f")) {
            System.out.print("O seu peso ideal é de: " + pesoidealM);
        }else {  
            if (sexoBiologico.equals("M") || sexoBiologico.equals("m")) {
            System.out.print("O seu peso ideal é de: " + pesoidealH);
        } else {
            System.out.print("Não entendi, tente novamente");
        }
    }

        teclado.close();      
    }
}