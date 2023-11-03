package com.example.prestiticountry.bootstrap;

import com.example.prestiticountry.domain.Country;
import com.example.prestiticountry.domain.Prestito;
import com.example.prestiticountry.repository.CountryRepository;
import com.example.prestiticountry.repository.PrestitoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Scanner;
// tutto il codice e da ottimizare
@Component
public class BootstrapData implements CommandLineRunner {
   private final CountryRepository countryRepository ;
   private final PrestitoRepository prestitoRepository ;

    public BootstrapData(CountryRepository countryRepository, PrestitoRepository prestitoRepository) {
        this.countryRepository = countryRepository;
        this.prestitoRepository = prestitoRepository;
    }
    private Integer[] getDataArray(String dataCorrenteStringa) {
        //1-Nov-2011
        dataCorrenteStringa = dataCorrenteStringa.toLowerCase() ;
        // dividere la data in array con 3 elementi 1  *-* nov *-* 2011
        String [] stringArray = dataCorrenteStringa.split("-");
        Integer [] integerArray = new Integer[3];
        integerArray[0]=Integer.parseInt(stringArray[0]);
        switch (stringArray[1]){
            case "gen" :
                integerArray [1]= 1 ;
                break;
            case "feb" :
                integerArray [1]= 2 ;
                break ;
            case "mar" :
                integerArray [1]= 03 ;
                break ;
            case "apr" :
                integerArray [1]= 04 ;
                break ;
            case "mag" :
                integerArray [1]= 05 ;
                break ;
            case "giu" :
                integerArray [1]= 06 ;
                break ;
            case "lug" :
                integerArray [1]= 07;
                break ;
            case "ago" :
                integerArray [1]= 8 ;
                break ;
            case "set" :
                integerArray [1]= 9 ;
                break ;
            case "ott" :
                integerArray [1]= 10 ;
                break ;
            case "nov" :
                integerArray [1]= 11 ;
                break ;
            case "dic" :
                integerArray [1]= 12 ;
                break ;
            default:
                integerArray[1]=-1;
        }
        integerArray[2]=Integer.parseInt(stringArray[2]);
        integerArray[2]=integerArray[2]>100 ? integerArray[2] : integerArray[2]+2000 ;


        return  integerArray ;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Server Start");

        Country italia = new Country();
        italia.setName("Italy");
        italia = countryRepository.save(italia);

        Country francia = new Country();
        francia.setName("France");
        francia = countryRepository.save(francia);

        Country spagna = new Country();
        spagna.setName("Spain");
        spagna = countryRepository.save(spagna);

        Country germania = new Country();
        germania.setName("Germany");
        germania = countryRepository.save(germania);

        Country olanda = new Country();
        olanda.setName("Holland");
        olanda = countryRepository.save(olanda);

        Country europa = new Country();
        europa.setName("Europe");
        europa = countryRepository.save(europa);

        System.out.println(System.getProperty("user.dir"));
        String filePath="C:\\Users\\AmineBenMoussa\\IdeaProjects\\Code\\PrestitiCountry\\prestiti_organizzazione.txt" ;

        File CSVFile  = new File (filePath);
        Scanner sc = new Scanner(CSVFile);
        sc.useDelimiter(";");

        while(sc.hasNext()){
            sc.useDelimiter(";");
            // Questa per la data
            String dataCorrenteStringa = sc.next() ;
            dataCorrenteStringa = dataCorrenteStringa.replace("\r\n","");
            System.out.println(dataCorrenteStringa);
            if (dataCorrenteStringa.compareTo("01-ago-14")==0){
                System.out.println(dataCorrenteStringa);
            }
            Integer[]dataCorrenteArray = getDataArray(dataCorrenteStringa);
            LocalDateTime dataRilevamentoCorrente = LocalDateTime.of(dataCorrenteArray[2],dataCorrenteArray[1],dataCorrenteArray[0],0,0,0);

            Prestito prestitoCorrente ;
            String amount ;
            prestitoCorrente= new Prestito();
            //Germania spanga francia italia olanda
            //Adesso amount per paese

            //Germania
            prestitoCorrente.setCountry(germania);
            amount = sc.next();
            prestitoCorrente.setAmount(Double.parseDouble(amount));
            prestitoCorrente.setDate(dataRilevamentoCorrente);
            prestitoRepository.save(prestitoCorrente);
            System.out.println(dataRilevamentoCorrente.toString());
            //Spagna
            prestitoCorrente.setCountry(germania);
            amount = sc.next();
            prestitoCorrente.setAmount(Double.parseDouble(amount));
            prestitoCorrente.setDate(dataRilevamentoCorrente);
            prestitoRepository.save(prestitoCorrente);

            //Framcia
            prestitoCorrente.setCountry(francia);
            amount = sc.next();
            prestitoCorrente.setAmount(Double.parseDouble(amount));
            prestitoCorrente.setDate(dataRilevamentoCorrente);
            prestitoRepository.save(prestitoCorrente);

            //Italia
            prestitoCorrente.setCountry(italia);
            amount = sc.next();
            prestitoCorrente.setAmount(Double.parseDouble(amount));
            prestitoCorrente.setDate(dataRilevamentoCorrente);
            prestitoRepository.save(prestitoCorrente);

            //olanda
            prestitoCorrente.setCountry(olanda);
            amount = sc.next();
            prestitoCorrente.setAmount(Double.parseDouble(amount));
            prestitoCorrente.setDate(dataRilevamentoCorrente);
            prestitoRepository.save(prestitoCorrente);
            sc.useDelimiter("\r\n");
            //Europa
            prestitoCorrente.setCountry(europa);
            amount = sc.next();
            amount=amount.replace(";" ,"");
            prestitoCorrente.setAmount(Double.parseDouble(amount));
            prestitoCorrente.setDate(dataRilevamentoCorrente);
            prestitoRepository.save(prestitoCorrente);
            sc.useDelimiter("\r\n");


            System.out.println(dataRilevamentoCorrente.toString());

        }




        System.out.println("Server Finish");

    }


}
