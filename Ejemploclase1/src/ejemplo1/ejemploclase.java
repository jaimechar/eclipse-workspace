package ejemplo1;

import javax.swing.JOptionPane;

public class ejemploclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double acumNotas=0;
        double promedio;
        double nota;
        short cantNotas=0;
        promedio =0;
        cantNotas= Short.parseShort(JOptionPane.showInputDialog("Introduzca la cantidad de notas"));
        for (int i=0; i<=cantNotas-1; i++){
            System.out.println("Ingrese la nota");
            nota= Double.parseDouble(JOptionPane.showInputDialog("Introduzca una nota"));
            acumNotas+= nota;
        }
        promedio= acumNotas/cantNotas;
        System.out.println("El promedio de las notas es "+promedio);

	}

}
