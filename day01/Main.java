package day01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	Naming name = new Naming();
	Operator number = new Operator();
	
	System.out.println("이름을 입력해주세요");
	String na = scanner.next();
	name.setName(na);
	System.out.println("이름: "+name.getName());
	
	System.out.println("더하고 싶은 숫자 number1를 입력해주세요");
	int n1 = scanner.nextInt();
	number.setMyNumber(n1);
	System.out.println("더하고 싶은 숫자 number2를 입력해주세요");
	int n2 = scanner.nextInt();
	number.setMyNumber2(n2);
	System.out.println("number1 + number2: "+(number.getMyNumber1()+number.getMyNumber2()));
	
	System.out.println("빼고 싶은 숫자 number1를 입력해주세요");
	int n7 = scanner.nextInt();
	number.setMyNumber(n7);
	System.out.println("빼고 싶은 숫자 number2를 입력해주세요");
	int n8 = scanner.nextInt();
	number.setMyNumber2(n8);
	System.out.println("number1 - number2: "+(number.getMyNumber1()-number.getMyNumber2()));
	
	System.out.println("곱하고 싶은 숫자 number1를 입력해주세요");
	int n3 = scanner.nextInt();
	number.setMyNumber(n3);
	System.out.println("곱하고 싶은 숫자 number2를 입력해주세요");
	int n4 = scanner.nextInt();
	number.setMyNumber2(n4);
	System.out.println("number1 * number2: "+(number.getMyNumber1()*number.getMyNumber2()));
	
	System.out.println("나누고 싶은 숫자 number1를 입력해주세요");
	int n5 = scanner.nextInt();
	number.setMyNumber(n5);
	System.out.println("나누고 싶은 숫자 number2를 입력해주세요");
	int n6 = scanner.nextInt();
	number.setMyNumber2(n6);
	System.out.println("number1 / number2(몫): "+(number.getMyNumber1()/number.getMyNumber2()));
	System.out.println("myNumber1 % myNumber2(나머지): "+(number.getMyNumber1()%number.getMyNumber2()));
	

	
	}
}
