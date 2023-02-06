import java.util.Arrays;

public class PdfGeneratorApplication {
    public static void main(String[] args) {
        System.out.println("start...");
        PdfTransformer pdfTransformer = new PdfTransformer();

        Employee employee = new Employee("Franck", "Tchokotcheu", "Fullstack developer",
                null, "Research and development", "Adservio");

        pdfTransformer.toPdf(employee);
        System.out.println("Finished");
    }
}
