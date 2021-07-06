package application;



import javafx.beans.property.StringProperty;

public class CarManagerData {
	private StringProperty OutDate;
	private StringProperty Carnum;
	private StringProperty intime;
	private StringProperty Outtime;
	private StringProperty Price;
	
	public CarManagerData(StringProperty OutDate, StringProperty Carnum, StringProperty intime,
			StringProperty Outtime, StringProperty Price) {
		
		this.OutDate = OutDate;
		this.Carnum = Carnum;
		this.intime = intime;
		this.Outtime = Outtime;
		this.Price = Price;
	
	}
	
	 	public StringProperty OutDateProperty() {
	        return OutDate;
	    }
	    public StringProperty CarnumProperty() {
	        return Carnum;
	    }
	    public StringProperty intimeProperty() {
	        return intime;
	    }
	    public StringProperty OuttimeProperty() {
	        return Outtime;
	    }
	    public StringProperty PriceProperty() {
	        return Price;
	    }


	
	
}
