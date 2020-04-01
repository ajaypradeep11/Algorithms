package BreadthFirstSearchWebCrawler;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		WebCrawler crawl = new WebCrawler();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a url (ex:http://www.exmaple.com)");
		String myurl = s.nextLine();
		crawl.doWebCrawling(myurl);
		
	}
}
