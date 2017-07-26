package priority;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Integer
		// here we are object of comparator
		Comparator<Employee> compare = new SalaryComparator();
		// here we are creating the priorityqueue object
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(1, new Comparator<Integer>() {

			@Override
			// here we are creating method compare which is return type
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				// here we are applying the condition
				if (o1 > o2) {
					return 1;
				} else if (o1 < o2) {
					return -1;
				}
				return 0;
			}
		});
		// here we are adding integer element in the priorityqueue
		priorityQueue.add(10);
		priorityQueue.add(30);
		priorityQueue.add(5);
		priorityQueue.add(20);
		// here we are initializing the size of priorityqueue
		while (priorityQueue.size() != 0) {
			System.out.println(priorityQueue.remove());
		}

		// 2. Employee
		PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<Employee>(15, new SalaryComparator());
		employeePriorityQueue.add(new Employee("Rani", "Lead Developer", 50000));
		employeePriorityQueue.add(new Employee("Arshi", "Assistant Manager", 21000));
		employeePriorityQueue.add(new Employee("Akriti", "Telecaller", 16000));
		employeePriorityQueue.add(new Employee("Akshit", "Lead Developer", 60000));

		while (employeePriorityQueue.size() != 0) {
			System.out.println(employeePriorityQueue.remove());
		}
	}

}
