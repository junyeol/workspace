package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
// java.xxx.Xxxxx
// org.xxx.Xxxxx
// 회사명.xxx.Xxxxx >> 외부 라이브러리
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 웹 크롤링 : 웹 데이터 모아서 정제 및 가공
// 정적 크롤링 => 웹 페이지에만 접근
//              페이지에 직접 작성된 데이터만 접근가능
//              "페이지 소스 코드 보기"로 보이는 데이터만 가져오는것
//              ex) jsoup <<
// 동적 크롤링 => 웹 페이지가 참조하는 데이터까지 접근가능
//              본 서버의 데이터를 암호화했다면 접근불가능
//              ex) 셀레니움 << 웹 포트폴리오 작업할때 사용해보세요!~~

// 오피지지 웹 사이트는
// 페이지 골격코드만 만듦
// 실시간으로 데이터를 본 서버에서 받아오는 구조
//  => 동적 크롤링을 사용해야함

// 웹 크롤링
public class Test01 {
	public static void main(String[] args) {

		String url="https://etce.kr/product/list.html?cate_no=190";
		// 웹 페이지에서 "index"란, 표지 페이지(첫 페이지)를 의미함
		
		Connection conn = Jsoup.connect(url);
		// Jsoup으로 url 연결시도
		// 연결객체가 반환됨
		
		// Jsoup은 JAVA의 기본 패키지가 아니다.
		//                   라이브러리 == 소스코드모음집
		// Jsoup 라이브러리를 별도로 설치해야함
		//  .jar JAVA아카이브==JAVA압축파일==소스코드모음집==라이브러리==패키지
		
		try {
			Document doc = conn.get();
			
			Elements elems= doc.select("a.name");
			
			for(Element elem:elems) {
				System.out.println(elem.text());
			}
		} catch (IOException e) {
			System.out.println("연결중 에러발생!");
		}
		// Document 란?
		// 웹 페이지 화면 문서를 의미함
		
		
		
		
		
		
	}
}
