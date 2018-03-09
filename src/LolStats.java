//import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class LolStats {

    static String apiKey = "RGAPI-2fd8d65d-f34b-4a27-bb0c-01d8fdf3c4d9";
    static String summoner;

    public static void main(String[] args)
    {
        System.out.print("Please enter a summoner name: ");
//        Scanner sc = new Scanner(System.in);
//        summoner = sc.nextLine();
//        //Make sure scanner is closed
//        sc.close();

        summoner = "drinkgoodbeer";
        System.out.println("You said: " + summoner);

        GetSummonerID();
    }

    private static void GetSummonerID()
    {
        String uri = "https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/" + summoner  +"?api_key=" + apiKey;
        try
        {
            //Set up connection
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/xml");

            //Connect
            InputStream xml = connection.getInputStream();

            //Parse data
            //JAXBContext jc = JAXBContext.newInstance(Summoner.class);
            //Summoner summoner = (Summoner) jc.createUnmarshaller().unmarshal(xml);
            summoner.toString();

            //Close connection
            connection.disconnect();


            System.out.println("Success?");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }
}
