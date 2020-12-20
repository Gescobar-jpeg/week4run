import java.util.*;

public class assingment4 {

	public static void main(String[] args) {
		
		//Step 1
		
		List<String> employeeNames = new ArrayList<String>();
		
		
		//Step2
		
		Set<Integer> ids = new HashSet<Integer>();
		
		
		//Step3
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		
		
		//Step4
		
		employeeNames.add("Julian");
		employeeNames.add("Nick");
		employeeNames.add("Fabrizzio");
		employeeNames.add("Albert");
		employeeNames.add("Nikolai");
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		
		//Step5
		
		for (Integer id : ids) {
			employeeMap.put(1, "Julian");
			i ++;
		}
		
		//Step6
		
		for (Integer key : employeeMap.keySet()) {
		}
		
		employeeMap.put(2, "Julian");
		employeeMap.put(3, "Nick");
		employeeMap.put(4, "Fabrizzio");
		employeeMap.put(5, "Albert");
		employeeMap.put(6, "Nikolai");
		
		
		//Step7
		
		StringBuilder idsBuilder = new StringBuilder("-");
		
		
		//Step8
		
		idsBuilder.append(1);
		idsBuilder.append(2);
		idsBuilder.append(3);
		idsBuilder.append(4);
		idsBuilder.append(5);
		
		
		
		// Step9
		
		System.out.println(idsBuilder.toString());
		
		
		// Step10
		
		StringBuilder namesBuilder = new StringBuilder(" ");
		
		
		//Step 11
		
		namesBuilder.append(employeeNames);
		
		// Step12
		
		System.out.println(namesBuilder.toString());
		
		
	}

}
