import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gollam gollam = new Gollam();
        gollam.search("https://www.hasznaltauto.hu/#personalVehicleSearchBox.searchParameters", "MITSUBISHI");
    }
}
