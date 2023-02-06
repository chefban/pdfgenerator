import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

public class PdfTransformer {
    public void toPdf(Employee employee){
        System.out.println("PDF creation...");
       try {
            Document document = new Document();
            document.setPageSize(new Rectangle(550, 200));
            PdfWriter.getInstance(document, new FileOutputStream("badge.pdf"));
            document.open();

            PdfPTable table = new PdfPTable(2);
            float[] columnWidths = {0.5f, 1f};
            table.setWidths(columnWidths);

            table.setWidthPercentage(100);
            table.setLockedWidth(true);
            table.setTotalWidth(500f);

            Image image = Image.getInstance("photo.jpg");
            PdfPCell imageCell = new PdfPCell(image, true);
            table.addCell(imageCell);

            // Add text to the second cell
            PdfPCell textCell = new PdfPCell();
            textCell.setBackgroundColor(new BaseColor(252, 250, 249));
            textCell.setPadding(10);

            Font font1 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.BLACK);
            Font font2 = new Font(Font.FontFamily.COURIER, 12, Font.ITALIC, BaseColor.DARK_GRAY);

            Chunk nameChunk1 = new Chunk("Name : ", font1);
            Chunk nameChunk2 = new Chunk(employee.getFirstname()+" "+ employee.getLastname(), font2);
            Paragraph nameParagraph = new Paragraph();
            nameParagraph.add(nameChunk1);
            nameParagraph.add(nameChunk2);
            textCell.addElement(nameParagraph);

            Chunk titleChunk1 = new Chunk("Title : ", font1);
            Chunk titleChunk2 = new Chunk(employee.getTitle(), font2);
            Paragraph titleParagraph = new Paragraph();
            titleParagraph.add(titleChunk1);
            titleParagraph.add(titleChunk2);
            textCell.addElement(titleParagraph);


            Chunk serviceChunk1 = new Chunk("Service: ", font1);
            Chunk serviceChunk2 = new Chunk(employee.getService(), font2);
            Paragraph serviceParagraph = new Paragraph();
           serviceParagraph.add(serviceChunk1);
           serviceParagraph.add(serviceChunk2);
            textCell.addElement(serviceParagraph);

           Chunk companyChunk1 = new Chunk("Company: ", font1);
           Chunk companyChunk2 = new Chunk(employee.getCompany(), font2);
           Paragraph companyParagraph = new Paragraph();
           companyParagraph.add(companyChunk1);
           companyParagraph.add(companyChunk2);
           textCell.addElement(companyParagraph);

            table.addCell(textCell);

            document.add(table);

            document.close();
            }
       catch (Exception e) {
            e.printStackTrace();
       }
    }
}
