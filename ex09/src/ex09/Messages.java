package ex09;

import java.util.*;
import java.text.*;

public class Messages {
	public static void run(UserVO uvo) {
		Scanner s = new Scanner(System.in);
		MessageDAO ddao = new MessageDAO();
		UserDAO udao = new UserDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		boolean run = true;
		while(run) {
			System.out.println("\n**메세지관리****");
			System.out.println("---------------------------------------------------");
			System.out.println("1.받은메세지 2.보낸메세지 3.메세지전송 4.메세지삭제 0.메인메뉴");
			System.out.println("---------------------------------------------------");
			uvo=udao.read(uvo.getId());// 업데이트하고 다시불러왔으니 증가된 상태로 보여진다.
			System.out.printf("이름:%s\t 포인트:%d\n",uvo.getUname(), uvo.getPoint());
			System.out.print("메뉴선택> ");
			String menu =s.nextLine();

			switch(menu) {
			case "0":
				System.out.println("메인으로 돌아갑니다.");
				run = false;
				break;
			case "1":
				for(MessageVO vo : ddao.sendList(uvo.getId())) {
					System.out.printf("%d\t%s(%s)\t%s\t%s\n",
							vo.getMid(),vo.getSender(),vo.getUname(),sdf.format(vo.getSdate()),vo.getMessage());
					System.out.println("----------------------------------------");
				}
				while(true) {
					System.out.println("삭제할 받은 메세지 번호> ");
					String mid = s.nextLine();
					if(mid=="")break;
					System.out.print("삭제하실래요?(y)");
					String sel = s.nextLine();
					if(sel.equals("Y") || sel.equals("y")|| sel.equals("ㅛ")) {
						ddao.receiveDel(Integer.parseInt(mid));
						System.out.println("받은메세지 삭제완료");
						break;
					}
				}
				break;
			case"2":
				for(MessageVO vo : ddao.receiveList(uvo.getId())) {
					System.out.printf("%d\t%s(%s)\t%s\t%s\n",
							vo.getMid(),vo.getReceiver(),vo.getUname(),sdf.format(vo.getSdate()),vo.getMessage());
					System.out.println("--------------------------------------------");
				}
				while(true) {
					System.out.println("삭제할 보낸 메세지 번호> ");
					String mid = s.nextLine();
					if(mid=="")break;
					System.out.print("삭제하실래요?(y)");
					String sel = s.nextLine();
					if(sel.equals("Y") || sel.equals("y")|| sel.equals("ㅛ")) {
						ddao.sendDel(Integer.parseInt(mid));
						System.out.println("보낸메세지 삭제완료");
						break;
					}
				}
				break;
			case"3":
				while(true) {
					System.out.println("받을 ID> ");
					String receiver=s.nextLine();
					if(receiver =="") {
						System.out.println("메세지 전송취소");
						break;
					}else {
						UserVO vo = udao.read(receiver);
						if(vo.getUname()==null) {
							System.out.println("아이디를 다시 입력해주세요");
						}else {
							MessageVO mvo = new MessageVO();
							mvo.setSender(uvo.getId());
							mvo.setReceiver(receiver);
							System.out.println("보낼 메세지>");
							String message =s.nextLine();
							if(message=="") {
								System.out.println("전송취소");
							}else {
								mvo.setMessage(message);
								ddao.insert(mvo);
								udao.updatePoint(uvo.getId());
								System.out.println("전송완료");
							}
							break;
						}
					}
				}
				break;
			case"4":
				break;
			default:
				System.out.println("메뉴를 선택하세요");
			}
		}
	}
}
