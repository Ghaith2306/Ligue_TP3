package metier;
	import java.io.Serializable;
import java.sql.Date;
	public class Equipe implements Serializable{
	private Long id_Equipe;
	private String nom_Equipe;
	private int classement;
	
	
	public Equipe() {
		super();
	}

	public Equipe(Long id_Equipe, String nom_Equipe, int classement, Date date_match, String ligue) {
		super();
		this.id_Equipe = id_Equipe;
		this.nom_Equipe = nom_Equipe;
		this.classement = classement;
		
	}

	public Long getId_Equipe() {
		return id_Equipe;
	}

	public void setId_Equipe(Long id_Equipe) {
		this.id_Equipe = id_Equipe;
	}

	public String getNom_Equipe() {
		return nom_Equipe;
	}

	public void setNom_Equipe(String nom_Equipe) {
		this.nom_Equipe = nom_Equipe;
	}

	public int getClassement() {
		return classement;
	}

	public void setClassement(int classement) {
		this.classement = classement;
	}

	}

