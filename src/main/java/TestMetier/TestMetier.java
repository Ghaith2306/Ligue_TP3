package TestMetier;
import java.util.List;

import metier.Equipe;
import metier.MetierImpl;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Equipe> prods = metier.getEquipesParMotCle("REAL");
for (Equipe p : prods)
System.out.println(p.getNom_Equipe());
}
}