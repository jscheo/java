package ex07;

import java.util.Scanner;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = new ProductDAOImpl();
		SaleDAO sdao = new SaleDAO();
		Scanner s=new Scanner(System.in);
		DecimalFormat df =new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean run=true;
		while(run) {
			System.out.println("\n\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("6.상품별 매출 조회 7.매출등록 8.매출현황");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu=s.nextLine();

			switch(menu) {
			// 종료
			case "0":
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1":
				ProductVO pro = new ProductVO();
				System.out.print("상품이름> ");
				pro.setPname(s.nextLine());
				pro.setPprice(input("상품가격"));
				//				pro.setPprice(Integer.parseInt(s.nextLine()));
				try {
					dao.insert(pro);
					System.out.println("상품이 등록되었습니다.");
				} catch (Exception e) {
					System.out.println("상품등록 오류");
				}
				break;
			case "2":
				while(true) {
					System.out.print("상품코드>");
					String pcode = s.nextLine();
					if(pcode == "")break;
					try {
						ProductVO vo = dao.read(Integer.parseInt(pcode));
						if(vo.getPname()== null) {
							System.out.println("상품이 존재하지 않습니다.");
						}else {
							System.out.println("상품이름:" + vo.getPname());
							System.out.println("상품가격:" + df.format(vo.getPprice()));
						}
					} catch (Exception e) {
						System.out.println("상품 조회 오류입니다.");
					}

				}

				break;
			case "3":
				try {
					for(ProductVO vo : dao.list()) {//포멧으로 변경하면 String 으로 받는다.
						System.out.printf("%d\t%-20s\t%s\n", vo.getPcode(),vo.getPname(),df.format(vo.getPprice()));
					}
					System.out.println(dao.list().size() + "개 상품이 등록되었습니다.");
				}catch(Exception e) {
					System.out.println("목록출력 오류입니다.");
				}
				break;
			case "4":
				System.out.print("수정할 상품코드> ");
				String pcode = s.nextLine();
				if(pcode == "") break;
				try {
					ProductVO pro3 = dao.read(Integer.parseInt(pcode));
					if(pro3.getPname()==null) {
						System.out.println("수정할 상품이 존재하지 않습나다.");
					}else {
						System.out.println("상품이름:" + pro3.getPname());
						System.out.println("새로운상품이름> ");
						String pname = s.nextLine();
						if(pname != "") pro3.setPname(pname);

						System.out.println("상품가격:" + (pro3.getPprice()));
						int price =input("새로운상품가격");
						if(price != 0) pro3.setPprice(price);
						System.out.print("수정하실래요(y)?");
						String sel = s.nextLine();
						if(sel.equals("Y") || sel.equals("y")|| sel.equals("ㅛ")){
							dao.update(pro3);
							System.out.println("상품수정완료!");
						}	
					}
				}catch (Exception e) {
					System.out.println("상품정보수정실패");
				}
				break;
			case "5":
				System.out.print("삭제할 상품코드> ");
				pcode = s.nextLine();
				try {
					ProductVO pro2= dao.read(Integer.parseInt(pcode));
					if(pro2.getPname()==null) {
						System.out.println("삭제할 상품이 존재하지 않습니다.");
					}else {
						System.out.println("상품이름:" + pro2.getPname());
						System.out.println("상품가격:" + df.format(pro2.getPprice()));
						System.out.print("삭제하실래요(y)?");
						String sel = s.nextLine();
						if(sel.equals("Y") || sel.equals("y")|| sel.equals("ㅛ")){
							dao.delete(Integer.parseInt(pcode));
							System.out.println("상품삭제완료!");
						}
					}
				}catch (Exception e) {
					System.out.println("상품삭제 오류");
				}
				break;
			case "6":
				int code = input("조회할상품코드> ");
				if(code == 0) {
					System.out.println("조회를 종료합니다.");
					break;
				}else {
					try {
						ProductVO pro4=dao.read(code);
						if(pro4.getPname()==null) {
							System.out.println("조회할 상품이 없습니다.");
						}else {
							System.out.println("상품이름:" + pro4.getPname());
							System.out.println("상품가격:" + df.format(pro4.getPprice()));
							System.out.println("------------------------------------------------------------------------");
							System.out.println("상품코드\t판매수량\t판매금액\t\t판매총액\t\t판매날짜");
							for(SaleVO vo : sdao.list(code)) {
								System.out.printf("%d\t%d\t%s\t%s\t%s\n",
										vo.getScode(),vo.getQnt(),df.format(vo.getSprice()),df.format(vo.getQnt()*vo.getSprice()),sdf.format(vo.getSdate()));
							}
						}
					} catch (Exception e) {
						System.out.println("상품별 판매목록");
					}
				}
				break;
			case "7":
				code =input("등록할상품코드 ");
				if(code== 0)break;
				try {
					ProductVO pro4=dao.read(code);
					if(pro4.getPname()==null) {
						System.out.println("등록할 상품이 존재하지 않습니다.");
					}else {
						System.out.println("상품이름:" + pro4.getPname());
						System.out.println("상품가격:" + df.format(pro4.getPprice()));
						int qnt = input("상품수량");
						SaleVO svo = new SaleVO();
						svo.setPcode(code);
						svo.setQnt(qnt);
						int sprice=input("판매가격");
						if(sprice == 0) svo.setSprice(pro4.getPprice());
						else svo.setSprice(sprice);
						sdao.insert(svo);
						System.out.println("판매등록 완료");
					}	
				} catch (Exception e) {
					System.out.println("매출등록:" + e.toString());
				}
				break;
			case "8":
				int sum_price = 0;
				int sum_qnt = 0;
				for(SaleVO vo:sdao.sum_list()) {
					System.out.printf("%d\t%-20s\t%d\t%s\n", vo.getPcode(),vo.getPname(),vo.getQnt(),df.format(vo.getSprice()));
					sum_price += vo.getPprice();
					sum_qnt += vo.getQnt();
				}
				System.out.println("---------------------------------------------");
				System.out.printf("총판매수:%d\t총판매금액:%s\n",
						sum_qnt, df.format(sum_price));
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}//switch			
		}//while
	}//main
	//가격입력 메소드
	public static int input(String title) {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println(title + ">");
			try {
				String str = s.nextLine();
				if(str == "") {
					return 0;
				}else {
					return Integer.parseInt(str);
				}

			}catch(Exception e) {
				System.out.println("숫자로 입력하세요");
			}
		}
	}
}//Mail
