import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void userVois(ourLaptop laptopUser, LinkedList list) {
		Scanner iScanner = new Scanner(System.in);
		System.out.println("Фильтр:\n1. Оперативная память\n2. Объем жесткого диска\n3. Установленная ОС\n4. цвет\nВведите номер пункта для выбора. Для выхода из фильтра нажмите 0: ");
		int userChoise = iScanner.nextInt();
		switch (userChoise) {
			case 1:
				Scanner iScanner1 = new Scanner(System.in);
				System.out.println("Введите желаемое количество Оперативной памяти (число): ");
				int userRum = iScanner1.nextInt();
				laptopUser.ram = userRum;
				list.set(1, true);
				userVois(laptopUser, list);
				break;
			case 2:
				Scanner iScanner2 = new Scanner(System.in);
				System.out.println("Введите желаемый объем жесткого диска (число): ");
				int userHdd = iScanner2.nextInt();
				laptopUser.hdd = userHdd;
				list.set(2, true);
				userVois(laptopUser, list);
				break;
			case 3:
				Scanner iScanner3 = new Scanner(System.in);
				System.out.println("Введите желаемую операционную систему: ");
				String userOSystem = iScanner3.nextLine();
				laptopUser.oSystem = userOSystem;
				list.set(3, true);
				userVois(laptopUser, list);
				break;
			case 4:
				Scanner iScanner4 = new Scanner(System.in);
				System.out.println("Введите желаемый цвет ноутбука: ");
				String userColore = iScanner4.nextLine();
				laptopUser.colour = userColore;
				list.set(0, true);
				userVois(laptopUser, list);
				break;
			default:
				break;
		}
		iScanner.close();
	}

	private static boolean sortByRam(ourLaptop param, ourLaptop param2) {
		if (param.ram >= param2.ram) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean sortByHdd(ourLaptop param, ourLaptop param2) {
		if (param.hdd >= param2.hdd) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean sortByColore(ourLaptop param, ourLaptop param2) {
		if ((param.colour).equals(param2.colour)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean sortByOsystem(ourLaptop param, ourLaptop param2) {
		if ((param.oSystem).equals(param2.oSystem)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		Set<ourLaptop> set = new HashSet<>();

		ourLaptop notebook1 = new ourLaptop("ASD098FD39048", "GameKiller", "black", 16, 256, "Linux", "Core i3");
		ourLaptop notebook2 = new ourLaptop("FGHD098FD3943", "Banan", "black", 16, 512, "Windows", "Core i");
		ourLaptop notebook3 = new ourLaptop("QGHD098567948", "Turbo", "pink", 64, 512, "Linux", "Core i7");
		ourLaptop notebook4 = new ourLaptop("VDFHD05667991", "Turbo", "black", 64, 512, "Linux", "Core i7");
		ourLaptop notebook5 = new ourLaptop("12HD09FG67948", "GMV500", "pink", 32, 256, "Windows", "Core i5");
		ourLaptop notebook6 = new ourLaptop("BMFGW85679041", "GMV500", "pink", 32, 256, "Windows", "Core i5");
		ourLaptop notebook7 = new ourLaptop("QGHD098567945", "GMV500", "black", 32, 256, "Linux", "Core i3");
		ourLaptop notebook8 = new ourLaptop("JKLD011567444", "GMV500", "black", 32, 256, "Linux", "Core i5");
		ourLaptop notebook9 = new ourLaptop("JKLD011534548", "GameKiller", "black", 32, 256, "Linux", "Core i3");
		ourLaptop notebook10 = new ourLaptop("TKLD018657440", "GMV500", "black", 2, 124, "Linux", "Core i5");
		ourLaptop notebook11 = new ourLaptop("HG56711567444", "GMV400", "green", 32, 256, "Windows", "Core i5");
		ourLaptop notebook12 = new ourLaptop("BNV0115645454", "GMV100", "white", 128, 512, "Linux", "Core i7");
		ourLaptop notebook13 = new ourLaptop("PO849934JH993", "GameKiller", "black", 16, 256, "Windows", "Core i5");

		set.add(notebook1);
		set.add(notebook2);
		set.add(notebook3);
		set.add(notebook4);
		set.add(notebook5);
		set.add(notebook6);
		set.add(notebook7);
		set.add(notebook8);
		set.add(notebook9);
		set.add(notebook10);
		set.add(notebook11);
		set.add(notebook12);
		set.add(notebook13);


		ourLaptop laptopUserchoise = new ourLaptop("default", "default", "default", 0, 0, "default", "default");
		LinkedList<Boolean> list = new LinkedList<>();
		list.add(false);
		list.add(false);
		list.add(false);
		list.add(false);
		userVois((ourLaptop) laptopUserchoise, list);
		Set<ourLaptop> setResult = new HashSet<>();

		Iterator<ourLaptop> iterator = set.iterator();
		while (iterator.hasNext()) {
			ourLaptop element = iterator.next();
			if (list.get(0) && list.get(1) && list.get(2) && list.get(3)) {
				if (element.equalityHdd(laptopUserchoise) && element.equalityRam(laptopUserchoise) && element.equalsColore(laptopUserchoise) && element.equalsOS(laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(1) && list.get(0) && list.get(2) && !(list.get(3))) {
				if (element.equalityRam(laptopUserchoise) && element.equalsColore(laptopUserchoise) && element.equalityHdd(laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(3) && list.get(0) && list.get(2) && !(list.get(1))) {
				if (element.equalityHdd(laptopUserchoise) && element.equalsColore(laptopUserchoise) && element.equalsOS(laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(3) && list.get(1) && list.get(2) && !(list.get(0))) {
				if (element.equalityRam(laptopUserchoise) && element.equalsOS(laptopUserchoise) && element.equalityHdd(laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(0) && list.get(1) && !(list.get(3)) && !(list.get(2))) {
				if (sortByRam(element, laptopUserchoise) && sortByColore(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(0) && list.get(2) && !(list.get(1)) && !(list.get(3))) {
				if (sortByColore(element, laptopUserchoise) && sortByHdd(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(2) && list.get(1) && !(list.get(0)) && !(list.get(3))) {
				if (sortByRam(element, laptopUserchoise) && sortByHdd(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(0) && list.get(3) && !(list.get(1)) && !(list.get(2))) {
				if (sortByColore(element, laptopUserchoise) && sortByOsystem(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(3) && list.get(1) && !(list.get(0)) && !(list.get(2))) {
				if (sortByRam(element, laptopUserchoise) && sortByOsystem(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(2) && list.get(3) && !(list.get(1)) && !(list.get(0))) {
				if (sortByHdd(element, laptopUserchoise) && sortByOsystem(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(0) && !(list.get(1)) && !(list.get(2)) && !(list.get(3))) {
				if (sortByColore(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(1) && !(list.get(0)) && !(list.get(2)) && !(list.get(3))) {
				if (sortByRam(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(2) && !(list.get(1)) && !(list.get(0)) && !(list.get(3))) {
				if (sortByHdd(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else if (list.get(3) && !(list.get(1)) && !(list.get(2)) && !(list.get(0))) {
				if (sortByOsystem(element, laptopUserchoise)) {
					setResult.add(element);
				}
			} else {
				break;
			}
		}
		int count = 1;
		if (setResult.isEmpty()) {
			System.out.println("Ноутбуки в наличии: ");
			for (ourLaptop e : set) {
				System.out.println(count + ". " + e);
				count += 1;
			}
		} else {
			System.out.println("По вашему запросу найдены ноутбуки в наличии: ");
			for (ourLaptop e : setResult) {
				System.out.println(count + ". " + e);
				count += 1;
			}
		}
	}
}

