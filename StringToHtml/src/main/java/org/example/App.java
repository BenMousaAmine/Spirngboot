package org.example;
import java.io.FileWriter;
import java.io.IOException;
public class App {
    public static String convertToHTML(String S) {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html><head><title>String Java to HTML</title></head> ");
        htmlBuilder.append("<body style='background-color:indianred ;padding : 50px ; border : 5px '>");
        htmlBuilder.append("<p style='background-color:white ;text-align : center ; border :solid '>");
        htmlBuilder.append(S);
        htmlBuilder.append("</p></body></html>");

        return htmlBuilder.toString();
    }

    public static void main(String[] args) {
        String percorso = "C:\\Users\\AmineBenMoussa\\IdeaProjects\\Code\\StringToHtml\\index.html";
        try {
            FileWriter salavaInFile = new FileWriter(percorso);

            String S = "<span style='color:red'>Nel</span> mezzo del cammin di nostra vita <br>" +
                    "<span style='color:red'>Mi </span>ritrovai per una selva oscura,<br>" +
                    "<span style='color:red'>Ché </span>la diritta via era smarrita.<br>" +
                    "<br>" +
                    "<span style='color:red'>Ahi</span> quanto a dir qual era è cosa dura<br>" +
                    "<span style='color:red'>Esta </span>selva selvaggia e aspra e forte<br>" +
                    "<span style='color:red'>Che </span>nel pensier rinova la paura!<br>" +
                    "<br>" +
                    "<span style='color:red'>Tant’è </span>amara che poco è più morte;<br>" +
                    "<span style='color:red'>Ma </span> per trattar del ben ch’i’ vi trovai,<br>" +
                    "<span style='color:red'>Dirò </span>de l’altre cose ch’i’ v’ ho scorte.";
            String html = convertToHTML(S);
            salavaInFile.write(html);
            salavaInFile.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
