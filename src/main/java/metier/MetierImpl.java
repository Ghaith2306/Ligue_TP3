package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Equipe> getEquipesParMotCle(String mc) {
 List<Equipe> prods= new ArrayList<Equipe>();
 Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("select * from myligue where NOM_EQUIPE LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Equipe p = new Equipe();
p.setId_Equipe(rs.getLong("ID_Equipe"));
p.setNom_Equipe(rs.getString("NOM_Equipe"));
p.setClassement(rs.getInt("Classement"));

prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addEquipe(Equipe p) {
// TODO Auto-generated method stub
}
}

