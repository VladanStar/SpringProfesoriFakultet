import java.util.List;

public class Profesor {
	private String ime;
	private String jmbg;
	private List<String> listaPredmeta;
	
	public Profesor() {
		super();
	}

	public Profesor(String ime, String jmbg, List<String> listaPredmeta) {
		super();
		this.ime = ime;
		this.jmbg = jmbg;
		this.listaPredmeta = listaPredmeta;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Profesor " + ime + " (jmbg: " + jmbg + ") predaje sledece predmete : \n");
		for(String predmet : listaPredmeta) {
			sb.append(predmet);
			sb.append("\n");
		}
		return sb.toString();
	}
	public void onCreate() {
		System.out.println("Profesor " + this.ime+" je poceo da predaje.");
	}
	public void onDestroy() {
		System.out.println("Profesor " + this.ime + " je zavrsio predavanje");
	}
	
	

}
