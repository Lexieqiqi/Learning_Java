package invoice;

public class MainPart extends Invoice {
	public MainPart() {
		this.setDescription("----------------------------------------------------------------------------\nItem\t\t\tUnits\t\tUnite Price\t\tSubtotal\n");
	}
	public double cost() {
		return 0.0;
	}
}
