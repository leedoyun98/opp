package day04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		

		System.out.println("간단한 계산기");
		System.out.println("숫자 1 입력");
		int nu1 = scanner.nextInt();
		cal.setNumber1(nu1);
		System.out.println("+, -, * ,/ 골라주세요");
		scanner.nextLine();
		String n2 = scanner.nextLine();
		cal.setOperator(n2);
		System.out.println("숫자 2 입력");
		int nu2 = scanner.nextInt();
		cal.setNumber2(nu2);
	
	       if(cal.getOperator().equals("+") ) {
		System.out.println(cal.getNumber1()+"+"+cal.getNumber2()+"= "+add(cal.getNumber1(),cal.getNumber2()));
		main(args);
		}else if(cal.getOperator().equals("-")) {
			System.out.println(cal.getNumber1()+"-"+cal.getNumber2()+"= "+s(cal.getNumber1(),cal.getNumber2()));
			main(args);
		}else if(cal.getOperator().equals("*")) {
			System.out.println(cal.getNumber1()+"*"+cal.getNumber2()+"= "+c(cal.getNumber1(),cal.getNumber2()));
			main(args);
		}
			else if(cal.getOperator().equals("/")) {
				System.out.println(cal.getNumber1()+"/"+cal.getNumber2()+"= "+d(cal.getNumber1(),cal.getNumber2()));
				System.out.println("나머지: "+f(cal.getNumber1(),cal.getNumber2()));
				main(args);
						
			}
			
			
		
		scanner.close();
	}
	
	
		static int  add(int a, int b) {	
				int r = a+b;
			return r;
	
		}
		static int s(int a, int b) {
			int r = a-b;
			return r;
		}
		static int c(int a, int b) {
			int r = a*b;
			return r;
		}
		static int d(int a, int b) {
			int r = a/b;
			return r;
		}
		static int f(int a, int b) {
			int r = a%b;
			return r;
		}
	
	}


