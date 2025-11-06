package atv8;

public class Clowns extends Picasso {

    public static void main(String[] args) {

        // Declara e inicializa o array de interface
        i[] i = new i[3];
        
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76(); // A classe da "pegadinha"

        for (int x = 0; x < 3; x++) {
            System.out.println(
                i[x].iMethod0() + " " + i[x].getClass()
            );
        }
    }
}