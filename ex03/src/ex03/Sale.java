package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sale {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		// 샘플데이터
		List<SaleVO> array = new ArrayList<>();
		SaleVO sale = new SaleVO(101, "냉장고", 250, 10);
		array.add(sale);
		sale = new SaleVO(102, "세탁기", 220, 5);
		array.add(sale);
		sale = new SaleVO(103, "건조기", 230, 5);
		array.add(sale);
		int last = 103;
		
		boolean run = true;
		
		while(run) {
			System.out.println("\n===== 매출관리 =====");
			System.out.println("-------------------------------------");
			System.out.println("1.입력 2.조회 3.목록 4.수정 5.삭제 0.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "0" :
				run = false;
				System.out.println("프로그램 종료");
				break;
			case "1" :
				sale=new SaleVO();
				sale.setCode(++last);
				System.out.println("상품코드>" + sale.getCode());
				System.out.println("상품이름> ");
				sale.setName(sc.nextLine());
				System.out.println("상품가격> ");
				sale.setPrice(Integer.parseInt(sc.nextLine()));// string 값을 정수로 출력할때 사용하는 문법
				System.out.println("재고수량> ");
				sale.setQnt(Integer.parseInt(sc.nextLine()));// 열을 해석핼때에는 오른쪽에서 부터 봐라 
				array.add(sale);
				
				break;
			case "2" :
				System.out.println("조회번호> ");
				String search=sc.nextLine();// nextline으로 받으면 문자열로 들어간다.
				boolean find = false;
				for(SaleVO vo : array) {
					if(Integer.parseInt(search) == vo.getCode()) {
						System.out.println("상품이름"+vo.getName());
						System.out.println("상품가격"+vo.getPrice());
						System.out.println("재고수량"+vo.getQnt());
						vo.setSum(vo.getPrice()*vo.getQnt());
						System.out.println("상품금액"+vo.getSum());
						find = true;
						
					}
				}
				if(!find)System.out.println(search+"번 상품이 없습니다.");
				break;
			case "3" :
				for(SaleVO vo:array) {
					vo.setSum(vo.getPrice()*vo.getQnt());
					vo.print_land();
				}
				break;
			case "4" :
				System.out.println("수정번호> ");
				String update = sc.nextLine();
				for(SaleVO vo : array) {
					if(Integer.parseInt(update) ==(vo.getCode())) {
						System.out.print("상품이름:"+vo.getName()+ ">");
						String newName=sc.nextLine();
						if(newName !="") vo.setName(newName);
						System.out.print("상품가격: "+ vo.getPrice()+">");
						String newPrice = sc.nextLine();
						if(newPrice !="") vo.setPrice(Integer.parseInt(newPrice));
						System.out.print("재고수량: "+ vo.getQnt()+">");
						String newQnt = sc.nextLine();
						if(newQnt !="") vo.setPrice(Integer.parseInt(newQnt));
						System.out.println("수정완료");
					}
				}
				break;
			case "5" :
				System.out.print("삭제번호>");
				String delete = sc.nextLine();
				
				for(SaleVO vo : array) {
					if(Integer.parseInt(delete)==vo.getCode()) {
						array.remove(vo);
						System.out.println("삭제완료");
						break;
					}
				}
				break;
			}//switch
		}//while
	}//run
}//class
















