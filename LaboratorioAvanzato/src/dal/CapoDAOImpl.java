package dal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.CapoAbbigliamento;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class CapoDAOImpl implements CapoDAO {
	Map<Integer,CapoAbbigliamento> inventario = new HashMap<>();
	
	{
		String[] capi = {
				"Maglia marlene",
				"Pantalone body",
				"Maglia lady",
				"Pantalone skinny"
		};
		
		for (String capo : capi) {
			if(capo.startsWith("Maglia")) {
				Maglia m1 = new Maglia(capo, Taglia.S);
				Maglia m2 = new Maglia(capo, Taglia.M);
				Maglia m3 = new Maglia(capo, Taglia.L);
				inventario.put(m1.getCodArt(), m1);
				inventario.put(m2.getCodArt(), m2);
				inventario.put(m3.getCodArt(), m3);
				
			} else if(capo.startsWith("Pantalone")) {
				Pantalone p1 = new Pantalone(capo, Taglia.S);
				Pantalone p2 = new Pantalone(capo, Taglia.M);
				Pantalone p3 = new Pantalone(capo, Taglia.L);
				Pantalone p4 = new Pantalone(capo, Taglia.XL);
				inventario.put(p1.getCodArt(), p1);
				inventario.put(p2.getCodArt(), p2);
				inventario.put(p3.getCodArt(), p3);
				inventario.put(p4.getCodArt(), p4);
			}
			
		}
	}

	@Override
	public void addCapo(CapoAbbigliamento capo) {
		this.inventario.put(capo.getCodArt(), capo);

	}

	@Override
	public CapoAbbigliamento getCapo(int codArt) {
		return this.inventario.get(codArt);
	}

	@Override
	public List<CapoAbbigliamento> getCapi() {
		return inventario.values().stream().toList();
	}

	@Override
	public void updCapo(CapoAbbigliamento capo) {
		// i codArt sono un set, quindi quando faccio put
		// sullo un'articolo gia' presente -> fa l'update
		this.inventario.put(capo.getCodArt(), capo);
	}

	@Override
	public void delCapo(int codArt) {
		this.inventario.remove(codArt);
	}

}
