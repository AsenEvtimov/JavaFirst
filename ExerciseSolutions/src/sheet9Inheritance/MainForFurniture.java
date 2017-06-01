package sheet9Inheritance;

public class MainForFurniture {
	
	public static void main (String[] args){

		Table t1 = new Table("Black","Wood", "Round", Table.Expandable.EXPANDABLE);
		System.out.println(t1);
		
		/*Table t2 = new Table();
		t2.setColor("Red");
		t2.setExpandable(Expandable.NOT_EXPANDABLE);
		System.out.println(t2);*/
		
		Bed b1 = new Bed("Red", "Wood", "King", Bed.NO_HEADBOARD);
		System.out.println(b1);
		
		Chair c1 = new Chair("Black", "Metal", "Office", Chair.NO_GASLIFT);
		System.out.println(c1);
	}
}
