package bank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Students {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		List<String> studentNames = Arrays.asList("Robert Jordan", "J.K. Rowling", "Piers Anthony","Jim Butcher","James Corey","Pierce Brown","Drew Hayes","Scott Lynch","Travis Bagwell","Rick Scott");
		List<String> addresses = Arrays.asList("234 Pumpkin St","919 Crench Way","123 Finch Road","999 Trench Cir.","8543 Agent Way","4455 Green Rd.","717 Jet Ct.","545 River Rd.","9091 University Blvd.","777 Seven St.");
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int roll = rand.nextInt(100);
			String name = studentNames.get(i);
			String address = addresses.get(i);
			students.add(new Student(roll, name, address));
		}
	mergeSort(students, 0, students.size()-1);
	
		for(int i=0; i<students.size(); i++){
			System.out.println(students.get(i));
		}

	}

		public static void merge(ArrayList<Student> students, int l, int m, int r) {
		
		int n1 = m - l + 1;
		
		int n2 = r - m;
		
		Student L[] = new Student[n1];
		
		Student R[] = new Student[n2];
		
		for (int i = 0; i < n1; ++i)
		
			L[i] = students.get(l + i);
		
		for (int j = 0; j < n2; ++j)
		
			R[j] = students.get(m + 1 + j);
		
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j])<0) {
				students.set(k, L[i]);
				i++;
			} else {
				students.set(k, R[j]);
				j++;
			}
			k++;
		}
		while (i < n1) {
			students.set(k, L[i]);
			i++;
			k++;
		}
		
		while (j < n2) {
			students.set(k, R[j]);
			j++;
			k++;
		}
	}
	
	public static void mergeSort(ArrayList<Student> students, int l, int r) {
	
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(students, l, m);
			mergeSort(students, m + 1, r);
			merge(students, l, m, r);
		
		}
	
	}

}
