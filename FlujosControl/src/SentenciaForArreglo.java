import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        // It's better to put [] in the data type and not in the name, as a good practice.
        // The most common is to print values of lists or arrays with for

        String [] names = {"Marco","Luis","Diego","Jesus","Esteban","Jose"};
        int counter = names.length;

        // If we want to skip Marco and Jose to print names we use if with continue
        for (int i = 0; i < counter; i++) {
            if (names[i].equalsIgnoreCase("Marco") || names[i].equalsIgnoreCase("Jose")) {
                continue;
            }
            System.out.println("Position "+i+"-> ".concat(names[i]));
        }

        // Search a name
        String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre que desea buscar, ejemplo \"Marco\": ");
        System.out.println("buscarNombre = " + buscarNombre);

        //Search a name in the array
        boolean state = false;
        for (int i = 0; i < counter; i++) {
            if (names[i].equalsIgnoreCase(buscarNombre)) {
                state = true;
                break; // Paramos las iteraciones apenas se encuentre
            }
        }
        if (state) {
            JOptionPane.showMessageDialog(null,"El nombre ".concat(buscarNombre).concat(" ha sido encontrado!"));
        }
        else {
            JOptionPane.showMessageDialog(null, "El nombre ".concat(buscarNombre).concat(" no existe en el sistema!"));
        }



    }
}
