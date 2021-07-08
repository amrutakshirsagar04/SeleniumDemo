
public class TubeLight implements Light{

	@Override
	public String giveLight(   ) {
		
		return "TubeLight";
	}
	public static void main(String[] args) {
		TubeLight t =new TubeLight();
		System.out.println(t.giveLight());
	}
	

}
