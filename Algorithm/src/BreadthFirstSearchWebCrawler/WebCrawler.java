package BreadthFirstSearchWebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	private Queue<String> initialAndAddedQueue;
	private List<String> discoveredWebSites;
	
	public WebCrawler() {
		this.discoveredWebSites = new ArrayList<String>();
		this.initialAndAddedQueue = new LinkedList<String>();
	}
	
	public void doWebCrawling(String userInputSingleWebsite) {
		initialAndAddedQueue.add(userInputSingleWebsite);
		while(!initialAndAddedQueue.isEmpty()) {
			
			String urlFromQueue = initialAndAddedQueue.remove();
			String wholeHtmlOfURL = readURL(urlFromQueue);
			String regrex = "http://(\\w+\\.)*(\\w+)";
			Pattern givenPattern = Pattern.compile(regrex);
			Matcher matcher = givenPattern.matcher(wholeHtmlOfURL);
			
			while(matcher.find()) {
				String foundURL = matcher.group();
				this.discoveredWebSites.add(foundURL);
				System.out.println("Website found : "+foundURL);
				initialAndAddedQueue.add(foundURL); 
			}
		}
	}

	private String readURL(String urlFromQueue) {
		String rawHtml = "";
		try {
			URL url = new URL(urlFromQueue);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String toReadLineByLine = "";
			while((toReadLineByLine = in.readLine()) != null) {
				rawHtml += toReadLineByLine;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rawHtml;
	}
}
