package web;
import java.util.ArrayList;
import java.util.List;
import metier.Equipe;
public class EquipeModele {
private String motCle;
List<Equipe> e = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Equipe> getProduits() {
return e;
}
public void setEquipes(List<Equipe> equipes) {
this.e = equipes;
}
}
