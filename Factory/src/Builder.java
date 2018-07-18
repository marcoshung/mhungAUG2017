import java.util.*;
public class Builder {
	static ArrayList<Machine> list = new ArrayList<Machine>();
	public static void main(String[] args) {
		boolean done = false;
		Scanner console = new Scanner(System.in);
		while(!done) {
			String input = console.nextLine();
			if(input.toLowerCase().equals("quit")) {
				done = true;
			}else {
				build();
			}
		}
		for(Machine car : list) {
			System.out.println(car.getSerialNum());
		}
	}
	public static void build() {
		Machine model = new Car();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getSerialNum().equals(model.getSerialNum())) { 
				model.setSerialNum();
				i = 0;
			}
		}
		list.add(model);
	}
}
