package com.spiderfyocr.Service;


import com.spiderfyocr.Model.OcrModel;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Component;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Component
public class OcrService {

    public String imageToText(OcrModel request)  {

        // Only support language according to tessdata  [eng,tur]
        ITesseract instance = new Tesseract();

        try {

            String base64Image = request.getImage().split(",")[1];
            byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64Image);
            BufferedImage in =  ImageIO.read(new ByteArrayInputStream(imageBytes));
            instance.setLanguage(request.getDestinationLanguage());
            instance.setDatapath("src/main/resources/tessdata");
            return instance.doOCR(in);

        }
        catch (TesseractException | IOException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }

    }
}