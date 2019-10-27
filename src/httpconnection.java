/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import org.w3c.dom.*;
import javax.xml.parsers.*;
//This is strictly for when I am on break at work, where there is a proxy
import java.net.Proxy;
import java.util.Scanner;
/**
 *
 * @author cbald
 */
public class httpconnection {
      public static void section() throws Exception{
           //These lines specify what url to go to
    System.out.println("HTTP!\n");
    //This code was used to go around my proxy at work. Not really needed at this time.
   /* System.out.println("Are you using a proxy?(Y/N)\n");
    Scanner in = new Scanner(System.in);
    String a = in.next();
    if (a == "Y" || a == "y") {
        //These are my work proxy settings, if you try to use them, your stuff will break. So just don't.
    System.setProperty("http.proxyHost", "proxy-chain.intel.com");
    System.setProperty("http.proxyPort", "911");
        System.setProperty("https.proxyHost", "proxy-chain.intel.com");
    System.setProperty("https.proxyPort", "912");
    }
    if (a == "N" || a == "n") {
        //This is the standard option for the program to continue
    }
    else {
            System.out.println("Please try again\n");
    }
*/
    //EDIT ME TO CHANGE THE WEBPAGE!
    String url = "https://www.google.com/teapot";
     String filename = "page.html";
    //try is just in case there is a problem
    try {
        //create the object and set the timeout

    URL obj = new URL(url);
    //open the connection!
    
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setConnectTimeout(5000);
    //con.setRequestProperty("http.agent", "");
   con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
   //String cookie = con.getHeaderField( "Set-Cookie").split(";")[0];
   //con.setRequestMethod("GET");
   //con.setRequestProperty("user-agent",con.getHeader("user-agent"));
    //con.setRequestProperty("Accept", "application/xml");
    //con.setRequestProperty("Content-Type", "application/xml");
    //con.setRequestProperty("Cookie", cookie );
    con.connect();
    System.out.println("Attempting to connect.");
//whats the response code?
  int status = con.getResponseCode();
  if (status == 200) {
    System.out.println("Server returned response code " + status);
    //This section here was found after much searching on the internet. It creates a new reader which reads the webpage then directs that to a writer which writes the file.
    //While there is still lines found in the webpage, it will keep writing.
    //This will not copy css unless it is inline css. Javascript may also be absent.
    String disposition = con.getHeaderField("Content-Disposition");
    String contentType = con.getContentType();
    int contentLength = con.getContentLength();
        BufferedReader br = new BufferedReader(new InputStreamReader(obj.openStream()));
        BufferedWriter writer =  
              new BufferedWriter(new FileWriter(filename));
         String line; 
            while ((line = br.readLine()) != null) { 
            writer.write(line); 
            } 
        br.close();
        writer.close();
        //readxml();
        System.out.println("Done! Saved as file named page.html.");
  }       
  else if (status == 404) {
	  System.out.println(" :-/ " + status);
  }
  else if (status == 408) {
	  System.out.println(" Timed out error: " + status);
  }
  //This is for those webservers that return an error 418. Just in case.
  else if (status == 418) {
	  System.out.println("Teapot error: " + status + ", I'm a teapot.");
	  System.out.printf("             ;,'\r\n" + 
	  		"     _o_    ;:;'\r\n" + 
	  		" ,-.'---`.__ ;\r\n" + 
	  		"((j`=====',-'\r\n" + 
	  		" `-\\     /\r\n" + 
	  		"    `-=-'  ");
  }
  else {
	  System.out.println("We were not expecting this!: " + status);
  }
    }
    catch (MalformedURLException e) {
        System.out.println("This url is bad! " + e.getMessage());
    }
    System.exit(0);
    }

/* This code was to be used with a different website, but I was not able to get past a 403 error. I am leaving this here in case I get a breakthourgh, as this code below does work.
public static void readxml() {
File xml = new File("test.xml");
try{
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
Document document = builder.parse(xml);
System.out.println("As of" + document.getElementsByTagName("updated").item(0).getTextContent());
System.out.println("80M & 40M During the Day is " + document.getElementsByTagName("band").item(0).getTextContent());
System.out.println("30M & 20M During the Day is " + document.getElementsByTagName("band").item(1).getTextContent());
System.out.println("17M & 15M During the Day is " + document.getElementsByTagName("band").item(2).getTextContent());
System.out.println("12M & 10M During the Day is " + document.getElementsByTagName("band").item(3).getTextContent());
System.out.println("--------------------------------------------------");
System.out.println("80M & 40M During the Night is " + document.getElementsByTagName("band").item(4).getTextContent());
System.out.println("30M & 20M During the Night is " + document.getElementsByTagName("band").item(5).getTextContent());
System.out.println("17M & 15M During the Night is " + document.getElementsByTagName("band").item(6).getTextContent());
System.out.println("12M & 10M During the Night is " + document.getElementsByTagName("band").item(7).getTextContent());
System.out.println("--------------------------------------------------");
System.out.println("2M propogation is " + document.getElementsByTagName("phenomenon").item(2).getTextContent());
System.out.println("Credit to Paul, N0NBH");
}

catch (Exception e){
    //Things
    System.out.println("Parse is broken :-/" + e.getMessage());
}
}
*/
}