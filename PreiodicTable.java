package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class PreiodicTable extends Application {
    // Define a 2D array to represent the periodic table
    private static final String[][] ELEMENTS = {
        {"H", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "He"},
        {"Li", "Be", "", "", "", "", "", "", "", "", "", "", "B", "C", "N", "O", "F", "Ne"},
        {"Na", "Mg", "", "", "", "", "", "", "", "", "", "", "Al", "Si", "P", "S", "Cl", "Ar"},
        {"K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr"},
        {"Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe"},
        {"Cs", "Ba", "La", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn"},
        {"Fr", "Ra", "Ac", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"},
        {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}
    };

    // Example data structure to hold element details
    private static final Map<String, String> ELEMENT_DETAILS = new HashMap<>();
    static {
    	 ELEMENT_DETAILS.put("H", "Hydrogen\nAtomic Number: 1\nAtomic Mass: 1.008\nNonmetal");
         ELEMENT_DETAILS.put("He", "Helium\nAtomic Number: 2\nAtomic Mass: 4.0026\nNoble Gas");
         ELEMENT_DETAILS.put("Li", "Lithium\nAtomic Number: 3\nAtomic Mass: 6.94\nAlkali Metal");
         ELEMENT_DETAILS.put("Be", "Beryllium\nAtomic Number: 4\nAtomic Mass: 9.0122\nAlkaline Earth Metal");
         ELEMENT_DETAILS.put("B", "Boron\nAtomic Number: 5\nAtomic Mass: 10.81\nMetalloid");
         ELEMENT_DETAILS.put("C", "Carbon\nAtomic Number: 6\nAtomic Mass: 12.011\nNonmetal");
         ELEMENT_DETAILS.put("N", "Nitrogen\nAtomic Number: 7\nAtomic Mass: 14.007\nNonmetal");
         ELEMENT_DETAILS.put("O", "Oxygen\nAtomic Number: 8\nAtomic Mass: 15.999\nNonmetal");
         ELEMENT_DETAILS.put("F", "Fluorine\nAtomic Number: 9\nAtomic Mass: 18.998\nHalogen");
         ELEMENT_DETAILS.put("Ne", "Neon\nAtomic Number: 10\nAtomic Mass: 20.180\nNoble Gas");
         ELEMENT_DETAILS.put("Na", "Sodium\nAtomic Number: 11\nAtomic Mass: 22.990\nAlkali Metal");
         ELEMENT_DETAILS.put("Mg", "Magnesium\nAtomic Number: 12\nAtomic Mass: 24.305\nAlkaline Earth Metal");
         ELEMENT_DETAILS.put("Al", "Aluminium\nAtomic Number: 13\nAtomic Mass: 26.982\nPost-transition Metal");
         ELEMENT_DETAILS.put("Si", "Silicon\nAtomic Number: 14\nAtomic Mass: 28.085\nMetalloid");
         ELEMENT_DETAILS.put("P", "Phosphorus\nAtomic Number: 15\nAtomic Mass: 30.974\nNonmetal");
         ELEMENT_DETAILS.put("S", "Sulfur\nAtomic Number: 16\nAtomic Mass: 32.06\nNonmetal");
         ELEMENT_DETAILS.put("Cl", "Chlorine\nAtomic Number: 17\nAtomic Mass: 35.45\nHalogen");
         ELEMENT_DETAILS.put("Ar", "Argon\nAtomic Number: 18\nAtomic Mass: 39.948\nNoble Gas");
         ELEMENT_DETAILS.put("K", "Potassium\nAtomic Number: 19\nAtomic Mass: 39.098\nAlkali Metal");
         ELEMENT_DETAILS.put("Ca", "Calcium\nAtomic Number: 20\nAtomic Mass: 40.078\nAlkaline Earth Metal");
         ELEMENT_DETAILS.put("Sc", "Scandium\nAtomic Number: 21\nAtomic Mass: 44.956\nTransition Metal");
         ELEMENT_DETAILS.put("Ti", "Titanium\nAtomic Number: 22\nAtomic Mass: 47.867\nTransition Metal");
         ELEMENT_DETAILS.put("V", "Vanadium\nAtomic Number: 23\nAtomic Mass: 50.942\nTransition Metal");
         ELEMENT_DETAILS.put("Cr", "Chromium\nAtomic Number: 24\nAtomic Mass: 51.996\nTransition Metal");
         ELEMENT_DETAILS.put("Mn", "Manganese\nAtomic Number: 25\nAtomic Mass: 54.938\nTransition Metal");
         ELEMENT_DETAILS.put("Fe", "Iron\nAtomic Number: 26\nAtomic Mass: 55.845\nTransition Metal");
         ELEMENT_DETAILS.put("Co", "Cobalt\nAtomic Number: 27\nAtomic Mass: 58.933\nTransition Metal");
         ELEMENT_DETAILS.put("Ni", "Nickel\nAtomic Number: 28\nAtomic Mass: 58.693\nTransition Metal");
         ELEMENT_DETAILS.put("Cu", "Copper\nAtomic Number: 29\nAtomic Mass: 63.546\nTransition Metal");
         ELEMENT_DETAILS.put("Zn", "Zinc\nAtomic Number: 30\nAtomic Mass: 65.38\nTransition Metal");
         ELEMENT_DETAILS.put("Ga", "Gallium\nAtomic Number: 31\nAtomic Mass: 69.723\nPost-transition Metal");
         ELEMENT_DETAILS.put("Ge", "Germanium\nAtomic Number: 32\nAtomic Mass: 72.63\nMetalloid");
         ELEMENT_DETAILS.put("As", "Arsenic\nAtomic Number: 33\nAtomic Mass: 74.922\nMetalloid");
         ELEMENT_DETAILS.put("Se", "Selenium\nAtomic Number: 34\nAtomic Mass: 78.971\nNonmetal");
         ELEMENT_DETAILS.put("Br", "Bromine\nAtomic Number: 35\nAtomic Mass: 79.904\nHalogen");
         ELEMENT_DETAILS.put("Kr", "Krypton\nAtomic Number: 36\nAtomic Mass: 83.798\nNoble Gas");
         ELEMENT_DETAILS.put("Rb", "Rubidium\nAtomic Number: 37\nAtomic Mass: 85.468\nAlkali Metal");
         ELEMENT_DETAILS.put("Sr", "Strontium\nAtomic Number: 38\nAtomic Mass: 87.62\nAlkaline Earth Metal");
         ELEMENT_DETAILS.put("Y", "Yttrium\nAtomic Number: 39\nAtomic Mass: 88.906\nTransition Metal");
         ELEMENT_DETAILS.put("Zr", "Zirconium\nAtomic Number: 40\nAtomic Mass: 91.224\nTransition Metal");
         ELEMENT_DETAILS.put("Nb", "Niobium\nAtomic Number: 41\nAtomic Mass: 92.906\nTransition Metal");
         ELEMENT_DETAILS.put("Mo", "Molybdenum\nAtomic Number: 42\nAtomic Mass: 95.95\nTransition Metal");
         ELEMENT_DETAILS.put("Tc", "Technetium\nAtomic Number: 43\nAtomic Mass: [98]\nTransition Metal");
         ELEMENT_DETAILS.put("Ru", "Ruthenium\nAtomic Number: 44\nAtomic Mass: 101.07\nTransition Metal");
         ELEMENT_DETAILS.put("Rh", "Rhodium\nAtomic Number: 45\nAtomic Mass: 102.91\nTransition Metal");
         ELEMENT_DETAILS.put("Pd", "Palladium\nAtomic Number: 46\nAtomic Mass: 106.42\nTransition Metal");
         ELEMENT_DETAILS.put("Ag", "Silver\nAtomic Number: 47\nAtomic Mass: 107.87\nTransition Metal");
         ELEMENT_DETAILS.put("Cd", "Cadmium\nAtomic Number: 48\nAtomic Mass: 112.41\nTransition Metal");
         ELEMENT_DETAILS.put("In", "Indium\nAtomic Number: 49\nAtomic Mass: 114.82\nPost-transition Metal");
         ELEMENT_DETAILS.put("Sn", "Tin\nAtomic Number: 50\nAtomic Mass: 118.71\nPost-transition Metal");
         ELEMENT_DETAILS.put("Sb", "Antimony\nAtomic Number: 51\nAtomic Mass: 121.76\nMetalloid");
         ELEMENT_DETAILS.put("Te", "Tellurium\nAtomic Number: 52\nAtomic Mass: 127.60\nMetalloid");
         ELEMENT_DETAILS.put("I", "Iodine\nAtomic Number: 53\nAtomic Mass: 126.90\nHalogen");
         ELEMENT_DETAILS.put("Xe", "Xenon\nAtomic Number: 54\nAtomic Mass: 131.29\nNoble Gas");
         ELEMENT_DETAILS.put("Cs", "Cesium\nAtomic Number: 55\nAtomic Mass: 132.91\nAlkali Metal");
         ELEMENT_DETAILS.put("Ba", "Barium\nAtomic Number: 56\nAtomic Mass: 137.33\nAlkaline Earth Metal");
         ELEMENT_DETAILS.put("La", "Lanthanum\nAtomic Number: 57\nAtomic Mass: 138.91\nLanthanide");
         ELEMENT_DETAILS.put("Ce", "Cerium\nAtomic Number: 58\nAtomic Mass: 140.12\nLanthanide");
         ELEMENT_DETAILS.put("Pr", "Praseodymium\nAtomic Number: 59\nAtomic Mass: 140.91\nLanthanide");
         ELEMENT_DETAILS.put("Nd", "Neodymium\nAtomic Number: 60\nAtomic Mass: 144.24\nLanthanide");
         ELEMENT_DETAILS.put("Pm", "Promethium\nAtomic Number: 61\nAtomic Mass: [145]\nLanthanide");
         ELEMENT_DETAILS.put("Sm", "Samarium\nAtomic Number: 62\nAtomic Mass: 150.36\nLanthanide");
         ELEMENT_DETAILS.put("Eu", "Europium\nAtomic Number: 63\nAtomic Mass: 151.96\nLanthanide");
         ELEMENT_DETAILS.put("Gd", "Gadolinium\nAtomic Number: 64\nAtomic Mass: 157.25\nLanthanide");
         ELEMENT_DETAILS.put("Tb", "Terbium\nAtomic Number: 65\nAtomic Mass: 158.93\nLanthanide");
         ELEMENT_DETAILS.put("Dy", "Dysprosium\nAtomic Number: 66\nAtomic Mass: 162.50\nLanthanide");
         ELEMENT_DETAILS.put("Ho", "Holmium\nAtomic Number: 67\nAtomic Mass: 164.93\nLanthanide");
         ELEMENT_DETAILS.put("Er", "Erbium\nAtomic Number: 68\nAtomic Mass: 167.26\nLanthanide");
         ELEMENT_DETAILS.put("Tm", "Thulium\nAtomic Number: 69\nAtomic Mass: 168.93\nLanthanide");
         ELEMENT_DETAILS.put("Yb", "Ytterbium\nAtomic Number: 70\nAtomic Mass: 173.04\nLanthanide");
         ELEMENT_DETAILS.put("Lu", "Lutetium\nAtomic Number: 71\nAtomic Mass: 174.97\nLanthanide");
         ELEMENT_DETAILS.put("Hf", "Hafnium\nAtomic Number: 72\nAtomic Mass: 178.49\nTransition Metal");
         ELEMENT_DETAILS.put("Ta", "Tantalum\nAtomic Number: 73\nAtomic Mass: 180.95\nTransition Metal");
         ELEMENT_DETAILS.put("W", "Tungsten\nAtomic Number: 74\nAtomic Mass: 183.84\nTransition Metal");
         ELEMENT_DETAILS.put("Re", "Rhenium\nAtomic Number: 75\nAtomic Mass: 186.21\nTransition Metal");
         ELEMENT_DETAILS.put("Os", "Osmium\nAtomic Number: 76\nAtomic Mass: 190.23\nTransition Metal");
         ELEMENT_DETAILS.put("Ir", "Iridium\nAtomic Number: 77\nAtomic Mass: 192.22\nTransition Metal");
         ELEMENT_DETAILS.put("Pt", "Platinum\nAtomic Number: 78\nAtomic Mass: 195.08\nTransition Metal");
         ELEMENT_DETAILS.put("Au", "Gold\nAtomic Number: 79\nAtomic Mass: 196.97\nTransition Metal");
         ELEMENT_DETAILS.put("Hg", "Mercury\nAtomic Number: 80\nAtomic Mass: 200.59\nTransition Metal");
         ELEMENT_DETAILS.put("Tl", "Thallium\nAtomic Number: 81\nAtomic Mass: 204.38\nPost-transition Metal");
         ELEMENT_DETAILS.put("Pb", "Lead\nAtomic Number: 82\nAtomic Mass: 207.2\nPost-transition Metal");
         ELEMENT_DETAILS.put("Bi", "Bismuth\nAtomic Number: 83\nAtomic Mass: 208.98\nPost-transition Metal");
         ELEMENT_DETAILS.put("Po", "Polonium\nAtomic Number: 84\nAtomic Mass: [209]\nMetalloid");
         ELEMENT_DETAILS.put("At", "Astatine\nAtomic Number: 85\nAtomic Mass: [210]\nHalogen");
         ELEMENT_DETAILS.put("Rn", "Radon\nAtomic Number: 86\nAtomic Mass: [222]\nNoble Gas");
         ELEMENT_DETAILS.put("Fr", "Francium\nAtomic Number: 87\nAtomic Mass: [223]\nAlkali Metal");
         ELEMENT_DETAILS.put("Ra", "Radium\nAtomic Number: 88\nAtomic Mass: [226]\nAlkaline Earth Metal");
         ELEMENT_DETAILS.put("Ac", "Actinium\nAtomic Number: 89\nAtomic Mass: [227]\nActinide");
         ELEMENT_DETAILS.put("Th", "Thorium\nAtomic Number: 90\nAtomic Mass: 232.04\nActinide");
         ELEMENT_DETAILS.put("Pa", "Protactinium\nAtomic Number: 91\nAtomic Mass: 231.04\nActinide");
         ELEMENT_DETAILS.put("U", "Uranium\nAtomic Number: 92\nAtomic Mass: 238.03\nActinide");
         ELEMENT_DETAILS.put("Np", "Neptunium\nAtomic Number: 93\nAtomic Mass: [237]\nActinide");
         ELEMENT_DETAILS.put("Pu", "Plutonium\nAtomic Number: 94\nAtomic Mass: [244]\nActinide");
         ELEMENT_DETAILS.put("Am", "Americium\nAtomic Number: 95\nAtomic Mass: [243]\nActinide");
         ELEMENT_DETAILS.put("Cm", "Curium\nAtomic Number: 96\nAtomic Mass: [247]\nActinide");
         ELEMENT_DETAILS.put("Bk", "Berkelium\nAtomic Number: 97\nAtomic Mass: [247]\nActinide");
         ELEMENT_DETAILS.put("Cf", "Californium\nAtomic Number: 98\nAtomic Mass: [251]\nActinide");
         ELEMENT_DETAILS.put("Es", "Einsteinium\nAtomic Number: 99\nAtomic Mass: [252]\nActinide");
         ELEMENT_DETAILS.put("Fm", "Fermium\nAtomic Number: 100\nAtomic Mass: [257]\nActinide");
         ELEMENT_DETAILS.put("Md", "Mendelevium\nAtomic Number: 101\nAtomic Mass: [258]\nActinide");
         ELEMENT_DETAILS.put("No", "Nobelium\nAtomic Number: 102\nAtomic Mass: [259]\nActinide");
         ELEMENT_DETAILS.put("Lr", "Lawrencium\nAtomic Number: 103\nAtomic Mass: [262]\nActinide");
         ELEMENT_DETAILS.put("Rf", "Rutherfordium\nAtomic Number: 104\nAtomic Mass: [267]\nTransition Metal");
         ELEMENT_DETAILS.put("Db", "Dubnium\nAtomic Number: 105\nAtomic Mass: [270]\nTransition Metal");
         ELEMENT_DETAILS.put("Sg", "Seaborgium\nAtomic Number: 106\nAtomic Mass: [271]\nTransition Metal");
         ELEMENT_DETAILS.put("Bh", "Bohrium\nAtomic Number: 107\nAtomic Mass: [270]\nTransition Metal");
         ELEMENT_DETAILS.put("Hs", "Hassium\nAtomic Number: 108\nAtomic Mass: [277]\nTransition Metal");
         ELEMENT_DETAILS.put("Mt", "Meitnerium\nAtomic Number: 109\nAtomic Mass: [278]\nTransition Metal");
         ELEMENT_DETAILS.put("Ds", "Darmstadtium\nAtomic Number: 110\nAtomic Mass: [281]\nTransition Metal");
         ELEMENT_DETAILS.put("Rg", "Roentgenium\nAtomic Number: 111\nAtomic Mass: [282]\nTransition Metal");
         ELEMENT_DETAILS.put("Cn", "Copernicium\nAtomic Number: 112\nAtomic Mass: [285]\nTransition Metal");
         ELEMENT_DETAILS.put("Nh", "Nihonium\nAtomic Number: 113\nAtomic Mass: [286]\nPost-transition Metal");
         ELEMENT_DETAILS.put("Fl", "Flerovium\nAtomic Number: 114\nAtomic Mass: [289]\nPost-transition Metal");
         ELEMENT_DETAILS.put("Mc", "Moscovium\nAtomic Number: 115\nAtomic Mass: [290]\nPost-transition Metal");
         ELEMENT_DETAILS.put("Lv", "Livermorium\nAtomic Number: 116\nAtomic Mass: [293]\nPost-transition Metal");
         ELEMENT_DETAILS.put("Ts", "Tennessine\nAtomic Number: 117\nAtomic Mass: [294]\nHalogen");
         ELEMENT_DETAILS.put("Og", "Oganesson\nAtomic Number: 118\nAtomic Mass: [294]\nNoble Gas");
        
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        // Populate the grid with buttons representing elements
        for (int row = 0; row < ELEMENTS.length; row++) {
            for (int col = 0; col < ELEMENTS[row].length; col++) {
                String element = ELEMENTS[row][col];
                if (!element.isEmpty()) {
                    Button button = new Button(element);
                    button.setMinSize(50, 50);
                    button.setOnAction(e -> showElementDetails(element));
                    grid.add(button, col, row);
                }
            }
        }

        Scene scene = new Scene(grid, 900, 600);
        primaryStage.setTitle("Periodic Table");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showElementDetails(String element) {
        String details = ELEMENT_DETAILS.getOrDefault(element, "Details not available.");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Element Details");
        alert.setHeaderText("Details for " + element);
        alert.setContentText(details);
        alert.showAndWait();
    }
}