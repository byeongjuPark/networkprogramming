package test.url;


import java.net.MalformedURLException;
import java.net.URL;


public class URLEx {
	public void testURLExample(String urlStr) {
		System.out.println(urlStr);
		URL url;
		try {
		url = new URL(urlStr);
		System.out.println("프로토콜 : " + url.getProtocol());//http
		System.out.println("포트번호 : " + url.getPort()); //-1(보안상 가려짐...)
		System.out.println("호스트 : " + url.getHost()); //www.oracle.com
		System.out.println("파일경로 : " + url.getFile()); // /downloads/index.html
		System.out.println("URL 전체 : " + url.toExternalForm()); //https://www.oracle.com/downloads/index.html
		} catch (MalformedURLException e) {
		e.printStackTrace();
		}
		}
}
