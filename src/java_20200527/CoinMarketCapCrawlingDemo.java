package java_20200527;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		
		String test = "6,909,45".replaceAll(",",""); // replaceAll : 콤마를 제거해주는 방법.(안하면 오류뜬다.)
		double d = Double.parseDouble(test);
		System.out.println(d);
		
		String test1 = String.format("%.2f", d);	//("%.2f", d); 콤마를 추가해주는 방법
		System.out.println(test1);
		System.out.println("================================================================================================================");
		
		FileWriter fw = null;

		String url = "https://coinmarketcap.com/currencies/" 
				+ "bitcoin/historical-data/"
				+ "?start=20200520&end=20200527";

		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin.txt");

			Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");

			System.out.println("날짜\t\t시가\t고가\t저가\t종가\t거래량\t\t총량");
			fw.write("날짜\t\t시가\t고가\t저가\t종가\t거래량\t\t총량\n");
			/*
			 * for(int i=0;i<trElements.size();i++) { Element trElement = trElements.get(i);
			 * 
			 * Elements tdElements = trElement.select("td"); for(int
			 * j=0;j<tdElements.size();j++) { Element tdElement = tdElements.get(j);
			 * System.out.print(tdElement.text()+"\t"); } System.out.println(); }
			 */
			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text();
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String marketCap = trElement.child(6).text();
				System.out.println(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"
					+marketCap);

				fw.write(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap
					+"\n");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}