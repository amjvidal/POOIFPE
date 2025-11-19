package atv10;

public class Try {
    try {
} catch (BoinkEx bo) {
    System.out.println("Catch: BoinkEx");
} catch (BarEx ba) {
    System.out.println("Catch: BarEx");
} catch (BiffEx bi) {
    System.out.println("Catch: BiffEx");
} catch (FooEx o) {
    System.out.println("Catch: FooEx");
} catch (BazEx z) {
    System.out.println("Catch: BazEx");
}

try {
} catch (BiffEx bi) {
    //aqui o BiffEX pega o erro de BoinkEx tambem pois ela é super classe
    System.out.println("Catch: BiffEx ou BoinkEx");
} catch (FooEx f) {
    //o mesmo acontece aqui com FooEx, mas sem pegar a exception de BiffEx ou BoinkEx por que ja foram capturadas no metodo de cima
    System.out.println("Catch: FooEx ou BarEx");
} catch (BazEx z) {
    //aqui pega a exception q sobrar
    System.out.println("Catch: BazEx");
}
}
