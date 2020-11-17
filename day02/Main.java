package day02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BMI bmi = new BMI();
		GradeBook book = new GradeBook();
		
		System.out.print("몸무게: ");
		double w = scanner.nextDouble();
		bmi.setWeight(w);
		
		System.out.print("키: ");
		double h = scanner.nextDouble();
		bmi.setHeight(h);
		double b = bmi.getWeight() /Math.pow(bmi.getHeight(), 2)*10000;
		System.out.printf("당신의 bmi는 %.2f입니다",b);
		
		
		System.out.println();
		System.out.println("번호를 입력하세요");
		int id = scanner.nextInt();
		book.setId(id);
		

		System.out.println("이름을 입력하세요");
		scanner.nextLine();
		String name = scanner.nextLine();
		book.setName(name);
		System.out.println("국어 성적을 입력하세요");
		int korean = scanner.nextInt();
		book.setKorean(korean);
		System.out.println("영어 성적을 입력하세요");
		int english = scanner.nextInt();
		book.setEnglish(english);
		System.out.println("수학 성적을 입력하세요");
		int math = scanner.nextInt();
		book.setMath(math);
		
		int sum = book.getKorean() + book.getEnglish() + book.getMath();
		double average = sum / 3.0;
		
		System.out.printf("번호: %d번 이름: %s\n",book.getId(),book.getName());
		System.out.printf("국어 점수: %03d점 영어 점수: %03d점 수학 점수: %03d점\n",book.getKorean()
				,book.getEnglish(),book.getMath());
		System.out.printf("총점: %03d점 평균: %.2f점\n",sum,average);
		
	}

}
